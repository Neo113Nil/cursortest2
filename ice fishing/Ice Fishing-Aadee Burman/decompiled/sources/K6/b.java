package K6;

import D.y;
import H6.j;
import N6.k;
import P6.d;
import P6.e;
import P6.h;
import P6.i;
import P6.l;
import P6.m;
import c7.InterfaceC0545a;
import d7.InterfaceC4454a;
import f6.g;
import g6.InterfaceC4532b;
import h6.C4574a;
import i8.v;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import k6.C4636a;
import k6.f;
import m7.C4741a;
import n6.C4763e;
import n6.InterfaceC4766h;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1578a;

    public /* synthetic */ b(int i) {
        this.f1578a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        m[] d2;
        switch (this.f1578a) {
            case 0:
                return ((Integer) obj).toString();
            case 1:
                throw y.i(obj);
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
                return new P6.f(((Double) obj).doubleValue());
            case 10:
                return i.c((g) obj);
            case 11:
                return ((InterfaceC0545a) obj).k();
            case 12:
                return ((InterfaceC0545a) obj).l();
            case 13:
                InterfaceC0545a interfaceC0545a = (InterfaceC0545a) obj;
                boolean z3 = interfaceC0545a instanceof InterfaceC4454a;
                if (z3) {
                    InterfaceC4532b d9 = i.d(interfaceC0545a);
                    if (d9.isEmpty()) {
                        d2 = i.f2586b;
                    } else {
                        m[] mVarArr = new m[d9.size()];
                        d9.forEach(new h(mVarArr, 0));
                        d2 = mVarArr;
                    }
                } else {
                    d2 = m.d(interfaceC0545a.a());
                }
                m[] mVarArr2 = d2;
                int size = z3 ? i.d(interfaceC0545a).size() : interfaceC0545a.a().size();
                N6.l c9 = interfaceC0545a.c() == null ? null : i.c(interfaceC0545a.c());
                InterfaceC4766h h9 = interfaceC0545a.h();
                long j6 = interfaceC0545a.j();
                long d10 = interfaceC0545a.d();
                N6.a d11 = Q6.b.d(interfaceC0545a.b());
                byte[] f3 = k.f(interfaceC0545a.i());
                int e9 = interfaceC0545a.e() - size;
                C4636a c4636a = (C4636a) h9;
                C4763e c4763e = c4636a.f38677c;
                String str = c4636a.f38675a;
                if (str.equals("00000000000000000000000000000000")) {
                    str = null;
                }
                String str2 = c4636a.f38676b;
                return new Q6.b(j6, d10, d11, f3, c9, mVarArr2, e9, c4763e, str, str2.equals("0000000000000000") ? null : str2, k.f(interfaceC0545a.f()));
            case 14:
                return Boolean.valueOf(c.f1579a.contains(Integer.valueOf(((v) obj).f38255w)));
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
                return ((k6.e) obj).f38686b;
            case 19:
                Map.Entry entry2 = (Map.Entry) obj;
                return new f6.d((String) entry2.getKey(), (g) entry2.getValue());
            case 20:
                f6.d dVar = (f6.d) obj;
                return dVar.f37523a + "=" + dVar.f37524b.a();
            case 21:
                return ((g) obj).a();
            case 22:
                return ((C4574a) obj).f38020b;
            case 23:
                return new n7.d();
            case 24:
                ((C4741a) obj).getClass();
                return null;
            case 25:
                return ((Map.Entry) obj).getValue().toString();
            case 26:
                return (String) ((Map.Entry) obj).getValue();
            case 27:
                return ((n7.e) obj).f39511b;
            case 28:
                return ((n7.e) obj).f39512c.stream();
            default:
                return ((j) obj).f1247v;
        }
    }
}
