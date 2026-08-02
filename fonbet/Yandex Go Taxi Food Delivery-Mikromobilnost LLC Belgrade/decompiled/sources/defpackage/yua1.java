package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.ybsdk.feature.banners.api.FullScreenEntity$Type;
import com.ybsdk.feature.banners.api.dto.FullScreenDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class yua1 {
    public static final void a(int i, fid fidVar, tls tlsVar, f530 f530Var, List list) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1523426141);
        int i2 = 2;
        int i3 = i | (btsVar.k(f530Var) ? 4 : 2) | (btsVar.k(list) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            int size = list.size();
            Object obj = did.a;
            if (size <= 2) {
                btsVar.e0(531419811);
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
                btsVar.e0(-90437319);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    dme dmeVar = (dme) it.next();
                    boolean e = ((i3 & 896) == 256) | btsVar.e(dmeVar);
                    Object Q = btsVar.Q();
                    if (e || Q == obj) {
                        Q = new o8k0(15, tlsVar, dmeVar);
                        btsVar.o0(Q);
                    }
                    kva1.b(dmeVar, (sls) Q, an91.m(new x2y(1.0f, true), 4.0f, 0.0f, 2), btsVar, 0);
                }
                tse0.t(btsVar, false, true, false);
            } else {
                btsVar.e0(531771134);
                boolean z = ((i3 & 112) == 32) | ((i3 & 896) == 256);
                Object Q2 = btsVar.Q();
                if (z || Q2 == obj) {
                    Q2 = new ss(list, tlsVar, i2);
                    btsVar.o0(Q2);
                }
                adb1.b(f530Var, null, null, null, null, null, false, null, (tls) Q2, btsVar, i3 & 14, 510);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z840(f530Var, list, tlsVar, i, 2);
        }
    }

    public static final void b(hm40 hm40Var, i28 i28Var, ml6 ml6Var, float f, bgr0 bgr0Var, rly0 rly0Var, ram ramVar) {
        ArrayList arrayList = hm40Var.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cc90 cc90Var = (cc90) arrayList.get(i);
            cc90Var.a.g(i28Var, ml6Var, f, bgr0Var, rly0Var, ramVar);
            i28Var.c(0.0f, cc90Var.a.b());
        }
    }

    public static final qis c(FullScreenDto fullScreenDto, FullScreenEntity$Type fullScreenEntity$Type) {
        String id = fullScreenDto.getId();
        String action = fullScreenDto.getAction();
        String name = fullScreenDto.getName();
        Boolean isMarkable = fullScreenDto.isMarkable();
        return new qis(id, fullScreenEntity$Type, action, name, isMarkable != null ? isMarkable.booleanValue() : true, fullScreenDto.getDropSessionsWithoutFullscreensOnShow());
    }

    public abstract void d(x7b1 x7b1Var, x7b1 x7b1Var2);

    public abstract void e(x7b1 x7b1Var, Thread thread);

    public abstract boolean f(zfb1 zfb1Var, dga1 dga1Var, dga1 dga1Var2);

    public abstract boolean g(zfb1 zfb1Var, Object obj, Object obj2);

    public abstract boolean h(zfb1 zfb1Var, x7b1 x7b1Var, x7b1 x7b1Var2);
}
