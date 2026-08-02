package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class zo9 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ lp9 s;
    public final /* synthetic */ vo9 t;
    public final /* synthetic */ xzb u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zo9(lp9 lp9Var, vo9 vo9Var, xzb xzbVar, int i) {
        super(1);
        this.r = i;
        this.s = lp9Var;
        this.t = vo9Var;
        this.u = xzbVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                bg3.l(this.s.getDivider(), this.t.A, this.u);
                break;
            default:
                bg3.m(this.s.getTitleLayout(), this.t.E, this.u);
                break;
        }
        return Unit.a;
    }
}
