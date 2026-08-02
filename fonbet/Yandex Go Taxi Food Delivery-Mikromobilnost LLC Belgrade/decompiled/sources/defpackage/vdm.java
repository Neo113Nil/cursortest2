package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.go.drive.delegates.b;
import com.yandex.go.drive.launch.e;
import com.yandex.go.drive.sdkintegration.presentation.DriveHostView;
import com.yandex.go.navigation.modals.coroutines.a;
import com.yandex.go.routestops.RouteStopsModalView;
import com.yandex.go.scooters.photocontrol.ScootersPhotocontrolModalView;
import com.yandex.go.scooters.qr.unavailable_scooter.ui.ScootersQrUnavailableScooterModalView;
import com.yandex.go.tariffcard.modal.TariffOptionsCardModalView;
import com.yandex.go.tariffcard.ui.TariffOptionsCardView;
import defpackage.t9h0;
import defpackage.xva0;
import defpackage.yuf0;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

/* loaded from: classes13.dex */
public final class vdm extends a {
    public final /* synthetic */ int F;
    public final Object G;
    public final Object H;
    public final Object I;
    public final Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vdm(Object obj, Object obj2, w030 w030Var, Object obj3, int i) {
        super(null);
        this.F = i;
        this.I = w030Var;
        this.G = obj;
        this.H = obj2;
        this.J = obj3;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a, defpackage.h55
    public void G(Object obj) {
        Object value;
        switch (this.F) {
            case 0:
                super.G((ovx) obj);
                r0 r0Var = ((com.yandex.go.drive.sdkintegration.domain.a) this.H).a;
                do {
                    value = r0Var.getValue();
                    ((Boolean) value).getClass();
                } while (!r0Var.k(value, Boolean.TRUE));
            default:
                super.G(obj);
                break;
        }
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        switch (this.F) {
            case 0:
                return (w030) this.I;
            case 1:
                return ((i130) this.G).a();
            case 2:
                return (w030) this.I;
            case 3:
                return (w030) this.I;
            default:
                return ((i130) this.H).a();
        }
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        switch (this.F) {
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v28, types: [T, android.view.View$OnAttachStateChangeListener, com.yandex.go.scooters.qr.unavailable_scooter.ScootersQrUnavailableScooterRouter$provideModalView-lTekXHU$$inlined$wrapJankStats$1] */
    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final Object S(Object obj, Continuation continuation) {
        int i = this.F;
        Object obj2 = this.H;
        Object obj3 = this.I;
        Object obj4 = this.G;
        Object obj5 = this.J;
        switch (i) {
            case 0:
                e eVar = (e) obj5;
                kb20 kb20Var = eVar.c;
                eVar.a(new yb20(kb20Var.b(), kb20Var.a()));
                idm idmVar = (idm) obj4;
                w030 w030Var = (w030) obj3;
                idmVar.getClass();
                w030Var.getClass();
                ywf ywfVar = new ywf(5, idmVar);
                c0g c0gVar = (c0g) idmVar;
                Context e2 = c0gVar.e2();
                q5z.h(e2);
                tse tseVar = (tse) c0gVar.B.get();
                q5z.h(tseVar);
                ah00 z2 = c0gVar.z2();
                q5z.h(z2);
                c0g c0gVar2 = c0gVar.A;
                rz8 rz8Var = (rz8) c0gVar2.a.r2.get();
                q5z.h(rz8Var);
                zzf zzfVar = c0gVar.z;
                b bVar = (b) zzfVar.d8.get();
                q5z.h(bVar);
                com.yandex.go.drive.delegates.a f = c0gVar2.a.f();
                rem remVar = (rem) c0gVar2.a.t2.get();
                q5z.h(remVar);
                oem oemVar = (oem) c0gVar2.a.s2.get();
                q5z.h(oemVar);
                vf41 j3 = c0gVar.j3();
                pcm pcmVar = (pcm) zzfVar.to.get();
                q5z.h(pcmVar);
                h3y a = i5m.a(ywfVar);
                cv51 cv51Var = (cv51) c0gVar.cb.get();
                q5z.h(cv51Var);
                DriveHostView driveHostView = new DriveHostView(e2, idmVar, tseVar, w030Var, z2, rz8Var, bVar, f, remVar, oemVar, j3, pcmVar, a, cv51Var);
                driveHostView.setOnAppearingListener(new syb(2, driveHostView, (ovx) obj));
                return driveHostView;
            case 1:
                gdl0 gdl0Var = (gdl0) obj;
                ycl0 ycl0Var = (ycl0) obj2;
                yxf0 yxf0Var = new yxf0(this, gdl0Var, false);
                ycl0Var.getClass();
                Context context = ycl0Var.a;
                tse tseVar2 = ycl0Var.b;
                oo2 oo2Var = ycl0Var.c.a;
                return new RouteStopsModalView(context, tseVar2, new idl0((w4l0) obj5, (w810) ((xpj0) oo2Var.a).get(), (cwb) ((xvf0) oo2Var.b).get(), (aah) ((xvf0) oo2Var.c).get(), (wiq0) ((xvf0) oo2Var.w).get(), (zuj0) ((xvf0) oo2Var.x).get()), ycl0Var.d, yxf0Var, gdl0Var);
            case 2:
                Set set = ((fio0) obj).a;
                gio0 gio0Var = new gio0(this);
                cjm0 cjm0Var = ((eio0) obj5).a;
                return new ScootersPhotocontrolModalView((Context) ((xvf0) cjm0Var.b).get(), (xho0) ((zmm0) cjm0Var.c).get(), set, gio0Var);
            case 3:
                n7p0 n7p0Var = ((yqo0) obj).a;
                final String str = "ScootersQrAlert";
                fva0.f((fva0) obj4, "ScootersQrAlert", PerformanceAnalytics$Type.Inflate, 0L, 4);
                qgn0 qgn0Var = new qgn0(6, this);
                cjm0 cjm0Var2 = ((aro0) obj5).a;
                zqo0 zqo0Var = new zqo0((s6k0) ((mbo0) cjm0Var2.b).get(), (com.yandex.go.scooters.qr.unavailable_scooter.domain.a) ((z8n0) cjm0Var2.c).get(), n7p0Var, qgn0Var);
                gus gusVar = ((wqo0) obj2).a;
                final ScootersQrUnavailableScooterModalView scootersQrUnavailableScooterModalView = new ScootersQrUnavailableScooterModalView((Context) gusVar.a.get(), (ru.yandex.taxi.widget.utils.e) gusVar.b.get(), zqo0Var);
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ?? r1 = new View.OnAttachStateChangeListener() { // from class: com.yandex.go.scooters.qr.unavailable_scooter.ScootersQrUnavailableScooterRouter$provideModalView-lTekXHU$$inlined$wrapJankStats$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View v) {
                        View rootView = scootersQrUnavailableScooterModalView.getRootView();
                        Object tag = rootView.getTag(t9h0.metricsStateHolder);
                        if (tag == null) {
                            tag = new xva0();
                            rootView.setTag(t9h0.metricsStateHolder, tag);
                        }
                        yuf0 yuf0Var = ((xva0) tag).a;
                        if (yuf0Var != null) {
                            yuf0Var.I(str);
                        }
                        View view = scootersQrUnavailableScooterModalView;
                        T t = ref$ObjectRef.element;
                        view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View v) {
                    }
                };
                ref$ObjectRef.element = r1;
                scootersQrUnavailableScooterModalView.addOnAttachStateChangeListener(r1);
                return scootersQrUnavailableScooterModalView;
            default:
                TariffOptionsCardView c = ((h1g) obj4).a((gfv0) obj5).c();
                return new TariffOptionsCardModalView(new jhu0(this), c, new FrameLayout(c.getContext()), 6, (ejx0) ((rbx0) ((fix0) obj3).a.a).get());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vdm(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(null);
        this.F = i;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
        this.J = obj4;
    }
}
