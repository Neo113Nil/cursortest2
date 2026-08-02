package io.flutter.plugins.sharedpreferences;

import defpackage.kme0;
import defpackage.mme0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes4.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ kme0 b;

    public c(vpr vprVar, kme0 kme0Var) {
        this.a = vprVar;
        this.b = kme0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1 sharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1) {
            sharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1 = (SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = sharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = sharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Object c = ((mme0) obj).c(this.b);
                    sharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    sharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    sharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    sharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    sharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1.I$0 = 0;
                    sharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(c, sharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        sharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1 = new SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = sharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
