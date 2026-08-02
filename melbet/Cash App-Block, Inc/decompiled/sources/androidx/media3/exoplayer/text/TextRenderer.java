package androidx.media3.exoplayer.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import androidx.biometric.BiometricPrompt;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.common.Format;
import androidx.media3.common.Format$$ExternalSyntheticLambda1;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Log;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda3;
import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2;
import androidx.media3.exoplayer.source.MediaSource$MediaPeriodId;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SimpleSubtitleDecoder$1;
import androidx.media3.extractor.text.SubtitleDecoder;
import androidx.media3.extractor.text.SubtitleDecoderException;
import androidx.media3.extractor.text.SubtitleInputBuffer;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.cea.Cea608Decoder;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import androidx.room.CoroutinesRoom;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import androidx.transition.Transition;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.svg.internal.AndroidSvg;
import com.bumptech.glide.provider.EncoderRegistry;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class TextRenderer extends BaseRenderer implements Handler.Callback {
    public final Transition.AnonymousClass1 cueDecoder;
    public final DecoderInputBuffer cueDecoderInputBuffer;
    public CuesResolver cuesResolver;
    public int decoderReplacementState;
    public long finalStreamEndPositionUs;
    public final AndroidSvg formatHolder;
    public boolean inputStreamEnded;
    public long lastRendererPositionUs;
    public SimpleSubtitleDecoder$1 nextSubtitle;
    public int nextSubtitleEventIndex;
    public SubtitleInputBuffer nextSubtitleInputBuffer;
    public final ExoPlayerImpl.ComponentListener output;
    public final Handler outputHandler;
    public boolean outputStreamEnded;
    public Format streamFormat;
    public SimpleSubtitleDecoder$1 subtitle;
    public SubtitleDecoder subtitleDecoder;
    public final SubtitleDecoderFactory subtitleDecoderFactory;
    public boolean waitingForKeyFrame;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextRenderer(ExoPlayerImpl.ComponentListener componentListener, Looper looper) {
        super(3);
        BiometricPrompt biometricPrompt = SubtitleDecoderFactory.DEFAULT;
        this.output = componentListener;
        this.outputHandler = looper == null ? null : new Handler(looper, this);
        this.subtitleDecoderFactory = biometricPrompt;
        this.cueDecoder = new Transition.AnonymousClass1();
        this.cueDecoderInputBuffer = new DecoderInputBuffer(1);
        this.formatHolder = new AndroidSvg(1, false);
        this.finalStreamEndPositionUs = -9223372036854775807L;
        this.lastRendererPositionUs = -9223372036854775807L;
    }

    public final void assertLegacyDecodingEnabledIfRequired() {
        boolean z = Objects.equals(this.streamFormat.sampleMimeType, "application/cea-608") || Objects.equals(this.streamFormat.sampleMimeType, "application/x-mp4-cea-608") || Objects.equals(this.streamFormat.sampleMimeType, "application/cea-708");
        String str = this.streamFormat.sampleMimeType;
        if (z) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1(DBUtil.lenientFormat("Legacy decoding is disabled, can't handle %s samples (expected %s).", str, "application/x-media3-cues"));
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final String getName() {
        return "TextRenderer";
    }

    public final long getNextEventTime() {
        if (this.nextSubtitleEventIndex == -1) {
            return Long.MAX_VALUE;
        }
        this.subtitle.getClass();
        if (this.nextSubtitleEventIndex >= this.subtitle.getEventTimeCount()) {
            return Long.MAX_VALUE;
        }
        return this.subtitle.getEventTime(this.nextSubtitleEventIndex);
    }

    public final long getPresentationTimeUs$1(long j) {
        Trace.checkState(j != -9223372036854775807L);
        return j - this.streamOffsetUs;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            invokeUpdateOutputInternal((CueGroup) message.obj);
            return true;
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r3.equals("application/cea-608") == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void initSubtitleDecoder() {
        SubtitleDecoder delegatingSubtitleDecoder;
        char c = 1;
        this.waitingForKeyFrame = true;
        Format format2 = this.streamFormat;
        format2.getClass();
        CoroutinesRoom.Companion companion = (CoroutinesRoom.Companion) ((BiometricPrompt) this.subtitleDecoderFactory).mClientFragmentManager;
        String str = format2.sampleMimeType;
        int i = format2.accessibilityChannel;
        if (str != null) {
            switch (str.hashCode()) {
                case 930165504:
                    if (str.equals("application/x-mp4-cea-608")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1566015601:
                    break;
                case 1566016562:
                    if (str.equals("application/cea-708")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                    delegatingSubtitleDecoder = new Cea608Decoder(str, i);
                    break;
                case 2:
                    delegatingSubtitleDecoder = new Cea708Decoder(i, format2.initializationData);
                    break;
            }
            this.subtitleDecoder = delegatingSubtitleDecoder;
            delegatingSubtitleDecoder.setOutputStartTimeUs(this.lastResetPositionUs);
        }
        if (!companion.supportsFormat(format2)) {
            a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("Attempted to create decoder for unsupported MIME type: ", str));
            return;
        }
        SubtitleParser create = companion.create(format2);
        create.getClass().getSimpleName().concat("Decoder");
        delegatingSubtitleDecoder = new DelegatingSubtitleDecoder(create);
        this.subtitleDecoder = delegatingSubtitleDecoder;
        delegatingSubtitleDecoder.setOutputStartTimeUs(this.lastResetPositionUs);
    }

    public final void invokeUpdateOutputInternal(CueGroup cueGroup) {
        RegularImmutableList regularImmutableList = cueGroup.cues;
        ExoPlayerImpl.ComponentListener componentListener = this.output;
        ExoPlayerImpl.this.listeners.sendEvent(27, new ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda3(regularImmutableList));
        ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
        exoPlayerImpl.currentCueGroup = cueGroup;
        exoPlayerImpl.listeners.sendEvent(27, new ExoPlayerImplInternal$$ExternalSyntheticLambda2(cueGroup, 1));
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final boolean isReady() {
        Format format2 = this.streamFormat;
        if (format2 != null) {
            if (Objects.equals(format2.sampleMimeType, "application/x-media3-cues")) {
                CuesResolver cuesResolver = this.cuesResolver;
                cuesResolver.getClass();
                if (cuesResolver.getNextCueChangeTimeUs(this.lastRendererPositionUs) == Long.MIN_VALUE) {
                    try {
                        SampleStream sampleStream = this.stream;
                        sampleStream.getClass();
                        sampleStream.maybeThrowError();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else {
                if (this.outputStreamEnded) {
                    return false;
                }
                if (this.inputStreamEnded) {
                    SimpleSubtitleDecoder$1 simpleSubtitleDecoder$1 = this.subtitle;
                    long j = this.lastRendererPositionUs;
                    if (simpleSubtitleDecoder$1 == null || simpleSubtitleDecoder$1.getEventTimeCount() <= 0 || simpleSubtitleDecoder$1.getEventTime(simpleSubtitleDecoder$1.getEventTimeCount() - 1) <= j) {
                        SimpleSubtitleDecoder$1 simpleSubtitleDecoder$12 = this.nextSubtitle;
                        long j2 = this.lastRendererPositionUs;
                        if ((simpleSubtitleDecoder$12 == null || simpleSubtitleDecoder$12.getEventTimeCount() <= 0 || simpleSubtitleDecoder$12.getEventTime(simpleSubtitleDecoder$12.getEventTimeCount() - 1) <= j2) && this.nextSubtitleInputBuffer != null) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void onDisabled() {
        this.streamFormat = null;
        this.finalStreamEndPositionUs = -9223372036854775807L;
        RegularImmutableList regularImmutableList = RegularImmutableList.EMPTY;
        getPresentationTimeUs$1(this.lastRendererPositionUs);
        CueGroup cueGroup = new CueGroup(regularImmutableList);
        Handler handler = this.outputHandler;
        if (handler != null) {
            handler.obtainMessage(1, cueGroup).sendToTarget();
        } else {
            invokeUpdateOutputInternal(cueGroup);
        }
        this.lastRendererPositionUs = -9223372036854775807L;
        if (this.subtitleDecoder != null) {
            releaseSubtitleBuffers();
            SubtitleDecoder subtitleDecoder = this.subtitleDecoder;
            subtitleDecoder.getClass();
            subtitleDecoder.release();
            this.subtitleDecoder = null;
            this.decoderReplacementState = 0;
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void onPositionReset(long j, boolean z, boolean z2) {
        this.lastRendererPositionUs = j;
        CuesResolver cuesResolver = this.cuesResolver;
        if (cuesResolver != null) {
            cuesResolver.clear();
        }
        RegularImmutableList regularImmutableList = RegularImmutableList.EMPTY;
        getPresentationTimeUs$1(this.lastRendererPositionUs);
        CueGroup cueGroup = new CueGroup(regularImmutableList);
        Handler handler = this.outputHandler;
        if (handler != null) {
            handler.obtainMessage(1, cueGroup).sendToTarget();
        } else {
            invokeUpdateOutputInternal(cueGroup);
        }
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
        this.finalStreamEndPositionUs = -9223372036854775807L;
        Format format2 = this.streamFormat;
        if (format2 == null || Objects.equals(format2.sampleMimeType, "application/x-media3-cues")) {
            return;
        }
        if (this.decoderReplacementState == 0) {
            releaseSubtitleBuffers();
            SubtitleDecoder subtitleDecoder = this.subtitleDecoder;
            subtitleDecoder.getClass();
            subtitleDecoder.flush();
            subtitleDecoder.setOutputStartTimeUs(this.lastResetPositionUs);
            return;
        }
        releaseSubtitleBuffers();
        SubtitleDecoder subtitleDecoder2 = this.subtitleDecoder;
        subtitleDecoder2.getClass();
        subtitleDecoder2.release();
        this.subtitleDecoder = null;
        this.decoderReplacementState = 0;
        initSubtitleDecoder();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void onStreamChanged(Format[] formatArr, long j, long j2, MediaSource$MediaPeriodId mediaSource$MediaPeriodId) {
        Format format2 = formatArr[0];
        this.streamFormat = format2;
        if (Objects.equals(format2.sampleMimeType, "application/x-media3-cues")) {
            this.cuesResolver = this.streamFormat.cueReplacementBehavior == 1 ? new MergingCuesResolver() : new EncoderRegistry(2);
            return;
        }
        assertLegacyDecodingEnabledIfRequired();
        if (this.subtitleDecoder != null) {
            this.decoderReplacementState = 1;
        } else {
            initSubtitleDecoder();
        }
    }

    public final void releaseSubtitleBuffers() {
        this.nextSubtitleInputBuffer = null;
        this.nextSubtitleEventIndex = -1;
        SimpleSubtitleDecoder$1 simpleSubtitleDecoder$1 = this.subtitle;
        if (simpleSubtitleDecoder$1 != null) {
            simpleSubtitleDecoder$1.release();
            this.subtitle = null;
        }
        SimpleSubtitleDecoder$1 simpleSubtitleDecoder$12 = this.nextSubtitle;
        if (simpleSubtitleDecoder$12 != null) {
            simpleSubtitleDecoder$12.release();
            this.nextSubtitle = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023b A[EXC_TOP_SPLITTER, LOOP:2: B:99:0x023b->B:120:0x023b, LOOP_START, SYNTHETIC] */
    @Override // androidx.media3.exoplayer.BaseRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void render(long j, long j2) {
        boolean z;
        AndroidSvg androidSvg;
        boolean z2;
        long j3;
        if (this.streamIsFinal) {
            long j4 = this.finalStreamEndPositionUs;
            if (j4 != -9223372036854775807L && j >= j4) {
                releaseSubtitleBuffers();
                this.outputStreamEnded = true;
            }
        }
        if (this.outputStreamEnded) {
            return;
        }
        Format format2 = this.streamFormat;
        format2.getClass();
        boolean equals = Objects.equals(format2.sampleMimeType, "application/x-media3-cues");
        Handler handler = this.outputHandler;
        AndroidSvg androidSvg2 = this.formatHolder;
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (equals) {
            this.cuesResolver.getClass();
            if (!this.inputStreamEnded) {
                DecoderInputBuffer decoderInputBuffer = this.cueDecoderInputBuffer;
                if (readSource(androidSvg2, decoderInputBuffer, 0) == -4) {
                    if (decoderInputBuffer.getFlag(4)) {
                        this.inputStreamEnded = true;
                    } else {
                        decoderInputBuffer.flip();
                        ByteBuffer byteBuffer = decoderInputBuffer.data;
                        byteBuffer.getClass();
                        long j5 = decoderInputBuffer.timeUs;
                        byte[] array2 = byteBuffer.array();
                        int arrayOffset = byteBuffer.arrayOffset();
                        int limit = byteBuffer.limit();
                        this.cueDecoder.getClass();
                        Parcel obtain = Parcel.obtain();
                        obtain.unmarshall(array2, arrayOffset, limit);
                        obtain.setDataPosition(0);
                        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
                        obtain.recycle();
                        ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        Format$$ExternalSyntheticLambda1 format$$ExternalSyntheticLambda1 = new Format$$ExternalSyntheticLambda1(10);
                        ImmutableList.Builder builder = ImmutableList.builder();
                        for (int i = 0; i < parcelableArrayList.size(); i++) {
                            Bundle bundle = (Bundle) parcelableArrayList.get(i);
                            bundle.getClass();
                            builder.m2032add(format$$ExternalSyntheticLambda1.apply(bundle));
                        }
                        CuesWithTiming cuesWithTiming = new CuesWithTiming(j5, readBundle.getLong("d"), builder.build());
                        decoderInputBuffer.clear();
                        z3 = this.cuesResolver.addCues(cuesWithTiming, j);
                    }
                }
            }
            long nextCueChangeTimeUs = this.cuesResolver.getNextCueChangeTimeUs(this.lastRendererPositionUs);
            if (nextCueChangeTimeUs == Long.MIN_VALUE && this.inputStreamEnded && !z3) {
                this.outputStreamEnded = true;
            }
            if (nextCueChangeTimeUs != Long.MIN_VALUE && nextCueChangeTimeUs <= j) {
                z3 = true;
            }
            if (z3) {
                ImmutableList cuesAtTimeUs = this.cuesResolver.getCuesAtTimeUs(j);
                long previousCueChangeTimeUs = this.cuesResolver.getPreviousCueChangeTimeUs(j);
                getPresentationTimeUs$1(previousCueChangeTimeUs);
                CueGroup cueGroup = new CueGroup(cuesAtTimeUs);
                if (handler != null) {
                    handler.obtainMessage(1, cueGroup).sendToTarget();
                } else {
                    invokeUpdateOutputInternal(cueGroup);
                }
                this.cuesResolver.discardCuesBeforeTimeUs(previousCueChangeTimeUs);
            }
            this.lastRendererPositionUs = j;
            return;
        }
        assertLegacyDecodingEnabledIfRequired();
        this.lastRendererPositionUs = j;
        if (this.nextSubtitle == null) {
            SubtitleDecoder subtitleDecoder = this.subtitleDecoder;
            subtitleDecoder.getClass();
            subtitleDecoder.setPositionUs(j);
            try {
                SubtitleDecoder subtitleDecoder2 = this.subtitleDecoder;
                subtitleDecoder2.getClass();
                this.nextSubtitle = (SimpleSubtitleDecoder$1) subtitleDecoder2.dequeueOutputBuffer();
            } catch (SubtitleDecoderException e) {
                Log.e("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.streamFormat, e);
                RegularImmutableList regularImmutableList = RegularImmutableList.EMPTY;
                getPresentationTimeUs$1(this.lastRendererPositionUs);
                CueGroup cueGroup2 = new CueGroup(regularImmutableList);
                if (handler != null) {
                    handler.obtainMessage(1, cueGroup2).sendToTarget();
                } else {
                    invokeUpdateOutputInternal(cueGroup2);
                }
                releaseSubtitleBuffers();
                SubtitleDecoder subtitleDecoder3 = this.subtitleDecoder;
                subtitleDecoder3.getClass();
                subtitleDecoder3.release();
                this.subtitleDecoder = null;
                this.decoderReplacementState = 0;
                initSubtitleDecoder();
                return;
            }
        }
        if (this.state != 2) {
            return;
        }
        if (this.subtitle != null) {
            long nextEventTime = getNextEventTime();
            z = false;
            while (nextEventTime <= j) {
                this.nextSubtitleEventIndex++;
                nextEventTime = getNextEventTime();
                z = true;
            }
        } else {
            z = false;
        }
        SimpleSubtitleDecoder$1 simpleSubtitleDecoder$1 = this.nextSubtitle;
        if (simpleSubtitleDecoder$1 != null) {
            if (!simpleSubtitleDecoder$1.getFlag(4)) {
                androidSvg = androidSvg2;
                z2 = z;
                if (simpleSubtitleDecoder$1.timeUs <= j) {
                    SimpleSubtitleDecoder$1 simpleSubtitleDecoder$12 = this.subtitle;
                    if (simpleSubtitleDecoder$12 != null) {
                        simpleSubtitleDecoder$12.release();
                    }
                    this.nextSubtitleEventIndex = simpleSubtitleDecoder$1.getNextEventTimeIndex(j);
                    this.subtitle = simpleSubtitleDecoder$1;
                    this.nextSubtitle = null;
                    z2 = true;
                }
                if (z2) {
                    this.subtitle.getClass();
                    int nextEventTimeIndex = this.subtitle.getNextEventTimeIndex(j);
                    if (nextEventTimeIndex == 0 || this.subtitle.getEventTimeCount() == 0) {
                        j3 = this.subtitle.timeUs;
                    } else {
                        SimpleSubtitleDecoder$1 simpleSubtitleDecoder$13 = this.subtitle;
                        j3 = nextEventTimeIndex == -1 ? simpleSubtitleDecoder$13.getEventTime(simpleSubtitleDecoder$13.getEventTimeCount() - 1) : simpleSubtitleDecoder$13.getEventTime(nextEventTimeIndex - 1);
                    }
                    getPresentationTimeUs$1(j3);
                    CueGroup cueGroup3 = new CueGroup(this.subtitle.getCues(j));
                    if (handler != null) {
                        handler.obtainMessage(1, cueGroup3).sendToTarget();
                    } else {
                        invokeUpdateOutputInternal(cueGroup3);
                    }
                }
                if (this.decoderReplacementState != 2) {
                    return;
                }
                while (!this.inputStreamEnded) {
                    try {
                        SubtitleInputBuffer subtitleInputBuffer = this.nextSubtitleInputBuffer;
                        if (subtitleInputBuffer == null) {
                            SubtitleDecoder subtitleDecoder4 = this.subtitleDecoder;
                            subtitleDecoder4.getClass();
                            subtitleInputBuffer = (SubtitleInputBuffer) subtitleDecoder4.dequeueInputBuffer();
                            if (subtitleInputBuffer == null) {
                                return;
                            } else {
                                this.nextSubtitleInputBuffer = subtitleInputBuffer;
                            }
                        }
                        if (this.decoderReplacementState == 1) {
                            subtitleInputBuffer.flags = 4;
                            SubtitleDecoder subtitleDecoder5 = this.subtitleDecoder;
                            subtitleDecoder5.getClass();
                            subtitleDecoder5.queueInputBuffer(subtitleInputBuffer);
                            this.nextSubtitleInputBuffer = null;
                            this.decoderReplacementState = 2;
                            return;
                        }
                        int readSource = readSource(androidSvg, subtitleInputBuffer, 0);
                        if (readSource == -4) {
                            if (subtitleInputBuffer.getFlag(4)) {
                                this.inputStreamEnded = true;
                                this.waitingForKeyFrame = false;
                            } else {
                                Format format3 = (Format) androidSvg.renderOptions;
                                if (format3 == null) {
                                    return;
                                }
                                subtitleInputBuffer.subsampleOffsetUs = format3.subsampleOffsetUs;
                                subtitleInputBuffer.flip();
                                this.waitingForKeyFrame &= !subtitleInputBuffer.getFlag(1);
                            }
                            if (!this.waitingForKeyFrame) {
                                SubtitleDecoder subtitleDecoder6 = this.subtitleDecoder;
                                subtitleDecoder6.getClass();
                                subtitleDecoder6.queueInputBuffer(subtitleInputBuffer);
                                this.nextSubtitleInputBuffer = null;
                            }
                        } else if (readSource == -3) {
                            return;
                        }
                    } catch (SubtitleDecoderException e2) {
                        Log.e("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.streamFormat, e2);
                        RegularImmutableList regularImmutableList2 = RegularImmutableList.EMPTY;
                        getPresentationTimeUs$1(this.lastRendererPositionUs);
                        CueGroup cueGroup4 = new CueGroup(regularImmutableList2);
                        if (handler != null) {
                            handler.obtainMessage(1, cueGroup4).sendToTarget();
                        } else {
                            invokeUpdateOutputInternal(cueGroup4);
                        }
                        releaseSubtitleBuffers();
                        SubtitleDecoder subtitleDecoder7 = this.subtitleDecoder;
                        subtitleDecoder7.getClass();
                        subtitleDecoder7.release();
                        this.subtitleDecoder = null;
                        this.decoderReplacementState = 0;
                        initSubtitleDecoder();
                        return;
                    }
                }
                return;
            }
            if (!z && getNextEventTime() == Long.MAX_VALUE) {
                if (this.decoderReplacementState == 2) {
                    releaseSubtitleBuffers();
                    SubtitleDecoder subtitleDecoder8 = this.subtitleDecoder;
                    subtitleDecoder8.getClass();
                    subtitleDecoder8.release();
                    this.subtitleDecoder = null;
                    this.decoderReplacementState = 0;
                    initSubtitleDecoder();
                } else {
                    releaseSubtitleBuffers();
                    this.outputStreamEnded = true;
                }
            }
        }
        androidSvg = androidSvg2;
        z2 = z;
        if (z2) {
        }
        if (this.decoderReplacementState != 2) {
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final int supportsFormat(Format format2) {
        boolean equals = Objects.equals(format2.sampleMimeType, "application/x-media3-cues");
        String str = format2.sampleMimeType;
        if (!equals) {
            BiometricPrompt biometricPrompt = (BiometricPrompt) this.subtitleDecoderFactory;
            biometricPrompt.getClass();
            if (!((CoroutinesRoom.Companion) biometricPrompt.mClientFragmentManager).supportsFormat(format2) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return MimeTypes.isText(str) ? BaseRenderer.create(1, 0, 0, 0) : BaseRenderer.create(0, 0, 0, 0);
            }
        }
        return BaseRenderer.create(format2.cryptoType == 0 ? 4 : 2, 0, 0, 0);
    }
}
