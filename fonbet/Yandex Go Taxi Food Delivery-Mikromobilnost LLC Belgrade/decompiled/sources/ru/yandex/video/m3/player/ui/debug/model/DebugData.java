package ru.yandex.video.m3.player.ui.debug.model;

import defpackage.jl40;
import defpackage.l8v;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\bf\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010%\u001a\u00020$\u0012\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010&\u0012\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010&\u0012\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010&\u0012\b\b\u0002\u0010*\u001a\u00020\u001e\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\b\b\u0002\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b?\u0010>J\u0012\u0010@\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bD\u00102J\u0012\u0010E\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0012\u0010I\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bK\u0010LJ\u0012\u0010M\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bM\u0010NJ\u0012\u0010O\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\bO\u0010PJ\u0012\u0010Q\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bQ\u00102J\u0012\u0010R\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bR\u00102J\u0010\u0010S\u001a\u00020$HÆ\u0003¢\u0006\u0004\bS\u0010TJ\u0018\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010&HÆ\u0003¢\u0006\u0004\bU\u0010VJ\u0018\u0010W\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010&HÆ\u0003¢\u0006\u0004\bW\u0010VJ\u0018\u0010X\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010&HÆ\u0003¢\u0006\u0004\bX\u0010VJ\u0010\u0010Y\u001a\u00020\u001eHÆ\u0003¢\u0006\u0004\bY\u0010ZJ\u0012\u0010[\u001a\u0004\u0018\u00010+HÆ\u0003¢\u0006\u0004\b[\u0010\\J\u0010\u0010]\u001a\u00020-HÆ\u0003¢\u0006\u0004\b]\u0010^JÒ\u0002\u0010_\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010%\u001a\u00020$2\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010&2\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010&2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010&2\b\b\u0002\u0010*\u001a\u00020\u001e2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\b\b\u0002\u0010.\u001a\u00020-HÆ\u0001¢\u0006\u0004\b_\u0010`J\u0010\u0010a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\ba\u00102J\u0010\u0010b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\bb\u0010CJ\u001a\u0010d\u001a\u00020-2\b\u0010c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bd\u0010eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010f\u001a\u0004\bg\u00102R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010h\u001a\u0004\bi\u00104R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010j\u001a\u0004\bk\u00106R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010l\u001a\u0004\bm\u00108R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010n\u001a\u0004\bo\u0010:R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010p\u001a\u0004\bq\u0010<R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010r\u001a\u0004\bs\u0010>R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010r\u001a\u0004\bt\u0010>R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010u\u001a\u0004\bv\u0010AR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010w\u001a\u0004\bx\u0010CR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010f\u001a\u0004\by\u00102R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010z\u001a\u0004\b{\u0010FR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010|\u001a\u0004\b}\u0010HR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010~\u001a\u0004\b\u007f\u0010JR\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\u000e\n\u0005\b\u001d\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010LR\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\u000e\n\u0005\b\u001f\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010NR\u001b\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\u000e\n\u0005\b!\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010PR\u001a\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\"\u0010f\u001a\u0005\b\u0086\u0001\u00102R\u001a\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b#\u0010f\u001a\u0005\b\u0087\u0001\u00102R\u0019\u0010%\u001a\u00020$8\u0006¢\u0006\u000e\n\u0005\b%\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010TR!\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010&8\u0006¢\u0006\u000e\n\u0005\b'\u0010\u008a\u0001\u001a\u0005\b\u008b\u0001\u0010VR!\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010&8\u0006¢\u0006\u000e\n\u0005\b(\u0010\u008a\u0001\u001a\u0005\b\u008c\u0001\u0010VR!\u0010)\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010&8\u0006¢\u0006\u000e\n\u0005\b)\u0010\u008a\u0001\u001a\u0005\b\u008d\u0001\u0010VR\u0019\u0010*\u001a\u00020\u001e8\u0006¢\u0006\u000e\n\u0005\b*\u0010\u008e\u0001\u001a\u0005\b\u008f\u0001\u0010ZR\u001b\u0010,\u001a\u0004\u0018\u00010+8\u0006¢\u0006\u000e\n\u0005\b,\u0010\u0090\u0001\u001a\u0005\b\u0091\u0001\u0010\\R\u0018\u0010.\u001a\u00020-8\u0006¢\u0006\r\n\u0005\b.\u0010\u0092\u0001\u001a\u0004\b.\u0010^¨\u0006\u0093\u0001"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/model/DebugData;", "", "", "vsid", "Lru/yandex/video/m3/player/ui/debug/model/ContentData;", "contentData", "Lru/yandex/video/m3/player/ui/debug/model/VideoTrackData;", "videoTrackData", "Lru/yandex/video/m3/player/ui/debug/model/AudioTrackData;", "audioTrackData", "Lru/yandex/video/m3/player/ui/debug/model/SubtitlesTrackData;", "subtitlesTrackData", "Lru/yandex/video/m3/player/ui/debug/model/Size;", "viewPortSize", "Lru/yandex/video/m3/player/ui/debug/model/DecoderData;", "videoDecoderData", "audioDecoderData", "Lru/yandex/video/m3/player/ui/debug/model/DrmMode;", "drmMode", "", "droppedFrames", "networkTypeName", "Lru/yandex/video/m3/player/ui/debug/model/BandwidthEstimation;", "lastBandwidthEstimation", "Lru/yandex/video/m3/player/ui/debug/model/LoadedChunk;", "lastLoadedChunk", "Lru/yandex/video/m3/player/ui/debug/model/BytesLoaded;", "bytesLoaded", "Lru/yandex/video/m3/player/ui/debug/model/BufferSize;", "currentBufferSize", "", "targetBufferSize", "Lru/yandex/video/m3/player/ui/debug/model/LatencyData;", "latencyData", "lastError", "dateTime", "Lru/yandex/video/m3/player/ui/debug/model/SessionColor;", "sessionColor", "", "bandwidthEstimationsHistory", "loadedChunksHistory", "bufferSizeHistory", "ts", "Ll8v;", "vsidBitmap", "", "isCompact", "<init>", "(Ljava/lang/String;Lru/yandex/video/m3/player/ui/debug/model/ContentData;Lru/yandex/video/m3/player/ui/debug/model/VideoTrackData;Lru/yandex/video/m3/player/ui/debug/model/AudioTrackData;Lru/yandex/video/m3/player/ui/debug/model/SubtitlesTrackData;Lru/yandex/video/m3/player/ui/debug/model/Size;Lru/yandex/video/m3/player/ui/debug/model/DecoderData;Lru/yandex/video/m3/player/ui/debug/model/DecoderData;Lru/yandex/video/m3/player/ui/debug/model/DrmMode;ILjava/lang/String;Lru/yandex/video/m3/player/ui/debug/model/BandwidthEstimation;Lru/yandex/video/m3/player/ui/debug/model/LoadedChunk;Lru/yandex/video/m3/player/ui/debug/model/BytesLoaded;Lru/yandex/video/m3/player/ui/debug/model/BufferSize;Ljava/lang/Long;Lru/yandex/video/m3/player/ui/debug/model/LatencyData;Ljava/lang/String;Ljava/lang/String;Lru/yandex/video/m3/player/ui/debug/model/SessionColor;Ljava/util/List;Ljava/util/List;Ljava/util/List;JLl8v;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Lru/yandex/video/m3/player/ui/debug/model/ContentData;", "component3", "()Lru/yandex/video/m3/player/ui/debug/model/VideoTrackData;", "component4", "()Lru/yandex/video/m3/player/ui/debug/model/AudioTrackData;", "component5", "()Lru/yandex/video/m3/player/ui/debug/model/SubtitlesTrackData;", "component6", "()Lru/yandex/video/m3/player/ui/debug/model/Size;", "component7", "()Lru/yandex/video/m3/player/ui/debug/model/DecoderData;", "component8", "component9", "()Lru/yandex/video/m3/player/ui/debug/model/DrmMode;", "component10", "()I", "component11", "component12", "()Lru/yandex/video/m3/player/ui/debug/model/BandwidthEstimation;", "component13", "()Lru/yandex/video/m3/player/ui/debug/model/LoadedChunk;", "component14", "()Lru/yandex/video/m3/player/ui/debug/model/BytesLoaded;", "component15", "()Lru/yandex/video/m3/player/ui/debug/model/BufferSize;", "component16", "()Ljava/lang/Long;", "component17", "()Lru/yandex/video/m3/player/ui/debug/model/LatencyData;", "component18", "component19", "component20", "()Lru/yandex/video/m3/player/ui/debug/model/SessionColor;", "component21", "()Ljava/util/List;", "component22", "component23", "component24", "()J", "component25", "()Ll8v;", "component26", "()Z", "copy", "(Ljava/lang/String;Lru/yandex/video/m3/player/ui/debug/model/ContentData;Lru/yandex/video/m3/player/ui/debug/model/VideoTrackData;Lru/yandex/video/m3/player/ui/debug/model/AudioTrackData;Lru/yandex/video/m3/player/ui/debug/model/SubtitlesTrackData;Lru/yandex/video/m3/player/ui/debug/model/Size;Lru/yandex/video/m3/player/ui/debug/model/DecoderData;Lru/yandex/video/m3/player/ui/debug/model/DecoderData;Lru/yandex/video/m3/player/ui/debug/model/DrmMode;ILjava/lang/String;Lru/yandex/video/m3/player/ui/debug/model/BandwidthEstimation;Lru/yandex/video/m3/player/ui/debug/model/LoadedChunk;Lru/yandex/video/m3/player/ui/debug/model/BytesLoaded;Lru/yandex/video/m3/player/ui/debug/model/BufferSize;Ljava/lang/Long;Lru/yandex/video/m3/player/ui/debug/model/LatencyData;Ljava/lang/String;Ljava/lang/String;Lru/yandex/video/m3/player/ui/debug/model/SessionColor;Ljava/util/List;Ljava/util/List;Ljava/util/List;JLl8v;Z)Lru/yandex/video/m3/player/ui/debug/model/DebugData;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVsid", "Lru/yandex/video/m3/player/ui/debug/model/ContentData;", "getContentData", "Lru/yandex/video/m3/player/ui/debug/model/VideoTrackData;", "getVideoTrackData", "Lru/yandex/video/m3/player/ui/debug/model/AudioTrackData;", "getAudioTrackData", "Lru/yandex/video/m3/player/ui/debug/model/SubtitlesTrackData;", "getSubtitlesTrackData", "Lru/yandex/video/m3/player/ui/debug/model/Size;", "getViewPortSize", "Lru/yandex/video/m3/player/ui/debug/model/DecoderData;", "getVideoDecoderData", "getAudioDecoderData", "Lru/yandex/video/m3/player/ui/debug/model/DrmMode;", "getDrmMode", CA20Status.STATUS_USER_I, "getDroppedFrames", "getNetworkTypeName", "Lru/yandex/video/m3/player/ui/debug/model/BandwidthEstimation;", "getLastBandwidthEstimation", "Lru/yandex/video/m3/player/ui/debug/model/LoadedChunk;", "getLastLoadedChunk", "Lru/yandex/video/m3/player/ui/debug/model/BytesLoaded;", "getBytesLoaded", "Lru/yandex/video/m3/player/ui/debug/model/BufferSize;", "getCurrentBufferSize", "Ljava/lang/Long;", "getTargetBufferSize", "Lru/yandex/video/m3/player/ui/debug/model/LatencyData;", "getLatencyData", "getLastError", "getDateTime", "Lru/yandex/video/m3/player/ui/debug/model/SessionColor;", "getSessionColor", "Ljava/util/List;", "getBandwidthEstimationsHistory", "getLoadedChunksHistory", "getBufferSizeHistory", "J", "getTs", "Ll8v;", "getVsidBitmap", "Z", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DebugData {
    public static final int $stable = 8;
    private final DecoderData audioDecoderData;
    private final AudioTrackData audioTrackData;
    private final List<BandwidthEstimation> bandwidthEstimationsHistory;
    private final List<BufferSize> bufferSizeHistory;
    private final BytesLoaded bytesLoaded;
    private final ContentData contentData;
    private final BufferSize currentBufferSize;
    private final String dateTime;
    private final DrmMode drmMode;
    private final int droppedFrames;
    private final boolean isCompact;
    private final BandwidthEstimation lastBandwidthEstimation;
    private final String lastError;
    private final LoadedChunk lastLoadedChunk;
    private final LatencyData latencyData;
    private final List<LoadedChunk> loadedChunksHistory;
    private final String networkTypeName;
    private final SessionColor sessionColor;
    private final SubtitlesTrackData subtitlesTrackData;
    private final Long targetBufferSize;
    private final long ts;
    private final DecoderData videoDecoderData;
    private final VideoTrackData videoTrackData;
    private final Size viewPortSize;
    private final String vsid;
    private final l8v vsidBitmap;

    public /* synthetic */ DebugData(String str, ContentData contentData, VideoTrackData videoTrackData, AudioTrackData audioTrackData, SubtitlesTrackData subtitlesTrackData, Size size, DecoderData decoderData, DecoderData decoderData2, DrmMode drmMode, int i, String str2, BandwidthEstimation bandwidthEstimation, LoadedChunk loadedChunk, BytesLoaded bytesLoaded, BufferSize bufferSize, Long l, LatencyData latencyData, String str3, String str4, SessionColor sessionColor, List list, List list2, List list3, long j, l8v l8vVar, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : contentData, (i2 & 4) != 0 ? null : videoTrackData, (i2 & 8) != 0 ? null : audioTrackData, (i2 & 16) != 0 ? null : subtitlesTrackData, (i2 & 32) != 0 ? null : size, (i2 & 64) != 0 ? null : decoderData, (i2 & 128) != 0 ? null : decoderData2, (i2 & 256) != 0 ? null : drmMode, (i2 & 512) != 0 ? 0 : i, (i2 & 1024) != 0 ? null : str2, (i2 & 2048) != 0 ? null : bandwidthEstimation, (i2 & 4096) != 0 ? null : loadedChunk, (i2 & 8192) != 0 ? null : bytesLoaded, (i2 & 16384) != 0 ? null : bufferSize, (i2 & 32768) != 0 ? null : l, (i2 & 65536) != 0 ? null : latencyData, (i2 & 131072) != 0 ? null : str3, (i2 & 262144) != 0 ? null : str4, (i2 & 524288) != 0 ? SessionColor.NONE : sessionColor, (i2 & 1048576) != 0 ? null : list, (i2 & 2097152) != 0 ? null : list2, (i2 & SelfTester_JCP.ENCRYPT_CBC) != 0 ? null : list3, (i2 & SelfTester_JCP.ENCRYPT_CNT) != 0 ? System.currentTimeMillis() : j, (i2 & 16777216) != 0 ? null : l8vVar, (i2 & SelfTester_JCP.DECRYPT_CFB) != 0 ? false : z);
    }

    public static /* synthetic */ DebugData copy$default(DebugData debugData, String str, ContentData contentData, VideoTrackData videoTrackData, AudioTrackData audioTrackData, SubtitlesTrackData subtitlesTrackData, Size size, DecoderData decoderData, DecoderData decoderData2, DrmMode drmMode, int i, String str2, BandwidthEstimation bandwidthEstimation, LoadedChunk loadedChunk, BytesLoaded bytesLoaded, BufferSize bufferSize, Long l, LatencyData latencyData, String str3, String str4, SessionColor sessionColor, List list, List list2, List list3, long j, l8v l8vVar, boolean z, int i2, Object obj) {
        String str5 = (i2 & 1) != 0 ? debugData.vsid : str;
        return debugData.copy(str5, (i2 & 2) != 0 ? debugData.contentData : contentData, (i2 & 4) != 0 ? debugData.videoTrackData : videoTrackData, (i2 & 8) != 0 ? debugData.audioTrackData : audioTrackData, (i2 & 16) != 0 ? debugData.subtitlesTrackData : subtitlesTrackData, (i2 & 32) != 0 ? debugData.viewPortSize : size, (i2 & 64) != 0 ? debugData.videoDecoderData : decoderData, (i2 & 128) != 0 ? debugData.audioDecoderData : decoderData2, (i2 & 256) != 0 ? debugData.drmMode : drmMode, (i2 & 512) != 0 ? debugData.droppedFrames : i, (i2 & 1024) != 0 ? debugData.networkTypeName : str2, (i2 & 2048) != 0 ? debugData.lastBandwidthEstimation : bandwidthEstimation, (i2 & 4096) != 0 ? debugData.lastLoadedChunk : loadedChunk, (i2 & 8192) != 0 ? debugData.bytesLoaded : bytesLoaded, (i2 & 16384) != 0 ? debugData.currentBufferSize : bufferSize, (i2 & 32768) != 0 ? debugData.targetBufferSize : l, (i2 & 65536) != 0 ? debugData.latencyData : latencyData, (i2 & 131072) != 0 ? debugData.lastError : str3, (i2 & 262144) != 0 ? debugData.dateTime : str4, (i2 & 524288) != 0 ? debugData.sessionColor : sessionColor, (i2 & 1048576) != 0 ? debugData.bandwidthEstimationsHistory : list, (i2 & 2097152) != 0 ? debugData.loadedChunksHistory : list2, (i2 & SelfTester_JCP.ENCRYPT_CBC) != 0 ? debugData.bufferSizeHistory : list3, (i2 & SelfTester_JCP.ENCRYPT_CNT) != 0 ? debugData.ts : j, (i2 & 16777216) != 0 ? debugData.vsidBitmap : l8vVar, (i2 & SelfTester_JCP.DECRYPT_CFB) != 0 ? debugData.isCompact : z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getVsid() {
        return this.vsid;
    }

    /* renamed from: component10, reason: from getter */
    public final int getDroppedFrames() {
        return this.droppedFrames;
    }

    /* renamed from: component11, reason: from getter */
    public final String getNetworkTypeName() {
        return this.networkTypeName;
    }

    /* renamed from: component12, reason: from getter */
    public final BandwidthEstimation getLastBandwidthEstimation() {
        return this.lastBandwidthEstimation;
    }

    /* renamed from: component13, reason: from getter */
    public final LoadedChunk getLastLoadedChunk() {
        return this.lastLoadedChunk;
    }

    /* renamed from: component14, reason: from getter */
    public final BytesLoaded getBytesLoaded() {
        return this.bytesLoaded;
    }

    /* renamed from: component15, reason: from getter */
    public final BufferSize getCurrentBufferSize() {
        return this.currentBufferSize;
    }

    /* renamed from: component16, reason: from getter */
    public final Long getTargetBufferSize() {
        return this.targetBufferSize;
    }

    /* renamed from: component17, reason: from getter */
    public final LatencyData getLatencyData() {
        return this.latencyData;
    }

    /* renamed from: component18, reason: from getter */
    public final String getLastError() {
        return this.lastError;
    }

    /* renamed from: component19, reason: from getter */
    public final String getDateTime() {
        return this.dateTime;
    }

    /* renamed from: component2, reason: from getter */
    public final ContentData getContentData() {
        return this.contentData;
    }

    /* renamed from: component20, reason: from getter */
    public final SessionColor getSessionColor() {
        return this.sessionColor;
    }

    public final List<BandwidthEstimation> component21() {
        return this.bandwidthEstimationsHistory;
    }

    public final List<LoadedChunk> component22() {
        return this.loadedChunksHistory;
    }

    public final List<BufferSize> component23() {
        return this.bufferSizeHistory;
    }

    /* renamed from: component24, reason: from getter */
    public final long getTs() {
        return this.ts;
    }

    /* renamed from: component25, reason: from getter */
    public final l8v getVsidBitmap() {
        return this.vsidBitmap;
    }

    /* renamed from: component26, reason: from getter */
    public final boolean getIsCompact() {
        return this.isCompact;
    }

    /* renamed from: component3, reason: from getter */
    public final VideoTrackData getVideoTrackData() {
        return this.videoTrackData;
    }

    /* renamed from: component4, reason: from getter */
    public final AudioTrackData getAudioTrackData() {
        return this.audioTrackData;
    }

    /* renamed from: component5, reason: from getter */
    public final SubtitlesTrackData getSubtitlesTrackData() {
        return this.subtitlesTrackData;
    }

    /* renamed from: component6, reason: from getter */
    public final Size getViewPortSize() {
        return this.viewPortSize;
    }

    /* renamed from: component7, reason: from getter */
    public final DecoderData getVideoDecoderData() {
        return this.videoDecoderData;
    }

    /* renamed from: component8, reason: from getter */
    public final DecoderData getAudioDecoderData() {
        return this.audioDecoderData;
    }

    /* renamed from: component9, reason: from getter */
    public final DrmMode getDrmMode() {
        return this.drmMode;
    }

    public final DebugData copy(String vsid, ContentData contentData, VideoTrackData videoTrackData, AudioTrackData audioTrackData, SubtitlesTrackData subtitlesTrackData, Size viewPortSize, DecoderData videoDecoderData, DecoderData audioDecoderData, DrmMode drmMode, int droppedFrames, String networkTypeName, BandwidthEstimation lastBandwidthEstimation, LoadedChunk lastLoadedChunk, BytesLoaded bytesLoaded, BufferSize currentBufferSize, Long targetBufferSize, LatencyData latencyData, String lastError, String dateTime, SessionColor sessionColor, List<BandwidthEstimation> bandwidthEstimationsHistory, List<LoadedChunk> loadedChunksHistory, List<BufferSize> bufferSizeHistory, long ts, l8v vsidBitmap, boolean isCompact) {
        return new DebugData(vsid, contentData, videoTrackData, audioTrackData, subtitlesTrackData, viewPortSize, videoDecoderData, audioDecoderData, drmMode, droppedFrames, networkTypeName, lastBandwidthEstimation, lastLoadedChunk, bytesLoaded, currentBufferSize, targetBufferSize, latencyData, lastError, dateTime, sessionColor, bandwidthEstimationsHistory, loadedChunksHistory, bufferSizeHistory, ts, vsidBitmap, isCompact);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DebugData)) {
            return false;
        }
        DebugData debugData = (DebugData) other;
        return jl40.l(this.vsid, debugData.vsid) && jl40.l(this.contentData, debugData.contentData) && jl40.l(this.videoTrackData, debugData.videoTrackData) && jl40.l(this.audioTrackData, debugData.audioTrackData) && jl40.l(this.subtitlesTrackData, debugData.subtitlesTrackData) && jl40.l(this.viewPortSize, debugData.viewPortSize) && jl40.l(this.videoDecoderData, debugData.videoDecoderData) && jl40.l(this.audioDecoderData, debugData.audioDecoderData) && this.drmMode == debugData.drmMode && this.droppedFrames == debugData.droppedFrames && jl40.l(this.networkTypeName, debugData.networkTypeName) && jl40.l(this.lastBandwidthEstimation, debugData.lastBandwidthEstimation) && jl40.l(this.lastLoadedChunk, debugData.lastLoadedChunk) && jl40.l(this.bytesLoaded, debugData.bytesLoaded) && jl40.l(this.currentBufferSize, debugData.currentBufferSize) && jl40.l(this.targetBufferSize, debugData.targetBufferSize) && jl40.l(this.latencyData, debugData.latencyData) && jl40.l(this.lastError, debugData.lastError) && jl40.l(this.dateTime, debugData.dateTime) && this.sessionColor == debugData.sessionColor && jl40.l(this.bandwidthEstimationsHistory, debugData.bandwidthEstimationsHistory) && jl40.l(this.loadedChunksHistory, debugData.loadedChunksHistory) && jl40.l(this.bufferSizeHistory, debugData.bufferSizeHistory) && this.ts == debugData.ts && jl40.l(this.vsidBitmap, debugData.vsidBitmap) && this.isCompact == debugData.isCompact;
    }

    public final DecoderData getAudioDecoderData() {
        return this.audioDecoderData;
    }

    public final AudioTrackData getAudioTrackData() {
        return this.audioTrackData;
    }

    public final List<BandwidthEstimation> getBandwidthEstimationsHistory() {
        return this.bandwidthEstimationsHistory;
    }

    public final List<BufferSize> getBufferSizeHistory() {
        return this.bufferSizeHistory;
    }

    public final BytesLoaded getBytesLoaded() {
        return this.bytesLoaded;
    }

    public final ContentData getContentData() {
        return this.contentData;
    }

    public final BufferSize getCurrentBufferSize() {
        return this.currentBufferSize;
    }

    public final String getDateTime() {
        return this.dateTime;
    }

    public final DrmMode getDrmMode() {
        return this.drmMode;
    }

    public final int getDroppedFrames() {
        return this.droppedFrames;
    }

    public final BandwidthEstimation getLastBandwidthEstimation() {
        return this.lastBandwidthEstimation;
    }

    public final String getLastError() {
        return this.lastError;
    }

    public final LoadedChunk getLastLoadedChunk() {
        return this.lastLoadedChunk;
    }

    public final LatencyData getLatencyData() {
        return this.latencyData;
    }

    public final List<LoadedChunk> getLoadedChunksHistory() {
        return this.loadedChunksHistory;
    }

    public final String getNetworkTypeName() {
        return this.networkTypeName;
    }

    public final SessionColor getSessionColor() {
        return this.sessionColor;
    }

    public final SubtitlesTrackData getSubtitlesTrackData() {
        return this.subtitlesTrackData;
    }

    public final Long getTargetBufferSize() {
        return this.targetBufferSize;
    }

    public final long getTs() {
        return this.ts;
    }

    public final DecoderData getVideoDecoderData() {
        return this.videoDecoderData;
    }

    public final VideoTrackData getVideoTrackData() {
        return this.videoTrackData;
    }

    public final Size getViewPortSize() {
        return this.viewPortSize;
    }

    public final String getVsid() {
        return this.vsid;
    }

    public final l8v getVsidBitmap() {
        return this.vsidBitmap;
    }

    public int hashCode() {
        String str = this.vsid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ContentData contentData = this.contentData;
        int hashCode2 = (hashCode + (contentData == null ? 0 : contentData.hashCode())) * 31;
        VideoTrackData videoTrackData = this.videoTrackData;
        int hashCode3 = (hashCode2 + (videoTrackData == null ? 0 : videoTrackData.hashCode())) * 31;
        AudioTrackData audioTrackData = this.audioTrackData;
        int hashCode4 = (hashCode3 + (audioTrackData == null ? 0 : audioTrackData.hashCode())) * 31;
        SubtitlesTrackData subtitlesTrackData = this.subtitlesTrackData;
        int hashCode5 = (hashCode4 + (subtitlesTrackData == null ? 0 : subtitlesTrackData.hashCode())) * 31;
        Size size = this.viewPortSize;
        int hashCode6 = (hashCode5 + (size == null ? 0 : size.hashCode())) * 31;
        DecoderData decoderData = this.videoDecoderData;
        int hashCode7 = (hashCode6 + (decoderData == null ? 0 : decoderData.hashCode())) * 31;
        DecoderData decoderData2 = this.audioDecoderData;
        int hashCode8 = (hashCode7 + (decoderData2 == null ? 0 : decoderData2.hashCode())) * 31;
        DrmMode drmMode = this.drmMode;
        int b = oyr.b(this.droppedFrames, (hashCode8 + (drmMode == null ? 0 : drmMode.hashCode())) * 31, 31);
        String str2 = this.networkTypeName;
        int hashCode9 = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        BandwidthEstimation bandwidthEstimation = this.lastBandwidthEstimation;
        int hashCode10 = (hashCode9 + (bandwidthEstimation == null ? 0 : bandwidthEstimation.hashCode())) * 31;
        LoadedChunk loadedChunk = this.lastLoadedChunk;
        int hashCode11 = (hashCode10 + (loadedChunk == null ? 0 : loadedChunk.hashCode())) * 31;
        BytesLoaded bytesLoaded = this.bytesLoaded;
        int hashCode12 = (hashCode11 + (bytesLoaded == null ? 0 : bytesLoaded.hashCode())) * 31;
        BufferSize bufferSize = this.currentBufferSize;
        int hashCode13 = (hashCode12 + (bufferSize == null ? 0 : bufferSize.hashCode())) * 31;
        Long l = this.targetBufferSize;
        int hashCode14 = (hashCode13 + (l == null ? 0 : l.hashCode())) * 31;
        LatencyData latencyData = this.latencyData;
        int hashCode15 = (hashCode14 + (latencyData == null ? 0 : latencyData.hashCode())) * 31;
        String str3 = this.lastError;
        int hashCode16 = (hashCode15 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dateTime;
        int hashCode17 = (this.sessionColor.hashCode() + ((hashCode16 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        List<BandwidthEstimation> list = this.bandwidthEstimationsHistory;
        int hashCode18 = (hashCode17 + (list == null ? 0 : list.hashCode())) * 31;
        List<LoadedChunk> list2 = this.loadedChunksHistory;
        int hashCode19 = (hashCode18 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<BufferSize> list3 = this.bufferSizeHistory;
        int c = qv10.c((hashCode19 + (list3 == null ? 0 : list3.hashCode())) * 31, 31, this.ts);
        l8v l8vVar = this.vsidBitmap;
        return Boolean.hashCode(this.isCompact) + ((c + (l8vVar != null ? l8vVar.hashCode() : 0)) * 31);
    }

    public final boolean isCompact() {
        return this.isCompact;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DebugData(vsid=");
        sb.append(this.vsid);
        sb.append(", contentData=");
        sb.append(this.contentData);
        sb.append(", videoTrackData=");
        sb.append(this.videoTrackData);
        sb.append(", audioTrackData=");
        sb.append(this.audioTrackData);
        sb.append(", subtitlesTrackData=");
        sb.append(this.subtitlesTrackData);
        sb.append(", viewPortSize=");
        sb.append(this.viewPortSize);
        sb.append(", videoDecoderData=");
        sb.append(this.videoDecoderData);
        sb.append(", audioDecoderData=");
        sb.append(this.audioDecoderData);
        sb.append(", drmMode=");
        sb.append(this.drmMode);
        sb.append(", droppedFrames=");
        sb.append(this.droppedFrames);
        sb.append(", networkTypeName=");
        sb.append(this.networkTypeName);
        sb.append(", lastBandwidthEstimation=");
        sb.append(this.lastBandwidthEstimation);
        sb.append(", lastLoadedChunk=");
        sb.append(this.lastLoadedChunk);
        sb.append(", bytesLoaded=");
        sb.append(this.bytesLoaded);
        sb.append(", currentBufferSize=");
        sb.append(this.currentBufferSize);
        sb.append(", targetBufferSize=");
        sb.append(this.targetBufferSize);
        sb.append(", latencyData=");
        sb.append(this.latencyData);
        sb.append(", lastError=");
        sb.append(this.lastError);
        sb.append(", dateTime=");
        sb.append(this.dateTime);
        sb.append(", sessionColor=");
        sb.append(this.sessionColor);
        sb.append(", bandwidthEstimationsHistory=");
        sb.append(this.bandwidthEstimationsHistory);
        sb.append(", loadedChunksHistory=");
        sb.append(this.loadedChunksHistory);
        sb.append(", bufferSizeHistory=");
        sb.append(this.bufferSizeHistory);
        sb.append(", ts=");
        sb.append(this.ts);
        sb.append(", vsidBitmap=");
        sb.append(this.vsidBitmap);
        sb.append(", isCompact=");
        return unr0.u(sb, this.isCompact, ')');
    }

    public DebugData(String str, ContentData contentData, VideoTrackData videoTrackData, AudioTrackData audioTrackData, SubtitlesTrackData subtitlesTrackData, Size size, DecoderData decoderData, DecoderData decoderData2, DrmMode drmMode, int i, String str2, BandwidthEstimation bandwidthEstimation, LoadedChunk loadedChunk, BytesLoaded bytesLoaded, BufferSize bufferSize, Long l, LatencyData latencyData, String str3, String str4, SessionColor sessionColor, List<BandwidthEstimation> list, List<LoadedChunk> list2, List<BufferSize> list3, long j, l8v l8vVar, boolean z) {
        this.vsid = str;
        this.contentData = contentData;
        this.videoTrackData = videoTrackData;
        this.audioTrackData = audioTrackData;
        this.subtitlesTrackData = subtitlesTrackData;
        this.viewPortSize = size;
        this.videoDecoderData = decoderData;
        this.audioDecoderData = decoderData2;
        this.drmMode = drmMode;
        this.droppedFrames = i;
        this.networkTypeName = str2;
        this.lastBandwidthEstimation = bandwidthEstimation;
        this.lastLoadedChunk = loadedChunk;
        this.bytesLoaded = bytesLoaded;
        this.currentBufferSize = bufferSize;
        this.targetBufferSize = l;
        this.latencyData = latencyData;
        this.lastError = str3;
        this.dateTime = str4;
        this.sessionColor = sessionColor;
        this.bandwidthEstimationsHistory = list;
        this.loadedChunksHistory = list2;
        this.bufferSizeHistory = list3;
        this.ts = j;
        this.vsidBitmap = l8vVar;
        this.isCompact = z;
    }

    public DebugData() {
        this(null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, null, false, 67108863, null);
    }
}
