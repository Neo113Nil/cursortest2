package com.squareup.cash.account.backend;

import app.cash.api.ApiResult;
import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.session.backend.SessionState;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class RealAccountSwitcher$finish$1 extends ContinuationImpl {
    public int I$0;
    public AccountSwitcher$AccountSwitchContinuation L$0;
    public Navigator L$1;
    public AccountSwitcher$AccountSwitchContinuation L$2;
    public SessionState L$3;
    public ApiResult L$4;
    public Object L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealAccountSwitcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealAccountSwitcher$finish$1(RealAccountSwitcher realAccountSwitcher, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realAccountSwitcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.finish(null, null, this);
    }
}
