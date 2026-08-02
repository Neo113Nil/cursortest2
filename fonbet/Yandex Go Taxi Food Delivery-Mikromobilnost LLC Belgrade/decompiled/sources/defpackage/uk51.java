package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import ru.yandex.mt.antirobot.ServerException;
import ru.yandex.mt.antirobot.ServerUnavailableException;
import ru.yandex.mt.antirobot.VendorException;

/* loaded from: classes9.dex */
public final class uk51 {
    public final r8o a;
    public final fkh b;
    public final pm51 c;
    public final a731 d;
    public String e;
    public String f;

    public uk51(r8o r8oVar, fkh fkhVar, pm51 pm51Var, a731 a731Var) {
        this.a = r8oVar;
        this.b = fkhVar;
        this.c = pm51Var;
        this.d = a731Var;
    }

    public static void c() {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
    }

    public final synchronized mf1 a() {
        mf1 mf1Var;
        String str;
        wtq0 a = this.b.a();
        c();
        if (a != null) {
            if (a.b() + a.c() > ((Number) this.c.c.invoke()).longValue()) {
                c();
                return new mf1(a.d(), 0, 5);
            }
        }
        c();
        try {
            try {
                mf1Var = new mf1(b(), 0, 5);
            } catch (Exception e) {
                if (e instanceof ServerException ? true : e instanceof VendorException) {
                    this.a.a(e);
                }
                if (a == null || (str = a.d()) == null) {
                    str = "err_safetynet_access";
                }
                mf1Var = new mf1((byte) 0, 5, str);
            }
            return mf1Var;
        } catch (InterruptedException e2) {
            this.e = null;
            this.f = null;
            throw e2;
        }
    }

    public final String b() {
        NetworkInfo activeNetworkInfo;
        r8o r8oVar = this.a;
        if (r8oVar.b()) {
            vg10.o(r8oVar.c(), "Error policy is activated by error: ");
            return null;
        }
        c();
        pm51 pm51Var = this.c;
        ConnectivityManager connectivityManager = (ConnectivityManager) pm51Var.e.getSystemService(ConnectivityManager.class);
        if (!((connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) ? false : activeNetworkInfo.isConnectedOrConnecting())) {
            throw new ServerUnavailableException();
        }
        c();
        String str = this.e;
        if (str == null) {
            try {
                str = pm51Var.b();
                this.e = str;
            } catch (InterruptedException e) {
                throw e;
            } catch (ServerException e2) {
                throw e2;
            } catch (Throwable th) {
                throw new ServerException(th);
            }
        }
        c();
        String str2 = this.f;
        if (str2 == null) {
            try {
                str2 = ((itt) this.d).a(str);
                this.f = str2;
            } catch (InterruptedException e3) {
                throw e3;
            } catch (VendorException e4) {
                throw e4;
            } catch (Throwable th2) {
                throw new VendorException(th2);
            }
        }
        c();
        try {
            wtq0 c = pm51Var.c(str2);
            r8oVar.reset();
            this.e = null;
            this.f = null;
            this.b.a.edit().putString("antirobot_token", c.d()).putLong("antirobot_timestamp", c.c()).putLong("antirobot_expires", c.b()).apply();
            c();
            return c.d();
        } catch (InterruptedException e5) {
            throw e5;
        } catch (ServerException e6) {
            throw e6;
        } catch (Throwable th3) {
            throw new ServerException(th3);
        }
    }
}
