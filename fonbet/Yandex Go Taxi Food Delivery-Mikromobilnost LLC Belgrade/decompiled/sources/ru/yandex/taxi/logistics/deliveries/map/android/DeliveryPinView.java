package ru.yandex.taxi.logistics.deliveries.map.android;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.beh0;
import defpackage.cma1;
import defpackage.fqh0;
import defpackage.mhz;
import defpackage.ny61;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/deliveries/map/android/DeliveryPinView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "title", "Lzy11;", "setTitle", "(Ljava/lang/String;)V", "subtitle", "setSubtitle", "Landroid/graphics/Bitmap;", "bitmap", "setLeadImage", "(Landroid/graphics/Bitmap;)V", "Lmhz;", "binding", "Lmhz;", "deliveries"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryPinView extends FrameLayout {
    private final mhz binding;

    public DeliveryPinView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(fqh0.logistics_bubble_pin, (ViewGroup) null, false);
        int i2 = beh0.logistics_bubble_pin_image;
        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, inflate);
        if (appCompatImageView != null) {
            i2 = beh0.logistics_bubble_pin_subtitle;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, inflate);
            if (robotoTextView != null) {
                i2 = beh0.logistics_bubble_pin_title;
                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i2, inflate);
                if (robotoTextView2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    this.binding = new mhz(constraintLayout, appCompatImageView, robotoTextView, robotoTextView2);
                    addView(constraintLayout);
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    public final void setLeadImage(Bitmap bitmap) {
        this.binding.b.setImageBitmap(bitmap);
        this.binding.b.setVisibility(bitmap != null ? 0 : 8);
    }

    public final void setSubtitle(String subtitle) {
        this.binding.c.setText(subtitle);
        this.binding.c.setVisibility(subtitle != null ? 0 : 8);
    }

    public final void setTitle(String title) {
        this.binding.d.setText(title);
        this.binding.d.setVisibility(title != null ? 0 : 8);
    }

    public DeliveryPinView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DeliveryPinView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ DeliveryPinView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
