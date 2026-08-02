package ru.domesticroots.certificatetransparency.datasource;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@mvg(c = "ru.domesticroots.certificatetransparency.datasource.DataSource$oneWayTransform$1", f = "DataSource.kt", l = {HProv.PP_NK_SYNC}, m = "get")
/* loaded from: classes4.dex */
final class DataSource$oneWayTransform$1$get$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataSource$oneWayTransform$1$get$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(this);
    }
}
