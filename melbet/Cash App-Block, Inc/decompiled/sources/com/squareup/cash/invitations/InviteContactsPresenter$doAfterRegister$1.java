package com.squareup.cash.invitations;

import app.cash.api.ApiResult;
import com.squareup.cash.data.db.InvitationConfig;
import com.squareup.cash.invitations.InviteContactsViewEvent;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class InviteContactsPresenter$doAfterRegister$1 extends ContinuationImpl {
    public ApiResult L$0;
    public InviteContactsViewEvent.SendInvite.ContactSection L$1;
    public List L$2;
    public String L$3;
    public String L$4;
    public InvitationConfig L$5;
    public Ref$BooleanRef L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ InviteContactsPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteContactsPresenter$doAfterRegister$1(InviteContactsPresenter inviteContactsPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = inviteContactsPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.doAfterRegister(null, null, null, null, null, null, this);
    }
}
