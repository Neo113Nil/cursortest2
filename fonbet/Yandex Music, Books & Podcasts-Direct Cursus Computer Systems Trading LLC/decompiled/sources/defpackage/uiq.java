package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.SQLException;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class uiq implements jzc, ruq, fsr, bfi, gg, rzb, ic, gv3, kou, gxw, pun, OnCompleteListener, rmp {
    public final /* synthetic */ int a;
    public final Object b;

    public uiq(int i, byte b) {
        this.a = i;
        switch (i) {
            case 15:
                this.b = new AtomicLong(-1L);
                break;
            default:
                this.b = new fs(15, 0);
                break;
        }
    }

    public static thj u(hsu hsuVar, int i) {
        pkb pkbVar = pkb.Wave;
        String id = hsuVar.getId();
        id.getClass();
        return new thj(pkbVar, id, i + 1, i + 1, "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00bb, code lost:
    
        if (r1 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a0, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x009e, code lost:
    
        if (r1 != null) goto L47;
     */
    /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.jvm.functions.Function0, uif] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tob A(int i, yhr... yhrVarArr) {
        Throwable th;
        zp4 zp4Var;
        IllegalStateException illegalStateException;
        SQLException sQLException;
        yhr[] yhrVarArr2 = yhrVarArr;
        vqn vqnVar = new vqn();
        vqnVar.a = 1;
        xqn xqnVar = new xqn();
        ArrayList arrayList = new ArrayList();
        dg0 dg0Var = null;
        try {
            try {
                try {
                    dg0 dg0Var2 = (dg0) ((uif) this.b).invoke();
                    try {
                        zp4Var = new zp4(dg0Var2);
                        try {
                            try {
                                dg0Var2.a.beginTransaction();
                                int length = yhrVarArr2.length;
                                int i2 = 0;
                                while (i2 < length) {
                                    yhr yhrVar = yhrVarArr2[i2];
                                    xqnVar.a = yhrVar;
                                    pe9 pe9Var = new pe9(xqnVar, vqnVar, yhrVarArr2, i, this, arrayList);
                                    try {
                                        yhrVar.a(zp4Var);
                                    } catch (SQLException e) {
                                        pe9Var.invoke(e);
                                    } catch (IllegalStateException e2) {
                                        pe9Var.invoke(e2);
                                    }
                                    vqnVar.a++;
                                    i2++;
                                    yhrVarArr2 = yhrVarArr;
                                }
                                dg0Var2.a.setTransactionSuccessful();
                                try {
                                    dg0Var2.a.endTransaction();
                                } catch (IllegalStateException unused) {
                                }
                                zp4Var.close();
                                dg0Var2.close();
                            } catch (Throwable th2) {
                                th = th2;
                                dg0Var = dg0Var2;
                                if (dg0Var != null) {
                                    try {
                                        dg0Var.a.endTransaction();
                                    } catch (IllegalStateException unused2) {
                                    }
                                }
                                if (zp4Var != null) {
                                    zp4Var.close();
                                }
                                if (dg0Var == null) {
                                    throw th;
                                }
                                try {
                                    dg0Var.close();
                                    throw th;
                                } catch (IOException unused3) {
                                    throw th;
                                }
                            }
                        } catch (SQLException e3) {
                            sQLException = e3;
                            dg0Var = dg0Var2;
                            arrayList.add(new wm9("Error during statements execution.", sQLException));
                            if (dg0Var != null) {
                                try {
                                    dg0Var.a.endTransaction();
                                } catch (IllegalStateException unused4) {
                                }
                            }
                            if (zp4Var != null) {
                                zp4Var.close();
                            }
                        } catch (IllegalStateException e4) {
                            illegalStateException = e4;
                            dg0Var = dg0Var2;
                            arrayList.add(new wm9("Error during statements execution.", illegalStateException));
                            if (dg0Var != null) {
                                try {
                                    dg0Var.a.endTransaction();
                                } catch (IllegalStateException unused5) {
                                }
                            }
                            if (zp4Var != null) {
                                zp4Var.close();
                            }
                        }
                    } catch (SQLException e5) {
                        sQLException = e5;
                        zp4Var = null;
                    } catch (IllegalStateException e6) {
                        illegalStateException = e6;
                        zp4Var = null;
                    } catch (Throwable th3) {
                        th = th3;
                        zp4Var = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (SQLException e7) {
                sQLException = e7;
                zp4Var = null;
            } catch (IllegalStateException e8) {
                illegalStateException = e8;
                zp4Var = null;
            } catch (Throwable th5) {
                th = th5;
                zp4Var = null;
            }
        } catch (IOException unused6) {
        }
        return new tob(arrayList);
    }

    public rmb B() {
        return ((tmb) this.b).a(new jab(qkb.MyWave, 1, 1, 0), null);
    }

    public Long C() {
        Long valueOf = Long.valueOf(((AtomicLong) this.b).get());
        if (valueOf.longValue() != -1) {
            return valueOf;
        }
        return null;
    }

    public void D(ybs ybsVar, long j, boolean z, zdp zdpVar) {
        qbs qbsVar = (qbs) this.b;
        qbsVar.o(rds.b(qbs.a(qbsVar, ybsVar, j, z, false, zdpVar, false)) ? zrd.c : zrd.b);
    }

    @Override // defpackage.rmp
    public void F(nkp nkpVar, String str) {
        switch (this.a) {
            case 19:
                zfx.j.b("onSessionStarted with sessionId = %s", str);
                zfx zfxVar = (zfx) this.b;
                zfxVar.h = (p84) nkpVar;
                zfxVar.c();
                mgx mgxVar = zfxVar.g;
                mgxVar.f = str;
                zfxVar.a.a((ohx) zfxVar.c.b(mgxVar).b(), 222);
                zfx.b(zfxVar);
                zfxVar.e();
                break;
            default:
                l5x l5xVar = new l5x(new w2r(4));
                tao taoVar = (tao) this.b;
                tao.w(taoVar, l5xVar);
                mox moxVar = (mox) taoVar.d;
                y1g.G(moxVar);
                moxVar.a((p84) nkpVar);
                mox moxVar2 = (mox) taoVar.d;
                y1g.G(moxVar2);
                String str2 = moxVar2.k;
                if (str2 != null) {
                    if (!TextUtils.equals(str, str2)) {
                        moxVar2.b(4);
                        break;
                    }
                } else {
                    moxVar2.k = str;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.pun
    public void accept(Object obj, Object obj2) {
        jox joxVar = (jox) obj;
        y0x y0xVar = (y0x) joxVar.s();
        f4x f4xVar = ((h4x) this.b).k;
        Parcel M0 = y0xVar.M0();
        y4x.d(M0, f4xVar);
        y0xVar.P0(M0, 18);
        y0x y0xVar2 = (y0x) joxVar.s();
        y0xVar2.P0(y0xVar2.M0(), 17);
        ((i8s) obj2).b(null);
    }

    @Override // defpackage.bfi
    public boolean b(long j, zdp zdpVar) {
        axf axfVar;
        qbs qbsVar = (qbs) this.b;
        if (!qbsVar.i() || qbsVar.k().a.b.length() == 0 || (axfVar = qbsVar.d) == null || axfVar.d() == null) {
            return false;
        }
        yoc yocVar = qbsVar.l;
        if (yocVar != null) {
            yoc.b(yocVar);
        }
        qbsVar.o = j;
        qbsVar.t = -1;
        qbsVar.f(true);
        D(qbsVar.k(), qbsVar.o, true, zdpVar);
        return true;
    }

    @Override // defpackage.fsr
    public boolean c(Map map) {
        map.getClass();
        return false;
    }

    @Override // defpackage.rzb
    public jxt d(Map map) {
        return new w0u((yx3) this.b);
    }

    @Override // defpackage.rmp
    public void e(nkp nkpVar) {
        switch (this.a) {
            case 19:
                msg msgVar = zfx.j;
                msgVar.b("onSessionStarting", new Object[0]);
                zfx zfxVar = (zfx) this.b;
                zfxVar.h = (p84) nkpVar;
                if (zfxVar.g != null) {
                    Log.w(msgVar.a, msgVar.d("Start a session while there's already an active session. Create a new one.", new Object[0]));
                }
                zfxVar.d();
                zgx zgxVar = zfxVar.c;
                mgx mgxVar = zfxVar.g;
                nhx b = zgxVar.b(mgxVar);
                if (mgxVar.o == 1) {
                    hhx n = ihx.n(b.d());
                    n.c();
                    ihx.v((ihx) n.b, 17);
                    b.e((ihx) n.b());
                }
                zfxVar.a.a((ohx) b.b(), 221);
                break;
            default:
                p84 p84Var = (p84) nkpVar;
                w2r w2rVar = new w2r(2);
                tao taoVar = (tao) this.b;
                w2rVar.d = Boolean.valueOf(((s0x) taoVar.b).i == 2);
                tao.w(taoVar, new l5x(w2rVar));
                mox moxVar = (mox) taoVar.d;
                y1g.G(moxVar);
                moxVar.a(p84Var);
                p84Var.l = (knn) taoVar.e;
                break;
        }
    }

    @Override // defpackage.gxw
    public void f(Bundle bundle) {
        dww dwwVar = (dww) this.b;
        Lock lock = dwwVar.s;
        lock.lock();
        try {
            dwwVar.q = h66.e;
            dww.k(dwwVar);
        } finally {
            lock.unlock();
        }
    }

    @Override // defpackage.rmp
    public void g(nkp nkpVar, boolean z) {
        switch (this.a) {
            case 19:
                zfx.j.b("onSessionResumed with wasSuspended = %b", Boolean.valueOf(z));
                zfx zfxVar = (zfx) this.b;
                zfxVar.h = (p84) nkpVar;
                zfxVar.c();
                y1g.G(zfxVar.g);
                nhx b = zfxVar.c.b(zfxVar.g);
                hhx n = ihx.n(b.d());
                n.c();
                ihx.u((ihx) n.b, z);
                b.c();
                ohx.r((ohx) b.b, (ihx) n.b());
                zfxVar.a.a((ohx) b.b(), 227);
                zfx.b(zfxVar);
                zfxVar.e();
                break;
            default:
                l5x l5xVar = new l5x(new w2r(4));
                tao taoVar = (tao) this.b;
                tao.w(taoVar, l5xVar);
                mox moxVar = (mox) taoVar.d;
                y1g.G(moxVar);
                moxVar.a((p84) nkpVar);
                break;
        }
    }

    @Override // defpackage.rmp
    public void h(nkp nkpVar, int i) {
        switch (this.a) {
            case 19:
                zfx zfxVar = (zfx) this.b;
                zfxVar.h = (p84) nkpVar;
                zfx.a(zfxVar, i);
                break;
            default:
                w2r w2rVar = new w2r(8);
                w2rVar.c = Integer.valueOf(i);
                l5x l5xVar = new l5x(w2rVar);
                tao taoVar = (tao) this.b;
                tao.w(taoVar, l5xVar);
                taoVar.y();
                break;
        }
    }

    @Override // defpackage.rmp
    public void j(nkp nkpVar, int i) {
        switch (this.a) {
            case 19:
                zfx zfxVar = (zfx) this.b;
                zfxVar.h = (p84) nkpVar;
                zfx.a(zfxVar, i);
                break;
            default:
                w2r w2rVar = new w2r(5);
                w2rVar.c = Integer.valueOf(i);
                l5x l5xVar = new l5x(w2rVar);
                tao taoVar = (tao) this.b;
                tao.w(taoVar, l5xVar);
                taoVar.y();
                break;
        }
    }

    @Override // defpackage.bfi
    public boolean l(long j, zdp zdpVar) {
        axf axfVar;
        qbs qbsVar = (qbs) this.b;
        if (!qbsVar.i() || qbsVar.k().a.b.length() == 0 || (axfVar = qbsVar.d) == null || axfVar.d() == null) {
            return false;
        }
        D(qbsVar.k(), j, false, zdpVar);
        return true;
    }

    @Override // defpackage.kou
    public void m() {
        qld.J(new r9w((faw) this.b, 21));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0126  */
    @Override // defpackage.rmp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void n(nkp nkpVar, String str) {
        mgx mgxVar;
        switch (this.a) {
            case 19:
                msg msgVar = zfx.j;
                msgVar.b("onSessionResuming with sessionId = %s", str);
                zfx zfxVar = (zfx) this.b;
                zfxVar.h = (p84) nkpVar;
                SharedPreferences sharedPreferences = zfxVar.f;
                boolean h = zfxVar.h(str);
                s0x s0xVar = zfxVar.b;
                boolean z = false;
                if (h) {
                    msgVar.b("Use the existing ApplicationAnalyticsSession if it is available and valid.", new Object[0]);
                    y1g.G(zfxVar.g);
                } else {
                    if (sharedPreferences == null) {
                        msg msgVar2 = mgx.p;
                    } else {
                        mgxVar = new mgx(s0xVar);
                        mgxVar.n = sharedPreferences.getBoolean("is_output_switcher_enabled", false);
                        if (sharedPreferences.contains("application_id")) {
                            mgxVar.b = sharedPreferences.getString("application_id", "");
                            if (sharedPreferences.contains("receiver_metrics_id")) {
                                mgxVar.c = sharedPreferences.getString("receiver_metrics_id", "");
                                if (sharedPreferences.contains("analytics_session_id")) {
                                    mgxVar.d = sharedPreferences.getLong("analytics_session_id", 0L);
                                    if (sharedPreferences.contains("event_sequence_number")) {
                                        mgxVar.e = sharedPreferences.getInt("event_sequence_number", 0);
                                        if (sharedPreferences.contains("receiver_session_id")) {
                                            mgxVar.f = sharedPreferences.getString("receiver_session_id", "");
                                            mgxVar.g = sharedPreferences.getInt("device_capabilities", 0);
                                            mgxVar.h = sharedPreferences.getString("device_model_name", "");
                                            mgxVar.i = sharedPreferences.getString("manufacturer", "");
                                            mgxVar.j = sharedPreferences.getString("product_name", "");
                                            mgxVar.k = sharedPreferences.getString("build_type", "");
                                            mgxVar.l = sharedPreferences.getString("cast_build_version", "");
                                            mgxVar.m = sharedPreferences.getString("system_build_number", "");
                                            mgxVar.o = sharedPreferences.getInt("analytics_session_start_type", 0);
                                            zfxVar.g = mgxVar;
                                            if (zfxVar.h(str)) {
                                                msgVar.b("The restored ApplicationAnalyticsSession is not valid, create a new one.", new Object[0]);
                                                mgx mgxVar2 = new mgx(s0xVar);
                                                mgx.q++;
                                                zfxVar.g = mgxVar2;
                                                p84 p84Var = zfxVar.h;
                                                if (p84Var != null && p84Var.g.l) {
                                                    z = true;
                                                }
                                                mgxVar2.n = z;
                                                msg msgVar3 = o64.j;
                                                y1g.B("Must be called from the main thread.");
                                                o64 o64Var = o64.l;
                                                y1g.G(o64Var);
                                                y1g.B("Must be called from the main thread.");
                                                mgxVar2.b = o64Var.d.a;
                                                mgx mgxVar3 = zfxVar.g;
                                                y1g.G(mgxVar3);
                                                mgxVar3.f = str;
                                            } else {
                                                msgVar.b("Use the restored ApplicationAnalyticsSession if it is valid.", new Object[0]);
                                                y1g.G(zfxVar.g);
                                                mgx.q = zfxVar.g.d + 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    mgxVar = null;
                    zfxVar.g = mgxVar;
                    if (zfxVar.h(str)) {
                    }
                }
                y1g.G(zfxVar.g);
                nhx b = zfxVar.c.b(zfxVar.g);
                hhx n = ihx.n(b.d());
                n.c();
                ihx.v((ihx) n.b, 10);
                b.e((ihx) n.b());
                hhx n2 = ihx.n(b.d());
                n2.c();
                ihx.u((ihx) n2.b, true);
                b.c();
                ohx.r((ohx) b.b, (ihx) n2.b());
                zfxVar.a.a((ohx) b.b(), 226);
                break;
            default:
                l5x l5xVar = new l5x(new w2r(7));
                tao taoVar = (tao) this.b;
                tao.w(taoVar, l5xVar);
                mox moxVar = (mox) taoVar.d;
                y1g.G(moxVar);
                moxVar.a((p84) nkpVar);
                mox moxVar2 = (mox) taoVar.d;
                y1g.G(moxVar2);
                String str2 = moxVar2.k;
                if (str2 != null) {
                    if (!TextUtils.equals(str, str2)) {
                        moxVar2.b(4);
                        break;
                    }
                } else {
                    moxVar2.k = str;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ruq
    public xdr o() {
        return (xdr) this.b;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((CountDownLatch) this.b).countDown();
    }

    @Override // defpackage.gxw
    public void p(h66 h66Var) {
        dww dwwVar = (dww) this.b;
        Lock lock = dwwVar.s;
        lock.lock();
        try {
            dwwVar.q = h66Var;
            dww.k(dwwVar);
        } finally {
            lock.unlock();
        }
    }

    @Override // defpackage.fsr
    public void q(String str) {
        str.getClass();
    }

    @Override // defpackage.ic
    public boolean r(View view) {
        bjt bjtVar = (bjt) this.b;
        int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
        ViewPager2 viewPager2 = (ViewPager2) bjtVar.d;
        if (viewPager2.r) {
            viewPager2.f(currentItem, true);
        }
        return true;
    }

    @Override // defpackage.jzc
    public void s(Exception exc, Object obj) {
        ((viq) this.b).k(exc, obj);
    }

    @Override // defpackage.fsr
    public pjc t() {
        return (fs) this.b;
    }

    @Override // defpackage.rmp
    public void v(nkp nkpVar, int i) {
        switch (this.a) {
            case 19:
                zfx zfxVar = (zfx) this.b;
                zfxVar.h = (p84) nkpVar;
                zfx.a(zfxVar, i);
                break;
            default:
                w2r w2rVar = new w2r(9);
                w2rVar.c = Integer.valueOf(i);
                tao taoVar = (tao) this.b;
                w2rVar.d = Boolean.valueOf(((s0x) taoVar.b).i == 2);
                tao.w(taoVar, new l5x(w2rVar));
                taoVar.y();
                break;
        }
    }

    @Override // defpackage.rmp
    public void w(nkp nkpVar, int i) {
        switch (this.a) {
            case 19:
                zfx.j.b("onSessionSuspended with reason = %d", Integer.valueOf(i));
                zfx zfxVar = (zfx) this.b;
                zfxVar.h = (p84) nkpVar;
                zfxVar.c();
                y1g.G(zfxVar.g);
                zfxVar.a.a(zfxVar.c.a(zfxVar.g, i), 225);
                zfx.b(zfxVar);
                zfxVar.e.removeCallbacks(zfxVar.d);
                break;
            default:
                w2r w2rVar = new w2r(6);
                w2rVar.c = Integer.valueOf(i);
                l5x l5xVar = new l5x(w2rVar);
                tao taoVar = (tao) this.b;
                tao.w(taoVar, l5xVar);
                mox moxVar = (mox) taoVar.d;
                y1g.G(moxVar);
                moxVar.a((p84) nkpVar);
                break;
        }
    }

    public void x() {
        synchronized (this) {
            if (((AtomicInteger) this.b).decrementAndGet() == 0) {
                SharedPreferences sharedPreferences = ((Context) sk3.I(Context.class)).getSharedPreferences("Yandex_Music", 0);
                sharedPreferences.edit().remove("upgrade_in_progress").apply();
                not.a(sharedPreferences);
            }
        }
    }

    @Override // defpackage.rmp
    public /* synthetic */ void y(nkp nkpVar) {
        switch (this.a) {
            case 19:
                ((zfx) this.b).h = (p84) nkpVar;
                break;
            default:
                break;
        }
    }

    @Override // defpackage.gxw
    public void z(int i) {
        dww dwwVar = (dww) this.b;
        Lock lock = dwwVar.s;
        lock.lock();
        try {
            if (dwwVar.r) {
                dwwVar.r = false;
                dww.j(dwwVar, i);
            } else {
                dwwVar.r = true;
                dwwVar.j.p0(i);
            }
            lock.unlock();
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // defpackage.bfi
    public void i() {
    }

    @Override // defpackage.ruq
    public void a(int i) {
    }

    public /* synthetic */ uiq(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public uiq(Function0 function0) {
        this.a = 2;
        this.b = (uif) function0;
    }

    public uiq(int i) {
        this.a = 6;
        AtomicInteger atomicInteger = new AtomicInteger();
        this.b = atomicInteger;
        atomicInteger.set(i);
    }

    public uiq(ArrayList arrayList) {
        this.a = 1;
        this.b = ydr.a(arrayList);
    }

    @Override // defpackage.ruq
    public void k(int i, Long l, mm6 mm6Var) {
    }
}
