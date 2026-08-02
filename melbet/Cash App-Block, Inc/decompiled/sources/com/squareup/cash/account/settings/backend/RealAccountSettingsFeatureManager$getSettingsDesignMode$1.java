package com.squareup.cash.account.settings.backend;

import com.nimbusds.jose.jca.JCAContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class RealAccountSettingsFeatureManager$getSettingsDesignMode$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ JCAContext this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealAccountSettingsFeatureManager$getSettingsDesignMode$1(JCAContext jCAContext, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = jCAContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.getSettingsDesignMode(this);
    }
}
