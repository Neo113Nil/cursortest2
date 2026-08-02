package defpackage;

import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.b;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes9.dex */
public final class v5j0 {
    public final vu00 a;
    public String b;
    public Integer c;
    public String d;
    public String e;
    public Long f;
    public Long g;
    public Long h;
    public Long i;
    public Long j;
    public Map k = b.f();
    public boolean l;
    public boolean m;

    public v5j0(vu00 vu00Var, seu seuVar) {
        this.a = vu00Var;
        ArrayList b = xfz.b(v5j0.class.getSimpleName());
        wjr.a.getClass();
        wjr wjrVar = vjr.b;
        ListBuilder a = rcc.a();
        a.add(new xjr("flex"));
        s5r s5rVar = new s5r(kotlin.sequences.b.h(new h73(1, b), new n35(5)));
        while (s5rVar.hasNext()) {
            a.add(new xjr(((xjr) s5rVar.next()).a));
        }
        a.j();
        wjrVar.createLogConfiguration();
    }

    public final wu00 a() {
        return new wu00(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }
}
