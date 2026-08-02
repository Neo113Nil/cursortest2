package ru.yandex.taxi.logistics.photocomment.error_photos_dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.cma1;
import defpackage.dci;
import defpackage.i8o;
import defpackage.mdh0;
import defpackage.n7i;
import defpackage.n8o;
import defpackage.ny61;
import defpackage.rph0;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.logistics.photocomment.error_photos_dialog.ErrorPhotosDialogView;
import ru.yandex.taxi.logistics.sdk.photocomments.PhotocommentsView;
import ru.yandex.taxi.widget.BindingModalView;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0018\u0010\u0017\u001a\u00060\u0016R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/photocomment/error_photos_dialog/ErrorPhotosDialogView;", "Lru/yandex/taxi/widget/BindingModalView;", "Ln7i;", "Landroid/content/Context;", "context", "Ln8o;", "presenter", "Ldci;", "imageLoader", "<init>", "(Landroid/content/Context;Ln8o;Ldci;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ln7i;", "Ln8o;", "Li8o;", "mvp", "Li8o;", "photocomment"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ErrorPhotosDialogView extends BindingModalView<n7i> {
    private final i8o mvp;
    private final n8o presenter;

    public ErrorPhotosDialogView(Context context, n8o n8oVar, dci dciVar) {
        super(context);
        this.presenter = n8oVar;
        this.mvp = new i8o(this);
        setDismissOnBackPressed(false);
        setDismissOnTouchOutside(false);
        getBinding().b.setImageLoader(dciVar);
    }

    public static final /* synthetic */ n7i access$getBinding(ErrorPhotosDialogView errorPhotosDialogView) {
        return errorPhotosDialogView.getBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(ErrorPhotosDialogView errorPhotosDialogView) {
        errorPhotosDialogView.presenter.w.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$1(ErrorPhotosDialogView errorPhotosDialogView) {
        errorPhotosDialogView.presenter.x.invoke();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.BindingModalView
    public n7i bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(rph0.delivery_error_photos_dialog, parent, false);
        int i = mdh0.delivery_error_photos;
        PhotocommentsView photocommentsView = (PhotocommentsView) cma1.O(i, inflate);
        if (photocommentsView != null) {
            i = mdh0.delivery_error_photos_dialog_discard_button;
            ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
            if (listItemComponent != null) {
                i = mdh0.delivery_error_photos_dialog_retry_button;
                ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i, inflate);
                if (listItemComponent2 != null) {
                    i = mdh0.delivery_max_photos_dialog_title;
                    if (((ListHeaderComponent) cma1.O(i, inflate)) != null) {
                        return new n7i((LinearLayout) inflate, photocommentsView, listItemComponent, listItemComponent2);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        n8o n8oVar = this.presenter;
        i8o i8oVar = this.mvp;
        n8oVar.Bg(i8oVar);
        access$getBinding(i8oVar.a).b.bindPhotocomments(n8oVar.y);
        final int i = 0;
        getBinding().c.setDebounceClickListener(new Runnable(this) { // from class: h8o
            public final /* synthetic */ ErrorPhotosDialogView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                ErrorPhotosDialogView errorPhotosDialogView = this.b;
                switch (i2) {
                    case 0:
                        ErrorPhotosDialogView.onAttachedToWindow$lambda$0(errorPhotosDialogView);
                        break;
                    default:
                        ErrorPhotosDialogView.onAttachedToWindow$lambda$1(errorPhotosDialogView);
                        break;
                }
            }
        });
        final int i2 = 1;
        getBinding().d.setDebounceClickListener(new Runnable(this) { // from class: h8o
            public final /* synthetic */ ErrorPhotosDialogView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                ErrorPhotosDialogView errorPhotosDialogView = this.b;
                switch (i22) {
                    case 0:
                        ErrorPhotosDialogView.onAttachedToWindow$lambda$0(errorPhotosDialogView);
                        break;
                    default:
                        ErrorPhotosDialogView.onAttachedToWindow$lambda$1(errorPhotosDialogView);
                        break;
                }
            }
        });
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}
