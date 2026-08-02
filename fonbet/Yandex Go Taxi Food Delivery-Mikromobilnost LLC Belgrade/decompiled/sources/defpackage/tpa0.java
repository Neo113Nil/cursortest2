package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.payment.sdk.ui.view.ChallengerInputView;

/* loaded from: classes2.dex */
public final class tpa0 implements zo31 {
    public final ConstraintLayout a;
    public final ImageView b;
    public final TextView c;
    public final ChallengerInputView d;
    public final TextView e;
    public final TextView f;

    public tpa0(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, ChallengerInputView challengerInputView, TextView textView2, TextView textView3) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = textView;
        this.d = challengerInputView;
        this.e = textView2;
        this.f = textView3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
