package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class mh8 implements u1f, d7f {
    public final Object a() {
        if (this instanceof kh8) {
            return ((kh8) this).a;
        }
        if (this instanceof ih8) {
            return ((ih8) this).a;
        }
        if (this instanceof lh8) {
            return ((lh8) this).a;
        }
        if (this instanceof hh8) {
            return ((hh8) this).a;
        }
        if (this instanceof jh8) {
            return ((jh8) this).a;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((fh8) rj3.b.B0.getValue()).b(rj3.a, this);
    }
}
