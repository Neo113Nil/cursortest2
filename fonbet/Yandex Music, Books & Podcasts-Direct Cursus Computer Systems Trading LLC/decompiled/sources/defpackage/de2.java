package defpackage;

import android.util.Base64;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class de2 {
    public final String a;
    public final byte[] b;
    public final lsm c;

    public de2(String str, byte[] bArr, lsm lsmVar) {
        this.a = str;
        this.b = bArr;
        this.c = lsmVar;
    }

    public static nsh a() {
        nsh nshVar = new nsh(17, false);
        nshVar.d = lsm.a;
        return nshVar;
    }

    public final de2 b(lsm lsmVar) {
        nsh a = a();
        a.L(this.a);
        if (lsmVar == null) {
            jj4.j("Null priority");
            return null;
        }
        a.d = lsmVar;
        a.c = this.b;
        return a.c();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof de2) {
            de2 de2Var = (de2) obj;
            if (this.a.equals(de2Var.a) && Arrays.equals(this.b, de2Var.b) && this.c.equals(de2Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.b;
        String encodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return su4.o(sb, encodeToString, ")");
    }
}
