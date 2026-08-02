package com.squareup.cash.mooncake.components;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.R;
import com.squareup.cash.mooncake.themes.Dimen$Sp;
import com.squareup.cash.mooncake.themes.LetterSpacing$Companion$Em;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.themes.widget.TextThemeInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class MooncakeLargeText extends MooncakeBaseText implements WeightedLeftInBlockers {
    public /* synthetic */ MooncakeLargeText(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    @Override // com.squareup.cash.mooncake.components.MooncakeBaseText
    public final TextThemeInfo providerThemeInfo() {
        TextThemeInfo textThemeInfo = TextStyles.header3;
        Context context = getContext();
        context.getClass();
        int i = ThemeHelpersKt.findThemeInfo(context).colorPalette.label;
        Dimen$Sp dimen$Sp = new Dimen$Sp(26);
        Dimen$Sp dimen$Sp2 = new Dimen$Sp(36);
        Integer valueOf = Integer.valueOf(i);
        LetterSpacing$Companion$Em letterSpacing$Companion$Em = new LetterSpacing$Companion$Em(RecyclerView.DECELERATION_RATE);
        textThemeInfo.getClass();
        return new TextThemeInfo(valueOf, dimen$Sp, R.font.cashsans_medium, dimen$Sp2, letterSpacing$Companion$Em);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MooncakeLargeText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }
}
