package app.cash.local.navigation.api;

import app.cash.broadway.navigation.Navigator;
import com.squareup.protos.cash.local.client.v1.ShortlinkAction;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class RealCashLocalShortlinkHandler$handleShortlink$1 extends ContinuationImpl {
    public ShortlinkAction L$0;
    public Navigator L$1;
    public Function0 L$3;
    public String L$4;
    public RealCashLocalShortlinkHandler L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealCashLocalShortlinkHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealCashLocalShortlinkHandler$handleShortlink$1(RealCashLocalShortlinkHandler realCashLocalShortlinkHandler, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realCashLocalShortlinkHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.handleShortlink(null, null, null, null, this);
    }
}
