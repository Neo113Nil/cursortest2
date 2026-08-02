package ru.yandex.taxi.startup.launch;

import defpackage.b03;
import defpackage.b64;
import defpackage.cne0;
import defpackage.dne0;
import defpackage.evu0;
import defpackage.ffx;
import defpackage.fn21;
import defpackage.ge51;
import defpackage.hna;
import defpackage.jl90;
import defpackage.jq21;
import defpackage.lux;
import defpackage.mdh;
import defpackage.owx;
import defpackage.pp21;
import defpackage.r8;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vaj;
import defpackage.vp21;
import defpackage.zy11;
import java.util.HashSet;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes10.dex */
public final class h extends r8 implements vp21, fn21, pp21, vaj, lux, ge51 {
    public final tt2 c;
    public final String w;
    public final n0 x;

    public h(dne0 dne0Var, b03 b03Var, tt2 tt2Var) {
        super(7, dne0Var.b());
        this.c = tt2Var;
        this.w = b64.j(b03Var.getApplicationId(), ".utils.PreferenceUtils.PAYMENT_STATUSES_FILTERS");
        this.x = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    }

    public final String Hg() {
        return ((cne0) this.b).l("client id", null);
    }

    public final String Ig() {
        return ((cne0) this.b).l("launch_phone", null);
    }

    public final String Jg() {
        return ((cne0) this.b).l("personal_phone_id", null);
    }

    public final boolean Kg() {
        String Hg = Hg();
        return !(Hg == null || evu0.J(Hg));
    }

    public final tpr Lg() {
        return kotlinx.coroutines.flow.e.t(new kotlinx.coroutines.flow.n(new e(kotlinx.coroutines.flow.e.g(new LaunchDataStorage$listenKeyState$$inlined$simpleCallbackApiToFlow$1(new hna((cne0) this.b, 1), null))), new LaunchDataStorage$isLaunchActualFlow$2(this, null)));
    }

    public final void Mg(owx owxVar) {
        cne0 cne0Var = (cne0) this.b;
        cne0Var.u("launch_actual", true);
        boolean z = owxVar.d;
        owx.h hVar = owxVar.p;
        cne0Var.u("can_generate_referrals", z);
        cne0Var.p(owxVar.r, "min_distance_me_order_point");
        cne0Var.u("show_sms_menu_settings", owxVar.u);
        cne0Var.t(this.w, new HashSet(owxVar.b));
        cne0Var.r("launch_phone", owxVar.l);
        this.x.g(zy11.a);
        cne0Var.r("phone_id", owxVar.h);
        cne0Var.r("personal_phone_id", owxVar.i);
        cne0Var.r(MetaDataField.DEVICE_ID_FIELD, owxVar.m);
        String str = owxVar.g;
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                cne0Var.d().putString("client id", str).commit();
            }
        }
        cne0Var.r("launch_current_version", hVar != null ? hVar.a : null);
        cne0Var.q(hVar != null ? hVar.b : 0L, "launch_notification_interval");
        cne0Var.r("client_notify_service", owxVar.D);
        cne0Var.r("xiva_service", owxVar.E);
        Ng(owxVar.y);
    }

    public final void Ng(jl90 jl90Var) {
        String str = jl90Var.a;
        cne0 cne0Var = (cne0) this.b;
        cne0Var.r("user_first_name", str);
        cne0Var.r("user_rating", jl90Var.b);
        cne0Var.r("user_status", jl90Var.d.b);
        cne0Var.b();
        jq21 jq21Var = jl90Var.c;
        cne0Var.r("user_photo_id", jq21Var != null ? jq21Var.a : null);
        cne0Var.b();
        cne0Var.r("user_photo_status", jq21Var != null ? jq21Var.c : null);
        cne0Var.b();
        cne0Var.r("user_photo_url", jq21Var != null ? jq21Var.b : null);
        cne0Var.b();
    }

    public final String Og() {
        String Ig = Ig();
        return Ig == null ? "" : Ig;
    }

    public final tpr Pg() {
        tpr d = com.yandex.go.coroutines.b.d(new g(this.x, this), new LaunchDataStorage$userPhoneFlow$$inlined$start$1(Og(), null));
        this.c.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(d, mdh.b);
    }
}
