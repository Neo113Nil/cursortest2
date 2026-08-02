package defpackage;

import com.ybsdk.feature.autotopup.internal.presentation.saver.RoundingFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class syk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RoundingFragment b;

    public /* synthetic */ syk0(RoundingFragment roundingFragment, int i) {
        this.a = i;
        this.b = roundingFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        RoundingFragment roundingFragment = this.b;
        switch (i) {
            case 0:
                RoundingFragment.consumeSideEffect$lambda$17(roundingFragment);
                break;
            case 1:
                RoundingFragment.consumeSideEffect$lambda$18(roundingFragment);
                break;
            default:
                RoundingFragment.onSummaryViewDropDownToggle$lambda$29(roundingFragment);
                break;
        }
    }
}
