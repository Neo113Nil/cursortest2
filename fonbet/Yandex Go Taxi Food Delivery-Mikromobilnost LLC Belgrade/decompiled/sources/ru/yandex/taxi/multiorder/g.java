package ru.yandex.taxi.multiorder;

import defpackage.g2k0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class g implements vpr {
    public final /* synthetic */ g2k0 a;

    public g(g2k0 g2k0Var) {
        this.a = g2k0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ReturnWithBackButton$start$$inlined$safeCollectIn$1$2$1 returnWithBackButton$start$$inlined$safeCollectIn$1$2$1;
        Object obj2;
        int i;
        if (continuation instanceof ReturnWithBackButton$start$$inlined$safeCollectIn$1$2$1) {
            returnWithBackButton$start$$inlined$safeCollectIn$1$2$1 = (ReturnWithBackButton$start$$inlined$safeCollectIn$1$2$1) continuation;
            int i2 = returnWithBackButton$start$$inlined$safeCollectIn$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                returnWithBackButton$start$$inlined$safeCollectIn$1$2$1.label = i2 - Integer.MIN_VALUE;
                obj2 = returnWithBackButton$start$$inlined$safeCollectIn$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = returnWithBackButton$start$$inlined$safeCollectIn$1$2$1.label;
                g2k0 g2k0Var = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    com.yandex.go.superapp.order.multi.old.provider.g gVar = g2k0Var.b;
                    returnWithBackButton$start$$inlined$safeCollectIn$1$2$1.L$0 = null;
                    returnWithBackButton$start$$inlined$safeCollectIn$1$2$1.L$1 = null;
                    returnWithBackButton$start$$inlined$safeCollectIn$1$2$1.L$2 = null;
                    returnWithBackButton$start$$inlined$safeCollectIn$1$2$1.label = 1;
                    obj2 = gVar.c(returnWithBackButton$start$$inlined$safeCollectIn$1$2$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                if (!((Boolean) obj2).booleanValue()) {
                    g2k0Var.c.a(false);
                }
                return zy11.a;
            }
        }
        returnWithBackButton$start$$inlined$safeCollectIn$1$2$1 = new ReturnWithBackButton$start$$inlined$safeCollectIn$1$2$1(this, continuation);
        obj2 = returnWithBackButton$start$$inlined$safeCollectIn$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = returnWithBackButton$start$$inlined$safeCollectIn$1$2$1.label;
        g2k0 g2k0Var2 = this.a;
        if (i != 0) {
        }
        if (!((Boolean) obj2).booleanValue()) {
        }
        return zy11.a;
    }
}
