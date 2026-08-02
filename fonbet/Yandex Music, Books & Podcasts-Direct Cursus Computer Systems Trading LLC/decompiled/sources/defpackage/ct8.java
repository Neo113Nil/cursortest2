package defpackage;

import com.yandex.plus.divkit.impl.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ct8 {
    public final a39 a;
    public eg8 b;
    public b c;
    public we9 e;
    public dv8 f;
    public ky9 h;
    public Map i;
    public bz9 j;
    public final ArrayList d = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final boolean k = hxb.TAP_BEACONS_ENABLED.a;
    public final boolean l = hxb.VISIBILITY_BEACONS_ENABLED.a;
    public final boolean m = true;
    public final boolean n = hxb.LONGTAP_ACTIONS_PASS_TO_CHILD_ENABLED.a;
    public final boolean o = hxb.IGNORE_ACTION_MENU_ITEMS_ENABLED.a;
    public boolean p = hxb.HYPHENATION_SUPPORT_ENABLED.a;
    public boolean q = hxb.VISUAL_ERRORS_ENABLED.a;
    public final boolean r = true;
    public final boolean s = true;
    public final boolean t = hxb.VIEW_POOL_PROFILING_ENABLED.a;
    public final boolean u = hxb.VIEW_POOL_OPTIMIZATION_DEBUG.a;
    public final boolean v = true;
    public final boolean w = hxb.MULTIPLE_STATE_CHANGE_ENABLED.a;
    public final boolean x = hxb.COMPLEX_REBIND_ENABLED.a;
    public final boolean y = true;

    public ct8(a39 a39Var) {
        this.a = a39Var;
    }

    public final dt8 a() {
        ky9 ky9Var = this.h;
        if (ky9Var == null) {
            ky9Var = ky9.a;
        }
        ky9 ky9Var2 = ky9Var;
        we9 we9Var = this.e;
        if (we9Var == null) {
            we9Var = we9.a;
        }
        we9 we9Var2 = we9Var;
        ze9 b = we9Var2.b();
        eg8 eg8Var = this.b;
        if (eg8Var == null) {
            eg8Var = new eg8();
        }
        eg8 eg8Var2 = eg8Var;
        yb8 yb8Var = this.c;
        if (yb8Var == null) {
            yb8Var = yb8.a;
        }
        yb8 yb8Var2 = yb8Var;
        aqd aqdVar = new aqd(1);
        wb8 wb8Var = wb8.a;
        dv8 dv8Var = this.f;
        if (dv8Var == null) {
            dv8Var = dv8.a;
        }
        dv8 dv8Var2 = dv8Var;
        Map map = this.i;
        if (map == null) {
            map = new HashMap();
        }
        Map map2 = map;
        int i = 20;
        int i2 = 4;
        int i3 = 2;
        int i4 = 2;
        tgu tguVar = new tgu(null, new pim(i), new pim(i), new pim(3), new pim(8), new pim(12), new pim(i2), new pim(i2), new pim(6), new pim(i3), new pim(i3), new pim(4), new pim(i4), new pim(i4), new pim(i4), new pim(i4), new pim(i4), new pim(i4), new pim(i4));
        bz9 bz9Var = this.j;
        if (bz9Var == null) {
            bz9Var = new bz9();
        }
        return new dt8(this.a, eg8Var2, yb8Var2, aqdVar, wb8Var, this.d, dv8Var2, we9Var2, b, this.g, ky9Var2, map2, tguVar, bz9Var, this.k, this.l, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y);
    }

    public final void b(ux8 ux8Var) {
        this.g.add(ux8Var);
    }
}
