package com.yandex.pulse.metrics;

import defpackage.hse;

/* loaded from: classes5.dex */
public enum s1 implements hse {
    UNKNOWN(0),
    DARK_MODE_SYSTEM(1),
    DARK_MODE_APP(2),
    LIGHT_MODE_SYSTEM(3),
    LIGHT_MODE_APP(4);

    public final int a;

    s1(int i) {
        this.a = i;
    }

    public static s1 b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return DARK_MODE_SYSTEM;
        }
        if (i == 2) {
            return DARK_MODE_APP;
        }
        if (i == 3) {
            return LIGHT_MODE_SYSTEM;
        }
        if (i != 4) {
            return null;
        }
        return LIGHT_MODE_APP;
    }

    @Override // defpackage.hse
    public final int a() {
        return this.a;
    }
}
