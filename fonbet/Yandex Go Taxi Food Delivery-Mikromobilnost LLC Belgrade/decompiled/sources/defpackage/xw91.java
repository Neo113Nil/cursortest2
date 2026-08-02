package defpackage;

import androidx.datastore.core.CorruptionException;
import com.yandex.div.core.state.PathFormatException;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.deeplinks.f;

/* loaded from: classes.dex */
public final class xw91 implements ka4, mlu, ese, bw90, e3t0, btq0, e1d, nhe, ams {
    public final /* synthetic */ int a;
    public static final xw91 b = new xw91(1);
    public static final xw91 c = new xw91(3);
    public static final xw91 w = new xw91(4);
    public static final x4o x = new x4o();
    public static final zii0 y = new zii0(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
    public static final xw91 z = new xw91(7);
    public static final xw91 A = new xw91(8);
    public static final /* synthetic */ xw91 B = new xw91(9);
    public static final xw91 C = new xw91(10);
    public static final xw91 D = new xw91(11);
    public static final xw91 E = new xw91(12);
    public static final myq0 F = new myq0(null, null, null, null, null);
    public static final xw91 G = new xw91(13);
    public static final /* synthetic */ xw91 H = new xw91(14);

    public xw91(s2n s2nVar) {
        this.a = 15;
    }

    public static String e(String str) {
        return String.format(Locale.US, "class_%s_poi", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static void g(c cVar, LinkedHashMap linkedHashMap) {
        for (Map.Entry entry : cVar.a.entrySet()) {
            String str = (String) entry.getKey();
            b bVar = (b) entry.getValue();
            b bVar2 = (b) linkedHashMap.get(str);
            if ((bVar2 instanceof c) && (bVar instanceof c)) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                g((c) bVar2, linkedHashMap2);
                g((c) bVar, linkedHashMap2);
                linkedHashMap.put(str, new c(linkedHashMap2));
            } else {
                linkedHashMap.put(str, bVar);
            }
        }
    }

    public static com.yandex.div.core.state.b h(String str) {
        List W;
        ArrayList arrayList = new ArrayList();
        W = evu0.W(str, new String[]{"/"}, (r2 & 4) != 0 ? 0 : 2);
        try {
            long parseLong = Long.parseLong((String) W.get(0));
            if (W.size() % 2 != 1) {
                throw new PathFormatException(g8e.o("Must be even number of states in path: ", str), null);
            }
            b6w m = y6i0.m(y6i0.n(1, W.size()), 2);
            int i = m.a;
            int i2 = m.b;
            int i3 = m.c;
            if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
                while (true) {
                    arrayList.add(new Pair(W.get(i), W.get(i + 1)));
                    if (i == i2) {
                        break;
                    }
                    i += i3;
                }
            }
            return new com.yandex.div.core.state.b(parseLong, (List) arrayList, W, true);
        } catch (NumberFormatException e) {
            throw new PathFormatException(g8e.o("Top level id must be number: ", str), e);
        }
    }

    public static b m(Object obj) {
        if (obj instanceof Map) {
            return n((Map) obj);
        }
        if (obj instanceof Collection) {
            Collection collection = (Collection) obj;
            ArrayList arrayList = new ArrayList(tcc.n(collection, 10));
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(m(it.next()));
            }
            return new a(arrayList);
        }
        if (!(obj instanceof Long) && !(obj instanceof Integer) && !(obj instanceof Double) && !(obj instanceof Float)) {
            if (obj instanceof String) {
                return qcx.c((String) obj);
            }
            if (obj instanceof Boolean) {
                return qcx.a((Boolean) obj);
            }
            if (obj instanceof b) {
                return (b) obj;
            }
            ny61.g(qv10.l(obj.getClass(), "Unsupported for wrapping type "));
            return null;
        }
        return qcx.b((Number) obj);
    }

    public static c n(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), m(entry.getValue()));
        }
        return new c(linkedHashMap);
    }

    @Override // defpackage.btq0
    public /* bridge */ /* synthetic */ Object a() {
        return F;
    }

    @Override // defpackage.btq0
    public Object b(FileInputStream fileInputStream, Continuation continuation) {
        try {
            rbx rbxVar = sbx.d;
            String q = cvu0.q(rzo.R(fileInputStream));
            rbxVar.getClass();
            return (myq0) rbxVar.b(myq0.Companion.serializer(), q);
        } catch (Exception e) {
            throw new CorruptionException("Cannot parse session configs", e);
        }
    }

    @Override // defpackage.btq0
    public Object c(Object obj, mx11 mx11Var, Continuation continuation) {
        mx11Var.write(sbx.d.c((myq0) obj, myq0.Companion.serializer()).getBytes(uza.a));
        return zy11.a;
    }

    @Override // defpackage.ams
    public Object d(jje jjeVar, inj injVar) {
        int indexOf;
        switch (this.a) {
            case 25:
                if (injVar.c == 1) {
                    return ihb1.h(injVar.a[0]);
                }
                throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"lower\" requires 1 argument but "));
            case 26:
                if (injVar.c != 1) {
                    throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"print\" requires 1 argument but "));
                }
                Object obj = injVar.a[0];
                t5x t5xVar = jjeVar.a;
                if (t5xVar != null) {
                    t5xVar.a(obj);
                }
                return seu.E;
            case 27:
                if (injVar.c == 1) {
                    return Long.valueOf(nrb1.f(injVar.a[0]));
                }
                throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"int\" requires 1 argument but "));
            case 28:
                if (injVar.c == 1) {
                    return bjb1.f(injVar.a[0]);
                }
                throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"abs\" requires 1 argument but "));
            default:
                if (injVar.c != 2) {
                    throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"index\" requires 2 argument but "));
                }
                Object[] objArr = injVar.a;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                if (obj2 instanceof String) {
                    if (obj3 instanceof String) {
                        indexOf = evu0.H((CharSequence) obj2, (String) obj3, 0, false, 6);
                        return Long.valueOf(indexOf);
                    }
                    throw jason.statham.interpreter.error.a.a("Function \"index\" is not defined for " + rhb1.e(obj2) + Extension.FIX_SPACE + rhb1.e(obj3));
                }
                if (obj2 instanceof List) {
                    indexOf = ((List) obj2).indexOf(obj3);
                    return Long.valueOf(indexOf);
                }
                throw jason.statham.interpreter.error.a.a("Function \"index\" is not defined for " + rhb1.e(obj2) + Extension.FIX_SPACE + rhb1.e(obj3));
        }
    }

    @Override // defpackage.e3t0
    public boolean f(Object obj, Object obj2) {
        return obj == obj2;
    }

    public boolean i(m3k m3kVar, rvo rvoVar) {
        if (!(m3kVar instanceof x2k)) {
            if (m3kVar instanceof y2k) {
                return ((Boolean) ((y2k) m3kVar).c.B.a(rvoVar)).booleanValue();
            }
            if (m3kVar instanceof n2k) {
                return ((Boolean) ((n2k) m3kVar).c.H.a(rvoVar)).booleanValue();
            }
            if (m3kVar instanceof l2k) {
                return ((Boolean) ((l2k) m3kVar).c.E.a(rvoVar)).booleanValue();
            }
            return false;
        }
        List list = ((x2k) m3kVar).c.F;
        if (list == null) {
            return false;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((Boolean) ((cfl) it.next()).e.a(rvoVar)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.nhe
    public long j(long j, long j2) {
        if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) <= Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) {
            long floatToRawIntBits = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            int i = blm0.a;
            return floatToRawIntBits;
        }
        float c2 = iqb1.c(j, j2);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(c2) << 32) | (Float.floatToRawIntBits(c2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        int i2 = blm0.a;
        return floatToRawIntBits2;
    }

    @Override // defpackage.e1d
    public Object k(yuf0 yuf0Var) {
        return new kl40(yuf0Var.g(jgg0.a(jl40.class)));
    }

    public Object l(b bVar) {
        if (bVar instanceof c) {
            return kotlin.collections.b.r(kotlin.sequences.b.o(new h73(1, ((c) bVar).a.entrySet()), new wex()));
        }
        if (bVar instanceof a) {
            a aVar = (a) bVar;
            ArrayList arrayList = new ArrayList(tcc.n(aVar, 10));
            Iterator it = aVar.a.iterator();
            while (it.hasNext()) {
                Object l = A.l((b) it.next());
                if (l == null) {
                    ny61.g("Unexpected null value in json array");
                    return null;
                }
                arrayList.add(l);
            }
            return arrayList;
        }
        if (!(bVar instanceof d)) {
            w511.b();
            return null;
        }
        d dVar = (d) bVar;
        if (dVar.b()) {
            return dVar.a();
        }
        if (dVar instanceof JsonNull) {
            return null;
        }
        Object f = qcx.f(dVar);
        if (f != null || (f = qcx.k(dVar)) != null || (f = qcx.o(dVar)) != null) {
            return f;
        }
        Double i = qcx.i(dVar);
        if (i != null) {
            return i;
        }
        kbs.f(this, "Unsupported json primitive ");
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 11:
                return "ReferentialEqualityPolicy";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ xw91(int i) {
        this.a = i;
    }

    public xw91(zz2 zz2Var, f fVar, ru.yandex.taxi.perf.b bVar) {
        this.a = 16;
    }
}
