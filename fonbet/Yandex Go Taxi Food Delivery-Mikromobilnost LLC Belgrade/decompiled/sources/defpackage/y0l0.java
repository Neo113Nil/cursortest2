package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.taxi.order.api.change.destination.RouteChangeType;
import com.yandex.go.taxi.order.h0;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.AllowedChange;
import com.yandex.go.taxi.order.models.api.response.AllowedDestinationPointChanges;
import com.yandex.go.taxi.order.provider.w;
import com.yandex.go.taxi.order.recalculation.domain.a;
import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Consumer;
import kotlin.collections.EmptyList;

/* loaded from: classes14.dex */
public final class y0l0 {
    public final h3y a;
    public final ysg b;
    public final w c;
    public final ga9 d;
    public final b20 e;
    public final ci70 f;
    public final yze0 g;
    public final a h;
    public final m2y0 i;
    public final opw j;
    public final a3y0 k = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "RouteChangeInteractor");

    public y0l0(h3y h3yVar, ysg ysgVar, w wVar, ga9 ga9Var, b20 b20Var, ci70 ci70Var, yze0 yze0Var, a aVar, j2y0 j2y0Var, c2y0 c2y0Var, m2y0 m2y0Var, opw opwVar) {
        this.a = h3yVar;
        this.b = ysgVar;
        this.c = wVar;
        this.d = ga9Var;
        this.e = b20Var;
        this.f = ci70Var;
        this.g = yze0Var;
        this.h = aVar;
        this.i = m2y0Var;
        this.j = opwVar;
        b20Var.e = new h0(this);
    }

    public final void a(final o2y0 o2y0Var, final RouteChangeType routeChangeType) {
        d0l0 t = o2y0Var.b().t();
        boolean c = t.c();
        a3y0 a3y0Var = this.k;
        if (c) {
            a3y0.d(a3y0Var, "changeRoute", null, new apk0(7), 2);
            return;
        }
        this.f.a(o2y0Var.b().a, routeChangeType);
        int i = x0l0.a[routeChangeType.ordinal()];
        final int i2 = 0;
        final int i3 = 1;
        if (i == 1) {
            if (!this.g.d().b) {
                c(o2y0Var, true);
                return;
            }
            List list = t.b;
            Address address = (Address) kotlin.collections.a.S(list.size() > 1 ? list.size() - 2 : 0, list);
            if (address == null) {
                a3y0.e(a3y0Var, new String[]{"changeRoute", "address"}, null, new apk0(8), 2);
                return;
            } else {
                this.h.a(new f0f0(o2y0Var, Collections.singletonList(address), routeChangeType, new Runnable(this) { // from class: w0l0
                    public final /* synthetic */ y0l0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                this.b.c(o2y0Var, true);
                                break;
                            default:
                                this.b.c(o2y0Var, false);
                                break;
                        }
                    }
                }, new Runnable(this) { // from class: w0l0
                    public final /* synthetic */ y0l0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                this.b.c(o2y0Var, true);
                                break;
                            default:
                                this.b.c(o2y0Var, false);
                                break;
                        }
                    }
                }));
                return;
            }
        }
        opw opwVar = this.j;
        if (i == 2) {
            opwVar.getClass();
            this.i.a(o2y0Var, t.a(), kyh0.address_route_point_title, routeChangeType, new Consumer(this) { // from class: v0l0
                public final /* synthetic */ y0l0 b;

                {
                    this.b = this;
                }

                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    switch (i3) {
                        case 0:
                            final Address address2 = (Address) obj;
                            final y0l0 y0l0Var = this.b;
                            boolean z = y0l0Var.g.d().b;
                            final o2y0 o2y0Var2 = o2y0Var;
                            final RouteChangeType routeChangeType2 = routeChangeType;
                            if (!z) {
                                y0l0Var.e(o2y0Var2, address2, routeChangeType2, true);
                                break;
                            } else {
                                a aVar = y0l0Var.h;
                                List singletonList = Collections.singletonList(address2);
                                final int i4 = 0;
                                Runnable runnable = new Runnable() { // from class: u0l0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i4) {
                                            case 0:
                                                y0l0Var.e(o2y0Var2, address2, routeChangeType2, true);
                                                break;
                                            case 1:
                                                y0l0Var.e(o2y0Var2, address2, routeChangeType2, false);
                                                break;
                                            case 2:
                                                y0l0Var.e(o2y0Var2, address2, routeChangeType2, true);
                                                break;
                                            default:
                                                y0l0Var.e(o2y0Var2, address2, routeChangeType2, false);
                                                break;
                                        }
                                    }
                                };
                                final int i5 = 1;
                                aVar.a(new f0f0(o2y0Var2, singletonList, routeChangeType2, runnable, new Runnable() { // from class: u0l0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i5) {
                                            case 0:
                                                y0l0Var.e(o2y0Var2, address2, routeChangeType2, true);
                                                break;
                                            case 1:
                                                y0l0Var.e(o2y0Var2, address2, routeChangeType2, false);
                                                break;
                                            case 2:
                                                y0l0Var.e(o2y0Var2, address2, routeChangeType2, true);
                                                break;
                                            default:
                                                y0l0Var.e(o2y0Var2, address2, routeChangeType2, false);
                                                break;
                                        }
                                    }
                                }));
                                break;
                            }
                        default:
                            final Address address3 = (Address) obj;
                            final y0l0 y0l0Var2 = this.b;
                            boolean z2 = y0l0Var2.g.d().b;
                            final o2y0 o2y0Var3 = o2y0Var;
                            final RouteChangeType routeChangeType3 = routeChangeType;
                            if (!z2) {
                                y0l0Var2.e(o2y0Var3, address3, routeChangeType3, true);
                                break;
                            } else {
                                a aVar2 = y0l0Var2.h;
                                List singletonList2 = Collections.singletonList(address3);
                                final int i6 = 2;
                                Runnable runnable2 = new Runnable() { // from class: u0l0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i6) {
                                            case 0:
                                                y0l0Var2.e(o2y0Var3, address3, routeChangeType3, true);
                                                break;
                                            case 1:
                                                y0l0Var2.e(o2y0Var3, address3, routeChangeType3, false);
                                                break;
                                            case 2:
                                                y0l0Var2.e(o2y0Var3, address3, routeChangeType3, true);
                                                break;
                                            default:
                                                y0l0Var2.e(o2y0Var3, address3, routeChangeType3, false);
                                                break;
                                        }
                                    }
                                };
                                final int i7 = 3;
                                aVar2.a(new f0f0(o2y0Var3, singletonList2, routeChangeType3, runnable2, new Runnable() { // from class: u0l0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i7) {
                                            case 0:
                                                y0l0Var2.e(o2y0Var3, address3, routeChangeType3, true);
                                                break;
                                            case 1:
                                                y0l0Var2.e(o2y0Var3, address3, routeChangeType3, false);
                                                break;
                                            case 2:
                                                y0l0Var2.e(o2y0Var3, address3, routeChangeType3, true);
                                                break;
                                            default:
                                                y0l0Var2.e(o2y0Var3, address3, routeChangeType3, false);
                                                break;
                                        }
                                    }
                                }));
                                break;
                            }
                    }
                }
            });
        } else {
            if (i == 3) {
                this.i.a(o2y0Var, t.a(), kyh0.address_route_point_title, routeChangeType, new Consumer(this) { // from class: v0l0
                    public final /* synthetic */ y0l0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        switch (i2) {
                            case 0:
                                final Address address2 = (Address) obj;
                                final y0l0 y0l0Var = this.b;
                                boolean z = y0l0Var.g.d().b;
                                final o2y0 o2y0Var2 = o2y0Var;
                                final RouteChangeType routeChangeType2 = routeChangeType;
                                if (!z) {
                                    y0l0Var.e(o2y0Var2, address2, routeChangeType2, true);
                                    break;
                                } else {
                                    a aVar = y0l0Var.h;
                                    List singletonList = Collections.singletonList(address2);
                                    final int i4 = 0;
                                    Runnable runnable = new Runnable() { // from class: u0l0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i4) {
                                                case 0:
                                                    y0l0Var.e(o2y0Var2, address2, routeChangeType2, true);
                                                    break;
                                                case 1:
                                                    y0l0Var.e(o2y0Var2, address2, routeChangeType2, false);
                                                    break;
                                                case 2:
                                                    y0l0Var.e(o2y0Var2, address2, routeChangeType2, true);
                                                    break;
                                                default:
                                                    y0l0Var.e(o2y0Var2, address2, routeChangeType2, false);
                                                    break;
                                            }
                                        }
                                    };
                                    final int i5 = 1;
                                    aVar.a(new f0f0(o2y0Var2, singletonList, routeChangeType2, runnable, new Runnable() { // from class: u0l0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i5) {
                                                case 0:
                                                    y0l0Var.e(o2y0Var2, address2, routeChangeType2, true);
                                                    break;
                                                case 1:
                                                    y0l0Var.e(o2y0Var2, address2, routeChangeType2, false);
                                                    break;
                                                case 2:
                                                    y0l0Var.e(o2y0Var2, address2, routeChangeType2, true);
                                                    break;
                                                default:
                                                    y0l0Var.e(o2y0Var2, address2, routeChangeType2, false);
                                                    break;
                                            }
                                        }
                                    }));
                                    break;
                                }
                            default:
                                final Address address3 = (Address) obj;
                                final y0l0 y0l0Var2 = this.b;
                                boolean z2 = y0l0Var2.g.d().b;
                                final o2y0 o2y0Var3 = o2y0Var;
                                final RouteChangeType routeChangeType3 = routeChangeType;
                                if (!z2) {
                                    y0l0Var2.e(o2y0Var3, address3, routeChangeType3, true);
                                    break;
                                } else {
                                    a aVar2 = y0l0Var2.h;
                                    List singletonList2 = Collections.singletonList(address3);
                                    final int i6 = 2;
                                    Runnable runnable2 = new Runnable() { // from class: u0l0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i6) {
                                                case 0:
                                                    y0l0Var2.e(o2y0Var3, address3, routeChangeType3, true);
                                                    break;
                                                case 1:
                                                    y0l0Var2.e(o2y0Var3, address3, routeChangeType3, false);
                                                    break;
                                                case 2:
                                                    y0l0Var2.e(o2y0Var3, address3, routeChangeType3, true);
                                                    break;
                                                default:
                                                    y0l0Var2.e(o2y0Var3, address3, routeChangeType3, false);
                                                    break;
                                            }
                                        }
                                    };
                                    final int i7 = 3;
                                    aVar2.a(new f0f0(o2y0Var3, singletonList2, routeChangeType3, runnable2, new Runnable() { // from class: u0l0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i7) {
                                                case 0:
                                                    y0l0Var2.e(o2y0Var3, address3, routeChangeType3, true);
                                                    break;
                                                case 1:
                                                    y0l0Var2.e(o2y0Var3, address3, routeChangeType3, false);
                                                    break;
                                                case 2:
                                                    y0l0Var2.e(o2y0Var3, address3, routeChangeType3, true);
                                                    break;
                                                default:
                                                    y0l0Var2.e(o2y0Var3, address3, routeChangeType3, false);
                                                    break;
                                            }
                                        }
                                    }));
                                    break;
                                }
                        }
                    }
                });
                return;
            }
            if (i == 4) {
                opwVar.getClass();
                this.i.a(o2y0Var, t.a(), kyh0.address_destination_title, routeChangeType, new ku4(t, this, o2y0Var, routeChangeType, 2));
            } else {
                if (i == 5) {
                    return;
                }
                w511.b();
            }
        }
    }

    public final void b(o2y0 o2y0Var, Address address, boolean z) {
        TaxiOrder b = o2y0Var.b();
        if (z81.a(b.t().b(), address)) {
            return;
        }
        d(o2y0Var, b.t().f(address, false), RouteChangeType.CHANGE_DESTINATION, z);
    }

    public final void c(o2y0 o2y0Var, boolean z) {
        TaxiOrder b = o2y0Var.b();
        ZoneAddress zoneAddress = b.t().a;
        Address l = b.l();
        if (l != null) {
            d(o2y0Var, new d0l0(zoneAddress, Collections.singletonList(l), 4), RouteChangeType.DELETE_MID_POINT, z);
        } else {
            ny61.g("Required value was null.");
        }
    }

    public final void d(o2y0 o2y0Var, d0l0 d0l0Var, RouteChangeType routeChangeType, boolean z) {
        AllowedDestinationPointChanges allowedDestinationPointChanges;
        TaxiOrder b = o2y0Var.b();
        b.Q(d0l0Var);
        w wVar = this.c;
        wVar.getClass();
        int i = m8l0.a[routeChangeType.ordinal()];
        List list = EmptyList.a;
        if (i == 1) {
            wh70 wh70Var = new wh70(o2y0Var.b());
            LinkedHashMap linkedHashMap = wh70Var.a;
            AllowedChange allowedChange = (AllowedChange) linkedHashMap.get("destination_changes");
            List list2 = allowedChange != null ? allowedChange.c : null;
            if (list2 == null) {
                list2 = list;
            }
            linkedHashMap.get("destinations");
            wh70Var.b();
            wh70 wh70Var2 = new wh70(o2y0Var.b());
            allowedDestinationPointChanges = list2.isEmpty() ? null : (AllowedDestinationPointChanges) b64.c(1, list2);
            if (allowedDestinationPointChanges != null) {
                AllowedDestinationPointChanges.Companion.getClass();
                list = scc.g(new AllowedDestinationPointChanges(true, true, false), allowedDestinationPointChanges);
            }
            AllowedChange allowedChange2 = (AllowedChange) wh70Var2.a.get("destination_changes");
            if (allowedChange2 != null) {
                allowedChange2.c = list;
            }
        } else if (i == 2) {
            wh70 wh70Var3 = new wh70(o2y0Var.b());
            LinkedHashMap linkedHashMap2 = wh70Var3.a;
            AllowedChange allowedChange3 = (AllowedChange) linkedHashMap2.get("destination_changes");
            List list3 = allowedChange3 != null ? allowedChange3.c : null;
            if (list3 == null) {
                list3 = list;
            }
            linkedHashMap2.get("destinations");
            wh70Var3.b();
            wh70 wh70Var4 = new wh70(o2y0Var.b());
            allowedDestinationPointChanges = list3.isEmpty() ? null : (AllowedDestinationPointChanges) b64.c(1, list3);
            if (allowedDestinationPointChanges != null) {
                list = Collections.singletonList(new AllowedDestinationPointChanges(allowedDestinationPointChanges.a, allowedDestinationPointChanges.b, true));
            }
            AllowedChange allowedChange4 = (AllowedChange) wh70Var4.a.get("destination_changes");
            if (allowedChange4 != null) {
                allowedChange4.c = list;
            }
        }
        wVar.a(o2y0Var).g(o2y0Var.b().t());
        this.b.g(b);
        if (z) {
            List a = d0l0Var.a();
            String str = b.a;
            List subList = a.subList(1, a.size());
            sk7 a2 = this.d.a(str);
            this.e.a(new ua9((String) a2.b, (String) a2.c, (Calendar) a2.w, subList), str);
        }
    }

    public final void e(o2y0 o2y0Var, Address address, RouteChangeType routeChangeType, boolean z) {
        TaxiOrder b = o2y0Var.b();
        ZoneAddress zoneAddress = b.t().a;
        Address l = b.l();
        if (l == null) {
            ny61.g("Required value was null.");
            return;
        }
        List list = (List) b.t().e.getValue();
        if (list.size() == 1) {
            zzs zzsVar = (zzs) list.get(0);
            zzs B = address.B();
            uzs uzsVar = zzs.Companion;
            if (zzsVar.a(B, 1.0E-6d)) {
                return;
            }
        }
        d(o2y0Var, new d0l0(zoneAddress, scc.g(address, l), 4), routeChangeType, z);
    }
}
