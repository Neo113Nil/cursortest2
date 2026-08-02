package com.squareup.cash.mooncake.components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;

/* loaded from: classes6.dex */
public final class MooncakeCashtagEditor extends LinearLayout {
    public final AppCompatTextView currencyText;
    public final MooncakeEditText editText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MooncakeCashtagEditor(Context context) {
        super(context);
        context.getClass();
        MooncakeEditText mooncakeEditText = new MooncakeEditText(context, null, 2, null);
        this.editText = mooncakeEditText;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        Strings.applyStyle(appCompatTextView, TextStyles.input);
        appCompatTextView.setTextColor(ThemeHelpersKt.themeInfo(appCompatTextView).colorPalette.label);
        this.currencyText = appCompatTextView;
        setPaddingRelative(getPaddingStart(), Views.dip((View) this, 14), getPaddingEnd(), Views.dip((View) this, 14));
        addView(appCompatTextView);
        addView(mooncakeEditText);
    }
}
