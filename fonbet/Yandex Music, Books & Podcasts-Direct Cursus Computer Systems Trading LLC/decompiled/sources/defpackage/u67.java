package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.impl.a;

/* loaded from: classes5.dex */
public final class u67 extends w67 {
    public static final Logger q = Logger.getLogger(u67.class.getName());
    public final int m;
    public final int n;
    public final int o;
    public final String p;

    public u67(String str, x67 x67Var, boolean z, int i, int i2, int i3, int i4, String str2) {
        super(str, y67.TYPE_SRV, x67Var, z, i);
        this.m = i2;
        this.n = i3;
        this.o = i4;
        this.p = str2;
    }

    @Override // defpackage.j67
    public final void m(DataOutputStream dataOutputStream) {
        super.m(dataOutputStream);
        dataOutputStream.writeShort(this.m);
        dataOutputStream.writeShort(this.n);
        dataOutputStream.writeShort(this.o);
        try {
            dataOutputStream.write(this.p.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException unused) {
        }
    }

    @Override // defpackage.w67, defpackage.j67
    public final void o(StringBuilder sb) {
        super.o(sb);
        sb.append(" server: '" + this.p + StringUtils.PROCESS_POSTFIX_DELIMITER + this.o + "'");
    }

    @Override // defpackage.w67
    public final dkp p(p2f p2fVar) {
        a q2 = q(false);
        q2.q.a = p2fVar;
        return new dkp(p2fVar, q2.i(), q2.e(), q2);
    }

    @Override // defpackage.w67
    public final a q(boolean z) {
        return new a(Collections.unmodifiableMap(this.g), this.o, this.n, this.m, z, null);
    }

    @Override // defpackage.w67
    public final boolean r(p2f p2fVar) {
        a aVar = (a) p2fVar.g.get(b());
        if (aVar != null && ((aVar.q.c.b == 2 || aVar.q.c.b()) && (this.o != aVar.h || !this.p.equalsIgnoreCase(p2fVar.i.a)))) {
            Logger logger = q;
            logger.finer("handleQuery() Conflicting probe detected from: " + this.j);
            u67 u67Var = new u67(aVar.f(), x67.CLASS_IN, true, 3600, aVar.j, aVar.i, aVar.h, p2fVar.i.a);
            try {
                if (p2fVar.i.b.equals(this.j)) {
                    logger.warning("Got conflicting probe from ourselves\nincoming: " + toString() + "\nlocal   : " + u67Var.toString());
                }
            } catch (IOException e) {
                q.log(Level.WARNING, "IOException", (Throwable) e);
            }
            int a = a(u67Var);
            if (a == 0) {
                q.finer("handleQuery() Ignoring a identical service query");
                return false;
            }
            if (aVar.q.c.b == 1 && a > 0) {
                String lowerCase = aVar.f().toLowerCase();
                o6c p = neg.p();
                InetAddress inetAddress = p2fVar.i.b;
                aVar.e = p.y(2, aVar.e());
                aVar.o = null;
                p2fVar.g.remove(lowerCase);
                p2fVar.g.put(aVar.f().toLowerCase(), aVar);
                q.finer("handleQuery() Lost tie break: new unique name chosen:" + aVar.e());
                aVar.q.d();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.w67
    public final boolean s(p2f p2fVar) {
        ConcurrentHashMap concurrentHashMap = p2fVar.g;
        a4e a4eVar = p2fVar.i;
        a aVar = (a) concurrentHashMap.get(b());
        if (aVar == null) {
            return false;
        }
        if (this.o == aVar.h && this.p.equalsIgnoreCase(a4eVar.a)) {
            return false;
        }
        Logger logger = q;
        logger.finer("handleResponse() Denial detected");
        if (aVar.q.c.b == 1) {
            String lowerCase = aVar.f().toLowerCase();
            o6c p = neg.p();
            InetAddress inetAddress = a4eVar.b;
            aVar.e = p.y(2, aVar.e());
            aVar.o = null;
            concurrentHashMap.remove(lowerCase);
            concurrentHashMap.put(aVar.f().toLowerCase(), aVar);
            logger.finer("handleResponse() New unique name chose:" + aVar.e());
        }
        aVar.q.d();
        return true;
    }

    @Override // defpackage.w67
    public final boolean t() {
        return true;
    }

    @Override // defpackage.w67
    public final boolean u(w67 w67Var) {
        if (!(w67Var instanceof u67)) {
            return false;
        }
        u67 u67Var = (u67) w67Var;
        return this.m == u67Var.m && this.n == u67Var.n && this.o == u67Var.o && this.p.equals(u67Var.p);
    }

    @Override // defpackage.w67
    public final void v(n67 n67Var) {
        n67Var.z(this.m);
        n67Var.z(this.n);
        n67Var.z(this.o);
        boolean z = l67.m;
        String str = this.p;
        if (z) {
            n67Var.g(str);
        } else {
            n67Var.D(str.length(), str);
            n67Var.a(0);
        }
    }
}
