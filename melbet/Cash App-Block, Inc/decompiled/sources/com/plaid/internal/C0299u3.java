package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.workflow.LinkWorkflowAnalytics", f = "LinkWorkflowAnalytics.kt", l = {EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, 185, EnumC0170g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE}, m = "sendAllAnalyticsEventsToServer")
/* renamed from: com.plaid.internal.u3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0299u3 extends ContinuationImpl {
    public C0326x3 a;
    public Iterator b;
    public Workflow$LinkWorkflowEventRequest c;
    public /* synthetic */ Object d;
    public final /* synthetic */ C0326x3 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0299u3(C0326x3 c0326x3, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = c0326x3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= PKIFailureInfo.systemUnavail;
        return C0326x3.a(this.e, this);
    }
}
