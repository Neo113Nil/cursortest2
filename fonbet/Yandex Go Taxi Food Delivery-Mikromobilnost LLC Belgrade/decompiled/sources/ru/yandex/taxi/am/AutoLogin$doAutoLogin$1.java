package ru.yandex.taxi.am;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.am.AutoLogin", f = "AutoLogin.kt", l = {160, 162, 164, HProv.PP_EXPORT_CSP, 177}, m = "doAutoLogin", v = 2)
/* loaded from: classes5.dex */
final class AutoLogin$doAutoLogin$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoLogin$doAutoLogin$1(r rVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return r.a(this.this$0, this);
    }
}
