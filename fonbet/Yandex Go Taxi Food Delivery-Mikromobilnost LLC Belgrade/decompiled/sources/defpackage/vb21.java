package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import com.yandex.messaging.auth.AuthEnvironment;
import com.yandex.messaging.core.net.entities.GetExperimentsResponse;
import com.yandex.messaging.core.net.entities.PersonalUserData;
import com.yandex.messaging.domain.experiments.a;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes15.dex */
public final class vb21 extends yk3 implements kp90 {
    public final wl3 c;
    public final sk7 w;
    public final mp90 x;

    public vb21(xqi0 xqi0Var, sk7 sk7Var, wl3 wl3Var) {
        super(xqi0Var, sk7Var);
        this.c = wl3Var;
        this.w = sk7Var;
        w040 d = xqi0Var.d();
        cn3 cn3Var = (cn3) sk7Var.w;
        tje.e();
        this.x = new mp90(d, wl3Var, cn3Var, this);
    }

    @Override // defpackage.kp90
    public final void a(PersonalUserData personalUserData, String str, GetExperimentsResponse getExperimentsResponse) {
        String str2 = personalUserData.userId;
        boolean equals = Objects.equals((String) this.w.b, str2);
        xqi0 xqi0Var = this.b;
        cxq0 cxq0Var = xqi0Var.h;
        wl3 wl3Var = this.c;
        if (!equals) {
            xqi0Var.h(wl3Var, this);
            return;
        }
        long j = ((SharedPreferences) xqi0Var.c.get()).getLong("passport_user_uid", -1L);
        long j2 = wl3Var.b;
        AuthEnvironment authEnvironment = wl3Var.a;
        if (j != -1 && j2 != j) {
            HashMap hashMap = new HashMap();
            hashMap.put("oldUid", Long.valueOf(j));
            hashMap.put("newUid", Long.valueOf(j2));
            hashMap.put("authState", "UpgradeToPassportState");
            ((x22) ((z8g) cxq0Var.b).y.get()).reportEvent("Uid change is not allowed inside profile", hashMap);
            z83.j("Uid change is not allowed");
        }
        xqi0Var.c().putString("guid", str2).putInt("passport_user_env", authEnvironment.getInteger()).putLong("passport_user_uid", wl3Var.b).apply();
        tje.e();
        ((a) xqi0Var.l.get()).e(getExperimentsResponse);
        xqi0Var.a(this, new yfy(xqi0Var, new sk7(str2, wl3Var, cn3.g(str, authEnvironment)), wl3Var));
        tje.e();
        Handler c = ((z8g) cxq0Var.b).c();
        p8g p8gVar = (p8g) cxq0Var.c;
        p03.a(c, i5m.a(p8gVar.w), p8gVar.m()).v(personalUserData);
    }

    @Override // defpackage.yk3
    public final wl3 c() {
        return this.c;
    }

    @Override // defpackage.yk3, defpackage.x08
    public final void cancel() {
        this.x.cancel();
    }

    @Override // defpackage.yk3
    public final boolean d() {
        return true;
    }

    @Override // defpackage.yk3
    public final void e(wl3 wl3Var) {
        if (Objects.equals(this.c, wl3Var)) {
            return;
        }
        this.x.cancel();
        sk7 sk7Var = this.w;
        xqi0 xqi0Var = this.b;
        if (wl3Var == null) {
            xqi0Var.a(this, new yfy(xqi0Var, sk7Var));
        } else {
            xqi0Var.a(this, new vb21(xqi0Var, sk7Var, wl3Var));
        }
    }
}
