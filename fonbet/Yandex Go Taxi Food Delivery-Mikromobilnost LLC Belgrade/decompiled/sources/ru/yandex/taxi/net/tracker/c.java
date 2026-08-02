package ru.yandex.taxi.net.tracker;

import com.yandex.go.taxi.order.net.xiva.n;
import defpackage.l8x;
import defpackage.ny61;
import defpackage.tse;
import defpackage.u201;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes6.dex */
public final class c implements vpr {
    public final /* synthetic */ Ref$BooleanRef a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ e c;
    public final /* synthetic */ tse w;

    public c(Ref$BooleanRef ref$BooleanRef, Ref$ObjectRef ref$ObjectRef, e eVar, tse tseVar) {
        this.a = ref$BooleanRef;
        this.b = ref$ObjectRef;
        this.c = eVar;
        this.w = tseVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r8v4, types: [T, pzt0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, Continuation continuation) {
        BaseSmoothMovementTracker$startWebSocketConsumer$2$1$1$emit$1 baseSmoothMovementTracker$startWebSocketConsumer$2$1$1$emit$1;
        Object obj;
        int i;
        if (continuation instanceof BaseSmoothMovementTracker$startWebSocketConsumer$2$1$1$emit$1) {
            baseSmoothMovementTracker$startWebSocketConsumer$2$1$1$emit$1 = (BaseSmoothMovementTracker$startWebSocketConsumer$2$1$1$emit$1) continuation;
            int i2 = baseSmoothMovementTracker$startWebSocketConsumer$2$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                baseSmoothMovementTracker$startWebSocketConsumer$2$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                obj = baseSmoothMovementTracker$startWebSocketConsumer$2$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = baseSmoothMovementTracker$startWebSocketConsumer$2$1$1$emit$1.label;
                Ref$ObjectRef ref$ObjectRef = this.b;
                Ref$BooleanRef ref$BooleanRef = this.a;
                e eVar = this.c;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!z && ref$BooleanRef.element) {
                        ((l8x) ref$ObjectRef.element).a(null);
                        u201 u201Var = eVar.z;
                        baseSmoothMovementTracker$startWebSocketConsumer$2$1$1$emit$1.Z$0 = z;
                        baseSmoothMovementTracker$startWebSocketConsumer$2$1$1$emit$1.label = 1;
                        obj = ((n) u201Var).c(baseSmoothMovementTracker$startWebSocketConsumer$2$1$1$emit$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    ref$BooleanRef.element = z;
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = baseSmoothMovementTracker$startWebSocketConsumer$2$1$1$emit$1.Z$0;
                kotlin.b.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    eVar.Cg(BaseSmoothMovementTracker$DataOrigin.ENDPOINT);
                    eVar.Bg();
                } else {
                    ref$ObjectRef.element = BaseSmoothMovementTracker$startWebSocketConsumer$2.i(this.w, eVar, 5000L);
                }
                ref$BooleanRef.element = z;
                return zy11.a;
            }
        }
        baseSmoothMovementTracker$startWebSocketConsumer$2$1$1$emit$1 = new BaseSmoothMovementTracker$startWebSocketConsumer$2$1$1$emit$1(this, continuation);
        obj = baseSmoothMovementTracker$startWebSocketConsumer$2$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = baseSmoothMovementTracker$startWebSocketConsumer$2$1$1$emit$1.label;
        Ref$ObjectRef ref$ObjectRef2 = this.b;
        Ref$BooleanRef ref$BooleanRef2 = this.a;
        e eVar2 = this.c;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        ref$BooleanRef2.element = z;
        return zy11.a;
    }

    @Override // defpackage.vpr
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return a(((Boolean) obj).booleanValue(), continuation);
    }
}
