package com.squareup.cash.prepurchasecashcard.backend;

import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealPrepurchaseToggleManager$toggle$1 extends ContinuationImpl {
    public BetterNavigator.ScreenNavigator L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealPrepurchaseToggleManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPrepurchaseToggleManager$toggle$1(RealPrepurchaseToggleManager realPrepurchaseToggleManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realPrepurchaseToggleManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.toggle(null, null, null, null, this);
    }
}
