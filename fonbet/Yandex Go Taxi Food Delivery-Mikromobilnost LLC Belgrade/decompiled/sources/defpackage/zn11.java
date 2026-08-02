package defpackage;

import java.util.Map;
import kotlin.collections.b;

@gsq0(with = q4t0.class)
/* loaded from: classes9.dex */
public final class zn11 {
    public static final tn11 Companion = new tn11();
    public static final zn11 c = new zn11(b.f(), b.f());
    public final Map a;
    public final Map b;

    public zn11(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public final boolean a(String str) {
        un11 un11Var = (un11) this.b.get(str);
        if (un11Var != null) {
            qn11 qn11Var = un11Var.a;
            if (qn11Var instanceof n96) {
                return ((n96) qn11Var).b();
            }
            if (qn11Var instanceof w96) {
                return ((w96) qn11Var).h();
            }
            if (qn11Var != null) {
                jst.e.x(new IllegalArgumentException("Incompatible experiment checked"), "You can only use this method for SimpleBooleanExperiment. Experiment " + qn11Var.getClass());
            }
        }
        return false;
    }
}
