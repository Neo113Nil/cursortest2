package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.yandex.taxi.logistics.sdk.ui.component.control.a;

/* loaded from: classes5.dex */
public abstract class scb1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v3 */
    public static final void a(ArrayList arrayList, wls wlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        long q;
        long g;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1691898779);
        if ((i & 6) == 0) {
            i2 = (btsVar2.e(arrayList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 32;
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(wlsVar) ? 32 : 16;
        }
        int i4 = i2;
        boolean z = true;
        boolean z2 = 0;
        if (btsVar2.V(i4 & 1, (i4 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 k = an91.k(c530Var, 8.0f);
            sic a = qic.a(new i43(4.0f, true, new quz(11)), x4c.G, btsVar2, 6);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = b.d(btsVar2, k);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, d.f, a);
            qje.W(btsVar2, d.e, o);
            wls wlsVar2 = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar2);
            }
            qje.W(btsVar2, d.d, d);
            btsVar2.e0(225938003);
            Iterator it = arrayList.iterator();
            bts btsVar3 = btsVar2;
            while (it.hasNext()) {
                c37 c37Var = (c37) it.next();
                if (c37Var.d) {
                    btsVar3.e0(-986361164);
                    q = ((el51) btsVar3.m(gl51.a)).p();
                } else {
                    btsVar3.e0(-986359819);
                    q = ((el51) btsVar3.m(gl51.a)).q();
                }
                btsVar3.t(z2);
                if (c37Var.d) {
                    btsVar3.e0(-986356370);
                    g = ((el51) btsVar3.m(gl51.a)).f();
                } else {
                    btsVar3.e0(-986355217);
                    g = ((el51) btsVar3.m(gl51.a)).g();
                }
                btsVar3.t(z2);
                f530 e = ljs0.e(ljs0.c(c530Var, 1.0f), 56.0f);
                boolean k2 = ((i4 & 112) == i3 ? z : z2) | btsVar3.k(c37Var);
                Object Q = btsVar3.Q();
                if (k2 || Q == did.a) {
                    Q = new lu5(13, wlsVar, c37Var);
                    btsVar3.o0(Q);
                }
                bts btsVar4 = btsVar3;
                a.b((sls) Q, e, null, g, 0L, null, null, null, false, null, null, null, wwg.S(889483300, z, new q07((Object) c37Var, q, (int) z2), btsVar3), btsVar4, 0, 384, 4084);
                z = true;
                z2 = z2;
                btsVar3 = btsVar4;
                c530Var = c530Var;
                i3 = i3;
            }
            btsVar3.t(z2);
            btsVar3.t(true);
            btsVar = btsVar3;
        } else {
            btsVar2.Y();
            btsVar = btsVar2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mj5(arrayList, wlsVar, i, 11);
        }
    }

    public static final String b(sbx sbxVar, SerialDescriptor serialDescriptor) {
        for (Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof bcx) {
                return ((bcx) annotation).discriminator();
            }
        }
        return sbxVar.a.i;
    }

    public static o820 c(yyr0 yyr0Var) {
        String str;
        String e = yyr0Var.e();
        String f = yyr0Var.f();
        switch (xxr0.a[yyr0Var.getSource().ordinal()]) {
            case 1:
                str = "Header";
                break;
            case 2:
                str = "Suggest";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                str = "UNKNOWN";
                break;
            default:
                w511.b();
                return null;
        }
        return new o820(f, e, str, "shortcut");
    }
}
