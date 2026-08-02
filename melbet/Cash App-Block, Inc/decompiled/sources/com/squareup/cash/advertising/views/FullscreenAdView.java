package com.squareup.cash.advertising.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.camera.video.VideoCapture;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda10;
import androidx.core.view.WindowCompat$Api35Impl;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.extractor.DefaultExtractorsFactory;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.ui.Ui;
import app.cash.molecule.PlatformKt;
import coil3.RealImageLoader;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.google.mlkit.vision.common.zzb;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.ActivityTabViewKt$$ExternalSyntheticLambda17;
import com.squareup.cash.advertising.viewmodels.FullscreenAdEvent;
import com.squareup.cash.advertising.viewmodels.FullscreenAdViewModel;
import com.squareup.cash.advertising.viewmodels.FullscreenAdViewModel$Content$AssetViewModel$ImageAssetViewModel;
import com.squareup.cash.advertising.viewmodels.FullscreenAdViewModel$Content$AssetViewModel$VideoAssetViewModel;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.treehouse.ChildrenList$$ExternalSyntheticLambda0;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.components.MooncakeProgress;
import com.squareup.cash.mooncake.components.MooncakeToolbar;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.theming.ThemablesKt;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda6;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.InsetsCollector;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.YInt;
import com.squareup.contour.constraints.SizeConfigSmartLambdas$matchParent$1;
import com.squareup.protos.cash.ui.Color;
import com.squareup.scannerview.SizeMap;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import com.squareup.wire.ByteArrayProtoReader32;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.io.LinesSequence;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.FilteringSequence;
import kotlin.sequences.FilteringSequence$iterator$1;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import okhttp3.internal.http2.Huffman;
import retrofit2.DefaultMethodSupport;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class FullscreenAdView extends FrameLayout implements Ui {
    public List actionButtons;
    public final int contentPadding;
    public final ContourLayout contourLayout;
    public final FigmaTextView errorMessage;
    public Ui.EventReceiver eventReceiver;
    public final List excludedToggleViews;
    public final RealImageLoader imageLoader;
    public final ImageView imageView;
    public final MenuItem muteMenuItem;
    public final MooncakeProgress progress;
    public final MooncakePillButton retryButton;
    public final FigmaTextView subTitle;
    public final FigmaTextView title;
    public final MooncakeToolbar toolbar;
    public final MenuItem unmuteMenuItem;
    public final CashCardKt$$ExternalSyntheticLambda0 useLightIconsInLightMode;
    public final FullscreenAdView$videoAnalyticsListener$1 videoAnalyticsListener;
    public final ExoPlayerVideoView videoView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FullscreenAdView(Context context, RealImageLoader realImageLoader, CashCardKt$$ExternalSyntheticLambda0 cashCardKt$$ExternalSyntheticLambda0, Flow flow) {
        super(context);
        context.getClass();
        this.imageLoader = realImageLoader;
        this.useLightIconsInLightMode = cashCardKt$$ExternalSyntheticLambda0;
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        ExoPlayerVideoView exoPlayerVideoView = new ExoPlayerVideoView(context, flow);
        exoPlayerVideoView.setResizeMode(4);
        exoPlayerVideoView.setListener(new zzb(this));
        this.videoView = exoPlayerVideoView;
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.imageView = imageView;
        final ContourLayout contourLayout = new ContourLayout(context);
        this.contourLayout = contourLayout;
        final int i = 2;
        MooncakeToolbar mooncakeToolbar = new MooncakeToolbar(context, null, i, 0 == true ? 1 : 0);
        mooncakeToolbar.setBackground(null);
        mooncakeToolbar.setMinimumHeight(Views.dip(context, 64));
        MenuItemImpl menuItemImpl = (MenuItemImpl) mooncakeToolbar.getMenu().add(R.string.full_screen_ad_mute);
        menuItemImpl.setShowAsAction(2);
        this.muteMenuItem = menuItemImpl;
        MenuItemImpl menuItemImpl2 = (MenuItemImpl) mooncakeToolbar.getMenu().add(R.string.full_screen_ad_unmute);
        menuItemImpl2.setShowAsAction(2);
        this.unmuteMenuItem = menuItemImpl2;
        final int i2 = 0;
        menuItemImpl.mClickListener = new MenuItem.OnMenuItemClickListener(this) { // from class: com.squareup.cash.advertising.views.FullscreenAdView$$ExternalSyntheticLambda4
            public final /* synthetic */ FullscreenAdView f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                int i3 = i2;
                FullscreenAdView fullscreenAdView = this.f$0;
                switch (i3) {
                    case 0:
                        menuItem.getClass();
                        Ui.EventReceiver eventReceiver = fullscreenAdView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(new FullscreenAdEvent.VolumeChange(true));
                            return true;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    default:
                        menuItem.getClass();
                        Ui.EventReceiver eventReceiver2 = fullscreenAdView.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(new FullscreenAdEvent.VolumeChange(false));
                            return true;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                }
            }
        };
        final int i3 = 1;
        menuItemImpl2.mClickListener = new MenuItem.OnMenuItemClickListener(this) { // from class: com.squareup.cash.advertising.views.FullscreenAdView$$ExternalSyntheticLambda4
            public final /* synthetic */ FullscreenAdView f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                int i32 = i3;
                FullscreenAdView fullscreenAdView = this.f$0;
                switch (i32) {
                    case 0:
                        menuItem.getClass();
                        Ui.EventReceiver eventReceiver = fullscreenAdView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(new FullscreenAdEvent.VolumeChange(true));
                            return true;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    default:
                        menuItem.getClass();
                        Ui.EventReceiver eventReceiver2 = fullscreenAdView.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(new FullscreenAdEvent.VolumeChange(false));
                            return true;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                }
            }
        };
        mooncakeToolbar.setNavigationIcon(PlatformKt.getDrawableCompat(context, R.drawable.icon_close, null), null);
        menuItemImpl.setIcon(PlatformKt.getDrawableCompat(context, R.drawable.icon_sound_on, null));
        menuItemImpl.setVisible(false);
        menuItemImpl.setEnabled(false);
        menuItemImpl2.setIcon(PlatformKt.getDrawableCompat(context, R.drawable.icon_sound_off, null));
        menuItemImpl2.setVisible(false);
        menuItemImpl2.setEnabled(false);
        mooncakeToolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.advertising.views.FullscreenAdView$$ExternalSyntheticLambda11
            public final /* synthetic */ FullscreenAdView f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i2;
                FullscreenAdView fullscreenAdView = this.f$0;
                switch (i4) {
                    case 0:
                        Ui.EventReceiver eventReceiver = fullscreenAdView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(FullscreenAdEvent.Close.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    default:
                        Ui.EventReceiver eventReceiver2 = fullscreenAdView.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(FullscreenAdEvent.Retry.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                }
            }
        });
        this.toolbar = mooncakeToolbar;
        FigmaTextView figmaTextView = new FigmaTextView(context, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        Strings.applyStyle(figmaTextView, TextStyles.header1);
        figmaTextView.setTextColor(colorPalette.label);
        figmaTextView.setMaxLines(3);
        figmaTextView.setEllipsize(TextUtils.TruncateAt.END);
        figmaTextView.setGravity(17);
        this.title = figmaTextView;
        FigmaTextView figmaTextView2 = new FigmaTextView(context, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        Strings.applyStyle(figmaTextView2, TextStyles.mainBody);
        figmaTextView2.setTextColor(colorPalette.secondaryLabel);
        figmaTextView2.setGravity(17);
        this.subTitle = figmaTextView2;
        FigmaTextView figmaTextView3 = new FigmaTextView(context, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        Strings.applyStyle(figmaTextView3, TextStyles.mainTitle);
        int i4 = colorPalette.label;
        figmaTextView3.setTextColor(i4);
        figmaTextView3.setGravity(17);
        figmaTextView3.setCompoundDrawablePadding(Views.dip(context, 12));
        figmaTextView3.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, PlatformKt.getDrawableCompat(context, R.drawable.mooncake_alert_bg_circle, Integer.valueOf(i4)), (Drawable) null, (Drawable) null);
        figmaTextView3.setText(R.string.full_screen_ad_error);
        this.errorMessage = figmaTextView3;
        AttributeSet attributeSet = null;
        final int i5 = 1;
        MooncakePillButton mooncakePillButton = new MooncakePillButton(context, attributeSet, MooncakePillButton.Size.LARGE, MooncakePillButton.Style.SECONDARY, 2, null);
        mooncakePillButton.setText(R.string.full_screen_ad_try_again);
        mooncakePillButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.advertising.views.FullscreenAdView$$ExternalSyntheticLambda11
            public final /* synthetic */ FullscreenAdView f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i5;
                FullscreenAdView fullscreenAdView = this.f$0;
                switch (i42) {
                    case 0:
                        Ui.EventReceiver eventReceiver = fullscreenAdView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(FullscreenAdEvent.Close.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    default:
                        Ui.EventReceiver eventReceiver2 = fullscreenAdView.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(FullscreenAdEvent.Retry.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                }
            }
        });
        this.retryButton = mooncakePillButton;
        MooncakeProgress mooncakeProgress = new MooncakeProgress(context, attributeSet, false, 6, null);
        mooncakeProgress.setVisibility(8);
        this.progress = mooncakeProgress;
        int dip = Views.dip(context, 24);
        this.contentPadding = dip;
        this.excludedToggleViews = CollectionsKt__CollectionsKt.listOf((Object[]) new ViewGroup[]{mooncakeProgress, mooncakeToolbar});
        this.actionButtons = EmptyList.INSTANCE;
        this.videoAnalyticsListener = new FullscreenAdView$videoAnalyticsListener$1(this);
        WindowInsets windowInsets = InsetsCollector.CONSUMED;
        WindowCompat$Api35Impl.attachedTo(contourLayout).setInsetsDispatcher(new VideoCapture.AnonymousClass3((View) contourLayout, true, (AlertBannerKt$$ExternalSyntheticLambda3) null));
        setBackgroundColor(colorPalette.background);
        addView(exoPlayerVideoView, new FrameLayout.LayoutParams(-1, -1));
        addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        addView(contourLayout, new FrameLayout.LayoutParams(-1, -1));
        contourLayout.contourWidthMatchParent();
        Huffman.Node node = contourLayout.heightConfig;
        node.getClass();
        node.children = SizeConfigSmartLambdas$matchParent$1.INSTANCE;
        ContourLayout.layoutBy$default(contourLayout, mooncakeToolbar, ContourLayout.matchParentX(0, 0), ContourLayout.topTo(new ActivityTabViewKt$$ExternalSyntheticLambda17(10)));
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new FullscreenAdView$$ExternalSyntheticLambda14(this, i2));
        leftTo.rightTo(1, new FullscreenAdView$$ExternalSyntheticLambda14(this, i5));
        ContourLayout.layoutBy$default(contourLayout, figmaTextView, leftTo, ContourLayout.topTo(new Function1() { // from class: com.squareup.cash.advertising.views.FullscreenAdView$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i6 = i5;
                FullscreenAdView fullscreenAdView = this;
                ContourLayout contourLayout2 = contourLayout;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i6) {
                    case 0:
                        layoutSpec.getClass();
                        return new YInt(contourLayout2.getDip(8) + contourLayout2.m3810bottomdBGyhoQ(fullscreenAdView.title));
                    case 1:
                        layoutSpec.getClass();
                        return new YInt(contourLayout2.getDip(48) + contourLayout2.m3810bottomdBGyhoQ(fullscreenAdView.toolbar));
                    default:
                        return new YInt(contourLayout2.m3815heightdBGyhoQ(fullscreenAdView.toolbar) + (SVG$Unit$EnumUnboxingLocalUtility.m$2(layoutSpec) - contourLayout2.m3815heightdBGyhoQ(fullscreenAdView.retryButton)));
                }
            }
        }));
        ByteArrayProtoReader32 leftTo2 = ContourLayout.leftTo(new FullscreenAdView$$ExternalSyntheticLambda14(this, i));
        leftTo2.rightTo(1, new FullscreenAdView$$ExternalSyntheticLambda14(this, 3));
        final int i6 = 0;
        ContourLayout.layoutBy$default(contourLayout, figmaTextView2, leftTo2, ContourLayout.topTo(new Function1() { // from class: com.squareup.cash.advertising.views.FullscreenAdView$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i62 = i6;
                FullscreenAdView fullscreenAdView = this;
                ContourLayout contourLayout2 = contourLayout;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i62) {
                    case 0:
                        layoutSpec.getClass();
                        return new YInt(contourLayout2.getDip(8) + contourLayout2.m3810bottomdBGyhoQ(fullscreenAdView.title));
                    case 1:
                        layoutSpec.getClass();
                        return new YInt(contourLayout2.getDip(48) + contourLayout2.m3810bottomdBGyhoQ(fullscreenAdView.toolbar));
                    default:
                        return new YInt(contourLayout2.m3815heightdBGyhoQ(fullscreenAdView.toolbar) + (SVG$Unit$EnumUnboxingLocalUtility.m$2(layoutSpec) - contourLayout2.m3815heightdBGyhoQ(fullscreenAdView.retryButton)));
                }
            }
        }));
        ContourLayout.layoutBy$default(contourLayout, mooncakeProgress, ContourLayout.centerHorizontallyTo(new ActivityTabViewKt$$ExternalSyntheticLambda17(11)), ContourLayout.centerVerticallyTo(new ActivityTabViewKt$$ExternalSyntheticLambda17(12)));
        ContourLayout.layoutBy$default(contourLayout, figmaTextView3, ContourLayout.matchParentX(dip, dip), ContourLayout.centerVerticallyTo(new Function1() { // from class: com.squareup.cash.advertising.views.FullscreenAdView$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i62 = i;
                FullscreenAdView fullscreenAdView = this;
                ContourLayout contourLayout2 = contourLayout;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i62) {
                    case 0:
                        layoutSpec.getClass();
                        return new YInt(contourLayout2.getDip(8) + contourLayout2.m3810bottomdBGyhoQ(fullscreenAdView.title));
                    case 1:
                        layoutSpec.getClass();
                        return new YInt(contourLayout2.getDip(48) + contourLayout2.m3810bottomdBGyhoQ(fullscreenAdView.toolbar));
                    default:
                        return new YInt(contourLayout2.m3815heightdBGyhoQ(fullscreenAdView.toolbar) + (SVG$Unit$EnumUnboxingLocalUtility.m$2(layoutSpec) - contourLayout2.m3815heightdBGyhoQ(fullscreenAdView.retryButton)));
                }
            }
        }));
        ContourLayout.layoutBy$default(contourLayout, mooncakePillButton, ContourLayout.matchParentX(dip, dip), ContourLayout.bottomTo(new ChildrenList$$ExternalSyntheticLambda0(contourLayout, i5)));
    }

    public static void loadFallbackImage$default(FullscreenAdView fullscreenAdView, String str) {
        ImageView imageView = fullscreenAdView.imageView;
        ExoPlayerVideoView exoPlayerVideoView = fullscreenAdView.videoView;
        exoPlayerVideoView.setVisibility(8);
        FullscreenAdView$videoAnalyticsListener$1 fullscreenAdView$videoAnalyticsListener$1 = fullscreenAdView.videoAnalyticsListener;
        fullscreenAdView$videoAnalyticsListener$1.getClass();
        exoPlayerVideoView.analyticsListeners.remove(fullscreenAdView$videoAnalyticsListener$1);
        ExoPlayer exoPlayer = exoPlayerVideoView.player;
        if (exoPlayer != null) {
            ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) exoPlayer;
            exoPlayerImpl.verifyApplicationThread();
            exoPlayerImpl.analyticsCollector.listeners.remove(fullscreenAdView$videoAnalyticsListener$1);
        }
        if (str == null || StringsKt.isBlank(str)) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        RealImageLoader realImageLoader = fullscreenAdView.imageLoader;
        Context context = fullscreenAdView.getContext();
        context.getClass();
        ImageRequest.Builder builder = new ImageRequest.Builder(context);
        builder.data = str;
        ImageRequests_androidKt.target(builder, imageView);
        builder.listener = new SizeMap(fullscreenAdView, 13);
        realImageLoader.enqueue(builder.build());
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(FullscreenAdViewModel fullscreenAdViewModel) {
        ContourLayout contourLayout;
        fullscreenAdViewModel.getClass();
        boolean z = fullscreenAdViewModel instanceof FullscreenAdViewModel.Loading;
        int i = 0;
        MooncakeProgress mooncakeProgress = this.progress;
        if (z) {
            mooncakeProgress.setVisibility(0);
            toggleViews(false);
            loadFallbackImage$default(this, ((FullscreenAdViewModel.Loading) fullscreenAdViewModel).fallbackImageUrl);
            return;
        }
        boolean z2 = fullscreenAdViewModel instanceof FullscreenAdViewModel.Error;
        MooncakePillButton mooncakePillButton = this.retryButton;
        FigmaTextView figmaTextView = this.errorMessage;
        if (z2) {
            mooncakeProgress.setVisibility(8);
            toggleViews(false);
            figmaTextView.setVisibility(0);
            mooncakePillButton.setVisibility(0);
            return;
        }
        if (!(fullscreenAdViewModel instanceof FullscreenAdViewModel.Content)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        FullscreenAdViewModel.Content content = (FullscreenAdViewModel.Content) fullscreenAdViewModel;
        int i2 = 1;
        toggleViews(true);
        figmaTextView.setVisibility(8);
        mooncakePillButton.setVisibility(8);
        ArrayList arrayList = content.actions;
        this.title.setText((CharSequence) null);
        this.subTitle.setText((CharSequence) null);
        FullscreenAdViewModel.Content.AudioStatus audioStatus = content.audioStatus;
        boolean z3 = audioStatus.showAudioControls;
        ExoPlayerVideoView exoPlayerVideoView = this.videoView;
        MenuItem menuItem = this.unmuteMenuItem;
        MenuItem menuItem2 = this.muteMenuItem;
        if (!z3) {
            menuItem.setVisible(false);
            menuItem.setEnabled(false);
            menuItem2.setVisible(false);
            menuItem2.setEnabled(false);
        } else if (audioStatus.muted) {
            menuItem.setVisible(true);
            menuItem.setEnabled(true);
            menuItem2.setVisible(false);
            menuItem2.setEnabled(false);
            exoPlayerVideoView.isMuted = true;
            ExoPlayer exoPlayer = exoPlayerVideoView.player;
            if (exoPlayer != null) {
                ((ExoPlayerImpl) exoPlayer).setVolume(RecyclerView.DECELERATION_RATE);
            }
        } else {
            menuItem.setVisible(false);
            menuItem.setEnabled(false);
            menuItem2.setVisible(true);
            menuItem2.setEnabled(true);
            exoPlayerVideoView.isMuted = false;
            ExoPlayer exoPlayer2 = exoPlayerVideoView.player;
            if (exoPlayer2 != null) {
                ((ExoPlayerImpl) exoPlayer2).setVolume(1.0f);
            }
        }
        DefaultMethodSupport defaultMethodSupport = content.asset;
        boolean z4 = defaultMethodSupport instanceof FullscreenAdViewModel$Content$AssetViewModel$VideoAssetViewModel;
        FullscreenAdView$videoAnalyticsListener$1 fullscreenAdView$videoAnalyticsListener$1 = this.videoAnalyticsListener;
        ImageView imageView = this.imageView;
        if (z4) {
            FullscreenAdViewModel$Content$AssetViewModel$VideoAssetViewModel fullscreenAdViewModel$Content$AssetViewModel$VideoAssetViewModel = (FullscreenAdViewModel$Content$AssetViewModel$VideoAssetViewModel) defaultMethodSupport;
            String str = fullscreenAdViewModel$Content$AssetViewModel$VideoAssetViewModel.contentDescription;
            exoPlayerVideoView.setContentDescription(str);
            imageView.setContentDescription(str);
            if (!exoPlayerVideoView.hasPreparedMedia) {
                Timber.Forest.d("Begin media playback", new Object[0]);
                ProgressiveMediaSource createMediaSource = new ProgressiveMediaSource.Factory(new MaterialButton$$ExternalSyntheticLambda3(this, 14), new DefaultExtractorsFactory()).createMediaSource(MediaItem.fromUri(fullscreenAdViewModel$Content$AssetViewModel$VideoAssetViewModel.videoAsset));
                boolean z5 = fullscreenAdViewModel$Content$AssetViewModel$VideoAssetViewModel.loopPlayback;
                exoPlayerVideoView.mediaSource = createMediaSource;
                ExoPlayer exoPlayer3 = exoPlayerVideoView.player;
                if (exoPlayer3 != null) {
                    ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) exoPlayer3;
                    exoPlayerImpl.verifyApplicationThread();
                    List singletonList = Collections.singletonList(createMediaSource);
                    exoPlayerImpl.verifyApplicationThread();
                    exoPlayerImpl.setMediaSources(singletonList);
                }
                ExoPlayer exoPlayer4 = exoPlayerVideoView.player;
                if (exoPlayer4 != null) {
                    ((ExoPlayerImpl) exoPlayer4).prepare();
                }
                exoPlayerVideoView.hasPreparedMedia = true;
                int i3 = z5 ? 2 : 0;
                exoPlayerVideoView.repeatMode = i3;
                ExoPlayer exoPlayer5 = exoPlayerVideoView.player;
                if (exoPlayer5 != null) {
                    ((ExoPlayerImpl) exoPlayer5).setRepeatMode(i3);
                }
                fullscreenAdView$videoAnalyticsListener$1.getClass();
                exoPlayerVideoView.analyticsListeners.add(fullscreenAdView$videoAnalyticsListener$1);
                ExoPlayer exoPlayer6 = exoPlayerVideoView.player;
                if (exoPlayer6 != null) {
                    DefaultAnalyticsCollector defaultAnalyticsCollector = ((ExoPlayerImpl) exoPlayer6).analyticsCollector;
                    defaultAnalyticsCollector.getClass();
                    defaultAnalyticsCollector.listeners.add(fullscreenAdView$videoAnalyticsListener$1);
                }
            }
            fullscreenAdView$videoAnalyticsListener$1.fallbackImageUrl = fullscreenAdViewModel$Content$AssetViewModel$VideoAssetViewModel.fallbackImageUrl;
        } else if (defaultMethodSupport instanceof FullscreenAdViewModel$Content$AssetViewModel$ImageAssetViewModel) {
            mooncakeProgress.setVisibility(8);
            FullscreenAdViewModel$Content$AssetViewModel$ImageAssetViewModel fullscreenAdViewModel$Content$AssetViewModel$ImageAssetViewModel = (FullscreenAdViewModel$Content$AssetViewModel$ImageAssetViewModel) defaultMethodSupport;
            imageView.setContentDescription(fullscreenAdViewModel$Content$AssetViewModel$ImageAssetViewModel.contentDescription);
            loadFallbackImage$default(this, fullscreenAdViewModel$Content$AssetViewModel$ImageAssetViewModel.fallbackImageUrl);
        } else {
            mooncakeProgress.setVisibility(8);
            exoPlayerVideoView.setVisibility(8);
            imageView.setVisibility(8);
            updateWindowFlags(true);
            fullscreenAdView$videoAnalyticsListener$1.getClass();
            exoPlayerVideoView.analyticsListeners.remove(fullscreenAdView$videoAnalyticsListener$1);
            ExoPlayer exoPlayer7 = exoPlayerVideoView.player;
            if (exoPlayer7 != null) {
                ExoPlayerImpl exoPlayerImpl2 = (ExoPlayerImpl) exoPlayer7;
                exoPlayerImpl2.verifyApplicationThread();
                exoPlayerImpl2.analyticsCollector.listeners.remove(fullscreenAdView$videoAnalyticsListener$1);
            }
        }
        Iterator it = this.actionButtons.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            contourLayout = this.contourLayout;
            if (!hasNext) {
                break;
            } else {
                contourLayout.removeView((MooncakePillButton) it.next());
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        int i4 = 0;
        for (Object obj : arrayList) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            FullscreenAdViewModel.Content.ActionViewModel actionViewModel = (FullscreenAdViewModel.Content.ActionViewModel) obj;
            MooncakePillButton.Style style = i4 == 0 ? MooncakePillButton.Style.PRIMARY : MooncakePillButton.Style.SECONDARY;
            Context context = getContext();
            context.getClass();
            MooncakePillButton mooncakePillButton2 = new MooncakePillButton(context, null, MooncakePillButton.Size.LARGE, style, 2, null);
            mooncakePillButton2.setText(actionViewModel.text);
            Color color = actionViewModel.textColor;
            Color color2 = actionViewModel.buttonColor;
            if (color != null && color2 != null) {
                Integer forTheme = ThemablesKt.forTheme(color, ThemeHelpersKt.themeInfo(mooncakePillButton2));
                forTheme.getClass();
                int intValue = forTheme.intValue();
                Integer forTheme2 = ThemablesKt.forTheme(color2, ThemeHelpersKt.themeInfo(mooncakePillButton2));
                forTheme2.getClass();
                MooncakePillButton.setColors$default(mooncakePillButton2, intValue, forTheme2.intValue(), null, 4, null);
            }
            mooncakePillButton2.setOnClickListener(new BottomSheet$$ExternalSyntheticLambda0(7, this, actionViewModel));
            arrayList2.add(mooncakePillButton2);
            i4 = i5;
        }
        this.actionButtons = arrayList2;
        int dimensionPixelSize = contourLayout.getResources().getDimensionPixelSize(R.dimen.blockers_padding);
        for (Object obj2 : this.actionButtons) {
            int i6 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            ContourLayout.layoutBy$default(contourLayout, (MooncakePillButton) obj2, ContourLayout.matchParentX(contourLayout.getDip(24), contourLayout.getDip(24)), i < arrayList.size() - 1 ? ContourLayout.bottomTo(new PoolGoalMetKt$$ExternalSyntheticLambda6(contourLayout, this, i, 5)) : ContourLayout.bottomTo(new DatePickerKt$$ExternalSyntheticLambda10(dimensionPixelSize, i2)));
            i = i6;
        }
    }

    public final void toggleViews(boolean z) {
        this.videoView.setVisibility(z ? 0 : 8);
        this.imageView.setVisibility(z ? 0 : 8);
        ContourLayout contourLayout = this.contourLayout;
        contourLayout.getClass();
        FilteringSequence$iterator$1 filteringSequence$iterator$1 = new FilteringSequence$iterator$1(new FilteringSequence(new LinesSequence(contourLayout, 3), false, new FullscreenAdView$$ExternalSyntheticLambda14(this, 4)));
        while (filteringSequence$iterator$1.hasNext()) {
            ((View) filteringSequence$iterator$1.next()).setVisibility(z ? 0 : 8);
        }
    }

    public final void updateWindowFlags(boolean z) {
        this.useLightIconsInLightMode.invoke(Boolean.valueOf(!z));
    }
}
