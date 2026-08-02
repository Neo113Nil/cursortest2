package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class re0 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ re0(int i, int i2) {
        super(1);
        this.r = i2;
        this.s = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                return Boolean.valueOf(((dpc) obj).W0(this.s));
            case 1:
                ((List) obj).remove(this.s);
                return Unit.a;
            case 2:
                dp8 dp8Var = (dp8) obj;
                return this.s == 0 ? dp8Var.a() : dp8Var.c();
            case 3:
                return Boolean.valueOf(((dpc) obj).W0(this.s));
            default:
                return Integer.valueOf(((osf) obj).a - this.s);
        }
    }
}
