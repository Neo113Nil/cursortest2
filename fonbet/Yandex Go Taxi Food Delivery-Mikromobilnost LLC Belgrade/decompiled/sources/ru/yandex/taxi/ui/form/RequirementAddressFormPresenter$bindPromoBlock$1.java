package ru.yandex.taxi.ui.form;

import android.graphics.Bitmap;
import defpackage.bcj0;
import defpackage.dcj0;
import defpackage.g16;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.obv;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.ui.form.RequirementAddressFormPresenter$bindPromoBlock$1", f = "RequirementAddressFormPresenter.kt", l = {HProv.PP_INFO}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RequirementAddressFormPresenter$bindPromoBlock$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $imageTag;
    int label;
    final /* synthetic */ dcj0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequirementAddressFormPresenter$bindPromoBlock$1(dcj0 dcj0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dcj0Var;
        this.$imageTag = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RequirementAddressFormPresenter$bindPromoBlock$1(this.this$0, this.$imageTag, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RequirementAddressFormPresenter$bindPromoBlock$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Bitmap bitmap = null;
        try {
            if (i == 0) {
                b.b(obj);
                g16 i2 = this.this$0.E.b().i(new obv(this.$imageTag, null, 6, 0));
                this.label = 1;
                obj = i2.a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
            bitmap = (Bitmap) obj;
        } catch (Throwable th) {
            jst.e.j(th);
        }
        ((bcj0) this.this$0.Dg()).Wb(bitmap);
        return zy11.a;
    }
}
