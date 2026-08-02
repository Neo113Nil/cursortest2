package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.jmdns.impl.a;

/* loaded from: classes5.dex */
public final class t67 extends w67 {
    public final String m;

    public t67(String str, x67 x67Var, boolean z, int i, String str2) {
        super(str, y67.TYPE_PTR, x67Var, z, i);
        this.m = str2;
    }

    @Override // defpackage.j67
    public final boolean i(j67 j67Var) {
        return super.i(j67Var) && (j67Var instanceof t67) && u((t67) j67Var);
    }

    @Override // defpackage.w67, defpackage.j67
    public final void o(StringBuilder sb) {
        super.o(sb);
        StringBuilder sb2 = new StringBuilder(" alias: '");
        String str = this.m;
        sb2.append(str != null ? str.toString() : "null");
        sb2.append("'");
        sb.append(sb2.toString());
    }

    @Override // defpackage.w67
    public final dkp p(p2f p2fVar) {
        a q = q(false);
        q.q.a = p2fVar;
        String i = q.i();
        return new dkp(p2fVar, i, p2f.U0(i, this.m), q);
    }

    @Override // defpackage.w67
    public final a q(boolean z) {
        boolean k = k();
        String str = this.m;
        if (k) {
            return new a(a.n(str), 0, 0, 0, z, null);
        }
        HashMap hashMap = this.g;
        ekp ekpVar = ekp.a;
        if (((String) hashMap.get(ekpVar)).endsWith("in-addr.arpa") || ((String) hashMap.get(ekpVar)).endsWith("ip6.arpa")) {
            return new a(Collections.unmodifiableMap(hashMap), 0, 0, 0, z, null);
        }
        if (g()) {
            return new a(Collections.unmodifiableMap(hashMap), 0, 0, 0, z, null);
        }
        HashMap n = a.n(str);
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        ekp ekpVar2 = ekp.e;
        n.put(ekpVar2, unmodifiableMap.get(ekpVar2));
        a aVar = new a(n, 0, 0, 0, z, null);
        aVar.g = str;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            a.y(byteArrayOutputStream, str);
            aVar.k = byteArrayOutputStream.toByteArray();
            return aVar;
        } catch (IOException e) {
            qq6.b(e, "unexpected exception: ");
            return null;
        }
    }

    @Override // defpackage.w67
    public final boolean r(p2f p2fVar) {
        return false;
    }

    @Override // defpackage.w67
    public final boolean s(p2f p2fVar) {
        return false;
    }

    @Override // defpackage.w67
    public final boolean t() {
        return false;
    }

    @Override // defpackage.w67
    public final boolean u(w67 w67Var) {
        if (!(w67Var instanceof t67)) {
            return false;
        }
        String str = ((t67) w67Var).m;
        String str2 = this.m;
        if (str2 != null || str == null) {
            return str2.equals(str);
        }
        return false;
    }

    @Override // defpackage.w67
    public final void v(n67 n67Var) {
        n67Var.g(this.m);
    }
}
