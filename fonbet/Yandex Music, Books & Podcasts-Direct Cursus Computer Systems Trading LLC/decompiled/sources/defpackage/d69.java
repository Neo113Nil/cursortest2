package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class d69 implements u1f, d7f {
    public final Object a() {
        if (this instanceof b69) {
            return ((b69) this).a;
        }
        if (this instanceof a69) {
            return ((a69) this).a;
        }
        if (this instanceof c69) {
            return ((c69) this).a;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((y59) rj3.b.F4.getValue()).b(rj3.a, this);
    }
}
