package com.yandex.pulse.metrics;

import defpackage.hse;

/* loaded from: classes5.dex */
public enum v implements hse {
    UNDEFINED(0),
    CLOUD_GAMING_DEVICE(1),
    FEATURE_AWARE_DEVICE(2);

    public final int a;

    v(int i) {
        this.a = i;
    }

    public static v b(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return CLOUD_GAMING_DEVICE;
        }
        if (i != 2) {
            return null;
        }
        return FEATURE_AWARE_DEVICE;
    }

    @Override // defpackage.hse
    public final int a() {
        return this.a;
    }
}
