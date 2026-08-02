package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ybsdk.feature.savings.internal.views.SavingsNoAccountsView;
import com.ybsdk.widgets.common.YbButtonView;

/* loaded from: classes3.dex */
public final class za61 implements zo31 {
    public final SavingsNoAccountsView a;
    public final YbButtonView b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;

    public za61(SavingsNoAccountsView savingsNoAccountsView, YbButtonView ybButtonView, ImageView imageView, TextView textView, TextView textView2) {
        this.a = savingsNoAccountsView;
        this.b = ybButtonView;
        this.c = imageView;
        this.d = textView;
        this.e = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
