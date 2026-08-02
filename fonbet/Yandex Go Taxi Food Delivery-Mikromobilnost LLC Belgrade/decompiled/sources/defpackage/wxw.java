package defpackage;

import com.yandex.plus.core.graphql.type.INVOICE_STATUS;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class wxw {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[INVOICE_STATUS.values().length];
        try {
            iArr[INVOICE_STATUS.CANCELLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[INVOICE_STATUS.CREATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[INVOICE_STATUS.CREATED_LEGACY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[INVOICE_STATUS.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[INVOICE_STATUS.PROVISION_SCHEDULED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[INVOICE_STATUS.SCHEDULED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[INVOICE_STATUS.STARTED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[INVOICE_STATUS.SUCCESS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[INVOICE_STATUS.WAIT_FOR_3DS.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[INVOICE_STATUS.WAIT_FOR_NOTIFICATION.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[INVOICE_STATUS.WAIT_FOR_SBP.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[INVOICE_STATUS.WAIT_FOR_UZUM.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[INVOICE_STATUS.UNKNOWN__.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        a = iArr;
    }
}
