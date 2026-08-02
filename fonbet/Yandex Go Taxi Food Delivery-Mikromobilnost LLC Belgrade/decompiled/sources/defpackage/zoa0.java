package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.yandex.payment.divkit.sbp.DKSbpSearchBankLayout;

/* loaded from: classes2.dex */
public final class zoa0 implements zo31 {
    public final DKSbpSearchBankLayout a;
    public final TextInputEditText b;
    public final ImageView c;

    public zoa0(DKSbpSearchBankLayout dKSbpSearchBankLayout, TextInputEditText textInputEditText, ImageView imageView) {
        this.a = dKSbpSearchBankLayout;
        this.b = textInputEditText;
        this.c = imageView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
