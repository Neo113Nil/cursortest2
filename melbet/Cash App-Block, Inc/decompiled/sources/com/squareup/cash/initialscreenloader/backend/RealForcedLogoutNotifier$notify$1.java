package com.squareup.cash.initialscreenloader.backend;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.internal.DefaultSocket;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class RealForcedLogoutNotifier$notify$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DefaultSocket this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealForcedLogoutNotifier$notify$1(DefaultSocket defaultSocket, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = defaultSocket;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.notify(this);
    }
}
