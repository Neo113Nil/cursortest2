package kotlinx.coroutines.flow;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: classes4.dex */
public final class p0 implements vpr {
    public final /* synthetic */ Ref$BooleanRef a;
    public final /* synthetic */ vpr b;

    public p0(vpr vprVar, Ref$BooleanRef ref$BooleanRef) {
        this.a = ref$BooleanRef;
        this.b = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, Continuation continuation) {
        StartedLazily$command$1$1$emit$1 startedLazily$command$1$1$emit$1;
        int i2;
        if (continuation instanceof StartedLazily$command$1$1$emit$1) {
            startedLazily$command$1$1$emit$1 = (StartedLazily$command$1$1$emit$1) continuation;
            int i3 = startedLazily$command$1$1$emit$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                startedLazily$command$1$1$emit$1.label = i3 - Integer.MIN_VALUE;
                Object obj = startedLazily$command$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = startedLazily$command$1$1$emit$1.label;
                zy11 zy11Var = zy11.a;
                if (i2 == 0) {
                    if (i2 == 1) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                if (i > 0) {
                    Ref$BooleanRef ref$BooleanRef = this.a;
                    if (!ref$BooleanRef.element) {
                        ref$BooleanRef.element = true;
                        SharingCommand sharingCommand = SharingCommand.START;
                        startedLazily$command$1$1$emit$1.I$0 = i;
                        startedLazily$command$1$1$emit$1.label = 1;
                        if (this.b.emit(sharingCommand, startedLazily$command$1$1$emit$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                return zy11Var;
            }
        }
        startedLazily$command$1$1$emit$1 = new StartedLazily$command$1$1$emit$1(this, continuation);
        Object obj2 = startedLazily$command$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = startedLazily$command$1$1$emit$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i2 == 0) {
        }
    }

    @Override // defpackage.vpr
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return a(((Number) obj).intValue(), continuation);
    }
}
