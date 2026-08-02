package ru.yandex.taxi.communications.benefitscenter;

import android.graphics.Bitmap;
import defpackage.cu4;
import defpackage.eu4;
import defpackage.fu4;
import defpackage.kbv;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.obv;
import defpackage.qbv;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zt4;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.communications.benefitscenter.BenefitsCenterNotificationManagerImpl$show$2", f = "BenefitsCenterNotificationManagerImpl.kt", l = {41}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class BenefitsCenterNotificationManagerImpl$show$2 extends SuspendLambda implements wls {
    final /* synthetic */ fu4 $image;
    final /* synthetic */ BenefitsCenterNotification $notification;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenefitsCenterNotificationManagerImpl$show$2(b bVar, fu4 fu4Var, BenefitsCenterNotification benefitsCenterNotification, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$image = fu4Var;
        this.$notification = benefitsCenterNotification;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BenefitsCenterNotificationManagerImpl$show$2(this.this$0, this.$image, this.$notification, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BenefitsCenterNotificationManagerImpl$show$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kbv kbvVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0.c;
            fu4 fu4Var = this.$image;
            this.label = 1;
            aVar.getClass();
            if (fu4Var instanceof zt4) {
                kbvVar = new qbv(((zt4) fu4Var).a);
            } else if (fu4Var instanceof cu4) {
                kbvVar = new obv(((cu4) fu4Var).a, null, 6, 0);
            } else {
                if (!(fu4Var instanceof eu4)) {
                    w511.b();
                    return null;
                }
                kbvVar = null;
            }
            obj = kbvVar == null ? null : aVar.a(kbvVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            this.$notification.setImage(bitmap);
        }
        return zy11.a;
    }
}
