package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.mb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC0458mb {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);

    public final int a;

    EnumC0458mb(int i) {
        this.a = i;
    }

    public static EnumC0458mb a(Integer num) {
        if (num != null) {
            for (EnumC0458mb enumC0458mb : values()) {
                if (enumC0458mb.a == num.intValue()) {
                    return enumC0458mb;
                }
            }
        }
        return UNKNOWN;
    }
}
