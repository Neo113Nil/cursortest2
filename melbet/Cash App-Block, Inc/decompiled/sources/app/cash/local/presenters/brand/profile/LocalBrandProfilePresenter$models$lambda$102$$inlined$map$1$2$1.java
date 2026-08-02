package app.cash.local.presenters.brand.profile;

import com.squareup.cash.profile.presenters.ProfilePresenter$models$lambda$8$$inlined$map$1$2;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class LocalBrandProfilePresenter$models$lambda$102$$inlined$map$1$2$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ProfilePresenter$models$lambda$8$$inlined$map$1$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrandProfilePresenter$models$lambda$102$$inlined$map$1$2$1(ProfilePresenter$models$lambda$8$$inlined$map$1$2 profilePresenter$models$lambda$8$$inlined$map$1$2, Continuation continuation) {
        super(continuation);
        this.this$0 = profilePresenter$models$lambda$8$$inlined$map$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(null, this);
    }
}
