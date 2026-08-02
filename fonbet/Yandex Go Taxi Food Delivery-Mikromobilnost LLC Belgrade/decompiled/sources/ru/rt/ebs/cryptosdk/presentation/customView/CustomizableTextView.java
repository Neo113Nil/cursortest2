package ru.rt.ebs.cryptosdk.presentation.customView;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.a4i0;
import defpackage.inf;
import defpackage.u2v;
import defpackage.uh91;
import defpackage.uqb1;
import defpackage.w511;
import defpackage.wng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.rt.ebs.cryptosdk.entities.models.CryptoSdkDesign;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/rt/ebs/cryptosdk/presentation/customView/CustomizableTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lu2v;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/rt/ebs/cryptosdk/presentation/customView/TextType;", "type", "Lzy11;", "setTextColor", "(Lru/rt/ebs/cryptosdk/presentation/customView/TextType;)V", "Lru/rt/ebs/cryptosdk/entities/models/CryptoSdkDesign;", "design", "applyDesign", "(Lru/rt/ebs/cryptosdk/entities/models/CryptoSdkDesign;)V", "Lru/rt/ebs/cryptosdk/presentation/customView/TextType;", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CustomizableTextView extends AppCompatTextView implements u2v {
    private final TextType type;

    public CustomizableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, a4i0.CustomizableTextView);
            TextType textType = TextType.values()[typedArray.getInt(a4i0.CustomizableTextView_textViewType, 0)];
            this.type = textType;
            setTextColor(textType);
            typedArray.recycle();
        } catch (Throwable th) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }

    private final void setTextColor(TextType type) {
        int i;
        switch (inf.a[type.ordinal()]) {
            case 1:
                i = wng0.ebssdkDataProcessingTextColor;
                break;
            case 2:
                i = wng0.ebssdkProcessingWidgetTextColor;
                break;
            case 3:
                i = wng0.ebssdkBiometryInstructionsTextColor;
                break;
            case 4:
                i = wng0.ebssdkFailedVerificationTextColorPrimary;
                break;
            case 5:
                i = wng0.ebssdkFailedVerificationTextColorSecondary;
                break;
            case 6:
                i = wng0.ebssdkAccessDeniedTextColorPrimary;
                break;
            case 7:
                i = wng0.ebssdkAccessDeniedTextColorSecondary;
                break;
            case 8:
                i = wng0.ebssdkVerificationErrorTextColorPrimary;
                break;
            case 9:
                i = wng0.ebssdkVerificationErrorTextColorSecondary;
                break;
            case 10:
                i = wng0.ebssdkVerificationAttemptsExceededTextColorPrimary;
                break;
            case 11:
                i = wng0.ebssdkVerificationAttemptsExceededTextColorSecondary;
                break;
            case 12:
                i = wng0.ebssdkNoInternetConnectionTextColorPrimary;
                break;
            case 13:
                i = wng0.ebssdkNoInternetConnectionTextColorSecondary;
                break;
            case 14:
                i = wng0.ebssdkSuccessfulVerificationWidgetTextColor;
                break;
            default:
                w511.b();
                return;
        }
        uh91.d(this, uqb1.e(i, getContext()));
    }

    @Override // defpackage.u2v
    public void applyDesign(CryptoSdkDesign design) {
        int dataProcessingTextColor;
        switch (inf.a[this.type.ordinal()]) {
            case 1:
                dataProcessingTextColor = design.getDataProcessingTextColor();
                break;
            case 2:
                dataProcessingTextColor = design.getProcessingWidgetTextColor();
                break;
            case 3:
                dataProcessingTextColor = design.getBiometryInstructionsTextColor();
                break;
            case 4:
                dataProcessingTextColor = design.getFailedVerificationTextColorPrimary();
                break;
            case 5:
                dataProcessingTextColor = design.getFailedVerificationTextColorSecondary();
                break;
            case 6:
                dataProcessingTextColor = design.getAccessDeniedTextColorPrimary();
                break;
            case 7:
                dataProcessingTextColor = design.getAccessDeniedTextColorSecondary();
                break;
            case 8:
                dataProcessingTextColor = design.getVerificationErrorTextColorPrimary();
                break;
            case 9:
                dataProcessingTextColor = design.getVerificationErrorTextColorSecondary();
                break;
            case 10:
                dataProcessingTextColor = design.getVerificationAttemptsExceededTextColorPrimary();
                break;
            case 11:
                dataProcessingTextColor = design.getVerificationAttemptsExceededTextColorSecondary();
                break;
            case 12:
                dataProcessingTextColor = design.getNoInternetConnectionTextColorPrimary();
                break;
            case 13:
                dataProcessingTextColor = design.getNoInternetConnectionTextColorSecondary();
                break;
            case 14:
                dataProcessingTextColor = design.getSuccessfulVerificationWidgetTextColor();
                break;
            default:
                w511.b();
                return;
        }
        uh91.d(this, dataProcessingTextColor);
    }

    public CustomizableTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CustomizableTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? wng0.ebssdkTextViewStyle : i);
    }

    public CustomizableTextView(Context context) {
        this(context, null, 0, 6, null);
    }
}
