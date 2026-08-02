package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import com.ybsdk.feature.split.deposit.internal.ui.autotopup.status.SplitDepositAutoTopupStatusFragment;

/* loaded from: classes11.dex */
public final /* synthetic */ class qst0 implements q {
    public final /* synthetic */ int a;
    public final /* synthetic */ SplitDepositAutoTopupStatusFragment b;

    public /* synthetic */ qst0(SplitDepositAutoTopupStatusFragment splitDepositAutoTopupStatusFragment, int i) {
        this.a = i;
        this.b = splitDepositAutoTopupStatusFragment;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        int i = this.a;
        SplitDepositAutoTopupStatusFragment splitDepositAutoTopupStatusFragment = this.b;
        switch (i) {
            case 0:
                SplitDepositAutoTopupStatusFragment.consumeSideEffect$lambda$1(splitDepositAutoTopupStatusFragment, peyVar, event);
                break;
            case 1:
                SplitDepositAutoTopupStatusFragment.setUserReturnedObservers$lambda$6(splitDepositAutoTopupStatusFragment, peyVar, event);
                break;
            default:
                SplitDepositAutoTopupStatusFragment.setUserReturnedObservers$lambda$9(splitDepositAutoTopupStatusFragment, peyVar, event);
                break;
        }
    }
}
