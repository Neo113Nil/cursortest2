package A;

import A.j;
import D.C0003d;
import D.C0019u;
import D.InterfaceC0008i;
import D.d0;
import D.f0;
import D.m0;
import D.n0;
import L.C0026b;
import L.Q;
import L0.C0058p;
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
import l0.C0203f;
import l0.C0205h;
import l0.C0206i;
import l0.C0207j;
import l0.C0208k;
import l0.EnumC0202e;
import l0.EnumC0204g;
import m0.InterfaceC0217b;
import m0.InterfaceC0219d;
import t0.C0252g;

/* loaded from: classes.dex */
public class j implements O0.d, InterfaceC0008i, J.e, InterfaceC0219d, m0.f, K, g.o, InterfaceC0168l, InterfaceC0217b, m0.k {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f29e;

    /* renamed from: f, reason: collision with root package name */
    public Object f30f;

    public /* synthetic */ j(int i2, Object obj) {
        this.f29e = i2;
        this.f30f = obj;
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
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f30f;
        if (kVar.g(i2)) {
            return;
        }
        Log.e("PlatformViewsController", "Setting offset for unknown platform view with id: " + i2);
    }

    public void B(C0205h c0205h) {
        PriorityQueue priorityQueue;
        LongSparseArray longSparseArray;
        long j2;
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f30f;
        float f2 = kVar.f2474f.getResources().getDisplayMetrics().density;
        int i2 = c0205h.f2716a;
        if (!kVar.g(i2)) {
            if (kVar.f2483o.get(i2) != null) {
                throw new ClassCastException();
            }
            Log.e("PlatformViewsController", "Sending touch to an unknown view with id: " + i2);
            return;
        }
        io.flutter.plugin.platform.q qVar = (io.flutter.plugin.platform.q) kVar.f2481m.get(Integer.valueOf(i2));
        H h2 = new H(c0205h.f2731p);
        while (true) {
            Q q2 = kVar.f2491x;
            priorityQueue = (PriorityQueue) q2.f520g;
            boolean isEmpty = priorityQueue.isEmpty();
            longSparseArray = (LongSparseArray) q2.f519f;
            j2 = h2.f1671a;
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
        List<List> list = (List) c0205h.f2722g;
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
        int i3 = c0205h.f2720e;
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i3]);
        List<List> list3 = (List) c0205h.f2721f;
        ArrayList arrayList2 = new ArrayList();
        for (List list4 : list3) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.id = ((Integer) list4.get(0)).intValue();
            pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
            arrayList2.add(pointerProperties);
        }
        MotionEvent.obtain(c0205h.f2717b.longValue(), c0205h.f2718c.longValue(), c0205h.f2719d, c0205h.f2720e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i3]), pointerCoordsArr, c0205h.f2723h, c0205h.f2724i, c0205h.f2725j, c0205h.f2726k, c0205h.f2727l, c0205h.f2728m, c0205h.f2729n, c0205h.f2730o);
        qVar.getClass();
    }

    public void C(C0207j c0207j, C0206i c0206i) {
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f30f;
        int i2 = kVar.i(c0207j.f2733b);
        int i3 = kVar.i(c0207j.f2734c);
        int i4 = c0207j.f2732a;
        if (!kVar.g(i4)) {
            if (kVar.f2483o.get(i4) != null) {
                throw new ClassCastException();
            }
            Log.e("PlatformViewsController", "Resizing unknown platform view with id: " + i4);
            return;
        }
        float f2 = kVar.f2474f.getResources().getDisplayMetrics().density;
        io.flutter.plugin.platform.q qVar = (io.flutter.plugin.platform.q) kVar.f2481m.get(Integer.valueOf(i4));
        io.flutter.plugin.editing.l lVar = kVar.f2478j;
        if (lVar != null) {
            if (lVar.f2436e.f582b == 3) {
                lVar.f2447p = true;
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
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f30f;
        if (kVar.g(i2)) {
            ((io.flutter.plugin.platform.q) kVar.f2481m.get(Integer.valueOf(i2))).getClass();
            Log.e("PlatformViewsController", "Setting direction to a null view with id: " + i2);
            return;
        }
        if (kVar.f2483o.get(i2) != null) {
            throw new ClassCastException();
        }
        Log.e("PlatformViewsController", "Setting direction to an unknown view with id: " + i2);
    }

    public void E(ArrayList arrayList) {
        io.flutter.plugin.platform.e eVar = (io.flutter.plugin.platform.e) this.f30f;
        if (eVar.f2459f) {
            eVar.f2459f = false;
            o.g.y(eVar.f2454a.getWindow(), true);
        }
        int i2 = arrayList.isEmpty() ? 5894 : 1798;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            int ordinal = ((EnumC0204g) arrayList.get(i3)).ordinal();
            if (ordinal == 0) {
                i2 &= -5;
            } else if (ordinal == 1) {
                i2 &= -515;
            }
        }
        eVar.f2458e = i2;
        eVar.b();
    }

    public void F(int i2) {
        int i3;
        io.flutter.plugin.platform.e eVar = (io.flutter.plugin.platform.e) this.f30f;
        eVar.getClass();
        AbstractActivityC0104f abstractActivityC0104f = eVar.f2454a;
        if (i2 != 4 && eVar.f2459f) {
            eVar.f2459f = false;
            o.g.y(abstractActivityC0104f.getWindow(), true);
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
                eVar.f2459f = true;
                o.g.y(abstractActivityC0104f.getWindow(), false);
                C0203f c0203f = eVar.f2457d;
                if (c0203f != null) {
                    eVar.a(c0203f);
                    return;
                }
                return;
            }
            i3 = 5894;
        }
        eVar.f2458e = i3;
        eVar.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r7.f242a > r3.f242a) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void G(m0 m0Var) {
        O0.q qVar;
        Object obj;
        Object obj2;
        E0.i.e(m0Var, "newState");
        do {
            qVar = (O0.q) this.f30f;
            qVar.getClass();
            obj = P0.l.f850a;
            Object obj3 = O0.q.f812i.get(qVar);
            obj2 = obj3;
            if (obj3 == obj) {
                obj2 = null;
            }
            m0 m0Var2 = (m0) obj2;
            if (!(m0Var2 instanceof f0 ? true : E0.i.a(m0Var2, n0.f247b))) {
                if (!(m0Var2 instanceof C0003d)) {
                    if (!(m0Var2 instanceof d0)) {
                        throw new C0058p();
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
        View decorView = ((io.flutter.plugin.platform.e) this.f30f).f2454a.getWindow().getDecorView();
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
            ((t) jVar).f2049v.j().c(false);
        }
        g.o oVar = ((C0165i) this.f30f).f2199i;
        if (oVar != null) {
            oVar.a(jVar, z2);
        }
    }

    @Override // h.K
    public void b(g.j jVar, g.k kVar) {
        ((ViewOnKeyListenerC0147g) this.f30f).f1949j.removeCallbacksAndMessages(jVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Type inference failed for: r7v8, types: [D0.p, x0.f] */
    @Override // O0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(O0.e eVar, v0.d dVar) {
        O0.a aVar;
        int i2;
        Throwable th;
        P0.n nVar;
        switch (this.f29e) {
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                Object c2 = ((Q) this.f30f).c(new C0019u(eVar, 0), dVar);
                return c2 == w0.a.f3076e ? c2 : C0252g.f2994a;
            default:
                if (dVar instanceof O0.a) {
                    aVar = (O0.a) dVar;
                    int i3 = aVar.f753k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        aVar.f753k = i3 - Integer.MIN_VALUE;
                        Object obj = aVar.f751i;
                        w0.a aVar2 = w0.a.f3076e;
                        i2 = aVar.f753k;
                        C0252g c0252g = C0252g.f2994a;
                        if (i2 != 0) {
                            o.g.z(obj);
                            v0.i iVar = aVar.f3091f;
                            E0.i.b(iVar);
                            P0.n nVar2 = new P0.n(eVar, iVar);
                            try {
                                aVar.f750h = nVar2;
                                aVar.f753k = 1;
                                Object f2 = ((x0.f) this.f30f).f(nVar2, aVar);
                                if (f2 != aVar2) {
                                    f2 = c0252g;
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
                            nVar = aVar.f750h;
                            try {
                                o.g.z(obj);
                            } catch (Throwable th3) {
                                th = th3;
                                nVar.o();
                                throw th;
                            }
                        }
                        nVar.o();
                        return c0252g;
                    }
                }
                aVar = new O0.a(this, dVar);
                Object obj2 = aVar.f751i;
                w0.a aVar22 = w0.a.f3076e;
                i2 = aVar.f753k;
                C0252g c0252g2 = C0252g.f2994a;
                if (i2 != 0) {
                }
                nVar.o();
                return c0252g2;
        }
    }

    @Override // m0.f
    public E.a d(m0.i iVar) {
        return ((C0133i) this.f30f).d(iVar);
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
        ((ProfileInstallReceiver) this.f30f).setResultCode(i2);
    }

    @Override // m0.f
    public void f(String str, InterfaceC0219d interfaceC0219d) {
        ((C0133i) this.f30f).g(str, interfaceC0219d, null);
    }

    @Override // m0.f
    public void g(String str, InterfaceC0219d interfaceC0219d, E.a aVar) {
        ((C0133i) this.f30f).g(str, interfaceC0219d, aVar);
    }

    @Override // m0.k
    public void i(Q q2, C0208k c0208k) {
        ((E.a) this.f30f).getClass();
    }

    @Override // J.e
    public void j() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // m0.InterfaceC0217b
    public void k(Object obj, Q q2) {
        HashMap hashMap;
        HashMap hashMap2;
        C0026b c0026b = (C0026b) this.f30f;
        if (((io.flutter.view.b) c0026b.f526h) == null) {
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
                    io.flutter.view.b bVar = (io.flutter.view.b) c0026b.f526h;
                    if (Build.VERSION.SDK_INT < 28) {
                        io.flutter.view.h hVar = (io.flutter.view.h) bVar.f2503a;
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
                    io.flutter.view.b bVar2 = (io.flutter.view.b) c0026b.f526h;
                    if (Build.VERSION.SDK_INT >= 36) {
                        bVar2.getClass();
                        Log.w("AccessibilityBridge", "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
                    }
                    ((io.flutter.view.h) bVar2.f2503a).f2593a.announceForAccessibility(str3);
                    break;
                }
                break;
            case "tap":
                Integer num = (Integer) hashMap.get("nodeId");
                if (num != null) {
                    io.flutter.view.b bVar3 = (io.flutter.view.b) c0026b.f526h;
                    ((io.flutter.view.h) bVar3.f2503a).g(num.intValue(), 1);
                    break;
                }
                break;
            case "focus":
                Integer num2 = (Integer) hashMap.get("nodeId");
                if (num2 != null) {
                    io.flutter.view.b bVar4 = (io.flutter.view.b) c0026b.f526h;
                    ((io.flutter.view.h) bVar4.f2503a).g(num2.intValue(), 8);
                    break;
                }
                break;
            case "longPress":
                Integer num3 = (Integer) hashMap.get("nodeId");
                if (num3 != null) {
                    io.flutter.view.b bVar5 = (io.flutter.view.b) c0026b.f526h;
                    ((io.flutter.view.h) bVar5.f2503a).g(num3.intValue(), 2);
                    break;
                }
                break;
        }
        q2.e(null);
    }

    @Override // D.InterfaceC0008i
    public O0.d l() {
        return ((InterfaceC0008i) this.f30f).l();
    }

    @Override // m0.f
    public void m(String str, ByteBuffer byteBuffer, m0.e eVar) {
        ((C0133i) this.f30f).m(str, byteBuffer, eVar);
    }

    @Override // g.o
    public boolean n(t tVar) {
        if (tVar == null) {
            return false;
        }
        tVar.f2050w.getClass();
        C0165i c0165i = (C0165i) this.f30f;
        c0165i.getClass();
        g.o oVar = c0165i.f2199i;
        if (oVar != null) {
            return oVar.n(tVar);
        }
        return false;
    }

    @Override // D.InterfaceC0008i
    public Object o(D0.p pVar, x0.f fVar) {
        return ((InterfaceC0008i) this.f30f).o(new G.c(pVar, null), fVar);
    }

    @Override // m0.InterfaceC0219d
    public void p(ByteBuffer byteBuffer, C0131g c0131g) {
        m0.p.f2784b.getClass();
        m0.p.c(byteBuffer);
        ((C0126b) this.f30f).getClass();
    }

    @Override // h.K
    public void q(g.j jVar, g.k kVar) {
        ViewOnKeyListenerC0147g viewOnKeyListenerC0147g = (ViewOnKeyListenerC0147g) this.f30f;
        viewOnKeyListenerC0147g.f1949j.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0147g.f1951l;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (jVar == ((C0146f) arrayList.get(i2)).f1939b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        int i3 = i2 + 1;
        viewOnKeyListenerC0147g.f1949j.postAtTime(new RunnableC0145e(this, i3 < arrayList.size() ? (C0146f) arrayList.get(i3) : null, kVar, jVar), jVar, SystemClock.uptimeMillis() + 200);
    }

    public void r(int i2) {
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f30f;
        if (kVar.g(i2)) {
            ((io.flutter.plugin.platform.q) kVar.f2481m.get(Integer.valueOf(i2))).getClass();
            Log.e("PlatformViewsController", "Clearing focus on a null view with id: " + i2);
            return;
        }
        if (kVar.f2483o.get(i2) != null) {
            throw new ClassCastException();
        }
        Log.e("PlatformViewsController", "Clearing focus on an unknown view with id: " + i2);
    }

    public void s(C0174s c0174s) {
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f30f;
        io.flutter.plugin.platform.k.b(kVar, c0174s);
        if (kVar.f2476h.IsSurfaceControlEnabled()) {
            throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
        }
        HashMap hashMap = kVar.f2473e.f1841a;
        String str = (String) c0174s.f2269c;
        if (hashMap.get(str) != null) {
            throw new ClassCastException();
        }
        throw new IllegalStateException(E0.h.f("Trying to create a platform view of unregistered type: ", str));
    }

    public long t(C0174s c0174s) {
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f30f;
        io.flutter.plugin.platform.k.b(kVar, c0174s);
        SparseArray sparseArray = kVar.r;
        int i2 = c0174s.f2267a;
        if (sparseArray.get(i2) != null) {
            throw new IllegalStateException(E0.h.e("Trying to create an already created platform view, view id: ", i2));
        }
        if (kVar.f2477i == null) {
            throw new IllegalStateException(E0.h.e("Texture registry is null. This means that platform views controller was detached, view id: ", i2));
        }
        if (kVar.f2475g == null) {
            throw new IllegalStateException(E0.h.e("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: ", i2));
        }
        HashMap hashMap = kVar.f2473e.f1841a;
        String str = (String) c0174s.f2269c;
        if (hashMap.get(str) == null) {
            throw new IllegalStateException(E0.h.f("Trying to create a platform view of unregistered type: ", str));
        }
        throw new ClassCastException();
    }

    public String toString() {
        switch (this.f29e) {
            case 11:
                return "<" + ((String) this.f30f) + '>';
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
                    C0121k c0121k = (C0121k) jVar.f30f;
                    if (c0121k != null) {
                        size = imageInfo.getSize();
                        FlutterJNI.nativeImageHeaderCallback(c0121k.f1842a, size.getWidth(), size.getHeight());
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
        switch (this.f29e) {
            case 26:
                E0.h.h(((io.flutter.plugin.platform.k) this.f30f).f2483o.get(i2));
                Log.e("PlatformViewsController", "Disposing unknown platform view with id: " + i2);
                break;
            default:
                io.flutter.plugin.platform.j jVar = (io.flutter.plugin.platform.j) this.f30f;
                jVar.f2472q.remove(Integer.valueOf(i2));
                E0.h.h(jVar.f2466k.get(i2));
                Log.e("PlatformViewsController2", "Disposing unknown platform view with id: " + i2);
                break;
        }
    }

    public CharSequence w(EnumC0202e enumC0202e) {
        AbstractActivityC0104f abstractActivityC0104f = ((io.flutter.plugin.platform.e) this.f30f).f2454a;
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
                if (enumC0202e != null && enumC0202e != EnumC0202e.f2702f) {
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
        O0.q qVar = (O0.q) this.f30f;
        qVar.getClass();
        j jVar = P0.l.f850a;
        Object obj = O0.q.f812i.get(qVar);
        if (obj == jVar) {
            obj = null;
        }
        return (m0) obj;
    }

    public /* synthetic */ j(int i2, boolean z2) {
        this.f29e = i2;
    }

    public j(int i2) {
        this.f29e = i2;
        switch (i2) {
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                this.f30f = new O0.q(n0.f247b);
                break;
            case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f30f = new SparseIntArray();
                break;
            default:
                this.f30f = new AtomicInteger(0);
                break;
        }
    }

    public j(boolean z2) {
        this.f29e = 4;
        this.f30f = new AtomicBoolean(z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(D0.p pVar) {
        this.f29e = 10;
        this.f30f = (x0.f) pVar;
    }
}
