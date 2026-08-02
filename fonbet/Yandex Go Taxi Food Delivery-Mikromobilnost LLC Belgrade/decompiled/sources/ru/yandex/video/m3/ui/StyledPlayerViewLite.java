package ru.yandex.video.m3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.media3.common.PlaybackException;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.SubtitleView;
import com.google.common.collect.ImmutableList;
import defpackage.a9z0;
import defpackage.d6z;
import defpackage.do31;
import defpackage.dyc0;
import defpackage.dzc0;
import defpackage.ezc0;
import defpackage.fe10;
import defpackage.lxc0;
import defpackage.myc0;
import defpackage.ny61;
import defpackage.o83;
import defpackage.q60;
import defpackage.r001;
import defpackage.r801;
import defpackage.rdf;
import defpackage.re10;
import defpackage.tw21;
import defpackage.ue3;
import defpackage.vxc0;
import defpackage.w820;
import defpackage.wxc0;
import defpackage.x60;
import defpackage.xaj;
import defpackage.xxc0;
import defpackage.y8z0;
import defpackage.yxc0;
import defpackage.z7o;
import defpackage.zxc0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import ru.yandex.video.m3.R;

/* loaded from: classes10.dex */
class StyledPlayerViewLite extends FrameLayout implements x60, PlayerView {
    public static final int SHOW_BUFFERING_ALWAYS = 2;
    public static final int SHOW_BUFFERING_NEVER = 0;
    public static final int SHOW_BUFFERING_WHEN_PLAYING = 1;
    private static final int SURFACE_TYPE_NONE = 0;
    private static final int SURFACE_TYPE_SPHERICAL_GL_SURFACE_VIEW = 3;
    private static final int SURFACE_TYPE_SURFACE_VIEW = 1;
    private static final int SURFACE_TYPE_TEXTURE_VIEW = 2;
    private static final int SURFACE_TYPE_VIDEO_DECODER_GL_SURFACE_VIEW = 4;
    private final FrameLayout adOverlayFrameLayout;
    private final ImageView artworkView;
    private final View bufferingView;
    private final ComponentListener componentListener;
    private final AspectRatioFrameLayout contentFrame;
    private final PlayerControlView controller;
    private boolean controllerAutoShow;
    private boolean controllerHideDuringAds;
    private boolean controllerHideOnTouch;
    private int controllerShowTimeoutMs;
    private dzc0 controllerVisibilityListener;
    private CharSequence customErrorMessage;
    private Drawable defaultArtwork;
    private z7o errorMessageProvider;
    private final TextView errorMessageView;
    private ezc0 fullscreenButtonClickListener;
    private boolean isHideShutterWhenPlayerReady;
    private boolean keepContentOnPlayerReset;
    private myc0 legacyControllerVisibilityListener;
    private final FrameLayout overlayFrameLayout;
    private zxc0 player;
    private int showBuffering;
    private int shutterHidingDelay;
    private final Handler shutterHidingHandler;
    private final View shutterView;
    private final SubtitleView subtitleView;
    private final View surfaceView;
    private final boolean surfaceViewIgnoresVideoAspectRatio;
    private int textureViewRotation;
    private boolean useArtwork;
    private boolean useController;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface ShowBuffering {
    }

    public StyledPlayerViewLite(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        boolean z4;
        int i6;
        boolean z5;
        boolean z6;
        int i7;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        this.shutterHidingHandler = new Handler(Looper.getMainLooper());
        this.shutterHidingDelay = 0;
        this.isHideShutterWhenPlayerReady = false;
        ComponentListener componentListener = new ComponentListener();
        this.componentListener = componentListener;
        if (isInEditMode()) {
            this.contentFrame = null;
            this.shutterView = null;
            this.surfaceView = null;
            this.surfaceViewIgnoresVideoAspectRatio = false;
            this.artworkView = null;
            this.subtitleView = null;
            this.bufferingView = null;
            this.errorMessageView = null;
            this.controller = null;
            this.adOverlayFrameLayout = null;
            this.overlayFrameLayout = null;
            ImageView imageView = new ImageView(context);
            if (tw21.a >= 23) {
                configureEditModeLogoV23(context, getResources(), imageView);
            } else {
                configureEditModeLogo(context, getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.StyledPlayerViewLite, i, 0);
            try {
                boolean hasValue = obtainStyledAttributes.hasValue(R.styleable.StyledPlayerViewLite_shutter_background_color);
                int color = obtainStyledAttributes.getColor(R.styleable.StyledPlayerViewLite_shutter_background_color, 0);
                this.shutterHidingDelay = obtainStyledAttributes.getInt(R.styleable.StyledPlayerViewLite_shutter_hiding_delay, this.shutterHidingDelay);
                this.isHideShutterWhenPlayerReady = obtainStyledAttributes.getBoolean(R.styleable.StyledPlayerViewLite_is_hide_shutter_when_player_ready, this.isHideShutterWhenPlayerReady);
                boolean z11 = obtainStyledAttributes.getBoolean(R.styleable.StyledPlayerViewLite_use_ad_overlay, false);
                boolean z12 = obtainStyledAttributes.getBoolean(R.styleable.StyledPlayerViewLite_use_overlay, false);
                boolean z13 = obtainStyledAttributes.getBoolean(R.styleable.StyledPlayerViewLite_use_subtitle, false);
                boolean z14 = obtainStyledAttributes.getBoolean(R.styleable.StyledPlayerViewLite_use_error_message, false);
                boolean z15 = obtainStyledAttributes.getBoolean(R.styleable.StyledPlayerViewLite_use_artwork, false);
                int resourceId = obtainStyledAttributes.getResourceId(R.styleable.StyledPlayerViewLite_default_artwork, 0);
                boolean z16 = obtainStyledAttributes.getBoolean(R.styleable.StyledPlayerViewLite_use_controller, false);
                int i8 = obtainStyledAttributes.getInt(R.styleable.StyledPlayerViewLite_surface_type, 1);
                int i9 = obtainStyledAttributes.getInt(R.styleable.StyledPlayerViewLite_resize_mode, 0);
                i2 = obtainStyledAttributes.getInt(R.styleable.StyledPlayerViewLite_show_timeout, 5000);
                boolean z17 = obtainStyledAttributes.getBoolean(R.styleable.StyledPlayerViewLite_hide_on_touch, true);
                boolean z18 = obtainStyledAttributes.getBoolean(R.styleable.StyledPlayerViewLite_auto_show, true);
                int integer = obtainStyledAttributes.getInteger(R.styleable.StyledPlayerViewLite_show_buffering, 0);
                this.keepContentOnPlayerReset = obtainStyledAttributes.getBoolean(R.styleable.StyledPlayerViewLite_keep_content_on_player_reset, this.keepContentOnPlayerReset);
                boolean z19 = obtainStyledAttributes.getBoolean(R.styleable.StyledPlayerViewLite_hide_during_ads, true);
                obtainStyledAttributes.recycle();
                z7 = z12;
                z6 = z15;
                i4 = i8;
                z = hasValue;
                z3 = z18;
                z4 = z19;
                z10 = z11;
                i3 = i9;
                z5 = z16;
                z8 = z13;
                z2 = z17;
                i7 = color;
                z9 = z14;
                i6 = resourceId;
                i5 = integer;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i2 = 5000;
            z = false;
            i3 = 0;
            i4 = 1;
            i5 = 0;
            z2 = true;
            z3 = true;
            z4 = true;
            i6 = 0;
            z5 = false;
            z6 = false;
            i7 = 0;
            z7 = false;
            z8 = false;
            z9 = false;
            z10 = false;
        }
        AspectRatioFrameLayout addContentFrame = addContentFrame(context, this);
        this.contentFrame = addContentFrame;
        setResizeModeRaw(addContentFrame, i3);
        View addShutter = addShutter(context, addContentFrame);
        this.shutterView = addShutter;
        if (z) {
            addShutter.setBackgroundColor(i7);
        }
        this.surfaceView = addSurfaceView(context, addContentFrame, i4);
        this.surfaceViewIgnoresVideoAspectRatio = i4 == 3;
        this.adOverlayFrameLayout = z10 ? addAdOverlay(context, this) : null;
        this.overlayFrameLayout = z7 ? addOverlay(context, this) : null;
        this.useArtwork = z6;
        this.artworkView = z6 ? addArtwork(context, addContentFrame) : null;
        if (i6 != 0) {
            this.defaultArtwork = getContext().getDrawable(i6);
        }
        SubtitleView addSubtitles = z8 ? addSubtitles(context, addContentFrame) : null;
        this.subtitleView = addSubtitles;
        if (addSubtitles != null) {
            addSubtitles.setUserDefaultStyle();
            addSubtitles.setUserDefaultTextSize();
        }
        this.showBuffering = i5;
        if (i5 == 0) {
            this.bufferingView = null;
        } else {
            ProgressBar addBuffering = addBuffering(context, addContentFrame);
            this.bufferingView = addBuffering;
            addBuffering.setVisibility(8);
        }
        AppCompatTextView addErrorMessage = z9 ? addErrorMessage(context, addContentFrame) : null;
        this.errorMessageView = addErrorMessage;
        if (addErrorMessage != null) {
            addErrorMessage.setVisibility(8);
        }
        this.useController = z5;
        this.controllerShowTimeoutMs = z5 ? i2 : 0;
        this.controllerHideOnTouch = z2;
        this.controllerAutoShow = z3;
        this.controllerHideDuringAds = z4;
        if (z5) {
            PlayerControlView addStyledPlayerControlView = addStyledPlayerControlView(context, this, attributeSet);
            this.controller = addStyledPlayerControlView;
            addStyledPlayerControlView.hideImmediately();
            addStyledPlayerControlView.addVisibilityListener(componentListener);
            setClickable(true);
        } else {
            this.controller = null;
        }
        setDescendantFocusability(262144);
        updateContentDescription();
    }

    public static /* synthetic */ dzc0 access$1700(StyledPlayerViewLite styledPlayerViewLite) {
        styledPlayerViewLite.getClass();
        return null;
    }

    public static /* synthetic */ ezc0 access$1800(StyledPlayerViewLite styledPlayerViewLite) {
        styledPlayerViewLite.getClass();
        return null;
    }

    private FrameLayout addAdOverlay(Context context, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.exo_ad_overlay);
        viewGroup.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    private AppCompatImageView addArtwork(Context context, ViewGroup viewGroup) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.exo_artwork);
        appCompatImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        viewGroup.addView(appCompatImageView, new FrameLayout.LayoutParams(-1, -1));
        return appCompatImageView;
    }

    private ProgressBar addBuffering(Context context, ViewGroup viewGroup) {
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setId(R.id.exo_buffering);
        progressBar.setIndeterminate(true);
        viewGroup.addView(progressBar, new FrameLayout.LayoutParams(-1, -1, 17));
        return progressBar;
    }

    private AspectRatioFrameLayout addContentFrame(Context context, ViewGroup viewGroup) {
        AspectRatioFrameLayout aspectRatioFrameLayout = new AspectRatioFrameLayout(context);
        aspectRatioFrameLayout.setId(R.id.exo_content_frame);
        viewGroup.addView(aspectRatioFrameLayout, new FrameLayout.LayoutParams(-1, -1, 17));
        return aspectRatioFrameLayout;
    }

    private AppCompatTextView addErrorMessage(Context context, ViewGroup viewGroup) {
        Resources resources = context.getResources();
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R.id.exo_error_message);
        appCompatTextView.setTextColor(context.getColor(R.color.exo_white));
        appCompatTextView.setTextSize(2, 14.0f);
        appCompatTextView.setBackgroundResource(R.drawable.exo_rounded_rectangle);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.exo_error_message_text_padding_horizontal);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.exo_error_message_text_padding_vertical);
        appCompatTextView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        layoutParams.setMargins(0, 0, 0, resources.getDimensionPixelSize(R.dimen.exo_error_message_margin_bottom));
        viewGroup.addView(appCompatTextView, layoutParams);
        return appCompatTextView;
    }

    private FrameLayout addOverlay(Context context, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.exo_overlay);
        viewGroup.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    private View addShutter(Context context, ViewGroup viewGroup) {
        View view = new View(context);
        view.setId(R.id.exo_shutter);
        viewGroup.addView(view, new FrameLayout.LayoutParams(-1, -1));
        return view;
    }

    private PlayerControlView addStyledPlayerControlView(Context context, ViewGroup viewGroup, AttributeSet attributeSet) {
        PlayerControlView playerControlView = new PlayerControlView(context, null, 0, attributeSet);
        playerControlView.setId(R.id.exo_controller);
        playerControlView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        viewGroup.addView(playerControlView);
        return playerControlView;
    }

    private SubtitleView addSubtitles(Context context, ViewGroup viewGroup) {
        SubtitleView subtitleView = new SubtitleView(context);
        subtitleView.setId(R.id.exo_subtitles);
        viewGroup.addView(subtitleView, new FrameLayout.LayoutParams(-1, -1));
        return subtitleView;
    }

    private View addSurfaceView(Context context, ViewGroup viewGroup, int i) {
        View textureView;
        if (viewGroup == null || i == 0) {
            return null;
        }
        if (i == 2) {
            textureView = new TextureView(context);
        } else if (i == 3) {
            try {
                textureView = (View) Class.forName("com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView").getConstructor(Context.class).newInstance(context);
            } catch (Exception e) {
                ny61.h("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                return null;
            }
        } else if (i != 4) {
            textureView = new SurfaceView(context);
        } else {
            try {
                textureView = (View) Class.forName("com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView").getConstructor(Context.class).newInstance(context);
            } catch (Exception e2) {
                ny61.h("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                return null;
            }
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        textureView.setOnClickListener(this.componentListener);
        textureView.setClickable(false);
        viewGroup.addView(textureView, 0, layoutParams);
        return textureView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void applyTextureViewRotation(TextureView textureView, int i) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i != 0) {
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            matrix.postRotate(i, f, f2);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f, f2);
        }
        textureView.setTransform(matrix);
    }

    private void closeShutter() {
        setShutterVisible(true);
    }

    private static void configureEditModeLogo(Context context, Resources resources, ImageView imageView) {
        int i = R.drawable.exo_edit_mode_logo;
        int i2 = tw21.a;
        imageView.setImageDrawable(resources.getDrawable(i, context.getTheme()));
        imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color));
    }

    private static void configureEditModeLogoV23(Context context, Resources resources, ImageView imageView) {
        int i = R.drawable.exo_edit_mode_logo;
        int i2 = tw21.a;
        imageView.setImageDrawable(resources.getDrawable(i, context.getTheme()));
        imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
    }

    private void hideArtwork() {
        ImageView imageView = this.artworkView;
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
            this.artworkView.setVisibility(4);
        }
    }

    private boolean isDpadKey(int i) {
        return i == 19 || i == 270 || i == 22 || i == 271 || i == 20 || i == 269 || i == 21 || i == 268 || i == 23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isPlayingAd() {
        zxc0 zxc0Var = this.player;
        return zxc0Var != null && zxc0Var.isCommandAvailable(16) && this.player.isPlayingAd() && this.player.getPlayWhenReady();
    }

    private boolean isShutterVisibilitySameState(boolean z) {
        View view = this.shutterView;
        if (view == null) {
            return false;
        }
        return (z ? 0 : 4) == view.getVisibility();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setShutterVisible$0() {
        setShutterVisibleImmediately(false);
    }

    private void maybeShowController(boolean z) {
    }

    private boolean setArtworkFromMediaMetadata(zxc0 zxc0Var) {
        byte[] bArr;
        if (zxc0Var.isCommandAvailable(18) && (bArr = zxc0Var.getMediaMetadata().f) != null) {
            return setDrawableArtwork(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
        }
        return false;
    }

    private boolean setDrawableArtwork(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                onContentAspectRatioChanged(this.contentFrame, intrinsicWidth / intrinsicHeight);
                this.artworkView.setImageDrawable(drawable);
                this.artworkView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private static void setResizeModeRaw(AspectRatioFrameLayout aspectRatioFrameLayout, int i) {
        aspectRatioFrameLayout.setResizeMode(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShutterVisible(boolean z) {
        if (this.shutterHidingDelay <= 0) {
            setShutterVisibleImmediately(z);
            return;
        }
        this.shutterHidingHandler.removeCallbacksAndMessages(null);
        if (isShutterVisibilitySameState(z)) {
            return;
        }
        if (z) {
            setShutterVisibleImmediately(true);
        } else {
            this.shutterHidingHandler.postDelayed(new Runnable() { // from class: ru.yandex.video.m3.ui.a
                @Override // java.lang.Runnable
                public final void run() {
                    StyledPlayerViewLite.this.lambda$setShutterVisible$0();
                }
            }, this.shutterHidingDelay);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShutterVisibleImmediately(boolean z) {
        View view = this.shutterView;
        if (view == null) {
            return;
        }
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(4);
        }
    }

    private boolean shouldShowControllerIndefinitely() {
        zxc0 zxc0Var = this.player;
        if (zxc0Var == null) {
            return true;
        }
        int playbackState = zxc0Var.getPlaybackState();
        if (!this.controllerAutoShow) {
            return false;
        }
        if (this.player.isCommandAvailable(17) && this.player.getCurrentTimeline().q()) {
            return false;
        }
        if (playbackState != 1 && playbackState != 4) {
            zxc0 zxc0Var2 = this.player;
            zxc0Var2.getClass();
            if (zxc0Var2.getPlayWhenReady()) {
                return false;
            }
        }
        return true;
    }

    public static void switchTargetView(zxc0 zxc0Var, androidx.media3.ui.PlayerView playerView, androidx.media3.ui.PlayerView playerView2) {
        if (playerView == playerView2) {
            return;
        }
        if (playerView2 != null) {
            playerView2.setPlayer(zxc0Var);
        }
        if (playerView != null) {
            playerView.setPlayer(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toggleControllerVisibility() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAspectRatio() {
        zxc0 zxc0Var = this.player;
        do31 videoSize = zxc0Var != null ? zxc0Var.getVideoSize() : do31.d;
        int i = videoSize.a;
        int i2 = videoSize.b;
        float f = (i2 == 0 || i == 0) ? 0.0f : (i * videoSize.c) / i2;
        View view = this.surfaceView;
        if (view instanceof TextureView) {
            if (this.textureViewRotation != 0) {
                view.removeOnLayoutChangeListener(this.componentListener);
            }
            this.textureViewRotation = 0;
            applyTextureViewRotation((TextureView) this.surfaceView, this.textureViewRotation);
        }
        onContentAspectRatioChanged(this.contentFrame, this.surfaceViewIgnoresVideoAspectRatio ? 0.0f : f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r4.player.getPlayWhenReady() == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void updateBuffering() {
        boolean z;
        if (this.bufferingView != null) {
            zxc0 zxc0Var = this.player;
            if (zxc0Var != null && zxc0Var.getPlaybackState() == 2) {
                int i = this.showBuffering;
                z = true;
                if (i != 2) {
                    if (i == 1) {
                    }
                }
                this.bufferingView.setVisibility(z ? 0 : 8);
            }
            z = false;
            this.bufferingView.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateContentDescription() {
        PlayerControlView playerControlView = this.controller;
        if (playerControlView == null || !this.useController) {
            setContentDescription(null);
        } else if (playerControlView.isFullyVisible()) {
            setContentDescription(this.controllerHideOnTouch ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateControllerVisibility() {
        if (isPlayingAd() && this.controllerHideDuringAds) {
            hideController();
        } else {
            maybeShowController(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateErrorMessage() {
        TextView textView = this.errorMessageView;
        if (textView != null) {
            CharSequence charSequence = this.customErrorMessage;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.errorMessageView.setVisibility(0);
            } else {
                zxc0 zxc0Var = this.player;
                if (zxc0Var != null) {
                    zxc0Var.getPlayerError();
                }
                this.errorMessageView.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateForCurrentTrackSelections(boolean z) {
        zxc0 zxc0Var = this.player;
        if (zxc0Var == null || !zxc0Var.isCommandAvailable(30) || zxc0Var.getCurrentTracks().b()) {
            if (this.keepContentOnPlayerReset) {
                return;
            }
            hideArtwork();
            closeShutter();
            return;
        }
        if (z && !this.keepContentOnPlayerReset) {
            closeShutter();
        }
        if (zxc0Var.getCurrentTracks().c(2)) {
            hideArtwork();
            return;
        }
        closeShutter();
        if (useArtwork() && (setArtworkFromMediaMetadata(zxc0Var) || setDrawableArtwork(this.defaultArtwork))) {
            return;
        }
        hideArtwork();
    }

    private boolean useArtwork() {
        if (!this.useArtwork) {
            return false;
        }
        d6z.z(this.artworkView);
        return true;
    }

    private boolean useController() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        zxc0 zxc0Var = this.player;
        if (zxc0Var != null && zxc0Var.isCommandAvailable(16) && this.player.isPlayingAd()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean isDpadKey = isDpadKey(keyEvent.getKeyCode());
        if (isDpadKey && useController() && !this.controller.isFullyVisible()) {
            maybeShowController(true);
            return true;
        }
        if (dispatchMediaKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            maybeShowController(true);
            return true;
        }
        if (isDpadKey && useController()) {
            maybeShowController(true);
        }
        return false;
    }

    public boolean dispatchMediaKeyEvent(KeyEvent keyEvent) {
        return useController() && this.controller.dispatchMediaKeyEvent(keyEvent);
    }

    public List<q60> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.overlayFrameLayout;
        if (frameLayout != null) {
            arrayList.add(new q60(frameLayout, 0));
        }
        PlayerControlView playerControlView = this.controller;
        if (playerControlView != null) {
            arrayList.add(new q60(playerControlView));
        }
        return ImmutableList.l(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.adOverlayFrameLayout;
        d6z.A(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public boolean getControllerAutoShow() {
        return this.controllerAutoShow;
    }

    public boolean getControllerHideOnTouch() {
        return this.controllerHideOnTouch;
    }

    public int getControllerShowTimeoutMs() {
        return this.controllerShowTimeoutMs;
    }

    public Drawable getDefaultArtwork() {
        return this.defaultArtwork;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.overlayFrameLayout;
    }

    @Override // ru.yandex.video.m3.ui.PlayerView
    public zxc0 getPlayer() {
        return this.player;
    }

    @Override // ru.yandex.video.m3.ui.PlayerView
    public int getResizeMode() {
        d6z.z(this.contentFrame);
        return this.contentFrame.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.subtitleView;
    }

    public boolean getUseArtwork() {
        return this.useArtwork;
    }

    public boolean getUseController() {
        return this.useController;
    }

    public View getVideoSurfaceView() {
        return this.surfaceView;
    }

    @Override // ru.yandex.video.m3.ui.PlayerView
    public View getView() {
        return this;
    }

    public void hideController() {
        PlayerControlView playerControlView = this.controller;
        if (playerControlView != null) {
            playerControlView.hide();
        }
    }

    public boolean isControllerFullyVisible() {
        PlayerControlView playerControlView = this.controller;
        return playerControlView != null && playerControlView.isFullyVisible();
    }

    public void onContentAspectRatioChanged(AspectRatioFrameLayout aspectRatioFrameLayout, float f) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    public void onPause() {
        View view = this.surfaceView;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onPause();
        }
    }

    public void onResume() {
        View view = this.surfaceView;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onResume();
        }
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!useController() || this.player == null) {
            return false;
        }
        maybeShowController(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        toggleControllerVisibility();
        return super.performClick();
    }

    public void setAspectRatioListener(o83 o83Var) {
        d6z.z(this.contentFrame);
        this.contentFrame.setAspectRatioListener(o83Var);
    }

    public void setControllerAutoShow(boolean z) {
        this.controllerAutoShow = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.controllerHideDuringAds = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        d6z.z(this.controller);
        this.controllerHideOnTouch = z;
        updateContentDescription();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(dyc0 dyc0Var) {
        d6z.z(this.controller);
        this.controller.setOnFullScreenModeChangedListener(dyc0Var);
    }

    public void setControllerShowTimeoutMs(int i) {
        d6z.z(this.controller);
        this.controllerShowTimeoutMs = i;
        if (this.controller.isFullyVisible()) {
            showController();
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(myc0 myc0Var) {
        d6z.z(this.controller);
        myc0 myc0Var2 = this.legacyControllerVisibilityListener;
        if (myc0Var2 == myc0Var) {
            return;
        }
        if (myc0Var2 != null) {
            this.controller.removeVisibilityListener(myc0Var2);
        }
        this.legacyControllerVisibilityListener = myc0Var;
        if (myc0Var != null) {
            this.controller.addVisibilityListener(myc0Var);
            setControllerVisibilityListener((dzc0) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        d6z.x(this.errorMessageView != null);
        this.customErrorMessage = charSequence;
        updateErrorMessage();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.defaultArtwork != drawable) {
            this.defaultArtwork = drawable;
            updateForCurrentTrackSelections(false);
        }
    }

    public void setErrorMessageProvider(z7o z7oVar) {
        if (z7oVar != null) {
            updateErrorMessage();
        }
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        d6z.z(this.controller);
        this.controller.setExtraAdGroupMarkers(jArr, zArr);
    }

    public void setFullscreenButtonClickListener(ezc0 ezc0Var) {
        d6z.z(this.controller);
        this.controller.setOnFullScreenModeChangedListener(this.componentListener);
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.keepContentOnPlayerReset != z) {
            this.keepContentOnPlayerReset = z;
            updateForCurrentTrackSelections(false);
        }
    }

    @Override // ru.yandex.video.m3.ui.PlayerView
    public void setPlayer(zxc0 zxc0Var) {
        d6z.x(Looper.myLooper() == Looper.getMainLooper());
        d6z.l(zxc0Var == null || zxc0Var.getApplicationLooper() == Looper.getMainLooper());
        zxc0 zxc0Var2 = this.player;
        if (zxc0Var2 == zxc0Var) {
            return;
        }
        if (zxc0Var2 != null) {
            zxc0Var2.removeListener(this.componentListener);
            if (zxc0Var2.isCommandAvailable(27)) {
                View view = this.surfaceView;
                if (view instanceof TextureView) {
                    zxc0Var2.clearVideoTextureView((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    zxc0Var2.clearVideoSurfaceView((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.subtitleView;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.player = zxc0Var;
        if (useController()) {
            this.controller.setPlayer(zxc0Var);
        }
        updateBuffering();
        updateErrorMessage();
        updateForCurrentTrackSelections(true);
        if (zxc0Var == null) {
            hideController();
            return;
        }
        if (zxc0Var.isCommandAvailable(27)) {
            View view2 = this.surfaceView;
            if (view2 instanceof TextureView) {
                zxc0Var.setVideoTextureView((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                zxc0Var.setVideoSurfaceView((SurfaceView) view2);
            }
            updateAspectRatio();
        }
        if (this.subtitleView != null && zxc0Var.isCommandAvailable(28)) {
            this.subtitleView.setCues(zxc0Var.getCurrentCues().a);
        }
        zxc0Var.addListener(this.componentListener);
        maybeShowController(false);
    }

    public void setRepeatToggleModes(int i) {
        d6z.z(this.controller);
        this.controller.setRepeatToggleModes(i);
    }

    @Override // ru.yandex.video.m3.ui.PlayerView
    public void setResizeMode(int i) {
        d6z.z(this.contentFrame);
        this.contentFrame.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.showBuffering != i) {
            this.showBuffering = i;
            updateBuffering();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        d6z.z(this.controller);
        this.controller.setShowFastForwardButton(z);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        d6z.z(this.controller);
        this.controller.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        d6z.z(this.controller);
        this.controller.setShowNextButton(z);
    }

    public void setShowPreviousButton(boolean z) {
        d6z.z(this.controller);
        this.controller.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        d6z.z(this.controller);
        this.controller.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        d6z.z(this.controller);
        this.controller.setShowShuffleButton(z);
    }

    public void setShowSubtitleButton(boolean z) {
        d6z.z(this.controller);
        this.controller.setShowSubtitleButton(z);
    }

    public void setShowVrButton(boolean z) {
        d6z.z(this.controller);
        this.controller.setShowVrButton(z);
    }

    @Override // ru.yandex.video.m3.ui.PlayerView
    public void setShutterBackgroundColor(int i) {
        View view = this.shutterView;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setUseArtwork(boolean z) {
        d6z.x((z && this.artworkView == null) ? false : true);
        if (this.useArtwork != z) {
            this.useArtwork = z;
            updateForCurrentTrackSelections(false);
        }
    }

    public void setUseController(boolean z) {
        boolean z2 = true;
        d6z.x((z && this.controller == null) ? false : true);
        if (!z && !hasOnClickListeners()) {
            z2 = false;
        }
        setClickable(z2);
        if (this.useController == z) {
            return;
        }
        this.useController = z;
        boolean useController = useController();
        PlayerControlView playerControlView = this.controller;
        if (useController) {
            playerControlView.setPlayer(this.player);
        } else if (playerControlView != null) {
            playerControlView.hide();
            this.controller.setPlayer(null);
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

    public void showController() {
        showController(shouldShowControllerIndefinitely());
    }

    private void showController(boolean z) {
    }

    public final class ComponentListener implements xxc0, View.OnLayoutChangeListener, View.OnClickListener, myc0, dyc0 {
        private Object lastPeriodUidWithTracks;
        private final y8z0 period = new y8z0();

        public ComponentListener() {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onAudioAttributesChanged(ue3 ue3Var) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(vxc0 vxc0Var) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            StyledPlayerViewLite.this.toggleControllerVisibility();
        }

        @Override // defpackage.xxc0
        public void onCues(rdf rdfVar) {
            if (StyledPlayerViewLite.this.subtitleView != null) {
                StyledPlayerViewLite.this.subtitleView.setCues(rdfVar.a);
            }
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onDeviceInfoChanged(xaj xajVar) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onEvents(zxc0 zxc0Var, wxc0 wxc0Var) {
        }

        @Override // defpackage.dyc0
        public void onFullScreenModeChanged(boolean z) {
            StyledPlayerViewLite.access$1800(StyledPlayerViewLite.this);
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z) {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            StyledPlayerViewLite.applyTextureViewRotation((TextureView) view, StyledPlayerViewLite.this.textureViewRotation);
        }

        @Override // defpackage.xxc0
        @Deprecated
        public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z) {
        }

        public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onMediaItemTransition(fe10 fe10Var, int i) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onMediaMetadataChanged(re10 re10Var) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onMetadata(w820 w820Var) {
        }

        @Override // defpackage.xxc0
        public void onPlayWhenReadyChanged(boolean z, int i) {
            StyledPlayerViewLite.this.updateBuffering();
            StyledPlayerViewLite.this.updateControllerVisibility();
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(lxc0 lxc0Var) {
        }

        @Override // defpackage.xxc0
        public void onPlaybackStateChanged(int i) {
            if (StyledPlayerViewLite.this.isHideShutterWhenPlayerReady && i == 3) {
                StyledPlayerViewLite.this.shutterHidingHandler.removeCallbacksAndMessages(null);
                StyledPlayerViewLite.this.setShutterVisibleImmediately(false);
            }
            StyledPlayerViewLite.this.updateBuffering();
            StyledPlayerViewLite.this.updateErrorMessage();
            StyledPlayerViewLite.this.updateControllerVisibility();
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onPlayerError(PlaybackException playbackException) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
        }

        @Override // defpackage.xxc0
        @Deprecated
        public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(re10 re10Var) {
        }

        @Override // defpackage.xxc0
        public void onPositionDiscontinuity(yxc0 yxc0Var, yxc0 yxc0Var2, int i) {
            if (StyledPlayerViewLite.this.isPlayingAd() && StyledPlayerViewLite.this.controllerHideDuringAds) {
                StyledPlayerViewLite.this.hideController();
            }
        }

        @Override // defpackage.xxc0
        public void onRenderedFirstFrame() {
            StyledPlayerViewLite.this.setShutterVisible(false);
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i) {
        }

        public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j) {
        }

        public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onTimelineChanged(a9z0 a9z0Var, int i) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(r001 r001Var) {
        }

        @Override // defpackage.xxc0
        public void onTracksChanged(r801 r801Var) {
            zxc0 zxc0Var = StyledPlayerViewLite.this.player;
            zxc0Var.getClass();
            a9z0 currentTimeline = zxc0Var.isCommandAvailable(17) ? zxc0Var.getCurrentTimeline() : a9z0.a;
            if (currentTimeline.q()) {
                this.lastPeriodUidWithTracks = null;
            } else if (!zxc0Var.isCommandAvailable(30) || zxc0Var.getCurrentTracks().b()) {
                Object obj = this.lastPeriodUidWithTracks;
                if (obj != null) {
                    int b = currentTimeline.b(obj);
                    if (b != -1) {
                        if (zxc0Var.getCurrentMediaItemIndex() == currentTimeline.f(b, this.period).c) {
                            return;
                        }
                    }
                    this.lastPeriodUidWithTracks = null;
                }
            } else {
                this.lastPeriodUidWithTracks = currentTimeline.g(zxc0Var.getCurrentPeriodIndex(), this.period, true).b;
            }
            StyledPlayerViewLite.this.updateForCurrentTrackSelections(false);
        }

        @Override // defpackage.xxc0
        public void onVideoSizeChanged(do31 do31Var) {
            StyledPlayerViewLite.this.updateAspectRatio();
        }

        @Override // defpackage.myc0
        public void onVisibilityChange(int i) {
            StyledPlayerViewLite.this.updateContentDescription();
            StyledPlayerViewLite.access$1700(StyledPlayerViewLite.this);
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onVolumeChanged(float f) {
        }

        @Override // defpackage.xxc0
        @Deprecated
        public /* bridge */ /* synthetic */ void onCues(List list) {
        }

        @Override // defpackage.xxc0
        @Deprecated
        public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i) {
        }
    }

    public void setControllerVisibilityListener(dzc0 dzc0Var) {
        if (dzc0Var != null) {
            setControllerVisibilityListener((myc0) null);
        }
    }

    public StyledPlayerViewLite(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StyledPlayerViewLite(Context context) {
        this(context, null);
    }
}
