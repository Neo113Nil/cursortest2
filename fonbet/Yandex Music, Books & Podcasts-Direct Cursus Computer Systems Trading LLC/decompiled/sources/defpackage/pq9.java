package defpackage;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class pq9 implements u1f {
    public final List a;
    public final List b;
    public final List c;
    public final szb d;
    public Integer e;

    public pq9(szb szbVar, List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = szbVar;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((fr9) rj3.b.Y8.getValue()).b(rj3.a, this);
    }
}
