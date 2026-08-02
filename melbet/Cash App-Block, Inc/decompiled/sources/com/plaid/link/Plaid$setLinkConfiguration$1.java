package com.plaid.link;

import com.knotapi.knot.utilities.Constants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.plaid.link.Plaid", f = "Plaid.kt", l = {Constants.ID_KROGER, 371}, m = "setLinkConfiguration")
/* loaded from: classes5.dex */
public final class Plaid$setLinkConfiguration$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Plaid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Plaid$setLinkConfiguration$1(Plaid plaid, Continuation<? super Plaid$setLinkConfiguration$1> continuation) {
        super(continuation);
        this.this$0 = plaid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object linkConfiguration;
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        linkConfiguration = this.this$0.setLinkConfiguration(null, this);
        return linkConfiguration;
    }
}
