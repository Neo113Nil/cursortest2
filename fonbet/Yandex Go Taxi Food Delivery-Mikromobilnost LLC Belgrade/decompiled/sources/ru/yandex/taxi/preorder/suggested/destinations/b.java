package ru.yandex.taxi.preorder.suggested.destinations;

import defpackage.ny61;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class b implements tpr {
    public final /* synthetic */ rol0 a;
    public final /* synthetic */ c b;

    public b(rol0 rol0Var, c cVar) {
        this.a = rol0Var;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ExpectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$1 expectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$1;
        int i;
        if (continuation instanceof ExpectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$1) {
            expectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$1 = (ExpectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$1) continuation;
            int i2 = expectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                expectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = expectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = expectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    expectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$1.L$0 = null;
                    expectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$1.L$1 = null;
                    expectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$1.L$2 = null;
                    expectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, expectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$1) == coroutineSingletons) {
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
        expectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$1 = new ExpectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$1(this, continuation);
        Object obj2 = expectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = expectedDestinationsHelper$expectedDestinationsResult$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
