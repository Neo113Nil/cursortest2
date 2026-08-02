package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget;

import defpackage.a151;
import defpackage.a6n;
import defpackage.aii0;
import defpackage.b6n;
import defpackage.bts;
import defpackage.dci;
import defpackage.did;
import defpackage.fid;
import defpackage.isy;
import defpackage.n351;
import defpackage.sb2;
import defpackage.ua3;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zpn;
import defpackage.zy11;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget.d;

/* loaded from: classes5.dex */
public final class d extends a151 {
    public final dci b;
    public final isy c;

    public d(dci dciVar, isy isyVar) {
        super("dynamic-content-list-item-key");
        this.b = dciVar;
        this.c = isyVar;
    }

    @Override // defpackage.a151
    public final void a(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1611221525);
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
            if (!(n351Var instanceof b6n)) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: c6n
                        public final /* synthetic */ d b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = r4;
                            zy11 zy11Var = zy11.a;
                            int i5 = i;
                            n351 n351Var2 = n351Var;
                            d dVar = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    dVar.a(n351Var2, fidVar2, vng.O(i5 | 1));
                                    break;
                                default:
                                    dVar.a(n351Var2, fidVar2, vng.O(i5 | 1));
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
            if (i4 != 0 || Q == did.a) {
                Q = new DynamicContentListItemWidget$Content$2$1(this, n351Var, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            sb2.b(ua3.a.a(this.b), wwg.S(577593045, true, new a6n(i3, n351Var, this), btsVar), btsVar, 56);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(this) { // from class: c6n
                public final /* synthetic */ d b;

                {
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = i3;
                    zy11 zy11Var = zy11.a;
                    int i5 = i;
                    n351 n351Var2 = n351Var;
                    d dVar = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i42) {
                        case 0:
                            dVar.a(n351Var2, fidVar2, vng.O(i5 | 1));
                            break;
                        default:
                            dVar.a(n351Var2, fidVar2, vng.O(i5 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }
}
