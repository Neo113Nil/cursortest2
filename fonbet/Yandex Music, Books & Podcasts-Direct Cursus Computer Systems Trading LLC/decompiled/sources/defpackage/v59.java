package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class v59 implements u1f {
    public Integer a;

    public final w59 a() {
        if (this instanceof t59) {
            return ((t59) this).b;
        }
        if (this instanceof s59) {
            return ((s59) this).b;
        }
        if (this instanceof u59) {
            return ((u59) this).b;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((x59) rj3.b.E4.getValue()).b(rj3.a, this);
    }
}
