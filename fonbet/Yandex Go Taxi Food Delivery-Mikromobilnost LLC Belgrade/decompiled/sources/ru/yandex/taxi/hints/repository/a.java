package ru.yandex.taxi.hints.repository;

import defpackage.hv0;
import defpackage.ny61;
import defpackage.us11;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SummaryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1 summaryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SummaryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1) {
            summaryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1 = (SummaryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1) continuation;
            int i2 = summaryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = summaryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    hv0 hv0Var = new hv0(((us11) obj).a, i3);
                    summaryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1.L$0 = null;
                    summaryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1.L$1 = null;
                    summaryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1.L$2 = null;
                    summaryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1.L$3 = null;
                    summaryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(hv0Var, summaryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        summaryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1 = new SummaryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = summaryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        return zy11.a;
    }
}
