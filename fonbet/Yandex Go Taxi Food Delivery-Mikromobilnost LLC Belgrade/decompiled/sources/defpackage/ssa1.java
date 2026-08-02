package defpackage;

import android.graphics.Typeface;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.navigator.main_screen.h;
import java.io.File;

/* loaded from: classes11.dex */
public abstract class ssa1 {
    public static final void a(f530 f530Var, q1l0 q1l0Var, final h hVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1132229997);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(q1l0Var) : btsVar.e(q1l0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(hVar) ? 256 : 128;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            lhl0 a = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var);
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            boolean z = q1l0Var.a.a;
            o430 o430Var = did.a;
            if (z) {
                btsVar.e0(1404916928);
                float f = q1l0Var.a.b;
                boolean z2 = (i2 & 896) == 256;
                Object Q = btsVar.Q();
                if (z2 || Q == o430Var) {
                    Q = new sls() { // from class: p1l0
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i5 = i3;
                            zy11 zy11Var = zy11.a;
                            h hVar2 = hVar;
                            switch (i5) {
                                case 0:
                                    hVar2.invoke(n1l0.a);
                                    break;
                                default:
                                    hVar2.invoke(n1l0.b);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    btsVar.o0(Q);
                }
                wob1.a(f, null, null, (sls) Q, btsVar, 6);
                btsVar.t(false);
            } else {
                btsVar.e0(1405033209);
                btsVar.t(false);
            }
            btsVar.e0(1405157209);
            btsVar.t(false);
            btsVar.e0(1405201725);
            boolean z3 = (i2 & 896) == 256;
            Object Q2 = btsVar.Q();
            if (z3 || Q2 == o430Var) {
                Q2 = new sls() { // from class: p1l0
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i5 = i4;
                        zy11 zy11Var = zy11.a;
                        h hVar2 = hVar;
                        switch (i5) {
                            case 0:
                                hVar2.invoke(n1l0.a);
                                break;
                            default:
                                hVar2.invoke(n1l0.b);
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar.o0(Q2);
            }
            frb1.a(null, null, (sls) Q2, btsVar, 6);
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vnf0(f530Var, (Object) q1l0Var, (Object) hVar, i, 19);
        }
    }

    public static final String b(String str) {
        int length = str.length();
        int i = length / 2;
        return b64.j(str.substring(0, i), cvu0.u(length - i, "*"));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(int i, Object obj, yxr yxrVar, lzr lzrVar, int i2) {
        boolean z;
        boolean z2;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z3 = false;
        if ((i & 1) != 0 && !jl40.l(yxrVar.getWeight(), lzrVar)) {
            lzr lzrVar2 = lzr.w;
            if (lzrVar.compareTo(lzrVar2) >= 0 && jl40.q(yxrVar.getWeight().a, lzrVar2.a) < 0) {
                z = true;
                z2 = (i & 2) == 0 && i2 != yxrVar.b();
                if (z2 && !z) {
                    return obj;
                }
                int i3 = !z ? lzrVar.a : yxrVar.getWeight().a;
                if (z2 ? yxrVar.b() == 1 : i2 == 1) {
                    z3 = true;
                }
                return Typeface.create((Typeface) obj, i3, z3);
            }
        }
        z = false;
        if ((i & 2) == 0) {
        }
        if (z2) {
        }
        if (!z) {
        }
        if (z2) {
            z3 = true;
            return Typeface.create((Typeface) obj, i3, z3);
        }
        z3 = true;
        return Typeface.create((Typeface) obj, i3, z3);
    }

    public static String d(File file) {
        if (file.getName().endsWith(".apk")) {
            String replaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", "");
            return (replaceFirst.equals("base-master") || replaceFirst.equals("base-main")) ? "" : replaceFirst.startsWith("base-") ? replaceFirst.replace("base-", "config.") : replaceFirst.replace("-", ".config.").replace(".config.master", "").replace(".config.main", "");
        }
        ny61.g("Non-apk found in splits directory.");
        return null;
    }
}
