package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class s2x extends erh {
    public static final msg g = new msg("MRDiscoveryCallback", null);
    public final nur f;
    public final Map d = Collections.synchronizedMap(new HashMap());
    public final LinkedHashSet e = new LinkedHashSet();
    public final Set c = Collections.synchronizedSet(new LinkedHashSet());
    public final q2x b = new q2x(this);

    public s2x(Context context) {
        this.f = new nur(context);
    }

    public final void a() {
        msg msgVar = g;
        msgVar.b(dfi.c(this.e.size(), "Starting RouteDiscovery with ", " IDs"), new Object[0]);
        msgVar.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.d.keySet())), new Object[0]);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            b();
        } else {
            new fsn(Looper.getMainLooper(), 3).post(new g2x(this, 1));
        }
    }

    public final void b() {
        nur nurVar = this.f;
        if (((krh) nurVar.c) == null) {
            nurVar.c = krh.d((Context) nurVar.b);
        }
        krh krhVar = (krh) nurVar.c;
        if (krhVar != null) {
            krhVar.i(this);
        }
        synchronized (this.e) {
            try {
                Iterator it = this.e.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String J = vwb.J(str);
                    ArrayList<String> arrayList = new ArrayList<>();
                    if (!arrayList.contains(J)) {
                        arrayList.add(J);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("controlCategories", arrayList);
                    crh crhVar = new crh(bundle, arrayList);
                    if (((p2x) this.d.get(str)) == null) {
                        this.d.put(str, new p2x(crhVar));
                    }
                    g.b("Adding mediaRouter callback for control category " + vwb.J(str), new Object[0]);
                    nur nurVar2 = this.f;
                    if (((krh) nurVar2.c) == null) {
                        nurVar2.c = krh.d((Context) nurVar2.b);
                    }
                    ((krh) nurVar2.c).a(crhVar, this, 4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.d.keySet())), new Object[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x015d, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0170, code lost:
    
        throw r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(irh irhVar, boolean z) {
        boolean z2;
        Set t;
        boolean remove;
        msg msgVar = g;
        msgVar.b("MediaRouterDiscoveryCallback.updateRouteToAppIds (add=%b) route %s", Boolean.valueOf(z), irhVar);
        synchronized (this.d) {
            try {
                msgVar.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.d.keySet())), new Object[0]);
                z2 = false;
                for (Map.Entry entry : this.d.entrySet()) {
                    String str = (String) entry.getKey();
                    p2x p2xVar = (p2x) entry.getValue();
                    if (irhVar.h(p2xVar.b)) {
                        if (z) {
                            msg msgVar2 = g;
                            msgVar2.b("Adding/updating route for appId " + str, new Object[0]);
                            remove = p2xVar.a.add(irhVar);
                            if (!remove) {
                                Log.w(msgVar2.a, msgVar2.d("Route " + String.valueOf(irhVar) + " already exists for appId " + str, new Object[0]));
                            }
                        } else {
                            msg msgVar3 = g;
                            msgVar3.b("Removing route for appId " + str, new Object[0]);
                            remove = p2xVar.a.remove(irhVar);
                            if (!remove) {
                                Log.w(msgVar3.a, msgVar3.d("Route " + String.valueOf(irhVar) + " already removed from appId " + str, new Object[0]));
                            }
                        }
                        z2 = remove;
                    }
                }
            } finally {
            }
        }
        if (z2) {
            g.b("Invoking callback.onRouteUpdated.", new Object[0]);
            synchronized (this.c) {
                try {
                    HashMap hashMap = new HashMap();
                    synchronized (this.d) {
                        for (String str2 : this.d.keySet()) {
                            p2x p2xVar2 = (p2x) this.d.get(hyf.R(str2));
                            if (p2xVar2 == null) {
                                int i = ocx.e;
                                t = idx.l;
                            } else {
                                LinkedHashSet linkedHashSet = p2xVar2.a;
                                int i2 = ocx.e;
                                Object[] array = linkedHashSet.toArray();
                                t = ocx.t(array.length, array);
                            }
                            if (!t.isEmpty()) {
                                hashMap.put(str2, t);
                            }
                        }
                    }
                    u7x.a(hashMap.entrySet());
                    Iterator it = this.c.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                } finally {
                }
            }
        }
    }

    @Override // defpackage.erh
    public final void onRouteAdded(krh krhVar, irh irhVar) {
        g.b("MediaRouterDiscoveryCallback.onRouteAdded.", new Object[0]);
        c(irhVar, true);
    }

    @Override // defpackage.erh
    public final void onRouteChanged(krh krhVar, irh irhVar) {
        g.b("MediaRouterDiscoveryCallback.onRouteChanged.", new Object[0]);
        c(irhVar, true);
    }

    @Override // defpackage.erh
    public final void onRouteRemoved(krh krhVar, irh irhVar) {
        g.b("MediaRouterDiscoveryCallback.onRouteRemoved.", new Object[0]);
        c(irhVar, false);
    }
}
