package ru.yandex.taxi.cashback.interactors;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class l implements vpr {
    public final /* synthetic */ m a;

    public l(m mVar) {
        this.a = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        UpdatePlusDataOnZoneChangeInteractor$onFirstContentfulPaint$1$2$emit$1 updatePlusDataOnZoneChangeInteractor$onFirstContentfulPaint$1$2$emit$1;
        int i;
        if (continuation instanceof UpdatePlusDataOnZoneChangeInteractor$onFirstContentfulPaint$1$2$emit$1) {
            updatePlusDataOnZoneChangeInteractor$onFirstContentfulPaint$1$2$emit$1 = (UpdatePlusDataOnZoneChangeInteractor$onFirstContentfulPaint$1$2$emit$1) continuation;
            int i2 = updatePlusDataOnZoneChangeInteractor$onFirstContentfulPaint$1$2$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updatePlusDataOnZoneChangeInteractor$onFirstContentfulPaint$1$2$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = updatePlusDataOnZoneChangeInteractor$onFirstContentfulPaint$1$2$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updatePlusDataOnZoneChangeInteractor$onFirstContentfulPaint$1$2$emit$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    updatePlusDataOnZoneChangeInteractor$onFirstContentfulPaint$1$2$emit$1.L$0 = null;
                    updatePlusDataOnZoneChangeInteractor$onFirstContentfulPaint$1$2$emit$1.label = 1;
                    if (kotlinx.coroutines.a.i(500L, updatePlusDataOnZoneChangeInteractor$onFirstContentfulPaint$1$2$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                this.a.a.b();
                return zy11.a;
            }
        }
        updatePlusDataOnZoneChangeInteractor$onFirstContentfulPaint$1$2$emit$1 = new UpdatePlusDataOnZoneChangeInteractor$onFirstContentfulPaint$1$2$emit$1(this, continuation);
        Object obj2 = updatePlusDataOnZoneChangeInteractor$onFirstContentfulPaint$1$2$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updatePlusDataOnZoneChangeInteractor$onFirstContentfulPaint$1$2$emit$1.label;
        if (i != 0) {
        }
        this.a.a.b();
        return zy11.a;
    }

    @Override // defpackage.vpr
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return a(continuation);
    }
}
