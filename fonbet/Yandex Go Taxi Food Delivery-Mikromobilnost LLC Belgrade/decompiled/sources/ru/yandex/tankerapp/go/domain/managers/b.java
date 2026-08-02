package ru.yandex.tankerapp.go.domain.managers;

import com.yandex.go.cartech.dynamic.domain.g;
import defpackage.afo;
import defpackage.ba20;
import defpackage.ca20;
import defpackage.da20;
import defpackage.ea20;
import defpackage.esa0;
import defpackage.jqr;
import defpackage.pv00;
import defpackage.pzt0;
import defpackage.ssr;
import defpackage.tje;
import defpackage.tsr;
import defpackage.tt5;
import defpackage.use;
import defpackage.x920;
import kotlinx.coroutines.flow.e;

/* loaded from: classes5.dex */
public final class b implements tsr, ca20 {
    public afo A;
    public pzt0 B;
    public pzt0 C;
    public final g a;
    public final use b;
    public final pv00 c = pv00.a;
    public esa0 w;
    public esa0 x;
    public ea20 y;
    public afo z;

    public b(g gVar, use useVar) {
        this.a = gVar;
        this.b = useVar;
    }

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        tt5 tt5Var = ssrVar.c;
        ea20 ea20Var = new ea20(tt5Var, "tanker_location_manager");
        this.y = ea20Var;
        ea20Var.b(this);
        this.z = new afo(tt5Var, "tanker_location_manager/position_changes_event_channel");
        this.A = new afo(tt5Var, "tanker_location_manager/service_status_event_channel");
        this.w = new esa0();
        this.x = new esa0();
        afo afoVar = this.z;
        if (afoVar == null) {
            afoVar = null;
        }
        afoVar.a(this.w);
        afo afoVar2 = this.A;
        if (afoVar2 == null) {
            afoVar2 = null;
        }
        afoVar2.a(this.x);
        g gVar = this.a;
        jqr jqrVar = new jqr(gVar.c, new LocationManager$subscribeToLocationUpdates$1(this, null), 3);
        use useVar = this.b;
        this.B = e.H(useVar.a, jqrVar);
        this.C = e.H(useVar.a, new jqr(gVar.d, new LocationManager$subscribeToServiceStatus$1(this, null), 3));
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        pzt0 pzt0Var = this.B;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.C;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        ea20 ea20Var = this.y;
        if (ea20Var == null) {
            ea20Var = null;
        }
        ea20Var.b(null);
        afo afoVar = this.z;
        if (afoVar == null) {
            afoVar = null;
        }
        afoVar.a(null);
        afo afoVar2 = this.A;
        if (afoVar2 == null) {
            afoVar2 = null;
        }
        afoVar2.a(null);
        this.w = null;
        this.x = null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        String str = x920Var.a;
        if (str != null) {
            int hashCode = str.hashCode();
            g gVar = this.a;
            use useVar = this.b;
            switch (hashCode) {
                case -1675390183:
                    if (str.equals("tanker_location_manager/is_location_services_enabled")) {
                        ((ba20) da20Var).success(Boolean.valueOf(!gVar.a.c()));
                        break;
                    }
                    break;
                case -1635421119:
                    if (str.equals("tanker_location_manager/get_last_known_position")) {
                        tje.N(useVar.a, null, null, new LocationManager$getLastKnownPosition$1(da20Var, null, this), 3);
                        break;
                    }
                    break;
                case -890098262:
                    if (str.equals("tanker_location_manager/check_permission")) {
                        tje.N(useVar.a, null, null, new LocationManager$checkPermission$1(da20Var, null, this), 3);
                        break;
                    }
                    break;
                case -289496068:
                    if (str.equals("tanker_location_manager/open_location_settings")) {
                        gVar.getClass();
                        ((ba20) da20Var).success(null);
                        break;
                    }
                    break;
                case 347157699:
                    if (str.equals("tanker_location_manager/request_permission")) {
                        tje.N(useVar.a, null, null, new LocationManager$requestPermission$1(da20Var, null, this), 3);
                        break;
                    }
                    break;
            }
        }
    }
}
