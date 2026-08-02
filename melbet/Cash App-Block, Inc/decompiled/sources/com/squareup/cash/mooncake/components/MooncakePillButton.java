package com.squareup.cash.mooncake.components;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.PaintDrawable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.View;
import android.widget.TextView;
import androidx.media3.common.util.TimedValueQueue;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.mooncake.drawables.MooncakeButtonDrawable;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.mooncake.themes.theming.PressKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.themes.widget.TextThemeInfo;
import com.squareup.cash.mooncake.theming.ThemablesKt;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import com.squareup.util.android.widget.ImageSpan;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public class MooncakePillButton extends MooncakeButton {
    public final MooncakeButtonDrawable backgroundDrawable;
    public TimedValueQueue colors;
    public Integer iconResId;
    public android.util.Size iconSize;
    public Integer iconTintOverride;
    public Size size;
    public Style style;
    public CharSequence textNoIcon;
    public TextThemeInfo textStyleOverride;
    public final ThemeInfo themeInfo;
    public boolean tintIcon;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Size {
        public static final /* synthetic */ Size[] $VALUES;
        public static final Size LARGE;
        public static final Size MEDIUM;
        public static final Size SMALL;

        static {
            Size size = new Size("LARGE", 0);
            LARGE = size;
            Size size2 = new Size("MEDIUM", 1);
            MEDIUM = size2;
            Size size3 = new Size("SMALL", 2);
            SMALL = size3;
            $VALUES = new Size[]{size, size2, size3};
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Style {
        public static final /* synthetic */ Style[] $VALUES;
        public static final Style OUTLINE;
        public static final Style PRIMARY;
        public static final Style SECONDARY;
        public static final Style TERTIARY;
        public static final Style TERTIARY_OVERLAY;

        static {
            Style style = new Style("PRIMARY", 0);
            PRIMARY = style;
            Style style2 = new Style("SECONDARY", 1);
            SECONDARY = style2;
            Style style3 = new Style("TERTIARY", 2);
            TERTIARY = style3;
            Style style4 = new Style("TERTIARY_OVERLAY", 3);
            TERTIARY_OVERLAY = style4;
            Style style5 = new Style("OUTLINE", 4);
            OUTLINE = style5;
            $VALUES = new Style[]{style, style2, style3, style4, style5, new Style("OUTLINE_SELECTED", 5)};
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MooncakePillButton(Context context, AttributeSet attributeSet, Size size, Style style) {
        super(context, attributeSet);
        context.getClass();
        size.getClass();
        style.getClass();
        this.size = size;
        this.style = style;
        this.tintIcon = true;
        ThemeInfo themeInfo = ThemeHelpersKt.themeInfo(this);
        this.themeInfo = themeInfo;
        int i = MooncakeButtonDrawable.$r8$clinit;
        int pressColor$default = PressKt.pressColor$default(themeInfo, null, 3);
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.getPaint().setColor(0);
        MooncakeButtonDrawable mooncakeButtonDrawable = new MooncakeButtonDrawable(pressColor$default, paintDrawable, new PaintDrawable());
        this.backgroundDrawable = mooncakeButtonDrawable;
        setBackground(mooncakeButtonDrawable);
        setStateListAnimator(new PushOnPressAnimator(this, 30));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.mooncake_MooncakePillButton);
        obtainStyledAttributes.getClass();
        setSize(Size.values()[obtainStyledAttributes.getInt(0, size.ordinal())]);
        setStyle(Style.values()[obtainStyledAttributes.getInt(1, style.ordinal())]);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setColors$default(MooncakePillButton mooncakePillButton, int i, int i2, Pair pair, int i3, Object obj) {
        if (obj != null) {
            a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: setColors");
            return;
        }
        if ((i3 & 4) != 0) {
            pair = null;
        }
        mooncakePillButton.setColors(i, i2, pair);
    }

    public final void applySize() {
        int ordinal = this.size.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            setPaddingRelative(Views.dip((View) this, 16), Views.dip((View) this, 12), Views.dip((View) this, 16), Views.dip((View) this, 12));
            TextThemeInfo textThemeInfo = this.textStyleOverride;
            if (textThemeInfo == null) {
                textThemeInfo = TextStyles.mainTitle;
            }
            Strings.applyStyle(this, textThemeInfo);
            setMinHeight(Views.dip((View) this, 48));
            setMinimumHeight(getMinHeight());
            setMinWidth(0);
            setMinimumWidth(getMinWidth());
            return;
        }
        if (ordinal != 2) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        setPaddingRelative(Views.dip((View) this, 16), Views.dip((View) this, 4), Views.dip((View) this, 16), Views.dip((View) this, 4));
        TextThemeInfo textThemeInfo2 = this.textStyleOverride;
        if (textThemeInfo2 == null) {
            textThemeInfo2 = TextStyles.strongCaption;
        }
        Strings.applyStyle(this, textThemeInfo2);
        setMinHeight(Views.dip((View) this, 32));
        setMinimumHeight(getMinHeight());
        setMinWidth(Views.dip((View) this, 64));
        setMinimumWidth(getMinWidth());
    }

    public final TimedValueQueue getDefaultColors(Style style) {
        int ordinal = style.ordinal();
        ColorPalette colorPalette = this.colorPalette;
        if (ordinal == 0) {
            int i = colorPalette.primaryButtonBackground;
            return new TimedValueQueue(this, ThemablesKt.contrastAdjustedColor(colorPalette.primaryButtonTint, i, colorPalette.primaryButtonTintInverted), i, (Pair) null);
        }
        if (ordinal == 1) {
            return new TimedValueQueue(this, colorPalette.secondaryButtonTint, colorPalette.secondaryButtonBackground, (Pair) null);
        }
        if (ordinal == 2 || ordinal == 3) {
            return new TimedValueQueue(this, colorPalette.tertiaryButtonTint, 0, (Pair) null);
        }
        if (ordinal == 4 || ordinal == 5) {
            return new TimedValueQueue(this, colorPalette.secondaryButtonTint, 0, new Pair(Integer.valueOf(colorPalette.outlineButtonBorder), Integer.valueOf(colorPalette.outlineButtonSelectedBorder)));
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    @Override // android.widget.TextView
    public final CharSequence getText() {
        CharSequence charSequence = this.textNoIcon;
        if (charSequence != null) {
            return charSequence;
        }
        Intrinsics.throwUninitializedPropertyAccessException("textNoIcon");
        throw null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        Integer num;
        TimedValueQueue timedValueQueue = this.colors;
        if (timedValueQueue == null) {
            timedValueQueue = getDefaultColors(this.style);
        }
        Integer num2 = this.iconResId;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (num2 != null) {
            if (this.tintIcon) {
                Integer num3 = this.iconTintOverride;
                if (num3 == null) {
                    num3 = isEnabled() ? Integer.valueOf(timedValueQueue.first) : Integer.valueOf(timedValueQueue.getDisabledText());
                }
                num = num3;
            } else {
                num = null;
            }
            Context context = getContext();
            context.getClass();
            ImageSpan imageSpan = new ImageSpan(context, num2.intValue(), num, 0, getResources().getDimensionPixelSize(R.dimen.mooncake_button_primary_icon_margin_end), 0, this.iconSize, 344);
            int length = spannableStringBuilder.length();
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append(' ');
            spannableStringBuilder.setSpan(imageSpan, length, (spannableStringBuilder.length() - length2) + length, 17);
        }
        if (this.style == Style.TERTIARY) {
            UnderlineSpan underlineSpan = new UnderlineSpan();
            int length3 = spannableStringBuilder.length();
            CharSequence charSequence = this.textNoIcon;
            if (charSequence == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textNoIcon");
                throw null;
            }
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.setSpan(underlineSpan, length3, spannableStringBuilder.length(), 17);
        } else {
            CharSequence charSequence2 = this.textNoIcon;
            if (charSequence2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textNoIcon");
                throw null;
            }
            spannableStringBuilder.append(charSequence2);
        }
        super.setText(new SpannedString(spannableStringBuilder), TextView.BufferType.NORMAL);
        super.onMeasure(i, i2);
    }

    public final void setColors(TimedValueQueue timedValueQueue) {
        ColorStateList valueOf;
        this.colors = timedValueQueue;
        if (timedValueQueue == null) {
            timedValueQueue = getDefaultColors(this.style);
        }
        Pair pair = (Pair) timedValueQueue.timestamps;
        int i = timedValueQueue.size;
        int i2 = timedValueQueue.first;
        if (!Intrinsics.areEqual(getTextColors(), (Object) null) || i2 != getTextColors().getDefaultColor()) {
            setTextColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_enabled}, new int[]{-16842910}}, new int[]{i2, timedValueQueue.getDisabledText()}));
        }
        MooncakeButtonDrawable mooncakeButtonDrawable = this.backgroundDrawable;
        PaintDrawable paintDrawable = mooncakeButtonDrawable.content;
        Paint paint = mooncakeButtonDrawable.strokePaint;
        paintDrawable.getPaint().setColor(i);
        paintDrawable.invalidateSelf();
        ThemeInfo themeInfo = this.themeInfo;
        if (pair != null) {
            int intValue = ((Number) pair.first).intValue();
            int intValue2 = ((Number) pair.second).intValue();
            valueOf = new ColorStateList(new int[][]{new int[]{android.R.attr.state_selected, android.R.attr.state_pressed}, new int[]{android.R.attr.state_selected}, StateSet.WILD_CARD}, new int[]{PressKt.pressColor$default(themeInfo, Integer.valueOf(intValue2), 2), intValue2, intValue});
        } else {
            valueOf = ColorStateList.valueOf(0);
        }
        if (!Intrinsics.areEqual(mooncakeButtonDrawable.strokeColor, valueOf)) {
            mooncakeButtonDrawable.strokeColor = valueOf;
            paint.setColor(valueOf != null ? valueOf.getColorForState(mooncakeButtonDrawable.getState(), valueOf.getDefaultColor()) : 0);
            mooncakeButtonDrawable.invalidateSelf();
        }
        float dip = pair != null ? Views.dip((View) this, 2.0f) : RecyclerView.DECELERATION_RATE;
        if (paint.getStrokeWidth() != dip) {
            paint.setStrokeWidth(dip);
            mooncakeButtonDrawable.invalidateSelf();
        }
        mooncakeButtonDrawable.setColor(ColorStateList.valueOf(PressKt.pressColor$default(themeInfo, i != 0 ? Integer.valueOf(i) : null, 2)));
        requestLayout();
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        requestLayout();
    }

    public final void setIconResId(Integer num) {
        this.iconResId = num;
        requestLayout();
    }

    public final void setIconSize(android.util.Size size) {
        this.iconSize = size;
        requestLayout();
    }

    public final void setIconTintOverride(Integer num) {
        this.iconTintOverride = num;
        requestLayout();
    }

    public final void setSize(Size size) {
        size.getClass();
        this.size = size;
        applySize();
    }

    public final void setStyle(Style style) {
        style.getClass();
        this.style = style;
        int ordinal = style.ordinal();
        MooncakeButtonDrawable mooncakeButtonDrawable = this.backgroundDrawable;
        if (ordinal == 0) {
            setStateListAnimator(new PushOnPressAnimator(this, 30));
            mooncakeButtonDrawable.setCornerRadius(null);
        } else if (ordinal == 1) {
            setStateListAnimator(new PushOnPressAnimator(this, 30));
            mooncakeButtonDrawable.setCornerRadius(null);
        } else if (ordinal == 2 || ordinal == 3) {
            setStateListAnimator(new PushOnPressAnimator(this, 26));
            mooncakeButtonDrawable.setCornerRadius(Float.valueOf(RecyclerView.DECELERATION_RATE));
        } else if (ordinal != 4 && ordinal != 5) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        } else {
            setStateListAnimator(new PushOnPressAnimator(this, 30));
            mooncakeButtonDrawable.setCornerRadius(null);
        }
        setColors(null);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        bufferType.getClass();
        this.textNoIcon = charSequence == null ? "" : charSequence;
        requestLayout();
        super.setText(charSequence, bufferType);
    }

    public final void setTextStyleOverride(TextThemeInfo textThemeInfo) {
        this.textStyleOverride = textThemeInfo;
        applySize();
    }

    public final void setTintIcon(boolean z) {
        this.tintIcon = z;
        requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MooncakePillButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, null, null, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MooncakePillButton(Context context, AttributeSet attributeSet, Size size) {
        this(context, attributeSet, size, null, 8, null);
        context.getClass();
        size.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MooncakePillButton(Context context) {
        this(context, null, null, null, 14, null);
        context.getClass();
    }

    public /* synthetic */ MooncakePillButton(Context context, AttributeSet attributeSet, Size size, Style style, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet, (i & 4) != 0 ? Size.LARGE : size, (i & 8) != 0 ? Style.PRIMARY : style);
    }

    public final void setColors(int i, int i2, Pair<Integer, Integer> pair) {
        setColors(new TimedValueQueue(this, i, i2, pair));
    }
}
