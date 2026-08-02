package ru.yandex.taxi.favorites.delete;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.b9h;
import defpackage.cma1;
import defpackage.cvw;
import defpackage.drh;
import defpackage.erh;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.qje;
import defpackage.tdh0;
import defpackage.xng0;
import defpackage.xph0;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001a\u0010\u000fR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/favorites/delete/DeleteFavoriteModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lerh;", "Landroid/content/Context;", "context", "", "isMigratedToDatum", "<init>", "(Landroid/content/Context;Z)V", "Ljava/lang/Runnable;", "listener", "Lzy11;", "setOnDeleteClickListener", "(Ljava/lang/Runnable;)V", "startLoading", "()V", "stopLoading", "Landroid/view/View;", "getFocusedForAccessibilityViewOnAppear", "()Landroid/view/View;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lerh;", "onDetachedFromWindow", "deleteClickListener", "Ljava/lang/Runnable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeleteFavoriteModalView extends SlideableBindingModalView<erh> {
    public static final int $stable = 8;
    private Runnable deleteClickListener;

    public DeleteFavoriteModalView(Context context, boolean z) {
        super(context);
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        erh binding = getBinding();
        c.z(new b9h(10), binding.a);
        binding.b.setDebounceClickListener(new drh(this, 0));
        binding.d.setDebounceClickListener(new drh(this, 1));
        binding.e.setVisibility(z ? 0 : 8);
        cvw.g0(qje.t(xng0.bgMain, getContext()), getContext().getResources().getDimensionPixelSize(mrg0.modal_view_corner_radius_big), binding.c);
        setDismissOnTouchOutside(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$0$1(DeleteFavoriteModalView deleteFavoriteModalView) {
        Runnable runnable = deleteFavoriteModalView.deleteClickListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stopLoading$lambda$0$0(DeleteFavoriteModalView deleteFavoriteModalView) {
        Runnable runnable = deleteFavoriteModalView.deleteClickListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public erh bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(xph0.delete_favorite_modal_view, parent, false);
        int i = tdh0.cancel_button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            LinearLayout linearLayout = (LinearLayout) inflate;
            i = tdh0.delete_button;
            ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent2 != null) {
                i = tdh0.subtitle;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                if (robotoTextView != null) {
                    i = tdh0.title;
                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView2 != null) {
                        return new erh(linearLayout, buttonComponent, linearLayout, buttonComponent2, robotoTextView, robotoTextView2);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public View getFocusedForAccessibilityViewOnAppear() {
        return getBinding().f;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.deleteClickListener = null;
        super.onDetachedFromWindow();
    }

    public final void setOnDeleteClickListener(Runnable listener) {
        this.deleteClickListener = listener;
    }

    public final void startLoading() {
        erh binding = getBinding();
        binding.d.setButtonBackground(qje.t(xng0.controlMinor, getContext()));
        ButtonComponent buttonComponent = binding.d;
        buttonComponent.startProgress();
        buttonComponent.setDebounceClickListener(null);
        binding.b.setDebounceClickListener(null);
    }

    public final void stopLoading() {
        erh binding = getBinding();
        binding.d.finishProgress();
        ButtonComponent buttonComponent = binding.d;
        buttonComponent.setButtonBackground(qje.t(xng0.controlMain, getContext()));
        binding.b.setDebounceClickListener(new drh(this, 2));
        buttonComponent.setDebounceClickListener(new drh(this, 3));
    }
}
