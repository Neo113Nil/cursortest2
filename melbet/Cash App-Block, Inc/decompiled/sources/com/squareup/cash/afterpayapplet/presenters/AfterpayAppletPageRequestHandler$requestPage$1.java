package com.squareup.cash.afterpayapplet.presenters;

import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.OrderActivityData;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class AfterpayAppletPageRequestHandler$requestPage$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public long J$0;
    public OrderActivityData L$11;
    public String L$13;
    public Collection L$14;
    public String L$2;
    public ActivitiesManager.ActivityPage L$5;
    public Collection L$8;
    public Iterator L$9;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AfterpayAppletPageRequestHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterpayAppletPageRequestHandler$requestPage$1(AfterpayAppletPageRequestHandler afterpayAppletPageRequestHandler, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = afterpayAppletPageRequestHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.requestPage(null, null, this);
    }
}
