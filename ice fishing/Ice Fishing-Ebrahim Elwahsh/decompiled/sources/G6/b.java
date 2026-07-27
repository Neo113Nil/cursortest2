package G6;

import D.y;
import D6.j;
import J6.k;
import L6.d;
import L6.e;
import L6.h;
import L6.i;
import L6.l;
import L6.m;
import b6.g;
import c6.InterfaceC0543b;
import d6.C4460a;
import e8.w;
import g6.C4531a;
import g6.f;
import i7.C4585a;
import j6.C4603e;
import j6.InterfaceC4606h;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1203a;

    public /* synthetic */ b(int i) {
        this.f1203a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        m[] d2;
        switch (this.f1203a) {
            case 0:
                return ((Integer) obj).toString();
            case 1:
                throw y.g(obj);
            case 2:
                return new IdentityHashMap(8);
            case 3:
                return new ArrayList();
            case 4:
                byte[] bArr = new byte[16];
                f.a((String) obj, 32, bArr);
                return bArr;
            case 5:
                byte[] bArr2 = new byte[8];
                f.a((String) obj, 16, bArr2);
                return bArr2;
            case 6:
                return new e(k.f((String) obj), 1);
            case 7:
                return new d(((Boolean) obj).booleanValue());
            case 8:
                return new l(((Long) obj).longValue());
            case 9:
                return new L6.f(((Double) obj).doubleValue());
            case 10:
                return i.b((g) obj);
            case 11:
                return ((Y6.a) obj).k();
            case 12:
                return ((Y6.a) obj).l();
            case 13:
                Y6.a aVar = (Y6.a) obj;
                boolean z8 = aVar instanceof Z6.a;
                if (z8) {
                    InterfaceC0543b c4 = i.c(aVar);
                    if (c4.isEmpty()) {
                        d2 = i.f1774b;
                    } else {
                        m[] mVarArr = new m[c4.size()];
                        c4.forEach(new h(mVarArr, 0));
                        d2 = mVarArr;
                    }
                } else {
                    d2 = m.d(aVar.a());
                }
                m[] mVarArr2 = d2;
                int size = z8 ? i.c(aVar).size() : aVar.a().size();
                J6.l b9 = aVar.c() == null ? null : i.b(aVar.c());
                InterfaceC4606h h9 = aVar.h();
                long j9 = aVar.j();
                long d3 = aVar.d();
                J6.a d9 = M6.b.d(aVar.b());
                byte[] f6 = k.f(aVar.i());
                int e6 = aVar.e() - size;
                C4531a c4531a = (C4531a) h9;
                C4603e c4603e = c4531a.f37923c;
                String str = c4531a.f37921a;
                if (str.equals("00000000000000000000000000000000")) {
                    str = null;
                }
                String str2 = c4531a.f37922b;
                return new M6.b(j9, d3, d9, f6, b9, mVarArr2, e6, c4603e, str, str2.equals("0000000000000000") ? null : str2, k.f(aVar.f()));
            case 14:
                return Boolean.valueOf(c.f1204a.contains(Integer.valueOf(((w) obj).f37533w)));
            case 15:
                Map.Entry entry = (Map.Entry) obj;
                StringBuilder sb = new StringBuilder();
                sb.append((String) entry.getKey());
                sb.append("=");
                Iterable iterable = (Iterable) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                Iterator it = iterable.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb2.append((CharSequence) it.next());
                        if (it.hasNext()) {
                            sb2.append((CharSequence) ",");
                        }
                    }
                }
                sb.append(sb2.toString());
                return sb.toString();
            case 16:
                return new AtomicInteger(0);
            case 17:
                if (obj == null) {
                    return "null";
                }
                throw new ClassCastException();
            case 18:
                return ((g6.e) obj).f37932b;
            case 19:
                Map.Entry entry2 = (Map.Entry) obj;
                return new b6.d((String) entry2.getKey(), (g) entry2.getValue());
            case 20:
                b6.d dVar = (b6.d) obj;
                return dVar.f5567a + "=" + dVar.f5568b.a();
            case 21:
                return ((g) obj).a();
            case 22:
                return ((C4460a) obj).f37203b;
            case 23:
                return new j7.d();
            case 24:
                ((C4585a) obj).getClass();
                return null;
            case 25:
                return ((Map.Entry) obj).getValue().toString();
            case 26:
                return (String) ((Map.Entry) obj).getValue();
            case 27:
                return ((j7.e) obj).f38588b;
            case 28:
                return ((j7.e) obj).f38589c.stream();
            default:
                return ((j) obj).f726v;
        }
    }
}
