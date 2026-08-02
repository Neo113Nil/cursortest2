package ru.yandex.taxi.preorder.source.domain;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;

    public e(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CheckForEmptyTariffsInteractor$validateTariffsFlow$$inlined$map$1$2$1 checkForEmptyTariffsInteractor$validateTariffsFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof CheckForEmptyTariffsInteractor$validateTariffsFlow$$inlined$map$1$2$1) {
            checkForEmptyTariffsInteractor$validateTariffsFlow$$inlined$map$1$2$1 = (CheckForEmptyTariffsInteractor$validateTariffsFlow$$inlined$map$1$2$1) continuation;
            int i2 = checkForEmptyTariffsInteractor$validateTariffsFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkForEmptyTariffsInteractor$validateTariffsFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = checkForEmptyTariffsInteractor$validateTariffsFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkForEmptyTariffsInteractor$validateTariffsFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Boolean valueOf = Boolean.valueOf(((List) obj).isEmpty());
                    checkForEmptyTariffsInteractor$validateTariffsFlow$$inlined$map$1$2$1.L$0 = null;
                    checkForEmptyTariffsInteractor$validateTariffsFlow$$inlined$map$1$2$1.L$1 = null;
                    checkForEmptyTariffsInteractor$validateTariffsFlow$$inlined$map$1$2$1.L$2 = null;
                    checkForEmptyTariffsInteractor$validateTariffsFlow$$inlined$map$1$2$1.L$3 = null;
                    checkForEmptyTariffsInteractor$validateTariffsFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, checkForEmptyTariffsInteractor$validateTariffsFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        checkForEmptyTariffsInteractor$validateTariffsFlow$$inlined$map$1$2$1 = new CheckForEmptyTariffsInteractor$validateTariffsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = checkForEmptyTariffsInteractor$validateTariffsFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkForEmptyTariffsInteractor$validateTariffsFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
