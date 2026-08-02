package defpackage;

import java.util.ArrayList;

/* loaded from: classes13.dex */
public final class sza0 {
    public final ArrayList a;
    public final int b;

    public sza0(ArrayList arrayList, int i) {
        this.a = arrayList;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sza0)) {
            return false;
        }
        sza0 sza0Var = (sza0) obj;
        return this.a.equals(sza0Var.a) && this.b == sza0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PermissionResult(grantedPermissions=");
        sb.append(this.a);
        sb.append(", requestCode=");
        return oyr.s(sb, this.b, ')');
    }
}
