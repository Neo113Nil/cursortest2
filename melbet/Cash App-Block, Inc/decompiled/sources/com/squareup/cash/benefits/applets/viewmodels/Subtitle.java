package com.squareup.cash.benefits.applets.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class Subtitle {
    public final Style style;
    public final String text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class Style {
        public static final /* synthetic */ Style[] $VALUES;
        public static final Style BODY;
        public static final Style LABEL;

        static {
            Style style = new Style("LABEL", 0);
            LABEL = style;
            Style style2 = new Style("BODY", 1);
            BODY = style2;
            $VALUES = new Style[]{style, style2};
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    public Subtitle(String str, Style style) {
        str.getClass();
        this.text = str;
        this.style = style;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Subtitle)) {
            return false;
        }
        Subtitle subtitle = (Subtitle) obj;
        return Intrinsics.areEqual(this.text, subtitle.text) && this.style == subtitle.style;
    }

    public final int hashCode() {
        return this.style.hashCode() + (this.text.hashCode() * 31);
    }

    public final String toString() {
        return "Subtitle(text=" + this.text + ", style=" + this.style + ")";
    }
}
