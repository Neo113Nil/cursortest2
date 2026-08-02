package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* loaded from: classes9.dex */
public final class r9i0 implements KSerializer {
    public static final r9i0 a = new r9i0();
    public static final asq0 b;

    static {
        String simpleName = s9i0.class.getSimpleName();
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
        if (evu0.J(simpleName)) {
            ny61.g("Blank serial names are prohibited");
            return;
        }
        h0c h0cVar = new h0c(simpleName);
        auu0 auu0Var = auu0.a;
        b.Companion.serializer().getDescriptor();
        b = new asq0(simpleName, ovu0.g, h0cVar.c.size(), j73.d0(serialDescriptorArr), h0cVar);
    }

    public static b a(Object obj) {
        if (obj == null) {
            return JsonNull.INSTANCE;
        }
        if (obj instanceof String) {
            return qcx.c((String) obj);
        }
        if (obj instanceof Number) {
            return qcx.b((Number) obj);
        }
        if (obj instanceof Boolean) {
            return qcx.a((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new SerializationException("Cannot serialize value of type " + qoi0.a(obj.getClass()));
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(tcc.n(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next()));
            }
            return new a(arrayList);
        }
        Set<Map.Entry> entrySet = ((Map) obj).entrySet();
        int d = gw00.d(tcc.n(entrySet, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Map.Entry entry : entrySet) {
            Pair pair = new Pair(String.valueOf(entry.getKey()), a(entry.getValue()));
            linkedHashMap.put(pair.c(), pair.f());
        }
        return new c(linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Serializable b(b bVar) {
        if (bVar instanceof d) {
            d dVar = (d) bVar;
            Serializable f = qcx.f(dVar);
            return (f == null && (f = qcx.k(dVar)) == null && (f = qcx.o(dVar)) == null && (f = qcx.i(dVar)) == null) ? dVar.a() : f;
        }
        if (bVar instanceof c) {
            return c(bVar);
        }
        if (!(bVar instanceof a)) {
            w511.b();
            return null;
        }
        Iterable iterable = (Iterable) bVar;
        ArrayList arrayList = new ArrayList(tcc.n(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(b((b) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static HashMap c(b bVar) {
        HashMap hashMap = new HashMap();
        if (bVar instanceof c) {
            for (Map.Entry entry : ((Map) bVar).entrySet()) {
                hashMap.put((String) entry.getKey(), b((b) entry.getValue()));
            }
        }
        return hashMap;
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        ncx ncxVar = decoder instanceof ncx ? (ncx) decoder : null;
        if (ncxVar != null) {
            return new s9i0(c(ncxVar.t()));
        }
        ny61.r("This serializer works only with JSON");
        return null;
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        s9i0 s9i0Var = (s9i0) obj;
        vcx vcxVar = encoder instanceof vcx ? (vcx) encoder : null;
        if (vcxVar != null) {
            vcxVar.p(a(s9i0Var));
        } else {
            yci0.m("This class can be saved only by Json");
        }
    }
}
