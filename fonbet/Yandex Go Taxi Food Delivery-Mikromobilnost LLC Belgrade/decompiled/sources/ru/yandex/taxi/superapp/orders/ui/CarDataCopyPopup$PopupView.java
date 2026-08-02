package ru.yandex.taxi.superapp.orders.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import com.yandex.go.taxi.order.models.api.car.CopyInfoType;
import defpackage.bi;
import defpackage.cma1;
import defpackage.dgh0;
import defpackage.esh0;
import defpackage.hg;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.q48;
import defpackage.tls;
import defpackage.web1;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R0\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"ru/yandex/taxi/superapp/orders/ui/CarDataCopyPopup$PopupView", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Lru/yandex/taxi/superapp/orders/ui/c;Landroid/content/Context;)V", "Lzy11;", "initClicks", "()V", "initAccessibility", "Lcom/yandex/go/taxi/order/models/api/car/CopyInfoType;", "item", "onItemCLicked", "(Lcom/yandex/go/taxi/order/models/api/car/CopyInfoType;)V", "Lq48;", "model", "setInfo", "(Lq48;)V", "Lkotlin/Function1;", "itemClickedListener", "Ltls;", "getItemClickedListener", "()Ltls;", "setItemClickedListener", "(Ltls;)V", "Landroid/view/View;", "accessibilityExit", "Landroid/view/View;", "Lru/yandex/taxi/design/ListItemComponent;", "carMark", "Lru/yandex/taxi/design/ListItemComponent;", "carNumber", "carNumberAndMark", "Landroidx/core/view/AccessibilityDelegateCompat;", "accessibilityDelegate", "Landroidx/core/view/AccessibilityDelegateCompat;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CarDataCopyPopup$PopupView extends FrameLayout {
    private final AccessibilityDelegateCompat accessibilityDelegate;
    private final View accessibilityExit;
    private final ListItemComponent carMark;
    private final ListItemComponent carNumber;
    private final ListItemComponent carNumberAndMark;
    private tls itemClickedListener;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarDataCopyPopup$PopupView(c cVar, Context context) {
        super(context);
        this.this$0 = cVar;
        View inflate = LayoutInflater.from(context).inflate(esh0.car_copy_popup, (ViewGroup) this, false);
        addView(inflate);
        int i = dgh0.accessibility_exit;
        View O = cma1.O(i, inflate);
        if (O != null) {
            i = dgh0.car_mark;
            ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
            if (listItemComponent != null) {
                i = dgh0.car_number;
                ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i, inflate);
                if (listItemComponent2 != null) {
                    i = dgh0.car_number_and_mark;
                    ListItemComponent listItemComponent3 = (ListItemComponent) cma1.O(i, inflate);
                    if (listItemComponent3 != null) {
                        this.accessibilityExit = O;
                        this.carMark = listItemComponent;
                        this.carNumber = listItemComponent2;
                        this.carNumberAndMark = listItemComponent3;
                        this.accessibilityDelegate = new bi(getContext().getString(kyh0.common_copy_to_clipboard), 0);
                        initClicks();
                        initAccessibility();
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    private final void initAccessibility() {
        hg.a(this.accessibilityExit);
        c cVar = this.this$0;
        ListItemComponent listItemComponent = this.carMark;
        AccessibilityDelegateCompat accessibilityDelegateCompat = this.accessibilityDelegate;
        cVar.getClass();
        androidx.core.view.b.p(listItemComponent, accessibilityDelegateCompat);
        c cVar2 = this.this$0;
        ListItemComponent listItemComponent2 = this.carNumberAndMark;
        AccessibilityDelegateCompat accessibilityDelegateCompat2 = this.accessibilityDelegate;
        cVar2.getClass();
        androidx.core.view.b.p(listItemComponent2, accessibilityDelegateCompat2);
        c cVar3 = this.this$0;
        ListItemComponent listItemComponent3 = this.carNumber;
        AccessibilityDelegateCompat accessibilityDelegateCompat3 = this.accessibilityDelegate;
        cVar3.getClass();
        androidx.core.view.b.p(listItemComponent3, accessibilityDelegateCompat3);
    }

    private final void initClicks() {
        View view = this.accessibilityExit;
        final c cVar = this.this$0;
        final int i = 3;
        view.setOnClickListener(new View.OnClickListener() { // from class: ru.yandex.taxi.superapp.orders.ui.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                Object obj = cVar;
                switch (i2) {
                    case 0:
                        CarDataCopyPopup$PopupView.initClicks$lambda$1((CarDataCopyPopup$PopupView) obj, view2);
                        break;
                    case 1:
                        CarDataCopyPopup$PopupView.initClicks$lambda$2((CarDataCopyPopup$PopupView) obj, view2);
                        break;
                    case 2:
                        CarDataCopyPopup$PopupView.initClicks$lambda$3((CarDataCopyPopup$PopupView) obj, view2);
                        break;
                    default:
                        CarDataCopyPopup$PopupView.initClicks$lambda$0((c) obj, view2);
                        break;
                }
            }
        });
        final int i2 = 0;
        this.carMark.setOnClickListener(new View.OnClickListener() { // from class: ru.yandex.taxi.superapp.orders.ui.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i2;
                Object obj = this;
                switch (i22) {
                    case 0:
                        CarDataCopyPopup$PopupView.initClicks$lambda$1((CarDataCopyPopup$PopupView) obj, view2);
                        break;
                    case 1:
                        CarDataCopyPopup$PopupView.initClicks$lambda$2((CarDataCopyPopup$PopupView) obj, view2);
                        break;
                    case 2:
                        CarDataCopyPopup$PopupView.initClicks$lambda$3((CarDataCopyPopup$PopupView) obj, view2);
                        break;
                    default:
                        CarDataCopyPopup$PopupView.initClicks$lambda$0((c) obj, view2);
                        break;
                }
            }
        });
        final int i3 = 1;
        this.carNumber.setOnClickListener(new View.OnClickListener() { // from class: ru.yandex.taxi.superapp.orders.ui.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i3;
                Object obj = this;
                switch (i22) {
                    case 0:
                        CarDataCopyPopup$PopupView.initClicks$lambda$1((CarDataCopyPopup$PopupView) obj, view2);
                        break;
                    case 1:
                        CarDataCopyPopup$PopupView.initClicks$lambda$2((CarDataCopyPopup$PopupView) obj, view2);
                        break;
                    case 2:
                        CarDataCopyPopup$PopupView.initClicks$lambda$3((CarDataCopyPopup$PopupView) obj, view2);
                        break;
                    default:
                        CarDataCopyPopup$PopupView.initClicks$lambda$0((c) obj, view2);
                        break;
                }
            }
        });
        final int i4 = 2;
        this.carNumberAndMark.setOnClickListener(new View.OnClickListener() { // from class: ru.yandex.taxi.superapp.orders.ui.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i4;
                Object obj = this;
                switch (i22) {
                    case 0:
                        CarDataCopyPopup$PopupView.initClicks$lambda$1((CarDataCopyPopup$PopupView) obj, view2);
                        break;
                    case 1:
                        CarDataCopyPopup$PopupView.initClicks$lambda$2((CarDataCopyPopup$PopupView) obj, view2);
                        break;
                    case 2:
                        CarDataCopyPopup$PopupView.initClicks$lambda$3((CarDataCopyPopup$PopupView) obj, view2);
                        break;
                    default:
                        CarDataCopyPopup$PopupView.initClicks$lambda$0((c) obj, view2);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClicks$lambda$0(c cVar, View view) {
        ((PopupWindowAboveFromView) cVar.d.getValue()).dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClicks$lambda$1(CarDataCopyPopup$PopupView carDataCopyPopup$PopupView, View view) {
        carDataCopyPopup$PopupView.onItemCLicked(CopyInfoType.CAR_MARK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClicks$lambda$2(CarDataCopyPopup$PopupView carDataCopyPopup$PopupView, View view) {
        carDataCopyPopup$PopupView.onItemCLicked(CopyInfoType.CAR_NUMBER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClicks$lambda$3(CarDataCopyPopup$PopupView carDataCopyPopup$PopupView, View view) {
        carDataCopyPopup$PopupView.onItemCLicked(CopyInfoType.CAR_NUMBER_AND_MARK);
    }

    private final void onItemCLicked(CopyInfoType item) {
        tls tlsVar = this.itemClickedListener;
        if (tlsVar != null) {
            tlsVar.invoke(item);
        }
        ((PopupWindowAboveFromView) this.this$0.d.getValue()).dismiss();
    }

    public final tls getItemClickedListener() {
        return this.itemClickedListener;
    }

    public final void setInfo(q48 model) {
        this.carMark.setTitle(web1.g(model, CopyInfoType.CAR_MARK));
        this.carNumber.setTitle(web1.g(model, CopyInfoType.CAR_NUMBER));
        this.carNumberAndMark.setTitle(web1.g(model, CopyInfoType.CAR_NUMBER_AND_MARK));
    }

    public final void setItemClickedListener(tls tlsVar) {
        this.itemClickedListener = tlsVar;
    }
}
