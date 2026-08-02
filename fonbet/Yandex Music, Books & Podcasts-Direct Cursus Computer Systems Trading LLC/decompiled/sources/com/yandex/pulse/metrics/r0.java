package com.yandex.pulse.metrics;

import defpackage.hse;

/* loaded from: classes5.dex */
public enum r0 implements hse {
    INSTALL_RESULT_SUCCESS(0),
    INSTALL_RESULT_FAILED_CUSTOM_ERROR(1),
    INSTALL_RESULT_FAILED_MSI_ERROR(2),
    INSTALL_RESULT_FAILED_SYSTEM_ERROR(3),
    INSTALL_RESULT_EXIT_CODE(4);

    public final int a;

    r0(int i) {
        this.a = i;
    }

    public static r0 b(int i) {
        if (i == 0) {
            return INSTALL_RESULT_SUCCESS;
        }
        if (i == 1) {
            return INSTALL_RESULT_FAILED_CUSTOM_ERROR;
        }
        if (i == 2) {
            return INSTALL_RESULT_FAILED_MSI_ERROR;
        }
        if (i == 3) {
            return INSTALL_RESULT_FAILED_SYSTEM_ERROR;
        }
        if (i != 4) {
            return null;
        }
        return INSTALL_RESULT_EXIT_CODE;
    }

    @Override // defpackage.hse
    public final int a() {
        return this.a;
    }
}
