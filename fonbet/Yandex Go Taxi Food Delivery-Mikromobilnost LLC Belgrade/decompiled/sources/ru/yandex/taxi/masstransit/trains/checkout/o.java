package ru.yandex.taxi.masstransit.trains.checkout;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.xd40;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class o implements tpr {
    public final /* synthetic */ m a;
    public final /* synthetic */ r b;
    public final /* synthetic */ xd40 c;

    public o(m mVar, r rVar, xd40 xd40Var) {
        this.a = mVar;
        this.b = rVar;
        this.c = xd40Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$1 mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$1;
        int i;
        if (continuation instanceof MtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$1) {
            mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$1 = (MtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$1) continuation;
            int i2 = mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    n nVar = new n(vprVar, this.b, this.c);
                    mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$1.L$0 = null;
                    mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$1.L$1 = null;
                    mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$1.L$2 = null;
                    mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$1.label = 1;
                    if (this.a.collect(nVar, mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$1 = new MtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$1(this, continuation);
        Object obj2 = mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$0$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
