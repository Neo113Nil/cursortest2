package ru.yandex.taxi.surge.modal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import defpackage.ax1;
import defpackage.c57;
import defpackage.cma1;
import defpackage.dv31;
import defpackage.fbv;
import defpackage.lnv0;
import defpackage.ny61;
import defpackage.pm5;
import defpackage.q47;
import defpackage.qdb1;
import defpackage.uvw0;
import defpackage.wvw0;
import defpackage.xvw0;
import defpackage.yrh0;
import defpackage.zfh0;
import defpackage.zow0;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.taxi.widget.ButtonsView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u0019\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0010\u0010\u000eJ\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0017\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u00060 R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/yandex/taxi/surge/modal/SurgeShortcutModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lfbv;", "Landroid/content/Context;", "context", "Lwvw0;", "presenter", "<init>", "(Landroid/content/Context;Lwvw0;)V", "Luvw0;", "initialState", "()Luvw0;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "onTouchOutside", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lfbv;", "onBackPressed", "Lwvw0;", "Lc57;", "Lovw0;", "buttonsContract", "Lc57;", "Ldv31;", "stateHolder", "Ldv31;", "Lxvw0;", "inner", "Lxvw0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SurgeShortcutModalView extends SlideableBindingModalView<fbv> {
    private final c57 buttonsContract;
    private final xvw0 inner;
    private final wvw0 presenter;
    private final dv31 stateHolder;

    public SurgeShortcutModalView(Context context, wvw0 wvw0Var) {
        super(context);
        this.presenter = wvw0Var;
        c57 buttonsContract = getBinding().b.buttonsContract();
        this.buttonsContract = buttonsContract;
        this.stateHolder = new ax1(this, initialState(), this, 7);
        this.inner = new xvw0(this);
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        ((pm5) buttonsContract).f(new a(wvw0Var));
        qdb1.c(this, new lnv0(19, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(SurgeShortcutModalView surgeShortcutModalView) {
        surgeShortcutModalView.presenter.A.a("cross_button");
        surgeShortcutModalView.dismiss();
    }

    private final uvw0 initialState() {
        return new uvw0("", new q47((List) null, 3), null, "", "", null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public fbv bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(yrh0.image_modal_view, parent, false);
        int i = zfh0.buttons;
        ButtonsView buttonsView = (ButtonsView) cma1.O(i, inflate);
        if (buttonsView != null) {
            i = zfh0.image;
            ImageView imageView = (ImageView) cma1.O(i, inflate);
            if (imageView != null) {
                i = zfh0.text;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                if (robotoTextView != null) {
                    i = zfh0.title;
                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView2 != null) {
                        return new fbv((LinearLayout) inflate, buttonsView, imageView, robotoTextView, robotoTextView2);
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
        wvw0 wvw0Var = this.presenter;
        xvw0 xvw0Var = this.inner;
        wvw0Var.Bg(xvw0Var);
        xvw0Var.a.stateHolder.g(wvw0Var.x, false, false);
        zow0 zow0Var = wvw0Var.A.c;
        zow0Var.getClass();
        zow0Var.a.a("SurgeCard.Shortcut.Modal.Shown", new HashMap(), 1, new HashMap());
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        this.presenter.A.a("system_back_button");
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.presenter.Cg();
        super.onDetachedFromWindow();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        super.onTouchOutside();
        this.presenter.A.a("swipe");
    }
}
