package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class cyd implements rrf {
    public final rrf a;
    public final vdr b;
    public final x6k c;
    public final wn5 d;

    public cyd(rrf rrfVar, vdr vdrVar) {
        vdrVar.getClass();
        this.a = rrfVar;
        this.b = vdrVar;
        this.c = szf.g0(vdrVar.getValue());
        this.d = new wn5(new nha(16, this), 1900888824, true);
    }

    @Override // defpackage.rrf
    public final Function0 a() {
        return this.a.a();
    }

    @Override // defpackage.rrf
    public final cma b() {
        return ((Boolean) this.c.getValue()).booleanValue() ? new cma(0) : this.a.b();
    }

    @Override // defpackage.rrf
    public final String getId() {
        return this.a.getId();
    }

    @Override // defpackage.rrf
    public final String getType() {
        return this.a.getType();
    }

    @Override // defpackage.rrf
    public final Function2 getUi() {
        return this.d;
    }
}
