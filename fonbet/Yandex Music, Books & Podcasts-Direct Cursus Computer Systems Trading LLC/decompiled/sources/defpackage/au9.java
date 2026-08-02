package defpackage;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class au9 implements u1f {
    public final szb a;
    public final List b;
    public final String c;
    public final List d;
    public final szb e;
    public final String f;

    public au9(szb szbVar, List list, String str, List list2, szb szbVar2, String str2) {
        this.a = szbVar;
        this.b = list;
        this.c = str;
        this.d = list2;
        this.e = szbVar2;
        this.f = str2;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((du9) rj3.b.b9.getValue()).b(rj3.a, this);
    }
}
