package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.scalable_selector;

import defpackage.aii0;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.mkm0;
import defpackage.n351;
import defpackage.o15;
import defpackage.o430;
import defpackage.p070;
import defpackage.tfx;
import defpackage.tls;
import defpackage.wls;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.scalable_selector.d;

/* loaded from: classes5.dex */
public final class d extends o15 {
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.listeners.a b;
    public final p070 c;

    public d(p070 p070Var, ru.yandex.logistics.sdk.cargo_form.impl.ui.listeners.a aVar) {
        super("scalable-selector");
        this.b = aVar;
        this.c = p070Var;
    }

    @Override // defpackage.o15
    public final void e(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        o430 o430Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1243571524);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(n351Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(this) ? 32 : 16;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else {
            if (!(n351Var instanceof mkm0)) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: skm0
                        public final /* synthetic */ d b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i3;
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
            mkm0 mkm0Var = (mkm0) n351Var;
            ru.yandex.logistics.sdk.cargo_form.impl.ui.listeners.a aVar = this.b;
            boolean e = btsVar.e(aVar);
            Object Q = btsVar.Q();
            o430 o430Var2 = did.a;
            if (e || Q == o430Var2) {
                o430Var = o430Var2;
                ScalableSelectorWidget$FormWidgetContent$2$1 scalableSelectorWidget$FormWidgetContent$2$1 = new ScalableSelectorWidget$FormWidgetContent$2$1(1, aVar, ru.yandex.logistics.sdk.cargo_form.impl.ui.listeners.a.class, "onClick", "onClick(Lcom/yandex/delivery/mapper/model/WidgetAction;)V", 0);
                btsVar.o0(scalableSelectorWidget$FormWidgetContent$2$1);
                Q = scalableSelectorWidget$FormWidgetContent$2$1;
            } else {
                o430Var = o430Var2;
            }
            tls tlsVar = (tls) ((tfx) Q);
            p070 p070Var = this.c;
            boolean e2 = btsVar.e(p070Var);
            Object Q2 = btsVar.Q();
            if (e2 || Q2 == o430Var) {
                ScalableSelectorWidget$FormWidgetContent$3$1 scalableSelectorWidget$FormWidgetContent$3$1 = new ScalableSelectorWidget$FormWidgetContent$3$1(1, p070Var, p070.class, "onShown", "onShown(Lcom/yandex/delivery/mapper/model/AnalyticsData;)V", 0);
                btsVar.o0(scalableSelectorWidget$FormWidgetContent$3$1);
                Q2 = scalableSelectorWidget$FormWidgetContent$3$1;
            }
            a.a(mkm0Var, tlsVar, (tls) ((tfx) Q2), btsVar, i2 & 14);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(this) { // from class: skm0
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
    }
}
