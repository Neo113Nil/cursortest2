package ru.yandex.taxi.preorder.tollroad;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class n implements tpr {
    public final /* synthetic */ l a;
    public final /* synthetic */ o b;

    public n(l lVar, o oVar) {
        this.a = lVar;
        this.b = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TollRoadsDialogInteractor$special$$inlined$map$4$1 tollRoadsDialogInteractor$special$$inlined$map$4$1;
        int i;
        if (continuation instanceof TollRoadsDialogInteractor$special$$inlined$map$4$1) {
            tollRoadsDialogInteractor$special$$inlined$map$4$1 = (TollRoadsDialogInteractor$special$$inlined$map$4$1) continuation;
            int i2 = tollRoadsDialogInteractor$special$$inlined$map$4$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tollRoadsDialogInteractor$special$$inlined$map$4$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tollRoadsDialogInteractor$special$$inlined$map$4$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tollRoadsDialogInteractor$special$$inlined$map$4$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    m mVar = new m(vprVar, this.b);
                    tollRoadsDialogInteractor$special$$inlined$map$4$1.L$0 = null;
                    tollRoadsDialogInteractor$special$$inlined$map$4$1.L$1 = null;
                    tollRoadsDialogInteractor$special$$inlined$map$4$1.L$2 = null;
                    tollRoadsDialogInteractor$special$$inlined$map$4$1.label = 1;
                    if (this.a.collect(mVar, tollRoadsDialogInteractor$special$$inlined$map$4$1) == coroutineSingletons) {
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
        tollRoadsDialogInteractor$special$$inlined$map$4$1 = new TollRoadsDialogInteractor$special$$inlined$map$4$1(this, continuation);
        Object obj2 = tollRoadsDialogInteractor$special$$inlined$map$4$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tollRoadsDialogInteractor$special$$inlined$map$4$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
