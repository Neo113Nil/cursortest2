package ru.yandex.taxi.address.repository;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class e implements tpr {
    public final /* synthetic */ tpr a;

    public e(tpr tprVar) {
        this.a = tprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SuggestIconRepository$updateIconFlow$$inlined$map$2$1 suggestIconRepository$updateIconFlow$$inlined$map$2$1;
        int i;
        if (continuation instanceof SuggestIconRepository$updateIconFlow$$inlined$map$2$1) {
            suggestIconRepository$updateIconFlow$$inlined$map$2$1 = (SuggestIconRepository$updateIconFlow$$inlined$map$2$1) continuation;
            int i2 = suggestIconRepository$updateIconFlow$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suggestIconRepository$updateIconFlow$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = suggestIconRepository$updateIconFlow$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suggestIconRepository$updateIconFlow$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar);
                    suggestIconRepository$updateIconFlow$$inlined$map$2$1.L$0 = null;
                    suggestIconRepository$updateIconFlow$$inlined$map$2$1.L$1 = null;
                    suggestIconRepository$updateIconFlow$$inlined$map$2$1.L$2 = null;
                    suggestIconRepository$updateIconFlow$$inlined$map$2$1.label = 1;
                    if (this.a.collect(dVar, suggestIconRepository$updateIconFlow$$inlined$map$2$1) == coroutineSingletons) {
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
        suggestIconRepository$updateIconFlow$$inlined$map$2$1 = new SuggestIconRepository$updateIconFlow$$inlined$map$2$1(this, continuation);
        Object obj2 = suggestIconRepository$updateIconFlow$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suggestIconRepository$updateIconFlow$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
