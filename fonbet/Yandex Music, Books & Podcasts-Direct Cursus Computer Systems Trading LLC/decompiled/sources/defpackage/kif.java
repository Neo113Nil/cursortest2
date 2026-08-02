package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class kif extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ uif s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kif(int i, Function1 function1) {
        super(1);
        this.r = i;
        switch (i) {
            case 3:
                this.s = (uif) function1;
                super(1);
                break;
            case 4:
                this.s = (uif) function1;
                super(1);
                break;
            case 5:
            default:
                this.s = (uif) function1;
                break;
            case 6:
                this.s = (uif) function1;
                super(1);
                break;
            case 7:
                this.s = (uif) function1;
                super(1);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function0, uif] */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function0, uif] */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r0v7, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r5v14, types: [kotlin.jvm.functions.Function0, uif] */
    /* JADX WARN: Type inference failed for: r5v21, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                this.s.invoke();
                return nif.d(obj);
            case 1:
                r7w r7wVar = (r7w) obj;
                r7wVar.getClass();
                this.s.invoke();
                return nif.c(r7wVar);
            case 2:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                this.s.invoke(bool);
                return Unit.a;
            case 3:
                return (y7o) this.s.invoke(obj);
            case 4:
                y7o y7oVar = (y7o) obj;
                y7oVar.getClass();
                kif kifVar = new kif(3, (Function1) this.s);
                if (y7oVar.c()) {
                    return (y7o) kifVar.invoke(y7oVar.a());
                }
                r7w r7wVar2 = y7oVar.b;
                up6.D(r7wVar2);
                return new y7o(null, r7wVar2);
            case 5:
                this.s.invoke();
                return Unit.a;
            case 6:
                b2r b2rVar = (b2r) this.s.invoke((f2r) obj);
                synchronized (g2r.b) {
                    g2r.c = g2r.c.q(b2rVar.g());
                }
                return b2rVar;
            default:
                return this.s.invoke(Long.valueOf(((Number) obj).longValue()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kif(int i, Function0 function0) {
        super(1);
        this.r = i;
        switch (i) {
            case 1:
                this.s = (uif) function0;
                super(1);
                break;
            case 5:
                this.s = (uif) function0;
                super(1);
                break;
            default:
                this.s = (uif) function0;
                break;
        }
    }
}
