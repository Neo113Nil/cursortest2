package A;

import A.j;
import D.C0003d;
import D.C0019u;
import D.InterfaceC0008i;
import D.d0;
import D.f0;
import D.m0;
import D.n0;
import K0.C0040p;
import L.C0051b;
import L.Q;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.Size;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.profileinstaller.ProfileInstallReceiver;
import c0.AbstractActivityC0104f;
import c0.H;
import d0.C0121k;
import e0.C0126b;
import e0.C0131g;
import e0.C0133i;
import g.C0146f;
import g.RunnableC0145e;
import g.ViewOnKeyListenerC0147g;
import g.t;
import h.C0165i;
import h.C0174s;
import h.InterfaceC0168l;
import h.K;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import m0.C0211i;
import m0.C0218p;
import m0.InterfaceC0204b;
import m0.InterfaceC0206d;
import m0.InterfaceC0207e;
import m0.InterfaceC0208f;
import m0.InterfaceC0213k;

/* loaded from: classes.dex */
public class j implements N0.d, InterfaceC0008i, J.e, InterfaceC0206d, InterfaceC0208f, K, g.o, InterfaceC0168l, InterfaceC0204b, InterfaceC0213k {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f29f;

    /* renamed from: g, reason: collision with root package name */
    public Object f30g;

    public /* synthetic */ j(int i2, Object obj) {
        this.f29f = i2;
        this.f30g = obj;
    }

    public static int y(int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            i4++;
            if (i4 == i3) {
                i5++;
                i4 = 0;
            } else if (i4 > i3) {
                i5++;
                i4 = 1;
            }
        }
        return i4 + 1 > i3 ? i5 + 1 : i5;
    }

    public static boolean z(int i2) {
        return (48 <= i2 && i2 <= 57) || i2 == 35 || i2 == 42;
    }

    public void A(int i2, double d2, double d3) {
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f30g;
        if (kVar.g(i2)) {
            return;
        }
        Log.e("PlatformViewsController", "Setting offset for unknown platform view with id: " + i2);
    }

    public void B(l0.h hVar) {
        PriorityQueue priorityQueue;
        LongSparseArray longSparseArray;
        long j2;
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f30g;
        float f2 = kVar.f2466g.getResources().getDisplayMetrics().density;
        int i2 = hVar.f2708a;
        if (!kVar.g(i2)) {
            if (kVar.f2475p.get(i2) != null) {
                throw new ClassCastException();
            }
            Log.e("PlatformViewsController", "Sending touch to an unknown view with id: " + i2);
            return;
        }
        io.flutter.plugin.platform.q qVar = (io.flutter.plugin.platform.q) kVar.f2473n.get(Integer.valueOf(i2));
        H h2 = new H(hVar.f2723p);
        while (true) {
            Q q2 = kVar.f2483y;
            priorityQueue = (PriorityQueue) q2.f598h;
            boolean isEmpty = priorityQueue.isEmpty();
            longSparseArray = (LongSparseArray) q2.f597g;
            j2 = h2.f1663a;
            if (isEmpty || ((Long) priorityQueue.peek()).longValue() >= j2) {
                break;
            } else {
                longSparseArray.remove(((Long) priorityQueue.poll()).longValue());
            }
        }
        if (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() == j2) {
            priorityQueue.poll();
        }
        longSparseArray.remove(j2);
        List<List> list = (List) hVar.f2714g;
        ArrayList arrayList = new ArrayList();
        for (List list2 : list) {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.orientation = (float) ((Double) list2.get(0)).doubleValue();
            pointerCoords.pressure = (float) ((Double) list2.get(1)).doubleValue();
            pointerCoords.size = (float) ((Double) list2.get(2)).doubleValue();
            double d2 = f2;
            pointerCoords.toolMajor = (float) (((Double) list2.get(3)).doubleValue() * d2);
            pointerCoords.toolMinor = (float) (((Double) list2.get(4)).doubleValue() * d2);
            pointerCoords.touchMajor = (float) (((Double) list2.get(5)).doubleValue() * d2);
            pointerCoords.touchMinor = (float) (((Double) list2.get(6)).doubleValue() * d2);
            pointerCoords.x = (float) (((Double) list2.get(7)).doubleValue() * d2);
            pointerCoords.y = (float) (((Double) list2.get(8)).doubleValue() * d2);
            arrayList.add(pointerCoords);
        }
        int i3 = hVar.f2712e;
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i3]);
        List<List> list3 = (List) hVar.f2713f;
        ArrayList arrayList2 = new ArrayList();
        for (List list4 : list3) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.id = ((Integer) list4.get(0)).intValue();
            pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
            arrayList2.add(pointerProperties);
        }
        MotionEvent.obtain(hVar.f2709b.longValue(), hVar.f2710c.longValue(), hVar.f2711d, hVar.f2712e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i3]), pointerCoordsArr, hVar.f2715h, hVar.f2716i, hVar.f2717j, hVar.f2718k, hVar.f2719l, hVar.f2720m, hVar.f2721n, hVar.f2722o);
        qVar.getClass();
    }

    public void C(l0.j jVar, l0.i iVar) {
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f30g;
        int i2 = kVar.i(jVar.f2725b);
        int i3 = kVar.i(jVar.f2726c);
        int i4 = jVar.f2724a;
        if (!kVar.g(i4)) {
            if (kVar.f2475p.get(i4) != null) {
                throw new ClassCastException();
            }
            Log.e("PlatformViewsController", "Resizing unknown platform view with id: " + i4);
            return;
        }
        float f2 = kVar.f2466g.getResources().getDisplayMetrics().density;
        io.flutter.plugin.platform.q qVar = (io.flutter.plugin.platform.q) kVar.f2473n.get(Integer.valueOf(i4));
        io.flutter.plugin.editing.l lVar = kVar.f2470k;
        if (lVar != null) {
            if (lVar.f2428e.f660b == 3) {
                lVar.f2439p = true;
            }
            qVar.getClass();
        }
        qVar.getClass();
        if (i2 == 0 && i3 == 0) {
            throw null;
        }
        if (Build.VERSION.SDK_INT < 31) {
            throw null;
        }
        throw null;
    }

    public void D(int i2, int i3) {
        if (i3 != 0 && i3 != 1) {
            throw new IllegalStateException("Trying to set unknown direction value: " + i3 + "(view id: " + i2 + ")");
        }
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f30g;
        if (kVar.g(i2)) {
            ((io.flutter.plugin.platform.q) kVar.f2473n.get(Integer.valueOf(i2))).getClass();
            Log.e("PlatformViewsController", "Setting direction to a null view with id: " + i2);
            return;
        }
        if (kVar.f2475p.get(i2) != null) {
            throw new ClassCastException();
        }
        Log.e("PlatformViewsController", "Setting direction to an unknown view with id: " + i2);
    }

    public void E(ArrayList arrayList) {
        io.flutter.plugin.platform.e eVar = (io.flutter.plugin.platform.e) this.f30g;
        if (eVar.f2451f) {
            eVar.f2451f = false;
            o.g.B(eVar.f2446a.getWindow(), true);
        }
        int i2 = arrayList.isEmpty() ? 5894 : 1798;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            int ordinal = ((l0.g) arrayList.get(i3)).ordinal();
            if (ordinal == 0) {
                i2 &= -5;
            } else if (ordinal == 1) {
                i2 &= -515;
            }
        }
        eVar.f2450e = i2;
        eVar.b();
    }

    public void F(int i2) {
        int i3;
        io.flutter.plugin.platform.e eVar = (io.flutter.plugin.platform.e) this.f30g;
        eVar.getClass();
        AbstractActivityC0104f abstractActivityC0104f = eVar.f2446a;
        if (i2 != 4 && eVar.f2451f) {
            eVar.f2451f = false;
            o.g.B(abstractActivityC0104f.getWindow(), true);
        }
        if (i2 == 1) {
            i3 = 1798;
        } else if (i2 == 2) {
            i3 = 3846;
        } else {
            if (i2 != 3) {
                if (i2 != 4 || Build.VERSION.SDK_INT < 29) {
                    return;
                }
                eVar.f2451f = true;
                o.g.B(abstractActivityC0104f.getWindow(), false);
                l0.f fVar = eVar.f2449d;
                if (fVar != null) {
                    eVar.a(fVar);
                    return;
                }
                return;
            }
            i3 = 5894;
        }
        eVar.f2450e = i3;
        eVar.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r7.f241a > r3.f241a) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void G(m0 m0Var) {
        N0.q qVar;
        Object obj;
        Object obj2;
        E0.i.e(m0Var, "newState");
        do {
            qVar = (N0.q) this.f30g;
            qVar.getClass();
            obj = O0.l.f831a;
            Object obj3 = N0.q.f804j.get(qVar);
            obj2 = obj3;
            if (obj3 == obj) {
                obj2 = null;
            }
            m0 m0Var2 = (m0) obj2;
            if (!(m0Var2 instanceof f0 ? true : E0.i.a(m0Var2, n0.f246b))) {
                if (!(m0Var2 instanceof C0003d)) {
                    if (!(m0Var2 instanceof d0)) {
                        throw new C0040p();
                    }
                }
                if (obj2 == null) {
                    obj2 = obj;
                }
                if (m0Var2 != null) {
                    obj = m0Var2;
                }
            }
            m0Var2 = m0Var;
            if (obj2 == null) {
            }
            if (m0Var2 != null) {
            }
        } while (!qVar.a(obj2, obj));
    }

    public void H(int i2) {
        View decorView = ((io.flutter.plugin.platform.e) this.f30g).f2446a.getWindow().getDecorView();
        switch (F.j.b(i2)) {
            case 0:
                decorView.performHapticFeedback(0);
                break;
            case 1:
                decorView.performHapticFeedback(1);
                break;
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                decorView.performHapticFeedback(3);
                break;
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                decorView.performHapticFeedback(6);
                break;
            case F.k.LONG_FIELD_NUMBER /* 4 */:
                decorView.performHapticFeedback(4);
                break;
            case F.k.STRING_FIELD_NUMBER /* 5 */:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(16);
                    break;
                }
                break;
            case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(3);
                    break;
                }
                break;
            case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(17);
                    break;
                }
                break;
        }
    }

    @Override // g.o
    public void a(g.j jVar, boolean z2) {
        if (jVar instanceof t) {
            ((t) jVar).f2041v.j().c(false);
        }
        g.o oVar = ((C0165i) this.f30g).f2192j;
        if (oVar != null) {
            oVar.a(jVar, z2);
        }
    }

    @Override // h.K
    public void b(g.j jVar, g.k kVar) {
        ((ViewOnKeyListenerC0147g) this.f30g).f1942k.removeCallbacksAndMessages(jVar);
    }

    @Override // m0.InterfaceC0208f
    public E.a d(C0211i c0211i) {
        return ((C0133i) this.f30g).d(c0211i);
    }

    @Override // J.e
    public void e(int i2, Serializable serializable) {
        String str;
        switch (i2) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case F.k.LONG_FIELD_NUMBER /* 4 */:
                str = "RESULT_NOT_WRITABLE";
                break;
            case F.k.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case F.k.BYTES_FIELD_NUMBER /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i2 == 6 || i2 == 7 || i2 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f30g).setResultCode(i2);
    }

    @Override // m0.InterfaceC0208f
    public void f(String str, InterfaceC0206d interfaceC0206d) {
        ((C0133i) this.f30g).g(str, interfaceC0206d, null);
    }

    @Override // m0.InterfaceC0208f
    public void g(String str, InterfaceC0206d interfaceC0206d, E.a aVar) {
        ((C0133i) this.f30g).g(str, interfaceC0206d, aVar);
    }

    @Override // m0.InterfaceC0213k
    public void h(Q q2, l0.k kVar) {
        ((E.a) this.f30g).getClass();
    }

    @Override // J.e
    public void i() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // m0.InterfaceC0204b
    public void j(Object obj, Q q2) {
        HashMap hashMap;
        HashMap hashMap2;
        C0051b c0051b = (C0051b) this.f30g;
        if (((io.flutter.view.b) c0051b.f604i) == null) {
            q2.e(null);
            return;
        }
        hashMap = (HashMap) obj;
        String str = (String) hashMap.get("type");
        hashMap2 = (HashMap) hashMap.get("data");
        str.getClass();
        switch (str) {
            case "tooltip":
                String str2 = (String) hashMap2.get("message");
                if (str2 != null) {
                    io.flutter.view.b bVar = (io.flutter.view.b) c0051b.f604i;
                    if (Build.VERSION.SDK_INT < 28) {
                        io.flutter.view.h hVar = (io.flutter.view.h) bVar.f2495a;
                        AccessibilityEvent d2 = hVar.d(0, 32);
                        d2.getText().add(str2);
                        hVar.h(d2);
                        break;
                    } else {
                        bVar.getClass();
                        break;
                    }
                }
                break;
            case "announce":
                String str3 = (String) hashMap2.get("message");
                if (str3 != null) {
                    io.flutter.view.b bVar2 = (io.flutter.view.b) c0051b.f604i;
                    if (Build.VERSION.SDK_INT >= 36) {
                        bVar2.getClass();
                        Log.w("AccessibilityBridge", "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
                    }
                    ((io.flutter.view.h) bVar2.f2495a).f2585a.announceForAccessibility(str3);
                    break;
                }
                break;
            case "tap":
                Integer num = (Integer) hashMap.get("nodeId");
                if (num != null) {
                    io.flutter.view.b bVar3 = (io.flutter.view.b) c0051b.f604i;
                    ((io.flutter.view.h) bVar3.f2495a).g(num.intValue(), 1);
                    break;
                }
                break;
            case "focus":
                Integer num2 = (Integer) hashMap.get("nodeId");
                if (num2 != null) {
                    io.flutter.view.b bVar4 = (io.flutter.view.b) c0051b.f604i;
                    ((io.flutter.view.h) bVar4.f2495a).g(num2.intValue(), 8);
                    break;
                }
                break;
            case "longPress":
                Integer num3 = (Integer) hashMap.get("nodeId");
                if (num3 != null) {
                    io.flutter.view.b bVar5 = (io.flutter.view.b) c0051b.f604i;
                    ((io.flutter.view.h) bVar5.f2495a).g(num3.intValue(), 2);
                    break;
                }
                break;
        }
        q2.e(null);
    }

    @Override // D.InterfaceC0008i
    public N0.d k() {
        return ((InterfaceC0008i) this.f30g).k();
    }

    @Override // m0.InterfaceC0208f
    public void l(String str, ByteBuffer byteBuffer, InterfaceC0207e interfaceC0207e) {
        ((C0133i) this.f30g).l(str, byteBuffer, interfaceC0207e);
    }

    @Override // g.o
    public boolean m(t tVar) {
        if (tVar == null) {
            return false;
        }
        tVar.f2042w.getClass();
        C0165i c0165i = (C0165i) this.f30g;
        c0165i.getClass();
        g.o oVar = c0165i.f2192j;
        if (oVar != null) {
            return oVar.m(tVar);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Type inference failed for: r7v8, types: [D0.p, x0.f] */
    @Override // N0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(N0.e eVar, v0.d dVar) {
        N0.a aVar;
        int i2;
        Throwable th;
        O0.n nVar;
        switch (this.f29f) {
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                Object n2 = ((Q) this.f30g).n(new C0019u(eVar, 0), dVar);
                return n2 == w0.a.f3071f ? n2 : t0.g.f2989a;
            default:
                if (dVar instanceof N0.a) {
                    aVar = (N0.a) dVar;
                    int i3 = aVar.f745l;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        aVar.f745l = i3 - Integer.MIN_VALUE;
                        Object obj = aVar.f743j;
                        w0.a aVar2 = w0.a.f3071f;
                        i2 = aVar.f745l;
                        t0.g gVar = t0.g.f2989a;
                        if (i2 != 0) {
                            o.g.C(obj);
                            v0.i iVar = aVar.f3086g;
                            E0.i.b(iVar);
                            O0.n nVar2 = new O0.n(eVar, iVar);
                            try {
                                aVar.f742i = nVar2;
                                aVar.f745l = 1;
                                Object f2 = ((x0.f) this.f30g).f(nVar2, aVar);
                                if (f2 != aVar2) {
                                    f2 = gVar;
                                }
                                if (f2 == aVar2) {
                                    return aVar2;
                                }
                                nVar = nVar2;
                            } catch (Throwable th2) {
                                th = th2;
                                nVar = nVar2;
                                nVar.o();
                                throw th;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            nVar = aVar.f742i;
                            try {
                                o.g.C(obj);
                            } catch (Throwable th3) {
                                th = th3;
                                nVar.o();
                                throw th;
                            }
                        }
                        nVar.o();
                        return gVar;
                    }
                }
                aVar = new N0.a(this, dVar);
                Object obj2 = aVar.f743j;
                w0.a aVar22 = w0.a.f3071f;
                i2 = aVar.f745l;
                t0.g gVar2 = t0.g.f2989a;
                if (i2 != 0) {
                }
                nVar.o();
                return gVar2;
        }
    }

    @Override // D.InterfaceC0008i
    public Object o(D0.p pVar, x0.f fVar) {
        return ((InterfaceC0008i) this.f30g).o(new G.c(pVar, null), fVar);
    }

    @Override // m0.InterfaceC0206d
    public void p(ByteBuffer byteBuffer, C0131g c0131g) {
        C0218p.f2776b.getClass();
        C0218p.c(byteBuffer);
        ((C0126b) this.f30g).getClass();
    }

    @Override // h.K
    public void q(g.j jVar, g.k kVar) {
        ViewOnKeyListenerC0147g viewOnKeyListenerC0147g = (ViewOnKeyListenerC0147g) this.f30g;
        viewOnKeyListenerC0147g.f1942k.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0147g.f1944m;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (jVar == ((C0146f) arrayList.get(i2)).f1931b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        int i3 = i2 + 1;
        viewOnKeyListenerC0147g.f1942k.postAtTime(new RunnableC0145e(this, i3 < arrayList.size() ? (C0146f) arrayList.get(i3) : null, kVar, jVar), jVar, SystemClock.uptimeMillis() + 200);
    }

    public void r(int i2) {
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f30g;
        if (kVar.g(i2)) {
            ((io.flutter.plugin.platform.q) kVar.f2473n.get(Integer.valueOf(i2))).getClass();
            Log.e("PlatformViewsController", "Clearing focus on a null view with id: " + i2);
            return;
        }
        if (kVar.f2475p.get(i2) != null) {
            throw new ClassCastException();
        }
        Log.e("PlatformViewsController", "Clearing focus on an unknown view with id: " + i2);
    }

    public void s(C0174s c0174s) {
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f30g;
        io.flutter.plugin.platform.k.b(kVar, c0174s);
        if (kVar.f2468i.IsSurfaceControlEnabled()) {
            throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
        }
        HashMap hashMap = kVar.f2465f.f1833a;
        String str = (String) c0174s.f2261c;
        if (hashMap.get(str) != null) {
            throw new ClassCastException();
        }
        throw new IllegalStateException(E0.h.f("Trying to create a platform view of unregistered type: ", str));
    }

    public long t(C0174s c0174s) {
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f30g;
        io.flutter.plugin.platform.k.b(kVar, c0174s);
        SparseArray sparseArray = kVar.f2477s;
        int i2 = c0174s.f2259a;
        if (sparseArray.get(i2) != null) {
            throw new IllegalStateException(E0.h.e("Trying to create an already created platform view, view id: ", i2));
        }
        if (kVar.f2469j == null) {
            throw new IllegalStateException(E0.h.e("Texture registry is null. This means that platform views controller was detached, view id: ", i2));
        }
        if (kVar.f2467h == null) {
            throw new IllegalStateException(E0.h.e("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: ", i2));
        }
        HashMap hashMap = kVar.f2465f.f1833a;
        String str = (String) c0174s.f2261c;
        if (hashMap.get(str) == null) {
            throw new IllegalStateException(E0.h.f("Trying to create a platform view of unregistered type: ", str));
        }
        throw new ClassCastException();
    }

    public String toString() {
        switch (this.f29f) {
            case 11:
                return "<" + ((String) this.f30g) + '>';
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [g0.a] */
    public Bitmap u(ByteBuffer byteBuffer, g0.d dVar) {
        ImageDecoder.Source createSource;
        Bitmap decodeBitmap;
        createSource = ImageDecoder.createSource(byteBuffer);
        try {
            decodeBitmap = ImageDecoder.decodeBitmap(createSource, new ImageDecoder.OnHeaderDecodedListener() { // from class: g0.a
                @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                    ColorSpace.Named named;
                    ColorSpace colorSpace;
                    Size size;
                    j jVar = j.this;
                    jVar.getClass();
                    named = ColorSpace.Named.SRGB;
                    colorSpace = ColorSpace.get(named);
                    imageDecoder.setTargetColorSpace(colorSpace);
                    imageDecoder.setAllocator(1);
                    C0121k c0121k = (C0121k) jVar.f30g;
                    if (c0121k != null) {
                        size = imageInfo.getSize();
                        FlutterJNI.nativeImageHeaderCallback(c0121k.f1834a, size.getWidth(), size.getHeight());
                    }
                }
            });
            return decodeBitmap;
        } catch (IOException e2) {
            Log.e("FlutterImageDecoderImplDefault", "Failed to decode image", e2);
            return null;
        }
    }

    public void v(int i2) {
        switch (this.f29f) {
            case 26:
                E0.h.i(((io.flutter.plugin.platform.k) this.f30g).f2475p.get(i2));
                Log.e("PlatformViewsController", "Disposing unknown platform view with id: " + i2);
                break;
            default:
                io.flutter.plugin.platform.j jVar = (io.flutter.plugin.platform.j) this.f30g;
                jVar.r.remove(Integer.valueOf(i2));
                E0.h.i(jVar.f2458l.get(i2));
                Log.e("PlatformViewsController2", "Disposing unknown platform view with id: " + i2);
                break;
        }
    }

    public CharSequence w(l0.e eVar) {
        AbstractActivityC0104f abstractActivityC0104f = ((io.flutter.plugin.platform.e) this.f30g).f2446a;
        ClipboardManager clipboardManager = (ClipboardManager) abstractActivityC0104f.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            try {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null) {
                    return null;
                }
                if (eVar != null && eVar != l0.e.f2694g) {
                    return null;
                }
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                CharSequence text = itemAt.getText();
                if (text != null) {
                    return text;
                }
                try {
                    Uri uri = itemAt.getUri();
                    if (uri == null) {
                        Log.w("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
                    } else {
                        String scheme = uri.getScheme();
                        if (scheme.equals("content")) {
                            AssetFileDescriptor openTypedAssetFileDescriptor = abstractActivityC0104f.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                            CharSequence coerceToText = itemAt.coerceToText(abstractActivityC0104f);
                            if (openTypedAssetFileDescriptor != null) {
                                try {
                                    openTypedAssetFileDescriptor.close();
                                } catch (IOException e2) {
                                    charSequence = coerceToText;
                                    e = e2;
                                    Log.w("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
                                    return charSequence;
                                }
                            }
                            charSequence = coerceToText;
                        } else {
                            Log.w("PlatformPlugin", "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                        }
                    }
                    return charSequence;
                } catch (IOException e3) {
                    e = e3;
                    charSequence = text;
                }
            } catch (IOException e4) {
                e = e4;
            }
        } catch (FileNotFoundException unused) {
            Log.w("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
            return null;
        } catch (SecurityException e5) {
            Log.w("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e5);
            return null;
        }
    }

    public m0 x() {
        N0.q qVar = (N0.q) this.f30g;
        qVar.getClass();
        j jVar = O0.l.f831a;
        Object obj = N0.q.f804j.get(qVar);
        if (obj == jVar) {
            obj = null;
        }
        return (m0) obj;
    }

    public /* synthetic */ j(int i2, boolean z2) {
        this.f29f = i2;
    }

    public j(int i2) {
        this.f29f = i2;
        switch (i2) {
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                this.f30g = new N0.q(n0.f246b);
                break;
            case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f30g = new SparseIntArray();
                break;
            default:
                this.f30g = new AtomicInteger(0);
                break;
        }
    }

    public j(boolean z2) {
        this.f29f = 4;
        this.f30g = new AtomicBoolean(z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(D0.p pVar) {
        this.f29f = 10;
        this.f30g = (x0.f) pVar;
    }
}
