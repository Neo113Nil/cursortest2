package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class twr implements Function1 {
    public final /* synthetic */ pfm a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ ywr c;
    public final /* synthetic */ Function0 d;

    public twr(pfm pfmVar, Function1 function1, ywr ywrVar, Function0 function0) {
        this.a = pfmVar;
        this.b = function1;
        this.c = ywrVar;
        this.d = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j = ((enj) obj).a;
        float f = (int) (((iur) this.a).y >> 32);
        float f2 = 0.15f * f;
        float f3 = f * 0.85f;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (f2 > intBitsToFloat || intBitsToFloat > f3) {
            this.d.invoke();
        } else {
            this.b.invoke(this.c);
        }
        return Unit.a;
    }
}
