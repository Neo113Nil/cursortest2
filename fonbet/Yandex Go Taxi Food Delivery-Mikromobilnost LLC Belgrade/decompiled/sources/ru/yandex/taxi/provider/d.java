package ru.yandex.taxi.provider;

import defpackage.c921;
import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class d implements tpr {
    public final /* synthetic */ mth a;
    public final /* synthetic */ c921 b;

    public d(mth mthVar, c921 c921Var) {
        this.a = mthVar;
        this.b = c921Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        UpdatesCheckerImpl$shouldShowDialog$$inlined$map$1$1 updatesCheckerImpl$shouldShowDialog$$inlined$map$1$1;
        int i;
        if (continuation instanceof UpdatesCheckerImpl$shouldShowDialog$$inlined$map$1$1) {
            updatesCheckerImpl$shouldShowDialog$$inlined$map$1$1 = (UpdatesCheckerImpl$shouldShowDialog$$inlined$map$1$1) continuation;
            int i2 = updatesCheckerImpl$shouldShowDialog$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updatesCheckerImpl$shouldShowDialog$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = updatesCheckerImpl$shouldShowDialog$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updatesCheckerImpl$shouldShowDialog$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b);
                    updatesCheckerImpl$shouldShowDialog$$inlined$map$1$1.L$0 = null;
                    updatesCheckerImpl$shouldShowDialog$$inlined$map$1$1.L$1 = null;
                    updatesCheckerImpl$shouldShowDialog$$inlined$map$1$1.L$2 = null;
                    updatesCheckerImpl$shouldShowDialog$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, updatesCheckerImpl$shouldShowDialog$$inlined$map$1$1) == coroutineSingletons) {
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
        updatesCheckerImpl$shouldShowDialog$$inlined$map$1$1 = new UpdatesCheckerImpl$shouldShowDialog$$inlined$map$1$1(this, continuation);
        Object obj2 = updatesCheckerImpl$shouldShowDialog$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updatesCheckerImpl$shouldShowDialog$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
