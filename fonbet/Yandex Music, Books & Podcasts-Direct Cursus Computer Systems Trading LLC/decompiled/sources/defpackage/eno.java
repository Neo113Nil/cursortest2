package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class eno extends f6 {
    public final aur a;

    /* JADX WARN: Multi-variable type inference failed */
    public eno(Function2 function2) {
        this.a = (aur) function2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.f6
    public final Object d(xmo xmoVar, Continuation continuation) {
        Object invoke = this.a.invoke(xmoVar, continuation);
        return invoke == nm6.a ? invoke : Unit.a;
    }
}
