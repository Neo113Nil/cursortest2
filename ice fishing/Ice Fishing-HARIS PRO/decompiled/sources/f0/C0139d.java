package f0;

import android.os.Bundle;
import java.util.Set;

/* renamed from: f0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0139d {

    /* renamed from: a, reason: collision with root package name */
    public final int f2912a;

    /* renamed from: b, reason: collision with root package name */
    public C0134C f2913b = null;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f2914c = null;

    public C0139d(int i) {
        this.f2912a = i;
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0139d)) {
            return false;
        }
        C0139d c0139d = (C0139d) obj;
        if (this.f2912a == c0139d.f2912a && D1.i.a(this.f2913b, c0139d.f2913b)) {
            if (D1.i.a(this.f2914c, c0139d.f2914c)) {
                return true;
            }
            Bundle bundle = this.f2914c;
            if (bundle != null && (keySet = bundle.keySet()) != null) {
                if (keySet.isEmpty()) {
                    return true;
                }
                for (String str : keySet) {
                    Bundle bundle2 = this.f2914c;
                    Object obj2 = bundle2 != null ? bundle2.get(str) : null;
                    Bundle bundle3 = c0139d.f2914c;
                    if (!D1.i.a(obj2, bundle3 != null ? bundle3.get(str) : null)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = Integer.hashCode(this.f2912a) * 31;
        C0134C c0134c = this.f2913b;
        int hashCode2 = hashCode + (c0134c != null ? c0134c.hashCode() : 0);
        Bundle bundle = this.f2914c;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            for (String str : keySet) {
                int i = hashCode2 * 31;
                Bundle bundle2 = this.f2914c;
                Object obj = bundle2 != null ? bundle2.get(str) : null;
                hashCode2 = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0139d.class.getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.f2912a));
        sb.append(")");
        if (this.f2913b != null) {
            sb.append(" navOptions=");
            sb.append(this.f2913b);
        }
        String sb2 = sb.toString();
        D1.i.d(sb2, "sb.toString()");
        return sb2;
    }
}
