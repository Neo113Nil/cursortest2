package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class oy0 extends z3f {
    public static final ny0 d = new ny0(0);
    public static final ny0 e = new ny0(3);
    public final /* synthetic */ int a = 1;
    public final z3f b;
    public final Object c;

    public oy0(dei deiVar, Type type, Type type2) {
        Set set = avt.a;
        this.b = deiVar.a(type, set, null);
        this.c = deiVar.a(type2, set, null);
    }

    @Override // defpackage.z3f
    public final Object a(l7f l7fVar) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                l7fVar.a();
                while (l7fVar.hasNext()) {
                    arrayList.add(this.b.a(l7fVar));
                }
                l7fVar.z();
                Object newInstance = Array.newInstance((Class<?>) this.c, arrayList.size());
                for (int i = 0; i < arrayList.size(); i++) {
                    Array.set(newInstance, i, arrayList.get(i));
                }
                return newInstance;
            default:
                e8g e8gVar = new e8g();
                l7fVar.b();
                while (l7fVar.hasNext()) {
                    if (l7fVar.hasNext()) {
                        l7fVar.j = l7fVar.L();
                        l7fVar.g = 11;
                    }
                    Object a = this.b.a(l7fVar);
                    Object a2 = ((z3f) this.c).a(l7fVar);
                    Object put = e8gVar.put(a, a2);
                    if (put != null) {
                        StringBuilder sb = new StringBuilder("Map key '");
                        sb.append(a);
                        String path = l7fVar.getPath();
                        sb.append("' has multiple values at path ");
                        sb.append(path);
                        sb.append(": ");
                        sb.append(put);
                        sb.append(" and ");
                        sb.append(a2);
                        throw new wp3(sb.toString());
                    }
                }
                l7fVar.D();
                return e8gVar;
        }
    }

    @Override // defpackage.z3f
    public final void e(n7f n7fVar, Object obj) {
        switch (this.a) {
            case 0:
                n7fVar.b();
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    this.b.e(n7fVar, Array.get(obj, i));
                }
                n7fVar.o(1, 2, ']');
                return;
            default:
                n7fVar.g();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (entry.getKey() == null) {
                        throw new wp3("Map key is null at ".concat(n7fVar.getPath()));
                    }
                    int I = n7fVar.I();
                    if (I != 5 && I != 3) {
                        xq0.q("Nesting problem.");
                        return;
                    } else {
                        n7fVar.f = true;
                        this.b.e(n7fVar, entry.getKey());
                        ((z3f) this.c).e(n7fVar, entry.getValue());
                    }
                }
                n7fVar.f = false;
                n7fVar.o(3, 5, '}');
                return;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return this.b + ".array()";
            default:
                return "JsonAdapter(" + this.b + "=" + ((z3f) this.c) + ")";
        }
    }

    public oy0(Class cls, z3f z3fVar) {
        this.c = cls;
        this.b = z3fVar;
    }
}
