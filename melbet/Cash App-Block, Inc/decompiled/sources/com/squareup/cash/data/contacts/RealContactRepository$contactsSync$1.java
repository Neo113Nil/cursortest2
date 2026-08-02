package com.squareup.cash.data.contacts;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealContactRepository$contactsSync$1 extends ContinuationImpl {
    public List L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealContactRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealContactRepository$contactsSync$1(RealContactRepository realContactRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realContactRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.contactsSync(null, null, this);
    }
}
