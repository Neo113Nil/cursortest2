package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes9.dex */
public final class ssp0 extends i9 {
    public final g0c a;
    public final List b;
    public final i3y c;
    public final Map d;
    public final LinkedHashMap e;

    public ssp0(String str, g0c g0cVar, lfx[] lfxVarArr, KSerializer[] kSerializerArr) {
        this.a = g0cVar;
        this.b = EmptyList.a;
        this.c = a.b(LazyThreadSafetyMode.PUBLICATION, new l2z(str, this, 25));
        if (lfxVarArr.length != kSerializerArr.length) {
            vg10.i("All subclasses of sealed class ", g0cVar.d(), " should be marked @Serializable");
            throw null;
        }
        int min = Math.min(lfxVarArr.length, kSerializerArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(new Pair(lfxVarArr[i], kSerializerArr[i]));
        }
        Map s = b.s(arrayList);
        this.d = s;
        Set<Map.Entry> entrySet = s.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : entrySet) {
            String h = ((KSerializer) entry.getValue()).getDescriptor().h();
            Object obj = linkedHashMap.get(h);
            if (obj == null) {
                linkedHashMap.containsKey(h);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                StringBuilder sb = new StringBuilder("Multiple sealed subclasses of '");
                sb.append(this.a);
                sb.append("' have the same serial name '");
                sb.append(h);
                sb.append("': '");
                sb.append(entry2.getKey());
                Object key = entry.getKey();
                sb.append("', '");
                sb.append(key);
                sb.append('\'');
                throw new IllegalStateException(sb.toString().toString());
            }
            linkedHashMap.put(h, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(gw00.d(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (KSerializer) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.e = linkedHashMap2;
    }

    @Override // defpackage.i9
    public final myi a(sjd sjdVar, String str) {
        KSerializer kSerializer = (KSerializer) this.e.get(str);
        return kSerializer != null ? kSerializer : super.a(sjdVar, str);
    }

    @Override // defpackage.i9
    public final KSerializer b(Encoder encoder, Object obj) {
        KSerializer kSerializer = (KSerializer) this.d.get(qoi0.a(obj.getClass()));
        KSerializer b = kSerializer != null ? kSerializer : super.b(encoder, obj);
        if (b != null) {
            return b;
        }
        return null;
    }

    @Override // defpackage.i9
    public final lfx c() {
        return this.a;
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.c.getValue();
    }

    public ssp0(String str, g0c g0cVar, lfx[] lfxVarArr, KSerializer[] kSerializerArr, Annotation[] annotationArr) {
        this(str, g0cVar, lfxVarArr, kSerializerArr);
        this.b = Arrays.asList(annotationArr);
    }
}
