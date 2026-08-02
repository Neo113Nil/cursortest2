package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class co8 implements u1f, d7f {
    public final Object a() {
        if (this instanceof ao8) {
            return ((ao8) this).a;
        }
        if (this instanceof yn8) {
            return ((yn8) this).a;
        }
        if (this instanceof zn8) {
            return ((zn8) this).a;
        }
        if (this instanceof bo8) {
            return ((bo8) this).a;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((wn8) rj3.b.J1.getValue()).b(rj3.a, this);
    }
}
