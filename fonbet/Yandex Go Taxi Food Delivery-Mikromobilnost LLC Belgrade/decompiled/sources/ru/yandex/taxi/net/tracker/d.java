package ru.yandex.taxi.net.tracker;

import com.yandex.go.taxi.order.net.xiva.n;
import defpackage.jse;
import defpackage.l8x;
import defpackage.ny61;
import defpackage.o201;
import defpackage.te51;
import defpackage.tse;
import defpackage.u201;
import defpackage.vpr;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes6.dex */
public final class d implements vpr {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ e b;
    public final /* synthetic */ tse c;

    public d(Ref$ObjectRef ref$ObjectRef, e eVar, tse tseVar) {
        this.a = ref$ObjectRef;
        this.b = eVar;
        this.c = tseVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
    
        if (defpackage.tje.k0(r2, r6, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r8v3, types: [T, pzt0] */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(o201 o201Var, Continuation continuation) {
        BaseSmoothMovementTracker$startWebSocketConsumer$2$2$emit$1 baseSmoothMovementTracker$startWebSocketConsumer$2$2$emit$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        e eVar;
        Object a;
        Ref$ObjectRef ref$ObjectRef;
        tse tseVar;
        if (continuation instanceof BaseSmoothMovementTracker$startWebSocketConsumer$2$2$emit$1) {
            baseSmoothMovementTracker$startWebSocketConsumer$2$2$emit$1 = (BaseSmoothMovementTracker$startWebSocketConsumer$2$2$emit$1) continuation;
            int i2 = baseSmoothMovementTracker$startWebSocketConsumer$2$2$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                baseSmoothMovementTracker$startWebSocketConsumer$2$2$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = baseSmoothMovementTracker$startWebSocketConsumer$2$2$emit$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = baseSmoothMovementTracker$startWebSocketConsumer$2$2$emit$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ((l8x) this.a.element).a(null);
                    if (this.b.S == BaseSmoothMovementTracker$DataOrigin.ENDPOINT) {
                        te51 te51Var = ((n) this.b.z).f;
                        te51Var.getClass();
                        te51Var.a.a("XivaWs.TaxiRouteFallback.Stopped", new HashMap(), 1, new HashMap());
                    }
                    this.b.Cg(BaseSmoothMovementTracker$DataOrigin.WEBSOCKET);
                    e eVar2 = this.b;
                    jse jseVar = eVar2.B;
                    BaseSmoothMovementTracker$startWebSocketConsumer$2$2$1 baseSmoothMovementTracker$startWebSocketConsumer$2$2$1 = new BaseSmoothMovementTracker$startWebSocketConsumer$2$2$1(eVar2, o201Var, null);
                    baseSmoothMovementTracker$startWebSocketConsumer$2$2$emit$1.L$0 = null;
                    baseSmoothMovementTracker$startWebSocketConsumer$2$2$emit$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        eVar = (e) baseSmoothMovementTracker$startWebSocketConsumer$2$2$emit$1.L$3;
                        tseVar = (tse) baseSmoothMovementTracker$startWebSocketConsumer$2$2$emit$1.L$2;
                        ref$ObjectRef = (Ref$ObjectRef) baseSmoothMovementTracker$startWebSocketConsumer$2$2$emit$1.L$1;
                        kotlin.b.b(obj);
                        ref$ObjectRef.element = BaseSmoothMovementTracker$startWebSocketConsumer$2.i(tseVar, eVar, ((Number) obj).longValue());
                        return zy11.a;
                    }
                    kotlin.b.b(obj);
                }
                ((l8x) this.a.element).a(null);
                Ref$ObjectRef ref$ObjectRef2 = this.a;
                tse tseVar2 = this.c;
                eVar = this.b;
                u201 u201Var = eVar.z;
                baseSmoothMovementTracker$startWebSocketConsumer$2$2$emit$1.L$0 = null;
                baseSmoothMovementTracker$startWebSocketConsumer$2$2$emit$1.L$1 = ref$ObjectRef2;
                baseSmoothMovementTracker$startWebSocketConsumer$2$2$emit$1.L$2 = tseVar2;
                baseSmoothMovementTracker$startWebSocketConsumer$2$2$emit$1.L$3 = eVar;
                baseSmoothMovementTracker$startWebSocketConsumer$2$2$emit$1.label = 2;
                a = ((n) u201Var).a(baseSmoothMovementTracker$startWebSocketConsumer$2$2$emit$1);
                if (a != coroutineSingletons) {
                    ref$ObjectRef = ref$ObjectRef2;
                    tseVar = tseVar2;
                    obj = a;
                    ref$ObjectRef.element = BaseSmoothMovementTracker$startWebSocketConsumer$2.i(tseVar, eVar, ((Number) obj).longValue());
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        baseSmoothMovementTracker$startWebSocketConsumer$2$2$emit$1 = new BaseSmoothMovementTracker$startWebSocketConsumer$2$2$emit$1(this, continuation);
        Object obj2 = baseSmoothMovementTracker$startWebSocketConsumer$2$2$emit$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = baseSmoothMovementTracker$startWebSocketConsumer$2$2$emit$1.label;
        if (i != 0) {
        }
        ((l8x) this.a.element).a(null);
        Ref$ObjectRef ref$ObjectRef22 = this.a;
        tse tseVar22 = this.c;
        eVar = this.b;
        u201 u201Var2 = eVar.z;
        baseSmoothMovementTracker$startWebSocketConsumer$2$2$emit$1.L$0 = null;
        baseSmoothMovementTracker$startWebSocketConsumer$2$2$emit$1.L$1 = ref$ObjectRef22;
        baseSmoothMovementTracker$startWebSocketConsumer$2$2$emit$1.L$2 = tseVar22;
        baseSmoothMovementTracker$startWebSocketConsumer$2$2$emit$1.L$3 = eVar;
        baseSmoothMovementTracker$startWebSocketConsumer$2$2$emit$1.label = 2;
        a = ((n) u201Var2).a(baseSmoothMovementTracker$startWebSocketConsumer$2$2$emit$1);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
