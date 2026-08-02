package ru.yandex.taxi.search.address.view;

import defpackage.jst;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.pjs;
import defpackage.qjs;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.search.address.view.FullscreenDestinationSearchPresenter$selectShowingAnimation$1", f = "FullscreenDestinationSearchPresenter.kt", l = {39, 44}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class FullscreenDestinationSearchPresenter$selectShowingAnimation$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $expandableAnimationMinDelay;
    final /* synthetic */ boolean $expandableAnimationNeeded;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ qjs this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullscreenDestinationSearchPresenter$selectShowingAnimation$1(boolean z, qjs qjsVar, long j, Continuation continuation) {
        super(2, continuation);
        this.$expandableAnimationNeeded = z;
        this.this$0 = qjsVar;
        this.$expandableAnimationMinDelay = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FullscreenDestinationSearchPresenter$selectShowingAnimation$1 fullscreenDestinationSearchPresenter$selectShowingAnimation$1 = new FullscreenDestinationSearchPresenter$selectShowingAnimation$1(this.$expandableAnimationNeeded, this.this$0, this.$expandableAnimationMinDelay, continuation);
        fullscreenDestinationSearchPresenter$selectShowingAnimation$1.L$0 = obj;
        return fullscreenDestinationSearchPresenter$selectShowingAnimation$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FullscreenDestinationSearchPresenter$selectShowingAnimation$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (r11.u0(r10) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[Catch: all -> 0x001c, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0018, B:8:0x006d, B:11:0x0079, B:20:0x0028, B:21:0x0050, B:23:0x005e, B:27:0x003b, B:29:0x003f), top: B:2:0x000c }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        l8x N;
        l8x l8xVar;
        int i;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        boolean z = true;
        try {
        } catch (Throwable th) {
            jst.e.j(th);
            ((pjs) this.this$0.Dg()).X3(false);
        }
        if (i2 == 0) {
            kotlin.b.b(obj);
            N = tje.N(tseVar, null, null, new FullscreenDestinationSearchPresenter$selectShowingAnimation$1$minDelayJob$1(this.$expandableAnimationMinDelay, null), 3);
            if (!this.$expandableAnimationNeeded) {
                l8xVar = N;
                i = 0;
                if (i != 0) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.I$0 = i;
                    this.label = 2;
                }
                pjs pjsVar = (pjs) this.this$0.Dg();
                if (i == 0) {
                }
                pjsVar.X3(z);
                return zy11.a;
            }
            noh nohVar = this.this$0.y;
            this.L$0 = null;
            this.L$1 = N;
            this.label = 1;
            obj = nohVar.k(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.I$0;
                kotlin.b.b(obj);
                pjs pjsVar2 = (pjs) this.this$0.Dg();
                if (i == 0) {
                    z = false;
                }
                pjsVar2.X3(z);
                return zy11.a;
            }
            N = (l8x) this.L$1;
            kotlin.b.b(obj);
        }
        l8x l8xVar2 = N;
        i = ((Boolean) obj).booleanValue() ? 1 : 0;
        l8xVar = l8xVar2;
        if (i != 0) {
        }
        pjs pjsVar22 = (pjs) this.this$0.Dg();
        if (i == 0) {
        }
        pjsVar22.X3(z);
        return zy11.a;
    }
}
