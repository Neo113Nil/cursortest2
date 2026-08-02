package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer", f = "LinkStateReducer.kt", l = {EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, 147, EnumC0170g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE}, m = "callWorkflowStart")
/* loaded from: classes5.dex */
public final class P2 extends ContinuationImpl {
    public Y2 a;
    public String b;
    public String c;
    public String d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Y2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2(Y2 y2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f = y2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= PKIFailureInfo.systemUnavail;
        return this.f.a((Workflow$LinkWorkflowStartRequest) null, (String) null, (String) null, (String) null, this);
    }
}
