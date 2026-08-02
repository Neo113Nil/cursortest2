package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class dmd extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Function1 s;
    public final /* synthetic */ Function1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dmd(Function1 function1, Function1 function12, int i) {
        super(1);
        this.r = i;
        this.s = function1;
        this.t = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        switch (this.r) {
            case 0:
                f2r f2rVar = (f2r) obj;
                synchronized (g2r.b) {
                    j = g2r.d;
                    g2r.d = 1 + j;
                }
                return new ypi(j, f2rVar, this.s, this.t);
            case 1:
                this.s.invoke(obj);
                this.t.invoke(obj);
                return Unit.a;
            case 2:
                this.s.invoke(obj);
                this.t.invoke(obj);
                return Unit.a;
            default:
                y7o y7oVar = (y7o) obj;
                y7oVar.getClass();
                if (y7oVar.c()) {
                    this.s.invoke(y7oVar.a());
                } else {
                    Function1 function1 = this.t;
                    r7w r7wVar = y7oVar.b;
                    up6.D(r7wVar);
                    function1.invoke(r7wVar);
                }
                return Unit.a;
        }
    }
}
