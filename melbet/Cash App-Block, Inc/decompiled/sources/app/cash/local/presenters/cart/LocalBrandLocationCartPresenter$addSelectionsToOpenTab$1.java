package app.cash.local.presenters.cart;

import app.cash.local.backend.CartBuilder;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class LocalBrandLocationCartPresenter$addSelectionsToOpenTab$1 extends ContinuationImpl {
    public CartBuilder L$1;
    public Function0 L$2;
    public LocalCart L$7;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LocalBrandLocationCartPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrandLocationCartPresenter$addSelectionsToOpenTab$1(LocalBrandLocationCartPresenter localBrandLocationCartPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = localBrandLocationCartPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return LocalBrandLocationCartPresenter.access$addSelectionsToOpenTab(this.this$0, null, null, null, this);
    }
}
