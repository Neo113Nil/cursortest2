package ru.yandex.taxi.logistics.sdk.tracking.domain.impl;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vng;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.domain.impl.UpdateEmitter$delayFlow$1", f = "UpdateEmitter.kt", l = {37, 39}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class UpdateEmitter$delayFlow$1 extends SuspendLambda implements wls {
    long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateEmitter$delayFlow$1(h hVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UpdateEmitter$delayFlow$1 updateEmitter$delayFlow$1 = new UpdateEmitter$delayFlow$1(this.this$0, continuation);
        updateEmitter$delayFlow$1.L$0 = obj;
        return updateEmitter$delayFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpdateEmitter$delayFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            long I = vng.I();
            h hVar = this.this$0;
            j = I - hVar.c;
            long j3 = hVar.b;
            if (j < j3) {
                this.L$0 = vprVar;
                this.J$0 = j;
                this.label = 1;
                if (kotlinx.coroutines.a.i(j3 - j, this) != coroutineSingletons) {
                    j2 = j;
                }
            }
            this.L$0 = null;
            this.J$0 = j;
            this.label = 2;
            return vprVar.emit(zy11Var, this) != coroutineSingletons ? coroutineSingletons : zy11Var;
        }
        if (i != 1) {
            if (i == 2) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = this.J$0;
        kotlin.b.b(obj);
        j = j2;
        this.L$0 = null;
        this.J$0 = j;
        this.label = 2;
        if (vprVar.emit(zy11Var, this) != coroutineSingletons) {
        }
    }
}
