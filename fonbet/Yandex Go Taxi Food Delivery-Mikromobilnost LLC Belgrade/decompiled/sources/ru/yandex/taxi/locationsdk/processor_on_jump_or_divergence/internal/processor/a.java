package ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence.internal.processor;

import defpackage.ny61;
import defpackage.v2u;
import defpackage.vpr;
import defpackage.y2u;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ v2u b;

    public a(vpr vprVar, v2u v2uVar) {
        this.a = vprVar;
        this.b = v2uVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CombinedInputStateSource$createGroupStatesFlow$lambda$1$$inlined$map$1$2$1 combinedInputStateSource$createGroupStatesFlow$lambda$1$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof CombinedInputStateSource$createGroupStatesFlow$lambda$1$$inlined$map$1$2$1) {
            combinedInputStateSource$createGroupStatesFlow$lambda$1$$inlined$map$1$2$1 = (CombinedInputStateSource$createGroupStatesFlow$lambda$1$$inlined$map$1$2$1) continuation;
            int i2 = combinedInputStateSource$createGroupStatesFlow$lambda$1$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                combinedInputStateSource$createGroupStatesFlow$lambda$1$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = combinedInputStateSource$createGroupStatesFlow$lambda$1$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = combinedInputStateSource$createGroupStatesFlow$lambda$1$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Pair pair = new Pair(this.b, (y2u) obj);
                    combinedInputStateSource$createGroupStatesFlow$lambda$1$$inlined$map$1$2$1.L$0 = null;
                    combinedInputStateSource$createGroupStatesFlow$lambda$1$$inlined$map$1$2$1.L$1 = null;
                    combinedInputStateSource$createGroupStatesFlow$lambda$1$$inlined$map$1$2$1.L$2 = null;
                    combinedInputStateSource$createGroupStatesFlow$lambda$1$$inlined$map$1$2$1.L$3 = null;
                    combinedInputStateSource$createGroupStatesFlow$lambda$1$$inlined$map$1$2$1.I$0 = 0;
                    combinedInputStateSource$createGroupStatesFlow$lambda$1$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pair, combinedInputStateSource$createGroupStatesFlow$lambda$1$$inlined$map$1$2$1) == coroutineSingletons) {
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
        combinedInputStateSource$createGroupStatesFlow$lambda$1$$inlined$map$1$2$1 = new CombinedInputStateSource$createGroupStatesFlow$lambda$1$$inlined$map$1$2$1(this, continuation);
        Object obj22 = combinedInputStateSource$createGroupStatesFlow$lambda$1$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = combinedInputStateSource$createGroupStatesFlow$lambda$1$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
