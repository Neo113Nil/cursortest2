package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget;

import defpackage.a151;
import defpackage.aii0;
import defpackage.bts;
import defpackage.did;
import defpackage.dzm;
import defpackage.fid;
import defpackage.g1a1;
import defpackage.loj;
import defpackage.n351;
import defpackage.o430;
import defpackage.q6n;
import defpackage.tls;
import defpackage.tts0;
import defpackage.wls;
import defpackage.zpn;
import defpackage.zy11;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget.f;

/* loaded from: classes5.dex */
public final class f extends a151 {
    public final tts0 b;

    public f(tts0 tts0Var) {
        super("dynamic-content-slot-key");
        this.b = tts0Var;
    }

    @Override // defpackage.a151
    public final void a(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(5430453);
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
            if (!(n351Var instanceof q6n)) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: r6n
                        public final /* synthetic */ f b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i3;
                            zy11 zy11Var = zy11.a;
                            int i6 = i;
                            n351 n351Var2 = n351Var;
                            f fVar = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    fVar.a(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                                default:
                                    fVar.a(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            int i5 = i2 & 112;
            int i6 = i2 & 14;
            boolean z = (i6 == 4) | (i5 == 32 || ((i2 & 64) != 0 && btsVar.e(this)));
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new DynamicContentSlotWidget$Content$2$1(this, n351Var, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            q6n q6nVar = (q6n) n351Var;
            boolean z2 = i5 == 32 || ((i2 & 64) != 0 && btsVar.e(this));
            Object Q2 = btsVar.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new dzm(3, this);
                btsVar.o0(Q2);
            }
            tls tlsVar = (tls) Q2;
            if (i5 == 32 || ((i2 & 64) != 0 && btsVar.e(this))) {
                i3 = 1;
            }
            Object Q3 = btsVar.Q();
            if (i3 != 0 || Q3 == o430Var) {
                Q3 = new loj(10, this);
                btsVar.o0(Q3);
            }
            g1a1.a(q6nVar, tlsVar, (wls) Q3, btsVar, i6);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(this) { // from class: r6n
                public final /* synthetic */ f b;

                {
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = i4;
                    zy11 zy11Var = zy11.a;
                    int i62 = i;
                    n351 n351Var2 = n351Var;
                    f fVar = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i52) {
                        case 0:
                            fVar.a(n351Var2, fidVar2, vng.O(i62 | 1));
                            break;
                        default:
                            fVar.a(n351Var2, fidVar2, vng.O(i62 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }
}
