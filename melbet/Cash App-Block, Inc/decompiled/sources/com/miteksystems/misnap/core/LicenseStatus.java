package com.miteksystems.misnap.core;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/miteksystems/misnap/core/LicenseStatus;", "", "", "toMessage", "()Ljava/lang/String;", "NOT_VALID", "PLATFORM_NOT_SUPPORTED", "NOT_VALID_APP_ID", "FEATURE_NOT_SUPPORTED", "EXPIRED", "DISABLED", "VALID", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LicenseStatus {
    public static final LicenseStatus DISABLED;
    public static final LicenseStatus EXPIRED;
    public static final LicenseStatus FEATURE_NOT_SUPPORTED;
    public static final LicenseStatus NOT_VALID;
    public static final LicenseStatus NOT_VALID_APP_ID;
    public static final LicenseStatus PLATFORM_NOT_SUPPORTED;
    public static final LicenseStatus VALID;
    public static final /* synthetic */ LicenseStatus[] a;

    public abstract /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LicenseStatus.values().length];
            try {
                iArr[LicenseStatus.NOT_VALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LicenseStatus.EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LicenseStatus.DISABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LicenseStatus.NOT_VALID_APP_ID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LicenseStatus.PLATFORM_NOT_SUPPORTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LicenseStatus.FEATURE_NOT_SUPPORTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LicenseStatus.VALID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr;
        }
    }

    static {
        LicenseStatus licenseStatus = new LicenseStatus("NOT_VALID", 0);
        NOT_VALID = licenseStatus;
        LicenseStatus licenseStatus2 = new LicenseStatus("PLATFORM_NOT_SUPPORTED", 1);
        PLATFORM_NOT_SUPPORTED = licenseStatus2;
        LicenseStatus licenseStatus3 = new LicenseStatus("NOT_VALID_APP_ID", 2);
        NOT_VALID_APP_ID = licenseStatus3;
        LicenseStatus licenseStatus4 = new LicenseStatus("FEATURE_NOT_SUPPORTED", 3);
        FEATURE_NOT_SUPPORTED = licenseStatus4;
        LicenseStatus licenseStatus5 = new LicenseStatus("EXPIRED", 4);
        EXPIRED = licenseStatus5;
        LicenseStatus licenseStatus6 = new LicenseStatus("DISABLED", 5);
        DISABLED = licenseStatus6;
        LicenseStatus licenseStatus7 = new LicenseStatus("VALID", 6);
        VALID = licenseStatus7;
        a = new LicenseStatus[]{licenseStatus, licenseStatus2, licenseStatus3, licenseStatus4, licenseStatus5, licenseStatus6, licenseStatus7};
    }

    public static LicenseStatus valueOf(String str) {
        return (LicenseStatus) Enum.valueOf(LicenseStatus.class, str);
    }

    public static LicenseStatus[] values() {
        return (LicenseStatus[]) a.clone();
    }

    public final String toMessage() {
        switch (a.a[ordinal()]) {
            case 1:
                return "License Signature Invalid";
            case 2:
                return "License Expired";
            case 3:
                return "License Disabled";
            case 4:
                return "Application Package Invalid";
            case 5:
                return "Platform invalid";
            case 6:
                return "Feature Invalid";
            case 7:
                return "Valid License";
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }
}
