package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget;

import defpackage.a151;
import defpackage.aii0;
import defpackage.bts;
import defpackage.d0a1;
import defpackage.did;
import defpackage.fid;
import defpackage.m5n;
import defpackage.n351;
import defpackage.o430;
import defpackage.sls;
import defpackage.vs;
import defpackage.wls;
import defpackage.ymj;
import defpackage.zpn;
import defpackage.zy11;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget.a;

/* loaded from: classes5.dex */
public final class a extends a151 {
    public final vs b;

    public a(vs vsVar) {
        super("dynamic-content-action-button-key");
        this.b = vsVar;
    }

    @Override // defpackage.a151
    public final void a(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2009229557);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(n351Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(this) : btsVar.e(this) ? 32 : 16;
        }
        final int i3 = 1;
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else {
            if (!(n351Var instanceof m5n)) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: n5n
                        public final /* synthetic */ a b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = r4;
                            zy11 zy11Var = zy11.a;
                            int i5 = i;
                            n351 n351Var2 = n351Var;
                            a aVar = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    aVar.a(n351Var2, fidVar2, vng.O(i5 | 1));
                                    break;
                                default:
                                    aVar.a(n351Var2, fidVar2, vng.O(i5 | 1));
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
            int i4 = 14;
            int i5 = i2 & 14;
            boolean z2 = z | (i5 == 4);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z2 || Q == o430Var) {
                Q = new DynamicContentActionButtonWidget$Content$2$1(this, n351Var, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            m5n m5nVar = (m5n) n351Var;
            r5 = i5 == 4 ? 1 : 0;
            Object Q2 = btsVar.Q();
            if (r5 != 0 || Q2 == o430Var) {
                Q2 = new ymj(i4, this, n351Var);
                btsVar.o0(Q2);
            }
            d0a1.a(m5nVar, null, (sls) Q2, btsVar, i5);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(this) { // from class: n5n
                public final /* synthetic */ a b;

                {
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = i3;
                    zy11 zy11Var = zy11.a;
                    int i52 = i;
                    n351 n351Var2 = n351Var;
                    a aVar = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i42) {
                        case 0:
                            aVar.a(n351Var2, fidVar2, vng.O(i52 | 1));
                            break;
                        default:
                            aVar.a(n351Var2, fidVar2, vng.O(i52 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }
}
