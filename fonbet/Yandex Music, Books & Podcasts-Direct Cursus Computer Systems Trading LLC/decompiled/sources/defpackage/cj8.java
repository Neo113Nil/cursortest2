package defpackage;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class cj8 implements u1f {
    public final szb a;
    public final List b;
    public final List c;
    public final bj8 d;
    public Integer e;

    public cj8(szb szbVar, List list, List list2, bj8 bj8Var) {
        this.a = szbVar;
        this.b = list;
        this.c = list2;
        this.d = bj8Var;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((dj8) rj3.b.Y0.getValue()).b(rj3.a, this);
    }
}
