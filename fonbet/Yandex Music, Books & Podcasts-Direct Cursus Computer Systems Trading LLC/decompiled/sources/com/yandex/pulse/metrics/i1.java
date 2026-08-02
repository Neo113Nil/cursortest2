package com.yandex.pulse.metrics;

import defpackage.hse;

/* loaded from: classes5.dex */
public enum i1 implements hse {
    TPM_TYPE_UNKNOWN(0),
    TPM_TYPE_1(1),
    TPM_TYPE_CR50(2),
    TPM_TYPE_TI50(3),
    TPM_TYPE_RUNTIME_SELECTION(4),
    TPM_TYPE_GENERIC_2(5);

    public final int a;

    i1(int i) {
        this.a = i;
    }

    public static i1 b(int i) {
        if (i == 0) {
            return TPM_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return TPM_TYPE_1;
        }
        if (i == 2) {
            return TPM_TYPE_CR50;
        }
        if (i == 3) {
            return TPM_TYPE_TI50;
        }
        if (i == 4) {
            return TPM_TYPE_RUNTIME_SELECTION;
        }
        if (i != 5) {
            return null;
        }
        return TPM_TYPE_GENERIC_2;
    }

    @Override // defpackage.hse
    public final int a() {
        return this.a;
    }
}
