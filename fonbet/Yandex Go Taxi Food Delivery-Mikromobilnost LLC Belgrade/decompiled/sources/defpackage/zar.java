package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.yandex.payment.sdk.flex.impl.customview.views.cardinput.views.CardNumberInputView;

/* loaded from: classes2.dex */
public final class zar implements zo31 {
    public final CardNumberInputView a;
    public final TextView b;
    public final EditText c;
    public final TextView d;
    public final EditText e;

    public zar(CardNumberInputView cardNumberInputView, TextView textView, EditText editText, TextView textView2, EditText editText2) {
        this.a = cardNumberInputView;
        this.b = textView;
        this.c = editText;
        this.d = textView2;
        this.e = editText2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
