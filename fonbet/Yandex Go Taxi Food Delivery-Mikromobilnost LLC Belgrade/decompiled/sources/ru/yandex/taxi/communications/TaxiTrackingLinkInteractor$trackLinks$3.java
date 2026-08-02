package ru.yandex.taxi.communications;

import android.webkit.URLUtil;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.communications.TaxiTrackingLinkInteractor$trackLinks$3", f = "TaxiTrackingLinkInteractor.kt", l = {33}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class TaxiTrackingLinkInteractor$trackLinks$3 extends SuspendLambda implements wls {
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiTrackingLinkInteractor$trackLinks$3(String str, q qVar, Continuation continuation) {
        super(2, continuation);
        this.$url = str;
        this.this$0 = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiTrackingLinkInteractor$trackLinks$3(this.$url, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiTrackingLinkInteractor$trackLinks$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (URLUtil.isValidUrl(this.$url)) {
                ru.yandex.taxi.communications.common.repository.b bVar = (ru.yandex.taxi.communications.common.repository.b) this.this$0.c.get();
                String str = this.$url;
                this.label = 1;
                if (bVar.a(str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
