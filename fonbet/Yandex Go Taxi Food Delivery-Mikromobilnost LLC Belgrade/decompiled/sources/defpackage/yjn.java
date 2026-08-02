package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableConstraintLayout;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableImageView;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableTextView;
import ru.rt.ebs.cryptosdk.presentation.customView.SuccessfulVerificationWidget;

/* loaded from: classes4.dex */
public final class yjn implements zo31 {
    public final SuccessfulVerificationWidget a;
    public final LinearLayout b;
    public final CustomizableConstraintLayout c;
    public final CustomizableImageView d;
    public final CustomizableTextView e;

    public yjn(SuccessfulVerificationWidget successfulVerificationWidget, LinearLayout linearLayout, CustomizableConstraintLayout customizableConstraintLayout, CustomizableImageView customizableImageView, CustomizableTextView customizableTextView) {
        this.a = successfulVerificationWidget;
        this.b = linearLayout;
        this.c = customizableConstraintLayout;
        this.d = customizableImageView;
        this.e = customizableTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
