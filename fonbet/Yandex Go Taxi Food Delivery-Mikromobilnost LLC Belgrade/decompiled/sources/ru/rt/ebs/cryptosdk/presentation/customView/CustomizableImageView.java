package ru.rt.ebs.cryptosdk.presentation.customView;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.a4i0;
import defpackage.enf;
import defpackage.u2v;
import defpackage.uqb1;
import defpackage.w511;
import defpackage.wng0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.rt.ebs.cryptosdk.entities.models.CryptoSdkDesign;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/rt/ebs/cryptosdk/presentation/customView/CustomizableImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lu2v;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/rt/ebs/cryptosdk/entities/models/CryptoSdkDesign;", "design", "Lzy11;", "applyDesign", "(Lru/rt/ebs/cryptosdk/entities/models/CryptoSdkDesign;)V", "Lru/rt/ebs/cryptosdk/presentation/customView/ImageViewType;", "type", "Lru/rt/ebs/cryptosdk/presentation/customView/ImageViewType;", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CustomizableImageView extends AppCompatImageView implements u2v {
    private final ImageViewType type;

    public CustomizableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray = null;
        try {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a4i0.CustomizableImageView);
            ImageViewType imageViewType = ((ImageViewType[]) ImageViewType.a().toArray(new ImageViewType[0]))[obtainStyledAttributes.getInt(a4i0.CustomizableImageView_imageViewType, 0)];
            this.type = imageViewType;
            if (enf.a[imageViewType.ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            setColorFilter(uqb1.d(wng0.ebssdkSuccessfulVerificationWidgetIconColor, context));
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
        if (enf.a[this.type.ordinal()] != 1) {
            w511.b();
        } else {
            setColorFilter(getContext().getColor(design.getSuccessfulVerificationWidgetIconColor()));
        }
    }

    public CustomizableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CustomizableImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public CustomizableImageView(Context context) {
        this(context, null, 0, 6, null);
    }
}
