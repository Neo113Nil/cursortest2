package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class am8 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ gc8 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ am8(gc8 gc8Var, int i) {
        super(1);
        this.r = i;
        this.s = gc8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                this.s.I(new RuntimeException((String) obj));
                break;
            default:
                rdk rdkVar = ((d0c) obj).c;
                if (rdkVar != null) {
                    rdkVar.u(this.s);
                }
                break;
        }
        return Unit.a;
    }
}
