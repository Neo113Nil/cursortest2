package defpackage;

import android.view.View;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.ClosingOfferContentView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.ClosingOfferFragment;

/* loaded from: classes2.dex */
public final class v6c implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ClosingOfferFragment b;
    public final /* synthetic */ int c;

    public /* synthetic */ v6c(ClosingOfferFragment closingOfferFragment, int i, int i2) {
        this.a = i2;
        this.b = closingOfferFragment;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        ClosingOfferFragment closingOfferFragment = this.b;
        switch (i) {
            case 0:
                kgx kgxVar = (kgx) obj;
                try {
                    View findViewById = closingOfferFragment.requireView().findViewById(i2);
                    if (findViewById != null) {
                        return findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                } catch (ClassCastException e) {
                    dy31.f(kgxVar, e);
                    return null;
                }
            default:
                kgx kgxVar2 = (kgx) obj;
                try {
                    View findViewById2 = closingOfferFragment.requireView().findViewById(i2);
                    if (findViewById2 != null) {
                        return (ClosingOfferContentView) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.ClosingOfferContentView");
                } catch (ClassCastException e2) {
                    dy31.f(kgxVar2, e2);
                    return null;
                }
        }
    }
}
