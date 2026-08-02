package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.action_button;

import defpackage.aii0;
import defpackage.bka1;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.n351;
import defpackage.o15;
import defpackage.o430;
import defpackage.p070;
import defpackage.tls;
import defpackage.wls;
import defpackage.xs;
import defpackage.y4;
import defpackage.zpn;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.action_button.c;

/* loaded from: classes5.dex */
public final class c extends o15 {
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.listeners.a b;
    public final p070 c;

    public c(p070 p070Var, ru.yandex.logistics.sdk.cargo_form.impl.ui.listeners.a aVar) {
        super("action-button");
        this.b = aVar;
        this.c = p070Var;
    }

    @Override // defpackage.o15
    public final void e(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1329818802);
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
            if (!(n351Var instanceof xs)) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: nt
                        public final /* synthetic */ c b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = r4;
                            zy11 zy11Var = zy11.a;
                            int i5 = i;
                            n351 n351Var2 = n351Var;
                            c cVar = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    cVar.e(n351Var2, fidVar2, vng.O(i5 | 1));
                                    break;
                                default:
                                    cVar.e(n351Var2, fidVar2, vng.O(i5 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            xs xsVar = (xs) n351Var;
            Boolean bool = xsVar.g;
            int i4 = i2 & 14;
            int i5 = (btsVar.e(this) ? 1 : 0) | (i4 == 4 ? 1 : 0);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (i5 != 0 || Q == o430Var) {
                Q = new ActionButtonWidget$FormWidgetContent$2$1(this, n351Var, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, bool);
            boolean e = btsVar.e(this);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                Q2 = new y4(12, this);
                btsVar.o0(Q2);
            }
            bka1.a(xsVar, (tls) Q2, btsVar, i4);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(this) { // from class: nt
                public final /* synthetic */ c b;

                {
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = i3;
                    zy11 zy11Var = zy11.a;
                    int i52 = i;
                    n351 n351Var2 = n351Var;
                    c cVar = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i42) {
                        case 0:
                            cVar.e(n351Var2, fidVar2, vng.O(i52 | 1));
                            break;
                        default:
                            cVar.e(n351Var2, fidVar2, vng.O(i52 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }
}
