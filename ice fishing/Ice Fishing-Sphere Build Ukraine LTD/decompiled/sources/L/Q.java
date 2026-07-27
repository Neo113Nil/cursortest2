package L;

import D.C0013n;
import D.C0015p;
import D.C0016q;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import c.AbstractC0097a;
import d.AbstractC0110a;
import e0.C0126b;
import e0.C0131g;
import h.AbstractC0180y;
import h.C0171o;
import h.j0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantLock;
import l0.C0199b;
import l0.C0200c;
import l0.C0203f;
import l0.C0208k;
import l0.C0210m;
import l0.EnumC0204g;
import m0.InterfaceC0217b;
import m0.InterfaceC0218c;
import m0.InterfaceC0219d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r0.C0242n;
import t0.C0252g;

/* loaded from: classes.dex */
public final class Q implements O0.d, U.h, c0.B, io.flutter.plugin.platform.h, m0.k, InterfaceC0218c, InterfaceC0219d {

    /* renamed from: h, reason: collision with root package name */
    public static Q f516h;

    /* renamed from: i, reason: collision with root package name */
    public static c0.C f517i;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f518e;

    /* renamed from: f, reason: collision with root package name */
    public Object f519f;

    /* renamed from: g, reason: collision with root package name */
    public Object f520g;

    public /* synthetic */ Q(int i2, Object obj, Object obj2) {
        this.f518e = i2;
        this.f519f = obj;
        this.f520g = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0088, code lost:
    
        if (r2 != 8) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int j(Q q2, JSONArray jSONArray) {
        String str;
        q2.getClass();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            String string = jSONArray.getString(i4);
            for (int i5 : F.j.c(4)) {
                if (i5 == 1) {
                    str = "DeviceOrientation.portraitUp";
                } else if (i5 == 2) {
                    str = "DeviceOrientation.portraitDown";
                } else if (i5 == 3) {
                    str = "DeviceOrientation.landscapeLeft";
                } else {
                    if (i5 != 4) {
                        throw null;
                    }
                    str = "DeviceOrientation.landscapeRight";
                }
                if (str.equals(string)) {
                    int b2 = F.j.b(i5);
                    if (b2 == 0) {
                        i2 |= 1;
                    } else if (b2 == 1) {
                        i2 |= 4;
                    } else if (b2 == 2) {
                        i2 |= 2;
                    } else if (b2 == 3) {
                        i2 |= 8;
                    }
                    if (i3 == 0) {
                        i3 = i2;
                    }
                }
            }
            throw new NoSuchFieldException(E0.h.f("No such DeviceOrientation: ", string));
        }
        if (i2 == 0) {
            return -1;
        }
        switch (i2) {
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                return 0;
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
            case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
            case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 12:
            case 13:
            case 14:
                if (i3 == 2) {
                    return 0;
                }
                if (i3 != 4) {
                }
                return 9;
            case F.k.LONG_FIELD_NUMBER /* 4 */:
                return 9;
            case F.k.STRING_FIELD_NUMBER /* 5 */:
                return 12;
            case F.k.BYTES_FIELD_NUMBER /* 8 */:
                return 8;
            case 10:
                return 11;
            case 11:
                return 2;
            case 15:
                return 13;
            default:
                return 1;
        }
    }

    public static ArrayList k(Q q2, JSONArray jSONArray) {
        q2.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String string = jSONArray.getString(i2);
            for (EnumC0204g enumC0204g : EnumC0204g.values()) {
                if (enumC0204g.f2715e.equals(string)) {
                    int ordinal = enumC0204g.ordinal();
                    if (ordinal == 0) {
                        arrayList.add(EnumC0204g.f2712f);
                    } else if (ordinal == 1) {
                        arrayList.add(EnumC0204g.f2713g);
                    }
                }
            }
            throw new NoSuchFieldException(E0.h.f("No such SystemUiOverlay: ", string));
        }
        return arrayList;
    }

    public static int l(Q q2, String str) {
        String str2;
        q2.getClass();
        for (int i2 : F.j.c(4)) {
            if (i2 == 1) {
                str2 = "SystemUiMode.leanBack";
            } else if (i2 == 2) {
                str2 = "SystemUiMode.immersive";
            } else if (i2 == 3) {
                str2 = "SystemUiMode.immersiveSticky";
            } else {
                if (i2 != 4) {
                    throw null;
                }
                str2 = "SystemUiMode.edgeToEdge";
            }
            if (str2.equals(str)) {
                int b2 = F.j.b(i2);
                if (b2 == 0) {
                    return 1;
                }
                if (b2 != 1) {
                    return b2 != 2 ? 4 : 3;
                }
                return 2;
            }
        }
        throw new NoSuchFieldException(E0.h.f("No such SystemUiMode: ", str));
    }

    public static C0203f m(Q q2, JSONObject jSONObject) {
        q2.getClass();
        return new C0203f(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? E0.h.a(jSONObject.getString("statusBarIconBrightness")) : 0, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? E0.h.a(jSONObject.getString("systemNavigationBarIconBrightness")) : 0, !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    public static HashMap o(String str, int i2, int i3, int i4, int i5) {
        HashMap hashMap = new HashMap();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i2));
        hashMap.put("selectionExtent", Integer.valueOf(i3));
        hashMap.put("composingBase", Integer.valueOf(i4));
        hashMap.put("composingExtent", Integer.valueOf(i5));
        return hashMap;
    }

    @Override // io.flutter.plugin.platform.h
    public void a() {
        ((io.flutter.plugin.platform.k) this.f519f).a();
        ((io.flutter.plugin.platform.j) this.f520g).a();
    }

    @Override // c0.B
    public void b(KeyEvent keyEvent, final c0.z zVar) {
        int action = keyEvent.getAction();
        if (action != 0 && action != 1) {
            zVar.a(false);
            return;
        }
        Character a2 = ((S0.i) this.f520g).a(keyEvent.getUnicodeChar());
        boolean z2 = action != 0;
        final InterfaceC0218c interfaceC0218c = new InterfaceC0218c() { // from class: c0.u
            @Override // m0.InterfaceC0218c
            public void e(Object obj) {
                boolean z3 = false;
                if (obj != null) {
                    try {
                        z3 = ((JSONObject) obj).getBoolean("handled");
                    } catch (JSONException e2) {
                        Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e2);
                    }
                }
                ((z) zVar).a(z3);
            }
        };
        C0199b c0199b = (C0199b) this.f519f;
        HashMap hashMap = new HashMap();
        hashMap.put("type", z2 ? "keyup" : "keydown");
        hashMap.put("keymap", "android");
        hashMap.put("flags", Integer.valueOf(keyEvent.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(keyEvent.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(keyEvent.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(keyEvent.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(keyEvent.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(keyEvent.getMetaState()));
        hashMap.put("character", a2.toString());
        hashMap.put("source", Integer.valueOf(keyEvent.getSource()));
        hashMap.put("deviceId", Integer.valueOf(keyEvent.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(keyEvent.getRepeatCount()));
        c0199b.f2695a.i(hashMap, new InterfaceC0218c() { // from class: c0.u
            @Override // m0.InterfaceC0218c
            public void e(Object obj) {
                boolean z3 = false;
                if (obj != null) {
                    try {
                        z3 = ((JSONObject) obj).getBoolean("handled");
                    } catch (JSONException e2) {
                        Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e2);
                    }
                }
                ((z) interfaceC0218c).a(z3);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bb  */
    @Override // O0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(O0.e eVar, v0.d dVar) {
        O0.j jVar;
        int i2;
        Throwable th;
        P0.n nVar;
        Q q2;
        O0.e eVar2;
        O0.m mVar;
        int i3;
        C0242n c0242n;
        switch (this.f518e) {
            case 1:
                if (dVar instanceof O0.j) {
                    jVar = (O0.j) dVar;
                    int i4 = jVar.f777i;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        jVar.f777i = i4 - Integer.MIN_VALUE;
                        Object obj = jVar.f776h;
                        w0.a aVar = w0.a.f3076e;
                        i2 = jVar.f777i;
                        if (i2 != 0) {
                            o.g.z(obj);
                            v0.i iVar = jVar.f3091f;
                            E0.i.b(iVar);
                            P0.n nVar2 = new P0.n(eVar, iVar);
                            try {
                                C0015p c0015p = (C0015p) this.f519f;
                                jVar.f779k = this;
                                jVar.f780l = eVar;
                                jVar.f781m = nVar2;
                                jVar.f777i = 1;
                                if (c0015p.f(nVar2, jVar) == aVar) {
                                    return aVar;
                                }
                                q2 = this;
                                eVar2 = eVar;
                                nVar = nVar2;
                            } catch (Throwable th2) {
                                th = th2;
                                nVar = nVar2;
                                nVar.o();
                                throw th;
                            }
                        } else {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                o.g.z(obj);
                                return C0252g.f2994a;
                            }
                            nVar = jVar.f781m;
                            eVar2 = jVar.f780l;
                            q2 = jVar.f779k;
                            try {
                                o.g.z(obj);
                            } catch (Throwable th3) {
                                th = th3;
                                nVar.o();
                                throw th;
                            }
                        }
                        nVar.o();
                        O0.q qVar = (O0.q) q2.f520g;
                        jVar.f779k = null;
                        jVar.f780l = null;
                        jVar.f781m = null;
                        jVar.f777i = 2;
                        qVar.c(eVar2, jVar);
                        return aVar;
                    }
                }
                jVar = new O0.j(this, dVar);
                Object obj2 = jVar.f776h;
                w0.a aVar2 = w0.a.f3076e;
                i2 = jVar.f777i;
                if (i2 != 0) {
                }
                nVar.o();
                O0.q qVar2 = (O0.q) q2.f520g;
                jVar.f779k = null;
                jVar.f780l = null;
                jVar.f781m = null;
                jVar.f777i = 2;
                qVar2.c(eVar2, jVar);
                return aVar2;
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                Object c2 = ((Q) this.f519f).c(new O0.l(new E0.n(), eVar, (D.r) this.f520g), dVar);
                return c2 == w0.a.f3076e ? c2 : C0252g.f2994a;
            default:
                if (dVar instanceof O0.m) {
                    mVar = (O0.m) dVar;
                    int i5 = mVar.f792i;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        mVar.f792i = i5 - Integer.MIN_VALUE;
                        Object obj3 = mVar.f791h;
                        w0.a aVar3 = w0.a.f3076e;
                        i3 = mVar.f792i;
                        if (i3 != 0) {
                            o.g.z(obj3);
                            Q q3 = (Q) this.f519f;
                            C0242n c0242n2 = new C0242n((C0016q) this.f520g, eVar);
                            try {
                                mVar.f794k = c0242n2;
                                mVar.f792i = 1;
                                if (q3.c(c0242n2, mVar) == aVar3) {
                                    return aVar3;
                                }
                            } catch (P0.a e2) {
                                e = e2;
                                c0242n = c0242n2;
                                if (e.f829e != c0242n) {
                                }
                                return C0252g.f2994a;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c0242n = mVar.f794k;
                            try {
                                o.g.z(obj3);
                            } catch (P0.a e3) {
                                e = e3;
                                if (e.f829e != c0242n) {
                                    throw e;
                                }
                                return C0252g.f2994a;
                            }
                        }
                        return C0252g.f2994a;
                    }
                }
                mVar = new O0.m(this, dVar);
                Object obj32 = mVar.f791h;
                w0.a aVar32 = w0.a.f3076e;
                i3 = mVar.f792i;
                if (i3 != 0) {
                }
                return C0252g.f2994a;
        }
    }

    @Override // io.flutter.plugin.platform.h
    public void d(io.flutter.view.h hVar) {
        ((io.flutter.plugin.platform.k) this.f519f).f2480l.f2448a = hVar;
        ((io.flutter.plugin.platform.j) this.f520g).f2465j.f2448a = hVar;
    }

    @Override // m0.InterfaceC0218c
    public void e(Object obj) {
        switch (this.f518e) {
            case 18:
                C0026b c0026b = (C0026b) this.f520g;
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) c0026b.f525g;
                C0210m c0210m = (C0210m) this.f519f;
                concurrentLinkedQueue.remove(c0210m);
                if (!((ConcurrentLinkedQueue) c0026b.f525g).isEmpty()) {
                    Log.e("SettingsChannel", "The queue becomes empty after removing config generation " + c0210m.f2745a);
                    break;
                }
                break;
            default:
                ((C0131g) this.f519f).a(((m0.j) ((C0013n) ((Q) this.f520g).f520g).f245c).b(obj));
                break;
        }
    }

    @Override // io.flutter.plugin.platform.h
    public void f(int i2) {
        ((io.flutter.plugin.platform.j) this.f520g).f(i2);
        ((io.flutter.plugin.platform.k) this.f519f).f(i2);
    }

    @Override // io.flutter.plugin.platform.h
    public boolean g(int i2) {
        ((io.flutter.plugin.platform.j) this.f520g).f(i2);
        return ((io.flutter.plugin.platform.k) this.f519f).g(i2);
    }

    @Override // m0.k
    public void i(Q q2, C0208k c0208k) {
        C0200c c0200c = (C0200c) this.f520g;
        if (((C0026b) c0200c.f2697f) == null) {
            c0208k.c((Map) this.f519f);
            return;
        }
        String str = (String) q2.f519f;
        str.getClass();
        if (!str.equals("getKeyboardState")) {
            c0208k.b();
            return;
        }
        try {
            this.f519f = Collections.unmodifiableMap(((c0.y) ((c0.B[]) ((C0026b) c0200c.f2697f).f525g)[0]).f1775f);
        } catch (IllegalStateException e2) {
            c0208k.a("error", e2.getMessage(), null);
        }
        c0208k.c((Map) this.f519f);
    }

    public void n() {
        j0 j0Var;
        ImageView imageView = (ImageView) this.f519f;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            Rect rect = AbstractC0180y.f2319a;
        }
        if (drawable == null || (j0Var = (j0) this.f520g) == null) {
            return;
        }
        C0171o.c(drawable, j0Var, imageView.getDrawableState());
    }

    @Override // m0.InterfaceC0219d
    public void p(ByteBuffer byteBuffer, C0131g c0131g) {
        switch (this.f518e) {
            case 21:
                C0013n c0013n = (C0013n) this.f520g;
                try {
                    ((InterfaceC0217b) this.f519f).k(((m0.j) c0013n.f245c).a(byteBuffer), new Q(this, c0131g, 20, false));
                    break;
                } catch (RuntimeException e2) {
                    Log.e("BasicMessageChannel#" + ((String) c0013n.f244b), "Failed to handle message", e2);
                    c0131g.a(null);
                    return;
                }
            default:
                C0026b c0026b = (C0026b) this.f520g;
                try {
                    ((m0.k) this.f519f).i(((m0.l) c0026b.f526h).e(byteBuffer), new C0208k(1, this, c0131g));
                    break;
                } catch (RuntimeException e3) {
                    Log.e("MethodChannel#".concat((String) c0026b.f524f), "Failed to handle method call", e3);
                    c0131g.a(((m0.l) c0026b.f526h).a(e3.getMessage(), Log.getStackTraceString(e3)));
                }
        }
    }

    public View q(int i2, int i3, int i4, int i5) {
        int s2;
        int i6;
        int t2;
        View o2;
        int left;
        int i7;
        int right;
        int i8;
        w wVar = (w) this.f519f;
        switch (wVar.f598a) {
            case 0:
                s2 = wVar.f599b.s();
                break;
            default:
                s2 = wVar.f599b.u();
                break;
        }
        switch (wVar.f598a) {
            case 0:
                x xVar = wVar.f599b;
                i6 = xVar.f605f;
                t2 = xVar.t();
                break;
            default:
                x xVar2 = wVar.f599b;
                i6 = xVar2.f606g;
                t2 = xVar2.r();
                break;
        }
        int i9 = i6 - t2;
        int i10 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            switch (wVar.f598a) {
                case 0:
                    o2 = wVar.f599b.o(i2);
                    break;
                default:
                    o2 = wVar.f599b.o(i2);
                    break;
            }
            switch (wVar.f598a) {
                case 0:
                    y yVar = (y) o2.getLayoutParams();
                    wVar.f599b.getClass();
                    left = o2.getLeft() - ((y) o2.getLayoutParams()).f607a.left;
                    i7 = ((ViewGroup.MarginLayoutParams) yVar).leftMargin;
                    break;
                default:
                    y yVar2 = (y) o2.getLayoutParams();
                    wVar.f599b.getClass();
                    left = o2.getTop() - ((y) o2.getLayoutParams()).f607a.top;
                    i7 = ((ViewGroup.MarginLayoutParams) yVar2).topMargin;
                    break;
            }
            int i11 = left - i7;
            switch (wVar.f598a) {
                case 0:
                    y yVar3 = (y) o2.getLayoutParams();
                    wVar.f599b.getClass();
                    right = o2.getRight() + ((y) o2.getLayoutParams()).f607a.right;
                    i8 = ((ViewGroup.MarginLayoutParams) yVar3).rightMargin;
                    break;
                default:
                    y yVar4 = (y) o2.getLayoutParams();
                    wVar.f599b.getClass();
                    right = o2.getBottom() + ((y) o2.getLayoutParams()).f607a.bottom;
                    i8 = ((ViewGroup.MarginLayoutParams) yVar4).bottomMargin;
                    break;
            }
            int i12 = right + i8;
            P p2 = (P) this.f520g;
            p2.f512b = s2;
            p2.f513c = i9;
            p2.f514d = i11;
            p2.f515e = i12;
            if (i4 != 0) {
                p2.f511a = i4;
                if (p2.a()) {
                    return o2;
                }
            }
            if (i5 != 0) {
                p2.f511a = i5;
                if (p2.a()) {
                    view = o2;
                }
            }
            i2 += i10;
        }
        return view;
    }

    public void r(int i2) {
        int resourceId;
        ImageView imageView = (ImageView) this.f519f;
        C0026b E2 = C0026b.E(imageView.getContext(), null, AbstractC0097a.f1641e, i2);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) E2.f524f;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC0110a.a(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                Rect rect = AbstractC0180y.f2319a;
            }
            if (typedArray.hasValue(2)) {
                A.f.c(imageView, E2.w(2));
            }
            if (typedArray.hasValue(3)) {
                A.f.d(imageView, AbstractC0180y.c(typedArray.getInt(3, -1), null));
            }
            E2.H();
        } catch (Throwable th) {
            E2.H();
            throw th;
        }
    }

    public void s(t.f fVar) {
        int i2 = fVar.f2971b;
        Handler handler = (Handler) this.f520g;
        C0200c c0200c = (C0200c) this.f519f;
        if (i2 == 0) {
            handler.post(new Q0.i(c0200c, fVar.f2970a, 3, false));
        } else {
            handler.post(new A.b(c0200c, i2));
        }
    }

    public /* synthetic */ Q(int i2, boolean z2) {
        this.f518e = i2;
    }

    public /* synthetic */ Q(Object obj, Object obj2, int i2, boolean z2) {
        this.f518e = i2;
        this.f520g = obj;
        this.f519f = obj2;
    }

    public Q(c0.r rVar, C0200c c0200c) {
        this.f518e = 24;
        this.f519f = rVar;
        this.f520g = c0200c;
        c0200c.f2697f = new C0200c(19, this);
    }

    public Q(C0199b c0199b) {
        this.f518e = 7;
        this.f520g = new S0.i();
        this.f519f = c0199b;
    }

    public Q(C0200c c0200c) {
        this.f518e = 14;
        this.f520g = c0200c;
        this.f519f = new HashMap();
    }

    public Q(int i2) {
        this.f518e = i2;
        switch (i2) {
            case F.k.BYTES_FIELD_NUMBER /* 8 */:
                this.f519f = new LongSparseArray();
                this.f520g = new PriorityQueue();
                break;
            default:
                this.f519f = new ReentrantLock();
                this.f520g = new LinkedHashMap();
                break;
        }
    }

    public Q(c0.r rVar, InputMethodManager inputMethodManager, C0200c c0200c) {
        this.f518e = 11;
        if (Build.VERSION.SDK_INT >= 33) {
            rVar.setAutoHandwritingEnabled(false);
        }
        this.f520g = rVar;
        this.f519f = inputMethodManager;
        c0200c.f2697f = this;
    }

    public Q(U.b bVar) {
        this.f518e = 5;
        Q q2 = new Q(4);
        this.f519f = bVar;
        this.f520g = q2;
    }

    public Q(ImageView imageView) {
        this.f518e = 9;
        this.f519f = imageView;
    }

    public Q(C0126b c0126b, int i2) {
        this.f518e = i2;
        switch (i2) {
            case 16:
                C0200c c0200c = new C0200c(4, this);
                C0026b c0026b = new C0026b(c0126b, "flutter/platform", m0.i.f2778a, 8);
                this.f519f = c0026b;
                c0026b.J(c0200c);
                break;
            case 19:
                C0200c c0200c2 = new C0200c(17, this);
                C0026b c0026b2 = new C0026b(c0126b, "flutter/textinput", m0.i.f2778a, 8);
                this.f519f = c0026b2;
                c0026b2.J(c0200c2);
                break;
            default:
                C0200c c0200c3 = new C0200c(1, this);
                C0026b c0026b3 = new C0026b(c0126b, "flutter/localization", m0.i.f2778a, 8);
                this.f519f = c0026b3;
                c0026b3.J(c0200c3);
                break;
        }
    }

    public Q(C0126b c0126b, PackageManager packageManager) {
        this.f518e = 17;
        C0200c c0200c = new C0200c(9, this);
        this.f519f = packageManager;
        new C0026b(c0126b, "flutter/processtext", m0.o.f2782a, 8).J(c0200c);
    }

    public Q(w wVar) {
        this.f518e = 0;
        this.f519f = wVar;
        P p2 = new P();
        p2.f511a = 0;
        this.f520g = p2;
    }
}
