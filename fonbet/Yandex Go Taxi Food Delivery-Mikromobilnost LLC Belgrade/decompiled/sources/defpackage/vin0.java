package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.go.scooters.discovery.ScootersDiscoveryAnalytics$TappedButton;
import com.yandex.go.scooters.discovery.ScootersDiscoveryModalView;
import com.yandex.go.scooters.discovery.j;
import com.yandex.go.shortcuts.dto.request.ProductsScreenType$Type;
import com.yandex.go.shortcuts.ui.interactors.ShortcutViewSourceType;
import defpackage.t9h0;
import defpackage.tls;
import defpackage.vin0;
import defpackage.xva0;
import defpackage.xym0;
import defpackage.yuf0;
import defpackage.zy11;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.discovery.a;
import ru.yandex.taxi.layers.presentation.optimalview.c;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.shortcuts.ui.shortcutview.ShortcutsView;
import ru.yandex.taxi.widget.ModalView;

/* loaded from: classes13.dex */
public final class vin0 implements swj {
    public tls A;
    public pin0 B;
    public pxm0 C;
    public final Context a;
    public final j5z b;
    public final ah00 c;
    public final tt2 d;
    public final tse e;
    public final ip11 f;
    public final a3v g;
    public final a850 h;
    public final fva0 i;
    public final h3y j;
    public final t4s0 k;
    public final j l;
    public final lzm0 m;
    public final xzm0 n;
    public final yhn0 o;
    public final w040 p;
    public final g8n0 q;
    public pin0 r;
    public pin0 s;
    public iin0 t;
    public pin0 u;
    public pin0 v;
    public pin0 w;
    public pin0 x;
    public pin0 y;
    public lbb0 z;

    public vin0(Context context, j5z j5zVar, ah00 ah00Var, tt2 tt2Var, tse tseVar, ip11 ip11Var, a3v a3vVar, a850 a850Var, fva0 fva0Var, h3y h3yVar, t4s0 t4s0Var, j jVar, lzm0 lzm0Var, xzm0 xzm0Var, yhn0 yhn0Var, w040 w040Var, g8n0 g8n0Var) {
        this.a = context;
        this.b = j5zVar;
        this.c = ah00Var;
        this.d = tt2Var;
        this.e = tseVar;
        this.f = ip11Var;
        this.g = a3vVar;
        this.h = a850Var;
        this.i = fva0Var;
        this.j = h3yVar;
        this.k = t4s0Var;
        this.l = jVar;
        this.m = lzm0Var;
        this.n = xzm0Var;
        this.o = yhn0Var;
        this.p = w040Var;
        this.q = g8n0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [T, android.view.View$OnAttachStateChangeListener, com.yandex.go.scooters.discovery.ScootersDiscoveryScreenFactory$createDiscoveryScreen$$inlined$wrapJankStats$1] */
    @Override // defpackage.swj
    public final ModalView a(apf apfVar) {
        final xhn0 xhn0Var = new xhn0((co40) ((qzm0) this.o.a.b).get(), this.C);
        final String str = "ScootersDiscovery";
        fva0.f(this.i, "ScootersDiscovery", PerformanceAnalytics$Type.Inflate, 0L, 4);
        final int i = 0;
        sls slsVar = new sls() { // from class: tin0
            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                zy11 zy11Var = zy11.a;
                vin0 vin0Var = this;
                xhn0 xhn0Var2 = xhn0Var;
                switch (i2) {
                    case 0:
                        xhn0Var2.a(ScootersDiscoveryAnalytics$TappedButton.QR);
                        pin0 pin0Var = vin0Var.r;
                        if (pin0Var != null) {
                            pin0Var.invoke();
                            break;
                        }
                        break;
                    default:
                        xhn0Var2.a(ScootersDiscoveryAnalytics$TappedButton.SUPPORT);
                        pin0 pin0Var2 = vin0Var.s;
                        if (pin0Var2 != null) {
                            pin0Var2.invoke();
                            break;
                        }
                        break;
                }
                return zy11Var;
            }
        };
        final int i2 = 1;
        sls slsVar2 = new sls() { // from class: tin0
            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                zy11 zy11Var = zy11.a;
                vin0 vin0Var = this;
                xhn0 xhn0Var2 = xhn0Var;
                switch (i22) {
                    case 0:
                        xhn0Var2.a(ScootersDiscoveryAnalytics$TappedButton.QR);
                        pin0 pin0Var = vin0Var.r;
                        if (pin0Var != null) {
                            pin0Var.invoke();
                            break;
                        }
                        break;
                    default:
                        xhn0Var2.a(ScootersDiscoveryAnalytics$TappedButton.SUPPORT);
                        pin0 pin0Var2 = vin0Var.s;
                        if (pin0Var2 != null) {
                            pin0Var2.invoke();
                            break;
                        }
                        break;
                }
                return zy11Var;
            }
        };
        final int i3 = 2;
        iin0 iin0Var = new iin0(i3, this);
        sls slsVar3 = new sls(this) { // from class: uin0
            public final /* synthetic */ vin0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i4 = i2;
                zy11 zy11Var = zy11.a;
                vin0 vin0Var = this.b;
                switch (i4) {
                    case 0:
                        pin0 pin0Var = vin0Var.B;
                        if (pin0Var != null) {
                            pin0Var.invoke();
                            break;
                        }
                        break;
                    case 1:
                        pin0 pin0Var2 = vin0Var.u;
                        if (pin0Var2 != null) {
                            pin0Var2.invoke();
                            break;
                        }
                        break;
                    case 2:
                        pin0 pin0Var3 = vin0Var.v;
                        if (pin0Var3 != null) {
                            pin0Var3.invoke();
                            break;
                        }
                        break;
                    case 3:
                        pin0 pin0Var4 = vin0Var.w;
                        if (pin0Var4 != null) {
                            pin0Var4.invoke();
                            break;
                        }
                        break;
                    case 4:
                        pin0 pin0Var5 = vin0Var.x;
                        if (pin0Var5 != null) {
                            pin0Var5.invoke();
                            break;
                        }
                        break;
                    default:
                        pin0 pin0Var6 = vin0Var.y;
                        if (pin0Var6 != null) {
                            pin0Var6.invoke();
                            break;
                        }
                        break;
                }
                return zy11Var;
            }
        };
        sls slsVar4 = new sls(this) { // from class: uin0
            public final /* synthetic */ vin0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i4 = i3;
                zy11 zy11Var = zy11.a;
                vin0 vin0Var = this.b;
                switch (i4) {
                    case 0:
                        pin0 pin0Var = vin0Var.B;
                        if (pin0Var != null) {
                            pin0Var.invoke();
                            break;
                        }
                        break;
                    case 1:
                        pin0 pin0Var2 = vin0Var.u;
                        if (pin0Var2 != null) {
                            pin0Var2.invoke();
                            break;
                        }
                        break;
                    case 2:
                        pin0 pin0Var3 = vin0Var.v;
                        if (pin0Var3 != null) {
                            pin0Var3.invoke();
                            break;
                        }
                        break;
                    case 3:
                        pin0 pin0Var4 = vin0Var.w;
                        if (pin0Var4 != null) {
                            pin0Var4.invoke();
                            break;
                        }
                        break;
                    case 4:
                        pin0 pin0Var5 = vin0Var.x;
                        if (pin0Var5 != null) {
                            pin0Var5.invoke();
                            break;
                        }
                        break;
                    default:
                        pin0 pin0Var6 = vin0Var.y;
                        if (pin0Var6 != null) {
                            pin0Var6.invoke();
                            break;
                        }
                        break;
                }
                return zy11Var;
            }
        };
        final int i4 = 3;
        sls slsVar5 = new sls(this) { // from class: uin0
            public final /* synthetic */ vin0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i42 = i4;
                zy11 zy11Var = zy11.a;
                vin0 vin0Var = this.b;
                switch (i42) {
                    case 0:
                        pin0 pin0Var = vin0Var.B;
                        if (pin0Var != null) {
                            pin0Var.invoke();
                            break;
                        }
                        break;
                    case 1:
                        pin0 pin0Var2 = vin0Var.u;
                        if (pin0Var2 != null) {
                            pin0Var2.invoke();
                            break;
                        }
                        break;
                    case 2:
                        pin0 pin0Var3 = vin0Var.v;
                        if (pin0Var3 != null) {
                            pin0Var3.invoke();
                            break;
                        }
                        break;
                    case 3:
                        pin0 pin0Var4 = vin0Var.w;
                        if (pin0Var4 != null) {
                            pin0Var4.invoke();
                            break;
                        }
                        break;
                    case 4:
                        pin0 pin0Var5 = vin0Var.x;
                        if (pin0Var5 != null) {
                            pin0Var5.invoke();
                            break;
                        }
                        break;
                    default:
                        pin0 pin0Var6 = vin0Var.y;
                        if (pin0Var6 != null) {
                            pin0Var6.invoke();
                            break;
                        }
                        break;
                }
                return zy11Var;
            }
        };
        final int i5 = 4;
        sls slsVar6 = new sls(this) { // from class: uin0
            public final /* synthetic */ vin0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i42 = i5;
                zy11 zy11Var = zy11.a;
                vin0 vin0Var = this.b;
                switch (i42) {
                    case 0:
                        pin0 pin0Var = vin0Var.B;
                        if (pin0Var != null) {
                            pin0Var.invoke();
                            break;
                        }
                        break;
                    case 1:
                        pin0 pin0Var2 = vin0Var.u;
                        if (pin0Var2 != null) {
                            pin0Var2.invoke();
                            break;
                        }
                        break;
                    case 2:
                        pin0 pin0Var3 = vin0Var.v;
                        if (pin0Var3 != null) {
                            pin0Var3.invoke();
                            break;
                        }
                        break;
                    case 3:
                        pin0 pin0Var4 = vin0Var.w;
                        if (pin0Var4 != null) {
                            pin0Var4.invoke();
                            break;
                        }
                        break;
                    case 4:
                        pin0 pin0Var5 = vin0Var.x;
                        if (pin0Var5 != null) {
                            pin0Var5.invoke();
                            break;
                        }
                        break;
                    default:
                        pin0 pin0Var6 = vin0Var.y;
                        if (pin0Var6 != null) {
                            pin0Var6.invoke();
                            break;
                        }
                        break;
                }
                return zy11Var;
            }
        };
        final int i6 = 5;
        sls slsVar7 = new sls(this) { // from class: uin0
            public final /* synthetic */ vin0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i42 = i6;
                zy11 zy11Var = zy11.a;
                vin0 vin0Var = this.b;
                switch (i42) {
                    case 0:
                        pin0 pin0Var = vin0Var.B;
                        if (pin0Var != null) {
                            pin0Var.invoke();
                            break;
                        }
                        break;
                    case 1:
                        pin0 pin0Var2 = vin0Var.u;
                        if (pin0Var2 != null) {
                            pin0Var2.invoke();
                            break;
                        }
                        break;
                    case 2:
                        pin0 pin0Var3 = vin0Var.v;
                        if (pin0Var3 != null) {
                            pin0Var3.invoke();
                            break;
                        }
                        break;
                    case 3:
                        pin0 pin0Var4 = vin0Var.w;
                        if (pin0Var4 != null) {
                            pin0Var4.invoke();
                            break;
                        }
                        break;
                    case 4:
                        pin0 pin0Var5 = vin0Var.x;
                        if (pin0Var5 != null) {
                            pin0Var5.invoke();
                            break;
                        }
                        break;
                    default:
                        pin0 pin0Var6 = vin0Var.y;
                        if (pin0Var6 != null) {
                            pin0Var6.invoke();
                            break;
                        }
                        break;
                }
                return zy11Var;
            }
        };
        lbb0 lbb0Var = new lbb0(25, this);
        nx9 nx9Var = new nx9(2);
        w040 w040Var = this.p;
        ShortcutsView a = ((kqe) w040Var.e).a((Context) w040Var.a, new wvo0((y50) w040Var.c, iin0Var, slsVar2, slsVar, slsVar3, slsVar4, slsVar5, slsVar6, slsVar7, lbb0Var), ((uxr0) w040Var.d).a(nx9Var), new lx9(), new s6k0("scooters-discovery", ProductsScreenType$Type.SCOOTERS_DISCOVERY, nx9Var), new vfc0(29, w040Var), ShortcutViewSourceType.SCOOTERS_DISCOVERY);
        a aVar = (a) i5m.a((rs0) apfVar.c).get();
        c cVar = (c) i5m.a((n3w) apfVar.w).get();
        wwj wwjVar = (wwj) i5m.a((azf) apfVar.x).get();
        final int i7 = 0;
        final ScootersDiscoveryModalView scootersDiscoveryModalView = new ScootersDiscoveryModalView(this.a, this.b, this.c, this.d, this.e, new sls(this) { // from class: uin0
            public final /* synthetic */ vin0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i42 = i7;
                zy11 zy11Var = zy11.a;
                vin0 vin0Var = this.b;
                switch (i42) {
                    case 0:
                        pin0 pin0Var = vin0Var.B;
                        if (pin0Var != null) {
                            pin0Var.invoke();
                            break;
                        }
                        break;
                    case 1:
                        pin0 pin0Var2 = vin0Var.u;
                        if (pin0Var2 != null) {
                            pin0Var2.invoke();
                            break;
                        }
                        break;
                    case 2:
                        pin0 pin0Var3 = vin0Var.v;
                        if (pin0Var3 != null) {
                            pin0Var3.invoke();
                            break;
                        }
                        break;
                    case 3:
                        pin0 pin0Var4 = vin0Var.w;
                        if (pin0Var4 != null) {
                            pin0Var4.invoke();
                            break;
                        }
                        break;
                    case 4:
                        pin0 pin0Var5 = vin0Var.x;
                        if (pin0Var5 != null) {
                            pin0Var5.invoke();
                            break;
                        }
                        break;
                    default:
                        pin0 pin0Var6 = vin0Var.y;
                        if (pin0Var6 != null) {
                            pin0Var6.invoke();
                            break;
                        }
                        break;
                }
                return zy11Var;
            }
        }, this.f, a, this.g, this.h, aVar, this.i, this.j, new tls() { // from class: com.yandex.go.scooters.discovery.n
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                xym0 xym0Var = (xym0) obj;
                tls tlsVar = vin0.this.A;
                if (tlsVar != null) {
                    ((ScootersDiscoveryRouter$prepareDiscoveryParams$1$10) tlsVar).invoke(xym0Var);
                }
                return zy11.a;
            }
        }, cVar, this.l, this.k, xhn0Var, wwjVar, this.m, this.n, this.q);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? r1 = new View.OnAttachStateChangeListener() { // from class: com.yandex.go.scooters.discovery.ScootersDiscoveryScreenFactory$createDiscoveryScreen$$inlined$wrapJankStats$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                View rootView = scootersDiscoveryModalView.getRootView();
                Object tag = rootView.getTag(t9h0.metricsStateHolder);
                if (tag == null) {
                    tag = new xva0();
                    rootView.setTag(t9h0.metricsStateHolder, tag);
                }
                yuf0 yuf0Var = ((xva0) tag).a;
                if (yuf0Var != null) {
                    yuf0Var.I(str);
                }
                View view = scootersDiscoveryModalView;
                T t = ref$ObjectRef.element;
                view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
            }
        };
        ref$ObjectRef.element = r1;
        scootersDiscoveryModalView.addOnAttachStateChangeListener(r1);
        return scootersDiscoveryModalView;
    }
}
