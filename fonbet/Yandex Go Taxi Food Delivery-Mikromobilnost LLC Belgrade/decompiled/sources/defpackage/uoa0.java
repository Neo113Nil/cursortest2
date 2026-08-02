package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.yandex.payment.sdk.ui.view.card.CardNumberInput;

/* loaded from: classes2.dex */
public final class uoa0 implements zo31 {
    public final CardNumberInput a;
    public final TextView b;
    public final EditText c;

    public uoa0(CardNumberInput cardNumberInput, TextView textView, EditText editText) {
        this.a = cardNumberInput;
        this.b = textView;
        this.c = editText;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
