package ru.domesticroots.certificatetransparency.datasource;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@mvg(c = "ru.domesticroots.certificatetransparency.datasource.DataSource$reuseInflight$1", f = "DataSource.kt", l = {90, 99}, m = "get")
/* loaded from: classes4.dex */
final class DataSource$reuseInflight$1$get$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataSource$reuseInflight$1$get$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(this);
    }
}
