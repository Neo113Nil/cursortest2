package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import java.io.File;
import ru.rt.ebs.cryptosdk.core.storage.file.IFileManager;

/* loaded from: classes4.dex */
public abstract class x2b1 {
    public static mgv a;

    public static final void a(a aVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(660135596);
        int i2 = 18;
        if (btsVar.V(i & 1, (i & 19) != 18)) {
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new r4o0();
                btsVar.o0(Q);
            }
            z910 z910Var = (z910) Q;
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c530.a);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, z910Var);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            aVar.invoke(s4o0.a, btsVar, 54);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new k2z0(i, i2, aVar);
        }
    }

    public static /* synthetic */ File b(IFileManager iFileManager, String str, String str2, int i) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return iFileManager.getFile(str, str2, false);
    }
}
