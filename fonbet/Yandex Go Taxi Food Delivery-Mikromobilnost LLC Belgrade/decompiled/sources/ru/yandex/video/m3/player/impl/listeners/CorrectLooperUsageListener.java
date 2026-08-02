package ru.yandex.video.m3.player.impl.listeners;

import android.os.Looper;
import defpackage.ah3;
import defpackage.do31;
import defpackage.fe10;
import defpackage.h42;
import defpackage.h5z0;
import defpackage.he10;
import defpackage.i42;
import defpackage.jl40;
import defpackage.kju0;
import defpackage.kyg;
import defpackage.lxc0;
import defpackage.qyg;
import defpackage.r001;
import defpackage.r801;
import defpackage.rdf;
import defpackage.re10;
import defpackage.ue3;
import defpackage.uwy;
import defpackage.vxc0;
import defpackage.w820;
import defpackage.xaj;
import defpackage.yxc0;
import defpackage.zxc0;
import defpackage.zy11;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.a;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PlayerDelegate;
import ru.yandex.video.m3.player.impl.AnalyticsListenerProxy;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;

@Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u001a\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\"\u0010!J)\u0010'\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u0017H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J#\u00101\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\n\u00100\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b1\u0010\u0014J/\u00105\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u00102\u001a\u00020,2\u0006\u00103\u001a\u00020\u00172\u0006\u00104\u001a\u00020\u0017H\u0016¢\u0006\u0004\b5\u00106J/\u0010:\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u00107\u001a\u00020,2\u0006\u00108\u001a\u00020\u00172\u0006\u00109\u001a\u00020\u0017H\u0016¢\u0006\u0004\b:\u00106J\u001f\u0010=\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\bA\u0010@J\u0017\u0010B\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\bB\u0010@J\u001f\u0010D\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010C\u001a\u00020,H\u0016¢\u0006\u0004\bD\u0010/J\u001f\u0010F\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010E\u001a\u00020\u0010H\u0016¢\u0006\u0004\bF\u0010\u0014J\u0017\u0010G\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\bG\u0010@J'\u0010J\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010H\u001a\u00020,2\u0006\u0010I\u001a\u00020\u0017H\u0016¢\u0006\u0004\bJ\u0010KJ\u001f\u0010P\u001a\u00020\r2\u0006\u0010M\u001a\u00020L2\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bP\u0010QJ\u001f\u0010T\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010S\u001a\u00020RH\u0016¢\u0006\u0004\bT\u0010UJ\u001f\u0010W\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010V\u001a\u00020RH\u0016¢\u0006\u0004\bW\u0010UJ'\u0010Z\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010Y\u001a\u00020X2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\bZ\u0010[J'\u0010\\\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010Y\u001a\u00020X2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b\\\u0010[J7\u0010_\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010Y\u001a\u00020X2\u0006\u0010<\u001a\u00020;2\u0006\u0010E\u001a\u00020]2\u0006\u0010^\u001a\u00020RH\u0016¢\u0006\u0004\b_\u0010`J'\u0010a\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010Y\u001a\u00020X2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\ba\u0010[J)\u0010e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010c\u001a\u0004\u0018\u00010b2\u0006\u0010d\u001a\u00020,H\u0016¢\u0006\u0004\be\u0010fJ\u001f\u0010i\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010h\u001a\u00020gH\u0016¢\u0006\u0004\bi\u0010jJ\u001f\u0010m\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010l\u001a\u00020kH\u0016¢\u0006\u0004\bm\u0010nJ'\u0010p\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010o\u001a\u00020R2\u0006\u0010d\u001a\u00020,H\u0016¢\u0006\u0004\bp\u0010qJ\u001f\u0010t\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010s\u001a\u00020rH\u0016¢\u0006\u0004\bt\u0010uJ\u001f\u0010v\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010C\u001a\u00020,H\u0016¢\u0006\u0004\bv\u0010/J\u001f\u0010x\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010w\u001a\u00020,H\u0016¢\u0006\u0004\bx\u0010/J\u001f\u0010z\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010E\u001a\u00020yH\u0016¢\u0006\u0004\bz\u0010{J\u0017\u0010|\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b|\u0010@J2\u0010\u0080\u0001\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010~\u001a\u00020}2\u0006\u0010\u007f\u001a\u00020}2\u0006\u0010d\u001a\u00020,H\u0016¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J-\u0010\u0085\u0001\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0083\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0084\u0001\u001a\u00020\u0017H\u0016¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\"\u0010\u0088\u0001\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0007\u0010\u0087\u0001\u001a\u00020,H\u0016¢\u0006\u0005\b\u0088\u0001\u0010/J\"\u0010\u008a\u0001\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0007\u0010\u0089\u0001\u001a\u00020RH\u0016¢\u0006\u0005\b\u008a\u0001\u0010UJ\"\u0010\u008c\u0001\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0007\u0010\u008b\u0001\u001a\u00020RH\u0016¢\u0006\u0005\b\u008c\u0001\u0010UJ,\u0010\u008f\u0001\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0007\u0010\u008d\u0001\u001a\u00020,2\u0007\u0010\u008e\u0001\u001a\u00020,H\u0016¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J!\u0010\u0091\u0001\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010d\u001a\u00020,H\u0016¢\u0006\u0005\b\u0091\u0001\u0010/J$\u0010\u0094\u0001\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0093\u0001\u001a\u00030\u0092\u0001H\u0016¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J!\u0010\u0096\u0001\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0005\b\u0096\u0001\u0010>J\"\u0010\u0098\u0001\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0007\u0010\u0097\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b\u0098\u0001\u0010\u0014J1\u0010\u0099\u0001\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0016¢\u0006\u0005\b\u0099\u0001\u0010\u001bJ!\u0010\u009a\u0001\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0005\b\u009a\u0001\u0010\u001dJ!\u0010\u009b\u0001\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0005\b\u009b\u0001\u0010!J!\u0010\u009c\u0001\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0005\b\u009c\u0001\u0010!J,\u0010\u009f\u0001\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0007\u0010\u009d\u0001\u001a\u00020\u00172\u0007\u0010\u009e\u0001\u001a\u00020,H\u0016¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J+\u0010¡\u0001\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0005\b¡\u0001\u0010(J$\u0010¤\u0001\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010£\u0001\u001a\u00030¢\u0001H\u0016¢\u0006\u0006\b¤\u0001\u0010¥\u0001J$\u0010¨\u0001\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010§\u0001\u001a\u00030¦\u0001H\u0016¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u001b\u0010«\u0001\u001a\u00020\r2\u0007\u0010ª\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0006\b«\u0001\u0010¬\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010\u00ad\u0001R\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0006\u0010®\u0001¨\u0006¯\u0001"}, d2 = {"Lru/yandex/video/m3/player/impl/listeners/CorrectLooperUsageListener;", "Lru/yandex/video/m3/player/impl/AnalyticsListenerProxy;", "Landroid/os/Looper;", "correctLooper", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/PlayerDelegate$Observer;", "dispatcher", "<init>", "(Landroid/os/Looper;Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;)V", "Lh42;", "eventTime", "Lue3;", "audioAttributes", "Lzy11;", "onAudioAttributesChanged", "(Lh42;Lue3;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "audioCodecError", "onAudioCodecError", "(Lh42;Ljava/lang/Exception;)V", "", "decoderName", "", "initializedTimestampMs", "initializationDurationMs", "onAudioDecoderInitialized", "(Lh42;Ljava/lang/String;JJ)V", "onAudioDecoderReleased", "(Lh42;Ljava/lang/String;)V", "Lkyg;", "counters", "onAudioDisabled", "(Lh42;Lkyg;)V", "onAudioEnabled", "Landroidx/media3/common/a;", "format", "Lqyg;", "decoderReuseEvaluation", "onAudioInputFormatChanged", "(Lh42;Landroidx/media3/common/a;Lqyg;)V", "playoutStartSystemTimeMs", "onAudioPositionAdvancing", "(Lh42;J)V", "", "audioSessionId", "onAudioSessionIdChanged", "(Lh42;I)V", "audioSinkError", "onAudioSinkError", "bufferSize", "bufferSizeMs", "elapsedSinceLastFeedMs", "onAudioUnderrun", "(Lh42;IJJ)V", "totalLoadTimeMs", "totalBytesLoaded", "bitrateEstimate", "onBandwidthEstimate", "Lhe10;", "mediaLoadData", "onDownstreamFormatChanged", "(Lh42;Lhe10;)V", "onDrmKeysLoaded", "(Lh42;)V", "onDrmKeysRemoved", "onDrmKeysRestored", ClidProvider.STATE, "onDrmSessionAcquired", "error", "onDrmSessionManagerError", "onDrmSessionReleased", "droppedFrames", "elapsedMs", "onDroppedVideoFrames", "(Lh42;IJ)V", "Lzxc0;", "player", "Li42;", "events", "onEvents", "(Lzxc0;Li42;)V", "", "isLoading", "onIsLoadingChanged", "(Lh42;Z)V", "isPlaying", "onIsPlayingChanged", "Luwy;", "loadEventInfo", "onLoadCanceled", "(Lh42;Luwy;Lhe10;)V", "onLoadCompleted", "Ljava/io/IOException;", "wasCanceled", "onLoadError", "(Lh42;Luwy;Lhe10;Ljava/io/IOException;Z)V", "onLoadStarted", "Lfe10;", "mediaItem", CRLReasonCodeExtension.REASON, "onMediaItemTransition", "(Lh42;Lfe10;I)V", "Lre10;", "mediaMetadata", "onMediaMetadataChanged", "(Lh42;Lre10;)V", "Lw820;", kju0.j, "onMetadata", "(Lh42;Lw820;)V", "playWhenReady", "onPlayWhenReadyChanged", "(Lh42;ZI)V", "Llxc0;", "playbackParameters", "onPlaybackParametersChanged", "(Lh42;Llxc0;)V", "onPlaybackStateChanged", "playbackSuppressionReason", "onPlaybackSuppressionReasonChanged", "Landroidx/media3/common/PlaybackException;", "onPlayerError", "(Lh42;Landroidx/media3/common/PlaybackException;)V", "onPlayerReleased", "Lyxc0;", "oldPosition", "newPosition", "onPositionDiscontinuity", "(Lh42;Lyxc0;Lyxc0;I)V", "", "output", "renderTimeMs", "onRenderedFirstFrame", "(Lh42;Ljava/lang/Object;J)V", "repeatMode", "onRepeatModeChanged", "shuffleModeEnabled", "onShuffleModeChanged", "skipSilenceEnabled", "onSkipSilenceEnabledChanged", "width", "height", "onSurfaceSizeChanged", "(Lh42;II)V", "onTimelineChanged", "Lr801;", "tracks", "onTracksChanged", "(Lh42;Lr801;)V", "onUpstreamDiscarded", "videoCodecError", "onVideoCodecError", "onVideoDecoderInitialized", "onVideoDecoderReleased", "onVideoDisabled", "onVideoEnabled", "totalProcessingOffsetUs", "frameCount", "onVideoFrameProcessingOffset", "(Lh42;JI)V", "onVideoInputFormatChanged", "Ldo31;", "videoSize", "onVideoSizeChanged", "(Lh42;Ldo31;)V", "", "volume", "onVolumeChanged", "(Lh42;F)V", "callbackName", "checkLooper", "(Ljava/lang/String;)V", "Landroid/os/Looper;", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CorrectLooperUsageListener extends AnalyticsListenerProxy {
    public static final int $stable = 8;
    private final Looper correctLooper;
    private final ObserverDispatcher<PlayerDelegate.Observer> dispatcher;

    public CorrectLooperUsageListener(Looper looper, ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher) {
        this.correctLooper = looper;
        this.dispatcher = observerDispatcher;
    }

    private final void checkLooper(String callbackName) {
        HashSet H0;
        Object failure;
        if (jl40.l(Thread.currentThread(), this.correctLooper.getThread())) {
            return;
        }
        ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher = this.dispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerDelegate.Observer) it.next()).onError(new PlaybackException.WrongCallbackThread(callbackName, Thread.currentThread(), this.correctLooper.getThread()));
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onAudioAttributesChanged(h42 eventTime, ue3 audioAttributes) {
        checkLooper("onAudioAttributesChanged");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onAudioCodecError(h42 eventTime, Exception audioCodecError) {
        checkLooper("onAudioCodecError");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onAudioDecoderInitialized(h42 eventTime, String decoderName, long initializedTimestampMs, long initializationDurationMs) {
        checkLooper("onAudioDecoderInitialized");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onAudioDecoderReleased(h42 eventTime, String decoderName) {
        checkLooper("onAudioDecoderReleased");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onAudioDisabled(h42 eventTime, kyg counters) {
        checkLooper("onAudioDisabled");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onAudioEnabled(h42 eventTime, kyg counters) {
        checkLooper("onAudioEnabled");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onAudioInputFormatChanged(h42 eventTime, androidx.media3.common.a format, qyg decoderReuseEvaluation) {
        checkLooper("onAudioInputFormatChanged");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onAudioPositionAdvancing(h42 eventTime, long playoutStartSystemTimeMs) {
        checkLooper("onAudioPositionAdvancing");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onAudioSessionIdChanged(h42 eventTime, int audioSessionId) {
        checkLooper("onAudioSessionIdChanged");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onAudioSinkError(h42 eventTime, Exception audioSinkError) {
        checkLooper("onAudioSinkError");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioTrackInitialized(h42 h42Var, ah3 ah3Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioTrackReleased(h42 h42Var, ah3 ah3Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onAudioUnderrun(h42 eventTime, int bufferSize, long bufferSizeMs, long elapsedSinceLastFeedMs) {
        checkLooper("onAudioUnderrun");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(h42 h42Var, vxc0 vxc0Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onBandwidthEstimate(h42 eventTime, int totalLoadTimeMs, long totalBytesLoaded, long bitrateEstimate) {
        checkLooper("onBandwidthEstimate");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onCues(h42 h42Var, List list) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onCues(h42 h42Var, rdf rdfVar) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(h42 h42Var, xaj xajVar) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(h42 h42Var, int i, boolean z) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onDownstreamFormatChanged(h42 eventTime, he10 mediaLoadData) {
        checkLooper("onDownstreamFormatChanged");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onDrmKeysLoaded(h42 eventTime) {
        checkLooper("onDrmKeysLoaded");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onDrmKeysRemoved(h42 eventTime) {
        checkLooper("onDrmKeysRemoved");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onDrmKeysRestored(h42 eventTime) {
        checkLooper("onDrmKeysRestored");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onDrmSessionAcquired(h42 eventTime, int state) {
        checkLooper("onDrmSessionAcquired");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onDrmSessionManagerError(h42 eventTime, Exception error) {
        checkLooper("onDrmSessionManagerError");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onDrmSessionReleased(h42 eventTime) {
        checkLooper("onDrmSessionReleased");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onDroppedVideoFrames(h42 eventTime, int droppedFrames, long elapsedMs) {
        checkLooper("onDroppedVideoFrames");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onEvents(zxc0 player, i42 events) {
        checkLooper("onEvents");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onIsLoadingChanged(h42 eventTime, boolean isLoading) {
        checkLooper("onIsLoadingChanged");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onIsPlayingChanged(h42 eventTime, boolean isPlaying) {
        checkLooper("onIsPlayingChanged");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onLoadCanceled(h42 eventTime, uwy loadEventInfo, he10 mediaLoadData) {
        checkLooper("onLoadCanceled");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onLoadCompleted(h42 eventTime, uwy loadEventInfo, he10 mediaLoadData) {
        checkLooper("onLoadCompleted");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onLoadError(h42 eventTime, uwy loadEventInfo, he10 mediaLoadData, IOException error, boolean wasCanceled) {
        checkLooper("onLoadError");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onLoadStarted(h42 eventTime, uwy loadEventInfo, he10 mediaLoadData) {
        checkLooper("onLoadStarted");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(h42 h42Var, boolean z) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy
    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(h42 h42Var, long j) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onMediaItemTransition(h42 eventTime, fe10 mediaItem, int reason) {
        checkLooper("onMediaItemTransition");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onMediaMetadataChanged(h42 eventTime, re10 mediaMetadata) {
        checkLooper("onMediaMetadataChanged");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onMetadata(h42 eventTime, w820 metadata) {
        checkLooper("onMetadata");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onPlayWhenReadyChanged(h42 eventTime, boolean playWhenReady, int reason) {
        checkLooper("onPlayWhenReadyChanged");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onPlaybackParametersChanged(h42 eventTime, lxc0 playbackParameters) {
        checkLooper("onPlaybackParametersChanged");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onPlaybackStateChanged(h42 eventTime, int state) {
        checkLooper("onPlaybackStateChanged");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onPlaybackSuppressionReasonChanged(h42 eventTime, int playbackSuppressionReason) {
        checkLooper("onPlaybackSuppressionReasonChanged");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onPlayerError(h42 eventTime, androidx.media3.common.PlaybackException error) {
        checkLooper("onPlayerError");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(h42 h42Var, androidx.media3.common.PlaybackException playbackException) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onPlayerReleased(h42 eventTime) {
        checkLooper("onPlayerReleased");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onPlayerStateChanged(h42 h42Var, boolean z, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(h42 h42Var, re10 re10Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onPositionDiscontinuity(h42 eventTime, yxc0 oldPosition, yxc0 newPosition, int reason) {
        checkLooper("onPositionDiscontinuity");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onRenderedFirstFrame(h42 eventTime, Object output, long renderTimeMs) {
        checkLooper("onRenderedFirstFrame");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onRendererReadyChanged(h42 h42Var, int i, int i2, boolean z) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onRepeatModeChanged(h42 eventTime, int repeatMode) {
        checkLooper("onRepeatModeChanged");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy
    public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(h42 h42Var, long j) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy
    public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(h42 h42Var, long j) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onSeekStarted(h42 h42Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onShuffleModeChanged(h42 eventTime, boolean shuffleModeEnabled) {
        checkLooper("onShuffleModeChanged");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onSkipSilenceEnabledChanged(h42 eventTime, boolean skipSilenceEnabled) {
        checkLooper("onSkipSilenceEnabledChanged");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onSurfaceSizeChanged(h42 eventTime, int width, int height) {
        checkLooper("onSurfaceSizeChanged");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onTimelineChanged(h42 eventTime, int reason) {
        checkLooper("onTimelineChanged");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(h42 h42Var, r001 r001Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onTracksChanged(h42 eventTime, r801 tracks) {
        checkLooper("onTracksChanged");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onUpstreamDiscarded(h42 eventTime, he10 mediaLoadData) {
        checkLooper("onUpstreamDiscarded");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onVideoCodecError(h42 eventTime, Exception videoCodecError) {
        checkLooper("onVideoCodecError");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onVideoDecoderInitialized(h42 eventTime, String decoderName, long initializedTimestampMs, long initializationDurationMs) {
        checkLooper("onVideoDecoderInitialized");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onVideoDecoderReleased(h42 eventTime, String decoderName) {
        checkLooper("onVideoDecoderReleased");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onVideoDisabled(h42 eventTime, kyg counters) {
        checkLooper("onVideoDisabled");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onVideoEnabled(h42 eventTime, kyg counters) {
        checkLooper("onVideoEnabled");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onVideoFrameProcessingOffset(h42 eventTime, long totalProcessingOffsetUs, int frameCount) {
        checkLooper("onVideoFrameProcessingOffset");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onVideoInputFormatChanged(h42 eventTime, androidx.media3.common.a format, qyg decoderReuseEvaluation) {
        checkLooper("onVideoInputFormatChanged");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onVideoSizeChanged(h42 eventTime, do31 videoSize) {
        checkLooper("onVideoSizeChanged");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onVolumeChanged(h42 eventTime, float volume) {
        checkLooper("onVolumeChanged");
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onAudioDecoderInitialized(h42 h42Var, String str, long j) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onDrmSessionAcquired(h42 h42Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onLoadStarted(h42 h42Var, uwy uwyVar, he10 he10Var, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(h42 h42Var, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onVideoDecoderInitialized(h42 h42Var, String str, long j) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(h42 h42Var, int i, int i2, int i3, float f) {
    }
}
