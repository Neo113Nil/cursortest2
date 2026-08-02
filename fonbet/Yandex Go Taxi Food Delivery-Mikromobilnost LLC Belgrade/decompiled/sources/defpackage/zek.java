package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class zek implements c4x, hex {
    public final Object a() {
        if (this instanceof xek) {
            return ((xek) this).a;
        }
        if (this instanceof vek) {
            return ((vek) this).a;
        }
        if (this instanceof wek) {
            return ((wek) this).a;
        }
        if (this instanceof yek) {
            return ((yek) this).a;
        }
        w511.b();
        return null;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((tek) ft6.b.J1.getValue()).b(ft6.a, this);
    }
}
