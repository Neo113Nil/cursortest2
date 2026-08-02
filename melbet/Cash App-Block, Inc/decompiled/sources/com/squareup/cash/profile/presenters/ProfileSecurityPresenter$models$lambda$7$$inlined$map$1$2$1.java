package com.squareup.cash.profile.presenters;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class ProfileSecurityPresenter$models$lambda$7$$inlined$map$1$2$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ProfileSecurityPresenter$special$$inlined$map$1$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileSecurityPresenter$models$lambda$7$$inlined$map$1$2$1(ProfileSecurityPresenter$special$$inlined$map$1$2 profileSecurityPresenter$special$$inlined$map$1$2, Continuation continuation) {
        super(continuation);
        this.this$0 = profileSecurityPresenter$special$$inlined$map$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(null, this);
    }
}
