package com.squareup.cash.afterpayapplet.presenters;

import com.squareup.cash.activity.views.ActivityTabViewKt$ActivityTab$5$1$3;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class FilteredActivitiesManager$activities$$inlined$map$1$2$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ActivityTabViewKt$ActivityTab$5$1$3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilteredActivitiesManager$activities$$inlined$map$1$2$1(ActivityTabViewKt$ActivityTab$5$1$3 activityTabViewKt$ActivityTab$5$1$3, Continuation continuation) {
        super(continuation);
        this.this$0 = activityTabViewKt$ActivityTab$5$1$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit((Object) null, this);
    }
}
