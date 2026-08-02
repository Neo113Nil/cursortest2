package defpackage;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wc9 implements u1f {
    public final List a;
    public final szb b;
    public final List c;
    public final List d;

    public wc9(szb szbVar, List list, List list2, List list3) {
        this.a = list;
        this.b = szbVar;
        this.c = list2;
        this.d = list3;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((ad9) rj3.b.O5.getValue()).b(rj3.a, this);
    }
}
