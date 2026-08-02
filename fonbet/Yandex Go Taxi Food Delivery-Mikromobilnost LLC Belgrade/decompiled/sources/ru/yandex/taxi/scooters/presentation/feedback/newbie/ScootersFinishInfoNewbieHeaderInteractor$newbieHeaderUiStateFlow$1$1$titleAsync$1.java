package ru.yandex.taxi.scooters.presentation.feedback.newbie;

import defpackage.f9s;
import defpackage.mvg;
import defpackage.n1o0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.u1o0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.feedback.newbie.ScootersFinishInfoNewbieHeaderInteractor$newbieHeaderUiStateFlow$1$1$titleAsync$1", f = "ScootersFeedbackCardNewbieHeaderInteractor.kt", l = {102, 103}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersFinishInfoNewbieHeaderInteractor$newbieHeaderUiStateFlow$1$1$titleAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ n1o0.c $newbieProgressInfo;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersFinishInfoNewbieHeaderInteractor$newbieHeaderUiStateFlow$1$1$titleAsync$1(n1o0.c cVar, Continuation continuation, a aVar) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$newbieProgressInfo = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersFinishInfoNewbieHeaderInteractor$newbieHeaderUiStateFlow$1$1$titleAsync$1(this.$newbieProgressInfo, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersFinishInfoNewbieHeaderInteractor$newbieHeaderUiStateFlow$1$1$titleAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r10 == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            u1o0 u1o0Var = this.this$0.i;
            this.label = 1;
            obj = u1o0Var.a.b(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return obj;
            }
            b.b(obj);
        }
        c cVar = this.this$0.g;
        FormattedText e = f9s.e(this.$newbieProgressInfo.b, (n1o0) obj);
        this.L$0 = null;
        this.label = 2;
        Object e2 = c.e(cVar, e, null, false, this, 30);
        return e2 == coroutineSingletons ? coroutineSingletons : e2;
    }
}
