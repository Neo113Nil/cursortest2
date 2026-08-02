package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import com.yandex.payment.sdk.ui.view.card.CardInputViewImpl;
import com.yandex.payment.sdk.ui.view.card.CardNumberInput;
import com.yandex.payment.sdk.ui.view.card.CvnInput;
import com.yandex.payment.sdk.ui.view.card.ExpirationDateInput;

/* loaded from: classes2.dex */
public final class toa0 implements zo31 {
    public final CardInputViewImpl a;
    public final CardNumberInput b;
    public final Space c;
    public final Space d;
    public final ImageView e;
    public final CvnInput f;
    public final TextView g;
    public final ExpirationDateInput h;
    public final Space i;

    public toa0(CardInputViewImpl cardInputViewImpl, CardNumberInput cardNumberInput, Space space, Space space2, ImageView imageView, CvnInput cvnInput, TextView textView, ExpirationDateInput expirationDateInput, Space space3) {
        this.a = cardInputViewImpl;
        this.b = cardNumberInput;
        this.c = space;
        this.d = space2;
        this.e = imageView;
        this.f = cvnInput;
        this.g = textView;
        this.h = expirationDateInput;
        this.i = space3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
