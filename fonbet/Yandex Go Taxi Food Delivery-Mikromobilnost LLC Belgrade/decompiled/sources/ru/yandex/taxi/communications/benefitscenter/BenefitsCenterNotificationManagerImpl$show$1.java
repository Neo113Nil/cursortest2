package ru.yandex.taxi.communications.benefitscenter;

import android.graphics.Bitmap;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qbv;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.communications.benefitscenter.BenefitsCenterNotificationManagerImpl$show$1", f = "BenefitsCenterNotificationManagerImpl.kt", l = {30}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class BenefitsCenterNotificationManagerImpl$show$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $imageUrl;
    final /* synthetic */ BenefitsCenterNotification $notification;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenefitsCenterNotificationManagerImpl$show$1(b bVar, String str, BenefitsCenterNotification benefitsCenterNotification, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$imageUrl = str;
        this.$notification = benefitsCenterNotification;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BenefitsCenterNotificationManagerImpl$show$1(this.this$0, this.$imageUrl, this.$notification, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BenefitsCenterNotificationManagerImpl$show$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0.c;
            String str = this.$imageUrl;
            this.label = 1;
            aVar.getClass();
            obj = aVar.a(new qbv(str), this);
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
