package com.squareup.cash.account.presenters;

import com.squareup.cash.account.manager.backend.real.RealAccountRatePlanManager;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class EditProfilePresenter$toBusinessUpgradeModel$1 extends ContinuationImpl {
    public RealAccountRatePlanManager L$0;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TapToPayPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditProfilePresenter$toBusinessUpgradeModel$1(TapToPayPresenter tapToPayPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = tapToPayPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return TapToPayPresenter.access$toBusinessUpgradeModel(this.this$0, null, false, this);
    }
}
