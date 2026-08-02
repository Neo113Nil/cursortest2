package defpackage;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.core.app.u0;
import java.util.Map;

/* loaded from: classes6.dex */
public final class rfj extends hjq {
    public final jyr b;
    public final jyr c;
    public final jyr d;

    public rfj() {
        super(1);
        this.b = btf.b(new w8a("push_status_prefs", 2));
        bdt I = hag.I(Context.class);
        l18 l18Var = l18.b;
        this.c = l18Var.b(I, true);
        this.d = l18Var.b(hag.I(pfj.class), true);
        qfj qfjVar = new qfj(0, this);
        grc grcVar = frc.a;
        grcVar.getClass();
        grcVar.b.add(qfjVar);
    }

    public final void g() {
        boolean h = h();
        jyr jyrVar = this.b;
        if (((SharedPreferences) jyrVar.getValue()).getBoolean("push_status_last_state", true) != h) {
            SharedPreferences.Editor edit = ((SharedPreferences) jyrVar.getValue()).edit();
            edit.putBoolean("push_status_last_state", h);
            edit.apply();
            y60 e = e();
            arf g = tlm.g(bwf.c);
            ((Map) g.getValue()).put("changed_status", h ? "allowed" : "denied");
            tlm.o(e, "Settings_PushPermission_Changed", g.isInitialized() ? (Map) g.getValue() : null);
        }
    }

    public final boolean h() {
        NotificationChannel b;
        if (!((pfj) this.d.getValue()).a()) {
            return false;
        }
        u0 u0Var = new u0((Context) this.c.getValue());
        if (u0Var.b.areNotificationsEnabled()) {
            return Build.VERSION.SDK_INT < 26 || (b = u0Var.b("yandex_metrica_push_v2")) == null || b.getImportance() != 0;
        }
        return false;
    }
}
