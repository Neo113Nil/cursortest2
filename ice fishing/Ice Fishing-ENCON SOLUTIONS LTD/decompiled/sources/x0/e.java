package x0;

import D1.m;
import D1.r;
import E1.n;
import F.C0038n;
import F.C0040p;
import F.C0041q;
import H.j;
import H1.i;
import P.O;
import P.v;
import P.w;
import P.x;
import P0.A;
import P0.B;
import P0.C;
import P0.t;
import P0.z;
import Z.h;
import Z0.l;
import a1.C0093i;
import a1.C0099o;
import a1.InterfaceC0086b;
import a1.InterfaceC0087c;
import a1.InterfaceC0088d;
import a1.InterfaceC0094j;
import a1.InterfaceC0095k;
import a1.InterfaceC0096l;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import c.AbstractC0131a;
import d.AbstractC0142a;
import f1.C0163N;
import f1.C0182p;
import h.AbstractC0227x;
import h.C0219o;
import h1.C0239i;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import io.flutter.plugin.platform.k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import m1.EnumC0985a;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e implements D1.d, B, h, InterfaceC0095k, InterfaceC0087c, InterfaceC0088d, io.flutter.plugin.platform.h {

    /* renamed from: d, reason: collision with root package name */
    public static e f8526d;

    /* renamed from: e, reason: collision with root package name */
    public static e f8527e;

    /* renamed from: f, reason: collision with root package name */
    public static C f8528f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8529a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8530b;

    /* renamed from: c, reason: collision with root package name */
    public Object f8531c;

    public /* synthetic */ e(int i2, Object obj, Object obj2) {
        this.f8529a = i2;
        this.f8530b = obj;
        this.f8531c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0088, code lost:
    
        if (r2 != 8) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int h(e eVar, JSONArray jSONArray) {
        String str;
        eVar.getClass();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            String string = jSONArray.getString(i4);
            for (int i5 : j.c(4)) {
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
                    int b2 = j.b(i5);
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
            throw new NoSuchFieldException(C1.a.i("No such DeviceOrientation: ", string));
        }
        if (i2 == 0) {
            return -1;
        }
        switch (i2) {
            case 2:
                return 0;
            case 3:
            case 6:
            case 7:
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
            case 4:
                return 9;
            case 5:
                return 12;
            case 8:
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

    public static ArrayList j(e eVar, JSONArray jSONArray) {
        eVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String string = jSONArray.getString(i2);
            for (Z0.f fVar : Z0.f.values()) {
                if (fVar.f1971a.equals(string)) {
                    int ordinal = fVar.ordinal();
                    if (ordinal == 0) {
                        arrayList.add(Z0.f.TOP_OVERLAYS);
                    } else if (ordinal == 1) {
                        arrayList.add(Z0.f.BOTTOM_OVERLAYS);
                    }
                }
            }
            throw new NoSuchFieldException(C1.a.i("No such SystemUiOverlay: ", string));
        }
        return arrayList;
    }

    public static int k(e eVar, String str) {
        String str2;
        eVar.getClass();
        for (int i2 : j.c(4)) {
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
                int b2 = j.b(i2);
                if (b2 == 0) {
                    return 1;
                }
                if (b2 != 1) {
                    return b2 != 2 ? 4 : 3;
                }
                return 2;
            }
        }
        throw new NoSuchFieldException(C1.a.i("No such SystemUiMode: ", str));
    }

    public static Z0.e l(e eVar, JSONObject jSONObject) {
        eVar.getClass();
        return new Z0.e(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? C1.a.a(jSONObject.getString("statusBarIconBrightness")) : 0, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? C1.a.a(jSONObject.getString("systemNavigationBarIconBrightness")) : 0, !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    public static HashMap n(String str, int i2, int i3, int i4, int i5) {
        HashMap hashMap = new HashMap();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i2));
        hashMap.put("selectionExtent", Integer.valueOf(i3));
        hashMap.put("composingBase", Integer.valueOf(i4));
        hashMap.put("composingExtent", Integer.valueOf(i5));
        return hashMap;
    }

    public static final SharedPreferences t(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void u(Context context) {
        if (t(context).edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String valueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(valueOf) : new String("Failed to store app set ID last used time for App "));
        throw new d("Failed to store the app set ID last used time.");
    }

    @Override // io.flutter.plugin.platform.h
    public void a() {
        ((k) this.f8530b).a();
        ((io.flutter.plugin.platform.j) this.f8531c).a();
    }

    @Override // a1.InterfaceC0088d
    public void b(ByteBuffer byteBuffer, R0.g gVar) {
        switch (this.f8529a) {
            case 18:
                C0038n c0038n = (C0038n) this.f8531c;
                try {
                    ((InterfaceC0086b) this.f8530b).g(((InterfaceC0094j) c0038n.f534c).decodeMessage(byteBuffer), new e(this, gVar, 17, false));
                    break;
                } catch (RuntimeException e2) {
                    Log.e("BasicMessageChannel#" + ((String) c0038n.f533b), "Failed to handle message", e2);
                    gVar.a(null);
                    return;
                }
            default:
                I0.b bVar = (I0.b) this.f8531c;
                try {
                    ((InterfaceC0095k) this.f8530b).i(((InterfaceC0096l) bVar.f723d).b(byteBuffer), new Z0.j(1, this, gVar));
                    break;
                } catch (RuntimeException e3) {
                    Log.e("MethodChannel#" + ((String) bVar.f722c), "Failed to handle method call", e3);
                    gVar.a(((InterfaceC0096l) bVar.f723d).d(e3.getMessage(), Log.getStackTraceString(e3)));
                }
        }
    }

    @Override // io.flutter.plugin.platform.h
    public void c(io.flutter.view.h hVar) {
        ((k) this.f8530b).f7864h.f7831a = hVar;
        ((io.flutter.plugin.platform.j) this.f8531c).f7848f.f7831a = hVar;
    }

    @Override // io.flutter.plugin.platform.h
    public boolean d(int i2) {
        ((io.flutter.plugin.platform.j) this.f8531c).g(i2);
        return ((k) this.f8530b).d(i2);
    }

    @Override // P0.B
    public void e(KeyEvent keyEvent, A a2) {
        int action = keyEvent.getAction();
        if (action != 0 && action != 1) {
            a2.a(false);
            return;
        }
        Character a3 = ((i) this.f8531c).a(keyEvent.getUnicodeChar());
        boolean z2 = action != 0;
        E0.a aVar = new E0.a(3, a2);
        Z0.b bVar = (Z0.b) this.f8530b;
        HashMap hashMap = new HashMap();
        hashMap.put("type", z2 ? "keyup" : "keydown");
        hashMap.put("keymap", ConstantDeviceInfo.APP_PLATFORM);
        hashMap.put("flags", Integer.valueOf(keyEvent.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(keyEvent.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(keyEvent.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(keyEvent.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(keyEvent.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(keyEvent.getMetaState()));
        hashMap.put("character", a3.toString());
        hashMap.put(AdRevenueConstants.SOURCE_KEY, Integer.valueOf(keyEvent.getSource()));
        hashMap.put("deviceId", Integer.valueOf(keyEvent.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(keyEvent.getRepeatCount()));
        bVar.f1953a.g(hashMap, new E0.a(4, aVar));
    }

    @Override // a1.InterfaceC0087c
    public void f(Object obj) {
        switch (this.f8529a) {
            case 15:
                I0.b bVar = (I0.b) this.f8531c;
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) bVar.f721b;
                l lVar = (l) this.f8530b;
                concurrentLinkedQueue.remove(lVar);
                if (!((ConcurrentLinkedQueue) bVar.f721b).isEmpty()) {
                    Log.e("SettingsChannel", "The queue becomes empty after removing config generation " + lVar.f2003a);
                    break;
                }
                break;
            default:
                ((R0.g) this.f8530b).a(((InterfaceC0094j) ((C0038n) ((e) this.f8531c).f8531c).f534c).encodeMessage(obj));
                break;
        }
    }

    @Override // io.flutter.plugin.platform.h
    public void g(int i2) {
        ((io.flutter.plugin.platform.j) this.f8531c).g(i2);
        ((k) this.f8530b).g(i2);
    }

    @Override // a1.InterfaceC0095k
    public void i(e eVar, Z0.j jVar) {
        C.j jVar2 = (C.j) this.f8531c;
        if (((I0.b) jVar2.f124b) == null) {
            jVar.c((Map) this.f8530b);
            return;
        }
        String str = (String) eVar.f8530b;
        str.getClass();
        if (!str.equals("getKeyboardState")) {
            jVar.b();
            return;
        }
        try {
            this.f8530b = Collections.unmodifiableMap(((z) ((B[]) ((I0.b) jVar2.f124b).f721b)[0]).f1495b);
        } catch (IllegalStateException e2) {
            jVar.a("error", e2.getMessage(), null);
        }
        jVar.c((Map) this.f8530b);
    }

    public void m() {
        J1.h hVar;
        ImageView imageView = (ImageView) this.f8530b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            Rect rect = AbstractC0227x.f3368a;
        }
        if (drawable == null || (hVar = (J1.h) this.f8531c) == null) {
            return;
        }
        C0219o.c(drawable, hVar, imageView.getDrawableState());
    }

    public View p(int i2, int i3, int i4, int i5) {
        int s2;
        int i6;
        int t;
        View o2;
        int left;
        int i7;
        int right;
        int i8;
        v vVar = (v) this.f8530b;
        switch (vVar.f1370a) {
            case 0:
                s2 = vVar.f1371b.s();
                break;
            default:
                s2 = vVar.f1371b.u();
                break;
        }
        switch (vVar.f1370a) {
            case 0:
                w wVar = vVar.f1371b;
                i6 = wVar.f1377f;
                t = wVar.t();
                break;
            default:
                w wVar2 = vVar.f1371b;
                i6 = wVar2.f1378g;
                t = wVar2.r();
                break;
        }
        int i9 = i6 - t;
        int i10 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            switch (vVar.f1370a) {
                case 0:
                    o2 = vVar.f1371b.o(i2);
                    break;
                default:
                    o2 = vVar.f1371b.o(i2);
                    break;
            }
            switch (vVar.f1370a) {
                case 0:
                    x xVar = (x) o2.getLayoutParams();
                    vVar.f1371b.getClass();
                    left = o2.getLeft() - ((x) o2.getLayoutParams()).f1379a.left;
                    i7 = ((ViewGroup.MarginLayoutParams) xVar).leftMargin;
                    break;
                default:
                    x xVar2 = (x) o2.getLayoutParams();
                    vVar.f1371b.getClass();
                    left = o2.getTop() - ((x) o2.getLayoutParams()).f1379a.top;
                    i7 = ((ViewGroup.MarginLayoutParams) xVar2).topMargin;
                    break;
            }
            int i11 = left - i7;
            switch (vVar.f1370a) {
                case 0:
                    x xVar3 = (x) o2.getLayoutParams();
                    vVar.f1371b.getClass();
                    right = o2.getRight() + ((x) o2.getLayoutParams()).f1379a.right;
                    i8 = ((ViewGroup.MarginLayoutParams) xVar3).rightMargin;
                    break;
                default:
                    x xVar4 = (x) o2.getLayoutParams();
                    vVar.f1371b.getClass();
                    right = o2.getBottom() + ((x) o2.getLayoutParams()).f1379a.bottom;
                    i8 = ((ViewGroup.MarginLayoutParams) xVar4).bottomMargin;
                    break;
            }
            int i12 = right + i8;
            O o3 = (O) this.f8531c;
            o3.f1294b = s2;
            o3.f1295c = i9;
            o3.f1296d = i11;
            o3.f1297e = i12;
            if (i4 != 0) {
                o3.f1293a = i4;
                if (o3.a()) {
                    return o2;
                }
            }
            if (i5 != 0) {
                o3.f1293a = i5;
                if (o3.a()) {
                    view = o2;
                }
            }
            i2 += i10;
        }
        return view;
    }

    public androidx.lifecycle.w q(String key, Class cls) {
        kotlin.jvm.internal.i.e(key, "key");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bb  */
    @Override // D1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object r(D1.e eVar, l1.d dVar) {
        D1.j jVar;
        int i2;
        Throwable th;
        n nVar;
        e eVar2;
        D1.e eVar3;
        m mVar;
        int i3;
        C0182p c0182p;
        switch (this.f8529a) {
            case 1:
                if (dVar instanceof D1.j) {
                    jVar = (D1.j) dVar;
                    int i4 = jVar.f262e;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        jVar.f262e = i4 - Integer.MIN_VALUE;
                        Object obj = jVar.f261d;
                        EnumC0985a enumC0985a = EnumC0985a.f8194a;
                        i2 = jVar.f262e;
                        if (i2 != 0) {
                            R1.l.F(obj);
                            l1.i iVar = jVar.f8213b;
                            kotlin.jvm.internal.i.b(iVar);
                            n nVar2 = new n(eVar, iVar);
                            try {
                                C0040p c0040p = (C0040p) this.f8530b;
                                jVar.f264g = this;
                                jVar.f265h = eVar;
                                jVar.f266i = nVar2;
                                jVar.f262e = 1;
                                if (c0040p.invoke(nVar2, jVar) == enumC0985a) {
                                    return enumC0985a;
                                }
                                eVar2 = this;
                                eVar3 = eVar;
                                nVar = nVar2;
                            } catch (Throwable th2) {
                                th = th2;
                                nVar = nVar2;
                                nVar.h();
                                throw th;
                            }
                        } else {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                R1.l.F(obj);
                                return C0239i.f3393a;
                            }
                            nVar = jVar.f266i;
                            eVar3 = jVar.f265h;
                            eVar2 = jVar.f264g;
                            try {
                                R1.l.F(obj);
                            } catch (Throwable th3) {
                                th = th3;
                                nVar.h();
                                throw th;
                            }
                        }
                        nVar.h();
                        r rVar = (r) eVar2.f8531c;
                        jVar.f264g = null;
                        jVar.f265h = null;
                        jVar.f266i = null;
                        jVar.f262e = 2;
                        rVar.r(eVar3, jVar);
                        return enumC0985a;
                    }
                }
                jVar = new D1.j(this, dVar);
                Object obj2 = jVar.f261d;
                EnumC0985a enumC0985a2 = EnumC0985a.f8194a;
                i2 = jVar.f262e;
                if (i2 != 0) {
                }
                nVar.h();
                r rVar2 = (r) eVar2.f8531c;
                jVar.f264g = null;
                jVar.f265h = null;
                jVar.f266i = null;
                jVar.f262e = 2;
                rVar2.r(eVar3, jVar);
                return enumC0985a2;
            case 2:
                Object r2 = ((e) this.f8530b).r(new D1.l(new kotlin.jvm.internal.n(), eVar, (F.r) this.f8531c), dVar);
                return r2 == EnumC0985a.f8194a ? r2 : C0239i.f3393a;
            default:
                if (dVar instanceof m) {
                    mVar = (m) dVar;
                    int i5 = mVar.f277e;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        mVar.f277e = i5 - Integer.MIN_VALUE;
                        Object obj3 = mVar.f276d;
                        EnumC0985a enumC0985a3 = EnumC0985a.f8194a;
                        i3 = mVar.f277e;
                        if (i3 != 0) {
                            R1.l.F(obj3);
                            e eVar4 = (e) this.f8530b;
                            C0182p c0182p2 = new C0182p((C0041q) this.f8531c, eVar);
                            try {
                                mVar.f279g = c0182p2;
                                mVar.f277e = 1;
                                if (eVar4.r(c0182p2, mVar) == enumC0985a3) {
                                    return enumC0985a3;
                                }
                            } catch (E1.a e2) {
                                e = e2;
                                c0182p = c0182p2;
                                if (e.f310a != c0182p) {
                                }
                                return C0239i.f3393a;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c0182p = mVar.f279g;
                            try {
                                R1.l.F(obj3);
                            } catch (E1.a e3) {
                                e = e3;
                                if (e.f310a != c0182p) {
                                    throw e;
                                }
                                return C0239i.f3393a;
                            }
                        }
                        return C0239i.f3393a;
                    }
                }
                mVar = new m(this, dVar);
                Object obj32 = mVar.f276d;
                EnumC0985a enumC0985a32 = EnumC0985a.f8194a;
                i3 = mVar.f277e;
                if (i3 != 0) {
                }
                return C0239i.f3393a;
        }
    }

    public void s(int i2) {
        int resourceId;
        ImageView imageView = (ImageView) this.f8530b;
        I0.b H2 = I0.b.H(imageView.getContext(), null, AbstractC0131a.f2622e, i2);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) H2.f722c;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC0142a.a(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                Rect rect = AbstractC0227x.f3368a;
            }
            if (typedArray.hasValue(2)) {
                C.f.c(imageView, H2.z(2));
            }
            if (typedArray.hasValue(3)) {
                C.f.d(imageView, AbstractC0227x.c(typedArray.getInt(3, -1), null));
            }
            H2.K();
        } catch (Throwable th) {
            H2.K();
            throw th;
        }
    }

    public /* synthetic */ e(int i2, boolean z2) {
        this.f8529a = i2;
    }

    public /* synthetic */ e(Object obj, Object obj2, int i2, boolean z2) {
        this.f8529a = i2;
        this.f8531c = obj;
        this.f8530b = obj2;
    }

    public e(Context context) {
        this.f8529a = 0;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f8531c = Executors.newSingleThreadExecutor();
        this.f8530b = context;
        newSingleThreadScheduledExecutor.scheduleAtFixedRate(new C.b(14, this), 0L, 86400L, TimeUnit.SECONDS);
    }

    public e(String str, R1.l lVar, C0163N c0163n) {
        this.f8529a = 29;
        this.f8531c = str;
        this.f8530b = lVar;
    }

    public e(t tVar, C.j jVar) {
        this.f8529a = 22;
        this.f8530b = tVar;
        this.f8531c = jVar;
        jVar.f124b = new Z0.i(15, this);
    }

    public e(Z0.b bVar) {
        this.f8529a = 7;
        this.f8531c = new i();
        this.f8530b = bVar;
    }

    public e(C.j jVar) {
        this.f8529a = 11;
        this.f8531c = jVar;
        this.f8530b = new HashMap();
    }

    public e(t tVar, InputMethodManager inputMethodManager, Z0.i iVar) {
        this.f8529a = 26;
        if (Build.VERSION.SDK_INT >= 33) {
            tVar.setAutoHandwritingEnabled(false);
        }
        this.f8531c = tVar;
        this.f8530b = inputMethodManager;
        iVar.f1992b = this;
    }

    public e(Z.b bVar) {
        this.f8529a = 10;
        e eVar = new e(9);
        this.f8530b = bVar;
        this.f8531c = eVar;
    }

    public e(R1.l store, androidx.lifecycle.x xVar, L.b defaultCreationExtras) {
        this.f8529a = 21;
        kotlin.jvm.internal.i.e(store, "store");
        kotlin.jvm.internal.i.e(defaultCreationExtras, "defaultCreationExtras");
        this.f8530b = xVar;
        this.f8531c = defaultCreationExtras;
    }

    public e(ImageView imageView) {
        this.f8529a = 24;
        this.f8530b = imageView;
    }

    public e(int i2) {
        this.f8529a = i2;
        switch (i2) {
            case 9:
                this.f8530b = new ReentrantLock();
                this.f8531c = new LinkedHashMap();
                break;
            default:
                this.f8530b = new LongSparseArray();
                this.f8531c = new PriorityQueue();
                break;
        }
    }

    public e(R0.b bVar, int i2) {
        this.f8529a = i2;
        switch (i2) {
            case 13:
                C.j jVar = new C.j(28, this);
                I0.b bVar2 = new I0.b(bVar, "flutter/platform", C0093i.f2034a, 9);
                this.f8530b = bVar2;
                bVar2.M(jVar);
                break;
            case 16:
                Z0.i iVar = new Z0.i(11, this);
                I0.b bVar3 = new I0.b(bVar, "flutter/textinput", C0093i.f2034a, 9);
                this.f8530b = bVar3;
                bVar3.M(iVar);
                break;
            default:
                C.j jVar2 = new C.j(25, this);
                I0.b bVar4 = new I0.b(bVar, "flutter/localization", C0093i.f2034a, 9);
                this.f8530b = bVar4;
                bVar4.M(jVar2);
                break;
        }
    }

    public e(R0.b bVar, PackageManager packageManager) {
        this.f8529a = 14;
        Z0.i iVar = new Z0.i(3, this);
        this.f8530b = packageManager;
        new I0.b(bVar, "flutter/processtext", C0099o.f2035b, 9).M(iVar);
    }

    public e(v vVar) {
        this.f8529a = 6;
        this.f8530b = vVar;
        O o2 = new O();
        o2.f1293a = 0;
        this.f8531c = o2;
    }
}
