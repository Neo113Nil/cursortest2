package defpackage;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class cym implements u1f {
    public final szb a;
    public final String b;
    public final String c;
    public final List d;
    public final nx8 e;
    public Integer f;

    public cym(szb szbVar, String str, String str2, List list, nx8 nx8Var) {
        this.a = szbVar;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = nx8Var;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((fym) rj3.b.Ba.getValue()).b(rj3.a, this);
    }
}
