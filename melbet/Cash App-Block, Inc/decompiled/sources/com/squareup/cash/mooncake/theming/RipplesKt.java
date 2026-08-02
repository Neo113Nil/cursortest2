package com.squareup.cash.mooncake.theming;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.ui.text.TextRange;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.theming.PressKt;

/* loaded from: classes6.dex */
public abstract class RipplesKt {
    public static final RippleDrawable createBorderlessRippleDrawable(View view) {
        return new RippleDrawable(ColorStateList.valueOf(PressKt.pressColor$default(ThemeHelpersKt.themeInfo(view), null, 3)), null, null);
    }

    public static RippleDrawable createRippleDrawable$default(View view, Integer num, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        view.getClass();
        return new RippleDrawable(ColorStateList.valueOf(PressKt.pressColor$default(ThemeHelpersKt.themeInfo(view), num, 2)), new ColorDrawable(num != null ? num.intValue() : 0), new ColorDrawable(-1));
    }

    public static final CharSequence getSelectedText(TextFieldCharSequence textFieldCharSequence) {
        return textFieldCharSequence.text.subSequence(TextRange.m990getMinimpl(textFieldCharSequence.selection), TextRange.m989getMaximpl(textFieldCharSequence.selection));
    }

    public static final CharSequence getTextAfterSelection(TextFieldCharSequence textFieldCharSequence, int i) {
        long j = textFieldCharSequence.selection;
        CharSequence charSequence = textFieldCharSequence.text;
        int m989getMaximpl = TextRange.m989getMaximpl(j);
        int m989getMaximpl2 = TextRange.m989getMaximpl(textFieldCharSequence.selection);
        int i2 = m989getMaximpl2 + i;
        if (((m989getMaximpl2 ^ i2) & (i ^ i2)) < 0) {
            i2 = charSequence.length();
        }
        return charSequence.subSequence(m989getMaximpl, Math.min(i2, charSequence.length()));
    }

    public static final CharSequence getTextBeforeSelection(TextFieldCharSequence textFieldCharSequence, int i) {
        int m990getMinimpl = TextRange.m990getMinimpl(textFieldCharSequence.selection);
        int i2 = m990getMinimpl - i;
        if (((i ^ m990getMinimpl) & (m990getMinimpl ^ i2)) < 0) {
            i2 = 0;
        }
        return textFieldCharSequence.text.subSequence(Math.max(0, i2), TextRange.m990getMinimpl(textFieldCharSequence.selection));
    }
}
