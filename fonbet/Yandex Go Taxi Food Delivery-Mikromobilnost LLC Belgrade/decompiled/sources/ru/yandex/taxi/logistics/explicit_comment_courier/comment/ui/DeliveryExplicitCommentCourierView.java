package ru.yandex.taxi.logistics.explicit_comment_courier.comment.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import defpackage.aoi;
import defpackage.b9i;
import defpackage.bhh;
import defpackage.boj0;
import defpackage.ce0;
import defpackage.f3i;
import defpackage.g3i;
import defpackage.iqh0;
import defpackage.jqr;
import defpackage.kzo;
import defpackage.m8i;
import defpackage.mth;
import defpackage.ny61;
import defpackage.p8i;
import defpackage.qcp0;
import defpackage.qdb1;
import defpackage.r8i;
import defpackage.s8i;
import defpackage.t1w;
import defpackage.t8i;
import defpackage.uxh;
import defpackage.w130;
import defpackage.wth;
import defpackage.xd2;
import defpackage.xni;
import defpackage.xw31;
import defpackage.y7i;
import defpackage.zch;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.DeliveryExplicitCommentCourierFlowType;
import ru.yandex.taxi.widget.ArrowsView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB+\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0013\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0014\u0010\u000fJ\u000f\u0010\u0015\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0015\u0010\u000fJ\u001f\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u0018\u0010\u001f\u001a\u00060\u001eR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/yandex/taxi/logistics/explicit_comment_courier/comment/ui/DeliveryExplicitCommentCourierView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Ly7i;", "Landroid/content/Context;", "context", "Lg3i;", "engineFactory", "Ls8i;", "presenter", "Lr8i;", "params", "<init>", "(Landroid/content/Context;Lg3i;Ls8i;Lr8i;)V", "Lzy11;", "hideKeyboard", "()V", "Lw130;", "insetsType", "()Lw130;", "onAttachedToWindow", "onDetachedFromWindow", "onBackPressed", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ly7i;", "Ls8i;", "Lr8i;", "Lb9i;", "mvpView", "Lb9i;", "Lxni;", "engine", "Lxni;", "explicit_comment_courier"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryExplicitCommentCourierView extends SlideableBindingModalView<y7i> {
    private final xni engine;
    private final b9i mvpView;
    private final r8i params;
    private final s8i presenter;

    public DeliveryExplicitCommentCourierView(Context context, g3i g3iVar, s8i s8iVar, r8i r8iVar) {
        super(context);
        f3i f3iVar;
        this.presenter = s8iVar;
        this.params = r8iVar;
        this.mvpView = new b9i(this);
        m8i m8iVar = s8iVar.y;
        r8i r8iVar2 = s8iVar.x;
        String str = r8iVar2.a;
        String str2 = r8iVar2.c;
        kzo e = m8iVar.b.e(str);
        str2 = str2 == null ? ((t8i.a) m8iVar.a.b.a.getValue()).a : str2;
        if (e != null) {
            boj0 boj0Var = (boj0) e.x;
            f3iVar = new f3i((String) boj0Var.b, (String) boj0Var.c, (String) boj0Var.w, str2 == null ? "" : str2, (String) boj0Var.x, (String) boj0Var.y, (Integer) boj0Var.z);
        } else {
            f3iVar = null;
        }
        f3iVar = f3iVar == null ? s8i.F : f3iVar;
        a aVar = new a(this);
        qcp0 qcp0Var = g3iVar.a;
        this.engine = new aoi(g3iVar.b, new f3i(f3iVar.a, f3iVar.b, f3iVar.c, f3iVar.w, f3iVar.x, f3iVar.y, f3iVar.z), aVar);
        setDismissOnBackPressed(true);
        setDismissOnTouchOutside(false);
        getBottomSheetBehavior().a0 = false;
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        setArrowState(ArrowsView.State.GONE);
        qdb1.b(this, new uxh(6, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(DeliveryExplicitCommentCourierView deliveryExplicitCommentCourierView) {
        s8i s8iVar = deliveryExplicitCommentCourierView.presenter;
        zch zchVar = s8iVar.z;
        String a = s8iVar.y.a();
        zchVar.getClass();
        if (a.length() == 0) {
            a = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (a != null) {
            linkedHashMap.put("comment", a);
        }
        linkedHashMap.put("is_with_pictures", Boolean.FALSE);
        linkedHashMap.put("pictures_amt", 0);
        zchVar.l("Summary.SummaryCard.CommentToCourierCard.GoBackButton.Tapped", linkedHashMap);
        ((p8i) s8iVar.Dg()).close();
        s8iVar.Kg();
        s8iVar.A.a.r(new wth(20));
    }

    private final void hideKeyboard() {
        View findFocus = getBinding().b.findFocus();
        if (findFocus == null) {
            findFocus = getBinding().b;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(findFocus.getWindowToken(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(DeliveryExplicitCommentCourierView deliveryExplicitCommentCourierView, t1w t1wVar) {
        Object value;
        s8i s8iVar = deliveryExplicitCommentCourierView.presenter;
        int i = t1wVar.g;
        r0 r0Var = s8iVar.E;
        do {
            value = r0Var.getValue();
            ((Boolean) value).getClass();
        } while (!r0Var.k(value, Boolean.valueOf(i > 0)));
        deliveryExplicitCommentCourierView.setTopSystemWindowInset(t1wVar.b);
        xw31.I(deliveryExplicitCommentCourierView.getBinding().a, null, null, null, Integer.valueOf(t1wVar.g));
        return zy11.a;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public y7i bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(iqh0.delivery_explicit_comment_courier, parent, false);
        if (inflate != null) {
            FrameLayout frameLayout = (FrameLayout) inflate;
            return new y7i(frameLayout, frameLayout);
        }
        ny61.t("rootView");
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public w130 insetsType() {
        return new w130(1, new bhh(14, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.params.b == DeliveryExplicitCommentCourierFlowType.REGULAR) {
            getBinding().a.requestFocus();
            post(new ce0(this, 15));
        } else {
            post(new xd2(this, 1));
        }
        s8i s8iVar = this.presenter;
        s8iVar.Bg(this.mvpView);
        zch zchVar = s8iVar.z;
        String a = s8iVar.y.a();
        zchVar.getClass();
        if (a.length() == 0) {
            a = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (a != null) {
            linkedHashMap.put("comment", a);
        }
        linkedHashMap.put("is_with_pictures", Boolean.FALSE);
        linkedHashMap.put("pictures_amt", 0);
        zchVar.l("Summary.SummaryCard.CommentToCourierCard.Shown", linkedHashMap);
        e.H(s8iVar.Jg(), new jqr(new mth(s8iVar.E, 4), new DeliveryExplicitCommentCourierPresenter$observeKeyboardState$1(s8iVar, null), 3));
        this.engine.b(getBinding().b);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        this.presenter.A.a.r(new wth(20));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        hideKeyboard();
        this.presenter.Cg();
        this.engine.a();
        super.onDetachedFromWindow();
    }
}
