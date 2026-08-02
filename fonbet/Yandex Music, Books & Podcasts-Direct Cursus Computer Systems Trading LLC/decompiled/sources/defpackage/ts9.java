package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class ts9 implements u1f {
    public Integer a;

    public final Object a() {
        if (this instanceof rs9) {
            return ((rs9) this).b;
        }
        if (this instanceof ss9) {
            return ((ss9) this).b;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((zs9) rj3.b.J8.getValue()).b(rj3.a, this);
    }
}
