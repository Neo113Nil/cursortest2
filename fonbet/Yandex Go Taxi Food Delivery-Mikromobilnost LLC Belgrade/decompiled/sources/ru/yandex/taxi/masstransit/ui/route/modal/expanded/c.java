package ru.yandex.taxi.masstransit.ui.route.modal.expanded;

import defpackage.n1j;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ n1j b;

    public c(vpr vprVar, n1j n1jVar) {
        this.a = vprVar;
        this.b = n1jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtExpandedRoutesPresenter$updateLocalState$lambda$0$$inlined$map$1$2$1 mtExpandedRoutesPresenter$updateLocalState$lambda$0$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof MtExpandedRoutesPresenter$updateLocalState$lambda$0$$inlined$map$1$2$1) {
            mtExpandedRoutesPresenter$updateLocalState$lambda$0$$inlined$map$1$2$1 = (MtExpandedRoutesPresenter$updateLocalState$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = mtExpandedRoutesPresenter$updateLocalState$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtExpandedRoutesPresenter$updateLocalState$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mtExpandedRoutesPresenter$updateLocalState$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtExpandedRoutesPresenter$updateLocalState$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Pair pair = new Pair(this.b, (Set) obj);
                    mtExpandedRoutesPresenter$updateLocalState$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    mtExpandedRoutesPresenter$updateLocalState$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    mtExpandedRoutesPresenter$updateLocalState$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    mtExpandedRoutesPresenter$updateLocalState$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    mtExpandedRoutesPresenter$updateLocalState$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pair, mtExpandedRoutesPresenter$updateLocalState$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
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
        mtExpandedRoutesPresenter$updateLocalState$lambda$0$$inlined$map$1$2$1 = new MtExpandedRoutesPresenter$updateLocalState$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mtExpandedRoutesPresenter$updateLocalState$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtExpandedRoutesPresenter$updateLocalState$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
