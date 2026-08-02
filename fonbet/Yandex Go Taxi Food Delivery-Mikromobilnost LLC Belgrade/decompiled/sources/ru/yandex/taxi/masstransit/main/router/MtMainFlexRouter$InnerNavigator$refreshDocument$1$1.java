package ru.yandex.taxi.masstransit.main.router;

import defpackage.bo30;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s14;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.main.router.MtMainFlexRouter$InnerNavigator$refreshDocument$1$1", f = "MtMainFlexRouter.kt", l = {209, 210}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtMainFlexRouter$InnerNavigator$refreshDocument$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ bo30 $component;
    final /* synthetic */ boolean $withShimmer;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtMainFlexRouter$InnerNavigator$refreshDocument$1$1(boolean z, bo30 bo30Var, Continuation continuation) {
        super(2, continuation);
        this.$withShimmer = z;
        this.$component = bo30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtMainFlexRouter$InnerNavigator$refreshDocument$1$1(this.$withShimmer, this.$component, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtMainFlexRouter$InnerNavigator$refreshDocument$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r6.a(r5) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r6.b(r5) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            boolean z = this.$withShimmer;
            if (z) {
                ru.yandex.taxi.masstransit.main.flex.b a = ((s14) this.$component).a();
                this.label = 1;
            } else {
                if (z) {
                    w511.b();
                    return null;
                }
                ru.yandex.taxi.masstransit.main.flex.b a2 = ((s14) this.$component).a();
                this.label = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
