package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lzhy0;", "Lj530;", "Laiy0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class zhy0 extends j530 {
    public final String a;

    public zhy0(String str) {
        this.a = str;
    }

    @Override // defpackage.j530
    public final e530 a() {
        aiy0 aiy0Var = new aiy0();
        aiy0Var.a = this.a;
        return aiy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zhy0)) {
            return false;
        }
        return jl40.l(this.a, ((zhy0) obj).a);
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        ((aiy0) e530Var).a = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
