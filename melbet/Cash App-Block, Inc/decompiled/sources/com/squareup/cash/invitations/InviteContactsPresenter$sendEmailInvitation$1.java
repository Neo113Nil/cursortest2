package com.squareup.cash.invitations;

import app.cash.api.ApiResult;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class InviteContactsPresenter$sendEmailInvitation$1 extends ContinuationImpl {
    public ArrayList L$0;
    public ApiResult.Success L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ InviteContactsPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteContactsPresenter$sendEmailInvitation$1(InviteContactsPresenter inviteContactsPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = inviteContactsPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.sendEmailInvitation(null, this);
    }
}
