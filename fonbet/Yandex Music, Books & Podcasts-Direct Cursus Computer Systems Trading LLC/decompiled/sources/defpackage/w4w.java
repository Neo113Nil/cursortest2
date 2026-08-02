package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class w4w implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x4w b;
    public final /* synthetic */ xjo c;

    public /* synthetic */ w4w(x4w x4wVar, xjo xjoVar, int i) {
        this.a = i;
        this.b = x4wVar;
        this.c = xjoVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        xy0 xy0Var = (xy0) obj;
        switch (this.a) {
            case 0:
                xy0Var.getClass();
                this.b.a(this.c, xy0Var);
                break;
            default:
                xy0Var.getClass();
                this.b.b(this.c, xy0Var);
                break;
        }
        return Unit.a;
    }
}
