package com.squareup.cash.pools.views.animation;

import com.squareup.cash.pools.views.animation.GoalMetTimeline;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class GoalMetTimeline$play$1 extends ContinuationImpl {
    public long J$0;
    public GoalMetTimeline.Step L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GoalMetTimeline this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalMetTimeline$play$1(GoalMetTimeline goalMetTimeline, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = goalMetTimeline;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.play(0L, this);
    }
}
