package P0;

import A1.AbstractC0000a;
import A1.AbstractC0022x;
import A1.C0019u;
import A1.L;
import A1.S;
import A1.V;
import A1.g0;
import F.C0038n;
import P.C0064m;
import a1.InterfaceC0090f;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.provider.Settings;
import android.text.Selection;
import android.text.format.DateFormat;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.Surface;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textservice.SpellCheckerInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import b1.C0130a;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import p.AbstractC1000b;

/* loaded from: classes.dex */
public final class t extends FrameLayout {

    /* renamed from: A, reason: collision with root package name */
    public int f1454A;

    /* renamed from: B, reason: collision with root package name */
    public v f1455B;

    /* renamed from: a, reason: collision with root package name */
    public boolean f1456a;

    /* renamed from: b, reason: collision with root package name */
    public final l f1457b;

    /* renamed from: c, reason: collision with root package name */
    public final n f1458c;

    /* renamed from: d, reason: collision with root package name */
    public C0077j f1459d;

    /* renamed from: e, reason: collision with root package name */
    public View f1460e;

    /* renamed from: f, reason: collision with root package name */
    public View f1461f;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f1462g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1463h;

    /* renamed from: i, reason: collision with root package name */
    public FlutterEngine f1464i;

    /* renamed from: j, reason: collision with root package name */
    public final HashSet f1465j;

    /* renamed from: k, reason: collision with root package name */
    public x0.e f1466k;

    /* renamed from: l, reason: collision with root package name */
    public io.flutter.plugin.editing.j f1467l;

    /* renamed from: m, reason: collision with root package name */
    public io.flutter.plugin.editing.g f1468m;

    /* renamed from: n, reason: collision with root package name */
    public C0130a f1469n;

    /* renamed from: o, reason: collision with root package name */
    public I0.b f1470o;

    /* renamed from: p, reason: collision with root package name */
    public C0069b f1471p;

    /* renamed from: q, reason: collision with root package name */
    public io.flutter.view.h f1472q;

    /* renamed from: r, reason: collision with root package name */
    public TextServicesManager f1473r;

    /* renamed from: s, reason: collision with root package name */
    public C.j f1474s;
    public final io.flutter.embedding.engine.renderer.g t;

    /* renamed from: u, reason: collision with root package name */
    public final C.j f1475u;

    /* renamed from: v, reason: collision with root package name */
    public final D.a f1476v;

    /* renamed from: w, reason: collision with root package name */
    public final r f1477w;

    /* renamed from: x, reason: collision with root package name */
    public final C0073f f1478x;

    /* renamed from: y, reason: collision with root package name */
    public q f1479y;

    /* renamed from: z, reason: collision with root package name */
    public int f1480z;

    public t(AbstractActivityC0072e abstractActivityC0072e, l lVar) {
        super(abstractActivityC0072e, null);
        this.f1456a = false;
        this.f1462g = new HashSet();
        this.f1465j = new HashSet();
        this.t = new io.flutter.embedding.engine.renderer.g();
        this.f1475u = new C.j(16, this);
        this.f1476v = new D.a(this, new Handler(Looper.getMainLooper()), 1);
        this.f1477w = new r(this);
        this.f1478x = new C0073f(1, this);
        this.f1455B = new v();
        this.f1457b = lVar;
        this.f1460e = lVar;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public final void a() {
        SparseArray sparseArray;
        Objects.toString(this.f1464i);
        if (!c()) {
            return;
        }
        Iterator it = this.f1465j.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        getContext().getContentResolver().unregisterContentObserver(this.f1476v);
        io.flutter.plugin.platform.k kVar = this.f1464i.f7724s;
        int i2 = 0;
        while (true) {
            SparseArray sparseArray2 = kVar.f7870n;
            if (i2 >= sparseArray2.size()) {
                break;
            }
            kVar.f7859c.removeView((io.flutter.plugin.platform.g) sparseArray2.valueAt(i2));
            i2++;
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray3 = kVar.f7868l;
            if (i3 >= sparseArray3.size()) {
                kVar.e();
                if (kVar.f7859c == null) {
                    Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
                } else {
                    int i4 = 0;
                    while (true) {
                        sparseArray = kVar.f7869m;
                        if (i4 >= sparseArray.size()) {
                            break;
                        }
                        kVar.f7859c.removeView((View) sparseArray.valueAt(i4));
                        i4++;
                    }
                    sparseArray.clear();
                }
                kVar.f7859c = null;
                kVar.f7872p = false;
                SparseArray sparseArray4 = kVar.f7867k;
                if (sparseArray4.size() > 0) {
                    sparseArray4.valueAt(0).getClass();
                    throw new ClassCastException();
                }
                io.flutter.plugin.platform.j jVar = this.f1464i.t;
                int i5 = 0;
                while (true) {
                    SparseArray sparseArray5 = jVar.f7850h;
                    if (i5 >= sparseArray5.size()) {
                        Surface surface = jVar.f7853k;
                        if (surface != null) {
                            surface.release();
                            jVar.f7853k = null;
                            jVar.f7854l = null;
                        }
                        jVar.f7845c = null;
                        SparseArray sparseArray6 = jVar.f7849g;
                        if (sparseArray6.size() > 0) {
                            sparseArray6.valueAt(0).getClass();
                            throw new ClassCastException();
                        }
                        this.f1464i.f7724s.a();
                        this.f1464i.t.a();
                        io.flutter.view.h hVar = this.f1472q;
                        hVar.t = true;
                        hVar.f7979e.a();
                        hVar.f7992r = null;
                        AccessibilityManager accessibilityManager = hVar.f7977c;
                        accessibilityManager.removeAccessibilityStateChangeListener(hVar.f7994u);
                        accessibilityManager.removeTouchExplorationStateChangeListener(hVar.f7995v);
                        hVar.f7980f.unregisterContentObserver(hVar.f7996w);
                        I0.b bVar = hVar.f7976b;
                        bVar.f723d = null;
                        ((FlutterJNI) bVar.f722c).setAccessibilityDelegate(null);
                        this.f1472q = null;
                        this.f1467l.f7816b.restartInput(this);
                        this.f1467l.b();
                        int size = ((HashSet) this.f1470o.f722c).size();
                        if (size > 0) {
                            Log.w("KeyboardManager", "A KeyboardManager was destroyed with " + size + " unhandled redispatch event(s).");
                        }
                        io.flutter.plugin.editing.g gVar = this.f1468m;
                        if (gVar != null) {
                            gVar.f7802a.f1992b = null;
                            SpellCheckerSession spellCheckerSession = gVar.f7804c;
                            if (spellCheckerSession != null) {
                                spellCheckerSession.close();
                            }
                        }
                        x0.e eVar = this.f1466k;
                        if (eVar != null) {
                            ((C.j) eVar.f8531c).f124b = null;
                        }
                        io.flutter.embedding.engine.renderer.h hVar2 = this.f1464i.f7707b;
                        this.f1463h = false;
                        hVar2.c(this.f1478x);
                        boolean z2 = this.f1456a;
                        FlutterJNI flutterJNI = hVar2.f7767a;
                        if (z2) {
                            flutterJNI.removeResizingFlutterUiListener(this.f1477w);
                        }
                        hVar2.e();
                        flutterJNI.setSemanticsEnabled(false);
                        View view = this.f1461f;
                        if (view != null && this.f1460e == this.f1459d) {
                            this.f1460e = view;
                        }
                        this.f1460e.c();
                        C0077j c0077j = this.f1459d;
                        if (c0077j != null) {
                            c0077j.f1429a.close();
                            removeView(this.f1459d);
                            this.f1459d = null;
                        }
                        this.f1461f = null;
                        this.f1464i = null;
                        return;
                    }
                    if (sparseArray5.valueAt(i5) != null) {
                        throw new ClassCastException();
                    }
                    jVar.f7845c.removeView(null);
                    i5++;
                }
            } else {
                if (sparseArray3.valueAt(i3) != null) {
                    throw new ClassCastException();
                }
                kVar.f7859c.removeView(null);
                i3++;
            }
        }
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        Z0.n nVar;
        C0038n c0038n;
        C0038n c0038n2;
        CharSequence textValue;
        io.flutter.plugin.editing.j jVar = this.f1467l;
        if (jVar == null || Build.VERSION.SDK_INT < 26 || (nVar = jVar.f7820f) == null || jVar.f7821g == null || (c0038n = nVar.f2016j) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            Z0.n nVar2 = (Z0.n) jVar.f7821g.get(sparseArray.keyAt(i2));
            if (nVar2 != null && (c0038n2 = nVar2.f2016j) != null) {
                textValue = AbstractC0068a.f(sparseArray.valueAt(i2)).getTextValue();
                String charSequence = textValue.toString();
                Z0.p pVar = new Z0.p(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                String str = (String) c0038n2.f532a;
                if (str.equals((String) c0038n.f532a)) {
                    jVar.f7822h.f(pVar);
                } else {
                    hashMap.put(str, pVar);
                }
            }
        }
        int i3 = jVar.f7819e.f1356c;
        x0.e eVar = jVar.f7818d;
        eVar.getClass();
        hashMap.size();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            Z0.p pVar2 = (Z0.p) entry.getValue();
            hashMap2.put((String) entry.getKey(), x0.e.n(pVar2.f2023a, pVar2.f2024b, pVar2.f2025c, -1, -1));
        }
        ((I0.b) eVar.f8530b).G("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i3), hashMap2), null);
    }

    public final void b() {
        l lVar = this.f1457b;
        if (lVar != null) {
            addView(lVar);
        } else {
            n nVar = this.f1458c;
            if (nVar != null) {
                addView(nVar);
            } else {
                addView(this.f1459d);
            }
        }
        this.f1456a = R1.d.v(getContext());
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public final boolean c() {
        FlutterEngine flutterEngine = this.f1464i;
        if (flutterEngine != null) {
            if (flutterEngine.f7707b == this.f1460e.getAttachedRenderer()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean checkInputConnectionProxy(View view) {
        FlutterEngine flutterEngine = this.f1464i;
        if (flutterEngine == null) {
            return super.checkInputConnectionProxy(view);
        }
        io.flutter.plugin.platform.k kVar = flutterEngine.f7724s;
        if (view == null) {
            kVar.getClass();
            return false;
        }
        HashMap hashMap = kVar.f7866j;
        if (!hashMap.containsKey(view.getContext())) {
            return false;
        }
        View view2 = (View) hashMap.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r1 != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        boolean z2;
        HashMap hashMap;
        String str;
        boolean z3;
        C0038n c0038n;
        List enabledSpellCheckerInfos;
        boolean z4;
        boolean isSpellCheckerEnabled;
        char c2 = (getResources().getConfiguration().uiMode & 48) == 32 ? (char) 2 : (char) 1;
        TextServicesManager textServicesManager = this.f1473r;
        if (textServicesManager != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                enabledSpellCheckerInfos = textServicesManager.getEnabledSpellCheckerInfos();
                Iterator it = enabledSpellCheckerInfos.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z4 = false;
                        break;
                    } else if (((SpellCheckerInfo) it.next()).getPackageName().equals("com.google.android.inputmethod.latin")) {
                        z4 = true;
                        break;
                    }
                }
                isSpellCheckerEnabled = this.f1473r.isSpellCheckerEnabled();
                if (isSpellCheckerEnabled) {
                }
            }
            z2 = true;
            Z0.m mVar = this.f1464i.f7720o;
            mVar.getClass();
            hashMap = new HashMap();
            hashMap.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            hashMap.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z2));
            hashMap.put("brieflyShowPassword", Boolean.valueOf(Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) != 1));
            hashMap.put("alwaysUse24HourFormat", Boolean.valueOf(DateFormat.is24HourFormat(getContext())));
            if (c2 != 1) {
                str = "light";
            } else {
                if (c2 != 2) {
                    throw null;
                }
                str = "dark";
            }
            hashMap.put("platformBrightness", str);
            Objects.toString(hashMap.get("textScaleFactor"));
            Objects.toString(hashMap.get("alwaysUse24HourFormat"));
            Objects.toString(hashMap.get("platformBrightness"));
            z3 = Build.VERSION.SDK_INT >= 34;
            c0038n = mVar.f2006b;
            if (z3 || displayMetrics == null) {
                c0038n.g(hashMap, null);
            }
            Z0.l lVar = new Z0.l(displayMetrics);
            I0.b bVar = mVar.f2005a;
            ((ConcurrentLinkedQueue) bVar.f721b).add(lVar);
            Z0.l lVar2 = (Z0.l) bVar.f723d;
            bVar.f723d = lVar;
            x0.e eVar = lVar2 != null ? new x0.e(bVar, lVar2, 15, false) : null;
            hashMap.put("configurationId", Integer.valueOf(lVar.f2003a));
            c0038n.g(hashMap, eVar);
            return;
        }
        z2 = false;
        Z0.m mVar2 = this.f1464i.f7720o;
        mVar2.getClass();
        hashMap = new HashMap();
        hashMap.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        hashMap.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z2));
        hashMap.put("brieflyShowPassword", Boolean.valueOf(Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) != 1));
        hashMap.put("alwaysUse24HourFormat", Boolean.valueOf(DateFormat.is24HourFormat(getContext())));
        if (c2 != 1) {
        }
        hashMap.put("platformBrightness", str);
        Objects.toString(hashMap.get("textScaleFactor"));
        Objects.toString(hashMap.get("alwaysUse24HourFormat"));
        Objects.toString(hashMap.get("platformBrightness"));
        if (Build.VERSION.SDK_INT >= 34) {
        }
        c0038n = mVar2.f2006b;
        if (z3) {
        }
        c0038n.g(hashMap, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (c() && this.f1470o.E(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        if (!c()) {
            Log.w("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        float f2 = getResources().getDisplayMetrics().density;
        io.flutter.embedding.engine.renderer.g gVar = this.t;
        gVar.f7742a = f2;
        gVar.t = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        io.flutter.embedding.engine.renderer.h hVar = this.f1464i.f7707b;
        hVar.getClass();
        int i2 = gVar.f7743b;
        if (i2 == 0) {
            int i3 = gVar.f7745d;
            int i4 = gVar.f7746e;
            if (i3 <= 0 && i4 <= 0) {
                return;
            }
        } else {
            int i5 = gVar.f7744c;
            if (i5 == 0) {
                int i6 = gVar.f7747f;
                int i7 = gVar.f7748g;
                if (i6 <= 0 && i7 <= 0) {
                    return;
                }
            } else if (i2 <= 0 || i5 <= 0 || gVar.f7742a <= 0.0f) {
                return;
            }
        }
        ArrayList arrayList = gVar.f7765y;
        arrayList.size();
        ArrayList arrayList2 = gVar.f7766z;
        arrayList2.size();
        int size = arrayList2.size() + arrayList.size();
        int[] iArr = new int[size * 4];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            io.flutter.embedding.engine.renderer.a aVar = (io.flutter.embedding.engine.renderer.a) arrayList.get(i8);
            int i9 = i8 * 4;
            Rect rect = aVar.f7729a;
            iArr[i9] = rect.left;
            iArr[i9 + 1] = rect.top;
            iArr[i9 + 2] = rect.right;
            iArr[i9 + 3] = rect.bottom;
            iArr2[i8] = H.j.b(aVar.f7730b);
            iArr3[i8] = H.j.b(aVar.f7731c);
        }
        int size2 = arrayList.size() * 4;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            io.flutter.embedding.engine.renderer.a aVar2 = (io.flutter.embedding.engine.renderer.a) arrayList2.get(i10);
            int i11 = (i10 * 4) + size2;
            Rect rect2 = aVar2.f7729a;
            iArr[i11] = rect2.left;
            iArr[i11 + 1] = rect2.top;
            iArr[i11 + 2] = rect2.right;
            iArr[i11 + 3] = rect2.bottom;
            iArr2[arrayList.size() + i10] = H.j.b(aVar2.f7730b);
            iArr3[arrayList.size() + i10] = H.j.b(aVar2.f7731c);
        }
        hVar.f7767a.setViewportMetrics(gVar.f7742a, gVar.f7743b, gVar.f7744c, gVar.f7749h, gVar.f7750i, gVar.f7751j, gVar.f7752k, gVar.f7753l, gVar.f7754m, gVar.f7755n, gVar.f7756o, gVar.f7757p, gVar.f7758q, gVar.f7759r, gVar.f7760s, gVar.t, iArr, iArr2, iArr3, gVar.f7745d, gVar.f7746e, gVar.f7747f, gVar.f7748g, gVar.f7761u, gVar.f7762v, gVar.f7763w, gVar.f7764x);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.h hVar = this.f1472q;
        if (hVar == null || !hVar.f7977c.isEnabled()) {
            return null;
        }
        return this.f1472q;
    }

    public FlutterEngine getAttachedFlutterEngine() {
        return this.f1464i;
    }

    public InterfaceC0090f getBinaryMessenger() {
        return this.f1464i.f7708c;
    }

    public C0077j getCurrentImageSurface() {
        return this.f1459d;
    }

    public io.flutter.embedding.engine.renderer.g getViewportMetrics() {
        return this.t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x01b1, code lost:
    
        r3 = r16.getDisplayCutout();
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        char c2;
        int i2;
        int i3;
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        RoundedCorner roundedCorner3;
        RoundedCorner roundedCorner4;
        int captionBar;
        List boundingRects;
        Window window;
        DisplayCutout displayCutout;
        List<Rect> boundingRects2;
        int systemBars;
        Insets insets;
        int i4;
        int i5;
        int i6;
        int i7;
        int ime;
        Insets insets2;
        int i8;
        int i9;
        int i10;
        int i11;
        int systemGestures;
        Insets insets3;
        int i12;
        int i13;
        int i14;
        int i15;
        DisplayCutout displayCutout2;
        Insets waterfallInsets;
        int i16;
        int safeInsetTop;
        int i17;
        int safeInsetRight;
        int i18;
        int safeInsetBottom;
        int i19;
        int safeInsetLeft;
        Insets systemGestureInsets;
        int i20;
        int i21;
        int i22;
        int i23;
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i24 = Build.VERSION.SDK_INT;
        io.flutter.embedding.engine.renderer.g gVar = this.t;
        if (i24 == 29) {
            systemGestureInsets = windowInsets.getSystemGestureInsets();
            i20 = systemGestureInsets.top;
            gVar.f7757p = i20;
            i21 = systemGestureInsets.right;
            gVar.f7758q = i21;
            i22 = systemGestureInsets.bottom;
            gVar.f7759r = i22;
            i23 = systemGestureInsets.left;
            gVar.f7760s = i23;
        }
        boolean z2 = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z3 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i24 >= 30) {
            systemBars = WindowInsets.Type.systemBars();
            insets = windowInsets.getInsets(systemBars);
            i4 = insets.top;
            gVar.f7749h = i4;
            i5 = insets.right;
            gVar.f7750i = i5;
            i6 = insets.bottom;
            gVar.f7751j = i6;
            i7 = insets.left;
            gVar.f7752k = i7;
            ime = WindowInsets.Type.ime();
            insets2 = windowInsets.getInsets(ime);
            i8 = insets2.top;
            gVar.f7753l = i8;
            i9 = insets2.right;
            gVar.f7754m = i9;
            i10 = insets2.bottom;
            gVar.f7755n = i10;
            i11 = insets2.left;
            gVar.f7756o = i11;
            systemGestures = WindowInsets.Type.systemGestures();
            insets3 = windowInsets.getInsets(systemGestures);
            i12 = insets3.top;
            gVar.f7757p = i12;
            i13 = insets3.right;
            gVar.f7758q = i13;
            i14 = insets3.bottom;
            gVar.f7759r = i14;
            i15 = insets3.left;
            gVar.f7760s = i15;
            displayCutout2 = windowInsets.getDisplayCutout();
            if (displayCutout2 != null) {
                waterfallInsets = displayCutout2.getWaterfallInsets();
                int i25 = gVar.f7749h;
                i16 = waterfallInsets.top;
                int max = Math.max(i25, i16);
                safeInsetTop = displayCutout2.getSafeInsetTop();
                gVar.f7749h = Math.max(max, safeInsetTop);
                int i26 = gVar.f7750i;
                i17 = waterfallInsets.right;
                int max2 = Math.max(i26, i17);
                safeInsetRight = displayCutout2.getSafeInsetRight();
                gVar.f7750i = Math.max(max2, safeInsetRight);
                int i27 = gVar.f7751j;
                i18 = waterfallInsets.bottom;
                int max3 = Math.max(i27, i18);
                safeInsetBottom = displayCutout2.getSafeInsetBottom();
                gVar.f7751j = Math.max(max3, safeInsetBottom);
                int i28 = gVar.f7752k;
                i19 = waterfallInsets.left;
                int max4 = Math.max(i28, i19);
                safeInsetLeft = displayCutout2.getSafeInsetLeft();
                gVar.f7752k = Math.max(max4, safeInsetLeft);
            }
            i3 = 0;
        } else {
            if (!z3) {
                Context context = getContext();
                if (context.getResources().getConfiguration().orientation == 2) {
                    int rotation = ((DisplayManager) context.getSystemService("display")).getDisplay(0).getRotation();
                    if (rotation == 1) {
                        c2 = 3;
                    } else if (rotation == 3) {
                        c2 = 2;
                    } else if (rotation == 0 || rotation == 2) {
                        c2 = 4;
                    }
                    gVar.f7749h = !z2 ? windowInsets.getSystemWindowInsetTop() : 0;
                    gVar.f7750i = (c2 != 3 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
                    if (z3) {
                        if ((((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom()) == 0) {
                            i2 = windowInsets.getSystemWindowInsetBottom();
                            gVar.f7751j = i2;
                            gVar.f7752k = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                            gVar.f7753l = 0;
                            gVar.f7754m = 0;
                            gVar.f7755n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom();
                            i3 = 0;
                            gVar.f7756o = 0;
                        }
                    }
                    i2 = 0;
                    gVar.f7751j = i2;
                    gVar.f7752k = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                    gVar.f7753l = 0;
                    gVar.f7754m = 0;
                    gVar.f7755n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom();
                    i3 = 0;
                    gVar.f7756o = 0;
                }
            }
            c2 = 1;
            gVar.f7749h = !z2 ? windowInsets.getSystemWindowInsetTop() : 0;
            gVar.f7750i = (c2 != 3 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
            if (z3) {
            }
            i2 = 0;
            gVar.f7751j = i2;
            gVar.f7752k = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
            gVar.f7753l = 0;
            gVar.f7754m = 0;
            gVar.f7755n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom();
            i3 = 0;
            gVar.f7756o = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (i24 >= 28 && displayCutout != null) {
            boundingRects2 = displayCutout.getBoundingRects();
            for (Rect rect : boundingRects2) {
                rect.toString();
                arrayList.add(new io.flutter.embedding.engine.renderer.a(rect, 4, 1));
            }
        }
        ArrayList arrayList2 = gVar.f7766z;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (Build.VERSION.SDK_INT >= 35) {
            v vVar = this.f1455B;
            Context context2 = getContext();
            vVar.getClass();
            Activity p2 = R1.l.p(context2);
            WindowInsets windowInsets2 = null;
            if (p2 != null && (window = p2.getWindow()) != null) {
                windowInsets2 = window.getDecorView().getRootWindowInsets();
            }
            if (windowInsets2 == null) {
                boundingRects = Collections.emptyList();
            } else {
                captionBar = WindowInsets.Type.captionBar();
                boundingRects = windowInsets2.getBoundingRects(captionBar);
            }
            int i29 = gVar.f7749h;
            Iterator it = boundingRects.iterator();
            while (it.hasNext()) {
                i29 = Math.max(i29, ((Rect) it.next()).bottom);
            }
            gVar.f7749h = i29;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            roundedCorner = windowInsets.getRoundedCorner(0);
            roundedCorner2 = windowInsets.getRoundedCorner(1);
            roundedCorner3 = windowInsets.getRoundedCorner(2);
            roundedCorner4 = windowInsets.getRoundedCorner(3);
            gVar.f7761u = roundedCorner != null ? roundedCorner.getRadius() : i3;
            gVar.f7762v = roundedCorner2 != null ? roundedCorner2.getRadius() : i3;
            gVar.f7763w = roundedCorner3 != null ? roundedCorner3.getRadius() : i3;
            gVar.f7764x = roundedCorner4 != null ? roundedCorner4.getRadius() : i3;
        }
        e();
        return onApplyWindowInsets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [D1.d] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C.j jVar;
        l1.j jVar2 = l1.j.f8138a;
        int i2 = 0;
        super.onAttachedToWindow();
        try {
            Z.g gVar = Z.h.f1942O;
            Context context = getContext();
            gVar.getClass();
            jVar = new C.j(17, new x0.e(Z.g.a(context)));
        } catch (NoClassDefFoundError unused) {
            jVar = null;
        }
        this.f1474s = jVar;
        Activity p2 = R1.l.p(getContext());
        C.j jVar3 = this.f1474s;
        if (jVar3 == null || p2 == null) {
            return;
        }
        this.f1479y = new q(i2, this);
        Context context2 = getContext();
        Executor executor = Build.VERSION.SDK_INT >= 28 ? AbstractC1000b.a(context2) : new D0.l(new Handler(context2.getMainLooper()), 2);
        q consumer = this.f1479y;
        x0.e eVar = (x0.e) jVar3.f124b;
        kotlin.jvm.internal.i.e(executor, "executor");
        kotlin.jvm.internal.i.e(consumer, "consumer");
        Z.b bVar = (Z.b) eVar.f8530b;
        bVar.getClass();
        D1.c cVar = new D1.c(new Z.i(bVar, p2, null), jVar2, -2, 1);
        H1.d dVar = A1.D.f2a;
        B1.c cVar2 = F1.o.f624a;
        if (cVar2.m(C0019u.f73b) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + cVar2).toString());
        }
        D1.c flow = cVar;
        if (!cVar2.equals(jVar2)) {
            flow = E1.l.a(cVar, cVar2, 0, 0, 6);
        }
        x0.e eVar2 = (x0.e) eVar.f8531c;
        eVar2.getClass();
        kotlin.jvm.internal.i.e(flow, "flow");
        ReentrantLock reentrantLock = (ReentrantLock) eVar2.f8530b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = (LinkedHashMap) eVar2.f8531c;
        try {
            if (linkedHashMap.get(consumer) == null) {
                l1.i l2 = new L(executor);
                if (l2.m(C0019u.f73b) == null) {
                    l2 = l2.l(new V(null));
                }
                X.a aVar = new X.a(flow, consumer, null);
                l1.i a2 = AbstractC0022x.a(l2, jVar2, true);
                H1.d dVar2 = A1.D.f2a;
                if (a2 != dVar2 && a2.m(l1.e.f8137a) == null) {
                    a2 = a2.l(dVar2);
                }
                AbstractC0000a g0Var = new g0(a2, true);
                g0Var.V(1, g0Var, aVar);
                linkedHashMap.put(consumer, g0Var);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f1464i != null) {
            this.f1469n.b(configuration);
            d();
            R1.l.e(getContext(), this.f1464i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i2;
        int i3;
        int i4;
        if (!c()) {
            return super.onCreateInputConnection(editorInfo);
        }
        io.flutter.plugin.editing.j jVar = this.f1467l;
        I0.b bVar = this.f1470o;
        C0064m c0064m = jVar.f7819e;
        int i5 = c0064m.f1355b;
        if (i5 == 1) {
            jVar.f7824j = null;
            return null;
        }
        int i6 = 4;
        if (i5 == 4) {
            return null;
        }
        if (i5 == 3) {
            if (jVar.f7830p) {
                return jVar.f7824j;
            }
            jVar.f7825k.g(c0064m.f1356c);
            throw null;
        }
        Z0.n nVar = jVar.f7820f;
        Z0.o oVar = nVar.f2013g;
        int i7 = oVar.f2020a;
        if (i7 != 2) {
            if (i7 == 5) {
                int i8 = oVar.f2021b ? 4098 : 2;
                if (oVar.f2022c) {
                    i2 = i8 | 8192;
                    i6 = i2;
                } else {
                    i6 = i8;
                }
            } else if (i7 == 6) {
                i6 = 3;
            } else if (i7 == 11) {
                i6 = 0;
            } else {
                i2 = i7 == 7 ? 131073 : (i7 == 8 || i7 == 13) ? 33 : (i7 == 9 || i7 == 12) ? 17 : i7 == 10 ? 145 : i7 == 3 ? 97 : i7 == 4 ? 113 : 1;
                if (!nVar.f2007a) {
                    if (nVar.f2008b) {
                        i2 |= 32768;
                    }
                    i4 = nVar.f2009c ? 524416 : 524432;
                    i3 = nVar.f2012f;
                    if (i3 != 1) {
                        i2 |= Base64Utils.IO_BUFFER_SIZE;
                    } else if (i3 == 2) {
                        i2 |= 8192;
                    } else if (i3 == 3) {
                        i2 |= 16384;
                    }
                    i6 = i2;
                }
                i2 |= i4;
                i3 = nVar.f2012f;
                if (i3 != 1) {
                }
                i6 = i2;
            }
        }
        editorInfo.inputType = i6;
        editorInfo.imeOptions = 33554432;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26 && !nVar.f2010d) {
            editorInfo.imeOptions = 50331648;
        }
        int intValue = nVar.f2014h.intValue();
        Z0.n nVar2 = jVar.f7820f;
        String str = nVar2.f2015i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = intValue;
        }
        editorInfo.imeOptions = intValue | editorInfo.imeOptions;
        if (nVar2.f2019m != null) {
            editorInfo.hintLocales = new LocaleList(jVar.f7820f.f2019m);
        }
        String[] strArr = jVar.f7820f.f2017k;
        if (strArr != null) {
            editorInfo.contentMimeTypes = strArr;
        }
        if (i9 >= 34) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
        }
        io.flutter.plugin.editing.c cVar = new io.flutter.plugin.editing.c(this, jVar.f7819e.f1356c, jVar.f7818d, bVar, jVar.f7822h, editorInfo);
        io.flutter.plugin.editing.f fVar = jVar.f7822h;
        fVar.getClass();
        editorInfo.initialSelStart = Selection.getSelectionStart(fVar);
        io.flutter.plugin.editing.f fVar2 = jVar.f7822h;
        fVar2.getClass();
        editorInfo.initialSelEnd = Selection.getSelectionEnd(fVar2);
        jVar.f7824j = cVar;
        return cVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        q qVar;
        C.j jVar = this.f1474s;
        if (jVar != null && (qVar = this.f1479y) != null) {
            x0.e eVar = (x0.e) ((x0.e) jVar.f124b).f8531c;
            eVar.getClass();
            ReentrantLock reentrantLock = (ReentrantLock) eVar.f8530b;
            reentrantLock.lock();
            LinkedHashMap linkedHashMap = (LinkedHashMap) eVar.f8531c;
            try {
                S s2 = (S) linkedHashMap.get(qVar);
                if (s2 != null) {
                    s2.a(null);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        this.f1479y = null;
        this.f1474s = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (c()) {
            C0069b c0069b = this.f1471p;
            Context context = getContext();
            c0069b.getClass();
            boolean isFromSource = motionEvent.isFromSource(2);
            boolean z2 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
            if (isFromSource && z2) {
                int b2 = C0069b.b(motionEvent.getActionMasked());
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                c0069b.a(motionEvent, motionEvent.getActionIndex(), b2, 0, C0069b.f1400f, allocateDirect, context);
                if (allocateDirect.position() % 288 != 0) {
                    throw new AssertionError("Packet position is not on field boundary.");
                }
                c0069b.f1401a.f7767a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return !c() ? super.onHoverEvent(motionEvent) : this.f1472q.e(motionEvent, false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        this.f1480z = View.MeasureSpec.getMode(i2);
        this.f1454A = View.MeasureSpec.getMode(i3);
        super.onMeasure(i2, i3);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i2) {
        Rect rect;
        super.onProvideAutofillVirtualStructure(viewStructure, i2);
        io.flutter.plugin.editing.j jVar = this.f1467l;
        if (jVar == null || Build.VERSION.SDK_INT < 26 || jVar.f7821g == null) {
            return;
        }
        String str = (String) jVar.f7820f.f2016j.f532a;
        AutofillId autofillId = viewStructure.getAutofillId();
        for (int i3 = 0; i3 < jVar.f7821g.size(); i3++) {
            int keyAt = jVar.f7821g.keyAt(i3);
            C0038n c0038n = ((Z0.n) jVar.f7821g.valueAt(i3)).f2016j;
            if (c0038n != null) {
                viewStructure.addChildCount(1);
                ViewStructure newChild = viewStructure.newChild(i3);
                newChild.setAutofillId(autofillId, keyAt);
                String[] strArr = (String[]) c0038n.f533b;
                if (strArr.length > 0) {
                    newChild.setAutofillHints(strArr);
                }
                newChild.setAutofillType(1);
                newChild.setVisibility(0);
                String str2 = (String) c0038n.f535d;
                if (str2 != null) {
                    newChild.setHint(str2);
                }
                if (str.hashCode() != keyAt || (rect = jVar.f7827m) == null) {
                    newChild.setDimens(0, 0, 0, 0, 1, 1);
                    newChild.setAutofillValue(AutofillValue.forText(((Z0.p) c0038n.f534c).f2023a));
                } else {
                    newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), jVar.f7827m.height());
                    newChild.setAutofillValue(AutofillValue.forText(jVar.f7822h));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        io.flutter.embedding.engine.renderer.g gVar = this.t;
        gVar.f7743b = i2;
        gVar.f7744c = i3;
        boolean z2 = this.f1456a;
        if (z2 && this.f1454A == 0) {
            gVar.f7747f = 0;
            gVar.f7748g = 8192;
        } else {
            gVar.f7747f = i3;
            gVar.f7748g = i3;
        }
        if (z2 && this.f1480z == 0) {
            gVar.f7745d = 0;
            gVar.f7746e = 8192;
        } else {
            gVar.f7745d = i2;
            gVar.f7746e = i2;
        }
        e();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        int i2;
        if (!c()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        C0069b c0069b = this.f1471p;
        Matrix matrix = C0069b.f1400f;
        c0069b.getClass();
        int actionMasked = motionEvent.getActionMasked();
        int b2 = C0069b.b(motionEvent.getActionMasked());
        char c2 = 5;
        int i3 = 1;
        boolean z2 = actionMasked == 0 || actionMasked == 5;
        boolean z3 = !z2 && (actionMasked == 1 || actionMasked == 6);
        int toolType = motionEvent.getToolType(motionEvent.getActionIndex());
        if (toolType == 1) {
            c2 = 0;
        } else if (toolType == 2) {
            c2 = 2;
        } else if (toolType == 3) {
            c2 = 1;
        } else if (toolType == 4) {
            c2 = 3;
        }
        int i4 = (z3 && c2 == 0) ? 1 : 0;
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((pointerCount + i4) * 288);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        if (z2) {
            c0069b.a(motionEvent, motionEvent.getActionIndex(), b2, 0, matrix, allocateDirect, null);
            byteBuffer = allocateDirect;
        } else {
            ByteBuffer byteBuffer3 = allocateDirect;
            if (z3) {
                int i5 = 0;
                while (i5 < pointerCount) {
                    if (i5 == motionEvent.getActionIndex() || motionEvent.getToolType(i5) != i3) {
                        byteBuffer2 = byteBuffer3;
                        i2 = pointerCount;
                    } else {
                        byteBuffer2 = byteBuffer3;
                        i2 = pointerCount;
                        c0069b.a(motionEvent, i5, 5, 1, matrix, byteBuffer2, null);
                    }
                    i5++;
                    pointerCount = i2;
                    byteBuffer3 = byteBuffer2;
                    i3 = 1;
                }
                byteBuffer = byteBuffer3;
                c0069b.a(motionEvent, motionEvent.getActionIndex(), b2, 0, matrix, byteBuffer, null);
                if (i4 != 0) {
                    c0069b.a(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, byteBuffer, null);
                }
            } else {
                byteBuffer = byteBuffer3;
                for (int i6 = 0; i6 < pointerCount; i6++) {
                    c0069b.a(motionEvent, i6, b2, (pointerCount << 8) | 2, matrix, byteBuffer, null);
                }
            }
        }
        if (byteBuffer.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary");
        }
        c0069b.f1401a.f7767a.dispatchPointerDataPacket(byteBuffer, byteBuffer.position());
        return true;
    }

    public void setDelegate(v vVar) {
        this.f1455B = vVar;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        View view = this.f1460e;
        if (view instanceof l) {
            ((l) view).setVisibility(i2);
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    public void setWindowInfoListenerDisplayFeatures(Z.j jVar) {
        ?? r8 = jVar.f1947a;
        ArrayList arrayList = new ArrayList();
        for (Z.c cVar : r8) {
            cVar.f1930a.c().toString();
            W.b bVar = cVar.f1930a;
            int b2 = bVar.b();
            Z.b bVar2 = Z.b.f1923d;
            int i2 = 2;
            int i3 = ((b2 == 0 || bVar.a() == 0) ? Z.b.f1922c : bVar2) == bVar2 ? 3 : 2;
            Z.b bVar3 = Z.b.f1924e;
            Z.b bVar4 = cVar.f1932c;
            if (bVar4 != bVar3) {
                i2 = bVar4 == Z.b.f1925f ? 3 : 1;
            }
            arrayList.add(new io.flutter.embedding.engine.renderer.a(bVar.c(), i3, i2));
        }
        ArrayList arrayList2 = this.t.f7765y;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        e();
    }

    public t(AbstractActivityC0072e abstractActivityC0072e, n nVar) {
        super(abstractActivityC0072e, null);
        this.f1456a = false;
        this.f1462g = new HashSet();
        this.f1465j = new HashSet();
        this.t = new io.flutter.embedding.engine.renderer.g();
        this.f1475u = new C.j(16, this);
        this.f1476v = new D.a(this, new Handler(Looper.getMainLooper()), 1);
        this.f1477w = new r(this);
        this.f1478x = new C0073f(1, this);
        this.f1455B = new v();
        this.f1458c = nVar;
        this.f1460e = nVar;
        b();
    }
}
