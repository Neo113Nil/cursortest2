package ru.rt.ebs.cryptosdk.presentation.customView;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.a4i0;
import defpackage.cma1;
import defpackage.jnf;
import defpackage.kzh0;
import defpackage.njn;
import defpackage.ny61;
import defpackage.sch0;
import defpackage.u2v;
import defpackage.uh91;
import defpackage.uqb1;
import defpackage.w511;
import defpackage.wng0;
import defpackage.xoh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.rt.ebs.cryptosdk.entities.models.CryptoSdkDesign;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u0007*\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00132\b\b\u0001\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/rt/ebs/cryptosdk/presentation/customView/CustomizableTextWithBulletPoint;", "Landroid/widget/LinearLayout;", "Lu2v;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/content/res/TypedArray;", "Lru/rt/ebs/cryptosdk/presentation/customView/TextWithBulletPointType;", "getTextType", "(Landroid/content/res/TypedArray;)Lru/rt/ebs/cryptosdk/presentation/customView/TextWithBulletPointType;", "getTextRes", "(Landroid/content/res/TypedArray;)I", "getBulletPointColorRes", "()I", "Lzy11;", "setTextColor", "()V", "textRes", "setText", "(I)V", "colorRes", "setIconColor", "Lru/rt/ebs/cryptosdk/entities/models/CryptoSdkDesign;", "design", "applyDesign", "(Lru/rt/ebs/cryptosdk/entities/models/CryptoSdkDesign;)V", "Lnjn;", "viewBinding", "Lnjn;", "type", "Lru/rt/ebs/cryptosdk/presentation/customView/TextWithBulletPointType;", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CustomizableTextWithBulletPoint extends LinearLayout implements u2v {
    private final TextWithBulletPointType type;
    private final njn viewBinding;

    public CustomizableTextWithBulletPoint(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(xoh0.ebs_message_list_item, this);
        int i2 = sch0.ebs_message_icon;
        ImageView imageView = (ImageView) cma1.O(i2, this);
        TypedArray typedArray = null;
        if (imageView != null) {
            i2 = sch0.ebs_message_text;
            TextView textView = (TextView) cma1.O(i2, this);
            if (textView != null) {
                this.viewBinding = new njn(this, imageView, textView);
                setOrientation(0);
                setGravity(48);
                try {
                    typedArray = context.obtainStyledAttributes(attributeSet, a4i0.CustomizableTextWithBulletPoint);
                    this.type = getTextType(typedArray);
                    setTextColor();
                    setText(getTextRes(typedArray));
                    setIconColor(getBulletPointColorRes());
                    if (typedArray != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (typedArray != null) {
                        typedArray.recycle();
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final int getBulletPointColorRes() {
        int i = jnf.a[this.type.ordinal()];
        if (i == 1) {
            return uqb1.e(wng0.ebssdkBiometryInstructionsTextBulletPointsColor, getContext());
        }
        if (i == 2) {
            return uqb1.e(wng0.ebssdkFailedVerificationTextBulletPointsColor, getContext());
        }
        w511.b();
        return 0;
    }

    private final int getTextRes(TypedArray typedArray) {
        return typedArray.getResourceId(a4i0.CustomizableTextWithBulletPoint_customizableTextWithBulletPointTextRes, kzh0.ebssdk_biometry_info_message_3);
    }

    private final TextWithBulletPointType getTextType(TypedArray typedArray) {
        return TextWithBulletPointType.values()[typedArray.getInt(a4i0.CustomizableTextWithBulletPoint_customizableTextWithBulletPointViewType, 0)];
    }

    private final void setIconColor(int colorRes) {
        this.viewBinding.b.setColorFilter(getContext().getColor(colorRes), PorterDuff.Mode.SRC_IN);
    }

    private final void setText(int textRes) {
        this.viewBinding.c.setText(textRes);
    }

    private final void setTextColor() {
        int i;
        int i2 = jnf.a[this.type.ordinal()];
        if (i2 == 1) {
            i = wng0.ebssdkBiometryInstructionsTextColor;
        } else {
            if (i2 != 2) {
                w511.b();
                return;
            }
            i = wng0.ebssdkFailedVerificationTextColorPrimary;
        }
        uh91.d(this.viewBinding.c, uqb1.e(i, getContext()));
    }

    @Override // defpackage.u2v
    public void applyDesign(CryptoSdkDesign design) {
        int biometryInstructionsTextColor;
        int biometryInstructionsTextBulletPointsColor;
        int i = jnf.a[this.type.ordinal()];
        if (i == 1) {
            biometryInstructionsTextColor = design.getBiometryInstructionsTextColor();
            biometryInstructionsTextBulletPointsColor = design.getBiometryInstructionsTextBulletPointsColor();
        } else if (i != 2) {
            w511.b();
            return;
        } else {
            biometryInstructionsTextColor = design.getFailedVerificationTextColorPrimary();
            biometryInstructionsTextBulletPointsColor = design.getFailedVerificationTextBulletPointsColor();
        }
        uh91.d(this.viewBinding.c, biometryInstructionsTextColor);
        setIconColor(biometryInstructionsTextBulletPointsColor);
    }

    public CustomizableTextWithBulletPoint(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CustomizableTextWithBulletPoint(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public CustomizableTextWithBulletPoint(Context context) {
        this(context, null, 0, 6, null);
    }
}
