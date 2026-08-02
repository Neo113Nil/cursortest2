package defpackage;

import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import com.yandex.payment.sdk.ui.view.card.CvnInputViewImpl;

/* loaded from: classes2.dex */
public final class xoa0 implements zo31 {
    public final CvnInputViewImpl a;
    public final TextInputLayout b;

    public xoa0(CvnInputViewImpl cvnInputViewImpl, TextInputLayout textInputLayout) {
        this.a = cvnInputViewImpl;
        this.b = textInputLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
