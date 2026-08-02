package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class dh8 implements u1f {
    public Integer a;

    public final Object a() {
        if (this instanceof bh8) {
            return ((bh8) this).b;
        }
        if (this instanceof zg8) {
            return ((zg8) this).b;
        }
        if (this instanceof ch8) {
            return ((ch8) this).b;
        }
        if (this instanceof yg8) {
            return ((yg8) this).b;
        }
        if (this instanceof ah8) {
            return ((ah8) this).b;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((eh8) rj3.b.A0.getValue()).b(rj3.a, this);
    }
}
