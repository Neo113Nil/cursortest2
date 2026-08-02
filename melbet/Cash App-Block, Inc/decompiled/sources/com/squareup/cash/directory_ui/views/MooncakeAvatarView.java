package com.squareup.cash.directory_ui.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda0;
import app.cash.broadway.ui.Ui;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import app.cash.molecule.PlatformKt;
import coil3.RealImageLoader;
import com.squareup.cash.R;
import com.squareup.cash.common.viewmodels.AvatarViewModel;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda14;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda2;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.Theme;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.theming.RipplesKt;
import com.squareup.cash.ui.widget.BadgedLayout;
import com.squareup.cash.ui.widget.StackedAvatarViewKt;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.contour.constraints.SizeConfigSmartLambdas$wrapContent$1;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import com.squareup.wire.ByteArrayProtoReader32;
import com.squareup.wire.GrpcStatus;
import com.stripe.android.financialconnections.utils.ErrorsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http2.Huffman;

/* loaded from: classes6.dex */
public final class MooncakeAvatarView extends ContourLayout {
    public final Lazy avatar$delegate;
    public final Lazy avatarView$delegate;
    public final Lazy badge$delegate;
    public final BadgedLayout badgeLayout;
    public final RealImageLoader imageLoader;
    public final FigmaTextView name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MooncakeAvatarView(Context context, RealImageLoader realImageLoader, int i) {
        super(context);
        context.getClass();
        realImageLoader.getClass();
        this.imageLoader = realImageLoader;
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new CameraX$$ExternalSyntheticLambda0(context, 8));
        this.avatarView$delegate = lazy;
        final int i2 = 0;
        this.badge$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: com.squareup.cash.directory_ui.views.MooncakeAvatarView$$ExternalSyntheticLambda8
            public final /* synthetic */ MooncakeAvatarView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                MooncakeAvatarView mooncakeAvatarView = this.f$0;
                switch (i3) {
                    case 0:
                        ImageView imageView = (ImageView) ((View) mooncakeAvatarView.avatarView$delegate.getValue()).findViewById(R.id.badge);
                        imageView.getClass();
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(Views.px(imageView, 32), Views.px(imageView, 32)));
                        return imageView;
                    default:
                        ImageView imageView2 = (ImageView) ((View) mooncakeAvatarView.avatarView$delegate.getValue()).findViewById(R.id.avatar);
                        imageView2.getClass();
                        imageView2.setLayoutParams(new FrameLayout.LayoutParams(Views.px(imageView2, 64), Views.px(imageView2, 64)));
                        return imageView2;
                }
            }
        });
        final int i3 = 1;
        this.avatar$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: com.squareup.cash.directory_ui.views.MooncakeAvatarView$$ExternalSyntheticLambda8
            public final /* synthetic */ MooncakeAvatarView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                MooncakeAvatarView mooncakeAvatarView = this.f$0;
                switch (i32) {
                    case 0:
                        ImageView imageView = (ImageView) ((View) mooncakeAvatarView.avatarView$delegate.getValue()).findViewById(R.id.badge);
                        imageView.getClass();
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(Views.px(imageView, 32), Views.px(imageView, 32)));
                        return imageView;
                    default:
                        ImageView imageView2 = (ImageView) ((View) mooncakeAvatarView.avatarView$delegate.getValue()).findViewById(R.id.avatar);
                        imageView2.getClass();
                        imageView2.setLayoutParams(new FrameLayout.LayoutParams(Views.px(imageView2, 64), Views.px(imageView2, 64)));
                        return imageView2;
                }
            }
        });
        final int i4 = 2;
        FigmaTextView figmaTextView = new FigmaTextView(context, null, 2, null);
        Strings.applyStyle(figmaTextView, TextStyles.caption);
        figmaTextView.setTextColor(colorPalette.secondaryLabel);
        figmaTextView.setGravity(1);
        figmaTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.name = figmaTextView;
        BadgedLayout badgedLayout = new BadgedLayout(context, realImageLoader);
        badgedLayout.setBackground(RipplesKt.createBorderlessRippleDrawable(badgedLayout));
        badgedLayout.setBadge(new BadgedLayout.BadgeShape.Circular(getDip(32)));
        final int i5 = 4;
        badgedLayout.setBaselineDrop(getDip(4));
        badgedLayout.addView((View) lazy.getValue());
        this.badgeLayout = badgedLayout;
        if (i == 0) {
            Huffman.Node node = this.widthConfig;
            SizeConfigSmartLambdas$wrapContent$1 sizeConfigSmartLambdas$wrapContent$1 = new SizeConfigSmartLambdas$wrapContent$1(this, i4, i2);
            node.getClass();
            node.children = sizeConfigSmartLambdas$wrapContent$1;
            contourHeightWrapContent();
            ContourLayout.layoutBy$default(this, badgedLayout, ContourLayout.leftTo(new ComposeDialogKt$$ExternalSyntheticLambda14(17)), ContourLayout.topTo(new ComposeDialogKt$$ExternalSyntheticLambda14(18)));
            ByteArrayProtoReader32 centerHorizontallyTo = ContourLayout.centerHorizontallyTo(new Function1(this) { // from class: com.squareup.cash.directory_ui.views.MooncakeAvatarView$$ExternalSyntheticLambda5
                public final /* synthetic */ MooncakeAvatarView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i6 = i2;
                    MooncakeAvatarView mooncakeAvatarView = this.f$0;
                    ((ContourLayout.LayoutSpec) obj).getClass();
                    switch (i6) {
                        case 0:
                            return new XInt(mooncakeAvatarView.m3811centerXTENr5nQ(mooncakeAvatarView.badgeLayout));
                        case 1:
                            return new XInt(mooncakeAvatarView.m3813getXdipTENr5nQ(8) + ((int) (((Huffman.Node) r5.getParent().appLaunchedCallback).resolve() * 0.9f)));
                        case 2:
                            int resolve = (int) (((Huffman.Node) r5.getParent().appLaunchedCallback).resolve() * 0.9f);
                            ((ImageView) mooncakeAvatarView.avatar$delegate.getValue()).setLayoutParams(new FrameLayout.LayoutParams(resolve, resolve));
                            return new YInt(mooncakeAvatarView.m3814getYdipdBGyhoQ(8) + resolve);
                        case 3:
                            return new YInt(mooncakeAvatarView.m3814getYdipdBGyhoQ(4) + mooncakeAvatarView.m3810bottomdBGyhoQ(mooncakeAvatarView.badgeLayout));
                        case 4:
                            return new XInt(mooncakeAvatarView.m3820widthTENr5nQ(mooncakeAvatarView.badgeLayout));
                        default:
                            return new YInt(mooncakeAvatarView.m3814getYdipdBGyhoQ(4) + mooncakeAvatarView.m3810bottomdBGyhoQ(mooncakeAvatarView.badgeLayout));
                    }
                }
            });
            centerHorizontallyTo.widthOf(2, new Function1(this) { // from class: com.squareup.cash.directory_ui.views.MooncakeAvatarView$$ExternalSyntheticLambda5
                public final /* synthetic */ MooncakeAvatarView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i6 = i5;
                    MooncakeAvatarView mooncakeAvatarView = this.f$0;
                    ((ContourLayout.LayoutSpec) obj).getClass();
                    switch (i6) {
                        case 0:
                            return new XInt(mooncakeAvatarView.m3811centerXTENr5nQ(mooncakeAvatarView.badgeLayout));
                        case 1:
                            return new XInt(mooncakeAvatarView.m3813getXdipTENr5nQ(8) + ((int) (((Huffman.Node) r5.getParent().appLaunchedCallback).resolve() * 0.9f)));
                        case 2:
                            int resolve = (int) (((Huffman.Node) r5.getParent().appLaunchedCallback).resolve() * 0.9f);
                            ((ImageView) mooncakeAvatarView.avatar$delegate.getValue()).setLayoutParams(new FrameLayout.LayoutParams(resolve, resolve));
                            return new YInt(mooncakeAvatarView.m3814getYdipdBGyhoQ(8) + resolve);
                        case 3:
                            return new YInt(mooncakeAvatarView.m3814getYdipdBGyhoQ(4) + mooncakeAvatarView.m3810bottomdBGyhoQ(mooncakeAvatarView.badgeLayout));
                        case 4:
                            return new XInt(mooncakeAvatarView.m3820widthTENr5nQ(mooncakeAvatarView.badgeLayout));
                        default:
                            return new YInt(mooncakeAvatarView.m3814getYdipdBGyhoQ(4) + mooncakeAvatarView.m3810bottomdBGyhoQ(mooncakeAvatarView.badgeLayout));
                    }
                }
            });
            final int i6 = 5;
            ContourLayout.layoutBy$default(this, figmaTextView, centerHorizontallyTo, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.directory_ui.views.MooncakeAvatarView$$ExternalSyntheticLambda5
                public final /* synthetic */ MooncakeAvatarView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i62 = i6;
                    MooncakeAvatarView mooncakeAvatarView = this.f$0;
                    ((ContourLayout.LayoutSpec) obj).getClass();
                    switch (i62) {
                        case 0:
                            return new XInt(mooncakeAvatarView.m3811centerXTENr5nQ(mooncakeAvatarView.badgeLayout));
                        case 1:
                            return new XInt(mooncakeAvatarView.m3813getXdipTENr5nQ(8) + ((int) (((Huffman.Node) r5.getParent().appLaunchedCallback).resolve() * 0.9f)));
                        case 2:
                            int resolve = (int) (((Huffman.Node) r5.getParent().appLaunchedCallback).resolve() * 0.9f);
                            ((ImageView) mooncakeAvatarView.avatar$delegate.getValue()).setLayoutParams(new FrameLayout.LayoutParams(resolve, resolve));
                            return new YInt(mooncakeAvatarView.m3814getYdipdBGyhoQ(8) + resolve);
                        case 3:
                            return new YInt(mooncakeAvatarView.m3814getYdipdBGyhoQ(4) + mooncakeAvatarView.m3810bottomdBGyhoQ(mooncakeAvatarView.badgeLayout));
                        case 4:
                            return new XInt(mooncakeAvatarView.m3820widthTENr5nQ(mooncakeAvatarView.badgeLayout));
                        default:
                            return new YInt(mooncakeAvatarView.m3814getYdipdBGyhoQ(4) + mooncakeAvatarView.m3810bottomdBGyhoQ(mooncakeAvatarView.badgeLayout));
                    }
                }
            }));
            figmaTextView.setSingleLine(true);
            figmaTextView.setMaxLines(1);
            return;
        }
        if (i != 1) {
            return;
        }
        contourWidthMatchParent();
        contourHeightWrapContent();
        ByteArrayProtoReader32 centerHorizontallyTo2 = ContourLayout.centerHorizontallyTo(new ComposeDialogKt$$ExternalSyntheticLambda14(13));
        centerHorizontallyTo2.widthOf(1, new Function1(this) { // from class: com.squareup.cash.directory_ui.views.MooncakeAvatarView$$ExternalSyntheticLambda5
            public final /* synthetic */ MooncakeAvatarView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i62 = i3;
                MooncakeAvatarView mooncakeAvatarView = this.f$0;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i62) {
                    case 0:
                        return new XInt(mooncakeAvatarView.m3811centerXTENr5nQ(mooncakeAvatarView.badgeLayout));
                    case 1:
                        return new XInt(mooncakeAvatarView.m3813getXdipTENr5nQ(8) + ((int) (((Huffman.Node) r5.getParent().appLaunchedCallback).resolve() * 0.9f)));
                    case 2:
                        int resolve = (int) (((Huffman.Node) r5.getParent().appLaunchedCallback).resolve() * 0.9f);
                        ((ImageView) mooncakeAvatarView.avatar$delegate.getValue()).setLayoutParams(new FrameLayout.LayoutParams(resolve, resolve));
                        return new YInt(mooncakeAvatarView.m3814getYdipdBGyhoQ(8) + resolve);
                    case 3:
                        return new YInt(mooncakeAvatarView.m3814getYdipdBGyhoQ(4) + mooncakeAvatarView.m3810bottomdBGyhoQ(mooncakeAvatarView.badgeLayout));
                    case 4:
                        return new XInt(mooncakeAvatarView.m3820widthTENr5nQ(mooncakeAvatarView.badgeLayout));
                    default:
                        return new YInt(mooncakeAvatarView.m3814getYdipdBGyhoQ(4) + mooncakeAvatarView.m3810bottomdBGyhoQ(mooncakeAvatarView.badgeLayout));
                }
            }
        });
        ByteArrayProtoReader32 byteArrayProtoReader32 = ContourLayout.topTo(new ComposeDialogKt$$ExternalSyntheticLambda14(14));
        byteArrayProtoReader32.heightOf(1, new Function1(this) { // from class: com.squareup.cash.directory_ui.views.MooncakeAvatarView$$ExternalSyntheticLambda5
            public final /* synthetic */ MooncakeAvatarView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i62 = i4;
                MooncakeAvatarView mooncakeAvatarView = this.f$0;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i62) {
                    case 0:
                        return new XInt(mooncakeAvatarView.m3811centerXTENr5nQ(mooncakeAvatarView.badgeLayout));
                    case 1:
                        return new XInt(mooncakeAvatarView.m3813getXdipTENr5nQ(8) + ((int) (((Huffman.Node) r5.getParent().appLaunchedCallback).resolve() * 0.9f)));
                    case 2:
                        int resolve = (int) (((Huffman.Node) r5.getParent().appLaunchedCallback).resolve() * 0.9f);
                        ((ImageView) mooncakeAvatarView.avatar$delegate.getValue()).setLayoutParams(new FrameLayout.LayoutParams(resolve, resolve));
                        return new YInt(mooncakeAvatarView.m3814getYdipdBGyhoQ(8) + resolve);
                    case 3:
                        return new YInt(mooncakeAvatarView.m3814getYdipdBGyhoQ(4) + mooncakeAvatarView.m3810bottomdBGyhoQ(mooncakeAvatarView.badgeLayout));
                    case 4:
                        return new XInt(mooncakeAvatarView.m3820widthTENr5nQ(mooncakeAvatarView.badgeLayout));
                    default:
                        return new YInt(mooncakeAvatarView.m3814getYdipdBGyhoQ(4) + mooncakeAvatarView.m3810bottomdBGyhoQ(mooncakeAvatarView.badgeLayout));
                }
            }
        });
        ContourLayout.layoutBy$default(this, badgedLayout, centerHorizontallyTo2, byteArrayProtoReader32);
        ByteArrayProtoReader32 centerHorizontallyTo3 = ContourLayout.centerHorizontallyTo(new ComposeDialogKt$$ExternalSyntheticLambda14(15));
        centerHorizontallyTo3.widthOf(2, new ComposeDialogKt$$ExternalSyntheticLambda14(16));
        final int i7 = 3;
        ContourLayout.layoutBy$default(this, figmaTextView, centerHorizontallyTo3, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.directory_ui.views.MooncakeAvatarView$$ExternalSyntheticLambda5
            public final /* synthetic */ MooncakeAvatarView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i62 = i7;
                MooncakeAvatarView mooncakeAvatarView = this.f$0;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i62) {
                    case 0:
                        return new XInt(mooncakeAvatarView.m3811centerXTENr5nQ(mooncakeAvatarView.badgeLayout));
                    case 1:
                        return new XInt(mooncakeAvatarView.m3813getXdipTENr5nQ(8) + ((int) (((Huffman.Node) r5.getParent().appLaunchedCallback).resolve() * 0.9f)));
                    case 2:
                        int resolve = (int) (((Huffman.Node) r5.getParent().appLaunchedCallback).resolve() * 0.9f);
                        ((ImageView) mooncakeAvatarView.avatar$delegate.getValue()).setLayoutParams(new FrameLayout.LayoutParams(resolve, resolve));
                        return new YInt(mooncakeAvatarView.m3814getYdipdBGyhoQ(8) + resolve);
                    case 3:
                        return new YInt(mooncakeAvatarView.m3814getYdipdBGyhoQ(4) + mooncakeAvatarView.m3810bottomdBGyhoQ(mooncakeAvatarView.badgeLayout));
                    case 4:
                        return new XInt(mooncakeAvatarView.m3820widthTENr5nQ(mooncakeAvatarView.badgeLayout));
                    default:
                        return new YInt(mooncakeAvatarView.m3814getYdipdBGyhoQ(4) + mooncakeAvatarView.m3810bottomdBGyhoQ(mooncakeAvatarView.badgeLayout));
                }
            }
        }));
        figmaTextView.setSingleLine(false);
        figmaTextView.setMaxLines(2);
    }

    public final void setModel(int i, DirectoryListItem.ItemViewModel itemViewModel, Ui.EventReceiver eventReceiver) {
        MooncakeAvatarView mooncakeAvatarView;
        Drawable drawable;
        Drawable drawableCompat;
        itemViewModel.getClass();
        eventReceiver.getClass();
        int i2 = 1;
        if (isAttachedToWindow()) {
            itemViewModel.$$delegate_0.reportViewed(new CardItemView$setModel$1$1(eventReceiver, itemViewModel, i, 1));
            mooncakeAvatarView = this;
        } else {
            mooncakeAvatarView = this;
            mooncakeAvatarView.addOnAttachStateChangeListener(new CardItemView$setModel$$inlined$doOnAttach$1(mooncakeAvatarView, itemViewModel, eventReceiver, i, 1));
        }
        DirectoryListItem.ItemViewModel.Text text = itemViewModel.title;
        AvatarViewModel avatarViewModel = itemViewModel.avatar;
        if (text != null) {
            ErrorsKt.applyText(mooncakeAvatarView.name, text.text, text.highlightedRange, mooncakeAvatarView.imageLoader);
        }
        mooncakeAvatarView.badgeLayout.setModel(avatarViewModel != null ? avatarViewModel.badge : null);
        Lazy lazy = mooncakeAvatarView.avatar$delegate;
        if (avatarViewModel != null) {
            ImageView imageView = (ImageView) mooncakeAvatarView.badge$delegate.getValue();
            imageView.getClass();
            imageView.setVisibility(itemViewModel.recipient.isFavorite ? 0 : 8);
            Context context = mooncakeAvatarView.getContext();
            context.getClass();
            StackedAvatarViewModel.Avatar stackedAvatar = GrpcStatus.Companion.toStackedAvatar(avatarViewModel);
            ImageView imageView2 = (ImageView) lazy.getValue();
            imageView2.getClass();
            int sp = Views.sp((View) mooncakeAvatarView, 28);
            int sp2 = Views.sp((View) mooncakeAvatarView, 20);
            ThemeInfo themeInfo = ThemeHelpersKt.themeInfo(mooncakeAvatarView);
            if (itemViewModel.shouldUseMerchantPlaceholderOverride) {
                if (ThemeHelpersKt.themeInfo(mooncakeAvatarView).theme == Theme.MooncakeLight) {
                    Context context2 = mooncakeAvatarView.getContext();
                    context2.getClass();
                    drawableCompat = PlatformKt.getDrawableCompat(context2, R.drawable.merchant_placeholder_light, null);
                } else {
                    Context context3 = mooncakeAvatarView.getContext();
                    context3.getClass();
                    drawableCompat = PlatformKt.getDrawableCompat(context3, R.drawable.merchant_placeholder_dark, null);
                }
                drawable = drawableCompat;
            } else {
                drawable = null;
            }
            StackedAvatarViewKt.loadAvatarInto$default(context, mooncakeAvatarView.imageLoader, stackedAvatar, imageView2, themeInfo, sp, sp2, drawable, new GLSceneScope$$ExternalSyntheticLambda2(i2, eventReceiver, itemViewModel, mooncakeAvatarView));
        }
        ((ImageView) lazy.getValue()).setContentDescription(null);
        mooncakeAvatarView.setOnClickListener(new CardItemView$$ExternalSyntheticLambda0(eventReceiver, itemViewModel, i, 1));
    }
}
