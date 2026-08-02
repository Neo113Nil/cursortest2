package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.accent_button;

import defpackage.a151;
import defpackage.aii0;
import defpackage.bia1;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.j0;
import defpackage.lb;
import defpackage.n351;
import defpackage.o430;
import defpackage.ob;
import defpackage.sls;
import defpackage.wls;
import defpackage.zpn;
import defpackage.zy11;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.accent_button.c;

/* loaded from: classes5.dex */
public final class c extends a151 {
    public final lb b;

    public c(lb lbVar) {
        super("accent-button-key");
        this.b = lbVar;
    }

    @Override // defpackage.a151
    public final void a(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(574627924);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(n351Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(this) : btsVar.e(this) ? 32 : 16;
        }
        final int i4 = 1;
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else {
            if (!(n351Var instanceof ob)) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: qb
                        public final /* synthetic */ c b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = r4;
                            zy11 zy11Var = zy11.a;
                            int i6 = i;
                            n351 n351Var2 = n351Var;
                            c cVar = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    cVar.a(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                                default:
                                    cVar.a(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            boolean z = (i2 & 112) == 32 || ((i2 & 64) != 0 && btsVar.e(this));
            int i5 = i2 & 14;
            boolean z2 = z | (i5 == 4);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z2 || Q == o430Var) {
                Q = new AccentButtonWidget$Content$2$1(this, n351Var, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            ob obVar = (ob) n351Var;
            r6 = i5 == 4 ? 1 : 0;
            Object Q2 = btsVar.Q();
            if (r6 != 0 || Q2 == o430Var) {
                Q2 = new j0(i3, this, n351Var);
                btsVar.o0(Q2);
            }
            bia1.a(obVar, (sls) Q2, btsVar, i5);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(this) { // from class: qb
                public final /* synthetic */ c b;

                {
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = i4;
                    zy11 zy11Var = zy11.a;
                    int i6 = i;
                    n351 n351Var2 = n351Var;
                    c cVar = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i52) {
                        case 0:
                            cVar.a(n351Var2, fidVar2, vng.O(i6 | 1));
                            break;
                        default:
                            cVar.a(n351Var2, fidVar2, vng.O(i6 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }
}
