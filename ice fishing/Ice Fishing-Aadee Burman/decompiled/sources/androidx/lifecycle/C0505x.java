package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import n.C4743b;
import o.C4773a;
import o.C4774b;
import o.C4775c;
import o.C4776d;

/* renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0505x extends AbstractC0498p {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5176b;

    /* renamed from: c, reason: collision with root package name */
    public C4773a f5177c;

    /* renamed from: d, reason: collision with root package name */
    public EnumC0497o f5178d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f5179e;

    /* renamed from: f, reason: collision with root package name */
    public int f5180f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5181g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5182h;
    public final ArrayList i;

    public C0505x(InterfaceC0503v interfaceC0503v) {
        this.f5170a = new AtomicReference();
        this.f5176b = true;
        this.f5177c = new C4773a();
        this.f5178d = EnumC0497o.f5165u;
        this.i = new ArrayList();
        this.f5179e = new WeakReference(interfaceC0503v);
    }

    @Override // androidx.lifecycle.AbstractC0498p
    public final void a(InterfaceC0502u interfaceC0502u) {
        InterfaceC0501t reflectiveGenericLifecycleObserver;
        Object obj;
        InterfaceC0503v interfaceC0503v;
        ArrayList arrayList = this.i;
        d("addObserver");
        EnumC0497o enumC0497o = this.f5178d;
        EnumC0497o enumC0497o2 = EnumC0497o.f5164n;
        if (enumC0497o != enumC0497o2) {
            enumC0497o2 = EnumC0497o.f5165u;
        }
        C0504w c0504w = new C0504w();
        HashMap hashMap = z.f5184a;
        boolean z3 = interfaceC0502u instanceof InterfaceC0501t;
        boolean z6 = interfaceC0502u instanceof InterfaceC0488f;
        if (z3 && z6) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0488f) interfaceC0502u, (InterfaceC0501t) interfaceC0502u);
        } else if (z6) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0488f) interfaceC0502u, null);
        } else if (z3) {
            reflectiveGenericLifecycleObserver = (InterfaceC0501t) interfaceC0502u;
        } else {
            Class<?> cls = interfaceC0502u.getClass();
            if (z.b(cls) == 2) {
                Object obj2 = z.f5185b.get(cls);
                kotlin.jvm.internal.h.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    z.a((Constructor) list.get(0), interfaceC0502u);
                    throw null;
                }
                int size = list.size();
                InterfaceC0491i[] interfaceC0491iArr = new InterfaceC0491i[size];
                if (size > 0) {
                    z.a((Constructor) list.get(0), interfaceC0502u);
                    throw null;
                }
                reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(interfaceC0491iArr);
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(interfaceC0502u);
            }
        }
        c0504w.f5175b = reflectiveGenericLifecycleObserver;
        c0504w.f5174a = enumC0497o2;
        C4773a c4773a = this.f5177c;
        C4775c a9 = c4773a.a(interfaceC0502u);
        if (a9 != null) {
            obj = a9.f39533u;
        } else {
            HashMap hashMap2 = c4773a.f39528x;
            C4775c c4775c = new C4775c(interfaceC0502u, c0504w);
            c4773a.f39542w++;
            C4775c c4775c2 = c4773a.f39540u;
            if (c4775c2 == null) {
                c4773a.f39539n = c4775c;
                c4773a.f39540u = c4775c;
            } else {
                c4775c2.f39534v = c4775c;
                c4775c.f39535w = c4775c2;
                c4773a.f39540u = c4775c;
            }
            hashMap2.put(interfaceC0502u, c4775c);
            obj = null;
        }
        if (((C0504w) obj) == null && (interfaceC0503v = (InterfaceC0503v) this.f5179e.get()) != null) {
            boolean z9 = this.f5180f != 0 || this.f5181g;
            EnumC0497o c9 = c(interfaceC0502u);
            this.f5180f++;
            while (c0504w.f5174a.compareTo(c9) < 0 && this.f5177c.f39528x.containsKey(interfaceC0502u)) {
                arrayList.add(c0504w.f5174a);
                C0494l c0494l = EnumC0496n.Companion;
                EnumC0497o state = c0504w.f5174a;
                c0494l.getClass();
                kotlin.jvm.internal.h.e(state, "state");
                int ordinal = state.ordinal();
                EnumC0496n enumC0496n = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : EnumC0496n.ON_RESUME : EnumC0496n.ON_START : EnumC0496n.ON_CREATE;
                if (enumC0496n == null) {
                    throw new IllegalStateException("no event up from " + c0504w.f5174a);
                }
                c0504w.a(interfaceC0503v, enumC0496n);
                arrayList.remove(arrayList.size() - 1);
                c9 = c(interfaceC0502u);
            }
            if (!z9) {
                h();
            }
            this.f5180f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0498p
    public final void b(InterfaceC0502u observer) {
        kotlin.jvm.internal.h.e(observer, "observer");
        d("removeObserver");
        this.f5177c.c(observer);
    }

    public final EnumC0497o c(InterfaceC0502u interfaceC0502u) {
        C0504w c0504w;
        HashMap hashMap = this.f5177c.f39528x;
        C4775c c4775c = hashMap.containsKey(interfaceC0502u) ? ((C4775c) hashMap.get(interfaceC0502u)).f39535w : null;
        EnumC0497o enumC0497o = (c4775c == null || (c0504w = (C0504w) c4775c.f39533u) == null) ? null : c0504w.f5174a;
        ArrayList arrayList = this.i;
        EnumC0497o enumC0497o2 = arrayList.isEmpty() ? null : (EnumC0497o) arrayList.get(arrayList.size() - 1);
        EnumC0497o state1 = this.f5178d;
        kotlin.jvm.internal.h.e(state1, "state1");
        if (enumC0497o == null || enumC0497o.compareTo(state1) >= 0) {
            enumC0497o = state1;
        }
        return (enumC0497o2 == null || enumC0497o2.compareTo(enumC0497o) >= 0) ? enumC0497o : enumC0497o2;
    }

    public final void d(String str) {
        if (this.f5176b) {
            C4743b.T().f39446h.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(D.y.o("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void e(EnumC0496n event) {
        kotlin.jvm.internal.h.e(event, "event");
        d("handleLifecycleEvent");
        f(event.a());
    }

    public final void f(EnumC0497o enumC0497o) {
        EnumC0497o enumC0497o2 = this.f5178d;
        if (enumC0497o2 == enumC0497o) {
            return;
        }
        EnumC0497o enumC0497o3 = EnumC0497o.f5165u;
        EnumC0497o enumC0497o4 = EnumC0497o.f5164n;
        if (enumC0497o2 == enumC0497o3 && enumC0497o == enumC0497o4) {
            throw new IllegalStateException(("no event down from " + this.f5178d + " in component " + this.f5179e.get()).toString());
        }
        this.f5178d = enumC0497o;
        if (this.f5181g || this.f5180f != 0) {
            this.f5182h = true;
            return;
        }
        this.f5181g = true;
        h();
        this.f5181g = false;
        if (this.f5178d == enumC0497o4) {
            this.f5177c = new C4773a();
        }
    }

    public final void g() {
        EnumC0497o enumC0497o = EnumC0497o.f5166v;
        d("setCurrentState");
        f(enumC0497o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r12.f5182h = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        InterfaceC0503v interfaceC0503v = (InterfaceC0503v) this.f5179e.get();
        if (interfaceC0503v == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C4773a c4773a = this.f5177c;
            if (c4773a.f39542w != 0) {
                C4775c c4775c = c4773a.f39539n;
                kotlin.jvm.internal.h.b(c4775c);
                EnumC0497o enumC0497o = ((C0504w) c4775c.f39533u).f5174a;
                C4775c c4775c2 = this.f5177c.f39540u;
                kotlin.jvm.internal.h.b(c4775c2);
                EnumC0497o enumC0497o2 = ((C0504w) c4775c2.f39533u).f5174a;
                if (enumC0497o == enumC0497o2 && this.f5178d == enumC0497o2) {
                    break;
                }
                this.f5182h = false;
                EnumC0497o enumC0497o3 = this.f5178d;
                C4775c c4775c3 = this.f5177c.f39539n;
                kotlin.jvm.internal.h.b(c4775c3);
                if (enumC0497o3.compareTo(((C0504w) c4775c3.f39533u).f5174a) < 0) {
                    C4773a c4773a2 = this.f5177c;
                    C4774b c4774b = new C4774b(c4773a2.f39540u, c4773a2.f39539n, 1);
                    c4773a2.f39541v.put(c4774b, Boolean.FALSE);
                    while (c4774b.hasNext() && !this.f5182h) {
                        Map.Entry entry = (Map.Entry) c4774b.next();
                        kotlin.jvm.internal.h.d(entry, "next()");
                        InterfaceC0502u interfaceC0502u = (InterfaceC0502u) entry.getKey();
                        C0504w c0504w = (C0504w) entry.getValue();
                        while (c0504w.f5174a.compareTo(this.f5178d) > 0 && !this.f5182h && this.f5177c.f39528x.containsKey(interfaceC0502u)) {
                            C0494l c0494l = EnumC0496n.Companion;
                            EnumC0497o state = c0504w.f5174a;
                            c0494l.getClass();
                            kotlin.jvm.internal.h.e(state, "state");
                            int ordinal = state.ordinal();
                            EnumC0496n enumC0496n = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : EnumC0496n.ON_PAUSE : EnumC0496n.ON_STOP : EnumC0496n.ON_DESTROY;
                            if (enumC0496n == null) {
                                throw new IllegalStateException("no event down from " + c0504w.f5174a);
                            }
                            this.i.add(enumC0496n.a());
                            c0504w.a(interfaceC0503v, enumC0496n);
                            ArrayList arrayList = this.i;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                C4775c c4775c4 = this.f5177c.f39540u;
                if (!this.f5182h && c4775c4 != null && this.f5178d.compareTo(((C0504w) c4775c4.f39533u).f5174a) > 0) {
                    C4773a c4773a3 = this.f5177c;
                    c4773a3.getClass();
                    C4776d c4776d = new C4776d(c4773a3);
                    c4773a3.f39541v.put(c4776d, Boolean.FALSE);
                    while (c4776d.hasNext() && !this.f5182h) {
                        Map.Entry entry2 = (Map.Entry) c4776d.next();
                        InterfaceC0502u interfaceC0502u2 = (InterfaceC0502u) entry2.getKey();
                        C0504w c0504w2 = (C0504w) entry2.getValue();
                        while (c0504w2.f5174a.compareTo(this.f5178d) < 0 && !this.f5182h && this.f5177c.f39528x.containsKey(interfaceC0502u2)) {
                            this.i.add(c0504w2.f5174a);
                            C0494l c0494l2 = EnumC0496n.Companion;
                            EnumC0497o state2 = c0504w2.f5174a;
                            c0494l2.getClass();
                            kotlin.jvm.internal.h.e(state2, "state");
                            int ordinal2 = state2.ordinal();
                            EnumC0496n enumC0496n2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : EnumC0496n.ON_RESUME : EnumC0496n.ON_START : EnumC0496n.ON_CREATE;
                            if (enumC0496n2 == null) {
                                throw new IllegalStateException("no event up from " + c0504w2.f5174a);
                            }
                            c0504w2.a(interfaceC0503v, enumC0496n2);
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
