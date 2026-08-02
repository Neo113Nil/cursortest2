package com.squareup.cash.clientrouting.routers.account;

import com.squareup.cash.clientrouting.routers.account.RoutableAccountsProvider$setup$1$1;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class RoutableAccountsProvider$setup$1$2$3$emit$1 extends ContinuationImpl {
    public RoutableAccountsProvider L$1;
    public List L$2;
    public MutexImpl L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RoutableAccountsProvider$setup$1$1.AnonymousClass1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoutableAccountsProvider$setup$1$2$3$emit$1(RoutableAccountsProvider$setup$1$1.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit((List) null, (Continuation) this);
    }
}
