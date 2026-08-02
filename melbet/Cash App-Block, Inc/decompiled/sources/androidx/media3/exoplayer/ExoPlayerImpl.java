package androidx.media3.exoplayer;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda16;
import androidx.camera.view.PreviewView;
import androidx.core.view.DifferentialMotionFlingController$$ExternalSyntheticLambda0;
import androidx.lifecycle.DispatchQueue$$ExternalSyntheticLambda0;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.FlagSet;
import androidx.media3.common.Format;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.StuckPlayerDetector;
import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.SystemHandlerWrapper;
import androidx.media3.common.util.Util;
import androidx.media3.common.util.WakeLockManager;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoPlayerImplInternal;
import androidx.media3.exoplayer.MediaSourceList;
import androidx.media3.exoplayer.PlayerMessage;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.source.BaseMediaSource;
import androidx.media3.exoplayer.source.MaskingMediaSource;
import androidx.media3.exoplayer.source.MediaSource$Factory;
import androidx.media3.exoplayer.source.MediaSource$MediaPeriodId;
import androidx.media3.exoplayer.source.ShuffleOrder$DefaultShuffleOrder;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.media3.exoplayer.upstream.BandwidthMeter$EventListener$EventDispatcher$HandlerAndListener;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import androidx.media3.exoplayer.video.VideoDecoderGLSurfaceView;
import androidx.media3.exoplayer.video.VideoFrameMetadataListener;
import androidx.media3.exoplayer.video.spherical.CameraMotionListener;
import androidx.media3.exoplayer.video.spherical.SceneRenderer;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.media3.extractor.VorbisUtil$Mode;
import androidx.media3.extractor.text.CueEncoder;
import androidx.media3.extractor.ts.NalUnitTargetBuffer;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.media3.ui.PlayerControlView$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.AdapterHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import app.cash.zipline.CallResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.Response;
import com.appsflyer.internal.AFd1lSDK$$ExternalSyntheticLambda0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.IntConsumer;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes3.dex */
public final class ExoPlayerImpl implements ExoPlayer, Player {
    public final DefaultAnalyticsCollector analyticsCollector;
    public final Context applicationContext;
    public final Looper applicationLooper;
    public final AudioAttributes audioAttributes;
    public final Response audioBecomingNoisyManager;
    public final CallResult audioListenerManager;
    public final CopyOnWriteArraySet audioOffloadListeners;
    public final AdapterHelper audioSessionIdState;
    public Player.Commands availableCommands;
    public final DefaultBandwidthMeter bandwidthMeter;
    public final SystemClock clock;
    public final ComponentListener componentListener;
    public final ConditionVariable constructorFinished;
    public CueGroup currentCueGroup;
    public final long detachSurfaceTimeoutMs;
    public ImmutableSet disabledTrackTypesWithoutScrubbingMode;
    public final TrackSelectorResult emptyTrackSelectorResult;
    public final FrameMetadataListener frameMetadataListener;
    public boolean hasNotifiedFullWrongThreadWarning;
    public final ExoPlayerImplInternal internalPlayer;
    public final ListenerSet listeners;
    public int maskingWindowIndex;
    public long maskingWindowPositionMs;
    public final long maxSeekToPreviousPositionMs;
    public MediaMetadata mediaMetadata;
    public final MediaSource$Factory mediaSourceFactory;
    public final ArrayList mediaSourceHolderSnapshots;
    public Surface ownedSurface;
    public final boolean pauseAtEndOfMediaItems;
    public boolean pendingDiscontinuity;
    public int pendingDiscontinuityReason;
    public int pendingOperationAcks;
    public final Timeline.Period period;
    public final Player.Commands permanentAvailableCommands;
    public PlaybackInfo playbackInfo;
    public final SystemHandlerWrapper playbackInfoUpdateHandler;
    public final ExoPlayerImpl$$ExternalSyntheticLambda19 playbackInfoUpdateListener;
    public boolean playerReleased;
    public final ExoPlayer.PreloadConfiguration preloadConfiguration;
    public final int priority;
    public final BaseRenderer[] renderers;
    public int repeatMode;
    public boolean scrubbingModeEnabled;
    public final ScrubbingModeParameters scrubbingModeParameters;
    public final BaseRenderer[] secondaryRenderers;
    public final long seekBackIncrementMs;
    public final long seekForwardIncrementMs;
    public final SeekParameters seekParameters;
    public boolean shuffleModeEnabled;
    public ShuffleOrder$DefaultShuffleOrder shuffleOrder;
    public boolean skipSilenceEnabled;
    public SphericalGLSurfaceView sphericalGLSurfaceView;
    public MediaMetadata staticAndDynamicMediaMetadata;
    public final StuckPlayerDetector stuckPlayerDetector;
    public SurfaceHolder surfaceHolder;
    public boolean surfaceHolderSurfaceIsVideoOutput;
    public Size surfaceSize;
    public TextureView textureView;
    public final boolean throwsWhenUsingWrongThread;
    public final DefaultTrackSelector trackSelector;
    public final boolean useLazyPreparation;
    public final CallResult videoListenerManager;
    public Object videoOutput;
    public final int videoScalingMode;
    public VideoSize videoSize;
    public final VirtualDeviceIdChangeListener virtualDeviceIdChangeListener;
    public float volume;
    public final WakeLockManager wakeLockManager;
    public final VorbisUtil$Mode wifiLockManager;
    public final Timeline.Window window;
    public final ExoPlayerImpl wrappingPlayer;

    public final class ComponentListener implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
        public ComponentListener() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            Surface surface = new Surface(surfaceTexture);
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            exoPlayerImpl.setVideoOutputInternal(surface);
            exoPlayerImpl.ownedSurface = surface;
            exoPlayerImpl.maybeNotifySurfaceSizeChanged(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            exoPlayerImpl.setVideoOutputInternal(null);
            exoPlayerImpl.maybeNotifySurfaceSizeChanged(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            ExoPlayerImpl.this.maybeNotifySurfaceSizeChanged(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            ExoPlayerImpl.this.maybeNotifySurfaceSizeChanged(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            if (exoPlayerImpl.surfaceHolderSurfaceIsVideoOutput) {
                exoPlayerImpl.setVideoOutputInternal(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            if (exoPlayerImpl.surfaceHolderSurfaceIsVideoOutput) {
                exoPlayerImpl.setVideoOutputInternal(null);
            }
            exoPlayerImpl.maybeNotifySurfaceSizeChanged(0, 0);
        }
    }

    public final class FrameMetadataListener implements VideoFrameMetadataListener, CameraMotionListener, PlayerMessage.Target {
        public CameraMotionListener cameraMotionListener;
        public SceneRenderer internalCameraMotionListener;
        public SceneRenderer internalVideoFrameMetadataListener;
        public VideoFrameMetadataListener videoFrameMetadataListener;

        @Override // androidx.media3.exoplayer.PlayerMessage.Target
        public final void handleMessage(int i, Object obj) {
            if (i == 7) {
                this.videoFrameMetadataListener = (VideoFrameMetadataListener) obj;
                return;
            }
            if (i == 8) {
                this.cameraMotionListener = (CameraMotionListener) obj;
                return;
            }
            if (i != 10000) {
                return;
            }
            SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
            if (sphericalGLSurfaceView == null) {
                this.internalVideoFrameMetadataListener = null;
                this.internalCameraMotionListener = null;
            } else {
                SceneRenderer sceneRenderer = sphericalGLSurfaceView.scene;
                this.internalVideoFrameMetadataListener = sceneRenderer;
                this.internalCameraMotionListener = sceneRenderer;
            }
        }

        @Override // androidx.media3.exoplayer.video.spherical.CameraMotionListener
        public final void onCameraMotion(long j, float[] fArr) {
            SceneRenderer sceneRenderer = this.internalCameraMotionListener;
            if (sceneRenderer != null) {
                sceneRenderer.onCameraMotion(j, fArr);
            }
            CameraMotionListener cameraMotionListener = this.cameraMotionListener;
            if (cameraMotionListener != null) {
                cameraMotionListener.onCameraMotion(j, fArr);
            }
        }

        @Override // androidx.media3.exoplayer.video.spherical.CameraMotionListener
        public final void onCameraMotionReset() {
            SceneRenderer sceneRenderer = this.internalCameraMotionListener;
            if (sceneRenderer != null) {
                sceneRenderer.onCameraMotionReset();
            }
            CameraMotionListener cameraMotionListener = this.cameraMotionListener;
            if (cameraMotionListener != null) {
                cameraMotionListener.onCameraMotionReset();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameMetadataListener
        public final void onVideoFrameAboutToBeRendered(long j, long j2, Format format2, MediaFormat mediaFormat) {
            SceneRenderer sceneRenderer = this.internalVideoFrameMetadataListener;
            if (sceneRenderer != null) {
                sceneRenderer.onVideoFrameAboutToBeRendered(j, j2, format2, mediaFormat);
            }
            VideoFrameMetadataListener videoFrameMetadataListener = this.videoFrameMetadataListener;
            if (videoFrameMetadataListener != null) {
                videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j, j2, format2, mediaFormat);
            }
        }
    }

    public final class MediaSourceHolderSnapshot implements MediaSourceInfoHolder {
        public Timeline timeline;
        public final Object uid;

        public MediaSourceHolderSnapshot(Object obj, MaskingMediaSource maskingMediaSource) {
            this.uid = obj;
            this.timeline = maskingMediaSource.timeline;
        }

        @Override // androidx.media3.exoplayer.MediaSourceInfoHolder
        public final Timeline getTimeline() {
            return this.timeline;
        }

        @Override // androidx.media3.exoplayer.MediaSourceInfoHolder
        public final Object getUid() {
            return this.uid;
        }
    }

    public final class VirtualDeviceIdChangeListener {
        public final WeakReference contextReference;
        public final ExoPlayerImpl$VirtualDeviceIdChangeListener$$ExternalSyntheticLambda0 listener;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.media3.exoplayer.ExoPlayerImpl$VirtualDeviceIdChangeListener$$ExternalSyntheticLambda0, java.util.function.IntConsumer] */
        public VirtualDeviceIdChangeListener(Context context) {
            this.contextReference = new WeakReference(context);
            ?? r0 = new IntConsumer() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$VirtualDeviceIdChangeListener$$ExternalSyntheticLambda0
                @Override // java.util.function.IntConsumer
                public final void accept(int i) {
                    ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
                    if (exoPlayerImpl.playerReleased) {
                        return;
                    }
                    exoPlayerImpl.sendRendererMessage(1, 19, Integer.valueOf(i));
                }
            };
            this.listener = r0;
            context.registerDeviceIdChangeListener(new PlayerControlView$$ExternalSyntheticLambda0(ExoPlayerImpl.this.clock.createHandler(ExoPlayerImpl.this.applicationLooper, null), 2), r0);
        }

        public static void access$400(VirtualDeviceIdChangeListener virtualDeviceIdChangeListener) {
            Context context = (Context) virtualDeviceIdChangeListener.contextReference.get();
            if (context == null) {
                return;
            }
            context.unregisterDeviceIdChangeListener(virtualDeviceIdChangeListener.listener);
        }
    }

    static {
        MediaLibraryInfo.registerModule("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0378 A[Catch: all -> 0x0314, TryCatch #1 {all -> 0x0314, blocks: (B:47:0x02dc, B:49:0x0305, B:51:0x0309, B:53:0x030d, B:57:0x0319, B:60:0x034c, B:62:0x0378, B:63:0x037f, B:72:0x0345), top: B:46:0x02dc }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0345 A[Catch: all -> 0x0314, TryCatch #1 {all -> 0x0314, blocks: (B:47:0x02dc, B:49:0x0305, B:51:0x0309, B:53:0x030d, B:57:0x0319, B:60:0x034c, B:62:0x0378, B:63:0x037f, B:72:0x0345), top: B:46:0x02dc }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.media3.exoplayer.ExoPlayerImpl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v16, types: [androidx.media3.exoplayer.ExoPlayerImpl] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ExoPlayerImpl(ExoPlayer.Builder builder) {
        ExoPlayerImpl exoPlayerImpl;
        Handler.Callback callback;
        ExoPlayerImpl exoPlayerImpl2;
        boolean z;
        WakeLockManager wakeLockManager;
        ?? obj = new Object();
        obj.window = new Timeline.Window();
        obj.constructorFinished = new ConditionVariable();
        try {
            Log.i("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(obj)) + " [AndroidXMedia3/1.10.1] [" + Util.DEVICE_DEBUG_INFO + "]");
            Context context = builder.context;
            Looper looper = builder.looper;
            SystemClock systemClock = builder.clock;
            obj.applicationContext = context.getApplicationContext();
            obj.analyticsCollector = new DefaultAnalyticsCollector(systemClock);
            obj.priority = builder.priority;
            obj.audioAttributes = builder.audioAttributes;
            obj.videoScalingMode = builder.videoScalingMode;
            obj.skipSilenceEnabled = false;
            obj.detachSurfaceTimeoutMs = builder.detachSurfaceTimeoutMs;
            ComponentListener componentListener = new ComponentListener();
            obj.componentListener = componentListener;
            obj.frameMetadataListener = new FrameMetadataListener();
            BaseRenderer[] createRenderers = ((Recorder.AnonymousClass4) builder.renderersFactorySupplier.get()).createRenderers(new Handler(looper), componentListener, componentListener, componentListener, componentListener);
            obj.renderers = createRenderers;
            Trace.checkState(createRenderers.length > 0);
            obj.secondaryRenderers = new BaseRenderer[createRenderers.length];
            int i = 0;
            while (true) {
                BaseRenderer[] baseRendererArr = obj.secondaryRenderers;
                if (i >= baseRendererArr.length) {
                    break;
                }
                int i2 = obj.renderers[i].trackType;
                baseRendererArr[i] = null;
                i++;
            }
            obj.trackSelector = (DefaultTrackSelector) builder.trackSelectorSupplier.get();
            obj.mediaSourceFactory = (MediaSource$Factory) builder.mediaSourceFactorySupplier.get();
            obj.bandwidthMeter = (DefaultBandwidthMeter) builder.bandwidthMeterSupplier.get();
            obj.useLazyPreparation = builder.useLazyPreparation;
            obj.seekParameters = builder.seekParameters;
            obj.seekBackIncrementMs = builder.seekBackIncrementMs;
            obj.seekForwardIncrementMs = builder.seekForwardIncrementMs;
            obj.maxSeekToPreviousPositionMs = builder.maxSeekToPreviousPositionMs;
            obj.scrubbingModeParameters = builder.scrubbingModeParameters;
            obj.pauseAtEndOfMediaItems = false;
            obj.applicationLooper = looper;
            obj.clock = systemClock;
            obj.wrappingPlayer = obj;
            obj.listeners = new ListenerSet(new CopyOnWriteArraySet(), looper, looper.getThread(), systemClock, new ExoPlayerImpl$$ExternalSyntheticLambda19(obj), true);
            obj.audioOffloadListeners = new CopyOnWriteArraySet();
            obj.mediaSourceHolderSnapshots = new ArrayList();
            obj.shuffleOrder = new ShuffleOrder$DefaultShuffleOrder();
            obj.preloadConfiguration = ExoPlayer.PreloadConfiguration.DEFAULT;
            BaseRenderer[] baseRendererArr2 = obj.renderers;
            obj.emptyTrackSelectorResult = new TrackSelectorResult(new RendererConfiguration[baseRendererArr2.length], new ExoTrackSelection[baseRendererArr2.length], Tracks.EMPTY, null);
            obj.period = new Timeline.Period();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i3 = 0; i3 < 20; i3++) {
                int i4 = iArr[i3];
                Trace.checkState(!false);
                sparseBooleanArray.append(i4, true);
            }
            obj.trackSelector.getClass();
            Trace.checkState(!false);
            sparseBooleanArray.append(29, true);
            Trace.checkState(!false);
            FlagSet flagSet = new FlagSet(sparseBooleanArray);
            obj.permanentAvailableCommands = new Player.Commands(flagSet);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i5 = 0; i5 < flagSet.flags.size(); i5++) {
                int i6 = flagSet.get(i5);
                Trace.checkState(!false);
                sparseBooleanArray2.append(i6, true);
            }
            Trace.checkState(!false);
            sparseBooleanArray2.append(4, true);
            Trace.checkState(!false);
            sparseBooleanArray2.append(10, true);
            Trace.checkState(!false);
            obj.availableCommands = new Player.Commands(new FlagSet(sparseBooleanArray2));
            obj.playbackInfoUpdateHandler = obj.clock.createHandler(obj.applicationLooper, null);
            ExoPlayerImpl$$ExternalSyntheticLambda19 exoPlayerImpl$$ExternalSyntheticLambda19 = new ExoPlayerImpl$$ExternalSyntheticLambda19(obj);
            obj.playbackInfoUpdateListener = exoPlayerImpl$$ExternalSyntheticLambda19;
            obj.playbackInfo = PlaybackInfo.createDummy(obj.emptyTrackSelectorResult);
            obj.analyticsCollector.setPlayer(obj.wrappingPlayer, obj.applicationLooper);
            PlayerId playerId = new PlayerId(builder.playerName);
            ExoPlayerImplInternal exoPlayerImplInternal = new ExoPlayerImplInternal(obj.applicationContext, obj.renderers, obj.secondaryRenderers, obj.trackSelector, obj.emptyTrackSelectorResult, new DefaultLoadControl(), obj.bandwidthMeter, obj.repeatMode, obj.shuffleModeEnabled, obj.analyticsCollector, obj.seekParameters, builder.livePlaybackSpeedControl, builder.releaseTimeoutMs, obj.pauseAtEndOfMediaItems, obj.applicationLooper, obj.clock, exoPlayerImpl$$ExternalSyntheticLambda19, playerId, obj.preloadConfiguration, obj.frameMetadataListener, builder.avoidLoadingWhileEnded);
            SystemHandlerWrapper systemHandlerWrapper = exoPlayerImplInternal.handler;
            obj.internalPlayer = exoPlayerImplInternal;
            Looper looper2 = exoPlayerImplInternal.playbackLooper;
            obj.volume = 1.0f;
            obj.repeatMode = 0;
            MediaMetadata mediaMetadata = MediaMetadata.EMPTY;
            obj.mediaMetadata = mediaMetadata;
            obj.staticAndDynamicMediaMetadata = mediaMetadata;
            obj.maskingWindowIndex = -1;
            obj.currentCueGroup = CueGroup.EMPTY_TIME_ZERO;
            obj.throwsWhenUsingWrongThread = true;
            obj.addListener(obj.analyticsCollector);
            DefaultBandwidthMeter defaultBandwidthMeter = obj.bandwidthMeter;
            Handler handler = new Handler(obj.applicationLooper);
            DefaultAnalyticsCollector defaultAnalyticsCollector = obj.analyticsCollector;
            defaultBandwidthMeter.getClass();
            defaultAnalyticsCollector.getClass();
            PreviewView.AnonymousClass1 anonymousClass1 = defaultBandwidthMeter.eventDispatcher;
            anonymousClass1.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) anonymousClass1.this$0;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                BandwidthMeter$EventListener$EventDispatcher$HandlerAndListener bandwidthMeter$EventListener$EventDispatcher$HandlerAndListener = (BandwidthMeter$EventListener$EventDispatcher$HandlerAndListener) it.next();
                if (bandwidthMeter$EventListener$EventDispatcher$HandlerAndListener.listener == defaultAnalyticsCollector) {
                    bandwidthMeter$EventListener$EventDispatcher$HandlerAndListener.released = true;
                    copyOnWriteArrayList.remove(bandwidthMeter$EventListener$EventDispatcher$HandlerAndListener);
                }
            }
            copyOnWriteArrayList.add(new BandwidthMeter$EventListener$EventDispatcher$HandlerAndListener(handler, defaultAnalyticsCollector));
            obj.audioOffloadListeners.add(obj.componentListener);
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 31) {
                Context context2 = obj.applicationContext;
                boolean z2 = builder.usePlatformDiagnostics;
                SystemHandlerWrapper createHandler = obj.clock.createHandler(exoPlayerImplInternal.playbackLooper, null);
                try {
                    callback = null;
                    try {
                        exoPlayerImpl2 = this;
                        createHandler.post(new Recorder$$ExternalSyntheticLambda16(context2, z2, this, playerId, 1));
                    } catch (Throwable th) {
                        th = th;
                        exoPlayerImpl = this;
                        exoPlayerImpl.constructorFinished.open();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    exoPlayerImpl = this;
                }
            } else {
                callback = null;
                exoPlayerImpl2 = obj;
            }
            ExoPlayerImpl exoPlayerImpl3 = exoPlayerImpl2;
            try {
                AdapterHelper adapterHelper = new AdapterHelper(0, looper2, exoPlayerImpl2.applicationLooper, exoPlayerImpl2.clock, new ExoPlayerImpl$$ExternalSyntheticLambda19(exoPlayerImpl2));
                exoPlayerImpl3.audioSessionIdState = adapterHelper;
                adapterHelper.runInBackground(new AFd1lSDK$$ExternalSyntheticLambda0(exoPlayerImpl3, 8));
                Response response = new Response(builder.context, looper2, builder.looper, exoPlayerImpl3.componentListener, exoPlayerImpl3.clock);
                exoPlayerImpl3.audioBecomingNoisyManager = response;
                response.setEnabled();
                if (builder.stuckBufferingDetectionTimeoutMs != Integer.MAX_VALUE && builder.stuckPlayingDetectionTimeoutMs != Integer.MAX_VALUE && builder.stuckPlayingNotEndingTimeoutMs != Integer.MAX_VALUE && builder.stuckSuppressedDetectionTimeoutMs != Integer.MAX_VALUE) {
                    z = true;
                    SystemClock systemClock2 = exoPlayerImpl3.clock;
                    wakeLockManager = new WakeLockManager();
                    wakeLockManager.wakeLockManagerInternal = new Recorder.AnonymousClass1((Object) context.getApplicationContext(), false, 28);
                    wakeLockManager.wakeLockHandler = systemClock2.createHandler(looper2, callback);
                    wakeLockManager.mainHandler = systemClock2.createHandler(Looper.getMainLooper(), callback);
                    exoPlayerImpl3.wakeLockManager = wakeLockManager;
                    if (wakeLockManager.enabled == z) {
                        wakeLockManager.enabled = z;
                        wakeLockManager.postUpdateWakeLock(z, wakeLockManager.stayAwake);
                    }
                    SystemClock systemClock3 = exoPlayerImpl3.clock;
                    VorbisUtil$Mode vorbisUtil$Mode = new VorbisUtil$Mode();
                    new CueEncoder(context.getApplicationContext(), 11);
                    systemClock3.createHandler(looper2, callback);
                    systemClock3.createHandler(Looper.getMainLooper(), callback);
                    exoPlayerImpl3.wifiLockManager = vorbisUtil$Mode;
                    int i8 = DeviceInfo.$r8$clinit;
                    exoPlayerImpl3.videoSize = VideoSize.UNKNOWN;
                    exoPlayerImpl3.surfaceSize = Size.UNKNOWN;
                    exoPlayerImpl3.virtualDeviceIdChangeListener = i7 < 34 ? exoPlayerImpl3.new VirtualDeviceIdChangeListener(context) : callback;
                    exoPlayerImpl3.audioListenerManager = new CallResult(3);
                    exoPlayerImpl3.videoListenerManager = new CallResult(3);
                    obj = exoPlayerImpl3;
                    obj.stuckPlayerDetector = new StuckPlayerDetector((ExoPlayerImpl) obj, exoPlayerImpl3.componentListener, exoPlayerImpl3.clock, builder.stuckBufferingDetectionTimeoutMs, builder.stuckPlayingDetectionTimeoutMs, builder.stuckPlayingNotEndingTimeoutMs, builder.stuckSuppressedDetectionTimeoutMs);
                    systemHandlerWrapper.obtainMessage(38, obj.scrubbingModeParameters).sendToTarget();
                    AudioAttributes audioAttributes = obj.audioAttributes;
                    SystemHandlerWrapper.SystemMessage obtainSystemMessage = SystemHandlerWrapper.obtainSystemMessage();
                    obtainSystemMessage.message = systemHandlerWrapper.handler.obtainMessage(31, 0, 0, audioAttributes);
                    obtainSystemMessage.sendToTarget();
                    obj.sendRendererMessage(1, 3, obj.audioAttributes);
                    obj.sendRendererMessage(2, 4, Integer.valueOf(obj.videoScalingMode));
                    obj.sendRendererMessage(2, 5, 0);
                    obj.sendRendererMessage(1, 9, Boolean.valueOf(obj.skipSilenceEnabled));
                    obj.sendRendererMessage(6, 8, obj.frameMetadataListener);
                    obj.sendRendererMessage(-1, 16, Integer.valueOf(obj.priority));
                    obj.constructorFinished.open();
                }
                z = false;
                SystemClock systemClock22 = exoPlayerImpl3.clock;
                wakeLockManager = new WakeLockManager();
                wakeLockManager.wakeLockManagerInternal = new Recorder.AnonymousClass1((Object) context.getApplicationContext(), false, 28);
                wakeLockManager.wakeLockHandler = systemClock22.createHandler(looper2, callback);
                wakeLockManager.mainHandler = systemClock22.createHandler(Looper.getMainLooper(), callback);
                exoPlayerImpl3.wakeLockManager = wakeLockManager;
                if (wakeLockManager.enabled == z) {
                }
                SystemClock systemClock32 = exoPlayerImpl3.clock;
                VorbisUtil$Mode vorbisUtil$Mode2 = new VorbisUtil$Mode();
                new CueEncoder(context.getApplicationContext(), 11);
                systemClock32.createHandler(looper2, callback);
                systemClock32.createHandler(Looper.getMainLooper(), callback);
                exoPlayerImpl3.wifiLockManager = vorbisUtil$Mode2;
                int i82 = DeviceInfo.$r8$clinit;
                exoPlayerImpl3.videoSize = VideoSize.UNKNOWN;
                exoPlayerImpl3.surfaceSize = Size.UNKNOWN;
                exoPlayerImpl3.virtualDeviceIdChangeListener = i7 < 34 ? exoPlayerImpl3.new VirtualDeviceIdChangeListener(context) : callback;
                exoPlayerImpl3.audioListenerManager = new CallResult(3);
                exoPlayerImpl3.videoListenerManager = new CallResult(3);
                obj = exoPlayerImpl3;
                obj.stuckPlayerDetector = new StuckPlayerDetector((ExoPlayerImpl) obj, exoPlayerImpl3.componentListener, exoPlayerImpl3.clock, builder.stuckBufferingDetectionTimeoutMs, builder.stuckPlayingDetectionTimeoutMs, builder.stuckPlayingNotEndingTimeoutMs, builder.stuckSuppressedDetectionTimeoutMs);
                systemHandlerWrapper.obtainMessage(38, obj.scrubbingModeParameters).sendToTarget();
                AudioAttributes audioAttributes2 = obj.audioAttributes;
                SystemHandlerWrapper.SystemMessage obtainSystemMessage2 = SystemHandlerWrapper.obtainSystemMessage();
                obtainSystemMessage2.message = systemHandlerWrapper.handler.obtainMessage(31, 0, 0, audioAttributes2);
                obtainSystemMessage2.sendToTarget();
                obj.sendRendererMessage(1, 3, obj.audioAttributes);
                obj.sendRendererMessage(2, 4, Integer.valueOf(obj.videoScalingMode));
                obj.sendRendererMessage(2, 5, 0);
                obj.sendRendererMessage(1, 9, Boolean.valueOf(obj.skipSilenceEnabled));
                obj.sendRendererMessage(6, 8, obj.frameMetadataListener);
                obj.sendRendererMessage(-1, 16, Integer.valueOf(obj.priority));
                obj.constructorFinished.open();
            } catch (Throwable th3) {
                th = th3;
                exoPlayerImpl = exoPlayerImpl3;
                exoPlayerImpl.constructorFinished.open();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            exoPlayerImpl = obj;
        }
    }

    public static long getRequestedContentPositionUs(PlaybackInfo playbackInfo) {
        Timeline.Window window = new Timeline.Window();
        Timeline.Period period = new Timeline.Period();
        playbackInfo.timeline.getPeriodByUid(playbackInfo.periodId.periodUid, period);
        long j = playbackInfo.requestedContentPositionUs;
        return j == -9223372036854775807L ? playbackInfo.timeline.getWindow(period.windowIndex, window, 0L).defaultPositionUs : period.positionInWindowUs + j;
    }

    public static PlaybackInfo maskPlaybackState(PlaybackInfo playbackInfo, int i) {
        PlaybackInfo copyWithPlaybackState = playbackInfo.copyWithPlaybackState(i);
        return (i == 1 || i == 4) ? copyWithPlaybackState.copyWithIsLoading(false) : copyWithPlaybackState;
    }

    public final void addListener(Player.Listener listener) {
        listener.getClass();
        this.listeners.add(listener);
    }

    public final MediaMetadata buildUpdatedMediaMetadata() {
        Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return this.staticAndDynamicMediaMetadata;
        }
        MediaItem mediaItem = currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window, 0L).mediaItem;
        MediaMetadata.Builder buildUpon = this.staticAndDynamicMediaMetadata.buildUpon();
        MediaMetadata mediaMetadata = mediaItem.mediaMetadata;
        if (mediaMetadata != null) {
            ImmutableList immutableList = mediaMetadata.supportedCommands;
            byte[] bArr = mediaMetadata.artworkData;
            CharSequence charSequence = mediaMetadata.title;
            if (charSequence != null) {
                buildUpon.title = charSequence;
            }
            CharSequence charSequence2 = mediaMetadata.artist;
            if (charSequence2 != null) {
                buildUpon.artist = charSequence2;
            }
            CharSequence charSequence3 = mediaMetadata.albumTitle;
            if (charSequence3 != null) {
                buildUpon.albumTitle = charSequence3;
            }
            CharSequence charSequence4 = mediaMetadata.albumArtist;
            if (charSequence4 != null) {
                buildUpon.albumArtist = charSequence4;
            }
            CharSequence charSequence5 = mediaMetadata.description;
            if (charSequence5 != null) {
                buildUpon.description = charSequence5;
            }
            if (bArr != null) {
                Integer num = mediaMetadata.artworkDataType;
                buildUpon.artworkData = bArr == null ? null : (byte[]) bArr.clone();
                buildUpon.artworkDataType = num;
                MediaMetadata mediaMetadata2 = MediaMetadata.EMPTY;
            }
            Integer num2 = mediaMetadata.trackNumber;
            if (num2 != null) {
                buildUpon.trackNumber = num2;
            }
            Integer num3 = mediaMetadata.totalTrackCount;
            if (num3 != null) {
                buildUpon.totalTrackCount = num3;
            }
            Integer num4 = mediaMetadata.folderType;
            if (num4 != null) {
                buildUpon.folderType = num4;
            }
            Boolean bool = mediaMetadata.isBrowsable;
            if (bool != null) {
                buildUpon.isBrowsable = bool;
            }
            Integer num5 = mediaMetadata.year;
            if (num5 != null) {
                buildUpon.recordingYear = num5;
            }
            Integer num6 = mediaMetadata.recordingYear;
            if (num6 != null) {
                buildUpon.recordingYear = num6;
            }
            Integer num7 = mediaMetadata.recordingMonth;
            if (num7 != null) {
                buildUpon.recordingMonth = num7;
            }
            Integer num8 = mediaMetadata.recordingDay;
            if (num8 != null) {
                buildUpon.recordingDay = num8;
            }
            Integer num9 = mediaMetadata.releaseYear;
            if (num9 != null) {
                buildUpon.releaseYear = num9;
            }
            Integer num10 = mediaMetadata.releaseMonth;
            if (num10 != null) {
                buildUpon.releaseMonth = num10;
            }
            Integer num11 = mediaMetadata.releaseDay;
            if (num11 != null) {
                buildUpon.releaseDay = num11;
            }
            CharSequence charSequence6 = mediaMetadata.writer;
            if (charSequence6 != null) {
                buildUpon.writer = charSequence6;
            }
            CharSequence charSequence7 = mediaMetadata.composer;
            if (charSequence7 != null) {
                buildUpon.composer = charSequence7;
            }
            CharSequence charSequence8 = mediaMetadata.conductor;
            if (charSequence8 != null) {
                buildUpon.conductor = charSequence8;
            }
            Integer num12 = mediaMetadata.discNumber;
            if (num12 != null) {
                buildUpon.discNumber = num12;
            }
            Integer num13 = mediaMetadata.totalDiscCount;
            if (num13 != null) {
                buildUpon.totalDiscCount = num13;
            }
            CharSequence charSequence9 = mediaMetadata.genre;
            if (charSequence9 != null) {
                buildUpon.genre = charSequence9;
            }
            CharSequence charSequence10 = mediaMetadata.station;
            if (charSequence10 != null) {
                buildUpon.station = charSequence10;
            }
            Integer num14 = mediaMetadata.mediaType;
            if (num14 != null) {
                buildUpon.mediaType = num14;
            }
            if (!immutableList.isEmpty()) {
                buildUpon.supportedCommands = ImmutableList.copyOf((Collection) immutableList);
            }
        }
        return new MediaMetadata(buildUpon);
    }

    public final void clearVideoSurface() {
        verifyApplicationThread();
        removeSurfaceCallbacks();
        setVideoOutputInternal(null);
        maybeNotifySurfaceSizeChanged(0, 0);
    }

    public final PlayerMessage createMessageInternal(PlayerMessage.Target target) {
        int currentWindowIndexInternal = getCurrentWindowIndexInternal(this.playbackInfo);
        Timeline timeline = this.playbackInfo.timeline;
        if (currentWindowIndexInternal == -1) {
            currentWindowIndexInternal = 0;
        }
        ExoPlayerImplInternal exoPlayerImplInternal = this.internalPlayer;
        return new PlayerMessage(exoPlayerImplInternal, target, timeline, currentWindowIndexInternal, exoPlayerImplInternal.playbackLooper);
    }

    public final long getContentBufferedPosition() {
        verifyApplicationThread();
        if (this.playbackInfo.timeline.isEmpty()) {
            return this.maskingWindowPositionMs;
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        long j = 0;
        if (playbackInfo.loadingMediaPeriodId.windowSequenceNumber != playbackInfo.periodId.windowSequenceNumber) {
            return Util.usToMs(playbackInfo.timeline.getWindow(getCurrentMediaItemIndex(), this.window, 0L).durationUs);
        }
        long j2 = playbackInfo.bufferedPositionUs;
        if (this.playbackInfo.loadingMediaPeriodId.isAd()) {
            PlaybackInfo playbackInfo2 = this.playbackInfo;
            playbackInfo2.timeline.getPeriodByUid(playbackInfo2.loadingMediaPeriodId.periodUid, this.period).getAdGroupTimeUs(this.playbackInfo.loadingMediaPeriodId.adGroupIndex);
        } else {
            j = j2;
        }
        PlaybackInfo playbackInfo3 = this.playbackInfo;
        Timeline timeline = playbackInfo3.timeline;
        Object obj = playbackInfo3.loadingMediaPeriodId.periodUid;
        Timeline.Period period = this.period;
        timeline.getPeriodByUid(obj, period);
        return Util.usToMs(j + period.positionInWindowUs);
    }

    public final long getContentPositionInternal(PlaybackInfo playbackInfo) {
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId = playbackInfo.periodId;
        long j = playbackInfo.requestedContentPositionUs;
        Timeline timeline = playbackInfo.timeline;
        if (!mediaSource$MediaPeriodId.isAd()) {
            return Util.usToMs(getCurrentPositionUsInternal(playbackInfo));
        }
        Object obj = playbackInfo.periodId.periodUid;
        Timeline.Period period = this.period;
        timeline.getPeriodByUid(obj, period);
        if (j == -9223372036854775807L) {
            return Util.usToMs(timeline.getWindow(getCurrentWindowIndexInternal(playbackInfo), this.window, 0L).defaultPositionUs);
        }
        return Util.usToMs(j) + Util.usToMs(period.positionInWindowUs);
    }

    public final int getCurrentAdGroupIndex() {
        verifyApplicationThread();
        if (isPlayingAd()) {
            return this.playbackInfo.periodId.adGroupIndex;
        }
        return -1;
    }

    public final int getCurrentAdIndexInAdGroup() {
        verifyApplicationThread();
        if (isPlayingAd()) {
            return this.playbackInfo.periodId.adIndexInAdGroup;
        }
        return -1;
    }

    public final int getCurrentMediaItemIndex() {
        verifyApplicationThread();
        int currentWindowIndexInternal = getCurrentWindowIndexInternal(this.playbackInfo);
        if (currentWindowIndexInternal == -1) {
            return 0;
        }
        return currentWindowIndexInternal;
    }

    public final int getCurrentPeriodIndex() {
        verifyApplicationThread();
        if (!this.playbackInfo.timeline.isEmpty()) {
            PlaybackInfo playbackInfo = this.playbackInfo;
            return playbackInfo.timeline.getIndexOfPeriod(playbackInfo.periodId.periodUid);
        }
        int i = this.maskingWindowIndex;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    public final long getCurrentPosition() {
        verifyApplicationThread();
        return Util.usToMs(getCurrentPositionUsInternal(this.playbackInfo));
    }

    public final long getCurrentPositionUsInternal(PlaybackInfo playbackInfo) {
        if (playbackInfo.timeline.isEmpty()) {
            return Util.msToUs(this.maskingWindowPositionMs);
        }
        long estimatedPositionUs = playbackInfo.sleepingForOffload ? playbackInfo.getEstimatedPositionUs() : playbackInfo.positionUs;
        if (playbackInfo.periodId.isAd()) {
            return estimatedPositionUs;
        }
        Timeline timeline = playbackInfo.timeline;
        Object obj = playbackInfo.periodId.periodUid;
        Timeline.Period period = this.period;
        timeline.getPeriodByUid(obj, period);
        return estimatedPositionUs + period.positionInWindowUs;
    }

    public final Timeline getCurrentTimeline() {
        verifyApplicationThread();
        return this.playbackInfo.timeline;
    }

    public final Tracks getCurrentTracks() {
        verifyApplicationThread();
        return this.playbackInfo.trackSelectorResult.tracks;
    }

    public final int getCurrentWindowIndexInternal(PlaybackInfo playbackInfo) {
        return playbackInfo.timeline.isEmpty() ? this.maskingWindowIndex : playbackInfo.timeline.getPeriodByUid(playbackInfo.periodId.periodUid, this.period).windowIndex;
    }

    public final long getDuration() {
        verifyApplicationThread();
        if (!isPlayingAd()) {
            Timeline currentTimeline = getCurrentTimeline();
            if (currentTimeline.isEmpty()) {
                return -9223372036854775807L;
            }
            return Util.usToMs(currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window, 0L).durationUs);
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId = playbackInfo.periodId;
        Timeline timeline = playbackInfo.timeline;
        Object obj = mediaSource$MediaPeriodId.periodUid;
        Timeline.Period period = this.period;
        timeline.getPeriodByUid(obj, period);
        return Util.usToMs(period.getAdDurationUs(mediaSource$MediaPeriodId.adGroupIndex, mediaSource$MediaPeriodId.adIndexInAdGroup));
    }

    public final boolean getPlayWhenReady() {
        verifyApplicationThread();
        return this.playbackInfo.playWhenReady;
    }

    public final int getPlaybackState() {
        verifyApplicationThread();
        return this.playbackInfo.playbackState;
    }

    public final int getPlaybackSuppressionReason() {
        verifyApplicationThread();
        return this.playbackInfo.playbackSuppressionReason;
    }

    public final TrackSelectionParameters getTrackSelectionParameters() {
        verifyApplicationThread();
        DefaultTrackSelector.Parameters parameters = this.trackSelector.getParameters();
        if (!this.scrubbingModeEnabled) {
            return parameters;
        }
        parameters.getClass();
        DefaultTrackSelector.Parameters.Builder builder = new DefaultTrackSelector.Parameters.Builder(parameters);
        builder.setDisabledTrackTypes(this.disabledTrackTypesWithoutScrubbingMode);
        return new DefaultTrackSelector.Parameters(builder);
    }

    public final boolean isCommandAvailable(int i) {
        verifyApplicationThread();
        return this.availableCommands.flags.flags.get(i);
    }

    public final boolean isCurrentMediaItemLive() {
        Timeline currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window, 0L).isLive();
    }

    public final boolean isPlaying() {
        return getPlaybackState() == 3 && getPlayWhenReady() && getPlaybackSuppressionReason() == 0;
    }

    public final boolean isPlayingAd() {
        verifyApplicationThread();
        return this.playbackInfo.periodId.isAd();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isScrubbingModeEnabled() {
        verifyApplicationThread();
        return this.scrubbingModeEnabled;
    }

    public final PlaybackInfo maskTimelineAndPosition(PlaybackInfo playbackInfo, Timeline timeline, Pair pair) {
        List list;
        Trace.checkArgument(timeline.isEmpty() || pair != null);
        Timeline timeline2 = playbackInfo.timeline;
        long contentPositionInternal = getContentPositionInternal(playbackInfo);
        PlaybackInfo copyWithTimeline = playbackInfo.copyWithTimeline(timeline);
        if (timeline.isEmpty()) {
            MediaSource$MediaPeriodId mediaSource$MediaPeriodId = PlaybackInfo.PLACEHOLDER_MEDIA_PERIOD_ID;
            long msToUs = Util.msToUs(this.maskingWindowPositionMs);
            PlaybackInfo copyWithLoadingMediaPeriodId = copyWithTimeline.copyWithNewPosition(mediaSource$MediaPeriodId, msToUs, msToUs, msToUs, 0L, TrackGroupArray.EMPTY, this.emptyTrackSelectorResult, RegularImmutableList.EMPTY).copyWithLoadingMediaPeriodId(mediaSource$MediaPeriodId);
            copyWithLoadingMediaPeriodId.bufferedPositionUs = copyWithLoadingMediaPeriodId.positionUs;
            return copyWithLoadingMediaPeriodId;
        }
        Object obj = copyWithTimeline.periodId.periodUid;
        boolean equals = obj.equals(pair.first);
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId2 = !equals ? new MediaSource$MediaPeriodId(pair.first) : copyWithTimeline.periodId;
        long longValue = ((Long) pair.second).longValue();
        long msToUs2 = Util.msToUs(contentPositionInternal);
        if (!timeline2.isEmpty()) {
            msToUs2 -= timeline2.getPeriodByUid(obj, this.period).positionInWindowUs;
            if (equals && msToUs2 - longValue == 1 && msToUs2 == timeline2.getPeriodByUid(obj, this.period).durationUs) {
                msToUs2--;
            }
        }
        if (!equals || longValue < msToUs2) {
            MediaSource$MediaPeriodId mediaSource$MediaPeriodId3 = mediaSource$MediaPeriodId2;
            Trace.checkState(!mediaSource$MediaPeriodId3.isAd());
            TrackGroupArray trackGroupArray = !equals ? TrackGroupArray.EMPTY : copyWithTimeline.trackGroups;
            TrackSelectorResult trackSelectorResult = !equals ? this.emptyTrackSelectorResult : copyWithTimeline.trackSelectorResult;
            if (equals) {
                list = copyWithTimeline.staticMetadata;
            } else {
                ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
                list = RegularImmutableList.EMPTY;
            }
            PlaybackInfo copyWithLoadingMediaPeriodId2 = copyWithTimeline.copyWithNewPosition(mediaSource$MediaPeriodId3, longValue, longValue, longValue, 0L, trackGroupArray, trackSelectorResult, list).copyWithLoadingMediaPeriodId(mediaSource$MediaPeriodId3);
            copyWithLoadingMediaPeriodId2.bufferedPositionUs = longValue;
            return copyWithLoadingMediaPeriodId2;
        }
        if (longValue != msToUs2) {
            MediaSource$MediaPeriodId mediaSource$MediaPeriodId4 = mediaSource$MediaPeriodId2;
            Trace.checkState(!mediaSource$MediaPeriodId4.isAd());
            long max = Math.max(0L, copyWithTimeline.totalBufferedDurationUs - (longValue - msToUs2));
            long j = copyWithTimeline.bufferedPositionUs;
            if (copyWithTimeline.loadingMediaPeriodId.equals(copyWithTimeline.periodId)) {
                j = longValue + max;
            }
            PlaybackInfo copyWithNewPosition = copyWithTimeline.copyWithNewPosition(mediaSource$MediaPeriodId4, longValue, longValue, longValue, max, copyWithTimeline.trackGroups, copyWithTimeline.trackSelectorResult, copyWithTimeline.staticMetadata);
            copyWithNewPosition.bufferedPositionUs = j;
            return copyWithNewPosition;
        }
        int indexOfPeriod = timeline.getIndexOfPeriod(copyWithTimeline.loadingMediaPeriodId.periodUid);
        if (indexOfPeriod != -1 && timeline.getPeriod(indexOfPeriod, this.period, false).windowIndex == timeline.getPeriodByUid(mediaSource$MediaPeriodId2.periodUid, this.period).windowIndex) {
            return copyWithTimeline;
        }
        timeline.getPeriodByUid(mediaSource$MediaPeriodId2.periodUid, this.period);
        boolean isAd = mediaSource$MediaPeriodId2.isAd();
        Timeline.Period period = this.period;
        long adDurationUs = isAd ? period.getAdDurationUs(mediaSource$MediaPeriodId2.adGroupIndex, mediaSource$MediaPeriodId2.adIndexInAdGroup) : period.durationUs;
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId5 = mediaSource$MediaPeriodId2;
        PlaybackInfo copyWithLoadingMediaPeriodId3 = copyWithTimeline.copyWithNewPosition(mediaSource$MediaPeriodId5, copyWithTimeline.positionUs, copyWithTimeline.positionUs, copyWithTimeline.discontinuityStartPositionUs, adDurationUs - copyWithTimeline.positionUs, copyWithTimeline.trackGroups, copyWithTimeline.trackSelectorResult, copyWithTimeline.staticMetadata).copyWithLoadingMediaPeriodId(mediaSource$MediaPeriodId5);
        copyWithLoadingMediaPeriodId3.bufferedPositionUs = adDurationUs;
        return copyWithLoadingMediaPeriodId3;
    }

    public final Pair maskWindowPositionMsOrGetPeriodPositionUs(Timeline timeline, int i, long j) {
        if (timeline.isEmpty()) {
            this.maskingWindowIndex = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.maskingWindowPositionMs = j;
            return null;
        }
        if (i == -1 || i >= timeline.getWindowCount()) {
            i = timeline.getFirstWindowIndex(this.shuffleModeEnabled);
            j = Util.usToMs(timeline.getWindow(i, this.window, 0L).defaultPositionUs);
        }
        return timeline.getPeriodPositionUs(this.window, this.period, i, Util.msToUs(j));
    }

    public final void maybeNotifySurfaceSizeChanged(final int i, final int i2) {
        Size size = this.surfaceSize;
        if (i == size.width && i2 == size.height) {
            return;
        }
        this.surfaceSize = new Size(i, i2);
        this.listeners.sendEvent(24, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda22
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((Player.Listener) obj).onSurfaceSizeChanged(i, i2);
            }
        });
        sendRendererMessage(2, 14, new Size(i, i2));
    }

    public final void prepare() {
        verifyApplicationThread();
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.playbackState != 1) {
            return;
        }
        PlaybackInfo copyWithPlaybackError = playbackInfo.copyWithPlaybackError(null);
        PlaybackInfo maskPlaybackState = maskPlaybackState(copyWithPlaybackError, copyWithPlaybackError.timeline.isEmpty() ? 4 : 2);
        this.pendingOperationAcks++;
        this.internalPlayer.handler.obtainMessage(29).sendToTarget();
        updatePlaybackInfo(maskPlaybackState, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final void release() {
        String str;
        boolean z;
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [AndroidXMedia3/1.10.1] [");
        sb.append(Util.DEVICE_DEBUG_INFO);
        sb.append("] [");
        HashSet hashSet = MediaLibraryInfo.registeredModules;
        synchronized (MediaLibraryInfo.class) {
            str = MediaLibraryInfo.registeredModulesString;
        }
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        verifyApplicationThread();
        this.audioBecomingNoisyManager.setEnabled();
        this.wakeLockManager.setStayAwake(false);
        this.wifiLockManager.setStayAwake(false);
        VirtualDeviceIdChangeListener virtualDeviceIdChangeListener = this.virtualDeviceIdChangeListener;
        if (virtualDeviceIdChangeListener != null && Build.VERSION.SDK_INT >= 34) {
            VirtualDeviceIdChangeListener.access$400(virtualDeviceIdChangeListener);
        }
        StuckPlayerDetector stuckPlayerDetector = this.stuckPlayerDetector;
        ((SystemHandlerWrapper) stuckPlayerDetector.handler).handler.removeCallbacksAndMessages(null);
        ((ExoPlayerImpl) stuckPlayerDetector.player).removeListener((StuckPlayerDetector.AnonymousClass1) stuckPlayerDetector.playerListener);
        ExoPlayerImplInternal exoPlayerImplInternal = this.internalPlayer;
        if (exoPlayerImplInternal.releasedOnApplicationThread || !exoPlayerImplInternal.playbackLooper.getThread().isAlive()) {
            z = true;
        } else {
            exoPlayerImplInternal.releasedOnApplicationThread = true;
            ConditionVariable conditionVariable = new ConditionVariable(exoPlayerImplInternal.clock);
            exoPlayerImplInternal.handler.obtainMessage(7, conditionVariable).sendToTarget();
            z = conditionVariable.blockUninterruptible(exoPlayerImplInternal.releaseTimeoutMs);
        }
        if (!z) {
            this.listeners.sendEvent(10, new DifferentialMotionFlingController$$ExternalSyntheticLambda0(17));
        }
        this.listeners.release();
        this.playbackInfoUpdateHandler.handler.removeCallbacksAndMessages(null);
        DefaultBandwidthMeter defaultBandwidthMeter = this.bandwidthMeter;
        DefaultAnalyticsCollector defaultAnalyticsCollector = this.analyticsCollector;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) defaultBandwidthMeter.eventDispatcher.this$0;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            BandwidthMeter$EventListener$EventDispatcher$HandlerAndListener bandwidthMeter$EventListener$EventDispatcher$HandlerAndListener = (BandwidthMeter$EventListener$EventDispatcher$HandlerAndListener) it.next();
            if (bandwidthMeter$EventListener$EventDispatcher$HandlerAndListener.listener == defaultAnalyticsCollector) {
                bandwidthMeter$EventListener$EventDispatcher$HandlerAndListener.released = true;
                copyOnWriteArrayList.remove(bandwidthMeter$EventListener$EventDispatcher$HandlerAndListener);
            }
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.sleepingForOffload) {
            this.playbackInfo = playbackInfo.copyWithEstimatedPosition();
        }
        PlaybackInfo maskPlaybackState = maskPlaybackState(this.playbackInfo, 1);
        this.playbackInfo = maskPlaybackState;
        PlaybackInfo copyWithLoadingMediaPeriodId = maskPlaybackState.copyWithLoadingMediaPeriodId(maskPlaybackState.periodId);
        this.playbackInfo = copyWithLoadingMediaPeriodId;
        copyWithLoadingMediaPeriodId.bufferedPositionUs = copyWithLoadingMediaPeriodId.positionUs;
        this.playbackInfo.totalBufferedDurationUs = 0L;
        DefaultAnalyticsCollector defaultAnalyticsCollector2 = this.analyticsCollector;
        SystemHandlerWrapper systemHandlerWrapper = defaultAnalyticsCollector2.handler;
        systemHandlerWrapper.getClass();
        systemHandlerWrapper.post(new AFd1lSDK$$ExternalSyntheticLambda0(defaultAnalyticsCollector2, 11));
        removeSurfaceCallbacks();
        Surface surface = this.ownedSurface;
        if (surface != null) {
            surface.release();
            this.ownedSurface = null;
        }
        this.currentCueGroup = CueGroup.EMPTY_TIME_ZERO;
        this.playerReleased = true;
    }

    public final void removeListener(Player.Listener listener) {
        verifyApplicationThread();
        listener.getClass();
        this.listeners.remove(listener);
    }

    public final void removeSurfaceCallbacks() {
        SphericalGLSurfaceView sphericalGLSurfaceView = this.sphericalGLSurfaceView;
        ComponentListener componentListener = this.componentListener;
        if (sphericalGLSurfaceView != null) {
            PlayerMessage createMessageInternal = createMessageInternal(this.frameMetadataListener);
            Trace.checkState(!createMessageInternal.isSent);
            createMessageInternal.f877type = 10000;
            Trace.checkState(!createMessageInternal.isSent);
            createMessageInternal.payload = null;
            createMessageInternal.send();
            this.sphericalGLSurfaceView.videoSurfaceListeners.remove(componentListener);
            this.sphericalGLSurfaceView = null;
        }
        TextureView textureView = this.textureView;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != componentListener) {
                Log.w("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.textureView.setSurfaceTextureListener(null);
            }
            this.textureView = null;
        }
        SurfaceHolder surfaceHolder = this.surfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(componentListener);
            this.surfaceHolder = null;
        }
    }

    public final void seekTo(long j, int i, boolean z) {
        verifyApplicationThread();
        if (i == -1) {
            return;
        }
        Trace.checkArgument(i >= 0);
        Timeline timeline = this.playbackInfo.timeline;
        if (timeline.isEmpty() || i < timeline.getWindowCount()) {
            DefaultAnalyticsCollector defaultAnalyticsCollector = this.analyticsCollector;
            if (!defaultAnalyticsCollector.isSeeking) {
                AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = defaultAnalyticsCollector.generateCurrentPlayerMediaPeriodEventTime();
                defaultAnalyticsCollector.isSeeking = true;
                defaultAnalyticsCollector.sendEvent(generateCurrentPlayerMediaPeriodEventTime, -1, new DifferentialMotionFlingController$$ExternalSyntheticLambda0(19));
            }
            this.pendingOperationAcks++;
            if (isPlayingAd()) {
                Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                NalUnitTargetBuffer nalUnitTargetBuffer = new NalUnitTargetBuffer(this.playbackInfo);
                nalUnitTargetBuffer.incrementPendingOperationAcks(1);
                ExoPlayerImpl exoPlayerImpl = this.playbackInfoUpdateListener.f$0;
                exoPlayerImpl.playbackInfoUpdateHandler.post(new DispatchQueue$$ExternalSyntheticLambda0(17, exoPlayerImpl, nalUnitTargetBuffer));
                return;
            }
            PlaybackInfo playbackInfo = this.playbackInfo;
            int i2 = playbackInfo.playbackState;
            if (i2 == 3 || (i2 == 4 && !timeline.isEmpty())) {
                playbackInfo = this.playbackInfo.copyWithPlaybackState(2);
            }
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            PlaybackInfo maskTimelineAndPosition = maskTimelineAndPosition(playbackInfo, timeline, maskWindowPositionMsOrGetPeriodPositionUs(timeline, i, j));
            this.internalPlayer.handler.obtainMessage(3, new ExoPlayerImplInternal.SeekPosition(timeline, i, Util.msToUs(j))).sendToTarget();
            updatePlaybackInfo(maskTimelineAndPosition, 0, true, 1, getCurrentPositionUsInternal(maskTimelineAndPosition), currentMediaItemIndex, z);
        }
    }

    public final void seekToNext() {
        int nextWindowIndex;
        int nextWindowIndex2;
        if (getCurrentTimeline().isEmpty() || isPlayingAd()) {
            verifyApplicationThread();
            return;
        }
        Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            nextWindowIndex = -1;
        } else {
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            verifyApplicationThread();
            int i = this.repeatMode;
            if (i == 1) {
                i = 0;
            }
            verifyApplicationThread();
            nextWindowIndex = currentTimeline.getNextWindowIndex(currentMediaItemIndex, i, this.shuffleModeEnabled);
        }
        if (nextWindowIndex == -1) {
            if (isCurrentMediaItemLive()) {
                Timeline currentTimeline2 = getCurrentTimeline();
                if (!currentTimeline2.isEmpty() && currentTimeline2.getWindow(getCurrentMediaItemIndex(), this.window, 0L).isDynamic) {
                    seekTo(-9223372036854775807L, getCurrentMediaItemIndex(), false);
                    return;
                }
            }
            verifyApplicationThread();
            return;
        }
        Timeline currentTimeline3 = getCurrentTimeline();
        if (currentTimeline3.isEmpty()) {
            nextWindowIndex2 = -1;
        } else {
            int currentMediaItemIndex2 = getCurrentMediaItemIndex();
            verifyApplicationThread();
            int i2 = this.repeatMode;
            if (i2 == 1) {
                i2 = 0;
            }
            verifyApplicationThread();
            nextWindowIndex2 = currentTimeline3.getNextWindowIndex(currentMediaItemIndex2, i2, this.shuffleModeEnabled);
        }
        if (nextWindowIndex2 == -1) {
            verifyApplicationThread();
        } else if (nextWindowIndex2 == getCurrentMediaItemIndex()) {
            seekTo(-9223372036854775807L, getCurrentMediaItemIndex(), true);
        } else {
            seekTo(-9223372036854775807L, nextWindowIndex2, false);
        }
    }

    public final void seekToPrevious() {
        int previousWindowIndex;
        int previousWindowIndex2;
        int previousWindowIndex3;
        if (getCurrentTimeline().isEmpty() || isPlayingAd()) {
            verifyApplicationThread();
            return;
        }
        Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            previousWindowIndex = -1;
        } else {
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            verifyApplicationThread();
            int i = this.repeatMode;
            if (i == 1) {
                i = 0;
            }
            verifyApplicationThread();
            previousWindowIndex = currentTimeline.getPreviousWindowIndex(currentMediaItemIndex, i, this.shuffleModeEnabled);
        }
        boolean z = previousWindowIndex != -1;
        if (isCurrentMediaItemLive()) {
            Timeline currentTimeline2 = getCurrentTimeline();
            if (currentTimeline2.isEmpty() || !currentTimeline2.getWindow(getCurrentMediaItemIndex(), this.window, 0L).isSeekable) {
                if (!z) {
                    verifyApplicationThread();
                    return;
                }
                Timeline currentTimeline3 = getCurrentTimeline();
                if (currentTimeline3.isEmpty()) {
                    previousWindowIndex3 = -1;
                } else {
                    int currentMediaItemIndex2 = getCurrentMediaItemIndex();
                    verifyApplicationThread();
                    int i2 = this.repeatMode;
                    if (i2 == 1) {
                        i2 = 0;
                    }
                    verifyApplicationThread();
                    previousWindowIndex3 = currentTimeline3.getPreviousWindowIndex(currentMediaItemIndex2, i2, this.shuffleModeEnabled);
                }
                if (previousWindowIndex3 == -1) {
                    verifyApplicationThread();
                    return;
                } else if (previousWindowIndex3 == getCurrentMediaItemIndex()) {
                    seekTo(-9223372036854775807L, getCurrentMediaItemIndex(), true);
                    return;
                } else {
                    seekTo(-9223372036854775807L, previousWindowIndex3, false);
                    return;
                }
            }
        }
        if (z) {
            long currentPosition = getCurrentPosition();
            verifyApplicationThread();
            if (currentPosition <= this.maxSeekToPreviousPositionMs) {
                Timeline currentTimeline4 = getCurrentTimeline();
                if (currentTimeline4.isEmpty()) {
                    previousWindowIndex2 = -1;
                } else {
                    int currentMediaItemIndex3 = getCurrentMediaItemIndex();
                    verifyApplicationThread();
                    int i3 = this.repeatMode;
                    if (i3 == 1) {
                        i3 = 0;
                    }
                    verifyApplicationThread();
                    previousWindowIndex2 = currentTimeline4.getPreviousWindowIndex(currentMediaItemIndex3, i3, this.shuffleModeEnabled);
                }
                if (previousWindowIndex2 == -1) {
                    verifyApplicationThread();
                    return;
                } else if (previousWindowIndex2 == getCurrentMediaItemIndex()) {
                    seekTo(-9223372036854775807L, getCurrentMediaItemIndex(), true);
                    return;
                } else {
                    seekTo(-9223372036854775807L, previousWindowIndex2, false);
                    return;
                }
            }
        }
        seekTo(0L, getCurrentMediaItemIndex(), false);
    }

    public final void sendRendererMessage(int i, int i2, Object obj) {
        for (BaseRenderer baseRenderer : this.renderers) {
            if (i == -1 || baseRenderer.trackType == i) {
                PlayerMessage createMessageInternal = createMessageInternal(baseRenderer);
                Trace.checkState(!createMessageInternal.isSent);
                createMessageInternal.f877type = i2;
                Trace.checkState(!createMessageInternal.isSent);
                createMessageInternal.payload = obj;
                createMessageInternal.send();
            }
        }
        for (BaseRenderer baseRenderer2 : this.secondaryRenderers) {
            if (baseRenderer2 != null && (i == -1 || baseRenderer2.trackType == i)) {
                PlayerMessage createMessageInternal2 = createMessageInternal(baseRenderer2);
                Trace.checkState(!createMessageInternal2.isSent);
                createMessageInternal2.f877type = i2;
                Trace.checkState(!createMessageInternal2.isSent);
                createMessageInternal2.payload = obj;
                createMessageInternal2.send();
            }
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        verifyApplicationThread();
        sendRendererMessage(4, 15, imageOutput);
    }

    public final void setMediaItems(List list) {
        verifyApplicationThread();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.mediaSourceFactory.createMediaSource((MediaItem) list.get(i)));
        }
        setMediaSources(arrayList);
    }

    public final void setMediaSources(List list) {
        verifyApplicationThread();
        getCurrentWindowIndexInternal(this.playbackInfo);
        getCurrentPosition();
        this.pendingOperationAcks++;
        ArrayList arrayList = this.mediaSourceHolderSnapshots;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            MediaSourceList.MediaSourceHolder mediaSourceHolder = new MediaSourceList.MediaSourceHolder((BaseMediaSource) list.get(i), this.useLazyPreparation);
            arrayList2.add(mediaSourceHolder);
            arrayList.add(i, new MediaSourceHolderSnapshot(mediaSourceHolder.uid, mediaSourceHolder.mediaSource));
        }
        ShuffleOrder$DefaultShuffleOrder shuffleOrder$DefaultShuffleOrder = this.shuffleOrder;
        int size = arrayList2.size();
        shuffleOrder$DefaultShuffleOrder.getClass();
        this.shuffleOrder = new ShuffleOrder$DefaultShuffleOrder(new Random(shuffleOrder$DefaultShuffleOrder.random.nextLong())).cloneAndInsert(size);
        PlaylistTimeline playlistTimeline = new PlaylistTimeline(arrayList, this.shuffleOrder);
        boolean isEmpty = playlistTimeline.isEmpty();
        int i2 = playlistTimeline.windowCount;
        if (!isEmpty && -1 >= i2) {
            throw new IllegalSeekPositionException();
        }
        int firstWindowIndex = playlistTimeline.getFirstWindowIndex(this.shuffleModeEnabled);
        PlaybackInfo maskTimelineAndPosition = maskTimelineAndPosition(this.playbackInfo, playlistTimeline, maskWindowPositionMsOrGetPeriodPositionUs(playlistTimeline, firstWindowIndex, -9223372036854775807L));
        int i3 = maskTimelineAndPosition.playbackState;
        if (i3 == 1) {
            i3 = 1;
        } else {
            if (!playlistTimeline.isEmpty()) {
                if (firstWindowIndex != -1) {
                    if (firstWindowIndex < i2) {
                        i3 = 2;
                    }
                }
            }
            i3 = 4;
        }
        PlaybackInfo maskPlaybackState = maskPlaybackState(maskTimelineAndPosition, i3);
        this.internalPlayer.handler.obtainMessage(17, new ExoPlayerImplInternal.MediaSourceListUpdateMessage(arrayList2, this.shuffleOrder, firstWindowIndex, Util.msToUs(-9223372036854775807L))).sendToTarget();
        updatePlaybackInfo(maskPlaybackState, 0, (this.playbackInfo.periodId.periodUid.equals(maskPlaybackState.periodId.periodUid) || this.playbackInfo.timeline.isEmpty()) ? false : true, 4, getCurrentPositionUsInternal(maskPlaybackState), -1, false);
    }

    public final void setNonVideoOutputSurfaceHolderInternal(SurfaceHolder surfaceHolder) {
        this.surfaceHolderSurfaceIsVideoOutput = false;
        this.surfaceHolder = surfaceHolder;
        surfaceHolder.addCallback(this.componentListener);
        Surface surface = this.surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            maybeNotifySurfaceSizeChanged(0, 0);
        } else {
            Rect surfaceFrame = this.surfaceHolder.getSurfaceFrame();
            maybeNotifySurfaceSizeChanged(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void setPlayWhenReady(boolean z) {
        verifyApplicationThread();
        updatePlayWhenReady(1, z);
    }

    public final void setRepeatMode(int i) {
        verifyApplicationThread();
        if (this.repeatMode != i) {
            this.repeatMode = i;
            this.internalPlayer.handler.obtainMessage(11, i, 0).sendToTarget();
            ExoPlayerImpl$$ExternalSyntheticLambda25 exoPlayerImpl$$ExternalSyntheticLambda25 = new ExoPlayerImpl$$ExternalSyntheticLambda25(i, 1);
            ListenerSet listenerSet = this.listeners;
            listenerSet.queueEvent(8, exoPlayerImpl$$ExternalSyntheticLambda25);
            updateAvailableCommands();
            listenerSet.flushEvents();
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setScrubbingModeEnabled(boolean z) {
        TrackSelectionParameters trackSelectionParameters;
        verifyApplicationThread();
        if (z == this.scrubbingModeEnabled) {
            return;
        }
        this.scrubbingModeEnabled = z;
        ScrubbingModeParameters scrubbingModeParameters = this.scrubbingModeParameters;
        if (!scrubbingModeParameters.disabledTrackTypes.isEmpty()) {
            DefaultTrackSelector defaultTrackSelector = this.trackSelector;
            defaultTrackSelector.getClass();
            DefaultTrackSelector.Parameters parameters = defaultTrackSelector.getParameters();
            if (z) {
                this.disabledTrackTypesWithoutScrubbingMode = parameters.disabledTrackTypes;
                ImmutableSet immutableSet = scrubbingModeParameters.disabledTrackTypes;
                TrackSelectionParameters.Builder buildUpon = parameters.buildUpon();
                UnmodifiableIterator it = immutableSet.iterator();
                while (it.hasNext()) {
                    buildUpon.setTrackTypeDisabled(((Integer) it.next()).intValue(), true);
                }
                trackSelectionParameters = buildUpon.build();
            } else {
                parameters.getClass();
                DefaultTrackSelector.Parameters.Builder builder = new DefaultTrackSelector.Parameters.Builder(parameters);
                builder.setDisabledTrackTypes(this.disabledTrackTypesWithoutScrubbingMode);
                DefaultTrackSelector.Parameters parameters2 = new DefaultTrackSelector.Parameters(builder);
                this.disabledTrackTypesWithoutScrubbingMode = null;
                trackSelectionParameters = parameters2;
            }
            if (!trackSelectionParameters.equals(parameters)) {
                defaultTrackSelector.setParameters(trackSelectionParameters);
            }
        }
        this.internalPlayer.handler.obtainMessage(36, Boolean.valueOf(z)).sendToTarget();
        PlaybackInfo playbackInfo = this.playbackInfo;
        updatePlayWhenReady(playbackInfo.playWhenReadyChangeReason, playbackInfo.playWhenReady);
    }

    public final void setTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
        TrackSelectionParameters trackSelectionParameters2;
        verifyApplicationThread();
        DefaultTrackSelector defaultTrackSelector = this.trackSelector;
        defaultTrackSelector.getClass();
        TrackSelectionParameters trackSelectionParameters3 = getTrackSelectionParameters();
        if (this.scrubbingModeEnabled) {
            this.disabledTrackTypesWithoutScrubbingMode = trackSelectionParameters.disabledTrackTypes;
            ImmutableSet immutableSet = this.scrubbingModeParameters.disabledTrackTypes;
            TrackSelectionParameters.Builder buildUpon = trackSelectionParameters.buildUpon();
            UnmodifiableIterator it = immutableSet.iterator();
            while (it.hasNext()) {
                buildUpon.setTrackTypeDisabled(((Integer) it.next()).intValue(), true);
            }
            trackSelectionParameters2 = buildUpon.build();
        } else {
            trackSelectionParameters2 = trackSelectionParameters;
        }
        if (!trackSelectionParameters2.equals(defaultTrackSelector.getParameters())) {
            defaultTrackSelector.setParameters(trackSelectionParameters2);
        }
        if (trackSelectionParameters3.equals(trackSelectionParameters)) {
            return;
        }
        this.listeners.sendEvent(19, new StreamSharing$$ExternalSyntheticLambda1(trackSelectionParameters, 29));
    }

    public final void setVideoOutputInternal(Object obj) {
        Object obj2 = this.videoOutput;
        boolean z = true;
        boolean z2 = (obj2 == null || obj2 == obj) ? false : true;
        long j = z2 ? this.detachSurfaceTimeoutMs : -9223372036854775807L;
        ExoPlayerImplInternal exoPlayerImplInternal = this.internalPlayer;
        if (!exoPlayerImplInternal.releasedOnApplicationThread && exoPlayerImplInternal.playbackLooper.getThread().isAlive()) {
            ConditionVariable conditionVariable = new ConditionVariable(exoPlayerImplInternal.clock);
            exoPlayerImplInternal.handler.obtainMessage(30, new Pair(obj, conditionVariable)).sendToTarget();
            if (j != -9223372036854775807L) {
                z = conditionVariable.blockUninterruptible(j);
            }
        }
        if (z2) {
            Object obj3 = this.videoOutput;
            Surface surface = this.ownedSurface;
            if (obj3 == surface) {
                surface.release();
                this.ownedSurface = null;
            }
        }
        this.videoOutput = obj;
        if (z) {
            return;
        }
        stopInternal(new ExoPlaybackException(2, new ExoTimeoutException("Detaching surface timed out."), IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_COLOR_TABLE));
    }

    public final void setVideoSurfaceView(SurfaceView surfaceView) {
        verifyApplicationThread();
        if (surfaceView instanceof VideoDecoderGLSurfaceView) {
            removeSurfaceCallbacks();
            setVideoOutputInternal(surfaceView);
            setNonVideoOutputSurfaceHolderInternal(surfaceView.getHolder());
            return;
        }
        boolean z = surfaceView instanceof SphericalGLSurfaceView;
        ComponentListener componentListener = this.componentListener;
        if (z) {
            removeSurfaceCallbacks();
            this.sphericalGLSurfaceView = (SphericalGLSurfaceView) surfaceView;
            PlayerMessage createMessageInternal = createMessageInternal(this.frameMetadataListener);
            Trace.checkState(!createMessageInternal.isSent);
            createMessageInternal.f877type = 10000;
            SphericalGLSurfaceView sphericalGLSurfaceView = this.sphericalGLSurfaceView;
            Trace.checkState(true ^ createMessageInternal.isSent);
            createMessageInternal.payload = sphericalGLSurfaceView;
            createMessageInternal.send();
            this.sphericalGLSurfaceView.videoSurfaceListeners.add(componentListener);
            setVideoOutputInternal(this.sphericalGLSurfaceView.surface);
            setNonVideoOutputSurfaceHolderInternal(surfaceView.getHolder());
            return;
        }
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        verifyApplicationThread();
        if (holder == null) {
            clearVideoSurface();
            return;
        }
        removeSurfaceCallbacks();
        this.surfaceHolderSurfaceIsVideoOutput = true;
        this.surfaceHolder = holder;
        holder.addCallback(componentListener);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            setVideoOutputInternal(null);
            maybeNotifySurfaceSizeChanged(0, 0);
        } else {
            setVideoOutputInternal(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            maybeNotifySurfaceSizeChanged(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void setVideoTextureView(TextureView textureView) {
        verifyApplicationThread();
        if (textureView == null) {
            clearVideoSurface();
            return;
        }
        removeSurfaceCallbacks();
        this.textureView = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            Log.w("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.componentListener);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            setVideoOutputInternal(null);
            maybeNotifySurfaceSizeChanged(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            setVideoOutputInternal(surface);
            this.ownedSurface = surface;
            maybeNotifySurfaceSizeChanged(textureView.getWidth(), textureView.getHeight());
        }
    }

    public final void setVolume(float f) {
        verifyApplicationThread();
        final float constrainValue = Util.constrainValue(f, RecyclerView.DECELERATION_RATE, 1.0f);
        if (this.volume == constrainValue) {
            return;
        }
        this.volume = constrainValue;
        this.internalPlayer.handler.obtainMessage(32, Float.valueOf(constrainValue)).sendToTarget();
        this.listeners.sendEvent(22, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((Player.Listener) obj).onVolumeChanged(constrainValue);
            }
        });
    }

    public final void stopInternal(ExoPlaybackException exoPlaybackException) {
        PlaybackInfo playbackInfo = this.playbackInfo;
        PlaybackInfo copyWithLoadingMediaPeriodId = playbackInfo.copyWithLoadingMediaPeriodId(playbackInfo.periodId);
        copyWithLoadingMediaPeriodId.bufferedPositionUs = copyWithLoadingMediaPeriodId.positionUs;
        copyWithLoadingMediaPeriodId.totalBufferedDurationUs = 0L;
        PlaybackInfo maskPlaybackState = maskPlaybackState(copyWithLoadingMediaPeriodId, 1);
        if (exoPlaybackException != null) {
            maskPlaybackState = maskPlaybackState.copyWithPlaybackError(exoPlaybackException);
        }
        this.pendingOperationAcks++;
        this.internalPlayer.handler.obtainMessage(6).sendToTarget();
        updatePlaybackInfo(maskPlaybackState, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void updateAvailableCommands() {
        int previousWindowIndex;
        int nextWindowIndex;
        Player.Commands commands = this.availableCommands;
        String str = Util.DEVICE_DEBUG_INFO;
        ExoPlayerImpl exoPlayerImpl = this.wrappingPlayer;
        boolean isPlayingAd = exoPlayerImpl.isPlayingAd();
        Timeline.Window window = exoPlayerImpl.window;
        Timeline currentTimeline = exoPlayerImpl.getCurrentTimeline();
        boolean z = !currentTimeline.isEmpty() && currentTimeline.getWindow(exoPlayerImpl.getCurrentMediaItemIndex(), window, 0L).isSeekable;
        Timeline currentTimeline2 = exoPlayerImpl.getCurrentTimeline();
        if (currentTimeline2.isEmpty()) {
            previousWindowIndex = -1;
        } else {
            int currentMediaItemIndex = exoPlayerImpl.getCurrentMediaItemIndex();
            exoPlayerImpl.verifyApplicationThread();
            int i = exoPlayerImpl.repeatMode;
            if (i == 1) {
                i = 0;
            }
            exoPlayerImpl.verifyApplicationThread();
            previousWindowIndex = currentTimeline2.getPreviousWindowIndex(currentMediaItemIndex, i, exoPlayerImpl.shuffleModeEnabled);
        }
        boolean z2 = previousWindowIndex != -1;
        Timeline currentTimeline3 = exoPlayerImpl.getCurrentTimeline();
        if (currentTimeline3.isEmpty()) {
            nextWindowIndex = -1;
        } else {
            int currentMediaItemIndex2 = exoPlayerImpl.getCurrentMediaItemIndex();
            exoPlayerImpl.verifyApplicationThread();
            int i2 = exoPlayerImpl.repeatMode;
            if (i2 == 1) {
                i2 = 0;
            }
            exoPlayerImpl.verifyApplicationThread();
            nextWindowIndex = currentTimeline3.getNextWindowIndex(currentMediaItemIndex2, i2, exoPlayerImpl.shuffleModeEnabled);
        }
        boolean z3 = nextWindowIndex != -1;
        boolean isCurrentMediaItemLive = exoPlayerImpl.isCurrentMediaItemLive();
        Timeline currentTimeline4 = exoPlayerImpl.getCurrentTimeline();
        boolean z4 = !currentTimeline4.isEmpty() && currentTimeline4.getWindow(exoPlayerImpl.getCurrentMediaItemIndex(), window, 0L).isDynamic;
        boolean isEmpty = exoPlayerImpl.getCurrentTimeline().isEmpty();
        Recorder.AnonymousClass6 anonymousClass6 = new Recorder.AnonymousClass6(23);
        FlagSet.Builder builder = (FlagSet.Builder) anonymousClass6.this$0;
        FlagSet flagSet = this.permanentAvailableCommands.flags;
        builder.getClass();
        for (int i3 = 0; i3 < flagSet.flags.size(); i3++) {
            builder.add(flagSet.get(i3));
        }
        boolean z5 = !isPlayingAd;
        anonymousClass6.addIf(4, z5);
        anonymousClass6.addIf(5, z && !isPlayingAd);
        anonymousClass6.addIf(6, z2 && !isPlayingAd);
        anonymousClass6.addIf(7, !isEmpty && (z2 || !isCurrentMediaItemLive || z) && !isPlayingAd);
        anonymousClass6.addIf(8, z3 && !isPlayingAd);
        anonymousClass6.addIf(9, !isEmpty && (z3 || (isCurrentMediaItemLive && z4)) && !isPlayingAd);
        anonymousClass6.addIf(10, z5);
        anonymousClass6.addIf(11, z && !isPlayingAd);
        anonymousClass6.addIf(12, z && !isPlayingAd);
        Player.Commands commands2 = new Player.Commands(builder.build());
        this.availableCommands = commands2;
        if (commands2.equals(commands)) {
            return;
        }
        this.listeners.queueEvent(13, new ExoPlayerImpl$$ExternalSyntheticLambda19(this));
    }

    public final void updatePlayWhenReady(int i, boolean z) {
        int i2 = this.scrubbingModeEnabled ? 4 : (this.playbackInfo.playbackSuppressionReason != 1 || z) ? 0 : 1;
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.playWhenReady == z && playbackInfo.playbackSuppressionReason == i2 && playbackInfo.playWhenReadyChangeReason == i) {
            return;
        }
        this.pendingOperationAcks++;
        if (playbackInfo.sleepingForOffload) {
            playbackInfo = playbackInfo.copyWithEstimatedPosition();
        }
        PlaybackInfo copyWithPlayWhenReady = playbackInfo.copyWithPlayWhenReady(i, i2, z);
        this.internalPlayer.handler.obtainMessage(1, z ? 1 : 0, i | (i2 << 4)).sendToTarget();
        updatePlaybackInfo(copyWithPlayWhenReady, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void updatePlaybackInfo(final PlaybackInfo playbackInfo, int i, boolean z, int i2, long j, int i3, boolean z2) {
        Pair pair;
        int i4;
        MediaItem mediaItem;
        boolean z3;
        boolean z4;
        boolean z5;
        final int i5;
        int i6;
        int i7;
        Object obj;
        MediaItem mediaItem2;
        Object obj2;
        long j2;
        long j3;
        long j4;
        long requestedContentPositionUs;
        Object obj3;
        MediaItem mediaItem3;
        Object obj4;
        PlaybackInfo playbackInfo2 = this.playbackInfo;
        this.playbackInfo = playbackInfo;
        boolean equals = playbackInfo2.timeline.equals(playbackInfo.timeline);
        Timeline.Window window = this.window;
        Timeline.Period period = this.period;
        Timeline timeline = playbackInfo2.timeline;
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId = playbackInfo2.periodId;
        Timeline timeline2 = playbackInfo.timeline;
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId2 = playbackInfo.periodId;
        int i8 = 0;
        final int i9 = 2;
        final int i10 = 3;
        if (timeline2.isEmpty() && timeline.isEmpty()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (timeline2.isEmpty() != timeline.isEmpty()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (timeline.getWindow(timeline.getPeriodByUid(mediaSource$MediaPeriodId.periodUid, period).windowIndex, window, 0L).uid.equals(timeline2.getWindow(timeline2.getPeriodByUid(mediaSource$MediaPeriodId2.periodUid, period).windowIndex, window, 0L).uid)) {
            pair = (z && i2 == 0 && mediaSource$MediaPeriodId.windowSequenceNumber < mediaSource$MediaPeriodId2.windowSequenceNumber) ? new Pair(Boolean.TRUE, 0) : (z && i2 == 1 && z2) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        } else {
            if (z && i2 == 0) {
                i4 = 1;
            } else if (z && i2 == 1) {
                i4 = 2;
            } else {
                if (equals) {
                    Path$$ExternalSyntheticBUOutline0.m();
                    return;
                }
                i4 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i4));
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue = ((Integer) pair.second).intValue();
        if (booleanValue) {
            mediaItem = !playbackInfo.timeline.isEmpty() ? playbackInfo.timeline.getWindow(playbackInfo.timeline.getPeriodByUid(playbackInfo.periodId.periodUid, this.period).windowIndex, this.window, 0L).mediaItem : null;
            this.staticAndDynamicMediaMetadata = MediaMetadata.EMPTY;
        } else {
            mediaItem = null;
        }
        if (booleanValue || !playbackInfo2.staticMetadata.equals(playbackInfo.staticMetadata)) {
            MediaMetadata.Builder buildUpon = this.staticAndDynamicMediaMetadata.buildUpon();
            List list = playbackInfo.staticMetadata;
            for (int i11 = 0; i11 < list.size(); i11++) {
                Metadata metadata = (Metadata) list.get(i11);
                int i12 = 0;
                while (true) {
                    Metadata.Entry[] entryArr = metadata.entries;
                    if (i12 < entryArr.length) {
                        entryArr[i12].populateMediaMetadata(buildUpon);
                        i12++;
                    }
                }
            }
            this.staticAndDynamicMediaMetadata = new MediaMetadata(buildUpon);
        }
        MediaMetadata buildUpdatedMediaMetadata = buildUpdatedMediaMetadata();
        boolean equals2 = buildUpdatedMediaMetadata.equals(this.mediaMetadata);
        this.mediaMetadata = buildUpdatedMediaMetadata;
        boolean z6 = playbackInfo2.playWhenReady != playbackInfo.playWhenReady;
        boolean z7 = playbackInfo2.playbackState != playbackInfo.playbackState;
        if (z7 || z6) {
            updateWakeAndWifiLock();
        }
        boolean z8 = playbackInfo2.isLoading != playbackInfo.isLoading;
        if (!equals) {
            this.listeners.queueEvent(0, new ExoPlayerImpl$$ExternalSyntheticLambda4(playbackInfo, i, i8));
        }
        if (z) {
            Timeline.Period period2 = new Timeline.Period();
            if (playbackInfo2.timeline.isEmpty()) {
                z3 = booleanValue;
                z4 = equals2;
                z5 = z7;
                i6 = i3;
                i7 = i6;
                obj = null;
                mediaItem2 = null;
                obj2 = null;
            } else {
                Object obj5 = playbackInfo2.periodId.periodUid;
                playbackInfo2.timeline.getPeriodByUid(obj5, period2);
                int i13 = period2.windowIndex;
                int indexOfPeriod = playbackInfo2.timeline.getIndexOfPeriod(obj5);
                z3 = booleanValue;
                z4 = equals2;
                z5 = z7;
                obj = playbackInfo2.timeline.getWindow(i13, this.window, 0L).uid;
                mediaItem2 = this.window.mediaItem;
                obj2 = obj5;
                i6 = i13;
                i7 = indexOfPeriod;
            }
            MediaSource$MediaPeriodId mediaSource$MediaPeriodId3 = playbackInfo2.periodId;
            if (i2 == 0) {
                boolean isAd = mediaSource$MediaPeriodId3.isAd();
                MediaSource$MediaPeriodId mediaSource$MediaPeriodId4 = playbackInfo2.periodId;
                if (isAd) {
                    j4 = period2.getAdDurationUs(mediaSource$MediaPeriodId4.adGroupIndex, mediaSource$MediaPeriodId4.adIndexInAdGroup);
                    requestedContentPositionUs = getRequestedContentPositionUs(playbackInfo2);
                } else if (mediaSource$MediaPeriodId4.nextAdGroupIndex != -1) {
                    j4 = getRequestedContentPositionUs(this.playbackInfo);
                    requestedContentPositionUs = j4;
                } else {
                    j2 = period2.positionInWindowUs;
                    j3 = period2.durationUs;
                    j4 = j2 + j3;
                    requestedContentPositionUs = j4;
                }
            } else if (mediaSource$MediaPeriodId3.isAd()) {
                j4 = playbackInfo2.positionUs;
                requestedContentPositionUs = getRequestedContentPositionUs(playbackInfo2);
            } else {
                j2 = period2.positionInWindowUs;
                j3 = playbackInfo2.positionUs;
                j4 = j2 + j3;
                requestedContentPositionUs = j4;
            }
            long usToMs = Util.usToMs(j4);
            long usToMs2 = Util.usToMs(requestedContentPositionUs);
            MediaSource$MediaPeriodId mediaSource$MediaPeriodId5 = playbackInfo2.periodId;
            Player.PositionInfo positionInfo = new Player.PositionInfo(obj, i6, mediaItem2, obj2, i7, usToMs, usToMs2, mediaSource$MediaPeriodId5.adGroupIndex, mediaSource$MediaPeriodId5.adIndexInAdGroup);
            Timeline.Window window2 = this.window;
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            int currentPeriodIndex = getCurrentPeriodIndex();
            if (this.playbackInfo.timeline.isEmpty()) {
                obj3 = null;
                mediaItem3 = null;
                obj4 = null;
            } else {
                PlaybackInfo playbackInfo3 = this.playbackInfo;
                Object obj6 = playbackInfo3.periodId.periodUid;
                playbackInfo3.timeline.getPeriodByUid(obj6, this.period);
                currentPeriodIndex = this.playbackInfo.timeline.getIndexOfPeriod(obj6);
                Object obj7 = this.playbackInfo.timeline.getWindow(currentMediaItemIndex, window2, 0L).uid;
                mediaItem3 = window2.mediaItem;
                obj4 = obj6;
                obj3 = obj7;
            }
            int i14 = currentPeriodIndex;
            long usToMs3 = Util.usToMs(j);
            long usToMs4 = this.playbackInfo.periodId.isAd() ? Util.usToMs(getRequestedContentPositionUs(this.playbackInfo)) : usToMs3;
            MediaSource$MediaPeriodId mediaSource$MediaPeriodId6 = this.playbackInfo.periodId;
            this.listeners.queueEvent(11, new ExoPlayerImpl$$ExternalSyntheticLambda9(i2, positionInfo, new Player.PositionInfo(obj3, currentMediaItemIndex, mediaItem3, obj4, i14, usToMs3, usToMs4, mediaSource$MediaPeriodId6.adGroupIndex, mediaSource$MediaPeriodId6.adIndexInAdGroup)));
        } else {
            z3 = booleanValue;
            z4 = equals2;
            z5 = z7;
        }
        if (z3) {
            i5 = 1;
            this.listeners.queueEvent(1, new ExoPlayerImpl$$ExternalSyntheticLambda4(mediaItem, intValue, i5));
        } else {
            i5 = 1;
        }
        if (playbackInfo2.playbackError != playbackInfo.playbackError) {
            this.listeners.queueEvent(10, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda5
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj8) {
                    int i15 = i5;
                    PlaybackInfo playbackInfo4 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj8;
                    switch (i15) {
                        case 0:
                            listener.onPlayWhenReadyChanged(playbackInfo4.playWhenReadyChangeReason, playbackInfo4.playWhenReady);
                            break;
                        case 1:
                            listener.onPlayerErrorChanged(playbackInfo4.playbackError);
                            break;
                        case 2:
                            listener.onPlayerError(playbackInfo4.playbackError);
                            break;
                        case 3:
                            listener.onTracksChanged(playbackInfo4.trackSelectorResult.tracks);
                            break;
                        case 4:
                            boolean z9 = playbackInfo4.isLoading;
                            listener.getClass();
                            listener.onIsLoadingChanged(playbackInfo4.isLoading);
                            break;
                        case 5:
                            listener.onPlayerStateChanged(playbackInfo4.playbackState, playbackInfo4.playWhenReady);
                            break;
                        case 6:
                            listener.onPlaybackStateChanged(playbackInfo4.playbackState);
                            break;
                        case 7:
                            listener.onPlaybackSuppressionReasonChanged(playbackInfo4.playbackSuppressionReason);
                            break;
                        case 8:
                            listener.onIsPlayingChanged(playbackInfo4.isPlaying());
                            break;
                        default:
                            listener.onPlaybackParametersChanged(playbackInfo4.playbackParameters);
                            break;
                    }
                }
            });
            if (playbackInfo.playbackError != null) {
                this.listeners.queueEvent(10, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda5
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj8) {
                        int i15 = i9;
                        PlaybackInfo playbackInfo4 = playbackInfo;
                        Player.Listener listener = (Player.Listener) obj8;
                        switch (i15) {
                            case 0:
                                listener.onPlayWhenReadyChanged(playbackInfo4.playWhenReadyChangeReason, playbackInfo4.playWhenReady);
                                break;
                            case 1:
                                listener.onPlayerErrorChanged(playbackInfo4.playbackError);
                                break;
                            case 2:
                                listener.onPlayerError(playbackInfo4.playbackError);
                                break;
                            case 3:
                                listener.onTracksChanged(playbackInfo4.trackSelectorResult.tracks);
                                break;
                            case 4:
                                boolean z9 = playbackInfo4.isLoading;
                                listener.getClass();
                                listener.onIsLoadingChanged(playbackInfo4.isLoading);
                                break;
                            case 5:
                                listener.onPlayerStateChanged(playbackInfo4.playbackState, playbackInfo4.playWhenReady);
                                break;
                            case 6:
                                listener.onPlaybackStateChanged(playbackInfo4.playbackState);
                                break;
                            case 7:
                                listener.onPlaybackSuppressionReasonChanged(playbackInfo4.playbackSuppressionReason);
                                break;
                            case 8:
                                listener.onIsPlayingChanged(playbackInfo4.isPlaying());
                                break;
                            default:
                                listener.onPlaybackParametersChanged(playbackInfo4.playbackParameters);
                                break;
                        }
                    }
                });
            }
        }
        TrackSelectorResult trackSelectorResult = playbackInfo2.trackSelectorResult;
        TrackSelectorResult trackSelectorResult2 = playbackInfo.trackSelectorResult;
        if (trackSelectorResult != trackSelectorResult2) {
            DefaultTrackSelector defaultTrackSelector = this.trackSelector;
            Object obj8 = trackSelectorResult2.info;
            defaultTrackSelector.getClass();
            this.listeners.queueEvent(2, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda5
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj82) {
                    int i15 = i10;
                    PlaybackInfo playbackInfo4 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj82;
                    switch (i15) {
                        case 0:
                            listener.onPlayWhenReadyChanged(playbackInfo4.playWhenReadyChangeReason, playbackInfo4.playWhenReady);
                            break;
                        case 1:
                            listener.onPlayerErrorChanged(playbackInfo4.playbackError);
                            break;
                        case 2:
                            listener.onPlayerError(playbackInfo4.playbackError);
                            break;
                        case 3:
                            listener.onTracksChanged(playbackInfo4.trackSelectorResult.tracks);
                            break;
                        case 4:
                            boolean z9 = playbackInfo4.isLoading;
                            listener.getClass();
                            listener.onIsLoadingChanged(playbackInfo4.isLoading);
                            break;
                        case 5:
                            listener.onPlayerStateChanged(playbackInfo4.playbackState, playbackInfo4.playWhenReady);
                            break;
                        case 6:
                            listener.onPlaybackStateChanged(playbackInfo4.playbackState);
                            break;
                        case 7:
                            listener.onPlaybackSuppressionReasonChanged(playbackInfo4.playbackSuppressionReason);
                            break;
                        case 8:
                            listener.onIsPlayingChanged(playbackInfo4.isPlaying());
                            break;
                        default:
                            listener.onPlaybackParametersChanged(playbackInfo4.playbackParameters);
                            break;
                    }
                }
            });
        }
        if (!z4) {
            this.listeners.queueEvent(14, new StreamSharing$$ExternalSyntheticLambda1(this.mediaMetadata, 28));
        }
        final int i15 = 4;
        if (z8) {
            this.listeners.queueEvent(3, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda5
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj82) {
                    int i152 = i15;
                    PlaybackInfo playbackInfo4 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj82;
                    switch (i152) {
                        case 0:
                            listener.onPlayWhenReadyChanged(playbackInfo4.playWhenReadyChangeReason, playbackInfo4.playWhenReady);
                            break;
                        case 1:
                            listener.onPlayerErrorChanged(playbackInfo4.playbackError);
                            break;
                        case 2:
                            listener.onPlayerError(playbackInfo4.playbackError);
                            break;
                        case 3:
                            listener.onTracksChanged(playbackInfo4.trackSelectorResult.tracks);
                            break;
                        case 4:
                            boolean z9 = playbackInfo4.isLoading;
                            listener.getClass();
                            listener.onIsLoadingChanged(playbackInfo4.isLoading);
                            break;
                        case 5:
                            listener.onPlayerStateChanged(playbackInfo4.playbackState, playbackInfo4.playWhenReady);
                            break;
                        case 6:
                            listener.onPlaybackStateChanged(playbackInfo4.playbackState);
                            break;
                        case 7:
                            listener.onPlaybackSuppressionReasonChanged(playbackInfo4.playbackSuppressionReason);
                            break;
                        case 8:
                            listener.onIsPlayingChanged(playbackInfo4.isPlaying());
                            break;
                        default:
                            listener.onPlaybackParametersChanged(playbackInfo4.playbackParameters);
                            break;
                    }
                }
            });
        }
        final int i16 = 5;
        if (z5 || z6) {
            this.listeners.queueEvent(-1, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda5
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj82) {
                    int i152 = i16;
                    PlaybackInfo playbackInfo4 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj82;
                    switch (i152) {
                        case 0:
                            listener.onPlayWhenReadyChanged(playbackInfo4.playWhenReadyChangeReason, playbackInfo4.playWhenReady);
                            break;
                        case 1:
                            listener.onPlayerErrorChanged(playbackInfo4.playbackError);
                            break;
                        case 2:
                            listener.onPlayerError(playbackInfo4.playbackError);
                            break;
                        case 3:
                            listener.onTracksChanged(playbackInfo4.trackSelectorResult.tracks);
                            break;
                        case 4:
                            boolean z9 = playbackInfo4.isLoading;
                            listener.getClass();
                            listener.onIsLoadingChanged(playbackInfo4.isLoading);
                            break;
                        case 5:
                            listener.onPlayerStateChanged(playbackInfo4.playbackState, playbackInfo4.playWhenReady);
                            break;
                        case 6:
                            listener.onPlaybackStateChanged(playbackInfo4.playbackState);
                            break;
                        case 7:
                            listener.onPlaybackSuppressionReasonChanged(playbackInfo4.playbackSuppressionReason);
                            break;
                        case 8:
                            listener.onIsPlayingChanged(playbackInfo4.isPlaying());
                            break;
                        default:
                            listener.onPlaybackParametersChanged(playbackInfo4.playbackParameters);
                            break;
                    }
                }
            });
        }
        final int i17 = 6;
        if (z5) {
            this.listeners.queueEvent(4, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda5
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj82) {
                    int i152 = i17;
                    PlaybackInfo playbackInfo4 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj82;
                    switch (i152) {
                        case 0:
                            listener.onPlayWhenReadyChanged(playbackInfo4.playWhenReadyChangeReason, playbackInfo4.playWhenReady);
                            break;
                        case 1:
                            listener.onPlayerErrorChanged(playbackInfo4.playbackError);
                            break;
                        case 2:
                            listener.onPlayerError(playbackInfo4.playbackError);
                            break;
                        case 3:
                            listener.onTracksChanged(playbackInfo4.trackSelectorResult.tracks);
                            break;
                        case 4:
                            boolean z9 = playbackInfo4.isLoading;
                            listener.getClass();
                            listener.onIsLoadingChanged(playbackInfo4.isLoading);
                            break;
                        case 5:
                            listener.onPlayerStateChanged(playbackInfo4.playbackState, playbackInfo4.playWhenReady);
                            break;
                        case 6:
                            listener.onPlaybackStateChanged(playbackInfo4.playbackState);
                            break;
                        case 7:
                            listener.onPlaybackSuppressionReasonChanged(playbackInfo4.playbackSuppressionReason);
                            break;
                        case 8:
                            listener.onIsPlayingChanged(playbackInfo4.isPlaying());
                            break;
                        default:
                            listener.onPlaybackParametersChanged(playbackInfo4.playbackParameters);
                            break;
                    }
                }
            });
        }
        if (z6 || playbackInfo2.playWhenReadyChangeReason != playbackInfo.playWhenReadyChangeReason) {
            final int i18 = 0;
            this.listeners.queueEvent(5, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda5
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj82) {
                    int i152 = i18;
                    PlaybackInfo playbackInfo4 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj82;
                    switch (i152) {
                        case 0:
                            listener.onPlayWhenReadyChanged(playbackInfo4.playWhenReadyChangeReason, playbackInfo4.playWhenReady);
                            break;
                        case 1:
                            listener.onPlayerErrorChanged(playbackInfo4.playbackError);
                            break;
                        case 2:
                            listener.onPlayerError(playbackInfo4.playbackError);
                            break;
                        case 3:
                            listener.onTracksChanged(playbackInfo4.trackSelectorResult.tracks);
                            break;
                        case 4:
                            boolean z9 = playbackInfo4.isLoading;
                            listener.getClass();
                            listener.onIsLoadingChanged(playbackInfo4.isLoading);
                            break;
                        case 5:
                            listener.onPlayerStateChanged(playbackInfo4.playbackState, playbackInfo4.playWhenReady);
                            break;
                        case 6:
                            listener.onPlaybackStateChanged(playbackInfo4.playbackState);
                            break;
                        case 7:
                            listener.onPlaybackSuppressionReasonChanged(playbackInfo4.playbackSuppressionReason);
                            break;
                        case 8:
                            listener.onIsPlayingChanged(playbackInfo4.isPlaying());
                            break;
                        default:
                            listener.onPlaybackParametersChanged(playbackInfo4.playbackParameters);
                            break;
                    }
                }
            });
        }
        final int i19 = 7;
        if (playbackInfo2.playbackSuppressionReason != playbackInfo.playbackSuppressionReason) {
            this.listeners.queueEvent(6, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda5
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj82) {
                    int i152 = i19;
                    PlaybackInfo playbackInfo4 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj82;
                    switch (i152) {
                        case 0:
                            listener.onPlayWhenReadyChanged(playbackInfo4.playWhenReadyChangeReason, playbackInfo4.playWhenReady);
                            break;
                        case 1:
                            listener.onPlayerErrorChanged(playbackInfo4.playbackError);
                            break;
                        case 2:
                            listener.onPlayerError(playbackInfo4.playbackError);
                            break;
                        case 3:
                            listener.onTracksChanged(playbackInfo4.trackSelectorResult.tracks);
                            break;
                        case 4:
                            boolean z9 = playbackInfo4.isLoading;
                            listener.getClass();
                            listener.onIsLoadingChanged(playbackInfo4.isLoading);
                            break;
                        case 5:
                            listener.onPlayerStateChanged(playbackInfo4.playbackState, playbackInfo4.playWhenReady);
                            break;
                        case 6:
                            listener.onPlaybackStateChanged(playbackInfo4.playbackState);
                            break;
                        case 7:
                            listener.onPlaybackSuppressionReasonChanged(playbackInfo4.playbackSuppressionReason);
                            break;
                        case 8:
                            listener.onIsPlayingChanged(playbackInfo4.isPlaying());
                            break;
                        default:
                            listener.onPlaybackParametersChanged(playbackInfo4.playbackParameters);
                            break;
                    }
                }
            });
        }
        if (playbackInfo2.isPlaying() != playbackInfo.isPlaying()) {
            final int i20 = 8;
            this.listeners.queueEvent(7, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda5
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj82) {
                    int i152 = i20;
                    PlaybackInfo playbackInfo4 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj82;
                    switch (i152) {
                        case 0:
                            listener.onPlayWhenReadyChanged(playbackInfo4.playWhenReadyChangeReason, playbackInfo4.playWhenReady);
                            break;
                        case 1:
                            listener.onPlayerErrorChanged(playbackInfo4.playbackError);
                            break;
                        case 2:
                            listener.onPlayerError(playbackInfo4.playbackError);
                            break;
                        case 3:
                            listener.onTracksChanged(playbackInfo4.trackSelectorResult.tracks);
                            break;
                        case 4:
                            boolean z9 = playbackInfo4.isLoading;
                            listener.getClass();
                            listener.onIsLoadingChanged(playbackInfo4.isLoading);
                            break;
                        case 5:
                            listener.onPlayerStateChanged(playbackInfo4.playbackState, playbackInfo4.playWhenReady);
                            break;
                        case 6:
                            listener.onPlaybackStateChanged(playbackInfo4.playbackState);
                            break;
                        case 7:
                            listener.onPlaybackSuppressionReasonChanged(playbackInfo4.playbackSuppressionReason);
                            break;
                        case 8:
                            listener.onIsPlayingChanged(playbackInfo4.isPlaying());
                            break;
                        default:
                            listener.onPlaybackParametersChanged(playbackInfo4.playbackParameters);
                            break;
                    }
                }
            });
        }
        if (!playbackInfo2.playbackParameters.equals(playbackInfo.playbackParameters)) {
            final int i21 = 9;
            this.listeners.queueEvent(12, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda5
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj82) {
                    int i152 = i21;
                    PlaybackInfo playbackInfo4 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj82;
                    switch (i152) {
                        case 0:
                            listener.onPlayWhenReadyChanged(playbackInfo4.playWhenReadyChangeReason, playbackInfo4.playWhenReady);
                            break;
                        case 1:
                            listener.onPlayerErrorChanged(playbackInfo4.playbackError);
                            break;
                        case 2:
                            listener.onPlayerError(playbackInfo4.playbackError);
                            break;
                        case 3:
                            listener.onTracksChanged(playbackInfo4.trackSelectorResult.tracks);
                            break;
                        case 4:
                            boolean z9 = playbackInfo4.isLoading;
                            listener.getClass();
                            listener.onIsLoadingChanged(playbackInfo4.isLoading);
                            break;
                        case 5:
                            listener.onPlayerStateChanged(playbackInfo4.playbackState, playbackInfo4.playWhenReady);
                            break;
                        case 6:
                            listener.onPlaybackStateChanged(playbackInfo4.playbackState);
                            break;
                        case 7:
                            listener.onPlaybackSuppressionReasonChanged(playbackInfo4.playbackSuppressionReason);
                            break;
                        case 8:
                            listener.onIsPlayingChanged(playbackInfo4.isPlaying());
                            break;
                        default:
                            listener.onPlaybackParametersChanged(playbackInfo4.playbackParameters);
                            break;
                    }
                }
            });
        }
        updateAvailableCommands();
        this.listeners.flushEvents();
        if (playbackInfo2.sleepingForOffload != playbackInfo.sleepingForOffload) {
            Iterator it = this.audioOffloadListeners.iterator();
            while (it.hasNext()) {
                ExoPlayerImpl.this.updateWakeAndWifiLock();
            }
        }
    }

    public final void updateWakeAndWifiLock() {
        int playbackState = getPlaybackState();
        VorbisUtil$Mode vorbisUtil$Mode = this.wifiLockManager;
        WakeLockManager wakeLockManager = this.wakeLockManager;
        boolean z = false;
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                verifyApplicationThread();
                boolean z2 = this.playbackInfo.sleepingForOffload;
                if (getPlayWhenReady() && !z2) {
                    z = true;
                }
                wakeLockManager.setStayAwake(z);
                vorbisUtil$Mode.setStayAwake(getPlayWhenReady());
                return;
            }
            if (playbackState != 4) {
                Path$$ExternalSyntheticBUOutline0.m();
                return;
            }
        }
        wakeLockManager.setStayAwake(false);
        vorbisUtil$Mode.setStayAwake(false);
    }

    public final void verifyApplicationThread() {
        this.constructorFinished.blockUninterruptible();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.applicationLooper;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = Util.DEVICE_DEBUG_INFO;
            Locale locale = Locale.US;
            String m = Boxes$$ExternalSyntheticOutline1.m("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.throwsWhenUsingWrongThread) {
                a$$ExternalSyntheticBUOutline0.m$1(m);
            } else {
                Log.w("ExoPlayerImpl", m, this.hasNotifiedFullWrongThreadWarning ? null : new IllegalStateException());
                this.hasNotifiedFullWrongThreadWarning = true;
            }
        }
    }
}
