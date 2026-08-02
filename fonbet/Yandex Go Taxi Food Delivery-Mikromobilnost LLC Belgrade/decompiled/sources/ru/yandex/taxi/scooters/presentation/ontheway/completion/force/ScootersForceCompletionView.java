package ru.yandex.taxi.scooters.presentation.ontheway.completion.force;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.cma1;
import defpackage.kyh0;
import defpackage.lq31;
import defpackage.mon0;
import defpackage.non0;
import defpackage.ny61;
import defpackage.oon0;
import defpackage.pfh0;
import defpackage.qon0;
import defpackage.qrh0;
import defpackage.r7p0;
import defpackage.sls;
import defpackage.tje;
import defpackage.tp11;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.b;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.scooters.data.model.ScootersErrorCode;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.force.ScootersForceCompletionView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bw\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u000e\b\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u000e\b\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u001e\u0010\u0017J%\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\"0!2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010'R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010(R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010)R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010*R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010*R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010*R\u0014\u0010.\u001a\u00020+8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/yandex/taxi/scooters/presentation/ontheway/completion/force/ScootersForceCompletionView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lqon0;", "Landroid/content/Context;", "context", "", FinishFlowStatus.ORDER_ID_FIELD_NAME, "Lr7p0;", "vehicleNumber", "Lru/yandex/taxi/scooters/data/model/ScootersErrorCode;", "scootersErrorCode", "", "isNearestParkingNavigationEnabled", "Lnon0;", "scootersForceCompletionViewAnalytics", "Lkotlin/Function0;", "Lzy11;", "onReturnListener", "onForceCompleteListener", "onFindNearestParkingListener", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lr7p0;Lru/yandex/taxi/scooters/data/model/ScootersErrorCode;ZLnon0;Lsls;Lsls;Lsls;)V", "applyTexts", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lqon0;", "onAttachedToWindow", "Llq31;", "eventType", "", "", "getEventAnalyticsParams", "(Llq31;)Ljava/util/Map;", "Ljava/lang/String;", "Lr7p0;", "Lru/yandex/taxi/scooters/data/model/ScootersErrorCode;", "Z", "Lnon0;", "Lsls;", "", "getCornerRadius", "()I", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersForceCompletionView extends SlideableBindingModalView<qon0> {
    public static final int $stable = 8;
    private final boolean isNearestParkingNavigationEnabled;
    private final sls onFindNearestParkingListener;
    private final sls onForceCompleteListener;
    private final sls onReturnListener;
    private final String orderId;
    private final ScootersErrorCode scootersErrorCode;
    private final non0 scootersForceCompletionViewAnalytics;
    private final r7p0 vehicleNumber;

    public ScootersForceCompletionView(Context context, String str, r7p0 r7p0Var, ScootersErrorCode scootersErrorCode, boolean z, non0 non0Var, sls slsVar, sls slsVar2, sls slsVar3) {
        super(context);
        this.orderId = str;
        this.vehicleNumber = r7p0Var;
        this.scootersErrorCode = scootersErrorCode;
        this.isNearestParkingNavigationEnabled = z;
        this.scootersForceCompletionViewAnalytics = non0Var;
        this.onReturnListener = slsVar;
        this.onForceCompleteListener = slsVar2;
        this.onFindNearestParkingListener = slsVar3;
        String str2 = "ScootersForceCompletionCard";
        if (scootersErrorCode != null && oon0.a[scootersErrorCode.ordinal()] == 1) {
            str2 = "ScootersFixForceCompletionCard";
        }
        setAnalyticsContext(createAnalyticsContext(str2, new LinkedHashSet()));
    }

    private final void applyTexts() {
        ScootersErrorCode scootersErrorCode = this.scootersErrorCode;
        if ((scootersErrorCode == null ? -1 : mon0.a[scootersErrorCode.ordinal()]) == 1) {
            getBinding().f.setText(getContext().getString(kyh0.scooters_is_not_in_fix_finish_area_title));
            getBinding().e.setText(getContext().getString(kyh0.scooters_is_not_in_fix_finish_area_subtitle));
            getBinding().b.setText(getContext().getString(kyh0.scooters_is_not_in_fix_finish_area_back));
            getBinding().c.setText(getContext().getString(kyh0.scooters_is_not_in_fix_finish_area_complete));
            return;
        }
        getBinding().f.setText(getContext().getString(kyh0.scooters_do_not_leave_scooter_title));
        getBinding().e.setText(getContext().getString(kyh0.scooters_do_not_leave_scooter_subtitle));
        getBinding().b.setText(getContext().getString(kyh0.scooters_return));
        getBinding().c.setText(getContext().getString(kyh0.scooters_trip_complete));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(ScootersForceCompletionView scootersForceCompletionView) {
        scootersForceCompletionView.scootersForceCompletionViewAnalytics.a(ScootersForceCompletionViewAnalytics$TappedButton.BACK, scootersForceCompletionView.vehicleNumber, scootersForceCompletionView.orderId);
        scootersForceCompletionView.onReturnListener.invoke();
        scootersForceCompletionView.scootersForceCompletionViewAnalytics.b(scootersForceCompletionView.vehicleNumber, scootersForceCompletionView.orderId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$1(ScootersForceCompletionView scootersForceCompletionView) {
        scootersForceCompletionView.scootersForceCompletionViewAnalytics.a(ScootersForceCompletionViewAnalytics$TappedButton.FORCE_COMPLETE, scootersForceCompletionView.vehicleNumber, scootersForceCompletionView.orderId);
        scootersForceCompletionView.onForceCompleteListener.invoke();
        scootersForceCompletionView.scootersForceCompletionViewAnalytics.b(scootersForceCompletionView.vehicleNumber, scootersForceCompletionView.orderId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$2(ScootersForceCompletionView scootersForceCompletionView) {
        scootersForceCompletionView.onFindNearestParkingListener.invoke();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public qon0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(qrh0.scooters_force_completion_view, parent, false);
        int i = pfh0.back;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = pfh0.complete;
            ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent2 != null) {
                i = pfh0.error_image;
                if (((GoImageView) cma1.O(i, inflate)) != null) {
                    i = pfh0.find_nearest_parking;
                    ButtonComponent buttonComponent3 = (ButtonComponent) cma1.O(i, inflate);
                    if (buttonComponent3 != null) {
                        i = pfh0.subtitle;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                        if (robotoTextView != null) {
                            i = pfh0.title;
                            RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                            if (robotoTextView2 != null) {
                                return new qon0((GoConstraintLayout) inflate, buttonComponent, buttonComponent2, buttonComponent3, robotoTextView, robotoTextView2);
                            }
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
        return b.l(new Pair("scooter_number", this.vehicleNumber), new Pair("order_id", this.orderId));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Boolean bool = tp11.a;
        tp11.b(3, getBinding().c);
        applyTexts();
        final int i = 0;
        getBinding().b.setDebounceClickListener(new Runnable(this) { // from class: lon0
            public final /* synthetic */ ScootersForceCompletionView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                ScootersForceCompletionView scootersForceCompletionView = this.b;
                switch (i2) {
                    case 0:
                        ScootersForceCompletionView.onAttachedToWindow$lambda$0(scootersForceCompletionView);
                        break;
                    case 1:
                        ScootersForceCompletionView.onAttachedToWindow$lambda$1(scootersForceCompletionView);
                        break;
                    default:
                        ScootersForceCompletionView.onAttachedToWindow$lambda$2(scootersForceCompletionView);
                        break;
                }
            }
        });
        final int i2 = 1;
        getBinding().c.setDebounceClickListener(new Runnable(this) { // from class: lon0
            public final /* synthetic */ ScootersForceCompletionView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                ScootersForceCompletionView scootersForceCompletionView = this.b;
                switch (i22) {
                    case 0:
                        ScootersForceCompletionView.onAttachedToWindow$lambda$0(scootersForceCompletionView);
                        break;
                    case 1:
                        ScootersForceCompletionView.onAttachedToWindow$lambda$1(scootersForceCompletionView);
                        break;
                    default:
                        ScootersForceCompletionView.onAttachedToWindow$lambda$2(scootersForceCompletionView);
                        break;
                }
            }
        });
        if (this.isNearestParkingNavigationEnabled) {
            getBinding().d.setVisibility(0);
            final int i3 = 2;
            getBinding().d.setDebounceClickListener(new Runnable(this) { // from class: lon0
                public final /* synthetic */ ScootersForceCompletionView b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i22 = i3;
                    ScootersForceCompletionView scootersForceCompletionView = this.b;
                    switch (i22) {
                        case 0:
                            ScootersForceCompletionView.onAttachedToWindow$lambda$0(scootersForceCompletionView);
                            break;
                        case 1:
                            ScootersForceCompletionView.onAttachedToWindow$lambda$1(scootersForceCompletionView);
                            break;
                        default:
                            ScootersForceCompletionView.onAttachedToWindow$lambda$2(scootersForceCompletionView);
                            break;
                    }
                }
            });
        }
    }
}
