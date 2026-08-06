package f1;

import A1.AbstractC0022x;
import F.InterfaceC0033i;
import a1.InterfaceC0090f;
import android.content.Context;
import android.util.Log;
import h1.C0239i;
import i1.AbstractC0252i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m1.EnumC0985a;
import n1.AbstractC0991b;
import n1.AbstractC0995f;

/* renamed from: f1.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0161L implements W0.b, InterfaceC0175i {

    /* renamed from: a, reason: collision with root package name */
    public Context f2909a;

    /* renamed from: b, reason: collision with root package name */
    public I0.b f2910b;

    /* renamed from: c, reason: collision with root package name */
    public final m0.j f2911c = new m0.j(29, false);

    public static final Object i(C0161L c0161l, String str, String str2, AbstractC0995f abstractC0995f) {
        c0161l.getClass();
        I.d dVar = new I.d(str);
        Context context = c0161l.f2909a;
        if (context != null) {
            Object j2 = AbstractC0162M.a(context).j(new I.h(new C0179m(dVar, str2, null), null), abstractC0995f);
            return j2 == EnumC0985a.f8194a ? j2 : C0239i.f3393a;
        }
        kotlin.jvm.internal.i.i("context");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00cd -> B:11:0x00d0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(C0161L c0161l, List list, AbstractC0991b abstractC0991b) {
        C0190x c0190x;
        int i2;
        Set V2;
        C0161L c0161l2;
        Map map;
        Set set;
        Set set2;
        Iterator it;
        C0161L c0161l3;
        Map map2;
        Object c2;
        c0161l.getClass();
        if (abstractC0991b instanceof C0190x) {
            c0190x = (C0190x) abstractC0991b;
            int i3 = c0190x.f2989k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0190x.f2989k = i3 - Integer.MIN_VALUE;
                Object obj = c0190x.f2987i;
                EnumC0985a enumC0985a = EnumC0985a.f8194a;
                i2 = c0190x.f2989k;
                if (i2 != 0) {
                    R1.l.F(obj);
                    V2 = list != null ? AbstractC0252i.V(list) : null;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    c0190x.f2982d = c0161l;
                    c0190x.f2983e = V2;
                    c0190x.f2984f = linkedHashMap;
                    c0190x.f2989k = 1;
                    Context context = c0161l.f2909a;
                    if (context == null) {
                        kotlin.jvm.internal.i.i("context");
                        throw null;
                    }
                    Object c3 = D1.s.c(new Z0.i(16, ((InterfaceC0033i) AbstractC0162M.a(context).f124b).getData()), c0190x);
                    if (c3 == enumC0985a) {
                        return enumC0985a;
                    }
                    c0161l2 = c0161l;
                    map = linkedHashMap;
                    obj = c3;
                } else if (i2 == 1) {
                    map = c0190x.f2984f;
                    V2 = c0190x.f2983e;
                    c0161l2 = c0190x.f2982d;
                    R1.l.F(obj);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    I.d dVar = c0190x.f2986h;
                    it = c0190x.f2985g;
                    map2 = c0190x.f2984f;
                    set2 = c0190x.f2983e;
                    c0161l3 = c0190x.f2982d;
                    R1.l.F(obj);
                    if (AbstractC0162M.b(dVar.f712a, obj, set2) && (c2 = AbstractC0162M.c(obj, c0161l3.f2911c)) != null) {
                        map2.put(dVar.f712a, c2);
                    }
                    if (it.hasNext()) {
                        dVar = (I.d) it.next();
                        c0190x.f2982d = c0161l3;
                        c0190x.f2983e = set2;
                        c0190x.f2984f = map2;
                        c0190x.f2985g = it;
                        c0190x.f2986h = dVar;
                        c0190x.f2989k = 2;
                        Context context2 = c0161l3.f2909a;
                        if (context2 == null) {
                            kotlin.jvm.internal.i.i("context");
                            throw null;
                        }
                        obj = D1.s.c(new C0183q(((InterfaceC0033i) AbstractC0162M.a(context2).f124b).getData(), dVar, 3), c0190x);
                        if (obj == enumC0985a) {
                            return enumC0985a;
                        }
                        if (AbstractC0162M.b(dVar.f712a, obj, set2)) {
                            map2.put(dVar.f712a, c2);
                        }
                        if (it.hasNext()) {
                            return map2;
                        }
                    }
                }
                set = (Set) obj;
                if (set != null) {
                    return map;
                }
                set2 = V2;
                it = set.iterator();
                c0161l3 = c0161l2;
                map2 = map;
                if (it.hasNext()) {
                }
            }
        }
        c0190x = new C0190x(c0161l, abstractC0991b);
        Object obj2 = c0190x.f2987i;
        EnumC0985a enumC0985a2 = EnumC0985a.f8194a;
        i2 = c0190x.f2989k;
        if (i2 != 0) {
        }
        set = (Set) obj2;
        if (set != null) {
        }
    }

    @Override // f1.InterfaceC0175i
    public final void a(String str, boolean z2, C0176j c0176j) {
        AbstractC0022x.j(new C0153D(str, this, z2, null));
    }

    @Override // f1.InterfaceC0175i
    public final Double b(String str, C0176j c0176j) {
        kotlin.jvm.internal.p pVar = new kotlin.jvm.internal.p();
        AbstractC0022x.j(new C0186t(str, this, pVar, null));
        return (Double) pVar.f8076a;
    }

    @Override // f1.InterfaceC0175i
    public final Long c(String str, C0176j c0176j) {
        kotlin.jvm.internal.p pVar = new kotlin.jvm.internal.p();
        AbstractC0022x.j(new C0188v(str, this, pVar, null));
        return (Long) pVar.f8076a;
    }

    @Override // f1.InterfaceC0175i
    public final ArrayList d(String str, C0176j c0176j) {
        List list;
        String n2 = n(str, c0176j);
        ArrayList arrayList = null;
        if (n2 != null && !z1.o.R(n2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false) && z1.o.R(n2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false) && (list = (List) AbstractC0162M.c(n2, this.f2911c)) != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // f1.InterfaceC0175i
    public final void e(String str, String str2, C0176j c0176j) {
        AbstractC0022x.j(new C0157H(this, str, str2, null));
    }

    @Override // f1.InterfaceC0175i
    public final void f(String str, List list, C0176j c0176j) {
        AbstractC0022x.j(new C0154E(this, str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(this.f2911c.h(list)), null));
    }

    @Override // f1.InterfaceC0175i
    public final void g(String str, double d2, C0176j c0176j) {
        AbstractC0022x.j(new C0156G(str, this, d2, null));
    }

    @Override // f1.InterfaceC0175i
    public final C0166Q h(String str, C0176j c0176j) {
        String n2 = n(str, c0176j);
        if (n2 == null) {
            return null;
        }
        if (z1.o.R(n2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false)) {
            return new C0166Q(n2, EnumC0164O.JSON_ENCODED);
        }
        return z1.o.R(n2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false) ? new C0166Q(null, EnumC0164O.PLATFORM_ENCODED) : new C0166Q(null, EnumC0164O.UNEXPECTED_STRING);
    }

    @Override // f1.InterfaceC0175i
    public final void j(String str, String str2, C0176j c0176j) {
        AbstractC0022x.j(new C0160K(this, str, str2, null));
    }

    @Override // f1.InterfaceC0175i
    public final void k(List list, C0176j c0176j) {
        AbstractC0022x.j(new C0178l(this, list, null));
    }

    @Override // f1.InterfaceC0175i
    public final List l(List list, C0176j c0176j) {
        return AbstractC0252i.R(((Map) AbstractC0022x.j(new C0189w(this, list, null))).keySet());
    }

    @Override // f1.InterfaceC0175i
    public final Map m(List list, C0176j c0176j) {
        return (Map) AbstractC0022x.j(new C0180n(this, list, null));
    }

    @Override // f1.InterfaceC0175i
    public final String n(String str, C0176j c0176j) {
        kotlin.jvm.internal.p pVar = new kotlin.jvm.internal.p();
        AbstractC0022x.j(new C0192z(str, this, pVar, null));
        return (String) pVar.f8076a;
    }

    @Override // W0.b
    public final void onAttachedToEngine(W0.a binding) {
        kotlin.jvm.internal.i.e(binding, "binding");
        InterfaceC0090f interfaceC0090f = binding.f1856b;
        kotlin.jvm.internal.i.d(interfaceC0090f, "getBinaryMessenger(...)");
        Context context = binding.f1855a;
        kotlin.jvm.internal.i.d(context, "getApplicationContext(...)");
        this.f2909a = context;
        try {
            InterfaceC0175i.f2935Q.getClass();
            C0174h.b(interfaceC0090f, this, "data_store");
            this.f2910b = new I0.b(interfaceC0090f, context, this.f2911c);
        } catch (Exception e2) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e2);
        }
        new C0167a().onAttachedToEngine(binding);
    }

    @Override // W0.b
    public final void onDetachedFromEngine(W0.a binding) {
        kotlin.jvm.internal.i.e(binding, "binding");
        InterfaceC0090f interfaceC0090f = binding.f1856b;
        kotlin.jvm.internal.i.d(interfaceC0090f, "getBinaryMessenger(...)");
        InterfaceC0175i.f2935Q.getClass();
        C0174h.b(interfaceC0090f, null, "data_store");
        I0.b bVar = this.f2910b;
        if (bVar != null) {
            C0174h.b((InterfaceC0090f) bVar.f721b, null, "shared_preferences");
        }
        this.f2910b = null;
    }

    @Override // f1.InterfaceC0175i
    public final Boolean p(String str, C0176j c0176j) {
        kotlin.jvm.internal.p pVar = new kotlin.jvm.internal.p();
        AbstractC0022x.j(new C0184r(str, this, pVar, null));
        return (Boolean) pVar.f8076a;
    }

    @Override // f1.InterfaceC0175i
    public final void q(String str, long j2, C0176j c0176j) {
        AbstractC0022x.j(new C0159J(str, this, j2, null));
    }
}
