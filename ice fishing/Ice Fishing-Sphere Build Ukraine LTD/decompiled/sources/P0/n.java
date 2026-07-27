package P0;

import L0.C0062u;
import L0.Q;
import L0.a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t0.AbstractC0249d;
import t0.C0252g;

/* loaded from: classes.dex */
public final class n extends x0.b implements O0.e {

    /* renamed from: h, reason: collision with root package name */
    public final O0.e f852h;

    /* renamed from: i, reason: collision with root package name */
    public final v0.i f853i;

    /* renamed from: j, reason: collision with root package name */
    public final int f854j;

    /* renamed from: k, reason: collision with root package name */
    public v0.i f855k;

    /* renamed from: l, reason: collision with root package name */
    public v0.d f856l;

    public n(O0.e eVar, v0.i iVar) {
        super(k.f849e, v0.j.f3014e);
        this.f852h = eVar;
        this.f853i = iVar;
        this.f854j = ((Number) iVar.m(0, m.f851f)).intValue();
    }

    @Override // O0.e
    public final Object b(Object obj, v0.d dVar) {
        try {
            Object p2 = p(dVar, obj);
            return p2 == w0.a.f3076e ? p2 : C0252g.f2994a;
        } catch (Throwable th) {
            this.f855k = new i(th, dVar.j());
            throw th;
        }
    }

    @Override // x0.b, x0.c
    public final x0.c h() {
        v0.d dVar = this.f856l;
        if (dVar instanceof x0.c) {
            return (x0.c) dVar;
        }
        return null;
    }

    @Override // x0.b, v0.d
    public final v0.i j() {
        v0.i iVar = this.f855k;
        return iVar == null ? v0.j.f3014e : iVar;
    }

    @Override // x0.b
    public final StackTraceElement m() {
        return null;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        Throwable a2 = AbstractC0249d.a(obj);
        if (a2 != null) {
            this.f855k = new i(a2, j());
        }
        v0.d dVar = this.f856l;
        if (dVar != null) {
            dVar.c(obj);
        }
        return w0.a.f3076e;
    }

    public final Object p(v0.d dVar, Object obj) {
        List list;
        Comparable comparable;
        String str;
        v0.i j2 = dVar.j();
        Q q2 = (Q) j2.i(C0062u.f682f);
        if (q2 != null && !q2.b()) {
            throw ((a0) q2).A();
        }
        v0.i iVar = this.f855k;
        if (iVar != j2) {
            int i2 = 0;
            if (iVar instanceof i) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((i) iVar).f847e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                E0.i.e(str2, "<this>");
                K0.a aVar = new K0.a(str2);
                if (aVar.hasNext()) {
                    Object next = aVar.next();
                    if (aVar.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(next);
                        while (aVar.hasNext()) {
                            arrayList.add(aVar.next());
                        }
                        list = arrayList;
                    } else {
                        list = o.g.s(next);
                    }
                } else {
                    list = u0.l.f3006e;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (!K0.h.Q((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
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
                        char charAt = str3.charAt(i3);
                        if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
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
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                    String str4 = (String) obj3;
                    if ((i2 == 0 || i2 == size) && K0.h.Q(str4)) {
                        str = null;
                    } else {
                        E0.i.e(str4, "<this>");
                        if (intValue < 0) {
                            throw new IllegalArgumentException(("Requested character count " + intValue + " is less than zero.").toString());
                        }
                        int length3 = str4.length();
                        if (intValue <= length3) {
                            length3 = intValue;
                        }
                        str = str4.substring(length3);
                        E0.i.d(str, "substring(...)");
                    }
                    if (str != null) {
                        arrayList4.add(str);
                    }
                    i2 = i4;
                }
                StringBuilder sb = new StringBuilder(length2);
                u0.d.C(arrayList4, sb, "\n", "", "", -1, "...", null);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (((Number) j2.m(0, new q(this))).intValue() != this.f854j) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f853i + ",\n\t\tbut emission happened in " + j2 + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f855k = j2;
        }
        this.f856l = dVar;
        o oVar = p.f858a;
        O0.e eVar = this.f852h;
        E0.i.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        oVar.getClass();
        Object b2 = eVar.b(obj, this);
        if (!E0.i.a(b2, w0.a.f3076e)) {
            this.f856l = null;
        }
        return b2;
    }
}
