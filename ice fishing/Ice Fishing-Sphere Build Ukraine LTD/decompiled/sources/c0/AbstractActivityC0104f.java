package c0;

import L.C0026b;
import L.Q;
import a.AbstractC0069a;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.provider.Settings;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.view.textservice.TextServicesManager;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import d0.AbstractC0116f;
import d0.C0113c;
import d0.C0114d;
import d0.C0115e;
import d0.C0118h;
import d0.C0119i;
import d0.C0120j;
import e0.C0125a;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import l0.C0198a;
import l0.C0199b;
import l0.C0201d;
import l0.C0208k;
import l0.C0209l;
import q0.C0228a;
import s0.AbstractC0244a;

/* renamed from: c0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0104f extends Activity implements androidx.lifecycle.i {

    /* renamed from: i, reason: collision with root package name */
    public static final int f1689i = View.generateViewId();

    /* renamed from: e, reason: collision with root package name */
    public boolean f1690e = false;

    /* renamed from: f, reason: collision with root package name */
    public C0107i f1691f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.j f1692g;

    /* renamed from: h, reason: collision with root package name */
    public final OnBackInvokedCallback f1693h;

    public AbstractActivityC0104f() {
        int i2 = Build.VERSION.SDK_INT;
        this.f1693h = i2 < 33 ? null : i2 >= 34 ? new C0103e(this) : new OnBackInvokedCallback() { // from class: c0.d
            public final void onBackInvoked() {
                AbstractActivityC0104f.this.onBackPressed();
            }
        };
        this.f1692g = new androidx.lifecycle.j(this);
    }

    @Override // androidx.lifecycle.i
    public final androidx.lifecycle.j a() {
        return this.f1692g;
    }

    public final String b() {
        String dataString;
        if ((getApplicationInfo().flags & 2) == 0 || !"android.intent.action.RUN".equals(getIntent().getAction()) || (dataString = getIntent().getDataString()) == null) {
            return null;
        }
        return dataString;
    }

    public final int c() {
        if (!getIntent().hasExtra("background_mode")) {
            return 1;
        }
        String stringExtra = getIntent().getStringExtra("background_mode");
        if (stringExtra == null) {
            throw new NullPointerException("Name is null");
        }
        if (stringExtra.equals("opaque")) {
            return 1;
        }
        if (stringExtra.equals("transparent")) {
            return 2;
        }
        throw new IllegalArgumentException("No enum constant io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.".concat(stringExtra));
    }

    public final String d() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    public final String e() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle g2 = g();
            String string = g2 != null ? g2.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    public final String f() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle g2 = g();
            if (g2 != null) {
                return g2.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final Bundle g() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public final void h(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedDispatcher onBackInvokedDispatcher2;
        if (z2 && !this.f1690e) {
            if (Build.VERSION.SDK_INT >= 33) {
                onBackInvokedDispatcher2 = getOnBackInvokedDispatcher();
                onBackInvokedDispatcher2.registerOnBackInvokedCallback(0, this.f1693h);
                this.f1690e = true;
                return;
            }
            return;
        }
        if (z2 || !this.f1690e || Build.VERSION.SDK_INT < 33) {
            return;
        }
        onBackInvokedDispatcher = getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f1693h);
        this.f1690e = false;
    }

    public final boolean i() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (d() != null || this.f1691f.f1704g) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    public final boolean j() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : d() == null;
    }

    public final boolean k(String str) {
        C0107i c0107i = this.f1691f;
        if (c0107i == null) {
            Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        }
        if (c0107i.f1707j) {
            return true;
        }
        Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after detach.");
        return false;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (k("onActivityResult")) {
            C0107i c0107i = this.f1691f;
            c0107i.c();
            if (c0107i.f1699b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Objects.toString(intent);
            J.b bVar = c0107i.f1699b.f1787d;
            if (!bVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
                return;
            }
            AbstractC0244a.b("FlutterEngineConnectionRegistry#onActivityResult");
            try {
                ((C0114d) bVar.f425h).d(i2, i3, intent);
                Trace.endSection();
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (k("onBackPressed")) {
            C0107i c0107i = this.f1691f;
            c0107i.c();
            C0113c c0113c = c0107i.f1699b;
            if (c0113c != null) {
                c0113c.f1792i.f2694a.D("popRoute", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(32:138|139|(1:141)|142|143|(1:145)|146|(1:148)(1:276)|149|(2:151|(1:153)(2:154|(1:156)(1:157)))|158|(4:160|161|162|(1:164)(2:262|(1:264)(2:265|266)))(1:275)|165|(1:167)|168|(1:170)|(1:172)(1:261)|173|(3:175|(1:177)(1:255)|178)(3:256|(1:258)(1:260)|259)|179|(8:181|(1:183)|184|(2:186|(3:188|(1:190)|191)(2:192|193))|194|(1:196)|197|198)|199|(1:201)|202|203|204|205|(2:(1:251)(1:209)|210)(1:252)|211|(2:212|(1:214)(1:215))|216|(2:217|(2:219|(1:221)(3:222|223|224))(3:225|226|(2:228|(2:229|(2:231|(1:233)(3:234|235|236))(3:237|238|(2:240|(2:242|(1:244))(2:245|246))(2:247|248))))(2:249|250)))) */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x04e7, code lost:
    
        android.util.Log.e("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        byte[] bArr;
        int i2;
        try {
            Bundle g2 = g();
            if (g2 != null && (i2 = g2.getInt("io.flutter.embedding.android.NormalTheme", -1)) != -1) {
                setTheme(i2);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
        super.onCreate(bundle);
        if (bundle != null) {
            h(bundle.getBoolean("enableOnBackInvokedCallbackState"));
        }
        C0107i c0107i = new C0107i(this);
        this.f1691f = c0107i;
        c0107i.c();
        if (c0107i.f1699b == null) {
            String d2 = c0107i.f1698a.d();
            if (d2 != null) {
                if (C0120j.f1840c == null) {
                    C0120j.f1840c = new C0120j(1);
                }
                C0113c c0113c = (C0113c) C0120j.f1840c.f1841a.get(d2);
                c0107i.f1699b = c0113c;
                c0107i.f1704g = true;
                if (c0113c == null) {
                    throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + d2 + "'");
                }
            } else {
                c0107i.f1698a.getClass();
                c0107i.f1699b = null;
                String stringExtra = c0107i.f1698a.getIntent().getStringExtra("cached_engine_group_id");
                if (stringExtra != null) {
                    if (C0120j.f1839b == null) {
                        synchronized (C0120j.class) {
                            try {
                                if (C0120j.f1839b == null) {
                                    C0120j.f1839b = new C0120j(0);
                                }
                            } finally {
                            }
                        }
                    }
                    C0119i c0119i = (C0119i) C0120j.f1839b.f1841a.get(stringExtra);
                    if (c0119i == null) {
                        throw new IllegalStateException("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '" + stringExtra + "'");
                    }
                    AbstractActivityC0104f abstractActivityC0104f = c0107i.f1698a;
                    abstractActivityC0104f.getClass();
                    C0118h c0118h = new C0118h(abstractActivityC0104f);
                    c0107i.a(c0118h);
                    c0107i.f1699b = c0119i.a(c0118h);
                    c0107i.f1704g = false;
                } else {
                    AbstractActivityC0104f abstractActivityC0104f2 = c0107i.f1698a;
                    abstractActivityC0104f2.getClass();
                    Intent intent = abstractActivityC0104f2.getIntent();
                    if (intent.getExtras() != null) {
                        for (String str : intent.getExtras().keySet()) {
                            C0115e a2 = AbstractC0116f.a(str);
                            if (a2 == null) {
                                a2 = AbstractC0116f.a("--".concat(str));
                            }
                            if (a2 == null) {
                                a2 = AbstractC0116f.a("--" + str + "=");
                            }
                            if (a2 != null) {
                                break;
                            }
                        }
                    }
                    AbstractActivityC0104f abstractActivityC0104f3 = c0107i.f1698a;
                    abstractActivityC0104f3.getClass();
                    Intent intent2 = c0107i.f1698a.getIntent();
                    ArrayList arrayList = new ArrayList();
                    if (intent2.getBooleanExtra("trace-startup", false)) {
                        arrayList.add("--trace-startup");
                    }
                    if (intent2.getBooleanExtra("start-paused", false)) {
                        arrayList.add("--start-paused");
                    }
                    int intExtra = intent2.getIntExtra("vm-service-port", 0);
                    if (intExtra > 0) {
                        arrayList.add("--vm-service-port=" + intExtra);
                    }
                    if (intent2.getBooleanExtra("disable-service-auth-codes", false)) {
                        arrayList.add("--disable-service-auth-codes");
                    }
                    if (intent2.getBooleanExtra("endless-trace-buffer", false)) {
                        arrayList.add("--endless-trace-buffer");
                    }
                    if (intent2.getBooleanExtra("use-test-fonts", false)) {
                        arrayList.add("--use-test-fonts");
                    }
                    if (intent2.getBooleanExtra("enable-dart-profiling", false)) {
                        arrayList.add("--enable-dart-profiling");
                    }
                    if (intent2.getBooleanExtra("profile-startup", false)) {
                        arrayList.add("--profile-startup");
                    }
                    if (intent2.getBooleanExtra("enable-software-rendering", false)) {
                        arrayList.add("--enable-software-rendering");
                    }
                    if (intent2.getBooleanExtra("skia-deterministic-rendering", false)) {
                        arrayList.add("--skia-deterministic-rendering");
                    }
                    if (intent2.getBooleanExtra("trace-skia", false)) {
                        arrayList.add("--trace-skia");
                    }
                    String stringExtra2 = intent2.getStringExtra("trace-skia-allowlist");
                    if (stringExtra2 != null) {
                        arrayList.add("--trace-skia-allowlist=".concat(stringExtra2));
                    }
                    if (intent2.getBooleanExtra("trace-systrace", false)) {
                        arrayList.add("--trace-systrace");
                    }
                    if (intent2.hasExtra("trace-to-file")) {
                        arrayList.add("--trace-to-file=" + intent2.getStringExtra("trace-to-file"));
                    }
                    if (intent2.hasExtra("profile-microtasks")) {
                        arrayList.add("--profile-microtasks");
                    }
                    if (intent2.hasExtra("enable-impeller")) {
                        if (intent2.getBooleanExtra("enable-impeller", false)) {
                            arrayList.add("--enable-impeller=true");
                        } else {
                            arrayList.add("--enable-impeller=false");
                        }
                    }
                    if (intent2.getBooleanExtra("enable-vulkan-validation", false)) {
                        arrayList.add("--enable-vulkan-validation");
                    }
                    if (intent2.hasExtra("enable-hcpp-and-surface-control")) {
                        if (intent2.getBooleanExtra("enable-hcpp-and-surface-control", false)) {
                            arrayList.add("--enable-hcpp-and-surface-control=true");
                        } else {
                            arrayList.add("--enable-hcpp-and-surface-control=false");
                        }
                    }
                    if (intent2.getBooleanExtra("dump-skp-on-shader-compilation", false)) {
                        arrayList.add("--dump-skp-on-shader-compilation");
                    }
                    if (intent2.getBooleanExtra("cache-sksl", false)) {
                        arrayList.add("--cache-sksl");
                    }
                    if (intent2.getBooleanExtra("purge-persistent-cache", false)) {
                        arrayList.add("--purge-persistent-cache");
                    }
                    if (intent2.getBooleanExtra("verbose-logging", false)) {
                        arrayList.add("--verbose-logging");
                    }
                    if (intent2.hasExtra("dart-flags")) {
                        arrayList.add("--dart-flags=" + intent2.getStringExtra("dart-flags"));
                    }
                    HashSet hashSet = new HashSet(arrayList);
                    C0119i c0119i2 = new C0119i(abstractActivityC0104f3, (String[]) hashSet.toArray(new String[hashSet.size()]));
                    AbstractActivityC0104f abstractActivityC0104f4 = c0107i.f1698a;
                    abstractActivityC0104f4.getClass();
                    C0118h c0118h2 = new C0118h(abstractActivityC0104f4);
                    c0118h2.f1836e = false;
                    c0118h2.f1837f = c0107i.f1698a.j();
                    c0107i.a(c0118h2);
                    c0107i.f1699b = c0119i2.a(c0118h2);
                    c0107i.f1704g = false;
                }
            }
        }
        c0107i.f1698a.getClass();
        J.b bVar = c0107i.f1699b.f1787d;
        androidx.lifecycle.j jVar = c0107i.f1698a.f1692g;
        bVar.getClass();
        AbstractC0244a.b("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            C0107i c0107i2 = (C0107i) bVar.f424g;
            if (c0107i2 != null) {
                c0107i2.b();
            }
            bVar.e();
            bVar.f424g = c0107i;
            AbstractActivityC0104f abstractActivityC0104f5 = c0107i.f1698a;
            abstractActivityC0104f5.getClass();
            bVar.b(abstractActivityC0104f5, jVar);
            Trace.endSection();
            AbstractActivityC0104f abstractActivityC0104f6 = c0107i.f1698a;
            abstractActivityC0104f6.getClass();
            AbstractActivityC0104f abstractActivityC0104f7 = c0107i.f1698a;
            C0113c c0113c2 = c0107i.f1699b;
            abstractActivityC0104f7.getClass();
            c0107i.f1701d = new io.flutter.plugin.platform.e(abstractActivityC0104f7, c0113c2.f1795l, abstractActivityC0104f7);
            AbstractActivityC0104f abstractActivityC0104f8 = c0107i.f1698a;
            C0113c c0113c3 = c0107i.f1699b;
            abstractActivityC0104f8.getClass();
            c0107i.f1702e = new C0228a(f1689i, abstractActivityC0104f6, c0113c3.f1797n);
            AbstractActivityC0104f abstractActivityC0104f9 = c0107i.f1698a;
            C0113c c0113c4 = c0107i.f1699b;
            if (!abstractActivityC0104f9.f1691f.f1704g) {
                AbstractC0069a.C(c0113c4);
            }
            c0107i.f1707j = true;
            C0107i c0107i3 = this.f1691f;
            c0107i3.c();
            if (bundle != null) {
                bundle.getBundle("plugins");
                bArr = bundle.getByteArray("framework");
            } else {
                bArr = null;
            }
            if (c0107i3.f1698a.j()) {
                C0209l c0209l = c0107i3.f1699b.f1794k;
                c0209l.f2742e = true;
                C0208k c0208k = c0209l.f2741d;
                if (c0208k != null) {
                    c0208k.c(C0209l.a(bArr));
                    c0209l.f2741d = null;
                    c0209l.f2739b = bArr;
                } else if (c0209l.f2743f) {
                    c0209l.f2740c.D("push", C0209l.a(bArr), new C0208k(0, c0209l, bArr));
                } else {
                    c0209l.f2739b = bArr;
                }
            }
            c0107i3.f1698a.getClass();
            J.b bVar2 = c0107i3.f1699b.f1787d;
            if (bVar2.f()) {
                AbstractC0244a.b("FlutterEngineConnectionRegistry#onRestoreInstanceState");
                try {
                    Iterator it = ((HashSet) ((C0114d) bVar2.f425h).f1812f).iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                    Trace.endSection();
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
            }
            this.f1692g.a(androidx.lifecycle.d.ON_CREATE);
            if (c() == 2) {
                getWindow().setBackgroundDrawable(new ColorDrawable(0));
            }
            C0107i c0107i4 = this.f1691f;
            boolean z2 = (c() == 1 ? (char) 1 : (char) 2) == 1;
            c0107i4.c();
            if (c0107i4.f1698a.c() == 1) {
                AbstractActivityC0104f abstractActivityC0104f10 = c0107i4.f1698a;
                abstractActivityC0104f10.getClass();
                l lVar = new l(abstractActivityC0104f10, c0107i4.f1698a.c() != 1);
                c0107i4.f1698a.getClass();
                AbstractActivityC0104f abstractActivityC0104f11 = c0107i4.f1698a;
                abstractActivityC0104f11.getClass();
                c0107i4.f1700c = new r(abstractActivityC0104f11, lVar);
            } else {
                AbstractActivityC0104f abstractActivityC0104f12 = c0107i4.f1698a;
                abstractActivityC0104f12.getClass();
                n nVar = new n(abstractActivityC0104f12);
                nVar.setOpaque(c0107i4.f1698a.c() == 1);
                c0107i4.f1698a.getClass();
                AbstractActivityC0104f abstractActivityC0104f13 = c0107i4.f1698a;
                abstractActivityC0104f13.getClass();
                c0107i4.f1700c = new r(abstractActivityC0104f13, nVar);
            }
            c0107i4.f1700c.f1745k.add(c0107i4.f1709l);
            c0107i4.f1698a.getClass();
            r rVar = c0107i4.f1700c;
            C0113c c0113c5 = c0107i4.f1699b;
            rVar.getClass();
            Objects.toString(c0113c5);
            if (rVar.c()) {
                if (c0113c5 != rVar.f1747m) {
                    rVar.a();
                }
                c0107i4.f1700c.setId(f1689i);
                if (z2) {
                    r rVar2 = c0107i4.f1700c;
                    if (c0107i4.f1698a.c() != 1) {
                        throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
                    }
                    if (c0107i4.f1703f != null) {
                        rVar2.getViewTreeObserver().removeOnPreDrawListener(c0107i4.f1703f);
                    }
                    c0107i4.f1703f = new ViewTreeObserverOnPreDrawListenerC0106h(c0107i4, rVar2);
                    rVar2.getViewTreeObserver().addOnPreDrawListener(c0107i4.f1703f);
                }
                setContentView(c0107i4.f1700c);
                Window window = getWindow();
                window.addFlags(Integer.MIN_VALUE);
                if (Build.VERSION.SDK_INT < 35) {
                    window.setStatusBarColor(1073741824);
                }
                window.getDecorView().setSystemUiVisibility(1280);
                return;
            }
            rVar.f1747m = c0113c5;
            io.flutter.embedding.engine.renderer.h hVar = c0113c5.f1785b;
            rVar.f1746l = hVar.f2383c;
            rVar.f1743i.a(hVar);
            C0105g c0105g = rVar.f1734B;
            hVar.a(c0105g);
            if (rVar.f1739e) {
                hVar.f2381a.addResizingFlutterUiListener(rVar.f1733A);
            }
            rVar.f1749o = new Q(rVar, rVar.f1747m.f1791h);
            C0113c c0113c6 = rVar.f1747m;
            rVar.f1750p = new io.flutter.plugin.editing.l(rVar, c0113c6.r, c0113c6.f1796m, c0113c6.f1801s, c0113c6.f1802t);
            TextServicesManager textServicesManager = (TextServicesManager) rVar.getContext().getSystemService("textservices");
            rVar.f1755v = textServicesManager;
            rVar.f1751q = new io.flutter.plugin.editing.h(textServicesManager, rVar.f1747m.f1799p);
            new Q(rVar, rVar.f1750p.f2433b, rVar.f1747m.f1796m);
            rVar.r = rVar.f1747m.f1788e;
            rVar.f1752s = new C0026b(rVar);
            rVar.f1753t = new C0100b(rVar.f1747m.f1785b, false);
            io.flutter.view.h hVar2 = new io.flutter.view.h(rVar, c0113c5.f1789f, (AccessibilityManager) rVar.getContext().getSystemService("accessibility"), rVar.getContext().getContentResolver(), c0113c5.f1803u);
            rVar.f1754u = hVar2;
            hVar2.r = rVar.f1758y;
            boolean isEnabled = hVar2.f2595c.isEnabled();
            boolean isTouchExplorationEnabled = rVar.f1754u.f2595c.isTouchExplorationEnabled();
            if (rVar.f1747m.f1785b.f2381a.getIsSoftwareRenderingEnabled()) {
                rVar.setWillNotDraw(false);
            } else {
                rVar.setWillNotDraw((isEnabled || isTouchExplorationEnabled) ? false : true);
            }
            C0113c c0113c7 = rVar.f1747m;
            c0113c7.f1801s.f2480l.f2448a = rVar.f1754u;
            new C0100b(c0113c7.f1785b, true);
            C0113c c0113c8 = rVar.f1747m;
            c0113c8.f1802t.f2465j.f2448a = rVar.f1754u;
            new C0100b(c0113c8.f1785b, true);
            rVar.f1750p.f2433b.restartInput(rVar);
            rVar.d();
            rVar.getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, rVar.f1759z);
            rVar.e();
            io.flutter.plugin.platform.k kVar = c0113c5.f1801s;
            kVar.f2475g = rVar;
            int i3 = 0;
            while (true) {
                SparseArray sparseArray = kVar.r;
                if (i3 >= sparseArray.size()) {
                    break;
                }
                kVar.f2475g.addView((io.flutter.plugin.platform.g) sparseArray.valueAt(i3));
                i3++;
            }
            int i4 = 0;
            while (true) {
                SparseArray sparseArray2 = kVar.f2484p;
                if (i4 >= sparseArray2.size()) {
                    SparseArray sparseArray3 = kVar.f2483o;
                    if (sparseArray3.size() > 0) {
                        sparseArray3.valueAt(0).getClass();
                        throw new ClassCastException();
                    }
                    io.flutter.plugin.platform.j jVar2 = c0113c5.f1802t;
                    jVar2.f2462g = rVar;
                    int i5 = 0;
                    while (true) {
                        SparseArray sparseArray4 = jVar2.f2467l;
                        if (i5 >= sparseArray4.size()) {
                            SparseArray sparseArray5 = jVar2.f2466k;
                            if (sparseArray5.size() > 0) {
                                sparseArray5.valueAt(0).getClass();
                                throw new ClassCastException();
                            }
                            Iterator it2 = rVar.f1748n.iterator();
                            if (it2.hasNext()) {
                                it2.next().getClass();
                                throw new ClassCastException();
                            }
                            if (rVar.f1746l) {
                                c0105g.a();
                            }
                        } else {
                            if (sparseArray4.valueAt(i5) != null) {
                                throw new ClassCastException();
                            }
                            jVar2.f2462g.addView(null);
                            i5++;
                        }
                    }
                } else {
                    if (sparseArray2.valueAt(i4) != null) {
                        throw new ClassCastException();
                    }
                    kVar.f2475g.addView(null);
                    i4++;
                }
            }
        } catch (Throwable th3) {
            try {
                Trace.endSection();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onDestroy();
        if (k("onDestroy")) {
            this.f1691f.e();
            this.f1691f.f();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f1693h);
            this.f1690e = false;
        }
        C0107i c0107i = this.f1691f;
        if (c0107i != null) {
            c0107i.f1698a = null;
            c0107i.f1699b = null;
            c0107i.f1700c = null;
            c0107i.f1701d = null;
            c0107i.f1702e = null;
            this.f1691f = null;
        }
        this.f1692g.a(androidx.lifecycle.d.ON_DESTROY);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (k("onNewIntent")) {
            C0107i c0107i = this.f1691f;
            c0107i.c();
            C0113c c0113c = c0107i.f1699b;
            if (c0113c == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            J.b bVar = c0113c.f1787d;
            if (bVar.f()) {
                AbstractC0244a.b("FlutterEngineConnectionRegistry#onNewIntent");
                try {
                    Iterator it = ((HashSet) ((C0114d) bVar.f425h).f1810d).iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                    Trace.endSection();
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
            }
            String d2 = c0107i.d(intent);
            if (d2 == null || d2.isEmpty()) {
                return;
            }
            C0198a c0198a = c0107i.f1699b.f1792i;
            c0198a.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("location", d2);
            c0198a.f2694a.D("pushRouteInformation", hashMap, null);
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (k("onPause")) {
            C0107i c0107i = this.f1691f;
            c0107i.c();
            c0107i.f1698a.getClass();
            C0113c c0113c = c0107i.f1699b;
            if (c0113c != null) {
                C0201d c0201d = c0113c.f1790g;
                c0201d.a(3, c0201d.f2700c);
            }
        }
        this.f1692g.a(androidx.lifecycle.d.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        if (k("onPostResume")) {
            C0107i c0107i = this.f1691f;
            c0107i.c();
            if (c0107i.f1699b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            io.flutter.plugin.platform.e eVar = c0107i.f1701d;
            if (eVar != null) {
                eVar.b();
            }
            Iterator it = c0107i.f1699b.f1801s.f2481m.values().iterator();
            if (it.hasNext()) {
                ((io.flutter.plugin.platform.q) it.next()).getClass();
                throw null;
            }
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (k("onRequestPermissionsResult")) {
            C0107i c0107i = this.f1691f;
            c0107i.c();
            if (c0107i.f1699b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Arrays.toString(strArr);
            Arrays.toString(iArr);
            J.b bVar = c0107i.f1699b.f1787d;
            if (!bVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
                return;
            }
            AbstractC0244a.b("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
            try {
                Iterator it = ((HashSet) ((C0114d) bVar.f425h).f1808b).iterator();
                if (!it.hasNext()) {
                    Trace.endSection();
                } else {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f1692g.a(androidx.lifecycle.d.ON_RESUME);
        if (k("onResume")) {
            C0107i c0107i = this.f1691f;
            c0107i.c();
            c0107i.f1699b.f1785b.d();
            c0107i.f1698a.getClass();
            C0113c c0113c = c0107i.f1699b;
            if (c0113c != null) {
                C0201d c0201d = c0113c.f1790g;
                c0201d.a(2, c0201d.f2700c);
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (k("onSaveInstanceState")) {
            C0107i c0107i = this.f1691f;
            c0107i.c();
            if (c0107i.f1698a.j()) {
                bundle.putByteArray("framework", c0107i.f1699b.f1794k.f2739b);
            }
            c0107i.f1698a.getClass();
            Bundle bundle2 = new Bundle();
            J.b bVar = c0107i.f1699b.f1787d;
            if (bVar.f()) {
                AbstractC0244a.b("FlutterEngineConnectionRegistry#onSaveInstanceState");
                try {
                    Iterator it = ((HashSet) ((C0114d) bVar.f425h).f1812f).iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                    Trace.endSection();
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            }
            bundle.putBundle("plugins", bundle2);
            if (c0107i.f1698a.d() == null || c0107i.f1698a.i()) {
                return;
            }
            bundle.putBoolean("enableOnBackInvokedCallbackState", c0107i.f1698a.f1690e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onStart() {
        String str;
        String b2;
        Bundle g2;
        super.onStart();
        this.f1692g.a(androidx.lifecycle.d.ON_START);
        if (k("onStart")) {
            C0107i c0107i = this.f1691f;
            c0107i.c();
            if (c0107i.f1698a.d() == null && !c0107i.f1699b.f1786c.f1852j) {
                String f2 = c0107i.f1698a.f();
                if (f2 == null) {
                    AbstractActivityC0104f abstractActivityC0104f = c0107i.f1698a;
                    abstractActivityC0104f.getClass();
                    f2 = c0107i.d(abstractActivityC0104f.getIntent());
                    if (f2 == null) {
                        f2 = "/";
                    }
                }
                AbstractActivityC0104f abstractActivityC0104f2 = c0107i.f1698a;
                abstractActivityC0104f2.getClass();
                try {
                    g2 = abstractActivityC0104f2.g();
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (g2 != null) {
                    str = g2.getString("io.flutter.EntrypointUri");
                    c0107i.f1698a.e();
                    c0107i.f1699b.f1792i.f2694a.D("setInitialRoute", f2, null);
                    b2 = c0107i.f1698a.b();
                    if (b2 != null || b2.isEmpty()) {
                        b2 = ((h0.d) C0026b.C().f525g).f2336e.f2324b;
                    }
                    c0107i.f1699b.f1786c.a(str != null ? new C0125a(b2, c0107i.f1698a.e()) : new C0125a(b2, str, c0107i.f1698a.e()), (List) c0107i.f1698a.getIntent().getSerializableExtra("dart_entrypoint_args"));
                }
                str = null;
                c0107i.f1698a.e();
                c0107i.f1699b.f1792i.f2694a.D("setInitialRoute", f2, null);
                b2 = c0107i.f1698a.b();
                if (b2 != null) {
                }
                b2 = ((h0.d) C0026b.C().f525g).f2336e.f2324b;
                c0107i.f1699b.f1786c.a(str != null ? new C0125a(b2, c0107i.f1698a.e()) : new C0125a(b2, str, c0107i.f1698a.e()), (List) c0107i.f1698a.getIntent().getSerializableExtra("dart_entrypoint_args"));
            }
            Integer num = c0107i.f1708k;
            if (num != null) {
                c0107i.f1700c.setVisibility(num.intValue());
            }
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (k("onStop")) {
            C0107i c0107i = this.f1691f;
            c0107i.c();
            c0107i.f1698a.getClass();
            C0113c c0113c = c0107i.f1699b;
            if (c0113c != null) {
                C0201d c0201d = c0113c.f1790g;
                c0201d.a(5, c0201d.f2700c);
            }
            c0107i.f1708k = Integer.valueOf(c0107i.f1700c.getVisibility());
            c0107i.f1700c.setVisibility(8);
            C0113c c0113c2 = c0107i.f1699b;
            if (c0113c2 != null) {
                c0113c2.f1785b.b(40);
            }
        }
        this.f1692g.a(androidx.lifecycle.d.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        if (k("onTrimMemory")) {
            C0107i c0107i = this.f1691f;
            c0107i.c();
            C0113c c0113c = c0107i.f1699b;
            if (c0113c != null) {
                if (c0107i.f1706i && i2 >= 10) {
                    FlutterJNI flutterJNI = c0113c.f1786c.f1847e;
                    if (flutterJNI.isAttached()) {
                        flutterJNI.notifyLowMemoryWarning();
                    }
                    C0199b c0199b = c0107i.f1699b.f1800q;
                    c0199b.getClass();
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("type", "memoryPressure");
                    c0199b.f2695a.i(hashMap, null);
                }
                c0107i.f1699b.f1785b.b(i2);
                io.flutter.plugin.platform.k kVar = c0107i.f1699b.f1801s;
                if (i2 < 40) {
                    kVar.getClass();
                    return;
                }
                Iterator it = kVar.f2481m.values().iterator();
                if (it.hasNext()) {
                    ((io.flutter.plugin.platform.q) it.next()).getClass();
                    throw null;
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        if (k("onUserLeaveHint")) {
            C0107i c0107i = this.f1691f;
            c0107i.c();
            C0113c c0113c = c0107i.f1699b;
            if (c0113c == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            J.b bVar = c0113c.f1787d;
            if (!bVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
                return;
            }
            AbstractC0244a.b("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                Iterator it = ((HashSet) ((C0114d) bVar.f425h).f1811e).iterator();
                if (!it.hasNext()) {
                    Trace.endSection();
                } else {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (k("onWindowFocusChanged")) {
            C0107i c0107i = this.f1691f;
            c0107i.c();
            c0107i.f1698a.getClass();
            C0113c c0113c = c0107i.f1699b;
            if (c0113c != null) {
                C0201d c0201d = c0113c.f1790g;
                if (z2) {
                    c0201d.a(c0201d.f2698a, true);
                } else {
                    c0201d.a(c0201d.f2698a, false);
                }
            }
        }
    }
}
