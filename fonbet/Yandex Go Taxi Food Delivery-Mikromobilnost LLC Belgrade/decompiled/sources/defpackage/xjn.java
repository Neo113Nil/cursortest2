package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableConstraintLayout;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableProgressBar;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableTextView;
import ru.rt.ebs.cryptosdk.presentation.customView.ProcessingWidget;

/* loaded from: classes4.dex */
public final class xjn implements zo31 {
    public final ProcessingWidget a;
    public final LinearLayout b;
    public final CustomizableConstraintLayout c;
    public final CustomizableProgressBar d;
    public final CustomizableTextView e;

    public xjn(ProcessingWidget processingWidget, LinearLayout linearLayout, CustomizableConstraintLayout customizableConstraintLayout, CustomizableProgressBar customizableProgressBar, CustomizableTextView customizableTextView) {
        this.a = processingWidget;
        this.b = linearLayout;
        this.c = customizableConstraintLayout;
        this.d = customizableProgressBar;
        this.e = customizableTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
