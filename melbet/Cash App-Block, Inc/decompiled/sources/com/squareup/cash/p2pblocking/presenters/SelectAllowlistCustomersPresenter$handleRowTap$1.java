package com.squareup.cash.p2pblocking.presenters;

import androidx.compose.runtime.MutableState;
import com.squareup.cash.p2pblocking.viewmodels.P2PListRowTapButtonEvent;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class SelectAllowlistCustomersPresenter$handleRowTap$1 extends ContinuationImpl {
    public P2PListRowTapButtonEvent.TapAddOrRemove L$0;
    public MutableState L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SelectAllowlistCustomersPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectAllowlistCustomersPresenter$handleRowTap$1(SelectAllowlistCustomersPresenter selectAllowlistCustomersPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = selectAllowlistCustomersPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.handleRowTap(null, null, this);
    }
}
