package ru.yandex.taxi.scooters.presentation.common.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a2i0;
import defpackage.cvw;
import defpackage.i3y;
import defpackage.j6m0;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.tje;
import defpackage.v3n0;
import defpackage.vjh0;
import defpackage.w3n0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.scooters.utils.ScootersCloseButtonIconComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\bJ/\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H$¢\u0006\u0004\b\u0011\u0010\bJ\u0011\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0015¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\n8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0019¨\u0006,"}, d2 = {"Lru/yandex/taxi/scooters/presentation/common/ui/ScootersCameraSlideableModalView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lzy11;", "updateCameraPreviewHeight", "()V", "onAttachedToWindow", "", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "onCloseClicked", "topTextRes", "()Ljava/lang/Integer;", "", "text", "setTopText", "(Ljava/lang/CharSequence;)V", "getTopPadding", "()I", "", "isArrowsPermanentlyHidden", "()Z", "", "newOffset", "onDialogSlide", "(F)V", "Lru/yandex/taxi/widget/RobotoTextView;", "topTextHint$delegate", "Li3y;", "getTopTextHint", "()Lru/yandex/taxi/widget/RobotoTextView;", "topTextHint", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "closeButton", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "getCornerRadius", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ScootersCameraSlideableModalView extends SlideableModalView {
    public static final int $stable = 8;
    private final FloatButtonIconComponent closeButton;

    /* renamed from: topTextHint$delegate, reason: from kotlin metadata */
    private final i3y topTextHint;

    public ScootersCameraSlideableModalView(Context context) {
        super(context);
        this.topTextHint = kotlin.a.b(LazyThreadSafetyMode.NONE, new j6m0(18, this));
        v3n0 v3n0Var = new v3n0(0, this);
        ScootersCloseButtonIconComponent scootersCloseButtonIconComponent = new ScootersCloseButtonIconComponent(new ContextThemeWrapper(getContext(), a2i0.FloatButtonIconStyle), null, 0, 6, null);
        scootersCloseButtonIconComponent.setDebounceClickListener(v3n0Var);
        scootersCloseButtonIconComponent.setLayoutParams(new ViewGroup.LayoutParams(-2, tje.u(90, scootersCloseButtonIconComponent.getContext())));
        addFloatButton(scootersCloseButtonIconComponent, 8388611);
        this.closeButton = scootersCloseButtonIconComponent;
    }

    private final RobotoTextView getTopTextHint() {
        return (RobotoTextView) this.topTextHint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RobotoTextView topTextHint_delegate$lambda$0(ScootersCameraSlideableModalView scootersCameraSlideableModalView) {
        return (RobotoTextView) c.q(scootersCameraSlideableModalView, vjh0.scooters_camera_top_text_hint, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCameraPreviewHeight() {
        View cardContentView = getCardContentView();
        ViewGroup.LayoutParams layoutParams = getCardContentView().getLayoutParams();
        layoutParams.height = getContent().getHeight() - this.closeButton.getHeight();
        cardContentView.setLayoutParams(layoutParams);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: getCornerRadius */
    public int getCornersRadius() {
        return tje.u(24, getContext());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getTopPadding() {
        return tje.r(mrg0.go_design_s_space, getContext());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getRouteSummaryIsVisible() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = 0;
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        cvw.g0(getContext().getColor(mqg0.component_fog_light), getCornersRadius(), getBottomSheet());
        Integer num = topTextRes();
        if (num != null) {
            getTopTextHint().setText(getContext().getString(num.intValue()));
        }
        SlideableModalView.addViewAboveCard$default(this, getTopTextHint(), 49, 0, 4, null);
        SlideableModalView.addViewAboveCard$default(this, this.closeButton, 8388659, 0, 4, null);
        OneShotPreDrawListener.add(getCardContentView(), new w3n0(this, i));
    }

    public abstract void onCloseClicked();

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onDialogSlide(float newOffset) {
        super.onDialogSlide(newOffset);
        float max = Math.max(0.0f, Math.min(getSlideOffset(), 1.0f));
        getTopTextHint().setAlpha(max);
        this.closeButton.setAlpha(max);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        OneShotPreDrawListener.add(getContent(), new w3n0(this, 1));
    }

    public final void setTopText(CharSequence text) {
        getTopTextHint().setText(text);
    }

    public Integer topTextRes() {
        return null;
    }
}
