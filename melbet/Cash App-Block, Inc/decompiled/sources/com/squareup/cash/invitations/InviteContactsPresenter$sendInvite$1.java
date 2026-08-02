package com.squareup.cash.invitations;

import com.squareup.cash.data.db.InvitationConfig;
import com.squareup.cash.invitations.InviteContactsViewEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class InviteContactsPresenter$sendInvite$1 extends ContinuationImpl {
    public List L$0;
    public InviteContactsViewEvent.SendInvite.ContactSection L$1;
    public InvitationConfig L$2;
    public ArrayList L$3;
    public ArrayList L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ InviteContactsPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteContactsPresenter$sendInvite$1(InviteContactsPresenter inviteContactsPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = inviteContactsPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return InviteContactsPresenter.access$sendInvite(this.this$0, null, null, this);
    }
}
