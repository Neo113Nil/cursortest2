package defpackage;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.ClosingOfferFragment;

/* loaded from: classes2.dex */
public final class u6c implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ClosingOfferFragment b;

    public /* synthetic */ u6c(ClosingOfferFragment closingOfferFragment, int i) {
        this.a = i;
        this.b = closingOfferFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        ClosingOfferFragment closingOfferFragment = this.b;
        switch (i) {
        }
        return closingOfferFragment.getViewLifecycleOwner().getLifecycle();
    }
}
