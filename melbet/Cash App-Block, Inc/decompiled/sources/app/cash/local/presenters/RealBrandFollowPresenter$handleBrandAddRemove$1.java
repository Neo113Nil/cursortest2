package app.cash.local.presenters;

import app.cash.local.primitives.BrandSpot;
import com.caverock.androidsvg.SVG;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class RealBrandFollowPresenter$handleBrandAddRemove$1 extends ContinuationImpl {
    public BrandSpot L$0;
    public String L$3;
    public SVG L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealBrandFollowPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBrandFollowPresenter$handleBrandAddRemove$1(RealBrandFollowPresenter realBrandFollowPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realBrandFollowPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealBrandFollowPresenter.access$handleBrandAddRemove(this.this$0, false, null, null, this);
    }
}
