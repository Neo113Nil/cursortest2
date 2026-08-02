package ru.yandex.taxi.am;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.x40;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class r0 implements tpr {
    public final /* synthetic */ ru.yandex.taxi.activity.f a;
    public final /* synthetic */ x40 b;

    public r0(ru.yandex.taxi.activity.f fVar, x40 x40Var) {
        this.a = fVar;
        this.b = x40Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        UpgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$1 upgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$1;
        int i;
        if (continuation instanceof UpgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$1) {
            upgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$1 = (UpgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$1) continuation;
            int i2 = upgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                upgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = upgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = upgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    q0 q0Var = new q0(vprVar, this.b);
                    upgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$1.L$0 = null;
                    upgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$1.L$1 = null;
                    upgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$1.L$2 = null;
                    upgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$1.label = 1;
                    if (this.a.collect(q0Var, upgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$1) == coroutineSingletons) {
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
        upgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$1 = new UpgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$1(this, continuation);
        Object obj2 = upgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = upgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
