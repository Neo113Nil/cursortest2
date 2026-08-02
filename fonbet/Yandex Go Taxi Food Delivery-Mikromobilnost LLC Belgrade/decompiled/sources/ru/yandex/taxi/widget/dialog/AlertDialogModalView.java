package ru.yandex.taxi.widget.dialog;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.agh0;
import defpackage.cma1;
import defpackage.czo0;
import defpackage.dr1;
import defpackage.er1;
import defpackage.hbp0;
import defpackage.hc;
import defpackage.ny61;
import defpackage.qdb1;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.xw31;
import defpackage.zrh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.utils.d;
import ru.yandex.taxi.widget.BottomEdgeButtonLayout;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BQ\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0014\u001a\u00020\n*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001e\u0010\u001dJ\r\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010\u001dJ\r\u0010 \u001a\u00020\n¢\u0006\u0004\b \u0010\u001dJ\r\u0010!\u001a\u00020\n¢\u0006\u0004\b!\u0010\u001dJ\u0015\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J#\u0010&\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b(\u0010'R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010)R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010+R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R$\u00106\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00109\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u00103\"\u0004\b8\u00105¨\u0006:"}, d2 = {"Lru/yandex/taxi/widget/dialog/AlertDialogModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Ler1;", "Landroid/content/Context;", "context", "Lru/yandex/taxi/utils/d;", "iconLoader", "", "iconTag", "Lkotlin/Function1;", "Lzy11;", "onAttach", "Lkotlin/Function0;", "onDetach", "<init>", "(Landroid/content/Context;Lru/yandex/taxi/utils/d;Ljava/lang/String;Ltls;Lsls;)V", "Lru/yandex/taxi/design/ButtonComponent;", "", "text", "listener", "setupButton", "(Lru/yandex/taxi/design/ButtonComponent;Ljava/lang/CharSequence;Lsls;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ler1;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "dismissOnTouchOutsideOff", "dismissOnTouchOutsideOn", "setupBackButton", "Landroid/graphics/Bitmap;", "bitmap", "setupIcon", "(Landroid/graphics/Bitmap;)V", "setupAdditionalButton", "(Ljava/lang/CharSequence;Lsls;)V", "setupMainButton", "Landroid/content/Context;", "Lru/yandex/taxi/utils/d;", "Ljava/lang/String;", "Ltls;", "Lsls;", "Lhbp0;", "imageLoadingScope", "Lhbp0;", "value", "getTitle", "()Ljava/lang/CharSequence;", "setTitle", "(Ljava/lang/CharSequence;)V", "title", "getDescription", "setDescription", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AlertDialogModalView extends SlideableBindingModalView<er1> {
    public static final int $stable = 8;
    private final Context context;
    private final d iconLoader;
    private final String iconTag;
    private final hbp0 imageLoadingScope;
    private final tls onAttach;
    private final sls onDetach;

    public AlertDialogModalView(Context context, d dVar, String str, tls tlsVar, sls slsVar) {
        super(context);
        this.context = context;
        this.iconLoader = dVar;
        this.iconTag = str;
        this.onAttach = tlsVar;
        this.onDetach = slsVar;
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        String str2 = (2 & 1) != 0 ? null : "IMAGE_LOADING_SCOPE_NAME";
        this.imageLoadingScope = new hbp0(new czo0(14), str2 == null ? "" : str2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(AlertDialogModalView alertDialogModalView) {
        if (alertDialogModalView.getBinding().f.getVisibility() == 0) {
            xw31.w(alertDialogModalView.getBinding().f);
        } else {
            xw31.w(alertDialogModalView.getBinding().c);
        }
        tls tlsVar = alertDialogModalView.onAttach;
        if (tlsVar != null) {
            tlsVar.invoke(alertDialogModalView);
        }
    }

    private final void setupButton(ButtonComponent buttonComponent, CharSequence charSequence, sls slsVar) {
        buttonComponent.setVisibility(0);
        buttonComponent.setText(charSequence);
        buttonComponent.setDebounceClickListener(new hc(13, slsVar, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupButton$lambda$0(sls slsVar, AlertDialogModalView alertDialogModalView) {
        slsVar.invoke();
        alertDialogModalView.dismiss();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public er1 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(zrh0.alert_dialog_modal_view, parent, false);
        int i = agh0.additional_button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = agh0.bottom_buttons;
            if (((BottomEdgeButtonLayout) cma1.O(i, inflate)) != null) {
                i = agh0.description;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                if (robotoTextView != null) {
                    i = agh0.icon;
                    ImageView imageView = (ImageView) cma1.O(i, inflate);
                    if (imageView != null) {
                        i = agh0.main_button;
                        ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                        if (buttonComponent2 != null) {
                            i = agh0.title;
                            RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                            if (robotoTextView2 != null) {
                                return new er1((ConstraintLayout) inflate, buttonComponent, robotoTextView, imageView, buttonComponent2, robotoTextView2);
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    public final void dismissOnTouchOutsideOff() {
        setDismissOnTouchOutside(false);
    }

    public final void dismissOnTouchOutsideOn() {
        setDismissOnTouchOutside(true);
    }

    public final CharSequence getDescription() {
        return getBinding().c.getText();
    }

    public final CharSequence getTitle() {
        return getBinding().f.getText();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(new dr1(this, 0));
        this.imageLoadingScope.a();
        if (this.iconLoader == null) {
            return;
        }
        tje.N(this.imageLoadingScope.c(), null, null, new AlertDialogModalView$onAttachedToWindow$2(this, null), 3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.imageLoadingScope.b();
        sls slsVar = this.onDetach;
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    public final void setDescription(CharSequence charSequence) {
        getBinding().c.setVisibility(charSequence.length() > 0 ? 0 : 8);
        getBinding().c.setText(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        getBinding().f.setVisibility(charSequence.length() > 0 ? 0 : 8);
        getBinding().f.setText(charSequence);
    }

    public final void setupAdditionalButton(CharSequence text, sls listener) {
        setupButton(getBinding().b, text, listener);
    }

    public final void setupBackButton() {
        qdb1.b(this, new dr1(this, 1));
    }

    public final void setupIcon(Bitmap bitmap) {
        getBinding().d.setVisibility(0);
        getBinding().d.setImageBitmap(bitmap);
    }

    public final void setupMainButton(CharSequence text, sls listener) {
        setupButton(getBinding().e, text, listener);
    }

    public /* synthetic */ AlertDialogModalView(Context context, d dVar, String str, tls tlsVar, sls slsVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : dVar, str, (i & 8) != 0 ? null : tlsVar, (i & 16) != 0 ? null : slsVar);
    }
}
