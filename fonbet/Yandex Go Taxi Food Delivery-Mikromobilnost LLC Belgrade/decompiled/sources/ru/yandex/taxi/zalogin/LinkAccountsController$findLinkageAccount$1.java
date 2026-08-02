package ru.yandex.taxi.zalogin;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.zalogin.LinkAccountsController", f = "LinkAccountsController.kt", l = {HProv.PP_RESERVED1, HProv.PP_RESERVED1}, m = "findLinkageAccount", v = 2)
/* loaded from: classes10.dex */
final class LinkAccountsController$findLinkageAccount$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkAccountsController$findLinkageAccount$1(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return j.a(this.this$0, this);
    }
}
