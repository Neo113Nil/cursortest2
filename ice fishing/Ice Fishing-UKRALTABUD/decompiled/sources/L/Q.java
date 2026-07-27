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
import m0.C0211i;
import m0.C0217o;
import m0.InterfaceC0204b;
import m0.InterfaceC0205c;
import m0.InterfaceC0206d;
import m0.InterfaceC0212j;
import m0.InterfaceC0213k;
import m0.InterfaceC0214l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r0.C0255p;

/* loaded from: classes.dex */
public final class Q implements N0.d, U.h, c0.B, io.flutter.plugin.platform.h, InterfaceC0213k, InterfaceC0205c, InterfaceC0206d {

    /* renamed from: i, reason: collision with root package name */
    public static Q f594i;

    /* renamed from: j, reason: collision with root package name */
    public static c0.C f595j;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f596f;

    /* renamed from: g, reason: collision with root package name */
    public Object f597g;

    /* renamed from: h, reason: collision with root package name */
    public Object f598h;

    public /* synthetic */ Q(int i2, Object obj, Object obj2) {
        this.f596f = i2;
        this.f597g = obj;
        this.f598h = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0088, code lost:
    
        if (r2 != 8) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int i(Q q2, JSONArray jSONArray) {
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

    public static ArrayList j(Q q2, JSONArray jSONArray) {
        q2.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String string = jSONArray.getString(i2);
            for (l0.g gVar : l0.g.values()) {
                if (gVar.f2707f.equals(string)) {
                    int ordinal = gVar.ordinal();
                    if (ordinal == 0) {
                        arrayList.add(l0.g.f2704g);
                    } else if (ordinal == 1) {
                        arrayList.add(l0.g.f2705h);
                    }
                }
            }
            throw new NoSuchFieldException(E0.h.f("No such SystemUiOverlay: ", string));
        }
        return arrayList;
    }

    public static int k(Q q2, String str) {
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

    public static l0.f l(Q q2, JSONObject jSONObject) {
        q2.getClass();
        return new l0.f(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? E0.h.a(jSONObject.getString("statusBarIconBrightness")) : 0, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? E0.h.a(jSONObject.getString("systemNavigationBarIconBrightness")) : 0, !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
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
        ((io.flutter.plugin.platform.k) this.f597g).a();
        ((io.flutter.plugin.platform.j) this.f598h).a();
    }

    @Override // c0.B
    public void b(KeyEvent keyEvent, final c0.z zVar) {
        int action = keyEvent.getAction();
        if (action != 0 && action != 1) {
            zVar.a(false);
            return;
        }
        Character a2 = ((R0.i) this.f598h).a(keyEvent.getUnicodeChar());
        boolean z2 = action != 0;
        final InterfaceC0205c interfaceC0205c = new InterfaceC0205c() { // from class: c0.u
            @Override // m0.InterfaceC0205c
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
        C0199b c0199b = (C0199b) this.f597g;
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
        c0199b.f2687a.i(hashMap, new InterfaceC0205c() { // from class: c0.u
            @Override // m0.InterfaceC0205c
            public void e(Object obj) {
                boolean z3 = false;
                if (obj != null) {
                    try {
                        z3 = ((JSONObject) obj).getBoolean("handled");
                    } catch (JSONException e2) {
                        Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e2);
                    }
                }
                ((z) interfaceC0205c).a(z3);
            }
        });
    }

    @Override // io.flutter.plugin.platform.h
    public void d(io.flutter.view.h hVar) {
        ((io.flutter.plugin.platform.k) this.f597g).f2472m.f2440a = hVar;
        ((io.flutter.plugin.platform.j) this.f598h).f2457k.f2440a = hVar;
    }

    @Override // m0.InterfaceC0205c
    public void e(Object obj) {
        switch (this.f596f) {
            case 18:
                C0051b c0051b = (C0051b) this.f598h;
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) c0051b.f603h;
                l0.m mVar = (l0.m) this.f597g;
                concurrentLinkedQueue.remove(mVar);
                if (!((ConcurrentLinkedQueue) c0051b.f603h).isEmpty()) {
                    Log.e("SettingsChannel", "The queue becomes empty after removing config generation " + mVar.f2737a);
                    break;
                }
                break;
            default:
                ((C0131g) this.f597g).a(((InterfaceC0212j) ((C0013n) ((Q) this.f598h).f598h).f244c).b(obj));
                break;
        }
    }

    @Override // io.flutter.plugin.platform.h
    public void f(int i2) {
        ((io.flutter.plugin.platform.j) this.f598h).f(i2);
        ((io.flutter.plugin.platform.k) this.f597g).f(i2);
    }

    @Override // io.flutter.plugin.platform.h
    public boolean g(int i2) {
        ((io.flutter.plugin.platform.j) this.f598h).f(i2);
        return ((io.flutter.plugin.platform.k) this.f597g).g(i2);
    }

    @Override // m0.InterfaceC0213k
    public void h(Q q2, l0.k kVar) {
        C0200c c0200c = (C0200c) this.f598h;
        if (((C0051b) c0200c.f2689g) == null) {
            kVar.c((Map) this.f597g);
            return;
        }
        String str = (String) q2.f597g;
        str.getClass();
        if (!str.equals("getKeyboardState")) {
            kVar.b();
            return;
        }
        try {
            this.f597g = Collections.unmodifiableMap(((c0.y) ((c0.B[]) ((C0051b) c0200c.f2689g).f603h)[0]).f1767g);
        } catch (IllegalStateException e2) {
            kVar.a("error", e2.getMessage(), null);
        }
        kVar.c((Map) this.f597g);
    }

    public void m() {
        j0 j0Var;
        ImageView imageView = (ImageView) this.f597g;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            Rect rect = AbstractC0180y.f2311a;
        }
        if (drawable == null || (j0Var = (j0) this.f598h) == null) {
            return;
        }
        C0171o.c(drawable, j0Var, imageView.getDrawableState());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bb  */
    @Override // N0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(N0.e eVar, v0.d dVar) {
        N0.j jVar;
        int i2;
        Throwable th;
        O0.n nVar;
        Q q2;
        N0.e eVar2;
        N0.m mVar;
        int i3;
        C0255p c0255p;
        switch (this.f596f) {
            case 1:
                if (dVar instanceof N0.j) {
                    jVar = (N0.j) dVar;
                    int i4 = jVar.f769j;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        jVar.f769j = i4 - Integer.MIN_VALUE;
                        Object obj = jVar.f768i;
                        w0.a aVar = w0.a.f3071f;
                        i2 = jVar.f769j;
                        if (i2 != 0) {
                            o.g.C(obj);
                            v0.i iVar = jVar.f3086g;
                            E0.i.b(iVar);
                            O0.n nVar2 = new O0.n(eVar, iVar);
                            try {
                                C0015p c0015p = (C0015p) this.f597g;
                                jVar.f771l = this;
                                jVar.f772m = eVar;
                                jVar.f773n = nVar2;
                                jVar.f769j = 1;
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
                                o.g.C(obj);
                                return t0.g.f2989a;
                            }
                            nVar = jVar.f773n;
                            eVar2 = jVar.f772m;
                            q2 = jVar.f771l;
                            try {
                                o.g.C(obj);
                            } catch (Throwable th3) {
                                th = th3;
                                nVar.o();
                                throw th;
                            }
                        }
                        nVar.o();
                        N0.q qVar = (N0.q) q2.f598h;
                        jVar.f771l = null;
                        jVar.f772m = null;
                        jVar.f773n = null;
                        jVar.f769j = 2;
                        qVar.n(eVar2, jVar);
                        return aVar;
                    }
                }
                jVar = new N0.j(this, dVar);
                Object obj2 = jVar.f768i;
                w0.a aVar2 = w0.a.f3071f;
                i2 = jVar.f769j;
                if (i2 != 0) {
                }
                nVar.o();
                N0.q qVar2 = (N0.q) q2.f598h;
                jVar.f771l = null;
                jVar.f772m = null;
                jVar.f773n = null;
                jVar.f769j = 2;
                qVar2.n(eVar2, jVar);
                return aVar2;
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                Object n2 = ((Q) this.f597g).n(new N0.l(new E0.n(), eVar, (D.r) this.f598h), dVar);
                return n2 == w0.a.f3071f ? n2 : t0.g.f2989a;
            default:
                if (dVar instanceof N0.m) {
                    mVar = (N0.m) dVar;
                    int i5 = mVar.f784j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        mVar.f784j = i5 - Integer.MIN_VALUE;
                        Object obj3 = mVar.f783i;
                        w0.a aVar3 = w0.a.f3071f;
                        i3 = mVar.f784j;
                        if (i3 != 0) {
                            o.g.C(obj3);
                            Q q3 = (Q) this.f597g;
                            C0255p c0255p2 = new C0255p((C0016q) this.f598h, eVar);
                            try {
                                mVar.f786l = c0255p2;
                                mVar.f784j = 1;
                                if (q3.n(c0255p2, mVar) == aVar3) {
                                    return aVar3;
                                }
                            } catch (O0.a e2) {
                                e = e2;
                                c0255p = c0255p2;
                                if (e.f810f != c0255p) {
                                }
                                return t0.g.f2989a;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c0255p = mVar.f786l;
                            try {
                                o.g.C(obj3);
                            } catch (O0.a e3) {
                                e = e3;
                                if (e.f810f != c0255p) {
                                    throw e;
                                }
                                return t0.g.f2989a;
                            }
                        }
                        return t0.g.f2989a;
                    }
                }
                mVar = new N0.m(this, dVar);
                Object obj32 = mVar.f783i;
                w0.a aVar32 = w0.a.f3071f;
                i3 = mVar.f784j;
                if (i3 != 0) {
                }
                return t0.g.f2989a;
        }
    }

    @Override // m0.InterfaceC0206d
    public void p(ByteBuffer byteBuffer, C0131g c0131g) {
        switch (this.f596f) {
            case 21:
                C0013n c0013n = (C0013n) this.f598h;
                try {
                    ((InterfaceC0204b) this.f597g).j(((InterfaceC0212j) c0013n.f244c).a(byteBuffer), new Q(this, c0131g, 20, false));
                    break;
                } catch (RuntimeException e2) {
                    Log.e("BasicMessageChannel#" + ((String) c0013n.f243b), "Failed to handle message", e2);
                    c0131g.a(null);
                    return;
                }
            default:
                C0051b c0051b = (C0051b) this.f598h;
                try {
                    ((InterfaceC0213k) this.f597g).h(((InterfaceC0214l) c0051b.f604i).e(byteBuffer), new l0.k(1, this, c0131g));
                    break;
                } catch (RuntimeException e3) {
                    Log.e("MethodChannel#".concat((String) c0051b.f602g), "Failed to handle method call", e3);
                    c0131g.a(((InterfaceC0214l) c0051b.f604i).a(e3.getMessage(), Log.getStackTraceString(e3)));
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
        w wVar = (w) this.f597g;
        switch (wVar.f676a) {
            case 0:
                s2 = wVar.f677b.s();
                break;
            default:
                s2 = wVar.f677b.u();
                break;
        }
        switch (wVar.f676a) {
            case 0:
                x xVar = wVar.f677b;
                i6 = xVar.f683f;
                t2 = xVar.t();
                break;
            default:
                x xVar2 = wVar.f677b;
                i6 = xVar2.f684g;
                t2 = xVar2.r();
                break;
        }
        int i9 = i6 - t2;
        int i10 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            switch (wVar.f676a) {
                case 0:
                    o2 = wVar.f677b.o(i2);
                    break;
                default:
                    o2 = wVar.f677b.o(i2);
                    break;
            }
            switch (wVar.f676a) {
                case 0:
                    y yVar = (y) o2.getLayoutParams();
                    wVar.f677b.getClass();
                    left = o2.getLeft() - ((y) o2.getLayoutParams()).f685a.left;
                    i7 = ((ViewGroup.MarginLayoutParams) yVar).leftMargin;
                    break;
                default:
                    y yVar2 = (y) o2.getLayoutParams();
                    wVar.f677b.getClass();
                    left = o2.getTop() - ((y) o2.getLayoutParams()).f685a.top;
                    i7 = ((ViewGroup.MarginLayoutParams) yVar2).topMargin;
                    break;
            }
            int i11 = left - i7;
            switch (wVar.f676a) {
                case 0:
                    y yVar3 = (y) o2.getLayoutParams();
                    wVar.f677b.getClass();
                    right = o2.getRight() + ((y) o2.getLayoutParams()).f685a.right;
                    i8 = ((ViewGroup.MarginLayoutParams) yVar3).rightMargin;
                    break;
                default:
                    y yVar4 = (y) o2.getLayoutParams();
                    wVar.f677b.getClass();
                    right = o2.getBottom() + ((y) o2.getLayoutParams()).f685a.bottom;
                    i8 = ((ViewGroup.MarginLayoutParams) yVar4).bottomMargin;
                    break;
            }
            int i12 = right + i8;
            P p2 = (P) this.f598h;
            p2.f590b = s2;
            p2.f591c = i9;
            p2.f592d = i11;
            p2.f593e = i12;
            if (i4 != 0) {
                p2.f589a = i4;
                if (p2.a()) {
                    return o2;
                }
            }
            if (i5 != 0) {
                p2.f589a = i5;
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
        ImageView imageView = (ImageView) this.f597g;
        C0051b E2 = C0051b.E(imageView.getContext(), null, AbstractC0097a.f1633e, i2);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) E2.f602g;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC0110a.a(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                Rect rect = AbstractC0180y.f2311a;
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
        int i2 = fVar.f2966b;
        Handler handler = (Handler) this.f598h;
        C0200c c0200c = (C0200c) this.f597g;
        if (i2 == 0) {
            handler.post(new P0.i(c0200c, fVar.f2965a, 3, false));
        } else {
            handler.post(new A.b(c0200c, i2));
        }
    }

    public /* synthetic */ Q(int i2, boolean z2) {
        this.f596f = i2;
    }

    public /* synthetic */ Q(Object obj, Object obj2, int i2, boolean z2) {
        this.f596f = i2;
        this.f598h = obj;
        this.f597g = obj2;
    }

    public Q(c0.r rVar, C0200c c0200c) {
        this.f596f = 24;
        this.f597g = rVar;
        this.f598h = c0200c;
        c0200c.f2689g = new C0200c(19, this);
    }

    public Q(C0199b c0199b) {
        this.f596f = 7;
        this.f598h = new R0.i();
        this.f597g = c0199b;
    }

    public Q(C0200c c0200c) {
        this.f596f = 14;
        this.f598h = c0200c;
        this.f597g = new HashMap();
    }

    public Q(int i2) {
        this.f596f = i2;
        switch (i2) {
            case F.k.BYTES_FIELD_NUMBER /* 8 */:
                this.f597g = new LongSparseArray();
                this.f598h = new PriorityQueue();
                break;
            default:
                this.f597g = new ReentrantLock();
                this.f598h = new LinkedHashMap();
                break;
        }
    }

    public Q(c0.r rVar, InputMethodManager inputMethodManager, C0200c c0200c) {
        this.f596f = 11;
        if (Build.VERSION.SDK_INT >= 33) {
            rVar.setAutoHandwritingEnabled(false);
        }
        this.f598h = rVar;
        this.f597g = inputMethodManager;
        c0200c.f2689g = this;
    }

    public Q(U.b bVar) {
        this.f596f = 5;
        Q q2 = new Q(4);
        this.f597g = bVar;
        this.f598h = q2;
    }

    public Q(ImageView imageView) {
        this.f596f = 9;
        this.f597g = imageView;
    }

    public Q(C0126b c0126b, int i2) {
        this.f596f = i2;
        switch (i2) {
            case 16:
                C0200c c0200c = new C0200c(4, this);
                C0051b c0051b = new C0051b(c0126b, "flutter/platform", C0211i.f2770a, 8);
                this.f597g = c0051b;
                c0051b.J(c0200c);
                break;
            case 19:
                C0200c c0200c2 = new C0200c(17, this);
                C0051b c0051b2 = new C0051b(c0126b, "flutter/textinput", C0211i.f2770a, 8);
                this.f597g = c0051b2;
                c0051b2.J(c0200c2);
                break;
            default:
                C0200c c0200c3 = new C0200c(1, this);
                C0051b c0051b3 = new C0051b(c0126b, "flutter/localization", C0211i.f2770a, 8);
                this.f597g = c0051b3;
                c0051b3.J(c0200c3);
                break;
        }
    }

    public Q(C0126b c0126b, PackageManager packageManager) {
        this.f596f = 17;
        C0200c c0200c = new C0200c(9, this);
        this.f597g = packageManager;
        new C0051b(c0126b, "flutter/processtext", C0217o.f2774a, 8).J(c0200c);
    }

    public Q(w wVar) {
        this.f596f = 0;
        this.f597g = wVar;
        P p2 = new P();
        p2.f589a = 0;
        this.f598h = p2;
    }
}
