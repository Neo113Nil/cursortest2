package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class acq implements wxi {
    public final /* synthetic */ zcq a;
    public final /* synthetic */ Function1 b;

    public acq(zcq zcqVar, Function1 function1) {
        bxj bxjVar = bxj.a;
        this.a = zcqVar;
        this.b = function1;
    }

    @Override // defpackage.wxi
    public final long K(int i, long j, long j2) {
        if (i != 1) {
            return 0L;
        }
        ia0 ia0Var = this.a.b;
        bxj bxjVar = bxj.a;
        return swf.i(0.0f, ia0Var.f(enj.f(j2)));
    }

    @Override // defpackage.wxi
    public final Object k(long j, long j2, Continuation continuation) {
        bxj bxjVar = bxj.a;
        this.b.invoke(new Float(yzt.c(j2)));
        return new yzt(j2);
    }

    @Override // defpackage.wxi
    public final Object r0(long j, Continuation continuation) {
        bxj bxjVar = bxj.a;
        float c = yzt.c(j);
        zcq zcqVar = this.a;
        float k = zcqVar.b.k();
        Float c0 = CollectionsKt.c0(zcqVar.b.g().a.values());
        float floatValue = c0 != null ? c0.floatValue() : Float.NaN;
        if (c >= 0.0f || k <= floatValue) {
            j = 0;
        } else {
            this.b.invoke(new Float(c));
        }
        return new yzt(j);
    }

    @Override // defpackage.wxi
    public final long x(int i, long j) {
        bxj bxjVar = bxj.a;
        float f = enj.f(j);
        if (f >= 0.0f || i != 1) {
            return 0L;
        }
        return swf.i(0.0f, this.a.b.f(f));
    }
}
