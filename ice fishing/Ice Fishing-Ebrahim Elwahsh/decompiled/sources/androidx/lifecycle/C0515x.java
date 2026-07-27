package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import n.C4798b;
import o.C4818a;
import o.C4819b;
import o.C4820c;
import o.C4821d;

/* renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0515x extends AbstractC0508p {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5288b;

    /* renamed from: c, reason: collision with root package name */
    public C4818a f5289c;

    /* renamed from: d, reason: collision with root package name */
    public EnumC0507o f5290d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f5291e;

    /* renamed from: f, reason: collision with root package name */
    public int f5292f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5293g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5294h;
    public final ArrayList i;

    public C0515x(InterfaceC0513v interfaceC0513v) {
        this.f5282a = new AtomicReference();
        this.f5288b = true;
        this.f5289c = new C4818a();
        this.f5290d = EnumC0507o.f5277u;
        this.i = new ArrayList();
        this.f5291e = new WeakReference(interfaceC0513v);
    }

    @Override // androidx.lifecycle.AbstractC0508p
    public final void a(InterfaceC0512u interfaceC0512u) {
        InterfaceC0511t reflectiveGenericLifecycleObserver;
        Object obj;
        InterfaceC0513v interfaceC0513v;
        ArrayList arrayList = this.i;
        d("addObserver");
        EnumC0507o enumC0507o = this.f5290d;
        EnumC0507o enumC0507o2 = EnumC0507o.f5276n;
        if (enumC0507o != enumC0507o2) {
            enumC0507o2 = EnumC0507o.f5277u;
        }
        C0514w c0514w = new C0514w();
        HashMap hashMap = z.f5296a;
        boolean z8 = interfaceC0512u instanceof InterfaceC0511t;
        boolean z9 = interfaceC0512u instanceof InterfaceC0498f;
        if (z8 && z9) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0498f) interfaceC0512u, (InterfaceC0511t) interfaceC0512u);
        } else if (z9) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0498f) interfaceC0512u, null);
        } else if (z8) {
            reflectiveGenericLifecycleObserver = (InterfaceC0511t) interfaceC0512u;
        } else {
            Class<?> cls = interfaceC0512u.getClass();
            if (z.b(cls) == 2) {
                Object obj2 = z.f5297b.get(cls);
                kotlin.jvm.internal.h.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    z.a((Constructor) list.get(0), interfaceC0512u);
                    throw null;
                }
                int size = list.size();
                InterfaceC0501i[] interfaceC0501iArr = new InterfaceC0501i[size];
                if (size > 0) {
                    z.a((Constructor) list.get(0), interfaceC0512u);
                    throw null;
                }
                reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(interfaceC0501iArr);
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(interfaceC0512u);
            }
        }
        c0514w.f5287b = reflectiveGenericLifecycleObserver;
        c0514w.f5286a = enumC0507o2;
        C4818a c4818a = this.f5289c;
        C4820c a9 = c4818a.a(interfaceC0512u);
        if (a9 != null) {
            obj = a9.f39664u;
        } else {
            HashMap hashMap2 = c4818a.f39659x;
            C4820c c4820c = new C4820c(interfaceC0512u, c0514w);
            c4818a.f39673w++;
            C4820c c4820c2 = c4818a.f39671u;
            if (c4820c2 == null) {
                c4818a.f39670n = c4820c;
                c4818a.f39671u = c4820c;
            } else {
                c4820c2.f39665v = c4820c;
                c4820c.f39666w = c4820c2;
                c4818a.f39671u = c4820c;
            }
            hashMap2.put(interfaceC0512u, c4820c);
            obj = null;
        }
        if (((C0514w) obj) == null && (interfaceC0513v = (InterfaceC0513v) this.f5291e.get()) != null) {
            boolean z10 = this.f5292f != 0 || this.f5293g;
            EnumC0507o c4 = c(interfaceC0512u);
            this.f5292f++;
            while (c0514w.f5286a.compareTo(c4) < 0 && this.f5289c.f39659x.containsKey(interfaceC0512u)) {
                arrayList.add(c0514w.f5286a);
                C0504l c0504l = EnumC0506n.Companion;
                EnumC0507o state = c0514w.f5286a;
                c0504l.getClass();
                kotlin.jvm.internal.h.e(state, "state");
                int ordinal = state.ordinal();
                EnumC0506n enumC0506n = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : EnumC0506n.ON_RESUME : EnumC0506n.ON_START : EnumC0506n.ON_CREATE;
                if (enumC0506n == null) {
                    throw new IllegalStateException("no event up from " + c0514w.f5286a);
                }
                c0514w.a(interfaceC0513v, enumC0506n);
                arrayList.remove(arrayList.size() - 1);
                c4 = c(interfaceC0512u);
            }
            if (!z10) {
                h();
            }
            this.f5292f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0508p
    public final void b(InterfaceC0512u observer) {
        kotlin.jvm.internal.h.e(observer, "observer");
        d("removeObserver");
        this.f5289c.c(observer);
    }

    public final EnumC0507o c(InterfaceC0512u interfaceC0512u) {
        C0514w c0514w;
        HashMap hashMap = this.f5289c.f39659x;
        C4820c c4820c = hashMap.containsKey(interfaceC0512u) ? ((C4820c) hashMap.get(interfaceC0512u)).f39666w : null;
        EnumC0507o enumC0507o = (c4820c == null || (c0514w = (C0514w) c4820c.f39664u) == null) ? null : c0514w.f5286a;
        ArrayList arrayList = this.i;
        EnumC0507o enumC0507o2 = arrayList.isEmpty() ? null : (EnumC0507o) arrayList.get(arrayList.size() - 1);
        EnumC0507o state1 = this.f5290d;
        kotlin.jvm.internal.h.e(state1, "state1");
        if (enumC0507o == null || enumC0507o.compareTo(state1) >= 0) {
            enumC0507o = state1;
        }
        return (enumC0507o2 == null || enumC0507o2.compareTo(enumC0507o) >= 0) ? enumC0507o : enumC0507o2;
    }

    public final void d(String str) {
        if (this.f5288b) {
            C4798b.J().f39614n.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(D.y.k("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void e(EnumC0506n event) {
        kotlin.jvm.internal.h.e(event, "event");
        d("handleLifecycleEvent");
        f(event.a());
    }

    public final void f(EnumC0507o enumC0507o) {
        EnumC0507o enumC0507o2 = this.f5290d;
        if (enumC0507o2 == enumC0507o) {
            return;
        }
        EnumC0507o enumC0507o3 = EnumC0507o.f5277u;
        EnumC0507o enumC0507o4 = EnumC0507o.f5276n;
        if (enumC0507o2 == enumC0507o3 && enumC0507o == enumC0507o4) {
            throw new IllegalStateException(("no event down from " + this.f5290d + " in component " + this.f5291e.get()).toString());
        }
        this.f5290d = enumC0507o;
        if (this.f5293g || this.f5292f != 0) {
            this.f5294h = true;
            return;
        }
        this.f5293g = true;
        h();
        this.f5293g = false;
        if (this.f5290d == enumC0507o4) {
            this.f5289c = new C4818a();
        }
    }

    public final void g() {
        EnumC0507o enumC0507o = EnumC0507o.f5278v;
        d("setCurrentState");
        f(enumC0507o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r12.f5294h = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        InterfaceC0513v interfaceC0513v = (InterfaceC0513v) this.f5291e.get();
        if (interfaceC0513v == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C4818a c4818a = this.f5289c;
            if (c4818a.f39673w != 0) {
                C4820c c4820c = c4818a.f39670n;
                kotlin.jvm.internal.h.b(c4820c);
                EnumC0507o enumC0507o = ((C0514w) c4820c.f39664u).f5286a;
                C4820c c4820c2 = this.f5289c.f39671u;
                kotlin.jvm.internal.h.b(c4820c2);
                EnumC0507o enumC0507o2 = ((C0514w) c4820c2.f39664u).f5286a;
                if (enumC0507o == enumC0507o2 && this.f5290d == enumC0507o2) {
                    break;
                }
                this.f5294h = false;
                EnumC0507o enumC0507o3 = this.f5290d;
                C4820c c4820c3 = this.f5289c.f39670n;
                kotlin.jvm.internal.h.b(c4820c3);
                if (enumC0507o3.compareTo(((C0514w) c4820c3.f39664u).f5286a) < 0) {
                    C4818a c4818a2 = this.f5289c;
                    C4819b c4819b = new C4819b(c4818a2.f39671u, c4818a2.f39670n, 1);
                    c4818a2.f39672v.put(c4819b, Boolean.FALSE);
                    while (c4819b.hasNext() && !this.f5294h) {
                        Map.Entry entry = (Map.Entry) c4819b.next();
                        kotlin.jvm.internal.h.d(entry, "next()");
                        InterfaceC0512u interfaceC0512u = (InterfaceC0512u) entry.getKey();
                        C0514w c0514w = (C0514w) entry.getValue();
                        while (c0514w.f5286a.compareTo(this.f5290d) > 0 && !this.f5294h && this.f5289c.f39659x.containsKey(interfaceC0512u)) {
                            C0504l c0504l = EnumC0506n.Companion;
                            EnumC0507o state = c0514w.f5286a;
                            c0504l.getClass();
                            kotlin.jvm.internal.h.e(state, "state");
                            int ordinal = state.ordinal();
                            EnumC0506n enumC0506n = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : EnumC0506n.ON_PAUSE : EnumC0506n.ON_STOP : EnumC0506n.ON_DESTROY;
                            if (enumC0506n == null) {
                                throw new IllegalStateException("no event down from " + c0514w.f5286a);
                            }
                            this.i.add(enumC0506n.a());
                            c0514w.a(interfaceC0513v, enumC0506n);
                            ArrayList arrayList = this.i;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                C4820c c4820c4 = this.f5289c.f39671u;
                if (!this.f5294h && c4820c4 != null && this.f5290d.compareTo(((C0514w) c4820c4.f39664u).f5286a) > 0) {
                    C4818a c4818a3 = this.f5289c;
                    c4818a3.getClass();
                    C4821d c4821d = new C4821d(c4818a3);
                    c4818a3.f39672v.put(c4821d, Boolean.FALSE);
                    while (c4821d.hasNext() && !this.f5294h) {
                        Map.Entry entry2 = (Map.Entry) c4821d.next();
                        InterfaceC0512u interfaceC0512u2 = (InterfaceC0512u) entry2.getKey();
                        C0514w c0514w2 = (C0514w) entry2.getValue();
                        while (c0514w2.f5286a.compareTo(this.f5290d) < 0 && !this.f5294h && this.f5289c.f39659x.containsKey(interfaceC0512u2)) {
                            this.i.add(c0514w2.f5286a);
                            C0504l c0504l2 = EnumC0506n.Companion;
                            EnumC0507o state2 = c0514w2.f5286a;
                            c0504l2.getClass();
                            kotlin.jvm.internal.h.e(state2, "state");
                            int ordinal2 = state2.ordinal();
                            EnumC0506n enumC0506n2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : EnumC0506n.ON_RESUME : EnumC0506n.ON_START : EnumC0506n.ON_CREATE;
                            if (enumC0506n2 == null) {
                                throw new IllegalStateException("no event up from " + c0514w2.f5286a);
                            }
                            c0514w2.a(interfaceC0513v, enumC0506n2);
                            ArrayList arrayList2 = this.i;
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
