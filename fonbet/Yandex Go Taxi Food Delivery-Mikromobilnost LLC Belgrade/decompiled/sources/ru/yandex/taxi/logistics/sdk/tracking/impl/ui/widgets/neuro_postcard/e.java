package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard;

import defpackage.a151;
import defpackage.aii0;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.j360;
import defpackage.n351;
import defpackage.o430;
import defpackage.s360;
import defpackage.tfx;
import defpackage.tls;
import defpackage.wls;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard.e;

/* loaded from: classes5.dex */
public final class e extends a151 {
    public final j360 b;

    public e(j360 j360Var) {
        super("neuro-postcard");
        this.b = j360Var;
    }

    @Override // defpackage.a151
    public final void a(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1494144979);
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
            if (!(n351Var instanceof s360)) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: q460
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
            s360 s360Var = (s360) n351Var;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                NeuroPostcardWidget$Content$2$1 neuroPostcardWidget$Content$2$1 = new NeuroPostcardWidget$Content$2$1(1, this.b, j360.class, "onShown", "onShown(Ljava/lang/String;)V", 0);
                btsVar.o0(neuroPostcardWidget$Content$2$1);
                Q = neuroPostcardWidget$Content$2$1;
            }
            tls tlsVar = (tls) ((tfx) Q);
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                NeuroPostcardWidget$Content$3$1 neuroPostcardWidget$Content$3$1 = new NeuroPostcardWidget$Content$3$1(2, this.b, j360.class, "onClick", "onClick(Lru/yandex/taxi/logistics/sdk/tracking/impl/ui/widgets/neuro_postcard/NeuroPostcardActionModel;Ljava/lang/String;)V", 0);
                btsVar.o0(neuroPostcardWidget$Content$3$1);
                Q2 = neuroPostcardWidget$Content$3$1;
            }
            wls wlsVar2 = (wls) ((tfx) Q2);
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                NeuroPostcardWidget$Content$4$1 neuroPostcardWidget$Content$4$1 = new NeuroPostcardWidget$Content$4$1(1, this.b, j360.class, "setStageAsShown", "setStageAsShown(Lru/yandex/taxi/logistics/sdk/tracking/impl/ui/widgets/neuro_postcard/NeuroPostcardStageModel;)V", 0);
                btsVar.o0(neuroPostcardWidget$Content$4$1);
                Q3 = neuroPostcardWidget$Content$4$1;
            }
            ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard.ui.a.a(s360Var, tlsVar, wlsVar2, (tls) ((tfx) Q3), btsVar, (i5 & 14) | 3504);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(this) { // from class: q460
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
