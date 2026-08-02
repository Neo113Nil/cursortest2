package ru.yandex.taxi.new_history;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.new_history.NewHistoryRouterImpl", f = "NewHistoryRouterImpl.kt", l = {MSException.ERROR_INVALID_PASSWORD}, m = "getNewHistoryUrl", v = 2)
/* loaded from: classes6.dex */
final class NewHistoryRouterImpl$getNewHistoryUrl$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewHistoryRouterImpl$getNewHistoryUrl$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.P(this.this$0, null, false, this);
    }
}
