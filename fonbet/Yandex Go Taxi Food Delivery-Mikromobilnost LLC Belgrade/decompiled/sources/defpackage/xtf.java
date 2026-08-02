package defpackage;

import android.view.View;
import com.yandex.payment.divkit.sbp.DKSbpFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class xtf implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ DKSbpFragment b;

    public /* synthetic */ xtf(DKSbpFragment dKSbpFragment, int i) {
        this.a = i;
        this.b = dKSbpFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 onViewCreated$lambda$0$0;
        zy11 onViewCreated$lambda$0;
        zy11 observeChanges$lambda$0;
        int i = this.a;
        DKSbpFragment dKSbpFragment = this.b;
        switch (i) {
            case 0:
                onViewCreated$lambda$0$0 = DKSbpFragment.onViewCreated$lambda$0$0(dKSbpFragment, (String) obj);
                return onViewCreated$lambda$0$0;
            case 1:
                onViewCreated$lambda$0 = DKSbpFragment.onViewCreated$lambda$0(dKSbpFragment, (View) obj);
                return onViewCreated$lambda$0;
            default:
                observeChanges$lambda$0 = DKSbpFragment.observeChanges$lambda$0(dKSbpFragment, (kuf) obj);
                return observeChanges$lambda$0;
        }
    }
}
