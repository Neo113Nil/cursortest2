package defpackage;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class k29 implements u1f {
    public final szb a;
    public final szb b;
    public final szb c;
    public final List d;
    public final szb e;
    public final szb f;
    public final szb g;
    public Integer h;

    public k29(szb szbVar, szb szbVar2, szb szbVar3, List list, szb szbVar4, szb szbVar5, szb szbVar6) {
        this.a = szbVar;
        this.b = szbVar2;
        this.c = szbVar3;
        this.d = list;
        this.e = szbVar4;
        this.f = szbVar5;
        this.g = szbVar6;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((m29) rj3.b.g4.getValue()).b(rj3.a, this);
    }
}
