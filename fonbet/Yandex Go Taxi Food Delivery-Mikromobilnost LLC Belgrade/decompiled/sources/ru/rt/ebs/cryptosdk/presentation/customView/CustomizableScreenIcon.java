package ru.rt.ebs.cryptosdk.presentation.customView;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import defpackage.a4i0;
import defpackage.cjn;
import defpackage.cma1;
import defpackage.hnf;
import defpackage.ny61;
import defpackage.sch0;
import defpackage.tyg0;
import defpackage.u2v;
import defpackage.uqb1;
import defpackage.w511;
import defpackage.wng0;
import defpackage.xoh0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.rt.ebs.cryptosdk.entities.models.CryptoSdkDesign;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/rt/ebs/cryptosdk/presentation/customView/CustomizableScreenIcon;", "Landroid/widget/FrameLayout;", "Lu2v;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/rt/ebs/cryptosdk/entities/models/CryptoSdkDesign;", "design", "Lzy11;", "applyDesign", "(Lru/rt/ebs/cryptosdk/entities/models/CryptoSdkDesign;)V", "Lcjn;", "viewBinding", "Lcjn;", "Lru/rt/ebs/cryptosdk/presentation/customView/ScreenIconType;", "type", "Lru/rt/ebs/cryptosdk/presentation/customView/ScreenIconType;", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CustomizableScreenIcon extends FrameLayout implements u2v {
    private final ScreenIconType type;
    private final cjn viewBinding;

    public CustomizableScreenIcon(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View O;
        int i2;
        int i3;
        int i4;
        LayoutInflater.from(context).inflate(xoh0.ebs_customizable_screen_icon, this);
        int i5 = sch0.ebs_customizable_screen_icon;
        ImageView imageView = (ImageView) cma1.O(i5, this);
        TypedArray typedArray = null;
        if (imageView == null || (O = cma1.O((i5 = sch0.ebs_customizable_screen_icon_bg), this)) == null) {
            ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i5)));
            throw null;
        }
        this.viewBinding = new cjn(this, imageView, O);
        try {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a4i0.CustomizableScreenIcon);
            ScreenIconType screenIconType = ((ScreenIconType[]) ScreenIconType.a().toArray(new ScreenIconType[0]))[obtainStyledAttributes.getInt(a4i0.CustomizableScreenIcon_screenIconType, 0)];
            this.type = screenIconType;
            int i6 = hnf.a[screenIconType.ordinal()];
            if (i6 == 1) {
                i2 = tyg0.ebssdk_icon_attention;
                i3 = wng0.ebssdkAttentionIconColor;
                i4 = wng0.ebssdkAttentionIconBackground;
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = tyg0.ebssdk_icon_cancel;
                i3 = wng0.ebssdkCancelIconColor;
                i4 = wng0.ebssdkCancelIconBackground;
            }
            imageView.setImageResource(i2);
            imageView.setColorFilter(uqb1.d(i3, context));
            O.setBackgroundTintList(ColorStateList.valueOf(uqb1.d(i4, context)));
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
        int attentionIconColor;
        int attentionIconBackground;
        int i = hnf.a[this.type.ordinal()];
        if (i == 1) {
            attentionIconColor = design.getAttentionIconColor();
            attentionIconBackground = design.getAttentionIconBackground();
        } else if (i != 2) {
            w511.b();
            return;
        } else {
            attentionIconColor = design.getCancelIconColor();
            attentionIconBackground = design.getCancelIconBackground();
        }
        this.viewBinding.b.setColorFilter(getContext().getColor(attentionIconColor));
        this.viewBinding.c.setBackgroundTintList(ColorStateList.valueOf(getContext().getColor(attentionIconBackground)));
    }

    public CustomizableScreenIcon(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CustomizableScreenIcon(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public CustomizableScreenIcon(Context context) {
        this(context, null, 0, 6, null);
    }
}
