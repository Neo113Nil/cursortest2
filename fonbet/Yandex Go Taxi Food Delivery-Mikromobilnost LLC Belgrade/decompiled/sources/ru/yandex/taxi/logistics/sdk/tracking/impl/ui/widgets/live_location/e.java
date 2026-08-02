package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.live_location;

import defpackage.a151;
import defpackage.aii0;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.n351;
import defpackage.o430;
import defpackage.sls;
import defpackage.svy;
import defpackage.tfx;
import defpackage.tls;
import defpackage.wls;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.live_location.e;

/* loaded from: classes5.dex */
public final class e extends a151 {
    public final d b;

    public e(d dVar) {
        super("live-location-key");
        this.b = dVar;
    }

    @Override // defpackage.a151
    public final void a(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(130935113);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(n351Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(this) : btsVar.e(this) ? 32 : 16;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else {
            if (!(n351Var instanceof svy)) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: dwy
                        public final /* synthetic */ e b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i3;
                            zy11 zy11Var = zy11.a;
                            int i6 = i;
                            n351 n351Var2 = n351Var;
                            e eVar = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    eVar.a(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                                default:
                                    eVar.a(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            int i5 = i2;
            svy svyVar = (svy) n351Var;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                LiveLocationWidget$Content$2$1 liveLocationWidget$Content$2$1 = new LiveLocationWidget$Content$2$1(0, this.b, d.class, "onButtonClick", "onButtonClick()V", 0);
                btsVar.o0(liveLocationWidget$Content$2$1);
                Q = liveLocationWidget$Content$2$1;
            }
            sls slsVar = (sls) ((tfx) Q);
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                LiveLocationWidget$Content$3$1 liveLocationWidget$Content$3$1 = new LiveLocationWidget$Content$3$1(1, this.b, d.class, "onToggleCheckedChange", "onToggleCheckedChange(Z)V", 0);
                btsVar.o0(liveLocationWidget$Content$3$1);
                Q2 = liveLocationWidget$Content$3$1;
            }
            tls tlsVar = (tls) ((tfx) Q2);
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                LiveLocationWidget$Content$4$1 liveLocationWidget$Content$4$1 = new LiveLocationWidget$Content$4$1(0, this.b, d.class, "onButtonShown", "onButtonShown()V", 0);
                btsVar.o0(liveLocationWidget$Content$4$1);
                Q3 = liveLocationWidget$Content$4$1;
            }
            sls slsVar2 = (sls) ((tfx) Q3);
            Object Q4 = btsVar.Q();
            if (Q4 == o430Var) {
                LiveLocationWidget$Content$5$1 liveLocationWidget$Content$5$1 = new LiveLocationWidget$Content$5$1(0, this.b, d.class, "onToggleShown", "onToggleShown()V", 0);
                btsVar.o0(liveLocationWidget$Content$5$1);
                Q4 = liveLocationWidget$Content$5$1;
            }
            a.a(svyVar, slsVar, tlsVar, slsVar2, (sls) ((tfx) Q4), btsVar, (i5 & 14) | 28080, 0);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(this) { // from class: dwy
                public final /* synthetic */ e b;

                {
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = i4;
                    zy11 zy11Var = zy11.a;
                    int i6 = i;
                    n351 n351Var2 = n351Var;
                    e eVar = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i52) {
                        case 0:
                            eVar.a(n351Var2, fidVar2, vng.O(i6 | 1));
                            break;
                        default:
                            eVar.a(n351Var2, fidVar2, vng.O(i6 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }
}
