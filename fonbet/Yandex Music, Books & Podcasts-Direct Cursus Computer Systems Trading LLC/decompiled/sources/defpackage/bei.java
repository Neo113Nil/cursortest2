package defpackage;

import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public final class bei extends z3f {
    public final Type a;
    public final String b;
    public final Object c;
    public z3f d;

    public bei(Type type, String str, Object obj) {
        this.a = type;
        this.b = str;
        this.c = obj;
    }

    @Override // defpackage.z3f
    public final Object a(l7f l7fVar) {
        z3f z3fVar = this.d;
        if (z3fVar != null) {
            return z3fVar.a(l7fVar);
        }
        xq0.q("JsonAdapter isn't ready");
        return null;
    }

    @Override // defpackage.z3f
    public final void e(n7f n7fVar, Object obj) {
        z3f z3fVar = this.d;
        if (z3fVar != null) {
            z3fVar.e(n7fVar, obj);
        } else {
            xq0.q("JsonAdapter isn't ready");
        }
    }

    public final String toString() {
        z3f z3fVar = this.d;
        return z3fVar != null ? z3fVar.toString() : super.toString();
    }
}
