package t;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f2953a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2954b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2955c;

    /* renamed from: d, reason: collision with root package name */
    public final List f2956d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2957e;

    public c(String str, String str2, String str3, List list) {
        this.f2953a = str;
        this.f2954b = str2;
        this.f2955c = str3;
        list.getClass();
        this.f2956d = list;
        this.f2957e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f2953a + ", mProviderPackage: " + this.f2954b + ", mQuery: " + this.f2955c + ", mCertificates:");
        int i2 = 0;
        while (true) {
            List list = this.f2956d;
            if (i2 >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i2);
            for (int i3 = 0; i3 < list2.size(); i3++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i3), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i2++;
        }
    }
}
