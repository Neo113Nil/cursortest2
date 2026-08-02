package com.plaid.internal;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.workflow.LinkStateReducer", f = "LinkStateReducer.kt", l = {EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE}, m = "next")
/* loaded from: classes5.dex */
public final class T2 extends ContinuationImpl {
    public Y2 a;
    public N2 b;
    public List c;
    public String d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Y2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T2(Y2 y2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f = y2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= PKIFailureInfo.systemUnavail;
        return this.f.a((N2) null, (List) null, this);
    }
}
