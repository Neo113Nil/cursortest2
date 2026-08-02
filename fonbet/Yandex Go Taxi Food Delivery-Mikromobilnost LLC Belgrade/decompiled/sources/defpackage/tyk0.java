package defpackage;

import com.ybsdk.feature.autotopup.internal.presentation.saver.RoundingFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class tyk0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ RoundingFragment b;

    public /* synthetic */ tyk0(RoundingFragment roundingFragment, int i) {
        this.a = i;
        this.b = roundingFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 adapter_delegate$lambda$1$lambda$0;
        zy11 viewBinding$lambda$9$lambda$6;
        int i = this.a;
        RoundingFragment roundingFragment = this.b;
        switch (i) {
            case 0:
                adapter_delegate$lambda$1$lambda$0 = RoundingFragment.adapter_delegate$lambda$1$lambda$0(roundingFragment, ((Integer) obj).intValue());
                return adapter_delegate$lambda$1$lambda$0;
            default:
                viewBinding$lambda$9$lambda$6 = RoundingFragment.getViewBinding$lambda$9$lambda$6(roundingFragment, ((Boolean) obj).booleanValue());
                return viewBinding$lambda$9$lambda$6;
        }
    }
}
