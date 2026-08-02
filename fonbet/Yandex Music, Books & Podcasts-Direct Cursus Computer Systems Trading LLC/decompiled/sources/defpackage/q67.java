package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.impl.a;

/* loaded from: classes5.dex */
public class q67 extends j67 {
    public static final Logger h = Logger.getLogger(q67.class.getName());

    public static q67 s(String str, y67 y67Var, x67 x67Var, boolean z) {
        int ordinal = y67Var.ordinal();
        return ordinal != 1 ? ordinal != 16 ? ordinal != 28 ? ordinal != 33 ? ordinal != 38 ? ordinal != 58 ? ordinal != 12 ? ordinal != 13 ? new q67(str, y67Var, x67Var, z) : new p67(str, y67Var, x67Var, z, 3) : new p67(str, y67Var, x67Var, z, 4) : new p67(str, y67Var, x67Var, z, 0) : new p67(str, y67Var, x67Var, z, 2) : new p67(str, y67Var, x67Var, z, 5) : new p67(str, y67Var, x67Var, z, 2) : new p67(str, y67Var, x67Var, z, 6) : new p67(str, y67Var, x67Var, z, 1);
    }

    @Override // defpackage.j67
    public final boolean h(long j) {
        return false;
    }

    public final void q(p2f p2fVar, HashSet hashSet, a aVar) {
        if (aVar == null || !aVar.q.c.b()) {
            return;
        }
        if (c().equalsIgnoreCase(aVar.f()) || c().equalsIgnoreCase(aVar.i()) || c().equalsIgnoreCase(aVar.u())) {
            hashSet.addAll(p2fVar.i.a(d(), true, 3600));
            hashSet.addAll(aVar.k(d(), 3600, p2fVar.i));
        }
        Logger logger = h;
        if (logger.isLoggable(Level.FINER)) {
            logger.finer(p2fVar.q + " DNSQuestion(" + c() + ").addAnswersForServiceInfo(): info: " + aVar + StringUtil.LF + hashSet);
        }
    }

    public boolean r(p2f p2fVar) {
        return false;
    }

    @Override // defpackage.j67
    public final void o(StringBuilder sb) {
    }

    public void p(p2f p2fVar, HashSet hashSet) {
    }
}
