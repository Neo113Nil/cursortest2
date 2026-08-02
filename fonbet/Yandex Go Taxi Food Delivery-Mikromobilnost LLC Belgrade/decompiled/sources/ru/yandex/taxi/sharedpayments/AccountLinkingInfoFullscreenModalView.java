package ru.yandex.taxi.sharedpayments;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.go.account.api.family.SharedPaymentContext;
import defpackage.aap;
import defpackage.d4;
import defpackage.g18;
import defpackage.l9;
import defpackage.mbp;
import defpackage.nac;
import defpackage.nl;
import defpackage.obv;
import defpackage.pav;
import defpackage.rp31;
import defpackage.tse0;
import defpackage.uch0;
import defpackage.vnr0;
import defpackage.y4;
import defpackage.y9p;
import defpackage.yoh0;
import defpackage.zy11;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.PlaceholderView;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/sharedpayments/AccountLinkingInfoFullscreenModalView;", "Lru/yandex/taxi/widget/ModalView;", "Lpav;", "imageLoader", "Laap;", "familyAccountAnalytics", "Landroid/content/Context;", "context", "Lmbp;", "screenParams", "Ljava/lang/Runnable;", "onConfirmAction", "Lcom/yandex/go/account/api/family/SharedPaymentContext;", "analyticsContext", "<init>", "(Lpav;Laap;Landroid/content/Context;Lmbp;Ljava/lang/Runnable;Lcom/yandex/go/account/api/family/SharedPaymentContext;)V", "Lzy11;", "onDetachedFromWindow", "()V", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "Lg18;", "imageLoadCancellable", "Lg18;", "Landroid/view/View;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AccountLinkingInfoFullscreenModalView extends ModalView {
    private final View contentView;
    private g18 imageLoadCancellable;

    public AccountLinkingInfoFullscreenModalView(pav pavVar, aap aapVar, Context context, mbp mbpVar, Runnable runnable, SharedPaymentContext sharedPaymentContext) {
        super(context);
        ru.yandex.taxi.design.utils.c.q(this, yoh0.account_linking_info_view, true);
        int i = 0;
        setDismissOnTouchOutside(false);
        int i2 = uch0.title_text_view;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ((TextView) ((View) rp31.d(this, i2))).setText(mbpVar.a);
        ((TextView) ((View) rp31.d(this, uch0.subtitle_text_view))).setText(mbpVar.b);
        ButtonComponent buttonComponent = (ButtonComponent) ((View) rp31.d(this, uch0.confirm_button));
        buttonComponent.setText(mbpVar.d);
        buttonComponent.setDebounceClickListener(new l9(aapVar, sharedPaymentContext, runnable, this, 1));
        ((ImageView) ((View) rp31.d(this, uch0.close_button))).setOnClickListener(new nl(i, aapVar, sharedPaymentContext, this));
        String str = mbpVar.c;
        if (str.length() > 0) {
            ImageView imageView = (ImageView) ((View) rp31.d(this, uch0.background_image));
            PlaceholderView placeholderView = (PlaceholderView) ((View) rp31.d(this, uch0.image_placeholder));
            placeholderView.setVisibility(0);
            int i3 = 6;
            nac nacVar = (nac) pavVar.a(imageView);
            nacVar.i = new d4(i3, placeholderView);
            nacVar.h = new y4(10, placeholderView);
            this.imageLoadCancellable = nacVar.b(new obv(str, null, i3, i));
        }
        this.contentView = (View) rp31.d(this, uch0.content);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(aap aapVar, SharedPaymentContext sharedPaymentContext, Runnable runnable, AccountLinkingInfoFullscreenModalView accountLinkingInfoFullscreenModalView) {
        y9p y9pVar = ((vnr0) aapVar).l;
        String value = sharedPaymentContext.getValue();
        HashMap n = tse0.n(y9pVar);
        if (value != null) {
            n.put("context", value);
        }
        y9pVar.a.a("FamilyAccount.ForceZalogin.Card.ActionButtonTap", n, 1, new HashMap());
        runnable.run();
        accountLinkingInfoFullscreenModalView.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(aap aapVar, SharedPaymentContext sharedPaymentContext, AccountLinkingInfoFullscreenModalView accountLinkingInfoFullscreenModalView, View view) {
        y9p y9pVar = ((vnr0) aapVar).l;
        String value = sharedPaymentContext.getValue();
        HashMap n = tse0.n(y9pVar);
        if (value != null) {
            n.put("context", value);
        }
        y9pVar.a.a("FamilyAccount.ForceZalogin.Card.CloseButtonTap", n, 1, new HashMap());
        accountLinkingInfoFullscreenModalView.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$2(PlaceholderView placeholderView) {
        placeholderView.setVisibility(8);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$3(PlaceholderView placeholderView, Drawable drawable) {
        placeholderView.setVisibility(8);
        return zy11.a;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView, reason: from getter */
    public View getContent() {
        return this.contentView;
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g18 g18Var = this.imageLoadCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
    }
}
