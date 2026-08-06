package androidx.lifecycle;

import android.os.Looper;
import i.C0240a;
import j.C0960a;
import j.C0961b;
import j.C0962c;
import j.C0963d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class l extends f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2474a;

    /* renamed from: b, reason: collision with root package name */
    public C0960a f2475b;

    /* renamed from: c, reason: collision with root package name */
    public e f2476c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f2477d;

    /* renamed from: e, reason: collision with root package name */
    public int f2478e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2479f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2480g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f2481h;

    /* renamed from: i, reason: collision with root package name */
    public final D1.r f2482i;

    public l(j jVar) {
        new AtomicReference();
        this.f2474a = true;
        this.f2475b = new C0960a();
        e eVar = e.f2466b;
        this.f2476c = eVar;
        this.f2481h = new ArrayList();
        this.f2477d = new WeakReference(jVar);
        this.f2482i = new D1.r(eVar);
    }

    public final void a(i iVar) {
        Object obj;
        j jVar;
        ArrayList arrayList = this.f2481h;
        c("addObserver");
        e eVar = this.f2476c;
        e eVar2 = e.f2465a;
        if (eVar != eVar2) {
            eVar2 = e.f2466b;
        }
        k kVar = new k();
        int i2 = m.f2483a;
        kVar.f2473b = iVar;
        kVar.f2472a = eVar2;
        C0960a c0960a = this.f2475b;
        C0962c a2 = c0960a.a(iVar);
        if (a2 != null) {
            obj = a2.f8018b;
        } else {
            HashMap hashMap = c0960a.f8013e;
            C0962c c0962c = new C0962c(iVar, kVar);
            c0960a.f8027d++;
            C0962c c0962c2 = c0960a.f8025b;
            if (c0962c2 == null) {
                c0960a.f8024a = c0962c;
                c0960a.f8025b = c0962c;
            } else {
                c0962c2.f8019c = c0962c;
                c0962c.f8020d = c0962c2;
                c0960a.f8025b = c0962c;
            }
            hashMap.put(iVar, c0962c);
            obj = null;
        }
        if (((k) obj) == null && (jVar = (j) this.f2477d.get()) != null) {
            boolean z2 = this.f2478e != 0 || this.f2479f;
            e b2 = b(iVar);
            this.f2478e++;
            while (kVar.f2472a.compareTo(b2) < 0 && this.f2475b.f8013e.containsKey(iVar)) {
                arrayList.add(kVar.f2472a);
                b bVar = d.Companion;
                e eVar3 = kVar.f2472a;
                bVar.getClass();
                d a3 = b.a(eVar3);
                if (a3 == null) {
                    throw new IllegalStateException("no event up from " + kVar.f2472a);
                }
                kVar.a(jVar, a3);
                arrayList.remove(arrayList.size() - 1);
                b2 = b(iVar);
            }
            if (!z2) {
                e();
            }
            this.f2478e--;
        }
    }

    public final e b(i iVar) {
        HashMap hashMap = this.f2475b.f8013e;
        C0962c c0962c = hashMap.containsKey(iVar) ? ((C0962c) hashMap.get(iVar)).f8020d : null;
        e eVar = c0962c != null ? ((k) c0962c.f8018b).f2472a : null;
        ArrayList arrayList = this.f2481h;
        e eVar2 = arrayList.isEmpty() ? null : (e) arrayList.get(arrayList.size() - 1);
        e state1 = this.f2476c;
        kotlin.jvm.internal.i.e(state1, "state1");
        if (eVar == null || eVar.compareTo(state1) >= 0) {
            eVar = state1;
        }
        return (eVar2 == null || eVar2.compareTo(eVar) >= 0) ? eVar : eVar2;
    }

    public final void c(String str) {
        C0240a c0240a;
        if (this.f2474a) {
            if (C0240a.f3394d != null) {
                c0240a = C0240a.f3394d;
            } else {
                synchronized (C0240a.class) {
                    try {
                        if (C0240a.f3394d == null) {
                            C0240a.f3394d = new C0240a(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c0240a = C0240a.f3394d;
            }
            ((C0240a) c0240a.f3395c).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void d(d event) {
        kotlin.jvm.internal.i.e(event, "event");
        c("handleLifecycleEvent");
        e a2 = event.a();
        e eVar = this.f2476c;
        if (eVar == a2) {
            return;
        }
        e eVar2 = e.f2466b;
        e eVar3 = e.f2465a;
        if (eVar == eVar2 && a2 == eVar3) {
            throw new IllegalStateException(("no event down from " + this.f2476c + " in component " + this.f2477d.get()).toString());
        }
        this.f2476c = a2;
        if (this.f2479f || this.f2478e != 0) {
            this.f2480g = true;
            return;
        }
        this.f2479f = true;
        e();
        this.f2479f = false;
        if (this.f2476c == eVar3) {
            this.f2475b = new C0960a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        r8.f2480g = false;
        r0 = r8.f2476c;
        r1 = r8.f2482i;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        r0 = E1.l.f331a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r1.b(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        j jVar = (j) this.f2477d.get();
        if (jVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C0960a c0960a = this.f2475b;
            if (c0960a.f8027d != 0) {
                C0962c c0962c = c0960a.f8024a;
                kotlin.jvm.internal.i.b(c0962c);
                e eVar = ((k) c0962c.f8018b).f2472a;
                C0962c c0962c2 = this.f2475b.f8025b;
                kotlin.jvm.internal.i.b(c0962c2);
                e eVar2 = ((k) c0962c2.f8018b).f2472a;
                if (eVar == eVar2 && this.f2476c == eVar2) {
                    break;
                }
                this.f2480g = false;
                e eVar3 = this.f2476c;
                C0962c c0962c3 = this.f2475b.f8024a;
                kotlin.jvm.internal.i.b(c0962c3);
                if (eVar3.compareTo(((k) c0962c3.f8018b).f2472a) < 0) {
                    C0960a c0960a2 = this.f2475b;
                    C0961b c0961b = new C0961b(c0960a2.f8025b, c0960a2.f8024a, 1);
                    c0960a2.f8026c.put(c0961b, Boolean.FALSE);
                    while (c0961b.hasNext() && !this.f2480g) {
                        Map.Entry entry = (Map.Entry) c0961b.next();
                        kotlin.jvm.internal.i.d(entry, "next()");
                        i iVar = (i) entry.getKey();
                        k kVar = (k) entry.getValue();
                        while (kVar.f2472a.compareTo(this.f2476c) > 0 && !this.f2480g && this.f2475b.f8013e.containsKey(iVar)) {
                            b bVar = d.Companion;
                            e state = kVar.f2472a;
                            bVar.getClass();
                            kotlin.jvm.internal.i.e(state, "state");
                            int ordinal = state.ordinal();
                            d dVar = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : d.ON_PAUSE : d.ON_STOP : d.ON_DESTROY;
                            if (dVar == null) {
                                throw new IllegalStateException("no event down from " + kVar.f2472a);
                            }
                            this.f2481h.add(dVar.a());
                            kVar.a(jVar, dVar);
                            this.f2481h.remove(r5.size() - 1);
                        }
                    }
                }
                C0962c c0962c4 = this.f2475b.f8025b;
                if (!this.f2480g && c0962c4 != null && this.f2476c.compareTo(((k) c0962c4.f8018b).f2472a) > 0) {
                    C0960a c0960a3 = this.f2475b;
                    c0960a3.getClass();
                    C0963d c0963d = new C0963d(c0960a3);
                    c0960a3.f8026c.put(c0963d, Boolean.FALSE);
                    while (c0963d.hasNext() && !this.f2480g) {
                        Map.Entry entry2 = (Map.Entry) c0963d.next();
                        i iVar2 = (i) entry2.getKey();
                        k kVar2 = (k) entry2.getValue();
                        while (kVar2.f2472a.compareTo(this.f2476c) < 0 && !this.f2480g && this.f2475b.f8013e.containsKey(iVar2)) {
                            this.f2481h.add(kVar2.f2472a);
                            b bVar2 = d.Companion;
                            e eVar4 = kVar2.f2472a;
                            bVar2.getClass();
                            d a2 = b.a(eVar4);
                            if (a2 == null) {
                                throw new IllegalStateException("no event up from " + kVar2.f2472a);
                            }
                            kVar2.a(jVar, a2);
                            this.f2481h.remove(r4.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
