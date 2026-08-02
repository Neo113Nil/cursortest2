package androidx.media3.ui;

import android.app.ActivityOptions;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.credentials.Credential;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;
import android.text.SegmentFinder;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AttachedSurfaceControl;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.CursorAnchorInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SurfaceSyncGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda13;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.android.TextLayout;
import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.media3.common.ErrorMessageProvider;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.ViewProvider;
import androidx.media3.common.text.CueGroup;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.video.VideoDecoderGLSurfaceView;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.PlayerControlView;
import androidx.paging.HintHandler$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.q4$$ExternalSyntheticLambda0;
import com.appsflyer.internal.AFd1lSDK$$ExternalSyntheticLambda0;
import com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda2;
import com.google.common.collect.ImmutableList;
import com.squareup.cash.R;
import com.squareup.cash.session.backend.DbSessionManagerKt;
import com.squareup.cash.sheet.BasicShieetKt;
import com.squareup.cash.sheet.SheetStateKt;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public class PlayerView extends FrameLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public int artworkDisplayMode;
    public final ImageView artworkView;
    public final View bufferingView;
    public final ComponentListener componentListener;
    public final AspectRatioFrameLayout contentFrame;
    public final PlayerControlView controller;
    public boolean controllerAutoShow;
    public boolean controllerHideDuringAds;
    public boolean controllerHideOnTouch;
    public int controllerShowTimeoutMs;
    public CharSequence customErrorMessage;
    public Drawable defaultArtwork;
    public boolean enableComposeSurfaceSyncWorkaround;
    public final TextView errorMessageView;
    public final Class exoPlayerClazz;
    public int imageDisplayMode;
    public final Object imageOutput;
    public final ImageView imageView;
    public boolean keepContentOnPlayerReset;
    public PlayerControlView.VisibilityListener legacyControllerVisibilityListener;
    public final Handler mainLooperHandler;
    public Player player;
    public final Method setImageOutputMethod;
    public int showBuffering;
    public final View shutterView;
    public final SubtitleView subtitleView;
    public final SurfaceSyncGroupCompatV34 surfaceSyncGroupV34;
    public final View surfaceView;
    public final boolean surfaceViewIgnoresVideoAspectRatio;
    public boolean useController;

    public abstract class Api34 {
        public static final void addVisibleLineBounds(CursorAnchorInfo.Builder builder, TextLayoutResult textLayoutResult, Rect rect) {
            if (rect.isEmpty()) {
                return;
            }
            MultiParagraph multiParagraph = textLayoutResult.multiParagraph;
            int i = multiParagraph.lineCount - 1;
            if (i < 0) {
                i = 0;
            }
            int coerceIn = RangesKt___RangesKt.coerceIn(multiParagraph.getLineForVerticalPosition(rect.top), 0, i);
            int coerceIn2 = RangesKt___RangesKt.coerceIn(multiParagraph.getLineForVerticalPosition(rect.bottom), 0, i);
            if (coerceIn > coerceIn2) {
                return;
            }
            while (true) {
                builder.addVisibleLineBounds(textLayoutResult.getLineLeft(coerceIn), multiParagraph.getLineTop(coerceIn), textLayoutResult.getLineRight(coerceIn), multiParagraph.getLineBottom(coerceIn));
                if (coerceIn == coerceIn2) {
                    return;
                } else {
                    coerceIn++;
                }
            }
        }

        public static boolean canUseFullScreenIntent(NotificationManager notificationManager) {
            return notificationManager.canUseFullScreenIntent();
        }

        public static Context createDeviceContext(Context context, int i) {
            return context.createDeviceContext(i);
        }

        public static CreateCredentialException extractCreateCredentialException(Intent intent) {
            android.credentials.CreateCredentialException createCredentialException = (android.credentials.CreateCredentialException) intent.getSerializableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION", android.credentials.CreateCredentialException.class);
            if (createCredentialException == null) {
                return null;
            }
            String type2 = createCredentialException.getType();
            type2.getClass();
            return SheetStateKt.toJetpackCreateException(createCredentialException.getMessage(), type2);
        }

        public static CreateCredentialResponse extractCreateCredentialResponse(String str, Intent intent) {
            android.credentials.CreateCredentialResponse createCredentialResponse = (android.credentials.CreateCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE", android.credentials.CreateCredentialResponse.class);
            if (createCredentialResponse == null) {
                return null;
            }
            Bundle data = createCredentialResponse.getData();
            data.getClass();
            return DbSessionManagerKt.createFrom(data, str);
        }

        public static GetCredentialException extractGetCredentialException(Intent intent) {
            intent.getClass();
            android.credentials.GetCredentialException getCredentialException = (android.credentials.GetCredentialException) intent.getSerializableExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", android.credentials.GetCredentialException.class);
            if (getCredentialException == null) {
                return null;
            }
            String type2 = getCredentialException.getType();
            type2.getClass();
            return SheetStateKt.toJetpackGetException(getCredentialException.getMessage(), type2);
        }

        public static GetCredentialResponse extractGetCredentialResponse(Intent intent) {
            intent.getClass();
            android.credentials.GetCredentialResponse getCredentialResponse = (android.credentials.GetCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", android.credentials.GetCredentialResponse.class);
            if (getCredentialResponse == null) {
                return null;
            }
            Credential credential = getCredentialResponse.getCredential();
            credential.getClass();
            String type2 = credential.getType();
            type2.getClass();
            Bundle data = credential.getData();
            data.getClass();
            return new GetCredentialResponse(BasicShieetKt.createFrom(data, type2));
        }

        public static final void fadeOut(AppCompatActivity appCompatActivity) {
            if (Build.VERSION.SDK_INT >= 34) {
                appCompatActivity.overrideActivityTransition(1, R.anim.stripe_transition_fade_in, R.anim.stripe_transition_fade_out);
            } else {
                appCompatActivity.overridePendingTransition(R.anim.stripe_transition_fade_in, R.anim.stripe_transition_fade_out);
            }
        }

        public static float getAxisVelocity(VelocityTracker velocityTracker, int i) {
            return velocityTracker.getAxisVelocity(i);
        }

        public static int getDeviceId(Context context) {
            context.getClass();
            return context.getDeviceId();
        }

        public static int[] getRangeForRect$ui_text(TextLayout textLayout, RectF rectF, int i, final HintHandler$$ExternalSyntheticLambda0 hintHandler$$ExternalSyntheticLambda0) {
            SegmentFinder graphemeClusterSegmentFinder;
            if (i == 1) {
                final Recorder.AnonymousClass4 anonymousClass4 = new Recorder.AnonymousClass4(textLayout.layout.getText(), textLayout.getWordIterator(), false, 21);
                graphemeClusterSegmentFinder = new SegmentFinder() { // from class: androidx.compose.ui.text.android.selection.Api34SegmentFinder$toAndroidSegmentFinder$1
                    public final int nextEndBoundary(int i2) {
                        return Recorder.AnonymousClass4.this.nextEndBoundary(i2);
                    }

                    public final int nextStartBoundary(int i2) {
                        return Recorder.AnonymousClass4.this.nextStartBoundary(i2);
                    }

                    public final int previousEndBoundary(int i2) {
                        return Recorder.AnonymousClass4.this.previousEndBoundary(i2);
                    }

                    public final int previousStartBoundary(int i2) {
                        return Recorder.AnonymousClass4.this.previousStartBoundary(i2);
                    }
                };
            } else {
                graphemeClusterSegmentFinder = new GraphemeClusterSegmentFinder(textLayout.layout.getText(), textLayout.textPaint);
            }
            return textLayout.layout.getRangeForRect(rectF, graphemeClusterSegmentFinder, new Layout.TextInclusionStrategy() { // from class: androidx.compose.ui.text.android.AndroidLayoutApi34$$ExternalSyntheticLambda0
                @Override // android.text.Layout.TextInclusionStrategy
                public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                    return ((Boolean) HintHandler$$ExternalSyntheticLambda0.this.invoke(rectF2, rectF3)).booleanValue();
                }
            });
        }

        public static float getScaledHandwritingGestureLineMargin(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHandwritingGestureLineMargin();
        }

        public static float getScaledHandwritingSlop(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHandwritingSlop();
        }

        public static int getScaledMaximumFlingVelocity(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
        }

        public static int getScaledMinimumFlingVelocity(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
        }

        public static boolean hasGainmap(Bitmap bitmap) {
            return bitmap.hasGainmap();
        }

        public static boolean isRequestFromAccessibilityTool(AccessibilityManager accessibilityManager) {
            return accessibilityManager.isRequestFromAccessibilityTool();
        }

        public static final ColorSpace obtainAndroidColorSpace(androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
            if (Intrinsics.areEqual(colorSpace, ColorSpaces.Bt2020Hlg)) {
                return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
            }
            if (Intrinsics.areEqual(colorSpace, ColorSpaces.Bt2020Pq)) {
                return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
            }
            return null;
        }

        public static final void onReadoutStarted(CameraCaptureSession.CaptureCallback captureCallback, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            captureCallback.onReadoutStarted(cameraCaptureSession, captureRequest, j, j2);
        }

        public static void sendIntentAllowBackgroundActivityStart(PendingIntent pendingIntent) {
            try {
                pendingIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
            } catch (PendingIntent.CanceledException e) {
                Log.e("TextClassification", "error sending pendingIntent: " + pendingIntent + " error: " + e);
            }
        }

        public static void setAccessibilityDataSensitive(AccessibilityEvent accessibilityEvent, boolean z) {
            accessibilityEvent.setAccessibilityDataSensitive(z);
        }

        public static void setLineHeight(TextView textView, int i, float f) {
            textView.setLineHeight(i, f);
        }

        public static final void setSettingsOverrideZoom(LinkedHashMap linkedHashMap) {
            linkedHashMap.put(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1);
        }

        public static void setShareIdentityEnabled(ActivityOptions activityOptions) {
            activityOptions.setShareIdentityEnabled(false);
        }

        public static void setSurfaceLifecycleToFollowsAttachment(SurfaceView surfaceView) {
            surfaceView.setSurfaceLifecycle(2);
        }
    }

    public final class ComponentListener implements Player.Listener, View.OnClickListener, PlayerControlView.VisibilityListener, PlayerControlView.OnFullScreenModeChangedListener {
        public Object lastPeriodUidWithTracks;
        public final Timeline.Period period = new Timeline.Period();

        public ComponentListener() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = PlayerView.$r8$clinit;
            PlayerView.this.toggleControllerVisibility();
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onCues(CueGroup cueGroup) {
            SubtitleView subtitleView = PlayerView.this.subtitleView;
            if (subtitleView != null) {
                subtitleView.setCues(cueGroup.cues);
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPlayWhenReadyChanged(int i, boolean z) {
            int i2 = PlayerView.$r8$clinit;
            PlayerView playerView = PlayerView.this;
            playerView.updateBuffering();
            if (!playerView.isPlayingAd() || !playerView.controllerHideDuringAds) {
                playerView.maybeShowController(false);
                return;
            }
            PlayerControlView playerControlView = playerView.controller;
            if (playerControlView != null) {
                playerControlView.hide();
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPlaybackStateChanged(int i) {
            int i2 = PlayerView.$r8$clinit;
            PlayerView playerView = PlayerView.this;
            playerView.updateBuffering();
            playerView.updateErrorMessage();
            if (!playerView.isPlayingAd() || !playerView.controllerHideDuringAds) {
                playerView.maybeShowController(false);
                return;
            }
            PlayerControlView playerControlView = playerView.controller;
            if (playerControlView != null) {
                playerControlView.hide();
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPositionDiscontinuity(int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2) {
            PlayerControlView playerControlView;
            int i2 = PlayerView.$r8$clinit;
            PlayerView playerView = PlayerView.this;
            if (playerView.isPlayingAd() && playerView.controllerHideDuringAds && (playerControlView = playerView.controller) != null) {
                playerControlView.hide();
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onRenderedFirstFrame() {
            PlayerView playerView = PlayerView.this;
            View view = playerView.shutterView;
            if (view != null) {
                view.setVisibility(4);
                if (!playerView.hasSelectedImageTrack()) {
                    playerView.hideAndClearImage();
                    return;
                }
                ImageView imageView = playerView.imageView;
                if (imageView != null) {
                    imageView.setVisibility(4);
                }
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onSurfaceSizeChanged(int i, int i2) {
            PlayerView playerView = PlayerView.this;
            View view = playerView.surfaceView;
            if (Build.VERSION.SDK_INT == 34 && (view instanceof SurfaceView) && playerView.enableComposeSurfaceSyncWorkaround) {
                SurfaceSyncGroupCompatV34 surfaceSyncGroupCompatV34 = playerView.surfaceSyncGroupV34;
                surfaceSyncGroupCompatV34.getClass();
                int i3 = 27;
                playerView.mainLooperHandler.post(new AFd1wSDK$$ExternalSyntheticLambda2(i3, surfaceSyncGroupCompatV34, (SurfaceView) view, new AFd1lSDK$$ExternalSyntheticLambda0(playerView, 23)));
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onTracksChanged(Tracks tracks) {
            PlayerView playerView = PlayerView.this;
            Player player = playerView.player;
            player.getClass();
            ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) player;
            Timeline currentTimeline = exoPlayerImpl.isCommandAvailable(17) ? exoPlayerImpl.getCurrentTimeline() : Timeline.EMPTY;
            if (currentTimeline.isEmpty()) {
                this.lastPeriodUidWithTracks = null;
            } else {
                boolean isCommandAvailable = exoPlayerImpl.isCommandAvailable(30);
                Timeline.Period period = this.period;
                if (!isCommandAvailable || exoPlayerImpl.getCurrentTracks().groups.isEmpty()) {
                    Object obj = this.lastPeriodUidWithTracks;
                    if (obj != null) {
                        int indexOfPeriod = currentTimeline.getIndexOfPeriod(obj);
                        if (indexOfPeriod != -1) {
                            if (exoPlayerImpl.getCurrentMediaItemIndex() == currentTimeline.getPeriod(indexOfPeriod, period, false).windowIndex) {
                                return;
                            }
                        }
                        this.lastPeriodUidWithTracks = null;
                    }
                } else {
                    this.lastPeriodUidWithTracks = currentTimeline.getPeriod(exoPlayerImpl.getCurrentPeriodIndex(), period, true).uid;
                }
            }
            playerView.updateForCurrentTrackSelections(false);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onVideoSizeChanged(VideoSize videoSize) {
            PlayerView playerView;
            Player player;
            if (videoSize.equals(VideoSize.UNKNOWN) || (player = (playerView = PlayerView.this).player) == null || ((ExoPlayerImpl) player).getPlaybackState() == 1) {
                return;
            }
            playerView.updateAspectRatio();
        }
    }

    public interface ControllerVisibilityListener {
    }

    public interface FullscreenButtonClickListener {
    }

    public final class SurfaceSyncGroupCompatV34 {
        public SurfaceSyncGroup surfaceSyncGroup;

        /* renamed from: $r8$lambda$iweixzu_GrrtIiH-f3JQWLlY4aE, reason: not valid java name */
        public static /* synthetic */ void m1152$r8$lambda$iweixzu_GrrtIiHf3JQWLlY4aE(SurfaceSyncGroupCompatV34 surfaceSyncGroupCompatV34, SurfaceView surfaceView, AFd1lSDK$$ExternalSyntheticLambda0 aFd1lSDK$$ExternalSyntheticLambda0) {
            surfaceSyncGroupCompatV34.getClass();
            AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
            if (rootSurfaceControl == null) {
                return;
            }
            SurfaceSyncGroup surfaceSyncGroup = new SurfaceSyncGroup("exo-sync-b-334901521");
            surfaceSyncGroupCompatV34.surfaceSyncGroup = surfaceSyncGroup;
            Trace.checkState(surfaceSyncGroup.add(rootSurfaceControl, new Recorder$$ExternalSyntheticLambda13(3)));
            aFd1lSDK$$ExternalSyntheticLambda0.run();
            rootSurfaceControl.applyTransactionOnDraw(new SurfaceControl.Transaction());
        }

        public final void maybeMarkSyncReadyAndClear() {
            SurfaceSyncGroup surfaceSyncGroup = this.surfaceSyncGroup;
            if (surfaceSyncGroup != null) {
                surfaceSyncGroup.markSyncReady();
                this.surfaceSyncGroup = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z5;
        int i10;
        boolean z6;
        boolean z7;
        Class<ExoPlayer> cls;
        Object obj;
        Method method;
        int i11;
        ComponentListener componentListener = new ComponentListener();
        this.componentListener = componentListener;
        this.mainLooperHandler = new Handler(Looper.getMainLooper());
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.PlayerView, i, 0);
            try {
                boolean hasValue = obtainStyledAttributes.hasValue(42);
                int color = obtainStyledAttributes.getColor(42, 0);
                int resourceId = obtainStyledAttributes.getResourceId(22, R.layout.exo_player_view);
                boolean z8 = obtainStyledAttributes.getBoolean(50, true);
                int i12 = obtainStyledAttributes.getInt(3, 1);
                int resourceId2 = obtainStyledAttributes.getResourceId(9, 0);
                int i13 = obtainStyledAttributes.getInt(15, 0);
                boolean z9 = obtainStyledAttributes.getBoolean(51, true);
                int i14 = obtainStyledAttributes.getInt(45, 1);
                int i15 = obtainStyledAttributes.getInt(28, 0);
                z = z9;
                i2 = obtainStyledAttributes.getInt(38, 5000);
                boolean z10 = obtainStyledAttributes.getBoolean(14, true);
                boolean z11 = obtainStyledAttributes.getBoolean(4, true);
                int integer = obtainStyledAttributes.getInteger(35, 0);
                this.keepContentOnPlayerReset = obtainStyledAttributes.getBoolean(16, this.keepContentOnPlayerReset);
                boolean z12 = obtainStyledAttributes.getBoolean(13, true);
                obtainStyledAttributes.recycle();
                z4 = z12;
                z2 = z10;
                i3 = resourceId;
                i4 = resourceId2;
                z3 = z11;
                z6 = hasValue;
                z5 = z8;
                i8 = i14;
                i9 = color;
                i6 = integer;
                i7 = i15;
                i5 = i13;
                i10 = i12;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i2 = 5000;
            i3 = R.layout.exo_player_view;
            z = true;
            z2 = true;
            z3 = true;
            z4 = true;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 1;
            i9 = 0;
            z5 = true;
            i10 = 1;
            z6 = false;
        }
        LayoutInflater.from(context).inflate(i3, this);
        setDescendantFocusability(PKIFailureInfo.transactionIdInUse);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.contentFrame = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i7);
        }
        View findViewById = findViewById(R.id.exo_shutter);
        this.shutterView = findViewById;
        if (findViewById != null && z6) {
            findViewById.setBackgroundColor(i9);
        }
        if (aspectRatioFrameLayout == null || i8 == 0) {
            this.surfaceView = null;
            z7 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i8 == 2) {
                this.surfaceView = new TextureView(context);
            } else if (i8 == 3) {
                try {
                    int i16 = SphericalGLSurfaceView.$r8$clinit;
                    this.surfaceView = (View) SphericalGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                    z7 = true;
                    this.surfaceView.setLayoutParams(layoutParams);
                    this.surfaceView.setOnClickListener(componentListener);
                    this.surfaceView.setClickable(false);
                    aspectRatioFrameLayout.addView(this.surfaceView, 0);
                } catch (Exception e) {
                    a$$ExternalSyntheticBUOutline0.m("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                    throw null;
                }
            } else if (i8 != 4) {
                SurfaceView surfaceView = new SurfaceView(context);
                if (Build.VERSION.SDK_INT >= 34) {
                    Api34.setSurfaceLifecycleToFollowsAttachment(surfaceView);
                }
                this.surfaceView = surfaceView;
            } else {
                try {
                    int i17 = VideoDecoderGLSurfaceView.$r8$clinit;
                    this.surfaceView = (View) VideoDecoderGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                } catch (Exception e2) {
                    a$$ExternalSyntheticBUOutline0.m("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                    throw null;
                }
            }
            z7 = false;
            this.surfaceView.setLayoutParams(layoutParams);
            this.surfaceView.setOnClickListener(componentListener);
            this.surfaceView.setClickable(false);
            aspectRatioFrameLayout.addView(this.surfaceView, 0);
        }
        this.surfaceViewIgnoresVideoAspectRatio = z7;
        this.surfaceSyncGroupV34 = Build.VERSION.SDK_INT == 34 ? new SurfaceSyncGroupCompatV34() : null;
        this.imageView = (ImageView) findViewById(R.id.exo_image);
        this.imageDisplayMode = i5;
        try {
            cls = ExoPlayer.class;
            method = cls.getMethod("setImageOutput", ImageOutput.class);
            obj = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() { // from class: androidx.media3.ui.PlayerView$$ExternalSyntheticLambda0
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj2, Method method2, Object[] objArr) {
                    int i18 = PlayerView.$r8$clinit;
                    if (!method2.getName().equals("onImageAvailable")) {
                        return null;
                    }
                    Bitmap bitmap = (Bitmap) objArr[1];
                    PlayerView playerView = PlayerView.this;
                    playerView.mainLooperHandler.post(new q4$$ExternalSyntheticLambda0(playerView, bitmap));
                    return null;
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            obj = null;
            method = null;
        }
        this.exoPlayerClazz = cls;
        this.setImageOutputMethod = method;
        this.imageOutput = obj;
        ImageView imageView = (ImageView) findViewById(R.id.exo_artwork);
        this.artworkView = imageView;
        this.artworkDisplayMode = (!z5 || i10 == 0 || imageView == null) ? 0 : i10;
        if (i4 != 0) {
            this.defaultArtwork = getContext().getDrawable(i4);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.subtitleView = subtitleView;
        if (subtitleView != null) {
            subtitleView.setUserDefaultStyle();
            subtitleView.setUserDefaultTextSize();
        }
        View findViewById2 = findViewById(R.id.exo_buffering);
        this.bufferingView = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.showBuffering = i6;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.errorMessageView = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        PlayerControlView playerControlView = (PlayerControlView) findViewById(R.id.exo_controller);
        View findViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (playerControlView != null) {
            this.controller = playerControlView;
            i11 = 0;
        } else if (findViewById3 != null) {
            i11 = 0;
            PlayerControlView playerControlView2 = new PlayerControlView(context, null, 0, attributeSet);
            this.controller = playerControlView2;
            playerControlView2.setId(R.id.exo_controller);
            playerControlView2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(playerControlView2, indexOfChild);
        } else {
            i11 = 0;
            this.controller = null;
        }
        PlayerControlView playerControlView3 = this.controller;
        this.controllerShowTimeoutMs = playerControlView3 != null ? i2 : i11;
        this.controllerHideOnTouch = z2;
        this.controllerAutoShow = z3;
        this.controllerHideDuringAds = z4;
        this.useController = (!z || playerControlView3 == null) ? i11 : 1;
        if (playerControlView3 != null) {
            PlayerControlViewLayoutManager playerControlViewLayoutManager = playerControlView3.controlViewLayoutManager;
            int i18 = playerControlViewLayoutManager.uxState;
            if (i18 != 3 && i18 != 2) {
                playerControlViewLayoutManager.removeHideCallbacks();
                playerControlViewLayoutManager.setUxState(2);
            }
            PlayerControlView playerControlView4 = this.controller;
            ComponentListener componentListener2 = this.componentListener;
            playerControlView4.getClass();
            componentListener2.getClass();
            playerControlView4.visibilityListeners.add(componentListener2);
        }
        if (z) {
            setClickable(true);
        }
        updateContentDescription();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SurfaceSyncGroupCompatV34 surfaceSyncGroupCompatV34;
        super.dispatchDraw(canvas);
        if (Build.VERSION.SDK_INT == 34 && (surfaceSyncGroupCompatV34 = this.surfaceSyncGroupV34) != null && this.enableComposeSurfaceSyncWorkaround) {
            surfaceSyncGroupCompatV34.maybeMarkSyncReadyAndClear();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Player player = this.player;
        if (player != null && ((ExoPlayerImpl) player).isCommandAvailable(16) && ((ExoPlayerImpl) this.player).isPlayingAd()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        PlayerControlView playerControlView = this.controller;
        if (z && useController() && !playerControlView.isFullyVisible()) {
            maybeShowController(true);
            return true;
        }
        if ((useController() && playerControlView.dispatchMediaKeyEvent(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            maybeShowController(true);
            return true;
        }
        if (z && useController()) {
            maybeShowController(true);
        }
        return false;
    }

    public final boolean hasSelectedImageTrack() {
        Player player = this.player;
        if (player == null || this.imageOutput == null) {
            return false;
        }
        ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) player;
        return exoPlayerImpl.isCommandAvailable(30) && exoPlayerImpl.getCurrentTracks().isTypeSelected(4);
    }

    public final void hideAndClearImage() {
        ImageView imageView = this.imageView;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
        }
    }

    public final boolean isPlayingAd() {
        Player player = this.player;
        return player != null && ((ExoPlayerImpl) player).isCommandAvailable(16) && ((ExoPlayerImpl) this.player).isPlayingAd() && ((ExoPlayerImpl) this.player).getPlayWhenReady();
    }

    public final void maybeShowController(boolean z) {
        if (!(isPlayingAd() && this.controllerHideDuringAds) && useController()) {
            PlayerControlView playerControlView = this.controller;
            boolean z2 = playerControlView.isFullyVisible() && playerControlView.showTimeoutMs <= 0;
            boolean shouldShowControllerIndefinitely = shouldShowControllerIndefinitely();
            if (z || z2 || shouldShowControllerIndefinitely) {
                showController(shouldShowControllerIndefinitely);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!useController() || this.player == null) {
            return false;
        }
        maybeShowController(true);
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        toggleControllerVisibility();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i) {
        Trace.checkState(i == 0 || this.artworkView != null);
        if (this.artworkDisplayMode != i) {
            this.artworkDisplayMode = i;
            updateForCurrentTrackSelections(false);
        }
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.AspectRatioListener aspectRatioListener) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.contentFrame;
        aspectRatioFrameLayout.getClass();
        aspectRatioFrameLayout.setAspectRatioListener(aspectRatioListener);
    }

    public void setControllerAnimationEnabled(boolean z) {
        PlayerControlView playerControlView = this.controller;
        playerControlView.getClass();
        playerControlView.setAnimationEnabled(z);
    }

    public void setControllerAutoShow(boolean z) {
        this.controllerAutoShow = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.controllerHideDuringAds = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        this.controller.getClass();
        this.controllerHideOnTouch = z;
        updateContentDescription();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(PlayerControlView.OnFullScreenModeChangedListener onFullScreenModeChangedListener) {
        PlayerControlView playerControlView = this.controller;
        playerControlView.getClass();
        playerControlView.setOnFullScreenModeChangedListener(onFullScreenModeChangedListener);
    }

    public void setControllerShowTimeoutMs(int i) {
        PlayerControlView playerControlView = this.controller;
        playerControlView.getClass();
        this.controllerShowTimeoutMs = i;
        if (playerControlView.isFullyVisible()) {
            showController(shouldShowControllerIndefinitely());
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(PlayerControlView.VisibilityListener visibilityListener) {
        PlayerControlView playerControlView = this.controller;
        playerControlView.getClass();
        PlayerControlView.VisibilityListener visibilityListener2 = this.legacyControllerVisibilityListener;
        if (visibilityListener2 == visibilityListener) {
            return;
        }
        if (visibilityListener2 != null) {
            playerControlView.visibilityListeners.remove(visibilityListener2);
        }
        this.legacyControllerVisibilityListener = visibilityListener;
        if (visibilityListener != null) {
            playerControlView.getClass();
            playerControlView.visibilityListeners.add(visibilityListener);
            setControllerVisibilityListener((ControllerVisibilityListener) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        Trace.checkState(this.errorMessageView != null);
        this.customErrorMessage = charSequence;
        updateErrorMessage();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.defaultArtwork != drawable) {
            this.defaultArtwork = drawable;
            updateForCurrentTrackSelections(false);
        }
    }

    public final boolean setDrawableArtwork(Drawable drawable) {
        ImageView imageView = this.artworkView;
        if (imageView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.artworkDisplayMode == 2) {
                    f = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.contentFrame;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(f);
                }
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z) {
        this.enableComposeSurfaceSyncWorkaround = z;
    }

    public void setErrorMessageProvider(ErrorMessageProvider errorMessageProvider) {
        if (errorMessageProvider != null) {
            updateErrorMessage();
        }
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        PlayerControlView playerControlView = this.controller;
        playerControlView.getClass();
        playerControlView.setExtraAdGroupMarkers(jArr, zArr);
    }

    public void setFullscreenButtonClickListener(FullscreenButtonClickListener fullscreenButtonClickListener) {
        PlayerControlView playerControlView = this.controller;
        playerControlView.getClass();
        playerControlView.setOnFullScreenModeChangedListener(this.componentListener);
    }

    public void setFullscreenButtonState(boolean z) {
        PlayerControlView playerControlView = this.controller;
        playerControlView.getClass();
        playerControlView.updateIsFullscreen(z);
    }

    public void setImageDisplayMode(int i) {
        Trace.checkState(this.imageView != null);
        if (this.imageDisplayMode != i) {
            this.imageDisplayMode = i;
            updateImageViewAspectRatio();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.keepContentOnPlayerReset != z) {
            this.keepContentOnPlayerReset = z;
            updateForCurrentTrackSelections(false);
        }
    }

    public void setMediaRouteButtonViewProvider(ViewProvider viewProvider) {
        PlayerControlView playerControlView = this.controller;
        playerControlView.getClass();
        playerControlView.setMediaRouteButtonViewProvider(viewProvider);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0102, code lost:
    
        if (r3 != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00fe, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setPlayer(Player player) {
        boolean z = true;
        Trace.checkState(Looper.myLooper() == Looper.getMainLooper());
        Trace.checkArgument(player == null || ((ExoPlayerImpl) player).applicationLooper == Looper.getMainLooper());
        Player player2 = this.player;
        if (player2 == player) {
            return;
        }
        Method method = this.setImageOutputMethod;
        Class cls = this.exoPlayerClazz;
        View view = this.surfaceView;
        ComponentListener componentListener = this.componentListener;
        if (player2 != null) {
            ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) player2;
            exoPlayerImpl.removeListener(componentListener);
            if (exoPlayerImpl.isCommandAvailable(27)) {
                if (view instanceof TextureView) {
                    TextureView textureView = (TextureView) view;
                    exoPlayerImpl.verifyApplicationThread();
                    if (textureView == exoPlayerImpl.textureView) {
                        exoPlayerImpl.clearVideoSurface();
                    }
                } else if (view instanceof SurfaceView) {
                    exoPlayerImpl.verifyApplicationThread();
                    SurfaceHolder holder = ((SurfaceView) view).getHolder();
                    exoPlayerImpl.verifyApplicationThread();
                    if (holder != null && holder == exoPlayerImpl.surfaceHolder) {
                        exoPlayerImpl.clearVideoSurface();
                    }
                }
            }
            if (cls != null && cls.isAssignableFrom(player2.getClass())) {
                try {
                    method.getClass();
                    method.invoke(player2, null);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    a$$ExternalSyntheticBUOutline0.m(e);
                    return;
                }
            }
        }
        SubtitleView subtitleView = this.subtitleView;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.player = player;
        boolean useController = useController();
        PlayerControlView playerControlView = this.controller;
        if (useController) {
            playerControlView.setPlayer(player);
        }
        updateBuffering();
        updateErrorMessage();
        updateForCurrentTrackSelections(true);
        if (player == null) {
            if (playerControlView != null) {
                playerControlView.hide();
                return;
            }
            return;
        }
        ExoPlayerImpl exoPlayerImpl2 = (ExoPlayerImpl) player;
        if (exoPlayerImpl2.isCommandAvailable(27)) {
            if (view instanceof TextureView) {
                exoPlayerImpl2.setVideoTextureView((TextureView) view);
            } else if (view instanceof SurfaceView) {
                exoPlayerImpl2.setVideoSurfaceView((SurfaceView) view);
            }
            if (exoPlayerImpl2.isCommandAvailable(30)) {
                ImmutableList immutableList = exoPlayerImpl2.getCurrentTracks().groups;
                int i = 0;
                loop0: while (true) {
                    if (i >= immutableList.size()) {
                        z = false;
                        break;
                    }
                    if (((Tracks.Group) immutableList.get(i)).mediaTrackGroup.f871type == 2) {
                        Tracks.Group group = (Tracks.Group) immutableList.get(i);
                        int i2 = 0;
                        while (true) {
                            int[] iArr = group.trackSupport;
                            if (i2 < iArr.length) {
                                if (iArr[i2] == 4) {
                                    break loop0;
                                } else {
                                    i2++;
                                }
                            }
                        }
                    }
                    i++;
                }
            }
            updateAspectRatio();
        }
        if (subtitleView != null && exoPlayerImpl2.isCommandAvailable(28)) {
            exoPlayerImpl2.verifyApplicationThread();
            subtitleView.setCues(exoPlayerImpl2.currentCueGroup.cues);
        }
        exoPlayerImpl2.addListener(componentListener);
        if (cls != null && cls.isAssignableFrom(player.getClass())) {
            try {
                method.getClass();
                Object obj = this.imageOutput;
                obj.getClass();
                method.invoke(player, obj);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                a$$ExternalSyntheticBUOutline0.m(e2);
                return;
            }
        }
        maybeShowController(false);
    }

    public void setRepeatToggleModes(int i) {
        PlayerControlView playerControlView = this.controller;
        playerControlView.getClass();
        playerControlView.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.contentFrame;
        aspectRatioFrameLayout.getClass();
        aspectRatioFrameLayout.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.showBuffering != i) {
            this.showBuffering = i;
            updateBuffering();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        PlayerControlView playerControlView = this.controller;
        playerControlView.getClass();
        playerControlView.setShowFastForwardButton(z);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        PlayerControlView playerControlView = this.controller;
        playerControlView.getClass();
        playerControlView.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        PlayerControlView playerControlView = this.controller;
        playerControlView.getClass();
        playerControlView.setShowNextButton(z);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        PlayerControlView playerControlView = this.controller;
        playerControlView.getClass();
        playerControlView.setShowPlayButtonIfPlaybackIsSuppressed(z);
    }

    public void setShowPreviousButton(boolean z) {
        PlayerControlView playerControlView = this.controller;
        playerControlView.getClass();
        playerControlView.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        PlayerControlView playerControlView = this.controller;
        playerControlView.getClass();
        playerControlView.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        PlayerControlView playerControlView = this.controller;
        playerControlView.getClass();
        playerControlView.setShowShuffleButton(z);
    }

    public void setShowSubtitleButton(boolean z) {
        PlayerControlView playerControlView = this.controller;
        playerControlView.getClass();
        playerControlView.setShowSubtitleButton(z);
    }

    public void setShowVrButton(boolean z) {
        PlayerControlView playerControlView = this.controller;
        playerControlView.getClass();
        playerControlView.setShowVrButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.shutterView;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setTimeBarScrubbingEnabled(boolean z) {
        PlayerControlView playerControlView = this.controller;
        playerControlView.getClass();
        playerControlView.setTimeBarScrubbingEnabled(z);
    }

    @Deprecated
    public void setUseArtwork(boolean z) {
        setArtworkDisplayMode(!z ? 1 : 0);
    }

    public void setUseController(boolean z) {
        boolean z2 = true;
        PlayerControlView playerControlView = this.controller;
        Trace.checkState((z && playerControlView == null) ? false : true);
        if (!z && !hasOnClickListeners()) {
            z2 = false;
        }
        setClickable(z2);
        if (this.useController == z) {
            return;
        }
        this.useController = z;
        if (useController()) {
            playerControlView.setPlayer(this.player);
        } else if (playerControlView != null) {
            playerControlView.hide();
            playerControlView.setPlayer(null);
        }
        updateContentDescription();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.surfaceView;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public final boolean shouldShowControllerIndefinitely() {
        Player player = this.player;
        if (player == null) {
            return true;
        }
        int playbackState = ((ExoPlayerImpl) player).getPlaybackState();
        if (!this.controllerAutoShow) {
            return false;
        }
        if (((ExoPlayerImpl) this.player).isCommandAvailable(17) && ((ExoPlayerImpl) this.player).getCurrentTimeline().isEmpty()) {
            return false;
        }
        if (playbackState != 1 && playbackState != 4) {
            Player player2 = this.player;
            player2.getClass();
            if (((ExoPlayerImpl) player2).getPlayWhenReady()) {
                return false;
            }
        }
        return true;
    }

    public final void showController(boolean z) {
        if (useController()) {
            int i = z ? 0 : this.controllerShowTimeoutMs;
            PlayerControlView playerControlView = this.controller;
            playerControlView.setShowTimeoutMs(i);
            PlayerControlViewLayoutManager playerControlViewLayoutManager = playerControlView.controlViewLayoutManager;
            PlayerControlView playerControlView2 = playerControlViewLayoutManager.playerControlView;
            if (!playerControlView2.isVisible()) {
                playerControlView2.setVisibility(0);
                playerControlView2.updateAll();
                ImageView imageView = playerControlView2.playPauseButton;
                if (imageView != null) {
                    imageView.requestFocus();
                }
            }
            playerControlViewLayoutManager.showAllBars();
        }
    }

    public final void toggleControllerVisibility() {
        if (!useController() || this.player == null) {
            return;
        }
        PlayerControlView playerControlView = this.controller;
        if (!playerControlView.isFullyVisible()) {
            maybeShowController(true);
        } else if (this.controllerHideOnTouch) {
            playerControlView.hide();
        }
    }

    public final void updateAspectRatio() {
        VideoSize videoSize;
        Player player = this.player;
        if (player != null) {
            ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) player;
            exoPlayerImpl.verifyApplicationThread();
            videoSize = exoPlayerImpl.videoSize;
        } else {
            videoSize = VideoSize.UNKNOWN;
        }
        int i = videoSize.width;
        int i2 = videoSize.height;
        float f = RecyclerView.DECELERATION_RATE;
        float f2 = (i2 == 0 || i == 0) ? 0.0f : (i * videoSize.pixelWidthHeightRatio) / i2;
        if (!this.surfaceViewIgnoresVideoAspectRatio) {
            f = f2;
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.contentFrame;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (((androidx.media3.exoplayer.ExoPlayerImpl) r5.player).getPlayWhenReady() == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateBuffering() {
        boolean z;
        View view = this.bufferingView;
        if (view != null) {
            Player player = this.player;
            if (player != null && ((ExoPlayerImpl) player).getPlaybackState() == 2) {
                int i = this.showBuffering;
                z = true;
                if (i != 2) {
                    if (i == 1) {
                    }
                }
                view.setVisibility(z ? 0 : 8);
            }
            z = false;
            view.setVisibility(z ? 0 : 8);
        }
    }

    public final void updateContentDescription() {
        PlayerControlView playerControlView = this.controller;
        if (playerControlView == null || !this.useController) {
            setContentDescription(null);
        } else if (playerControlView.isFullyVisible()) {
            setContentDescription(this.controllerHideOnTouch ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    public final void updateErrorMessage() {
        TextView textView = this.errorMessageView;
        if (textView != null) {
            CharSequence charSequence = this.customErrorMessage;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                return;
            }
            Player player = this.player;
            if (player != null) {
                ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) player;
                exoPlayerImpl.verifyApplicationThread();
                ExoPlaybackException exoPlaybackException = exoPlayerImpl.playbackInfo.playbackError;
            }
            textView.setVisibility(8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateForCurrentTrackSelections(boolean z) {
        boolean z2;
        boolean z3;
        ImageView imageView;
        View view;
        boolean z4;
        boolean hasSelectedImageTrack;
        Drawable drawable;
        Player player = this.player;
        boolean z5 = false;
        if (player != null) {
            ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) player;
            if (exoPlayerImpl.isCommandAvailable(30) && !exoPlayerImpl.getCurrentTracks().groups.isEmpty()) {
                z2 = true;
                z3 = this.keepContentOnPlayerReset;
                imageView = this.artworkView;
                view = this.shutterView;
                if (!z3 && (!z2 || z)) {
                    if (imageView != null) {
                        imageView.setImageResource(android.R.color.transparent);
                        imageView.setVisibility(4);
                    }
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    hideAndClearImage();
                }
                if (z2) {
                    return;
                }
                Player player2 = this.player;
                if (player2 != null) {
                    ExoPlayerImpl exoPlayerImpl2 = (ExoPlayerImpl) player2;
                    if (exoPlayerImpl2.isCommandAvailable(30) && exoPlayerImpl2.getCurrentTracks().isTypeSelected(2)) {
                        z4 = true;
                        hasSelectedImageTrack = hasSelectedImageTrack();
                        if (!z4 && !hasSelectedImageTrack) {
                            if (view != null) {
                                view.setVisibility(0);
                            }
                            hideAndClearImage();
                        }
                        ImageView imageView2 = this.imageView;
                        boolean z6 = (view != null || view.getVisibility() != 4 || imageView2 == null || (drawable = imageView2.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
                        if (!hasSelectedImageTrack && !z4 && z6) {
                            if (view != null) {
                                view.setVisibility(0);
                            }
                            if (imageView2 != null) {
                                imageView2.setVisibility(0);
                                updateImageViewAspectRatio();
                            }
                        } else if (z4 && !hasSelectedImageTrack && z6) {
                            hideAndClearImage();
                        }
                        if (!z4 && !hasSelectedImageTrack && this.artworkDisplayMode != 0) {
                            imageView.getClass();
                            if (player != null) {
                                ExoPlayerImpl exoPlayerImpl3 = (ExoPlayerImpl) player;
                                if (exoPlayerImpl3.isCommandAvailable(18)) {
                                    exoPlayerImpl3.verifyApplicationThread();
                                    byte[] bArr = exoPlayerImpl3.mediaMetadata.artworkData;
                                    if (bArr != null) {
                                        z5 = setDrawableArtwork(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                                    }
                                }
                            }
                            if (z5 || setDrawableArtwork(this.defaultArtwork)) {
                                return;
                            }
                        }
                        if (imageView == null) {
                            imageView.setImageResource(android.R.color.transparent);
                            imageView.setVisibility(4);
                            return;
                        }
                        return;
                    }
                }
                z4 = false;
                hasSelectedImageTrack = hasSelectedImageTrack();
                if (!z4) {
                    if (view != null) {
                    }
                    hideAndClearImage();
                }
                ImageView imageView22 = this.imageView;
                if (view != null) {
                }
                if (!hasSelectedImageTrack) {
                }
                if (z4) {
                    hideAndClearImage();
                }
                if (!z4) {
                    imageView.getClass();
                    if (player != null) {
                    }
                    if (z5) {
                        return;
                    } else {
                        return;
                    }
                }
                if (imageView == null) {
                }
            }
        }
        z2 = false;
        z3 = this.keepContentOnPlayerReset;
        imageView = this.artworkView;
        view = this.shutterView;
        if (!z3) {
            if (imageView != null) {
            }
            if (view != null) {
            }
            hideAndClearImage();
        }
        if (z2) {
        }
    }

    public final void updateImageViewAspectRatio() {
        Drawable drawable;
        AspectRatioFrameLayout aspectRatioFrameLayout;
        ImageView imageView = this.imageView;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float f = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.imageDisplayMode == 1) {
            f = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (imageView.getVisibility() == 0 && (aspectRatioFrameLayout = this.contentFrame) != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
        imageView.setScaleType(scaleType);
    }

    public final boolean useController() {
        if (!this.useController) {
            return false;
        }
        this.controller.getClass();
        return true;
    }

    public void setControllerVisibilityListener(ControllerVisibilityListener controllerVisibilityListener) {
        if (controllerVisibilityListener != null) {
            setControllerVisibilityListener((PlayerControlView.VisibilityListener) null);
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerView(Context context) {
        this(context, null);
    }
}
