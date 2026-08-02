package com.squareup.cash.investing.components.categories;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.os.BundleKt;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.investing.components.MyFirstConfigurationView$$ExternalSyntheticLambda2;
import com.squareup.cash.investingcrypto.components.common.drawables.ContentMaskDrawable;
import com.squareup.cash.investingcrypto.components.common.drawables.InvestingCryptoDrawables$rippleOnPress$ripple$1;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.protos.franklin.common.SyncInvestmentCategory;
import com.squareup.util.android.Views;
import com.squareup.wire.ByteArrayProtoReader32;
import defpackage.JsonLogicResult;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http2.Huffman;
import okio.AsyncTimeout;

/* loaded from: classes6.dex */
public final class InvestingCategoryFilterPill extends ContourLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final Drawable arrowDown;
    public final Drawable arrowUp;
    public final AppCompatTextView label;
    public final ColorPalette palette;
    public final AppCompatImageView postfixIcon;
    public final AppCompatImageView prefixIcon;
    public final AppCompatTextView selectedCountBadge;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SyncInvestmentCategory.PrefixIcon.values().length];
            try {
                AsyncTimeout.Companion companion = SyncInvestmentCategory.PrefixIcon.Companion;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AsyncTimeout.Companion companion2 = SyncInvestmentCategory.PrefixIcon.Companion;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AsyncTimeout.Companion companion3 = SyncInvestmentCategory.PrefixIcon.Companion;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingCategoryFilterPill(Context context) {
        super(context);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        this.palette = colorPalette;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setBackground(createOutlineDrawable(Integer.valueOf(colorPalette.white)));
        appCompatTextView.setGravity(17);
        BundleKt.setTypeface(appCompatTextView, R.font.cashsans_medium);
        appCompatTextView.setText("0");
        final int i = 0;
        appCompatTextView.setTextSize(0, Views.sp((View) appCompatTextView, 12.0f));
        final int i2 = 8;
        appCompatTextView.setVisibility(8);
        this.selectedCountBadge = appCompatTextView;
        Drawable drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.arrow_up, null);
        this.arrowUp = drawableCompat;
        this.arrowDown = PlatformKt.getDrawableCompat(context, R.drawable.arrow_down, null);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setImageDrawable(drawableCompat);
        appCompatImageView.setVisibility(8);
        this.prefixIcon = appCompatImageView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        BundleKt.setTypeface(appCompatTextView2, R.font.cashsans_medium);
        appCompatTextView2.setTextSize(0, Views.sp((View) appCompatTextView2, 16.0f));
        this.label = appCompatTextView2;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setImageDrawable(PlatformKt.getDrawableCompat(context, R.drawable.investing_components_filter_chevron_down, Integer.valueOf(colorPalette.investing)));
        this.postfixIcon = appCompatImageView2;
        setBackground(createOutlineDrawable(null));
        contourWidthOf(new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingCategoryFilterPill$$ExternalSyntheticLambda0
            public final /* synthetic */ InvestingCategoryFilterPill f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3;
                int m3813getXdipTENr5nQ;
                int i4 = i;
                InvestingCategoryFilterPill investingCategoryFilterPill = this.f$0;
                switch (i4) {
                    case 0:
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(14) + investingCategoryFilterPill.m3818rightTENr5nQ(investingCategoryFilterPill.postfixIcon));
                    case 1:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i5 = InvestingCategoryFilterPill.$r8$clinit;
                        layoutSpec.getClass();
                        AppCompatImageView appCompatImageView3 = investingCategoryFilterPill.prefixIcon;
                        AppCompatTextView appCompatTextView3 = investingCategoryFilterPill.selectedCountBadge;
                        if (appCompatImageView3.getVisibility() == 0) {
                            i3 = investingCategoryFilterPill.m3818rightTENr5nQ(appCompatImageView3);
                            m3813getXdipTENr5nQ = investingCategoryFilterPill.m3813getXdipTENr5nQ(8);
                        } else if (appCompatTextView3.getVisibility() == 0) {
                            i3 = investingCategoryFilterPill.m3818rightTENr5nQ(appCompatTextView3);
                            m3813getXdipTENr5nQ = investingCategoryFilterPill.m3813getXdipTENr5nQ(6);
                        } else {
                            i3 = layoutSpec.getParent().padding().left;
                            m3813getXdipTENr5nQ = investingCategoryFilterPill.m3813getXdipTENr5nQ(16);
                        }
                        return new XInt(m3813getXdipTENr5nQ + i3);
                    case 2:
                        int i6 = InvestingCategoryFilterPill.$r8$clinit;
                        return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj) - investingCategoryFilterPill.m3814getYdipdBGyhoQ(1));
                    case 3:
                        int i7 = InvestingCategoryFilterPill.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(8) + investingCategoryFilterPill.m3818rightTENr5nQ(investingCategoryFilterPill.label));
                    case 4:
                        int i8 = InvestingCategoryFilterPill.$r8$clinit;
                        return new YInt(investingCategoryFilterPill.m3814getYdipdBGyhoQ(32));
                    case 5:
                        int i9 = InvestingCategoryFilterPill.$r8$clinit;
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(6) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 6:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        int i10 = InvestingCategoryFilterPill.$r8$clinit;
                        layoutSpec2.getClass();
                        return new XInt(((Huffman.Node) layoutSpec2.getParent().lastAppBecameInvisibleRealtimeMillis).resolve() - investingCategoryFilterPill.m3813getXdipTENr5nQ(12));
                    case 7:
                        ContourLayout.LayoutSpec layoutSpec3 = (ContourLayout.LayoutSpec) obj;
                        int i11 = InvestingCategoryFilterPill.$r8$clinit;
                        layoutSpec3.getClass();
                        return new YInt(((Huffman.Node) layoutSpec3.getParent().lastAppBecameInvisibleRealtimeMillis).resolve() - investingCategoryFilterPill.m3814getYdipdBGyhoQ(12));
                    default:
                        int i12 = InvestingCategoryFilterPill.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(6) + investingCategoryFilterPill.m3818rightTENr5nQ(investingCategoryFilterPill.selectedCountBadge));
                }
            }
        });
        final int i3 = 4;
        contourHeightOf(new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingCategoryFilterPill$$ExternalSyntheticLambda0
            public final /* synthetic */ InvestingCategoryFilterPill f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32;
                int m3813getXdipTENr5nQ;
                int i4 = i3;
                InvestingCategoryFilterPill investingCategoryFilterPill = this.f$0;
                switch (i4) {
                    case 0:
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(14) + investingCategoryFilterPill.m3818rightTENr5nQ(investingCategoryFilterPill.postfixIcon));
                    case 1:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i5 = InvestingCategoryFilterPill.$r8$clinit;
                        layoutSpec.getClass();
                        AppCompatImageView appCompatImageView3 = investingCategoryFilterPill.prefixIcon;
                        AppCompatTextView appCompatTextView3 = investingCategoryFilterPill.selectedCountBadge;
                        if (appCompatImageView3.getVisibility() == 0) {
                            i32 = investingCategoryFilterPill.m3818rightTENr5nQ(appCompatImageView3);
                            m3813getXdipTENr5nQ = investingCategoryFilterPill.m3813getXdipTENr5nQ(8);
                        } else if (appCompatTextView3.getVisibility() == 0) {
                            i32 = investingCategoryFilterPill.m3818rightTENr5nQ(appCompatTextView3);
                            m3813getXdipTENr5nQ = investingCategoryFilterPill.m3813getXdipTENr5nQ(6);
                        } else {
                            i32 = layoutSpec.getParent().padding().left;
                            m3813getXdipTENr5nQ = investingCategoryFilterPill.m3813getXdipTENr5nQ(16);
                        }
                        return new XInt(m3813getXdipTENr5nQ + i32);
                    case 2:
                        int i6 = InvestingCategoryFilterPill.$r8$clinit;
                        return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj) - investingCategoryFilterPill.m3814getYdipdBGyhoQ(1));
                    case 3:
                        int i7 = InvestingCategoryFilterPill.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(8) + investingCategoryFilterPill.m3818rightTENr5nQ(investingCategoryFilterPill.label));
                    case 4:
                        int i8 = InvestingCategoryFilterPill.$r8$clinit;
                        return new YInt(investingCategoryFilterPill.m3814getYdipdBGyhoQ(32));
                    case 5:
                        int i9 = InvestingCategoryFilterPill.$r8$clinit;
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(6) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 6:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        int i10 = InvestingCategoryFilterPill.$r8$clinit;
                        layoutSpec2.getClass();
                        return new XInt(((Huffman.Node) layoutSpec2.getParent().lastAppBecameInvisibleRealtimeMillis).resolve() - investingCategoryFilterPill.m3813getXdipTENr5nQ(12));
                    case 7:
                        ContourLayout.LayoutSpec layoutSpec3 = (ContourLayout.LayoutSpec) obj;
                        int i11 = InvestingCategoryFilterPill.$r8$clinit;
                        layoutSpec3.getClass();
                        return new YInt(((Huffman.Node) layoutSpec3.getParent().lastAppBecameInvisibleRealtimeMillis).resolve() - investingCategoryFilterPill.m3814getYdipdBGyhoQ(12));
                    default:
                        int i12 = InvestingCategoryFilterPill.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(6) + investingCategoryFilterPill.m3818rightTENr5nQ(investingCategoryFilterPill.selectedCountBadge));
                }
            }
        });
        final int i4 = 5;
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingCategoryFilterPill$$ExternalSyntheticLambda0
            public final /* synthetic */ InvestingCategoryFilterPill f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32;
                int m3813getXdipTENr5nQ;
                int i42 = i4;
                InvestingCategoryFilterPill investingCategoryFilterPill = this.f$0;
                switch (i42) {
                    case 0:
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(14) + investingCategoryFilterPill.m3818rightTENr5nQ(investingCategoryFilterPill.postfixIcon));
                    case 1:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i5 = InvestingCategoryFilterPill.$r8$clinit;
                        layoutSpec.getClass();
                        AppCompatImageView appCompatImageView3 = investingCategoryFilterPill.prefixIcon;
                        AppCompatTextView appCompatTextView3 = investingCategoryFilterPill.selectedCountBadge;
                        if (appCompatImageView3.getVisibility() == 0) {
                            i32 = investingCategoryFilterPill.m3818rightTENr5nQ(appCompatImageView3);
                            m3813getXdipTENr5nQ = investingCategoryFilterPill.m3813getXdipTENr5nQ(8);
                        } else if (appCompatTextView3.getVisibility() == 0) {
                            i32 = investingCategoryFilterPill.m3818rightTENr5nQ(appCompatTextView3);
                            m3813getXdipTENr5nQ = investingCategoryFilterPill.m3813getXdipTENr5nQ(6);
                        } else {
                            i32 = layoutSpec.getParent().padding().left;
                            m3813getXdipTENr5nQ = investingCategoryFilterPill.m3813getXdipTENr5nQ(16);
                        }
                        return new XInt(m3813getXdipTENr5nQ + i32);
                    case 2:
                        int i6 = InvestingCategoryFilterPill.$r8$clinit;
                        return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj) - investingCategoryFilterPill.m3814getYdipdBGyhoQ(1));
                    case 3:
                        int i7 = InvestingCategoryFilterPill.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(8) + investingCategoryFilterPill.m3818rightTENr5nQ(investingCategoryFilterPill.label));
                    case 4:
                        int i8 = InvestingCategoryFilterPill.$r8$clinit;
                        return new YInt(investingCategoryFilterPill.m3814getYdipdBGyhoQ(32));
                    case 5:
                        int i9 = InvestingCategoryFilterPill.$r8$clinit;
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(6) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 6:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        int i10 = InvestingCategoryFilterPill.$r8$clinit;
                        layoutSpec2.getClass();
                        return new XInt(((Huffman.Node) layoutSpec2.getParent().lastAppBecameInvisibleRealtimeMillis).resolve() - investingCategoryFilterPill.m3813getXdipTENr5nQ(12));
                    case 7:
                        ContourLayout.LayoutSpec layoutSpec3 = (ContourLayout.LayoutSpec) obj;
                        int i11 = InvestingCategoryFilterPill.$r8$clinit;
                        layoutSpec3.getClass();
                        return new YInt(((Huffman.Node) layoutSpec3.getParent().lastAppBecameInvisibleRealtimeMillis).resolve() - investingCategoryFilterPill.m3814getYdipdBGyhoQ(12));
                    default:
                        int i12 = InvestingCategoryFilterPill.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(6) + investingCategoryFilterPill.m3818rightTENr5nQ(investingCategoryFilterPill.selectedCountBadge));
                }
            }
        });
        final int i5 = 6;
        Function1 function1 = new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingCategoryFilterPill$$ExternalSyntheticLambda0
            public final /* synthetic */ InvestingCategoryFilterPill f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32;
                int m3813getXdipTENr5nQ;
                int i42 = i5;
                InvestingCategoryFilterPill investingCategoryFilterPill = this.f$0;
                switch (i42) {
                    case 0:
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(14) + investingCategoryFilterPill.m3818rightTENr5nQ(investingCategoryFilterPill.postfixIcon));
                    case 1:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i52 = InvestingCategoryFilterPill.$r8$clinit;
                        layoutSpec.getClass();
                        AppCompatImageView appCompatImageView3 = investingCategoryFilterPill.prefixIcon;
                        AppCompatTextView appCompatTextView3 = investingCategoryFilterPill.selectedCountBadge;
                        if (appCompatImageView3.getVisibility() == 0) {
                            i32 = investingCategoryFilterPill.m3818rightTENr5nQ(appCompatImageView3);
                            m3813getXdipTENr5nQ = investingCategoryFilterPill.m3813getXdipTENr5nQ(8);
                        } else if (appCompatTextView3.getVisibility() == 0) {
                            i32 = investingCategoryFilterPill.m3818rightTENr5nQ(appCompatTextView3);
                            m3813getXdipTENr5nQ = investingCategoryFilterPill.m3813getXdipTENr5nQ(6);
                        } else {
                            i32 = layoutSpec.getParent().padding().left;
                            m3813getXdipTENr5nQ = investingCategoryFilterPill.m3813getXdipTENr5nQ(16);
                        }
                        return new XInt(m3813getXdipTENr5nQ + i32);
                    case 2:
                        int i6 = InvestingCategoryFilterPill.$r8$clinit;
                        return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj) - investingCategoryFilterPill.m3814getYdipdBGyhoQ(1));
                    case 3:
                        int i7 = InvestingCategoryFilterPill.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(8) + investingCategoryFilterPill.m3818rightTENr5nQ(investingCategoryFilterPill.label));
                    case 4:
                        int i8 = InvestingCategoryFilterPill.$r8$clinit;
                        return new YInt(investingCategoryFilterPill.m3814getYdipdBGyhoQ(32));
                    case 5:
                        int i9 = InvestingCategoryFilterPill.$r8$clinit;
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(6) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 6:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        int i10 = InvestingCategoryFilterPill.$r8$clinit;
                        layoutSpec2.getClass();
                        return new XInt(((Huffman.Node) layoutSpec2.getParent().lastAppBecameInvisibleRealtimeMillis).resolve() - investingCategoryFilterPill.m3813getXdipTENr5nQ(12));
                    case 7:
                        ContourLayout.LayoutSpec layoutSpec3 = (ContourLayout.LayoutSpec) obj;
                        int i11 = InvestingCategoryFilterPill.$r8$clinit;
                        layoutSpec3.getClass();
                        return new YInt(((Huffman.Node) layoutSpec3.getParent().lastAppBecameInvisibleRealtimeMillis).resolve() - investingCategoryFilterPill.m3814getYdipdBGyhoQ(12));
                    default:
                        int i12 = InvestingCategoryFilterPill.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(6) + investingCategoryFilterPill.m3818rightTENr5nQ(investingCategoryFilterPill.selectedCountBadge));
                }
            }
        };
        final int i6 = 1;
        leftTo.widthOf(1, function1);
        ByteArrayProtoReader32 centerVerticallyTo = ContourLayout.centerVerticallyTo(new MyFirstConfigurationView$$ExternalSyntheticLambda2(26));
        final int i7 = 7;
        centerVerticallyTo.heightOf(1, new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingCategoryFilterPill$$ExternalSyntheticLambda0
            public final /* synthetic */ InvestingCategoryFilterPill f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32;
                int m3813getXdipTENr5nQ;
                int i42 = i7;
                InvestingCategoryFilterPill investingCategoryFilterPill = this.f$0;
                switch (i42) {
                    case 0:
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(14) + investingCategoryFilterPill.m3818rightTENr5nQ(investingCategoryFilterPill.postfixIcon));
                    case 1:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i52 = InvestingCategoryFilterPill.$r8$clinit;
                        layoutSpec.getClass();
                        AppCompatImageView appCompatImageView3 = investingCategoryFilterPill.prefixIcon;
                        AppCompatTextView appCompatTextView3 = investingCategoryFilterPill.selectedCountBadge;
                        if (appCompatImageView3.getVisibility() == 0) {
                            i32 = investingCategoryFilterPill.m3818rightTENr5nQ(appCompatImageView3);
                            m3813getXdipTENr5nQ = investingCategoryFilterPill.m3813getXdipTENr5nQ(8);
                        } else if (appCompatTextView3.getVisibility() == 0) {
                            i32 = investingCategoryFilterPill.m3818rightTENr5nQ(appCompatTextView3);
                            m3813getXdipTENr5nQ = investingCategoryFilterPill.m3813getXdipTENr5nQ(6);
                        } else {
                            i32 = layoutSpec.getParent().padding().left;
                            m3813getXdipTENr5nQ = investingCategoryFilterPill.m3813getXdipTENr5nQ(16);
                        }
                        return new XInt(m3813getXdipTENr5nQ + i32);
                    case 2:
                        int i62 = InvestingCategoryFilterPill.$r8$clinit;
                        return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj) - investingCategoryFilterPill.m3814getYdipdBGyhoQ(1));
                    case 3:
                        int i72 = InvestingCategoryFilterPill.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(8) + investingCategoryFilterPill.m3818rightTENr5nQ(investingCategoryFilterPill.label));
                    case 4:
                        int i8 = InvestingCategoryFilterPill.$r8$clinit;
                        return new YInt(investingCategoryFilterPill.m3814getYdipdBGyhoQ(32));
                    case 5:
                        int i9 = InvestingCategoryFilterPill.$r8$clinit;
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(6) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 6:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        int i10 = InvestingCategoryFilterPill.$r8$clinit;
                        layoutSpec2.getClass();
                        return new XInt(((Huffman.Node) layoutSpec2.getParent().lastAppBecameInvisibleRealtimeMillis).resolve() - investingCategoryFilterPill.m3813getXdipTENr5nQ(12));
                    case 7:
                        ContourLayout.LayoutSpec layoutSpec3 = (ContourLayout.LayoutSpec) obj;
                        int i11 = InvestingCategoryFilterPill.$r8$clinit;
                        layoutSpec3.getClass();
                        return new YInt(((Huffman.Node) layoutSpec3.getParent().lastAppBecameInvisibleRealtimeMillis).resolve() - investingCategoryFilterPill.m3814getYdipdBGyhoQ(12));
                    default:
                        int i12 = InvestingCategoryFilterPill.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(6) + investingCategoryFilterPill.m3818rightTENr5nQ(investingCategoryFilterPill.selectedCountBadge));
                }
            }
        });
        ContourLayout.layoutBy$default(this, appCompatTextView, leftTo, centerVerticallyTo);
        ContourLayout.layoutBy$default(this, appCompatImageView, ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingCategoryFilterPill$$ExternalSyntheticLambda0
            public final /* synthetic */ InvestingCategoryFilterPill f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32;
                int m3813getXdipTENr5nQ;
                int i42 = i2;
                InvestingCategoryFilterPill investingCategoryFilterPill = this.f$0;
                switch (i42) {
                    case 0:
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(14) + investingCategoryFilterPill.m3818rightTENr5nQ(investingCategoryFilterPill.postfixIcon));
                    case 1:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i52 = InvestingCategoryFilterPill.$r8$clinit;
                        layoutSpec.getClass();
                        AppCompatImageView appCompatImageView3 = investingCategoryFilterPill.prefixIcon;
                        AppCompatTextView appCompatTextView3 = investingCategoryFilterPill.selectedCountBadge;
                        if (appCompatImageView3.getVisibility() == 0) {
                            i32 = investingCategoryFilterPill.m3818rightTENr5nQ(appCompatImageView3);
                            m3813getXdipTENr5nQ = investingCategoryFilterPill.m3813getXdipTENr5nQ(8);
                        } else if (appCompatTextView3.getVisibility() == 0) {
                            i32 = investingCategoryFilterPill.m3818rightTENr5nQ(appCompatTextView3);
                            m3813getXdipTENr5nQ = investingCategoryFilterPill.m3813getXdipTENr5nQ(6);
                        } else {
                            i32 = layoutSpec.getParent().padding().left;
                            m3813getXdipTENr5nQ = investingCategoryFilterPill.m3813getXdipTENr5nQ(16);
                        }
                        return new XInt(m3813getXdipTENr5nQ + i32);
                    case 2:
                        int i62 = InvestingCategoryFilterPill.$r8$clinit;
                        return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj) - investingCategoryFilterPill.m3814getYdipdBGyhoQ(1));
                    case 3:
                        int i72 = InvestingCategoryFilterPill.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(8) + investingCategoryFilterPill.m3818rightTENr5nQ(investingCategoryFilterPill.label));
                    case 4:
                        int i8 = InvestingCategoryFilterPill.$r8$clinit;
                        return new YInt(investingCategoryFilterPill.m3814getYdipdBGyhoQ(32));
                    case 5:
                        int i9 = InvestingCategoryFilterPill.$r8$clinit;
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(6) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 6:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        int i10 = InvestingCategoryFilterPill.$r8$clinit;
                        layoutSpec2.getClass();
                        return new XInt(((Huffman.Node) layoutSpec2.getParent().lastAppBecameInvisibleRealtimeMillis).resolve() - investingCategoryFilterPill.m3813getXdipTENr5nQ(12));
                    case 7:
                        ContourLayout.LayoutSpec layoutSpec3 = (ContourLayout.LayoutSpec) obj;
                        int i11 = InvestingCategoryFilterPill.$r8$clinit;
                        layoutSpec3.getClass();
                        return new YInt(((Huffman.Node) layoutSpec3.getParent().lastAppBecameInvisibleRealtimeMillis).resolve() - investingCategoryFilterPill.m3814getYdipdBGyhoQ(12));
                    default:
                        int i12 = InvestingCategoryFilterPill.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(6) + investingCategoryFilterPill.m3818rightTENr5nQ(investingCategoryFilterPill.selectedCountBadge));
                }
            }
        }), ContourLayout.centerVerticallyTo(new MyFirstConfigurationView$$ExternalSyntheticLambda2(27)));
        final int i8 = 2;
        ContourLayout.layoutBy$default(this, appCompatTextView2, ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingCategoryFilterPill$$ExternalSyntheticLambda0
            public final /* synthetic */ InvestingCategoryFilterPill f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32;
                int m3813getXdipTENr5nQ;
                int i42 = i6;
                InvestingCategoryFilterPill investingCategoryFilterPill = this.f$0;
                switch (i42) {
                    case 0:
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(14) + investingCategoryFilterPill.m3818rightTENr5nQ(investingCategoryFilterPill.postfixIcon));
                    case 1:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i52 = InvestingCategoryFilterPill.$r8$clinit;
                        layoutSpec.getClass();
                        AppCompatImageView appCompatImageView3 = investingCategoryFilterPill.prefixIcon;
                        AppCompatTextView appCompatTextView3 = investingCategoryFilterPill.selectedCountBadge;
                        if (appCompatImageView3.getVisibility() == 0) {
                            i32 = investingCategoryFilterPill.m3818rightTENr5nQ(appCompatImageView3);
                            m3813getXdipTENr5nQ = investingCategoryFilterPill.m3813getXdipTENr5nQ(8);
                        } else if (appCompatTextView3.getVisibility() == 0) {
                            i32 = investingCategoryFilterPill.m3818rightTENr5nQ(appCompatTextView3);
                            m3813getXdipTENr5nQ = investingCategoryFilterPill.m3813getXdipTENr5nQ(6);
                        } else {
                            i32 = layoutSpec.getParent().padding().left;
                            m3813getXdipTENr5nQ = investingCategoryFilterPill.m3813getXdipTENr5nQ(16);
                        }
                        return new XInt(m3813getXdipTENr5nQ + i32);
                    case 2:
                        int i62 = InvestingCategoryFilterPill.$r8$clinit;
                        return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj) - investingCategoryFilterPill.m3814getYdipdBGyhoQ(1));
                    case 3:
                        int i72 = InvestingCategoryFilterPill.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(8) + investingCategoryFilterPill.m3818rightTENr5nQ(investingCategoryFilterPill.label));
                    case 4:
                        int i82 = InvestingCategoryFilterPill.$r8$clinit;
                        return new YInt(investingCategoryFilterPill.m3814getYdipdBGyhoQ(32));
                    case 5:
                        int i9 = InvestingCategoryFilterPill.$r8$clinit;
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(6) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 6:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        int i10 = InvestingCategoryFilterPill.$r8$clinit;
                        layoutSpec2.getClass();
                        return new XInt(((Huffman.Node) layoutSpec2.getParent().lastAppBecameInvisibleRealtimeMillis).resolve() - investingCategoryFilterPill.m3813getXdipTENr5nQ(12));
                    case 7:
                        ContourLayout.LayoutSpec layoutSpec3 = (ContourLayout.LayoutSpec) obj;
                        int i11 = InvestingCategoryFilterPill.$r8$clinit;
                        layoutSpec3.getClass();
                        return new YInt(((Huffman.Node) layoutSpec3.getParent().lastAppBecameInvisibleRealtimeMillis).resolve() - investingCategoryFilterPill.m3814getYdipdBGyhoQ(12));
                    default:
                        int i12 = InvestingCategoryFilterPill.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(6) + investingCategoryFilterPill.m3818rightTENr5nQ(investingCategoryFilterPill.selectedCountBadge));
                }
            }
        }), ContourLayout.centerVerticallyTo(new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingCategoryFilterPill$$ExternalSyntheticLambda0
            public final /* synthetic */ InvestingCategoryFilterPill f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32;
                int m3813getXdipTENr5nQ;
                int i42 = i8;
                InvestingCategoryFilterPill investingCategoryFilterPill = this.f$0;
                switch (i42) {
                    case 0:
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(14) + investingCategoryFilterPill.m3818rightTENr5nQ(investingCategoryFilterPill.postfixIcon));
                    case 1:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i52 = InvestingCategoryFilterPill.$r8$clinit;
                        layoutSpec.getClass();
                        AppCompatImageView appCompatImageView3 = investingCategoryFilterPill.prefixIcon;
                        AppCompatTextView appCompatTextView3 = investingCategoryFilterPill.selectedCountBadge;
                        if (appCompatImageView3.getVisibility() == 0) {
                            i32 = investingCategoryFilterPill.m3818rightTENr5nQ(appCompatImageView3);
                            m3813getXdipTENr5nQ = investingCategoryFilterPill.m3813getXdipTENr5nQ(8);
                        } else if (appCompatTextView3.getVisibility() == 0) {
                            i32 = investingCategoryFilterPill.m3818rightTENr5nQ(appCompatTextView3);
                            m3813getXdipTENr5nQ = investingCategoryFilterPill.m3813getXdipTENr5nQ(6);
                        } else {
                            i32 = layoutSpec.getParent().padding().left;
                            m3813getXdipTENr5nQ = investingCategoryFilterPill.m3813getXdipTENr5nQ(16);
                        }
                        return new XInt(m3813getXdipTENr5nQ + i32);
                    case 2:
                        int i62 = InvestingCategoryFilterPill.$r8$clinit;
                        return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj) - investingCategoryFilterPill.m3814getYdipdBGyhoQ(1));
                    case 3:
                        int i72 = InvestingCategoryFilterPill.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(8) + investingCategoryFilterPill.m3818rightTENr5nQ(investingCategoryFilterPill.label));
                    case 4:
                        int i82 = InvestingCategoryFilterPill.$r8$clinit;
                        return new YInt(investingCategoryFilterPill.m3814getYdipdBGyhoQ(32));
                    case 5:
                        int i9 = InvestingCategoryFilterPill.$r8$clinit;
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(6) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 6:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        int i10 = InvestingCategoryFilterPill.$r8$clinit;
                        layoutSpec2.getClass();
                        return new XInt(((Huffman.Node) layoutSpec2.getParent().lastAppBecameInvisibleRealtimeMillis).resolve() - investingCategoryFilterPill.m3813getXdipTENr5nQ(12));
                    case 7:
                        ContourLayout.LayoutSpec layoutSpec3 = (ContourLayout.LayoutSpec) obj;
                        int i11 = InvestingCategoryFilterPill.$r8$clinit;
                        layoutSpec3.getClass();
                        return new YInt(((Huffman.Node) layoutSpec3.getParent().lastAppBecameInvisibleRealtimeMillis).resolve() - investingCategoryFilterPill.m3814getYdipdBGyhoQ(12));
                    default:
                        int i12 = InvestingCategoryFilterPill.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(6) + investingCategoryFilterPill.m3818rightTENr5nQ(investingCategoryFilterPill.selectedCountBadge));
                }
            }
        }));
        final int i9 = 3;
        ContourLayout.layoutBy$default(this, appCompatImageView2, ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingCategoryFilterPill$$ExternalSyntheticLambda0
            public final /* synthetic */ InvestingCategoryFilterPill f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32;
                int m3813getXdipTENr5nQ;
                int i42 = i9;
                InvestingCategoryFilterPill investingCategoryFilterPill = this.f$0;
                switch (i42) {
                    case 0:
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(14) + investingCategoryFilterPill.m3818rightTENr5nQ(investingCategoryFilterPill.postfixIcon));
                    case 1:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i52 = InvestingCategoryFilterPill.$r8$clinit;
                        layoutSpec.getClass();
                        AppCompatImageView appCompatImageView3 = investingCategoryFilterPill.prefixIcon;
                        AppCompatTextView appCompatTextView3 = investingCategoryFilterPill.selectedCountBadge;
                        if (appCompatImageView3.getVisibility() == 0) {
                            i32 = investingCategoryFilterPill.m3818rightTENr5nQ(appCompatImageView3);
                            m3813getXdipTENr5nQ = investingCategoryFilterPill.m3813getXdipTENr5nQ(8);
                        } else if (appCompatTextView3.getVisibility() == 0) {
                            i32 = investingCategoryFilterPill.m3818rightTENr5nQ(appCompatTextView3);
                            m3813getXdipTENr5nQ = investingCategoryFilterPill.m3813getXdipTENr5nQ(6);
                        } else {
                            i32 = layoutSpec.getParent().padding().left;
                            m3813getXdipTENr5nQ = investingCategoryFilterPill.m3813getXdipTENr5nQ(16);
                        }
                        return new XInt(m3813getXdipTENr5nQ + i32);
                    case 2:
                        int i62 = InvestingCategoryFilterPill.$r8$clinit;
                        return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj) - investingCategoryFilterPill.m3814getYdipdBGyhoQ(1));
                    case 3:
                        int i72 = InvestingCategoryFilterPill.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(8) + investingCategoryFilterPill.m3818rightTENr5nQ(investingCategoryFilterPill.label));
                    case 4:
                        int i82 = InvestingCategoryFilterPill.$r8$clinit;
                        return new YInt(investingCategoryFilterPill.m3814getYdipdBGyhoQ(32));
                    case 5:
                        int i92 = InvestingCategoryFilterPill.$r8$clinit;
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(6) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 6:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        int i10 = InvestingCategoryFilterPill.$r8$clinit;
                        layoutSpec2.getClass();
                        return new XInt(((Huffman.Node) layoutSpec2.getParent().lastAppBecameInvisibleRealtimeMillis).resolve() - investingCategoryFilterPill.m3813getXdipTENr5nQ(12));
                    case 7:
                        ContourLayout.LayoutSpec layoutSpec3 = (ContourLayout.LayoutSpec) obj;
                        int i11 = InvestingCategoryFilterPill.$r8$clinit;
                        layoutSpec3.getClass();
                        return new YInt(((Huffman.Node) layoutSpec3.getParent().lastAppBecameInvisibleRealtimeMillis).resolve() - investingCategoryFilterPill.m3814getYdipdBGyhoQ(12));
                    default:
                        int i12 = InvestingCategoryFilterPill.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(investingCategoryFilterPill.m3813getXdipTENr5nQ(6) + investingCategoryFilterPill.m3818rightTENr5nQ(investingCategoryFilterPill.selectedCountBadge));
                }
            }
        }), ContourLayout.centerVerticallyTo(new MyFirstConfigurationView$$ExternalSyntheticLambda2(25)));
    }

    public final LayerDrawable createOutlineDrawable(Integer num) {
        int i = this.palette.secondaryButtonBackground;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(Views.dip((View) this, 100.0f));
        if (num != null) {
            gradientDrawable.setColor(num.intValue());
        } else {
            gradientDrawable.setStroke(Views.dip((View) this, 2), i);
        }
        return JsonLogicResult.layerWith(gradientDrawable, new InvestingCryptoDrawables$rippleOnPress$ripple$1(ColorStateList.valueOf(i), null, new ContentMaskDrawable(gradientDrawable)));
    }
}
