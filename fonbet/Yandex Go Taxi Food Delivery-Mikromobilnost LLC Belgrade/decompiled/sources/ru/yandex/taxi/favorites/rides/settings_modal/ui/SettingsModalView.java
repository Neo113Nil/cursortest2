package ru.yandex.taxi.favorites.rides.settings_modal.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.aar0;
import defpackage.aip;
import defpackage.b7p0;
import defpackage.bts0;
import defpackage.c230;
import defpackage.car0;
import defpackage.cma1;
import defpackage.e230;
import defpackage.epo0;
import defpackage.far0;
import defpackage.g0c;
import defpackage.g2y;
import defpackage.gar0;
import defpackage.har0;
import defpackage.he7;
import defpackage.i3y;
import defpackage.i8r0;
import defpackage.lar0;
import defpackage.lgp;
import defpackage.mmp0;
import defpackage.nao0;
import defpackage.ny61;
import defpackage.oar0;
import defpackage.p9r0;
import defpackage.q9r0;
import defpackage.qdb1;
import defpackage.qoi0;
import defpackage.sar0;
import defpackage.scc;
import defpackage.tdh0;
import defpackage.tje;
import defpackage.tse;
import defpackage.uwl0;
import defpackage.uyj;
import defpackage.vz1;
import defpackage.w9r0;
import defpackage.xph0;
import defpackage.zxs;
import java.util.HashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.favorites.analytics.FavoritesAnalytics$RideSettingsModalButtonName;
import ru.yandex.taxi.favorites.analytics.FavoritesAnalytics$RideSettingsModalCloseReason;
import ru.yandex.taxi.widget.BottomEdgeButtonLayout;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\rH\u0014¢\u0006\u0004\b(\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lru/yandex/taxi/favorites/rides/settings_modal/ui/SettingsModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lg2y;", "Landroid/content/Context;", "context", "Lbts0;", "slotItemViewFactory", "Laar0;", "presenter", "<init>", "(Landroid/content/Context;Lbts0;Laar0;)V", "Loar0;", "uiState", "Lzy11;", "bindState", "(Loar0;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "renderImage", "(Landroid/graphics/drawable/Drawable;)V", "", "text", "renderTitle", "(Ljava/lang/String;)V", "Lhar0;", "button", "renderButton", "(Lhar0;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Le230;", "insetsType", "()Le230;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lg2y;", "onBackPressed", "Laar0;", "Lq9r0;", "adapter$delegate", "Li3y;", "getAdapter", "()Lq9r0;", "adapter", "sar0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SettingsModalView extends SlideableBindingModalView<g2y> {
    public static final int $stable = 8;

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    private final i3y adapter;
    private final aar0 presenter;

    public SettingsModalView(Context context, bts0 bts0Var, aar0 aar0Var) {
        super(context);
        this.presenter = aar0Var;
        this.adapter = kotlin.a.b(LazyThreadSafetyMode.NONE, new nao0(25, bts0Var, this));
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        qdb1.b(this, new mmp0(10, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q9r0 adapter_delegate$lambda$0(bts0 bts0Var, SettingsModalView settingsModalView) {
        SettingsModalView$adapter$2$1 settingsModalView$adapter$2$1 = new SettingsModalView$adapter$2$1(1, settingsModalView.presenter, aar0.class, "handleAction", "handleAction(Lcom/yandex/go/slot/api/action/SlotItemAction;)V", 0);
        int i = far0.T;
        g0c a = qoi0.a(lar0.class);
        vz1 vz1Var = new vz1(bts0Var, 14);
        int i2 = 5;
        uwl0 uwl0Var = new uwl0(i2, settingsModalView$adapter$2$1);
        int i3 = 2;
        zxs zxsVar = new zxs(a.a(), 0, vz1Var, scc.g(new lgp(new i8r0(3), new i8r0(4), i3), new lgp(new i8r0(i2), new i8r0(6), i3), new lgp(new i8r0(7), new i8r0(8), i3), new lgp(new i8r0(9), new i8r0(10), i3)), new he7(1, uwl0Var), null);
        int i4 = w9r0.S;
        zxs a2 = ru.yandex.taxi.favorites.rides.settings_modal.ui.adapter.holder.a.a();
        zxs b = ru.yandex.taxi.favorites.rides.settings_modal.ui.adapter.holder.a.b();
        int i5 = gar0.T;
        return new q9r0(scc.g(zxsVar, a2, b, ru.yandex.taxi.favorites.rides.settings_modal.ui.adapter.holder.a.c()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindState(oar0 uiState) {
        getAdapter().submitList(uiState.c, null);
        renderImage(uiState.a);
        renderTitle(uiState.b);
        renderButton(uiState.d);
    }

    private final q9r0 getAdapter() {
        return (q9r0) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(SettingsModalView settingsModalView) {
        return settingsModalView.getBinding().a;
    }

    private final void renderButton(har0 button) {
        g2y binding = getBinding();
        binding.c.setText(button.a);
        binding.b.setVisibility(button.a.length() > 0 ? 0 : 8);
        binding.c.setDebounceClickListener(new epo0(17, this, button));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderButton$lambda$0$0(SettingsModalView settingsModalView, har0 har0Var) {
        aar0 aar0Var = settingsModalView.presenter;
        p9r0 p9r0Var = har0Var.b;
        aar0Var.getClass();
        aar0Var.C = FavoritesAnalytics$RideSettingsModalCloseReason.Trip;
        aip aipVar = aar0Var.A;
        car0 car0Var = aar0Var.B;
        aipVar.b(car0Var.a, FavoritesAnalytics$RideSettingsModalButtonName.Trip);
        aar0Var.x.d(car0Var.a, p9r0Var);
    }

    private final void renderImage(Drawable drawable) {
        getBinding().e.setImageDrawable(drawable);
    }

    private final void renderTitle(String text) {
        getBinding().f.setText(text);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public g2y bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(xph0.layout_settings_modal_view, parent, false);
        int i = tdh0.button_container;
        BottomEdgeButtonLayout bottomEdgeButtonLayout = (BottomEdgeButtonLayout) cma1.O(i, inflate);
        if (bottomEdgeButtonLayout != null) {
            i = tdh0.button_view;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent != null) {
                i = tdh0.content;
                RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                if (recyclerView != null) {
                    i = tdh0.image;
                    ImageView imageView = (ImageView) cma1.O(i, inflate);
                    if (imageView != null) {
                        i = tdh0.title;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                        if (robotoTextView != null) {
                            return new g2y((GoLinearLayout) inflate, bottomEdgeButtonLayout, buttonComponent, recyclerView, imageView, robotoTextView);
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new c230(0, new b7p0(16, this), false);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        aar0 aar0Var = this.presenter;
        sar0 sar0Var = new sar0(this);
        aar0Var.Bg(sar0Var);
        tje.N(aar0Var.Jg(), null, null, new SettingsModalPresenter$attachView$$inlined$safeCollectIn$1(aar0Var.x.d, null, sar0Var), 3);
        tse Jg = aar0Var.Jg();
        aar0Var.y.getClass();
        tje.N(Jg, uyj.a, null, new SettingsModalPresenter$attachView$2(aar0Var, null), 2);
        aip aipVar = aar0Var.A;
        String str = aar0Var.B.a;
        aipVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("id", str);
        aipVar.a.a("Favorites.SettingsModal.Shown", hashMap, 1, new HashMap());
        RecyclerView recyclerView = getBinding().d;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(getAdapter());
        setOnTouchOutsideListener(null);
        setDismissOnTouchOutside(false);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        aar0 aar0Var = this.presenter;
        aar0Var.getClass();
        aar0Var.C = FavoritesAnalytics$RideSettingsModalCloseReason.Back;
        aar0Var.A.b(aar0Var.B.a, FavoritesAnalytics$RideSettingsModalButtonName.Back);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.presenter.Cg();
        getBinding().d.setAdapter(null);
        super.onDetachedFromWindow();
    }
}
