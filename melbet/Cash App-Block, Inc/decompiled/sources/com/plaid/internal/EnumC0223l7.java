package com.plaid.internal;

/* renamed from: com.plaid.internal.l7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC0223l7 {
    PRE_CHECK(16),
    DEVICE_DESCRIPTOR(32),
    START(48),
    AUTHENTICATION(64),
    FINISH(80);

    public final int a;

    EnumC0223l7(int i) {
        this.a = i;
    }

    public int getCode() {
        return this.a;
    }
}
