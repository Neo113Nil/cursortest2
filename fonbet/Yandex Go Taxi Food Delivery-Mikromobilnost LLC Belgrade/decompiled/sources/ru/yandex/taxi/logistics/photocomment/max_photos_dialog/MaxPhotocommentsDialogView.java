package ru.yandex.taxi.logistics.photocomment.max_photos_dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.cma1;
import defpackage.ijs;
import defpackage.kyh0;
import defpackage.mdh0;
import defpackage.ny61;
import defpackage.rph0;
import defpackage.sls;
import defpackage.zdi;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.buttons.CircleButtonImageView;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/photocomment/max_photos_dialog/MaxPhotocommentsDialogView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lzdi;", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "Lzy11;", "onOkButtonClick", "<init>", "(Landroid/content/Context;Lsls;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lzdi;", "onAttachedToWindow", "()V", "Lsls;", "photocomment"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MaxPhotocommentsDialogView extends SlideableBindingModalView<zdi> {
    private final sls onOkButtonClick;

    public MaxPhotocommentsDialogView(Context context, sls slsVar) {
        super(context);
        this.onOkButtonClick = slsVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public zdi bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(rph0.delivery_max_photos_dialog, parent, false);
        int i = mdh0.delivery_max_photos_dialog_image;
        if (((CircleButtonImageView) cma1.O(i, inflate)) != null) {
            i = mdh0.delivery_max_photos_dialog_message;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView != null) {
                i = mdh0.delivery_max_photos_dialog_ok_button;
                ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
                if (listItemComponent != null) {
                    i = mdh0.delivery_max_photos_dialog_title;
                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView2 != null) {
                        return new zdi((LinearLayout) inflate, robotoTextView, listItemComponent, robotoTextView2);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getBinding().d.setText(kyh0.delivery_photocomment_max_amount_dialog_title);
        getBinding().b.setText(kyh0.delivery_photocomment_max_amount_dialog_message);
        getBinding().c.setTitle(kyh0.delivery_photocomment_max_amount_dialog_ok_button);
        getBinding().c.setDebounceClickListener(new ijs(11, this.onOkButtonClick));
    }
}
