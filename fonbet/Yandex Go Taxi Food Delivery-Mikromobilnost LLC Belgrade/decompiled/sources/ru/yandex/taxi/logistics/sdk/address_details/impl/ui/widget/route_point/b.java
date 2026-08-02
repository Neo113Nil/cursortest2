package ru.yandex.taxi.logistics.sdk.address_details.impl.ui.widget.route_point;

import androidx.compose.runtime.f;
import defpackage.a151;
import defpackage.aii0;
import defpackage.bts;
import defpackage.did;
import defpackage.dms;
import defpackage.fid;
import defpackage.fj00;
import defpackage.n351;
import defpackage.n3z;
import defpackage.o430;
import defpackage.o71;
import defpackage.oz40;
import defpackage.pey;
import defpackage.q71;
import defpackage.tfx;
import defpackage.tls;
import defpackage.wls;
import defpackage.x7l0;
import defpackage.zls;
import defpackage.zpn;
import ru.yandex.taxi.logistics.sdk.address_details.impl.ui.e;
import ru.yandex.taxi.logistics.sdk.address_details.impl.ui.widget.route_point.b;

/* loaded from: classes5.dex */
public final class b extends a151 {
    public final e b;

    public b(e eVar) {
        super("route-point");
        this.b = eVar;
    }

    @Override // defpackage.a151
    public final void a(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        bts btsVar;
        final int i3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1051106256);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(n351Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(this) ? 32 : 16;
        }
        if (!btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar = btsVar2;
            i3 = 1;
            btsVar.Y();
        } else {
            if (!(n351Var instanceof x7l0)) {
                aii0 v = btsVar2.v();
                if (v != null) {
                    v.d = new wls(this) { // from class: d8l0
                        public final /* synthetic */ b b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = r4;
                            zy11 zy11Var = zy11.a;
                            int i5 = i;
                            n351 n351Var2 = n351Var;
                            b bVar = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    bVar.a(n351Var2, fidVar2, vng.O(i5 | 1));
                                    break;
                                default:
                                    bVar.a(n351Var2, fidVar2, vng.O(i5 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    return;
                }
                return;
            }
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            Object obj = Q;
            if (Q == o430Var) {
                oz40 j = f.j(o71.a);
                btsVar2.o0(j);
                obj = j;
            }
            oz40 oz40Var = (oz40) obj;
            pey peyVar = (pey) btsVar2.m(n3z.a);
            x7l0 x7l0Var = (x7l0) n351Var;
            fj00 fj00Var = x7l0Var.f;
            int i4 = i2 & 14;
            int i5 = (btsVar2.e(this) ? 1 : 0) | (i4 == 4 ? 1 : 0) | (btsVar2.e(peyVar) ? 1 : 0);
            Object Q2 = btsVar2.Q();
            if (i5 != 0 || Q2 == o430Var) {
                RoutePointWidget$Content$2$1 routePointWidget$Content$2$1 = new RoutePointWidget$Content$2$1(this, n351Var, peyVar, oz40Var, null);
                btsVar2.o0(routePointWidget$Content$2$1);
                Q2 = routePointWidget$Content$2$1;
            }
            zpn.e(btsVar2, (wls) Q2, fj00Var);
            e eVar = this.b;
            boolean e = btsVar2.e(eVar);
            Object Q3 = btsVar2.Q();
            if (e || Q3 == o430Var) {
                RoutePointWidget$Content$3$1 routePointWidget$Content$3$1 = new RoutePointWidget$Content$3$1(5, eVar, e.class, "onFieldChanged", "onFieldChanged(ILjava/lang/String;Lcom/yandex/delivery/address/location/FieldType$EditableFieldType;Ljava/lang/String;Ljava/lang/String;)V", 0);
                btsVar2.o0(routePointWidget$Content$3$1);
                Q3 = routePointWidget$Content$3$1;
            }
            dms dmsVar = (dms) ((tfx) Q3);
            e eVar2 = this.b;
            boolean e2 = btsVar2.e(eVar2);
            Object Q4 = btsVar2.Q();
            if (e2 || Q4 == o430Var) {
                RoutePointWidget$Content$4$1 routePointWidget$Content$4$1 = new RoutePointWidget$Content$4$1(3, eVar2, e.class, "onAddressClicked", "onAddressClicked(ILcom/yandex/delivery/mapper/model/AddressFlow;Z)V", 0);
                btsVar2.o0(routePointWidget$Content$4$1);
                Q4 = routePointWidget$Content$4$1;
            }
            zls zlsVar = (zls) ((tfx) Q4);
            e eVar3 = this.b;
            boolean e3 = btsVar2.e(eVar3);
            Object Q5 = btsVar2.Q();
            if (e3 || Q5 == o430Var) {
                RoutePointWidget$Content$5$1 routePointWidget$Content$5$1 = new RoutePointWidget$Content$5$1(1, eVar3, e.class, "onDeleteAddressClicked", "onDeleteAddressClicked(I)V", 0);
                btsVar2.o0(routePointWidget$Content$5$1);
                Q5 = routePointWidget$Content$5$1;
            }
            tls tlsVar = (tls) ((tfx) Q5);
            e eVar4 = this.b;
            boolean e4 = btsVar2.e(eVar4);
            Object Q6 = btsVar2.Q();
            if (e4 || Q6 == o430Var) {
                RoutePointWidget$Content$6$1 routePointWidget$Content$6$1 = new RoutePointWidget$Content$6$1(1, eVar4, e.class, "onAddressShown", "onAddressShown(I)V", 0);
                btsVar2.o0(routePointWidget$Content$6$1);
                Q6 = routePointWidget$Content$6$1;
            }
            tls tlsVar2 = (tls) ((tfx) Q6);
            e eVar5 = this.b;
            boolean e5 = btsVar2.e(eVar5);
            Object Q7 = btsVar2.Q();
            Object obj2 = Q7;
            if (e5 || Q7 == o430Var) {
                RoutePointWidget$Content$7$1 routePointWidget$Content$7$1 = new RoutePointWidget$Content$7$1(2, eVar5, e.class, "onContactClicked", "onContactClicked(ILjava/lang/String;)V", 0);
                btsVar2.o0(routePointWidget$Content$7$1);
                obj2 = routePointWidget$Content$7$1;
            }
            wls wlsVar = (wls) ((tfx) obj2);
            e eVar6 = this.b;
            boolean e6 = btsVar2.e(eVar6);
            Object Q8 = btsVar2.Q();
            if (e6 || Q8 == o430Var) {
                Q8 = new RoutePointWidget$Content$8$1(1, eVar6, e.class, "onContactShown", "onContactShown(I)V", 0);
                btsVar2.o0(Q8);
            }
            tls tlsVar3 = (tls) ((tfx) Q8);
            e eVar7 = this.b;
            boolean e7 = btsVar2.e(eVar7);
            Object Q9 = btsVar2.Q();
            if (e7 || Q9 == o430Var) {
                Q9 = new RoutePointWidget$Content$9$1(2, eVar7, e.class, "onBubbleClicked", "onBubbleClicked(Lcom/yandex/delivery/address/location/FieldType;I)V", 0);
                btsVar2.o0(Q9);
            }
            wls wlsVar2 = (wls) ((tfx) Q9);
            e eVar8 = this.b;
            boolean e8 = btsVar2.e(eVar8);
            Object Q10 = btsVar2.Q();
            if (e8 || Q10 == o430Var) {
                Q10 = new RoutePointWidget$Content$10$1(1, eVar8, e.class, "onCommentClicked", "onCommentClicked(I)V", 0);
                btsVar2.o0(Q10);
            }
            tls tlsVar4 = (tls) ((tfx) Q10);
            e eVar9 = this.b;
            boolean e9 = btsVar2.e(eVar9);
            Object Q11 = btsVar2.Q();
            if (e9 || Q11 == o430Var) {
                Q11 = new RoutePointWidget$Content$11$1(1, eVar9, e.class, "onStaticMapClick", "onStaticMapClick(I)V", 0);
                btsVar2.o0(Q11);
            }
            btsVar = btsVar2;
            i3 = 1;
            a.j(x7l0Var, dmsVar, zlsVar, tlsVar, tlsVar2, wlsVar, tlsVar3, wlsVar2, tlsVar4, (tls) ((tfx) Q11), (q71) oz40Var.getValue(), btsVar, i4);
        }
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            v2.d = new wls(this) { // from class: d8l0
                public final /* synthetic */ b b;

                {
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj3, Object obj22) {
                    int i42 = i3;
                    zy11 zy11Var = zy11.a;
                    int i52 = i;
                    n351 n351Var2 = n351Var;
                    b bVar = this.b;
                    fid fidVar2 = (fid) obj3;
                    ((Integer) obj22).getClass();
                    switch (i42) {
                        case 0:
                            bVar.a(n351Var2, fidVar2, vng.O(i52 | 1));
                            break;
                        default:
                            bVar.a(n351Var2, fidVar2, vng.O(i52 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
        }
    }
}
