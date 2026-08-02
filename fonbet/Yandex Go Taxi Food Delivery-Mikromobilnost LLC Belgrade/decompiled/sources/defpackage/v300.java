package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.metrics.performance.a;
import com.adjust.sdk.Constants;
import com.yandex.go.intentprocessor.k;
import com.yandex.go.payments.googlepay.domain.e;
import io.appmetrica.analytics.MviTouchEvent;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.activity.MainActivity;
import ru.yandex.taxi.activity.g;
import ru.yandex.taxi.analytics.m;
import ru.yandex.taxi.analytics.q;
import ru.yandex.taxi.deeplinks.f;
import ru.yandex.taxi.fragment.MapFragment;
import ru.yandex.taxi.fragment.common.b;
import ru.yandex.taxi.perf.AppStartupInfoType;
import ru.yandex.taxi.perf.Milestone;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.perf.c;
import ru.yandex.taxi.ui.MainUiAvailabilityMonitor;

/* loaded from: classes9.dex */
public final class v300 implements o300 {
    public c0g A;
    public lb7 B;
    public final q4x a;
    public final ms2 b;
    public final rrt0 c;
    public final fva0 w;
    public final MainUiAvailabilityMonitor x;
    public u300 y;
    public t300 z;

    public v300(q4x q4xVar, ms2 ms2Var, rrt0 rrt0Var, fva0 fva0Var, MainUiAvailabilityMonitor mainUiAvailabilityMonitor) {
        this.a = q4xVar;
        this.b = ms2Var;
        this.c = rrt0Var;
        this.w = fva0Var;
        this.x = mainUiAvailabilityMonitor;
    }

    @Override // defpackage.o300
    public final void a(MainActivity mainActivity) {
        y5e.d0 = new WeakReference(mainActivity);
        kst0.a(mainActivity);
    }

    @Override // defpackage.o300
    public final void b() {
        t300 t300Var = this.z;
        if (t300Var != null) {
            c cVar = (c) ((x300) t300Var.j).a;
            cVar.c.onStop(cVar.d);
        }
    }

    @Override // defpackage.o300
    public final void c() {
        this.x.a = false;
        l4x l4xVar = this.a.b;
        if (l4xVar != null && l4xVar.c) {
            o4x o4xVar = l4xVar.b;
            o4xVar.j.getDecorView().post(new a(false, o4xVar));
            l4xVar.c = false;
        }
        t300 t300Var = this.z;
        if (t300Var != null) {
            ((x300) t300Var.j).getClass();
        }
    }

    @Override // defpackage.zyq
    public final b createDefaultFileChooserHandler() {
        c0g c0gVar = this.A;
        if (c0gVar != null) {
            return (b) c0gVar.n8.get();
        }
        return null;
    }

    @Override // defpackage.q15
    public final zbs createFragmentComponent() {
        c0g c0gVar = this.A;
        a0g a0gVar = c0gVar != null ? new a0g(c0gVar.z, c0gVar.A) : null;
        if (a0gVar != null) {
            return a0gVar;
        }
        ny61.g("Required value was null.");
        return null;
    }

    @Override // defpackage.ui00
    public final ti00 createMapFragmentComponent(MapFragment mapFragment, xm00 xm00Var) {
        c0g c0gVar = this.A;
        e0g o = c0gVar != null ? new vbb(c0gVar.z, c0gVar.A).o(mapFragment, xm00Var) : null;
        if (o != null) {
            return o;
        }
        ny61.g("Required value was null.");
        return null;
    }

    @Override // defpackage.o300
    public final void d() {
        t300 t300Var = this.z;
        if (t300Var != null) {
            bvf0.j((tse) t300Var.b, null);
            c cVar = (c) ((x300) t300Var.j).a;
            cVar.c.onDestroy(cVar.d);
            mhf mhfVar = (mhf) t300Var.c;
            mhfVar.b.l(null);
            mhfVar.c();
        }
        this.z = null;
        this.A = null;
    }

    @Override // defpackage.o300
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        t300 t300Var = this.z;
        return t300Var != null && ((azz0) t300Var.g).a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r2 != 6) goto L26;
     */
    @Override // defpackage.o300
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        String str;
        String str2;
        t300 t300Var = this.z;
        if (t300Var == null) {
            return false;
        }
        m mVar = (m) t300Var.i;
        LinkedHashSet linkedHashSet = mVar.e;
        if (!mVar.f) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 5) {
                    }
                }
                mVar.f = true;
                if (mVar.a.b() == AppStartupInfoType.Cold) {
                    str = String.format(Locale.US, "%.3f", Arrays.copyOf(new Object[]{Float.valueOf((SystemClock.elapsedRealtime() - r2.e()) / 1000.0f)}, 1));
                    str2 = "cold";
                } else {
                    str = null;
                    str2 = "warm";
                }
                zz2 zz2Var = mVar.c;
                String m = mVar.b.m();
                String format = String.format(Locale.US, "%.3f", Arrays.copyOf(new Object[]{Float.valueOf((SystemClock.elapsedRealtime() - r2.d) / 1000.0f)}, 1));
                int i = ofp0.b;
                int i2 = ofp0.c;
                List J0 = kotlin.collections.a.J0(linkedHashSet);
                Integer valueOf = Integer.valueOf(i2);
                Integer valueOf2 = Integer.valueOf(i);
                HashMap hashMap = new HashMap();
                hashMap.put("launch_type", str2);
                hashMap.put("pointers", J0);
                hashMap.put(CommonUrlParts.SCREEN_HEIGHT, valueOf);
                if (m != null) {
                    hashMap.put("screen_name", m);
                }
                hashMap.put(CommonUrlParts.SCREEN_WIDTH, valueOf2);
                if (str != null) {
                    hashMap.put("time_since_app_launch", str);
                }
                hashMap.put("time_since_open", format);
                x4e.B(zz2Var.a, "Application.ScreenTapped", hashMap, 1);
            }
            linkedHashSet.add(b64.d(m810.b(motionEvent.getX(motionEvent.getActionIndex())), m810.b(motionEvent.getY(motionEvent.getActionIndex())), "{x:", ", y:", "}"));
        }
        kp50.c = true;
        int actionMasked2 = motionEvent.getActionMasked();
        return ((azz0) t300Var.g).a || actionMasked2 == 1 || actionMasked2 == 6 || actionMasked2 == 3;
    }

    @Override // defpackage.o300
    public final void e(MainActivity mainActivity) {
        this.c.a(mainActivity);
    }

    @Override // defpackage.o300
    public final void f(MainActivity mainActivity, long j, Bundle bundle) {
        Uri data;
        mainActivity.getWindow().setBackgroundDrawable(new ColorDrawable(mainActivity.getColor(xqg0.almost_white)));
        mkn.b(mainActivity);
        this.B = new lb7(mainActivity);
        ((os2) this.b).d(Milestone.MainActivity, j);
        PerformanceAnalytics$Type performanceAnalytics$Type = PerformanceAnalytics$Type.Loading;
        fva0 fva0Var = this.w;
        fva0Var.e("MainActivity.OnCreate", performanceAnalytics$Type, j);
        zzf zzfVar = (zzf) ((h6r) wwg.e(mainActivity, h6r.class));
        wf8 wf8Var = ((ray0) zzfVar.Ei.a).a;
        new com.yandex.go.styling.interactor.b(mainActivity, (fvy0) wf8Var.a.get(), (say0) wf8Var.b.get(), (whf) wf8Var.c.get(), i5m.a(wf8Var.d), i5m.a(wf8Var.e), i5m.a(wf8Var.f), i5m.a(wf8Var.g)).a();
        mainActivity.setContentView(oph0.main_activity);
        Window window = mainActivity.getWindow();
        q4x q4xVar = this.a;
        q4xVar.getClass();
        window.getDecorView();
        try {
            q4xVar.b = new l4x(window, new s59(q4xVar));
        } catch (Exception e) {
            xby.l(jst.e, "JANK_STATS:INIT_FAILED", null, e, "Failed to initialize jank stats", 2);
        }
        r0 r0Var = this.x.c;
        Boolean bool = Boolean.FALSE;
        r0Var.getClass();
        r0Var.m(null, bool);
        Window window2 = mainActivity.getWindow();
        window2.setFormat(1);
        window2.getDecorView().setSystemUiVisibility(HProv.ALG_TYPE_BLOCK);
        window2.setBackgroundDrawable(null);
        ViewGroup viewGroup = (ViewGroup) mainActivity.requireViewById(ahh0.content_frame);
        FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
        androidx.fragment.app.a h = g8e.h(supportFragmentManager, supportFragmentManager);
        h.h(fjh0.fragment_host, new Fragment(), null);
        h.d();
        supportFragmentManager.C();
        this.y = new u300(0, supportFragmentManager);
        int i = ahh0.drawerLayout;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        DrawerLayout drawerLayout = (DrawerLayout) ((View) rp31.d(viewGroup, i));
        drawerLayout.setFocusable(false);
        drawerLayout.setFocusableInTouchMode(false);
        drawerLayout.setDrawerLockMode(1);
        zzf zzfVar2 = zzfVar.b;
        is4 is4Var = new is4((ViewGroup) mainActivity.requireViewById(ahh0.banners_container));
        viewGroup.getClass();
        boolean z = false;
        c0g c0gVar = new c0g(zzfVar2, new tw9(), new wef0(), new jxn0(), new dgn(), new r220(), mainActivity, viewGroup, drawerLayout, is4Var);
        this.A = c0gVar;
        d0g d0gVar = c0gVar.a;
        c0g c0gVar2 = d0gVar.b;
        tse tseVar = (tse) c0gVar2.B.get();
        zzf zzfVar3 = c0gVar2.z;
        pho phoVar = (pho) zzfVar3.d0.get();
        zz2 zz2Var = new zz2(phoVar);
        f fVar = (f) zzfVar3.S.get();
        ru.yandex.taxi.perf.b bVar = (ru.yandex.taxi.perf.b) zzfVar3.n2.get();
        xw91 xw91Var = new xw91(zz2Var, fVar, bVar);
        mhf mhfVar = (mhf) c0gVar2.C.get();
        zzf zzfVar4 = d0gVar.a;
        h3y a = i5m.a(zzfVar4.R9);
        k kVar = (k) c0gVar2.In.get();
        azz0 azz0Var = (azz0) d0gVar.c.get();
        g gVar = (g) c0gVar2.F0.get();
        h3y a2 = i5m.a(zzfVar4.Z8);
        m mVar = new m((ru.yandex.taxi.perf.b) zzfVar4.n2.get(), (xzq0) zzfVar4.C8.get(), new zz2((pho) zzfVar4.d0.get()), (Lifecycle) c0gVar2.P.get(), (tse) c0gVar2.B.get());
        x300 x300Var = (x300) d0gVar.a2.get();
        this.z = new t300(tseVar, xw91Var, mhfVar, a, kVar, azz0Var, gVar, a2, mVar, x300Var, (w7j0) c0gVar2.J0.get());
        x300Var.b.c();
        ((c) x300Var.a).a(bundle, j);
        Intent intent = mainActivity.getIntent();
        Map d = bVar.d();
        Object obj = d.get("app_launch_type");
        String str = obj instanceof String ? (String) obj : null;
        if (q5z.H(intent) && (egb1.d(intent) || ((data = intent.getData()) != null && fVar.c(data)))) {
            z = true;
        }
        Boolean valueOf = Boolean.valueOf(z);
        Object obj2 = d.get("timeSinceAppLaunch");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = d.get("time_since_app_launch_sec");
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("app_launch_type", str);
        }
        hashMap.put(Constants.DEEPLINK, valueOf);
        if (str2 != null) {
            hashMap.put("time_since_app_launch", str2);
        }
        if (str3 != null) {
            hashMap.put("time_since_app_launch_sec", str3);
        }
        x4e.B(phoVar, "Application.Startup.Open", hashMap, 1);
        fva0.b(fva0Var, "MainActivity.OnCreate", PerformanceAnalytics$Type.Loading, null, 4);
    }

    @Override // defpackage.o300
    public final void g(MotionEvent motionEvent) {
        t300 t300Var = this.z;
        if (t300Var != null) {
            c cVar = (c) ((x300) t300Var.j).a;
            if (cVar.b.b() == AppStartupInfoType.Abandoned || motionEvent == null) {
                return;
            }
            cVar.c.onTouchEvent(cVar.d, MviTouchEvent.from(cVar.a, motionEvent));
        }
    }

    @Override // defpackage.xmr0
    public final ttd getSharedComposeContext() {
        lb7 lb7Var = this.B;
        if (lb7Var != null) {
            return (androidx.compose.runtime.c) lb7Var.c;
        }
        return null;
    }

    @Override // defpackage.o300
    public final void h(long j) {
        PerformanceAnalytics$Type performanceAnalytics$Type = PerformanceAnalytics$Type.Loading;
        fva0 fva0Var = this.w;
        fva0Var.e("MainActivity.OnStart", performanceAnalytics$Type, j);
        t300 t300Var = this.z;
        if (t300Var != null) {
            ((c) ((x300) t300Var.j).a).b(j);
        }
        fva0.b(fva0Var, "MainActivity.OnStart", performanceAnalytics$Type, null, 4);
    }

    @Override // defpackage.alj
    public final void handleNewIntent(Intent intent) {
        t300 t300Var = this.z;
        if (t300Var != null) {
            ((k) t300Var.f).b(intent);
        }
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [gvt] */
    @Override // defpackage.o300
    public final void i(MainActivity mainActivity, int i, final int i2, Intent intent) {
        int i3;
        t300 t300Var = this.z;
        if (t300Var != null) {
            e eVar = (e) ((fvt) ((h3y) t300Var.e).get());
            eVar.getClass();
            if (i != 8778) {
                i3 = i2;
            } else {
                qv10.C(new Object[]{Integer.valueOf(i2)}, 1, "Google Pay: onActivityResult with code=%s", jst.e);
                ((q) ((ac20) eVar.p.get())).h("GooglePay.WillAuth", g8e.z("identifier", eVar.u));
                tvt tvtVar = eVar.m;
                i3 = i2;
                s1n s1nVar = new s1n(i3, new iy2(17, eVar, intent), new b7(29, eVar), new r94(6, eVar, mainActivity, intent), (gvt) new Runnable() { // from class: gvt
                    @Override // java.lang.Runnable
                    public final void run() {
                        jst.e.x(new IllegalArgumentException(oyr.i(i2, "unknown resultCode: ")), "Google Pay card select result error");
                    }
                });
                tvtVar.getClass();
                int o = s1nVar.o();
                if (o == -1) {
                    ((iy2) s1nVar.m()).run();
                } else if (o == 0) {
                    ((b7) s1nVar.k()).run();
                } else if (o != 1) {
                    ((gvt) s1nVar.n()).run();
                } else {
                    ((r94) s1nVar.l()).run();
                }
            }
            g gVar = (g) t300Var.h;
            gVar.getClass();
            r40 r40Var = new r40(i3, i, intent);
            gVar.a.set(r40Var);
            gVar.b.g(r40Var);
        }
    }

    @Override // defpackage.o300
    public final Context j(Context context) {
        ko21 ko21Var = y5e.e0;
        if (ko21Var == null) {
            ko21Var = null;
        }
        return u5z.a(context, ko21Var.a().a);
    }

    @Override // defpackage.o300
    public final void k(long j) {
        PerformanceAnalytics$Type performanceAnalytics$Type = PerformanceAnalytics$Type.Loading;
        fva0 fva0Var = this.w;
        fva0Var.e("MainActivity.OnResume", performanceAnalytics$Type, j);
        this.x.a = true;
        l4x l4xVar = this.a.b;
        if (l4xVar != null && true != l4xVar.c) {
            o4x o4xVar = l4xVar.b;
            o4xVar.j.getDecorView().post(new a(true, o4xVar));
            l4xVar.c = true;
        }
        u300 u300Var = this.y;
        if (u300Var == null) {
            u300Var = null;
        }
        u300Var.updateLastClickOnItemTimestamp();
        t300 t300Var = this.z;
        if (t300Var != null) {
            ((x300) t300Var.j).getClass();
        }
        this.b.a(Milestone.MainActivity);
        fva0.b(fva0Var, "MainActivity.OnResume", performanceAnalytics$Type, null, 4);
    }

    @Override // defpackage.o300
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        t300 t300Var = this.z;
        if (t300Var != null) {
            ((n9) ((h3y) t300Var.d).get()).a();
            ((w7j0) t300Var.k).a.g(new o0b0(i, strArr, iArr));
        }
    }

    @Override // defpackage.fl40
    public final el40 sharedMultiClickHandler() {
        u300 u300Var = this.y;
        if (u300Var == null) {
            return null;
        }
        return u300Var;
    }
}
