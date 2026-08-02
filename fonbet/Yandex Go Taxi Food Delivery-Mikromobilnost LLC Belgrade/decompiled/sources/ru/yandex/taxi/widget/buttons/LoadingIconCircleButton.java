package ru.yandex.taxi.widget.buttons;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.sph0;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\u000bJ\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/widget/buttons/LoadingIconCircleButton;", "Lru/yandex/taxi/widget/buttons/IconCircleButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lru/yandex/taxi/widget/buttons/CircleButtonImageView;", "Lru/yandex/taxi/widget/buttons/LoadingCircleButtonImageView;", "asLoadingButton", "(Lru/yandex/taxi/widget/buttons/CircleButtonImageView;)Lru/yandex/taxi/widget/buttons/LoadingCircleButtonImageView;", "getLayoutResource", "()I", "Lzy11;", "enableImageLoading", "()V", "disableImageLoading", "imageFadeIn", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LoadingIconCircleButton extends IconCircleButton {
    public /* synthetic */ LoadingIconCircleButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? xng0.circleButtonComponentStyle : i);
    }

    private final LoadingCircleButtonImageView asLoadingButton(CircleButtonImageView circleButtonImageView) {
        if (circleButtonImageView instanceof LoadingCircleButtonImageView) {
            return (LoadingCircleButtonImageView) circleButtonImageView;
        }
        return null;
    }

    public final void disableImageLoading() {
        LoadingCircleButtonImageView asLoadingButton = asLoadingButton(getImageIcon());
        if (asLoadingButton != null) {
            asLoadingButton.setLoading(false);
        }
    }

    public final void enableImageLoading() {
        LoadingCircleButtonImageView asLoadingButton = asLoadingButton(getImageIcon());
        if (asLoadingButton != null) {
            asLoadingButton.setLoading(true);
        }
    }

    @Override // ru.yandex.taxi.widget.buttons.IconCircleButton, ru.yandex.taxi.design.CircleButtonComponent
    public int getLayoutResource() {
        return sph0.loading_button_circle_icon;
    }

    public final void imageFadeIn() {
        LoadingCircleButtonImageView asLoadingButton = asLoadingButton(getImageIcon());
        if (asLoadingButton != null) {
            asLoadingButton.fadeIn();
        }
    }

    public LoadingIconCircleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
    }

    public LoadingIconCircleButton(Context context) {
        this(context, null);
    }

    public LoadingIconCircleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
