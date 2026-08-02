package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.horizontal_stack;

import defpackage.aii0;
import defpackage.bts;
import defpackage.ctq;
import defpackage.did;
import defpackage.fid;
import defpackage.h3y;
import defpackage.lru;
import defpackage.n351;
import defpackage.o15;
import defpackage.p070;
import defpackage.v1b1;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zpn;
import defpackage.zy11;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.horizontal_stack.b;

/* loaded from: classes5.dex */
public final class b extends o15 {
    public final h3y b;
    public final p070 c;

    public b(h3y h3yVar, p070 p070Var) {
        super("horizontal-stack");
        this.b = h3yVar;
        this.c = p070Var;
    }

    @Override // defpackage.o15
    public final void e(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-66573168);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(n351Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(this) ? 32 : 16;
        }
        final int i3 = 1;
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else {
            if (!(n351Var instanceof lru)) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: oru
                        public final /* synthetic */ b b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = r4;
                            zy11 zy11Var = zy11.a;
                            int i5 = i;
                            n351 n351Var2 = n351Var;
                            b bVar = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    bVar.e(n351Var2, fidVar2, vng.O(i5 | 1));
                                    break;
                                default:
                                    bVar.e(n351Var2, fidVar2, vng.O(i5 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            int i4 = i2 & 14;
            int i5 = (btsVar.e(this) ? 1 : 0) | (i4 == 4 ? 1 : 0);
            Object Q = btsVar.Q();
            if (i5 != 0 || Q == did.a) {
                Q = new HorizontalStackWidget$FormWidgetContent$2$1(this, n351Var, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            v1b1.a((lru) n351Var, wwg.S(-657661655, true, new ctq(11, this), btsVar), btsVar, i4 | 48);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(this) { // from class: oru
                public final /* synthetic */ b b;

                {
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = i3;
                    zy11 zy11Var = zy11.a;
                    int i52 = i;
                    n351 n351Var2 = n351Var;
                    b bVar = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i42) {
                        case 0:
                            bVar.e(n351Var2, fidVar2, vng.O(i52 | 1));
                            break;
                        default:
                            bVar.e(n351Var2, fidVar2, vng.O(i52 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }
}
