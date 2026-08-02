package com.squareup.cash.invitations;

import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class InviteContactsPresenter$models$2$1$1$1$emit$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ InviteContactsPresenter$models$2$1$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteContactsPresenter$models$2$1$1$1$emit$1(InviteContactsPresenter$models$2$1$1$1 inviteContactsPresenter$models$2$1$1$1, Continuation continuation) {
        super(continuation);
        this.this$0 = inviteContactsPresenter$models$2$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit((Lifecycle.State) null, (Continuation) this);
    }
}
