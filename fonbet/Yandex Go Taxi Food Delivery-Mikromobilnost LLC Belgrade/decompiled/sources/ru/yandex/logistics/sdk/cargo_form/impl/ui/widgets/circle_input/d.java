package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.circle_input;

import defpackage.a7b;
import defpackage.a7u0;
import defpackage.aii0;
import defpackage.ao6;
import defpackage.bts;
import defpackage.did;
import defpackage.dl51;
import defpackage.el51;
import defpackage.fid;
import defpackage.gl51;
import defpackage.lub;
import defpackage.mb;
import defpackage.n351;
import defpackage.o15;
import defpackage.o430;
import defpackage.p070;
import defpackage.rub;
import defpackage.sls;
import defpackage.tls;
import defpackage.v4v;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zpn;
import defpackage.zy11;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.circle_input.d;

/* loaded from: classes5.dex */
public final class d extends o15 {
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.listeners.a b;
    public final p070 c;
    public final ao6 d;

    public d(ru.yandex.logistics.sdk.cargo_form.impl.ui.listeners.a aVar, p070 p070Var, ao6 ao6Var) {
        super("circle-input");
        this.b = aVar;
        this.c = p070Var;
        this.d = ao6Var;
    }

    @Override // defpackage.o15
    public final void e(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(980965310);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(n351Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(this) ? 32 : 16;
        }
        final int i3 = 1;
        final int i4 = 0;
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else {
            if (!(n351Var instanceof rub)) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: tub
                        public final /* synthetic */ d b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i4;
                            zy11 zy11Var = zy11.a;
                            int i6 = i;
                            n351 n351Var2 = n351Var;
                            d dVar = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    dVar.e(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                                default:
                                    dVar.e(n351Var2, fidVar2, vng.O(i6 | 1));
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
            androidx.compose.runtime.internal.a aVar = null;
            o430 o430Var = did.a;
            if (e || Q == o430Var) {
                Q = new CircleInputWidget$FormWidgetContent$2$1(this, n351Var, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            rub rubVar = (rub) n351Var;
            lub lubVar = rubVar.c;
            v4v v4vVar = rubVar.d;
            if (v4vVar == null) {
                btsVar.e0(980359379);
                btsVar.t(false);
            } else {
                btsVar.e0(980359380);
                aVar = wwg.S(58740871, true, new mb(v4vVar, 3), btsVar);
                btsVar.t(false);
            }
            a7u0 a7u0Var = gl51.a;
            long d = ((el51) btsVar.m(a7u0Var)).d();
            long l = ((el51) btsVar.m(a7u0Var)).l();
            long j = dl51.a;
            boolean e2 = btsVar.e(this) | (i5 == 4);
            Object Q2 = btsVar.Q();
            if (e2 || Q2 == o430Var) {
                Q2 = new sls(this) { // from class: uub
                    public final /* synthetic */ d b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i6 = i4;
                        zy11 zy11Var = zy11.a;
                        n351 n351Var2 = n351Var;
                        d dVar = this.b;
                        switch (i6) {
                            case 0:
                                dVar.b.a(((rub) n351Var2).e);
                                break;
                            default:
                                ao6 ao6Var = dVar.d;
                                String str = ((rub) n351Var2).f.b;
                                ao6Var.getClass();
                                if (str != null) {
                                    u1n.m(ao6Var.b, new x2s(str.concat(".SliderIn"), null));
                                    break;
                                }
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar.o0(Q2);
            }
            sls slsVar = (sls) Q2;
            boolean e3 = btsVar.e(this) | (i5 == 4);
            Object Q3 = btsVar.Q();
            if (e3 || Q3 == o430Var) {
                Q3 = new a7b(20, this, n351Var);
                btsVar.o0(Q3);
            }
            tls tlsVar = (tls) Q3;
            boolean e4 = (i5 == 4) | btsVar.e(this);
            Object Q4 = btsVar.Q();
            if (e4 || Q4 == o430Var) {
                Q4 = new sls(this) { // from class: uub
                    public final /* synthetic */ d b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i6 = i3;
                        zy11 zy11Var = zy11.a;
                        n351 n351Var2 = n351Var;
                        d dVar = this.b;
                        switch (i6) {
                            case 0:
                                dVar.b.a(((rub) n351Var2).e);
                                break;
                            default:
                                ao6 ao6Var = dVar.d;
                                String str = ((rub) n351Var2).f.b;
                                ao6Var.getClass();
                                if (str != null) {
                                    u1n.m(ao6Var.b, new x2s(str.concat(".SliderIn"), null));
                                    break;
                                }
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar.o0(Q4);
            }
            a.a(lubVar, d, l, j, aVar, slsVar, tlsVar, (sls) Q4, btsVar, 0);
        }
        v = btsVar.v();
        if (v != null) {
            final int i6 = 1;
            wlsVar = new wls(this) { // from class: tub
                public final /* synthetic */ d b;

                {
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = i6;
                    zy11 zy11Var = zy11.a;
                    int i62 = i;
                    n351 n351Var2 = n351Var;
                    d dVar = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i52) {
                        case 0:
                            dVar.e(n351Var2, fidVar2, vng.O(i62 | 1));
                            break;
                        default:
                            dVar.e(n351Var2, fidVar2, vng.O(i62 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }
}
