package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class cp8 implements u1f, d7f {
    public final Object a() {
        if (this instanceof yo8) {
            return ((yo8) this).a;
        }
        if (this instanceof ap8) {
            return ((ap8) this).a;
        }
        if (this instanceof xo8) {
            return ((xo8) this).a;
        }
        if (this instanceof bp8) {
            return ((bp8) this).a;
        }
        if (this instanceof zo8) {
            return ((zo8) this).a;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((oo8) rj3.b.P1.getValue()).b(rj3.a, this);
    }
}
