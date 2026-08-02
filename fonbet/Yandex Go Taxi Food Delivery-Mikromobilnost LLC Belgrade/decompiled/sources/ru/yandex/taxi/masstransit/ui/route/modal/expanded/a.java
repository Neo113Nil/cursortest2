package ru.yandex.taxi.masstransit.ui.route.modal.expanded;

import defpackage.lj30;
import defpackage.n1j;
import defpackage.ny61;
import defpackage.oov0;
import defpackage.pd01;
import defpackage.rw30;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ lj30 b;

    public a(vpr vprVar, lj30 lj30Var) {
        this.a = vprVar;
        this.b = lj30Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ac, code lost:
    
        if (r10.emit(r12, r7) != r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ae, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
    
        if (r12 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1 mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof MtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1) {
            mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1 = (MtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                MtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1 mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$12 = mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1;
                Object obj2 = mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Pair pair = (Pair) obj;
                    n1j n1jVar = (n1j) pair.getFirst();
                    Set set = (Set) pair.getSecond();
                    ru.yandex.taxi.masstransit.mapper.b bVar = this.b.z;
                    rw30 rw30Var = n1jVar.b;
                    pd01 pd01Var = rw30Var.f;
                    oov0 oov0Var = pd01Var.b;
                    ru.yandex.taxi.masstransit.geopayment.tickets.model.a aVar = rw30Var.h;
                    boolean z = pd01Var.a;
                    mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$12.L$0 = null;
                    mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$12.L$1 = null;
                    mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$12.L$2 = null;
                    mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$12.L$3 = null;
                    vprVar = this.a;
                    mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$12.L$4 = vprVar;
                    mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$12.L$5 = null;
                    mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$12.L$6 = null;
                    mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$12.L$7 = null;
                    mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$12.label = 1;
                    obj2 = bVar.a(n1jVar, oov0Var, aVar, set, z, mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar = (vpr) mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$12.L$4;
                    kotlin.b.b(obj2);
                }
                mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$12.L$0 = null;
                mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$12.L$1 = null;
                mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$12.L$2 = null;
                mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$12.L$3 = null;
                mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$12.L$4 = null;
                mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$12.L$5 = null;
                mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$12.L$6 = null;
                mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$12.L$7 = null;
                mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$12.label = 2;
            }
        }
        mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1 = new MtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        MtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1 mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$122 = mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1;
        Object obj22 = mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$122.label;
        if (i != 0) {
        }
        mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$122.L$0 = null;
        mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$122.L$1 = null;
        mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$122.L$2 = null;
        mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$122.L$3 = null;
        mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$122.L$4 = null;
        mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$122.L$5 = null;
        mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$122.L$6 = null;
        mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$122.L$7 = null;
        mtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$122.label = 2;
    }
}
