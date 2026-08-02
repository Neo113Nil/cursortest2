package com.squareup.cash.mooncake.components;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.squareup.cash.mooncake.themes.widget.TextThemeInfo;
import com.squareup.util.Strings;

/* loaded from: classes6.dex */
public abstract class MooncakeBaseText extends AppCompatTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MooncakeBaseText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        Strings.applyStyle(this, providerThemeInfo());
    }

    public abstract TextThemeInfo providerThemeInfo();

    public final void setThemeInfo(TextThemeInfo textThemeInfo) {
        textThemeInfo.getClass();
    }
}
