package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.yandex.payment.sdk.ui.view.card.CvnInput;

/* loaded from: classes2.dex */
public final class woa0 implements zo31 {
    public final CvnInput a;
    public final TextView b;
    public final EditText c;

    public woa0(CvnInput cvnInput, TextView textView, EditText editText) {
        this.a = cvnInput;
        this.b = textView;
        this.c = editText;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
