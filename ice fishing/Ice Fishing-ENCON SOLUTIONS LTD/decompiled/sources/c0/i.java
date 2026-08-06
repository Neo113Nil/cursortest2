package c0;

import I0.b;
import Z.j;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.util.Log;
import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import c0.C0137f;
import c0.g;
import i1.r;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.i;
import x.InterfaceC1063a;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final SidecarInterface f2646a;

    /* renamed from: b, reason: collision with root package name */
    public final C0137f f2647b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f2648c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f2649d;

    /* renamed from: e, reason: collision with root package name */
    public I0.b f2650e;

    public i(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        SidecarInterface b2 = g.b(context);
        C0137f c0137f = new C0137f();
        this.f2646a = b2;
        this.f2647b = c0137f;
        this.f2648c = new LinkedHashMap();
        this.f2649d = new LinkedHashMap();
    }

    public final SidecarInterface d() {
        return this.f2646a;
    }

    public final Z.j e(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        IBinder a2 = g.a(activity);
        if (a2 == null) {
            return new Z.j(r.f3416a);
        }
        SidecarInterface sidecarInterface = this.f2646a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(a2) : null;
        SidecarInterface sidecarInterface2 = this.f2646a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return this.f2647b.e(windowLayoutInfo, sidecarDeviceState);
    }

    public final void f(Activity activity) {
        SidecarInterface sidecarInterface;
        IBinder a2 = g.a(activity);
        if (a2 == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f2646a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(a2);
        }
        LinkedHashMap linkedHashMap = this.f2649d;
        if (((InterfaceC1063a) linkedHashMap.get(activity)) != null) {
            linkedHashMap.remove(activity);
        }
        I0.b bVar = this.f2650e;
        if (bVar != null) {
            bVar.s(activity);
        }
        LinkedHashMap linkedHashMap2 = this.f2648c;
        boolean z2 = linkedHashMap2.size() == 1;
        linkedHashMap2.remove(a2);
        if (!z2 || (sidecarInterface = this.f2646a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    public final void g(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        LinkedHashMap linkedHashMap = this.f2648c;
        linkedHashMap.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f2646a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.f2646a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        I0.b bVar = this.f2650e;
        if (bVar != null) {
            bVar.J(activity, e(activity));
        }
        this.f2649d.get(activity);
    }

    public final void h(Z0.i iVar) {
        this.f2650e = new I0.b(iVar);
        SidecarInterface sidecarInterface = this.f2646a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f2647b, new SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
                public void onDeviceStateChanged(SidecarDeviceState newDeviceState) {
                    LinkedHashMap linkedHashMap;
                    b bVar;
                    C0137f c0137f;
                    SidecarInterface d2;
                    i.e(newDeviceState, "newDeviceState");
                    linkedHashMap = c0.i.this.f2648c;
                    Collection<Activity> values = linkedHashMap.values();
                    c0.i iVar2 = c0.i.this;
                    for (Activity activity : values) {
                        IBinder a2 = g.a(activity);
                        SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                        if (a2 != null && (d2 = iVar2.d()) != null) {
                            sidecarWindowLayoutInfo = d2.getWindowLayoutInfo(a2);
                        }
                        bVar = iVar2.f2650e;
                        if (bVar != null) {
                            c0137f = iVar2.f2647b;
                            bVar.J(activity, c0137f.e(sidecarWindowLayoutInfo, newDeviceState));
                        }
                    }
                }

                public void onWindowLayoutChanged(IBinder windowToken, SidecarWindowLayoutInfo newLayout) {
                    LinkedHashMap linkedHashMap;
                    C0137f c0137f;
                    SidecarDeviceState sidecarDeviceState;
                    b bVar;
                    i.e(windowToken, "windowToken");
                    i.e(newLayout, "newLayout");
                    linkedHashMap = c0.i.this.f2648c;
                    Activity activity = (Activity) linkedHashMap.get(windowToken);
                    if (activity == null) {
                        Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                        return;
                    }
                    c0137f = c0.i.this.f2647b;
                    SidecarInterface d2 = c0.i.this.d();
                    if (d2 == null || (sidecarDeviceState = d2.getDeviceState()) == null) {
                        sidecarDeviceState = new SidecarDeviceState();
                    }
                    j e2 = c0137f.e(newLayout, sidecarDeviceState);
                    bVar = c0.i.this.f2650e;
                    if (bVar != null) {
                        bVar.J(activity, e2);
                    }
                }
            }));
        }
    }

    public final boolean i() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.f2646a;
            Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method != null ? method.getReturnType() : null;
            Class cls5 = Void.TYPE;
            if (!kotlin.jvm.internal.i.a(returnType, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
            }
            SidecarInterface sidecarInterface2 = this.f2646a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f2646a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f2646a;
            Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
            if (!kotlin.jvm.internal.i.a(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            SidecarInterface sidecarInterface5 = this.f2646a;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!kotlin.jvm.internal.i.a(returnType3, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
            }
            SidecarInterface sidecarInterface6 = this.f2646a;
            Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
            if (!kotlin.jvm.internal.i.a(returnType4, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                kotlin.jvm.internal.i.c(invoke, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) invoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            kotlin.jvm.internal.i.d(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return true;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object invoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                kotlin.jvm.internal.i.c(invoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                if (kotlin.jvm.internal.i.a(arrayList, (List) invoke2)) {
                    return true;
                }
                throw new Exception("Invalid display feature getter/setter");
            }
        } catch (Throwable unused3) {
            return false;
        }
    }
}
