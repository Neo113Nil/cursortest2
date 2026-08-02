package defpackage;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.TopupFragment;

/* loaded from: classes2.dex */
public final class rxz0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ TopupFragment b;

    public /* synthetic */ rxz0(TopupFragment topupFragment, int i) {
        this.a = i;
        this.b = topupFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        TopupFragment topupFragment = this.b;
        switch (i) {
        }
        return topupFragment.getViewLifecycleOwner().getLifecycle();
    }
}
