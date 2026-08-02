package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class a4e implements d77 {
    public static final Logger e = Logger.getLogger(a4e.class.getName());
    public String a;
    public final InetAddress b;
    public final NetworkInterface c;
    public final z3e d;

    public a4e(InetAddress inetAddress, String str, p2f p2fVar) {
        z3e z3eVar = new z3e();
        z3eVar.a = p2fVar;
        this.d = z3eVar;
        this.b = inetAddress;
        this.a = str;
        if (inetAddress != null) {
            try {
                this.c = NetworkInterface.getByInetAddress(inetAddress);
            } catch (Exception e2) {
                e.log(Level.SEVERE, "LocalHostInfo() exception ", (Throwable) e2);
            }
        }
    }

    @Override // defpackage.d77
    public final void S(e77 e77Var) {
        this.d.S(e77Var);
    }

    public final ArrayList a(x67 x67Var, boolean z, int i) {
        boolean z2;
        int i2;
        s67 s67Var;
        ArrayList arrayList = new ArrayList();
        InetAddress inetAddress = this.b;
        s67 s67Var2 = null;
        if (inetAddress instanceof Inet4Address) {
            String str = this.a;
            x67 x67Var2 = x67.CLASS_UNKNOWN;
            z2 = z;
            i2 = i;
            s67Var = new s67(str, y67.TYPE_A, z2, i2, this.b, 0);
        } else {
            z2 = z;
            i2 = i;
            s67Var = null;
        }
        if (s67Var != null && s67Var.l(x67Var)) {
            arrayList.add(s67Var);
        }
        if (inetAddress instanceof Inet6Address) {
            String str2 = this.a;
            x67 x67Var3 = x67.CLASS_UNKNOWN;
            s67Var2 = new s67(str2, y67.TYPE_AAAA, z2, i2, this.b, 1);
        }
        if (s67Var2 != null && s67Var2.l(x67Var)) {
            arrayList.add(s67Var2);
        }
        return arrayList;
    }

    public final boolean b(s67 s67Var) {
        s67 c = c(s67Var.e(), s67Var.f);
        return c != null && c.e() == s67Var.e() && c.c().equalsIgnoreCase(s67Var.c()) && !c.u(s67Var);
    }

    public final s67 c(y67 y67Var, boolean z) {
        int ordinal = y67Var.ordinal();
        InetAddress inetAddress = this.b;
        if (ordinal == 1) {
            if (!(inetAddress instanceof Inet4Address)) {
                return null;
            }
            String str = this.a;
            x67 x67Var = x67.CLASS_UNKNOWN;
            return new s67(str, y67.TYPE_A, z, 3600, this.b, 0);
        }
        if ((ordinal != 28 && ordinal != 38) || !(inetAddress instanceof Inet6Address)) {
            return null;
        }
        String str2 = this.a;
        x67 x67Var2 = x67.CLASS_UNKNOWN;
        return new s67(str2, y67.TYPE_AAAA, z, 3600, this.b, 1);
    }

    public final t67 d(y67 y67Var) {
        int ordinal = y67Var.ordinal();
        InetAddress inetAddress = this.b;
        if (ordinal == 1) {
            if (!(inetAddress instanceof Inet4Address)) {
                return null;
            }
            return new t67(inetAddress.getHostAddress() + ".in-addr.arpa.", x67.CLASS_IN, false, 3600, this.a);
        }
        if ((ordinal != 28 && ordinal != 38) || !(inetAddress instanceof Inet6Address)) {
            return null;
        }
        return new t67(inetAddress.getHostAddress() + ".ip6.arpa.", x67.CLASS_IN, false, 3600, this.a);
    }

    public final synchronized void e() {
        this.a = neg.p().y(1, this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(1024);
        sb.append("local host info[");
        String str = this.a;
        if (str == null) {
            str = "no name";
        }
        sb.append(str);
        sb.append(", ");
        NetworkInterface networkInterface = this.c;
        sb.append(networkInterface != null ? networkInterface.getDisplayName() : "???");
        sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        InetAddress inetAddress = this.b;
        sb.append(inetAddress != null ? inetAddress.getHostAddress() : "no address");
        sb.append(", ");
        sb.append(this.d);
        sb.append("]");
        return sb.toString();
    }
}
