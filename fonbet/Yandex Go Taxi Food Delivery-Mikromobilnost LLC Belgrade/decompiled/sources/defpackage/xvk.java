package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class xvk implements c4x, hex {
    public final Object a() {
        if (this instanceof vvk) {
            return ((vvk) this).a;
        }
        if (this instanceof uvk) {
            return ((uvk) this).a;
        }
        if (this instanceof wvk) {
            return ((wvk) this).a;
        }
        w511.b();
        return null;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((svk) ft6.b.E4.getValue()).b(ft6.a, this);
    }
}
