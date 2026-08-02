package com.squareup.cash.investing.components.common;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.mooncake.components.AlertDialogView$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import com.squareup.util.android.Views$$ExternalSyntheticLambda0;
import com.squareup.wire.ByteArrayProtoReader32;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class InvestingTileHeaderView extends ContourLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final MooncakePillButton actionView;
    public boolean alignVertically;
    public final ColorPalette colorPalette;
    public final FigmaTextView descriptionView;
    public final FigmaTextView titleView;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class TileHeaderAction {
        public static final /* synthetic */ TileHeaderAction[] $VALUES;
        public static final TileHeaderAction CHANGE_SORTING_ORDER;
        public static final TileHeaderAction SHOW_PERFORMANCE;

        static {
            TileHeaderAction tileHeaderAction = new TileHeaderAction("CHANGE_SORTING_ORDER", 0);
            CHANGE_SORTING_ORDER = tileHeaderAction;
            TileHeaderAction tileHeaderAction2 = new TileHeaderAction("SHOW_PERFORMANCE", 1);
            SHOW_PERFORMANCE = tileHeaderAction2;
            $VALUES = new TileHeaderAction[]{tileHeaderAction, tileHeaderAction2};
        }

        public static TileHeaderAction valueOf(String str) {
            return (TileHeaderAction) Enum.valueOf(TileHeaderAction.class, str);
        }

        public static TileHeaderAction[] values() {
            return (TileHeaderAction[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class TileHeaderDescriptionColor {
        public static final /* synthetic */ TileHeaderDescriptionColor[] $VALUES;
        public static final TileHeaderDescriptionColor SECONDARY;
        public static final TileHeaderDescriptionColor TERTIARY;

        static {
            TileHeaderDescriptionColor tileHeaderDescriptionColor = new TileHeaderDescriptionColor("SECONDARY", 0);
            SECONDARY = tileHeaderDescriptionColor;
            TileHeaderDescriptionColor tileHeaderDescriptionColor2 = new TileHeaderDescriptionColor("TERTIARY", 1);
            TERTIARY = tileHeaderDescriptionColor2;
            $VALUES = new TileHeaderDescriptionColor[]{tileHeaderDescriptionColor, tileHeaderDescriptionColor2};
        }

        public static TileHeaderDescriptionColor valueOf(String str) {
            return (TileHeaderDescriptionColor) Enum.valueOf(TileHeaderDescriptionColor.class, str);
        }

        public static TileHeaderDescriptionColor[] values() {
            return (TileHeaderDescriptionColor[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingTileHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        this.colorPalette = colorPalette;
        FigmaTextView figmaTextView = new FigmaTextView(context, null, 2, null);
        figmaTextView.setTextColor(colorPalette.label);
        Strings.applyStyle(figmaTextView, TextStyles.header4);
        this.titleView = figmaTextView;
        FigmaTextView figmaTextView2 = new FigmaTextView(context, null, 2, null);
        Strings.applyStyle(figmaTextView2, TextStyles.smallBody);
        this.descriptionView = figmaTextView2;
        MooncakePillButton mooncakePillButton = new MooncakePillButton(context, null, null, null, 14, null);
        mooncakePillButton.setSize(MooncakePillButton.Size.SMALL);
        mooncakePillButton.setStyle(MooncakePillButton.Style.SECONDARY);
        Strings.applyStyle(mooncakePillButton, TextStyles.smallTitle);
        mooncakePillButton.setTextColor(colorPalette.label);
        mooncakePillButton.setGravity(17);
        mooncakePillButton.setBackground(PlatformKt.getDrawableCompat(context, R.drawable.widget_header_button_background, Integer.valueOf(colorPalette.secondaryButtonBackground)));
        this.actionView = mooncakePillButton;
        contourHeightWrapContent();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getDip(12));
    }

    @Override // com.squareup.contour.ContourLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        ByteArrayProtoReader32 leftTo;
        ByteArrayProtoReader32 rightTo;
        ByteArrayProtoReader32 byteArrayProtoReader32;
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), PKIFailureInfo.systemUnavail);
        FigmaTextView figmaTextView = this.titleView;
        figmaTextView.measure(makeMeasureSpec, i2);
        MooncakePillButton mooncakePillButton = this.actionView;
        mooncakePillButton.measure(makeMeasureSpec, i2);
        Context context = getContext();
        context.getClass();
        final int i3 = 0;
        final int i4 = 1;
        boolean z = size < mooncakePillButton.getMeasuredWidth() + (figmaTextView.getMeasuredWidth() + Views.dip(context, 72));
        this.alignVertically = z;
        if (z) {
            leftTo = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.investing.components.common.InvestingTileHeaderView$$ExternalSyntheticLambda1
                public final /* synthetic */ InvestingTileHeaderView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i5 = i3;
                    InvestingTileHeaderView investingTileHeaderView = this.f$0;
                    ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                    switch (i5) {
                        case 0:
                            int i6 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                        case 1:
                            int i7 = InvestingTileHeaderView.$r8$clinit;
                            layoutSpec.getClass();
                            Layout layout = investingTileHeaderView.descriptionView.getLayout();
                            boolean z2 = false;
                            if (layout != null && layout.getLineCount() == 1) {
                                z2 = true;
                            }
                            return new YInt(investingTileHeaderView.m3810bottomdBGyhoQ(investingTileHeaderView.titleView) + investingTileHeaderView.m3814getYdipdBGyhoQ(z2 ? 10 : 18));
                        case 2:
                            int i8 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                        case 3:
                            int i9 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                        case 4:
                            int i10 = InvestingTileHeaderView.$r8$clinit;
                            layoutSpec.getClass();
                            FigmaTextView figmaTextView2 = investingTileHeaderView.descriptionView;
                            return new YInt(figmaTextView2.getText() != null ? investingTileHeaderView.m3810bottomdBGyhoQ(figmaTextView2) : investingTileHeaderView.m3814getYdipdBGyhoQ(24) + investingTileHeaderView.m3810bottomdBGyhoQ(investingTileHeaderView.titleView));
                        case 5:
                            int i11 = InvestingTileHeaderView.$r8$clinit;
                            return new YInt(investingTileHeaderView.m3814getYdipdBGyhoQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).top);
                        case 6:
                            int i12 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                        case 7:
                            int i13 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                        case 8:
                            int i14 = InvestingTileHeaderView.$r8$clinit;
                            layoutSpec.getClass();
                            return new XInt(investingTileHeaderView.m3816leftTENr5nQ(investingTileHeaderView.actionView));
                        case 9:
                            int i15 = InvestingTileHeaderView.$r8$clinit;
                            return new YInt(investingTileHeaderView.m3814getYdipdBGyhoQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).top);
                        case 10:
                            int i16 = InvestingTileHeaderView.$r8$clinit;
                            layoutSpec.getClass();
                            return new XInt(investingTileHeaderView.m3816leftTENr5nQ(investingTileHeaderView.titleView));
                        default:
                            int i17 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                    }
                }
            });
            final int i5 = 6;
            leftTo.rightTo(1, new Function1(this) { // from class: com.squareup.cash.investing.components.common.InvestingTileHeaderView$$ExternalSyntheticLambda1
                public final /* synthetic */ InvestingTileHeaderView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i52 = i5;
                    InvestingTileHeaderView investingTileHeaderView = this.f$0;
                    ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                    switch (i52) {
                        case 0:
                            int i6 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                        case 1:
                            int i7 = InvestingTileHeaderView.$r8$clinit;
                            layoutSpec.getClass();
                            Layout layout = investingTileHeaderView.descriptionView.getLayout();
                            boolean z2 = false;
                            if (layout != null && layout.getLineCount() == 1) {
                                z2 = true;
                            }
                            return new YInt(investingTileHeaderView.m3810bottomdBGyhoQ(investingTileHeaderView.titleView) + investingTileHeaderView.m3814getYdipdBGyhoQ(z2 ? 10 : 18));
                        case 2:
                            int i8 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                        case 3:
                            int i9 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                        case 4:
                            int i10 = InvestingTileHeaderView.$r8$clinit;
                            layoutSpec.getClass();
                            FigmaTextView figmaTextView2 = investingTileHeaderView.descriptionView;
                            return new YInt(figmaTextView2.getText() != null ? investingTileHeaderView.m3810bottomdBGyhoQ(figmaTextView2) : investingTileHeaderView.m3814getYdipdBGyhoQ(24) + investingTileHeaderView.m3810bottomdBGyhoQ(investingTileHeaderView.titleView));
                        case 5:
                            int i11 = InvestingTileHeaderView.$r8$clinit;
                            return new YInt(investingTileHeaderView.m3814getYdipdBGyhoQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).top);
                        case 6:
                            int i12 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                        case 7:
                            int i13 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                        case 8:
                            int i14 = InvestingTileHeaderView.$r8$clinit;
                            layoutSpec.getClass();
                            return new XInt(investingTileHeaderView.m3816leftTENr5nQ(investingTileHeaderView.actionView));
                        case 9:
                            int i15 = InvestingTileHeaderView.$r8$clinit;
                            return new YInt(investingTileHeaderView.m3814getYdipdBGyhoQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).top);
                        case 10:
                            int i16 = InvestingTileHeaderView.$r8$clinit;
                            layoutSpec.getClass();
                            return new XInt(investingTileHeaderView.m3816leftTENr5nQ(investingTileHeaderView.titleView));
                        default:
                            int i17 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                    }
                }
            });
        } else {
            final int i6 = 7;
            leftTo = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.investing.components.common.InvestingTileHeaderView$$ExternalSyntheticLambda1
                public final /* synthetic */ InvestingTileHeaderView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i52 = i6;
                    InvestingTileHeaderView investingTileHeaderView = this.f$0;
                    ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                    switch (i52) {
                        case 0:
                            int i62 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                        case 1:
                            int i7 = InvestingTileHeaderView.$r8$clinit;
                            layoutSpec.getClass();
                            Layout layout = investingTileHeaderView.descriptionView.getLayout();
                            boolean z2 = false;
                            if (layout != null && layout.getLineCount() == 1) {
                                z2 = true;
                            }
                            return new YInt(investingTileHeaderView.m3810bottomdBGyhoQ(investingTileHeaderView.titleView) + investingTileHeaderView.m3814getYdipdBGyhoQ(z2 ? 10 : 18));
                        case 2:
                            int i8 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                        case 3:
                            int i9 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                        case 4:
                            int i10 = InvestingTileHeaderView.$r8$clinit;
                            layoutSpec.getClass();
                            FigmaTextView figmaTextView2 = investingTileHeaderView.descriptionView;
                            return new YInt(figmaTextView2.getText() != null ? investingTileHeaderView.m3810bottomdBGyhoQ(figmaTextView2) : investingTileHeaderView.m3814getYdipdBGyhoQ(24) + investingTileHeaderView.m3810bottomdBGyhoQ(investingTileHeaderView.titleView));
                        case 5:
                            int i11 = InvestingTileHeaderView.$r8$clinit;
                            return new YInt(investingTileHeaderView.m3814getYdipdBGyhoQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).top);
                        case 6:
                            int i12 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                        case 7:
                            int i13 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                        case 8:
                            int i14 = InvestingTileHeaderView.$r8$clinit;
                            layoutSpec.getClass();
                            return new XInt(investingTileHeaderView.m3816leftTENr5nQ(investingTileHeaderView.actionView));
                        case 9:
                            int i15 = InvestingTileHeaderView.$r8$clinit;
                            return new YInt(investingTileHeaderView.m3814getYdipdBGyhoQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).top);
                        case 10:
                            int i16 = InvestingTileHeaderView.$r8$clinit;
                            layoutSpec.getClass();
                            return new XInt(investingTileHeaderView.m3816leftTENr5nQ(investingTileHeaderView.titleView));
                        default:
                            int i17 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                    }
                }
            });
            final int i7 = 8;
            leftTo.rightTo(1, new Function1(this) { // from class: com.squareup.cash.investing.components.common.InvestingTileHeaderView$$ExternalSyntheticLambda1
                public final /* synthetic */ InvestingTileHeaderView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i52 = i7;
                    InvestingTileHeaderView investingTileHeaderView = this.f$0;
                    ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                    switch (i52) {
                        case 0:
                            int i62 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                        case 1:
                            int i72 = InvestingTileHeaderView.$r8$clinit;
                            layoutSpec.getClass();
                            Layout layout = investingTileHeaderView.descriptionView.getLayout();
                            boolean z2 = false;
                            if (layout != null && layout.getLineCount() == 1) {
                                z2 = true;
                            }
                            return new YInt(investingTileHeaderView.m3810bottomdBGyhoQ(investingTileHeaderView.titleView) + investingTileHeaderView.m3814getYdipdBGyhoQ(z2 ? 10 : 18));
                        case 2:
                            int i8 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                        case 3:
                            int i9 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                        case 4:
                            int i10 = InvestingTileHeaderView.$r8$clinit;
                            layoutSpec.getClass();
                            FigmaTextView figmaTextView2 = investingTileHeaderView.descriptionView;
                            return new YInt(figmaTextView2.getText() != null ? investingTileHeaderView.m3810bottomdBGyhoQ(figmaTextView2) : investingTileHeaderView.m3814getYdipdBGyhoQ(24) + investingTileHeaderView.m3810bottomdBGyhoQ(investingTileHeaderView.titleView));
                        case 5:
                            int i11 = InvestingTileHeaderView.$r8$clinit;
                            return new YInt(investingTileHeaderView.m3814getYdipdBGyhoQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).top);
                        case 6:
                            int i12 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                        case 7:
                            int i13 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                        case 8:
                            int i14 = InvestingTileHeaderView.$r8$clinit;
                            layoutSpec.getClass();
                            return new XInt(investingTileHeaderView.m3816leftTENr5nQ(investingTileHeaderView.actionView));
                        case 9:
                            int i15 = InvestingTileHeaderView.$r8$clinit;
                            return new YInt(investingTileHeaderView.m3814getYdipdBGyhoQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).top);
                        case 10:
                            int i16 = InvestingTileHeaderView.$r8$clinit;
                            layoutSpec.getClass();
                            return new XInt(investingTileHeaderView.m3816leftTENr5nQ(investingTileHeaderView.titleView));
                        default:
                            int i17 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                    }
                }
            });
        }
        final int i8 = 9;
        ContourLayout.layoutBy$default(this, figmaTextView, leftTo, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.investing.components.common.InvestingTileHeaderView$$ExternalSyntheticLambda1
            public final /* synthetic */ InvestingTileHeaderView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i8;
                InvestingTileHeaderView investingTileHeaderView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i52) {
                    case 0:
                        int i62 = InvestingTileHeaderView.$r8$clinit;
                        return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 1:
                        int i72 = InvestingTileHeaderView.$r8$clinit;
                        layoutSpec.getClass();
                        Layout layout = investingTileHeaderView.descriptionView.getLayout();
                        boolean z2 = false;
                        if (layout != null && layout.getLineCount() == 1) {
                            z2 = true;
                        }
                        return new YInt(investingTileHeaderView.m3810bottomdBGyhoQ(investingTileHeaderView.titleView) + investingTileHeaderView.m3814getYdipdBGyhoQ(z2 ? 10 : 18));
                    case 2:
                        int i82 = InvestingTileHeaderView.$r8$clinit;
                        return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 3:
                        int i9 = InvestingTileHeaderView.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                    case 4:
                        int i10 = InvestingTileHeaderView.$r8$clinit;
                        layoutSpec.getClass();
                        FigmaTextView figmaTextView2 = investingTileHeaderView.descriptionView;
                        return new YInt(figmaTextView2.getText() != null ? investingTileHeaderView.m3810bottomdBGyhoQ(figmaTextView2) : investingTileHeaderView.m3814getYdipdBGyhoQ(24) + investingTileHeaderView.m3810bottomdBGyhoQ(investingTileHeaderView.titleView));
                    case 5:
                        int i11 = InvestingTileHeaderView.$r8$clinit;
                        return new YInt(investingTileHeaderView.m3814getYdipdBGyhoQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).top);
                    case 6:
                        int i12 = InvestingTileHeaderView.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                    case 7:
                        int i13 = InvestingTileHeaderView.$r8$clinit;
                        return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 8:
                        int i14 = InvestingTileHeaderView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(investingTileHeaderView.m3816leftTENr5nQ(investingTileHeaderView.actionView));
                    case 9:
                        int i15 = InvestingTileHeaderView.$r8$clinit;
                        return new YInt(investingTileHeaderView.m3814getYdipdBGyhoQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).top);
                    case 10:
                        int i16 = InvestingTileHeaderView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(investingTileHeaderView.m3816leftTENr5nQ(investingTileHeaderView.titleView));
                    default:
                        int i17 = InvestingTileHeaderView.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                }
            }
        }));
        final int i9 = 10;
        ByteArrayProtoReader32 leftTo2 = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.investing.components.common.InvestingTileHeaderView$$ExternalSyntheticLambda1
            public final /* synthetic */ InvestingTileHeaderView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i9;
                InvestingTileHeaderView investingTileHeaderView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i52) {
                    case 0:
                        int i62 = InvestingTileHeaderView.$r8$clinit;
                        return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 1:
                        int i72 = InvestingTileHeaderView.$r8$clinit;
                        layoutSpec.getClass();
                        Layout layout = investingTileHeaderView.descriptionView.getLayout();
                        boolean z2 = false;
                        if (layout != null && layout.getLineCount() == 1) {
                            z2 = true;
                        }
                        return new YInt(investingTileHeaderView.m3810bottomdBGyhoQ(investingTileHeaderView.titleView) + investingTileHeaderView.m3814getYdipdBGyhoQ(z2 ? 10 : 18));
                    case 2:
                        int i82 = InvestingTileHeaderView.$r8$clinit;
                        return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 3:
                        int i92 = InvestingTileHeaderView.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                    case 4:
                        int i10 = InvestingTileHeaderView.$r8$clinit;
                        layoutSpec.getClass();
                        FigmaTextView figmaTextView2 = investingTileHeaderView.descriptionView;
                        return new YInt(figmaTextView2.getText() != null ? investingTileHeaderView.m3810bottomdBGyhoQ(figmaTextView2) : investingTileHeaderView.m3814getYdipdBGyhoQ(24) + investingTileHeaderView.m3810bottomdBGyhoQ(investingTileHeaderView.titleView));
                    case 5:
                        int i11 = InvestingTileHeaderView.$r8$clinit;
                        return new YInt(investingTileHeaderView.m3814getYdipdBGyhoQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).top);
                    case 6:
                        int i12 = InvestingTileHeaderView.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                    case 7:
                        int i13 = InvestingTileHeaderView.$r8$clinit;
                        return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 8:
                        int i14 = InvestingTileHeaderView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(investingTileHeaderView.m3816leftTENr5nQ(investingTileHeaderView.actionView));
                    case 9:
                        int i15 = InvestingTileHeaderView.$r8$clinit;
                        return new YInt(investingTileHeaderView.m3814getYdipdBGyhoQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).top);
                    case 10:
                        int i16 = InvestingTileHeaderView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(investingTileHeaderView.m3816leftTENr5nQ(investingTileHeaderView.titleView));
                    default:
                        int i17 = InvestingTileHeaderView.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                }
            }
        });
        final int i10 = 11;
        leftTo2.rightTo(1, new Function1(this) { // from class: com.squareup.cash.investing.components.common.InvestingTileHeaderView$$ExternalSyntheticLambda1
            public final /* synthetic */ InvestingTileHeaderView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i10;
                InvestingTileHeaderView investingTileHeaderView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i52) {
                    case 0:
                        int i62 = InvestingTileHeaderView.$r8$clinit;
                        return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 1:
                        int i72 = InvestingTileHeaderView.$r8$clinit;
                        layoutSpec.getClass();
                        Layout layout = investingTileHeaderView.descriptionView.getLayout();
                        boolean z2 = false;
                        if (layout != null && layout.getLineCount() == 1) {
                            z2 = true;
                        }
                        return new YInt(investingTileHeaderView.m3810bottomdBGyhoQ(investingTileHeaderView.titleView) + investingTileHeaderView.m3814getYdipdBGyhoQ(z2 ? 10 : 18));
                    case 2:
                        int i82 = InvestingTileHeaderView.$r8$clinit;
                        return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 3:
                        int i92 = InvestingTileHeaderView.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                    case 4:
                        int i102 = InvestingTileHeaderView.$r8$clinit;
                        layoutSpec.getClass();
                        FigmaTextView figmaTextView2 = investingTileHeaderView.descriptionView;
                        return new YInt(figmaTextView2.getText() != null ? investingTileHeaderView.m3810bottomdBGyhoQ(figmaTextView2) : investingTileHeaderView.m3814getYdipdBGyhoQ(24) + investingTileHeaderView.m3810bottomdBGyhoQ(investingTileHeaderView.titleView));
                    case 5:
                        int i11 = InvestingTileHeaderView.$r8$clinit;
                        return new YInt(investingTileHeaderView.m3814getYdipdBGyhoQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).top);
                    case 6:
                        int i12 = InvestingTileHeaderView.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                    case 7:
                        int i13 = InvestingTileHeaderView.$r8$clinit;
                        return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 8:
                        int i14 = InvestingTileHeaderView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(investingTileHeaderView.m3816leftTENr5nQ(investingTileHeaderView.actionView));
                    case 9:
                        int i15 = InvestingTileHeaderView.$r8$clinit;
                        return new YInt(investingTileHeaderView.m3814getYdipdBGyhoQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).top);
                    case 10:
                        int i16 = InvestingTileHeaderView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(investingTileHeaderView.m3816leftTENr5nQ(investingTileHeaderView.titleView));
                    default:
                        int i17 = InvestingTileHeaderView.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                }
            }
        });
        ContourLayout.layoutBy$default(this, this.descriptionView, leftTo2, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.investing.components.common.InvestingTileHeaderView$$ExternalSyntheticLambda1
            public final /* synthetic */ InvestingTileHeaderView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i4;
                InvestingTileHeaderView investingTileHeaderView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i52) {
                    case 0:
                        int i62 = InvestingTileHeaderView.$r8$clinit;
                        return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 1:
                        int i72 = InvestingTileHeaderView.$r8$clinit;
                        layoutSpec.getClass();
                        Layout layout = investingTileHeaderView.descriptionView.getLayout();
                        boolean z2 = false;
                        if (layout != null && layout.getLineCount() == 1) {
                            z2 = true;
                        }
                        return new YInt(investingTileHeaderView.m3810bottomdBGyhoQ(investingTileHeaderView.titleView) + investingTileHeaderView.m3814getYdipdBGyhoQ(z2 ? 10 : 18));
                    case 2:
                        int i82 = InvestingTileHeaderView.$r8$clinit;
                        return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 3:
                        int i92 = InvestingTileHeaderView.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                    case 4:
                        int i102 = InvestingTileHeaderView.$r8$clinit;
                        layoutSpec.getClass();
                        FigmaTextView figmaTextView2 = investingTileHeaderView.descriptionView;
                        return new YInt(figmaTextView2.getText() != null ? investingTileHeaderView.m3810bottomdBGyhoQ(figmaTextView2) : investingTileHeaderView.m3814getYdipdBGyhoQ(24) + investingTileHeaderView.m3810bottomdBGyhoQ(investingTileHeaderView.titleView));
                    case 5:
                        int i11 = InvestingTileHeaderView.$r8$clinit;
                        return new YInt(investingTileHeaderView.m3814getYdipdBGyhoQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).top);
                    case 6:
                        int i12 = InvestingTileHeaderView.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                    case 7:
                        int i13 = InvestingTileHeaderView.$r8$clinit;
                        return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 8:
                        int i14 = InvestingTileHeaderView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(investingTileHeaderView.m3816leftTENr5nQ(investingTileHeaderView.actionView));
                    case 9:
                        int i15 = InvestingTileHeaderView.$r8$clinit;
                        return new YInt(investingTileHeaderView.m3814getYdipdBGyhoQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).top);
                    case 10:
                        int i16 = InvestingTileHeaderView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(investingTileHeaderView.m3816leftTENr5nQ(investingTileHeaderView.titleView));
                    default:
                        int i17 = InvestingTileHeaderView.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                }
            }
        }));
        if (this.alignVertically) {
            final int i11 = 2;
            rightTo = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.investing.components.common.InvestingTileHeaderView$$ExternalSyntheticLambda1
                public final /* synthetic */ InvestingTileHeaderView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i52 = i11;
                    InvestingTileHeaderView investingTileHeaderView = this.f$0;
                    ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                    switch (i52) {
                        case 0:
                            int i62 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                        case 1:
                            int i72 = InvestingTileHeaderView.$r8$clinit;
                            layoutSpec.getClass();
                            Layout layout = investingTileHeaderView.descriptionView.getLayout();
                            boolean z2 = false;
                            if (layout != null && layout.getLineCount() == 1) {
                                z2 = true;
                            }
                            return new YInt(investingTileHeaderView.m3810bottomdBGyhoQ(investingTileHeaderView.titleView) + investingTileHeaderView.m3814getYdipdBGyhoQ(z2 ? 10 : 18));
                        case 2:
                            int i82 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                        case 3:
                            int i92 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                        case 4:
                            int i102 = InvestingTileHeaderView.$r8$clinit;
                            layoutSpec.getClass();
                            FigmaTextView figmaTextView2 = investingTileHeaderView.descriptionView;
                            return new YInt(figmaTextView2.getText() != null ? investingTileHeaderView.m3810bottomdBGyhoQ(figmaTextView2) : investingTileHeaderView.m3814getYdipdBGyhoQ(24) + investingTileHeaderView.m3810bottomdBGyhoQ(investingTileHeaderView.titleView));
                        case 5:
                            int i112 = InvestingTileHeaderView.$r8$clinit;
                            return new YInt(investingTileHeaderView.m3814getYdipdBGyhoQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).top);
                        case 6:
                            int i12 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                        case 7:
                            int i13 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                        case 8:
                            int i14 = InvestingTileHeaderView.$r8$clinit;
                            layoutSpec.getClass();
                            return new XInt(investingTileHeaderView.m3816leftTENr5nQ(investingTileHeaderView.actionView));
                        case 9:
                            int i15 = InvestingTileHeaderView.$r8$clinit;
                            return new YInt(investingTileHeaderView.m3814getYdipdBGyhoQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).top);
                        case 10:
                            int i16 = InvestingTileHeaderView.$r8$clinit;
                            layoutSpec.getClass();
                            return new XInt(investingTileHeaderView.m3816leftTENr5nQ(investingTileHeaderView.titleView));
                        default:
                            int i17 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                    }
                }
            });
        } else {
            final int i12 = 3;
            rightTo = ContourLayout.rightTo(new Function1(this) { // from class: com.squareup.cash.investing.components.common.InvestingTileHeaderView$$ExternalSyntheticLambda1
                public final /* synthetic */ InvestingTileHeaderView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i52 = i12;
                    InvestingTileHeaderView investingTileHeaderView = this.f$0;
                    ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                    switch (i52) {
                        case 0:
                            int i62 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                        case 1:
                            int i72 = InvestingTileHeaderView.$r8$clinit;
                            layoutSpec.getClass();
                            Layout layout = investingTileHeaderView.descriptionView.getLayout();
                            boolean z2 = false;
                            if (layout != null && layout.getLineCount() == 1) {
                                z2 = true;
                            }
                            return new YInt(investingTileHeaderView.m3810bottomdBGyhoQ(investingTileHeaderView.titleView) + investingTileHeaderView.m3814getYdipdBGyhoQ(z2 ? 10 : 18));
                        case 2:
                            int i82 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                        case 3:
                            int i92 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                        case 4:
                            int i102 = InvestingTileHeaderView.$r8$clinit;
                            layoutSpec.getClass();
                            FigmaTextView figmaTextView2 = investingTileHeaderView.descriptionView;
                            return new YInt(figmaTextView2.getText() != null ? investingTileHeaderView.m3810bottomdBGyhoQ(figmaTextView2) : investingTileHeaderView.m3814getYdipdBGyhoQ(24) + investingTileHeaderView.m3810bottomdBGyhoQ(investingTileHeaderView.titleView));
                        case 5:
                            int i112 = InvestingTileHeaderView.$r8$clinit;
                            return new YInt(investingTileHeaderView.m3814getYdipdBGyhoQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).top);
                        case 6:
                            int i122 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                        case 7:
                            int i13 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                        case 8:
                            int i14 = InvestingTileHeaderView.$r8$clinit;
                            layoutSpec.getClass();
                            return new XInt(investingTileHeaderView.m3816leftTENr5nQ(investingTileHeaderView.actionView));
                        case 9:
                            int i15 = InvestingTileHeaderView.$r8$clinit;
                            return new YInt(investingTileHeaderView.m3814getYdipdBGyhoQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).top);
                        case 10:
                            int i16 = InvestingTileHeaderView.$r8$clinit;
                            layoutSpec.getClass();
                            return new XInt(investingTileHeaderView.m3816leftTENr5nQ(investingTileHeaderView.titleView));
                        default:
                            int i17 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                    }
                }
            });
        }
        if (this.alignVertically) {
            final int i13 = 4;
            byteArrayProtoReader32 = ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.investing.components.common.InvestingTileHeaderView$$ExternalSyntheticLambda1
                public final /* synthetic */ InvestingTileHeaderView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i52 = i13;
                    InvestingTileHeaderView investingTileHeaderView = this.f$0;
                    ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                    switch (i52) {
                        case 0:
                            int i62 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                        case 1:
                            int i72 = InvestingTileHeaderView.$r8$clinit;
                            layoutSpec.getClass();
                            Layout layout = investingTileHeaderView.descriptionView.getLayout();
                            boolean z2 = false;
                            if (layout != null && layout.getLineCount() == 1) {
                                z2 = true;
                            }
                            return new YInt(investingTileHeaderView.m3810bottomdBGyhoQ(investingTileHeaderView.titleView) + investingTileHeaderView.m3814getYdipdBGyhoQ(z2 ? 10 : 18));
                        case 2:
                            int i82 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                        case 3:
                            int i92 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                        case 4:
                            int i102 = InvestingTileHeaderView.$r8$clinit;
                            layoutSpec.getClass();
                            FigmaTextView figmaTextView2 = investingTileHeaderView.descriptionView;
                            return new YInt(figmaTextView2.getText() != null ? investingTileHeaderView.m3810bottomdBGyhoQ(figmaTextView2) : investingTileHeaderView.m3814getYdipdBGyhoQ(24) + investingTileHeaderView.m3810bottomdBGyhoQ(investingTileHeaderView.titleView));
                        case 5:
                            int i112 = InvestingTileHeaderView.$r8$clinit;
                            return new YInt(investingTileHeaderView.m3814getYdipdBGyhoQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).top);
                        case 6:
                            int i122 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                        case 7:
                            int i132 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                        case 8:
                            int i14 = InvestingTileHeaderView.$r8$clinit;
                            layoutSpec.getClass();
                            return new XInt(investingTileHeaderView.m3816leftTENr5nQ(investingTileHeaderView.actionView));
                        case 9:
                            int i15 = InvestingTileHeaderView.$r8$clinit;
                            return new YInt(investingTileHeaderView.m3814getYdipdBGyhoQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).top);
                        case 10:
                            int i16 = InvestingTileHeaderView.$r8$clinit;
                            layoutSpec.getClass();
                            return new XInt(investingTileHeaderView.m3816leftTENr5nQ(investingTileHeaderView.titleView));
                        default:
                            int i17 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                    }
                }
            });
        } else {
            final int i14 = 5;
            byteArrayProtoReader32 = ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.investing.components.common.InvestingTileHeaderView$$ExternalSyntheticLambda1
                public final /* synthetic */ InvestingTileHeaderView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i52 = i14;
                    InvestingTileHeaderView investingTileHeaderView = this.f$0;
                    ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                    switch (i52) {
                        case 0:
                            int i62 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                        case 1:
                            int i72 = InvestingTileHeaderView.$r8$clinit;
                            layoutSpec.getClass();
                            Layout layout = investingTileHeaderView.descriptionView.getLayout();
                            boolean z2 = false;
                            if (layout != null && layout.getLineCount() == 1) {
                                z2 = true;
                            }
                            return new YInt(investingTileHeaderView.m3810bottomdBGyhoQ(investingTileHeaderView.titleView) + investingTileHeaderView.m3814getYdipdBGyhoQ(z2 ? 10 : 18));
                        case 2:
                            int i82 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                        case 3:
                            int i92 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                        case 4:
                            int i102 = InvestingTileHeaderView.$r8$clinit;
                            layoutSpec.getClass();
                            FigmaTextView figmaTextView2 = investingTileHeaderView.descriptionView;
                            return new YInt(figmaTextView2.getText() != null ? investingTileHeaderView.m3810bottomdBGyhoQ(figmaTextView2) : investingTileHeaderView.m3814getYdipdBGyhoQ(24) + investingTileHeaderView.m3810bottomdBGyhoQ(investingTileHeaderView.titleView));
                        case 5:
                            int i112 = InvestingTileHeaderView.$r8$clinit;
                            return new YInt(investingTileHeaderView.m3814getYdipdBGyhoQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).top);
                        case 6:
                            int i122 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                        case 7:
                            int i132 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(investingTileHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                        case 8:
                            int i142 = InvestingTileHeaderView.$r8$clinit;
                            layoutSpec.getClass();
                            return new XInt(investingTileHeaderView.m3816leftTENr5nQ(investingTileHeaderView.actionView));
                        case 9:
                            int i15 = InvestingTileHeaderView.$r8$clinit;
                            return new YInt(investingTileHeaderView.m3814getYdipdBGyhoQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).top);
                        case 10:
                            int i16 = InvestingTileHeaderView.$r8$clinit;
                            layoutSpec.getClass();
                            return new XInt(investingTileHeaderView.m3816leftTENr5nQ(investingTileHeaderView.titleView));
                        default:
                            int i17 = InvestingTileHeaderView.$r8$clinit;
                            return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - investingTileHeaderView.m3813getXdipTENr5nQ(24));
                    }
                }
            });
        }
        ContourLayout.layoutBy$default(this, mooncakePillButton, rightTo, byteArrayProtoReader32);
        int dip = getDip(32);
        int dip2 = getDip(24);
        int dip3 = getDip(24);
        int dip4 = getDip(24);
        Object parent = mooncakePillButton.getParent();
        parent.getClass();
        View view = (View) parent;
        view.post(new Views$$ExternalSyntheticLambda0(view, mooncakePillButton, dip, dip2, dip3, dip4));
        super.onMeasure(i, i2);
    }

    public final void render(String str, String str2, TileHeaderAction tileHeaderAction, TileHeaderDescriptionColor tileHeaderDescriptionColor) {
        int i;
        String str3;
        int i2;
        int i3;
        str.getClass();
        tileHeaderDescriptionColor.getClass();
        this.titleView.setText(str);
        int ordinal = tileHeaderDescriptionColor.ordinal();
        ColorPalette colorPalette = this.colorPalette;
        if (ordinal == 0) {
            i = colorPalette.secondaryLabel;
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            i = colorPalette.tertiaryLabel;
        }
        FigmaTextView figmaTextView = this.descriptionView;
        figmaTextView.setTextColor(i);
        figmaTextView.setText(str2);
        figmaTextView.setVisibility((str2 == null || StringsKt.isBlank(str2)) ? 8 : 0);
        int i4 = tileHeaderAction != null ? 0 : 8;
        MooncakePillButton mooncakePillButton = this.actionView;
        mooncakePillButton.setVisibility(i4);
        String str4 = null;
        if (tileHeaderAction != null) {
            Context context = getContext();
            int ordinal2 = tileHeaderAction.ordinal();
            if (ordinal2 == 0) {
                i3 = R.string.investing_components_sort_portfolio_by_contentdescription;
            } else {
                if (ordinal2 != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                i3 = R.string.investing_components_details_button_contentdescription;
            }
            str3 = context.getString(i3);
            str3.getClass();
        } else {
            str3 = null;
        }
        mooncakePillButton.setContentDescription(str3);
        if (tileHeaderAction != null) {
            Context context2 = getContext();
            int ordinal3 = tileHeaderAction.ordinal();
            if (ordinal3 == 0) {
                i2 = R.string.investing_components_sort_portfolio_by_content_title;
            } else {
                if (ordinal3 != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                i2 = R.string.investing_components_details_button;
            }
            str4 = context2.getString(i2);
            str4.getClass();
        }
        mooncakePillButton.setText(str4);
    }

    public final void setOnActionClickListener(Function0<Unit> function0) {
        MooncakePillButton mooncakePillButton = this.actionView;
        if (function0 != null) {
            mooncakePillButton.setOnClickListener(new AlertDialogView$$ExternalSyntheticLambda0(4, function0));
        } else {
            mooncakePillButton.setOnClickListener(null);
            mooncakePillButton.setClickable(false);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InvestingTileHeaderView(Context context) {
        this(context, null);
        context.getClass();
    }
}
