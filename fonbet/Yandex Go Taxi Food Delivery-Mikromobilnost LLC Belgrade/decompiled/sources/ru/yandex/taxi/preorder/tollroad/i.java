package ru.yandex.taxi.preorder.tollroad;

import defpackage.ktj0;
import defpackage.ntj0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class i implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ o b;

    public i(vpr vprVar, o oVar) {
        this.a = vprVar;
        this.b = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TollRoadsDialogInteractor$special$$inlined$map$2$2$1 tollRoadsDialogInteractor$special$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof TollRoadsDialogInteractor$special$$inlined$map$2$2$1) {
            tollRoadsDialogInteractor$special$$inlined$map$2$2$1 = (TollRoadsDialogInteractor$special$$inlined$map$2$2$1) continuation;
            int i2 = tollRoadsDialogInteractor$special$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tollRoadsDialogInteractor$special$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = tollRoadsDialogInteractor$special$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tollRoadsDialogInteractor$special$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ntj0 ntj0Var = (ntj0) obj;
                    this.b.getClass();
                    ntj0Var.getClass();
                    Object obj3 = ntj0Var instanceof ktj0 ? (List) ((ktj0) ntj0Var).b : EmptyList.a;
                    tollRoadsDialogInteractor$special$$inlined$map$2$2$1.L$0 = null;
                    tollRoadsDialogInteractor$special$$inlined$map$2$2$1.L$1 = null;
                    tollRoadsDialogInteractor$special$$inlined$map$2$2$1.L$2 = null;
                    tollRoadsDialogInteractor$special$$inlined$map$2$2$1.L$3 = null;
                    tollRoadsDialogInteractor$special$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(obj3, tollRoadsDialogInteractor$special$$inlined$map$2$2$1) == coroutineSingletons) {
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
        tollRoadsDialogInteractor$special$$inlined$map$2$2$1 = new TollRoadsDialogInteractor$special$$inlined$map$2$2$1(this, continuation);
        Object obj22 = tollRoadsDialogInteractor$special$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tollRoadsDialogInteractor$special$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
