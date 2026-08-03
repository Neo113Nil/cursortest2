package o6;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class s implements w {

    /* renamed from: g, reason: collision with root package name */
    public final y f5326g;

    /* renamed from: h, reason: collision with root package name */
    public final Lock f5327h;

    /* renamed from: i, reason: collision with root package name */
    public final Context f5328i;

    /* renamed from: j, reason: collision with root package name */
    public final m6.f f5329j;

    /* renamed from: k, reason: collision with root package name */
    public m6.b f5330k;

    /* renamed from: l, reason: collision with root package name */
    public int f5331l;

    /* renamed from: n, reason: collision with root package name */
    public int f5333n;

    /* renamed from: q, reason: collision with root package name */
    public e7.a f5336q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5337r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5338s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f5339t;

    /* renamed from: u, reason: collision with root package name */
    public p6.g f5340u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5341v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5342w;

    /* renamed from: x, reason: collision with root package name */
    public final p6.d f5343x;

    /* renamed from: y, reason: collision with root package name */
    public final Map f5344y;

    /* renamed from: z, reason: collision with root package name */
    public final a.a f5345z;

    /* renamed from: m, reason: collision with root package name */
    public int f5332m = 0;

    /* renamed from: o, reason: collision with root package name */
    public final Bundle f5334o = new Bundle();

    /* renamed from: p, reason: collision with root package name */
    public final HashSet f5335p = new HashSet();
    public final ArrayList A = new ArrayList();

    public s(y yVar, p6.d dVar, Map map, m6.f fVar, a.a aVar, Lock lock, Context context) {
        this.f5326g = yVar;
        this.f5343x = dVar;
        this.f5344y = map;
        this.f5329j = fVar;
        this.f5345z = aVar;
        this.f5327h = lock;
        this.f5328i = context;
    }

    public final void a() {
        this.f5338s = false;
        y yVar = this.f5326g;
        v vVar = yVar.f5385p;
        HashMap hashMap = yVar.f5379j;
        vVar.f5364p = Collections.EMPTY_SET;
        Iterator it = this.f5335p.iterator();
        while (it.hasNext()) {
            n6.b bVar = (n6.b) it.next();
            if (!hashMap.containsKey(bVar)) {
                hashMap.put(bVar, new m6.b(17, null));
            }
        }
    }

    public final void b(boolean z10) {
        e7.a aVar = this.f5336q;
        if (aVar != null) {
            if (aVar.a() && z10) {
                aVar.getClass();
                try {
                    e7.f fVar = (e7.f) aVar.r();
                    Integer num = aVar.G;
                    p6.u.g(num);
                    int intValue = num.intValue();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(fVar.f8791e);
                    obtain.writeInt(intValue);
                    fVar.b(obtain, 7);
                } catch (RemoteException unused) {
                    Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
                }
            }
            aVar.m();
            p6.u.g(this.f5343x);
            this.f5340u = null;
        }
    }

    @Override // o6.w
    public final void c(Bundle bundle) {
        if (m(1)) {
            if (bundle != null) {
                this.f5334o.putAll(bundle);
            }
            if (n()) {
                i();
            }
        }
    }

    @Override // o6.w
    public final void d(int i10) {
        j(new m6.b(8, null));
    }

    @Override // o6.w
    public final void e() {
        y yVar = this.f5326g;
        HashMap hashMap = yVar.f5379j;
        v vVar = yVar.f5385p;
        Map map = yVar.f5378i;
        hashMap.clear();
        this.f5338s = false;
        this.f5330k = null;
        this.f5332m = 0;
        this.f5337r = true;
        this.f5339t = false;
        this.f5341v = false;
        HashMap hashMap2 = new HashMap();
        Map map2 = this.f5344y;
        for (n6.c cVar : map2.keySet()) {
            n6.a aVar = (n6.a) map.get(cVar.f5072b);
            p6.u.g(aVar);
            n6.a aVar2 = aVar;
            cVar.f5071a.getClass();
            boolean booleanValue = ((Boolean) map2.get(cVar)).booleanValue();
            if (aVar2.n()) {
                this.f5338s = true;
                if (booleanValue) {
                    this.f5335p.add(cVar.f5072b);
                } else {
                    this.f5337r = false;
                }
            }
            hashMap2.put(aVar2, new l(this, cVar, booleanValue));
        }
        if (this.f5338s) {
            p6.d dVar = this.f5343x;
            p6.u.g(dVar);
            p6.u.g(this.f5345z);
            dVar.f5555a = Integer.valueOf(System.identityHashCode(vVar));
            q qVar = new q(this);
            this.f5336q = (e7.a) this.f5345z.j(this.f5328i, vVar.f5355g, dVar, (d7.a) dVar.f5561g, qVar, qVar);
        }
        this.f5333n = map.size();
        this.A.add(z.f5387a.submit(new o(this, hashMap2, 0)));
    }

    @Override // o6.w
    public final void g(m6.b bVar, n6.c cVar, boolean z10) {
        if (m(1)) {
            k(bVar, cVar, z10);
            if (n()) {
                i();
            }
        }
    }

    @Override // o6.w
    public final boolean h() {
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Future) arrayList.get(i10)).cancel(true);
        }
        arrayList.clear();
        b(true);
        this.f5326g.e();
        return true;
    }

    public final void i() {
        y yVar = this.f5326g;
        yVar.f5373d.lock();
        try {
            yVar.f5385p.g();
            yVar.f5383n = new k(yVar);
            yVar.f5383n.e();
            yVar.f5374e.signalAll();
            yVar.f5373d.unlock();
            z.f5387a.execute(new b4.g(8, this));
            e7.a aVar = this.f5336q;
            if (aVar != null) {
                if (this.f5341v) {
                    p6.g gVar = this.f5340u;
                    p6.u.g(gVar);
                    boolean z10 = this.f5342w;
                    aVar.getClass();
                    try {
                        e7.f fVar = (e7.f) aVar.r();
                        Integer num = aVar.G;
                        p6.u.g(num);
                        int intValue = num.intValue();
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken(fVar.f8791e);
                        int i10 = y6.b.f8792a;
                        if (gVar == null) {
                            obtain.writeStrongBinder(null);
                        } else {
                            obtain.writeStrongBinder(((p6.e0) gVar).asBinder());
                        }
                        obtain.writeInt(intValue);
                        obtain.writeInt(z10 ? 1 : 0);
                        fVar.b(obtain, 9);
                    } catch (RemoteException unused) {
                        Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
                    }
                }
                b(false);
            }
            Iterator it = this.f5326g.f5379j.keySet().iterator();
            while (it.hasNext()) {
                n6.a aVar2 = (n6.a) this.f5326g.f5378i.get((n6.b) it.next());
                p6.u.g(aVar2);
                aVar2.m();
            }
            this.f5326g.f5386q.a(this.f5334o.isEmpty() ? null : this.f5334o);
        } catch (Throwable th) {
            yVar.f5373d.unlock();
            throw th;
        }
    }

    public final void j(m6.b bVar) {
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Future) arrayList.get(i10)).cancel(true);
        }
        arrayList.clear();
        b(!bVar.a());
        y yVar = this.f5326g;
        yVar.e();
        yVar.f5386q.b(bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r2.f5329j.a(r3.f4903h, null, null) != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(m6.b bVar, n6.c cVar, boolean z10) {
        cVar.f5071a.getClass();
        if (z10 && !bVar.a()) {
        }
        if (this.f5330k == null || Integer.MAX_VALUE < this.f5331l) {
            this.f5330k = bVar;
            this.f5331l = Integer.MAX_VALUE;
        }
        this.f5326g.f5379j.put(cVar.f5072b, bVar);
    }

    public final void l() {
        if (this.f5333n != 0) {
            return;
        }
        if (!this.f5338s || this.f5339t) {
            ArrayList arrayList = new ArrayList();
            this.f5332m = 1;
            y yVar = this.f5326g;
            Map map = yVar.f5378i;
            Map map2 = yVar.f5378i;
            this.f5333n = map.size();
            for (n6.b bVar : map2.keySet()) {
                if (!yVar.f5379j.containsKey(bVar)) {
                    arrayList.add((n6.a) map2.get(bVar));
                } else if (n()) {
                    i();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.A.add(z.f5387a.submit(new o(this, arrayList, 1)));
        }
    }

    public final boolean m(int i10) {
        if (this.f5332m == i10) {
            return true;
        }
        v vVar = this.f5326g.f5385p;
        vVar.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(vVar.f5354f);
        printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(vVar.f5357i);
        printWriter.append((CharSequence) " mWorkQueue.size()=").print(vVar.f5356h.size());
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(vVar.f5371w.f5277a.size());
        i0 i0Var = vVar.f5352d;
        if (i0Var != null) {
            i0Var.c("", null, printWriter, null);
        }
        Log.w("GACConnecting", stringWriter.toString());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        Log.w("GACConnecting", "mRemainingConnections=" + this.f5333n);
        String str = this.f5332m != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        StringBuilder sb = new StringBuilder("GoogleApiClient connecting is in step ");
        sb.append(str);
        sb.append(" but received callback for step ");
        sb.append(i10 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN");
        Log.e("GACConnecting", sb.toString(), new Exception());
        j(new m6.b(8, null));
        return false;
    }

    public final boolean n() {
        y yVar = this.f5326g;
        int i10 = this.f5333n - 1;
        this.f5333n = i10;
        if (i10 > 0) {
            return false;
        }
        if (i10 >= 0) {
            m6.b bVar = this.f5330k;
            if (bVar == null) {
                return true;
            }
            yVar.f5384o = this.f5331l;
            j(bVar);
            return false;
        }
        v vVar = yVar.f5385p;
        vVar.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(vVar.f5354f);
        printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(vVar.f5357i);
        printWriter.append((CharSequence) " mWorkQueue.size()=").print(vVar.f5356h.size());
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(vVar.f5371w.f5277a.size());
        i0 i0Var = vVar.f5352d;
        if (i0Var != null) {
            i0Var.c("", null, printWriter, null);
        }
        Log.w("GACConnecting", stringWriter.toString());
        Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
        j(new m6.b(8, null));
        return false;
    }

    @Override // o6.w
    public final void f() {
    }
}
