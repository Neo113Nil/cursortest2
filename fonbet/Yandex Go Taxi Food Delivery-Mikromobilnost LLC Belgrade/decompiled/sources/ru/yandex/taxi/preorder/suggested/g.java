package ru.yandex.taxi.preorder.suggested;

import defpackage.ktj0;
import defpackage.mtj0;
import defpackage.ntj0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ i b;

    public g(vpr vprVar, i iVar) {
        this.a = vprVar;
        this.b = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ZeroSuggestInteractorImpl$offerDestinationZeroSuggestBySourcePointChangeFlow$1$invokeSuspend$lambda$2$$inlined$map$1$2$1 zeroSuggestInteractorImpl$offerDestinationZeroSuggestBySourcePointChangeFlow$1$invokeSuspend$lambda$2$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ZeroSuggestInteractorImpl$offerDestinationZeroSuggestBySourcePointChangeFlow$1$invokeSuspend$lambda$2$$inlined$map$1$2$1) {
            zeroSuggestInteractorImpl$offerDestinationZeroSuggestBySourcePointChangeFlow$1$invokeSuspend$lambda$2$$inlined$map$1$2$1 = (ZeroSuggestInteractorImpl$offerDestinationZeroSuggestBySourcePointChangeFlow$1$invokeSuspend$lambda$2$$inlined$map$1$2$1) continuation;
            int i2 = zeroSuggestInteractorImpl$offerDestinationZeroSuggestBySourcePointChangeFlow$1$invokeSuspend$lambda$2$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zeroSuggestInteractorImpl$offerDestinationZeroSuggestBySourcePointChangeFlow$1$invokeSuspend$lambda$2$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = zeroSuggestInteractorImpl$offerDestinationZeroSuggestBySourcePointChangeFlow$1$invokeSuspend$lambda$2$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zeroSuggestInteractorImpl$offerDestinationZeroSuggestBySourcePointChangeFlow$1$invokeSuspend$lambda$2$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    i iVar = this.b;
                    iVar.getClass();
                    mtj0 mtj0Var = ntj0.a;
                    ktj0 ktj0Var = new ktj0(iVar.a((List) obj));
                    zeroSuggestInteractorImpl$offerDestinationZeroSuggestBySourcePointChangeFlow$1$invokeSuspend$lambda$2$$inlined$map$1$2$1.L$0 = null;
                    zeroSuggestInteractorImpl$offerDestinationZeroSuggestBySourcePointChangeFlow$1$invokeSuspend$lambda$2$$inlined$map$1$2$1.L$1 = null;
                    zeroSuggestInteractorImpl$offerDestinationZeroSuggestBySourcePointChangeFlow$1$invokeSuspend$lambda$2$$inlined$map$1$2$1.L$2 = null;
                    zeroSuggestInteractorImpl$offerDestinationZeroSuggestBySourcePointChangeFlow$1$invokeSuspend$lambda$2$$inlined$map$1$2$1.L$3 = null;
                    zeroSuggestInteractorImpl$offerDestinationZeroSuggestBySourcePointChangeFlow$1$invokeSuspend$lambda$2$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(ktj0Var, zeroSuggestInteractorImpl$offerDestinationZeroSuggestBySourcePointChangeFlow$1$invokeSuspend$lambda$2$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        zeroSuggestInteractorImpl$offerDestinationZeroSuggestBySourcePointChangeFlow$1$invokeSuspend$lambda$2$$inlined$map$1$2$1 = new ZeroSuggestInteractorImpl$offerDestinationZeroSuggestBySourcePointChangeFlow$1$invokeSuspend$lambda$2$$inlined$map$1$2$1(this, continuation);
        Object obj22 = zeroSuggestInteractorImpl$offerDestinationZeroSuggestBySourcePointChangeFlow$1$invokeSuspend$lambda$2$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zeroSuggestInteractorImpl$offerDestinationZeroSuggestBySourcePointChangeFlow$1$invokeSuspend$lambda$2$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
