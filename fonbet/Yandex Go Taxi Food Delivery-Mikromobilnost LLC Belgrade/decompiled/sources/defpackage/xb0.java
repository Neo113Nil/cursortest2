package defpackage;

import androidx.compose.material3.p;
import androidx.compose.material3.w;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.lifecycle.compose.a;
import com.yandex.messaging.ui.settings.folder.addChat.i;
import defpackage.ac0;
import defpackage.sls;
import defpackage.tls;
import defpackage.zy11;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes15.dex */
public abstract class xb0 {
    public static final void a(f530 f530Var, tls tlsVar, sls slsVar, i iVar, fid fidVar, int i) {
        f530 f530Var2;
        i iVar2;
        final sls slsVar2;
        bts btsVar;
        i iVar3;
        f530 f530Var3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-735600230);
        if (((i | 6 | (btsVar2.e(tlsVar) ? 32 : 16) | 1024) & 1171) == 1170 && btsVar2.E()) {
            btsVar2.Y();
            f530Var3 = f530Var;
            iVar3 = iVar;
            btsVar = btsVar2;
        } else {
            btsVar2.a0();
            int i2 = i & 1;
            Object obj = did.a;
            final int i3 = 0;
            final int i4 = 1;
            if (i2 == 0 || btsVar2.C()) {
                btsVar2.e0(-897180073);
                rs31 b = jjo.b(btsVar2);
                hs31 a = jjo.a(btsVar2);
                btsVar2.e0(544794079);
                boolean e = btsVar2.e(a);
                Object Q = btsVar2.Q();
                if (e || Q == obj) {
                    Q = new w4(a, i4);
                    btsVar2.o0(Q);
                }
                btsVar2.t(false);
                yr31 G = ooc.G(qoi0.a(i.class), b, null, vfc.h(i.class, new zwv(), (tls) Q), b instanceof q7u ? ((q7u) b).getDefaultViewModelCreationExtras() : w8f.b, btsVar2);
                btsVar2.t(false);
                f530Var2 = c530.a;
                iVar2 = (i) G;
            } else {
                btsVar2.Y();
                f530Var2 = f530Var;
                iVar2 = iVar;
            }
            btsVar2.u();
            final oz40 c = a.c(iVar2.C, null, btsVar2, 0, 7);
            btsVar2.e0(1769089370);
            Object Q2 = btsVar2.Q();
            if (Q2 == obj) {
                Q2 = f.j(null);
                btsVar2.o0(Q2);
            }
            final oz40 oz40Var = (oz40) Q2;
            btsVar2.t(false);
            w f = p.f(6, 2, btsVar2, null);
            Object Q3 = btsVar2.Q();
            if (Q3 == obj) {
                Q3 = zpn.j(EmptyCoroutineContext.a, btsVar2);
                btsVar2.o0(Q3);
            }
            tse tseVar = (tse) Q3;
            btsVar2.e0(1769097403);
            boolean k = btsVar2.k(c);
            Object Q4 = btsVar2.Q();
            if (k || Q4 == obj) {
                slsVar2 = slsVar;
                Q4 = new tls() { // from class: com.yandex.messaging.ui.settings.folder.addChat.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        CancelDialogSource cancelDialogSource = (CancelDialogSource) obj2;
                        if (((ac0) c.getValue()).a()) {
                            sls.this.invoke();
                        } else {
                            oz40Var.setValue(cancelDialogSource);
                        }
                        return zy11.a;
                    }
                };
                btsVar2.o0(Q4);
            } else {
                slsVar2 = slsVar;
            }
            final tls tlsVar2 = (tls) Q4;
            btsVar2.t(false);
            btsVar2.e0(1769102908);
            boolean k2 = btsVar2.k(tlsVar2);
            Object Q5 = btsVar2.Q();
            if (k2 || Q5 == obj) {
                Q5 = new sls() { // from class: com.yandex.messaging.ui.settings.folder.addChat.b
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i5 = i3;
                        zy11 zy11Var = zy11.a;
                        tls tlsVar3 = tlsVar2;
                        switch (i5) {
                            case 0:
                                tlsVar3.invoke(CancelDialogSource.CloseButton);
                                break;
                            default:
                                tlsVar3.invoke(CancelDialogSource.SwipeDismiss);
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar2.o0(Q5);
            }
            sls slsVar3 = (sls) Q5;
            btsVar2.t(false);
            btsVar2.e0(1769105501);
            boolean k3 = btsVar2.k(tlsVar2);
            Object Q6 = btsVar2.Q();
            if (k3 || Q6 == obj) {
                Q6 = new sls() { // from class: com.yandex.messaging.ui.settings.folder.addChat.b
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i5 = i4;
                        zy11 zy11Var = zy11.a;
                        tls tlsVar3 = tlsVar2;
                        switch (i5) {
                            case 0:
                                tlsVar3.invoke(CancelDialogSource.CloseButton);
                                break;
                            default:
                                tlsVar3.invoke(CancelDialogSource.SwipeDismiss);
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar2.o0(Q6);
            }
            btsVar2.t(false);
            oz40 c2 = mcb1.c(btsVar2);
            oz40 b2 = com.yandex.messaging.core.ui.utils.a.b(btsVar2);
            qnm qnmVar = qnm.a;
            long a2 = qnm.c(btsVar2).a();
            long c3 = qnm.c(btsVar2).c();
            f530 b3 = i9a1.b(i9a1.g(ljs0.c));
            f530 f530Var4 = f530Var2;
            androidx.compose.runtime.internal.a S = wwg.S(-69848968, true, new wb0(slsVar3, f530Var4, c2, b2, c, tlsVar, iVar2, slsVar2, oz40Var, tseVar, f), btsVar2);
            btsVar = btsVar2;
            p.a((sls) Q6, b3, f, 0.0f, false, null, a2, 0L, c3, null, null, null, S, btsVar, 0, 6584);
            iVar3 = iVar2;
            f530Var3 = f530Var4;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rb0(f530Var3, tlsVar, slsVar, iVar3, i, 0);
        }
    }

    public static final void b(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1494135598);
        if ((((btsVar.k(f530Var) ? 4 : 2) | i) & 3) == 2 && btsVar.E()) {
            btsVar.Y();
        } else {
            f530 k = f530Var.k(ljs0.c);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, k);
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
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            qnm qnmVar = qnm.a;
            long j = qnm.b(btsVar).i;
            qnm.d.getClass();
            ow91.a(32.0f, 0, 0, j, btsVar, cj6.a.a(c530.a, x4c.y));
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new os(f530Var, i, 1);
        }
    }
}
