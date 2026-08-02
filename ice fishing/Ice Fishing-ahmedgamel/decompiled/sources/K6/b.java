package K6;

import D.x;
import H6.j;
import N6.k;
import P6.d;
import P6.e;
import P6.h;
import P6.i;
import P6.l;
import P6.m;
import c7.InterfaceC0556a;
import d7.InterfaceC4465a;
import f6.g;
import g6.InterfaceC4536b;
import h6.C4579a;
import i8.v;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import k6.C4647a;
import k6.f;
import m7.C4755a;
import n6.C4779e;
import n6.InterfaceC4782h;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1687a;

    public /* synthetic */ b(int i) {
        this.f1687a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        m[] d9;
        switch (this.f1687a) {
            case 0:
                return ((Integer) obj).toString();
            case 1:
                throw x.h(obj);
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
                return ((InterfaceC0556a) obj).k();
            case 12:
                return ((InterfaceC0556a) obj).l();
            case 13:
                InterfaceC0556a interfaceC0556a = (InterfaceC0556a) obj;
                boolean z6 = interfaceC0556a instanceof InterfaceC4465a;
                if (z6) {
                    InterfaceC4536b d10 = i.d(interfaceC0556a);
                    if (d10.isEmpty()) {
                        d9 = i.f2421b;
                    } else {
                        m[] mVarArr = new m[d10.size()];
                        d10.forEach(new h(mVarArr, 0));
                        d9 = mVarArr;
                    }
                } else {
                    d9 = m.d(interfaceC0556a.a());
                }
                m[] mVarArr2 = d9;
                int size = z6 ? i.d(interfaceC0556a).size() : interfaceC0556a.a().size();
                N6.l c9 = interfaceC0556a.c() == null ? null : i.c(interfaceC0556a.c());
                InterfaceC4782h h3 = interfaceC0556a.h();
                long j6 = interfaceC0556a.j();
                long d11 = interfaceC0556a.d();
                N6.a d12 = Q6.b.d(interfaceC0556a.b());
                byte[] f2 = k.f(interfaceC0556a.i());
                int e9 = interfaceC0556a.e() - size;
                C4647a c4647a = (C4647a) h3;
                C4779e c4779e = c4647a.f38604c;
                String str = c4647a.f38602a;
                if (str.equals("00000000000000000000000000000000")) {
                    str = null;
                }
                String str2 = c4647a.f38603b;
                return new Q6.b(j6, d11, d12, f2, c9, mVarArr2, e9, c4779e, str, str2.equals("0000000000000000") ? null : str2, k.f(interfaceC0556a.f()));
            case 14:
                return Boolean.valueOf(c.f1688a.contains(Integer.valueOf(((v) obj).f38374w)));
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
                return ((k6.e) obj).f38613b;
            case 19:
                Map.Entry entry2 = (Map.Entry) obj;
                return new f6.d((String) entry2.getKey(), (g) entry2.getValue());
            case 20:
                f6.d dVar = (f6.d) obj;
                return dVar.f37485a + "=" + dVar.f37486b.a();
            case 21:
                return ((g) obj).a();
            case 22:
                return ((C4579a) obj).f38137b;
            case 23:
                return new n7.d();
            case 24:
                ((C4755a) obj).getClass();
                return null;
            case 25:
                return ((Map.Entry) obj).getValue().toString();
            case 26:
                return (String) ((Map.Entry) obj).getValue();
            case 27:
                return ((n7.e) obj).f39678b;
            case 28:
                return ((n7.e) obj).f39679c.stream();
            default:
                return ((j) obj).f1272v;
        }
    }
}
