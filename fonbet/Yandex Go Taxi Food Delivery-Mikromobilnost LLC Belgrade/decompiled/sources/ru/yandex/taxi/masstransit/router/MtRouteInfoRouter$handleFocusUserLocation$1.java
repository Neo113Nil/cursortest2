package ru.yandex.taxi.masstransit.router;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.masstransit.router.MtRouteInfoRouter", f = "MtRouteInfoRouter.kt", l = {HProv.PP_PASSWD_TERM}, m = "handleFocusUserLocation", v = 2)
/* loaded from: classes6.dex */
final class MtRouteInfoRouter$handleFocusUserLocation$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtRouteInfoRouter$handleFocusUserLocation$1(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return h.U(this.this$0, this);
    }
}
