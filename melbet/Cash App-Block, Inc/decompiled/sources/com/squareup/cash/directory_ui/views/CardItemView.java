package com.squareup.cash.directory_ui.views;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.ui.Ui;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import coil3.RealImageLoader;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda14;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.themes.widget.TextThemeInfo;
import com.squareup.cash.mooncake.theming.RipplesKt;
import com.squareup.cash.mooncake.theming.ThemablesKt;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import com.squareup.wire.ByteArrayProtoReader32;
import com.stripe.android.financialconnections.utils.ErrorsKt;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http2.Huffman;

/* loaded from: classes6.dex */
public final class CardItemView extends ContourLayout {
    public final CardView cardView;
    public final ColorPalette colorPalette;
    public final AppCompatImageView image;
    public final RealImageLoader imageLoader;
    public final FigmaTextView subheader;
    public final FigmaTextView subtitleLeft;
    public final FigmaTextView subtitleRight;
    public final FigmaTextView title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardItemView(Context context, RealImageLoader realImageLoader, int i) {
        super(context);
        context.getClass();
        realImageLoader.getClass();
        this.imageLoader = realImageLoader;
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        this.colorPalette = colorPalette;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setContentDescription(null);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(Views.px(appCompatImageView, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), Views.px(appCompatImageView, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE)));
        appCompatImageView.setBackground(RipplesKt.createBorderlessRippleDrawable(appCompatImageView));
        this.image = appCompatImageView;
        final int i2 = 2;
        FigmaTextView figmaTextView = new FigmaTextView(context, null, 2, null);
        TextThemeInfo textThemeInfo = TextStyles.caption;
        Strings.applyStyle(figmaTextView, textThemeInfo);
        figmaTextView.setTextColor(colorPalette.secondaryLabel);
        figmaTextView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        figmaTextView.setEllipsize(truncateAt);
        this.title = figmaTextView;
        FigmaTextView figmaTextView2 = new FigmaTextView(context, null, 2, null);
        Strings.applyStyle(figmaTextView2, TextStyles.strongCaption);
        figmaTextView2.setTextColor(colorPalette.label);
        figmaTextView2.setSingleLine();
        figmaTextView2.setEllipsize(truncateAt);
        this.subheader = figmaTextView2;
        FigmaTextView figmaTextView3 = new FigmaTextView(context, null, 2, null);
        Strings.applyStyle(figmaTextView3, textThemeInfo);
        int i3 = colorPalette.secondaryLabel;
        figmaTextView3.setTextColor(i3);
        figmaTextView3.setSingleLine();
        figmaTextView3.setEllipsize(truncateAt);
        this.subtitleLeft = figmaTextView3;
        FigmaTextView figmaTextView4 = new FigmaTextView(context, null, 2, null);
        Strings.applyStyle(figmaTextView4, textThemeInfo);
        figmaTextView4.setTextColor(i3);
        figmaTextView4.setSingleLine();
        figmaTextView4.setEllipsize(truncateAt);
        this.subtitleRight = figmaTextView4;
        CardView cardView = new CardView(context);
        cardView.setLayoutParams(new FrameLayout.LayoutParams(Views.px(cardView, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), Views.px(cardView, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE)));
        cardView.setRadius(64.0f);
        cardView.setElevation(RecyclerView.DECELERATION_RATE);
        final int i4 = 0;
        cardView.setCardBackgroundColor(0);
        this.cardView = cardView;
        final int i5 = 6;
        final int i6 = 5;
        final int i7 = 9;
        final int i8 = 1;
        if (i == 0) {
            contourWidthOf(new Function1(this) { // from class: com.squareup.cash.directory_ui.views.CardItemView$$ExternalSyntheticLambda1
                public final /* synthetic */ CardItemView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i9 = i4;
                    CardItemView cardItemView = this.f$0;
                    switch (i9) {
                        case 0:
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE));
                        case 1:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 2:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 3:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.subheader));
                        case 4:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(8) + cardItemView.m3818rightTENr5nQ(cardItemView.subtitleLeft));
                        case 5:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 6:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.subheader));
                        case 7:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                        case 8:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                        case 9:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(8) + cardItemView.m3810bottomdBGyhoQ(cardItemView.cardView));
                        case 10:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            int resolve = (int) (((Huffman.Node) r4.getParent().appLaunchedCallback).resolve() * 0.9f);
                            cardItemView.image.setLayoutParams(new FrameLayout.LayoutParams(resolve, resolve));
                            return new YInt(resolve);
                        case 11:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 12:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 13:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(8) + cardItemView.m3810bottomdBGyhoQ(cardItemView.cardView));
                        case 14:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 15:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        default:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.title));
                    }
                }
            });
            contourHeightWrapContent();
            ByteArrayProtoReader32 centerHorizontallyTo = ContourLayout.centerHorizontallyTo(new ComposeDialogKt$$ExternalSyntheticLambda14(i6));
            final int i9 = 7;
            centerHorizontallyTo.widthOf(1, new Function1(this) { // from class: com.squareup.cash.directory_ui.views.CardItemView$$ExternalSyntheticLambda1
                public final /* synthetic */ CardItemView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i92 = i9;
                    CardItemView cardItemView = this.f$0;
                    switch (i92) {
                        case 0:
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE));
                        case 1:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 2:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 3:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.subheader));
                        case 4:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(8) + cardItemView.m3818rightTENr5nQ(cardItemView.subtitleLeft));
                        case 5:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 6:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.subheader));
                        case 7:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                        case 8:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                        case 9:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(8) + cardItemView.m3810bottomdBGyhoQ(cardItemView.cardView));
                        case 10:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            int resolve = (int) (((Huffman.Node) r4.getParent().appLaunchedCallback).resolve() * 0.9f);
                            cardItemView.image.setLayoutParams(new FrameLayout.LayoutParams(resolve, resolve));
                            return new YInt(resolve);
                        case 11:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 12:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 13:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(8) + cardItemView.m3810bottomdBGyhoQ(cardItemView.cardView));
                        case 14:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 15:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        default:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.title));
                    }
                }
            });
            ByteArrayProtoReader32 byteArrayProtoReader32 = ContourLayout.topTo(new ComposeDialogKt$$ExternalSyntheticLambda14(i5));
            final int i10 = 8;
            byteArrayProtoReader32.heightOf(1, new Function1(this) { // from class: com.squareup.cash.directory_ui.views.CardItemView$$ExternalSyntheticLambda1
                public final /* synthetic */ CardItemView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i92 = i10;
                    CardItemView cardItemView = this.f$0;
                    switch (i92) {
                        case 0:
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE));
                        case 1:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 2:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 3:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.subheader));
                        case 4:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(8) + cardItemView.m3818rightTENr5nQ(cardItemView.subtitleLeft));
                        case 5:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 6:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.subheader));
                        case 7:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                        case 8:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                        case 9:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(8) + cardItemView.m3810bottomdBGyhoQ(cardItemView.cardView));
                        case 10:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            int resolve = (int) (((Huffman.Node) r4.getParent().appLaunchedCallback).resolve() * 0.9f);
                            cardItemView.image.setLayoutParams(new FrameLayout.LayoutParams(resolve, resolve));
                            return new YInt(resolve);
                        case 11:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 12:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 13:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(8) + cardItemView.m3810bottomdBGyhoQ(cardItemView.cardView));
                        case 14:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 15:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        default:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.title));
                    }
                }
            });
            ContourLayout.layoutBy$default(this, cardView, centerHorizontallyTo, byteArrayProtoReader32);
            ByteArrayProtoReader32 centerHorizontallyTo2 = ContourLayout.centerHorizontallyTo(new ComposeDialogKt$$ExternalSyntheticLambda14(i9));
            centerHorizontallyTo2.widthOf(2, new ComposeDialogKt$$ExternalSyntheticLambda14(i10));
            ContourLayout.layoutBy$default(this, figmaTextView, centerHorizontallyTo2, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.directory_ui.views.CardItemView$$ExternalSyntheticLambda1
                public final /* synthetic */ CardItemView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i92 = i7;
                    CardItemView cardItemView = this.f$0;
                    switch (i92) {
                        case 0:
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE));
                        case 1:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 2:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 3:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.subheader));
                        case 4:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(8) + cardItemView.m3818rightTENr5nQ(cardItemView.subtitleLeft));
                        case 5:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 6:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.subheader));
                        case 7:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                        case 8:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                        case 9:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(8) + cardItemView.m3810bottomdBGyhoQ(cardItemView.cardView));
                        case 10:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            int resolve = (int) (((Huffman.Node) r4.getParent().appLaunchedCallback).resolve() * 0.9f);
                            cardItemView.image.setLayoutParams(new FrameLayout.LayoutParams(resolve, resolve));
                            return new YInt(resolve);
                        case 11:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 12:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 13:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(8) + cardItemView.m3810bottomdBGyhoQ(cardItemView.cardView));
                        case 14:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 15:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        default:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.title));
                    }
                }
            }));
        } else if (i == 1) {
            contourWidthMatchParent();
            contourHeightWrapContent();
            ByteArrayProtoReader32 centerHorizontallyTo3 = ContourLayout.centerHorizontallyTo(new ComposeDialogKt$$ExternalSyntheticLambda14(i7));
            final int i11 = 10;
            centerHorizontallyTo3.widthOf(1, new ComposeDialogKt$$ExternalSyntheticLambda14(i11));
            final int i12 = 11;
            ByteArrayProtoReader32 byteArrayProtoReader322 = ContourLayout.topTo(new ComposeDialogKt$$ExternalSyntheticLambda14(i12));
            byteArrayProtoReader322.heightOf(1, new Function1(this) { // from class: com.squareup.cash.directory_ui.views.CardItemView$$ExternalSyntheticLambda1
                public final /* synthetic */ CardItemView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i92 = i11;
                    CardItemView cardItemView = this.f$0;
                    switch (i92) {
                        case 0:
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE));
                        case 1:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 2:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 3:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.subheader));
                        case 4:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(8) + cardItemView.m3818rightTENr5nQ(cardItemView.subtitleLeft));
                        case 5:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 6:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.subheader));
                        case 7:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                        case 8:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                        case 9:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(8) + cardItemView.m3810bottomdBGyhoQ(cardItemView.cardView));
                        case 10:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            int resolve = (int) (((Huffman.Node) r4.getParent().appLaunchedCallback).resolve() * 0.9f);
                            cardItemView.image.setLayoutParams(new FrameLayout.LayoutParams(resolve, resolve));
                            return new YInt(resolve);
                        case 11:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 12:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 13:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(8) + cardItemView.m3810bottomdBGyhoQ(cardItemView.cardView));
                        case 14:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 15:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        default:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.title));
                    }
                }
            });
            ContourLayout.layoutBy$default(this, cardView, centerHorizontallyTo3, byteArrayProtoReader322);
            ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.directory_ui.views.CardItemView$$ExternalSyntheticLambda1
                public final /* synthetic */ CardItemView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i92 = i12;
                    CardItemView cardItemView = this.f$0;
                    switch (i92) {
                        case 0:
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE));
                        case 1:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 2:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 3:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.subheader));
                        case 4:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(8) + cardItemView.m3818rightTENr5nQ(cardItemView.subtitleLeft));
                        case 5:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 6:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.subheader));
                        case 7:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                        case 8:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                        case 9:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(8) + cardItemView.m3810bottomdBGyhoQ(cardItemView.cardView));
                        case 10:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            int resolve = (int) (((Huffman.Node) r4.getParent().appLaunchedCallback).resolve() * 0.9f);
                            cardItemView.image.setLayoutParams(new FrameLayout.LayoutParams(resolve, resolve));
                            return new YInt(resolve);
                        case 11:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 12:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 13:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(8) + cardItemView.m3810bottomdBGyhoQ(cardItemView.cardView));
                        case 14:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 15:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        default:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.title));
                    }
                }
            });
            final int i13 = 12;
            leftTo.widthOf(2, new Function1(this) { // from class: com.squareup.cash.directory_ui.views.CardItemView$$ExternalSyntheticLambda1
                public final /* synthetic */ CardItemView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i92 = i13;
                    CardItemView cardItemView = this.f$0;
                    switch (i92) {
                        case 0:
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE));
                        case 1:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 2:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 3:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.subheader));
                        case 4:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(8) + cardItemView.m3818rightTENr5nQ(cardItemView.subtitleLeft));
                        case 5:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 6:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.subheader));
                        case 7:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                        case 8:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                        case 9:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(8) + cardItemView.m3810bottomdBGyhoQ(cardItemView.cardView));
                        case 10:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            int resolve = (int) (((Huffman.Node) r4.getParent().appLaunchedCallback).resolve() * 0.9f);
                            cardItemView.image.setLayoutParams(new FrameLayout.LayoutParams(resolve, resolve));
                            return new YInt(resolve);
                        case 11:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 12:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 13:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(8) + cardItemView.m3810bottomdBGyhoQ(cardItemView.cardView));
                        case 14:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 15:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        default:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.title));
                    }
                }
            });
            final int i14 = 13;
            ContourLayout.layoutBy$default(this, figmaTextView, leftTo, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.directory_ui.views.CardItemView$$ExternalSyntheticLambda1
                public final /* synthetic */ CardItemView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i92 = i14;
                    CardItemView cardItemView = this.f$0;
                    switch (i92) {
                        case 0:
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE));
                        case 1:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 2:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 3:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.subheader));
                        case 4:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(8) + cardItemView.m3818rightTENr5nQ(cardItemView.subtitleLeft));
                        case 5:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 6:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.subheader));
                        case 7:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                        case 8:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                        case 9:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(8) + cardItemView.m3810bottomdBGyhoQ(cardItemView.cardView));
                        case 10:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            int resolve = (int) (((Huffman.Node) r4.getParent().appLaunchedCallback).resolve() * 0.9f);
                            cardItemView.image.setLayoutParams(new FrameLayout.LayoutParams(resolve, resolve));
                            return new YInt(resolve);
                        case 11:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 12:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 13:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(8) + cardItemView.m3810bottomdBGyhoQ(cardItemView.cardView));
                        case 14:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 15:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        default:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.title));
                    }
                }
            }));
            final int i15 = 14;
            ByteArrayProtoReader32 leftTo2 = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.directory_ui.views.CardItemView$$ExternalSyntheticLambda1
                public final /* synthetic */ CardItemView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i92 = i15;
                    CardItemView cardItemView = this.f$0;
                    switch (i92) {
                        case 0:
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE));
                        case 1:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 2:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 3:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.subheader));
                        case 4:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(8) + cardItemView.m3818rightTENr5nQ(cardItemView.subtitleLeft));
                        case 5:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 6:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.subheader));
                        case 7:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                        case 8:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                        case 9:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(8) + cardItemView.m3810bottomdBGyhoQ(cardItemView.cardView));
                        case 10:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            int resolve = (int) (((Huffman.Node) r4.getParent().appLaunchedCallback).resolve() * 0.9f);
                            cardItemView.image.setLayoutParams(new FrameLayout.LayoutParams(resolve, resolve));
                            return new YInt(resolve);
                        case 11:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 12:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 13:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(8) + cardItemView.m3810bottomdBGyhoQ(cardItemView.cardView));
                        case 14:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 15:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        default:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.title));
                    }
                }
            });
            final int i16 = 15;
            leftTo2.widthOf(2, new Function1(this) { // from class: com.squareup.cash.directory_ui.views.CardItemView$$ExternalSyntheticLambda1
                public final /* synthetic */ CardItemView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i92 = i16;
                    CardItemView cardItemView = this.f$0;
                    switch (i92) {
                        case 0:
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE));
                        case 1:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 2:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 3:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.subheader));
                        case 4:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(8) + cardItemView.m3818rightTENr5nQ(cardItemView.subtitleLeft));
                        case 5:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 6:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.subheader));
                        case 7:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                        case 8:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                        case 9:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(8) + cardItemView.m3810bottomdBGyhoQ(cardItemView.cardView));
                        case 10:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            int resolve = (int) (((Huffman.Node) r4.getParent().appLaunchedCallback).resolve() * 0.9f);
                            cardItemView.image.setLayoutParams(new FrameLayout.LayoutParams(resolve, resolve));
                            return new YInt(resolve);
                        case 11:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 12:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 13:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(8) + cardItemView.m3810bottomdBGyhoQ(cardItemView.cardView));
                        case 14:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 15:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        default:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.title));
                    }
                }
            });
            final int i17 = 16;
            ContourLayout.layoutBy$default(this, figmaTextView2, leftTo2, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.directory_ui.views.CardItemView$$ExternalSyntheticLambda1
                public final /* synthetic */ CardItemView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i92 = i17;
                    CardItemView cardItemView = this.f$0;
                    switch (i92) {
                        case 0:
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE));
                        case 1:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 2:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 3:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.subheader));
                        case 4:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(8) + cardItemView.m3818rightTENr5nQ(cardItemView.subtitleLeft));
                        case 5:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 6:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.subheader));
                        case 7:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                        case 8:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                        case 9:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(8) + cardItemView.m3810bottomdBGyhoQ(cardItemView.cardView));
                        case 10:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            int resolve = (int) (((Huffman.Node) r4.getParent().appLaunchedCallback).resolve() * 0.9f);
                            cardItemView.image.setLayoutParams(new FrameLayout.LayoutParams(resolve, resolve));
                            return new YInt(resolve);
                        case 11:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 12:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 13:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(8) + cardItemView.m3810bottomdBGyhoQ(cardItemView.cardView));
                        case 14:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 15:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        default:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.title));
                    }
                }
            }));
            ByteArrayProtoReader32 leftTo3 = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.directory_ui.views.CardItemView$$ExternalSyntheticLambda1
                public final /* synthetic */ CardItemView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i92 = i8;
                    CardItemView cardItemView = this.f$0;
                    switch (i92) {
                        case 0:
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE));
                        case 1:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 2:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 3:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.subheader));
                        case 4:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(8) + cardItemView.m3818rightTENr5nQ(cardItemView.subtitleLeft));
                        case 5:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 6:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.subheader));
                        case 7:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                        case 8:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                        case 9:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(8) + cardItemView.m3810bottomdBGyhoQ(cardItemView.cardView));
                        case 10:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            int resolve = (int) (((Huffman.Node) r4.getParent().appLaunchedCallback).resolve() * 0.9f);
                            cardItemView.image.setLayoutParams(new FrameLayout.LayoutParams(resolve, resolve));
                            return new YInt(resolve);
                        case 11:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 12:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 13:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(8) + cardItemView.m3810bottomdBGyhoQ(cardItemView.cardView));
                        case 14:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 15:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        default:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.title));
                    }
                }
            });
            leftTo3.widthOf(2, new Function1(this) { // from class: com.squareup.cash.directory_ui.views.CardItemView$$ExternalSyntheticLambda1
                public final /* synthetic */ CardItemView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i92 = i2;
                    CardItemView cardItemView = this.f$0;
                    switch (i92) {
                        case 0:
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE));
                        case 1:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 2:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 3:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.subheader));
                        case 4:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(8) + cardItemView.m3818rightTENr5nQ(cardItemView.subtitleLeft));
                        case 5:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 6:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.subheader));
                        case 7:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                        case 8:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                        case 9:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(8) + cardItemView.m3810bottomdBGyhoQ(cardItemView.cardView));
                        case 10:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            int resolve = (int) (((Huffman.Node) r4.getParent().appLaunchedCallback).resolve() * 0.9f);
                            cardItemView.image.setLayoutParams(new FrameLayout.LayoutParams(resolve, resolve));
                            return new YInt(resolve);
                        case 11:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 12:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 13:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(8) + cardItemView.m3810bottomdBGyhoQ(cardItemView.cardView));
                        case 14:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 15:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        default:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.title));
                    }
                }
            });
            final int i18 = 3;
            ContourLayout.layoutBy$default(this, figmaTextView3, leftTo3, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.directory_ui.views.CardItemView$$ExternalSyntheticLambda1
                public final /* synthetic */ CardItemView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i92 = i18;
                    CardItemView cardItemView = this.f$0;
                    switch (i92) {
                        case 0:
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE));
                        case 1:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 2:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 3:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.subheader));
                        case 4:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(8) + cardItemView.m3818rightTENr5nQ(cardItemView.subtitleLeft));
                        case 5:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 6:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.subheader));
                        case 7:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                        case 8:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                        case 9:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(8) + cardItemView.m3810bottomdBGyhoQ(cardItemView.cardView));
                        case 10:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            int resolve = (int) (((Huffman.Node) r4.getParent().appLaunchedCallback).resolve() * 0.9f);
                            cardItemView.image.setLayoutParams(new FrameLayout.LayoutParams(resolve, resolve));
                            return new YInt(resolve);
                        case 11:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 12:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 13:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(8) + cardItemView.m3810bottomdBGyhoQ(cardItemView.cardView));
                        case 14:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 15:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        default:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.title));
                    }
                }
            }));
            final int i19 = 4;
            ByteArrayProtoReader32 leftTo4 = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.directory_ui.views.CardItemView$$ExternalSyntheticLambda1
                public final /* synthetic */ CardItemView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i92 = i19;
                    CardItemView cardItemView = this.f$0;
                    switch (i92) {
                        case 0:
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE));
                        case 1:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 2:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 3:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.subheader));
                        case 4:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(8) + cardItemView.m3818rightTENr5nQ(cardItemView.subtitleLeft));
                        case 5:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 6:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.subheader));
                        case 7:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                        case 8:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                        case 9:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(8) + cardItemView.m3810bottomdBGyhoQ(cardItemView.cardView));
                        case 10:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            int resolve = (int) (((Huffman.Node) r4.getParent().appLaunchedCallback).resolve() * 0.9f);
                            cardItemView.image.setLayoutParams(new FrameLayout.LayoutParams(resolve, resolve));
                            return new YInt(resolve);
                        case 11:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 12:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 13:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(8) + cardItemView.m3810bottomdBGyhoQ(cardItemView.cardView));
                        case 14:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 15:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        default:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.title));
                    }
                }
            });
            leftTo4.widthOf(2, new Function1(this) { // from class: com.squareup.cash.directory_ui.views.CardItemView$$ExternalSyntheticLambda1
                public final /* synthetic */ CardItemView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i92 = i6;
                    CardItemView cardItemView = this.f$0;
                    switch (i92) {
                        case 0:
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE));
                        case 1:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 2:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 3:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.subheader));
                        case 4:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(8) + cardItemView.m3818rightTENr5nQ(cardItemView.subtitleLeft));
                        case 5:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 6:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.subheader));
                        case 7:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                        case 8:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                        case 9:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(8) + cardItemView.m3810bottomdBGyhoQ(cardItemView.cardView));
                        case 10:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            int resolve = (int) (((Huffman.Node) r4.getParent().appLaunchedCallback).resolve() * 0.9f);
                            cardItemView.image.setLayoutParams(new FrameLayout.LayoutParams(resolve, resolve));
                            return new YInt(resolve);
                        case 11:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 12:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 13:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(8) + cardItemView.m3810bottomdBGyhoQ(cardItemView.cardView));
                        case 14:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 15:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        default:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.title));
                    }
                }
            });
            ContourLayout.layoutBy$default(this, figmaTextView4, leftTo4, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.directory_ui.views.CardItemView$$ExternalSyntheticLambda1
                public final /* synthetic */ CardItemView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i92 = i5;
                    CardItemView cardItemView = this.f$0;
                    switch (i92) {
                        case 0:
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE));
                        case 1:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 2:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 3:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.subheader));
                        case 4:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(8) + cardItemView.m3818rightTENr5nQ(cardItemView.subtitleLeft));
                        case 5:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 6:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.subheader));
                        case 7:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3813getXdipTENr5nQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                        case 8:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                        case 9:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(8) + cardItemView.m3810bottomdBGyhoQ(cardItemView.cardView));
                        case 10:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            int resolve = (int) (((Huffman.Node) r4.getParent().appLaunchedCallback).resolve() * 0.9f);
                            cardItemView.image.setLayoutParams(new FrameLayout.LayoutParams(resolve, resolve));
                            return new YInt(resolve);
                        case 11:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 12:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        case 13:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3814getYdipdBGyhoQ(8) + cardItemView.m3810bottomdBGyhoQ(cardItemView.cardView));
                        case 14:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3816leftTENr5nQ(cardItemView.cardView));
                        case 15:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new XInt(cardItemView.m3820widthTENr5nQ(cardItemView.cardView));
                        default:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(cardItemView.m3810bottomdBGyhoQ(cardItemView.title));
                    }
                }
            }));
            cardView.setRadius(Views.dip((View) this, 16.0f));
            figmaTextView.setSingleLine(false);
            figmaTextView.setMaxLines(2);
            figmaTextView2.setSingleLine(false);
            figmaTextView2.setMaxLines(2);
        }
        cardView.addView(appCompatImageView);
        setBackground(RipplesKt.createBorderlessRippleDrawable(this));
    }

    public final void setModel(int i, DirectoryListItem.ItemViewModel itemViewModel, Ui.EventReceiver eventReceiver) {
        CardItemView cardItemView;
        int i2;
        DirectoryListItem.ItemViewModel itemViewModel2;
        Ui.EventReceiver eventReceiver2;
        itemViewModel.getClass();
        DirectoryListItem.ItemViewModel.Text text = itemViewModel.subtitle;
        eventReceiver.getClass();
        if (isAttachedToWindow()) {
            itemViewModel.$$delegate_0.reportViewed(new CardItemView$setModel$1$1(eventReceiver, itemViewModel, i, 0));
            cardItemView = this;
            i2 = i;
            itemViewModel2 = itemViewModel;
            eventReceiver2 = eventReceiver;
        } else {
            cardItemView = this;
            i2 = i;
            itemViewModel2 = itemViewModel;
            eventReceiver2 = eventReceiver;
            cardItemView.addOnAttachStateChangeListener(new CardItemView$setModel$$inlined$doOnAttach$1(cardItemView, itemViewModel2, eventReceiver2, i2, 0));
        }
        DirectoryListItem.ItemViewModel.Text text2 = itemViewModel2.captionRight;
        DirectoryListItem.ItemViewModel.Text text3 = itemViewModel2.captionLeft;
        int i3 = text != null ? 0 : 8;
        FigmaTextView figmaTextView = cardItemView.subheader;
        figmaTextView.setVisibility(i3);
        int i4 = text3 != null ? 0 : 8;
        FigmaTextView figmaTextView2 = cardItemView.subtitleLeft;
        figmaTextView2.setVisibility(i4);
        int i5 = text2 != null ? 0 : 8;
        FigmaTextView figmaTextView3 = cardItemView.subtitleRight;
        figmaTextView3.setVisibility(i5);
        DirectoryListItem.ItemViewModel.Text text4 = itemViewModel2.title;
        RealImageLoader realImageLoader = cardItemView.imageLoader;
        if (text4 != null) {
            ErrorsKt.applyText(cardItemView.title, text4.text, text4.highlightedRange, realImageLoader);
        }
        if (text != null) {
            ErrorsKt.applyText(figmaTextView, text.text, text.highlightedRange, realImageLoader);
        }
        if (text3 != null) {
            ErrorsKt.applyText(figmaTextView2, text3.text, text3.highlightedRange, realImageLoader);
        }
        if (text2 != null) {
            ErrorsKt.applyText(figmaTextView3, text2.text, text2.highlightedRange, realImageLoader);
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(cardItemView.colorPalette.placeholderBackground);
        shapeDrawable.setIntrinsicWidth(-1);
        shapeDrawable.setIntrinsicHeight(-1);
        Image image = itemViewModel2.picture;
        String urlForTheme = image != null ? ThemablesKt.urlForTheme(image, ThemeHelpersKt.themeInfo(cardItemView)) : null;
        Context context = cardItemView.getContext();
        context.getClass();
        ImageRequest.Builder builder = new ImageRequest.Builder(context);
        builder.data = urlForTheme;
        ImageRequests_androidKt.placeholder(builder, shapeDrawable);
        ImageRequests_androidKt.error(builder, shapeDrawable);
        ImageRequests_androidKt.target(builder, cardItemView.image);
        builder.listener = new EglCore(6, eventReceiver2, itemViewModel2, urlForTheme);
        realImageLoader.enqueue(builder.build());
        cardItemView.setOnClickListener(new CardItemView$$ExternalSyntheticLambda0(eventReceiver2, itemViewModel2, i2, 0));
    }
}
