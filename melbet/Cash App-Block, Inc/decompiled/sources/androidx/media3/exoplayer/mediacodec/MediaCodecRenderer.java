package androidx.media3.exoplayer.mediacodec;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Pair;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.view.PreviewView;
import androidx.core.view.DisplayCompat;
import androidx.lifecycle.DispatchQueue$$ExternalSyntheticLambda0;
import androidx.media3.common.Format;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.common.util.Util;
import androidx.media3.container.OpusUtil;
import androidx.media3.decoder.CryptoInfo;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.CodecParameters;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoPlayerImplInternal;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.OggOpusAudioPacketizer;
import androidx.media3.exoplayer.drm.FrameworkCryptoConfig;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.source.MediaSource$MediaPeriodId;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.tracing.Trace;
import coil3.svg.internal.AndroidSvg;
import com.fillr.e0;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.pnm.PnmConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public abstract class MediaCodecRenderer extends BaseRenderer {
    public static final byte[] ADAPTATION_WORKAROUND_BUFFER = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, PnmConstants.PNM_SEPARATOR, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, PnmConstants.PBM_TEXT_CODE, -61, 39, 93, 120};
    public CodecParameters activeCodecParameters;
    public final float assumedMinimumCodecOperatingRate;
    public ArrayDeque availableCodecInfos;
    public final DecoderInputBuffer buffer;
    public final BatchBuffer bypassBatchBuffer;
    public boolean bypassDrainAndReinitialize;
    public boolean bypassEnabled;
    public final DecoderInputBuffer bypassSampleBuffer;
    public boolean bypassSampleBufferPending;
    public MediaCodecAdapter codec;
    public final MediaCodecAdapter.Factory codecAdapterFactory;
    public int codecDrainAction;
    public int codecDrainState;
    public Toolbar.AnonymousClass1 codecDrmSession;
    public boolean codecHasOutputMediaFormat;
    public long codecHotswapDeadlineMs;
    public MediaCodecInfo codecInfo;
    public Format codecInputFormat;
    public boolean codecNeedsAdaptationWorkaroundBuffer;
    public boolean codecNeedsEosPropagation;
    public boolean codecNeedsSosFlushWorkaround;
    public float codecOperatingRate;
    public MediaFormat codecOutputMediaFormat;
    public boolean codecOutputMediaFormatChanged;
    public boolean codecReceivedBuffers;
    public boolean codecReceivedEos;
    public int codecReconfigurationState;
    public boolean codecReconfigured;
    public boolean codecRegisteredOnBufferAvailableListener;
    public final Context context;
    public float currentPlaybackSpeed;
    public DecoderCounters decoderCounters;
    public boolean experimentalEnableProcessedStreamChangedAtStart;
    public boolean hasSkippedFlushAndWaitingForQueueInputBuffer;
    public Format inputFormat;
    public int inputIndex;
    public boolean inputStreamEnded;
    public boolean isLastOutputBuffer;
    public long largestQueuedPresentationTimeUs;
    public CodecParameters lastDispatchedCodecParameters;
    public long lastOutputBufferProcessedRealtimeMs;
    public long lastProcessedOutputBufferTimeUs;
    public final LoudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0 mediaCodecSelector;
    public MediaCrypto mediaCrypto;
    public boolean needToNotifyOutputFormatChangeAfterStreamChange;
    public final DecoderInputBuffer noDataBuffer;
    public final OggOpusAudioPacketizer oggOpusAudioPacketizer;
    public ByteBuffer outputBuffer;
    public final MediaCodec.BufferInfo outputBufferInfo;
    public Format outputFormat;
    public int outputIndex;
    public boolean outputStreamEnded;
    public OutputStreamInfo outputStreamInfo;
    public boolean pendingOutputEndOfStream;
    public final ArrayDeque pendingOutputStreamChanges;
    public ExoPlaybackException pendingPlaybackException;
    public DecoderInitializationException preferredDecoderInitializationException;
    public final AtomicInteger readDataResultHolder;
    public final long renderTimeLimitMs;
    public boolean shouldSkipAdaptationWorkaroundOutputBuffer;
    public long skippedFlushOffsetUs;
    public Toolbar.AnonymousClass1 sourceDrmSession;
    public ImmutableSet subscribedCodecParameterKeys;
    public float targetPlaybackSpeed;
    public boolean waitingForFirstSampleInFormat;
    public ExoPlayerImplInternal.AnonymousClass1 wakeupListener;

    public final class OutputStreamInfo {
        public static final OutputStreamInfo UNSET = new OutputStreamInfo(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);
        public final TimedValueQueue formatQueue = new TimedValueQueue((byte) 0, 0);
        public long lastBufferTimeUs = -9223372036854775807L;
        public final long previousStreamLastBufferTimeUs;
        public boolean queuedBufferAfterReset;
        public final long startPositionUs;
        public final long streamOffsetUs;

        public OutputStreamInfo(long j, long j2, long j3) {
            this.previousStreamLastBufferTimeUs = j;
            this.startPositionUs = j2;
            this.streamOffsetUs = j3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCodecRenderer(Context context, int i, MediaCodecAdapter.Factory factory, float f) {
        super(i);
        LoudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0 loudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0 = LoudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0.DEFAULT$1;
        this.context = context.getApplicationContext();
        this.codecAdapterFactory = factory;
        this.mediaCodecSelector = loudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0;
        this.assumedMinimumCodecOperatingRate = f;
        this.readDataResultHolder = new AtomicInteger();
        this.noDataBuffer = new DecoderInputBuffer(0);
        this.buffer = new DecoderInputBuffer(0);
        this.bypassSampleBuffer = new DecoderInputBuffer(2);
        BatchBuffer batchBuffer = new BatchBuffer(2);
        batchBuffer.maxSampleCount = 32;
        this.bypassBatchBuffer = batchBuffer;
        this.outputBufferInfo = new MediaCodec.BufferInfo();
        this.currentPlaybackSpeed = 1.0f;
        this.targetPlaybackSpeed = 1.0f;
        this.renderTimeLimitMs = -9223372036854775807L;
        this.pendingOutputStreamChanges = new ArrayDeque();
        this.outputStreamInfo = OutputStreamInfo.UNSET;
        batchBuffer.ensureSpaceForWrite(0);
        batchBuffer.data.order(ByteOrder.nativeOrder());
        OggOpusAudioPacketizer oggOpusAudioPacketizer = new OggOpusAudioPacketizer();
        oggOpusAudioPacketizer.outputBuffer = AudioProcessor.EMPTY_BUFFER;
        oggOpusAudioPacketizer.granulePosition = 0;
        oggOpusAudioPacketizer.pageSequenceNumber = 2;
        this.oggOpusAudioPacketizer = oggOpusAudioPacketizer;
        this.codecOperatingRate = -1.0f;
        this.codecReconfigurationState = 0;
        this.inputIndex = -1;
        this.outputIndex = -1;
        this.codecHotswapDeadlineMs = -9223372036854775807L;
        this.largestQueuedPresentationTimeUs = -9223372036854775807L;
        this.lastProcessedOutputBufferTimeUs = -9223372036854775807L;
        this.lastOutputBufferProcessedRealtimeMs = -9223372036854775807L;
        this.codecDrainState = 0;
        this.codecDrainAction = 0;
        this.decoderCounters = new DecoderCounters();
        this.hasSkippedFlushAndWaitingForQueueInputBuffer = false;
        this.skippedFlushOffsetUs = 0L;
        int i2 = ImmutableSet.$r8$clinit;
        this.subscribedCodecParameterKeys = RegularImmutableSet.EMPTY;
        CodecParameters codecParameters = CodecParameters.EMPTY;
        this.activeCodecParameters = codecParameters;
        this.lastDispatchedCodecParameters = codecParameters;
    }

    public final void applyCodecParametersToMediaFormat(MediaFormat mediaFormat) {
        for (Map.Entry entry : this.activeCodecParameters.params.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                mediaFormat.setString(str, null);
            } else if (value instanceof Integer) {
                mediaFormat.setInteger(str, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                mediaFormat.setLong(str, ((Long) value).longValue());
            } else if (value instanceof Float) {
                mediaFormat.setFloat(str, ((Float) value).floatValue());
            } else if (value instanceof String) {
                mediaFormat.setString(str, (String) value);
            } else if (value instanceof ByteBuffer) {
                mediaFormat.setByteBuffer(str, (ByteBuffer) value);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0314, code lost:
    
        r24.bypassSampleBufferPending = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean bypassRender(long j, long j2) {
        BatchBuffer batchBuffer;
        int i;
        int i2;
        int i3;
        Trace.checkState(!this.outputStreamEnded);
        BatchBuffer batchBuffer2 = this.bypassBatchBuffer;
        if (batchBuffer2.hasSamples()) {
            ByteBuffer byteBuffer = batchBuffer2.data;
            int i4 = this.outputIndex;
            int i5 = batchBuffer2.sampleCount;
            long j3 = batchBuffer2.timeUs;
            boolean isDecodeOnly = isDecodeOnly(this.lastResetPositionUs, batchBuffer2.lastSampleTimeUs);
            boolean flag = batchBuffer2.getFlag(4);
            Format format2 = this.outputFormat;
            format2.getClass();
            batchBuffer = batchBuffer2;
            if (processOutputBuffer(j, j2, null, byteBuffer, i4, 0, i5, j3, isDecodeOnly, flag, format2)) {
                onProcessedOutputBuffer$1(batchBuffer.lastSampleTimeUs);
                batchBuffer.clear();
            }
        }
        batchBuffer = batchBuffer2;
        if (this.inputStreamEnded) {
            this.outputStreamEnded = true;
            return false;
        }
        ?? r2 = 0;
        boolean z = this.bypassSampleBufferPending;
        DecoderInputBuffer decoderInputBuffer = this.bypassSampleBuffer;
        if (z) {
            Trace.checkState(batchBuffer.append(decoderInputBuffer));
            this.bypassSampleBufferPending = false;
        }
        if (this.bypassDrainAndReinitialize) {
            if (batchBuffer.hasSamples()) {
                return true;
            }
            this.bypassEnabled = false;
            resetBypassState();
            this.bypassDrainAndReinitialize = false;
            maybeInitCodecOrBypass();
            if (!this.bypassEnabled) {
                return false;
            }
        }
        Trace.checkState(!this.inputStreamEnded);
        AndroidSvg androidSvg = this.formatHolder;
        androidSvg.clear();
        decoderInputBuffer.clear();
        while (true) {
            decoderInputBuffer.clear();
            int readSource = readSource(androidSvg, decoderInputBuffer, r2);
            if (readSource == -5) {
                onInputFormatChanged(androidSvg);
                break;
            }
            if (readSource != -4) {
                if (readSource != -3) {
                    Path$$ExternalSyntheticBUOutline0.m();
                    return r2;
                }
                if (hasReadStreamToEnd()) {
                    getLastOutputStreamInfo().lastBufferTimeUs = this.largestQueuedPresentationTimeUs;
                }
            } else {
                if (decoderInputBuffer.getFlag(4)) {
                    this.inputStreamEnded = true;
                    getLastOutputStreamInfo().lastBufferTimeUs = this.largestQueuedPresentationTimeUs;
                    break;
                }
                this.largestQueuedPresentationTimeUs = Math.max(this.largestQueuedPresentationTimeUs, decoderInputBuffer.timeUs);
                if (hasReadStreamToEnd() || this.buffer.getFlag(PKIFailureInfo.duplicateCertReq)) {
                    getLastOutputStreamInfo().lastBufferTimeUs = this.largestQueuedPresentationTimeUs;
                }
                byte[] bArr = null;
                if (this.waitingForFirstSampleInFormat) {
                    Format format3 = this.inputFormat;
                    format3.getClass();
                    this.outputFormat = format3;
                    if (Objects.equals(format3.sampleMimeType, "audio/opus") && !this.outputFormat.initializationData.isEmpty()) {
                        byte[] bArr2 = (byte[]) this.outputFormat.initializationData.get(r2);
                        int i6 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                        Format.Builder buildUpon = this.outputFormat.buildUpon();
                        buildUpon.encoderDelay = i6;
                        this.outputFormat = new Format(buildUpon);
                    }
                    onOutputFormatChanged(this.outputFormat, null);
                    this.waitingForFirstSampleInFormat = r2;
                }
                decoderInputBuffer.flip();
                Format format4 = this.outputFormat;
                if (format4 != null && Objects.equals(format4.sampleMimeType, "audio/opus")) {
                    if (decoderInputBuffer.getFlag(268435456)) {
                        decoderInputBuffer.f875format = this.outputFormat;
                        handleInputBufferSupplementalData(decoderInputBuffer);
                    }
                    if (this.lastResetPositionUs - decoderInputBuffer.timeUs <= 80000) {
                        List list = this.outputFormat.initializationData;
                        OggOpusAudioPacketizer oggOpusAudioPacketizer = this.oggOpusAudioPacketizer;
                        oggOpusAudioPacketizer.getClass();
                        decoderInputBuffer.data.getClass();
                        if (decoderInputBuffer.data.limit() - decoderInputBuffer.data.position() != 0) {
                            if (oggOpusAudioPacketizer.pageSequenceNumber == 2 && (list.size() == 1 || list.size() == 3)) {
                                bArr = (byte[]) list.get(r2);
                            }
                            ByteBuffer byteBuffer2 = decoderInputBuffer.data;
                            int position = byteBuffer2.position();
                            int limit = byteBuffer2.limit();
                            int i7 = limit - position;
                            int i8 = (i7 + 255) / 255;
                            int i9 = i8 + 27 + i7;
                            if (oggOpusAudioPacketizer.pageSequenceNumber == 2) {
                                i = bArr != null ? bArr.length + 28 : 47;
                                i9 = i + 44 + i9;
                            } else {
                                i = r2;
                            }
                            if (oggOpusAudioPacketizer.outputBuffer.capacity() < i9) {
                                oggOpusAudioPacketizer.outputBuffer = ByteBuffer.allocate(i9).order(ByteOrder.LITTLE_ENDIAN);
                            } else {
                                oggOpusAudioPacketizer.outputBuffer.clear();
                            }
                            ByteBuffer byteBuffer3 = oggOpusAudioPacketizer.outputBuffer;
                            if (oggOpusAudioPacketizer.pageSequenceNumber == 2) {
                                if (bArr != null) {
                                    OggOpusAudioPacketizer.writeOggPacketHeader(byteBuffer3, 0L, 0, 1, true);
                                    i3 = limit;
                                    byteBuffer3.put(UnsignedBytes.checkedCast(bArr.length));
                                    byteBuffer3.put(bArr);
                                    i2 = i;
                                    byteBuffer3.putInt(22, Util.crc32(byteBuffer3.arrayOffset(), bArr.length + 28, 0, byteBuffer3.array()));
                                    byteBuffer3.position(bArr.length + 28);
                                } else {
                                    i2 = i;
                                    i3 = limit;
                                    byteBuffer3.put(OggOpusAudioPacketizer.OGG_DEFAULT_ID_HEADER_PAGE);
                                }
                                byteBuffer3.put(OggOpusAudioPacketizer.OGG_DEFAULT_COMMENT_HEADER_PAGE);
                            } else {
                                i2 = i;
                                i3 = limit;
                            }
                            int packetDurationUs = oggOpusAudioPacketizer.granulePosition + ((int) ((OpusUtil.getPacketDurationUs(byteBuffer2.get(0), byteBuffer2.limit() > 1 ? byteBuffer2.get(1) : (byte) 0) * 48000) / 1000000));
                            oggOpusAudioPacketizer.granulePosition = packetDurationUs;
                            OggOpusAudioPacketizer.writeOggPacketHeader(byteBuffer3, packetDurationUs, oggOpusAudioPacketizer.pageSequenceNumber, i8, false);
                            for (int i10 = 0; i10 < i8; i10++) {
                                if (i7 >= 255) {
                                    byteBuffer3.put((byte) -1);
                                    i7 -= 255;
                                } else {
                                    byteBuffer3.put((byte) i7);
                                    i7 = 0;
                                }
                            }
                            int i11 = i3;
                            while (position < i11) {
                                byteBuffer3.put(byteBuffer2.get(position));
                                position++;
                            }
                            byteBuffer2.position(byteBuffer2.limit());
                            byteBuffer3.flip();
                            if (oggOpusAudioPacketizer.pageSequenceNumber == 2) {
                                byteBuffer3.putInt(i2 + 66, Util.crc32(byteBuffer3.arrayOffset() + i2 + 44, byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                            } else {
                                byteBuffer3.putInt(22, Util.crc32(byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                            }
                            oggOpusAudioPacketizer.pageSequenceNumber++;
                            oggOpusAudioPacketizer.outputBuffer = byteBuffer3;
                            decoderInputBuffer.clear();
                            decoderInputBuffer.ensureSpaceForWrite(oggOpusAudioPacketizer.outputBuffer.remaining());
                            decoderInputBuffer.data.put(oggOpusAudioPacketizer.outputBuffer);
                            decoderInputBuffer.flip();
                        }
                    }
                }
                if (batchBuffer.hasSamples()) {
                    long j4 = this.lastResetPositionUs;
                    if (isDecodeOnly(j4, batchBuffer.lastSampleTimeUs) != isDecodeOnly(j4, decoderInputBuffer.timeUs)) {
                        break;
                    }
                }
                if (!batchBuffer.append(decoderInputBuffer)) {
                    break;
                }
                r2 = 0;
            }
        }
        if (batchBuffer.hasSamples()) {
            batchBuffer.flip();
        }
        return batchBuffer.hasSamples() || this.inputStreamEnded || this.bypassDrainAndReinitialize;
    }

    public abstract DecoderReuseEvaluation canReuseCodec(MediaCodecInfo mediaCodecInfo, Format format2, Format format3, boolean z);

    public MediaCodecDecoderException createDecoderException(IllegalStateException illegalStateException, MediaCodecInfo mediaCodecInfo) {
        return new MediaCodecDecoderException(illegalStateException, mediaCodecInfo);
    }

    public final boolean drainAndUpdateCodecDrmSession() {
        if (!this.codecReceivedBuffers) {
            updateDrmSession();
            return true;
        }
        this.codecDrainState = 1;
        this.codecDrainAction = 2;
        return true;
    }

    public final boolean drainOutputBuffer(long j, long j2) {
        MediaCodecAdapter mediaCodecAdapter = this.codec;
        mediaCodecAdapter.getClass();
        int i = this.outputIndex;
        MediaCodec.BufferInfo bufferInfo = this.outputBufferInfo;
        if (i < 0) {
            int dequeueOutputBufferIndex = mediaCodecAdapter.dequeueOutputBufferIndex(bufferInfo);
            if (dequeueOutputBufferIndex < 0) {
                if (dequeueOutputBufferIndex != -2) {
                    if (this.codecNeedsEosPropagation && (this.inputStreamEnded || this.codecDrainState == 2)) {
                        processEndOfStream();
                    }
                    long j3 = this.lastOutputBufferProcessedRealtimeMs;
                    if (j3 != -9223372036854775807L) {
                        long j4 = j3 + 100;
                        this.clock.getClass();
                        if (j4 < System.currentTimeMillis()) {
                            processEndOfStream();
                            return false;
                        }
                    }
                    return false;
                }
                this.codecHasOutputMediaFormat = true;
                MediaCodecAdapter mediaCodecAdapter2 = this.codec;
                mediaCodecAdapter2.getClass();
                MediaFormat outputFormat = mediaCodecAdapter2.getOutputFormat();
                if (!this.subscribedCodecParameterKeys.isEmpty()) {
                    ImmutableSet<String> immutableSet = this.subscribedCodecParameterKeys;
                    CodecParameters codecParameters = CodecParameters.EMPTY;
                    HashMap hashMap = new HashMap();
                    for (String str : immutableSet) {
                        if (outputFormat.containsKey(str)) {
                            int valueTypeForKey = outputFormat.getValueTypeForKey(str);
                            if (valueTypeForKey == 1) {
                                hashMap.put(str, Integer.valueOf(outputFormat.getInteger(str)));
                            } else if (valueTypeForKey == 2) {
                                hashMap.put(str, Long.valueOf(outputFormat.getLong(str)));
                            } else if (valueTypeForKey == 3) {
                                hashMap.put(str, Float.valueOf(outputFormat.getFloat(str)));
                            } else if (valueTypeForKey == 4) {
                                hashMap.put(str, outputFormat.getString(str));
                            } else if (valueTypeForKey == 5) {
                                ByteBuffer byteBuffer = outputFormat.getByteBuffer(str);
                                if (byteBuffer == null) {
                                    hashMap.put(str, null);
                                } else {
                                    ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
                                    allocate.put(byteBuffer.duplicate());
                                    allocate.flip();
                                    hashMap.put(str, allocate);
                                }
                            }
                        }
                    }
                    CodecParameters codecParameters2 = new CodecParameters(hashMap);
                    if (!codecParameters2.equals(this.lastDispatchedCodecParameters)) {
                        this.lastDispatchedCodecParameters = codecParameters2;
                        onCodecParametersChanged(codecParameters2);
                    }
                }
                this.codecOutputMediaFormat = outputFormat;
                this.codecOutputMediaFormatChanged = true;
                return true;
            }
            bufferInfo.presentationTimeUs -= this.skippedFlushOffsetUs;
            if (this.shouldSkipAdaptationWorkaroundOutputBuffer) {
                this.shouldSkipAdaptationWorkaroundOutputBuffer = false;
                mediaCodecAdapter.releaseOutputBuffer(dequeueOutputBufferIndex);
                return true;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                processEndOfStream();
                return false;
            }
            this.outputIndex = dequeueOutputBufferIndex;
            ByteBuffer outputBuffer = mediaCodecAdapter.getOutputBuffer(dequeueOutputBufferIndex);
            this.outputBuffer = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(bufferInfo.offset);
                this.outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
            }
            updateOutputFormatForTime(bufferInfo.presentationTimeUs);
        }
        boolean z = this.hasSkippedFlushAndWaitingForQueueInputBuffer || bufferInfo.presentationTimeUs < this.lastResetPositionUs;
        long j5 = this.outputStreamInfo.lastBufferTimeUs;
        boolean z2 = j5 != -9223372036854775807L && j5 <= bufferInfo.presentationTimeUs;
        this.isLastOutputBuffer = z2;
        ByteBuffer byteBuffer2 = this.outputBuffer;
        int i2 = this.outputIndex;
        int i3 = bufferInfo.flags;
        long j6 = bufferInfo.presentationTimeUs;
        Format format2 = this.outputFormat;
        format2.getClass();
        if (!processOutputBuffer(j, j2, mediaCodecAdapter, byteBuffer2, i2, i3, 1, j6, z, z2, format2)) {
            return false;
        }
        onProcessedOutputBuffer$1(bufferInfo.presentationTimeUs);
        boolean z3 = (bufferInfo.flags & 4) != 0;
        if (!z3 && this.codecReceivedEos && this.isLastOutputBuffer) {
            this.clock.getClass();
            this.lastOutputBufferProcessedRealtimeMs = System.currentTimeMillis();
        }
        this.outputIndex = -1;
        this.outputBuffer = null;
        if (!z3) {
            return true;
        }
        processEndOfStream();
        return false;
    }

    public final boolean feedInputBuffer() {
        MediaCodecAdapter mediaCodecAdapter = this.codec;
        if (mediaCodecAdapter != null && this.codecDrainState != 2 && !this.inputStreamEnded) {
            int i = this.inputIndex;
            DecoderInputBuffer decoderInputBuffer = this.buffer;
            if (i < 0) {
                int dequeueInputBufferIndex = mediaCodecAdapter.dequeueInputBufferIndex();
                this.inputIndex = dequeueInputBufferIndex;
                if (dequeueInputBufferIndex >= 0) {
                    decoderInputBuffer.data = mediaCodecAdapter.getInputBuffer(dequeueInputBufferIndex);
                    decoderInputBuffer.clear();
                }
            }
            if (this.codecDrainState == 1) {
                if (!this.codecNeedsEosPropagation) {
                    this.codecReceivedEos = true;
                    mediaCodecAdapter.queueInputBuffer(this.inputIndex, 0, 4, 0L);
                    this.inputIndex = -1;
                    decoderInputBuffer.data = null;
                }
                this.codecDrainState = 2;
                return false;
            }
            if (this.codecNeedsAdaptationWorkaroundBuffer) {
                this.codecNeedsAdaptationWorkaroundBuffer = false;
                ByteBuffer byteBuffer = decoderInputBuffer.data;
                byteBuffer.getClass();
                byteBuffer.put(ADAPTATION_WORKAROUND_BUFFER);
                mediaCodecAdapter.queueInputBuffer(this.inputIndex, 38, 0, 0L);
                this.inputIndex = -1;
                decoderInputBuffer.data = null;
                this.codecReceivedBuffers = true;
                return true;
            }
            if (this.codecReconfigurationState == 1) {
                int i2 = 0;
                while (true) {
                    Format format2 = this.codecInputFormat;
                    format2.getClass();
                    if (i2 >= format2.initializationData.size()) {
                        break;
                    }
                    byte[] bArr = (byte[]) this.codecInputFormat.initializationData.get(i2);
                    ByteBuffer byteBuffer2 = decoderInputBuffer.data;
                    byteBuffer2.getClass();
                    byteBuffer2.put(bArr);
                    i2++;
                }
                this.codecReconfigurationState = 2;
            }
            ByteBuffer byteBuffer3 = decoderInputBuffer.data;
            byteBuffer3.getClass();
            int position = byteBuffer3.position();
            AndroidSvg androidSvg = this.formatHolder;
            androidSvg.clear();
            try {
                mediaCodecAdapter.useInputBuffer(new DispatchQueue$$ExternalSyntheticLambda0(28, this, androidSvg));
                int i3 = this.readDataResultHolder.get();
                if (i3 == -3) {
                    if (hasReadStreamToEnd()) {
                        getLastOutputStreamInfo().lastBufferTimeUs = this.largestQueuedPresentationTimeUs;
                        return false;
                    }
                } else {
                    if (i3 == -5) {
                        if (this.codecReconfigurationState == 2) {
                            decoderInputBuffer.clear();
                            this.codecReconfigurationState = 1;
                        }
                        onInputFormatChanged(androidSvg);
                        return true;
                    }
                    if (!decoderInputBuffer.getFlag(4)) {
                        if (this.codecReceivedBuffers || decoderInputBuffer.getFlag(1)) {
                            long j = decoderInputBuffer.timeUs;
                            if (!shouldDiscardDecoderInputBuffer(decoderInputBuffer)) {
                                boolean flag = decoderInputBuffer.getFlag(1073741824);
                                if (flag) {
                                    CryptoInfo cryptoInfo = decoderInputBuffer.cryptoInfo;
                                    if (position == 0) {
                                        cryptoInfo.getClass();
                                    } else {
                                        if (cryptoInfo.numBytesOfClearData == null) {
                                            int[] iArr = new int[1];
                                            cryptoInfo.numBytesOfClearData = iArr;
                                            cryptoInfo.frameworkCryptoInfo.numBytesOfClearData = iArr;
                                        }
                                        int[] iArr2 = cryptoInfo.numBytesOfClearData;
                                        iArr2[0] = iArr2[0] + position;
                                    }
                                }
                                if (this.waitingForFirstSampleInFormat) {
                                    OutputStreamInfo lastOutputStreamInfo = getLastOutputStreamInfo();
                                    TimedValueQueue timedValueQueue = lastOutputStreamInfo.formatQueue;
                                    Format format3 = this.inputFormat;
                                    format3.getClass();
                                    timedValueQueue.add(format3, j);
                                    lastOutputStreamInfo.queuedBufferAfterReset = true;
                                    this.waitingForFirstSampleInFormat = false;
                                }
                                this.largestQueuedPresentationTimeUs = Math.max(this.largestQueuedPresentationTimeUs, j);
                                if (hasReadStreamToEnd() || decoderInputBuffer.getFlag(PKIFailureInfo.duplicateCertReq)) {
                                    getLastOutputStreamInfo().lastBufferTimeUs = this.largestQueuedPresentationTimeUs;
                                }
                                decoderInputBuffer.flip();
                                if (decoderInputBuffer.getFlag(268435456)) {
                                    handleInputBufferSupplementalData(decoderInputBuffer);
                                }
                                if (this.hasSkippedFlushAndWaitingForQueueInputBuffer) {
                                    long j2 = this.largestQueuedPresentationTimeUs;
                                    if (j <= j2) {
                                        this.skippedFlushOffsetUs = (j2 - j) + 1 + this.skippedFlushOffsetUs;
                                    }
                                    this.largestQueuedPresentationTimeUs = j;
                                    this.hasSkippedFlushAndWaitingForQueueInputBuffer = false;
                                }
                                onQueueInputBuffer(decoderInputBuffer);
                                int codecBufferFlags = getCodecBufferFlags(decoderInputBuffer);
                                long j3 = j + this.skippedFlushOffsetUs;
                                int i4 = this.inputIndex;
                                if (flag) {
                                    mediaCodecAdapter.queueSecureInputBuffer(i4, decoderInputBuffer.cryptoInfo, j3, codecBufferFlags);
                                } else {
                                    ByteBuffer byteBuffer4 = decoderInputBuffer.data;
                                    byteBuffer4.getClass();
                                    mediaCodecAdapter.queueInputBuffer(i4, byteBuffer4.limit(), codecBufferFlags, j3);
                                }
                                this.inputIndex = -1;
                                decoderInputBuffer.data = null;
                                this.codecReceivedBuffers = true;
                                this.codecReconfigurationState = 0;
                                this.decoderCounters.queuedInputBufferCount++;
                                return true;
                            }
                        } else {
                            decoderInputBuffer.clear();
                            if (this.codecReconfigurationState == 2) {
                                this.codecReconfigurationState = 1;
                                return true;
                            }
                        }
                        return true;
                    }
                    getLastOutputStreamInfo().lastBufferTimeUs = this.largestQueuedPresentationTimeUs;
                    if (this.codecReconfigurationState == 2) {
                        decoderInputBuffer.clear();
                        this.codecReconfigurationState = 1;
                    }
                    this.inputStreamEnded = true;
                    if (!this.codecReceivedBuffers) {
                        processEndOfStream();
                        return false;
                    }
                    if (!this.codecNeedsEosPropagation) {
                        this.codecReceivedEos = true;
                        mediaCodecAdapter.queueInputBuffer(this.inputIndex, 0, 4, 0L);
                        this.inputIndex = -1;
                        decoderInputBuffer.data = null;
                        return false;
                    }
                }
            } catch (DecoderInputBuffer.InsufficientCapacityException e) {
                onCodecError(e);
                readSourceOmittingSampleData(0);
                flushCodec();
                return true;
            }
        }
        return false;
    }

    public final void flushCodec() {
        try {
            MediaCodecAdapter mediaCodecAdapter = this.codec;
            mediaCodecAdapter.getClass();
            mediaCodecAdapter.flush();
        } finally {
            resetCodecStateForFlush();
        }
    }

    public final List getAvailableCodecInfos(boolean z) {
        Format format2 = this.inputFormat;
        format2.getClass();
        LoudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0 loudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0 = this.mediaCodecSelector;
        ArrayList decoderInfos = getDecoderInfos(loudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0, format2, z);
        if (!decoderInfos.isEmpty() || !z) {
            return decoderInfos;
        }
        ArrayList decoderInfos2 = getDecoderInfos(loudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0, format2, false);
        if (!decoderInfos2.isEmpty()) {
            Log.w("MediaCodecRenderer", "Drm session requires secure decoder for " + format2.sampleMimeType + ", but no secure decoder available. Trying to proceed with " + decoderInfos2 + ".");
        }
        return decoderInfos2;
    }

    public int getCodecBufferFlags(DecoderInputBuffer decoderInputBuffer) {
        return 0;
    }

    public abstract float getCodecOperatingRateV23(float f, Format format2, Format[] formatArr);

    public abstract ArrayList getDecoderInfos(LoudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0 loudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0, Format format2, boolean z);

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final long getDurationToProgressUs(long j, long j2) {
        return getDurationToProgressUs(this.codecRegisteredOnBufferAvailableListener, j, j2);
    }

    public final OutputStreamInfo getLastOutputStreamInfo() {
        ArrayDeque arrayDeque = this.pendingOutputStreamChanges;
        return !arrayDeque.isEmpty() ? (OutputStreamInfo) arrayDeque.getLast() : this.outputStreamInfo;
    }

    public abstract e0 getMediaCodecConfiguration(MediaCodecInfo mediaCodecInfo, Format format2, MediaCrypto mediaCrypto, float f);

    public abstract void handleInputBufferSupplementalData(DecoderInputBuffer decoderInputBuffer);

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i, Object obj) {
        if (i == 11) {
            ExoPlayerImplInternal.AnonymousClass1 anonymousClass1 = (ExoPlayerImplInternal.AnonymousClass1) obj;
            anonymousClass1.getClass();
            this.wakeupListener = anonymousClass1;
            return;
        }
        if (i != 21) {
            if (i != 22) {
                return;
            }
            obj.getClass();
            ImmutableSet immutableSet = (ImmutableSet) obj;
            if (this.subscribedCodecParameterKeys.equals(immutableSet)) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 31) {
                HashSet hashSet = new HashSet(immutableSet);
                HashSet hashSet2 = new HashSet();
                UnmodifiableIterator it = this.subscribedCodecParameterKeys.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (!hashSet.remove(str)) {
                        hashSet2.add(str);
                    }
                }
                MediaCodecAdapter mediaCodecAdapter = this.codec;
                if (mediaCodecAdapter != null) {
                    if (!hashSet2.isEmpty()) {
                        mediaCodecAdapter.unsubscribeFromVendorParameters(new ArrayList(hashSet2));
                    }
                    if (!hashSet.isEmpty()) {
                        mediaCodecAdapter.subscribeToVendorParameters(new ArrayList(hashSet));
                    }
                }
            }
            this.subscribedCodecParameterKeys = immutableSet;
            return;
        }
        obj.getClass();
        CodecParameters codecParameters = (CodecParameters) obj;
        this.activeCodecParameters = codecParameters;
        MediaCodecAdapter mediaCodecAdapter2 = this.codec;
        if (mediaCodecAdapter2 != null) {
            Bundle bundle = new Bundle();
            for (Map.Entry entry : codecParameters.params.entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    if (value instanceof Integer) {
                        bundle.putInt(str2, ((Integer) value).intValue());
                    } else if (value instanceof Long) {
                        bundle.putLong(str2, ((Long) value).longValue());
                    } else if (value instanceof Float) {
                        bundle.putFloat(str2, ((Float) value).floatValue());
                    } else if (value instanceof String) {
                        bundle.putString(str2, (String) value);
                    } else if (value instanceof ByteBuffer) {
                        ByteBuffer byteBuffer = (ByteBuffer) value;
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.duplicate().get(bArr);
                        bundle.putByteArray(str2, bArr);
                    }
                }
            }
            mediaCodecAdapter2.setParameters(bundle);
        }
    }

    public final void initCodec(MediaCodecInfo mediaCodecInfo, MediaCrypto mediaCrypto) {
        this.codecInfo = mediaCodecInfo;
        Format format2 = this.inputFormat;
        format2.getClass();
        String str = mediaCodecInfo.name;
        float f = this.targetPlaybackSpeed;
        Format[] formatArr = this.streamFormats;
        formatArr.getClass();
        float codecOperatingRateV23 = getCodecOperatingRateV23(f, format2, formatArr);
        if (codecOperatingRateV23 <= this.assumedMinimumCodecOperatingRate) {
            codecOperatingRateV23 = -1.0f;
        }
        this.clock.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        e0 mediaCodecConfiguration = getMediaCodecConfiguration(mediaCodecInfo, format2, mediaCrypto, codecOperatingRateV23);
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            PlayerId playerId = this.playerId;
            playerId.getClass();
            DisplayCompat.setLogSessionIdToMediaCodecFormat(mediaCodecConfiguration, playerId);
        }
        try {
            android.os.Trace.beginSection("createCodec:" + str);
            MediaCodecAdapter createAdapter = this.codecAdapterFactory.createAdapter(mediaCodecConfiguration);
            this.codec = createAdapter;
            boolean z = false;
            this.codecRegisteredOnBufferAvailableListener = createAdapter.registerOnBufferAvailableListener(new PreviewView.AnonymousClass1(this, z));
            android.os.Trace.endSection();
            this.clock.getClass();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!mediaCodecInfo.isFormatSupported(this.context, format2)) {
                String logString = Format.toLogString(format2);
                Locale locale = Locale.US;
                Log.w("MediaCodecRenderer", Boxes$$ExternalSyntheticOutline1.m("Format exceeds selected codec's capabilities [", logString, ", ", str, "]"));
            }
            this.codecOperatingRate = codecOperatingRateV23;
            this.codecInputFormat = format2;
            this.codecNeedsSosFlushWorkaround = i == 29 && "c2.android.aac.decoder".equals(str);
            String str2 = mediaCodecInfo.name;
            if ((i <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str2) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str2) || "OMX.bcm.vdec.avc.tunnel".equals(str2) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str2) || "OMX.bcm.vdec.hevc.tunnel".equals(str2) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str2))) || ("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && mediaCodecInfo.secure)) {
                z = true;
            }
            this.codecNeedsEosPropagation = z;
            this.codec.getClass();
            if (this.state == 2) {
                this.clock.getClass();
                this.codecHotswapDeadlineMs = SystemClock.elapsedRealtime() + 1000;
            }
            this.decoderCounters.decoderInitCount++;
            long j = elapsedRealtime2 - elapsedRealtime;
            if (i >= 31 && !this.subscribedCodecParameterKeys.isEmpty()) {
                MediaCodecAdapter mediaCodecAdapter = this.codec;
                mediaCodecAdapter.getClass();
                mediaCodecAdapter.subscribeToVendorParameters(new ArrayList(this.subscribedCodecParameterKeys));
            }
            onCodecInitialized(elapsedRealtime2, j, str);
        } catch (Throwable th) {
            android.os.Trace.endSection();
            throw th;
        }
    }

    public final boolean isDecodeOnly(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        Format format2 = this.outputFormat;
        return format2 == null || !Objects.equals(format2.sampleMimeType, "audio/opus") || j - j2 > 80000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        if (r2.getError() != null) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void maybeInitCodecOrBypass() {
        Format format2;
        if (this.codec != null || this.bypassEnabled || (format2 = this.inputFormat) == null) {
            return;
        }
        String str = format2.sampleMimeType;
        if (this.sourceDrmSession == null && shouldUseBypass(format2)) {
            this.bypassEnabled = false;
            resetBypassState();
            boolean equals = "audio/mp4a-latm".equals(str);
            BatchBuffer batchBuffer = this.bypassBatchBuffer;
            if (equals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                batchBuffer.getClass();
                batchBuffer.maxSampleCount = 32;
            } else {
                batchBuffer.getClass();
                batchBuffer.maxSampleCount = 1;
            }
            this.bypassEnabled = true;
            return;
        }
        setCodecDrmSession(this.sourceDrmSession);
        if (this.codecDrmSession != null) {
            Trace.checkState(this.mediaCrypto == null);
            Toolbar.AnonymousClass1 anonymousClass1 = this.codecDrmSession;
            anonymousClass1.getClass();
            boolean z = FrameworkCryptoConfig.WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC;
        }
        try {
            Toolbar.AnonymousClass1 anonymousClass12 = this.codecDrmSession;
            if (anonymousClass12 != null) {
                if (anonymousClass12.getState() != 3) {
                    if (this.codecDrmSession.getState() == 4) {
                    }
                }
                Toolbar.AnonymousClass1 anonymousClass13 = this.codecDrmSession;
                str.getClass();
                anonymousClass13.getClass();
            }
            maybeInitCodecWithFallback(this.mediaCrypto, false);
            MediaCrypto mediaCrypto = this.mediaCrypto;
            if (mediaCrypto == null || this.codec != null) {
                return;
            }
            mediaCrypto.release();
            this.mediaCrypto = null;
        } catch (DecoderInitializationException e) {
            throw createRendererException(e, format2, false, 4001);
        }
    }

    public final void maybeInitCodecWithFallback(MediaCrypto mediaCrypto, boolean z) {
        Format format2 = this.inputFormat;
        format2.getClass();
        if (this.availableCodecInfos == null) {
            try {
                List availableCodecInfos = getAvailableCodecInfos(z);
                this.availableCodecInfos = new ArrayDeque();
                ArrayList arrayList = (ArrayList) availableCodecInfos;
                if (!arrayList.isEmpty()) {
                    this.availableCodecInfos.add((MediaCodecInfo) arrayList.get(0));
                }
                this.preferredDecoderInitializationException = null;
            } catch (MediaCodecUtil.DecoderQueryException e) {
                throw new DecoderInitializationException(format2, e, z, -49998);
            }
        }
        if (this.availableCodecInfos.isEmpty()) {
            throw new DecoderInitializationException(format2, null, z, -49999);
        }
        ArrayDeque arrayDeque = this.availableCodecInfos;
        arrayDeque.getClass();
        while (this.codec == null) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) arrayDeque.peekFirst();
            mediaCodecInfo.getClass();
            if (!maybeInitializeProcessingPipeline(format2) || !shouldInitCodec(mediaCodecInfo)) {
                return;
            }
            try {
                initCodec(mediaCodecInfo, mediaCrypto);
            } catch (Exception e2) {
                Log.w("MediaCodecRenderer", "Failed to initialize decoder: " + mediaCodecInfo, e2);
                arrayDeque.removeFirst();
                DecoderInitializationException decoderInitializationException = new DecoderInitializationException("Decoder init failed: " + mediaCodecInfo.name + ", " + format2, e2, format2.sampleMimeType, z, mediaCodecInfo, e2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e2).getDiagnosticInfo() : null);
                onCodecError(decoderInitializationException);
                DecoderInitializationException decoderInitializationException2 = this.preferredDecoderInitializationException;
                if (decoderInitializationException2 == null) {
                    this.preferredDecoderInitializationException = decoderInitializationException;
                } else {
                    this.preferredDecoderInitializationException = new DecoderInitializationException(decoderInitializationException2.getMessage(), decoderInitializationException2.getCause(), decoderInitializationException2.mimeType, decoderInitializationException2.secureDecoderRequired, decoderInitializationException2.codecInfo, decoderInitializationException2.diagnosticInfo);
                }
                if (arrayDeque.isEmpty()) {
                    throw this.preferredDecoderInitializationException;
                }
            }
        }
        this.availableCodecInfos = null;
    }

    public boolean maybeInitializeProcessingPipeline(Format format2) {
        return true;
    }

    public abstract void onCodecError(Exception exc);

    public abstract void onCodecInitialized(long j, long j2, String str);

    public abstract void onCodecParametersChanged(CodecParameters codecParameters);

    public abstract void onCodecReleased(String str);

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onDisabled() {
        this.inputFormat = null;
        setOutputStreamInfo(OutputStreamInfo.UNSET);
        this.pendingOutputStreamChanges.clear();
        if (this.bypassEnabled) {
            this.bypassEnabled = false;
            resetBypassState();
        } else {
            if (this.codec == null) {
                return;
            }
            if (shouldReleaseCodecInsteadOfFlushing()) {
                releaseCodec();
            } else if (shouldFlushCodec()) {
                flushCodec();
            } else {
                this.hasSkippedFlushAndWaitingForQueueInputBuffer = true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0066, code lost:
    
        if (java.util.Objects.equals(r2, "video/av01") == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DecoderReuseEvaluation onInputFormatChanged(AndroidSvg androidSvg) {
        Format format2;
        int i;
        Pair codecProfileAndLevel;
        String str;
        this.waitingForFirstSampleInFormat = true;
        Format format3 = (Format) androidSvg.renderOptions;
        format3.getClass();
        String str2 = format3.sampleMimeType;
        if (str2 == null) {
            throw createRendererException(new IllegalArgumentException("Sample MIME type is null."), format3, false, 4005);
        }
        if (!str2.equals("video/av01") && !str2.equals("video/x-vnd.on2.vp9")) {
            if (str2.equals("video/dolby-vision")) {
                byte[] bArr = CodecSpecificDataUtil.NAL_START_CODE;
                if (str2.equals("video/dolby-vision") && (codecProfileAndLevel = CodecSpecificDataUtil.getCodecProfileAndLevel(format3)) != null) {
                    int intValue = ((Integer) codecProfileAndLevel.first).intValue();
                    if (intValue == 16 || intValue == 32 || intValue == 256) {
                        str = "video/hevc";
                    } else if (intValue == 512) {
                        str = "video/avc";
                    } else if (intValue == 1024) {
                        str = "video/av01";
                    }
                }
                str = null;
            }
            format2 = format3;
            Toolbar.AnonymousClass1 anonymousClass1 = (Toolbar.AnonymousClass1) androidSvg.svg;
            Toolbar.AnonymousClass1 anonymousClass12 = this.sourceDrmSession;
            this.sourceDrmSession = anonymousClass1;
            this.inputFormat = format2;
            if (this.bypassEnabled) {
                this.bypassDrainAndReinitialize = true;
                return null;
            }
            MediaCodecAdapter mediaCodecAdapter = this.codec;
            if (mediaCodecAdapter == null) {
                this.availableCodecInfos = null;
                maybeInitCodecOrBypass();
                return null;
            }
            MediaCodecInfo mediaCodecInfo = this.codecInfo;
            mediaCodecInfo.getClass();
            Format format4 = this.codecInputFormat;
            format4.getClass();
            if (this.codecDrmSession != this.sourceDrmSession) {
                if (this.codecReceivedBuffers) {
                    this.codecDrainState = 1;
                    this.codecDrainAction = 3;
                } else {
                    releaseCodec();
                    maybeInitCodecOrBypass();
                }
                return new DecoderReuseEvaluation(mediaCodecInfo.name, format4, format2, 0, 128);
            }
            boolean z = this.sourceDrmSession != this.codecDrmSession;
            DecoderReuseEvaluation canReuseCodec = canReuseCodec(mediaCodecInfo, format4, format2, getLastOutputStreamInfo().queuedBufferAfterReset);
            int i2 = canReuseCodec.result;
            if (i2 != 0) {
                if (i2 == 1) {
                    if (updateCodecOperatingRate(format2)) {
                        this.codecInputFormat = format2;
                        if (z) {
                            drainAndUpdateCodecDrmSession();
                        } else if (this.codecReceivedBuffers) {
                            this.codecDrainState = 1;
                            this.codecDrainAction = 1;
                        }
                    }
                    i = 16;
                } else if (i2 == 2) {
                    if (updateCodecOperatingRate(format2)) {
                        this.codecReconfigured = true;
                        this.codecReconfigurationState = 1;
                        this.codecNeedsAdaptationWorkaroundBuffer = false;
                        this.codecInputFormat = format2;
                        if (z) {
                            drainAndUpdateCodecDrmSession();
                        }
                    }
                    i = 16;
                } else {
                    if (i2 != 3) {
                        Path$$ExternalSyntheticBUOutline0.m();
                        return null;
                    }
                    if (updateCodecOperatingRate(format2)) {
                        this.codecInputFormat = format2;
                        if (z) {
                            drainAndUpdateCodecDrmSession();
                        }
                    }
                    i = 16;
                }
                return (i2 != 0 || (this.codec == mediaCodecAdapter && this.codecDrainAction != 3)) ? canReuseCodec : new DecoderReuseEvaluation(mediaCodecInfo.name, format4, format2, 0, i);
            }
            if (this.codecReceivedBuffers) {
                this.codecDrainState = 1;
                this.codecDrainAction = 3;
            } else {
                releaseCodec();
                maybeInitCodecOrBypass();
            }
            i = 0;
            if (i2 != 0) {
            }
        }
        if (!format3.initializationData.isEmpty()) {
            Format.Builder buildUpon = format3.buildUpon();
            buildUpon.initializationData = null;
            format2 = new Format(buildUpon);
            Toolbar.AnonymousClass1 anonymousClass13 = (Toolbar.AnonymousClass1) androidSvg.svg;
            Toolbar.AnonymousClass1 anonymousClass122 = this.sourceDrmSession;
            this.sourceDrmSession = anonymousClass13;
            this.inputFormat = format2;
            if (this.bypassEnabled) {
            }
        }
        format2 = format3;
        Toolbar.AnonymousClass1 anonymousClass132 = (Toolbar.AnonymousClass1) androidSvg.svg;
        Toolbar.AnonymousClass1 anonymousClass1222 = this.sourceDrmSession;
        this.sourceDrmSession = anonymousClass132;
        this.inputFormat = format2;
        if (this.bypassEnabled) {
        }
    }

    public abstract void onOutputFormatChanged(Format format2, MediaFormat mediaFormat);

    public void onOutputStreamOffsetUsChanged() {
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onPositionReset(long j, boolean z, boolean z2) {
        ArrayDeque arrayDeque = this.pendingOutputStreamChanges;
        if (!arrayDeque.isEmpty()) {
            this.outputStreamInfo = (OutputStreamInfo) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z2) {
            this.inputStreamEnded = false;
            this.outputStreamEnded = false;
            this.pendingOutputEndOfStream = false;
            if (this.bypassEnabled) {
                resetBypassState();
            } else if (this.codec != null) {
                if (shouldReleaseCodecInsteadOfFlushing()) {
                    releaseCodec();
                    maybeInitCodecOrBypass();
                } else if (shouldFlushCodec()) {
                    flushCodec();
                } else {
                    this.hasSkippedFlushAndWaitingForQueueInputBuffer = true;
                }
            }
            if (this.outputStreamInfo.formatQueue.size() > 0) {
                this.waitingForFirstSampleInFormat = true;
            }
            this.outputStreamInfo.formatQueue.clear();
            this.outputStreamInfo.queuedBufferAfterReset = false;
        }
    }

    public void onProcessedOutputBuffer$1(long j) {
        this.lastProcessedOutputBufferTimeUs = j;
        while (true) {
            ArrayDeque arrayDeque = this.pendingOutputStreamChanges;
            if (arrayDeque.isEmpty() || j < ((OutputStreamInfo) arrayDeque.peek()).previousStreamLastBufferTimeUs) {
                return;
            }
            OutputStreamInfo outputStreamInfo = (OutputStreamInfo) arrayDeque.poll();
            outputStreamInfo.getClass();
            setOutputStreamInfo(outputStreamInfo);
            onProcessedStreamChange();
        }
    }

    public abstract void onProcessedStreamChange();

    public void onQueueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // androidx.media3.exoplayer.BaseRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onStreamChanged(Format[] formatArr, long j, long j2, MediaSource$MediaPeriodId mediaSource$MediaPeriodId) {
        if (this.outputStreamInfo.streamOffsetUs == -9223372036854775807L) {
            setOutputStreamInfo(new OutputStreamInfo(-9223372036854775807L, j, j2));
            if (this.experimentalEnableProcessedStreamChangedAtStart) {
                onProcessedStreamChange();
                return;
            }
            return;
        }
        ArrayDeque arrayDeque = this.pendingOutputStreamChanges;
        if (arrayDeque.isEmpty()) {
            long j3 = this.largestQueuedPresentationTimeUs;
            if (j3 != -9223372036854775807L) {
                long j4 = this.lastProcessedOutputBufferTimeUs;
                if (j4 != -9223372036854775807L) {
                }
            }
            setOutputStreamInfo(new OutputStreamInfo(-9223372036854775807L, j, j2));
            if (this.outputStreamInfo.streamOffsetUs != -9223372036854775807L) {
                onProcessedStreamChange();
                return;
            }
            return;
        }
        arrayDeque.add(new OutputStreamInfo(this.largestQueuedPresentationTimeUs, j, j2));
    }

    public final void processEndOfStream() {
        int i = this.codecDrainAction;
        if (i == 1) {
            flushCodec();
            return;
        }
        if (i == 2) {
            flushCodec();
            updateDrmSession();
        } else if (i != 3) {
            this.outputStreamEnded = true;
            renderToEndOfStream();
        } else {
            releaseCodec();
            maybeInitCodecOrBypass();
        }
    }

    public abstract boolean processOutputBuffer(long j, long j2, MediaCodecAdapter mediaCodecAdapter, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, Format format2);

    public final boolean readSourceOmittingSampleData(int i) {
        AndroidSvg androidSvg = this.formatHolder;
        androidSvg.clear();
        DecoderInputBuffer decoderInputBuffer = this.noDataBuffer;
        decoderInputBuffer.clear();
        int readSource = readSource(androidSvg, decoderInputBuffer, i | 4);
        if (readSource == -5) {
            onInputFormatChanged(androidSvg);
            return true;
        }
        if (readSource != -4 || !decoderInputBuffer.getFlag(4)) {
            return false;
        }
        this.inputStreamEnded = true;
        processEndOfStream();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void releaseCodec() {
        try {
            MediaCodecAdapter mediaCodecAdapter = this.codec;
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.release();
                this.decoderCounters.decoderReleaseCount++;
                MediaCodecInfo mediaCodecInfo = this.codecInfo;
                mediaCodecInfo.getClass();
                onCodecReleased(mediaCodecInfo.name);
            }
            this.codec = null;
            try {
                MediaCrypto mediaCrypto = this.mediaCrypto;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.codec = null;
            try {
                MediaCrypto mediaCrypto2 = this.mediaCrypto;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0078 A[LOOP:1: B:33:0x0053->B:42:0x0078, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079 A[EDGE_INSN: B:43:0x0079->B:44:? BREAK  A[LOOP:1: B:33:0x0053->B:42:0x0078], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099 A[LOOP:2: B:45:0x0079->B:54:0x0099, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a A[EDGE_INSN: B:55:0x009a->B:56:0x009a BREAK  A[LOOP:2: B:45:0x0079->B:54:0x0099], SYNTHETIC] */
    @Override // androidx.media3.exoplayer.BaseRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void render(long j, long j2) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (this.pendingOutputEndOfStream) {
            this.pendingOutputEndOfStream = false;
            processEndOfStream();
        }
        ExoPlaybackException exoPlaybackException = this.pendingPlaybackException;
        if (exoPlaybackException != null) {
            this.pendingPlaybackException = null;
            throw exoPlaybackException;
        }
        try {
            if (this.outputStreamEnded) {
                renderToEndOfStream();
                return;
            }
            if (this.inputFormat != null || readSourceOmittingSampleData(2)) {
                maybeInitCodecOrBypass();
                if (this.bypassEnabled) {
                    android.os.Trace.beginSection("bypassRender");
                    while (bypassRender(j, j2)) {
                    }
                    android.os.Trace.endSection();
                } else if (this.codec != null) {
                    this.clock.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    android.os.Trace.beginSection("drainAndFeed");
                    while (drainOutputBuffer(j, j2)) {
                        long j3 = this.renderTimeLimitMs;
                        if (j3 != -9223372036854775807L) {
                            this.clock.getClass();
                            if (SystemClock.elapsedRealtime() - elapsedRealtime >= j3) {
                                z2 = false;
                                if (z2) {
                                    break;
                                }
                            }
                        }
                        z2 = true;
                        if (z2) {
                        }
                    }
                    while (feedInputBuffer()) {
                        long j4 = this.renderTimeLimitMs;
                        if (j4 != -9223372036854775807L) {
                            this.clock.getClass();
                            if (SystemClock.elapsedRealtime() - elapsedRealtime >= j4) {
                                z = false;
                                if (z) {
                                    break;
                                }
                            }
                        }
                        z = true;
                        if (z) {
                        }
                    }
                    android.os.Trace.endSection();
                } else {
                    DecoderCounters decoderCounters = this.decoderCounters;
                    int i = decoderCounters.skippedInputBufferCount;
                    SampleStream sampleStream = this.stream;
                    sampleStream.getClass();
                    decoderCounters.skippedInputBufferCount = i + sampleStream.skipData(j - this.streamOffsetUs);
                    readSourceOmittingSampleData(1);
                }
                synchronized (this.decoderCounters) {
                }
            }
        } catch (MediaCodec.CryptoException e) {
            throw createRendererException(e, this.inputFormat, false, Util.getErrorCodeForMediaDrmErrorCode(e.getErrorCode()));
        } catch (IllegalStateException e2) {
            boolean z4 = e2 instanceof MediaCodec.CodecException;
            if (!z4) {
                StackTraceElement[] stackTrace = e2.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e2;
                }
            }
            onCodecError(e2);
            if (z4 && ((MediaCodec.CodecException) e2).isRecoverable()) {
                z3 = true;
            }
            if (z3) {
                releaseCodec();
            }
            MediaCodecDecoderException createDecoderException = createDecoderException(e2, this.codecInfo);
            throw createRendererException(createDecoderException, this.inputFormat, z3, createDecoderException.errorCode == 1101 ? 4006 : 4003);
        }
    }

    public abstract void renderToEndOfStream();

    public final void resetBypassState() {
        this.largestQueuedPresentationTimeUs = -9223372036854775807L;
        getLastOutputStreamInfo().lastBufferTimeUs = -9223372036854775807L;
        this.lastProcessedOutputBufferTimeUs = -9223372036854775807L;
        this.bypassDrainAndReinitialize = false;
        this.bypassBatchBuffer.clear();
        this.bypassSampleBuffer.clear();
        this.bypassSampleBufferPending = false;
        OggOpusAudioPacketizer oggOpusAudioPacketizer = this.oggOpusAudioPacketizer;
        oggOpusAudioPacketizer.getClass();
        oggOpusAudioPacketizer.outputBuffer = AudioProcessor.EMPTY_BUFFER;
        oggOpusAudioPacketizer.granulePosition = 0;
        oggOpusAudioPacketizer.pageSequenceNumber = 2;
    }

    public void resetCodecStateForFlush() {
        this.inputIndex = -1;
        this.buffer.data = null;
        this.outputIndex = -1;
        this.outputBuffer = null;
        this.largestQueuedPresentationTimeUs = -9223372036854775807L;
        getLastOutputStreamInfo().lastBufferTimeUs = -9223372036854775807L;
        this.lastProcessedOutputBufferTimeUs = -9223372036854775807L;
        this.codecHotswapDeadlineMs = -9223372036854775807L;
        this.codecReceivedEos = false;
        this.lastOutputBufferProcessedRealtimeMs = -9223372036854775807L;
        this.codecReceivedBuffers = false;
        this.codecNeedsAdaptationWorkaroundBuffer = false;
        this.shouldSkipAdaptationWorkaroundOutputBuffer = false;
        this.isLastOutputBuffer = false;
        this.codecDrainState = 0;
        this.codecDrainAction = 0;
        this.codecReconfigurationState = this.codecReconfigured ? 1 : 0;
        this.hasSkippedFlushAndWaitingForQueueInputBuffer = false;
        this.skippedFlushOffsetUs = 0L;
    }

    public final void resetCodecStateForRelease() {
        resetCodecStateForFlush();
        this.pendingPlaybackException = null;
        this.availableCodecInfos = null;
        this.codecInfo = null;
        this.codecInputFormat = null;
        this.codecOutputMediaFormat = null;
        this.codecOutputMediaFormatChanged = false;
        this.codecHasOutputMediaFormat = false;
        this.codecOperatingRate = -1.0f;
        this.codecNeedsSosFlushWorkaround = false;
        this.codecNeedsEosPropagation = false;
        this.codecRegisteredOnBufferAvailableListener = false;
        this.codecReconfigured = false;
        this.codecReconfigurationState = 0;
    }

    public final void setCodecDrmSession(Toolbar.AnonymousClass1 anonymousClass1) {
        Toolbar.AnonymousClass1 anonymousClass12 = this.codecDrmSession;
        this.codecDrmSession = anonymousClass1;
    }

    public final void setOutputStreamInfo(OutputStreamInfo outputStreamInfo) {
        this.outputStreamInfo = outputStreamInfo;
        if (outputStreamInfo.streamOffsetUs != -9223372036854775807L) {
            this.needToNotifyOutputFormatChangeAfterStreamChange = true;
            onOutputStreamOffsetUsChanged();
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void setPlaybackSpeed(float f, float f2) {
        this.currentPlaybackSpeed = f;
        this.targetPlaybackSpeed = f2;
        updateCodecOperatingRate(this.codecInputFormat);
    }

    public boolean shouldDiscardDecoderInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        return false;
    }

    public boolean shouldFlushCodec() {
        return true;
    }

    public boolean shouldInitCodec(MediaCodecInfo mediaCodecInfo) {
        return true;
    }

    public boolean shouldReleaseCodecInsteadOfFlushing() {
        int i = this.codecDrainAction;
        if (i == 3 || (this.codecNeedsSosFlushWorkaround && !this.codecHasOutputMediaFormat)) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        try {
            updateDrmSession();
            return false;
        } catch (ExoPlaybackException e) {
            Log.w("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    public boolean shouldUseBypass(Format format2) {
        return false;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final int supportsFormat(Format format2) {
        try {
            return supportsFormat(this.mediaCodecSelector, format2);
        } catch (MediaCodecUtil.DecoderQueryException e) {
            throw this.createRendererException(e, format2, false, 4002);
        }
    }

    public abstract int supportsFormat(LoudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0 loudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0, Format format2);

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    public final boolean updateCodecOperatingRate(Format format2) {
        if (this.codec != null && this.codecDrainAction != 3 && this.state != 0) {
            float f = this.targetPlaybackSpeed;
            format2.getClass();
            Format[] formatArr = this.streamFormats;
            formatArr.getClass();
            float codecOperatingRateV23 = getCodecOperatingRateV23(f, format2, formatArr);
            float f2 = this.codecOperatingRate;
            if (f2 != codecOperatingRateV23) {
                if (codecOperatingRateV23 == -1.0f) {
                    if (this.codecReceivedBuffers) {
                        this.codecDrainState = 1;
                        this.codecDrainAction = 3;
                        return false;
                    }
                    releaseCodec();
                    maybeInitCodecOrBypass();
                    return false;
                }
                if (f2 != -1.0f || codecOperatingRateV23 > this.assumedMinimumCodecOperatingRate) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", codecOperatingRateV23);
                    MediaCodecAdapter mediaCodecAdapter = this.codec;
                    mediaCodecAdapter.getClass();
                    mediaCodecAdapter.setParameters(bundle);
                    this.codecOperatingRate = codecOperatingRateV23;
                }
            }
        }
        return true;
    }

    public final void updateDrmSession() {
        Toolbar.AnonymousClass1 anonymousClass1 = this.sourceDrmSession;
        anonymousClass1.getClass();
        anonymousClass1.getCryptoConfig();
        setCodecDrmSession(this.sourceDrmSession);
        this.codecDrainState = 0;
        this.codecDrainAction = 0;
    }

    public final void updateOutputFormatForTime(long j) {
        Format format2 = (Format) this.outputStreamInfo.formatQueue.pollFloor(j);
        if (format2 == null && this.needToNotifyOutputFormatChangeAfterStreamChange && this.codecOutputMediaFormat != null) {
            format2 = (Format) this.outputStreamInfo.formatQueue.pollFirst();
        }
        if (format2 != null) {
            this.outputFormat = format2;
        } else if (!this.codecOutputMediaFormatChanged || this.outputFormat == null) {
            return;
        }
        Format format3 = this.outputFormat;
        format3.getClass();
        onOutputFormatChanged(format3, this.codecOutputMediaFormat);
        this.codecOutputMediaFormatChanged = false;
        this.needToNotifyOutputFormatChangeAfterStreamChange = false;
    }

    public long getDurationToProgressUs(boolean z, long j, long j2) {
        return super.getDurationToProgressUs(j, j2);
    }

    public final class DecoderInitializationException extends Exception {
        public final MediaCodecInfo codecInfo;
        public final String diagnosticInfo;
        public final String mimeType;
        public final boolean secureDecoderRequired;

        public DecoderInitializationException(Format format2, MediaCodecUtil.DecoderQueryException decoderQueryException, boolean z, int i) {
            this("Decoder init failed: [" + i + "], " + format2, decoderQueryException, format2.sampleMimeType, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
        }

        public DecoderInitializationException(String str, Throwable th, String str2, boolean z, MediaCodecInfo mediaCodecInfo, String str3) {
            super(str, th);
            this.mimeType = str2;
            this.secureDecoderRequired = z;
            this.codecInfo = mediaCodecInfo;
            this.diagnosticInfo = str3;
        }
    }
}
