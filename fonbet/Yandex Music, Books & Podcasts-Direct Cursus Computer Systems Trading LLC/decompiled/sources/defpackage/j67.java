package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import javax.jmdns.impl.a;

/* loaded from: classes5.dex */
public abstract class j67 {
    public final String a;
    public final String b;
    public final String c;
    public final y67 d;
    public final x67 e;
    public final boolean f;
    public final HashMap g;

    public j67(String str, y67 y67Var, x67 x67Var, boolean z) {
        this.b = str;
        this.d = y67Var;
        this.e = x67Var;
        this.f = z;
        HashMap n = a.n(c());
        this.g = n;
        String str2 = (String) n.get(ekp.a);
        String str3 = (String) n.get(ekp.b);
        String str4 = (String) n.get(ekp.c);
        String lowerCase = ((String) n.get(ekp.d)).toLowerCase();
        StringBuilder sb = new StringBuilder();
        sb.append(str4.length() > 0 ? hrg.q("_", str4, ".") : "");
        String s = vz1.s(sb, str3.length() > 0 ? hrg.q("_", str3, ".") : "", str2, ".");
        this.c = s;
        this.a = (lowerCase.length() > 0 ? lowerCase.concat(".") : "").concat(s).toLowerCase();
    }

    public final int a(w67 w67Var) {
        byte[] n = n();
        byte[] n2 = w67Var.n();
        int min = Math.min(n.length, n2.length);
        for (int i = 0; i < min; i++) {
            byte b = n[i];
            byte b2 = n2[i];
            if (b > b2) {
                return 1;
            }
            if (b < b2) {
                return -1;
            }
        }
        return n.length - n2.length;
    }

    public final String b() {
        String str = this.a;
        return str != null ? str : "";
    }

    public final String c() {
        String str = this.b;
        return str != null ? str : "";
    }

    public final x67 d() {
        x67 x67Var = this.e;
        return x67Var != null ? x67Var : x67.CLASS_UNKNOWN;
    }

    public final y67 e() {
        y67 y67Var = this.d;
        return y67Var != null ? y67Var : y67.TYPE_IGNORE;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j67) {
            j67 j67Var = (j67) obj;
            if (b().equals(j67Var.b()) && e().equals(j67Var.e()) && d() == j67Var.d()) {
                return true;
            }
        }
        return false;
    }

    public final String f() {
        String str = (String) Collections.unmodifiableMap(this.g).get(ekp.e);
        return str != null ? str : "";
    }

    public final boolean g() {
        ekp ekpVar = ekp.c;
        HashMap hashMap = this.g;
        if (!((String) hashMap.get(ekpVar)).equals("dns-sd")) {
            return false;
        }
        String str = (String) hashMap.get(ekp.d);
        return "b".equals(str) || "db".equals(str) || "r".equals(str) || "dr".equals(str) || "lb".equals(str);
    }

    public abstract boolean h(long j);

    public final int hashCode() {
        return b().hashCode() + e().a + d().a;
    }

    public boolean i(j67 j67Var) {
        if (b().equals(j67Var.b())) {
            return e().equals(j67Var.e()) && l(j67Var.d());
        }
        return false;
    }

    public boolean j(j67 j67Var) {
        return j67Var.e() == e();
    }

    public final boolean k() {
        ekp ekpVar = ekp.c;
        HashMap hashMap = this.g;
        return ((String) hashMap.get(ekpVar)).equals("dns-sd") && ((String) hashMap.get(ekp.d)).equals("_services");
    }

    public final boolean l(x67 x67Var) {
        x67 x67Var2 = x67.CLASS_ANY;
        return x67Var2 == x67Var || x67Var2 == d() || d().equals(x67Var);
    }

    public void m(DataOutputStream dataOutputStream) {
        dataOutputStream.write(c().getBytes("UTF8"));
        dataOutputStream.writeShort(e().a);
        dataOutputStream.writeShort(d().a);
    }

    public final byte[] n() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            m(dataOutputStream);
            dataOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new InternalError();
        }
    }

    public abstract void o(StringBuilder sb);

    public final String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("[" + getClass().getSimpleName() + "@" + System.identityHashCode(this));
        StringBuilder sb2 = new StringBuilder(" type: ");
        sb2.append(e());
        sb.append(sb2.toString());
        sb.append(", class: " + d());
        sb.append(this.f ? "-unique," : StringUtils.COMMA);
        sb.append(" name: " + this.b);
        o(sb);
        sb.append("]");
        return sb.toString();
    }
}
