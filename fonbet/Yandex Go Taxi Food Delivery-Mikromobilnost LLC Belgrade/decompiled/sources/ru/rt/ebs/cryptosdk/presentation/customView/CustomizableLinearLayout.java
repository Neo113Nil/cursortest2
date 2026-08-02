package ru.rt.ebs.cryptosdk.presentation.customView;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import defpackage.a4i0;
import defpackage.fnf;
import defpackage.u2v;
import defpackage.uqb1;
import defpackage.w511;
import defpackage.wng0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.rt.ebs.cryptosdk.entities.models.CryptoSdkDesign;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/rt/ebs/cryptosdk/presentation/customView/CustomizableLinearLayout;", "Landroid/widget/LinearLayout;", "Lu2v;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "color", "Lzy11;", "updateBackgroundColor", "(I)V", "Lru/rt/ebs/cryptosdk/entities/models/CryptoSdkDesign;", "design", "applyDesign", "(Lru/rt/ebs/cryptosdk/entities/models/CryptoSdkDesign;)V", "Lru/rt/ebs/cryptosdk/presentation/customView/LinearLayoutType;", "type", "Lru/rt/ebs/cryptosdk/presentation/customView/LinearLayoutType;", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CustomizableLinearLayout extends LinearLayout implements u2v {
    private final LinearLayoutType type;

    public CustomizableLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray = null;
        try {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a4i0.CustomizableLinearLayout);
            LinearLayoutType linearLayoutType = LinearLayoutType.values()[obtainStyledAttributes.getInt(a4i0.CustomizableLinearLayout_linearLayoutType, 0)];
            this.type = linearLayoutType;
            if (fnf.a[linearLayoutType.ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            updateBackgroundColor(uqb1.d(wng0.ebssdkDataProcessingBackground, context));
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            if (0 != 0) {
                typedArray.recycle();
            }
            throw th;
        }
    }

    private final void updateBackgroundColor(int color) {
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            setBackgroundColor(color);
        } else {
            setBackgroundTintList(ColorStateList.valueOf(color));
        }
    }

    @Override // defpackage.u2v
    public void applyDesign(CryptoSdkDesign design) {
        if (fnf.a[this.type.ordinal()] != 1) {
            w511.b();
        } else {
            updateBackgroundColor(getContext().getColor(design.getDataProcessingBackgroundColor()));
        }
    }

    public CustomizableLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CustomizableLinearLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public CustomizableLinearLayout(Context context) {
        this(context, null, 0, 6, null);
    }
}
