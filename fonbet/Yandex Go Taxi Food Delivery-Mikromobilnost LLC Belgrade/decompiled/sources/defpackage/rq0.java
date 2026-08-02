package defpackage;

import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public final class rq0 extends a151 {
    public rq0() {
        super("address-button");
    }

    @Override // defpackage.a151
    public final void a(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2013023391);
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
            if (!(n351Var instanceof vq0)) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: pq0
                        public final /* synthetic */ rq0 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i3;
                            zy11 zy11Var = zy11.a;
                            int i6 = i;
                            n351 n351Var2 = n351Var;
                            rq0 rq0Var = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    rq0Var.a(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                                default:
                                    rq0Var.a(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            vq0 vq0Var = (vq0) n351Var;
            cza1.a(vq0Var.f || !vq0Var.i, 0, null, null, wwg.S(1652750150, true, new qq0(n351Var, i3), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(this) { // from class: pq0
                public final /* synthetic */ rq0 b;

                {
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    int i6 = i;
                    n351 n351Var2 = n351Var;
                    rq0 rq0Var = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            rq0Var.a(n351Var2, fidVar2, vng.O(i6 | 1));
                            break;
                        default:
                            rq0Var.a(n351Var2, fidVar2, vng.O(i6 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }
}
