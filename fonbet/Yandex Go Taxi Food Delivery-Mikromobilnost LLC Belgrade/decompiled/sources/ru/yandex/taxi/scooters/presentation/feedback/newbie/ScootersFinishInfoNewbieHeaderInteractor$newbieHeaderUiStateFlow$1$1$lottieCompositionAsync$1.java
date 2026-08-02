package ru.yandex.taxi.scooters.presentation.feedback.newbie;

import defpackage.mvg;
import defpackage.n1o0;
import defpackage.noh;
import defpackage.nsz;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.ytz;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lnsz;", "<anonymous>", "(Ltse;)Lnsz;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.feedback.newbie.ScootersFinishInfoNewbieHeaderInteractor$newbieHeaderUiStateFlow$1$1$lottieCompositionAsync$1", f = "ScootersFeedbackCardNewbieHeaderInteractor.kt", l = {122, HProv.PP_DELETE_SAVED_PASSWD}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersFinishInfoNewbieHeaderInteractor$newbieHeaderUiStateFlow$1$1$lottieCompositionAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ noh $imageAsync;
    final /* synthetic */ n1o0.c $newbieProgressInfo;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersFinishInfoNewbieHeaderInteractor$newbieHeaderUiStateFlow$1$1$lottieCompositionAsync$1(n1o0.c cVar, a aVar, noh nohVar, Continuation continuation) {
        super(2, continuation);
        this.$newbieProgressInfo = cVar;
        this.this$0 = aVar;
        this.$imageAsync = nohVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersFinishInfoNewbieHeaderInteractor$newbieHeaderUiStateFlow$1$1$lottieCompositionAsync$1(this.$newbieProgressInfo, this.this$0, this.$imageAsync, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersFinishInfoNewbieHeaderInteractor$newbieHeaderUiStateFlow$1$1$lottieCompositionAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        if (r6 == r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0062 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        nsz nszVar;
        nsz nszVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            String str = this.$newbieProgressInfo.d;
            if (str == null || str.length() == 0) {
                nszVar = null;
                if (nszVar != null) {
                    return nszVar;
                }
                noh nohVar = this.$imageAsync;
                this.L$0 = null;
                this.L$1 = nszVar;
                this.label = 2;
                Object k = nohVar.k(this);
                if (k != coroutineSingletons) {
                    nszVar2 = nszVar;
                    obj = k;
                    if (obj != null) {
                    }
                }
                return coroutineSingletons;
            }
            ytz ytzVar = this.this$0.c;
            this.L$0 = null;
            this.label = 1;
            obj = ((com.yandex.go.lottie_loader.a) ytzVar).a(str, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                nszVar2 = (nsz) this.L$1;
                b.b(obj);
                if (obj != null) {
                    return null;
                }
                return nszVar2;
            }
            b.b(obj);
        }
        nszVar = (nsz) obj;
        if (nszVar != null) {
        }
    }
}
