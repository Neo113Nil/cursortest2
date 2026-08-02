package com.squareup.cash.mooncake.components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.theming.RipplesKt;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.util.Strings;
import com.squareup.wire.ByteArrayProtoReader32;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class MooncakeOptionRow extends ContourLayout {
    public final AppCompatImageView checkView;
    public final FormBlocker.Element.OptionPickerElement.Option option;
    public final Drawable optionCheckedDrawable;
    public final Drawable optionUncheckedDrawable;
    public final AppCompatTextView subtitle;
    public final AppCompatTextView title;

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FormBlocker.Element.OptionPickerElement.Option.TextColor.values().length];
            try {
                iArr[FormBlocker.Element.OptionPickerElement.Option.TextColor.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FormBlocker.Element.OptionPickerElement.Option.TextColor.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MooncakeOptionRow(Context context, FormBlocker.Element.OptionPickerElement.Option option) {
        super(context);
        int i;
        context.getClass();
        option.getClass();
        this.option = option;
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        int i2 = colorPalette.placeholderIcon;
        int i3 = colorPalette.tertiaryLabel;
        int i4 = colorPalette.disabledLabel;
        Drawable drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.mooncake_radio_unchecked, Integer.valueOf(i2));
        drawableCompat.getClass();
        this.optionUncheckedDrawable = drawableCompat;
        Drawable drawableCompat2 = PlatformKt.getDrawableCompat(context, R.drawable.mooncake_radio_checked, Integer.valueOf(colorPalette.tint));
        drawableCompat2.getClass();
        this.optionCheckedDrawable = drawableCompat2;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setImageDrawable(drawableCompat);
        this.checkView = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        Strings.applyStyle(appCompatTextView, TextStyles.mainTitle);
        appCompatTextView.setTextColor(option.selectability instanceof FormBlocker.Element.OptionPickerElement.Option.Selectability.Unselectable ? i4 : colorPalette.label);
        this.title = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        Strings.applyStyle(appCompatTextView2, TextStyles.smallBody);
        final int i5 = 2;
        final int i6 = 1;
        if (option.selectability instanceof FormBlocker.Element.OptionPickerElement.Option.Selectability.Unselectable) {
            i3 = i4;
        } else {
            FormBlocker.Element.OptionPickerElement.Option.TextColor textColor = option.subtitle_color;
            if (textColor != null && (i = WhenMappings.$EnumSwitchMapping$0[textColor.ordinal()]) != 1) {
                if (i != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    throw null;
                }
                i3 = colorPalette.error;
            }
        }
        appCompatTextView2.setTextColor(i3);
        this.subtitle = appCompatTextView2;
        final int i7 = 0;
        setRespectPadding(false);
        contourHeightOf(new Function1(this) { // from class: com.squareup.cash.mooncake.components.MooncakeOptionRow$$ExternalSyntheticLambda0
            public final /* synthetic */ MooncakeOptionRow f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i8 = i7;
                MooncakeOptionRow mooncakeOptionRow = this.f$0;
                switch (i8) {
                    case 0:
                        return new YInt(mooncakeOptionRow.m3814getYdipdBGyhoQ(20) + mooncakeOptionRow.m3810bottomdBGyhoQ(mooncakeOptionRow.subtitle));
                    case 1:
                        return new YInt(mooncakeOptionRow.m3814getYdipdBGyhoQ(20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeOptionRow.m3813getXdipTENr5nQ(16) + mooncakeOptionRow.m3818rightTENr5nQ(mooncakeOptionRow.checkView));
                    case 3:
                        return new YInt(mooncakeOptionRow.m3814getYdipdBGyhoQ(20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 4:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeOptionRow.m3813getXdipTENr5nQ(16) + mooncakeOptionRow.m3818rightTENr5nQ(mooncakeOptionRow.checkView));
                    default:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeOptionRow.m3814getYdipdBGyhoQ(4) + mooncakeOptionRow.m3810bottomdBGyhoQ(mooncakeOptionRow.title));
                }
            }
        });
        final int i8 = 3;
        setBackground(RipplesKt.createRippleDrawable$default(this, null, 3));
        ContourLayout.layoutBy$default(this, appCompatImageView, ContourLayout.leftTo(new SplitButtons$$ExternalSyntheticLambda0(this, 17)), ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.mooncake.components.MooncakeOptionRow$$ExternalSyntheticLambda0
            public final /* synthetic */ MooncakeOptionRow f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i82 = i6;
                MooncakeOptionRow mooncakeOptionRow = this.f$0;
                switch (i82) {
                    case 0:
                        return new YInt(mooncakeOptionRow.m3814getYdipdBGyhoQ(20) + mooncakeOptionRow.m3810bottomdBGyhoQ(mooncakeOptionRow.subtitle));
                    case 1:
                        return new YInt(mooncakeOptionRow.m3814getYdipdBGyhoQ(20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeOptionRow.m3813getXdipTENr5nQ(16) + mooncakeOptionRow.m3818rightTENr5nQ(mooncakeOptionRow.checkView));
                    case 3:
                        return new YInt(mooncakeOptionRow.m3814getYdipdBGyhoQ(20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 4:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeOptionRow.m3813getXdipTENr5nQ(16) + mooncakeOptionRow.m3818rightTENr5nQ(mooncakeOptionRow.checkView));
                    default:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeOptionRow.m3814getYdipdBGyhoQ(4) + mooncakeOptionRow.m3810bottomdBGyhoQ(mooncakeOptionRow.title));
                }
            }
        }));
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.mooncake.components.MooncakeOptionRow$$ExternalSyntheticLambda0
            public final /* synthetic */ MooncakeOptionRow f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i82 = i5;
                MooncakeOptionRow mooncakeOptionRow = this.f$0;
                switch (i82) {
                    case 0:
                        return new YInt(mooncakeOptionRow.m3814getYdipdBGyhoQ(20) + mooncakeOptionRow.m3810bottomdBGyhoQ(mooncakeOptionRow.subtitle));
                    case 1:
                        return new YInt(mooncakeOptionRow.m3814getYdipdBGyhoQ(20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeOptionRow.m3813getXdipTENr5nQ(16) + mooncakeOptionRow.m3818rightTENr5nQ(mooncakeOptionRow.checkView));
                    case 3:
                        return new YInt(mooncakeOptionRow.m3814getYdipdBGyhoQ(20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 4:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeOptionRow.m3813getXdipTENr5nQ(16) + mooncakeOptionRow.m3818rightTENr5nQ(mooncakeOptionRow.checkView));
                    default:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeOptionRow.m3814getYdipdBGyhoQ(4) + mooncakeOptionRow.m3810bottomdBGyhoQ(mooncakeOptionRow.title));
                }
            }
        });
        leftTo.rightTo(1, new SplitButtons$$ExternalSyntheticLambda0(this, 18));
        ContourLayout.layoutBy$default(this, appCompatTextView, leftTo, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.mooncake.components.MooncakeOptionRow$$ExternalSyntheticLambda0
            public final /* synthetic */ MooncakeOptionRow f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i82 = i8;
                MooncakeOptionRow mooncakeOptionRow = this.f$0;
                switch (i82) {
                    case 0:
                        return new YInt(mooncakeOptionRow.m3814getYdipdBGyhoQ(20) + mooncakeOptionRow.m3810bottomdBGyhoQ(mooncakeOptionRow.subtitle));
                    case 1:
                        return new YInt(mooncakeOptionRow.m3814getYdipdBGyhoQ(20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeOptionRow.m3813getXdipTENr5nQ(16) + mooncakeOptionRow.m3818rightTENr5nQ(mooncakeOptionRow.checkView));
                    case 3:
                        return new YInt(mooncakeOptionRow.m3814getYdipdBGyhoQ(20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 4:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeOptionRow.m3813getXdipTENr5nQ(16) + mooncakeOptionRow.m3818rightTENr5nQ(mooncakeOptionRow.checkView));
                    default:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeOptionRow.m3814getYdipdBGyhoQ(4) + mooncakeOptionRow.m3810bottomdBGyhoQ(mooncakeOptionRow.title));
                }
            }
        }));
        final int i9 = 4;
        ByteArrayProtoReader32 leftTo2 = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.mooncake.components.MooncakeOptionRow$$ExternalSyntheticLambda0
            public final /* synthetic */ MooncakeOptionRow f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i82 = i9;
                MooncakeOptionRow mooncakeOptionRow = this.f$0;
                switch (i82) {
                    case 0:
                        return new YInt(mooncakeOptionRow.m3814getYdipdBGyhoQ(20) + mooncakeOptionRow.m3810bottomdBGyhoQ(mooncakeOptionRow.subtitle));
                    case 1:
                        return new YInt(mooncakeOptionRow.m3814getYdipdBGyhoQ(20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeOptionRow.m3813getXdipTENr5nQ(16) + mooncakeOptionRow.m3818rightTENr5nQ(mooncakeOptionRow.checkView));
                    case 3:
                        return new YInt(mooncakeOptionRow.m3814getYdipdBGyhoQ(20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 4:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeOptionRow.m3813getXdipTENr5nQ(16) + mooncakeOptionRow.m3818rightTENr5nQ(mooncakeOptionRow.checkView));
                    default:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeOptionRow.m3814getYdipdBGyhoQ(4) + mooncakeOptionRow.m3810bottomdBGyhoQ(mooncakeOptionRow.title));
                }
            }
        });
        leftTo2.rightTo(1, new SplitButtons$$ExternalSyntheticLambda0(this, 19));
        final int i10 = 5;
        ContourLayout.layoutBy$default(this, appCompatTextView2, leftTo2, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.mooncake.components.MooncakeOptionRow$$ExternalSyntheticLambda0
            public final /* synthetic */ MooncakeOptionRow f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i82 = i10;
                MooncakeOptionRow mooncakeOptionRow = this.f$0;
                switch (i82) {
                    case 0:
                        return new YInt(mooncakeOptionRow.m3814getYdipdBGyhoQ(20) + mooncakeOptionRow.m3810bottomdBGyhoQ(mooncakeOptionRow.subtitle));
                    case 1:
                        return new YInt(mooncakeOptionRow.m3814getYdipdBGyhoQ(20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeOptionRow.m3813getXdipTENr5nQ(16) + mooncakeOptionRow.m3818rightTENr5nQ(mooncakeOptionRow.checkView));
                    case 3:
                        return new YInt(mooncakeOptionRow.m3814getYdipdBGyhoQ(20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 4:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeOptionRow.m3813getXdipTENr5nQ(16) + mooncakeOptionRow.m3818rightTENr5nQ(mooncakeOptionRow.checkView));
                    default:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeOptionRow.m3814getYdipdBGyhoQ(4) + mooncakeOptionRow.m3810bottomdBGyhoQ(mooncakeOptionRow.title));
                }
            }
        }));
        appCompatTextView.setText(option.value);
        String str = option.subtitle;
        if (str == null || StringsKt.isBlank(str)) {
            appCompatTextView2.setVisibility(8);
        } else {
            appCompatTextView2.setText(option.subtitle);
            appCompatTextView2.setVisibility(0);
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        if (this.option.selectability instanceof FormBlocker.Element.OptionPickerElement.Option.Selectability.Unselectable) {
            return;
        }
        AppCompatImageView appCompatImageView = this.checkView;
        if (z) {
            appCompatImageView.setImageDrawable(this.optionCheckedDrawable);
        } else {
            appCompatImageView.setImageDrawable(this.optionUncheckedDrawable);
        }
        super.setSelected(z);
    }
}
