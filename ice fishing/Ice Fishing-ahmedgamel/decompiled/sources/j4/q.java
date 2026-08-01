package j4;

import L3.InterfaceC0315a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import b2.InterfaceC0515b;
import com.google.android.play.core.hsdp.service.HsdpShimActivity;
import f6.C4512a;
import g2.InterfaceC4527d;
import j4.q;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.function.Function;
import t7.InterfaceC5044a;

/* loaded from: classes2.dex */
public final class q implements InterfaceC0315a, InterfaceC0515b {

    /* renamed from: x, reason: collision with root package name */
    public static q f38432x;

    /* renamed from: n, reason: collision with root package name */
    public Object f38433n = new ConcurrentHashMap();

    /* renamed from: u, reason: collision with root package name */
    public Object f38434u;

    /* renamed from: v, reason: collision with root package name */
    public Object f38435v;

    /* renamed from: w, reason: collision with root package name */
    public Object f38436w;

    public q(Function function) {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        this.f38434u = new Object();
        this.f38435v = Collections.newSetFromMap(new IdentityHashMap());
        this.f38436w = function;
    }

    public static synchronized q b() {
        q qVar;
        synchronized (q.class) {
            try {
                if (f38432x == null) {
                    q qVar2 = new q();
                    qVar2.f38433n = null;
                    qVar2.f38434u = null;
                    qVar2.f38435v = null;
                    qVar2.f38436w = new ArrayDeque();
                    f38432x = qVar2;
                }
                qVar = f38432x;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    @Override // L3.InterfaceC0315a
    public void L(Bundle bundle) {
        Log.e("HsdpShimActivity", "HSDP service based UI error: " + String.valueOf(bundle) + ". Finish the shim activity.");
        Intent I8 = t8.g.I((String) this.f38433n, (String) this.f38434u, (HashMap) this.f38435v);
        HsdpShimActivity hsdpShimActivity = (HsdpShimActivity) this.f38436w;
        hsdpShimActivity.startActivityForResult(I8, 0);
        hsdpShimActivity.f36181n = null;
        hsdpShimActivity.f36182u = false;
        hsdpShimActivity.finish();
    }

    @Override // L3.InterfaceC0315a
    public void O(Bundle bundle) {
        Log.i("HsdpShimActivity", "HSDP service based UI shown");
        ((HsdpShimActivity) this.f38436w).f36182u = true;
    }

    @Override // L3.InterfaceC0315a
    public void W(Bundle bundle) {
        boolean isLoggable = Log.isLoggable("HsdpShimActivity", 4);
        HsdpShimActivity hsdpShimActivity = (HsdpShimActivity) this.f38436w;
        if (isLoggable) {
            Log.i("HsdpShimActivity", "HSDP service based UI dismissed. hasBeenShown=" + hsdpShimActivity.f36182u);
        }
        boolean z3 = bundle.getBoolean("dldpRedirect", false);
        if (!hsdpShimActivity.f36182u && !z3) {
            Log.i("HsdpShimActivity", "Ignore dismiss before shown (likely temporary reuse cleanup)");
            return;
        }
        Log.i("HsdpShimActivity", "Finish the shim activity.");
        hsdpShimActivity.f36181n = null;
        hsdpShimActivity.finish();
    }

    public Object a(final C4512a c4512a, String str) {
        return ((ConcurrentHashMap) this.f38433n).computeIfAbsent(str, new Function() { // from class: a7.c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str2 = (String) obj;
                q qVar = q.this;
                qVar.getClass();
                int i = Y6.a.f3965e;
                C4512a c4512a2 = c4512a;
                if (c4512a2 == null) {
                    c4512a2 = C4512a.f37513w;
                }
                Object apply = ((Function) qVar.f38436w).apply(Y6.a.a(str2, null, null, c4512a2));
                synchronized (qVar.f38434u) {
                    ((Set) qVar.f38435v).add(apply);
                }
                return apply;
            }
        });
    }

    public boolean c(Context context) {
        if (((Boolean) this.f38435v) == null) {
            this.f38435v = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.f38434u).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f38435v).booleanValue();
    }

    public boolean d(Context context) {
        if (((Boolean) this.f38434u) == null) {
            this.f38434u = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.f38434u).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f38434u).booleanValue();
    }

    @Override // t7.InterfaceC5044a
    public Object get() {
        return new f2.j((Executor) ((InterfaceC5044a) this.f38433n).get(), (InterfaceC4527d) ((InterfaceC5044a) this.f38434u).get(), (f2.c) ((Z2.e) this.f38435v).get(), (h2.c) ((InterfaceC5044a) this.f38436w).get());
    }
}
