package com.plaid.internal;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer", f = "LinkStateReducer.kt", l = {395, 410}, m = "exitFromCurrentState")
/* loaded from: classes5.dex */
public final class R2 extends ContinuationImpl {
    public Y2 a;
    public N2 b;
    public String c;
    public List d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Y2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R2(Y2 y2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f = y2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= PKIFailureInfo.systemUnavail;
        return this.f.a(null, this);
    }
}
