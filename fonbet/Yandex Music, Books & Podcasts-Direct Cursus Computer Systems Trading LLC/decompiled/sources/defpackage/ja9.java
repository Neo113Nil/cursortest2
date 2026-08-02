package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class ja9 implements u1f {
    public Integer a;

    public final Object a() {
        if (this instanceof ia9) {
            return ((ia9) this).b;
        }
        if (this instanceof ha9) {
            return ((ha9) this).b;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((ka9) rj3.b.F5.getValue()).b(rj3.a, this);
    }
}
