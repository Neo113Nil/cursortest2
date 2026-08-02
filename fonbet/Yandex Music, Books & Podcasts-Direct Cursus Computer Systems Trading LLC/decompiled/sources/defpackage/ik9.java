package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class ik9 implements u1f, d7f {
    public final Object a() {
        if (this instanceof fk9) {
            return ((fk9) this).a;
        }
        if (this instanceof gk9) {
            return ((gk9) this).a;
        }
        if (this instanceof hk9) {
            return ((hk9) this).a;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((dk9) rj3.b.r7.getValue()).b(rj3.a, this);
    }
}
