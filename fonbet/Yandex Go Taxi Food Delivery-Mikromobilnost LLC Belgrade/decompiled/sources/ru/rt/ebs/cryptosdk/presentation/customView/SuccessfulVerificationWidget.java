package ru.rt.ebs.cryptosdk.presentation.customView;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.cma1;
import defpackage.ny61;
import defpackage.sch0;
import defpackage.u2v;
import defpackage.uqb1;
import defpackage.wng0;
import defpackage.xoh0;
import defpackage.yjn;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.rt.ebs.cryptosdk.entities.models.CryptoSdkDesign;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/rt/ebs/cryptosdk/presentation/customView/SuccessfulVerificationWidget;", "Landroid/widget/FrameLayout;", "Lu2v;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/rt/ebs/cryptosdk/entities/models/CryptoSdkDesign;", "design", "Lzy11;", "applyDesign", "(Lru/rt/ebs/cryptosdk/entities/models/CryptoSdkDesign;)V", "Lyjn;", "viewBinding", "Lyjn;", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SuccessfulVerificationWidget extends FrameLayout implements u2v {
    private final yjn viewBinding;

    public SuccessfulVerificationWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(xoh0.ebs_widget_successful_verification, this);
        int i2 = sch0.ebs_widget_successful_verification_container;
        LinearLayout linearLayout = (LinearLayout) cma1.O(i2, this);
        if (linearLayout != null) {
            i2 = sch0.ebs_widget_successful_verification_darkening;
            CustomizableConstraintLayout customizableConstraintLayout = (CustomizableConstraintLayout) cma1.O(i2, this);
            if (customizableConstraintLayout != null) {
                i2 = sch0.ebs_widget_successful_verification_icon;
                CustomizableImageView customizableImageView = (CustomizableImageView) cma1.O(i2, this);
                if (customizableImageView != null) {
                    i2 = sch0.ebs_widget_successful_verification_title;
                    CustomizableTextView customizableTextView = (CustomizableTextView) cma1.O(i2, this);
                    if (customizableTextView != null) {
                        this.viewBinding = new yjn(this, linearLayout, customizableConstraintLayout, customizableImageView, customizableTextView);
                        linearLayout.setBackgroundTintList(ColorStateList.valueOf(context.getColor(uqb1.e(wng0.ebssdkSuccessfulVerificationWidgetBackgroundColor, context))));
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    @Override // defpackage.u2v
    public void applyDesign(CryptoSdkDesign design) {
        yjn yjnVar = this.viewBinding;
        yjnVar.e.applyDesign(design);
        yjnVar.d.applyDesign(design);
        yjnVar.c.applyDesign(design);
        yjnVar.b.setBackgroundTintList(ColorStateList.valueOf(getContext().getColor(design.getSuccessfulVerificationWidgetBackgroundColor())));
    }

    public SuccessfulVerificationWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SuccessfulVerificationWidget(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public SuccessfulVerificationWidget(Context context) {
        this(context, null, 0, 6, null);
    }
}
