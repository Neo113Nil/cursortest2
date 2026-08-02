package ru.yandex.taxi.modal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.agh0;
import defpackage.cma1;
import defpackage.ny61;
import defpackage.y130;
import defpackage.yow;
import defpackage.zrh0;
import defpackage.zzy;
import kotlin.Metadata;
import ru.yandex.taxi.widget.BindingModalView;
import ru.yandex.taxi.widget.progress.CircularProgressBar;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0015¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/modal/LoadingModalView;", "Lru/yandex/taxi/widget/BindingModalView;", "Lzzy;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ly130;", "insetsType", "()Ly130;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lzzy;", "contentView", "()Landroid/view/ViewGroup;", "Lzy11;", "onBackPressed", "()V", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LoadingModalView extends BindingModalView<zzy> {
    public static final int $stable = 8;

    public LoadingModalView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(LoadingModalView loadingModalView) {
        return loadingModalView.getBinding().a;
    }

    @Override // ru.yandex.taxi.widget.BindingModalView
    public zzy bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = LayoutInflater.from(getContext()).inflate(zrh0.loading_modal_view_content, parent, false);
        int i = agh0.loading_modal_spinner;
        if (((CircularProgressBar) cma1.O(i, inflate)) != null) {
            return new zzy((FrameLayout) inflate);
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.BindingModalView, ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public ViewGroup getContentView() {
        return getBinding().a;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public y130 insetsType() {
        return new y130(1, new yow(19, this));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
    }
}
