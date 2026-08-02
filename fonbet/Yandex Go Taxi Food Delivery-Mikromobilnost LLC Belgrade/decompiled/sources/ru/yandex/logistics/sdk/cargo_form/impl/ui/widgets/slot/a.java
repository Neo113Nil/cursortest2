package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.slot;

import androidx.compose.ui.node.d;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b64;
import defpackage.bts;
import defpackage.byk0;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cqs0;
import defpackage.cyk0;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.jl40;
import defpackage.n351;
import defpackage.nws0;
import defpackage.o15;
import defpackage.o430;
import defpackage.ohd;
import defpackage.p070;
import defpackage.pi6;
import defpackage.pus0;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.rx21;
import defpackage.sls;
import defpackage.tls;
import defpackage.tra1;
import defpackage.wls;
import defpackage.x4c;
import defpackage.xdb1;
import defpackage.ymb1;
import defpackage.z910;
import defpackage.zpn;
import defpackage.zy11;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.slot.a;

/* loaded from: classes5.dex */
public final class a extends o15 {
    public final p070 b;
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.listeners.a c;

    public a(p070 p070Var, ru.yandex.logistics.sdk.cargo_form.impl.ui.listeners.a aVar) {
        super("slot");
        this.b = p070Var;
        this.c = aVar;
    }

    @Override // defpackage.o15
    public final void e(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1914243899);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(n351Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(this) ? 32 : 16;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else {
            if (!(n351Var instanceof nws0)) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: kws0
                        public final /* synthetic */ a b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i3;
                            zy11 zy11Var = zy11.a;
                            int i6 = i;
                            n351 n351Var2 = n351Var;
                            a aVar = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    aVar.e(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                                default:
                                    aVar.e(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            int i5 = i2 & 14;
            boolean e = btsVar.e(this) | (i5 == 4);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (e || Q == o430Var) {
                Q = new SlotWidget$FormWidgetContent$2$1(this, n351Var, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            nws0 nws0Var = (nws0) n351Var;
            cqs0 cqs0Var = nws0Var.d;
            pus0 pus0Var = cqs0Var.j;
            pus0 pus0Var2 = cqs0Var.j;
            final byk0 c = cyk0.c(pus0Var.b);
            boolean z = pus0Var2.d != null;
            boolean k = (i5 == 4) | btsVar.k(c);
            Object Q2 = btsVar.Q();
            if (k || Q2 == o430Var) {
                Q2 = new tls() { // from class: lws0
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        int i6 = i3;
                        byk0 byk0Var = c;
                        n351 n351Var2 = n351Var;
                        f530 f530Var = (f530) obj;
                        switch (i6) {
                            case 0:
                                ma6 ma6Var = ((nws0) n351Var2).d.j.d;
                                if (ma6Var == null) {
                                    ny61.g("Required value was null.");
                                    break;
                                } else {
                                    break;
                                }
                            default:
                                ldc ldcVar = ((nws0) n351Var2).d.j.a;
                                if (ldcVar == null) {
                                    ny61.g("Required value was null.");
                                    break;
                                } else {
                                    break;
                                }
                        }
                        return null;
                    }
                };
                btsVar.o0(Q2);
            }
            c530 c530Var = c530.a;
            f530 c2 = rx21.c(c530Var, z, (tls) Q2);
            boolean z2 = pus0Var2.a != null;
            boolean k2 = (i5 == 4) | btsVar.k(c);
            Object Q3 = btsVar.Q();
            if (k2 || Q3 == o430Var) {
                Q3 = new tls() { // from class: lws0
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        int i6 = i4;
                        byk0 byk0Var = c;
                        n351 n351Var2 = n351Var;
                        f530 f530Var = (f530) obj;
                        switch (i6) {
                            case 0:
                                ma6 ma6Var = ((nws0) n351Var2).d.j.d;
                                if (ma6Var == null) {
                                    ny61.g("Required value was null.");
                                    break;
                                } else {
                                    break;
                                }
                            default:
                                ldc ldcVar = ((nws0) n351Var2).d.j.a;
                                if (ldcVar == null) {
                                    ny61.g("Required value was null.");
                                    break;
                                } else {
                                    break;
                                }
                        }
                        return null;
                    }
                };
                btsVar.o0(Q3);
            }
            f530 k3 = an91.m(tra1.b(c530Var, cqs0Var.m ? 1.0f : 0.5f), pus0Var2.c, 0.0f, 2).k(ymb1.l(rx21.c(c2, z2, (tls) Q3), c));
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, k3);
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
            wls wlsVar2 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar2);
            }
            qje.W(btsVar, d.d, d2);
            cqs0 cqs0Var2 = nws0Var.d;
            boolean e2 = btsVar.e(this);
            Object Q4 = btsVar.Q();
            if (e2 || Q4 == o430Var) {
                final int i6 = 0;
                Q4 = new tls(this) { // from class: mws0
                    public final /* synthetic */ a b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        int i7 = i6;
                        zy11 zy11Var = zy11.a;
                        a aVar = this.b;
                        switch (i7) {
                            case 0:
                                aVar.b.a((x2s) obj);
                                break;
                            default:
                                aVar.c.a((b151) obj);
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar.o0(Q4);
            }
            tls tlsVar = (tls) Q4;
            boolean e3 = btsVar.e(this);
            Object Q5 = btsVar.Q();
            if (e3 || Q5 == o430Var) {
                Q5 = new tls(this) { // from class: mws0
                    public final /* synthetic */ a b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        int i7 = i4;
                        zy11 zy11Var = zy11.a;
                        a aVar = this.b;
                        switch (i7) {
                            case 0:
                                aVar.b.a((x2s) obj);
                                break;
                            default:
                                aVar.c.a((b151) obj);
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar.o0(Q5);
            }
            xdb1.a(null, cqs0Var2, tlsVar, (tls) Q5, false, null, btsVar, 0, 49);
            btsVar.t(true);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(this) { // from class: kws0
                public final /* synthetic */ a b;

                {
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = i4;
                    zy11 zy11Var = zy11.a;
                    int i62 = i;
                    n351 n351Var2 = n351Var;
                    a aVar = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i52) {
                        case 0:
                            aVar.e(n351Var2, fidVar2, vng.O(i62 | 1));
                            break;
                        default:
                            aVar.e(n351Var2, fidVar2, vng.O(i62 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }
}
