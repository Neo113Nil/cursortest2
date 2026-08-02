package ru.rt.ebs.cryptosdk.presentation.customView;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.cma1;
import defpackage.kzh0;
import defpackage.ny61;
import defpackage.sch0;
import defpackage.u2v;
import defpackage.uqb1;
import defpackage.wng0;
import defpackage.xjn;
import defpackage.xoh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.rt.ebs.cryptosdk.entities.models.CryptoSdkDesign;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R*\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/rt/ebs/cryptosdk/presentation/customView/ProcessingWidget;", "Landroid/widget/FrameLayout;", "Lu2v;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/rt/ebs/cryptosdk/entities/models/CryptoSdkDesign;", "design", "Lzy11;", "applyDesign", "(Lru/rt/ebs/cryptosdk/entities/models/CryptoSdkDesign;)V", "Lxjn;", "viewBinding", "Lxjn;", "value", "titleRes", CA20Status.STATUS_USER_I, "getTitleRes", "()I", "setTitleRes", "(I)V", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProcessingWidget extends FrameLayout implements u2v {
    private int titleRes;
    private final xjn viewBinding;

    public ProcessingWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(xoh0.ebs_widget_processing, this);
        int i2 = sch0.ebs_widget_progressing_container;
        LinearLayout linearLayout = (LinearLayout) cma1.O(i2, this);
        if (linearLayout != null) {
            i2 = sch0.ebs_widget_progressing_darkening;
            CustomizableConstraintLayout customizableConstraintLayout = (CustomizableConstraintLayout) cma1.O(i2, this);
            if (customizableConstraintLayout != null) {
                i2 = sch0.ebs_widget_progressing_progress;
                CustomizableProgressBar customizableProgressBar = (CustomizableProgressBar) cma1.O(i2, this);
                if (customizableProgressBar != null) {
                    i2 = sch0.ebs_widget_progressing_tv_title;
                    CustomizableTextView customizableTextView = (CustomizableTextView) cma1.O(i2, this);
                    if (customizableTextView != null) {
                        this.viewBinding = new xjn(this, linearLayout, customizableConstraintLayout, customizableProgressBar, customizableTextView);
                        this.titleRes = kzh0.ebssdk_processing_tv_text;
                        linearLayout.setBackgroundTintList(ColorStateList.valueOf(context.getColor(uqb1.e(wng0.ebssdkProcessingWidgetBackground, context))));
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
        xjn xjnVar = this.viewBinding;
        xjnVar.d.applyDesign(design);
        xjnVar.e.applyDesign(design);
        xjnVar.c.applyDesign(design);
        xjnVar.b.setBackgroundTintList(ColorStateList.valueOf(getContext().getColor(design.getProcessingWidgetBackgroundColor())));
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    public final void setTitleRes(int i) {
        this.viewBinding.e.setText(i);
    }

    public ProcessingWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ProcessingWidget(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public ProcessingWidget(Context context) {
        this(context, null, 0, 6, null);
    }
}
