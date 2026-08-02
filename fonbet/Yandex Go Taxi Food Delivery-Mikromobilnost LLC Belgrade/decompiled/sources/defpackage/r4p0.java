package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.yandex.go.scooters.tariff_fix.selection.ScootersTariffFixSelectionModalView;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.runtime.image.ImageProvider;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.map.WalkingRouteUiState;
import ru.yandex.taxi.map.c;
import ru.yandex.taxi.map.d;

/* loaded from: classes13.dex */
public final class r4p0 implements t4p0 {
    public final /* synthetic */ ScootersTariffFixSelectionModalView a;

    public r4p0(ScootersTariffFixSelectionModalView scootersTariffFixSelectionModalView) {
        this.a = scootersTariffFixSelectionModalView;
    }

    @Override // defpackage.t4p0
    public final void Fb(Route route) {
        x4p0 x4p0Var;
        x4p0Var = this.a.scootersTariffFixSelectionRouteOverlay;
        zuj0 zuj0Var = x4p0Var.c;
        w4e0 w4e0Var = x4p0Var.B;
        if (w4e0Var != null) {
            w4e0Var.o(route.getGeometry());
            return;
        }
        xm00 xm00Var = x4p0Var.A;
        if (xm00Var == null) {
            xm00Var = ((gh00) ((ah00) x4p0Var.b)).i.p();
            x4p0Var.A = xm00Var;
        }
        w4e0 s = xm00Var.s(route.getGeometry());
        avj0 avj0Var = (avj0) zuj0Var;
        s.C(Integer.valueOf(avj0Var.a(mqg0.component_green_toxic)));
        s.p(avj0Var.b(qrg0.scooters_route_line_width));
        s.v(false);
        x4p0Var.B = s;
    }

    @Override // defpackage.t4p0
    public final void G() {
        d4p0 binding;
        d4p0 binding2;
        d4p0 binding3;
        ScootersTariffFixSelectionModalView scootersTariffFixSelectionModalView = this.a;
        binding = scootersTariffFixSelectionModalView.getBinding();
        binding.c.setTitle("");
        binding2 = scootersTariffFixSelectionModalView.getBinding();
        binding2.c.setSubtitle("");
        binding3 = scootersTariffFixSelectionModalView.getBinding();
        binding3.e.setVisibility(0);
    }

    @Override // defpackage.t4p0
    public final void K5() {
        d4p0 binding;
        binding = this.a.getBinding();
        ButtonComponent buttonComponent = binding.d;
        buttonComponent.setEnabled(true);
        k1b1.f(buttonComponent);
        buttonComponent.stopAnimation();
    }

    @Override // defpackage.t4p0
    public final void L0() {
        d4p0 binding;
        d4p0 binding2;
        ScootersTariffFixSelectionModalView scootersTariffFixSelectionModalView = this.a;
        binding = scootersTariffFixSelectionModalView.getBinding();
        binding.g.setVisibility(8);
        binding2 = scootersTariffFixSelectionModalView.getBinding();
        binding2.f.setVisibility(8);
    }

    @Override // defpackage.t4p0
    public final void U(String str) {
        d4p0 binding;
        d4p0 binding2;
        ScootersTariffFixSelectionModalView scootersTariffFixSelectionModalView = this.a;
        binding = scootersTariffFixSelectionModalView.getBinding();
        binding.c.setTitle(str);
        binding2 = scootersTariffFixSelectionModalView.getBinding();
        binding2.c.setSubtitle(kyh0.scooters_you_are_here);
    }

    @Override // defpackage.t4p0
    public final void Y6(String str) {
        d4p0 binding;
        d4p0 binding2;
        ScootersTariffFixSelectionModalView scootersTariffFixSelectionModalView = this.a;
        binding = scootersTariffFixSelectionModalView.getBinding();
        binding.c.setTitle(str);
        binding2 = scootersTariffFixSelectionModalView.getBinding();
        binding2.c.setSubtitle((CharSequence) null);
    }

    @Override // defpackage.t4p0
    public final void Ye(con0 con0Var) {
        d4p0 binding;
        String string;
        d4p0 binding2;
        ScootersTariffFixSelectionModalView scootersTariffFixSelectionModalView = this.a;
        binding = scootersTariffFixSelectionModalView.getBinding();
        ButtonComponent buttonComponent = binding.d;
        Context context = scootersTariffFixSelectionModalView.getContext();
        if (q4p0.a[con0Var.c.b.ordinal()] == 1) {
            string = scootersTariffFixSelectionModalView.getContext().getString(kyh0.scooters_start_riding);
        } else {
            string = scootersTariffFixSelectionModalView.getContext().getString(kyh0.scooters_book);
        }
        buttonComponent.setText(k1b1.a(context, string, con0Var.b, false));
        binding2 = scootersTariffFixSelectionModalView.getBinding();
        binding2.d.setDebounceClickListener(new epo0(3, scootersTariffFixSelectionModalView, con0Var));
    }

    @Override // defpackage.t4p0
    public final void Z() {
        d4p0 binding;
        binding = this.a.getBinding();
        binding.e.setVisibility(8);
    }

    @Override // defpackage.t4p0
    public final void h0() {
        x4p0 x4p0Var;
        x4p0Var = this.a.scootersTariffFixSelectionRouteOverlay;
        ah00 ah00Var = (ah00) x4p0Var.b;
        ((c) ((j741) x4p0Var.y.getValue())).a();
        ((c) ((j741) x4p0Var.z.getValue())).a();
        x4p0Var.B = null;
        xm00 xm00Var = x4p0Var.A;
        if (xm00Var != null) {
            ((gh00) ah00Var).i.o(xm00Var);
            x4p0Var.A = null;
        }
        ((gh00) ah00Var).u(x4p0Var.x);
    }

    @Override // defpackage.t4p0
    public final void j4(Route route) {
        x4p0 x4p0Var;
        x4p0Var = this.a.scootersTariffFixSelectionRouteOverlay;
        ((c) ((j741) x4p0Var.y.getValue())).d(d.a(route));
    }

    @Override // defpackage.t4p0
    public final void m2(int i) {
        d4p0 binding;
        binding = this.a.getBinding();
        ButtonComponent buttonComponent = binding.d;
        buttonComponent.setEnabled(false);
        buttonComponent.setText(i);
        k1b1.f(buttonComponent);
        buttonComponent.startAnimation();
    }

    @Override // defpackage.t4p0
    public final void p7() {
        x4p0 x4p0Var;
        x4p0Var = this.a.scootersTariffFixSelectionRouteOverlay;
        ((c) ((j741) x4p0Var.z.getValue())).a();
    }

    @Override // defpackage.t4p0
    public final void p8(int i, String str) {
        d4p0 binding;
        d4p0 binding2;
        d4p0 binding3;
        d4p0 binding4;
        ScootersTariffFixSelectionModalView scootersTariffFixSelectionModalView = this.a;
        binding = scootersTariffFixSelectionModalView.getBinding();
        binding.g.setVisibility(0);
        binding2 = scootersTariffFixSelectionModalView.getBinding();
        binding2.g.setTitle(scootersTariffFixSelectionModalView.getResources().getQuantityString(dwh0.scooters_time_route_to_parking, i, Integer.valueOf(i)));
        if (str != null) {
            binding4 = scootersTariffFixSelectionModalView.getBinding();
            binding4.g.setSubtitle(scootersTariffFixSelectionModalView.getResources().getString(kyh0.scooters_time_to_user_destination, str));
        } else {
            binding3 = scootersTariffFixSelectionModalView.getBinding();
            binding3.g.setSubtitle((CharSequence) null);
        }
    }

    @Override // defpackage.t4p0
    public final void r0() {
        d4p0 binding;
        d4p0 binding2;
        ScootersTariffFixSelectionModalView scootersTariffFixSelectionModalView = this.a;
        binding = scootersTariffFixSelectionModalView.getBinding();
        binding.c.setEnabled(true);
        binding2 = scootersTariffFixSelectionModalView.getBinding();
        ButtonComponent buttonComponent = binding2.d;
        buttonComponent.setEnabled(true);
        k1b1.f(buttonComponent);
        buttonComponent.stopAnimation();
    }

    @Override // defpackage.t4p0
    public final void r2(Route route) {
        x4p0 x4p0Var;
        Bitmap d0;
        x4p0Var = this.a.scootersTariffFixSelectionRouteOverlay;
        x4p0Var.getClass();
        WalkingRouteUiState a = d.a(route);
        Drawable t = vng.t(f1h0.route_start_point, ((avj0) x4p0Var.c).a);
        if (t != null && (d0 = ffx.d0(t, 0, 0, 7)) != null) {
            a = new WalkingRouteUiState(a.a, a.b, a.c, a.d, a.e, ImageProvider.fromBitmap(d0), a.g);
        }
        ((c) ((j741) x4p0Var.z.getValue())).d(a);
    }

    @Override // defpackage.t4p0
    public final void t5(Throwable th) {
        tls tlsVar;
        tlsVar = this.a.onErrorListener;
        tlsVar.invoke(th);
    }

    @Override // defpackage.t4p0
    public final void updateAzimuth(float f) {
        gzx gzxVar;
        gzxVar = this.a.layersUserLocationOverlay;
        gzxVar.updateAzimuth(f);
    }

    @Override // defpackage.t4p0
    public final void updateUserLocation(mo21 mo21Var) {
        gzx gzxVar;
        gzxVar = this.a.layersUserLocationOverlay;
        gzxVar.Ng(mo21Var.a, mo21Var.b, mo21Var.c);
    }

    @Override // defpackage.t4p0
    public final void z0() {
        d4p0 binding;
        d4p0 binding2;
        ScootersTariffFixSelectionModalView scootersTariffFixSelectionModalView = this.a;
        binding = scootersTariffFixSelectionModalView.getBinding();
        binding.c.setEnabled(false);
        binding2 = scootersTariffFixSelectionModalView.getBinding();
        ButtonComponent buttonComponent = binding2.d;
        buttonComponent.setEnabled(false);
        k1b1.f(buttonComponent);
        buttonComponent.startAnimation();
    }

    @Override // defpackage.t4p0
    public final void z9(String str) {
        d4p0 binding;
        d4p0 binding2;
        ScootersTariffFixSelectionModalView scootersTariffFixSelectionModalView = this.a;
        binding = scootersTariffFixSelectionModalView.getBinding();
        binding.c.setTitle(str);
        binding2 = scootersTariffFixSelectionModalView.getBinding();
        binding2.c.setSubtitle(kyh0.scooters_tariff_fix_parking_subtitle);
    }
}
