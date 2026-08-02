package defpackage;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.point_selection_settings.PointSelectionSettingsInteractor$PointType;
import com.yandex.go.point_selection_settings.d;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.design.sourcedestination.PinType;
import ru.yandex.taxi.preorder.source.domain.s;
import ru.yandex.taxi.routeselector.analytics.RouteSelectorOpenReason;
import ru.yandex.taxi.routeselector.view.RouteSelectorModalView;

/* loaded from: classes6.dex */
public final class wzb implements szb {
    public final AddressResolveRepository a;
    public final i130 b;
    public final mhf c;
    public final uet0 d;
    public final yit0 e;
    public final y9y0 f;
    public final n050 g;
    public final n3o h;
    public final yvf0 i;
    public final oep0 j;
    public final wiq0 k;
    public final avd0 l;
    public final tjt0 m;
    public final zuj0 n;
    public final i6r o;
    public final hyb p;
    public final y4k0 q;
    public rzb r;

    public wzb(AddressResolveRepository addressResolveRepository, i130 i130Var, mhf mhfVar, uet0 uet0Var, yit0 yit0Var, y9y0 y9y0Var, n050 n050Var, n3o n3oVar, yvf0 yvf0Var, oep0 oep0Var, wiq0 wiq0Var, avd0 avd0Var, tjt0 tjt0Var, zuj0 zuj0Var, i6r i6rVar, hyb hybVar, y4k0 y4k0Var) {
        this.a = addressResolveRepository;
        this.b = i130Var;
        this.c = mhfVar;
        this.d = uet0Var;
        this.e = yit0Var;
        this.f = y9y0Var;
        this.g = n050Var;
        this.h = n3oVar;
        this.i = yvf0Var;
        this.j = oep0Var;
        this.k = wiq0Var;
        this.l = avd0Var;
        this.m = tjt0Var;
        this.n = zuj0Var;
        this.o = i6rVar;
        this.p = hybVar;
        this.q = y4k0Var;
    }

    public final void a(rzb rzbVar, Screen screen) {
        String h;
        String str;
        String str2;
        Runnable runnable;
        this.r = rzbVar;
        mhf mhfVar = this.c;
        final int i = 0;
        final int i2 = 1;
        boolean z = mhfVar.b() == Screen.SUMMARY;
        SourcePicker sourcePicker = z ? SourcePicker.A_FROM_SUMMARY : SourcePicker.A_FROM_HOME;
        pex0 m = ((k) this.k).m();
        zud0 a = m != null ? ((d) this.l).a(m.b, PointSelectionSettingsInteractor$PointType.SOURCE) : null;
        if (a == null || (h = a.a) == null) {
            h = ((avj0) this.n).h(kyh0.new_point_selection_screen_starting_point_title_statement);
        }
        if (a == null || (str = a.b) == null) {
            str = null;
        }
        if (a == null || (str2 = a.c) == null) {
            str2 = null;
        }
        if (z) {
            runnable = new Runnable(this) { // from class: tzb
                public final /* synthetic */ wzb b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = i2;
                    wzb wzbVar = this.b;
                    switch (i3) {
                        case 0:
                            ((s) wzbVar.g).c();
                            break;
                        case 1:
                            wzbVar.e.c(bov0.e);
                            break;
                        default:
                            wzbVar.d.b(null, false);
                            break;
                    }
                }
            };
        } else {
            final int i3 = 2;
            runnable = new Runnable(this) { // from class: tzb
                public final /* synthetic */ wzb b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i32 = i3;
                    wzb wzbVar = this.b;
                    switch (i32) {
                        case 0:
                            ((s) wzbVar.g).c();
                            break;
                        case 1:
                            wzbVar.e.c(bov0.e);
                            break;
                        default:
                            wzbVar.d.b(null, false);
                            break;
                    }
                }
            };
        }
        v9l0 v9l0Var = new v9l0(new uzb(this, sourcePicker, runnable, screen));
        v9l0Var.g = h;
        v9l0Var.k = str;
        int i4 = kyh0.new_point_selection_screen_confirm_button_title;
        v9l0Var.e = null;
        v9l0Var.d = i4;
        v9l0Var.b = sourcePicker;
        v9l0Var.c = PinType.PICKER;
        v9l0Var.r = new vqb(6, this);
        v9l0Var.j = true;
        v9l0Var.o = RouteSelectorOpenReason.PIN;
        v9l0Var.h = true;
        v9l0Var.q = new Runnable(this) { // from class: tzb
            public final /* synthetic */ wzb b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i32 = i;
                wzb wzbVar = this.b;
                switch (i32) {
                    case 0:
                        ((s) wzbVar.g).c();
                        break;
                    case 1:
                        wzbVar.e.c(bov0.e);
                        break;
                    default:
                        wzbVar.d.b(null, false);
                        break;
                }
            }
        };
        if (str2 != null) {
            v9l0Var.d = 0;
            v9l0Var.e = str2;
        }
        x9l0 x9l0Var = new x9l0(v9l0Var);
        i6r i6rVar = this.o;
        i6rVar.getClass();
        hyb hybVar = this.p;
        hybVar.getClass();
        AddressResolveRepository addressResolveRepository = this.a;
        addressResolveRepository.getClass();
        RouteSelectorModalView a2 = new t3g(i6rVar, x9l0Var, hybVar, addressResolveRepository).a();
        mhfVar.c();
        a2.setOnAppearingListener(new vzb(0, this));
        this.b.a().s(a2, false);
    }
}
