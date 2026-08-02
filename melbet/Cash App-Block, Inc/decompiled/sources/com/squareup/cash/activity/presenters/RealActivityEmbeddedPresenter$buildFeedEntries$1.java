package com.squareup.cash.activity.presenters;

import com.squareup.cash.activity.backend.loader.Activities;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class RealActivityEmbeddedPresenter$buildFeedEntries$1 extends ContinuationImpl {
    public Activities L$0;
    public ListBuilder L$1;
    public ListBuilder L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealActivityEmbeddedPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealActivityEmbeddedPresenter$buildFeedEntries$1(RealActivityEmbeddedPresenter realActivityEmbeddedPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realActivityEmbeddedPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealActivityEmbeddedPresenter.access$buildFeedEntries(this.this$0, null, this);
    }
}
