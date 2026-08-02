package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.wb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC0821wb {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);

    public final int a;

    EnumC0821wb(int i) {
        this.a = i;
    }

    public static EnumC0821wb a(Integer num) {
        if (num != null) {
            for (EnumC0821wb enumC0821wb : values()) {
                if (enumC0821wb.a == num.intValue()) {
                    return enumC0821wb;
                }
            }
        }
        return UNKNOWN;
    }
}
