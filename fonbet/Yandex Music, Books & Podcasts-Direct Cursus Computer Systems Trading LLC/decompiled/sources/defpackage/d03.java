package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class d03 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ xdh s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d03(xdh xdhVar, int i) {
        super(1);
        this.r = i;
        this.s = xdhVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                qi4 qi4Var = (qi4) obj;
                qi4Var.getClass();
                return this.s.c(qi4Var);
            case 1:
                qi4 qi4Var2 = (qi4) obj;
                qi4Var2.getClass();
                return this.s.c(qi4Var2);
            default:
                qi4 qi4Var3 = (qi4) obj;
                qi4Var3.getClass();
                return this.s.c(qi4Var3);
        }
    }
}
