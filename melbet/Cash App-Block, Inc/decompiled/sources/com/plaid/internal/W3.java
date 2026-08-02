package com.plaid.internal;

/* loaded from: classes5.dex */
public enum W3 {
    DISABLED(0),
    ERROR(1),
    WARN(2),
    INFO(3),
    DEBUG(4),
    TRACE(5);

    public final int a;

    W3(int i) {
        this.a = i;
    }

    public int getValue() {
        return this.a;
    }
}
