package ru.yandex.taxi.altpins.order;

import defpackage.jqr;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes5.dex */
public final class o implements tpr {
    public final /* synthetic */ jqr a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ ThemeType c;

    public o(jqr jqrVar, Ref$ObjectRef ref$ObjectRef, ThemeType themeType) {
        this.a = jqrVar;
        this.b = ref$ObjectRef;
        this.c = themeType;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        WalkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$1 walkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$1;
        int i;
        if (continuation instanceof WalkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$1) {
            walkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$1 = (WalkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$1) continuation;
            int i2 = walkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = walkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    n nVar = new n(vprVar, this.b, this.c);
                    walkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$1.L$0 = null;
                    walkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$1.L$1 = null;
                    walkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$1.L$2 = null;
                    walkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$1.label = 1;
                    if (this.a.collect(nVar, walkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$1) == coroutineSingletons) {
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
        walkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$1 = new WalkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$1(this, continuation);
        Object obj2 = walkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
