package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class g73 implements rrf {
    public final String a;
    public final String b;
    public final wn5 c;
    public final cma d;
    public final Function0 e;

    public g73(String str, String str2, wn5 wn5Var, cma cmaVar, s2 s2Var) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = wn5Var;
        this.d = cmaVar;
        this.e = s2Var;
    }

    @Override // defpackage.rrf
    public final Function0 a() {
        return this.e;
    }

    @Override // defpackage.rrf
    public final cma b() {
        return this.d;
    }

    @Override // defpackage.rrf
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.rrf
    public final String getType() {
        return this.b;
    }

    @Override // defpackage.rrf
    public final Function2 getUi() {
        return this.c;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g73(nrf nrfVar, wn5 wn5Var) {
        this(nrfVar.a, nrfVar.b, wn5Var, (cma) null, (s2) null);
        nrfVar.getClass();
    }

    public /* synthetic */ g73(String str, String str2, wn5 wn5Var, cma cmaVar, int i) {
        this(str, str2, wn5Var, (i & 8) != 0 ? null : cmaVar, (s2) null);
    }
}
