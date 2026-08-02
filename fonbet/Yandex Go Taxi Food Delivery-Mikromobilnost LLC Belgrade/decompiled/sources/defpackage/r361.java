package defpackage;

import android.view.View;
import com.ybsdk.feature.savings.internal.views.SavingsNoAccountsView;

/* loaded from: classes3.dex */
public final class r361 implements zo31 {
    public final SavingsNoAccountsView a;
    public final SavingsNoAccountsView b;

    public r361(SavingsNoAccountsView savingsNoAccountsView, SavingsNoAccountsView savingsNoAccountsView2) {
        this.a = savingsNoAccountsView;
        this.b = savingsNoAccountsView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
