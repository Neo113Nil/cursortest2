package E1;

import A1.C0019u;
import A1.S;
import A1.b0;
import a.AbstractC0083a;
import h1.AbstractC0236f;
import h1.C0239i;
import i1.AbstractC0252i;
import i1.AbstractC0253j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m1.EnumC0985a;
import n1.AbstractC0991b;
import n1.InterfaceC0992c;

/* loaded from: classes.dex */
public final class n extends AbstractC0991b implements D1.e {

    /* renamed from: d, reason: collision with root package name */
    public final D1.e f333d;

    /* renamed from: e, reason: collision with root package name */
    public final l1.i f334e;

    /* renamed from: f, reason: collision with root package name */
    public final int f335f;

    /* renamed from: g, reason: collision with root package name */
    public l1.i f336g;

    /* renamed from: h, reason: collision with root package name */
    public l1.d f337h;

    public n(D1.e eVar, l1.i iVar) {
        super(k.f330a, l1.j.f8138a);
        this.f333d = eVar;
        this.f334e = iVar;
        this.f335f = ((Number) iVar.k(0, m.f332e)).intValue();
    }

    @Override // D1.e
    public final Object a(Object obj, l1.d dVar) {
        try {
            Object j2 = j(dVar, obj);
            return j2 == EnumC0985a.f8194a ? j2 : C0239i.f3393a;
        } catch (Throwable th) {
            this.f336g = new i(th, dVar.getContext());
            throw th;
        }
    }

    @Override // n1.AbstractC0991b
    public final StackTraceElement c() {
        return null;
    }

    @Override // n1.AbstractC0991b, n1.InterfaceC0992c
    public final InterfaceC0992c f() {
        l1.d dVar = this.f337h;
        if (dVar instanceof InterfaceC0992c) {
            return (InterfaceC0992c) dVar;
        }
        return null;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        Throwable a2 = AbstractC0236f.a(obj);
        if (a2 != null) {
            this.f336g = new i(a2, getContext());
        }
        l1.d dVar = this.f337h;
        if (dVar != null) {
            dVar.i(obj);
        }
        return EnumC0985a.f8194a;
    }

    @Override // n1.AbstractC0991b, l1.d
    public final l1.i getContext() {
        l1.i iVar = this.f336g;
        return iVar == null ? l1.j.f8138a : iVar;
    }

    public final Object j(l1.d dVar, Object obj) {
        List list;
        Comparable comparable;
        String str;
        l1.i context = dVar.getContext();
        S s2 = (S) context.m(C0019u.f73b);
        if (s2 != null && !s2.b()) {
            throw ((b0) s2).z();
        }
        l1.i iVar = this.f336g;
        if (iVar != context) {
            int i2 = 0;
            if (iVar instanceof i) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((i) iVar).f328a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                kotlin.jvm.internal.i.e(str2, "<this>");
                z1.d dVar2 = new z1.d(str2);
                if (dVar2.hasNext()) {
                    Object next = dVar2.next();
                    if (dVar2.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(next);
                        while (dVar2.hasNext()) {
                            arrayList.add(dVar2.next());
                        }
                        list = arrayList;
                    } else {
                        list = AbstractC0083a.m(next);
                    }
                } else {
                    list = i1.r.f3416a;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (!z1.g.a0((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(i1.k.E(arrayList2));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    int length = str3.length();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            i3 = -1;
                            break;
                        }
                        if (!R1.d.x(str3.charAt(i3))) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 == -1) {
                        i3 = str3.length();
                    }
                    arrayList3.add(Integer.valueOf(i3));
                }
                Iterator it2 = arrayList3.iterator();
                if (it2.hasNext()) {
                    comparable = (Comparable) it2.next();
                    while (it2.hasNext()) {
                        Comparable comparable2 = (Comparable) it2.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                } else {
                    comparable = null;
                }
                Integer num = (Integer) comparable;
                int intValue = num != null ? num.intValue() : 0;
                int length2 = str2.length();
                list.size();
                int size = list.size() - 1;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list) {
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        AbstractC0253j.D();
                        throw null;
                    }
                    String str4 = (String) obj3;
                    if ((i2 == 0 || i2 == size) && z1.g.a0(str4)) {
                        str = null;
                    } else {
                        kotlin.jvm.internal.i.e(str4, "<this>");
                        if (intValue < 0) {
                            throw new IllegalArgumentException(C1.a.g(intValue, "Requested character count ", " is less than zero.").toString());
                        }
                        int length3 = str4.length();
                        if (intValue <= length3) {
                            length3 = intValue;
                        }
                        str = str4.substring(length3);
                        kotlin.jvm.internal.i.d(str, "substring(...)");
                    }
                    if (str != null) {
                        arrayList4.add(str);
                    }
                    i2 = i4;
                }
                StringBuilder sb = new StringBuilder(length2);
                AbstractC0252i.I(arrayList4, sb, "\n", "", "", -1, "...", null);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (((Number) context.k(0, new q(this))).intValue() != this.f335f) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f334e + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f336g = context;
        }
        this.f337h = dVar;
        o oVar = p.f339a;
        D1.e eVar = this.f333d;
        kotlin.jvm.internal.i.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        oVar.getClass();
        Object a2 = eVar.a(obj, this);
        if (!kotlin.jvm.internal.i.a(a2, EnumC0985a.f8194a)) {
            this.f337h = null;
        }
        return a2;
    }
}
