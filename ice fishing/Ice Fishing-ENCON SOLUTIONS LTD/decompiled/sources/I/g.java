package I;

import A1.C0015p;
import F.C0027c;
import F.m0;
import H.j;
import H.k;
import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.AbstractC0122w;
import androidx.datastore.preferences.protobuf.AbstractC0124y;
import androidx.datastore.preferences.protobuf.C0107g;
import androidx.datastore.preferences.protobuf.C0113m;
import androidx.datastore.preferences.protobuf.InterfaceC0123x;
import i1.AbstractC0252i;
import i1.u;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f714a = new g();

    public final b a(FileInputStream fileInputStream) {
        byte[] bArr;
        try {
            H.f q2 = H.f.q(fileInputStream);
            b bVar = new b(false);
            e[] pairs = (e[]) Arrays.copyOf(new e[0], 0);
            i.e(pairs, "pairs");
            bVar.b();
            if (pairs.length > 0) {
                e eVar = pairs[0];
                throw null;
            }
            Map o2 = q2.o();
            i.d(o2, "preferencesProto.preferencesMap");
            for (Map.Entry entry : o2.entrySet()) {
                String name = (String) entry.getKey();
                k value = (k) entry.getValue();
                i.d(name, "name");
                i.d(value, "value");
                int E2 = value.E();
                switch (E2 == 0 ? -1 : f.f713a[j.b(E2)]) {
                    case -1:
                        throw new C0027c("Value case is null.", null);
                    case 0:
                    default:
                        throw new C0015p();
                    case 1:
                        bVar.d(new d(name), Boolean.valueOf(value.v()));
                        break;
                    case 2:
                        bVar.d(new d(name), Float.valueOf(value.z()));
                        break;
                    case 3:
                        bVar.d(new d(name), Double.valueOf(value.y()));
                        break;
                    case 4:
                        bVar.d(new d(name), Integer.valueOf(value.A()));
                        break;
                    case 5:
                        bVar.d(new d(name), Long.valueOf(value.B()));
                        break;
                    case 6:
                        d dVar = new d(name);
                        String C2 = value.C();
                        i.d(C2, "value.string");
                        bVar.d(dVar, C2);
                        break;
                    case 7:
                        d dVar2 = new d(name);
                        InterfaceC0123x p2 = value.D().p();
                        i.d(p2, "value.stringSet.stringsList");
                        bVar.d(dVar2, AbstractC0252i.V(p2));
                        break;
                    case 8:
                        d dVar3 = new d(name);
                        C0107g w2 = value.w();
                        int size = w2.size();
                        if (size == 0) {
                            bArr = AbstractC0124y.f2463b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            w2.d(size, bArr2);
                            bArr = bArr2;
                        }
                        i.d(bArr, "value.bytes.toByteArray()");
                        bVar.d(dVar3, bArr);
                        break;
                    case 9:
                        throw new C0027c("Value not set.", null);
                }
            }
            return new b(u.N(bVar.a()), true);
        } catch (A e2) {
            throw new C0027c("Unable to parse preferences proto.", e2);
        }
    }

    public final void b(Object obj, m0 m0Var) {
        AbstractC0122w a2;
        Map a3 = ((b) obj).a();
        H.d p2 = H.f.p();
        for (Map.Entry entry : a3.entrySet()) {
            d dVar = (d) entry.getKey();
            Object value = entry.getValue();
            String str = dVar.f712a;
            if (value instanceof Boolean) {
                H.i F2 = k.F();
                boolean booleanValue = ((Boolean) value).booleanValue();
                F2.c();
                k.s((k) F2.f2461b, booleanValue);
                a2 = F2.a();
            } else if (value instanceof Float) {
                H.i F3 = k.F();
                float floatValue = ((Number) value).floatValue();
                F3.c();
                k.t((k) F3.f2461b, floatValue);
                a2 = F3.a();
            } else if (value instanceof Double) {
                H.i F4 = k.F();
                double doubleValue = ((Number) value).doubleValue();
                F4.c();
                k.q((k) F4.f2461b, doubleValue);
                a2 = F4.a();
            } else if (value instanceof Integer) {
                H.i F5 = k.F();
                int intValue = ((Number) value).intValue();
                F5.c();
                k.u((k) F5.f2461b, intValue);
                a2 = F5.a();
            } else if (value instanceof Long) {
                H.i F6 = k.F();
                long longValue = ((Number) value).longValue();
                F6.c();
                k.n((k) F6.f2461b, longValue);
                a2 = F6.a();
            } else if (value instanceof String) {
                H.i F7 = k.F();
                F7.c();
                k.o((k) F7.f2461b, (String) value);
                a2 = F7.a();
            } else if (value instanceof Set) {
                H.i F8 = k.F();
                H.g q2 = H.h.q();
                i.c(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                q2.c();
                H.h.n((H.h) q2.f2461b, (Set) value);
                F8.c();
                k.p((k) F8.f2461b, (H.h) q2.a());
                a2 = F8.a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                H.i F9 = k.F();
                byte[] bArr = (byte[]) value;
                C0107g c0107g = C0107g.f2387c;
                C0107g c2 = C0107g.c(bArr, 0, bArr.length);
                F9.c();
                k.r((k) F9.f2461b, c2);
                a2 = F9.a();
            }
            p2.getClass();
            str.getClass();
            p2.c();
            H.f.n((H.f) p2.f2461b).put(str, (k) a2);
        }
        H.f fVar = (H.f) p2.a();
        int a4 = fVar.a(null);
        Logger logger = C0113m.f2421f;
        if (a4 > 4096) {
            a4 = 4096;
        }
        C0113m c0113m = new C0113m(m0Var, a4);
        fVar.b(c0113m);
        if (c0113m.f2426d > 0) {
            c0113m.k0();
        }
    }
}
