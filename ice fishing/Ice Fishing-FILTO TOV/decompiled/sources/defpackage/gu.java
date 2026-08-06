package defpackage;

import android.util.Base64;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class gu {
    public final String EljAMC1QTz;
    public final String GWasM1elztuh;
    public final String OOA6hdeuvCS;
    public final String X1lG3V04pd;
    public final String Yi7zF1RB1;
    public final List xqGvceK5x;

    public gu(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.GWasM1elztuh = str;
        str2.getClass();
        this.Yi7zF1RB1 = str2;
        this.X1lG3V04pd = str3;
        list.getClass();
        this.xqGvceK5x = list;
        this.OOA6hdeuvCS = str4;
        this.EljAMC1QTz = str5;
        StringBuilder sb = new StringBuilder();
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
                if (!Character.isWhitespace(codePointAt)) {
                    sb.append("-VF");
                    return;
                }
                i += Character.charCount(codePointAt);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.GWasM1elztuh + ", mProviderPackage: " + this.Yi7zF1RB1 + ", mQuery: " + this.X1lG3V04pd + ", mSystemFont: " + this.OOA6hdeuvCS + ", mVariationSettings: " + this.EljAMC1QTz + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.xqGvceK5x;
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
