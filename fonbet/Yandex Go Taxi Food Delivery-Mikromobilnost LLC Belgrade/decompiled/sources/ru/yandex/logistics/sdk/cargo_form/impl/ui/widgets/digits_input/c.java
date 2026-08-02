package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.digits_input;

import android.text.TextUtils;
import androidx.compose.runtime.f;
import defpackage.aii0;
import defpackage.bkj;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.hwo0;
import defpackage.mjf;
import defpackage.n351;
import defpackage.o15;
import defpackage.o430;
import defpackage.oz40;
import defpackage.p070;
import defpackage.wls;
import defpackage.xjj;
import defpackage.yjj;
import defpackage.zpn;
import defpackage.zy11;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.digits_input.c;

/* loaded from: classes5.dex */
public final class c extends o15 {
    public final p070 b;
    public final hwo0 c;
    public final bkj d;
    public final yjj e;

    public c(p070 p070Var, hwo0 hwo0Var, bkj bkjVar, yjj yjjVar) {
        super("digits-input");
        this.b = p070Var;
        this.c = hwo0Var;
        this.d = bkjVar;
        this.e = yjjVar;
    }

    @Override // defpackage.o15
    public final void e(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-525348332);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(n351Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(this) ? 32 : 16;
        }
        int i3 = 18;
        final int i4 = 0;
        final int i5 = 1;
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else {
            if (!(n351Var instanceof xjj)) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: ikj
                        public final /* synthetic */ c b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = i4;
                            zy11 zy11Var = zy11.a;
                            int i7 = i;
                            n351 n351Var2 = n351Var;
                            c cVar = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    cVar.e(n351Var2, fidVar2, vng.O(i7 | 1));
                                    break;
                                default:
                                    cVar.e(n351Var2, fidVar2, vng.O(i7 | 1));
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
            int i6 = i2 & 14;
            boolean e = (i6 == 4) | btsVar.e(this);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                Q2 = new DigitsInputWidget$FormWidgetContent$2$1(this, n351Var, null);
                btsVar.o0(Q2);
            }
            zpn.e(btsVar, (wls) Q2, zy11.a);
            xjj xjjVar = (xjj) n351Var;
            boolean e2 = btsVar.e(this);
            Object Q3 = btsVar.Q();
            if (e2 || Q3 == o430Var) {
                Q3 = new mjf(i3, this, oz40Var);
                btsVar.o0(Q3);
            }
            wls wlsVar2 = (wls) Q3;
            boolean e3 = btsVar.e(this);
            Object Q4 = btsVar.Q();
            if (e3 || Q4 == o430Var) {
                Q4 = new wls(this) { // from class: jkj
                    public final /* synthetic */ c b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        int i7 = i4;
                        c cVar = this.b;
                        String str = (String) obj;
                        switch (i7) {
                            case 0:
                                cVar.e.getClass();
                                int length = str.length();
                                for (int i8 = 0; i8 < length; i8++) {
                                    if (str.charAt(i8) != '0') {
                                        return str.substring(i8);
                                    }
                                }
                                return "";
                            default:
                                cVar.d.getClass();
                                return Boolean.valueOf(TextUtils.isDigitsOnly(str));
                        }
                    }
                };
                btsVar.o0(Q4);
            }
            wls wlsVar3 = (wls) Q4;
            boolean e4 = btsVar.e(this);
            Object Q5 = btsVar.Q();
            if (e4 || Q5 == o430Var) {
                Q5 = new wls(this) { // from class: jkj
                    public final /* synthetic */ c b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        int i7 = i5;
                        c cVar = this.b;
                        String str = (String) obj;
                        switch (i7) {
                            case 0:
                                cVar.e.getClass();
                                int length = str.length();
                                for (int i8 = 0; i8 < length; i8++) {
                                    if (str.charAt(i8) != '0') {
                                        return str.substring(i8);
                                    }
                                }
                                return "";
                            default:
                                cVar.d.getClass();
                                return Boolean.valueOf(TextUtils.isDigitsOnly(str));
                        }
                    }
                };
                btsVar.o0(Q5);
            }
            a.a(xjjVar, wlsVar2, wlsVar3, (wls) Q5, btsVar, i6);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(this) { // from class: ikj
                public final /* synthetic */ c b;

                {
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = i5;
                    zy11 zy11Var = zy11.a;
                    int i7 = i;
                    n351 n351Var2 = n351Var;
                    c cVar = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i62) {
                        case 0:
                            cVar.e(n351Var2, fidVar2, vng.O(i7 | 1));
                            break;
                        default:
                            cVar.e(n351Var2, fidVar2, vng.O(i7 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }
}
