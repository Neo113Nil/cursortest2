package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class cs9 implements u1f {
    public Integer a;

    public final Object a() {
        if (this instanceof bs9) {
            return ((bs9) this).b;
        }
        if (this instanceof as9) {
            return ((as9) this).b;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((ds9) rj3.b.v8.getValue()).b(rj3.a, this);
    }
}
