package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class e00 {
    public final java.util.List JhCgjQRTAOCT;
    public final java.lang.String QiMR8OkAhezm;
    public final java.lang.String WDYagTQQm9ns;
    public final java.lang.String ZpBGe2uQfcn8;
    public final java.lang.String fWTAfUmVKrZq;
    public final java.lang.String giKS3J6vZuNy;
    public final java.lang.String oh71FJcDz6S2;

    public e00(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, java.lang.String str4, java.lang.String str5) {
        str.getClass();
        this.ZpBGe2uQfcn8 = str;
        str2.getClass();
        this.giKS3J6vZuNy = str2;
        this.fWTAfUmVKrZq = str3;
        list.getClass();
        this.JhCgjQRTAOCT = list;
        this.WDYagTQQm9ns = str4;
        this.oh71FJcDz6S2 = str5;
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
            while (true) {
                if (i >= length) {
                    break;
                }
                int codePointAt = str5.codePointAt(i);
                if (!java.lang.Character.isWhitespace(codePointAt)) {
                    sb.append("-VF");
                    break;
                }
                i += java.lang.Character.charCount(codePointAt);
            }
        }
        this.QiMR8OkAhezm = sb.toString();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.ZpBGe2uQfcn8 + ", mProviderPackage: " + this.giKS3J6vZuNy + ", mQuery: " + this.fWTAfUmVKrZq + ", mSystemFont: " + this.WDYagTQQm9ns + ", mVariationSettings: " + this.oh71FJcDz6S2 + ", mCertificates:");
        int i = 0;
        while (true) {
            java.util.List list = this.JhCgjQRTAOCT;
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
