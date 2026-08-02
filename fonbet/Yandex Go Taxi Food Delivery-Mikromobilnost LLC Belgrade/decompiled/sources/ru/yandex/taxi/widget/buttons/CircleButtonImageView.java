package ru.yandex.taxi.widget.buttons;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0016R\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/widget/buttons/CircleButtonImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "Lzy11;", "onMeasure", "(II)V", "padding", "setPadding", "(I)V", "left", "top", "right", "bottom", "(IIII)V", CA20Status.STATUS_USER_I, "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public class CircleButtonImageView extends AppCompatImageView {
    private int padding;

    public /* synthetic */ CircleButtonImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int i = getLayoutParams().width == 0 ? size : getLayoutParams().width;
        if (i == 0 || size == 0) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        float f = size / i;
        if (f < 1.0f) {
            int i2 = (size - ((int) ((i - (r3 * 2)) * f))) / 2;
            if (this.padding != i2) {
                super.setPadding(i2, i2, i2, i2);
            }
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override // android.view.View
    public void setPadding(int left, int top, int right, int bottom) {
        throw new UnsupportedOperationException("use setPadding(int padding)");
    }

    public final void setPadding(int padding) {
        this.padding = padding;
        super.setPadding(padding, padding, padding, padding);
    }

    public CircleButtonImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CircleButtonImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.padding = getPaddingLeft();
    }

    public CircleButtonImageView(Context context) {
        this(context, null, 0, 6, null);
    }
}
