package ru.yandex.taxi.tollroad.alert.card;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import defpackage.ash0;
import defpackage.bgh0;
import defpackage.cma1;
import defpackage.koz0;
import defpackage.kux0;
import defpackage.loz0;
import defpackage.ny61;
import defpackage.sc;
import defpackage.vqz0;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/tollroad/alert/card/TollRoadInfoModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lvqz0;", "Landroid/content/Context;", "context", "Lloz0;", "viewModel", "Lkoz0;", "tollRoadAlertAnalytics", "<init>", "(Landroid/content/Context;Lloz0;Lkoz0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lvqz0;", "Lkoz0;", "alert"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TollRoadInfoModalView extends SlideableBindingModalView<vqz0> {
    private final koz0 tollRoadAlertAnalytics;

    public TollRoadInfoModalView(Context context, loz0 loz0Var, koz0 koz0Var) {
        super(context);
        this.tollRoadAlertAnalytics = koz0Var;
        vqz0 binding = getBinding();
        binding.d.setTitle(loz0Var.a);
        binding.c.setText(loz0Var.b);
        ButtonComponent buttonComponent = binding.b;
        buttonComponent.setText(loz0Var.c);
        buttonComponent.setDebounceClickListener(new kux0(17, this));
        binding.e.setVisibility(8);
        setOnAppearingListener(new sc(12, this));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public vqz0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(ash0.toll_road_ride_info_modal_view, parent, false);
        int i = bgh0.toll_road_alert_main_button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = bgh0.toll_road_alert_payment_description;
            ListTextComponent listTextComponent = (ListTextComponent) cma1.O(i, inflate);
            if (listTextComponent != null) {
                i = bgh0.toll_road_alert_title;
                ListTitleComponent listTitleComponent = (ListTitleComponent) cma1.O(i, inflate);
                if (listTitleComponent != null) {
                    i = bgh0.toll_road_image;
                    ImageView imageView = (ImageView) cma1.O(i, inflate);
                    if (imageView != null) {
                        return new vqz0((NestedScrollViewAdvanced) inflate, buttonComponent, listTextComponent, listTitleComponent, imageView);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }
}
