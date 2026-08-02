package defpackage;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zc8 implements u1f {
    public final bd8 a;
    public final List b;
    public final szb c;
    public Integer d;

    public zc8(bd8 bd8Var, List list, szb szbVar) {
        this.a = bd8Var;
        this.b = list;
        this.c = szbVar;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((og8) rj3.b.w1.getValue()).b(rj3.a, this);
    }
}
