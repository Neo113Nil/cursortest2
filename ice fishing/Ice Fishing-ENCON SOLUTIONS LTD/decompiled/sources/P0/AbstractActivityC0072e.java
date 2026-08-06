package P0;

import a.AbstractC0083a;
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
import com.watchfacestudio.spraktum.MainActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: P0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0072e extends Activity implements androidx.lifecycle.j {

    /* renamed from: e, reason: collision with root package name */
    public static final int f1408e = View.generateViewId();

    /* renamed from: a, reason: collision with root package name */
    public boolean f1409a = false;

    /* renamed from: b, reason: collision with root package name */
    public C0075h f1410b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.l f1411c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f1412d;

    public AbstractActivityC0072e() {
        int i2 = Build.VERSION.SDK_INT;
        this.f1412d = i2 < 33 ? null : i2 >= 34 ? new C0071d(this) : new OnBackInvokedCallback() { // from class: P0.c
            public final void onBackInvoked() {
                AbstractActivityC0072e.this.onBackPressed();
            }
        };
        this.f1411c = new androidx.lifecycle.l(this);
    }

    @Override // androidx.lifecycle.j
    public final androidx.lifecycle.l b() {
        return this.f1411c;
    }

    public final String c() {
        String dataString;
        if ((getApplicationInfo().flags & 2) == 0 || !"android.intent.action.RUN".equals(getIntent().getAction()) || (dataString = getIntent().getDataString()) == null) {
            return null;
        }
        return dataString;
    }

    public final int d() {
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

    public final String e() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    public final String f() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle h2 = h();
            String string = h2 != null ? h2.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    public final String g() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle h2 = h();
            if (h2 != null) {
                return h2.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final Bundle h() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public final void i(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedDispatcher onBackInvokedDispatcher2;
        if (z2 && !this.f1409a) {
            if (Build.VERSION.SDK_INT >= 33) {
                onBackInvokedDispatcher2 = getOnBackInvokedDispatcher();
                onBackInvokedDispatcher2.registerOnBackInvokedCallback(0, this.f1412d);
                this.f1409a = true;
                return;
            }
            return;
        }
        if (z2 || !this.f1409a || Build.VERSION.SDK_INT < 33) {
            return;
        }
        onBackInvokedDispatcher = getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f1412d);
        this.f1409a = false;
    }

    public final boolean j() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (e() != null || this.f1410b.f1423g) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    public final boolean k() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : e() == null;
    }

    public final boolean l(String str) {
        C0075h c0075h = this.f1410b;
        if (c0075h == null) {
            Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        }
        if (c0075h.f1426j) {
            return true;
        }
        Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after detach.");
        return false;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (l("onActivityResult")) {
            C0075h c0075h = this.f1410b;
            c0075h.c();
            if (c0075h.f1418b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Objects.toString(intent);
            N.a aVar = c0075h.f1418b.f7709d;
            if (!aVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
                return;
            }
            g1.a.b("FlutterEngineConnectionRegistry#onActivityResult");
            try {
                ((Q0.c) aVar.f1112h).d(i2, i3, intent);
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
        if (l("onBackPressed")) {
            C0075h c0075h = this.f1410b;
            c0075h.c();
            FlutterEngine flutterEngine = c0075h.f1418b;
            if (flutterEngine != null) {
                flutterEngine.f7714i.f1952a.G("popRoute", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(32:138|139|(1:141)|142|143|(1:145)|146|(1:148)(1:276)|149|(2:151|(1:153)(2:154|(1:156)(1:157)))|158|(4:160|161|162|(1:164)(2:262|(1:264)(2:265|266)))(1:275)|165|(1:167)|168|(1:170)|(1:172)(1:261)|173|(3:175|(1:177)(1:255)|178)(3:256|(1:258)(1:260)|259)|179|(8:181|(1:183)|184|(2:186|(3:188|(1:190)|191)(2:192|193))|194|(1:196)|197|198)|199|(1:201)|202|203|204|205|(2:(1:251)(1:209)|210)(1:252)|211|(2:212|(1:214)(1:215))|216|(2:217|(2:219|(1:221)(3:222|223|224))(3:225|226|(2:228|(2:229|(2:231|(1:233)(3:234|235|236))(3:237|238|(2:240|(2:242|(1:244))(2:245|246))(2:247|248))))(2:249|250)))) */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0505, code lost:
    
        android.util.Log.e("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r6v14, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        byte[] bArr;
        int i2;
        try {
            Bundle h2 = h();
            if (h2 != null && (i2 = h2.getInt("io.flutter.embedding.android.NormalTheme", -1)) != -1) {
                setTheme(i2);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
        super.onCreate(bundle);
        if (bundle != null) {
            i(bundle.getBoolean("enableOnBackInvokedCallbackState"));
        }
        C0075h c0075h = new C0075h(this);
        this.f1410b = c0075h;
        c0075h.c();
        if (c0075h.f1418b == null) {
            String e2 = c0075h.f1417a.e();
            if (e2 != null) {
                if (Q0.i.f1551c == null) {
                    Q0.i.f1551c = new Q0.i(1);
                }
                FlutterEngine flutterEngine = (FlutterEngine) Q0.i.f1551c.f1552a.get(e2);
                c0075h.f1418b = flutterEngine;
                c0075h.f1423g = true;
                if (flutterEngine == null) {
                    throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + e2 + "'");
                }
            } else {
                c0075h.f1417a.getClass();
                c0075h.f1418b = null;
                String stringExtra = c0075h.f1417a.getIntent().getStringExtra("cached_engine_group_id");
                if (stringExtra != null) {
                    if (Q0.i.f1550b == null) {
                        synchronized (Q0.i.class) {
                            try {
                                if (Q0.i.f1550b == null) {
                                    Q0.i.f1550b = new Q0.i(0);
                                }
                            } finally {
                            }
                        }
                    }
                    Q0.h hVar = (Q0.h) Q0.i.f1550b.f1552a.get(stringExtra);
                    if (hVar == null) {
                        throw new IllegalStateException("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '" + stringExtra + "'");
                    }
                    AbstractActivityC0072e abstractActivityC0072e = c0075h.f1417a;
                    abstractActivityC0072e.getClass();
                    Q0.g gVar = new Q0.g(abstractActivityC0072e);
                    c0075h.a(gVar);
                    c0075h.f1418b = hVar.a(gVar);
                    c0075h.f1423g = false;
                } else {
                    AbstractActivityC0072e abstractActivityC0072e2 = c0075h.f1417a;
                    abstractActivityC0072e2.getClass();
                    Intent intent = abstractActivityC0072e2.getIntent();
                    if (intent.getExtras() != null) {
                        for (String str : intent.getExtras().keySet()) {
                            Q0.d a2 = Q0.e.a(str);
                            if (a2 == null) {
                                a2 = Q0.e.a("--".concat(str));
                            }
                            if (a2 == null) {
                                a2 = Q0.e.a("--" + str + "=");
                            }
                            if (a2 != null) {
                                break;
                            }
                        }
                    }
                    AbstractActivityC0072e abstractActivityC0072e3 = c0075h.f1417a;
                    abstractActivityC0072e3.getClass();
                    Intent intent2 = c0075h.f1417a.getIntent();
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
                    Q0.h hVar2 = new Q0.h(abstractActivityC0072e3, (String[]) hashSet.toArray(new String[hashSet.size()]));
                    AbstractActivityC0072e abstractActivityC0072e4 = c0075h.f1417a;
                    abstractActivityC0072e4.getClass();
                    Q0.g gVar2 = new Q0.g(abstractActivityC0072e4);
                    gVar2.f1547e = false;
                    gVar2.f1548f = c0075h.f1417a.k();
                    c0075h.a(gVar2);
                    c0075h.f1418b = hVar2.a(gVar2);
                    c0075h.f1423g = false;
                }
            }
        }
        c0075h.f1417a.getClass();
        N.a aVar = c0075h.f1418b.f7709d;
        androidx.lifecycle.l lVar = c0075h.f1417a.f1411c;
        aVar.getClass();
        g1.a.b("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            C0075h c0075h2 = (C0075h) aVar.f1111g;
            if (c0075h2 != null) {
                c0075h2.b();
            }
            aVar.e();
            aVar.f1111g = c0075h;
            AbstractActivityC0072e abstractActivityC0072e5 = c0075h.f1417a;
            abstractActivityC0072e5.getClass();
            aVar.b(abstractActivityC0072e5, lVar);
            Trace.endSection();
            AbstractActivityC0072e abstractActivityC0072e6 = c0075h.f1417a;
            abstractActivityC0072e6.getClass();
            AbstractActivityC0072e abstractActivityC0072e7 = c0075h.f1417a;
            FlutterEngine flutterEngine2 = c0075h.f1418b;
            abstractActivityC0072e7.getClass();
            c0075h.f1420d = new io.flutter.plugin.platform.e(abstractActivityC0072e7, flutterEngine2.f7717l, abstractActivityC0072e7);
            AbstractActivityC0072e abstractActivityC0072e8 = c0075h.f1417a;
            FlutterEngine flutterEngine3 = c0075h.f1418b;
            abstractActivityC0072e8.getClass();
            c0075h.f1421e = new O1.h(f1408e, abstractActivityC0072e6, flutterEngine3.f7719n);
            AbstractActivityC0072e abstractActivityC0072e9 = c0075h.f1417a;
            FlutterEngine flutterEngine4 = c0075h.f1418b;
            MainActivity mainActivity = (MainActivity) abstractActivityC0072e9;
            mainActivity.getClass();
            kotlin.jvm.internal.i.e(flutterEngine4, "flutterEngine");
            if (!mainActivity.f1410b.f1423g) {
                AbstractC0083a.p(flutterEngine4);
            }
            new I0.b(flutterEngine4.f7708c.f1711e, mainActivity.f2708f).M(new E0.a(0, mainActivity));
            c0075h.f1426j = true;
            C0075h c0075h3 = this.f1410b;
            c0075h3.c();
            if (bundle != null) {
                bundle.getBundle("plugins");
                bArr = bundle.getByteArray("framework");
            } else {
                bArr = null;
            }
            if (c0075h3.f1417a.k()) {
                Z0.k kVar = c0075h3.f1418b.f7716k;
                kVar.f2000e = true;
                Z0.j jVar = kVar.f1999d;
                if (jVar != null) {
                    jVar.c(Z0.k.a(bArr));
                    kVar.f1999d = null;
                    kVar.f1997b = bArr;
                } else if (kVar.f2001f) {
                    kVar.f1998c.G("push", Z0.k.a(bArr), new Z0.j(0, kVar, bArr));
                } else {
                    kVar.f1997b = bArr;
                }
            }
            c0075h3.f1417a.getClass();
            N.a aVar2 = c0075h3.f1418b.f7709d;
            if (aVar2.f()) {
                g1.a.b("FlutterEngineConnectionRegistry#onRestoreInstanceState");
                try {
                    Iterator it = ((HashSet) ((Q0.c) aVar2.f1112h).f1523f).iterator();
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
            this.f1411c.d(androidx.lifecycle.d.ON_CREATE);
            if (d() == 2) {
                getWindow().setBackgroundDrawable(new ColorDrawable(0));
            }
            C0075h c0075h4 = this.f1410b;
            boolean z2 = (d() == 1 ? (char) 1 : (char) 2) == 1;
            c0075h4.c();
            if (c0075h4.f1417a.d() == 1) {
                AbstractActivityC0072e abstractActivityC0072e10 = c0075h4.f1417a;
                abstractActivityC0072e10.getClass();
                l lVar2 = new l(abstractActivityC0072e10, c0075h4.f1417a.d() != 1);
                c0075h4.f1417a.getClass();
                AbstractActivityC0072e abstractActivityC0072e11 = c0075h4.f1417a;
                abstractActivityC0072e11.getClass();
                c0075h4.f1419c = new t(abstractActivityC0072e11, lVar2);
            } else {
                AbstractActivityC0072e abstractActivityC0072e12 = c0075h4.f1417a;
                abstractActivityC0072e12.getClass();
                n nVar = new n(abstractActivityC0072e12);
                nVar.setOpaque(c0075h4.f1417a.d() == 1);
                c0075h4.f1417a.getClass();
                AbstractActivityC0072e abstractActivityC0072e13 = c0075h4.f1417a;
                abstractActivityC0072e13.getClass();
                c0075h4.f1419c = new t(abstractActivityC0072e13, nVar);
            }
            c0075h4.f1419c.f1462g.add(c0075h4.f1428l);
            c0075h4.f1417a.getClass();
            t tVar = c0075h4.f1419c;
            FlutterEngine flutterEngine5 = c0075h4.f1418b;
            tVar.getClass();
            Objects.toString(flutterEngine5);
            if (tVar.c()) {
                if (flutterEngine5 != tVar.f1464i) {
                    tVar.a();
                }
                c0075h4.f1419c.setId(f1408e);
                if (z2) {
                    t tVar2 = c0075h4.f1419c;
                    if (c0075h4.f1417a.d() != 1) {
                        throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
                    }
                    if (c0075h4.f1422f != null) {
                        tVar2.getViewTreeObserver().removeOnPreDrawListener(c0075h4.f1422f);
                    }
                    c0075h4.f1422f = new ViewTreeObserverOnPreDrawListenerC0074g(c0075h4, tVar2);
                    tVar2.getViewTreeObserver().addOnPreDrawListener(c0075h4.f1422f);
                }
                setContentView(c0075h4.f1419c);
                Window window = getWindow();
                window.addFlags(Integer.MIN_VALUE);
                if (Build.VERSION.SDK_INT < 35) {
                    window.setStatusBarColor(1073741824);
                }
                window.getDecorView().setSystemUiVisibility(1280);
                return;
            }
            tVar.f1464i = flutterEngine5;
            io.flutter.embedding.engine.renderer.h hVar3 = flutterEngine5.f7707b;
            tVar.f1463h = hVar3.f7769c;
            tVar.f1460e.a(hVar3);
            C0073f c0073f = tVar.f1478x;
            hVar3.a(c0073f);
            if (tVar.f1456a) {
                hVar3.f7767a.addResizingFlutterUiListener(tVar.f1477w);
            }
            tVar.f1466k = new x0.e(tVar, tVar.f1464i.f7713h);
            FlutterEngine flutterEngine6 = tVar.f1464i;
            tVar.f1467l = new io.flutter.plugin.editing.j(tVar, flutterEngine6.f7723r, flutterEngine6.f7718m, flutterEngine6.f7724s, flutterEngine6.t);
            TextServicesManager textServicesManager = (TextServicesManager) tVar.getContext().getSystemService("textservices");
            tVar.f1473r = textServicesManager;
            tVar.f1468m = new io.flutter.plugin.editing.g(textServicesManager, tVar.f1464i.f7721p);
            new x0.e(tVar, tVar.f1467l.f7816b, tVar.f1464i.f7718m);
            tVar.f1469n = tVar.f1464i.f7710e;
            tVar.f1470o = new I0.b(tVar);
            tVar.f1471p = new C0069b(tVar.f1464i.f7707b, false);
            io.flutter.view.h hVar4 = new io.flutter.view.h(tVar, flutterEngine5.f7711f, (AccessibilityManager) tVar.getContext().getSystemService("accessibility"), tVar.getContext().getContentResolver(), flutterEngine5.f7725u);
            tVar.f1472q = hVar4;
            hVar4.f7992r = tVar.f1475u;
            boolean isEnabled = hVar4.f7977c.isEnabled();
            boolean isTouchExplorationEnabled = tVar.f1472q.f7977c.isTouchExplorationEnabled();
            if (tVar.f1464i.f7707b.f7767a.getIsSoftwareRenderingEnabled()) {
                tVar.setWillNotDraw(false);
            } else {
                tVar.setWillNotDraw((isEnabled || isTouchExplorationEnabled) ? false : true);
            }
            FlutterEngine flutterEngine7 = tVar.f1464i;
            flutterEngine7.f7724s.f7864h.f7831a = tVar.f1472q;
            new C0069b(flutterEngine7.f7707b, true);
            FlutterEngine flutterEngine8 = tVar.f1464i;
            flutterEngine8.t.f7848f.f7831a = tVar.f1472q;
            new C0069b(flutterEngine8.f7707b, true);
            tVar.f1467l.f7816b.restartInput(tVar);
            tVar.d();
            tVar.getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, tVar.f1476v);
            tVar.e();
            io.flutter.plugin.platform.k kVar2 = flutterEngine5.f7724s;
            kVar2.f7859c = tVar;
            int i3 = 0;
            while (true) {
                SparseArray sparseArray = kVar2.f7870n;
                if (i3 >= sparseArray.size()) {
                    break;
                }
                kVar2.f7859c.addView((io.flutter.plugin.platform.g) sparseArray.valueAt(i3));
                i3++;
            }
            int i4 = 0;
            while (true) {
                SparseArray sparseArray2 = kVar2.f7868l;
                if (i4 >= sparseArray2.size()) {
                    SparseArray sparseArray3 = kVar2.f7867k;
                    if (sparseArray3.size() > 0) {
                        sparseArray3.valueAt(0).getClass();
                        throw new ClassCastException();
                    }
                    io.flutter.plugin.platform.j jVar2 = flutterEngine5.t;
                    jVar2.f7845c = tVar;
                    int i5 = 0;
                    while (true) {
                        SparseArray sparseArray4 = jVar2.f7850h;
                        if (i5 >= sparseArray4.size()) {
                            SparseArray sparseArray5 = jVar2.f7849g;
                            if (sparseArray5.size() > 0) {
                                sparseArray5.valueAt(0).getClass();
                                throw new ClassCastException();
                            }
                            Iterator it2 = tVar.f1465j.iterator();
                            if (it2.hasNext()) {
                                it2.next().getClass();
                                throw new ClassCastException();
                            }
                            if (tVar.f1463h) {
                                c0073f.b();
                            }
                        } else {
                            if (sparseArray4.valueAt(i5) != null) {
                                throw new ClassCastException();
                            }
                            jVar2.f7845c.addView(null);
                            i5++;
                        }
                    }
                } else {
                    if (sparseArray2.valueAt(i4) != null) {
                        throw new ClassCastException();
                    }
                    kVar2.f7859c.addView(null);
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
        if (l("onDestroy")) {
            this.f1410b.e();
            this.f1410b.f();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f1412d);
            this.f1409a = false;
        }
        C0075h c0075h = this.f1410b;
        if (c0075h != null) {
            c0075h.f1417a = null;
            c0075h.f1418b = null;
            c0075h.f1419c = null;
            c0075h.f1420d = null;
            c0075h.f1421e = null;
            this.f1410b = null;
        }
        this.f1411c.d(androidx.lifecycle.d.ON_DESTROY);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (l("onNewIntent")) {
            C0075h c0075h = this.f1410b;
            c0075h.c();
            FlutterEngine flutterEngine = c0075h.f1418b;
            if (flutterEngine == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            N.a aVar = flutterEngine.f7709d;
            if (aVar.f()) {
                g1.a.b("FlutterEngineConnectionRegistry#onNewIntent");
                try {
                    Iterator it = ((HashSet) ((Q0.c) aVar.f1112h).f1521d).iterator();
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
            String d2 = c0075h.d(intent);
            if (d2 == null || d2.isEmpty()) {
                return;
            }
            Z0.a aVar2 = c0075h.f1418b.f7714i;
            aVar2.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("location", d2);
            aVar2.f1952a.G("pushRouteInformation", hashMap, null);
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (l("onPause")) {
            C0075h c0075h = this.f1410b;
            c0075h.c();
            c0075h.f1417a.getClass();
            FlutterEngine flutterEngine = c0075h.f1418b;
            if (flutterEngine != null) {
                Z0.c cVar = flutterEngine.f7712g;
                cVar.a(3, cVar.f1956c);
            }
        }
        this.f1411c.d(androidx.lifecycle.d.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        if (l("onPostResume")) {
            C0075h c0075h = this.f1410b;
            c0075h.c();
            if (c0075h.f1418b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            io.flutter.plugin.platform.e eVar = c0075h.f1420d;
            if (eVar != null) {
                eVar.b();
            }
            Iterator it = c0075h.f1418b.f7724s.f7865i.values().iterator();
            if (it.hasNext()) {
                ((io.flutter.plugin.platform.q) it.next()).getClass();
                throw null;
            }
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (l("onRequestPermissionsResult")) {
            C0075h c0075h = this.f1410b;
            c0075h.c();
            if (c0075h.f1418b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Arrays.toString(strArr);
            Arrays.toString(iArr);
            N.a aVar = c0075h.f1418b.f7709d;
            if (!aVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
                return;
            }
            g1.a.b("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
            try {
                Iterator it = ((HashSet) ((Q0.c) aVar.f1112h).f1519b).iterator();
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
        this.f1411c.d(androidx.lifecycle.d.ON_RESUME);
        if (l("onResume")) {
            C0075h c0075h = this.f1410b;
            c0075h.c();
            c0075h.f1418b.f7707b.d();
            c0075h.f1417a.getClass();
            FlutterEngine flutterEngine = c0075h.f1418b;
            if (flutterEngine != null) {
                Z0.c cVar = flutterEngine.f7712g;
                cVar.a(2, cVar.f1956c);
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (l("onSaveInstanceState")) {
            C0075h c0075h = this.f1410b;
            c0075h.c();
            if (c0075h.f1417a.k()) {
                bundle.putByteArray("framework", c0075h.f1418b.f7716k.f1997b);
            }
            c0075h.f1417a.getClass();
            Bundle bundle2 = new Bundle();
            N.a aVar = c0075h.f1418b.f7709d;
            if (aVar.f()) {
                g1.a.b("FlutterEngineConnectionRegistry#onSaveInstanceState");
                try {
                    Iterator it = ((HashSet) ((Q0.c) aVar.f1112h).f1523f).iterator();
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
            if (c0075h.f1417a.e() == null || c0075h.f1417a.j()) {
                return;
            }
            bundle.putBoolean("enableOnBackInvokedCallbackState", c0075h.f1417a.f1409a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onStart() {
        String str;
        String c2;
        Bundle h2;
        super.onStart();
        this.f1411c.d(androidx.lifecycle.d.ON_START);
        if (l("onStart")) {
            C0075h c0075h = this.f1410b;
            c0075h.c();
            if (c0075h.f1417a.e() == null && !c0075h.f1418b.f7708c.f1712f) {
                String g2 = c0075h.f1417a.g();
                if (g2 == null) {
                    AbstractActivityC0072e abstractActivityC0072e = c0075h.f1417a;
                    abstractActivityC0072e.getClass();
                    g2 = c0075h.d(abstractActivityC0072e.getIntent());
                    if (g2 == null) {
                        g2 = "/";
                    }
                }
                AbstractActivityC0072e abstractActivityC0072e2 = c0075h.f1417a;
                abstractActivityC0072e2.getClass();
                try {
                    h2 = abstractActivityC0072e2.h();
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (h2 != null) {
                    str = h2.getString("io.flutter.EntrypointUri");
                    c0075h.f1417a.f();
                    c0075h.f1418b.f7714i.f1952a.G("setInitialRoute", g2, null);
                    c2 = c0075h.f1417a.c();
                    if (c2 != null || c2.isEmpty()) {
                        c2 = (String) ((U0.c) I0.b.F().f721b).f1822e.f1169c;
                    }
                    c0075h.f1418b.f7708c.a(str != null ? new R0.a(c2, c0075h.f1417a.f()) : new R0.a(c2, str, c0075h.f1417a.f()), (List) c0075h.f1417a.getIntent().getSerializableExtra("dart_entrypoint_args"));
                }
                str = null;
                c0075h.f1417a.f();
                c0075h.f1418b.f7714i.f1952a.G("setInitialRoute", g2, null);
                c2 = c0075h.f1417a.c();
                if (c2 != null) {
                }
                c2 = (String) ((U0.c) I0.b.F().f721b).f1822e.f1169c;
                c0075h.f1418b.f7708c.a(str != null ? new R0.a(c2, c0075h.f1417a.f()) : new R0.a(c2, str, c0075h.f1417a.f()), (List) c0075h.f1417a.getIntent().getSerializableExtra("dart_entrypoint_args"));
            }
            Integer num = c0075h.f1427k;
            if (num != null) {
                c0075h.f1419c.setVisibility(num.intValue());
            }
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (l("onStop")) {
            C0075h c0075h = this.f1410b;
            c0075h.c();
            c0075h.f1417a.getClass();
            FlutterEngine flutterEngine = c0075h.f1418b;
            if (flutterEngine != null) {
                Z0.c cVar = flutterEngine.f7712g;
                cVar.a(5, cVar.f1956c);
            }
            c0075h.f1427k = Integer.valueOf(c0075h.f1419c.getVisibility());
            c0075h.f1419c.setVisibility(8);
            FlutterEngine flutterEngine2 = c0075h.f1418b;
            if (flutterEngine2 != null) {
                flutterEngine2.f7707b.b(40);
            }
        }
        this.f1411c.d(androidx.lifecycle.d.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        if (l("onTrimMemory")) {
            C0075h c0075h = this.f1410b;
            c0075h.c();
            FlutterEngine flutterEngine = c0075h.f1418b;
            if (flutterEngine != null) {
                if (c0075h.f1425i && i2 >= 10) {
                    FlutterJNI flutterJNI = flutterEngine.f7708c.f1707a;
                    if (flutterJNI.isAttached()) {
                        flutterJNI.notifyLowMemoryWarning();
                    }
                    Z0.b bVar = c0075h.f1418b.f7722q;
                    bVar.getClass();
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("type", "memoryPressure");
                    bVar.f1953a.g(hashMap, null);
                }
                c0075h.f1418b.f7707b.b(i2);
                io.flutter.plugin.platform.k kVar = c0075h.f1418b.f7724s;
                if (i2 < 40) {
                    kVar.getClass();
                    return;
                }
                Iterator it = kVar.f7865i.values().iterator();
                if (it.hasNext()) {
                    ((io.flutter.plugin.platform.q) it.next()).getClass();
                    throw null;
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        if (l("onUserLeaveHint")) {
            C0075h c0075h = this.f1410b;
            c0075h.c();
            FlutterEngine flutterEngine = c0075h.f1418b;
            if (flutterEngine == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            N.a aVar = flutterEngine.f7709d;
            if (!aVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
                return;
            }
            g1.a.b("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                Iterator it = ((HashSet) ((Q0.c) aVar.f1112h).f1522e).iterator();
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
        if (l("onWindowFocusChanged")) {
            C0075h c0075h = this.f1410b;
            c0075h.c();
            c0075h.f1417a.getClass();
            FlutterEngine flutterEngine = c0075h.f1418b;
            if (flutterEngine != null) {
                Z0.c cVar = flutterEngine.f7712g;
                if (z2) {
                    cVar.a(cVar.f1954a, true);
                } else {
                    cVar.a(cVar.f1954a, false);
                }
            }
        }
    }
}
