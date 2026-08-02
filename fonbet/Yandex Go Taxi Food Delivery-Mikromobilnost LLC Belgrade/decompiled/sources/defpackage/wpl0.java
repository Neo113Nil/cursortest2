package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.ListTitleComponent;

/* loaded from: classes13.dex */
public final class wpl0 implements zo31 {
    public final LinearLayout a;
    public final ImageView b;
    public final ButtonComponent c;
    public final ListTextComponent d;
    public final ListTitleComponent e;
    public final ButtonComponent f;

    public wpl0(LinearLayout linearLayout, ImageView imageView, ButtonComponent buttonComponent, ListTextComponent listTextComponent, ListTitleComponent listTitleComponent, ButtonComponent buttonComponent2) {
        this.a = linearLayout;
        this.b = imageView;
        this.c = buttonComponent;
        this.d = listTextComponent;
        this.e = listTitleComponent;
        this.f = buttonComponent2;
    }

    public static wpl0 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(tjh0.safety_center_car_crash_dialog_view, viewGroup, false);
        int i = i7h0.image;
        ImageView imageView = (ImageView) cma1.O(i, inflate);
        if (imageView != null) {
            i = i7h0.safety_center_bottom_button;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent != null) {
                LinearLayout linearLayout = (LinearLayout) inflate;
                i = i7h0.safety_center_description;
                ListTextComponent listTextComponent = (ListTextComponent) cma1.O(i, inflate);
                if (listTextComponent != null) {
                    i = i7h0.safety_center_title;
                    ListTitleComponent listTitleComponent = (ListTitleComponent) cma1.O(i, inflate);
                    if (listTitleComponent != null) {
                        i = i7h0.safety_center_top_button;
                        ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                        if (buttonComponent2 != null) {
                            return new wpl0(linearLayout, imageView, buttonComponent, listTextComponent, listTitleComponent, buttonComponent2);
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
