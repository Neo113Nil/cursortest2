package ru.yandex.taxi.logistics.sdk.photocomments.domain;

import com.yandex.delivery.utils.dialogmanager.api.DialogType;
import defpackage.c0i0;
import defpackage.e100;
import defpackage.ekb0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qej;
import defpackage.tse;
import defpackage.wls;
import defpackage.yuj0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.photocomments.domain.PhotocommentsInteractorImpl$showMaxPhotosDialog$1", f = "PhotocommentsInteractorImpl.kt", l = {HProv.PP_SIGNATUREOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PhotocommentsInteractorImpl$showMaxPhotosDialog$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotocommentsInteractorImpl$showMaxPhotosDialog$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PhotocommentsInteractorImpl$showMaxPhotosDialog$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PhotocommentsInteractorImpl$showMaxPhotosDialog$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e100 e100Var = this.this$0.h;
        this.label = 1;
        ((ekb0) e100Var.w).w();
        yuj0 yuj0Var = (yuj0) e100Var.c;
        Object a = ((com.yandex.delivery.utils.dialogmanager.impl.b) e100Var.b).a(new qej(yuj0Var.a(c0i0.delivery_photocomment_max_amount_dialog_title, new Object[0]), yuj0Var.a(c0i0.delivery_photocomment_max_amount_dialog_message, new Object[0]), yuj0Var.a(c0i0.delivery_photocomment_max_amount_dialog_ok_button, new Object[0]), null, null, false, null, DialogType.MODAL, 120), this);
        if (a != coroutineSingletons) {
            a = zy11Var;
        }
        return a == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
