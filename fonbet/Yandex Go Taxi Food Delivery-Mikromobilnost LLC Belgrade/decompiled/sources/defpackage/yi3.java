package defpackage;

import android.content.SharedPreferences;
import android.os.Looper;
import com.yandex.messaging.auth.AuthEnvironment;
import com.yandex.messaging.auth.passport.b;
import java.util.Objects;

/* loaded from: classes15.dex */
public final class yi3 implements pp90 {
    public final SharedPreferences A;
    public wl3 B;
    public cn3 C;
    public x08 D;
    public final zq60 a;
    public final sq60 b;
    public final Looper c;
    public final SharedPreferences w;
    public final h3y x;
    public final qti0 y;
    public final x22 z;

    public yi3(Looper looper, SharedPreferences sharedPreferences, h3y h3yVar, qti0 qti0Var, x22 x22Var, SharedPreferences sharedPreferences2) {
        AuthEnvironment authEnvironment;
        zq60 zq60Var = new zq60();
        this.a = zq60Var;
        this.b = new sq60(zq60Var);
        this.C = new xm3();
        z83.g(null, looper, Looper.myLooper());
        this.c = looper;
        this.w = sharedPreferences;
        this.x = h3yVar;
        this.y = qti0Var;
        this.z = x22Var;
        this.A = sharedPreferences2;
        if (sharedPreferences.contains("oauth_token")) {
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
                } else {
                    i2++;
                }
            }
            authEnvironment = authEnvironment == null ? AuthEnvironment.Production : authEnvironment;
            wl3 wl3Var = new wl3(authEnvironment, sharedPreferences.getLong("passport_user_uid", -1L));
            String string = sharedPreferences.getString("oauth_token", null);
            this.B = wl3Var;
            if (string != null) {
                this.C = cn3.g(string, authEnvironment);
            } else {
                this.C = new xm3();
            }
        }
    }

    @Override // defpackage.pp90
    public final void a(op90 op90Var, boolean z) {
        String str = op90Var.a;
        z83.g(null, this.c, Looper.myLooper());
        Objects.requireNonNull(this.B);
        x08 x08Var = this.D;
        if (x08Var != null) {
            x08Var.cancel();
            this.D = null;
        }
        bn3 g = cn3.g(str, this.B.a);
        this.C = g;
        this.w.edit().putString("oauth_token", str).apply();
        sq60 sq60Var = this.b;
        sq60Var.rewind();
        while (sq60Var.hasNext()) {
            ((zi3) sq60Var.next()).b(g, this.B, z);
        }
    }

    public final void b(bn3 bn3Var) {
        x08 ap90Var;
        z83.g(null, this.c, Looper.myLooper());
        if (this.B != null && this.C.equals(bn3Var)) {
            z83.f(this.D, null);
            z83.h(null, this.C.e());
            String k = this.C.b().k();
            this.C = new xm3();
            this.w.edit().remove("oauth_token").apply();
            sq60 sq60Var = this.b;
            sq60Var.rewind();
            while (sq60Var.hasNext()) {
                ((zi3) sq60Var.next()).b(this.C, this.B, false);
            }
            qp90 qp90Var = (qp90) this.x.get();
            wl3 wl3Var = this.B;
            b bVar = qp90Var.b;
            if (bVar == null) {
                qp90Var.b("refreshToken");
                ap90Var = wfz.z;
            } else {
                ap90Var = new ap90(bVar, this.y, qp90Var.c, new p370(18, k, wl3Var, this));
            }
            this.D = ap90Var;
        }
    }

    public final xi3 c(zi3 zi3Var) {
        z83.g(null, this.c, Looper.myLooper());
        this.a.b(zi3Var);
        int i = 0;
        if (this.C.e()) {
            zi3Var.b(this.C, this.B, false);
        }
        return new xi3(i, this, zi3Var);
    }
}
