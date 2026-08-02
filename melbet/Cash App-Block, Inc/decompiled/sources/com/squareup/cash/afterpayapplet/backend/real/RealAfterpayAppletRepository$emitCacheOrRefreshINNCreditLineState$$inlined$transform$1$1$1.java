package com.squareup.cash.afterpayapplet.backend.real;

import androidx.compose.material.SwipeableState$animateTo$2;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletResponse;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class RealAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public int I$2;
    public FlowCollector L$2;
    public List L$5;
    public Object L$6;
    public AfterpayAppletResponse L$7;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SwipeableState$animateTo$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1(SwipeableState$animateTo$2 swipeableState$animateTo$2, Continuation continuation) {
        super(continuation);
        this.this$0 = swipeableState$animateTo$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit((Object) null, this);
    }
}
