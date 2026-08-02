package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.slider_button;

import defpackage.aii0;
import defpackage.an91;
import defpackage.aps0;
import defpackage.bts;
import defpackage.c530;
import defpackage.did;
import defpackage.fid;
import defpackage.gps0;
import defpackage.n351;
import defpackage.o15;
import defpackage.o430;
import defpackage.p070;
import defpackage.quq0;
import defpackage.tls;
import defpackage.wls;
import defpackage.yos0;
import defpackage.zpn;
import defpackage.zy11;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.slider_button.c;

/* loaded from: classes5.dex */
public final class c extends o15 {
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.listeners.a b;
    public final p070 c;

    public c(p070 p070Var, ru.yandex.logistics.sdk.cargo_form.impl.ui.listeners.a aVar) {
        super("slider-button");
        this.b = aVar;
        this.c = p070Var;
    }

    @Override // defpackage.o15
    public final void e(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1780087619);
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
            if (!(n351Var instanceof gps0)) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: fps0
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
            int i4 = (btsVar.e(this) ? 1 : 0) | ((i2 & 14) == 4 ? 1 : 0);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (i4 != 0 || Q == o430Var) {
                Q = new SliderButtonWidget$FormWidgetContent$2$1(this, n351Var, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            aps0 aps0Var = ((gps0) n351Var).c;
            boolean e = btsVar.e(this);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                Q2 = new quq0(15, this);
                btsVar.o0(Q2);
            }
            yos0.b(aps0Var, (tls) Q2, an91.m(c530.a, 8.0f, 0.0f, 2), btsVar, 384);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(this) { // from class: fps0
                public final /* synthetic */ c b;

                {
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = i3;
                    zy11 zy11Var = zy11.a;
                    int i5 = i;
                    n351 n351Var2 = n351Var;
                    c cVar = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i42) {
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
    }
}
