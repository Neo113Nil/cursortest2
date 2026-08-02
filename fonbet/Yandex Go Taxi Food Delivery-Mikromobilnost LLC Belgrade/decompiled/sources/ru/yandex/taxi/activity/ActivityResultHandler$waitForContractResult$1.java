package ru.yandex.taxi.activity;

import defpackage.mvg;
import defpackage.z30;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.activity.ActivityResultHandler", f = "ActivityResultHandler.kt", l = {81}, m = "waitForContractResult", v = 2)
/* loaded from: classes5.dex */
final class ActivityResultHandler$waitForContractResult$1<T extends z30> extends ContinuationImpl {
    int I$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityResultHandler$waitForContractResult$1(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(0, this);
    }
}
