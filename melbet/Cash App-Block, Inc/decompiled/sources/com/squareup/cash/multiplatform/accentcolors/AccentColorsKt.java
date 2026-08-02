package com.squareup.cash.multiplatform.accentcolors;

import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public abstract class AccentColorsKt {
    public static final Color placeholderBackground = new Color("#D9D9D9", "#454647");

    public static final Color getAccentColor(String str, String str2, String str3, String str4, String str5) {
        if (str == null || StringsKt.isBlank(str)) {
            str = null;
        }
        if (str == null) {
            if (str2 == null || StringsKt.isBlank(str2)) {
                str2 = null;
            }
            if (str2 == null) {
                if (str3 == null || StringsKt.isBlank(str3)) {
                    str3 = null;
                }
                if (str3 == null) {
                    if (str4 == null || StringsKt.isBlank(str4)) {
                        str4 = null;
                    }
                    if (str4 == null) {
                        if (str5 == null || StringsKt.isBlank(str5)) {
                            str5 = null;
                        }
                        if (str5 == null) {
                            return placeholderBackground;
                        }
                        str = str5;
                    } else {
                        str = str4;
                    }
                } else {
                    str = str3;
                }
            } else {
                str = str2;
            }
        }
        MooncakeColors mooncakeColors = MooncakeColors.values()[Math.abs(str.hashCode()) % MooncakeColors.values().length];
        return new Color(mooncakeColors.lightSrgb, mooncakeColors.darkSrgb);
    }

    public static /* synthetic */ Color getAccentColor$default(int i, String str, String str2, String str3, String str4, String str5) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            str5 = null;
        }
        return getAccentColor(str, str2, str3, str4, str5);
    }
}
