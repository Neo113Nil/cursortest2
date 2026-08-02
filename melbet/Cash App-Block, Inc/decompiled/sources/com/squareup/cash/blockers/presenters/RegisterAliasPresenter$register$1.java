package com.squareup.cash.blockers.presenters;

import com.squareup.cash.onboarding.util.AliasRegistrar$Args;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class RegisterAliasPresenter$register$1 extends ContinuationImpl {
    public String L$0;
    public AliasRegistrar$Args.DeliveryMechanism L$3;
    public Function1 L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RegisterAliasPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterAliasPresenter$register$1(RegisterAliasPresenter registerAliasPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = registerAliasPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RegisterAliasPresenter.access$register(this.this$0, null, null, null, null, this);
    }
}
