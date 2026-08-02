package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* loaded from: classes5.dex */
public final class ajn implements t9f {
    public static final ajn a = new ajn();
    public static final ohp b;

    static {
        String simpleName = bjn.class.getSimpleName();
        mhp[] mhpVarArr = new mhp[0];
        if (StringsKt.U(simpleName)) {
            xq0.x("Blank serial names are prohibited");
            return;
        }
        mm4 mm4Var = new mm4(simpleName);
        ff7.N(ekr.a);
        gsm gsmVar = tkr.b;
        mhp descriptor = w4f.Companion.serializer().getDescriptor();
        gsmVar.getClass();
        descriptor.getClass();
        b = new ohp(simpleName, emr.b, mm4Var.c.size(), xz0.X(mhpVarArr), mm4Var);
    }

    public static w4f a(Object obj) {
        if (obj == null) {
            return m5f.INSTANCE;
        }
        if (obj instanceof String) {
            return x4f.c((String) obj);
        }
        if (obj instanceof Number) {
            return x4f.b((Number) obj);
        }
        if (obj instanceof Boolean) {
            return x4f.a((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new zhp("Cannot serialize value of type " + ern.a(obj.getClass()));
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next()));
            }
            return new c4f(arrayList);
        }
        Set<Map.Entry> entrySet = ((Map) obj).entrySet();
        int a2 = tah.a(v75.o(entrySet, 10));
        if (a2 < 16) {
            a2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a2);
        for (Map.Entry entry : entrySet) {
            linkedHashMap.put(String.valueOf(entry.getKey()), a(entry.getValue()));
        }
        return new q5f(linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Serializable b(w4f w4fVar) {
        if (w4fVar instanceof v6f) {
            v6f v6fVar = (v6f) w4fVar;
            ome omeVar = x4f.a;
            Serializable b2 = pkr.b(v6fVar.a());
            return (b2 == null && (b2 = x4f.e(v6fVar)) == null && (b2 = x4f.h(v6fVar)) == null && (b2 = b.h(v6fVar.a())) == null) ? v6fVar.a() : b2;
        }
        if (w4fVar instanceof q5f) {
            return c(w4fVar);
        }
        if (!(w4fVar instanceof c4f)) {
            b6e.s();
            return null;
        }
        Iterable iterable = (Iterable) w4fVar;
        ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(b((w4f) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static HashMap c(w4f w4fVar) {
        HashMap hashMap = new HashMap();
        if (w4fVar instanceof q5f) {
            for (Map.Entry entry : ((Map) w4fVar).entrySet()) {
                hashMap.put((String) entry.getKey(), b((w4f) entry.getValue()));
            }
        }
        return hashMap;
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        s4f s4fVar = eg7Var instanceof s4f ? (s4f) eg7Var : null;
        if (s4fVar != null) {
            return new bjn(c(s4fVar.f()));
        }
        xq0.q("This serializer works only with JSON");
        return null;
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        bjn bjnVar = (bjn) obj;
        b5f b5fVar = l6bVar instanceof b5f ? (b5f) l6bVar : null;
        if (b5fVar == null) {
            throw new zhp("This class can be saved only by Json");
        }
        b5fVar.D(a(bjnVar));
    }
}
