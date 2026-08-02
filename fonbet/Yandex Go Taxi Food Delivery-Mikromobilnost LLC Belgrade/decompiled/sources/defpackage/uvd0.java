package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Luvd0;", "Lj530;", "Lvvd0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class uvd0 extends j530 {
    public final tb2 a;

    public uvd0(tb2 tb2Var) {
        this.a = tb2Var;
    }

    @Override // defpackage.j530
    public final e530 a() {
        return new vvd0(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uvd0) && jl40.l(this.a, ((uvd0) obj).a);
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        vvd0 vvd0Var = (vvd0) e530Var;
        wvd0 wvd0Var = vvd0Var.b;
        tb2 tb2Var = this.a;
        if (jl40.l(wvd0Var, tb2Var)) {
            return;
        }
        vvd0Var.b = tb2Var;
        if (vvd0Var.c) {
            vvd0Var.G0();
        }
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.a + ", overrideDescendants=false)";
    }
}
