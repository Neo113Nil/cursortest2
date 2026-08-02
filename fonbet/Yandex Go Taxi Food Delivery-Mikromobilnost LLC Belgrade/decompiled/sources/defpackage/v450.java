package defpackage;

import android.os.Bundle;
import java.util.Collection;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class v450 {
    public final int a;
    public k550 b = null;
    public Bundle c = null;

    public v450(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof v450)) {
            v450 v450Var = (v450) obj;
            if (this.a == v450Var.a && jl40.l(this.b, v450Var.b)) {
                if (!jl40.l(this.c, v450Var.c)) {
                    Bundle bundle = this.c;
                    if (bundle != null && (keySet = bundle.keySet()) != null) {
                        Set<String> set = keySet;
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            for (String str : set) {
                                Bundle bundle2 = this.c;
                                Object obj2 = bundle2 != null ? bundle2.get(str) : null;
                                Bundle bundle3 = v450Var.c;
                                if (!jl40.l(obj2, bundle3 != null ? bundle3.get(str) : null)) {
                                }
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = Integer.hashCode(this.a) * 31;
        k550 k550Var = this.b;
        int hashCode2 = hashCode + (k550Var != null ? k550Var.hashCode() : 0);
        Bundle bundle = this.c;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            for (String str : keySet) {
                int i = hashCode2 * 31;
                Bundle bundle2 = this.c;
                Object obj = bundle2 != null ? bundle2.get(str) : null;
                hashCode2 = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(v450.class.getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.a));
        sb.append(Extension.C_BRAKE);
        if (this.b != null) {
            sb.append(" navOptions=");
            sb.append(this.b);
        }
        return sb.toString();
    }
}
