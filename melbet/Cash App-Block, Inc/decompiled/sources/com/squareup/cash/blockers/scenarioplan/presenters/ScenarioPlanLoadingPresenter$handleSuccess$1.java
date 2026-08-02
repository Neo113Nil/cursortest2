package com.squareup.cash.blockers.scenarioplan.presenters;

import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.protos.franklin.common.ResponseContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class ScenarioPlanLoadingPresenter$handleSuccess$1 extends ContinuationImpl {
    public BlockersData L$0;
    public ResponseContext L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LocalPosCheckInPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScenarioPlanLoadingPresenter$handleSuccess$1(LocalPosCheckInPresenter localPosCheckInPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = localPosCheckInPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return LocalPosCheckInPresenter.access$handleSuccess(this.this$0, null, null, this);
    }
}
