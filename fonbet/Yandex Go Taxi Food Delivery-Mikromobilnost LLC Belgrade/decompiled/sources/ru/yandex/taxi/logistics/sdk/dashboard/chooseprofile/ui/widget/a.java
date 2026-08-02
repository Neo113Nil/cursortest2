package ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui.widget;

import defpackage.a151;
import defpackage.aii0;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.kdb1;
import defpackage.lhg;
import defpackage.mhg;
import defpackage.n351;
import defpackage.sls0;
import defpackage.wls;
import defpackage.zpn;
import ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui.widget.a;

/* loaded from: classes5.dex */
public final class a extends a151 {
    public a() {
        super("choose_profile_skeleton");
    }

    @Override // defpackage.a151
    public final void a(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1433149833);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(n351Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (!btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar.Y();
        } else {
            if (!(n351Var instanceof sls0)) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: xjs0
                        public final /* synthetic */ a b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i3;
                            zy11 zy11Var = zy11.a;
                            int i6 = i;
                            n351 n351Var2 = n351Var;
                            a aVar = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    aVar.a(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                                default:
                                    aVar.a(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            lhg lhgVar = (lhg) btsVar.m(mhg.a);
            boolean e = ((i2 & 14) == 4) | btsVar.e(lhgVar);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new Skeleton$Content$2$1(lhgVar, n351Var, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, n351Var);
            kdb1.c(btsVar, 0);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(this) { // from class: xjs0
                public final /* synthetic */ a b;

                {
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    int i6 = i;
                    n351 n351Var2 = n351Var;
                    a aVar = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            aVar.a(n351Var2, fidVar2, vng.O(i6 | 1));
                            break;
                        default:
                            aVar.a(n351Var2, fidVar2, vng.O(i6 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }
}
