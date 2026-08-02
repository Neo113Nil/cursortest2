package P0;

import J0.r;
import S0.p;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class d extends b {
    static {
        h.d(r.f("NetworkNotRoamingCtrlr"), "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
    }

    @Override // P0.b
    public final boolean a(p workSpec) {
        h.e(workSpec, "workSpec");
        return workSpec.f2945j.f1403a == 4;
    }

    @Override // P0.b
    public final boolean b(Object obj) {
        O0.a value = (O0.a) obj;
        h.e(value, "value");
        return (value.f2242a && value.f2245d) ? false : true;
    }
}
