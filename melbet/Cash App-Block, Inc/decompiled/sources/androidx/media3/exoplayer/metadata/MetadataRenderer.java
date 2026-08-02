package androidx.media3.exoplayer.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2;
import androidx.media3.exoplayer.source.MediaSource$MediaPeriodId;
import androidx.media3.extractor.metadata.MetadataInputBuffer;
import androidx.media3.extractor.metadata.SimpleMetadataDecoder;
import androidx.tracing.Trace;
import coil3.svg.internal.AndroidSvg;
import java.util.ArrayList;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class MetadataRenderer extends BaseRenderer implements Handler.Callback {
    public final MetadataInputBuffer buffer;
    public SimpleMetadataDecoder decoder;
    public final MetadataDecoderFactory$1 decoderFactory;
    public boolean inputStreamEnded;
    public final ExoPlayerImpl.ComponentListener output;
    public final Handler outputHandler;
    public boolean outputStreamEnded;
    public long outputStreamOffsetUs;
    public Metadata pendingMetadata;
    public long subsampleOffsetUs;

    public MetadataRenderer(ExoPlayerImpl.ComponentListener componentListener, Looper looper) {
        super(5);
        this.output = componentListener;
        this.outputHandler = looper == null ? null : new Handler(looper, this);
        this.decoderFactory = MetadataDecoderFactory$1.DEFAULT;
        this.buffer = new MetadataInputBuffer(1);
        this.outputStreamOffsetUs = -9223372036854775807L;
    }

    public final void decodeWrappedMetadata(Metadata metadata, ArrayList arrayList) {
        int i = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.entries;
            if (i >= entryArr.length) {
                return;
            }
            Format wrappedMetadataFormat = entryArr[i].getWrappedMetadataFormat();
            if (wrappedMetadataFormat != null) {
                MetadataDecoderFactory$1 metadataDecoderFactory$1 = this.decoderFactory;
                if (metadataDecoderFactory$1.supportsFormat(wrappedMetadataFormat)) {
                    SimpleMetadataDecoder createDecoder = metadataDecoderFactory$1.createDecoder(wrappedMetadataFormat);
                    byte[] wrappedMetadataBytes = entryArr[i].getWrappedMetadataBytes();
                    wrappedMetadataBytes.getClass();
                    MetadataInputBuffer metadataInputBuffer = this.buffer;
                    metadataInputBuffer.clear();
                    metadataInputBuffer.ensureSpaceForWrite(wrappedMetadataBytes.length);
                    metadataInputBuffer.data.put(wrappedMetadataBytes);
                    metadataInputBuffer.flip();
                    Metadata decode = createDecoder.decode(metadataInputBuffer);
                    if (decode != null) {
                        decodeWrappedMetadata(decode, arrayList);
                    }
                    i++;
                }
            }
            arrayList.add(entryArr[i]);
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final String getName() {
        return "MetadataRenderer";
    }

    public final long getPresentationTimeUs(long j) {
        Trace.checkState(j != -9223372036854775807L);
        Trace.checkState(this.outputStreamOffsetUs != -9223372036854775807L);
        return j - this.outputStreamOffsetUs;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            invokeRendererInternal((Metadata) message.obj);
            return true;
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return false;
    }

    public final void invokeRendererInternal(Metadata metadata) {
        ExoPlayerImpl.ComponentListener componentListener = this.output;
        ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
        MediaMetadata mediaMetadata = exoPlayerImpl.staticAndDynamicMediaMetadata;
        ListenerSet listenerSet = exoPlayerImpl.listeners;
        MediaMetadata.Builder buildUpon = mediaMetadata.buildUpon();
        int i = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.entries;
            if (i >= entryArr.length) {
                break;
            }
            entryArr[i].populateMediaMetadata(buildUpon);
            i++;
        }
        exoPlayerImpl.staticAndDynamicMediaMetadata = new MediaMetadata(buildUpon);
        MediaMetadata buildUpdatedMediaMetadata = exoPlayerImpl.buildUpdatedMediaMetadata();
        if (!buildUpdatedMediaMetadata.equals(exoPlayerImpl.mediaMetadata)) {
            exoPlayerImpl.mediaMetadata = buildUpdatedMediaMetadata;
            listenerSet.queueEvent(14, new ExoPlayerImplInternal$$ExternalSyntheticLambda2(componentListener, 2));
        }
        listenerSet.queueEvent(28, new ExoPlayerImplInternal$$ExternalSyntheticLambda2(metadata, 3));
        listenerSet.flushEvents();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void onDisabled() {
        this.pendingMetadata = null;
        this.decoder = null;
        this.outputStreamOffsetUs = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void onPositionReset(long j, boolean z, boolean z2) {
        this.pendingMetadata = null;
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void onStreamChanged(Format[] formatArr, long j, long j2, MediaSource$MediaPeriodId mediaSource$MediaPeriodId) {
        this.decoder = this.decoderFactory.createDecoder(formatArr[0]);
        Metadata metadata = this.pendingMetadata;
        if (metadata != null) {
            long j3 = metadata.presentationTimeUs;
            long j4 = (this.outputStreamOffsetUs + j3) - j2;
            if (j3 != j4) {
                metadata = new Metadata(j4, metadata.entries);
            }
            this.pendingMetadata = metadata;
        }
        this.outputStreamOffsetUs = j2;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void render(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.inputStreamEnded && this.pendingMetadata == null) {
                MetadataInputBuffer metadataInputBuffer = this.buffer;
                metadataInputBuffer.clear();
                AndroidSvg androidSvg = this.formatHolder;
                androidSvg.clear();
                int readSource = readSource(androidSvg, metadataInputBuffer, 0);
                if (readSource == -4) {
                    if (metadataInputBuffer.getFlag(4)) {
                        this.inputStreamEnded = true;
                    } else if (metadataInputBuffer.timeUs >= this.lastResetPositionUs) {
                        metadataInputBuffer.subsampleOffsetUs = this.subsampleOffsetUs;
                        metadataInputBuffer.flip();
                        SimpleMetadataDecoder simpleMetadataDecoder = this.decoder;
                        String str = Util.DEVICE_DEBUG_INFO;
                        Metadata decode = simpleMetadataDecoder.decode(metadataInputBuffer);
                        if (decode != null) {
                            ArrayList arrayList = new ArrayList(decode.entries.length);
                            decodeWrappedMetadata(decode, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.pendingMetadata = new Metadata(getPresentationTimeUs(metadataInputBuffer.timeUs), (Metadata.Entry[]) arrayList.toArray(new Metadata.Entry[0]));
                            }
                        }
                    }
                } else if (readSource == -5) {
                    Format format2 = (Format) androidSvg.renderOptions;
                    format2.getClass();
                    this.subsampleOffsetUs = format2.subsampleOffsetUs;
                }
            }
            Metadata metadata = this.pendingMetadata;
            if (metadata == null || metadata.presentationTimeUs > getPresentationTimeUs(j)) {
                z = false;
            } else {
                Metadata metadata2 = this.pendingMetadata;
                Handler handler = this.outputHandler;
                if (handler != null) {
                    handler.obtainMessage(1, metadata2).sendToTarget();
                } else {
                    invokeRendererInternal(metadata2);
                }
                this.pendingMetadata = null;
                z = true;
            }
            if (this.inputStreamEnded && this.pendingMetadata == null) {
                this.outputStreamEnded = true;
            }
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final int supportsFormat(Format format2) {
        if (this.decoderFactory.supportsFormat(format2)) {
            return BaseRenderer.create(format2.cryptoType == 0 ? 4 : 2, 0, 0, 0);
        }
        return BaseRenderer.create(0, 0, 0, 0);
    }
}
