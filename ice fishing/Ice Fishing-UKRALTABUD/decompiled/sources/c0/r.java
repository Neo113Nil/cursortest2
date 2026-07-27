package c0;

import D.C0013n;
import K0.AbstractC0025a;
import K0.AbstractC0046w;
import K0.C0044u;
import K0.U;
import K0.f0;
import L.C0051b;
import L.C0063n;
import L.Q;
import a.AbstractC0069a;
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
import d0.C0113c;
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
import l0.C0200c;
import m0.InterfaceC0208f;
import n0.C0220a;
import s.ExecutorC0256a;

/* loaded from: classes.dex */
public final class r extends FrameLayout {

    /* renamed from: A, reason: collision with root package name */
    public final B.a f1725A;

    /* renamed from: B, reason: collision with root package name */
    public final p f1726B;

    /* renamed from: C, reason: collision with root package name */
    public final C0105g f1727C;

    /* renamed from: D, reason: collision with root package name */
    public U.i f1728D;

    /* renamed from: E, reason: collision with root package name */
    public int f1729E;

    /* renamed from: F, reason: collision with root package name */
    public int f1730F;

    /* renamed from: G, reason: collision with root package name */
    public t f1731G;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1732f;

    /* renamed from: g, reason: collision with root package name */
    public final l f1733g;

    /* renamed from: h, reason: collision with root package name */
    public final n f1734h;

    /* renamed from: i, reason: collision with root package name */
    public C0108j f1735i;

    /* renamed from: j, reason: collision with root package name */
    public View f1736j;

    /* renamed from: k, reason: collision with root package name */
    public View f1737k;

    /* renamed from: l, reason: collision with root package name */
    public final HashSet f1738l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1739m;

    /* renamed from: n, reason: collision with root package name */
    public C0113c f1740n;

    /* renamed from: o, reason: collision with root package name */
    public final HashSet f1741o;

    /* renamed from: p, reason: collision with root package name */
    public Q f1742p;

    /* renamed from: q, reason: collision with root package name */
    public io.flutter.plugin.editing.l f1743q;
    public io.flutter.plugin.editing.h r;

    /* renamed from: s, reason: collision with root package name */
    public C0220a f1744s;

    /* renamed from: t, reason: collision with root package name */
    public C0051b f1745t;

    /* renamed from: u, reason: collision with root package name */
    public C0100b f1746u;

    /* renamed from: v, reason: collision with root package name */
    public io.flutter.view.h f1747v;

    /* renamed from: w, reason: collision with root package name */
    public TextServicesManager f1748w;

    /* renamed from: x, reason: collision with root package name */
    public A.j f1749x;

    /* renamed from: y, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.g f1750y;

    /* renamed from: z, reason: collision with root package name */
    public final A.j f1751z;

    public r(AbstractActivityC0104f abstractActivityC0104f, l lVar) {
        super(abstractActivityC0104f, null);
        this.f1732f = false;
        this.f1738l = new HashSet();
        this.f1741o = new HashSet();
        this.f1750y = new io.flutter.embedding.engine.renderer.g();
        this.f1751z = new A.j(14, this);
        this.f1725A = new B.a(this, new Handler(Looper.getMainLooper()), 1);
        this.f1726B = new p(this);
        this.f1727C = new C0105g(1, this);
        this.f1731G = new t();
        this.f1733g = lVar;
        this.f1736j = lVar;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public final void a() {
        SparseArray sparseArray;
        Objects.toString(this.f1740n);
        if (!c()) {
            return;
        }
        Iterator it = this.f1741o.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        getContext().getContentResolver().unregisterContentObserver(this.f1725A);
        io.flutter.plugin.platform.k kVar = this.f1740n.f1793s;
        int i2 = 0;
        while (true) {
            SparseArray sparseArray2 = kVar.f2477s;
            if (i2 >= sparseArray2.size()) {
                break;
            }
            kVar.f2467h.removeView((io.flutter.plugin.platform.g) sparseArray2.valueAt(i2));
            i2++;
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray3 = kVar.f2476q;
            if (i3 >= sparseArray3.size()) {
                kVar.c();
                if (kVar.f2467h == null) {
                    Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
                } else {
                    int i4 = 0;
                    while (true) {
                        sparseArray = kVar.r;
                        if (i4 >= sparseArray.size()) {
                            break;
                        }
                        kVar.f2467h.removeView((View) sparseArray.valueAt(i4));
                        i4++;
                    }
                    sparseArray.clear();
                }
                kVar.f2467h = null;
                kVar.f2479u = false;
                SparseArray sparseArray4 = kVar.f2475p;
                if (sparseArray4.size() > 0) {
                    sparseArray4.valueAt(0).getClass();
                    throw new ClassCastException();
                }
                io.flutter.plugin.platform.j jVar = this.f1740n.f1794t;
                int i5 = 0;
                while (true) {
                    SparseArray sparseArray5 = jVar.f2459m;
                    if (i5 >= sparseArray5.size()) {
                        Surface surface = jVar.f2462p;
                        if (surface != null) {
                            surface.release();
                            jVar.f2462p = null;
                            jVar.f2463q = null;
                        }
                        jVar.f2454h = null;
                        SparseArray sparseArray6 = jVar.f2458l;
                        if (sparseArray6.size() > 0) {
                            sparseArray6.valueAt(0).getClass();
                            throw new ClassCastException();
                        }
                        this.f1740n.f1793s.a();
                        this.f1740n.f1794t.a();
                        io.flutter.view.h hVar = this.f1747v;
                        hVar.f2603t = true;
                        hVar.f2589e.a();
                        hVar.r = null;
                        AccessibilityManager accessibilityManager = hVar.f2587c;
                        accessibilityManager.removeAccessibilityStateChangeListener(hVar.f2604u);
                        accessibilityManager.removeTouchExplorationStateChangeListener(hVar.f2605v);
                        hVar.f2590f.unregisterContentObserver(hVar.f2606w);
                        C0051b c0051b = hVar.f2586b;
                        c0051b.f604i = null;
                        ((FlutterJNI) c0051b.f602g).setAccessibilityDelegate(null);
                        this.f1747v = null;
                        this.f1743q.f2425b.restartInput(this);
                        this.f1743q.b();
                        int size = ((HashSet) this.f1745t.f602g).size();
                        if (size > 0) {
                            Log.w("KeyboardManager", "A KeyboardManager was destroyed with " + size + " unhandled redispatch event(s).");
                        }
                        io.flutter.plugin.editing.h hVar2 = this.r;
                        if (hVar2 != null) {
                            hVar2.f2408a.f2689g = null;
                            SpellCheckerSession spellCheckerSession = hVar2.f2410c;
                            if (spellCheckerSession != null) {
                                spellCheckerSession.close();
                            }
                        }
                        Q q2 = this.f1742p;
                        if (q2 != null) {
                            ((C0200c) q2.f598h).f2689g = null;
                        }
                        io.flutter.embedding.engine.renderer.h hVar3 = this.f1740n.f1777b;
                        this.f1739m = false;
                        hVar3.c(this.f1727C);
                        boolean z2 = this.f1732f;
                        FlutterJNI flutterJNI = hVar3.f2373a;
                        if (z2) {
                            flutterJNI.removeResizingFlutterUiListener(this.f1726B);
                        }
                        hVar3.e();
                        flutterJNI.setSemanticsEnabled(false);
                        View view = this.f1737k;
                        if (view != null && this.f1736j == this.f1735i) {
                            this.f1736j = view;
                        }
                        this.f1736j.d();
                        C0108j c0108j = this.f1735i;
                        if (c0108j != null) {
                            c0108j.f1702f.close();
                            removeView(this.f1735i);
                            this.f1735i = null;
                        }
                        this.f1737k = null;
                        this.f1740n = null;
                        return;
                    }
                    if (sparseArray5.valueAt(i5) != null) {
                        throw new ClassCastException();
                    }
                    jVar.f2454h.removeView(null);
                    i5++;
                }
            } else {
                if (sparseArray3.valueAt(i3) != null) {
                    throw new ClassCastException();
                }
                kVar.f2467h.removeView(null);
                i3++;
            }
        }
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        l0.o oVar;
        C0013n c0013n;
        C0013n c0013n2;
        CharSequence textValue;
        io.flutter.plugin.editing.l lVar = this.f1743q;
        if (lVar == null || Build.VERSION.SDK_INT < 26 || (oVar = lVar.f2429f) == null || lVar.f2430g == null || (c0013n = oVar.f2750j) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            l0.o oVar2 = (l0.o) lVar.f2430g.get(sparseArray.keyAt(i2));
            if (oVar2 != null && (c0013n2 = oVar2.f2750j) != null) {
                textValue = AbstractC0099a.f(sparseArray.valueAt(i2)).getTextValue();
                String charSequence = textValue.toString();
                l0.q qVar = new l0.q(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                String str = (String) c0013n2.f242a;
                if (str.equals((String) c0013n.f242a)) {
                    lVar.f2431h.f(qVar);
                } else {
                    hashMap.put(str, qVar);
                }
            }
        }
        int i3 = lVar.f2428e.f661c;
        Q q2 = lVar.f2427d;
        q2.getClass();
        hashMap.size();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            l0.q qVar2 = (l0.q) entry.getValue();
            hashMap2.put((String) entry.getKey(), Q.o(qVar2.f2757a, qVar2.f2758b, qVar2.f2759c, -1, -1));
        }
        ((C0051b) q2.f597g).D("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i3), hashMap2), null);
    }

    public final void b() {
        l lVar = this.f1733g;
        if (lVar != null) {
            addView(lVar);
        } else {
            n nVar = this.f1734h;
            if (nVar != null) {
                addView(nVar);
            } else {
                addView(this.f1735i);
            }
        }
        this.f1732f = AbstractC0069a.s(getContext());
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public final boolean c() {
        C0113c c0113c = this.f1740n;
        if (c0113c != null) {
            if (c0113c.f1777b == this.f1736j.getAttachedRenderer()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean checkInputConnectionProxy(View view) {
        C0113c c0113c = this.f1740n;
        if (c0113c == null) {
            return super.checkInputConnectionProxy(view);
        }
        io.flutter.plugin.platform.k kVar = c0113c.f1793s;
        if (view == null) {
            kVar.getClass();
            return false;
        }
        HashMap hashMap = kVar.f2474o;
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
        C0013n c0013n;
        List enabledSpellCheckerInfos;
        boolean z4;
        boolean isSpellCheckerEnabled;
        char c2 = (getResources().getConfiguration().uiMode & 48) == 32 ? (char) 2 : (char) 1;
        TextServicesManager textServicesManager = this.f1748w;
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
                isSpellCheckerEnabled = this.f1748w.isSpellCheckerEnabled();
                if (isSpellCheckerEnabled) {
                }
            }
            z2 = true;
            l0.n nVar = this.f1740n.f1790o;
            nVar.getClass();
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
            c0013n = nVar.f2740b;
            if (z3 || displayMetrics == null) {
                c0013n.i(hashMap, null);
            }
            l0.m mVar = new l0.m(displayMetrics);
            C0051b c0051b = nVar.f2739a;
            ((ConcurrentLinkedQueue) c0051b.f603h).add(mVar);
            l0.m mVar2 = (l0.m) c0051b.f604i;
            c0051b.f604i = mVar;
            Q q2 = mVar2 != null ? new Q(c0051b, mVar2, 18, false) : null;
            hashMap.put("configurationId", Integer.valueOf(mVar.f2737a));
            c0013n.i(hashMap, q2);
            return;
        }
        z2 = false;
        l0.n nVar2 = this.f1740n.f1790o;
        nVar2.getClass();
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
        c0013n = nVar2.f2740b;
        if (z3) {
        }
        c0013n.i(hashMap, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (c() && this.f1745t.B(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        if (!c()) {
            Log.w("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        float f2 = getResources().getDisplayMetrics().density;
        io.flutter.embedding.engine.renderer.g gVar = this.f1750y;
        gVar.f2348a = f2;
        gVar.f2366t = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        io.flutter.embedding.engine.renderer.h hVar = this.f1740n.f1777b;
        hVar.getClass();
        int i2 = gVar.f2349b;
        if (i2 == 0) {
            int i3 = gVar.f2351d;
            int i4 = gVar.f2352e;
            if (i3 <= 0 && i4 <= 0) {
                return;
            }
        } else {
            int i5 = gVar.f2350c;
            if (i5 == 0) {
                int i6 = gVar.f2353f;
                int i7 = gVar.f2354g;
                if (i6 <= 0 && i7 <= 0) {
                    return;
                }
            } else if (i2 <= 0 || i5 <= 0 || gVar.f2348a <= 0.0f) {
                return;
            }
        }
        ArrayList arrayList = gVar.f2371y;
        arrayList.size();
        ArrayList arrayList2 = gVar.f2372z;
        arrayList2.size();
        int size = arrayList2.size() + arrayList.size();
        int[] iArr = new int[size * 4];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            io.flutter.embedding.engine.renderer.a aVar = (io.flutter.embedding.engine.renderer.a) arrayList.get(i8);
            int i9 = i8 * 4;
            Rect rect = aVar.f2335a;
            iArr[i9] = rect.left;
            iArr[i9 + 1] = rect.top;
            iArr[i9 + 2] = rect.right;
            iArr[i9 + 3] = rect.bottom;
            iArr2[i8] = F.j.b(aVar.f2336b);
            iArr3[i8] = F.j.b(aVar.f2337c);
        }
        int size2 = arrayList.size() * 4;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            io.flutter.embedding.engine.renderer.a aVar2 = (io.flutter.embedding.engine.renderer.a) arrayList2.get(i10);
            int i11 = (i10 * 4) + size2;
            Rect rect2 = aVar2.f2335a;
            iArr[i11] = rect2.left;
            iArr[i11 + 1] = rect2.top;
            iArr[i11 + 2] = rect2.right;
            iArr[i11 + 3] = rect2.bottom;
            iArr2[arrayList.size() + i10] = F.j.b(aVar2.f2336b);
            iArr3[arrayList.size() + i10] = F.j.b(aVar2.f2337c);
        }
        hVar.f2373a.setViewportMetrics(gVar.f2348a, gVar.f2349b, gVar.f2350c, gVar.f2355h, gVar.f2356i, gVar.f2357j, gVar.f2358k, gVar.f2359l, gVar.f2360m, gVar.f2361n, gVar.f2362o, gVar.f2363p, gVar.f2364q, gVar.r, gVar.f2365s, gVar.f2366t, iArr, iArr2, iArr3, gVar.f2351d, gVar.f2352e, gVar.f2353f, gVar.f2354g, gVar.f2367u, gVar.f2368v, gVar.f2369w, gVar.f2370x);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.h hVar = this.f1747v;
        if (hVar == null || !hVar.f2587c.isEnabled()) {
            return null;
        }
        return this.f1747v;
    }

    public C0113c getAttachedFlutterEngine() {
        return this.f1740n;
    }

    public InterfaceC0208f getBinaryMessenger() {
        return this.f1740n.f1778c;
    }

    public C0108j getCurrentImageSurface() {
        return this.f1735i;
    }

    public io.flutter.embedding.engine.renderer.g getViewportMetrics() {
        return this.f1750y;
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
        io.flutter.embedding.engine.renderer.g gVar = this.f1750y;
        if (i24 == 29) {
            systemGestureInsets = windowInsets.getSystemGestureInsets();
            i20 = systemGestureInsets.top;
            gVar.f2363p = i20;
            i21 = systemGestureInsets.right;
            gVar.f2364q = i21;
            i22 = systemGestureInsets.bottom;
            gVar.r = i22;
            i23 = systemGestureInsets.left;
            gVar.f2365s = i23;
        }
        boolean z2 = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z3 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i24 >= 30) {
            systemBars = WindowInsets.Type.systemBars();
            insets = windowInsets.getInsets(systemBars);
            i4 = insets.top;
            gVar.f2355h = i4;
            i5 = insets.right;
            gVar.f2356i = i5;
            i6 = insets.bottom;
            gVar.f2357j = i6;
            i7 = insets.left;
            gVar.f2358k = i7;
            ime = WindowInsets.Type.ime();
            insets2 = windowInsets.getInsets(ime);
            i8 = insets2.top;
            gVar.f2359l = i8;
            i9 = insets2.right;
            gVar.f2360m = i9;
            i10 = insets2.bottom;
            gVar.f2361n = i10;
            i11 = insets2.left;
            gVar.f2362o = i11;
            systemGestures = WindowInsets.Type.systemGestures();
            insets3 = windowInsets.getInsets(systemGestures);
            i12 = insets3.top;
            gVar.f2363p = i12;
            i13 = insets3.right;
            gVar.f2364q = i13;
            i14 = insets3.bottom;
            gVar.r = i14;
            i15 = insets3.left;
            gVar.f2365s = i15;
            displayCutout2 = windowInsets.getDisplayCutout();
            if (displayCutout2 != null) {
                waterfallInsets = displayCutout2.getWaterfallInsets();
                int i25 = gVar.f2355h;
                i16 = waterfallInsets.top;
                int max = Math.max(i25, i16);
                safeInsetTop = displayCutout2.getSafeInsetTop();
                gVar.f2355h = Math.max(max, safeInsetTop);
                int i26 = gVar.f2356i;
                i17 = waterfallInsets.right;
                int max2 = Math.max(i26, i17);
                safeInsetRight = displayCutout2.getSafeInsetRight();
                gVar.f2356i = Math.max(max2, safeInsetRight);
                int i27 = gVar.f2357j;
                i18 = waterfallInsets.bottom;
                int max3 = Math.max(i27, i18);
                safeInsetBottom = displayCutout2.getSafeInsetBottom();
                gVar.f2357j = Math.max(max3, safeInsetBottom);
                int i28 = gVar.f2358k;
                i19 = waterfallInsets.left;
                int max4 = Math.max(i28, i19);
                safeInsetLeft = displayCutout2.getSafeInsetLeft();
                gVar.f2358k = Math.max(max4, safeInsetLeft);
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
                    gVar.f2355h = !z2 ? windowInsets.getSystemWindowInsetTop() : 0;
                    gVar.f2356i = (c2 != 3 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
                    if (z3) {
                        if ((((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom()) == 0) {
                            i2 = windowInsets.getSystemWindowInsetBottom();
                            gVar.f2357j = i2;
                            gVar.f2358k = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                            gVar.f2359l = 0;
                            gVar.f2360m = 0;
                            gVar.f2361n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom();
                            i3 = 0;
                            gVar.f2362o = 0;
                        }
                    }
                    i2 = 0;
                    gVar.f2357j = i2;
                    gVar.f2358k = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                    gVar.f2359l = 0;
                    gVar.f2360m = 0;
                    gVar.f2361n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom();
                    i3 = 0;
                    gVar.f2362o = 0;
                }
            }
            c2 = 1;
            gVar.f2355h = !z2 ? windowInsets.getSystemWindowInsetTop() : 0;
            gVar.f2356i = (c2 != 3 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
            if (z3) {
            }
            i2 = 0;
            gVar.f2357j = i2;
            gVar.f2358k = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
            gVar.f2359l = 0;
            gVar.f2360m = 0;
            gVar.f2361n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom();
            i3 = 0;
            gVar.f2362o = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (i24 >= 28 && displayCutout != null) {
            boundingRects2 = displayCutout.getBoundingRects();
            for (Rect rect : boundingRects2) {
                rect.toString();
                arrayList.add(new io.flutter.embedding.engine.renderer.a(rect, 4, 1));
            }
        }
        ArrayList arrayList2 = gVar.f2372z;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (Build.VERSION.SDK_INT >= 35) {
            t tVar = this.f1731G;
            Context context2 = getContext();
            tVar.getClass();
            Activity q2 = o.g.q(context2);
            WindowInsets windowInsets2 = null;
            if (q2 != null && (window = q2.getWindow()) != null) {
                windowInsets2 = window.getDecorView().getRootWindowInsets();
            }
            if (windowInsets2 == null) {
                boundingRects = Collections.emptyList();
            } else {
                captionBar = WindowInsets.Type.captionBar();
                boundingRects = windowInsets2.getBoundingRects(captionBar);
            }
            int i29 = gVar.f2355h;
            Iterator it = boundingRects.iterator();
            while (it.hasNext()) {
                i29 = Math.max(i29, ((Rect) it.next()).bottom);
            }
            gVar.f2355h = i29;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            roundedCorner = windowInsets.getRoundedCorner(0);
            roundedCorner2 = windowInsets.getRoundedCorner(1);
            roundedCorner3 = windowInsets.getRoundedCorner(2);
            roundedCorner4 = windowInsets.getRoundedCorner(3);
            gVar.f2367u = roundedCorner != null ? roundedCorner.getRadius() : i3;
            gVar.f2368v = roundedCorner2 != null ? roundedCorner2.getRadius() : i3;
            gVar.f2369w = roundedCorner3 != null ? roundedCorner3.getRadius() : i3;
            gVar.f2370x = roundedCorner4 != null ? roundedCorner4.getRadius() : i3;
        }
        e();
        return onApplyWindowInsets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [N0.d] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        A.j jVar;
        v0.j jVar2 = v0.j.f3009f;
        super.onAttachedToWindow();
        try {
            U.g gVar = U.h.f1027c;
            Context context = getContext();
            gVar.getClass();
            jVar = new A.j(15, new Q(U.g.a(context)));
        } catch (NoClassDefFoundError unused) {
            jVar = null;
        }
        this.f1749x = jVar;
        Activity q2 = o.g.q(getContext());
        A.j jVar3 = this.f1749x;
        if (jVar3 == null || q2 == null) {
            return;
        }
        this.f1728D = new U.i(1, this);
        Context context2 = getContext();
        Executor a2 = Build.VERSION.SDK_INT >= 28 ? n.b.a(context2) : new ExecutorC0256a(new Handler(context2.getMainLooper()));
        U.i iVar = this.f1728D;
        Q q3 = (Q) jVar3.f30g;
        E0.i.e(a2, "executor");
        E0.i.e(iVar, "consumer");
        U.b bVar = (U.b) q3.f597g;
        bVar.getClass();
        N0.c cVar = new N0.c(new U.j(bVar, q2, null), jVar2, -2, 1);
        R0.d dVar = K0.C.f463a;
        L0.c cVar2 = P0.p.f898a;
        if (cVar2.i(C0044u.f534g) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + cVar2).toString());
        }
        N0.c cVar3 = cVar;
        if (!cVar2.equals(jVar2)) {
            cVar3 = O0.l.a(cVar, cVar2, 0, 0, 6);
        }
        Q q4 = (Q) q3.f598h;
        q4.getClass();
        E0.i.e(cVar3, "flow");
        ReentrantLock reentrantLock = (ReentrantLock) q4.f597g;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = (LinkedHashMap) q4.f598h;
        try {
            if (linkedHashMap.get(iVar) == null) {
                v0.i k2 = new K0.K(a2);
                if (k2.i(C0044u.f534g) == null) {
                    k2 = k2.f(new U(null));
                }
                S.a aVar = new S.a(cVar3, iVar, null);
                v0.i a3 = AbstractC0046w.a(k2, jVar2, true);
                R0.d dVar2 = K0.C.f463a;
                if (a3 != dVar2 && a3.i(v0.e.f3008f) == null) {
                    a3 = a3.f(dVar2);
                }
                AbstractC0025a f0Var = new f0(a3, true);
                f0Var.W(1, f0Var, aVar);
                linkedHashMap.put(iVar, f0Var);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f1740n != null) {
            this.f1744s.b(configuration);
            d();
            o.g.b(getContext(), this.f1740n);
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
        io.flutter.plugin.editing.l lVar = this.f1743q;
        C0051b c0051b = this.f1745t;
        C0063n c0063n = lVar.f2428e;
        int i5 = c0063n.f660b;
        if (i5 == 1) {
            lVar.f2433j = null;
            return null;
        }
        int i6 = 4;
        if (i5 == 4) {
            return null;
        }
        if (i5 == 3) {
            if (lVar.f2439p) {
                return lVar.f2433j;
            }
            lVar.f2434k.f(c0063n.f661c);
            throw null;
        }
        l0.o oVar = lVar.f2429f;
        l0.p pVar = oVar.f2747g;
        int i7 = pVar.f2754a;
        if (i7 != 2) {
            if (i7 == 5) {
                int i8 = pVar.f2755b ? 4098 : 2;
                if (pVar.f2756c) {
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
                if (!oVar.f2741a) {
                    if (oVar.f2742b) {
                        i2 |= 32768;
                    }
                    i4 = oVar.f2743c ? 524416 : 524432;
                    i3 = oVar.f2746f;
                    if (i3 != 1) {
                        i2 |= 4096;
                    } else if (i3 == 2) {
                        i2 |= 8192;
                    } else if (i3 == 3) {
                        i2 |= 16384;
                    }
                    i6 = i2;
                }
                i2 |= i4;
                i3 = oVar.f2746f;
                if (i3 != 1) {
                }
                i6 = i2;
            }
        }
        editorInfo.inputType = i6;
        editorInfo.imeOptions = 33554432;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26 && !oVar.f2744d) {
            editorInfo.imeOptions = 50331648;
        }
        int intValue = oVar.f2748h.intValue();
        l0.o oVar2 = lVar.f2429f;
        String str = oVar2.f2749i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = intValue;
        }
        editorInfo.imeOptions = intValue | editorInfo.imeOptions;
        if (oVar2.f2753m != null) {
            editorInfo.hintLocales = new LocaleList(lVar.f2429f.f2753m);
        }
        String[] strArr = lVar.f2429f.f2751k;
        if (strArr != null) {
            editorInfo.contentMimeTypes = strArr;
        }
        if (i9 >= 34) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
        }
        io.flutter.plugin.editing.c cVar = new io.flutter.plugin.editing.c(this, lVar.f2428e.f661c, lVar.f2427d, c0051b, lVar.f2431h, editorInfo);
        io.flutter.plugin.editing.f fVar = lVar.f2431h;
        fVar.getClass();
        editorInfo.initialSelStart = Selection.getSelectionStart(fVar);
        io.flutter.plugin.editing.f fVar2 = lVar.f2431h;
        fVar2.getClass();
        editorInfo.initialSelEnd = Selection.getSelectionEnd(fVar2);
        lVar.f2433j = cVar;
        return cVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        U.i iVar;
        A.j jVar = this.f1749x;
        if (jVar != null && (iVar = this.f1728D) != null) {
            Q q2 = (Q) ((Q) jVar.f30g).f598h;
            q2.getClass();
            ReentrantLock reentrantLock = (ReentrantLock) q2.f597g;
            reentrantLock.lock();
            LinkedHashMap linkedHashMap = (LinkedHashMap) q2.f598h;
            try {
                K0.Q q3 = (K0.Q) linkedHashMap.get(iVar);
                if (q3 != null) {
                    q3.a(null);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        this.f1728D = null;
        this.f1749x = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (c()) {
            C0100b c0100b = this.f1746u;
            Context context = getContext();
            c0100b.getClass();
            boolean isFromSource = motionEvent.isFromSource(2);
            boolean z2 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
            if (isFromSource && z2) {
                int b2 = C0100b.b(motionEvent.getActionMasked());
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                c0100b.a(motionEvent, motionEvent.getActionIndex(), b2, 0, C0100b.f1673f, allocateDirect, context);
                if (allocateDirect.position() % 288 != 0) {
                    throw new AssertionError("Packet position is not on field boundary.");
                }
                c0100b.f1674a.f2373a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return !c() ? super.onHoverEvent(motionEvent) : this.f1747v.e(motionEvent, false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        this.f1729E = View.MeasureSpec.getMode(i2);
        this.f1730F = View.MeasureSpec.getMode(i3);
        super.onMeasure(i2, i3);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i2) {
        Rect rect;
        super.onProvideAutofillVirtualStructure(viewStructure, i2);
        io.flutter.plugin.editing.l lVar = this.f1743q;
        if (lVar == null || Build.VERSION.SDK_INT < 26 || lVar.f2430g == null) {
            return;
        }
        String str = (String) lVar.f2429f.f2750j.f242a;
        AutofillId autofillId = viewStructure.getAutofillId();
        for (int i3 = 0; i3 < lVar.f2430g.size(); i3++) {
            int keyAt = lVar.f2430g.keyAt(i3);
            C0013n c0013n = ((l0.o) lVar.f2430g.valueAt(i3)).f2750j;
            if (c0013n != null) {
                viewStructure.addChildCount(1);
                ViewStructure newChild = viewStructure.newChild(i3);
                newChild.setAutofillId(autofillId, keyAt);
                String[] strArr = (String[]) c0013n.f243b;
                if (strArr.length > 0) {
                    newChild.setAutofillHints(strArr);
                }
                newChild.setAutofillType(1);
                newChild.setVisibility(0);
                String str2 = (String) c0013n.f245d;
                if (str2 != null) {
                    newChild.setHint(str2);
                }
                if (str.hashCode() != keyAt || (rect = lVar.f2436m) == null) {
                    newChild.setDimens(0, 0, 0, 0, 1, 1);
                    newChild.setAutofillValue(AutofillValue.forText(((l0.q) c0013n.f244c).f2757a));
                } else {
                    newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), lVar.f2436m.height());
                    newChild.setAutofillValue(AutofillValue.forText(lVar.f2431h));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        io.flutter.embedding.engine.renderer.g gVar = this.f1750y;
        gVar.f2349b = i2;
        gVar.f2350c = i3;
        boolean z2 = this.f1732f;
        if (z2 && this.f1730F == 0) {
            gVar.f2353f = 0;
            gVar.f2354g = 8192;
        } else {
            gVar.f2353f = i3;
            gVar.f2354g = i3;
        }
        if (z2 && this.f1729E == 0) {
            gVar.f2351d = 0;
            gVar.f2352e = 8192;
        } else {
            gVar.f2351d = i2;
            gVar.f2352e = i2;
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
        C0100b c0100b = this.f1746u;
        Matrix matrix = C0100b.f1673f;
        c0100b.getClass();
        int actionMasked = motionEvent.getActionMasked();
        int b2 = C0100b.b(motionEvent.getActionMasked());
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
            c0100b.a(motionEvent, motionEvent.getActionIndex(), b2, 0, matrix, allocateDirect, null);
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
                        c0100b.a(motionEvent, i5, 5, 1, matrix, byteBuffer2, null);
                    }
                    i5++;
                    pointerCount = i2;
                    byteBuffer3 = byteBuffer2;
                    i3 = 1;
                }
                byteBuffer = byteBuffer3;
                c0100b.a(motionEvent, motionEvent.getActionIndex(), b2, 0, matrix, byteBuffer, null);
                if (i4 != 0) {
                    c0100b.a(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, byteBuffer, null);
                }
            } else {
                byteBuffer = byteBuffer3;
                for (int i6 = 0; i6 < pointerCount; i6++) {
                    c0100b.a(motionEvent, i6, b2, (pointerCount << 8) | 2, matrix, byteBuffer, null);
                }
            }
        }
        if (byteBuffer.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary");
        }
        c0100b.f1674a.f2373a.dispatchPointerDataPacket(byteBuffer, byteBuffer.position());
        return true;
    }

    public void setDelegate(t tVar) {
        this.f1731G = tVar;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        View view = this.f1736j;
        if (view instanceof l) {
            ((l) view).setVisibility(i2);
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    public void setWindowInfoListenerDisplayFeatures(U.k kVar) {
        ?? r8 = kVar.f1034a;
        ArrayList arrayList = new ArrayList();
        for (U.c cVar : r8) {
            cVar.f1015a.c().toString();
            R.b bVar = cVar.f1015a;
            int b2 = bVar.b();
            U.b bVar2 = U.b.f1008i;
            int i2 = 2;
            int i3 = ((b2 == 0 || bVar.a() == 0) ? U.b.f1007h : bVar2) == bVar2 ? 3 : 2;
            U.b bVar3 = U.b.f1009j;
            U.b bVar4 = cVar.f1017c;
            if (bVar4 != bVar3) {
                i2 = bVar4 == U.b.f1010k ? 3 : 1;
            }
            arrayList.add(new io.flutter.embedding.engine.renderer.a(bVar.c(), i3, i2));
        }
        ArrayList arrayList2 = this.f1750y.f2371y;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        e();
    }

    public r(AbstractActivityC0104f abstractActivityC0104f, n nVar) {
        super(abstractActivityC0104f, null);
        this.f1732f = false;
        this.f1738l = new HashSet();
        this.f1741o = new HashSet();
        this.f1750y = new io.flutter.embedding.engine.renderer.g();
        this.f1751z = new A.j(14, this);
        this.f1725A = new B.a(this, new Handler(Looper.getMainLooper()), 1);
        this.f1726B = new p(this);
        this.f1727C = new C0105g(1, this);
        this.f1731G = new t();
        this.f1734h = nVar;
        this.f1736j = nVar;
        b();
    }
}
