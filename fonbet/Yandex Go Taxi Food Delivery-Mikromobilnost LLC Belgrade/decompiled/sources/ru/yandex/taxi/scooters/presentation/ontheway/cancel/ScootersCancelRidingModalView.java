package ru.yandex.taxi.scooters.presentation.ontheway.cancel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.scooters.analytics.ScootersCancelRideDialogAnalytics$ButtonName;
import defpackage.a4n0;
import defpackage.c4n0;
import defpackage.cma1;
import defpackage.lq31;
import defpackage.mys;
import defpackage.ny61;
import defpackage.pfh0;
import defpackage.qrh0;
import defpackage.r7p0;
import defpackage.sls;
import defpackage.sms;
import defpackage.z3n0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.collections.b;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.scooters.presentation.ontheway.cancel.ScootersCancelRidingModalView;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BY\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001b\u0010\u0014J#\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010$R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010%R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010&R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010&¨\u0006'"}, d2 = {"Lru/yandex/taxi/scooters/presentation/ontheway/cancel/ScootersCancelRidingModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lc4n0;", "Landroid/content/Context;", "context", "Lz3n0;", "analytics", "", FinishFlowStatus.ORDER_ID_FIELD_NAME, "Lr7p0;", "vehicleNumber", "La4n0;", "scootersCancelRiding", "Lkotlin/Function0;", "Lzy11;", "onBack", "onCancel", "<init>", "(Landroid/content/Context;Lz3n0;Ljava/lang/String;Lr7p0;La4n0;Lsls;Lsls;)V", "logAnalyticEventOnClosedByButton", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lc4n0;", "onAttachedToWindow", "Llq31;", "eventType", "", "", "getEventAnalyticsParams", "(Llq31;)Ljava/util/Map;", "Lz3n0;", "Ljava/lang/String;", "Lr7p0;", "La4n0;", "Lsls;", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersCancelRidingModalView extends SlideableBindingModalView<c4n0> {
    public static final int $stable = 8;
    private final z3n0 analytics;
    private final sls onBack;
    private final sls onCancel;
    private final String orderId;
    private final a4n0 scootersCancelRiding;
    private final r7p0 vehicleNumber;

    public ScootersCancelRidingModalView(Context context, z3n0 z3n0Var, String str, r7p0 r7p0Var, a4n0 a4n0Var, sls slsVar, sls slsVar2) {
        super(context);
        this.analytics = z3n0Var;
        this.orderId = str;
        this.vehicleNumber = r7p0Var;
        this.scootersCancelRiding = a4n0Var;
        this.onBack = slsVar;
        this.onCancel = slsVar2;
        setAnalyticsContext(createAnalyticsContext("ScootersCancelRideDialog", EmptySet.a));
    }

    private final void logAnalyticEventOnClosedByButton() {
        ModalView.viewEventListener.d(getAnalyticsContext(), getEventAnalyticsParams(new sms(11)), new mys("button"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0$0(ScootersCancelRidingModalView scootersCancelRidingModalView) {
        scootersCancelRidingModalView.analytics.a(ScootersCancelRideDialogAnalytics$ButtonName.Ok, scootersCancelRidingModalView.orderId, scootersCancelRidingModalView.vehicleNumber.a);
        scootersCancelRidingModalView.logAnalyticEventOnClosedByButton();
        scootersCancelRidingModalView.onCancel.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$1$0(ScootersCancelRidingModalView scootersCancelRidingModalView) {
        scootersCancelRidingModalView.analytics.a(ScootersCancelRideDialogAnalytics$ButtonName.Cancel, scootersCancelRidingModalView.orderId, scootersCancelRidingModalView.vehicleNumber.a);
        scootersCancelRidingModalView.logAnalyticEventOnClosedByButton();
        scootersCancelRidingModalView.onBack.invoke();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public c4n0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(qrh0.scooters_cancel_riding_modal_view, parent, false);
        int i = pfh0.back;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = pfh0.title;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView != null) {
                i = pfh0.yes;
                ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                if (buttonComponent2 != null) {
                    return new c4n0((GoConstraintLayout) inflate, buttonComponent, robotoTextView, buttonComponent2);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.x42
    public Map<String, Object> getEventAnalyticsParams(lq31 eventType) {
        return b.l(new Pair("order_id", this.orderId), new Pair("scooter_number", this.vehicleNumber));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getBinding().c.setText(getContext().getString(this.scootersCancelRiding.a));
        ButtonComponent buttonComponent = getBinding().d;
        buttonComponent.setText(buttonComponent.getContext().getString(this.scootersCancelRiding.b));
        final int i = 0;
        buttonComponent.setDebounceClickListener(new Runnable(this) { // from class: b4n0
            public final /* synthetic */ ScootersCancelRidingModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                ScootersCancelRidingModalView scootersCancelRidingModalView = this.b;
                switch (i2) {
                    case 0:
                        ScootersCancelRidingModalView.onAttachedToWindow$lambda$0$0(scootersCancelRidingModalView);
                        break;
                    default:
                        ScootersCancelRidingModalView.onAttachedToWindow$lambda$1$0(scootersCancelRidingModalView);
                        break;
                }
            }
        });
        ButtonComponent buttonComponent2 = getBinding().b;
        buttonComponent2.setText(buttonComponent2.getContext().getString(this.scootersCancelRiding.c));
        final int i2 = 1;
        buttonComponent2.setDebounceClickListener(new Runnable(this) { // from class: b4n0
            public final /* synthetic */ ScootersCancelRidingModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                ScootersCancelRidingModalView scootersCancelRidingModalView = this.b;
                switch (i22) {
                    case 0:
                        ScootersCancelRidingModalView.onAttachedToWindow$lambda$0$0(scootersCancelRidingModalView);
                        break;
                    default:
                        ScootersCancelRidingModalView.onAttachedToWindow$lambda$1$0(scootersCancelRidingModalView);
                        break;
                }
            }
        });
    }
}
