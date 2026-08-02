package ru.yandex.taxi.web.deeplink;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.web.deeplink.WebViewFromDeeplinkRouter", f = "WebViewFromDeeplinkRouter.kt", l = {HProv.ALG_SID_KECCAK_256, 90, HProv.PP_DHOID}, m = "launchUnsafe", v = 2)
/* loaded from: classes6.dex */
final class WebViewFromDeeplinkRouter$launchUnsafe$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewFromDeeplinkRouter$launchUnsafe$1(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return m.P(this.this$0, null, this);
    }
}
