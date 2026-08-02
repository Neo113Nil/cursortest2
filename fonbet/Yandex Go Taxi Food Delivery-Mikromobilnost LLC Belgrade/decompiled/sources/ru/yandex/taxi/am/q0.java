package ru.yandex.taxi.am;

import android.content.Intent;
import defpackage.ny61;
import defpackage.r40;
import defpackage.vpr;
import defpackage.x40;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class q0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ x40 b;

    public q0(vpr vprVar, x40 x40Var) {
        this.a = vprVar;
        this.b = x40Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UpgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$2$1 upgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof UpgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$2$1) {
            upgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$2$1 = (UpgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = upgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                upgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = upgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = upgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    r40 r40Var = (r40) obj;
                    Intent intent = r40Var.c;
                    Result result = new Result(this.b.c(r40Var.a, intent));
                    upgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    upgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    upgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    upgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    upgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(result, upgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        upgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$2$1 = new UpgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = upgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = upgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
