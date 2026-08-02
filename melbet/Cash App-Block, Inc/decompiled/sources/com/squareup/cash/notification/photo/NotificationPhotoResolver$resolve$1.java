package com.squareup.cash.notification.photo;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import retrofit2.OkHttpCall;

/* loaded from: classes6.dex */
public final class NotificationPhotoResolver$resolve$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ OkHttpCall.AnonymousClass1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationPhotoResolver$resolve$1(OkHttpCall.AnonymousClass1 anonymousClass1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.resolve(null, this);
    }
}
