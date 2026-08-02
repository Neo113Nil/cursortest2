package ru.yandex.yandexmaps.multiplatform.pin.war.callback;

import defpackage.ny61;
import defpackage.owb0;
import defpackage.qwb0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes7.dex */
public final class a implements owb0 {
    public final wls a;

    public a(wls wlsVar) {
        this.a = wlsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.wls
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(qwb0 qwb0Var, Continuation continuation) {
        SimplePinInvalidationCallback$invoke$1 simplePinInvalidationCallback$invoke$1;
        int i;
        if (continuation instanceof SimplePinInvalidationCallback$invoke$1) {
            simplePinInvalidationCallback$invoke$1 = (SimplePinInvalidationCallback$invoke$1) continuation;
            int i2 = simplePinInvalidationCallback$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                simplePinInvalidationCallback$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = simplePinInvalidationCallback$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = simplePinInvalidationCallback$invoke$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    simplePinInvalidationCallback$invoke$1.L$0 = null;
                    simplePinInvalidationCallback$invoke$1.label = 1;
                    this.a.invoke(qwb0Var, simplePinInvalidationCallback$invoke$1);
                    if (zy11Var == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11Var;
            }
        }
        simplePinInvalidationCallback$invoke$1 = new SimplePinInvalidationCallback$invoke$1(this, continuation);
        Object obj2 = simplePinInvalidationCallback$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = simplePinInvalidationCallback$invoke$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        return zy11Var2;
    }
}
