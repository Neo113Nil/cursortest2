package O2;

import P2.InterfaceC0380j;
import a3.AbstractC0432a;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import g3.C4528a;
import h3.C4564a;
import h3.C4569f;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;
import m.b1;

/* renamed from: O2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0369t implements x {

    /* renamed from: A, reason: collision with root package name */
    public int f2272A;

    /* renamed from: D, reason: collision with root package name */
    public C4564a f2275D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2276E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f2277F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f2278G;

    /* renamed from: H, reason: collision with root package name */
    public InterfaceC0380j f2279H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2280I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public final b1 f2281K;

    /* renamed from: L, reason: collision with root package name */
    public final s.b f2282L;

    /* renamed from: M, reason: collision with root package name */
    public final R2.b f2283M;

    /* renamed from: n, reason: collision with root package name */
    public final z f2285n;

    /* renamed from: u, reason: collision with root package name */
    public final ReentrantLock f2286u;

    /* renamed from: v, reason: collision with root package name */
    public final Context f2287v;

    /* renamed from: w, reason: collision with root package name */
    public final M2.f f2288w;

    /* renamed from: x, reason: collision with root package name */
    public M2.b f2289x;

    /* renamed from: y, reason: collision with root package name */
    public int f2290y;

    /* renamed from: z, reason: collision with root package name */
    public int f2291z = 0;

    /* renamed from: B, reason: collision with root package name */
    public final Bundle f2273B = new Bundle();

    /* renamed from: C, reason: collision with root package name */
    public final HashSet f2274C = new HashSet();

    /* renamed from: N, reason: collision with root package name */
    public final ArrayList f2284N = new ArrayList();

    public C0369t(z zVar, b1 b1Var, s.b bVar, M2.f fVar, R2.b bVar2, ReentrantLock reentrantLock, Context context) {
        this.f2285n = zVar;
        this.f2281K = b1Var;
        this.f2282L = bVar;
        this.f2288w = fVar;
        this.f2283M = bVar2;
        this.f2286u = reentrantLock;
        this.f2287v = context;
    }

    public final void a() {
        this.f2277F = false;
        z zVar = this.f2285n;
        zVar.f2322F.f2303I = Collections.EMPTY_SET;
        Iterator it = this.f2274C.iterator();
        while (it.hasNext()) {
            N2.d dVar = (N2.d) it.next();
            HashMap hashMap = zVar.f2330z;
            if (!hashMap.containsKey(dVar)) {
                hashMap.put(dVar, new M2.b(17, null, null));
            }
        }
    }

    public final void b(boolean z3) {
        C4564a c4564a = this.f2275D;
        if (c4564a != null) {
            if (c4564a.i() && z3) {
                c4564a.getClass();
                try {
                    C4569f c4569f = (C4569f) c4564a.u();
                    Integer num = c4564a.f38008n0;
                    P2.w.h(num);
                    int intValue = num.intValue();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(c4569f.f4330v);
                    obtain.writeInt(intValue);
                    c4569f.S(obtain, 7);
                } catch (RemoteException unused) {
                    Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
                }
            }
            c4564a.h();
            P2.w.h(this.f2281K);
            this.f2279H = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        z zVar = this.f2285n;
        zVar.f2324n.lock();
        try {
            zVar.f2322F.d();
            zVar.f2320D = new C0362l(zVar);
            zVar.f2320D.t();
            zVar.f2325u.signalAll();
            zVar.f2324n.unlock();
            A.f2161a.execute(new G0.c(7, this));
            C4564a c4564a = this.f2275D;
            if (c4564a != null) {
                if (this.f2280I) {
                    InterfaceC0380j interfaceC0380j = this.f2279H;
                    P2.w.h(interfaceC0380j);
                    boolean z3 = this.J;
                    c4564a.getClass();
                    try {
                        C4569f c4569f = (C4569f) c4564a.u();
                        Integer num = c4564a.f38008n0;
                        P2.w.h(num);
                        int intValue = num.intValue();
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken(c4569f.f4330v);
                        int i = a3.b.f4331a;
                        if (interfaceC0380j == null) {
                            obtain.writeStrongBinder(null);
                        } else {
                            obtain.writeStrongBinder(((AbstractC0432a) interfaceC0380j).asBinder());
                        }
                        obtain.writeInt(intValue);
                        obtain.writeInt(z3 ? 1 : 0);
                        c4569f.S(obtain, 9);
                    } catch (RemoteException unused) {
                        Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
                    }
                }
                b(false);
            }
            Iterator it = this.f2285n.f2330z.keySet().iterator();
            while (it.hasNext()) {
                N2.c cVar = (N2.c) this.f2285n.f2329y.getOrDefault((N2.d) it.next(), null);
                P2.w.h(cVar);
                cVar.h();
            }
            this.f2285n.f2323G.m(this.f2273B.isEmpty() ? null : this.f2273B);
        } catch (Throwable th) {
            zVar.f2324n.unlock();
            throw th;
        }
    }

    public final void d(M2.b bVar) {
        ArrayList arrayList = this.f2284N;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        arrayList.clear();
        b(!bVar.a());
        z zVar = this.f2285n;
        zVar.e();
        zVar.f2323G.f(bVar);
    }

    public final void e(M2.b bVar, N2.e eVar, boolean z3) {
        eVar.f1936a.getClass();
        if ((!z3 || bVar.a() || this.f2288w.b(null, null, bVar.f1830u) != null) && (this.f2289x == null || Integer.MAX_VALUE < this.f2290y)) {
            this.f2289x = bVar;
            this.f2290y = Integer.MAX_VALUE;
        }
        this.f2285n.f2330z.put(eVar.f1937b, bVar);
    }

    public final void f() {
        if (this.f2272A != 0) {
            return;
        }
        if (!this.f2277F || this.f2278G) {
            ArrayList arrayList = new ArrayList();
            this.f2291z = 1;
            z zVar = this.f2285n;
            s.b bVar = zVar.f2329y;
            this.f2272A = bVar.f40437v;
            Iterator it = ((s.g) bVar.keySet()).iterator();
            while (it.hasNext()) {
                N2.d dVar = (N2.d) it.next();
                if (!zVar.f2330z.containsKey(dVar)) {
                    arrayList.add((N2.c) zVar.f2329y.getOrDefault(dVar, null));
                } else if (j()) {
                    c();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.f2284N.add(A.f2161a.submit(new C0366p(this, arrayList, 1)));
        }
    }

    @Override // O2.x
    public final void g(Bundle bundle) {
        if (h(1)) {
            if (bundle != null) {
                this.f2273B.putAll(bundle);
            }
            if (j()) {
                c();
            }
        }
    }

    public final boolean h(int i) {
        if (this.f2291z == i) {
            return true;
        }
        w wVar = this.f2285n.f2322F;
        wVar.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(wVar.f2314y);
        printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(wVar.f2296B);
        printWriter.append((CharSequence) " mWorkQueue.size()=").print(wVar.f2295A.size());
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(wVar.f2309P.f2244a.size());
        K k9 = wVar.f2312w;
        if (k9 != null) {
            k9.d("", null, printWriter, null);
        }
        Log.w("GACConnecting", stringWriter.toString());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        int i6 = this.f2272A;
        StringBuilder sb = new StringBuilder(33);
        sb.append("mRemainingConnections=");
        sb.append(i6);
        Log.w("GACConnecting", sb.toString());
        String str = this.f2291z != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        String str2 = i != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length() + 70);
        sb2.append("GoogleApiClient connecting is in step ");
        sb2.append(str);
        sb2.append(" but received callback for step ");
        sb2.append(str2);
        Log.e("GACConnecting", sb2.toString(), new Exception());
        d(new M2.b(8, null, null));
        return false;
    }

    public final boolean j() {
        int i = this.f2272A - 1;
        this.f2272A = i;
        if (i > 0) {
            return false;
        }
        z zVar = this.f2285n;
        if (i >= 0) {
            M2.b bVar = this.f2289x;
            if (bVar == null) {
                return true;
            }
            zVar.f2321E = this.f2290y;
            d(bVar);
            return false;
        }
        w wVar = zVar.f2322F;
        wVar.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(wVar.f2314y);
        printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(wVar.f2296B);
        printWriter.append((CharSequence) " mWorkQueue.size()=").print(wVar.f2295A.size());
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(wVar.f2309P.f2244a.size());
        K k9 = wVar.f2312w;
        if (k9 != null) {
            k9.d("", null, printWriter, null);
        }
        Log.w("GACConnecting", stringWriter.toString());
        Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
        d(new M2.b(8, null, null));
        return false;
    }

    @Override // O2.x
    public final void r(int i) {
        d(new M2.b(8, null, null));
    }

    @Override // O2.x
    public final void s(M2.b bVar, N2.e eVar, boolean z3) {
        if (h(1)) {
            e(bVar, eVar, z3);
            if (j()) {
                c();
            }
        }
    }

    @Override // O2.x
    public final void t() {
        s.b bVar;
        z zVar = this.f2285n;
        zVar.f2330z.clear();
        this.f2277F = false;
        this.f2289x = null;
        this.f2291z = 0;
        this.f2276E = true;
        this.f2278G = false;
        this.f2280I = false;
        HashMap hashMap = new HashMap();
        s.b bVar2 = this.f2282L;
        Iterator it = ((s.g) bVar2.keySet()).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            bVar = zVar.f2329y;
            if (!hasNext) {
                break;
            }
            N2.e eVar = (N2.e) it.next();
            N2.c cVar = (N2.c) bVar.getOrDefault(eVar.f1937b, null);
            P2.w.h(cVar);
            N2.c cVar2 = cVar;
            eVar.f1936a.getClass();
            boolean booleanValue = ((Boolean) bVar2.getOrDefault(eVar, null)).booleanValue();
            if (cVar2.m()) {
                this.f2277F = true;
                if (booleanValue) {
                    this.f2274C.add(eVar.f1937b);
                } else {
                    this.f2276E = false;
                }
            }
            hashMap.put(cVar2, new C0363m(this, eVar, booleanValue));
        }
        if (this.f2277F) {
            b1 b1Var = this.f2281K;
            P2.w.h(b1Var);
            P2.w.h(this.f2283M);
            w wVar = zVar.f2322F;
            b1Var.f39127z = Integer.valueOf(System.identityHashCode(wVar));
            r rVar = new r(this);
            this.f2275D = (C4564a) this.f2283M.d(this.f2287v, wVar.f2315z, b1Var, (C4528a) b1Var.f39126y, rVar, rVar);
        }
        this.f2272A = bVar.f40437v;
        this.f2284N.add(A.f2161a.submit(new C0366p(this, hashMap, 0)));
    }

    @Override // O2.x
    public final boolean x() {
        ArrayList arrayList = this.f2284N;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        arrayList.clear();
        b(true);
        this.f2285n.e();
        return true;
    }

    @Override // O2.x
    public final void i() {
    }
}
