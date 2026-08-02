package ru.CryptoPro.JCPRequest.ca20.status;

/* loaded from: classes4.dex */
public class CA20Status {
    public static final String STATUS_CERTIFICATE_DESCRIPTION_E = "Expired";
    public static final String STATUS_CERTIFICATE_DESCRIPTION_H = "Hold";
    public static final String STATUS_CERTIFICATE_DESCRIPTION_R = "Revoked";
    public static final String STATUS_CERTIFICATE_DESCRIPTION_V = "Valid";
    public static final String STATUS_CERTIFICATE_E = "E";
    public static final String STATUS_CERTIFICATE_H = "H";
    public static final String STATUS_CERTIFICATE_R = "R";
    public static final String STATUS_CERTIFICATE_V = "V";
    public static final String STATUS_REQUEST_A = "A";
    public static final String STATUS_REQUEST_C = "C";
    public static final String STATUS_REQUEST_D = "D";
    public static final String STATUS_REQUEST_DESCRIPTION_A = "Accepted";
    public static final String STATUS_REQUEST_DESCRIPTION_C = "Complete";
    public static final String STATUS_REQUEST_DESCRIPTION_D = "Denied";
    public static final String STATUS_REQUEST_DESCRIPTION_E = "Errored";
    public static final String STATUS_REQUEST_DESCRIPTION_K = "Acknowledged";
    public static final String STATUS_REQUEST_DESCRIPTION_P = "Pending";
    public static final String STATUS_REQUEST_DESCRIPTION_Q = "Queued";
    public static final String STATUS_REQUEST_DESCRIPTION_R = "Rejected";
    public static final String STATUS_REQUEST_E = "E";
    public static final String STATUS_REQUEST_K = "K";
    public static final String STATUS_REQUEST_P = "P";
    public static final String STATUS_REQUEST_Q = "Q";
    public static final String STATUS_REQUEST_R = "R";
    public static final String STATUS_USER_A = "A";
    public static final String STATUS_USER_DESCRIPTION_A = "Active";
    public static final String STATUS_USER_DESCRIPTION_I = "Inactive";
    public static final String STATUS_USER_I = "I";
    public String a;

    /* renamed from: ru.CryptoPro.JCPRequest.ca20.status.CA20Status$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[StatusGroup.values().length];
            a = iArr;
            try {
                iArr[StatusGroup.sgRequest.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[StatusGroup.sgCertificate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[StatusGroup.sgUser.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class StatusGroup {
        private static final /* synthetic */ StatusGroup[] $VALUES;
        public static final StatusGroup sgCertificate;
        public static final StatusGroup sgRequest;
        public static final StatusGroup sgUser;

        static {
            StatusGroup statusGroup = new StatusGroup("sgRequest", 0);
            sgRequest = statusGroup;
            StatusGroup statusGroup2 = new StatusGroup("sgCertificate", 1);
            sgCertificate = statusGroup2;
            StatusGroup statusGroup3 = new StatusGroup("sgUser", 2);
            sgUser = statusGroup3;
            $VALUES = new StatusGroup[]{statusGroup, statusGroup2, statusGroup3};
        }

        public static StatusGroup valueOf(String str) {
            return (StatusGroup) Enum.valueOf(StatusGroup.class, str);
        }

        public static StatusGroup[] values() {
            return (StatusGroup[]) $VALUES.clone();
        }
    }

    public CA20Status(String str) {
        this.a = str;
    }

    public static String getDescriptionByStatus(String str, StatusGroup statusGroup) {
        int i = AnonymousClass1.a[statusGroup.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? "Unknown" : str.equalsIgnoreCase("A") ? STATUS_USER_DESCRIPTION_A : str.equalsIgnoreCase(STATUS_USER_I) ? STATUS_USER_DESCRIPTION_I : "Unknown" : str.equalsIgnoreCase(STATUS_CERTIFICATE_V) ? STATUS_CERTIFICATE_DESCRIPTION_V : str.equalsIgnoreCase("R") ? STATUS_CERTIFICATE_DESCRIPTION_R : str.equalsIgnoreCase(STATUS_CERTIFICATE_H) ? STATUS_CERTIFICATE_DESCRIPTION_H : str.equalsIgnoreCase("E") ? STATUS_CERTIFICATE_DESCRIPTION_E : "Unknown" : str.equalsIgnoreCase(STATUS_REQUEST_Q) ? STATUS_REQUEST_DESCRIPTION_Q : str.equalsIgnoreCase("A") ? STATUS_REQUEST_DESCRIPTION_A : str.equalsIgnoreCase(STATUS_REQUEST_P) ? STATUS_REQUEST_DESCRIPTION_P : str.equalsIgnoreCase(STATUS_REQUEST_C) ? STATUS_REQUEST_DESCRIPTION_C : str.equalsIgnoreCase("R") ? STATUS_REQUEST_DESCRIPTION_R : str.equalsIgnoreCase("E") ? STATUS_REQUEST_DESCRIPTION_E : str.equalsIgnoreCase(STATUS_REQUEST_K) ? STATUS_REQUEST_DESCRIPTION_K : str.equalsIgnoreCase(STATUS_REQUEST_D) ? STATUS_REQUEST_DESCRIPTION_D : "Unknown";
    }

    public String getStatus() {
        return this.a;
    }

    public void setStatus(String str) {
        this.a = str;
    }

    public String toString() {
        return "status: " + this.a;
    }
}
