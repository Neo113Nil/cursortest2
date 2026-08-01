package androidx.window.layout;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.util.Log;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final SidecarInterface f2244a;

    /* renamed from: b, reason: collision with root package name */
    public final o f2245b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f2246c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f2247d;
    public M0.h e;

    public r(Context context) {
        D1.i.e(context, "context");
        SidecarInterface b2 = p.b(context);
        o oVar = new o();
        this.f2244a = b2;
        this.f2245b = oVar;
        this.f2246c = new LinkedHashMap();
        this.f2247d = new LinkedHashMap();
    }

    public final SidecarInterface d() {
        return this.f2244a;
    }

    public final z e(Activity activity) {
        IBinder a2 = p.a(activity);
        if (a2 == null) {
            return new z(u1.o.f4473a);
        }
        SidecarInterface sidecarInterface = this.f2244a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface == null ? null : sidecarInterface.getWindowLayoutInfo(a2);
        SidecarInterface sidecarInterface2 = this.f2244a;
        SidecarDeviceState deviceState = sidecarInterface2 != null ? sidecarInterface2.getDeviceState() : null;
        if (deviceState == null) {
            deviceState = new SidecarDeviceState();
        }
        return this.f2245b.e(windowLayoutInfo, deviceState);
    }

    public final void f(Activity activity) {
        SidecarInterface sidecarInterface;
        IBinder a2 = p.a(activity);
        if (a2 == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f2244a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(a2);
        }
        LinkedHashMap linkedHashMap = this.f2247d;
        activity.unregisterComponentCallbacks((ComponentCallbacks) linkedHashMap.get(activity));
        linkedHashMap.remove(activity);
        LinkedHashMap linkedHashMap2 = this.f2246c;
        boolean z2 = linkedHashMap2.size() == 1;
        linkedHashMap2.remove(a2);
        if (!z2 || (sidecarInterface = this.f2244a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    public final void g(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        LinkedHashMap linkedHashMap = this.f2246c;
        linkedHashMap.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f2244a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.f2244a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        M0.h hVar = this.e;
        if (hVar != null) {
            hVar.j(activity, e(activity));
        }
        LinkedHashMap linkedHashMap2 = this.f2247d;
        if (linkedHashMap2.get(activity) == null) {
            q qVar = new q(this, activity);
            linkedHashMap2.put(activity, qVar);
            activity.registerComponentCallbacks(qVar);
        }
    }

    public final void h(s sVar) {
        this.e = new M0.h(sVar);
        SidecarInterface sidecarInterface = this.f2244a;
        if (sidecarInterface == null) {
            return;
        }
        final SidecarInterface.SidecarCallback sidecarCallback = new SidecarInterface.SidecarCallback(this) { // from class: androidx.window.layout.SidecarCompat$TranslatingCallback

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r f2212a;

            {
                D1.i.e(this, "this$0");
                this.f2212a = this;
            }

            public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
                LinkedHashMap linkedHashMap;
                M0.h hVar;
                o oVar;
                SidecarInterface d2;
                D1.i.e(sidecarDeviceState, "newDeviceState");
                linkedHashMap = this.f2212a.f2246c;
                Collection<Activity> values = linkedHashMap.values();
                r rVar = this.f2212a;
                for (Activity activity : values) {
                    IBinder a2 = p.a(activity);
                    SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                    if (a2 != null && (d2 = rVar.d()) != null) {
                        sidecarWindowLayoutInfo = d2.getWindowLayoutInfo(a2);
                    }
                    hVar = rVar.e;
                    if (hVar != null) {
                        oVar = rVar.f2245b;
                        hVar.j(activity, oVar.e(sidecarWindowLayoutInfo, sidecarDeviceState));
                    }
                }
            }

            public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
                LinkedHashMap linkedHashMap;
                o oVar;
                M0.h hVar;
                D1.i.e(iBinder, "windowToken");
                D1.i.e(sidecarWindowLayoutInfo, "newLayout");
                linkedHashMap = this.f2212a.f2246c;
                Activity activity = (Activity) linkedHashMap.get(iBinder);
                if (activity == null) {
                    Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                    return;
                }
                oVar = this.f2212a.f2245b;
                SidecarInterface d2 = this.f2212a.d();
                SidecarDeviceState deviceState = d2 == null ? null : d2.getDeviceState();
                if (deviceState == null) {
                    deviceState = new SidecarDeviceState();
                }
                z e = oVar.e(sidecarWindowLayoutInfo, deviceState);
                hVar = this.f2212a.e;
                if (hVar == null) {
                    return;
                }
                hVar.j(activity, e);
            }
        };
        final o oVar = this.f2245b;
        sidecarInterface.setSidecarCallback(new SidecarInterface.SidecarCallback(oVar, sidecarCallback) { // from class: androidx.window.layout.SidecarCompat$DistinctSidecarElementCallback

            /* renamed from: a, reason: collision with root package name */
            public final o f2208a;

            /* renamed from: b, reason: collision with root package name */
            public final SidecarInterface.SidecarCallback f2209b;

            /* renamed from: c, reason: collision with root package name */
            public final ReentrantLock f2210c;

            /* renamed from: d, reason: collision with root package name */
            public SidecarDeviceState f2211d;
            public final WeakHashMap e;

            {
                D1.i.e(oVar, "sidecarAdapter");
                this.f2208a = oVar;
                this.f2209b = sidecarCallback;
                this.f2210c = new ReentrantLock();
                this.e = new WeakHashMap();
            }

            public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
                D1.i.e(sidecarDeviceState, "newDeviceState");
                ReentrantLock reentrantLock = this.f2210c;
                reentrantLock.lock();
                try {
                    o oVar2 = this.f2208a;
                    SidecarDeviceState sidecarDeviceState2 = this.f2211d;
                    oVar2.getClass();
                    if (o.a(sidecarDeviceState2, sidecarDeviceState)) {
                        return;
                    }
                    this.f2211d = sidecarDeviceState;
                    this.f2209b.onDeviceStateChanged(sidecarDeviceState);
                } finally {
                    reentrantLock.unlock();
                }
            }

            public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
                D1.i.e(iBinder, "token");
                D1.i.e(sidecarWindowLayoutInfo, "newLayout");
                synchronized (this.f2210c) {
                    SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.e.get(iBinder);
                    this.f2208a.getClass();
                    if (o.d(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                        return;
                    }
                    this.f2209b.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064 A[Catch: all -> 0x018a, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089 A[Catch: all -> 0x018a, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae A[Catch: all -> 0x018a, TRY_LEAVE, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015a A[Catch: all -> 0x018a, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a4 A[Catch: all -> 0x018a, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0166 A[Catch: all -> 0x018a, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007f A[Catch: all -> 0x018a, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0172 A[Catch: all -> 0x018a, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0058 A[Catch: all -> 0x018a, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017e A[Catch: all -> 0x018a, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x001e A[Catch: all -> 0x018a, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[Catch: all -> 0x018a, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i() {
        Class<?> cls;
        Method method;
        Class<?> returnType;
        Class cls2;
        Class<?> cls3;
        Method method2;
        Class<?> returnType2;
        Class<?> cls4;
        Method method3;
        Class<?> returnType3;
        Class<?> cls5;
        Method method4;
        Class<?> returnType4;
        try {
            SidecarInterface sidecarInterface = this.f2244a;
            if (sidecarInterface != null && (cls = sidecarInterface.getClass()) != null) {
                method = cls.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
                returnType = method != null ? null : method.getReturnType();
                cls2 = Void.TYPE;
                if (D1.i.a(returnType, cls2)) {
                    throw new NoSuchMethodException(D1.i.h(returnType, "Illegal return type for 'setSidecarCallback': "));
                }
                SidecarInterface sidecarInterface2 = this.f2244a;
                if (sidecarInterface2 != null) {
                    sidecarInterface2.getDeviceState();
                }
                SidecarInterface sidecarInterface3 = this.f2244a;
                if (sidecarInterface3 != null) {
                    sidecarInterface3.onDeviceStateListenersChanged(true);
                }
                SidecarInterface sidecarInterface4 = this.f2244a;
                if (sidecarInterface4 != null && (cls3 = sidecarInterface4.getClass()) != null) {
                    method2 = cls3.getMethod("getWindowLayoutInfo", IBinder.class);
                    returnType2 = method2 != null ? null : method2.getReturnType();
                    if (D1.i.a(returnType2, SidecarWindowLayoutInfo.class)) {
                        throw new NoSuchMethodException(D1.i.h(returnType2, "Illegal return type for 'getWindowLayoutInfo': "));
                    }
                    SidecarInterface sidecarInterface5 = this.f2244a;
                    if (sidecarInterface5 != null && (cls4 = sidecarInterface5.getClass()) != null) {
                        method3 = cls4.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
                        returnType3 = method3 != null ? null : method3.getReturnType();
                        if (D1.i.a(returnType3, cls2)) {
                            throw new NoSuchMethodException(D1.i.h(returnType3, "Illegal return type for 'onWindowLayoutChangeListenerAdded': "));
                        }
                        SidecarInterface sidecarInterface6 = this.f2244a;
                        if (sidecarInterface6 != null && (cls5 = sidecarInterface6.getClass()) != null) {
                            method4 = cls5.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
                            returnType4 = method4 != null ? null : method4.getReturnType();
                            if (D1.i.a(returnType4, cls2)) {
                                throw new NoSuchMethodException(D1.i.h(returnType4, "Illegal return type for 'onWindowLayoutChangeListenerRemoved': "));
                            }
                            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
                            try {
                                sidecarDeviceState.posture = 3;
                            } catch (NoSuchFieldError unused) {
                                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                                Object invoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                                if (invoke == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                                }
                                if (((Integer) invoke).intValue() != 3) {
                                    throw new Exception("Invalid device posture getter/setter");
                                }
                            }
                            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
                            Rect rect = sidecarDisplayFeature.getRect();
                            D1.i.d(rect, "displayFeature.rect");
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
                                if (invoke2 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                                }
                                if (D1.i.a(arrayList, (List) invoke2)) {
                                    return true;
                                }
                                throw new Exception("Invalid display feature getter/setter");
                            }
                        }
                        method4 = null;
                        if (method4 != null) {
                        }
                        if (D1.i.a(returnType4, cls2)) {
                        }
                    }
                    method3 = null;
                    if (method3 != null) {
                    }
                    if (D1.i.a(returnType3, cls2)) {
                    }
                }
                method2 = null;
                if (method2 != null) {
                }
                if (D1.i.a(returnType2, SidecarWindowLayoutInfo.class)) {
                }
            }
            method = null;
            if (method != null) {
            }
            cls2 = Void.TYPE;
            if (D1.i.a(returnType, cls2)) {
            }
        } catch (Throwable unused3) {
            return false;
        }
    }
}
