package defpackage;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class bj8 implements u1f {
    public final List a;
    public final szb b;
    public final szb c;
    public Integer d;

    public bj8(List list, szb szbVar, szb szbVar2) {
        this.a = list;
        this.b = szbVar;
        this.c = szbVar2;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((ij8) rj3.b.b1.getValue()).b(rj3.a, this);
    }
}
