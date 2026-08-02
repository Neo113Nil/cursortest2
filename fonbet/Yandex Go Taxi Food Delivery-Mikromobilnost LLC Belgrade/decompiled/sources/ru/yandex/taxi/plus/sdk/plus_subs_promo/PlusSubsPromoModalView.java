package ru.yandex.taxi.plus.sdk.plus_subs_promo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.b;
import defpackage.a230;
import defpackage.c59;
import defpackage.d3d0;
import defpackage.e230;
import defpackage.ffh0;
import defpackage.frh0;
import defpackage.jc4;
import defpackage.jmd0;
import defpackage.k9y0;
import defpackage.lmd0;
import defpackage.nb1;
import defpackage.np31;
import defpackage.omd0;
import defpackage.qeb1;
import defpackage.qje;
import defpackage.r0v0;
import defpackage.rp31;
import defpackage.tje;
import defpackage.tls;
import defpackage.wnb0;
import defpackage.xng0;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.plus.purchase.PlusPurchaseView;
import ru.yandex.taxi.plus.sdk.plus_subs_promo.PlusSubsPromoModalView;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.text.method.LinkMovementMethod;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0012H\u0014¢\u0006\u0004\b#\u0010\u0016J\u000f\u0010$\u001a\u00020\u0012H\u0014¢\u0006\u0004\b$\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010&R\u0014\u0010'\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010(R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107¨\u00069"}, d2 = {"Lru/yandex/taxi/plus/sdk/plus_subs_promo/PlusSubsPromoModalView;", "Lru/yandex/taxi/widget/ModalView;", "Llmd0;", "Landroid/content/Context;", "context", "Lomd0;", "presenter", "Lru/yandex/taxi/plus/purchase/PlusPurchaseView;", "plusPurchaseView", "Ld3d0;", "plusHomeExtraContainerHolder", "<init>", "(Landroid/content/Context;Lomd0;Lru/yandex/taxi/plus/purchase/PlusPurchaseView;Ld3d0;)V", "Le230;", "insetsType", "()Le230;", "Landroid/view/ViewGroup;", "extraContainer", "Lzy11;", "setExtraModalContainer", "(Landroid/view/ViewGroup;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "show", "showLoading", "(Z)V", "Ljmd0;", Constants.KEY_DATA, "showContent", "(Ljmd0;)V", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "onTouchOutside", "onBackPressed", "Lomd0;", "Ld3d0;", "content", "Landroid/view/View;", "purchaseContainer", "Landroid/view/ViewGroup;", "loadingContainer", "Lru/yandex/taxi/design/ToolbarComponent;", "toolbar", "Lru/yandex/taxi/design/ToolbarComponent;", "Lru/yandex/taxi/design/ListHeaderComponent;", "title", "Lru/yandex/taxi/design/ListHeaderComponent;", "Lru/yandex/taxi/design/ListTextComponent;", "text", "Lru/yandex/taxi/design/ListTextComponent;", "Landroid/widget/ImageView;", "backgroundImage", "Landroid/widget/ImageView;", "image", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlusSubsPromoModalView extends ModalView implements lmd0 {
    private final ImageView backgroundImage;
    private final View content;
    private final ImageView image;
    private final View loadingContainer;
    private final d3d0 plusHomeExtraContainerHolder;
    private final omd0 presenter;
    private final ViewGroup purchaseContainer;
    private final ListTextComponent text;
    private final ListHeaderComponent title;
    private final ToolbarComponent toolbar;

    public PlusSubsPromoModalView(Context context, omd0 omd0Var, PlusPurchaseView plusPurchaseView, d3d0 d3d0Var) {
        super(context);
        this.presenter = omd0Var;
        this.plusHomeExtraContainerHolder = d3d0Var;
        c.q(this, frh0.plus_subs_promo_screen, true);
        int i = ffh0.plus_subs_promo_content;
        WeakHashMap weakHashMap = b.a;
        this.content = (View) rp31.d(this, i);
        ViewGroup viewGroup = (ViewGroup) ((View) rp31.d(this, ffh0.plus_subs_promo_purchase_container));
        this.purchaseContainer = viewGroup;
        this.loadingContainer = (View) rp31.d(this, ffh0.plus_subs_promo_loading);
        ToolbarComponent toolbarComponent = (ToolbarComponent) ((View) rp31.d(this, ffh0.plus_subs_promo_toolbar));
        this.toolbar = toolbarComponent;
        this.title = (ListHeaderComponent) ((View) rp31.d(this, ffh0.plus_subs_promo_title));
        this.text = (ListTextComponent) ((View) rp31.d(this, ffh0.plus_subs_promo_text));
        this.backgroundImage = (ImageView) ((View) rp31.d(this, ffh0.plus_subs_promo_background));
        this.image = (ImageView) ((View) rp31.d(this, ffh0.plus_subs_promo_image));
        viewGroup.addView(plusPurchaseView, new LinearLayout.LayoutParams(-1, -2));
        viewGroup.setBackgroundColor(qje.t(xng0.bgMain, getContext()));
        plusPurchaseView.setElevation(tje.w(20, getContext()));
        toolbarComponent.setOnCloseClickListener(new wnb0(17, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showContent$lambda$0(PlusSubsPromoModalView plusSubsPromoModalView, String str) {
        plusSubsPromoModalView.presenter.e.openUrl(str);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showContent$lambda$1(PlusSubsPromoModalView plusSubsPromoModalView, String str) {
        plusSubsPromoModalView.presenter.e.openUrl(str);
        return zy11.a;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView, reason: from getter */
    public View getContent() {
        return this.content;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new a230(3, new PlusSubsPromoModalView$insetsType$1(this, PlusSubsPromoModalView.class, "toolbar", "getToolbar()Lru/yandex/taxi/design/ToolbarComponent;", 0), new PlusSubsPromoModalView$insetsType$2(this, PlusSubsPromoModalView.class, "purchaseContainer", "getPurchaseContainer()Landroid/view/ViewGroup;", 0));
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        omd0 omd0Var = this.presenter;
        omd0Var.c(this);
        ((lmd0) omd0Var.a).showLoading(true);
        tje.N(omd0Var.e(), null, null, new PlusSubsPromoPresenter$load$1(omd0Var, null), 3);
        r0v0 r0v0Var = omd0Var.g;
        r0v0Var.a.add(omd0Var.h);
        c59 c59Var = omd0Var.i;
        switch (c59Var.a) {
            case 0:
                k9y0 k9y0Var = c59Var.c;
                if (k9y0Var != null) {
                    String str = c59Var.b;
                    jc4 jc4Var = k9y0Var.b;
                    jc4Var.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("open_reason", str);
                    jc4Var.a.a("CatchUpCashback.Shown", hashMap, 1, new HashMap());
                    break;
                }
                break;
            default:
                k9y0 k9y0Var2 = c59Var.c;
                if (k9y0Var2 != null) {
                    String str2 = c59Var.b;
                    jc4 jc4Var2 = k9y0Var2.c;
                    jc4Var2.getClass();
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("open_reason", str2);
                    jc4Var2.a.a("PlusBurns.Shown", hashMap2, 1, new HashMap());
                    break;
                }
                break;
        }
        WeakHashMap weakHashMap = b.a;
        np31.c(this);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        this.presenter.e.y();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.d();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        super.onTouchOutside();
        this.presenter.e.y();
    }

    public final void setExtraModalContainer(ViewGroup extraContainer) {
        this.plusHomeExtraContainerHolder.getClass();
        new WeakReference(extraContainer);
    }

    @Override // defpackage.lmd0
    public void showContent(jmd0 data) {
        ListHeaderComponent listHeaderComponent = this.title;
        CharSequence charSequence = data.a;
        CharSequence charSequence2 = data.b;
        listHeaderComponent.setTitle(charSequence);
        boolean d = qeb1.d(data.a);
        ListHeaderComponent listHeaderComponent2 = this.title;
        int i = 11;
        if (d) {
            final int i2 = 0;
            listHeaderComponent2.setTitleMovementMethod(new LinkMovementMethod(new nb1(i, new tls(this) { // from class: kmd0
                public final /* synthetic */ PlusSubsPromoModalView b;

                {
                    this.b = this;
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    zy11 showContent$lambda$0;
                    zy11 showContent$lambda$1;
                    int i3 = i2;
                    PlusSubsPromoModalView plusSubsPromoModalView = this.b;
                    String str = (String) obj;
                    switch (i3) {
                        case 0:
                            showContent$lambda$0 = PlusSubsPromoModalView.showContent$lambda$0(plusSubsPromoModalView, str);
                            return showContent$lambda$0;
                        default:
                            showContent$lambda$1 = PlusSubsPromoModalView.showContent$lambda$1(plusSubsPromoModalView, str);
                            return showContent$lambda$1;
                    }
                }
            })));
        } else {
            listHeaderComponent2.setTitleMovementMethod(null);
        }
        this.text.setHtmlText(charSequence2);
        boolean d2 = qeb1.d(charSequence2);
        ListTextComponent listTextComponent = this.text;
        if (d2) {
            final int i3 = 1;
            listTextComponent.setMovementMethod(new LinkMovementMethod(new nb1(i, new tls(this) { // from class: kmd0
                public final /* synthetic */ PlusSubsPromoModalView b;

                {
                    this.b = this;
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    zy11 showContent$lambda$0;
                    zy11 showContent$lambda$1;
                    int i32 = i3;
                    PlusSubsPromoModalView plusSubsPromoModalView = this.b;
                    String str = (String) obj;
                    switch (i32) {
                        case 0:
                            showContent$lambda$0 = PlusSubsPromoModalView.showContent$lambda$0(plusSubsPromoModalView, str);
                            return showContent$lambda$0;
                        default:
                            showContent$lambda$1 = PlusSubsPromoModalView.showContent$lambda$1(plusSubsPromoModalView, str);
                            return showContent$lambda$1;
                    }
                }
            })));
        } else {
            listTextComponent.setMovementMethod(null);
        }
        this.backgroundImage.setImageDrawable(data.c);
        this.image.setImageDrawable(data.d);
    }

    @Override // defpackage.lmd0
    public void showLoading(boolean show) {
        this.loadingContainer.setVisibility(show ? 0 : 8);
    }
}
