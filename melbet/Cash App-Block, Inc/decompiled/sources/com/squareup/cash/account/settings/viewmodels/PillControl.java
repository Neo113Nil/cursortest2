package com.squareup.cash.account.settings.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class PillControl implements Control {
    public final Style style;
    public final String text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Style {
        public static final /* synthetic */ Style[] $VALUES;
        public static final Style ClickableButton;
        public static final Style PillDisabled;
        public static final Style PillEnabled;

        static {
            Style style = new Style("ClickableButton", 0);
            ClickableButton = style;
            Style style2 = new Style("PillDisabled", 1);
            PillDisabled = style2;
            Style style3 = new Style("PillEnabled", 2);
            PillEnabled = style3;
            $VALUES = new Style[]{style, style2, style3};
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    public PillControl(String str, Style style) {
        str.getClass();
        style.getClass();
        this.text = str;
        this.style = style;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PillControl)) {
            return false;
        }
        PillControl pillControl = (PillControl) obj;
        return Intrinsics.areEqual(this.text, pillControl.text) && this.style == pillControl.style;
    }

    public final int hashCode() {
        return this.style.hashCode() + (this.text.hashCode() * 31);
    }

    public final String toString() {
        return "PillControl(text=" + this.text + ", style=" + this.style + ")";
    }
}
