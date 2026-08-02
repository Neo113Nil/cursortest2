package ru.yandex.video.m3.player.impl;

import android.os.Looper;
import android.util.Base64;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.common.collect.ImmutableList;
import defpackage.a9z0;
import defpackage.c6w;
import defpackage.cj01;
import defpackage.dd1;
import defpackage.egg;
import defpackage.ego;
import defpackage.h5z0;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.loo;
import defpackage.lxc0;
import defpackage.m001;
import defpackage.nmh;
import defpackage.qv10;
import defpackage.sls;
import defpackage.tls;
import defpackage.tw21;
import defpackage.uf10;
import defpackage.unr0;
import defpackage.vmh;
import defpackage.w511;
import defpackage.x60;
import defpackage.xv00;
import defpackage.y6i0;
import defpackage.z8z0;
import defpackage.zxc0;
import defpackage.zy11;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.data.Ad;
import ru.yandex.video.m3.data.DataSourceParameters;
import ru.yandex.video.m3.data.DelegatePlaybackParameters;
import ru.yandex.video.m3.data.DelegatePrepareParams;
import ru.yandex.video.m3.data.DelegatePrepareParamsKt;
import ru.yandex.video.m3.data.DrmType;
import ru.yandex.video.m3.data.PlaybackStats;
import ru.yandex.video.m3.data.PlaybackStatsKt;
import ru.yandex.video.m3.data.PlaybackViewState;
import ru.yandex.video.m3.data.PlaybackViewStateKt;
import ru.yandex.video.m3.data.StartFromCacheInfo;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.data.loadcontrol.LoadControlBufferState;
import ru.yandex.video.m3.data.loadcontrol.LoadControlState;
import ru.yandex.video.m3.model.config.mediasource.LoadErrorHandlingConfig;
import ru.yandex.video.m3.player.AnalyticsListenerExtended;
import ru.yandex.video.m3.player.CurrentBufferLengthProvider;
import ru.yandex.video.m3.player.DependentLifecycleLoadControl;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PlayerDelegate;
import ru.yandex.video.m3.player.RepeatMode;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.ad.AdsLoaderHolder;
import ru.yandex.video.m3.player.ad.ExoAdsLoaderHolder;
import ru.yandex.video.m3.player.debug.ExoDroppedFramesListener;
import ru.yandex.video.m3.player.drm.DefaultMediaDrmCallbackDelegate;
import ru.yandex.video.m3.player.drm.DrmSecurityLevel;
import ru.yandex.video.m3.player.drm.DrmSessionManagerMode;
import ru.yandex.video.m3.player.drm.ExoDrmSessionManager;
import ru.yandex.video.m3.player.drm.ExoDrmSessionManagerFactory;
import ru.yandex.video.m3.player.drm.MediaDrmCallbackDelegate;
import ru.yandex.video.m3.player.drm.MediaDrmCallbackDelegateV2;
import ru.yandex.video.m3.player.drm.PrepareDrm;
import ru.yandex.video.m3.player.feature.PlaybackFeatureChangeListener;
import ru.yandex.video.m3.player.feature.PlaybackFeaturesProvider;
import ru.yandex.video.m3.player.impl.ExoPlayerDelegate;
import ru.yandex.video.m3.player.impl.bandwidth.BandwidthEstimateObserver;
import ru.yandex.video.m3.player.impl.cache.StartFromCacheHelper;
import ru.yandex.video.m3.player.impl.codecs.LoggingMediaCodecSelector;
import ru.yandex.video.m3.player.impl.debug.StartPositionValidatorImpl;
import ru.yandex.video.m3.player.impl.drm.ExoDummyDrmSessionManager;
import ru.yandex.video.m3.player.impl.listeners.CorrectLooperUsageListener;
import ru.yandex.video.m3.player.impl.listeners.DiffServerAndLocalTimeListener;
import ru.yandex.video.m3.player.impl.listeners.InternalAnalyticsListener;
import ru.yandex.video.m3.player.impl.listeners.InternalBandwidthMeterEventListener;
import ru.yandex.video.m3.player.impl.listeners.InternalDrmSessionListener;
import ru.yandex.video.m3.player.impl.listeners.InternalFrameDropObserver;
import ru.yandex.video.m3.player.impl.listeners.InternalMediaSourceEventListener;
import ru.yandex.video.m3.player.impl.listeners.InternalPlayerEventListener;
import ru.yandex.video.m3.player.impl.listeners.StuckStalledListener;
import ru.yandex.video.m3.player.impl.listeners.TimelineChangeListener;
import ru.yandex.video.m3.player.impl.listeners.TracksChangeListener;
import ru.yandex.video.m3.player.impl.load_control.YandexLoadControl;
import ru.yandex.video.m3.player.impl.managers.AllowInitCodecManagerImpl;
import ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager;
import ru.yandex.video.m3.player.impl.preload.PreloadPriorityController;
import ru.yandex.video.m3.player.impl.preload.PreloadPriorityControllerImpl;
import ru.yandex.video.m3.player.impl.source.DefaultMediaSourceFactory;
import ru.yandex.video.m3.player.impl.tracks.ExoPlayerRendererTrackSelector;
import ru.yandex.video.m3.player.impl.tracks.ExoPlayerTrack;
import ru.yandex.video.m3.player.impl.tracks.RendererTrackSelector;
import ru.yandex.video.m3.player.impl.utils.CurrentWindowStateProvider;
import ru.yandex.video.m3.player.impl.utils.ExoPlayerProperThreadRunner;
import ru.yandex.video.m3.player.impl.utils.LabelVideoTrackNameProvider;
import ru.yandex.video.m3.player.impl.utils.LoadErrorHandlingPolicyImpl;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.player.impl.utils.PlaybackViewManager;
import ru.yandex.video.m3.player.impl.utils.TimeProvider;
import ru.yandex.video.m3.player.live.LiveSpeedControlObserver;
import ru.yandex.video.m3.player.parameters.StuckStalledConfig;
import ru.yandex.video.m3.player.provider.Consumer;
import ru.yandex.video.m3.player.provider.ManifestVideoTrackNameProvider;
import ru.yandex.video.m3.player.report.logger.RecordLogger;
import ru.yandex.video.m3.player.tracks.DefaultPlayerTrackNameProvider;
import ru.yandex.video.m3.player.tracks.PlayerTrackNameProvider;
import ru.yandex.video.m3.player.tracks.Track;
import ru.yandex.video.m3.player.tracks.TrackType;
import ru.yandex.video.m3.player.utils.ResourceProvider;
import ru.yandex.video.m3.preload.PreloadPrioritySettings;
import ru.yandex.video.m3.source.MediaSourceFactory;
import ru.yandex.video.m3.source.MediaSourceParameters;
import ru.yandex.video.m3.source.MediaSourceParametersKt;
import ru.yandex.video.m3.util.ExecutorsUtilKt;
import ru.yandex.video.m3.util.MarkedScheduledExecutorService;

@Metadata(d1 = {"\u0000º\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0004´\u0002µ\u0002BÑ\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u0018\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%\u0012\b\b\u0002\u0010)\u001a\u00020(\u0012\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0*\u0012\b\b\u0002\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00101\u001a\u00020\u0018\u0012\b\b\u0002\u00103\u001a\u000202\u0012\u000e\b\u0002\u00105\u001a\b\u0012\u0004\u0012\u0002040%\u0012\b\b\u0002\u00106\u001a\u00020\u0018\u0012\b\b\u0002\u00107\u001a\u00020\u0018\u0012\b\u00109\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:\u0012\b\b\u0002\u0010<\u001a\u00020\u0018\u0012\b\b\u0002\u0010=\u001a\u00020\u0018\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>\u0012\b\b\u0002\u0010@\u001a\u00020\u0018\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010A¢\u0006\u0004\bC\u0010DJ\u001d\u0010G\u001a\u00020\u00022\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00020EH\u0016¢\u0006\u0004\bG\u0010HJ\u0019\u0010L\u001a\u00020K2\b\u0010J\u001a\u0004\u0018\u00010IH\u0016¢\u0006\u0004\bL\u0010MJ\u0019\u0010P\u001a\u00020K2\b\u0010O\u001a\u0004\u0018\u00010NH\u0016¢\u0006\u0004\bP\u0010QJ!\u0010V\u001a\u00020K2\u0006\u0010S\u001a\u00020R2\b\u0010U\u001a\u0004\u0018\u00010TH\u0016¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020KH\u0016¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020KH\u0016¢\u0006\u0004\bZ\u0010YJ\u0017\u0010\\\u001a\u00020K2\u0006\u0010[\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020KH\u0016¢\u0006\u0004\b^\u0010YJ\u0017\u0010a\u001a\u00020K2\u0006\u0010`\u001a\u00020_H\u0016¢\u0006\u0004\ba\u0010bJ\u000f\u0010c\u001a\u00020_H\u0016¢\u0006\u0004\bc\u0010dJ\u000f\u0010e\u001a\u00020_H\u0016¢\u0006\u0004\be\u0010dJ\u000f\u0010f\u001a\u00020_H\u0016¢\u0006\u0004\bf\u0010dJ\u0011\u0010h\u001a\u0004\u0018\u00010gH\u0017¢\u0006\u0004\bh\u0010iJ\u000f\u0010k\u001a\u00020jH\u0016¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020jH\u0016¢\u0006\u0004\bm\u0010lJ\u0011\u0010o\u001a\u0004\u0018\u00010nH\u0016¢\u0006\u0004\bo\u0010pJ\u000f\u0010r\u001a\u00020qH\u0016¢\u0006\u0004\br\u0010sJ\u0011\u0010u\u001a\u0004\u0018\u00010tH\u0016¢\u0006\u0004\bu\u0010vJ\u000f\u0010w\u001a\u00020\u0018H\u0016¢\u0006\u0004\bw\u0010xJ\u000f\u0010y\u001a\u00020\u0018H\u0016¢\u0006\u0004\by\u0010xJ\u0017\u0010{\u001a\u00020K2\u0006\u0010z\u001a\u00020&H\u0016¢\u0006\u0004\b{\u0010|J\u0017\u0010}\u001a\u00020K2\u0006\u0010z\u001a\u00020&H\u0016¢\u0006\u0004\b}\u0010|J\u001a\u0010\u007f\u001a\u00020K2\b\u0010\u007f\u001a\u0004\u0018\u00010~H\u0016¢\u0006\u0005\b\u007f\u0010\u0080\u0001J3\u0010\u0088\u0001\u001a\u00030\u0087\u00012\b\u0010\u0082\u0001\u001a\u00030\u0081\u00012\b\u0010\u0084\u0001\u001a\u00030\u0083\u00012\n\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0085\u0001H\u0016¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0011\u0010\u008a\u0001\u001a\u00020\u0018H\u0016¢\u0006\u0005\b\u008a\u0001\u0010xJ\u001a\u0010\u008c\u0001\u001a\u00020K2\u0007\u0010\u008b\u0001\u001a\u00020\u0018H\u0016¢\u0006\u0005\b\u008c\u0001\u0010]J\u001c\u0010\u008f\u0001\u001a\u00020K2\b\u0010\u008e\u0001\u001a\u00030\u008d\u0001H\u0016¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u0013\u0010\u0091\u0001\u001a\u00030\u008d\u0001H\u0016¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u001a\u0010\u0094\u0001\u001a\u00020K2\u0007\u0010\u0093\u0001\u001a\u00020\u0018H\u0016¢\u0006\u0005\b\u0094\u0001\u0010]J\u001c\u0010\u0096\u0001\u001a\u00020K2\b\u0010\u0095\u0001\u001a\u00030\u008d\u0001H\u0016¢\u0006\u0006\b\u0096\u0001\u0010\u0090\u0001J\u001c\u0010\u0099\u0001\u001a\u00020K2\b\u0010\u0098\u0001\u001a\u00030\u0097\u0001H\u0016¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u0013\u0010\u009b\u0001\u001a\u00030\u0097\u0001H\u0016¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u0013\u0010\u009d\u0001\u001a\u00030\u008d\u0001H\u0016¢\u0006\u0006\b\u009d\u0001\u0010\u0092\u0001J\u0013\u0010\u009f\u0001\u001a\u00030\u009e\u0001H\u0016¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u0011\u0010¡\u0001\u001a\u00020jH\u0016¢\u0006\u0005\b¡\u0001\u0010lJ\u0012\u0010¢\u0001\u001a\u00020jH\u0016¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u0011\u0010¤\u0001\u001a\u00020jH\u0016¢\u0006\u0005\b¤\u0001\u0010lJ\u0013\u0010¦\u0001\u001a\u00030¥\u0001H\u0016¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u001a\u0010ª\u0001\u001a\n\u0012\u0005\u0012\u00030©\u00010¨\u0001H\u0016¢\u0006\u0006\bª\u0001\u0010«\u0001J\u0013\u0010\u00ad\u0001\u001a\u00030¬\u0001H\u0016¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J\u0013\u0010°\u0001\u001a\u00030¯\u0001H\u0016¢\u0006\u0006\b°\u0001\u0010±\u0001J\u001c\u0010´\u0001\u001a\u00020K2\b\u0010³\u0001\u001a\u00030²\u0001H\u0016¢\u0006\u0006\b´\u0001\u0010µ\u0001J\u001c\u0010¸\u0001\u001a\u00020K2\b\u0010·\u0001\u001a\u00030¶\u0001H\u0016¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\u0011\u0010º\u0001\u001a\u00020KH\u0016¢\u0006\u0005\bº\u0001\u0010YJ\u0013\u0010¼\u0001\u001a\u00030»\u0001H\u0016¢\u0006\u0006\b¼\u0001\u0010½\u0001J\u0014\u0010¾\u0001\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0006\b¾\u0001\u0010¿\u0001J)\u0010Ã\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010À\u00012\u000e\u0010Â\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000Á\u0001H\u0002¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001J\u001f\u0010Ç\u0001\u001a\u0005\u0018\u00010Æ\u00012\b\u0010Å\u0001\u001a\u00030¶\u0001H\u0002¢\u0006\u0006\bÇ\u0001\u0010È\u0001J%\u0010Ê\u0001\u001a\u00020K2\b\u0010\u0095\u0001\u001a\u00030\u008d\u00012\u0007\u0010É\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001J+\u0010Î\u0001\u001a\u00020K2\u0016\b\u0004\u0010Í\u0001\u001a\u000f\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020K0Ì\u0001H\u0082\b¢\u0006\u0006\bÎ\u0001\u0010Ï\u0001J\u001d\u0010Ñ\u0001\u001a\u00030Ð\u00012\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001H\u0002¢\u0006\u0006\bÑ\u0001\u0010Ò\u0001J\u001d\u0010Ô\u0001\u001a\u00030Ð\u00012\b\u0010Ó\u0001\u001a\u00030¶\u0001H\u0002¢\u0006\u0006\bÔ\u0001\u0010Õ\u0001J\u0011\u0010Ö\u0001\u001a\u00020jH\u0002¢\u0006\u0005\bÖ\u0001\u0010lR\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010×\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010Ø\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010Ù\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010Ú\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010Û\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010Ü\u0001R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010Ý\u0001R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010Þ\u0001R\u0015\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010ß\u0001R\u0015\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010à\u0001R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010á\u0001R\u0015\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010â\u0001R\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001f\u0010ã\u0001R\u0015\u0010 \u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b \u0010à\u0001R\u0017\u0010\"\u001a\u0004\u0018\u00010!8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\"\u0010ä\u0001R\u001b\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b'\u0010å\u0001R\u0015\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b)\u0010æ\u0001R\u001d\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0*8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b,\u0010ç\u0001R\u0015\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b.\u0010è\u0001R\u0015\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b0\u0010é\u0001R\u0015\u00101\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b1\u0010à\u0001R\u0015\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b3\u0010ê\u0001R\u001b\u00105\u001a\b\u0012\u0004\u0012\u0002040%8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b5\u0010å\u0001R\u0015\u00106\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b6\u0010à\u0001R\u0015\u00107\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b7\u0010à\u0001R\u0017\u00109\u001a\u0004\u0018\u0001088\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b9\u0010ë\u0001R\u0017\u0010;\u001a\u0004\u0018\u00010:8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b;\u0010ì\u0001R\u0015\u0010<\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b<\u0010à\u0001R\u0015\u0010=\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b=\u0010à\u0001R\u0017\u0010?\u001a\u0004\u0018\u00010>8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b?\u0010í\u0001R\u0015\u0010@\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b@\u0010à\u0001R\u0017\u0010B\u001a\u0004\u0018\u00010A8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bB\u0010î\u0001R\u001c\u0010ð\u0001\u001a\u0005\u0018\u00010ï\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bð\u0001\u0010ñ\u0001R\u001a\u0010³\u0001\u001a\u00030²\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010ò\u0001R\u001a\u0010·\u0001\u001a\u00030¶\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010ó\u0001R\u0018\u0010õ\u0001\u001a\u00030ô\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bõ\u0001\u0010ö\u0001R\u001c\u0010ø\u0001\u001a\u00070÷\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\bø\u0001\u0010ù\u0001R\u001a\u0010û\u0001\u001a\u0005\u0018\u00010ú\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bû\u0001\u0010ü\u0001R\u0019\u0010ý\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bý\u0001\u0010à\u0001R!\u0010ÿ\u0001\u001a\n\u0012\u0005\u0012\u00030²\u00010þ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÿ\u0001\u0010\u0080\u0002R1\u0010\u0082\u0002\u001a\u00030\u0081\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u001f\n\u0006\b\u0082\u0002\u0010\u0083\u0002\u0012\u0005\b\u0088\u0002\u0010Y\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002\"\u0006\b\u0086\u0002\u0010\u0087\u0002R\u0018\u0010\u008a\u0002\u001a\u00030\u0089\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0002\u0010\u008b\u0002R1\u0010\u008d\u0002\u001a\u00030\u008c\u00028\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\b\u008d\u0002\u0010\u008e\u0002\u0012\u0005\b\u0093\u0002\u0010Y\u001a\u0006\b\u008f\u0002\u0010\u0090\u0002\"\u0006\b\u0091\u0002\u0010\u0092\u0002R\u0018\u0010\u0095\u0002\u001a\u00030\u0094\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0002\u0010\u0096\u0002R1\u0010\u0098\u0002\u001a\u00030\u0097\u00028\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\b\u0098\u0002\u0010\u0099\u0002\u0012\u0005\b\u009e\u0002\u0010Y\u001a\u0006\b\u009a\u0002\u0010\u009b\u0002\"\u0006\b\u009c\u0002\u0010\u009d\u0002R\u0018\u0010 \u0002\u001a\u00030\u009f\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0002\u0010¡\u0002R\u0019\u0010\u007f\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010¢\u0002R\u001a\u0010£\u0002\u001a\u00030Æ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0002\u0010¤\u0002R\u0018\u0010¦\u0002\u001a\u00030¥\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0002\u0010§\u0002R\u0018\u0010©\u0002\u001a\u00030¨\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0002\u0010ª\u0002R\u001a\u0010¬\u0002\u001a\u00030«\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0002\u0010\u00ad\u0002R\u0018\u0010¯\u0002\u001a\u00030®\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0002\u0010°\u0002R\u001c\u0010²\u0002\u001a\u0005\u0018\u00010±\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0002\u0010³\u0002¨\u0006¶\u0002"}, d2 = {"Lru/yandex/video/m3/player/impl/ExoPlayerDelegate;", "Lru/yandex/video/m3/player/PlayerDelegate;", "Lzxc0;", "Lru/yandex/video/m3/player/CurrentBufferLengthProvider;", "Lru/yandex/video/m3/player/impl/listeners/InternalMediaSourceEventListener$VideoTrackSelectionProvider;", "Lru/yandex/video/m3/player/ad/ExoAdsLoaderHolder;", "Landroidx/media3/exoplayer/ExoPlayer;", "exoPlayer", "Lru/yandex/video/m3/source/MediaSourceFactory;", "mediaSourceFactory", "Lvmh;", "trackSelector", "Lru/yandex/video/m3/player/drm/ExoDrmSessionManagerFactory;", "drmSessionManagerFactory", "Lru/yandex/video/m3/util/MarkedScheduledExecutorService;", "scheduledExecutorService", "Lru/yandex/video/m3/player/impl/utils/ExoPlayerProperThreadRunner;", "exoPlayerProperThreadRunner", "Lru/yandex/video/m3/player/impl/BandwidthMeterWithProxyTransferListener;", "bandwidthMeter", "Lru/yandex/video/m3/player/AnalyticsListenerExtended;", "analyticsListener", "Lru/yandex/video/m3/player/impl/VideoComponent;", "videoComponent", "", "eventLoggerEnabled", "Lru/yandex/video/m3/player/impl/codecs/LoggingMediaCodecSelector;", "loggingMediaCodecSelector", "Landroid/os/Looper;", "exoPlayerLooper", "Lru/yandex/video/m3/player/impl/load_control/YandexLoadControl;", "loadControl", "expDoNotRecreateWrapper", "Lru/yandex/video/m3/player/live/LiveSpeedControlObserver;", "liveSpeedControlObserver", "Lru/yandex/video/m3/preload/PreloadPrioritySettings;", "preloadPrioritySettings", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/PlayerDelegate$Observer;", "observerDispatcher", "Lru/yandex/video/m3/player/impl/managers/ExoRepeatModeManager;", "repeatModeManager", "Lru/yandex/video/m3/player/provider/Consumer;", "Lru/yandex/video/m3/data/DrmType;", "drmTypeConsumer", "Lru/yandex/video/m3/player/debug/ExoDroppedFramesListener;", "droppedFramesProvider", "Lru/yandex/video/m3/player/report/logger/RecordLogger;", "recordLogger", "shouldHandleZeroStartPositionAsDefault", "Lru/yandex/video/m3/player/feature/PlaybackFeaturesProvider;", "playbackFeaturesProvider", "Lru/yandex/video/m3/player/feature/PlaybackFeatureChangeListener;", "playbackFeaturesListeners", "allowDisabledTrackVariant", "monitorFrameDrops", "Lru/yandex/video/m3/model/config/mediasource/LoadErrorHandlingConfig;", "loadErrorHandlingConfig", "Lru/yandex/video/m3/player/impl/bandwidth/BandwidthEstimateObserver;", "bandwidthEstimateObserver", "allowDisabledAudioTrackVariant", "allowPendingAudioTrackDisabling", "Lru/yandex/video/m3/player/impl/managers/AllowInitCodecManagerImpl;", "allowInitCodecManager", "ignoreSeekOnSamePosition", "Lru/yandex/video/m3/player/parameters/StuckStalledConfig;", "stuckStalledConfig", "<init>", "(Landroidx/media3/exoplayer/ExoPlayer;Lru/yandex/video/m3/source/MediaSourceFactory;Lvmh;Lru/yandex/video/m3/player/drm/ExoDrmSessionManagerFactory;Lru/yandex/video/m3/util/MarkedScheduledExecutorService;Lru/yandex/video/m3/player/impl/utils/ExoPlayerProperThreadRunner;Lru/yandex/video/m3/player/impl/BandwidthMeterWithProxyTransferListener;Lru/yandex/video/m3/player/AnalyticsListenerExtended;Lru/yandex/video/m3/player/impl/VideoComponent;ZLru/yandex/video/m3/player/impl/codecs/LoggingMediaCodecSelector;Landroid/os/Looper;Lru/yandex/video/m3/player/impl/load_control/YandexLoadControl;ZLru/yandex/video/m3/player/live/LiveSpeedControlObserver;Lru/yandex/video/m3/preload/PreloadPrioritySettings;Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;Lru/yandex/video/m3/player/impl/managers/ExoRepeatModeManager;Lru/yandex/video/m3/player/provider/Consumer;Lru/yandex/video/m3/player/debug/ExoDroppedFramesListener;Lru/yandex/video/m3/player/report/logger/RecordLogger;ZLru/yandex/video/m3/player/feature/PlaybackFeaturesProvider;Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;ZZLru/yandex/video/m3/model/config/mediasource/LoadErrorHandlingConfig;Lru/yandex/video/m3/player/impl/bandwidth/BandwidthEstimateObserver;ZZLru/yandex/video/m3/player/impl/managers/AllowInitCodecManagerImpl;ZLru/yandex/video/m3/player/parameters/StuckStalledConfig;)V", "Lru/yandex/video/m3/player/YandexPlayer;", "player", "extractPlayer", "(Lru/yandex/video/m3/player/YandexPlayer;)Lzxc0;", "Lx60;", "adViewProvider", "Lzy11;", "setAdViewProvider", "(Lx60;)V", "Ldd1;", "adsLoader", "setAdsLoader", "(Ldd1;)V", "Lru/yandex/video/m3/data/DelegatePlaybackParameters;", "playbackParameters", "Lru/yandex/video/m3/data/DelegatePrepareParams;", "prepareParameters", "prepare", "(Lru/yandex/video/m3/data/DelegatePlaybackParameters;Lru/yandex/video/m3/data/DelegatePrepareParams;)V", "play", "()V", "pause", "keepDecoders", "stop", "(Z)V", "release", "Lru/yandex/video/m3/player/PlayerDelegate$Position;", "position", "seekTo", "(Lru/yandex/video/m3/player/PlayerDelegate$Position;)V", "getPosition", "()Lru/yandex/video/m3/player/PlayerDelegate$Position;", "getBufferedPosition", "getLiveEdgePosition", "Lru/yandex/video/m3/data/PlaybackStats;", "getPlaybackStats", "()Lru/yandex/video/m3/data/PlaybackStats;", "", "getTimelineLeftEdge", "()J", "getDuration", "Lru/yandex/video/m3/data/VideoType;", "getVideoType", "()Lru/yandex/video/m3/data/VideoType;", "Lru/yandex/video/m3/player/impl/tracks/RendererTrackSelector$Selection;", "getVideoTrackSelection", "()Lru/yandex/video/m3/player/impl/tracks/RendererTrackSelector$Selection;", "Lru/yandex/video/m3/data/StreamType;", "getStreamType", "()Lru/yandex/video/m3/data/StreamType;", "isPlaying", "()Z", "isPlayingAd", "observer", "addObserver", "(Lru/yandex/video/m3/player/PlayerDelegate$Observer;)V", "removeObserver", "Lru/yandex/video/m3/player/drm/PrepareDrm;", "prepareDrm", "(Lru/yandex/video/m3/player/drm/PrepareDrm;)V", "Lru/yandex/video/m3/player/tracks/TrackType;", PlaybackException.ErrorInRenderer.TRACK_TYPE, "Lru/yandex/video/m3/player/utils/ResourceProvider;", "resourceProvider", "Lru/yandex/video/m3/player/tracks/PlayerTrackNameProvider;", "trackNameProvider", "Lru/yandex/video/m3/player/tracks/Track;", "getTrack", "(Lru/yandex/video/m3/player/tracks/TrackType;Lru/yandex/video/m3/player/utils/ResourceProvider;Lru/yandex/video/m3/player/tracks/PlayerTrackNameProvider;)Lru/yandex/video/m3/player/tracks/Track;", "isMuted", "muted", "setMuted", "", "volume", "setVolume", "(F)V", "getVolume", "()F", "handleAudioFocus", "setHandleAudioFocus", "speed", "setPlaybackSpeed", "Lru/yandex/video/m3/player/RepeatMode;", "repeatMode", "setRepeatMode", "(Lru/yandex/video/m3/player/RepeatMode;)V", "getRepeatMode", "()Lru/yandex/video/m3/player/RepeatMode;", "getPlaybackSpeed", "Lru/yandex/video/m3/player/provider/ManifestVideoTrackNameProvider;", "getManifestVideoTrackNameProvider", "()Lru/yandex/video/m3/player/provider/ManifestVideoTrackNameProvider;", "getLiveOffset", "getExoLiveOffset", "()Ljava/lang/Long;", "getBufferMs", "Lru/yandex/video/m3/data/StartFromCacheInfo;", "getStartCacheInfo", "()Lru/yandex/video/m3/data/StartFromCacheInfo;", "", "Lru/yandex/video/m3/data/Ad;", "getAdsList", "()Ljava/util/List;", "Lru/yandex/video/m3/player/DependentLifecycleLoadControl;", "getLoadControl", "()Lru/yandex/video/m3/player/DependentLifecycleLoadControl;", "Lru/yandex/video/m3/player/ad/AdsLoaderHolder;", "getAdsLoaderHolder", "()Lru/yandex/video/m3/player/ad/AdsLoaderHolder;", "", "videoSessionId", "setVideoSessionId", "(Ljava/lang/String;)V", "", "sourceIndex", "setSourceIndex", "(I)V", "allowInitCodec", "Lru/yandex/video/m3/data/PlaybackViewState;", "getPlaybackViewState", "()Lru/yandex/video/m3/data/PlaybackViewState;", "getContentDrmType", "()Lru/yandex/video/m3/data/DrmType;", "T", "Lkotlin/Function0;", "block", "runOnExoThread", "(Lsls;)Ljava/lang/Object;", "windowIndex", "Lz8z0;", "getWindowByIndex", "(I)Lz8z0;", "isUserAction", "setPlaybackSpeedInternal", "(FZ)V", "Lkotlin/Function1;", "function", "notifyObservers", "(Ltls;)V", "Lru/yandex/video/m3/player/impl/tracks/RendererTrackSelector;", "getRendererTrackSelector", "(Lru/yandex/video/m3/player/tracks/TrackType;)Lru/yandex/video/m3/player/impl/tracks/RendererTrackSelector;", "rendererType", "getRendererTrackSelectorForRenderer", "(I)Lru/yandex/video/m3/player/impl/tracks/RendererTrackSelector;", "getMaxTargetBuffer", "Landroidx/media3/exoplayer/ExoPlayer;", "Lru/yandex/video/m3/source/MediaSourceFactory;", "Lvmh;", "Lru/yandex/video/m3/player/drm/ExoDrmSessionManagerFactory;", "Lru/yandex/video/m3/util/MarkedScheduledExecutorService;", "Lru/yandex/video/m3/player/impl/utils/ExoPlayerProperThreadRunner;", "Lru/yandex/video/m3/player/impl/BandwidthMeterWithProxyTransferListener;", "Lru/yandex/video/m3/player/AnalyticsListenerExtended;", "Lru/yandex/video/m3/player/impl/VideoComponent;", "Z", "Lru/yandex/video/m3/player/impl/codecs/LoggingMediaCodecSelector;", "Landroid/os/Looper;", "Lru/yandex/video/m3/player/impl/load_control/YandexLoadControl;", "Lru/yandex/video/m3/player/live/LiveSpeedControlObserver;", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/impl/managers/ExoRepeatModeManager;", "Lru/yandex/video/m3/player/provider/Consumer;", "Lru/yandex/video/m3/player/debug/ExoDroppedFramesListener;", "Lru/yandex/video/m3/player/report/logger/RecordLogger;", "Lru/yandex/video/m3/player/feature/PlaybackFeaturesProvider;", "Lru/yandex/video/m3/model/config/mediasource/LoadErrorHandlingConfig;", "Lru/yandex/video/m3/player/impl/bandwidth/BandwidthEstimateObserver;", "Lru/yandex/video/m3/player/impl/managers/AllowInitCodecManagerImpl;", "Lru/yandex/video/m3/player/parameters/StuckStalledConfig;", "Lru/yandex/video/m3/player/impl/ExoPlayerWrapper;", "exoPlayerWrapper", "Lru/yandex/video/m3/player/impl/ExoPlayerWrapper;", "Ljava/lang/String;", CA20Status.STATUS_USER_I, "Lru/yandex/video/m3/player/impl/utils/CurrentWindowStateProvider;", "currentWindowStateProvider", "Lru/yandex/video/m3/player/impl/utils/CurrentWindowStateProvider;", "Lru/yandex/video/m3/player/impl/ExoPlayerDelegate$InnerObserver;", "innerObserver", "Lru/yandex/video/m3/player/impl/ExoPlayerDelegate$InnerObserver;", "Lru/yandex/video/m3/player/impl/preload/PreloadPriorityController;", "preloadPriorityController", "Lru/yandex/video/m3/player/impl/preload/PreloadPriorityController;", "wasH264Prefer", "Lcom/google/common/collect/ImmutableList;", "preferredVideoMimeTypesBeforeForceH264", "Lcom/google/common/collect/ImmutableList;", "Lru/yandex/video/m3/player/impl/cache/StartFromCacheHelper;", "startFromCacheListener", "Lru/yandex/video/m3/player/impl/cache/StartFromCacheHelper;", "getStartFromCacheListener", "()Lru/yandex/video/m3/player/impl/cache/StartFromCacheHelper;", "setStartFromCacheListener", "(Lru/yandex/video/m3/player/impl/cache/StartFromCacheHelper;)V", "getStartFromCacheListener$annotations", "Lru/yandex/video/m3/player/impl/debug/StartPositionValidatorImpl;", "startPositionValidator", "Lru/yandex/video/m3/player/impl/debug/StartPositionValidatorImpl;", "Lru/yandex/video/m3/player/impl/listeners/InternalPlayerEventListener;", "playerEventListener", "Lru/yandex/video/m3/player/impl/listeners/InternalPlayerEventListener;", "getPlayerEventListener$video_player_internalRelease", "()Lru/yandex/video/m3/player/impl/listeners/InternalPlayerEventListener;", "setPlayerEventListener$video_player_internalRelease", "(Lru/yandex/video/m3/player/impl/listeners/InternalPlayerEventListener;)V", "getPlayerEventListener$video_player_internalRelease$annotations", "Lru/yandex/video/m3/player/impl/listeners/TracksChangeListener;", "trackChangesListener", "Lru/yandex/video/m3/player/impl/listeners/TracksChangeListener;", "Lru/yandex/video/m3/player/impl/listeners/TimelineChangeListener;", "timelineChangeListener", "Lru/yandex/video/m3/player/impl/listeners/TimelineChangeListener;", "getTimelineChangeListener$video_player_internalRelease", "()Lru/yandex/video/m3/player/impl/listeners/TimelineChangeListener;", "setTimelineChangeListener$video_player_internalRelease", "(Lru/yandex/video/m3/player/impl/listeners/TimelineChangeListener;)V", "getTimelineChangeListener$video_player_internalRelease$annotations", "Lru/yandex/video/m3/player/impl/listeners/InternalFrameDropObserver;", "frameDropListener", "Lru/yandex/video/m3/player/impl/listeners/InternalFrameDropObserver;", "Lru/yandex/video/m3/player/drm/PrepareDrm;", "tempWindow", "Lz8z0;", "Lru/yandex/video/m3/player/impl/listeners/InternalBandwidthMeterEventListener;", "internalBandwidthMeterEventListener", "Lru/yandex/video/m3/player/impl/listeners/InternalBandwidthMeterEventListener;", "Lru/yandex/video/m3/player/impl/listeners/DiffServerAndLocalTimeListener;", "diffServerAndLocalTimeListener", "Lru/yandex/video/m3/player/impl/listeners/DiffServerAndLocalTimeListener;", "Lru/yandex/video/m3/player/impl/listeners/InternalDrmSessionListener;", "internalDrmSessionListener", "Lru/yandex/video/m3/player/impl/listeners/InternalDrmSessionListener;", "Lru/yandex/video/m3/player/impl/utils/PlaybackViewManager;", "playbackViewManager", "Lru/yandex/video/m3/player/impl/utils/PlaybackViewManager;", "Lru/yandex/video/m3/player/impl/listeners/StuckStalledListener;", "stuckStalledListener", "Lru/yandex/video/m3/player/impl/listeners/StuckStalledListener;", "ExoThreadData", "InnerObserver", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExoPlayerDelegate implements PlayerDelegate<zxc0>, CurrentBufferLengthProvider, InternalMediaSourceEventListener.VideoTrackSelectionProvider, ExoAdsLoaderHolder {
    public static final int $stable = 8;
    private final boolean allowDisabledAudioTrackVariant;
    private final boolean allowDisabledTrackVariant;
    private final AllowInitCodecManagerImpl allowInitCodecManager;
    private final boolean allowPendingAudioTrackDisabling;
    private final AnalyticsListenerExtended analyticsListener;
    private final BandwidthEstimateObserver bandwidthEstimateObserver;
    private final BandwidthMeterWithProxyTransferListener bandwidthMeter;
    private final CurrentWindowStateProvider currentWindowStateProvider;
    private final DiffServerAndLocalTimeListener diffServerAndLocalTimeListener;
    private final ExoDrmSessionManagerFactory drmSessionManagerFactory;
    private final Consumer<DrmType> drmTypeConsumer;
    private final ExoDroppedFramesListener droppedFramesProvider;
    private final boolean eventLoggerEnabled;
    private final ExoPlayer exoPlayer;
    private final Looper exoPlayerLooper;
    private final ExoPlayerProperThreadRunner exoPlayerProperThreadRunner;
    private ExoPlayerWrapper exoPlayerWrapper;
    private final boolean expDoNotRecreateWrapper;
    private final InternalFrameDropObserver frameDropListener;
    private final boolean ignoreSeekOnSamePosition;
    private final InnerObserver innerObserver;
    private final InternalBandwidthMeterEventListener internalBandwidthMeterEventListener;
    private InternalDrmSessionListener internalDrmSessionListener;
    private final LiveSpeedControlObserver liveSpeedControlObserver;
    private final YandexLoadControl loadControl;
    private final LoadErrorHandlingConfig loadErrorHandlingConfig;
    private final LoggingMediaCodecSelector loggingMediaCodecSelector;
    private final MediaSourceFactory mediaSourceFactory;
    private final boolean monitorFrameDrops;
    private final ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher;
    private final ObserverDispatcher<PlaybackFeatureChangeListener> playbackFeaturesListeners;
    private final PlaybackFeaturesProvider playbackFeaturesProvider;
    private final PlaybackViewManager playbackViewManager;
    private InternalPlayerEventListener playerEventListener;
    private ImmutableList<String> preferredVideoMimeTypesBeforeForceH264;
    private final PreloadPriorityController preloadPriorityController;
    private PrepareDrm prepareDrm;
    private final RecordLogger recordLogger;
    private final ExoRepeatModeManager repeatModeManager;
    private final MarkedScheduledExecutorService scheduledExecutorService;
    private final boolean shouldHandleZeroStartPositionAsDefault;
    private int sourceIndex;
    private StartFromCacheHelper startFromCacheListener;
    private final StartPositionValidatorImpl startPositionValidator;
    private final StuckStalledConfig stuckStalledConfig;
    private StuckStalledListener stuckStalledListener;
    private z8z0 tempWindow;
    private TimelineChangeListener timelineChangeListener;
    private final TracksChangeListener trackChangesListener;
    private final vmh trackSelector;
    private final VideoComponent videoComponent;
    private String videoSessionId;
    private boolean wasH264Prefer;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/player/impl/ExoPlayerDelegate$ExoThreadData;", "", "position", "", "duration", "bufferSize", "isPlaying", "", "(JJJZ)V", "getBufferSize", "()J", "getDuration", "()Z", "getPosition", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ExoThreadData {
        private final long bufferSize;
        private final long duration;
        private final boolean isPlaying;
        private final long position;

        public ExoThreadData(long j, long j2, long j3, boolean z) {
            this.position = j;
            this.duration = j2;
            this.bufferSize = j3;
            this.isPlaying = z;
        }

        public static /* synthetic */ ExoThreadData copy$default(ExoThreadData exoThreadData, long j, long j2, long j3, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                j = exoThreadData.position;
            }
            long j4 = j;
            if ((i & 2) != 0) {
                j2 = exoThreadData.duration;
            }
            long j5 = j2;
            if ((i & 4) != 0) {
                j3 = exoThreadData.bufferSize;
            }
            long j6 = j3;
            if ((i & 8) != 0) {
                z = exoThreadData.isPlaying;
            }
            return exoThreadData.copy(j4, j5, j6, z);
        }

        /* renamed from: component1, reason: from getter */
        public final long getPosition() {
            return this.position;
        }

        /* renamed from: component2, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        /* renamed from: component3, reason: from getter */
        public final long getBufferSize() {
            return this.bufferSize;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsPlaying() {
            return this.isPlaying;
        }

        public final ExoThreadData copy(long position, long duration, long bufferSize, boolean isPlaying) {
            return new ExoThreadData(position, duration, bufferSize, isPlaying);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExoThreadData)) {
                return false;
            }
            ExoThreadData exoThreadData = (ExoThreadData) other;
            return this.position == exoThreadData.position && this.duration == exoThreadData.duration && this.bufferSize == exoThreadData.bufferSize && this.isPlaying == exoThreadData.isPlaying;
        }

        public final long getBufferSize() {
            return this.bufferSize;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final long getPosition() {
            return this.position;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isPlaying) + qv10.c(qv10.c(Long.hashCode(this.position) * 31, 31, this.duration), 31, this.bufferSize);
        }

        public final boolean isPlaying() {
            return this.isPlaying;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ExoThreadData(position=");
            sb.append(this.position);
            sb.append(", duration=");
            sb.append(this.duration);
            sb.append(", bufferSize=");
            sb.append(this.bufferSize);
            sb.append(", isPlaying=");
            return unr0.u(sb, this.isPlaying, ')');
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0006R\u001c\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/yandex/video/m3/player/impl/ExoPlayerDelegate$InnerObserver;", "Lru/yandex/video/m3/player/PlayerDelegate$Observer;", "<init>", "(Lru/yandex/video/m3/player/impl/ExoPlayerDelegate;)V", "Lzy11;", "onResumePlayback", "()V", "", "keepDecoders", "onStop", "(Z)V", "release", "Ljava/util/concurrent/Future;", "periodFuture", "Ljava/util/concurrent/Future;", "", "lastBufferSize", "J", "resumePlaybackTimestamp", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class InnerObserver implements PlayerDelegate.Observer {
        private long lastBufferSize;
        private Future<?> periodFuture;
        private long resumePlaybackTimestamp;

        public InnerObserver() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onResumePlayback$lambda$0(final ExoPlayerDelegate exoPlayerDelegate, final InnerObserver innerObserver) {
            final ExoThreadData exoThreadData = (ExoThreadData) exoPlayerDelegate.runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$InnerObserver$onResumePlayback$1$data$1
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final ExoPlayerDelegate.ExoThreadData invoke() {
                    z8z0 z8z0Var;
                    long currentPosition = ExoPlayerDelegate.this.exoPlayer.getCurrentPosition();
                    if (ExoPlayerDelegate.this.exoPlayer.isCurrentWindowLive()) {
                        a9z0 currentTimeline = ExoPlayerDelegate.this.exoPlayer.getCurrentTimeline();
                        int currentWindowIndex = ExoPlayerDelegate.this.exoPlayer.getCurrentWindowIndex();
                        z8z0Var = ExoPlayerDelegate.this.tempWindow;
                        z8z0 n = currentTimeline.n(currentWindowIndex, z8z0Var, 0L);
                        long lastObservedPosition = ExoPlayerDelegate.this.currentWindowStateProvider.getLastObservedPosition();
                        float playbackSpeed = ExoPlayerDelegate.this.getPlaybackSpeed();
                        if ((lastObservedPosition > tw21.l0(n.k) && playbackSpeed > 1.0f) || (lastObservedPosition < 0 && playbackSpeed < 1.0f)) {
                            ExoPlayerDelegate.this.setPlaybackSpeedInternal(1.0f, false);
                        }
                    }
                    return new ExoPlayerDelegate.ExoThreadData(currentPosition, ExoPlayerDelegate.this.exoPlayer.getDuration(), ExoPlayerDelegate.this.exoPlayer.getBufferedPosition() - ExoPlayerDelegate.this.exoPlayer.getContentPosition(), ExoPlayerDelegate.this.exoPlayer.isPlaying());
                }
            });
            exoPlayerDelegate.currentWindowStateProvider.setLastObservedPosition(exoThreadData.getPosition());
            exoPlayerDelegate.currentWindowStateProvider.setLastObservedDuration(exoThreadData.getDuration());
            if (exoPlayerDelegate.monitorFrameDrops) {
                exoPlayerDelegate.frameDropListener.checkFrameDrop(new tls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$InnerObserver$onResumePlayback$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void invoke(PlaybackException.FrameDropDetected frameDropDetected) {
                        long j;
                        HashSet H0;
                        Object failure;
                        j = ExoPlayerDelegate.InnerObserver.this.resumePlaybackTimestamp;
                        frameDropDetected.setResumePlaybackTimestamp(j);
                        ObserverDispatcher observerDispatcher = exoPlayerDelegate.observerDispatcher;
                        synchronized (observerDispatcher.getObservers()) {
                            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
                        }
                        Iterator it = H0.iterator();
                        while (it.hasNext()) {
                            try {
                                ((PlayerDelegate.Observer) it.next()).onError(frameDropDetected);
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

                    @Override // defpackage.tls
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((PlaybackException.FrameDropDetected) obj);
                        return zy11.a;
                    }
                });
            }
            exoPlayerDelegate.runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$InnerObserver$onResumePlayback$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m774invoke() {
                    long j;
                    HashSet H0;
                    Object failure;
                    HashSet H02;
                    Object failure2;
                    if (ExoPlayerDelegate.ExoThreadData.this.isPlaying()) {
                        ExoPlayerDelegate exoPlayerDelegate2 = exoPlayerDelegate;
                        ObserverDispatcher observerDispatcher = exoPlayerDelegate2.observerDispatcher;
                        synchronized (observerDispatcher.getObservers()) {
                            H02 = kotlin.collections.a.H0(observerDispatcher.getObservers());
                        }
                        Iterator it = H02.iterator();
                        while (it.hasNext()) {
                            try {
                                ((PlayerDelegate.Observer) it.next()).onPlaybackProgress(exoPlayerDelegate2.currentWindowStateProvider.getLastObservedPosition());
                                failure2 = zy11.a;
                            } catch (Throwable th) {
                                failure2 = new Result.Failure(th);
                            }
                            Throwable a = Result.a(failure2);
                            if (a != null) {
                                h5z0.a.f(a, "notifyObservers", new Object[0]);
                            }
                        }
                    }
                    j = innerObserver.lastBufferSize;
                    if (j != ExoPlayerDelegate.ExoThreadData.this.getBufferSize()) {
                        ExoPlayerDelegate exoPlayerDelegate3 = exoPlayerDelegate;
                        ExoPlayerDelegate.ExoThreadData exoThreadData2 = ExoPlayerDelegate.ExoThreadData.this;
                        ObserverDispatcher observerDispatcher2 = exoPlayerDelegate3.observerDispatcher;
                        synchronized (observerDispatcher2.getObservers()) {
                            H0 = kotlin.collections.a.H0(observerDispatcher2.getObservers());
                        }
                        Iterator it2 = H0.iterator();
                        while (it2.hasNext()) {
                            try {
                                ((PlayerDelegate.Observer) it2.next()).onBufferSizeChanged(exoThreadData2.getBufferSize());
                                failure = zy11.a;
                            } catch (Throwable th2) {
                                failure = new Result.Failure(th2);
                            }
                            Throwable a2 = Result.a(failure);
                            if (a2 != null) {
                                h5z0.a.f(a2, "notifyObservers", new Object[0]);
                            }
                        }
                        innerObserver.lastBufferSize = ExoPlayerDelegate.ExoThreadData.this.getBufferSize();
                    }
                }

                @Override // defpackage.sls
                public /* bridge */ /* synthetic */ Object invoke() {
                    m774invoke();
                    return zy11.a;
                }
            });
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onResumePlayback() {
            this.resumePlaybackTimestamp = System.currentTimeMillis();
            Future<?> future = this.periodFuture;
            if (future == null) {
                MarkedScheduledExecutorService markedScheduledExecutorService = ExoPlayerDelegate.this.scheduledExecutorService;
                final ExoPlayerDelegate exoPlayerDelegate = ExoPlayerDelegate.this;
                future = ExecutorsUtilKt.scheduleAtFixedRateSafely(markedScheduledExecutorService, new Runnable() { // from class: ru.yandex.video.m3.player.impl.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        ExoPlayerDelegate.InnerObserver.onResumePlayback$lambda$0(ExoPlayerDelegate.this, this);
                    }
                }, 0L, 1L, TimeUnit.SECONDS);
            }
            this.periodFuture = future;
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onStop(boolean keepDecoders) {
            release();
        }

        public final void release() {
            Future<?> future = this.periodFuture;
            if (future != null) {
                future.cancel(false);
            }
            this.periodFuture = null;
            this.lastBufferSize = 0L;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrackType.values().length];
            try {
                iArr[TrackType.Video.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrackType.Audio.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrackType.Subtitles.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TrackType.Other.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExoPlayerDelegate(ExoPlayer exoPlayer, MediaSourceFactory mediaSourceFactory, vmh vmhVar, ExoDrmSessionManagerFactory exoDrmSessionManagerFactory, MarkedScheduledExecutorService markedScheduledExecutorService, ExoPlayerProperThreadRunner exoPlayerProperThreadRunner, BandwidthMeterWithProxyTransferListener bandwidthMeterWithProxyTransferListener, AnalyticsListenerExtended analyticsListenerExtended, VideoComponent videoComponent, boolean z, LoggingMediaCodecSelector loggingMediaCodecSelector, Looper looper, YandexLoadControl yandexLoadControl, boolean z2, LiveSpeedControlObserver liveSpeedControlObserver, PreloadPrioritySettings preloadPrioritySettings, ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher, ExoRepeatModeManager exoRepeatModeManager, Consumer<DrmType> consumer, ExoDroppedFramesListener exoDroppedFramesListener, RecordLogger recordLogger, boolean z3, PlaybackFeaturesProvider playbackFeaturesProvider, ObserverDispatcher<PlaybackFeatureChangeListener> observerDispatcher2, boolean z4, boolean z5, LoadErrorHandlingConfig loadErrorHandlingConfig, BandwidthEstimateObserver bandwidthEstimateObserver, boolean z6, boolean z7, AllowInitCodecManagerImpl allowInitCodecManagerImpl, boolean z8, StuckStalledConfig stuckStalledConfig) {
        this.exoPlayer = exoPlayer;
        this.mediaSourceFactory = mediaSourceFactory;
        this.trackSelector = vmhVar;
        this.drmSessionManagerFactory = exoDrmSessionManagerFactory;
        this.scheduledExecutorService = markedScheduledExecutorService;
        this.exoPlayerProperThreadRunner = exoPlayerProperThreadRunner;
        this.bandwidthMeter = bandwidthMeterWithProxyTransferListener;
        this.analyticsListener = analyticsListenerExtended;
        this.videoComponent = videoComponent;
        this.eventLoggerEnabled = z;
        this.loggingMediaCodecSelector = loggingMediaCodecSelector;
        this.exoPlayerLooper = looper;
        this.loadControl = yandexLoadControl;
        this.expDoNotRecreateWrapper = z2;
        this.liveSpeedControlObserver = liveSpeedControlObserver;
        this.observerDispatcher = observerDispatcher;
        this.repeatModeManager = exoRepeatModeManager;
        this.drmTypeConsumer = consumer;
        this.droppedFramesProvider = exoDroppedFramesListener;
        this.recordLogger = recordLogger;
        this.shouldHandleZeroStartPositionAsDefault = z3;
        this.playbackFeaturesProvider = playbackFeaturesProvider;
        this.playbackFeaturesListeners = observerDispatcher2;
        this.allowDisabledTrackVariant = z4;
        this.monitorFrameDrops = z5;
        this.loadErrorHandlingConfig = loadErrorHandlingConfig;
        this.bandwidthEstimateObserver = bandwidthEstimateObserver;
        this.allowDisabledAudioTrackVariant = z6;
        this.allowPendingAudioTrackDisabling = z7;
        this.allowInitCodecManager = allowInitCodecManagerImpl;
        this.ignoreSeekOnSamePosition = z8;
        this.stuckStalledConfig = stuckStalledConfig;
        this.videoSessionId = "";
        CurrentWindowStateProvider currentWindowStateProvider = new CurrentWindowStateProvider(exoPlayer);
        this.currentWindowStateProvider = currentWindowStateProvider;
        InnerObserver innerObserver = new InnerObserver();
        this.innerObserver = innerObserver;
        TimeProvider timeProvider = null;
        Object[] objArr = 0;
        PreloadPriorityControllerImpl preloadPriorityControllerImpl = preloadPrioritySettings != null ? new PreloadPriorityControllerImpl(exoPlayer, preloadPrioritySettings) : null;
        this.preloadPriorityController = preloadPriorityControllerImpl;
        this.preferredVideoMimeTypesBeforeForceH264 = ImmutableList.p();
        this.startFromCacheListener = new StartFromCacheHelper(observerDispatcher, looper);
        StartPositionValidatorImpl startPositionValidatorImpl = new StartPositionValidatorImpl(recordLogger);
        this.startPositionValidator = startPositionValidatorImpl;
        this.playerEventListener = new InternalPlayerEventListener(analyticsListenerExtended, observerDispatcher, currentWindowStateProvider);
        this.trackChangesListener = new TracksChangeListener(analyticsListenerExtended, vmhVar, observerDispatcher);
        this.timelineChangeListener = new TimelineChangeListener(exoPlayer, this, observerDispatcher, vmhVar, currentWindowStateProvider, startPositionValidatorImpl);
        this.frameDropListener = new InternalFrameDropObserver(exoPlayer.getApplicationLooper());
        this.tempWindow = new z8z0();
        InternalBandwidthMeterEventListener internalBandwidthMeterEventListener = new InternalBandwidthMeterEventListener(observerDispatcher);
        this.internalBandwidthMeterEventListener = internalBandwidthMeterEventListener;
        this.diffServerAndLocalTimeListener = new DiffServerAndLocalTimeListener(timeProvider, 1, objArr == true ? 1 : 0);
        this.internalDrmSessionListener = new InternalDrmSessionListener(observerDispatcher);
        this.playbackViewManager = new PlaybackViewManager();
        runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate.1
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m773invoke() {
                HashSet H0;
                Object failure;
                ExoPlayerDelegate.this.exoPlayer.addListener(ExoPlayerDelegate.this.getPlayerEventListener());
                ExoPlayerDelegate.this.exoPlayer.addListener(ExoPlayerDelegate.this.trackChangesListener);
                ExoPlayerDelegate.this.exoPlayer.addListener(ExoPlayerDelegate.this.getTimelineChangeListener());
                ExoPlayerDelegate.this.exoPlayer.addListener(ExoPlayerDelegate.this.repeatModeManager);
                ExoPlayerDelegate.this.exoPlayer.addAnalyticsListener(ExoPlayerDelegate.this.droppedFramesProvider);
                ExoPlayerDelegate.this.exoPlayer.addAnalyticsListener(new InternalAnalyticsListener(ExoPlayerDelegate.this.observerDispatcher, ExoPlayerDelegate.this.loggingMediaCodecSelector));
                ExoPlayerDelegate.this.exoPlayer.addAnalyticsListener(ExoPlayerDelegate.this.diffServerAndLocalTimeListener);
                ExoPlayerDelegate.this.exoPlayer.addAnalyticsListener(new CorrectLooperUsageListener(ExoPlayerDelegate.this.exoPlayerLooper, ExoPlayerDelegate.this.observerDispatcher));
                ExoPlayerDelegate.this.exoPlayer.addAnalyticsListener(ExoPlayerDelegate.this.getStartFromCacheListener());
                if (ExoPlayerDelegate.this.eventLoggerEnabled) {
                    ExoPlayer exoPlayer2 = ExoPlayerDelegate.this.exoPlayer;
                    vmh unused = ExoPlayerDelegate.this.trackSelector;
                    exoPlayer2.addAnalyticsListener(new ego(0));
                }
                if (ExoPlayerDelegate.this.monitorFrameDrops) {
                    ExoPlayerDelegate.this.exoPlayer.addAnalyticsListener(ExoPlayerDelegate.this.frameDropListener);
                }
                if (ExoPlayerDelegate.this.stuckStalledConfig != null) {
                    YandexLoadControl yandexLoadControl2 = ExoPlayerDelegate.this.loadControl;
                    ExoPlayerDelegate exoPlayerDelegate = ExoPlayerDelegate.this;
                    if (yandexLoadControl2 != null) {
                        StuckStalledListener stuckStalledListener = new StuckStalledListener(exoPlayerDelegate.loadControl, ExoPlayerDelegate.this.exoPlayer, ExoPlayerDelegate.this.observerDispatcher, ExoPlayerDelegate.this.stuckStalledConfig, ExoPlayerDelegate.this.exoPlayerLooper);
                        ExoPlayerDelegate.this.exoPlayer.addListener(stuckStalledListener);
                        exoPlayerDelegate.stuckStalledListener = stuckStalledListener;
                        return;
                    }
                    ObserverDispatcher observerDispatcher3 = exoPlayerDelegate.observerDispatcher;
                    synchronized (observerDispatcher3.getObservers()) {
                        H0 = kotlin.collections.a.H0(observerDispatcher3.getObservers());
                    }
                    Iterator it = H0.iterator();
                    while (it.hasNext()) {
                        try {
                            ((PlayerDelegate.Observer) it.next()).onNonFatalError(new PlaybackException.ErrorStalledStuck(new IllegalArgumentException("loadControl is null"), LoadControlState.INSTANCE.getEMPTY()));
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
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m773invoke();
                return zy11.a;
            }
        });
        addObserver(innerObserver);
        if (preloadPriorityControllerImpl != null) {
            addObserver(preloadPriorityControllerImpl);
        }
        bandwidthMeterWithProxyTransferListener.addEventListener(exoPlayerProperThreadRunner.getHandler(), internalBandwidthMeterEventListener);
        if (bandwidthEstimateObserver != null) {
            bandwidthEstimateObserver.start(exoPlayerProperThreadRunner.getHandler(), bandwidthMeterWithProxyTransferListener);
        }
        bandwidthMeterWithProxyTransferListener.setExternalTransferListener(this.startFromCacheListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DrmType getContentDrmType() {
        DrmType currentDrmSessionType = this.internalDrmSessionListener.getCurrentDrmSessionType(TrackType.Video);
        if (currentDrmSessionType != null || (currentDrmSessionType = this.internalDrmSessionListener.getCurrentDrmSessionType(TrackType.Audio)) != null) {
            return currentDrmSessionType;
        }
        if (this.prepareDrm == null) {
            return DrmType.None;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getMaxTargetBuffer() {
        LoadControlState loadControlState;
        LoadControlBufferState bufferState;
        YandexLoadControl yandexLoadControl = this.loadControl;
        if (yandexLoadControl == null || (loadControlState = yandexLoadControl.getLoadControlState()) == null || (bufferState = loadControlState.getBufferState()) == null) {
            return -1L;
        }
        return bufferState.getLastEstimatedMaxTargetBuffer();
    }

    public static /* synthetic */ void getPlayerEventListener$video_player_internalRelease$annotations() {
    }

    private final RendererTrackSelector getRendererTrackSelector(TrackType trackType) {
        int i = WhenMappings.$EnumSwitchMapping$0[trackType.ordinal()];
        if (i == 1) {
            return getRendererTrackSelectorForRenderer(2);
        }
        if (i == 2) {
            return getRendererTrackSelectorForRenderer(1);
        }
        if (i == 3) {
            return getRendererTrackSelectorForRenderer(3);
        }
        if (i == 4) {
            return getRendererTrackSelectorForRenderer(0);
        }
        w511.b();
        return null;
    }

    private final RendererTrackSelector getRendererTrackSelectorForRenderer(final int rendererType) {
        return new ExoPlayerRendererTrackSelector(this.trackSelector, rendererType, new sls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$getRendererTrackSelectorForRenderer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Integer invoke() {
                int i;
                Object obj;
                xv00 currentMappedTrackInfo = ExoPlayerDelegate.this.trackSelector.getCurrentMappedTrackInfo();
                if (currentMappedTrackInfo != null) {
                    final ExoPlayerDelegate exoPlayerDelegate = ExoPlayerDelegate.this;
                    int i2 = rendererType;
                    c6w it = y6i0.n(0, currentMappedTrackInfo.a).iterator();
                    while (true) {
                        if (!it.c) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        final int intValue = ((Number) obj).intValue();
                        if (currentMappedTrackInfo.c[intValue].a != 0 && ((Number) exoPlayerDelegate.runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$getRendererTrackSelectorForRenderer$1$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.sls
                            public final Integer invoke() {
                                return Integer.valueOf(ExoPlayerDelegate.this.exoPlayer.getRendererType(intValue));
                            }
                        })).intValue() == i2) {
                            break;
                        }
                    }
                    Integer num = (Integer) obj;
                    if (num != null) {
                        i = num.intValue();
                        return Integer.valueOf(i);
                    }
                }
                i = -1;
                return Integer.valueOf(i);
            }
        }, new tls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$getRendererTrackSelectorForRenderer$2
            {
                super(1);
            }

            public final loo invoke(final int i) {
                xv00 currentMappedTrackInfo = ExoPlayerDelegate.this.trackSelector.getCurrentMappedTrackInfo();
                if (currentMappedTrackInfo != null) {
                    if (i < 0 || i > currentMappedTrackInfo.a - 1) {
                        currentMappedTrackInfo = null;
                    }
                    if (currentMappedTrackInfo != null) {
                        final ExoPlayerDelegate exoPlayerDelegate = ExoPlayerDelegate.this;
                        return (loo) exoPlayerDelegate.runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$getRendererTrackSelectorForRenderer$2$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.sls
                            public final loo invoke() {
                                m001 currentTrackSelections = ExoPlayerDelegate.this.exoPlayer.getCurrentTrackSelections();
                                return (loo) currentTrackSelections.a[i];
                            }
                        });
                    }
                }
                return null;
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new sls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$getRendererTrackSelectorForRenderer$3
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m775invoke() {
                HashSet H0;
                Object failure;
                ObserverDispatcher observerDispatcher = ExoPlayerDelegate.this.observerDispatcher;
                synchronized (observerDispatcher.getObservers()) {
                    H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
                }
                Iterator it = H0.iterator();
                while (it.hasNext()) {
                    try {
                        ((PlayerDelegate.Observer) it.next()).onTracksSelected();
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

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m775invoke();
                return zy11.a;
            }
        }, this.allowPendingAudioTrackDisabling);
    }

    public static /* synthetic */ void getStartFromCacheListener$annotations() {
    }

    public static /* synthetic */ void getTimelineChangeListener$video_player_internalRelease$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z8z0 getWindowByIndex(int windowIndex) {
        a9z0 currentTimeline = this.exoPlayer.getCurrentTimeline();
        if (currentTimeline.q()) {
            currentTimeline = null;
        }
        if (currentTimeline != null) {
            return currentTimeline.n(windowIndex, this.tempWindow, 0L);
        }
        return null;
    }

    private final void notifyObservers(tls function) {
        HashSet H0;
        Object failure;
        ObserverDispatcher observerDispatcher = this.observerDispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                failure = function.invoke(it.next());
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> T runOnExoThread(sls block) {
        return (T) this.exoPlayerProperThreadRunner.runOnProperThread(block);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPlaybackSpeedInternal(final float speed, boolean isUserAction) {
        HashSet H0;
        Object failure;
        runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$setPlaybackSpeedInternal$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m782invoke() {
                ExoPlayerDelegate.this.exoPlayer.setPlaybackParameters(new lxc0(speed, ExoPlayerDelegate.this.exoPlayer.getPlaybackParameters().b));
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m782invoke();
                return zy11.a;
            }
        });
        ObserverDispatcher observerDispatcher = this.observerDispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerDelegate.Observer) it.next()).onPlaybackSpeedChanged(speed, isUserAction);
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

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public void addObserver(PlayerDelegate.Observer observer) {
        this.analyticsListener.onAddObserver();
        this.observerDispatcher.add((ObserverDispatcher<PlayerDelegate.Observer>) observer);
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public void allowInitCodec() {
        AllowInitCodecManagerImpl allowInitCodecManagerImpl = this.allowInitCodecManager;
        if (allowInitCodecManagerImpl == null) {
            return;
        }
        allowInitCodecManagerImpl.setAllowInitCodec(true);
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public synchronized zxc0 extractPlayer(YandexPlayer<zxc0> player) {
        ExoPlayerWrapper exoPlayerWrapper;
        try {
            if (this.expDoNotRecreateWrapper) {
                exoPlayerWrapper = this.exoPlayerWrapper;
                if (exoPlayerWrapper != null) {
                    if (!jl40.l(exoPlayerWrapper.getYandexPlayer$video_player_internalRelease(), player)) {
                        exoPlayerWrapper = null;
                    }
                    if (exoPlayerWrapper == null) {
                    }
                }
                exoPlayerWrapper = new ExoPlayerWrapper(player, this.exoPlayer, this.playbackViewManager, this.videoComponent);
                this.exoPlayerWrapper = exoPlayerWrapper;
            } else {
                exoPlayerWrapper = new ExoPlayerWrapper(player, this.exoPlayer, this.playbackViewManager, this.videoComponent);
            }
        } finally {
        }
        return exoPlayerWrapper;
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public List<Ad> getAdsList() {
        return EmptyList.a;
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public AdsLoaderHolder getAdsLoaderHolder() {
        return this;
    }

    @Override // ru.yandex.video.m3.player.CurrentBufferLengthProvider
    public long getBufferMs() {
        return ((Number) runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$getBufferMs$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Long invoke() {
                return Long.valueOf(ExoPlayerDelegate.this.exoPlayer.getTotalBufferedDuration());
            }
        })).longValue();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public PlayerDelegate.Position getBufferedPosition() {
        return (PlayerDelegate.Position) runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$getBufferedPosition$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final PlayerDelegate.Position invoke() {
                PlayerDelegate.Companion companion = PlayerDelegate.INSTANCE;
                final ExoPlayerDelegate exoPlayerDelegate = ExoPlayerDelegate.this;
                return companion.Position(new tls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$getBufferedPosition$1.1
                    {
                        super(1);
                    }

                    public final void invoke(PlayerDelegate.Position.Builder builder) {
                        builder.setCurrentPosition(Long.valueOf(Math.max(0L, ExoPlayerDelegate.this.exoPlayer.getBufferedPosition())));
                        builder.setCurrentWindowIndex(Integer.valueOf(ExoPlayerDelegate.this.exoPlayer.getCurrentWindowIndex()));
                    }

                    @Override // defpackage.tls
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((PlayerDelegate.Position.Builder) obj);
                        return zy11.a;
                    }
                });
            }
        });
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public long getDuration() {
        return ((Number) runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$getDuration$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Long invoke() {
                Long valueOf = Long.valueOf(ExoPlayerDelegate.this.exoPlayer.getDuration());
                if (valueOf.longValue() == -9223372036854775807L) {
                    valueOf = null;
                }
                return Long.valueOf(valueOf != null ? valueOf.longValue() : -9223372036854775807L);
            }
        })).longValue();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public Long getExoLiveOffset() {
        return (Long) runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$getExoLiveOffset$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Long invoke() {
                return Long.valueOf(ExoPlayerDelegate.this.exoPlayer.getCurrentLiveOffset());
            }
        });
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public PlayerDelegate.Position getLiveEdgePosition() {
        return (PlayerDelegate.Position) runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$getLiveEdgePosition$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final PlayerDelegate.Position invoke() {
                final z8z0 windowByIndex;
                final int c = ExoPlayerDelegate.this.exoPlayer.getCurrentTimeline().c(false);
                windowByIndex = ExoPlayerDelegate.this.getWindowByIndex(c);
                return (windowByIndex != null && windowByIndex.h && windowByIndex.g) ? PlayerDelegate.INSTANCE.Position(new tls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$getLiveEdgePosition$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void invoke(PlayerDelegate.Position.Builder builder) {
                        builder.setCurrentPosition(Long.valueOf(tw21.l0(z8z0.this.k)));
                        builder.setCurrentWindowIndex(Integer.valueOf(c));
                    }

                    @Override // defpackage.tls
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((PlayerDelegate.Position.Builder) obj);
                        return zy11.a;
                    }
                }) : PlayerDelegate.INSTANCE.Position(new tls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$getLiveEdgePosition$1.2
                    public final void invoke(PlayerDelegate.Position.Builder builder) {
                        builder.setCurrentPosition(-1L);
                        builder.setCurrentWindowIndex(-1);
                    }

                    @Override // defpackage.tls
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((PlayerDelegate.Position.Builder) obj);
                        return zy11.a;
                    }
                });
            }
        });
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public long getLiveOffset() {
        return ((Number) runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$getLiveOffset$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Long invoke() {
                LiveSpeedControlObserver liveSpeedControlObserver;
                long j = -9223372036854775807L;
                if (ExoPlayerDelegate.this.getTimelineChangeListener().getVideoType() != VideoType.VOD) {
                    long currentPosition = ExoPlayerDelegate.this.getPosition().getCurrentPosition() + ExoPlayerDelegate.this.getTimelineLeftEdge();
                    Long timeDiff = ExoPlayerDelegate.this.diffServerAndLocalTimeListener.getTimeDiff();
                    Long valueOf = (currentPosition <= 0 || timeDiff == null) ? null : Long.valueOf(Math.max(timeDiff.longValue() - currentPosition, 0L));
                    liveSpeedControlObserver = ExoPlayerDelegate.this.liveSpeedControlObserver;
                    if (liveSpeedControlObserver != null) {
                        liveSpeedControlObserver.setExoPlayerLiveOffset(ExoPlayerDelegate.this.exoPlayer.getCurrentLiveOffset(), valueOf != null ? Long.valueOf(valueOf.longValue() - ExoPlayerDelegate.this.exoPlayer.getCurrentLiveOffset()) : null);
                    }
                    if (valueOf != null) {
                        j = valueOf.longValue();
                    }
                }
                return Long.valueOf(j);
            }
        })).longValue();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public DependentLifecycleLoadControl getLoadControl() {
        YandexLoadControl yandexLoadControl = this.loadControl;
        return yandexLoadControl != null ? yandexLoadControl : new DependentLifecycleLoadControl() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$getLoadControl$1
            @Override // ru.yandex.video.m3.player.DependentLifecycleLoadControl
            public void release(YandexPlayer<?> yandexPlayer) {
            }

            @Override // ru.yandex.video.m3.player.DependentLifecycleLoadControl
            public void start(YandexPlayer<?> yandexPlayer) {
            }
        };
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public ManifestVideoTrackNameProvider getManifestVideoTrackNameProvider() {
        return this.timelineChangeListener.getVideoTrackNameFromManifestParser();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public float getPlaybackSpeed() {
        return ((Number) runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$getPlaybackSpeed$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Float invoke() {
                return Float.valueOf(ExoPlayerDelegate.this.exoPlayer.getPlaybackParameters().a);
            }
        })).floatValue();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    @jxi
    public PlaybackStats getPlaybackStats() {
        return (PlaybackStats) runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$getPlaybackStats$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final PlaybackStats invoke() {
                LiveSpeedControlObserver liveSpeedControlObserver;
                long maxTargetBuffer;
                DrmType contentDrmType;
                Consumer consumer;
                if (ExoPlayerDelegate.this.exoPlayer.getPlaybackState() == 1) {
                    return null;
                }
                long currentPosition = ExoPlayerDelegate.this.getPosition().getCurrentPosition();
                long currentPosition2 = ExoPlayerDelegate.this.getBufferedPosition().getCurrentPosition();
                long liveOffset = ExoPlayerDelegate.this.getLiveOffset();
                liveSpeedControlObserver = ExoPlayerDelegate.this.liveSpeedControlObserver;
                long currentTargetOffsetMs = liveSpeedControlObserver != null ? liveSpeedControlObserver.getCurrentTargetOffsetMs() : -9223372036854775807L;
                long currentPosition3 = ExoPlayerDelegate.this.getLiveEdgePosition().getCurrentPosition();
                boolean isPlaying = ExoPlayerDelegate.this.isPlaying();
                VideoType videoType = ExoPlayerDelegate.this.getVideoType();
                boolean playWhenReady = ExoPlayerDelegate.this.exoPlayer.getPlayWhenReady();
                long duration = ExoPlayerDelegate.this.getDuration();
                maxTargetBuffer = ExoPlayerDelegate.this.getMaxTargetBuffer();
                contentDrmType = ExoPlayerDelegate.this.getContentDrmType();
                final ExoPlayerDelegate exoPlayerDelegate = ExoPlayerDelegate.this;
                PlaybackStats PlaybackStats = PlaybackStatsKt.PlaybackStats(currentPosition2, liveOffset, currentTargetOffsetMs, currentPosition3, null, isPlaying, currentPosition, videoType, playWhenReady, duration, maxTargetBuffer, contentDrmType, new tls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$getPlaybackStats$1.1
                    {
                        super(1);
                    }

                    public final void invoke(PlaybackStats.Builder builder) {
                        builder.setExoPlayerPlaybackState(Integer.valueOf(ExoPlayerDelegate.this.exoPlayer.getPlaybackState()));
                    }

                    @Override // defpackage.tls
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((PlaybackStats.Builder) obj);
                        return zy11.a;
                    }
                });
                consumer = ExoPlayerDelegate.this.drmTypeConsumer;
                consumer.accept(PlaybackStats.getDrmType());
                return PlaybackStats;
            }
        });
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public PlaybackViewState getPlaybackViewState() {
        return PlaybackViewStateKt.PlaybackViewState(new tls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$getPlaybackViewState$1
            {
                super(1);
            }

            public final void invoke(PlaybackViewState.Builder builder) {
                PlaybackViewManager playbackViewManager;
                PlaybackViewManager playbackViewManager2;
                playbackViewManager = ExoPlayerDelegate.this.playbackViewManager;
                builder.setVisible(Boolean.valueOf(playbackViewManager.isPlaybackViewVisible()));
                playbackViewManager2 = ExoPlayerDelegate.this.playbackViewManager;
                builder.m738setSurfaceType(playbackViewManager2.getSurfaceType());
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PlaybackViewState.Builder) obj);
                return zy11.a;
            }
        });
    }

    /* renamed from: getPlayerEventListener$video_player_internalRelease, reason: from getter */
    public final InternalPlayerEventListener getPlayerEventListener() {
        return this.playerEventListener;
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public PlayerDelegate.Position getPosition() {
        return (PlayerDelegate.Position) runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$getPosition$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final PlayerDelegate.Position invoke() {
                PlayerDelegate.Companion companion = PlayerDelegate.INSTANCE;
                final ExoPlayerDelegate exoPlayerDelegate = ExoPlayerDelegate.this;
                return companion.Position(new tls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$getPosition$1.1
                    {
                        super(1);
                    }

                    public final void invoke(PlayerDelegate.Position.Builder builder) {
                        builder.setCurrentPosition(Long.valueOf(Math.max(0L, ExoPlayerDelegate.this.exoPlayer.getCurrentPosition())));
                        builder.setCurrentWindowIndex(Integer.valueOf(ExoPlayerDelegate.this.exoPlayer.getCurrentWindowIndex()));
                    }

                    @Override // defpackage.tls
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((PlayerDelegate.Position.Builder) obj);
                        return zy11.a;
                    }
                });
            }
        });
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public RepeatMode getRepeatMode() {
        return this.repeatModeManager.getRepeatMode();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public StartFromCacheInfo getStartCacheInfo() {
        return this.startFromCacheListener.getStartFromCacheInfo();
    }

    public final StartFromCacheHelper getStartFromCacheListener() {
        return this.startFromCacheListener;
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public StreamType getStreamType() {
        return (StreamType) runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$getStreamType$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final StreamType invoke() {
                return ExoPlayerDelegate.this.getTimelineChangeListener().getStreamType();
            }
        });
    }

    /* renamed from: getTimelineChangeListener$video_player_internalRelease, reason: from getter */
    public final TimelineChangeListener getTimelineChangeListener() {
        return this.timelineChangeListener;
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public long getTimelineLeftEdge() {
        final StreamType streamType = this.timelineChangeListener.getStreamType();
        return ((Number) runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$getTimelineLeftEdge$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Long invoke() {
                z8z0 windowByIndex;
                Long l;
                StreamType streamType2 = StreamType.this;
                StreamType streamType3 = StreamType.Dash;
                ExoPlayerDelegate exoPlayerDelegate = this;
                long j = 0;
                if (streamType2 == streamType3) {
                    Object currentManifest = exoPlayerDelegate.exoPlayer.getCurrentManifest();
                    egg eggVar = currentManifest instanceof egg ? (egg) currentManifest : null;
                    Long valueOf = eggVar != null ? Long.valueOf(eggVar.publishTimeMs) : null;
                    l = (valueOf == null || valueOf.longValue() != -9223372036854775807L) ? valueOf : null;
                    if (l != null) {
                        j = l.longValue();
                    }
                } else {
                    windowByIndex = exoPlayerDelegate.getWindowByIndex(exoPlayerDelegate.exoPlayer.getCurrentWindowIndex());
                    if (windowByIndex != null) {
                        Long valueOf2 = Long.valueOf(windowByIndex.e);
                        l = valueOf2.longValue() != -9223372036854775807L ? valueOf2 : null;
                        if (l != null) {
                            j = l.longValue();
                        }
                    }
                }
                return Long.valueOf(j);
            }
        })).longValue();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public Track getTrack(TrackType trackType, ResourceProvider resourceProvider, PlayerTrackNameProvider trackNameProvider) {
        int i = WhenMappings.$EnumSwitchMapping$0[trackType.ordinal()];
        boolean z = true;
        if (i == 1) {
            RendererTrackSelector rendererTrackSelector = getRendererTrackSelector(trackType);
            if (trackNameProvider == null) {
                trackNameProvider = new LabelVideoTrackNameProvider(resourceProvider, getManifestVideoTrackNameProvider());
            }
            return new ExoPlayerTrack(trackType, rendererTrackSelector, trackNameProvider, this.allowDisabledTrackVariant);
        }
        if (i != 2) {
            RendererTrackSelector rendererTrackSelector2 = getRendererTrackSelector(trackType);
            if (trackNameProvider == null) {
                trackNameProvider = new DefaultPlayerTrackNameProvider(resourceProvider);
            }
            return new ExoPlayerTrack(trackType, rendererTrackSelector2, trackNameProvider, this.allowDisabledTrackVariant);
        }
        RendererTrackSelector rendererTrackSelector3 = getRendererTrackSelector(trackType);
        if (trackNameProvider == null) {
            trackNameProvider = new DefaultPlayerTrackNameProvider(resourceProvider);
        }
        if (!this.allowDisabledTrackVariant && !this.allowDisabledAudioTrackVariant) {
            z = false;
        }
        return new ExoPlayerTrack(trackType, rendererTrackSelector3, trackNameProvider, z);
    }

    @Override // ru.yandex.video.m3.player.impl.listeners.InternalMediaSourceEventListener.VideoTrackSelectionProvider
    public RendererTrackSelector.Selection getVideoTrackSelection() {
        return getRendererTrackSelector(TrackType.Video).getSelection();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public VideoType getVideoType() {
        return (VideoType) runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$getVideoType$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final VideoType invoke() {
                return ExoPlayerDelegate.this.getTimelineChangeListener().getVideoType();
            }
        });
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public float getVolume() {
        return ((Number) runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$getVolume$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Float invoke() {
                return Float.valueOf(ExoPlayerDelegate.this.exoPlayer.getVolume());
            }
        })).floatValue();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public boolean isMuted() {
        return ((Boolean) runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$isMuted$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Boolean invoke() {
                return Boolean.valueOf(ExoPlayerDelegate.this.exoPlayer.isDeviceMuted());
            }
        })).booleanValue();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public boolean isPlaying() {
        return ((Boolean) runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$isPlaying$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Boolean invoke() {
                return Boolean.valueOf(ExoPlayerDelegate.this.exoPlayer.getPlaybackState() == 3 && ExoPlayerDelegate.this.exoPlayer.getPlayWhenReady());
            }
        })).booleanValue();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public boolean isPlayingAd() {
        return ((Boolean) runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$isPlayingAd$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Boolean invoke() {
                return Boolean.valueOf(ExoPlayerDelegate.this.exoPlayer.isPlayingAd());
            }
        })).booleanValue();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public void pause() {
        this.analyticsListener.onPause();
        runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$pause$1
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m776invoke() {
                ExoPlayerDelegate.this.exoPlayer.setPlayWhenReady(false);
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m776invoke();
                return zy11.a;
            }
        });
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public void play() {
        Object failure;
        AllowInitCodecManagerImpl allowInitCodecManagerImpl = this.allowInitCodecManager;
        if (allowInitCodecManagerImpl != null) {
            allowInitCodecManagerImpl.setAllowInitCodec(true);
        }
        try {
            runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$play$1
                {
                    super(0);
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m777invoke() {
                    AnalyticsListenerExtended analyticsListenerExtended;
                    analyticsListenerExtended = ExoPlayerDelegate.this.analyticsListener;
                    analyticsListenerExtended.onPlay(ExoPlayerDelegate.this.exoPlayer.getPlaybackState());
                    if (ExoPlayerDelegate.this.exoPlayer.getPlaybackState() == 1) {
                        throw new PlaybackException.ErrorNoPrepare();
                    }
                    ExoPlayerDelegate.this.exoPlayer.setPlayWhenReady(true);
                }

                @Override // defpackage.sls
                public /* bridge */ /* synthetic */ Object invoke() {
                    m777invoke();
                    return zy11.a;
                }
            });
        } catch (PlaybackException e) {
            ObserverDispatcher observerDispatcher = this.observerDispatcher;
            synchronized (observerDispatcher.getObservers()) {
                Iterator it = kotlin.collections.a.H0(observerDispatcher.getObservers()).iterator();
                while (it.hasNext()) {
                    try {
                        ((PlayerDelegate.Observer) it.next()).onError(e);
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
        }
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public void prepare(DelegatePlaybackParameters playbackParameters, DelegatePrepareParams prepareParameters) {
        HashSet H0;
        Object failure;
        if (prepareParameters == null) {
            prepareParameters = DelegatePrepareParamsKt.DelegatePrepareParams$default(null, 1, null);
        }
        final DelegatePrepareParams delegatePrepareParams = prepareParameters;
        final String mediaSourceUriString = playbackParameters.getMediaSourceUriString();
        final Long startPosition = playbackParameters.getStartPosition();
        final DataSourceParameters manifestDataSourceParameters = delegatePrepareParams.getManifestDataSourceParameters();
        final DataSourceParameters chunkDataSourceParameters = delegatePrepareParams.getChunkDataSourceParameters();
        if (delegatePrepareParams.getPreferredH264()) {
            this.wasH264Prefer = true;
            this.preferredVideoMimeTypesBeforeForceH264 = this.trackSelector.getParameters().i;
            vmh vmhVar = this.trackSelector;
            nmh buildUponParameters = vmhVar.buildUponParameters();
            buildUponParameters.getClass();
            buildUponParameters.i = ImmutableList.m(new String[]{"video/avc"});
            vmhVar.setParameters(buildUponParameters);
        } else if (this.wasH264Prefer) {
            this.wasH264Prefer = false;
            vmh vmhVar2 = this.trackSelector;
            nmh buildUponParameters2 = vmhVar2.buildUponParameters();
            String[] strArr = (String[]) this.preferredVideoMimeTypesBeforeForceH264.toArray(new String[0]);
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            buildUponParameters2.getClass();
            buildUponParameters2.i = ImmutableList.m(strArr2);
            vmhVar2.setParameters(buildUponParameters2);
        }
        AllowInitCodecManagerImpl allowInitCodecManagerImpl = this.allowInitCodecManager;
        if (allowInitCodecManagerImpl != null) {
            allowInitCodecManagerImpl.setAllowInitCodec(true ^ delegatePrepareParams.getPrepareWithoutInitCodecs());
        }
        ObserverDispatcher<PlaybackFeatureChangeListener> observerDispatcher = this.playbackFeaturesListeners;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlaybackFeatureChangeListener) it.next()).updateFeatureConfig(this.playbackFeaturesProvider.getValue());
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
        BandwidthEstimateObserver bandwidthEstimateObserver = this.bandwidthEstimateObserver;
        if (bandwidthEstimateObserver != null) {
            bandwidthEstimateObserver.onPrepare(this.observerDispatcher);
        }
        runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$prepare$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Removed duplicated region for block: B:58:0x01af A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* renamed from: invoke, reason: collision with other method in class */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m778invoke() {
                AnalyticsListenerExtended analyticsListenerExtended;
                AnalyticsListenerExtended analyticsListenerExtended2;
                AnalyticsListenerExtended analyticsListenerExtended3;
                StartPositionValidatorImpl startPositionValidatorImpl;
                PrepareDrm prepareDrm;
                ExoDrmSessionManagerFactory exoDrmSessionManagerFactory;
                InternalDrmSessionListener internalDrmSessionListener;
                ExoDrmSessionManager create;
                PrepareDrm prepareDrm2;
                PrepareDrm prepareDrm3;
                PrepareDrm prepareDrm4;
                MediaDrmCallbackDelegate defaultMediaDrmCallbackDelegate;
                PrepareDrm prepareDrm5;
                DrmSessionManagerMode drmSessionManagerMode;
                PrepareDrm prepareDrm6;
                BandwidthMeterWithProxyTransferListener bandwidthMeterWithProxyTransferListener;
                MediaSourceFactory mediaSourceFactory;
                LoadErrorHandlingConfig loadErrorHandlingConfig;
                ExoPlayerProperThreadRunner exoPlayerProperThreadRunner;
                AnalyticsListenerExtended analyticsListenerExtended4;
                ObserverDispatcher observerDispatcher2;
                HashSet H02;
                Object failure2;
                boolean z;
                Long l;
                PlaybackFeaturesProvider playbackFeaturesProvider;
                String offlineLicenseKeyId;
                MediaDrmCallbackDelegate mediaDrmCallbackDelegate;
                int i;
                MediaDrmCallbackDelegate mediaDrmCallbackDelegate2;
                String str;
                InternalDrmSessionListener internalDrmSessionListener2;
                ExoPlayerDelegate.this.getPlayerEventListener().resetPlayingState();
                ExoPlayerDelegate.this.getTimelineChangeListener().resetJumpToLiveState();
                ExoPlayerDelegate.this.diffServerAndLocalTimeListener.resetTimeDiff();
                ExoPlayerDelegate.this.getStartFromCacheListener().reset();
                try {
                    analyticsListenerExtended3 = ExoPlayerDelegate.this.analyticsListener;
                    analyticsListenerExtended3.onPrepare(mediaSourceUriString, startPosition);
                    startPositionValidatorImpl = ExoPlayerDelegate.this.startPositionValidator;
                    startPositionValidatorImpl.onPrepare(mediaSourceUriString, startPosition);
                    prepareDrm = ExoPlayerDelegate.this.prepareDrm;
                    ExoPlayerDelegate exoPlayerDelegate = ExoPlayerDelegate.this;
                    if (prepareDrm == null) {
                        internalDrmSessionListener2 = exoPlayerDelegate.internalDrmSessionListener;
                        internalDrmSessionListener2.resetCurrentDrmSession();
                        create = new ExoDummyDrmSessionManager();
                    } else {
                        exoDrmSessionManagerFactory = exoPlayerDelegate.drmSessionManagerFactory;
                        DrmSecurityLevel preferDrmSecurityLevel = prepareDrm.getPreferDrmSecurityLevel();
                        internalDrmSessionListener = ExoPlayerDelegate.this.internalDrmSessionListener;
                        create = exoDrmSessionManagerFactory.create(preferDrmSecurityLevel, internalDrmSessionListener);
                    }
                    ExoDrmSessionManager exoDrmSessionManager = create;
                    prepareDrm2 = ExoPlayerDelegate.this.prepareDrm;
                    if (prepareDrm2 != null && (mediaDrmCallbackDelegate2 = prepareDrm2.getMediaDrmCallbackDelegate()) != null) {
                        str = ExoPlayerDelegate.this.videoSessionId;
                        mediaDrmCallbackDelegate2.setVideoSessionIdQueryParam(str);
                    }
                    prepareDrm3 = ExoPlayerDelegate.this.prepareDrm;
                    LoadErrorHandlingPolicyImpl loadErrorHandlingPolicyImpl = null;
                    if (prepareDrm3 != null && (mediaDrmCallbackDelegate = prepareDrm3.getMediaDrmCallbackDelegate()) != null) {
                        ExoPlayerDelegate exoPlayerDelegate2 = ExoPlayerDelegate.this;
                        MediaDrmCallbackDelegateV2 mediaDrmCallbackDelegateV2 = mediaDrmCallbackDelegate instanceof MediaDrmCallbackDelegateV2 ? (MediaDrmCallbackDelegateV2) mediaDrmCallbackDelegate : null;
                        if (mediaDrmCallbackDelegateV2 != null) {
                            i = exoPlayerDelegate2.sourceIndex;
                            mediaDrmCallbackDelegateV2.setSourceIndexQueryParam(i);
                        }
                    }
                    prepareDrm4 = ExoPlayerDelegate.this.prepareDrm;
                    if (prepareDrm4 == null || (defaultMediaDrmCallbackDelegate = prepareDrm4.getMediaDrmCallbackDelegate()) == null) {
                        defaultMediaDrmCallbackDelegate = new DefaultMediaDrmCallbackDelegate(null, false, null, 7, null);
                    }
                    exoDrmSessionManager.setMediaDrmCallbackDelegate(defaultMediaDrmCallbackDelegate);
                    prepareDrm5 = ExoPlayerDelegate.this.prepareDrm;
                    if (prepareDrm5 == null || prepareDrm5.getOfflineLicenseKeyId() == null || (drmSessionManagerMode = DrmSessionManagerMode.QUERY) == null) {
                        drmSessionManagerMode = DrmSessionManagerMode.PLAYBACK;
                    }
                    prepareDrm6 = ExoPlayerDelegate.this.prepareDrm;
                    exoDrmSessionManager.setMode(drmSessionManagerMode, (prepareDrm6 == null || (offlineLicenseKeyId = prepareDrm6.getOfflineLicenseKeyId()) == null) ? null : Base64.decode(offlineLicenseKeyId, 2));
                    String str2 = mediaSourceUriString;
                    bandwidthMeterWithProxyTransferListener = ExoPlayerDelegate.this.bandwidthMeter;
                    cj01 proxyTransferListener = bandwidthMeterWithProxyTransferListener.getProxyTransferListener();
                    ExoPlayerDelegate exoPlayerDelegate3 = ExoPlayerDelegate.this;
                    StartFromCacheHelper startFromCacheListener = exoPlayerDelegate3.getStartFromCacheListener();
                    final ExoPlayerDelegate exoPlayerDelegate4 = ExoPlayerDelegate.this;
                    final DataSourceParameters dataSourceParameters = manifestDataSourceParameters;
                    final DataSourceParameters dataSourceParameters2 = chunkDataSourceParameters;
                    final DelegatePrepareParams delegatePrepareParams2 = delegatePrepareParams;
                    MediaSourceParameters MediaSourceParameters = MediaSourceParametersKt.MediaSourceParameters(str2, exoDrmSessionManager, proxyTransferListener, exoPlayerDelegate3, startFromCacheListener, new tls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$prepare$2$mediaSourceParameters$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void invoke(MediaSourceParameters.Builder builder) {
                            PlaybackFeaturesProvider playbackFeaturesProvider2;
                            playbackFeaturesProvider2 = ExoPlayerDelegate.this.playbackFeaturesProvider;
                            builder.setPlaybackFeaturesProvider$video_player_internalRelease(playbackFeaturesProvider2);
                            builder.setManifestDataSourceParameters$video_player_internalRelease(dataSourceParameters);
                            builder.setChunkDataSourceParameters$video_player_internalRelease(dataSourceParameters2);
                            builder.setPrepareParams$video_player_internalRelease(delegatePrepareParams2);
                        }

                        @Override // defpackage.tls
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((MediaSourceParameters.Builder) obj);
                            return zy11.a;
                        }
                    });
                    mediaSourceFactory = ExoPlayerDelegate.this.mediaSourceFactory;
                    uf10 create2 = mediaSourceFactory.create(MediaSourceParameters);
                    NetPerfMarker netPerfMarker = create2 instanceof NetPerfMarker ? (NetPerfMarker) create2 : null;
                    loadErrorHandlingConfig = ExoPlayerDelegate.this.loadErrorHandlingConfig;
                    if (loadErrorHandlingConfig != null) {
                        String str3 = mediaSourceUriString;
                        ExoPlayerDelegate exoPlayerDelegate5 = ExoPlayerDelegate.this;
                        DefaultMediaSourceFactory.Companion companion = DefaultMediaSourceFactory.INSTANCE;
                        playbackFeaturesProvider = exoPlayerDelegate5.playbackFeaturesProvider;
                        loadErrorHandlingPolicyImpl = companion.createLoadErrorHandlingPolicy$video_player_internalRelease(str3, loadErrorHandlingConfig, playbackFeaturesProvider.getExpDoRetryForStreamResetException());
                    }
                    exoPlayerProperThreadRunner = ExoPlayerDelegate.this.exoPlayerProperThreadRunner;
                    create2.addEventListener(exoPlayerProperThreadRunner.getHandler(), new InternalMediaSourceEventListener(ExoPlayerDelegate.this.observerDispatcher, ExoPlayerDelegate.this, loadErrorHandlingPolicyImpl));
                    if (startPosition != null) {
                        z = ExoPlayerDelegate.this.shouldHandleZeroStartPositionAsDefault;
                        if (z && (l = startPosition) != null && l.longValue() == 0) {
                        }
                        ExoPlayerDelegate.this.exoPlayer.setMediaSource(create2, startPosition.longValue());
                        ExoPlayerDelegate.this.exoPlayer.prepare();
                        analyticsListenerExtended4 = ExoPlayerDelegate.this.analyticsListener;
                        analyticsListenerExtended4.onPrepared(mediaSourceUriString, startPosition);
                        observerDispatcher2 = ExoPlayerDelegate.this.observerDispatcher;
                        synchronized (observerDispatcher2.getObservers()) {
                            H02 = kotlin.collections.a.H0(observerDispatcher2.getObservers());
                        }
                        Iterator it2 = H02.iterator();
                        while (it2.hasNext()) {
                            try {
                                PlayerDelegate.Observer observer = (PlayerDelegate.Observer) it2.next();
                                if (netPerfMarker != null) {
                                    observer.onNetPerfStatus(netPerfMarker.getIsNetPerfEnabled(), netPerfMarker.getClassName());
                                }
                                failure2 = zy11.a;
                            } catch (Throwable th2) {
                                failure2 = new Result.Failure(th2);
                            }
                            Throwable a2 = Result.a(failure2);
                            if (a2 != null) {
                                h5z0.a.f(a2, "notifyObservers", new Object[0]);
                            }
                        }
                        return;
                    }
                    ExoPlayerDelegate.this.exoPlayer.setMediaSource(create2, true);
                    ExoPlayerDelegate.this.exoPlayer.prepare();
                    analyticsListenerExtended4 = ExoPlayerDelegate.this.analyticsListener;
                    analyticsListenerExtended4.onPrepared(mediaSourceUriString, startPosition);
                    observerDispatcher2 = ExoPlayerDelegate.this.observerDispatcher;
                    synchronized (observerDispatcher2.getObservers()) {
                    }
                } catch (Throwable th3) {
                    analyticsListenerExtended = ExoPlayerDelegate.this.analyticsListener;
                    analyticsListenerExtended.onPrepareError(mediaSourceUriString, startPosition, th3);
                    PlaybackException playerError = ExoPlayerExceptionKt.toPlayerError(th3);
                    analyticsListenerExtended2 = ExoPlayerDelegate.this.analyticsListener;
                    analyticsListenerExtended2.onConvertedPlayerError(playerError);
                    throw playerError;
                }
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m778invoke();
                return zy11.a;
            }
        });
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public void prepareDrm(PrepareDrm prepareDrm) {
        this.analyticsListener.onPrepareDrm();
        this.prepareDrm = prepareDrm;
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public void release() {
        this.analyticsListener.onRelease();
        this.innerObserver.release();
        this.videoComponent.release();
        this.observerDispatcher.clear();
        this.bandwidthMeter.removeEventListener(this.internalBandwidthMeterEventListener);
        BandwidthEstimateObserver bandwidthEstimateObserver = this.bandwidthEstimateObserver;
        if (bandwidthEstimateObserver != null) {
            bandwidthEstimateObserver.stop(this.bandwidthMeter);
        }
        this.analyticsListener.onReleased();
        PreloadPriorityController preloadPriorityController = this.preloadPriorityController;
        if (preloadPriorityController != null) {
            preloadPriorityController.release();
        }
        MarkedScheduledExecutorService markedScheduledExecutorService = this.scheduledExecutorService;
        if (markedScheduledExecutorService.getCreatedByPlayer()) {
            markedScheduledExecutorService.shutdownNow();
        }
        runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$release$2
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m779invoke() {
                ExoPlayerDelegate.this.exoPlayer.release();
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m779invoke();
                return zy11.a;
            }
        });
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public void removeObserver(PlayerDelegate.Observer observer) {
        this.analyticsListener.onRemoveObserver();
        this.observerDispatcher.remove(observer);
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public void seekTo(final PlayerDelegate.Position position) {
        Object failure;
        this.analyticsListener.onSeekTo(position);
        try {
            if (position.getCurrentWindowIndex() != -1) {
                runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$seekTo$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m780invoke() {
                        boolean z;
                        StuckStalledListener stuckStalledListener;
                        HashSet H0;
                        Object failure2;
                        long currentPosition = PlayerDelegate.Position.this.getCurrentPosition();
                        if (currentPosition == -9223372036854775807L || currentPosition == -1) {
                            currentPosition = -9223372036854775807L;
                        }
                        z = this.ignoreSeekOnSamePosition;
                        if (!z || currentPosition != this.exoPlayer.getContentPosition()) {
                            stuckStalledListener = this.stuckStalledListener;
                            if (stuckStalledListener != null) {
                                stuckStalledListener.onSeekCalled();
                            }
                            this.exoPlayer.seekTo(currentPosition);
                            return;
                        }
                        ObserverDispatcher observerDispatcher = this.observerDispatcher;
                        synchronized (observerDispatcher.getObservers()) {
                            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
                        }
                        Iterator it = H0.iterator();
                        while (it.hasNext()) {
                            try {
                                ((PlayerDelegate.Observer) it.next()).onNonFatalError(new PlaybackException.ErrorSeekPosition(new IllegalArgumentException("Current position in Exo is same as seek position")));
                                failure2 = zy11.a;
                            } catch (Throwable th) {
                                failure2 = new Result.Failure(th);
                            }
                            Throwable a = Result.a(failure2);
                            if (a != null) {
                                h5z0.a.f(a, "notifyObservers", new Object[0]);
                            }
                        }
                    }

                    @Override // defpackage.sls
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m780invoke();
                        return zy11.a;
                    }
                });
            }
        } catch (IllegalSeekPositionException e) {
            this.analyticsListener.onSeekToError(e);
            PlaybackException.ErrorSeekPosition errorSeekPosition = new PlaybackException.ErrorSeekPosition(e);
            ObserverDispatcher observerDispatcher = this.observerDispatcher;
            synchronized (observerDispatcher.getObservers()) {
                Iterator it = kotlin.collections.a.H0(observerDispatcher.getObservers()).iterator();
                while (it.hasNext()) {
                    try {
                        ((PlayerDelegate.Observer) it.next()).onError(errorSeekPosition);
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
        }
    }

    @Override // ru.yandex.video.m3.player.ad.ExoAdsLoaderHolder
    public void setAdViewProvider(x60 adViewProvider) {
    }

    @Override // ru.yandex.video.m3.player.ad.ExoAdsLoaderHolder
    public void setAdsLoader(dd1 adsLoader) {
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public void setHandleAudioFocus(final boolean handleAudioFocus) {
        runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$setHandleAudioFocus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final ExoPlayer invoke() {
                ExoPlayer exoPlayer = ExoPlayerDelegate.this.exoPlayer;
                exoPlayer.setAudioAttributes(exoPlayer.getAudioAttributes(), handleAudioFocus);
                return exoPlayer;
            }
        });
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public void setMuted(final boolean muted) {
        runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$setMuted$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m781invoke() {
                ExoPlayerDelegate.this.exoPlayer.setDeviceMuted(muted);
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m781invoke();
                return zy11.a;
            }
        });
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public void setPlaybackSpeed(float speed) {
        setPlaybackSpeedInternal(speed, true);
    }

    public final void setPlayerEventListener$video_player_internalRelease(InternalPlayerEventListener internalPlayerEventListener) {
        this.playerEventListener = internalPlayerEventListener;
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public void setRepeatMode(RepeatMode repeatMode) {
        this.repeatModeManager.setRepeatMode(repeatMode);
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public void setSourceIndex(int sourceIndex) {
        this.sourceIndex = sourceIndex;
    }

    public final void setStartFromCacheListener(StartFromCacheHelper startFromCacheHelper) {
        this.startFromCacheListener = startFromCacheHelper;
    }

    public final void setTimelineChangeListener$video_player_internalRelease(TimelineChangeListener timelineChangeListener) {
        this.timelineChangeListener = timelineChangeListener;
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public void setVideoSessionId(String videoSessionId) {
        this.videoSessionId = videoSessionId;
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public void setVolume(final float volume) {
        runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$setVolume$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m783invoke() {
                ExoPlayerDelegate.this.exoPlayer.setVolume(volume);
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m783invoke();
                return zy11.a;
            }
        });
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public void stop(final boolean keepDecoders) {
        HashSet H0;
        Object failure;
        this.analyticsListener.onStop();
        ObserverDispatcher observerDispatcher = this.observerDispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerDelegate.Observer) it.next()).onStop(keepDecoders);
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
        runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.ExoPlayerDelegate$stop$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m784invoke() {
                ExoPlayerDelegate.this.diffServerAndLocalTimeListener.resetTimeDiff();
                ExoPlayerDelegate.this.exoPlayer.setForegroundMode(keepDecoders);
                ExoPlayerDelegate.this.exoPlayer.stop();
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m784invoke();
                return zy11.a;
            }
        });
        this.analyticsListener.onStopped();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ExoPlayerDelegate(androidx.media3.exoplayer.ExoPlayer r38, ru.yandex.video.m3.source.MediaSourceFactory r39, defpackage.vmh r40, ru.yandex.video.m3.player.drm.ExoDrmSessionManagerFactory r41, ru.yandex.video.m3.util.MarkedScheduledExecutorService r42, ru.yandex.video.m3.player.impl.utils.ExoPlayerProperThreadRunner r43, ru.yandex.video.m3.player.impl.BandwidthMeterWithProxyTransferListener r44, ru.yandex.video.m3.player.AnalyticsListenerExtended r45, ru.yandex.video.m3.player.impl.VideoComponent r46, boolean r47, ru.yandex.video.m3.player.impl.codecs.LoggingMediaCodecSelector r48, android.os.Looper r49, ru.yandex.video.m3.player.impl.load_control.YandexLoadControl r50, boolean r51, ru.yandex.video.m3.player.live.LiveSpeedControlObserver r52, ru.yandex.video.m3.preload.PreloadPrioritySettings r53, ru.yandex.video.m3.player.impl.utils.ObserverDispatcher r54, ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager r55, ru.yandex.video.m3.player.provider.Consumer r56, ru.yandex.video.m3.player.debug.ExoDroppedFramesListener r57, ru.yandex.video.m3.player.report.logger.RecordLogger r58, boolean r59, ru.yandex.video.m3.player.feature.PlaybackFeaturesProvider r60, ru.yandex.video.m3.player.impl.utils.ObserverDispatcher r61, boolean r62, boolean r63, ru.yandex.video.m3.model.config.mediasource.LoadErrorHandlingConfig r64, ru.yandex.video.m3.player.impl.bandwidth.BandwidthEstimateObserver r65, boolean r66, boolean r67, ru.yandex.video.m3.player.impl.managers.AllowInitCodecManagerImpl r68, boolean r69, ru.yandex.video.m3.player.parameters.StuckStalledConfig r70, int r71, int r72, kotlin.jvm.internal.DefaultConstructorMarker r73) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.yandex.video.m3.player.impl.ExoPlayerDelegate.<init>(androidx.media3.exoplayer.ExoPlayer, ru.yandex.video.m3.source.MediaSourceFactory, vmh, ru.yandex.video.m3.player.drm.ExoDrmSessionManagerFactory, ru.yandex.video.m3.util.MarkedScheduledExecutorService, ru.yandex.video.m3.player.impl.utils.ExoPlayerProperThreadRunner, ru.yandex.video.m3.player.impl.BandwidthMeterWithProxyTransferListener, ru.yandex.video.m3.player.AnalyticsListenerExtended, ru.yandex.video.m3.player.impl.VideoComponent, boolean, ru.yandex.video.m3.player.impl.codecs.LoggingMediaCodecSelector, android.os.Looper, ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, boolean, ru.yandex.video.m3.player.live.LiveSpeedControlObserver, ru.yandex.video.m3.preload.PreloadPrioritySettings, ru.yandex.video.m3.player.impl.utils.ObserverDispatcher, ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager, ru.yandex.video.m3.player.provider.Consumer, ru.yandex.video.m3.player.debug.ExoDroppedFramesListener, ru.yandex.video.m3.player.report.logger.RecordLogger, boolean, ru.yandex.video.m3.player.feature.PlaybackFeaturesProvider, ru.yandex.video.m3.player.impl.utils.ObserverDispatcher, boolean, boolean, ru.yandex.video.m3.model.config.mediasource.LoadErrorHandlingConfig, ru.yandex.video.m3.player.impl.bandwidth.BandwidthEstimateObserver, boolean, boolean, ru.yandex.video.m3.player.impl.managers.AllowInitCodecManagerImpl, boolean, ru.yandex.video.m3.player.parameters.StuckStalledConfig, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
