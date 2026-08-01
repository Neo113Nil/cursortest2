package P1;

import J1.l;
import K1.m;
import K1.n;
import L1.C0016q;
import L1.K;
import L1.T;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends x1.c implements O1.f {

    /* renamed from: d, reason: collision with root package name */
    public final O1.f f920d;
    public final v1.i e;

    /* renamed from: f, reason: collision with root package name */
    public final int f921f;

    /* renamed from: g, reason: collision with root package name */
    public v1.i f922g;

    /* renamed from: h, reason: collision with root package name */
    public v1.d f923h;

    public g(O1.f fVar, v1.i iVar) {
        super(e.f918a, v1.j.f4497a);
        this.f920d = fVar;
        this.e = iVar;
        this.f921f = ((Number) iVar.d(0, f.f919b)).intValue();
    }

    @Override // O1.f
    public final Object a(Object obj, v1.d dVar) {
        try {
            Object m2 = m(dVar, obj);
            return m2 == w1.a.f4662a ? m2 : t1.i.f4388c;
        } catch (Throwable th) {
            this.f922g = new d(th, dVar.h());
            throw th;
        }
    }

    @Override // x1.a, x1.d
    public final x1.d e() {
        v1.d dVar = this.f923h;
        if (dVar instanceof x1.d) {
            return (x1.d) dVar;
        }
        return null;
    }

    @Override // x1.c, v1.d
    public final v1.i h() {
        v1.i iVar = this.f922g;
        return iVar == null ? v1.j.f4497a : iVar;
    }

    @Override // x1.a
    public final StackTraceElement j() {
        return null;
    }

    @Override // x1.a
    public final Object k(Object obj) {
        Throwable a2 = t1.f.a(obj);
        if (a2 != null) {
            this.f922g = new d(a2, h());
        }
        v1.d dVar = this.f923h;
        if (dVar != null) {
            dVar.b(obj);
        }
        return w1.a.f4662a;
    }

    public final Object m(v1.d dVar, Object obj) {
        Comparable comparable;
        String str;
        v1.i h2 = dVar.h();
        K k2 = (K) h2.e(C0016q.f576b);
        if (k2 != null && !k2.a()) {
            throw ((T) k2).n();
        }
        v1.i iVar = this.f922g;
        if (iVar != h2) {
            int i = 0;
            if (iVar instanceof d) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((d) iVar).f916a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                D1.i.e(str2, "<this>");
                K1.d.m0(0);
                List asList = Arrays.asList("\r\n", "\n", "\r");
                D1.i.d(asList, "asList(...)");
                List g02 = J1.h.g0(new l(new K1.b(str2, 0, 0, new m(asList, false)), new n(0, str2), 1));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : g02) {
                    if (!K1.d.k0((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(u1.i.I(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    int length = str3.length();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            i2 = -1;
                            break;
                        }
                        char charAt = str3.charAt(i2);
                        if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 == -1) {
                        i2 = str3.length();
                    }
                    arrayList2.add(Integer.valueOf(i2));
                }
                Iterator it2 = arrayList2.iterator();
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
                g02.size();
                int E2 = u1.h.E(g02);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : g02) {
                    int i3 = i + 1;
                    if (i < 0) {
                        u1.h.H();
                        throw null;
                    }
                    String str4 = (String) obj3;
                    if ((i == 0 || i == E2) && K1.d.k0(str4)) {
                        str = null;
                    } else {
                        D1.i.e(str4, "<this>");
                        if (intValue < 0) {
                            throw new IllegalArgumentException(("Requested character count " + intValue + " is less than zero.").toString());
                        }
                        int length3 = str4.length();
                        if (intValue <= length3) {
                            length3 = intValue;
                        }
                        str = str4.substring(length3);
                        D1.i.d(str, "substring(...)");
                    }
                    if (str != null) {
                        arrayList3.add(str);
                    }
                    i = i3;
                }
                StringBuilder sb = new StringBuilder(length2);
                u1.g.P(arrayList3, sb, "\n", "", "", -1, "...", null);
                String sb2 = sb.toString();
                D1.i.d(sb2, "toString(...)");
                throw new IllegalStateException(sb2.toString());
            }
            if (((Number) h2.d(0, new j(this))).intValue() != this.f921f) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.e + ",\n\t\tbut emission happened in " + h2 + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f922g = h2;
        }
        this.f923h = dVar;
        h hVar = i.f924a;
        O1.f fVar = this.f920d;
        D1.i.c(fVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        hVar.getClass();
        Object a2 = fVar.a(obj, this);
        if (!D1.i.a(a2, w1.a.f4662a)) {
            this.f923h = null;
        }
        return a2;
    }
}
