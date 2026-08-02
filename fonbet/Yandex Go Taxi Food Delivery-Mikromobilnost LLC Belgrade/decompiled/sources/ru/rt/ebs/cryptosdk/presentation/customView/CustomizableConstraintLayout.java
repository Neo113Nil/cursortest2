package ru.rt.ebs.cryptosdk.presentation.customView;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a4i0;
import defpackage.bnf;
import defpackage.u2v;
import defpackage.uqb1;
import defpackage.w511;
import defpackage.wng0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.rt.ebs.cryptosdk.entities.models.CryptoSdkDesign;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/rt/ebs/cryptosdk/presentation/customView/CustomizableConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lu2v;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/rt/ebs/cryptosdk/entities/models/CryptoSdkDesign;", "design", "Lzy11;", "applyDesign", "(Lru/rt/ebs/cryptosdk/entities/models/CryptoSdkDesign;)V", "Lru/rt/ebs/cryptosdk/presentation/customView/ConstraintLayoutType;", "type", "Lru/rt/ebs/cryptosdk/presentation/customView/ConstraintLayoutType;", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CustomizableConstraintLayout extends ConstraintLayout implements u2v {
    private final ConstraintLayoutType type;

    public CustomizableConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        TypedArray typedArray = null;
        try {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a4i0.CustomizableConstraintLayout);
            ConstraintLayoutType constraintLayoutType = ConstraintLayoutType.values()[obtainStyledAttributes.getInt(a4i0.CustomizableConstraintLayout_constraintLayoutType, 0)];
            this.type = constraintLayoutType;
            switch (bnf.a[constraintLayoutType.ordinal()]) {
                case 1:
                    i2 = wng0.ebssdkBiometryInstructionsBackgroundColor;
                    break;
                case 2:
                    i2 = wng0.ebssdkFailedVerificationBackgroundColor;
                    break;
                case 3:
                    i2 = wng0.ebssdkAccessDeniedBackgroundColor;
                    break;
                case 4:
                    i2 = wng0.ebssdkVerificationErrorBackgroundColor;
                    break;
                case 5:
                    i2 = wng0.ebssdkProcessingWidgetScreenDarkeningColor;
                    break;
                case 6:
                    i2 = wng0.ebssdkSuccessfulVerificationWidgetDarkeningColor;
                    break;
                case 7:
                    i2 = wng0.ebssdkVerificationAttemptsExceededBackgroundColor;
                    break;
                case 8:
                    i2 = wng0.ebssdkNoInternetConnectionBackgroundColor;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            setBackgroundColor(uqb1.d(i2, context));
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            if (0 != 0) {
                typedArray.recycle();
            }
            throw th;
        }
    }

    @Override // defpackage.u2v
    public void applyDesign(CryptoSdkDesign design) {
        int biometryInstructionsBackgroundColor;
        switch (bnf.a[this.type.ordinal()]) {
            case 1:
                biometryInstructionsBackgroundColor = design.getBiometryInstructionsBackgroundColor();
                break;
            case 2:
                biometryInstructionsBackgroundColor = design.getFailedVerificationBackgroundColor();
                break;
            case 3:
                biometryInstructionsBackgroundColor = design.getAccessDeniedBackgroundColor();
                break;
            case 4:
                biometryInstructionsBackgroundColor = design.getVerificationErrorBackgroundColor();
                break;
            case 5:
                biometryInstructionsBackgroundColor = design.getProcessingWidgetScreenDarkeningColor();
                break;
            case 6:
                biometryInstructionsBackgroundColor = design.getSuccessfulVerificationWidgetDarkeningColor();
                break;
            case 7:
                biometryInstructionsBackgroundColor = design.getVerificationAttemptsExceededBackgroundColor();
                break;
            case 8:
                biometryInstructionsBackgroundColor = design.getNoInternetConnectionBackgroundColor();
                break;
            default:
                w511.b();
                return;
        }
        setBackgroundColor(getContext().getColor(biometryInstructionsBackgroundColor));
    }

    public CustomizableConstraintLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CustomizableConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public CustomizableConstraintLayout(Context context) {
        this(context, null, 0, 6, null);
    }
}
