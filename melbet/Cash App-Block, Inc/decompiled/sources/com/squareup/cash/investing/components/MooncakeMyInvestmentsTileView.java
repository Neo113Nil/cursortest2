package com.squareup.cash.investing.components;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.material3.SliderKt$$ExternalSyntheticLambda5;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.RecyclerView;
import com.knotapi.knot.webview.KnotView$$ExternalSyntheticLambda1;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.investing.components.common.InvestingTileHeaderView;
import com.squareup.cash.investing.viewmodels.MyInvestmentsContentModel;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.ui.drawable.DividerDrawable;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.util.android.Views;
import com.squareup.wire.ByteArrayProtoReader32;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http2.Huffman;

/* loaded from: classes6.dex */
public final class MooncakeMyInvestmentsTileView extends ContourLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public Function0 actionClickListener;
    public float amountSharedTextSizeInPx;
    public final ComposeView border;
    public final ColorPalette colorPalette;
    public final AppCompatTextView investedAmount;
    public final AppCompatTextView investedLabel;
    public final LinearLayout investedLayout;
    public final AppCompatTextView netProfitAmount;
    public final AppCompatTextView netProfitLabel;
    public final LinearLayout netProfitLayout;
    public boolean roundedBottomCorners;
    public final LinearLayout statsContainer;
    public final InvestingTileHeaderView title;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MyInvestmentsContentModel.StatRow.StatValueIconKind.values().length];
            try {
                MyInvestmentsContentModel.StatRow.StatValueIconKind statValueIconKind = MyInvestmentsContentModel.StatRow.StatValueIconKind.ArrowUp;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MyInvestmentsContentModel.StatRow.StatValueIconKind statValueIconKind2 = MyInvestmentsContentModel.StatRow.StatValueIconKind.ArrowUp;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MooncakeMyInvestmentsTileView(Context context, AttributeSet attributeSet, int i) {
        super(context, r1);
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        final int i2 = 1;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 8) != 0;
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        this.colorPalette = colorPalette;
        this.amountSharedTextSizeInPx = this.density * 24.0f;
        InvestingTileHeaderView investingTileHeaderView = new InvestingTileHeaderView(context, null);
        this.title = investingTileHeaderView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setTextSize(0, this.amountSharedTextSizeInPx);
        BundleKt.setTypeface(appCompatTextView, R.font.cashsans_medium);
        appCompatTextView.setFocusableInTouchMode(false);
        this.investedAmount = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setText(appCompatTextView2.getResources().getString(R.string.investing_components_stat_invested));
        appCompatTextView2.setTextSize(0, Views.sp((View) appCompatTextView2, 16.0f));
        BundleKt.setTypeface(appCompatTextView2, R.font.cashsans_regular);
        appCompatTextView2.setFocusableInTouchMode(false);
        this.investedLabel = appCompatTextView2;
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(context);
        appCompatTextView3.setTextSize(0, this.amountSharedTextSizeInPx);
        BundleKt.setTypeface(appCompatTextView3, R.font.cashsans_medium);
        appCompatTextView3.setFocusableInTouchMode(false);
        this.netProfitAmount = appCompatTextView3;
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(context);
        appCompatTextView4.setText(appCompatTextView4.getResources().getString(R.string.investing_components_stat_total_gain));
        appCompatTextView4.setTextSize(0, Views.sp((View) appCompatTextView4, 16.0f));
        BundleKt.setTypeface(appCompatTextView4, R.font.cashsans_regular);
        appCompatTextView4.setFocusableInTouchMode(false);
        this.netProfitLabel = appCompatTextView4;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPaddingRelative(getDip(24), linearLayout.getPaddingTop(), getDip(24), linearLayout.getPaddingBottom());
        linearLayout.setShowDividers(z2 ? 1 : 5);
        final int i3 = colorPalette.hairline;
        linearLayout.setDividerDrawable(new DividerDrawable(i3) { // from class: com.squareup.cash.investing.components.MooncakeMyInvestmentsTileView$statsContainer$1$1
            @Override // com.squareup.cash.ui.drawable.DividerDrawable, android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
            public final int getIntrinsicHeight() {
                return MooncakeMyInvestmentsTileView.this.getDip(1);
            }
        });
        this.statsContainer = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setFocusableInTouchMode(true);
        this.investedLayout = linearLayout2;
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout3.setFocusableInTouchMode(true);
        this.netProfitLayout = linearLayout3;
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        ArcadeBordersKt.m3579setArcadeTileRowBorderziNgDLE(composeView, true, z2);
        this.border = composeView;
        this.roundedBottomCorners = z2;
        int i4 = colorPalette.background;
        float f = this.density * 16.0f;
        float f2 = z2 ? f : RecyclerView.DECELERATION_RATE;
        GradientDrawable gradientDrawable = new GradientDrawable();
        final int i5 = 2;
        final int i6 = 3;
        final int i7 = 4;
        final int i8 = 6;
        gradientDrawable.setCornerRadii(new float[]{f, f, f, f, f2, f2, f2, f2});
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i4);
        setBackground(gradientDrawable);
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new MyFirstConfigurationView$$ExternalSyntheticLambda2(13));
        leftTo.rightTo(1, new MyFirstConfigurationView$$ExternalSyntheticLambda2(14));
        ContourLayout.layoutBy$default(this, investingTileHeaderView, leftTo, ContourLayout.topTo(new MyFirstConfigurationView$$ExternalSyntheticLambda2(15)));
        final int i9 = 0;
        ByteArrayProtoReader32 leftTo2 = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.investing.components.MooncakeMyInvestmentsTileView$$ExternalSyntheticLambda4
            public final /* synthetic */ MooncakeMyInvestmentsTileView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i10 = i9;
                MooncakeMyInvestmentsTileView mooncakeMyInvestmentsTileView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i10) {
                    case 0:
                        int i11 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        return new XInt(mooncakeMyInvestmentsTileView.getDip(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 1:
                        int i12 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(mooncakeMyInvestmentsTileView.m3814getYdipdBGyhoQ(26) + mooncakeMyInvestmentsTileView.m3810bottomdBGyhoQ(mooncakeMyInvestmentsTileView.investedLayout));
                    case 2:
                        int i13 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt((((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() / 2) - mooncakeMyInvestmentsTileView.getDip(2));
                    case 3:
                        int i14 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(mooncakeMyInvestmentsTileView.getDip(12) + mooncakeMyInvestmentsTileView.m3810bottomdBGyhoQ(mooncakeMyInvestmentsTileView.title));
                    case 4:
                        int i15 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(mooncakeMyInvestmentsTileView.getDip(24) + (((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() / 2));
                    case 5:
                        int i16 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - mooncakeMyInvestmentsTileView.getDip(24));
                    default:
                        int i17 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(mooncakeMyInvestmentsTileView.m3819topdBGyhoQ(mooncakeMyInvestmentsTileView.investedLayout));
                }
            }
        });
        leftTo2.rightTo(1, new Function1(this) { // from class: com.squareup.cash.investing.components.MooncakeMyInvestmentsTileView$$ExternalSyntheticLambda4
            public final /* synthetic */ MooncakeMyInvestmentsTileView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i10 = i5;
                MooncakeMyInvestmentsTileView mooncakeMyInvestmentsTileView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i10) {
                    case 0:
                        int i11 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        return new XInt(mooncakeMyInvestmentsTileView.getDip(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 1:
                        int i12 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(mooncakeMyInvestmentsTileView.m3814getYdipdBGyhoQ(26) + mooncakeMyInvestmentsTileView.m3810bottomdBGyhoQ(mooncakeMyInvestmentsTileView.investedLayout));
                    case 2:
                        int i13 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt((((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() / 2) - mooncakeMyInvestmentsTileView.getDip(2));
                    case 3:
                        int i14 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(mooncakeMyInvestmentsTileView.getDip(12) + mooncakeMyInvestmentsTileView.m3810bottomdBGyhoQ(mooncakeMyInvestmentsTileView.title));
                    case 4:
                        int i15 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(mooncakeMyInvestmentsTileView.getDip(24) + (((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() / 2));
                    case 5:
                        int i16 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - mooncakeMyInvestmentsTileView.getDip(24));
                    default:
                        int i17 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(mooncakeMyInvestmentsTileView.m3819topdBGyhoQ(mooncakeMyInvestmentsTileView.investedLayout));
                }
            }
        });
        ContourLayout.layoutBy$default(this, linearLayout2, leftTo2, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.investing.components.MooncakeMyInvestmentsTileView$$ExternalSyntheticLambda4
            public final /* synthetic */ MooncakeMyInvestmentsTileView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i10 = i6;
                MooncakeMyInvestmentsTileView mooncakeMyInvestmentsTileView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i10) {
                    case 0:
                        int i11 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        return new XInt(mooncakeMyInvestmentsTileView.getDip(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 1:
                        int i12 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(mooncakeMyInvestmentsTileView.m3814getYdipdBGyhoQ(26) + mooncakeMyInvestmentsTileView.m3810bottomdBGyhoQ(mooncakeMyInvestmentsTileView.investedLayout));
                    case 2:
                        int i13 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt((((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() / 2) - mooncakeMyInvestmentsTileView.getDip(2));
                    case 3:
                        int i14 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(mooncakeMyInvestmentsTileView.getDip(12) + mooncakeMyInvestmentsTileView.m3810bottomdBGyhoQ(mooncakeMyInvestmentsTileView.title));
                    case 4:
                        int i15 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(mooncakeMyInvestmentsTileView.getDip(24) + (((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() / 2));
                    case 5:
                        int i16 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - mooncakeMyInvestmentsTileView.getDip(24));
                    default:
                        int i17 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(mooncakeMyInvestmentsTileView.m3819topdBGyhoQ(mooncakeMyInvestmentsTileView.investedLayout));
                }
            }
        }));
        ByteArrayProtoReader32 leftTo3 = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.investing.components.MooncakeMyInvestmentsTileView$$ExternalSyntheticLambda4
            public final /* synthetic */ MooncakeMyInvestmentsTileView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i10 = i7;
                MooncakeMyInvestmentsTileView mooncakeMyInvestmentsTileView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i10) {
                    case 0:
                        int i11 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        return new XInt(mooncakeMyInvestmentsTileView.getDip(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 1:
                        int i12 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(mooncakeMyInvestmentsTileView.m3814getYdipdBGyhoQ(26) + mooncakeMyInvestmentsTileView.m3810bottomdBGyhoQ(mooncakeMyInvestmentsTileView.investedLayout));
                    case 2:
                        int i13 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt((((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() / 2) - mooncakeMyInvestmentsTileView.getDip(2));
                    case 3:
                        int i14 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(mooncakeMyInvestmentsTileView.getDip(12) + mooncakeMyInvestmentsTileView.m3810bottomdBGyhoQ(mooncakeMyInvestmentsTileView.title));
                    case 4:
                        int i15 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(mooncakeMyInvestmentsTileView.getDip(24) + (((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() / 2));
                    case 5:
                        int i16 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - mooncakeMyInvestmentsTileView.getDip(24));
                    default:
                        int i17 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(mooncakeMyInvestmentsTileView.m3819topdBGyhoQ(mooncakeMyInvestmentsTileView.investedLayout));
                }
            }
        });
        final int i10 = 5;
        leftTo3.rightTo(1, new Function1(this) { // from class: com.squareup.cash.investing.components.MooncakeMyInvestmentsTileView$$ExternalSyntheticLambda4
            public final /* synthetic */ MooncakeMyInvestmentsTileView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i102 = i10;
                MooncakeMyInvestmentsTileView mooncakeMyInvestmentsTileView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i102) {
                    case 0:
                        int i11 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        return new XInt(mooncakeMyInvestmentsTileView.getDip(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 1:
                        int i12 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(mooncakeMyInvestmentsTileView.m3814getYdipdBGyhoQ(26) + mooncakeMyInvestmentsTileView.m3810bottomdBGyhoQ(mooncakeMyInvestmentsTileView.investedLayout));
                    case 2:
                        int i13 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt((((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() / 2) - mooncakeMyInvestmentsTileView.getDip(2));
                    case 3:
                        int i14 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(mooncakeMyInvestmentsTileView.getDip(12) + mooncakeMyInvestmentsTileView.m3810bottomdBGyhoQ(mooncakeMyInvestmentsTileView.title));
                    case 4:
                        int i15 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(mooncakeMyInvestmentsTileView.getDip(24) + (((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() / 2));
                    case 5:
                        int i16 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - mooncakeMyInvestmentsTileView.getDip(24));
                    default:
                        int i17 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(mooncakeMyInvestmentsTileView.m3819topdBGyhoQ(mooncakeMyInvestmentsTileView.investedLayout));
                }
            }
        });
        ContourLayout.layoutBy$default(this, linearLayout3, leftTo3, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.investing.components.MooncakeMyInvestmentsTileView$$ExternalSyntheticLambda4
            public final /* synthetic */ MooncakeMyInvestmentsTileView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i102 = i8;
                MooncakeMyInvestmentsTileView mooncakeMyInvestmentsTileView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i102) {
                    case 0:
                        int i11 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        return new XInt(mooncakeMyInvestmentsTileView.getDip(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 1:
                        int i12 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(mooncakeMyInvestmentsTileView.m3814getYdipdBGyhoQ(26) + mooncakeMyInvestmentsTileView.m3810bottomdBGyhoQ(mooncakeMyInvestmentsTileView.investedLayout));
                    case 2:
                        int i13 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt((((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() / 2) - mooncakeMyInvestmentsTileView.getDip(2));
                    case 3:
                        int i14 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(mooncakeMyInvestmentsTileView.getDip(12) + mooncakeMyInvestmentsTileView.m3810bottomdBGyhoQ(mooncakeMyInvestmentsTileView.title));
                    case 4:
                        int i15 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(mooncakeMyInvestmentsTileView.getDip(24) + (((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() / 2));
                    case 5:
                        int i16 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - mooncakeMyInvestmentsTileView.getDip(24));
                    default:
                        int i17 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(mooncakeMyInvestmentsTileView.m3819topdBGyhoQ(mooncakeMyInvestmentsTileView.investedLayout));
                }
            }
        }));
        ContourLayout.layoutBy$default(this, linearLayout, ContourLayout.matchParentX(0, 0), ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.investing.components.MooncakeMyInvestmentsTileView$$ExternalSyntheticLambda4
            public final /* synthetic */ MooncakeMyInvestmentsTileView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i102 = i2;
                MooncakeMyInvestmentsTileView mooncakeMyInvestmentsTileView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i102) {
                    case 0:
                        int i11 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        return new XInt(mooncakeMyInvestmentsTileView.getDip(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 1:
                        int i12 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(mooncakeMyInvestmentsTileView.m3814getYdipdBGyhoQ(26) + mooncakeMyInvestmentsTileView.m3810bottomdBGyhoQ(mooncakeMyInvestmentsTileView.investedLayout));
                    case 2:
                        int i13 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt((((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() / 2) - mooncakeMyInvestmentsTileView.getDip(2));
                    case 3:
                        int i14 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(mooncakeMyInvestmentsTileView.getDip(12) + mooncakeMyInvestmentsTileView.m3810bottomdBGyhoQ(mooncakeMyInvestmentsTileView.title));
                    case 4:
                        int i15 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(mooncakeMyInvestmentsTileView.getDip(24) + (((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() / 2));
                    case 5:
                        int i16 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - mooncakeMyInvestmentsTileView.getDip(24));
                    default:
                        int i17 = MooncakeMyInvestmentsTileView.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(mooncakeMyInvestmentsTileView.m3819topdBGyhoQ(mooncakeMyInvestmentsTileView.investedLayout));
                }
            }
        }));
        if (z) {
            ContourLayout.layoutBy$default(this, composeView, ContourLayout.matchParentX(0, 0), ContourLayout.matchParentY$default(this));
        }
        contourHeightOf(new SliderKt$$ExternalSyntheticLambda5(this, z2, i8));
    }

    @Override // com.squareup.contour.ContourLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = (getWidth() / 2) - getDip(26);
        int width2 = (getWidth() / 2) - getDip(48);
        AppCompatTextView appCompatTextView = this.investedAmount;
        appCompatTextView.measure(0, 0);
        AppCompatTextView appCompatTextView2 = this.netProfitAmount;
        appCompatTextView2.measure(0, 0);
        boolean z2 = false;
        while (true) {
            if (appCompatTextView.getMeasuredWidth() <= width && appCompatTextView2.getMeasuredWidth() <= width2) {
                break;
            }
            float dip = this.amountSharedTextSizeInPx - getDip(1);
            this.amountSharedTextSizeInPx = dip;
            appCompatTextView.setTextSize(0, dip);
            appCompatTextView2.setTextSize(0, this.amountSharedTextSizeInPx);
            appCompatTextView.measure(0, 0);
            appCompatTextView2.measure(0, 0);
            z2 = true;
        }
        if (z2) {
            post(new KnotView$$ExternalSyntheticLambda1(this, 27));
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public final void setActionClickListener(Function0<Unit> function0) {
        this.actionClickListener = function0;
    }

    public final void setRoundedBottomCorners(boolean z) {
        this.statsContainer.setShowDividers(this.roundedBottomCorners ? 1 : 5);
        ArcadeBordersKt.m3579setArcadeTileRowBorderziNgDLE(this.border, true, this.roundedBottomCorners);
        this.roundedBottomCorners = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MooncakeMyInvestmentsTileView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MooncakeMyInvestmentsTileView(Context context) {
        this(context, null, 14);
        context.getClass();
    }
}
