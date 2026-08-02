package ru.yandex.taxi.scooters.presentation.feedback.newbie;

import defpackage.bvf0;
import defpackage.mvg;
import defpackage.n1o0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.y1o0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lxmn0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.feedback.newbie.ScootersFinishInfoNewbieHeaderInteractor$newbieFlow$1$1", f = "ScootersFeedbackCardNewbieHeaderInteractor.kt", l = {52, 52}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersFinishInfoNewbieHeaderInteractor$newbieFlow$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ y1o0 $newbieProgressInfo;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersFinishInfoNewbieHeaderInteractor$newbieFlow$1$1(a aVar, y1o0 y1o0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$newbieProgressInfo = y1o0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersFinishInfoNewbieHeaderInteractor$newbieFlow$1$1 scootersFinishInfoNewbieHeaderInteractor$newbieFlow$1$1 = new ScootersFinishInfoNewbieHeaderInteractor$newbieFlow$1$1(this.this$0, this.$newbieProgressInfo, continuation);
        scootersFinishInfoNewbieHeaderInteractor$newbieFlow$1$1.L$0 = obj;
        return scootersFinishInfoNewbieHeaderInteractor$newbieFlow$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersFinishInfoNewbieHeaderInteractor$newbieFlow$1$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r8 == r1) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            y1o0 y1o0Var = this.$newbieProgressInfo;
            this.L$0 = null;
            this.L$1 = vprVar;
            this.label = 1;
            aVar.getClass();
            n1o0.c.a aVar2 = y1o0Var.b.e;
            obj = aVar2 == null ? null : bvf0.n(new ScootersFinishInfoNewbieHeaderInteractor$createHelpItemPromotionUiState$2(aVar2, y1o0Var, aVar, null), this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$1;
            b.b(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
