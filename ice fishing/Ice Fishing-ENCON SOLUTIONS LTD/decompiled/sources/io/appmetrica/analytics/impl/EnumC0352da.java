package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.da, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0352da {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);


    /* renamed from: a, reason: collision with root package name */
    public final int f5815a;

    EnumC0352da(int i2) {
        this.f5815a = i2;
    }

    public static EnumC0352da a(Integer num) {
        if (num != null) {
            for (EnumC0352da enumC0352da : values()) {
                if (enumC0352da.f5815a == num.intValue()) {
                    return enumC0352da;
                }
            }
        }
        return UNKNOWN;
    }
}
