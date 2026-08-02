package ru.rt.ebs.cryptosdk.presentation.customView;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import defpackage.u2v;
import defpackage.uqb1;
import defpackage.wng0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.rt.ebs.cryptosdk.entities.models.CryptoSdkDesign;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\f2\b\b\u0001\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u000eJ\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/rt/ebs/cryptosdk/presentation/customView/CustomizableButton;", "Landroidx/appcompat/widget/AppCompatButton;", "Lu2v;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "colorRes", "Lzy11;", "setButtonTextColor", "(I)V", "colorResEnabled", "colorResDisabled", "setButtonBackgroundColor", "(II)V", "dimenRes", "setButtonCornerRadius", "Lru/rt/ebs/cryptosdk/entities/models/CryptoSdkDesign;", "design", "applyDesign", "(Lru/rt/ebs/cryptosdk/entities/models/CryptoSdkDesign;)V", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CustomizableButton extends AppCompatButton implements u2v {
    public CustomizableButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setButtonBackgroundColor(uqb1.e(wng0.ebssdkButtonBackgroundColorEnabled, context), uqb1.e(wng0.ebssdkButtonBackgroundColorDisabled, context));
        setButtonTextColor(uqb1.e(wng0.ebssdkButtonTextColor, context));
    }

    private final void setButtonBackgroundColor(int colorResEnabled, int colorResDisabled) {
        setBackgroundTintList(uqb1.b(getContext(), new Pair[]{new Pair(new int[]{-16842910}, Integer.valueOf(colorResDisabled)), new Pair(new int[]{R.attr.state_enabled}, Integer.valueOf(colorResEnabled))}, true));
    }

    private final void setButtonCornerRadius(int dimenRes) {
        Drawable background = getBackground();
        RippleDrawable rippleDrawable = background instanceof RippleDrawable ? (RippleDrawable) background : null;
        if (rippleDrawable != null) {
            Drawable drawable = rippleDrawable.getDrawable(0);
            GradientDrawable gradientDrawable = drawable instanceof GradientDrawable ? (GradientDrawable) drawable : null;
            if (gradientDrawable != null) {
                gradientDrawable.setCornerRadius(getResources().getDimension(dimenRes));
            }
        }
    }

    private final void setButtonTextColor(int colorRes) {
        setTextColor(getContext().getColor(colorRes));
    }

    @Override // defpackage.u2v
    public void applyDesign(CryptoSdkDesign design) {
        setButtonBackgroundColor(design.getButtonBackgroundColorEnabled(), design.getButtonBackgroundColorDisabled());
        setButtonTextColor(design.getButtonTextColor());
        setButtonCornerRadius(design.getButtonCornerRadius().getDimenRes());
    }

    public CustomizableButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CustomizableButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? wng0.ebssdkButtonStyle : i);
    }

    public CustomizableButton(Context context) {
        this(context, null, 0, 6, null);
    }
}
