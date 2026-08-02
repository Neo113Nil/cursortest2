package ru.yandex.taxi.masstransit.main.ui.modal;

import defpackage.gci0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class b implements tpr {
    public final /* synthetic */ gci0 a;

    public b(gci0 gci0Var) {
        this.a = gci0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MtMainFlexPresenter$attachView$$inlined$map$1$1 mtMainFlexPresenter$attachView$$inlined$map$1$1;
        int i;
        if (continuation instanceof MtMainFlexPresenter$attachView$$inlined$map$1$1) {
            mtMainFlexPresenter$attachView$$inlined$map$1$1 = (MtMainFlexPresenter$attachView$$inlined$map$1$1) continuation;
            int i2 = mtMainFlexPresenter$attachView$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtMainFlexPresenter$attachView$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtMainFlexPresenter$attachView$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtMainFlexPresenter$attachView$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar);
                    mtMainFlexPresenter$attachView$$inlined$map$1$1.L$0 = null;
                    mtMainFlexPresenter$attachView$$inlined$map$1$1.L$1 = null;
                    mtMainFlexPresenter$attachView$$inlined$map$1$1.L$2 = null;
                    mtMainFlexPresenter$attachView$$inlined$map$1$1.label = 1;
                    if (this.a.a.collect(aVar, mtMainFlexPresenter$attachView$$inlined$map$1$1) == coroutineSingletons) {
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
        mtMainFlexPresenter$attachView$$inlined$map$1$1 = new MtMainFlexPresenter$attachView$$inlined$map$1$1(this, continuation);
        Object obj2 = mtMainFlexPresenter$attachView$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtMainFlexPresenter$attachView$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
