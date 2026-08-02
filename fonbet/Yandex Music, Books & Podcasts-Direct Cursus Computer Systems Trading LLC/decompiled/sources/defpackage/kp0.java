package defpackage;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class kp0 {
    public final UUID a;
    public final nuj b;
    public final jtj c;
    public final List d;
    public final Map e;
    public final pob f;
    public final boolean g;

    public kp0(UUID uuid, nuj nujVar, jtj jtjVar, List list, Map map, pob pobVar, boolean z) {
        this.a = uuid;
        this.b = nujVar;
        this.c = jtjVar;
        this.d = list;
        this.e = map;
        this.f = pobVar;
        this.g = z;
    }

    public final jp0 a() {
        jp0 jp0Var = new jp0(this.b, this.a, this.c);
        jp0Var.f = this.d;
        jp0Var.g = this.e;
        pob pobVar = this.f;
        pobVar.getClass();
        jp0Var.e = ((pob) jp0Var.e).b(pobVar);
        jp0Var.a = this.g;
        return jp0Var;
    }
}
