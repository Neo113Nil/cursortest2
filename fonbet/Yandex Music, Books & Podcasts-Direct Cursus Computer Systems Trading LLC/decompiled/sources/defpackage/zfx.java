package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;

/* loaded from: classes.dex */
public final class zfx {
    public static final msg j = new msg("ApplicationAnalytics", null);
    public final sbx a;
    public final s0x b;
    public final zgx c;
    public final SharedPreferences f;
    public mgx g;
    public p84 h;
    public boolean i;
    public final fsn e = new fsn(Looper.getMainLooper(), 3);
    public final yyo d = new yyo(24, this);

    public zfx(SharedPreferences sharedPreferences, sbx sbxVar, s0x s0xVar, Bundle bundle, String str) {
        this.f = sharedPreferences;
        this.a = sbxVar;
        this.b = s0xVar;
        this.c = new zgx(bundle, str);
    }

    public static void a(zfx zfxVar, int i) {
        j.b("log session ended with error = %d", Integer.valueOf(i));
        zfxVar.c();
        zfxVar.a.a(zfxVar.c.a(zfxVar.g, i), 228);
        zfxVar.e.removeCallbacks(zfxVar.d);
        if (zfxVar.i) {
            return;
        }
        zfxVar.g = null;
    }

    public static void b(zfx zfxVar) {
        mgx mgxVar = zfxVar.g;
        SharedPreferences sharedPreferences = zfxVar.f;
        mgxVar.getClass();
        if (sharedPreferences == null) {
            return;
        }
        mgx.p.b("Save the ApplicationAnalyticsSession to SharedPreferences %s", sharedPreferences);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("application_id", mgxVar.b);
        edit.putString("receiver_metrics_id", mgxVar.c);
        edit.putLong("analytics_session_id", mgxVar.d);
        edit.putInt("event_sequence_number", mgxVar.e);
        edit.putString("receiver_session_id", mgxVar.f);
        edit.putInt("device_capabilities", mgxVar.g);
        edit.putString("device_model_name", mgxVar.h);
        edit.putString("manufacturer", mgxVar.i);
        edit.putString("product_name", mgxVar.j);
        edit.putString("build_type", mgxVar.k);
        edit.putString("cast_build_version", mgxVar.l);
        edit.putString("system_build_number", mgxVar.m);
        edit.putInt("analytics_session_start_type", mgxVar.o);
        edit.putBoolean("is_output_switcher_enabled", mgxVar.n);
        edit.apply();
    }

    public final void c() {
        if (!g()) {
            msg msgVar = j;
            Log.w(msgVar.a, msgVar.d("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]));
            d();
        } else {
            p84 p84Var = this.h;
            CastDevice d = p84Var != null ? p84Var.d() : null;
            if (d != null && !TextUtils.equals(this.g.c, d.l)) {
                f(d);
            }
            y1g.G(this.g);
        }
    }

    public final void d() {
        j.b("Create a new ApplicationAnalyticsSession based on CastSession", new Object[0]);
        mgx mgxVar = new mgx(this.b);
        mgx.q++;
        this.g = mgxVar;
        p84 p84Var = this.h;
        mgxVar.n = p84Var != null && p84Var.g.l;
        msg msgVar = o64.j;
        y1g.B("Must be called from the main thread.");
        o64 o64Var = o64.l;
        y1g.G(o64Var);
        y1g.B("Must be called from the main thread.");
        mgxVar.b = o64Var.d.a;
        p84 p84Var2 = this.h;
        CastDevice d = p84Var2 == null ? null : p84Var2.d();
        if (d != null) {
            f(d);
        }
        mgx mgxVar2 = this.g;
        y1g.G(mgxVar2);
        p84 p84Var3 = this.h;
        mgxVar2.o = p84Var3 != null ? p84Var3.b() : 0;
        y1g.G(this.g);
    }

    public final void e() {
        fsn fsnVar = this.e;
        y1g.G(fsnVar);
        yyo yyoVar = this.d;
        y1g.G(yyoVar);
        fsnVar.postDelayed(yyoVar, 300000L);
    }

    public final void f(CastDevice castDevice) {
        mgx mgxVar = this.g;
        if (mgxVar == null) {
            return;
        }
        mgxVar.c = castDevice.l;
        mgxVar.g = castDevice.i.b;
        mgxVar.h = castDevice.e;
        e0x f = castDevice.f();
        if (f != null) {
            String str = f.d;
            if (str != null) {
                mgxVar.i = str;
            }
            String str2 = f.e;
            if (str2 != null) {
                mgxVar.j = str2;
            }
            String str3 = f.f;
            if (str3 != null) {
                mgxVar.k = str3;
            }
            String str4 = f.g;
            if (str4 != null) {
                mgxVar.l = str4;
            }
            String str5 = f.h;
            if (str5 != null) {
                mgxVar.m = str5;
            }
        }
    }

    public final boolean g() {
        String str;
        msg msgVar = j;
        if (this.g == null) {
            msgVar.b("The analytics session is null when matching with application ID.", new Object[0]);
            return false;
        }
        msg msgVar2 = o64.j;
        y1g.B("Must be called from the main thread.");
        o64 o64Var = o64.l;
        y1g.G(o64Var);
        y1g.B("Must be called from the main thread.");
        String str2 = o64Var.d.a;
        if (str2 == null || (str = this.g.b) == null || !TextUtils.equals(str, str2)) {
            msgVar.b("The analytics session doesn't match the application ID %s", str2);
            return false;
        }
        y1g.G(this.g);
        return true;
    }

    public final boolean h(String str) {
        String str2;
        if (!g()) {
            return false;
        }
        y1g.G(this.g);
        if (str != null && (str2 = this.g.f) != null && TextUtils.equals(str2, str)) {
            return true;
        }
        j.b("The analytics session doesn't match the receiver session ID %s.", str);
        return false;
    }
}
