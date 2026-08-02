package ru.yandex.taxi.address.repository;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;

    public d(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SuggestIconRepository$updateIconFlow$$inlined$map$2$2$1 suggestIconRepository$updateIconFlow$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof SuggestIconRepository$updateIconFlow$$inlined$map$2$2$1) {
            suggestIconRepository$updateIconFlow$$inlined$map$2$2$1 = (SuggestIconRepository$updateIconFlow$$inlined$map$2$2$1) continuation;
            int i2 = suggestIconRepository$updateIconFlow$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suggestIconRepository$updateIconFlow$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = suggestIconRepository$updateIconFlow$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suggestIconRepository$updateIconFlow$$inlined$map$2$2$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11Var;
                }
                kotlin.b.b(obj2);
                suggestIconRepository$updateIconFlow$$inlined$map$2$2$1.L$0 = null;
                suggestIconRepository$updateIconFlow$$inlined$map$2$2$1.L$1 = null;
                suggestIconRepository$updateIconFlow$$inlined$map$2$2$1.L$2 = null;
                suggestIconRepository$updateIconFlow$$inlined$map$2$2$1.L$3 = null;
                suggestIconRepository$updateIconFlow$$inlined$map$2$2$1.label = 1;
                return this.a.emit(zy11Var, suggestIconRepository$updateIconFlow$$inlined$map$2$2$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        suggestIconRepository$updateIconFlow$$inlined$map$2$2$1 = new SuggestIconRepository$updateIconFlow$$inlined$map$2$2$1(this, continuation);
        Object obj22 = suggestIconRepository$updateIconFlow$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suggestIconRepository$updateIconFlow$$inlined$map$2$2$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }
}
