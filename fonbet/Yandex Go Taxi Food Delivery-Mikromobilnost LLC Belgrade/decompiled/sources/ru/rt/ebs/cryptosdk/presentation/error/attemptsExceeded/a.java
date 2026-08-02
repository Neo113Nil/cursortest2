package ru.rt.ebs.cryptosdk.presentation.error.attemptsExceeded;

import android.view.View;
import androidx.constraintlayout.widget.Guideline;
import defpackage.cma1;
import defpackage.kjn;
import defpackage.ny61;
import defpackage.sch0;
import defpackage.tls;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableButton;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableConstraintLayout;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableScreenIcon;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableTextView;

/* loaded from: classes4.dex */
public final /* synthetic */ class a extends FunctionReferenceImpl implements tls {
    public static final a b = new a();

    public a() {
        super(1, 0, kjn.class, "bind", "bind(Landroid/view/View;)Lru/rt/ebs/cryptosdk/databinding/EbsFragVerificationAttemptsExceededBinding;");
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        View view = (View) obj;
        CustomizableConstraintLayout customizableConstraintLayout = (CustomizableConstraintLayout) view;
        int i = sch0.ebs_frag_verification_attempts_exceeded_guideline_content_center;
        if (((Guideline) cma1.O(i, view)) != null) {
            i = sch0.ebs_frag_verification_attempts_exceeded_icon;
            CustomizableScreenIcon customizableScreenIcon = (CustomizableScreenIcon) cma1.O(i, view);
            if (customizableScreenIcon != null) {
                i = sch0.ebs_frag_verification_attempts_exceeded_subtitle;
                CustomizableTextView customizableTextView = (CustomizableTextView) cma1.O(i, view);
                if (customizableTextView != null) {
                    i = sch0.ebs_frag_verification_attempts_exceeded_title;
                    CustomizableTextView customizableTextView2 = (CustomizableTextView) cma1.O(i, view);
                    if (customizableTextView2 != null) {
                        i = sch0.ebssdk_verification_attempts_exceeded_return_btn;
                        CustomizableButton customizableButton = (CustomizableButton) cma1.O(i, view);
                        if (customizableButton != null) {
                            return new kjn(customizableButton, customizableConstraintLayout, customizableConstraintLayout, customizableScreenIcon, customizableTextView, customizableTextView2);
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
