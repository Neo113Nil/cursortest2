package com.squareup.cash.onboarding.accountpicker.backend;

import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.AliasType;
import com.squareup.cash.onboarding.util.AliasRegistrar$Args;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealSelectedAliasRegistrar$registerSelectedAlias$1 extends ContinuationImpl {
    public AliasType L$10;
    public Screen L$3;
    public AliasRegistrar$Args.DeliveryMechanism L$4;
    public BlockersData L$7;
    public String L$8;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealSelectedAliasRegistrar this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealSelectedAliasRegistrar$registerSelectedAlias$1(RealSelectedAliasRegistrar realSelectedAliasRegistrar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realSelectedAliasRegistrar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.registerSelectedAlias(null, null, null, null, this);
    }
}
