package defpackage;

import java.net.InetAddress;
import java.util.logging.Logger;
import javax.jmdns.impl.a;

/* loaded from: classes5.dex */
public abstract class w67 extends j67 {
    public static final Logger k = Logger.getLogger(w67.class.getName());
    public static final byte[] l = {0};
    public int h;
    public long i;
    public InetAddress j;

    public w67(String str, y67 y67Var, x67 x67Var, boolean z, int i) {
        super(str, y67Var, x67Var, z);
        this.h = i;
        this.i = System.currentTimeMillis();
    }

    @Override // defpackage.j67
    public final boolean equals(Object obj) {
        return (obj instanceof w67) && super.equals(obj) && u((w67) obj);
    }

    @Override // defpackage.j67
    public final boolean h(long j) {
        return (((long) (100 * this.h)) * 10) + this.i <= j;
    }

    @Override // defpackage.j67
    public void o(StringBuilder sb) {
        sb.append(" ttl: '" + ((int) Math.max(0L, ((((100 * this.h) * 10) + this.i) - System.currentTimeMillis()) / 1000)) + "/" + this.h + "'");
    }

    public abstract dkp p(p2f p2fVar);

    public abstract a q(boolean z);

    public abstract boolean r(p2f p2fVar);

    public abstract boolean s(p2f p2fVar);

    public abstract boolean t();

    public abstract boolean u(w67 w67Var);

    public abstract void v(n67 n67Var);
}
