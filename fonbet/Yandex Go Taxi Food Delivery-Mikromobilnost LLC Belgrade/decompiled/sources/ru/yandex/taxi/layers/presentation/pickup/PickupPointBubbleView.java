package ru.yandex.taxi.layers.presentation.pickup;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.bqh0;
import defpackage.i3y;
import defpackage.sls;
import defpackage.wdh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.layers.presentation.pickup.PickupPointBubbleView;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/yandex/taxi/layers/presentation/pickup/PickupPointBubbleView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "title", "Lzy11;", "setTitle", "(Ljava/lang/String;)V", "color", "setTextColor", "(I)V", "setIconTint", "Landroid/graphics/Bitmap;", "bitmap", "setImageBitmap", "(Landroid/graphics/Bitmap;)V", "Lru/yandex/taxi/widget/RobotoTextView;", "textView$delegate", "Li3y;", "getTextView", "()Lru/yandex/taxi/widget/RobotoTextView;", "textView", "Landroidx/appcompat/widget/AppCompatImageView;", "imageView$delegate", "getImageView", "()Landroidx/appcompat/widget/AppCompatImageView;", "imageView", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PickupPointBubbleView extends FrameLayout {

    /* renamed from: imageView$delegate, reason: from kotlin metadata */
    private final i3y imageView;

    /* renamed from: textView$delegate, reason: from kotlin metadata */
    private final i3y textView;

    public PickupPointBubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        final int i2 = 0;
        this.textView = kotlin.a.a(new sls(this) { // from class: dqb0
            public final /* synthetic */ PickupPointBubbleView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                RobotoTextView textView_delegate$lambda$0;
                AppCompatImageView imageView_delegate$lambda$0;
                int i3 = i2;
                PickupPointBubbleView pickupPointBubbleView = this.b;
                switch (i3) {
                    case 0:
                        textView_delegate$lambda$0 = PickupPointBubbleView.textView_delegate$lambda$0(pickupPointBubbleView);
                        return textView_delegate$lambda$0;
                    default:
                        imageView_delegate$lambda$0 = PickupPointBubbleView.imageView_delegate$lambda$0(pickupPointBubbleView);
                        return imageView_delegate$lambda$0;
                }
            }
        });
        final int i3 = 1;
        this.imageView = kotlin.a.a(new sls(this) { // from class: dqb0
            public final /* synthetic */ PickupPointBubbleView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                RobotoTextView textView_delegate$lambda$0;
                AppCompatImageView imageView_delegate$lambda$0;
                int i32 = i3;
                PickupPointBubbleView pickupPointBubbleView = this.b;
                switch (i32) {
                    case 0:
                        textView_delegate$lambda$0 = PickupPointBubbleView.textView_delegate$lambda$0(pickupPointBubbleView);
                        return textView_delegate$lambda$0;
                    default:
                        imageView_delegate$lambda$0 = PickupPointBubbleView.imageView_delegate$lambda$0(pickupPointBubbleView);
                        return imageView_delegate$lambda$0;
                }
            }
        });
        View.inflate(context, bqh0.pickup_point_bubble_layout, this);
    }

    private final AppCompatImageView getImageView() {
        return (AppCompatImageView) this.imageView.getValue();
    }

    private final RobotoTextView getTextView() {
        return (RobotoTextView) this.textView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppCompatImageView imageView_delegate$lambda$0(PickupPointBubbleView pickupPointBubbleView) {
        return (AppCompatImageView) pickupPointBubbleView.findViewById(wdh0.image_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RobotoTextView textView_delegate$lambda$0(PickupPointBubbleView pickupPointBubbleView) {
        return (RobotoTextView) pickupPointBubbleView.findViewById(wdh0.text_view);
    }

    public final void setIconTint(int color) {
        getImageView().setImageTintList(ColorStateList.valueOf(color));
    }

    public final void setImageBitmap(Bitmap bitmap) {
        getImageView().setImageBitmap(bitmap);
        getImageView().setVisibility(bitmap != null ? 0 : 8);
    }

    public final void setTextColor(int color) {
        getTextView().setTextColor(color);
    }

    public final void setTitle(String title) {
        getTextView().setText(title);
    }

    public PickupPointBubbleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public PickupPointBubbleView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ PickupPointBubbleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
