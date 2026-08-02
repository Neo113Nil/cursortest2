package ru.yandex.taxi.masstransit.domain;

import defpackage.jl40;
import defpackage.kq30;
import defpackage.mq30;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wc30;
import defpackage.wn30;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.masstransit.model.MtAnimationSourceType;

/* loaded from: classes6.dex */
public final class i implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ mq30 b;

    public i(vpr vprVar, mq30 mq30Var) {
        this.a = vprVar;
        this.b = mq30Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtObjectsOverMapInteractorImpl$filterPromos$$inlined$map$1$2$1 mtObjectsOverMapInteractorImpl$filterPromos$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof MtObjectsOverMapInteractorImpl$filterPromos$$inlined$map$1$2$1) {
            mtObjectsOverMapInteractorImpl$filterPromos$$inlined$map$1$2$1 = (MtObjectsOverMapInteractorImpl$filterPromos$$inlined$map$1$2$1) continuation;
            int i2 = mtObjectsOverMapInteractorImpl$filterPromos$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtObjectsOverMapInteractorImpl$filterPromos$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mtObjectsOverMapInteractorImpl$filterPromos$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtObjectsOverMapInteractorImpl$filterPromos$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : (List) obj) {
                        kq30 kq30Var = (kq30) obj3;
                        this.b.getClass();
                        String str = kq30Var.a;
                        wc30 wc30Var = kq30Var.c;
                        if (!jl40.l(str, "") && wc30Var != null && kq30Var.f != null && kq30Var.b != null) {
                            if ((wc30Var != null ? wc30Var.a() : null) != MtAnimationSourceType.LOTTIE_ANIMATION || ((wn30) wc30Var).d != null) {
                                arrayList.add(obj3);
                            }
                        }
                    }
                    mtObjectsOverMapInteractorImpl$filterPromos$$inlined$map$1$2$1.L$0 = null;
                    mtObjectsOverMapInteractorImpl$filterPromos$$inlined$map$1$2$1.L$1 = null;
                    mtObjectsOverMapInteractorImpl$filterPromos$$inlined$map$1$2$1.L$2 = null;
                    mtObjectsOverMapInteractorImpl$filterPromos$$inlined$map$1$2$1.L$3 = null;
                    mtObjectsOverMapInteractorImpl$filterPromos$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(arrayList, mtObjectsOverMapInteractorImpl$filterPromos$$inlined$map$1$2$1) == coroutineSingletons) {
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
        mtObjectsOverMapInteractorImpl$filterPromos$$inlined$map$1$2$1 = new MtObjectsOverMapInteractorImpl$filterPromos$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mtObjectsOverMapInteractorImpl$filterPromos$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtObjectsOverMapInteractorImpl$filterPromos$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
