package com.anythink.expressad.playercommon;

import D.y;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.View;
import com.anythink.basead.exoplayer.ad;
import com.anythink.basead.exoplayer.ae;
import com.anythink.basead.exoplayer.d;
import com.anythink.basead.exoplayer.f;
import com.anythink.basead.exoplayer.g;
import com.anythink.basead.exoplayer.h.af;
import com.anythink.basead.exoplayer.h.o;
import com.anythink.basead.exoplayer.h.s;
import com.anythink.basead.exoplayer.i;
import com.anythink.basead.exoplayer.v;
import com.anythink.basead.exoplayer.w;
import com.anythink.core.common.a.o;
import com.anythink.core.common.d.t;
import com.anythink.core.common.u.e;
import com.anythink.core.common.v.m;
import com.anythink.expressad.reward.player.c;
import com.icefishingapp.icefishing.AbstractC4404f;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;
import u.AbstractC5049e;

/* loaded from: classes.dex */
public class VideoFeedsPlayer implements w.c {
    public static final int INTERVAL_TIME_PLAY_TIME_CD_THREAD = 1000;
    public static final String TAG = "VideoFeedsPlayer";
    private ad exoPlayer;
    private Timer mBufferTimeoutTimer;
    private Context mContext;
    private long mCurrentPosition;
    private View mFullScreenLoadingView;
    private volatile VideoPlayerStatusListener mInnerVFPLisener;
    private boolean mIsSilent;
    private WeakReference<View> mLoadingView;
    private volatile VideoPlayerStatusListener mOutterVFListener;
    String mPlayLocalVideoFileErrorStr;
    private String mPlayUrl;
    private Thread mProgressThread;
    private SurfaceHolder mSurfaceHolder;
    private int mVideoReadyRate;
    private s mediaSource;
    c tempEventListener;
    private boolean mIsComplete = false;
    private boolean mIsPlaying = false;
    private boolean mHasPrepare = false;
    private boolean mIsBuffering = false;
    private boolean mIsNeedBufferingTimeout = false;
    private boolean mIsFrontDesk = true;
    private int mBufferTime = 5;
    private Object mLock = new Object();
    private boolean isStart = false;
    private final Handler mHandler = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
        }
    };
    private boolean needPrepareVideoPlayAgain = false;
    private String mNetVideoUrl = "";
    private String mMediaSourceUrl = "";
    private Runnable playProgressRunnable = new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.2
        @Override // java.lang.Runnable
        public void run() {
            long j6;
            try {
                if (VideoFeedsPlayer.this.exoPlayer == null || !VideoFeedsPlayer.this.exoPlayerIsPlaying()) {
                    return;
                }
                VideoFeedsPlayer videoFeedsPlayer = VideoFeedsPlayer.this;
                videoFeedsPlayer.mCurrentPosition = videoFeedsPlayer.exoPlayer.t();
                float f3 = VideoFeedsPlayer.this.mCurrentPosition % 1000;
                int round = Math.round(VideoFeedsPlayer.this.mCurrentPosition / 1000.0f);
                long unused = VideoFeedsPlayer.this.mCurrentPosition;
                if (VideoFeedsPlayer.this.exoPlayer == null || VideoFeedsPlayer.this.exoPlayer.s() <= 0) {
                    j6 = 0;
                } else {
                    j6 = VideoFeedsPlayer.this.exoPlayer.s() / 1000;
                    if (f3 > 0.0f && f3 < 500.0f) {
                        round++;
                    }
                }
                if (round >= 0 && j6 > 0 && round < 1 + j6) {
                    if (!VideoFeedsPlayer.this.isStart) {
                        VideoFeedsPlayer videoFeedsPlayer2 = VideoFeedsPlayer.this;
                        videoFeedsPlayer2.postOnPlayStartOnMainThread(videoFeedsPlayer2.exoPlayer.s() / 1000);
                        VideoFeedsPlayer.this.exoPlayer.t();
                        VideoFeedsPlayer.this.isStart = true;
                    }
                    VideoFeedsPlayer.this.postOnPlayProgressOnMainThread(round, (int) j6);
                }
                VideoFeedsPlayer.this.mIsComplete = false;
                if (!VideoFeedsPlayer.this.mIsBuffering) {
                    VideoFeedsPlayer.this.hideLoading();
                }
                VideoFeedsPlayer.this.mHandler.postDelayed(this, 1000L);
            } catch (Exception e9) {
                e9.getMessage();
            }
        }
    };
    private boolean mFlag = false;
    private long mCurBufferWaitingStartTime = 0;
    private final long MAX_BUFFER_WAITING_TIME = f.f7187a;

    private void cancelBufferTimeoutTimer() {
        try {
            Timer timer = this.mBufferTimeoutTimer;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    private void cancelPlayProgressTimer() {
        try {
            this.mHandler.removeCallbacks(this.playProgressRunnable);
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideLoading() {
        try {
            Handler handler = this.mHandler;
            if (handler == null) {
                return;
            }
            handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.5
                @Override // java.lang.Runnable
                public void run() {
                    if (VideoFeedsPlayer.this.mLoadingView != null && VideoFeedsPlayer.this.mLoadingView.get() != null) {
                        ((View) VideoFeedsPlayer.this.mLoadingView.get()).setVisibility(8);
                    }
                    if (VideoFeedsPlayer.this.mFullScreenLoadingView != null) {
                        VideoFeedsPlayer.this.mFullScreenLoadingView.setVisibility(8);
                    }
                }
            });
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    private void postOnBufferinEndOnMainThread() {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.8
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onBufferingEnd();
                            } catch (Exception e9) {
                                e9.getMessage();
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onBufferingEnd();
                            } catch (Exception e10) {
                                e10.getMessage();
                            }
                        }
                    }
                });
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOnBufferingStarOnMainThread(final String str) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onBufferingStart(str);
                            } catch (Exception e9) {
                                e9.getMessage();
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onBufferingStart(str);
                            } catch (Exception e10) {
                                e10.getMessage();
                            }
                        }
                    }
                });
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    private void postOnPlayCompletedOnMainThread() {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.12
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onPlayCompleted();
                            } catch (Exception e9) {
                                e9.getMessage();
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onPlayCompleted();
                            } catch (Exception e10) {
                                e10.getMessage();
                            }
                        }
                    }
                });
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    private void postOnPlayErrorOnMainThread(final String str) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.10
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onPlayError(str);
                            } catch (Exception e9) {
                                e9.getMessage();
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onPlayError(str);
                            } catch (Exception e10) {
                                e10.getMessage();
                            }
                        }
                    }
                });
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOnPlayProgressOnMainThread(final int i, final int i6) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.6
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onPlayProgress(i, i6);
                            } catch (Exception e9) {
                                e9.getMessage();
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onPlayProgress(i, i6);
                            } catch (Exception e10) {
                                e10.getMessage();
                            }
                        }
                    }
                });
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    private void postOnPlaySetDataSourceError2MainThread(final String str) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.11
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onPlaySetDataSourceError(str);
                            } catch (Exception e9) {
                                e9.getMessage();
                            }
                        }
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onPlaySetDataSourceError(str);
                            } catch (Exception e10) {
                                e10.getMessage();
                            }
                        }
                    }
                });
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOnPlayStartOnMainThread(final long j6) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.9
                    @Override // java.lang.Runnable
                    public void run() {
                        int i = (int) j6;
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onPlayStarted(i);
                            } catch (Exception e9) {
                                e9.getMessage();
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onPlayStarted(i);
                            } catch (Exception e10) {
                                e10.getMessage();
                            }
                        }
                    }
                });
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    private void rePrepareVideoSourceAgain() {
        if (this.mOutterVFListener != null) {
            this.mOutterVFListener.onVideoDownloadResume();
        }
        s sVar = this.mediaSource;
        if (sVar != null) {
            this.exoPlayer.a(sVar);
        }
    }

    private void startBufferIngTimer(final String str) {
        if (this.mIsNeedBufferingTimeout) {
            cancelBufferTimeoutTimer();
            Timer timer = new Timer();
            this.mBufferTimeoutTimer = timer;
            timer.schedule(new TimerTask() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.3
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    try {
                        if (VideoFeedsPlayer.this.mHasPrepare && !VideoFeedsPlayer.this.mIsBuffering) {
                            return;
                        }
                        VideoFeedsPlayer.this.postOnBufferingStarOnMainThread(str);
                    } catch (Exception e9) {
                        e9.getMessage();
                    }
                }
            }, this.mBufferTime * 1000);
        }
    }

    private void startPlayProgressTimer() {
        try {
            cancelPlayProgressTimer();
            this.mHandler.post(this.playProgressRunnable);
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    private void startProgressThread() {
        if (this.mProgressThread != null) {
            return;
        }
        this.mFlag = true;
        this.mCurBufferWaitingStartTime = 0L;
        Thread thread = new Thread(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.13
            @Override // java.lang.Runnable
            public void run() {
                while (VideoFeedsPlayer.this.mFlag) {
                    if (VideoFeedsPlayer.this.mIsComplete || !VideoFeedsPlayer.this.exoPlayerIsPlaying()) {
                        if (VideoFeedsPlayer.this.mCurBufferWaitingStartTime == 0) {
                            VideoFeedsPlayer.this.mCurBufferWaitingStartTime = SystemClock.elapsedRealtime();
                        }
                        try {
                            Thread.sleep(1000L);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        if (SystemClock.elapsedRealtime() - VideoFeedsPlayer.this.mCurBufferWaitingStartTime > f.f7187a && VideoFeedsPlayer.this.mCurBufferWaitingStartTime != 0) {
                            t.b().b(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.13.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    VideoFeedsPlayer.this.onError(10, "Video player error!Buffer timeout");
                                    y.w("Video Play Fail:Express Play Buffer Timeout", "AdxPlayer videoUrl:" + VideoFeedsPlayer.this.mPlayUrl + ",readyRate:" + VideoFeedsPlayer.this.mVideoReadyRate + ",maxVideoCacheSize:" + o.a().c() + ",lastRecycleCheckDownloadedFileSize:" + o.a().d());
                                }
                            });
                            VideoFeedsPlayer.this.stopProgressThread();
                        }
                    } else {
                        VideoFeedsPlayer.this.mCurBufferWaitingStartTime = 0L;
                        try {
                            Thread.sleep(1000L);
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                    }
                }
            }
        });
        this.mProgressThread = thread;
        thread.setName("anythink_type_player_progress");
        this.mProgressThread.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopProgressThread() {
        this.mFlag = false;
        this.mProgressThread = null;
        this.mCurBufferWaitingStartTime = 0L;
    }

    public void closeSound() {
        try {
            ad adVar = this.exoPlayer;
            if (adVar == null) {
                return;
            }
            adVar.a(0.0f);
            this.mIsSilent = true;
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public boolean exoPlayerIsPlaying() {
        ad adVar = this.exoPlayer;
        return adVar != null && adVar.J();
    }

    public boolean fullScreenLoadingViewisVisible() {
        try {
            View view = this.mFullScreenLoadingView;
            if (view != null) {
                return view.getVisibility() == 0;
            }
            return false;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public int getCurPosition() {
        return (int) this.mCurrentPosition;
    }

    public int getDuration() {
        ad adVar = this.exoPlayer;
        if (adVar == null) {
            return 0;
        }
        adVar.s();
        return 0;
    }

    public boolean getIsFrontDesk() {
        return this.mIsFrontDesk;
    }

    public boolean halfLoadingViewisVisible() {
        try {
            WeakReference<View> weakReference = this.mLoadingView;
            if (weakReference == null || weakReference.get() == null) {
                return false;
            }
            return this.mLoadingView.get().getVisibility() == 0;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public boolean hasPrepare() {
        return this.mHasPrepare;
    }

    public void initBufferIngParam(int i) {
        if (i > 0) {
            this.mBufferTime = i;
        }
        this.mIsNeedBufferingTimeout = true;
    }

    public boolean initPlayer(Context context, View view, String str, String str2, int i, VideoPlayerStatusListener videoPlayerStatusListener) {
        try {
            if (view == null) {
                postOnPlayErrorOnMainThread("MediaPlayer init error");
                return false;
            }
            this.needPrepareVideoPlayAgain = !TextUtils.equals(str, str2);
            this.mMediaSourceUrl = str;
            this.mNetVideoUrl = str2;
            this.mVideoReadyRate = i;
            this.mContext = context;
            this.mOutterVFListener = videoPlayerStatusListener;
            this.mLoadingView = new WeakReference<>(view);
            this.exoPlayer = i.a(new f(context), new com.anythink.basead.exoplayer.i.c(), new d());
            this.mediaSource = new o.c(new com.anythink.basead.exoplayer.j.o(context, "AnyThink_ExoPlayer")).b(Uri.parse(str));
            this.exoPlayer.a(0);
            this.exoPlayer.a(this.mediaSource);
            this.exoPlayer.a(this);
            return true;
        } catch (Throwable th) {
            th.getMessage();
            postOnPlayErrorOnMainThread(th.toString());
            return false;
        }
    }

    public boolean isComplete() {
        return this.mIsComplete;
    }

    public boolean isPlayIng() {
        try {
            if (this.exoPlayer != null) {
                return exoPlayerIsPlaying();
            }
            return false;
        } catch (Exception e9) {
            e9.getMessage();
            return false;
        }
    }

    public boolean isSilent() {
        return this.mIsSilent;
    }

    public void justSeekTo(int i) {
        try {
            this.mCurrentPosition = i;
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public void onBufferingUpdate(int i) {
    }

    public void onCompletion() {
        try {
            this.mIsComplete = true;
            this.mIsPlaying = false;
            this.mCurrentPosition = 0L;
            hideLoading();
            postOnPlayCompletedOnMainThread();
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public boolean onError(int i, String str) {
        try {
            hideLoading();
        } catch (Exception e9) {
            e9.getMessage();
        }
        if (!this.mIsFrontDesk && "MIX 3".equalsIgnoreCase(m.a()) && m.b().equalsIgnoreCase("Xiaomi")) {
            return true;
        }
        this.mHasPrepare = false;
        postOnPlayErrorOnMainThread(str);
        return true;
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public void onLoadingChanged(boolean z3) {
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public void onPlaybackParametersChanged(v vVar) {
        float f3 = vVar.f8759b;
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public void onPlayerError(g gVar) {
        boolean z3;
        long j6;
        c cVar = this.tempEventListener;
        if (cVar != null) {
            cVar.e();
        }
        String str = "Play error and ExoPlayer have not message.";
        if (gVar != null) {
            int i = gVar.f7269d;
            z3 = true;
            if (i != 0) {
                if (i == 1) {
                    str = "Play error, because have a RendererException.";
                } else if (i == 2) {
                    str = "Play error, because have a UnexpectedException.";
                }
                z3 = false;
            } else {
                str = "Play error, because have a SourceException.";
            }
            if (gVar.getCause() != null && !TextUtils.isEmpty(gVar.getCause().getMessage())) {
                str = gVar.getCause().getMessage();
            }
        } else {
            z3 = false;
        }
        if (this.needPrepareVideoPlayAgain && z3) {
            this.mPlayLocalVideoFileErrorStr = str;
            this.needPrepareVideoPlayAgain = false;
            rePrepareVideoSourceAgain();
            return;
        }
        try {
            j6 = this.exoPlayer.t();
        } catch (Throwable unused) {
            j6 = 0;
        }
        String str2 = "videoUrl" + this.mNetVideoUrl + ",readyRate:" + this.mVideoReadyRate + ",cdRate:0,play process:" + j6;
        onError(gVar.f7269d, TextUtils.isEmpty(this.mPlayLocalVideoFileErrorStr) ? AbstractC4404f.g(str2, ",localFileErrorMsg:", str) : y.s(AbstractC5049e.c(str2, ",localFileErrorMsg:"), this.mPlayLocalVideoFileErrorStr, ",errorMsg:", str));
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public void onPlayerStateChanged(boolean z3, int i) {
        if (i == 2) {
            this.mIsBuffering = true;
            showLoading();
            startBufferIngTimer("play buffering tiemout");
        } else {
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                cancelPlayProgressTimer();
                onCompletion();
                return;
            }
            this.mIsBuffering = false;
            hideLoading();
            postOnBufferinEndOnMainThread();
            onPrepared();
        }
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public void onPositionDiscontinuity(int i) {
    }

    public void onPrepared() {
        c cVar;
        try {
            if (!this.mHasPrepare && (cVar = this.tempEventListener) != null) {
                cVar.d();
            }
            this.mHasPrepare = true;
            if (!this.mIsFrontDesk && this.exoPlayer != null) {
                pause();
            }
            boolean z3 = this.mIsFrontDesk;
            if (z3 && z3) {
                hideLoading();
                this.mHasPrepare = true;
                if (this.exoPlayer != null) {
                    this.mIsPlaying = true;
                }
                postOnBufferinEndOnMainThread();
                startPlayProgressTimer();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public void onRepeatModeChanged(int i) {
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public void onSeekProcessed() {
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public void onShuffleModeEnabledChanged(boolean z3) {
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public void onTimelineChanged(ae aeVar, Object obj, int i) {
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public void onTracksChanged(af afVar, com.anythink.basead.exoplayer.i.g gVar) {
    }

    public void openSound() {
        try {
            ad adVar = this.exoPlayer;
            if (adVar == null) {
                return;
            }
            adVar.a(1.0f);
            this.mIsSilent = false;
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public void pause() {
        try {
            if (this.exoPlayer != null) {
                exoPlayerIsPlaying();
                hideLoading();
                this.exoPlayer.a(false);
                this.mIsPlaying = false;
            }
            stopProgressThread();
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public void play(String str, int i) {
        try {
            synchronized (this.mLock) {
                if (i > 0) {
                    try {
                        this.mCurrentPosition = i;
                    } finally {
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    postOnPlayErrorOnMainThread("play url is null");
                    return;
                }
                this.mPlayUrl = str;
                this.mHasPrepare = false;
                this.mIsFrontDesk = true;
                showLoading();
                setDataSource();
            }
        } catch (Exception e9) {
            e9.getMessage();
            releasePlayer();
            hideLoading();
            postOnPlayErrorOnMainThread("mediaplayer cannot play");
        }
    }

    public void prepare() {
        ad adVar;
        try {
            if (this.mHasPrepare || (adVar = this.exoPlayer) == null) {
                return;
            }
            adVar.a(this.mediaSource);
            this.mHasPrepare = true;
            this.mIsPlaying = false;
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public void releasePlayer() {
        try {
            cancelPlayProgressTimer();
            cancelBufferTimeoutTimer();
            if (this.exoPlayer != null) {
                stop();
                this.exoPlayer.b(this);
                this.exoPlayer.n();
            }
            stopProgressThread();
            this.mInnerVFPLisener = null;
            this.mOutterVFListener = null;
            hideLoading();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void seekTo(int i) {
        ad adVar;
        long j6 = i;
        try {
            this.mCurrentPosition = j6;
            if (this.mHasPrepare && (adVar = this.exoPlayer) != null) {
                adVar.a(j6);
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public void setDataSource() {
        try {
            if (this.exoPlayer != null) {
                SurfaceHolder surfaceHolder = this.mSurfaceHolder;
                if (surfaceHolder != null) {
                    setDisplay(surfaceHolder);
                }
                boolean z3 = false;
                this.mHasPrepare = false;
                if (!TextUtils.equals(this.mMediaSourceUrl, this.mNetVideoUrl)) {
                    try {
                        z3 = new File(this.mMediaSourceUrl).exists();
                    } catch (Throwable unused) {
                    }
                    if (!z3) {
                        this.mediaSource = new o.c(new com.anythink.basead.exoplayer.j.o(this.mContext, "AnyThink_ExoPlayer")).b(Uri.parse(this.mNetVideoUrl));
                        this.mMediaSourceUrl = this.mNetVideoUrl;
                    }
                }
                if (TextUtils.equals(this.mMediaSourceUrl, this.mNetVideoUrl) && this.mVideoReadyRate > 0) {
                    e.b("Video Play Fail:Play Network Url", "AdxExpress videoUrl:" + this.mPlayUrl + ",readyRate:" + this.mVideoReadyRate + ",maxVideoCacheSize:" + com.anythink.core.common.a.o.a().c() + ",lastRecycleCheckDownloadedFileSize:" + com.anythink.core.common.a.o.a().d(), t.b().r());
                }
                this.exoPlayer.a(this.mediaSource);
                this.exoPlayer.a(true);
                startBufferIngTimer(PlayerErrorConstant.PREPARE_TIMEOUT);
                startProgressThread();
            }
        } catch (Exception e9) {
            e9.getMessage();
            hideLoading();
            postOnPlayErrorOnMainThread(PlayerErrorConstant.ILLEGAL_VIDEO_ADDRESS);
            postOnPlaySetDataSourceError2MainThread(PlayerErrorConstant.ILLEGAL_VIDEO_ADDRESS);
        }
    }

    public void setDisplay(SurfaceHolder surfaceHolder) {
        try {
            this.exoPlayer.a(surfaceHolder);
        } catch (Throwable th) {
            th.getMessage();
            postOnPlayErrorOnMainThread(th.toString());
        }
    }

    public void setFullScreenLoadingView(View view) {
        if (view != null) {
            try {
                this.mFullScreenLoadingView = view;
            } catch (Exception e9) {
                e9.getMessage();
            }
        }
    }

    public void setIsComplete(boolean z3) {
        this.mIsComplete = z3;
    }

    public void setIsFrontDesk(boolean z3) {
        try {
            this.mIsFrontDesk = z3;
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public void setPlaybackParams(float f3) {
        try {
            if (exoPlayerIsPlaying()) {
                this.exoPlayer.a(new v(f3));
            } else {
                this.exoPlayer.a(new v(f3));
                this.exoPlayer.m();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void setSelfVideoFeedsPlayerListener(VideoPlayerStatusListener videoPlayerStatusListener) {
        this.mInnerVFPLisener = videoPlayerStatusListener;
    }

    public void setTempEventListener(c cVar) {
        this.tempEventListener = cVar;
    }

    public void setVideoFeedsPlayerListener(VideoPlayerStatusListener videoPlayerStatusListener) {
        this.mOutterVFListener = videoPlayerStatusListener;
    }

    public void setVolume(float f3, float f9) {
        try {
            ad adVar = this.exoPlayer;
            if (adVar != null) {
                adVar.a(f9);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void showLoading() {
        try {
            Handler handler = this.mHandler;
            if (handler == null) {
                return;
            }
            handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.4
                @Override // java.lang.Runnable
                public void run() {
                    if (VideoFeedsPlayer.this.mFullScreenLoadingView != null) {
                        VideoFeedsPlayer.this.mFullScreenLoadingView.setVisibility(0);
                    }
                }
            });
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public void start(boolean z3) {
        try {
            if (this.exoPlayer == null || exoPlayerIsPlaying()) {
                return;
            }
            showLoading();
            play();
            this.mIsPlaying = true;
            if (z3) {
                startPlayProgressTimer();
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public void stop() {
        try {
            if (this.mHasPrepare && this.exoPlayer != null) {
                hideLoading();
                this.exoPlayer.m();
                this.mHasPrepare = false;
                this.mIsPlaying = false;
                this.mIsComplete = true;
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public void play(String str, SurfaceHolder surfaceHolder) {
        try {
            synchronized (this.mLock) {
                try {
                    if (TextUtils.isEmpty(str)) {
                        postOnPlayErrorOnMainThread("play url is null");
                        return;
                    }
                    this.mPlayUrl = str;
                    this.mHasPrepare = false;
                    this.mIsFrontDesk = true;
                    this.mSurfaceHolder = surfaceHolder;
                    showLoading();
                    setDataSource();
                } finally {
                }
            }
        } catch (Exception e9) {
            e9.getMessage();
            releasePlayer();
            hideLoading();
            postOnPlayErrorOnMainThread("mediaplayer cannot play");
        }
    }

    public void play() {
        this.exoPlayer.a(true);
        startProgressThread();
    }
}
