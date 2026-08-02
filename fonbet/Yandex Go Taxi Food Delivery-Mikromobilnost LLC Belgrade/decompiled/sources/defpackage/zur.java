package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lzur;", "Lj530;", "Lbvr;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* data */ class zur extends j530 {
    public final yur a;

    public zur(yur yurVar) {
        this.a = yurVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        bvr bvrVar = new bvr();
        bvrVar.a = this.a;
        return bvrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zur) && jl40.l(this.a, ((zur) obj).a);
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        bvr bvrVar = (bvr) e530Var;
        bvrVar.a.a.j(bvrVar);
        yur yurVar = this.a;
        bvrVar.a = yurVar;
        yurVar.a.b(bvrVar);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.a + ')';
    }
}
