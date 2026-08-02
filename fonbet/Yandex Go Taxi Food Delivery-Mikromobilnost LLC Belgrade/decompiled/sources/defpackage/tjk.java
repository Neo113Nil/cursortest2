package defpackage;

import com.yandex.div.core.experiments.Experiment;
import com.yandex.div.core.expression.variables.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class tjk {
    public final gtk a;
    public y6k b;
    public u4l d;
    public plk e;
    public ivk g;
    public lml h;
    public Map i;
    public a j;
    public final ArrayList c = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final boolean k = Experiment.TAP_BEACONS_ENABLED.getDefaultValue();
    public final boolean l = Experiment.VISIBILITY_BEACONS_ENABLED.getDefaultValue();
    public final boolean m = Experiment.SWIPE_OUT_BEACONS_ENABLED.getDefaultValue();
    public final boolean n = Experiment.LONGTAP_ACTIONS_PASS_TO_CHILD_ENABLED.getDefaultValue();
    public final boolean o = Experiment.IGNORE_ACTION_MENU_ITEMS_ENABLED.getDefaultValue();
    public boolean p = Experiment.HYPHENATION_SUPPORT_ENABLED.getDefaultValue();
    public boolean q = Experiment.VISUAL_ERRORS_ENABLED.getDefaultValue();
    public final boolean r = Experiment.ACCESSIBILITY_ENABLED.getDefaultValue();
    public final boolean s = Experiment.VIEW_POOL_ENABLED.getDefaultValue();
    public final boolean t = Experiment.VIEW_POOL_PROFILING_ENABLED.getDefaultValue();
    public final boolean u = Experiment.VIEW_POOL_OPTIMIZATION_DEBUG.getDefaultValue();
    public final boolean v = Experiment.RESOURCE_CACHE_ENABLED.getDefaultValue();
    public final boolean w = Experiment.MULTIPLE_STATE_CHANGE_ENABLED.getDefaultValue();
    public boolean x = false;
    public final boolean y = Experiment.COMPLEX_REBIND_ENABLED.getDefaultValue();
    public final boolean z = Experiment.PAGER_PAGE_CLIP_ENABLED.getDefaultValue();
    public final boolean A = Experiment.PERMANENT_DEBUG_PANEL_ENABLED.getDefaultValue();
    public boolean B = Experiment.RENDER_EFFECT_ENABLED.getDefaultValue();

    public tjk(gtk gtkVar) {
        this.a = gtkVar;
    }

    public final ujk a() {
        lml lmlVar = this.h;
        if (lmlVar == null) {
            lmlVar = lml.a;
        }
        lml lmlVar2 = lmlVar;
        u4l u4lVar = this.d;
        if (u4lVar == null) {
            u4lVar = u4l.a;
        }
        u4l u4lVar2 = u4lVar;
        kl40 kl40Var = kl40.x;
        y6k y6kVar = this.b;
        if (y6kVar == null) {
            y6kVar = new y6k();
        }
        y6k y6kVar2 = y6kVar;
        com.yandex.div.state.a aVar = new com.yandex.div.state.a();
        plk plkVar = this.e;
        if (plkVar == null) {
            plkVar = plk.a;
        }
        plk plkVar2 = plkVar;
        ynk ynkVar = this.g;
        if (ynkVar == null) {
            ynkVar = ynk.P1;
        }
        ynk ynkVar2 = ynkVar;
        Map map = this.i;
        if (map == null) {
            map = new HashMap();
        }
        Map map2 = map;
        yt31 yt31Var = new yt31();
        a aVar2 = this.j;
        if (aVar2 == null) {
            aVar2 = new a();
        }
        return new ujk(this.a, y6kVar2, aVar, this.c, plkVar2, u4lVar2, kl40Var, this.f, ynkVar2, lmlVar2, map2, yt31Var, aVar2, this.k, this.l, this.m, this.n, this.o, this.q, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B);
    }

    public final void b(dpk dpkVar) {
        this.f.add(dpkVar);
    }
}
