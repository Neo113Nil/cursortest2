package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* loaded from: classes5.dex */
public final class tyo extends p8 {
    public final lm4 a;
    public final List b;
    public final Object c;
    public final Map d;
    public final LinkedHashMap e;

    public tyo(String str, lm4 lm4Var, f9f[] f9fVarArr, t9f[] t9fVarArr, Annotation[] annotationArr) {
        this.a = lm4Var;
        this.b = c5b.a;
        this.c = btf.a(bwf.b, new rln(7, str, this));
        if (f9fVarArr.length != t9fVarArr.length) {
            b6e.v(lm4Var.h(), " should be marked @Serializable", "All subclasses of sealed class ");
            throw null;
        }
        int min = Math.min(f9fVarArr.length, t9fVarArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(new Pair(f9fVarArr[i], t9fVarArr[i]));
        }
        Map n = uah.n(arrayList);
        this.d = n;
        Set<Map.Entry> entrySet = n.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : entrySet) {
            String i2 = ((t9f) entry.getValue()).getDescriptor().i();
            Object obj = linkedHashMap.get(i2);
            if (obj == null) {
                linkedHashMap.containsKey(i2);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                StringBuilder sb = new StringBuilder("Multiple sealed subclasses of '");
                sb.append(this.a);
                sb.append("' have the same serial name '");
                sb.append(i2);
                sb.append("': '");
                sb.append(entry2.getKey());
                Object key = entry.getKey();
                sb.append("', '");
                sb.append(key);
                sb.append('\'');
                throw new IllegalStateException(sb.toString().toString());
            }
            linkedHashMap.put(i2, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(tah.a(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (t9f) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.e = linkedHashMap2;
        List asList = Arrays.asList(annotationArr);
        asList.getClass();
        this.b = asList;
    }

    @Override // defpackage.p8
    public final t9f a(tq5 tq5Var, String str) {
        t9f t9fVar = (t9f) this.e.get(str);
        return t9fVar != null ? t9fVar : super.a(tq5Var, str);
    }

    @Override // defpackage.p8
    public final t9f b(l6b l6bVar, Object obj) {
        l6bVar.getClass();
        obj.getClass();
        t9f t9fVar = (t9f) this.d.get(ern.a(obj.getClass()));
        t9f b = t9fVar != null ? t9fVar : super.b(l6bVar, obj);
        if (b != null) {
            return b;
        }
        return null;
    }

    @Override // defpackage.p8
    public final f9f c() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return (mhp) this.c.getValue();
    }
}
