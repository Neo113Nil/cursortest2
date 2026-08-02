package ru.yandex.taxi.logistics.sdk;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.logistics.sdk.LogisticsDialogManagerDelegate", f = "LogisticsDialogManagerDelegate.kt", l = {HProv.ALG_SID_NO_HASH}, m = "showAlertDialog", v = 2)
/* loaded from: classes5.dex */
final class LogisticsDialogManagerDelegate$showAlertDialog$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogisticsDialogManagerDelegate$showAlertDialog$1(k kVar, Continuation continuation) {
        super(continuation);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return k.d(this.this$0, null, this);
    }
}
