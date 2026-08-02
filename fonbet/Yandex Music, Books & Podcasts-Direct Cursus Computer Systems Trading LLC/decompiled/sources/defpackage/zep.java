package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class zep extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ nf6 s;
    public final /* synthetic */ xep t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zep(nf6 nf6Var, xep xepVar, int i) {
        super(0);
        this.r = i;
        this.s = nf6Var;
        this.t = xepVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                this.t.b();
                fgq.v(this.s);
                break;
            default:
                this.t.k();
                fgq.v(this.s);
                break;
        }
        return Unit.a;
    }
}
