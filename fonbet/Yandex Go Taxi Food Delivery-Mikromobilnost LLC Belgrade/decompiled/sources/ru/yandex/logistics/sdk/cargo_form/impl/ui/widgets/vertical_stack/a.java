package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.vertical_stack;

import defpackage.aii0;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.h3y;
import defpackage.hex0;
import defpackage.jg31;
import defpackage.n351;
import defpackage.o15;
import defpackage.p070;
import defpackage.wf91;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zpn;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.vertical_stack.a;

/* loaded from: classes5.dex */
public final class a extends o15 {
    public final h3y b;
    public final p070 c;

    public a(h3y h3yVar, p070 p070Var) {
        super("vertical-stack");
        this.b = h3yVar;
        this.c = p070Var;
    }

    @Override // defpackage.o15
    public final void e(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(182784034);
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
            if (!(n351Var instanceof jg31)) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: mg31
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
                                    aVar.e(n351Var2, fidVar2, vng.O(i5 | 1));
                                    break;
                                default:
                                    aVar.e(n351Var2, fidVar2, vng.O(i5 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            jg31 jg31Var = (jg31) n351Var;
            String str = jg31Var.i;
            int i4 = i2 & 14;
            int i5 = (btsVar.e(this) ? 1 : 0) | (i4 == 4 ? 1 : 0);
            Object Q = btsVar.Q();
            if (i5 != 0 || Q == did.a) {
                Q = new VerticalStackWidget$FormWidgetContent$2$1(this, n351Var, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, str);
            wf91.b(jg31Var, wwg.S(-1956939396, true, new hex0(26, this, n351Var), btsVar), btsVar, i4 | 48);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(this) { // from class: mg31
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
                            aVar.e(n351Var2, fidVar2, vng.O(i52 | 1));
                            break;
                        default:
                            aVar.e(n351Var2, fidVar2, vng.O(i52 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }
}
