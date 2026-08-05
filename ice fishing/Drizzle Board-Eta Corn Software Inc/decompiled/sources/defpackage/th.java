package defpackage;

import android.util.Base64;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class th {
    public final String MdtA4re8;
    public final String NCTxEWno;
    public final String P7K7Inc8;
    public final String VgvYg0wo;
    public final String b2ZJblxo;
    public final String qoPGr6Ce;
    public final List wxUZMvaN;

    public th(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.qoPGr6Ce = str;
        str2.getClass();
        this.NCTxEWno = str2;
        this.MdtA4re8 = str3;
        list.getClass();
        this.wxUZMvaN = list;
        this.VgvYg0wo = str4;
        this.P7K7Inc8 = str5;
        StringBuilder sb = new StringBuilder(str);
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
                if (!Character.isWhitespace(codePointAt)) {
                    sb.append("-VF");
                    break;
                }
                i += Character.charCount(codePointAt);
            }
        }
        this.b2ZJblxo = sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontRequest {mProviderAuthority: " + this.qoPGr6Ce + ", mProviderPackage: " + this.NCTxEWno + ", mQuery: " + this.MdtA4re8 + ", mSystemFont: " + this.VgvYg0wo + ", mVariationSettings: " + this.P7K7Inc8 + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.wxUZMvaN;
            if (i >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }
}
