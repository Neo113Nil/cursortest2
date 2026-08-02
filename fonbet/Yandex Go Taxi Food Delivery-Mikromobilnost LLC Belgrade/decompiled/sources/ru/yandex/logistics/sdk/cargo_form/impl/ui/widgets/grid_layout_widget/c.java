package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.grid_layout_widget;

import defpackage.aii0;
import defpackage.bts;
import defpackage.ctq;
import defpackage.did;
import defpackage.fid;
import defpackage.h3y;
import defpackage.k1u;
import defpackage.n351;
import defpackage.o15;
import defpackage.p070;
import defpackage.sya1;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zpn;
import defpackage.zy11;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.grid_layout_widget.c;

/* loaded from: classes5.dex */
public final class c extends o15 {
    public final h3y b;
    public final p070 c;

    public c(h3y h3yVar, p070 p070Var) {
        super("grid-layout");
        this.b = h3yVar;
        this.c = p070Var;
    }

    @Override // defpackage.o15
    public final void e(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2007482795);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(n351Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(this) ? 32 : 16;
        }
        final int i4 = 1;
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else {
            if (!(n351Var instanceof k1u)) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: p1u
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
                                    cVar.e(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                                default:
                                    cVar.e(n351Var2, fidVar2, vng.O(i6 | 1));
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
            int i6 = (btsVar.e(this) ? 1 : 0) | (i5 == 4 ? 1 : 0);
            Object Q = btsVar.Q();
            if (i6 != 0 || Q == did.a) {
                Q = new GridLayoutWidget$FormWidgetContent$2$1(this, n351Var, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            sya1.b((k1u) n351Var, wwg.S(613350406, true, new ctq(i3, this), btsVar), btsVar, i5 | 48);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(this) { // from class: p1u
                public final /* synthetic */ c b;

                {
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = i4;
                    zy11 zy11Var = zy11.a;
                    int i62 = i;
                    n351 n351Var2 = n351Var;
                    c cVar = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i52) {
                        case 0:
                            cVar.e(n351Var2, fidVar2, vng.O(i62 | 1));
                            break;
                        default:
                            cVar.e(n351Var2, fidVar2, vng.O(i62 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }
}
