package com.squareup.cash.investing.components.categories;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.os.BundleKt;
import com.squareup.cash.R;
import com.squareup.cash.investing.components.ArcadeBordersKt;
import com.squareup.cash.investing.components.news.NewsArticleAdapter$$ExternalSyntheticLambda1;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.mooncake.themes.theming.PressKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.protos.franklin.common.SyncInvestmentFilterGroup;
import com.squareup.util.Strings;
import com.squareup.wire.ByteArrayProtoReader32;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Huffman;

/* loaded from: classes6.dex */
public final class InvestingSubFilterIncremental extends ContourLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ColorPalette colorPalette;
    public final AppCompatImageButton decrementButton;
    public InvestingSubFilterIncremental$$ExternalSyntheticLambda14 decrementOnClick;
    public final AppCompatImageButton incrementButton;
    public InvestingSubFilterIncremental$$ExternalSyntheticLambda14 incrementOnClick;
    public Integer selectedIndex;
    public final AppCompatTextView selectionView;
    public final AppCompatTextView titleView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingSubFilterIncremental(Context context) {
        super(context, null);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        this.colorPalette = colorPalette;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        final int i = 1;
        appCompatTextView.setGravity(1);
        appCompatTextView.setTextSize(18.0f);
        BundleKt.setTypeface(appCompatTextView, R.font.cashsans_medium);
        appCompatTextView.setTextColor(colorPalette.label);
        this.titleView = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(colorPalette.secondaryButtonBackground);
        gradientDrawable.setCornerRadius(this.density * 24.0f);
        appCompatTextView2.setBackground(gradientDrawable);
        appCompatTextView2.setGravity(17);
        Strings.applyStyle(appCompatTextView2, TextStyles.smallTitle);
        appCompatTextView2.setHintTextColor(colorPalette.placeholderLabel);
        appCompatTextView2.setTextColor(colorPalette.label);
        final int i2 = 0;
        appCompatTextView2.setEnabled(false);
        this.selectionView = appCompatTextView2;
        AppCompatImageButton appCompatImageButton = new AppCompatImageButton(context);
        appCompatImageButton.setBackground(createPillDrawable());
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        appCompatImageButton.setScaleType(scaleType);
        appCompatImageButton.setImageTintList(new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{colorPalette.disabledLabel, colorPalette.tint}));
        appCompatImageButton.setImageResource(R.drawable.investing_components_minus);
        ArcadeBordersKt.attachTo(appCompatImageButton);
        this.decrementButton = appCompatImageButton;
        AppCompatImageButton appCompatImageButton2 = new AppCompatImageButton(context);
        appCompatImageButton2.setBackground(createPillDrawable());
        appCompatImageButton2.setScaleType(scaleType);
        appCompatImageButton2.setImageTintList(new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{colorPalette.disabledLabel, colorPalette.tint}));
        appCompatImageButton2.setImageResource(R.drawable.investing_components_plus);
        ArcadeBordersKt.attachTo(appCompatImageButton2);
        this.incrementButton = appCompatImageButton2;
        final int i3 = 5;
        ContourLayout.layoutBy$default(this, appCompatTextView, ContourLayout.matchParentX(0, 0), ContourLayout.topTo(new NewsArticleAdapter$$ExternalSyntheticLambda1(i3)));
        final int i4 = 7;
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingSubFilterIncremental$$ExternalSyntheticLambda1
            public final /* synthetic */ InvestingSubFilterIncremental f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i5 = i4;
                InvestingSubFilterIncremental investingSubFilterIncremental = this.f$0;
                switch (i5) {
                    case 0:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i6 = InvestingSubFilterIncremental.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt((((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() - (investingSubFilterIncremental.getDip(8) * 3)) / 4);
                    case 1:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        int i7 = InvestingSubFilterIncremental.$r8$clinit;
                        layoutSpec2.getClass();
                        return new XInt((((Huffman.Node) layoutSpec2.getParent().appLaunchedCallback).resolve() - (investingSubFilterIncremental.getDip(8) * 3)) / 4);
                    case 2:
                        int i8 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.getDip(24) + investingSubFilterIncremental.m3810bottomdBGyhoQ(investingSubFilterIncremental.titleView));
                    case 3:
                        int i9 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3814getYdipdBGyhoQ(48));
                    case 4:
                        int i10 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.getDip(24) + investingSubFilterIncremental.m3810bottomdBGyhoQ(investingSubFilterIncremental.titleView));
                    case 5:
                        int i11 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3814getYdipdBGyhoQ(48));
                    case 6:
                        return new YInt(investingSubFilterIncremental.m3810bottomdBGyhoQ(investingSubFilterIncremental.incrementButton));
                    case 7:
                        int i12 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingSubFilterIncremental.getDip(8) + investingSubFilterIncremental.m3818rightTENr5nQ(investingSubFilterIncremental.decrementButton));
                    case 8:
                        int i13 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingSubFilterIncremental.m3816leftTENr5nQ(investingSubFilterIncremental.incrementButton) - investingSubFilterIncremental.getDip(8));
                    case 9:
                        int i14 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3819topdBGyhoQ(investingSubFilterIncremental.decrementButton));
                    default:
                        int i15 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3815heightdBGyhoQ(investingSubFilterIncremental.decrementButton));
                }
            }
        });
        final int i5 = 8;
        leftTo.rightTo(1, new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingSubFilterIncremental$$ExternalSyntheticLambda1
            public final /* synthetic */ InvestingSubFilterIncremental f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i5;
                InvestingSubFilterIncremental investingSubFilterIncremental = this.f$0;
                switch (i52) {
                    case 0:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i6 = InvestingSubFilterIncremental.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt((((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() - (investingSubFilterIncremental.getDip(8) * 3)) / 4);
                    case 1:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        int i7 = InvestingSubFilterIncremental.$r8$clinit;
                        layoutSpec2.getClass();
                        return new XInt((((Huffman.Node) layoutSpec2.getParent().appLaunchedCallback).resolve() - (investingSubFilterIncremental.getDip(8) * 3)) / 4);
                    case 2:
                        int i8 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.getDip(24) + investingSubFilterIncremental.m3810bottomdBGyhoQ(investingSubFilterIncremental.titleView));
                    case 3:
                        int i9 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3814getYdipdBGyhoQ(48));
                    case 4:
                        int i10 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.getDip(24) + investingSubFilterIncremental.m3810bottomdBGyhoQ(investingSubFilterIncremental.titleView));
                    case 5:
                        int i11 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3814getYdipdBGyhoQ(48));
                    case 6:
                        return new YInt(investingSubFilterIncremental.m3810bottomdBGyhoQ(investingSubFilterIncremental.incrementButton));
                    case 7:
                        int i12 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingSubFilterIncremental.getDip(8) + investingSubFilterIncremental.m3818rightTENr5nQ(investingSubFilterIncremental.decrementButton));
                    case 8:
                        int i13 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingSubFilterIncremental.m3816leftTENr5nQ(investingSubFilterIncremental.incrementButton) - investingSubFilterIncremental.getDip(8));
                    case 9:
                        int i14 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3819topdBGyhoQ(investingSubFilterIncremental.decrementButton));
                    default:
                        int i15 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3815heightdBGyhoQ(investingSubFilterIncremental.decrementButton));
                }
            }
        });
        final int i6 = 9;
        ByteArrayProtoReader32 byteArrayProtoReader32 = ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingSubFilterIncremental$$ExternalSyntheticLambda1
            public final /* synthetic */ InvestingSubFilterIncremental f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i6;
                InvestingSubFilterIncremental investingSubFilterIncremental = this.f$0;
                switch (i52) {
                    case 0:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i62 = InvestingSubFilterIncremental.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt((((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() - (investingSubFilterIncremental.getDip(8) * 3)) / 4);
                    case 1:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        int i7 = InvestingSubFilterIncremental.$r8$clinit;
                        layoutSpec2.getClass();
                        return new XInt((((Huffman.Node) layoutSpec2.getParent().appLaunchedCallback).resolve() - (investingSubFilterIncremental.getDip(8) * 3)) / 4);
                    case 2:
                        int i8 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.getDip(24) + investingSubFilterIncremental.m3810bottomdBGyhoQ(investingSubFilterIncremental.titleView));
                    case 3:
                        int i9 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3814getYdipdBGyhoQ(48));
                    case 4:
                        int i10 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.getDip(24) + investingSubFilterIncremental.m3810bottomdBGyhoQ(investingSubFilterIncremental.titleView));
                    case 5:
                        int i11 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3814getYdipdBGyhoQ(48));
                    case 6:
                        return new YInt(investingSubFilterIncremental.m3810bottomdBGyhoQ(investingSubFilterIncremental.incrementButton));
                    case 7:
                        int i12 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingSubFilterIncremental.getDip(8) + investingSubFilterIncremental.m3818rightTENr5nQ(investingSubFilterIncremental.decrementButton));
                    case 8:
                        int i13 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingSubFilterIncremental.m3816leftTENr5nQ(investingSubFilterIncremental.incrementButton) - investingSubFilterIncremental.getDip(8));
                    case 9:
                        int i14 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3819topdBGyhoQ(investingSubFilterIncremental.decrementButton));
                    default:
                        int i15 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3815heightdBGyhoQ(investingSubFilterIncremental.decrementButton));
                }
            }
        });
        final int i7 = 10;
        byteArrayProtoReader32.heightOf(1, new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingSubFilterIncremental$$ExternalSyntheticLambda1
            public final /* synthetic */ InvestingSubFilterIncremental f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i7;
                InvestingSubFilterIncremental investingSubFilterIncremental = this.f$0;
                switch (i52) {
                    case 0:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i62 = InvestingSubFilterIncremental.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt((((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() - (investingSubFilterIncremental.getDip(8) * 3)) / 4);
                    case 1:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        int i72 = InvestingSubFilterIncremental.$r8$clinit;
                        layoutSpec2.getClass();
                        return new XInt((((Huffman.Node) layoutSpec2.getParent().appLaunchedCallback).resolve() - (investingSubFilterIncremental.getDip(8) * 3)) / 4);
                    case 2:
                        int i8 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.getDip(24) + investingSubFilterIncremental.m3810bottomdBGyhoQ(investingSubFilterIncremental.titleView));
                    case 3:
                        int i9 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3814getYdipdBGyhoQ(48));
                    case 4:
                        int i10 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.getDip(24) + investingSubFilterIncremental.m3810bottomdBGyhoQ(investingSubFilterIncremental.titleView));
                    case 5:
                        int i11 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3814getYdipdBGyhoQ(48));
                    case 6:
                        return new YInt(investingSubFilterIncremental.m3810bottomdBGyhoQ(investingSubFilterIncremental.incrementButton));
                    case 7:
                        int i12 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingSubFilterIncremental.getDip(8) + investingSubFilterIncremental.m3818rightTENr5nQ(investingSubFilterIncremental.decrementButton));
                    case 8:
                        int i13 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingSubFilterIncremental.m3816leftTENr5nQ(investingSubFilterIncremental.incrementButton) - investingSubFilterIncremental.getDip(8));
                    case 9:
                        int i14 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3819topdBGyhoQ(investingSubFilterIncremental.decrementButton));
                    default:
                        int i15 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3815heightdBGyhoQ(investingSubFilterIncremental.decrementButton));
                }
            }
        });
        ContourLayout.layoutBy$default(this, appCompatTextView2, leftTo, byteArrayProtoReader32);
        ByteArrayProtoReader32 leftTo2 = ContourLayout.leftTo(new NewsArticleAdapter$$ExternalSyntheticLambda1(i4));
        leftTo2.widthOf(1, new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingSubFilterIncremental$$ExternalSyntheticLambda1
            public final /* synthetic */ InvestingSubFilterIncremental f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i;
                InvestingSubFilterIncremental investingSubFilterIncremental = this.f$0;
                switch (i52) {
                    case 0:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i62 = InvestingSubFilterIncremental.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt((((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() - (investingSubFilterIncremental.getDip(8) * 3)) / 4);
                    case 1:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        int i72 = InvestingSubFilterIncremental.$r8$clinit;
                        layoutSpec2.getClass();
                        return new XInt((((Huffman.Node) layoutSpec2.getParent().appLaunchedCallback).resolve() - (investingSubFilterIncremental.getDip(8) * 3)) / 4);
                    case 2:
                        int i8 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.getDip(24) + investingSubFilterIncremental.m3810bottomdBGyhoQ(investingSubFilterIncremental.titleView));
                    case 3:
                        int i9 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3814getYdipdBGyhoQ(48));
                    case 4:
                        int i10 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.getDip(24) + investingSubFilterIncremental.m3810bottomdBGyhoQ(investingSubFilterIncremental.titleView));
                    case 5:
                        int i11 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3814getYdipdBGyhoQ(48));
                    case 6:
                        return new YInt(investingSubFilterIncremental.m3810bottomdBGyhoQ(investingSubFilterIncremental.incrementButton));
                    case 7:
                        int i12 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingSubFilterIncremental.getDip(8) + investingSubFilterIncremental.m3818rightTENr5nQ(investingSubFilterIncremental.decrementButton));
                    case 8:
                        int i13 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingSubFilterIncremental.m3816leftTENr5nQ(investingSubFilterIncremental.incrementButton) - investingSubFilterIncremental.getDip(8));
                    case 9:
                        int i14 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3819topdBGyhoQ(investingSubFilterIncremental.decrementButton));
                    default:
                        int i15 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3815heightdBGyhoQ(investingSubFilterIncremental.decrementButton));
                }
            }
        });
        final int i8 = 2;
        ByteArrayProtoReader32 byteArrayProtoReader322 = ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingSubFilterIncremental$$ExternalSyntheticLambda1
            public final /* synthetic */ InvestingSubFilterIncremental f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i8;
                InvestingSubFilterIncremental investingSubFilterIncremental = this.f$0;
                switch (i52) {
                    case 0:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i62 = InvestingSubFilterIncremental.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt((((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() - (investingSubFilterIncremental.getDip(8) * 3)) / 4);
                    case 1:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        int i72 = InvestingSubFilterIncremental.$r8$clinit;
                        layoutSpec2.getClass();
                        return new XInt((((Huffman.Node) layoutSpec2.getParent().appLaunchedCallback).resolve() - (investingSubFilterIncremental.getDip(8) * 3)) / 4);
                    case 2:
                        int i82 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.getDip(24) + investingSubFilterIncremental.m3810bottomdBGyhoQ(investingSubFilterIncremental.titleView));
                    case 3:
                        int i9 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3814getYdipdBGyhoQ(48));
                    case 4:
                        int i10 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.getDip(24) + investingSubFilterIncremental.m3810bottomdBGyhoQ(investingSubFilterIncremental.titleView));
                    case 5:
                        int i11 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3814getYdipdBGyhoQ(48));
                    case 6:
                        return new YInt(investingSubFilterIncremental.m3810bottomdBGyhoQ(investingSubFilterIncremental.incrementButton));
                    case 7:
                        int i12 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingSubFilterIncremental.getDip(8) + investingSubFilterIncremental.m3818rightTENr5nQ(investingSubFilterIncremental.decrementButton));
                    case 8:
                        int i13 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingSubFilterIncremental.m3816leftTENr5nQ(investingSubFilterIncremental.incrementButton) - investingSubFilterIncremental.getDip(8));
                    case 9:
                        int i14 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3819topdBGyhoQ(investingSubFilterIncremental.decrementButton));
                    default:
                        int i15 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3815heightdBGyhoQ(investingSubFilterIncremental.decrementButton));
                }
            }
        });
        final int i9 = 3;
        byteArrayProtoReader322.heightOf(1, new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingSubFilterIncremental$$ExternalSyntheticLambda1
            public final /* synthetic */ InvestingSubFilterIncremental f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i9;
                InvestingSubFilterIncremental investingSubFilterIncremental = this.f$0;
                switch (i52) {
                    case 0:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i62 = InvestingSubFilterIncremental.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt((((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() - (investingSubFilterIncremental.getDip(8) * 3)) / 4);
                    case 1:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        int i72 = InvestingSubFilterIncremental.$r8$clinit;
                        layoutSpec2.getClass();
                        return new XInt((((Huffman.Node) layoutSpec2.getParent().appLaunchedCallback).resolve() - (investingSubFilterIncremental.getDip(8) * 3)) / 4);
                    case 2:
                        int i82 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.getDip(24) + investingSubFilterIncremental.m3810bottomdBGyhoQ(investingSubFilterIncremental.titleView));
                    case 3:
                        int i92 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3814getYdipdBGyhoQ(48));
                    case 4:
                        int i10 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.getDip(24) + investingSubFilterIncremental.m3810bottomdBGyhoQ(investingSubFilterIncremental.titleView));
                    case 5:
                        int i11 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3814getYdipdBGyhoQ(48));
                    case 6:
                        return new YInt(investingSubFilterIncremental.m3810bottomdBGyhoQ(investingSubFilterIncremental.incrementButton));
                    case 7:
                        int i12 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingSubFilterIncremental.getDip(8) + investingSubFilterIncremental.m3818rightTENr5nQ(investingSubFilterIncremental.decrementButton));
                    case 8:
                        int i13 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingSubFilterIncremental.m3816leftTENr5nQ(investingSubFilterIncremental.incrementButton) - investingSubFilterIncremental.getDip(8));
                    case 9:
                        int i14 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3819topdBGyhoQ(investingSubFilterIncremental.decrementButton));
                    default:
                        int i15 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3815heightdBGyhoQ(investingSubFilterIncremental.decrementButton));
                }
            }
        });
        ContourLayout.layoutBy$default(this, appCompatImageButton, leftTo2, byteArrayProtoReader322);
        final int i10 = 6;
        ByteArrayProtoReader32 rightTo = ContourLayout.rightTo(new NewsArticleAdapter$$ExternalSyntheticLambda1(i10));
        rightTo.widthOf(1, new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingSubFilterIncremental$$ExternalSyntheticLambda1
            public final /* synthetic */ InvestingSubFilterIncremental f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i2;
                InvestingSubFilterIncremental investingSubFilterIncremental = this.f$0;
                switch (i52) {
                    case 0:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i62 = InvestingSubFilterIncremental.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt((((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() - (investingSubFilterIncremental.getDip(8) * 3)) / 4);
                    case 1:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        int i72 = InvestingSubFilterIncremental.$r8$clinit;
                        layoutSpec2.getClass();
                        return new XInt((((Huffman.Node) layoutSpec2.getParent().appLaunchedCallback).resolve() - (investingSubFilterIncremental.getDip(8) * 3)) / 4);
                    case 2:
                        int i82 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.getDip(24) + investingSubFilterIncremental.m3810bottomdBGyhoQ(investingSubFilterIncremental.titleView));
                    case 3:
                        int i92 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3814getYdipdBGyhoQ(48));
                    case 4:
                        int i102 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.getDip(24) + investingSubFilterIncremental.m3810bottomdBGyhoQ(investingSubFilterIncremental.titleView));
                    case 5:
                        int i11 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3814getYdipdBGyhoQ(48));
                    case 6:
                        return new YInt(investingSubFilterIncremental.m3810bottomdBGyhoQ(investingSubFilterIncremental.incrementButton));
                    case 7:
                        int i12 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingSubFilterIncremental.getDip(8) + investingSubFilterIncremental.m3818rightTENr5nQ(investingSubFilterIncremental.decrementButton));
                    case 8:
                        int i13 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingSubFilterIncremental.m3816leftTENr5nQ(investingSubFilterIncremental.incrementButton) - investingSubFilterIncremental.getDip(8));
                    case 9:
                        int i14 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3819topdBGyhoQ(investingSubFilterIncremental.decrementButton));
                    default:
                        int i15 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3815heightdBGyhoQ(investingSubFilterIncremental.decrementButton));
                }
            }
        });
        final int i11 = 4;
        ByteArrayProtoReader32 byteArrayProtoReader323 = ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingSubFilterIncremental$$ExternalSyntheticLambda1
            public final /* synthetic */ InvestingSubFilterIncremental f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i11;
                InvestingSubFilterIncremental investingSubFilterIncremental = this.f$0;
                switch (i52) {
                    case 0:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i62 = InvestingSubFilterIncremental.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt((((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() - (investingSubFilterIncremental.getDip(8) * 3)) / 4);
                    case 1:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        int i72 = InvestingSubFilterIncremental.$r8$clinit;
                        layoutSpec2.getClass();
                        return new XInt((((Huffman.Node) layoutSpec2.getParent().appLaunchedCallback).resolve() - (investingSubFilterIncremental.getDip(8) * 3)) / 4);
                    case 2:
                        int i82 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.getDip(24) + investingSubFilterIncremental.m3810bottomdBGyhoQ(investingSubFilterIncremental.titleView));
                    case 3:
                        int i92 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3814getYdipdBGyhoQ(48));
                    case 4:
                        int i102 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.getDip(24) + investingSubFilterIncremental.m3810bottomdBGyhoQ(investingSubFilterIncremental.titleView));
                    case 5:
                        int i112 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3814getYdipdBGyhoQ(48));
                    case 6:
                        return new YInt(investingSubFilterIncremental.m3810bottomdBGyhoQ(investingSubFilterIncremental.incrementButton));
                    case 7:
                        int i12 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingSubFilterIncremental.getDip(8) + investingSubFilterIncremental.m3818rightTENr5nQ(investingSubFilterIncremental.decrementButton));
                    case 8:
                        int i13 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingSubFilterIncremental.m3816leftTENr5nQ(investingSubFilterIncremental.incrementButton) - investingSubFilterIncremental.getDip(8));
                    case 9:
                        int i14 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3819topdBGyhoQ(investingSubFilterIncremental.decrementButton));
                    default:
                        int i15 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3815heightdBGyhoQ(investingSubFilterIncremental.decrementButton));
                }
            }
        });
        byteArrayProtoReader323.heightOf(1, new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingSubFilterIncremental$$ExternalSyntheticLambda1
            public final /* synthetic */ InvestingSubFilterIncremental f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i3;
                InvestingSubFilterIncremental investingSubFilterIncremental = this.f$0;
                switch (i52) {
                    case 0:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i62 = InvestingSubFilterIncremental.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt((((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() - (investingSubFilterIncremental.getDip(8) * 3)) / 4);
                    case 1:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        int i72 = InvestingSubFilterIncremental.$r8$clinit;
                        layoutSpec2.getClass();
                        return new XInt((((Huffman.Node) layoutSpec2.getParent().appLaunchedCallback).resolve() - (investingSubFilterIncremental.getDip(8) * 3)) / 4);
                    case 2:
                        int i82 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.getDip(24) + investingSubFilterIncremental.m3810bottomdBGyhoQ(investingSubFilterIncremental.titleView));
                    case 3:
                        int i92 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3814getYdipdBGyhoQ(48));
                    case 4:
                        int i102 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.getDip(24) + investingSubFilterIncremental.m3810bottomdBGyhoQ(investingSubFilterIncremental.titleView));
                    case 5:
                        int i112 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3814getYdipdBGyhoQ(48));
                    case 6:
                        return new YInt(investingSubFilterIncremental.m3810bottomdBGyhoQ(investingSubFilterIncremental.incrementButton));
                    case 7:
                        int i12 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingSubFilterIncremental.getDip(8) + investingSubFilterIncremental.m3818rightTENr5nQ(investingSubFilterIncremental.decrementButton));
                    case 8:
                        int i13 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingSubFilterIncremental.m3816leftTENr5nQ(investingSubFilterIncremental.incrementButton) - investingSubFilterIncremental.getDip(8));
                    case 9:
                        int i14 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3819topdBGyhoQ(investingSubFilterIncremental.decrementButton));
                    default:
                        int i15 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3815heightdBGyhoQ(investingSubFilterIncremental.decrementButton));
                }
            }
        });
        ContourLayout.layoutBy$default(this, appCompatImageButton2, rightTo, byteArrayProtoReader323);
        contourHeightOf(new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingSubFilterIncremental$$ExternalSyntheticLambda1
            public final /* synthetic */ InvestingSubFilterIncremental f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i10;
                InvestingSubFilterIncremental investingSubFilterIncremental = this.f$0;
                switch (i52) {
                    case 0:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i62 = InvestingSubFilterIncremental.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt((((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() - (investingSubFilterIncremental.getDip(8) * 3)) / 4);
                    case 1:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        int i72 = InvestingSubFilterIncremental.$r8$clinit;
                        layoutSpec2.getClass();
                        return new XInt((((Huffman.Node) layoutSpec2.getParent().appLaunchedCallback).resolve() - (investingSubFilterIncremental.getDip(8) * 3)) / 4);
                    case 2:
                        int i82 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.getDip(24) + investingSubFilterIncremental.m3810bottomdBGyhoQ(investingSubFilterIncremental.titleView));
                    case 3:
                        int i92 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3814getYdipdBGyhoQ(48));
                    case 4:
                        int i102 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.getDip(24) + investingSubFilterIncremental.m3810bottomdBGyhoQ(investingSubFilterIncremental.titleView));
                    case 5:
                        int i112 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3814getYdipdBGyhoQ(48));
                    case 6:
                        return new YInt(investingSubFilterIncremental.m3810bottomdBGyhoQ(investingSubFilterIncremental.incrementButton));
                    case 7:
                        int i12 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingSubFilterIncremental.getDip(8) + investingSubFilterIncremental.m3818rightTENr5nQ(investingSubFilterIncremental.decrementButton));
                    case 8:
                        int i13 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingSubFilterIncremental.m3816leftTENr5nQ(investingSubFilterIncremental.incrementButton) - investingSubFilterIncremental.getDip(8));
                    case 9:
                        int i14 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3819topdBGyhoQ(investingSubFilterIncremental.decrementButton));
                    default:
                        int i15 = InvestingSubFilterIncremental.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingSubFilterIncremental.m3815heightdBGyhoQ(investingSubFilterIncremental.decrementButton));
                }
            }
        });
    }

    public static final void render$announceOption(InvestingSubFilterIncremental investingSubFilterIncremental, Object obj) {
        obj.getClass();
        CharSequence charSequence = obj instanceof SyncInvestmentFilterGroup.SubfilterOption ? ((SyncInvestmentFilterGroup.SubfilterOption) obj).name : obj instanceof String ? (CharSequence) obj : null;
        if (charSequence == null || StringsKt.isBlank(charSequence)) {
            return;
        }
        investingSubFilterIncremental.selectionView.announceForAccessibility(charSequence);
    }

    public final RippleDrawable createPillDrawable() {
        ThemeInfo themeInfo = ThemeHelpersKt.themeInfo(this);
        ColorPalette colorPalette = this.colorPalette;
        ColorStateList valueOf = ColorStateList.valueOf(PressKt.pressColor$default(themeInfo, Integer.valueOf(colorPalette.secondaryButtonBackground), 2));
        valueOf.getClass();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke(getDip(2), colorPalette.secondaryButtonBackground);
        float f = this.density * 24.0f;
        gradientDrawable.setCornerRadius(f);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(-16777216);
        gradientDrawable2.setCornerRadius(f);
        return new RippleDrawable(valueOf, gradientDrawable, gradientDrawable2);
    }
}
