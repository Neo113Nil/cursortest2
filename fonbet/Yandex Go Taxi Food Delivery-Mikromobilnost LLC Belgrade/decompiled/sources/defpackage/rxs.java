package defpackage;

import com.google.protobuf.WireFormat$FieldType;

/* loaded from: classes11.dex */
public final class rxs extends hyo {
    public final Object a;
    public final wt10 b;
    public final qxs c;

    public rxs(wt10 wt10Var, Object obj, wt10 wt10Var2, qxs qxsVar) {
        if (wt10Var == null) {
            ny61.g("Null containingTypeDefaultInstance");
            throw null;
        }
        if (qxsVar.c == WireFormat$FieldType.MESSAGE && wt10Var2 == null) {
            ny61.g("Null messageDefaultInstance");
            throw null;
        }
        this.a = obj;
        this.b = wt10Var2;
        this.c = qxsVar;
    }

    public final WireFormat$FieldType a() {
        return this.c.c;
    }

    public final wt10 b() {
        return this.b;
    }

    public final int c() {
        return this.c.b;
    }

    public final boolean d() {
        return this.c.w;
    }
}
