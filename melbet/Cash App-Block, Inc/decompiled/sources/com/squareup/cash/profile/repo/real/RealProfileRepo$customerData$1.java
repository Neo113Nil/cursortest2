package com.squareup.cash.profile.repo.real;

import com.squareup.cash.profile.repo.api.CustomerProfileData;
import com.squareup.cash.profile.screens.ProfileScreens;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealProfileRepo$customerData$1 extends ContinuationImpl {
    public int I$0;
    public ProfileScreens.ProfileScreen.Customer L$0;
    public CustomerProfileData L$2;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealProfileRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealProfileRepo$customerData$1(RealProfileRepo realProfileRepo, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realProfileRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.customerData(null, false, null, this);
    }
}
