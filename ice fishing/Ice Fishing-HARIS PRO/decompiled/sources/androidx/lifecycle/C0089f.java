package androidx.lifecycle;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.List;
import l0.C0233d;

/* renamed from: androidx.lifecycle.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0089f implements InterfaceC0100q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2034a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2035b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2036c;

    public C0089f(V.k kVar, InterfaceC0100q interfaceC0100q) {
        D1.i.e(kVar, "defaultLifecycleObserver");
        this.f2035b = kVar;
        this.f2036c = interfaceC0100q;
    }

    @Override // androidx.lifecycle.InterfaceC0100q
    public final void a(InterfaceC0101s interfaceC0101s, EnumC0096m enumC0096m) {
        switch (this.f2034a) {
            case 0:
                int i = AbstractC0088e.f2033a[enumC0096m.ordinal()];
                V.k kVar = (V.k) this.f2035b;
                switch (i) {
                    case 1:
                        kVar.getClass();
                        break;
                    case 2:
                        kVar.getClass();
                        break;
                    case 3:
                        kVar.f1222b.getClass();
                        (Build.VERSION.SDK_INT >= 28 ? V.b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new V.n(), 500L);
                        kVar.f1221a.f(kVar);
                        break;
                    case 4:
                        kVar.getClass();
                        break;
                    case 5:
                        kVar.getClass();
                        break;
                    case 6:
                        kVar.getClass();
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                InterfaceC0100q interfaceC0100q = (InterfaceC0100q) this.f2036c;
                if (interfaceC0100q != null) {
                    interfaceC0100q.a(interfaceC0101s, enumC0096m);
                    return;
                }
                return;
            case 1:
                if (enumC0096m == EnumC0096m.ON_START) {
                    ((C0103u) this.f2035b).f(this);
                    ((C0233d) this.f2036c).g();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((C0085b) this.f2036c).f2026a;
                List list = (List) hashMap.get(enumC0096m);
                r rVar = (r) this.f2035b;
                C0085b.a(list, interfaceC0101s, enumC0096m, rVar);
                C0085b.a((List) hashMap.get(EnumC0096m.ON_ANY), interfaceC0101s, enumC0096m, rVar);
                return;
        }
    }

    public C0089f(r rVar) {
        this.f2035b = rVar;
        C0087d c0087d = C0087d.f2030c;
        Class<?> cls = rVar.getClass();
        C0085b c0085b = (C0085b) c0087d.f2031a.get(cls);
        this.f2036c = c0085b == null ? c0087d.a(cls, null) : c0085b;
    }

    public C0089f(C0103u c0103u, C0233d c0233d) {
        this.f2035b = c0103u;
        this.f2036c = c0233d;
    }
}
