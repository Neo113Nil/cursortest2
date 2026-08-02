package com.yandex.pulse.metrics;

import defpackage.hse;

/* loaded from: classes5.dex */
public enum o1 implements hse {
    EFFECTIVE_CONNECTION_TYPE_UNKNOWN(0),
    DEPRECATED_EFFECTIVE_CONNECTION_TYPE_AMBIGUOUS(1),
    EFFECTIVE_CONNECTION_TYPE_OFFLINE(2),
    EFFECTIVE_CONNECTION_TYPE_SLOW_2G(3),
    EFFECTIVE_CONNECTION_TYPE_2G(4),
    EFFECTIVE_CONNECTION_TYPE_3G(5),
    EFFECTIVE_CONNECTION_TYPE_4G(6);

    public final int a;

    o1(int i2) {
        this.a = i2;
    }

    public static o1 b(int i2) {
        switch (i2) {
            case 0:
                return EFFECTIVE_CONNECTION_TYPE_UNKNOWN;
            case 1:
                return DEPRECATED_EFFECTIVE_CONNECTION_TYPE_AMBIGUOUS;
            case 2:
                return EFFECTIVE_CONNECTION_TYPE_OFFLINE;
            case 3:
                return EFFECTIVE_CONNECTION_TYPE_SLOW_2G;
            case 4:
                return EFFECTIVE_CONNECTION_TYPE_2G;
            case 5:
                return EFFECTIVE_CONNECTION_TYPE_3G;
            case 6:
                return EFFECTIVE_CONNECTION_TYPE_4G;
            default:
                return null;
        }
    }

    @Override // defpackage.hse
    public final int a() {
        return this.a;
    }
}
