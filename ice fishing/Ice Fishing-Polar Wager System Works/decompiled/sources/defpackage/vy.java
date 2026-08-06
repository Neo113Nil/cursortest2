package defpackage;

/* loaded from: classes.dex */
public final class vy {
    public final java.util.List F7NU4MC0GW;
    public final java.lang.String IHQe1A4L2xu;
    public final java.lang.String adDC3e2L;
    public final java.lang.String oh6vYeIP;
    public final java.lang.String r1MBDhnF;
    public final java.lang.String xiZrDbcSW0;

    public vy(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, java.lang.String str4, java.lang.String str5) {
        str.getClass();
        this.IHQe1A4L2xu = str;
        str2.getClass();
        this.oh6vYeIP = str2;
        this.r1MBDhnF = str3;
        list.getClass();
        this.F7NU4MC0GW = list;
        this.adDC3e2L = str4;
        this.xiZrDbcSW0 = str5;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
        sb.append("-");
        sb.append(str4);
        if (str5 != null) {
            int length = str5.length();
            int i = 0;
            while (i < length) {
                int codePointAt = str5.codePointAt(i);
                if (!java.lang.Character.isWhitespace(codePointAt)) {
                    sb.append("-VF");
                    return;
                }
                i += java.lang.Character.charCount(codePointAt);
            }
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.IHQe1A4L2xu + ", mProviderPackage: " + this.oh6vYeIP + ", mQuery: " + this.r1MBDhnF + ", mSystemFont: " + this.adDC3e2L + ", mVariationSettings: " + this.xiZrDbcSW0 + ", mCertificates:");
        int i = 0;
        while (true) {
            java.util.List list = this.F7NU4MC0GW;
            if (i >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            java.util.List list2 = (java.util.List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb.append(" \"");
                sb.append(android.util.Base64.encodeToString((byte[]) list2.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }
}
