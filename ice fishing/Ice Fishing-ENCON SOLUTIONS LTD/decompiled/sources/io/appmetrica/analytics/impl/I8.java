package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public enum I8 {
    NONE(0),
    EXTERNALLY_ENCRYPTED_EVENT_CRYPTER(1),
    AES_VALUE_ENCRYPTION(2);


    /* renamed from: a, reason: collision with root package name */
    public final int f4539a;

    I8(int i2) {
        this.f4539a = i2;
    }

    public static I8 a(Integer num) {
        if (num != null) {
            for (I8 i8 : values()) {
                if (i8.f4539a == num.intValue()) {
                    return i8;
                }
            }
        }
        return NONE;
    }
}
