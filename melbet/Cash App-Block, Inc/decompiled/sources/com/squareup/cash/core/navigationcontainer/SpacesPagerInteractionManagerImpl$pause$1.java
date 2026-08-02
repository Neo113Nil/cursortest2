package com.squareup.cash.core.navigationcontainer;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class SpacesPagerInteractionManagerImpl$pause$1 extends ContinuationImpl {
    public int I$0;
    public Mutex L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SpacesPagerInteractionManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpacesPagerInteractionManagerImpl$pause$1(SpacesPagerInteractionManagerImpl spacesPagerInteractionManagerImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = spacesPagerInteractionManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        this.this$0.pause(this);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
