package defpackage;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class tf8 implements u1f {
    public final List a;
    public final List b;
    public final szb c;
    public Integer d;

    public tf8(List list, List list2, szb szbVar) {
        this.a = list;
        this.b = list2;
        this.c = szbVar;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((uf8) rj3.b.o0.getValue()).b(rj3.a, this);
    }
}
