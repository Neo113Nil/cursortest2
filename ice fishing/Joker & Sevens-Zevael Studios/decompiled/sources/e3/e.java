package e3;

import android.util.Base64;
import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f2070a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2071b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2072c;

    /* renamed from: d, reason: collision with root package name */
    public final List f2073d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2074e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2075f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2076g;

    public e(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.f2070a = str;
        str2.getClass();
        this.f2071b = str2;
        this.f2072c = str3;
        list.getClass();
        this.f2073d = list;
        this.f2074e = str4;
        this.f2075f = str5;
        this.f2076g = str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f2070a + ", mProviderPackage: " + this.f2071b + ", mQuery: " + this.f2072c + ", mSystemFont: " + this.f2074e + ", mVariationSettings: " + this.f2075f + ", mCertificates:");
        int i10 = 0;
        while (true) {
            List list = this.f2073d;
            if (i10 >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i10);
            for (int i11 = 0; i11 < list2.size(); i11++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i11), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i10++;
        }
    }
}
