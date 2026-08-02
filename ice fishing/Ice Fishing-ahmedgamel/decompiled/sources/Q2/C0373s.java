package Q2;

import R2.InterfaceC0384j;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import c3.AbstractC0549a;
import i3.C4591a;
import j3.C4612a;
import j3.C4617f;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;
import m.c1;

/* renamed from: Q2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0373s implements w {

    /* renamed from: A, reason: collision with root package name */
    public int f2588A;

    /* renamed from: D, reason: collision with root package name */
    public C4612a f2591D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2592E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f2593F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f2594G;

    /* renamed from: H, reason: collision with root package name */
    public InterfaceC0384j f2595H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2596I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public final c1 f2597K;

    /* renamed from: L, reason: collision with root package name */
    public final s.b f2598L;

    /* renamed from: M, reason: collision with root package name */
    public final T2.b f2599M;

    /* renamed from: n, reason: collision with root package name */
    public final y f2601n;

    /* renamed from: u, reason: collision with root package name */
    public final ReentrantLock f2602u;

    /* renamed from: v, reason: collision with root package name */
    public final Context f2603v;

    /* renamed from: w, reason: collision with root package name */
    public final O2.f f2604w;

    /* renamed from: x, reason: collision with root package name */
    public O2.b f2605x;

    /* renamed from: y, reason: collision with root package name */
    public int f2606y;

    /* renamed from: z, reason: collision with root package name */
    public int f2607z = 0;

    /* renamed from: B, reason: collision with root package name */
    public final Bundle f2589B = new Bundle();

    /* renamed from: C, reason: collision with root package name */
    public final HashSet f2590C = new HashSet();

    /* renamed from: N, reason: collision with root package name */
    public final ArrayList f2600N = new ArrayList();

    public C0373s(y yVar, c1 c1Var, s.b bVar, O2.f fVar, T2.b bVar2, ReentrantLock reentrantLock, Context context) {
        this.f2601n = yVar;
        this.f2597K = c1Var;
        this.f2598L = bVar;
        this.f2604w = fVar;
        this.f2599M = bVar2;
        this.f2602u = reentrantLock;
        this.f2603v = context;
    }

    public final void a() {
        this.f2593F = false;
        y yVar = this.f2601n;
        yVar.f2638F.f2619I = Collections.EMPTY_SET;
        Iterator it = this.f2590C.iterator();
        while (it.hasNext()) {
            P2.d dVar = (P2.d) it.next();
            HashMap hashMap = yVar.f2646z;
            if (!hashMap.containsKey(dVar)) {
                hashMap.put(dVar, new O2.b(17, null, null));
            }
        }
    }

    @Override // Q2.w
    public final void b(O2.b bVar, P2.e eVar, boolean z6) {
        if (j(1)) {
            f(bVar, eVar, z6);
            if (k()) {
                d();
            }
        }
    }

    public final void c(boolean z6) {
        C4612a c4612a = this.f2591D;
        if (c4612a != null) {
            if (c4612a.h() && z6) {
                c4612a.getClass();
                try {
                    C4617f c4617f = (C4617f) c4612a.u();
                    Integer num = c4612a.f38477i0;
                    R2.w.h(num);
                    int intValue = num.intValue();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(c4617f.f5723v);
                    obtain.writeInt(intValue);
                    c4617f.S(obtain, 7);
                } catch (RemoteException unused) {
                    Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
                }
            }
            c4612a.g();
            R2.w.h(this.f2597K);
            this.f2595H = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        y yVar = this.f2601n;
        yVar.f2640n.lock();
        try {
            yVar.f2638F.d();
            yVar.f2636D = new C0366k(yVar);
            yVar.f2636D.t();
            yVar.f2641u.signalAll();
            yVar.f2640n.unlock();
            z.f2647a.execute(new G0.c(7, this));
            C4612a c4612a = this.f2591D;
            if (c4612a != null) {
                if (this.f2596I) {
                    InterfaceC0384j interfaceC0384j = this.f2595H;
                    R2.w.h(interfaceC0384j);
                    boolean z6 = this.J;
                    c4612a.getClass();
                    try {
                        C4617f c4617f = (C4617f) c4612a.u();
                        Integer num = c4612a.f38477i0;
                        R2.w.h(num);
                        int intValue = num.intValue();
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken(c4617f.f5723v);
                        int i = c3.b.f5724a;
                        if (interfaceC0384j == null) {
                            obtain.writeStrongBinder(null);
                        } else {
                            obtain.writeStrongBinder(((AbstractC0549a) interfaceC0384j).asBinder());
                        }
                        obtain.writeInt(intValue);
                        obtain.writeInt(z6 ? 1 : 0);
                        c4617f.S(obtain, 9);
                    } catch (RemoteException unused) {
                        Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
                    }
                }
                c(false);
            }
            Iterator it = this.f2601n.f2646z.keySet().iterator();
            while (it.hasNext()) {
                P2.c cVar = (P2.c) this.f2601n.f2645y.getOrDefault((P2.d) it.next(), null);
                R2.w.h(cVar);
                cVar.g();
            }
            this.f2601n.f2639G.o(this.f2589B.isEmpty() ? null : this.f2589B);
        } catch (Throwable th) {
            yVar.f2640n.unlock();
            throw th;
        }
    }

    public final void e(O2.b bVar) {
        ArrayList arrayList = this.f2600N;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        arrayList.clear();
        c(!bVar.a());
        y yVar = this.f2601n;
        yVar.e();
        yVar.f2639G.s(bVar);
    }

    public final void f(O2.b bVar, P2.e eVar, boolean z6) {
        eVar.f2380a.getClass();
        if ((!z6 || bVar.a() || this.f2604w.b(null, null, bVar.f2256u) != null) && (this.f2605x == null || Integer.MAX_VALUE < this.f2606y)) {
            this.f2605x = bVar;
            this.f2606y = Integer.MAX_VALUE;
        }
        this.f2601n.f2646z.put(eVar.f2381b, bVar);
    }

    @Override // Q2.w
    public final void g(Bundle bundle) {
        if (j(1)) {
            if (bundle != null) {
                this.f2589B.putAll(bundle);
            }
            if (k()) {
                d();
            }
        }
    }

    public final void h() {
        if (this.f2588A != 0) {
            return;
        }
        if (!this.f2593F || this.f2594G) {
            ArrayList arrayList = new ArrayList();
            this.f2607z = 1;
            y yVar = this.f2601n;
            s.b bVar = yVar.f2645y;
            this.f2588A = bVar.f40276v;
            Iterator it = ((s.g) bVar.keySet()).iterator();
            while (it.hasNext()) {
                P2.d dVar = (P2.d) it.next();
                if (!yVar.f2646z.containsKey(dVar)) {
                    arrayList.add((P2.c) yVar.f2645y.getOrDefault(dVar, null));
                } else if (k()) {
                    d();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.f2600N.add(z.f2647a.submit(new C0370o(this, arrayList, 1)));
        }
    }

    public final boolean j(int i) {
        if (this.f2607z == i) {
            return true;
        }
        v vVar = this.f2601n.f2638F;
        vVar.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(vVar.f2630y);
        printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(vVar.f2612B);
        printWriter.append((CharSequence) " mWorkQueue.size()=").print(vVar.f2611A.size());
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(vVar.f2625P.f2562a.size());
        J j6 = vVar.f2628w;
        if (j6 != null) {
            j6.d("", null, printWriter, null);
        }
        Log.w("GACConnecting", stringWriter.toString());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        int i4 = this.f2588A;
        StringBuilder sb = new StringBuilder(33);
        sb.append("mRemainingConnections=");
        sb.append(i4);
        Log.w("GACConnecting", sb.toString());
        String str = this.f2607z != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        String str2 = i != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length() + 70);
        sb2.append("GoogleApiClient connecting is in step ");
        sb2.append(str);
        sb2.append(" but received callback for step ");
        sb2.append(str2);
        Log.e("GACConnecting", sb2.toString(), new Exception());
        e(new O2.b(8, null, null));
        return false;
    }

    public final boolean k() {
        int i = this.f2588A - 1;
        this.f2588A = i;
        if (i > 0) {
            return false;
        }
        y yVar = this.f2601n;
        if (i >= 0) {
            O2.b bVar = this.f2605x;
            if (bVar == null) {
                return true;
            }
            yVar.f2637E = this.f2606y;
            e(bVar);
            return false;
        }
        v vVar = yVar.f2638F;
        vVar.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(vVar.f2630y);
        printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(vVar.f2612B);
        printWriter.append((CharSequence) " mWorkQueue.size()=").print(vVar.f2611A.size());
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(vVar.f2625P.f2562a.size());
        J j6 = vVar.f2628w;
        if (j6 != null) {
            j6.d("", null, printWriter, null);
        }
        Log.w("GACConnecting", stringWriter.toString());
        Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
        e(new O2.b(8, null, null));
        return false;
    }

    @Override // Q2.w
    public final void r(int i) {
        e(new O2.b(8, null, null));
    }

    @Override // Q2.w
    public final void t() {
        s.b bVar;
        y yVar = this.f2601n;
        yVar.f2646z.clear();
        this.f2593F = false;
        this.f2605x = null;
        this.f2607z = 0;
        this.f2592E = true;
        this.f2594G = false;
        this.f2596I = false;
        HashMap hashMap = new HashMap();
        s.b bVar2 = this.f2598L;
        Iterator it = ((s.g) bVar2.keySet()).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            bVar = yVar.f2645y;
            if (!hasNext) {
                break;
            }
            P2.e eVar = (P2.e) it.next();
            P2.c cVar = (P2.c) bVar.getOrDefault(eVar.f2381b, null);
            R2.w.h(cVar);
            P2.c cVar2 = cVar;
            eVar.f2380a.getClass();
            boolean booleanValue = ((Boolean) bVar2.getOrDefault(eVar, null)).booleanValue();
            if (cVar2.m()) {
                this.f2593F = true;
                if (booleanValue) {
                    this.f2590C.add(eVar.f2381b);
                } else {
                    this.f2592E = false;
                }
            }
            hashMap.put(cVar2, new C0367l(this, eVar, booleanValue));
        }
        if (this.f2593F) {
            c1 c1Var = this.f2597K;
            R2.w.h(c1Var);
            R2.w.h(this.f2599M);
            v vVar = yVar.f2638F;
            c1Var.f39198z = Integer.valueOf(System.identityHashCode(vVar));
            C0372q c0372q = new C0372q(this);
            this.f2591D = (C4612a) this.f2599M.b(this.f2603v, vVar.f2631z, c1Var, (C4591a) c1Var.f39197y, c0372q, c0372q);
        }
        this.f2588A = bVar.f40276v;
        this.f2600N.add(z.f2647a.submit(new C0370o(this, hashMap, 0)));
    }

    @Override // Q2.w
    public final boolean y() {
        ArrayList arrayList = this.f2600N;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        arrayList.clear();
        c(true);
        this.f2601n.e();
        return true;
    }

    @Override // Q2.w
    public final void i() {
    }
}
