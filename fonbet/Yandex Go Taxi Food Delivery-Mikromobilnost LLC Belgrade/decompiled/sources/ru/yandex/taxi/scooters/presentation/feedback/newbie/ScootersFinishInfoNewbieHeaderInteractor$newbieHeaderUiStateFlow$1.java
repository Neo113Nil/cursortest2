package ru.yandex.taxi.scooters.presentation.feedback.newbie;

import android.graphics.Bitmap;
import defpackage.bvf0;
import defpackage.cln0;
import defpackage.mvg;
import defpackage.n1o0;
import defpackage.noh;
import defpackage.nsz;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lcln0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.feedback.newbie.ScootersFinishInfoNewbieHeaderInteractor$newbieHeaderUiStateFlow$1", f = "ScootersFeedbackCardNewbieHeaderInteractor.kt", l = {100}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersFinishInfoNewbieHeaderInteractor$newbieHeaderUiStateFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $newbieFlowProgressStep;
    final /* synthetic */ n1o0.c $newbieProgressInfo;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.scooters.presentation.feedback.newbie.ScootersFinishInfoNewbieHeaderInteractor$newbieHeaderUiStateFlow$1$1", f = "ScootersFeedbackCardNewbieHeaderInteractor.kt", l = {HProv.PP_CONTAINER_EXTENSION, HProv.PP_ENUM_CONTAINER_EXTENSION, HProv.PP_CONTAINER_DEFAULT, HProv.PP_CONTAINER_STATUS, 148, 159, 161}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.scooters.presentation.feedback.newbie.ScootersFinishInfoNewbieHeaderInteractor$newbieHeaderUiStateFlow$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ vpr $$this$flow;
        final /* synthetic */ int $newbieFlowProgressStep;
        final /* synthetic */ n1o0.c $newbieProgressInfo;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(vpr vprVar, int i, a aVar, n1o0.c cVar, Continuation continuation) {
            super(2, continuation);
            this.$$this$flow = vprVar;
            this.$newbieFlowProgressStep = i;
            this.this$0 = aVar;
            this.$newbieProgressInfo = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$flow, this.$newbieFlowProgressStep, this.this$0, this.$newbieProgressInfo, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0211, code lost:
        
            if (r12.emit(r5, r11) == r1) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x01e7, code lost:
        
            if (r12 == r1) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x019a, code lost:
        
            if (r12 == r1) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0132, code lost:
        
            if (r12 == r1) goto L46;
         */
        /* JADX WARN: Removed duplicated region for block: B:34:0x015a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            noh h;
            noh h2;
            noh h3;
            CharSequence charSequence;
            CharSequence charSequence2;
            noh nohVar;
            noh nohVar2;
            CharSequence charSequence3;
            CharSequence charSequence4;
            Bitmap bitmap;
            CharSequence charSequence5;
            CharSequence charSequence6;
            noh nohVar3;
            Bitmap bitmap2;
            tse tseVar = (tse) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            switch (this.label) {
                case 0:
                    b.b(obj);
                    qoh h4 = tje.h(tseVar, null, null, new ScootersFinishInfoNewbieHeaderInteractor$newbieHeaderUiStateFlow$1$1$titleAsync$1(this.$newbieProgressInfo, null, this.this$0), 3);
                    h = tje.h(tseVar, null, null, new ScootersFinishInfoNewbieHeaderInteractor$newbieHeaderUiStateFlow$1$1$subtitleAsync$1(this.$newbieProgressInfo, null, this.this$0), 3);
                    h2 = tje.h(tseVar, null, null, new ScootersFinishInfoNewbieHeaderInteractor$newbieHeaderUiStateFlow$1$1$imageAsync$1(this.$newbieProgressInfo, null, this.this$0), 3);
                    h3 = tje.h(tseVar, null, null, new ScootersFinishInfoNewbieHeaderInteractor$newbieHeaderUiStateFlow$1$1$lottieCompositionAsync$1(this.$newbieProgressInfo, this.this$0, h2, null), 3);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = h;
                    this.L$3 = h2;
                    this.L$4 = h3;
                    this.label = 1;
                    obj = h4.s(this);
                    break;
                case 1:
                    h3 = (noh) this.L$4;
                    h2 = (noh) this.L$3;
                    h = (noh) this.L$2;
                    b.b(obj);
                    CharSequence charSequence7 = (CharSequence) obj;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = h2;
                    this.L$4 = h3;
                    this.L$5 = charSequence7;
                    this.label = 2;
                    Object k = h.k(this);
                    if (k != coroutineSingletons) {
                        charSequence = charSequence7;
                        obj = k;
                        charSequence2 = (CharSequence) obj;
                        if (h2.isActive()) {
                            vpr vprVar = this.$$this$flow;
                            cln0 cln0Var = new cln0(charSequence, charSequence2, this.$newbieFlowProgressStep, null, null);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = h2;
                            this.L$4 = h3;
                            this.L$5 = charSequence;
                            this.L$6 = charSequence2;
                            this.label = 3;
                            if (vprVar.emit(cln0Var, this) != coroutineSingletons) {
                                nohVar = h3;
                                nohVar2 = h2;
                                charSequence3 = charSequence;
                                charSequence4 = charSequence2;
                                charSequence2 = charSequence4;
                                charSequence = charSequence3;
                                h3 = nohVar;
                                h2 = nohVar2;
                            }
                        }
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = h3;
                        this.L$5 = charSequence;
                        this.L$6 = charSequence2;
                        this.label = 4;
                        obj = h2.k(this);
                        break;
                    }
                    return coroutineSingletons;
                case 2:
                    CharSequence charSequence8 = (CharSequence) this.L$5;
                    noh nohVar4 = (noh) this.L$4;
                    noh nohVar5 = (noh) this.L$3;
                    b.b(obj);
                    charSequence = charSequence8;
                    h3 = nohVar4;
                    h2 = nohVar5;
                    charSequence2 = (CharSequence) obj;
                    if (h2.isActive()) {
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = h3;
                    this.L$5 = charSequence;
                    this.L$6 = charSequence2;
                    this.label = 4;
                    obj = h2.k(this);
                    break;
                case 3:
                    charSequence4 = (CharSequence) this.L$6;
                    charSequence3 = (CharSequence) this.L$5;
                    nohVar = (noh) this.L$4;
                    nohVar2 = (noh) this.L$3;
                    b.b(obj);
                    charSequence2 = charSequence4;
                    charSequence = charSequence3;
                    h3 = nohVar;
                    h2 = nohVar2;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = h3;
                    this.L$5 = charSequence;
                    this.L$6 = charSequence2;
                    this.label = 4;
                    obj = h2.k(this);
                    break;
                case 4:
                    CharSequence charSequence9 = (CharSequence) this.L$6;
                    CharSequence charSequence10 = (CharSequence) this.L$5;
                    noh nohVar6 = (noh) this.L$4;
                    b.b(obj);
                    charSequence2 = charSequence9;
                    charSequence = charSequence10;
                    h3 = nohVar6;
                    bitmap = (Bitmap) obj;
                    if (bitmap != null) {
                        vpr vprVar2 = this.$$this$flow;
                        cln0 cln0Var2 = new cln0(charSequence, charSequence2, this.$newbieFlowProgressStep, bitmap, null);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = h3;
                        this.L$5 = charSequence;
                        this.L$6 = charSequence2;
                        this.L$7 = bitmap;
                        this.label = 5;
                        if (vprVar2.emit(cln0Var2, this) != coroutineSingletons) {
                            nohVar3 = h3;
                            charSequence5 = charSequence;
                            charSequence6 = charSequence2;
                            bitmap2 = bitmap;
                            bitmap = bitmap2;
                            h3 = nohVar3;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = charSequence5;
                            this.L$6 = charSequence6;
                            this.L$7 = bitmap;
                            this.label = 6;
                            obj = h3.k(this);
                            break;
                        }
                        return coroutineSingletons;
                    }
                    charSequence5 = charSequence;
                    charSequence6 = charSequence2;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = charSequence5;
                    this.L$6 = charSequence6;
                    this.L$7 = bitmap;
                    this.label = 6;
                    obj = h3.k(this);
                case 5:
                    bitmap2 = (Bitmap) this.L$7;
                    charSequence6 = (CharSequence) this.L$6;
                    charSequence5 = (CharSequence) this.L$5;
                    nohVar3 = (noh) this.L$4;
                    b.b(obj);
                    bitmap = bitmap2;
                    h3 = nohVar3;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = charSequence5;
                    this.L$6 = charSequence6;
                    this.L$7 = bitmap;
                    this.label = 6;
                    obj = h3.k(this);
                    break;
                case 6:
                    Bitmap bitmap3 = (Bitmap) this.L$7;
                    charSequence6 = (CharSequence) this.L$6;
                    charSequence5 = (CharSequence) this.L$5;
                    b.b(obj);
                    bitmap = bitmap3;
                    CharSequence charSequence11 = charSequence6;
                    CharSequence charSequence12 = charSequence5;
                    nsz nszVar = (nsz) obj;
                    if (nszVar != null) {
                        vpr vprVar3 = this.$$this$flow;
                        cln0 cln0Var3 = new cln0(charSequence12, charSequence11, this.$newbieFlowProgressStep, bitmap, nszVar);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.L$7 = null;
                        this.L$8 = null;
                        this.label = 7;
                        break;
                    }
                    return zy11.a;
                case 7:
                    b.b(obj);
                    return zy11.a;
                default:
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersFinishInfoNewbieHeaderInteractor$newbieHeaderUiStateFlow$1(int i, a aVar, n1o0.c cVar, Continuation continuation) {
        super(2, continuation);
        this.$newbieFlowProgressStep = i;
        this.this$0 = aVar;
        this.$newbieProgressInfo = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersFinishInfoNewbieHeaderInteractor$newbieHeaderUiStateFlow$1 scootersFinishInfoNewbieHeaderInteractor$newbieHeaderUiStateFlow$1 = new ScootersFinishInfoNewbieHeaderInteractor$newbieHeaderUiStateFlow$1(this.$newbieFlowProgressStep, this.this$0, this.$newbieProgressInfo, continuation);
        scootersFinishInfoNewbieHeaderInteractor$newbieHeaderUiStateFlow$1.L$0 = obj;
        return scootersFinishInfoNewbieHeaderInteractor$newbieHeaderUiStateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersFinishInfoNewbieHeaderInteractor$newbieHeaderUiStateFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(vprVar, this.$newbieFlowProgressStep, this.this$0, this.$newbieProgressInfo, null);
            this.L$0 = null;
            this.label = 1;
            if (bvf0.n(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
