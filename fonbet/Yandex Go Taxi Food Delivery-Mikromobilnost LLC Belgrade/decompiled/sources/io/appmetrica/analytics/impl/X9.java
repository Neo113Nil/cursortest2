package io.appmetrica.analytics.impl;

/* loaded from: classes9.dex */
public enum X9 {
    NONE(0),
    EXTERNALLY_ENCRYPTED_EVENT_CRYPTER(1),
    AES_VALUE_ENCRYPTION(2);

    public final int a;

    X9(int i) {
        this.a = i;
    }

    public static X9 a(Integer num) {
        if (num != null) {
            for (X9 x9 : values()) {
                if (x9.a == num.intValue()) {
                    return x9;
                }
            }
        }
        return NONE;
    }
}
