package d8;

import android.content.Context;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import v.l1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class s implements l1 {

    /* renamed from: k, reason: collision with root package name */
    public static s f1811k;

    /* renamed from: g, reason: collision with root package name */
    public Object f1812g;

    /* renamed from: h, reason: collision with root package name */
    public Object f1813h;

    /* renamed from: i, reason: collision with root package name */
    public Object f1814i;

    /* renamed from: j, reason: collision with root package name */
    public Object f1815j;

    public s(v.o oVar) {
        this.f1812g = oVar;
    }

    public static synchronized s c() {
        s sVar;
        synchronized (s.class) {
            try {
                if (f1811k == null) {
                    s sVar2 = new s();
                    sVar2.f1812g = null;
                    sVar2.f1813h = null;
                    sVar2.f1814i = null;
                    sVar2.f1815j = new ArrayDeque();
                    f1811k = sVar2;
                }
                sVar = f1811k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
    }

    @Override // v.j1
    public long b(v.n nVar, v.n nVar2, v.n nVar3) {
        Iterator it = uc.e.q(0, nVar.b()).iterator();
        long j3 = 0;
        while (true) {
            uc.c cVar = (uc.c) it;
            if (!cVar.f6740i) {
                return j3;
            }
            int nextInt = cVar.nextInt();
            j3 = Math.max(j3, ((v.o) this.f1812g).get(nextInt).d(nVar.a(nextInt), nVar2.a(nextInt), nVar3.a(nextInt)));
        }
    }

    public boolean d(Context context) {
        if (((Boolean) this.f1814i) == null) {
            this.f1814i = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.f1813h).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f1814i).booleanValue();
    }

    public boolean e(Context context) {
        if (((Boolean) this.f1813h) == null) {
            this.f1813h = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.f1813h).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f1813h).booleanValue();
    }

    @Override // v.j1
    public v.n k(long j3, v.n nVar, v.n nVar2, v.n nVar3) {
        if (((v.n) this.f1813h) == null) {
            this.f1813h = nVar.c();
        }
        v.n nVar4 = (v.n) this.f1813h;
        if (nVar4 == null) {
            pc.j.k("valueVector");
            throw null;
        }
        int b2 = nVar4.b();
        for (int i10 = 0; i10 < b2; i10++) {
            v.n nVar5 = (v.n) this.f1813h;
            if (nVar5 == null) {
                pc.j.k("valueVector");
                throw null;
            }
            nVar5.e(i10, ((v.o) this.f1812g).get(i10).b(j3, nVar.a(i10), nVar2.a(i10), nVar3.a(i10)));
        }
        v.n nVar6 = (v.n) this.f1813h;
        if (nVar6 != null) {
            return nVar6;
        }
        pc.j.k("valueVector");
        throw null;
    }

    @Override // v.j1
    public v.n n(v.n nVar, v.n nVar2, v.n nVar3) {
        if (((v.n) this.f1815j) == null) {
            this.f1815j = nVar3.c();
        }
        v.n nVar4 = (v.n) this.f1815j;
        if (nVar4 == null) {
            pc.j.k("endVelocityVector");
            throw null;
        }
        int b2 = nVar4.b();
        for (int i10 = 0; i10 < b2; i10++) {
            v.n nVar5 = (v.n) this.f1815j;
            if (nVar5 == null) {
                pc.j.k("endVelocityVector");
                throw null;
            }
            nVar5.e(i10, ((v.o) this.f1812g).get(i10).e(nVar.a(i10), nVar2.a(i10), nVar3.a(i10)));
        }
        v.n nVar6 = (v.n) this.f1815j;
        if (nVar6 != null) {
            return nVar6;
        }
        pc.j.k("endVelocityVector");
        throw null;
    }

    @Override // v.j1
    public v.n p(long j3, v.n nVar, v.n nVar2, v.n nVar3) {
        if (((v.n) this.f1814i) == null) {
            this.f1814i = nVar3.c();
        }
        v.n nVar4 = (v.n) this.f1814i;
        if (nVar4 == null) {
            pc.j.k("velocityVector");
            throw null;
        }
        int b2 = nVar4.b();
        for (int i10 = 0; i10 < b2; i10++) {
            v.n nVar5 = (v.n) this.f1814i;
            if (nVar5 == null) {
                pc.j.k("velocityVector");
                throw null;
            }
            nVar5.e(i10, ((v.o) this.f1812g).get(i10).c(j3, nVar.a(i10), nVar2.a(i10), nVar3.a(i10)));
        }
        v.n nVar6 = (v.n) this.f1814i;
        if (nVar6 != null) {
            return nVar6;
        }
        pc.j.k("velocityVector");
        throw null;
    }

    public s(v.y yVar) {
        this(new m7.g(18, yVar));
    }
}
