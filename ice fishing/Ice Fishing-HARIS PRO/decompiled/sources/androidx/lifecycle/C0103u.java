package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import l0.C0230a;
import n.C0306a;
import o.C0310a;
import o.C0311b;
import o.C0312c;
import o.C0313d;

/* renamed from: androidx.lifecycle.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0103u {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2046a;

    /* renamed from: b, reason: collision with root package name */
    public C0310a f2047b;

    /* renamed from: c, reason: collision with root package name */
    public EnumC0097n f2048c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f2049d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2050f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2051g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f2052h;
    public final O1.q i;

    public C0103u(InterfaceC0101s interfaceC0101s) {
        new AtomicReference(null);
        this.f2046a = true;
        this.f2047b = new C0310a();
        EnumC0097n enumC0097n = EnumC0097n.f2039b;
        this.f2048c = enumC0097n;
        this.f2052h = new ArrayList();
        this.f2049d = new WeakReference(interfaceC0101s);
        this.i = new O1.q(enumC0097n);
    }

    public final void a(r rVar) {
        InterfaceC0100q c0089f;
        InterfaceC0101s interfaceC0101s;
        ArrayList arrayList = this.f2052h;
        int i = 2;
        Object obj = null;
        D1.i.e(rVar, "observer");
        c("addObserver");
        EnumC0097n enumC0097n = this.f2048c;
        EnumC0097n enumC0097n2 = EnumC0097n.f2038a;
        if (enumC0097n != enumC0097n2) {
            enumC0097n2 = EnumC0097n.f2039b;
        }
        C0102t c0102t = new C0102t();
        HashMap hashMap = AbstractC0104v.f2053a;
        boolean z2 = rVar instanceof InterfaceC0100q;
        boolean z3 = rVar instanceof V.k;
        if (z2 && z3) {
            c0089f = new C0089f((V.k) rVar, (InterfaceC0100q) rVar);
        } else if (z3) {
            c0089f = new C0089f((V.k) rVar, (InterfaceC0100q) null);
        } else if (z2) {
            c0089f = (InterfaceC0100q) rVar;
        } else {
            Class<?> cls = rVar.getClass();
            if (AbstractC0104v.b(cls) == 2) {
                Object obj2 = AbstractC0104v.f2054b.get(cls);
                D1.i.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    AbstractC0104v.a((Constructor) list.get(0), rVar);
                    throw null;
                }
                int size = list.size();
                InterfaceC0091h[] interfaceC0091hArr = new InterfaceC0091h[size];
                if (size > 0) {
                    AbstractC0104v.a((Constructor) list.get(0), rVar);
                    throw null;
                }
                c0089f = new C0230a(i, interfaceC0091hArr);
            } else {
                c0089f = new C0089f(rVar);
            }
        }
        c0102t.f2045b = c0089f;
        c0102t.f2044a = enumC0097n2;
        C0310a c0310a = this.f2047b;
        C0312c a2 = c0310a.a(rVar);
        if (a2 != null) {
            obj = a2.f4118b;
        } else {
            HashMap hashMap2 = c0310a.e;
            C0312c c0312c = new C0312c(rVar, c0102t);
            c0310a.f4127d++;
            C0312c c0312c2 = c0310a.f4125b;
            if (c0312c2 == null) {
                c0310a.f4124a = c0312c;
                c0310a.f4125b = c0312c;
            } else {
                c0312c2.f4119c = c0312c;
                c0312c.f4120d = c0312c2;
                c0310a.f4125b = c0312c;
            }
            hashMap2.put(rVar, c0312c);
        }
        if (((C0102t) obj) == null && (interfaceC0101s = (InterfaceC0101s) this.f2049d.get()) != null) {
            boolean z4 = this.e != 0 || this.f2050f;
            EnumC0097n b2 = b(rVar);
            this.e++;
            while (c0102t.f2044a.compareTo(b2) < 0 && this.f2047b.e.containsKey(rVar)) {
                arrayList.add(c0102t.f2044a);
                C0094k c0094k = EnumC0096m.Companion;
                EnumC0097n enumC0097n3 = c0102t.f2044a;
                c0094k.getClass();
                EnumC0096m a3 = C0094k.a(enumC0097n3);
                if (a3 == null) {
                    throw new IllegalStateException("no event up from " + c0102t.f2044a);
                }
                c0102t.a(interfaceC0101s, a3);
                arrayList.remove(arrayList.size() - 1);
                b2 = b(rVar);
            }
            if (!z4) {
                h();
            }
            this.e--;
        }
    }

    public final EnumC0097n b(r rVar) {
        C0102t c0102t;
        HashMap hashMap = this.f2047b.e;
        C0312c c0312c = hashMap.containsKey(rVar) ? ((C0312c) hashMap.get(rVar)).f4120d : null;
        EnumC0097n enumC0097n = (c0312c == null || (c0102t = (C0102t) c0312c.f4118b) == null) ? null : c0102t.f2044a;
        ArrayList arrayList = this.f2052h;
        EnumC0097n enumC0097n2 = arrayList.isEmpty() ? null : (EnumC0097n) arrayList.get(arrayList.size() - 1);
        EnumC0097n enumC0097n3 = this.f2048c;
        D1.i.e(enumC0097n3, "state1");
        if (enumC0097n == null || enumC0097n.compareTo(enumC0097n3) >= 0) {
            enumC0097n = enumC0097n3;
        }
        return (enumC0097n2 == null || enumC0097n2.compareTo(enumC0097n) >= 0) ? enumC0097n : enumC0097n2;
    }

    public final void c(String str) {
        if (this.f2046a) {
            ((C0306a) C0306a.E().f4108g).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(D1.h.g("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(EnumC0096m enumC0096m) {
        D1.i.e(enumC0096m, "event");
        c("handleLifecycleEvent");
        e(enumC0096m.a());
    }

    public final void e(EnumC0097n enumC0097n) {
        EnumC0097n enumC0097n2 = this.f2048c;
        if (enumC0097n2 == enumC0097n) {
            return;
        }
        EnumC0097n enumC0097n3 = EnumC0097n.f2039b;
        EnumC0097n enumC0097n4 = EnumC0097n.f2038a;
        if (enumC0097n2 == enumC0097n3 && enumC0097n == enumC0097n4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC0097n + ", but was " + this.f2048c + " in component " + this.f2049d.get()).toString());
        }
        this.f2048c = enumC0097n;
        if (this.f2050f || this.e != 0) {
            this.f2051g = true;
            return;
        }
        this.f2050f = true;
        h();
        this.f2050f = false;
        if (this.f2048c == enumC0097n4) {
            this.f2047b = new C0310a();
        }
    }

    public final void f(r rVar) {
        D1.i.e(rVar, "observer");
        c("removeObserver");
        this.f2047b.b(rVar);
    }

    public final void g(EnumC0097n enumC0097n) {
        D1.i.e(enumC0097n, "state");
        c("setCurrentState");
        e(enumC0097n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r7.f2051g = false;
        r7.i.g(r7.f2048c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        InterfaceC0101s interfaceC0101s = (InterfaceC0101s) this.f2049d.get();
        if (interfaceC0101s == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C0310a c0310a = this.f2047b;
            if (c0310a.f4127d != 0) {
                C0312c c0312c = c0310a.f4124a;
                D1.i.b(c0312c);
                EnumC0097n enumC0097n = ((C0102t) c0312c.f4118b).f2044a;
                C0312c c0312c2 = this.f2047b.f4125b;
                D1.i.b(c0312c2);
                EnumC0097n enumC0097n2 = ((C0102t) c0312c2.f4118b).f2044a;
                if (enumC0097n == enumC0097n2 && this.f2048c == enumC0097n2) {
                    break;
                }
                this.f2051g = false;
                EnumC0097n enumC0097n3 = this.f2048c;
                C0312c c0312c3 = this.f2047b.f4124a;
                D1.i.b(c0312c3);
                if (enumC0097n3.compareTo(((C0102t) c0312c3.f4118b).f2044a) < 0) {
                    C0310a c0310a2 = this.f2047b;
                    C0311b c0311b = new C0311b(c0310a2.f4125b, c0310a2.f4124a, 1);
                    c0310a2.f4126c.put(c0311b, Boolean.FALSE);
                    while (c0311b.hasNext() && !this.f2051g) {
                        Map.Entry entry = (Map.Entry) c0311b.next();
                        D1.i.d(entry, "next()");
                        r rVar = (r) entry.getKey();
                        C0102t c0102t = (C0102t) entry.getValue();
                        while (c0102t.f2044a.compareTo(this.f2048c) > 0 && !this.f2051g && this.f2047b.e.containsKey(rVar)) {
                            C0094k c0094k = EnumC0096m.Companion;
                            EnumC0097n enumC0097n4 = c0102t.f2044a;
                            c0094k.getClass();
                            D1.i.e(enumC0097n4, "state");
                            int ordinal = enumC0097n4.ordinal();
                            EnumC0096m enumC0096m = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : EnumC0096m.ON_PAUSE : EnumC0096m.ON_STOP : EnumC0096m.ON_DESTROY;
                            if (enumC0096m == null) {
                                throw new IllegalStateException("no event down from " + c0102t.f2044a);
                            }
                            this.f2052h.add(enumC0096m.a());
                            c0102t.a(interfaceC0101s, enumC0096m);
                            this.f2052h.remove(r4.size() - 1);
                        }
                    }
                }
                C0312c c0312c4 = this.f2047b.f4125b;
                if (!this.f2051g && c0312c4 != null && this.f2048c.compareTo(((C0102t) c0312c4.f4118b).f2044a) > 0) {
                    C0310a c0310a3 = this.f2047b;
                    c0310a3.getClass();
                    C0313d c0313d = new C0313d(c0310a3);
                    c0310a3.f4126c.put(c0313d, Boolean.FALSE);
                    while (c0313d.hasNext() && !this.f2051g) {
                        Map.Entry entry2 = (Map.Entry) c0313d.next();
                        r rVar2 = (r) entry2.getKey();
                        C0102t c0102t2 = (C0102t) entry2.getValue();
                        while (c0102t2.f2044a.compareTo(this.f2048c) < 0 && !this.f2051g && this.f2047b.e.containsKey(rVar2)) {
                            this.f2052h.add(c0102t2.f2044a);
                            C0094k c0094k2 = EnumC0096m.Companion;
                            EnumC0097n enumC0097n5 = c0102t2.f2044a;
                            c0094k2.getClass();
                            EnumC0096m a2 = C0094k.a(enumC0097n5);
                            if (a2 == null) {
                                throw new IllegalStateException("no event up from " + c0102t2.f2044a);
                            }
                            c0102t2.a(interfaceC0101s, a2);
                            this.f2052h.remove(r4.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
