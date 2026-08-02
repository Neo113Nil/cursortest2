package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class fx6 implements nob {
    public static final qee c = new qee(19);
    public static final fx6 d;
    public final r0o a;
    public final Map b;

    static {
        Object obj = null;
        d = new fx6(new LinkedHashMap(), new r0o(obj, obj, false, 1));
        new LinkedHashMap();
    }

    public fx6(LinkedHashMap linkedHashMap, r0o r0oVar) {
        this.a = r0oVar;
        this.b = linkedHashMap;
    }

    @Override // defpackage.pob
    public final pob a(oob oobVar) {
        oobVar.getClass();
        return c.equals(oobVar) ? x4b.a : this;
    }

    @Override // defpackage.pob
    public final pob b(pob pobVar) {
        pobVar.getClass();
        return pobVar == x4b.a ? this : (pob) pobVar.c(this);
    }

    @Override // defpackage.pob
    public final Object c(Object obj) {
        pob pobVar = (pob) obj;
        pobVar.getClass();
        pob a = pobVar.a(c);
        return a == x4b.a ? this : new jb5(a, this);
    }

    @Override // defpackage.pob
    public final nob d(oob oobVar) {
        oobVar.getClass();
        if (c.equals(oobVar)) {
            return this;
        }
        return null;
    }

    public final pj e(op opVar) {
        pj pjVar;
        opVar.getClass();
        String str = opVar.a;
        String str2 = opVar.b;
        Map map = this.b;
        if (map.get(str) != null) {
            pjVar = (pj) map.get(str);
        } else if (str2.equals("com.apollographql.apollo3.api.Upload")) {
            pjVar = uj.h;
        } else if (u75.h("kotlin.String", "java.lang.String").contains(str2)) {
            pjVar = uj.a;
        } else if (u75.h("kotlin.Boolean", "java.lang.Boolean").contains(str2)) {
            pjVar = uj.f;
        } else if (u75.h("kotlin.Int", "java.lang.Int").contains(str2)) {
            pjVar = uj.b;
        } else if (u75.h("kotlin.Double", "java.lang.Double").contains(str2)) {
            pjVar = uj.c;
        } else if (u75.h("kotlin.Long", "java.lang.Long").contains(str2)) {
            pjVar = uj.e;
        } else if (u75.h("kotlin.Float", "java.lang.Float").contains(str2)) {
            pjVar = uj.d;
        } else {
            if (!u75.h("kotlin.Any", "java.lang.Object").contains(str2)) {
                throw new IllegalStateException(("Can't map GraphQL type: `" + str + "` to: `" + str2 + "`. Did you forget to add a CustomScalarAdapter?").toString());
            }
            pjVar = uj.g;
        }
        pjVar.getClass();
        return pjVar;
    }

    @Override // defpackage.nob
    public final oob getKey() {
        return c;
    }
}
