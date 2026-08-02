package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class vbe extends uif implements Function2 {
    public final /* synthetic */ hce r;
    public final /* synthetic */ ukd s;
    public final /* synthetic */ int t;
    public final /* synthetic */ l85 u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vbe(hce hceVar, ukd ukdVar, int i, l85 l85Var, int i2, int i3) {
        super(2);
        this.r = hceVar;
        this.s = ukdVar;
        this.t = i;
        this.u = l85Var;
        this.v = i2;
        this.w = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        saf.o(this.r, this.s, this.t, this.u, (hq5) obj, this.v | 1, this.w);
        return Unit.a;
    }
}
