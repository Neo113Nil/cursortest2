package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.auth.AuthEnvironment;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.messaging.profile.g;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class xqi0 {
    public final Handler b;
    public final h3y c;
    public final h3y d;
    public final String e;
    public final MessengerEnvironment f;
    public final g g;
    public final cxq0 h;
    public final v1r0 i;
    public final x22 j;
    public final h3y k;
    public final h3y l;
    public final wi60 m;
    public am2 n;
    public el21 o;
    public yk3 p;
    public boolean q;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final zq60 r = new zq60();

    public xqi0(h3y h3yVar, h3y h3yVar2, Handler handler, String str, y7g y7gVar, MessengerEnvironment messengerEnvironment, g gVar, v1r0 v1r0Var, x22 x22Var, h3y h3yVar3, h3y h3yVar4, wi60 wi60Var) {
        this.b = handler;
        this.c = h3yVar;
        this.d = h3yVar2;
        this.e = str;
        this.f = messengerEnvironment;
        this.g = gVar;
        this.h = new cxq0(y7gVar.a, y7gVar.b);
        this.i = v1r0Var;
        this.j = x22Var;
        this.k = h3yVar3;
        this.l = h3yVar4;
        this.m = wi60Var;
    }

    public final void a(yk3 yk3Var, yk3 yk3Var2) {
        yk3 yk3Var3;
        tje.e();
        yk3 yk3Var4 = this.p;
        z83.h(null, yk3Var4 == null || yk3Var4 == yk3Var);
        j(yk3Var2);
        if (!this.q || (yk3Var3 = this.p) == null) {
            return;
        }
        yk3Var3.b();
    }

    public final void b() {
        tje.e();
        yk3 yk3Var = this.p;
        if (yk3Var instanceof xff0) {
            return;
        }
        g((yk3Var == null || !yk3Var.d()) ? null : this.p.c());
    }

    public final SharedPreferences.Editor c() {
        return ((SharedPreferences) this.c.get()).edit().remove("guid").remove("passport_user_env").remove("passport_user_uid").remove("yambtoken");
    }

    public final w040 d() {
        cxq0 cxq0Var = this.h;
        z8g z8gVar = (z8g) cxq0Var.b;
        Looper looper = (Looper) z8gVar.d.get();
        p8g p8gVar = (p8g) cxq0Var.c;
        qp90 n = p8gVar.n();
        h3y a = i5m.a(p8gVar.l0);
        h3y a2 = i5m.a(p8gVar.q0);
        h3y a3 = i5m.a((xj) cxq0Var.x);
        Context context = ((z8g) cxq0Var.b).a.a;
        q5z.i(context);
        return p03.b(looper, n, a, a2, a3, new bbj(context), (rj21) p8gVar.a0.get(), (q6v) z8gVar.W.get());
    }

    public final void e() {
        boolean z;
        zq60 zq60Var = this.r;
        zq60Var.getClass();
        zq60Var.b++;
        ArrayList arrayList = zq60Var.a;
        int size = arrayList.size();
        int i = 0;
        boolean z2 = false;
        while (true) {
            int i2 = i;
            while (i2 < size && arrayList.get(i2) == null) {
                i2++;
            }
            if (i2 < size) {
                z = true;
            } else {
                if (!z2) {
                    zq60.a(zq60Var);
                    z2 = true;
                }
                z = false;
            }
            if (!z) {
                return;
            }
            while (i < size && arrayList.get(i) == null) {
                i++;
            }
            if (i >= size) {
                if (!z2) {
                    zq60.a(zq60Var);
                }
                ny61.p();
                return;
            } else {
                ((dn3) arrayList.get(i)).a();
                i++;
            }
        }
    }

    public final void f(wl3 wl3Var) {
        tje.e();
        this.a.removeCallbacksAndMessages(null);
        if (this.p instanceof xff0) {
            this.j.reportEvent("tech_account_changed_on_removed_profile");
            z83.j("Should not call onAccountChanged on removed profile");
            return;
        }
        if (wl3Var != null && !wl3Var.a().equals(this.f.a())) {
            g(wl3Var);
            return;
        }
        ((ymp) this.n.b).getClass();
        yk3 yk3Var = this.p;
        if (yk3Var == null) {
            yk3Var = i();
        }
        yk3Var.e(wl3Var);
        if (this.p == null) {
            j(yk3Var);
        }
        if (this.q) {
            this.p.b();
        }
    }

    public final void g(wl3 wl3Var) {
        tje.e();
        yk3 yk3Var = this.p;
        if (yk3Var != null) {
            yk3Var.cancel();
        }
        synchronized (this) {
            this.p = new xff0(this);
        }
        ((wff0) ((p8g) this.h.c).e.get()).b();
        g gVar = this.g;
        Objects.requireNonNull(gVar);
        gVar.a(wl3Var);
        this.h.w().e();
        e();
    }

    public final void h(wl3 wl3Var, yk3 yk3Var) {
        tje.e();
        yk3 yk3Var2 = this.p;
        z83.h(null, yk3Var2 == null || yk3Var2 == yk3Var);
        g(wl3Var);
    }

    public final yk3 i() {
        AuthEnvironment authEnvironment;
        SharedPreferences sharedPreferences = (SharedPreferences) this.c.get();
        if (!sharedPreferences.contains("passport_user_uid") && ((rcy0) this.k.get()).w) {
            SharedPreferences sharedPreferences2 = (SharedPreferences) this.d.get();
            long j = sharedPreferences2.getLong("CURRENT_UID", 0L);
            if (j != 0) {
                sharedPreferences2.edit().remove("CURRENT_UID").apply();
                sharedPreferences.edit().putLong("passport_user_uid", j).putInt("passport_user_env", AuthEnvironment.Production.getInteger()).apply();
            }
        }
        if (!sharedPreferences.contains("passport_user_uid")) {
            if (!sharedPreferences.contains("yambtoken")) {
                return new uf60(this, null);
            }
            z83.c(null, sharedPreferences.contains("passport_user_env"));
            z83.c(null, sharedPreferences.contains("passport_user_uid"));
            return new yfy(this, new sk7(sharedPreferences.getString("guid", ""), cn3.i(sharedPreferences.getString("yambtoken", ""))));
        }
        z83.c(null, sharedPreferences.contains("yambtoken"));
        qi3 qi3Var = AuthEnvironment.Companion;
        int i = sharedPreferences.getInt("passport_user_env", -1);
        qi3Var.getClass();
        AuthEnvironment[] values = AuthEnvironment.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                authEnvironment = null;
                break;
            }
            authEnvironment = values[i2];
            if (authEnvironment.getInteger() == i) {
                break;
            }
            i2++;
        }
        if (authEnvironment == null) {
            authEnvironment = AuthEnvironment.Production;
        }
        wl3 wl3Var = new wl3(authEnvironment, sharedPreferences.getLong("passport_user_uid", -1L));
        String string = sharedPreferences.getString("guid", null);
        return string == null ? new k370(this, wl3Var) : new yfy(this, new sk7(string, wl3Var, cn3.f()), wl3Var);
    }

    public final void j(yk3 yk3Var) {
        el21 el21Var;
        tje.e();
        x22 x22Var = (x22) ((z8g) this.h.b).y.get();
        synchronized (this) {
            el21Var = this.o;
            this.p = yk3Var;
        }
        sk7 sk7Var = yk3Var.a;
        if (sk7Var != null) {
            if (el21Var != null) {
                el21Var.e(sk7Var);
            }
            cxq0 cxq0Var = this.h;
            Handler c = ((z8g) cxq0Var.b).c();
            p8g p8gVar = (p8g) cxq0Var.c;
            p03.a(c, i5m.a(p8gVar.w), p8gVar.m()).j();
            x22Var.g("mssngr guid", "guid", sk7Var.d(), "uuid", this.e, "anonymous", Boolean.valueOf(sk7Var.e()), "notifications", this.m.a() ? BackendConfig.Restrictions.ENABLED : BackendConfig.Restrictions.DISABLED);
            x22Var.i("guid", sk7Var.d());
            if (sk7Var.e()) {
                x22Var.b(sk7Var.d());
                x22Var.i("puid", null);
            } else {
                wl3 c2 = sk7Var.c();
                x22Var.b(sk7Var.d());
                x22Var.i("puid", String.valueOf(c2.b()));
                x22Var.i("env", String.valueOf(c2.a().getInteger()));
            }
        } else {
            x22Var.i("puid", null);
        }
        x22Var.i("session_id", this.i.a);
        e();
    }
}
