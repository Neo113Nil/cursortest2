package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class bc9 implements u1f, d7f {
    public final Object a() {
        if (this instanceof ac9) {
            return ((ac9) this).a;
        }
        if (this instanceof yb9) {
            return ((yb9) this).a;
        }
        if (this instanceof zb9) {
            return ((zb9) this).a;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((wb9) rj3.b.J5.getValue()).b(rj3.a, this);
    }
}
