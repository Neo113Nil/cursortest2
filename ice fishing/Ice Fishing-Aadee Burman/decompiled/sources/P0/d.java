package P0;

import J0.s;
import S0.p;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class d extends b {
    static {
        h.d(s.f("NetworkNotRoamingCtrlr"), "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
    }

    @Override // P0.b
    public final boolean a(p workSpec) {
        h.e(workSpec, "workSpec");
        return workSpec.f2816j.f1374a == 4;
    }

    @Override // P0.b
    public final boolean b(Object obj) {
        O0.a value = (O0.a) obj;
        h.e(value, "value");
        return (value.f2154a && value.f2157d) ? false : true;
    }
}
