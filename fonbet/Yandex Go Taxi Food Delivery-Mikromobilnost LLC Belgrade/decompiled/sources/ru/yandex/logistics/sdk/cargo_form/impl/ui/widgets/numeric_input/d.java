package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.numeric_input;

import androidx.compose.runtime.f;
import defpackage.aii0;
import defpackage.bts;
import defpackage.co60;
import defpackage.did;
import defpackage.fid;
import defpackage.hwo0;
import defpackage.iu30;
import defpackage.n351;
import defpackage.nuy0;
import defpackage.o15;
import defpackage.o430;
import defpackage.oz40;
import defpackage.p070;
import defpackage.sc20;
import defpackage.wls;
import defpackage.zpn;
import defpackage.zy11;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.numeric_input.d;

/* loaded from: classes5.dex */
public final class d extends o15 {
    public final hwo0 b;
    public final p070 c;
    public final nuy0 d;

    public d(hwo0 hwo0Var, p070 p070Var, nuy0 nuy0Var) {
        super("numeric-input");
        this.b = hwo0Var;
        this.c = p070Var;
        this.d = nuy0Var;
    }

    @Override // defpackage.o15
    public final void e(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1239341131);
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
            if (!(n351Var instanceof co60)) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: eo60
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
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.j(Boolean.FALSE);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            int i5 = i2 & 14;
            boolean e = btsVar.e(this) | (i5 == 4);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                Q2 = new NumericInputWidget$FormWidgetContent$2$1(this, n351Var, null);
                btsVar.o0(Q2);
            }
            zpn.e(btsVar, (wls) Q2, zy11.a);
            co60 co60Var = (co60) n351Var;
            CharSequence charSequence = co60Var.f;
            if (charSequence != null) {
                btsVar.e0(-1672433439);
                boolean e2 = (i5 == 4) | btsVar.e(this);
                Object Q3 = btsVar.Q();
                if (e2 || Q3 == o430Var) {
                    Q3 = new NumericInputWidget$FormWidgetContent$3$1(this, n351Var, null);
                    btsVar.o0(Q3);
                }
                zpn.e(btsVar, (wls) Q3, charSequence);
                btsVar.t(false);
            } else {
                btsVar.e0(-1672268147);
                btsVar.t(false);
            }
            boolean e3 = btsVar.e(this);
            Object Q4 = btsVar.Q();
            if (e3 || Q4 == o430Var) {
                Q4 = new iu30(21, this, oz40Var);
                btsVar.o0(Q4);
            }
            wls wlsVar2 = (wls) Q4;
            boolean e4 = btsVar.e(this);
            Object Q5 = btsVar.Q();
            if (e4 || Q5 == o430Var) {
                Q5 = new sc20(19, this);
                btsVar.o0(Q5);
            }
            a.a(co60Var, wlsVar2, (wls) Q5, btsVar, i5);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(this) { // from class: eo60
                public final /* synthetic */ d b;

                {
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = i3;
                    zy11 zy11Var = zy11.a;
                    int i6 = i;
                    n351 n351Var2 = n351Var;
                    d dVar = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i52) {
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
    }
}
