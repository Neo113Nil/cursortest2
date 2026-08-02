package ru.yandex.taxi.scooters.presentation.ontheway.bluetooth;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a2n0;
import defpackage.cma1;
import defpackage.lq31;
import defpackage.ny61;
import defpackage.pfh0;
import defpackage.qrh0;
import defpackage.sls;
import defpackage.tje;
import defpackage.y1n0;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.scooters.presentation.ontheway.bluetooth.ScootersBluetoothModalView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u0014\u0010$\u001a\u00020!8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/yandex/taxi/scooters/presentation/ontheway/bluetooth/ScootersBluetoothModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "La2n0;", "Landroid/content/Context;", "context", "Ly1n0;", "scootersBluetoothModalViewAnalytics", "Lkotlin/Function0;", "Lzy11;", "onReject", "onContinue", "<init>", "(Landroid/content/Context;Ly1n0;Lsls;Lsls;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La2n0;", "onAttachedToWindow", "()V", "", "isArrowsPermanentlyHidden", "()Z", "Llq31;", "eventType", "", "", "", "getEventAnalyticsParams", "(Llq31;)Ljava/util/Map;", "Ly1n0;", "Lsls;", "", "getCornerRadius", "()I", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersBluetoothModalView extends SlideableBindingModalView<a2n0> {
    public static final int $stable = 8;
    private final sls onContinue;
    private final sls onReject;
    private final y1n0 scootersBluetoothModalViewAnalytics;

    public ScootersBluetoothModalView(Context context, y1n0 y1n0Var, sls slsVar, sls slsVar2) {
        super(context);
        this.scootersBluetoothModalViewAnalytics = y1n0Var;
        this.onReject = slsVar;
        this.onContinue = slsVar2;
        getBottomSheetBehavior().a0 = false;
        setAnalyticsContext(createAnalyticsContext("ScootersBluetoothAuthDialog", new LinkedHashSet()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(ScootersBluetoothModalView scootersBluetoothModalView) {
        scootersBluetoothModalView.scootersBluetoothModalViewAnalytics.a.d(ScootersBluetoothModalViewAnalytics$TappedButton.OK.getButtonName(), null, null, null);
        scootersBluetoothModalView.scootersBluetoothModalViewAnalytics.a.c(null, null, null);
        scootersBluetoothModalView.onReject.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$1(ScootersBluetoothModalView scootersBluetoothModalView) {
        scootersBluetoothModalView.scootersBluetoothModalViewAnalytics.a.d(ScootersBluetoothModalViewAnalytics$TappedButton.CANCEL.getButtonName(), null, null, null);
        scootersBluetoothModalView.scootersBluetoothModalViewAnalytics.a.c(null, null, null);
        scootersBluetoothModalView.onContinue.invoke();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public a2n0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(qrh0.scooters_bluetooth_modal_view, parent, false);
        int i = pfh0.back_btn;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = pfh0.ble_sign;
            if (((GoImageView) cma1.O(i, inflate)) != null) {
                i = pfh0.continue_btn;
                ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                if (buttonComponent2 != null) {
                    i = pfh0.subtitle;
                    if (((RobotoTextView) cma1.O(i, inflate)) != null) {
                        i = pfh0.title;
                        if (((RobotoTextView) cma1.O(i, inflate)) != null) {
                            return new a2n0((GoConstraintLayout) inflate, buttonComponent, buttonComponent2);
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: getCornerRadius */
    public int getCornersRadius() {
        return tje.u(24, getContext());
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.x42
    public Map<String, Object> getEventAnalyticsParams(lq31 eventType) {
        return new LinkedHashMap();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getWithCloseButton() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        final int i = 0;
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        getBinding().b.setDebounceClickListener(new Runnable(this) { // from class: x1n0
            public final /* synthetic */ ScootersBluetoothModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                ScootersBluetoothModalView scootersBluetoothModalView = this.b;
                switch (i2) {
                    case 0:
                        ScootersBluetoothModalView.onAttachedToWindow$lambda$0(scootersBluetoothModalView);
                        break;
                    default:
                        ScootersBluetoothModalView.onAttachedToWindow$lambda$1(scootersBluetoothModalView);
                        break;
                }
            }
        });
        final int i2 = 1;
        getBinding().c.setDebounceClickListener(new Runnable(this) { // from class: x1n0
            public final /* synthetic */ ScootersBluetoothModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                ScootersBluetoothModalView scootersBluetoothModalView = this.b;
                switch (i22) {
                    case 0:
                        ScootersBluetoothModalView.onAttachedToWindow$lambda$0(scootersBluetoothModalView);
                        break;
                    default:
                        ScootersBluetoothModalView.onAttachedToWindow$lambda$1(scootersBluetoothModalView);
                        break;
                }
            }
        });
    }
}
