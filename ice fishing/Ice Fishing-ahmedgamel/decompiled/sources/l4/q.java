package l4;

import N3.InterfaceC0323a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.AbstractComponentCallbacksC0479s;
import androidx.fragment.app.N;
import androidx.fragment.app.S;
import androidx.fragment.app.V;
import com.google.android.play.core.hsdp.service.HsdpShimActivity;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import n1.C4765b;
import o1.C4800d;

/* loaded from: classes2.dex */
public final class q implements InterfaceC0323a {

    /* renamed from: x, reason: collision with root package name */
    public static q f38944x;

    /* renamed from: n, reason: collision with root package name */
    public Object f38945n;

    /* renamed from: u, reason: collision with root package name */
    public Object f38946u;

    /* renamed from: v, reason: collision with root package name */
    public Object f38947v;

    /* renamed from: w, reason: collision with root package name */
    public Object f38948w;

    public q(int i) {
        switch (i) {
            case 3:
                this.f38945n = new ArrayList();
                this.f38946u = new HashMap();
                this.f38947v = new HashMap();
                break;
            default:
                this.f38945n = null;
                this.f38946u = null;
                this.f38947v = null;
                this.f38948w = new ArrayDeque();
                break;
        }
    }

    public static synchronized q g() {
        q qVar;
        synchronized (q.class) {
            try {
                if (f38944x == null) {
                    f38944x = new q(0);
                }
                qVar = f38944x;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    @Override // N3.InterfaceC0323a
    public void K(Bundle bundle) {
        Log.e("HsdpShimActivity", "HSDP service based UI error: " + String.valueOf(bundle) + ". Finish the shim activity.");
        Intent v9 = Q3.b.v((String) this.f38945n, (String) this.f38946u, (HashMap) this.f38947v);
        HsdpShimActivity hsdpShimActivity = (HsdpShimActivity) this.f38948w;
        hsdpShimActivity.startActivityForResult(v9, 0);
        hsdpShimActivity.f36948n = null;
        hsdpShimActivity.f36949u = false;
        hsdpShimActivity.finish();
    }

    @Override // N3.InterfaceC0323a
    public void O(Bundle bundle) {
        Log.i("HsdpShimActivity", "HSDP service based UI shown");
        ((HsdpShimActivity) this.f38948w).f36949u = true;
    }

    @Override // N3.InterfaceC0323a
    public void W(Bundle bundle) {
        boolean isLoggable = Log.isLoggable("HsdpShimActivity", 4);
        HsdpShimActivity hsdpShimActivity = (HsdpShimActivity) this.f38948w;
        if (isLoggable) {
            Log.i("HsdpShimActivity", "HSDP service based UI dismissed. hasBeenShown=" + hsdpShimActivity.f36949u);
        }
        boolean z6 = bundle.getBoolean("dldpRedirect", false);
        if (!hsdpShimActivity.f36949u && !z6) {
            Log.i("HsdpShimActivity", "Ignore dismiss before shown (likely temporary reuse cleanup)");
            return;
        }
        Log.i("HsdpShimActivity", "Finish the shim activity.");
        hsdpShimActivity.f36948n = null;
        hsdpShimActivity.finish();
    }

    public void a(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s) {
        if (((ArrayList) this.f38945n).contains(abstractComponentCallbacksC0479s)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0479s);
        }
        synchronized (((ArrayList) this.f38945n)) {
            ((ArrayList) this.f38945n).add(abstractComponentCallbacksC0479s);
        }
        abstractComponentCallbacksC0479s.f4999D = true;
    }

    public AbstractComponentCallbacksC0479s b(String str) {
        V v9 = (V) ((HashMap) this.f38946u).get(str);
        if (v9 != null) {
            return v9.f4875c;
        }
        return null;
    }

    public AbstractComponentCallbacksC0479s c(String str) {
        for (V v9 : ((HashMap) this.f38946u).values()) {
            if (v9 != null) {
                AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = v9.f4875c;
                if (!str.equals(abstractComponentCallbacksC0479s.f5034x)) {
                    abstractComponentCallbacksC0479s = abstractComponentCallbacksC0479s.f5007M.f4820c.c(str);
                }
                if (abstractComponentCallbacksC0479s != null) {
                    return abstractComponentCallbacksC0479s;
                }
            }
        }
        return null;
    }

    public ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (V v9 : ((HashMap) this.f38946u).values()) {
            if (v9 != null) {
                arrayList.add(v9);
            }
        }
        return arrayList;
    }

    public ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (V v9 : ((HashMap) this.f38946u).values()) {
            if (v9 != null) {
                arrayList.add(v9.f4875c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List f() {
        ArrayList arrayList;
        if (((ArrayList) this.f38945n).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f38945n)) {
            arrayList = new ArrayList((ArrayList) this.f38945n);
        }
        return arrayList;
    }

    public boolean h(Context context) {
        if (((Boolean) this.f38947v) == null) {
            this.f38947v = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.f38946u).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f38947v).booleanValue();
    }

    public boolean i(Context context) {
        if (((Boolean) this.f38946u) == null) {
            this.f38946u = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.f38946u).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f38946u).booleanValue();
    }

    public void j(V v9) {
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = v9.f4875c;
        String str = abstractComponentCallbacksC0479s.f5034x;
        HashMap hashMap = (HashMap) this.f38946u;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC0479s.f5034x, v9);
        if (N.E(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0479s);
        }
    }

    public void k(V v9) {
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = v9.f4875c;
        if (abstractComponentCallbacksC0479s.f5014T) {
            ((S) this.f38948w).d(abstractComponentCallbacksC0479s);
        }
        HashMap hashMap = (HashMap) this.f38946u;
        if (hashMap.get(abstractComponentCallbacksC0479s.f5034x) == v9 && ((V) hashMap.put(abstractComponentCallbacksC0479s.f5034x, null)) != null && N.E(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0479s);
        }
    }

    public synchronized boolean l(C4800d c4800d) {
        try {
            String str = c4800d.f39738u;
            if (!((HashMap) this.f38945n).containsKey(str)) {
                ((HashMap) this.f38945n).put(str, null);
                synchronized (c4800d.f39740w) {
                    c4800d.f39734E = this;
                }
                if (n1.j.f39639a) {
                    n1.j.b("new request, sending to network %s", str);
                }
                return false;
            }
            List list = (List) ((HashMap) this.f38945n).get(str);
            if (list == null) {
                list = new ArrayList();
            }
            c4800d.a("waiting-for-response");
            list.add(c4800d);
            ((HashMap) this.f38945n).put(str, list);
            if (n1.j.f39639a) {
                n1.j.b("Request for cacheKey=%s is in flight, putting on hold.", str);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void m(C4800d c4800d) {
        PriorityBlockingQueue priorityBlockingQueue;
        try {
            String str = c4800d.f39738u;
            List list = (List) ((HashMap) this.f38945n).remove(str);
            if (list != null && !list.isEmpty()) {
                if (n1.j.f39639a) {
                    n1.j.d("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), str);
                }
                C4800d c4800d2 = (C4800d) list.remove(0);
                ((HashMap) this.f38945n).put(str, list);
                synchronized (c4800d2.f39740w) {
                    c4800d2.f39734E = this;
                }
                if (((C4765b) this.f38947v) != null && (priorityBlockingQueue = (PriorityBlockingQueue) this.f38948w) != null) {
                    try {
                        priorityBlockingQueue.put(c4800d2);
                    } catch (InterruptedException e9) {
                        n1.j.c("Couldn't add request to queue. %s", e9.toString());
                        Thread.currentThread().interrupt();
                        C4765b c4765b = (C4765b) this.f38947v;
                        c4765b.f39624x = true;
                        c4765b.interrupt();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public Bundle n(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.f38947v;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }
}
