package ru.yandex.taxi.scooters.presentation.feedback.newbie;

import android.graphics.Bitmap;
import defpackage.mvg;
import defpackage.n1o0;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.xmn0;
import defpackage.y1o0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lxmn0;", "<anonymous>", "(Ltse;)Lxmn0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.feedback.newbie.ScootersFinishInfoNewbieHeaderInteractor$createHelpItemPromotionUiState$2", f = "ScootersFeedbackCardNewbieHeaderInteractor.kt", l = {85, MSException.ERROR_INVALID_PASSWORD, MSException.ERROR_INVALID_PARAMETER}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersFinishInfoNewbieHeaderInteractor$createHelpItemPromotionUiState$2 extends SuspendLambda implements wls {
    final /* synthetic */ n1o0.c.a $helpItem;
    final /* synthetic */ y1o0 $newbieProgressInfo;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersFinishInfoNewbieHeaderInteractor$createHelpItemPromotionUiState$2(n1o0.c.a aVar, y1o0 y1o0Var, a aVar2, Continuation continuation) {
        super(2, continuation);
        this.$helpItem = aVar;
        this.$newbieProgressInfo = y1o0Var;
        this.this$0 = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersFinishInfoNewbieHeaderInteractor$createHelpItemPromotionUiState$2 scootersFinishInfoNewbieHeaderInteractor$createHelpItemPromotionUiState$2 = new ScootersFinishInfoNewbieHeaderInteractor$createHelpItemPromotionUiState$2(this.$helpItem, this.$newbieProgressInfo, this.this$0, continuation);
        scootersFinishInfoNewbieHeaderInteractor$createHelpItemPromotionUiState$2.L$0 = obj;
        return scootersFinishInfoNewbieHeaderInteractor$createHelpItemPromotionUiState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersFinishInfoNewbieHeaderInteractor$createHelpItemPromotionUiState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
    
        if (r12 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        noh h2;
        CharSequence charSequence;
        noh nohVar;
        Object k;
        CharSequence charSequence2;
        CharSequence charSequence3;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            qoh h3 = tje.h(tseVar, null, null, new ScootersFinishInfoNewbieHeaderInteractor$createHelpItemPromotionUiState$2$titleAsync$1(this.$helpItem, null, this.this$0), 3);
            h = tje.h(tseVar, null, null, new ScootersFinishInfoNewbieHeaderInteractor$createHelpItemPromotionUiState$2$subtitleAsync$1(this.$helpItem, null, this.this$0), 3);
            h2 = tje.h(tseVar, null, null, new ScootersFinishInfoNewbieHeaderInteractor$createHelpItemPromotionUiState$2$imageAsync$1(this.$helpItem, null, this.this$0), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = h2;
            this.label = 1;
            obj = h3.s(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    CharSequence charSequence4 = (CharSequence) this.L$5;
                    charSequence3 = (CharSequence) this.L$4;
                    b.b(obj);
                    charSequence2 = charSequence4;
                    Bitmap bitmap = (Bitmap) obj;
                    n1o0.c.a aVar = this.$helpItem;
                    return new xmn0(charSequence3, charSequence2, bitmap, aVar.d, aVar.e, this.$newbieProgressInfo.a);
                }
                charSequence = (CharSequence) this.L$4;
                nohVar = (noh) this.L$3;
                b.b(obj);
                CharSequence charSequence5 = (CharSequence) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = charSequence;
                this.L$5 = charSequence5;
                this.label = 3;
                k = nohVar.k(this);
                if (k != coroutineSingletons) {
                    charSequence2 = charSequence5;
                    obj = k;
                    charSequence3 = charSequence;
                    Bitmap bitmap2 = (Bitmap) obj;
                    n1o0.c.a aVar2 = this.$helpItem;
                    return new xmn0(charSequence3, charSequence2, bitmap2, aVar2.d, aVar2.e, this.$newbieProgressInfo.a);
                }
                return coroutineSingletons;
            }
            h2 = (noh) this.L$3;
            h = (noh) this.L$2;
            b.b(obj);
        }
        CharSequence charSequence6 = (CharSequence) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = h2;
        this.L$4 = charSequence6;
        this.label = 2;
        Object k2 = h.k(this);
        if (k2 != coroutineSingletons) {
            noh nohVar2 = h2;
            charSequence = charSequence6;
            obj = k2;
            nohVar = nohVar2;
            CharSequence charSequence52 = (CharSequence) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = charSequence;
            this.L$5 = charSequence52;
            this.label = 3;
            k = nohVar.k(this);
            if (k != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
