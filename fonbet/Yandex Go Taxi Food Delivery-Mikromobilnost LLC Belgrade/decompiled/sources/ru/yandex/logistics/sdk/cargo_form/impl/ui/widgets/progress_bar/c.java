package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.progress_bar;

import defpackage.aii0;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.n351;
import defpackage.o15;
import defpackage.p070;
import defpackage.u7a1;
import defpackage.wls;
import defpackage.zhf0;
import defpackage.zpn;
import defpackage.zy11;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.progress_bar.c;

/* loaded from: classes5.dex */
public final class c extends o15 {
    public final p070 b;

    public c(p070 p070Var) {
        super("progress");
        this.b = p070Var;
    }

    @Override // defpackage.o15
    public final void e(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(481175332);
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
            if (!(n351Var instanceof zhf0)) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: jif0
                        public final /* synthetic */ c b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i3;
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
            boolean e = ((i2 & 14) == 4) | btsVar.e(this);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new ProgressBarWidget$FormWidgetContent$2$1(this, n351Var, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            u7a1.c(((zhf0) n351Var).c, btsVar, 0);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(this) { // from class: jif0
                public final /* synthetic */ c b;

                {
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
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
    }
}
