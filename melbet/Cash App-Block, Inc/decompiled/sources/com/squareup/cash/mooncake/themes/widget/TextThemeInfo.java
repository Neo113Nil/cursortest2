package com.squareup.cash.mooncake.themes.widget;

import com.squareup.cash.R;
import com.squareup.cash.mooncake.themes.Dimen$Sp;
import com.squareup.cash.mooncake.themes.LetterSpacing;
import com.squareup.cash.mooncake.themes.LetterSpacing$Companion$Em;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class TextThemeInfo {
    public final int font;
    public final LetterSpacing letterSpacing;
    public final Dimen$Sp lineHeight;
    public final Integer textColor;
    public final Dimen$Sp textSize;

    public TextThemeInfo(Integer num, Dimen$Sp dimen$Sp, int i, Dimen$Sp dimen$Sp2, LetterSpacing letterSpacing) {
        dimen$Sp.getClass();
        letterSpacing.getClass();
        this.textColor = num;
        this.textSize = dimen$Sp;
        this.font = i;
        this.lineHeight = dimen$Sp2;
        this.letterSpacing = letterSpacing;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.squareup.cash.mooncake.themes.LetterSpacing] */
    public static TextThemeInfo copy$default(TextThemeInfo textThemeInfo, Integer num, Dimen$Sp dimen$Sp, LetterSpacing$Companion$Em letterSpacing$Companion$Em, int i) {
        if ((i & 1) != 0) {
            num = textThemeInfo.textColor;
        }
        Integer num2 = num;
        if ((i & 2) != 0) {
            dimen$Sp = textThemeInfo.textSize;
        }
        Dimen$Sp dimen$Sp2 = dimen$Sp;
        int i2 = (i & 4) != 0 ? textThemeInfo.font : R.font.cashsans_regular;
        Dimen$Sp dimen$Sp3 = textThemeInfo.lineHeight;
        LetterSpacing$Companion$Em letterSpacing$Companion$Em2 = letterSpacing$Companion$Em;
        if ((i & 16) != 0) {
            letterSpacing$Companion$Em2 = textThemeInfo.letterSpacing;
        }
        LetterSpacing$Companion$Em letterSpacing$Companion$Em3 = letterSpacing$Companion$Em2;
        textThemeInfo.getClass();
        dimen$Sp2.getClass();
        letterSpacing$Companion$Em3.getClass();
        return new TextThemeInfo(num2, dimen$Sp2, i2, dimen$Sp3, letterSpacing$Companion$Em3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextThemeInfo) {
            TextThemeInfo textThemeInfo = (TextThemeInfo) obj;
            if (Intrinsics.areEqual(this.textColor, textThemeInfo.textColor) && Intrinsics.areEqual(this.textSize, textThemeInfo.textSize) && this.font == textThemeInfo.font && this.lineHeight == textThemeInfo.lineHeight && Intrinsics.areEqual(this.letterSpacing, textThemeInfo.letterSpacing)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.textColor;
        return this.letterSpacing.hashCode() + ((this.lineHeight.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.font, (this.textSize.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "TextThemeInfo(textColor=" + this.textColor + ", textSize=" + this.textSize + ", font=" + this.font + ", lineHeight=" + this.lineHeight + ", letterSpacing=" + this.letterSpacing + ")";
    }
}
