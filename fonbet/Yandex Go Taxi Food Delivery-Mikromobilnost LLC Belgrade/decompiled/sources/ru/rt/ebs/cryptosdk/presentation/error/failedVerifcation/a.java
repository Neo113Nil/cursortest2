package ru.rt.ebs.cryptosdk.presentation.error.failedVerifcation;

import android.view.View;
import androidx.constraintlayout.widget.Guideline;
import defpackage.cma1;
import defpackage.gjn;
import defpackage.ny61;
import defpackage.sch0;
import defpackage.tls;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableButton;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableConstraintLayout;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableHeader;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableScreenIcon;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableTextView;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableTextWithBulletPoint;

/* loaded from: classes4.dex */
public final /* synthetic */ class a extends FunctionReferenceImpl implements tls {
    public static final a b = new a();

    public a() {
        super(1, 0, gjn.class, "bind", "bind(Landroid/view/View;)Lru/rt/ebs/cryptosdk/databinding/EbsFragFailedVerificationBinding;");
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        View view = (View) obj;
        CustomizableConstraintLayout customizableConstraintLayout = (CustomizableConstraintLayout) view;
        int i = sch0.ebs_frag_failed_verification_guideline_content_center;
        if (((Guideline) cma1.O(i, view)) != null) {
            i = sch0.ebs_frag_failed_verification_header;
            CustomizableHeader customizableHeader = (CustomizableHeader) cma1.O(i, view);
            if (customizableHeader != null) {
                i = sch0.ebs_frag_failed_verification_icon;
                CustomizableScreenIcon customizableScreenIcon = (CustomizableScreenIcon) cma1.O(i, view);
                if (customizableScreenIcon != null) {
                    i = sch0.ebs_frag_failed_verification_message_1;
                    CustomizableTextWithBulletPoint customizableTextWithBulletPoint = (CustomizableTextWithBulletPoint) cma1.O(i, view);
                    if (customizableTextWithBulletPoint != null) {
                        i = sch0.ebs_frag_failed_verification_message_2;
                        CustomizableTextWithBulletPoint customizableTextWithBulletPoint2 = (CustomizableTextWithBulletPoint) cma1.O(i, view);
                        if (customizableTextWithBulletPoint2 != null) {
                            i = sch0.ebs_frag_failed_verification_message_3;
                            CustomizableTextWithBulletPoint customizableTextWithBulletPoint3 = (CustomizableTextWithBulletPoint) cma1.O(i, view);
                            if (customizableTextWithBulletPoint3 != null) {
                                i = sch0.ebs_frag_failed_verification_proceed_btn;
                                CustomizableButton customizableButton = (CustomizableButton) cma1.O(i, view);
                                if (customizableButton != null) {
                                    i = sch0.ebs_frag_failed_verification_subtitle;
                                    CustomizableTextView customizableTextView = (CustomizableTextView) cma1.O(i, view);
                                    if (customizableTextView != null) {
                                        i = sch0.ebs_frag_failed_verification_title;
                                        CustomizableTextView customizableTextView2 = (CustomizableTextView) cma1.O(i, view);
                                        if (customizableTextView2 != null) {
                                            return new gjn(customizableConstraintLayout, customizableConstraintLayout, customizableHeader, customizableScreenIcon, customizableTextWithBulletPoint, customizableTextWithBulletPoint2, customizableTextWithBulletPoint3, customizableButton, customizableTextView, customizableTextView2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
