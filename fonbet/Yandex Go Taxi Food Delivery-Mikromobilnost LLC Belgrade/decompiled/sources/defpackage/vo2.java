package defpackage;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class vo2 {
    public final UUID a;
    public final fc70 b;
    public final za70 c;
    public final List d;
    public final Map e;
    public final tko f;
    public final boolean g;

    public vo2(UUID uuid, fc70 fc70Var, za70 za70Var, List list, Map map, tko tkoVar, boolean z) {
        this.a = uuid;
        this.b = fc70Var;
        this.c = za70Var;
        this.d = list;
        this.e = map;
        this.f = tkoVar;
        this.g = z;
    }

    public final uo2 a() {
        uo2 uo2Var = new uo2(this.b, this.a, this.c);
        uo2Var.y = this.d;
        uo2Var.z = this.e;
        uo2Var.x = this.f;
        uo2Var.a = this.g;
        return uo2Var;
    }
}
