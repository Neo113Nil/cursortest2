package app.cash.local.backend;

import coil3.svg.internal.AndroidSvg;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class MarkMarketingMessageAsViewed$invoke$1 extends ContinuationImpl {
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AndroidSvg this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkMarketingMessageAsViewed$invoke$1(AndroidSvg androidSvg, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = androidSvg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.m1472invokebPdJ9CI(null, this);
    }
}
