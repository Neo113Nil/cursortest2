package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import n.C4757b;
import o.C4789a;
import o.C4790b;
import o.C4791c;
import o.C4792d;

/* renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0509x extends AbstractC0502p {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5143b;

    /* renamed from: c, reason: collision with root package name */
    public C4789a f5144c;

    /* renamed from: d, reason: collision with root package name */
    public EnumC0501o f5145d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f5146e;

    /* renamed from: f, reason: collision with root package name */
    public int f5147f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5148g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5149h;
    public final ArrayList i;

    public C0509x(InterfaceC0507v interfaceC0507v) {
        this.f5137a = new AtomicReference();
        this.f5143b = true;
        this.f5144c = new C4789a();
        this.f5145d = EnumC0501o.f5132u;
        this.i = new ArrayList();
        this.f5146e = new WeakReference(interfaceC0507v);
    }

    @Override // androidx.lifecycle.AbstractC0502p
    public final void a(InterfaceC0506u interfaceC0506u) {
        InterfaceC0505t reflectiveGenericLifecycleObserver;
        Object obj;
        InterfaceC0507v interfaceC0507v;
        ArrayList arrayList = this.i;
        d("addObserver");
        EnumC0501o enumC0501o = this.f5145d;
        EnumC0501o enumC0501o2 = EnumC0501o.f5131n;
        if (enumC0501o != enumC0501o2) {
            enumC0501o2 = EnumC0501o.f5132u;
        }
        C0508w c0508w = new C0508w();
        HashMap hashMap = z.f5151a;
        boolean z6 = interfaceC0506u instanceof InterfaceC0505t;
        boolean z9 = interfaceC0506u instanceof InterfaceC0492f;
        if (z6 && z9) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0492f) interfaceC0506u, (InterfaceC0505t) interfaceC0506u);
        } else if (z9) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0492f) interfaceC0506u, null);
        } else if (z6) {
            reflectiveGenericLifecycleObserver = (InterfaceC0505t) interfaceC0506u;
        } else {
            Class<?> cls = interfaceC0506u.getClass();
            if (z.b(cls) == 2) {
                Object obj2 = z.f5152b.get(cls);
                kotlin.jvm.internal.h.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    z.a((Constructor) list.get(0), interfaceC0506u);
                    throw null;
                }
                int size = list.size();
                InterfaceC0495i[] interfaceC0495iArr = new InterfaceC0495i[size];
                if (size > 0) {
                    z.a((Constructor) list.get(0), interfaceC0506u);
                    throw null;
                }
                reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(interfaceC0495iArr);
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(interfaceC0506u);
            }
        }
        c0508w.f5142b = reflectiveGenericLifecycleObserver;
        c0508w.f5141a = enumC0501o2;
        C4789a c4789a = this.f5144c;
        C4791c a9 = c4789a.a(interfaceC0506u);
        if (a9 != null) {
            obj = a9.f39700u;
        } else {
            HashMap hashMap2 = c4789a.f39695x;
            C4791c c4791c = new C4791c(interfaceC0506u, c0508w);
            c4789a.f39709w++;
            C4791c c4791c2 = c4789a.f39707u;
            if (c4791c2 == null) {
                c4789a.f39706n = c4791c;
                c4789a.f39707u = c4791c;
            } else {
                c4791c2.f39701v = c4791c;
                c4791c.f39702w = c4791c2;
                c4789a.f39707u = c4791c;
            }
            hashMap2.put(interfaceC0506u, c4791c);
            obj = null;
        }
        if (((C0508w) obj) == null && (interfaceC0507v = (InterfaceC0507v) this.f5146e.get()) != null) {
            boolean z10 = this.f5147f != 0 || this.f5148g;
            EnumC0501o c9 = c(interfaceC0506u);
            this.f5147f++;
            while (c0508w.f5141a.compareTo(c9) < 0 && this.f5144c.f39695x.containsKey(interfaceC0506u)) {
                arrayList.add(c0508w.f5141a);
                C0498l c0498l = EnumC0500n.Companion;
                EnumC0501o state = c0508w.f5141a;
                c0498l.getClass();
                kotlin.jvm.internal.h.e(state, "state");
                int ordinal = state.ordinal();
                EnumC0500n enumC0500n = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : EnumC0500n.ON_RESUME : EnumC0500n.ON_START : EnumC0500n.ON_CREATE;
                if (enumC0500n == null) {
                    throw new IllegalStateException("no event up from " + c0508w.f5141a);
                }
                c0508w.a(interfaceC0507v, enumC0500n);
                arrayList.remove(arrayList.size() - 1);
                c9 = c(interfaceC0506u);
            }
            if (!z10) {
                h();
            }
            this.f5147f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0502p
    public final void b(InterfaceC0506u observer) {
        kotlin.jvm.internal.h.e(observer, "observer");
        d("removeObserver");
        this.f5144c.c(observer);
    }

    public final EnumC0501o c(InterfaceC0506u interfaceC0506u) {
        C0508w c0508w;
        HashMap hashMap = this.f5144c.f39695x;
        C4791c c4791c = hashMap.containsKey(interfaceC0506u) ? ((C4791c) hashMap.get(interfaceC0506u)).f39702w : null;
        EnumC0501o enumC0501o = (c4791c == null || (c0508w = (C0508w) c4791c.f39700u) == null) ? null : c0508w.f5141a;
        ArrayList arrayList = this.i;
        EnumC0501o enumC0501o2 = arrayList.isEmpty() ? null : (EnumC0501o) arrayList.get(arrayList.size() - 1);
        EnumC0501o state1 = this.f5145d;
        kotlin.jvm.internal.h.e(state1, "state1");
        if (enumC0501o == null || enumC0501o.compareTo(state1) >= 0) {
            enumC0501o = state1;
        }
        return (enumC0501o2 == null || enumC0501o2.compareTo(enumC0501o) >= 0) ? enumC0501o : enumC0501o2;
    }

    public final void d(String str) {
        if (this.f5143b) {
            C4757b.z().f39604b.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(D.x.l("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void e(EnumC0500n event) {
        kotlin.jvm.internal.h.e(event, "event");
        d("handleLifecycleEvent");
        f(event.a());
    }

    public final void f(EnumC0501o enumC0501o) {
        EnumC0501o enumC0501o2 = this.f5145d;
        if (enumC0501o2 == enumC0501o) {
            return;
        }
        EnumC0501o enumC0501o3 = EnumC0501o.f5132u;
        EnumC0501o enumC0501o4 = EnumC0501o.f5131n;
        if (enumC0501o2 == enumC0501o3 && enumC0501o == enumC0501o4) {
            throw new IllegalStateException(("no event down from " + this.f5145d + " in component " + this.f5146e.get()).toString());
        }
        this.f5145d = enumC0501o;
        if (this.f5148g || this.f5147f != 0) {
            this.f5149h = true;
            return;
        }
        this.f5148g = true;
        h();
        this.f5148g = false;
        if (this.f5145d == enumC0501o4) {
            this.f5144c = new C4789a();
        }
    }

    public final void g() {
        EnumC0501o enumC0501o = EnumC0501o.f5133v;
        d("setCurrentState");
        f(enumC0501o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r12.f5149h = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        InterfaceC0507v interfaceC0507v = (InterfaceC0507v) this.f5146e.get();
        if (interfaceC0507v == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C4789a c4789a = this.f5144c;
            if (c4789a.f39709w != 0) {
                C4791c c4791c = c4789a.f39706n;
                kotlin.jvm.internal.h.b(c4791c);
                EnumC0501o enumC0501o = ((C0508w) c4791c.f39700u).f5141a;
                C4791c c4791c2 = this.f5144c.f39707u;
                kotlin.jvm.internal.h.b(c4791c2);
                EnumC0501o enumC0501o2 = ((C0508w) c4791c2.f39700u).f5141a;
                if (enumC0501o == enumC0501o2 && this.f5145d == enumC0501o2) {
                    break;
                }
                this.f5149h = false;
                EnumC0501o enumC0501o3 = this.f5145d;
                C4791c c4791c3 = this.f5144c.f39706n;
                kotlin.jvm.internal.h.b(c4791c3);
                if (enumC0501o3.compareTo(((C0508w) c4791c3.f39700u).f5141a) < 0) {
                    C4789a c4789a2 = this.f5144c;
                    C4790b c4790b = new C4790b(c4789a2.f39707u, c4789a2.f39706n, 1);
                    c4789a2.f39708v.put(c4790b, Boolean.FALSE);
                    while (c4790b.hasNext() && !this.f5149h) {
                        Map.Entry entry = (Map.Entry) c4790b.next();
                        kotlin.jvm.internal.h.d(entry, "next()");
                        InterfaceC0506u interfaceC0506u = (InterfaceC0506u) entry.getKey();
                        C0508w c0508w = (C0508w) entry.getValue();
                        while (c0508w.f5141a.compareTo(this.f5145d) > 0 && !this.f5149h && this.f5144c.f39695x.containsKey(interfaceC0506u)) {
                            C0498l c0498l = EnumC0500n.Companion;
                            EnumC0501o state = c0508w.f5141a;
                            c0498l.getClass();
                            kotlin.jvm.internal.h.e(state, "state");
                            int ordinal = state.ordinal();
                            EnumC0500n enumC0500n = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : EnumC0500n.ON_PAUSE : EnumC0500n.ON_STOP : EnumC0500n.ON_DESTROY;
                            if (enumC0500n == null) {
                                throw new IllegalStateException("no event down from " + c0508w.f5141a);
                            }
                            this.i.add(enumC0500n.a());
                            c0508w.a(interfaceC0507v, enumC0500n);
                            ArrayList arrayList = this.i;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                C4791c c4791c4 = this.f5144c.f39707u;
                if (!this.f5149h && c4791c4 != null && this.f5145d.compareTo(((C0508w) c4791c4.f39700u).f5141a) > 0) {
                    C4789a c4789a3 = this.f5144c;
                    c4789a3.getClass();
                    C4792d c4792d = new C4792d(c4789a3);
                    c4789a3.f39708v.put(c4792d, Boolean.FALSE);
                    while (c4792d.hasNext() && !this.f5149h) {
                        Map.Entry entry2 = (Map.Entry) c4792d.next();
                        InterfaceC0506u interfaceC0506u2 = (InterfaceC0506u) entry2.getKey();
                        C0508w c0508w2 = (C0508w) entry2.getValue();
                        while (c0508w2.f5141a.compareTo(this.f5145d) < 0 && !this.f5149h && this.f5144c.f39695x.containsKey(interfaceC0506u2)) {
                            this.i.add(c0508w2.f5141a);
                            C0498l c0498l2 = EnumC0500n.Companion;
                            EnumC0501o state2 = c0508w2.f5141a;
                            c0498l2.getClass();
                            kotlin.jvm.internal.h.e(state2, "state");
                            int ordinal2 = state2.ordinal();
                            EnumC0500n enumC0500n2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : EnumC0500n.ON_RESUME : EnumC0500n.ON_START : EnumC0500n.ON_CREATE;
                            if (enumC0500n2 == null) {
                                throw new IllegalStateException("no event up from " + c0508w2.f5141a);
                            }
                            c0508w2.a(interfaceC0507v, enumC0500n2);
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
