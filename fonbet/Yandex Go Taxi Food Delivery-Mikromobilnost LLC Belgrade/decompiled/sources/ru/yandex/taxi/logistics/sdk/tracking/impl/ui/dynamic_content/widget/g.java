package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget;

import defpackage.a151;
import defpackage.aii0;
import defpackage.b7n;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.iry0;
import defpackage.n351;
import defpackage.o430;
import defpackage.s1a1;
import defpackage.t8j;
import defpackage.tls;
import defpackage.wls;
import defpackage.zpn;
import defpackage.zy11;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget.g;

/* loaded from: classes5.dex */
public final class g extends a151 {
    public final iry0 b;

    public g(iry0 iry0Var) {
        super("dynamic-content-text-widget-key");
        this.b = iry0Var;
    }

    @Override // defpackage.a151
    public final void a(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-240824427);
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
            if (!(n351Var instanceof b7n)) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: z6n
                        public final /* synthetic */ g b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = r4;
                            zy11 zy11Var = zy11.a;
                            int i5 = i;
                            n351 n351Var2 = n351Var;
                            g gVar = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    gVar.a(n351Var2, fidVar2, vng.O(i5 | 1));
                                    break;
                                default:
                                    gVar.a(n351Var2, fidVar2, vng.O(i5 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            int i4 = ((i2 & 112) == 32 || ((i2 & 64) != 0 && btsVar.e(this))) ? 1 : 0;
            int i5 = i2 & 14;
            int i6 = i4 | (i5 == 4 ? 1 : 0);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (i6 != 0 || Q == o430Var) {
                Q = new DynamicContentTextWidget$Content$2$1(this, n351Var, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            b7n b7nVar = (b7n) n351Var;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new t8j(20, this, n351Var);
                btsVar.o0(Q2);
            }
            s1a1.a(b7nVar, (tls) Q2, btsVar, i5 | 48);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(this) { // from class: z6n
                public final /* synthetic */ g b;

                {
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = i3;
                    zy11 zy11Var = zy11.a;
                    int i52 = i;
                    n351 n351Var2 = n351Var;
                    g gVar = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i42) {
                        case 0:
                            gVar.a(n351Var2, fidVar2, vng.O(i52 | 1));
                            break;
                        default:
                            gVar.a(n351Var2, fidVar2, vng.O(i52 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }
}
