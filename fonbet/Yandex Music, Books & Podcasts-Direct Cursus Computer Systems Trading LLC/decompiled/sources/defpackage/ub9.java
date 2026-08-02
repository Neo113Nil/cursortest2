package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class ub9 implements u1f {
    public Integer a;

    public final Object a() {
        if (this instanceof tb9) {
            return ((tb9) this).b;
        }
        if (this instanceof rb9) {
            return ((rb9) this).b;
        }
        if (this instanceof sb9) {
            return ((sb9) this).b;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((vb9) rj3.b.I5.getValue()).b(rj3.a, this);
    }
}
