package yads;

import defpackage.de81;
import defpackage.kr71;
import defpackage.n481;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* loaded from: classes7.dex */
public abstract class i extends y {
    private static final long serialVersionUID = 6588350623831699109L;

    @Override // defpackage.gk61
    public final kr71 a() {
        kr71 kr71Var = this.c;
        if (kr71Var != null) {
            return kr71Var;
        }
        uw1 uw1Var = (uw1) this;
        Map map = uw1Var.w;
        kr71 n481Var = map instanceof NavigableMap ? new n481(uw1Var, (NavigableMap) uw1Var.w) : map instanceof SortedMap ? new de81(uw1Var, (SortedMap) uw1Var.w) : new kr71(uw1Var, uw1Var.w);
        this.c = n481Var;
        return n481Var;
    }
}
