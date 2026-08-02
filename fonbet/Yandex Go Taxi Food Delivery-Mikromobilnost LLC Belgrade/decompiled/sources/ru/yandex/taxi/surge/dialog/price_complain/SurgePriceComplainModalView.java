package ru.yandex.taxi.surge.dialog.price_complain;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.apw0;
import defpackage.c230;
import defpackage.c57;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.cp1;
import defpackage.cvw0;
import defpackage.g0c;
import defpackage.lki;
import defpackage.lnv0;
import defpackage.low0;
import defpackage.ny61;
import defpackage.otq;
import defpackage.pm5;
import defpackage.pye0;
import defpackage.qdb1;
import defpackage.qoi0;
import defpackage.qu;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tuw0;
import defpackage.wuw0;
import defpackage.xcv0;
import defpackage.yrh0;
import defpackage.yuw0;
import defpackage.zfh0;
import defpackage.zji0;
import defpackage.zxs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.widget.ButtonsView;
import ru.yandex.taxi.widget.KeyboardAwareRobotoEditText;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u001d\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0018\u0010\u001c\u001a\u00060\u001bR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/yandex/taxi/surge/dialog/price_complain/SurgePriceComplainModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lapw0;", "Landroid/content/Context;", "context", "Lwuw0;", "presenter", "<init>", "(Landroid/content/Context;Lwuw0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lapw0;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "onModalViewDisappear", "Lc230;", "insetsType", "()Lc230;", "", "isArrowsPermanentlyHidden", "()Z", "Lwuw0;", "Ltuw0;", "mvp", "Ltuw0;", "Lcvw0;", "feedBackOptionsAdapter", "Lcvw0;", "Lc57;", "Llow0;", "actionButtons", "Lc57;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SurgePriceComplainModalView extends SlideableBindingModalView<apw0> {
    private final c57 actionButtons;
    private final cvw0 feedBackOptionsAdapter;
    private final tuw0 mvp;
    private final wuw0 presenter;

    public SurgePriceComplainModalView(Context context, wuw0 wuw0Var) {
        super(context);
        this.presenter = wuw0Var;
        this.mvp = new tuw0(this);
        SurgePriceComplainModalView$feedBackOptionsAdapter$1 surgePriceComplainModalView$feedBackOptionsAdapter$1 = new SurgePriceComplainModalView$feedBackOptionsAdapter$1(2, wuw0Var, wuw0.class, "changeSelectedIds", "changeSelectedIds(Ljava/lang/String;Z)V", 0);
        lki lkiVar = new lki(13);
        int i = zji0.U;
        g0c a = qoi0.a(otq.class);
        cvw0 cvw0Var = new cvw0(lkiVar, Collections.singletonList(new zxs(a.a(), 0, null, EmptyList.a, null, new cp1(surgePriceComplainModalView$feedBackOptionsAdapter$1, 15))));
        this.feedBackOptionsAdapter = cvw0Var;
        c57 buttonsContract = getBinding().b.buttonsContract();
        this.actionButtons = buttonsContract;
        qdb1.b(this, new lnv0(18, wuw0Var));
        ((pm5) buttonsContract).f(new a(wuw0Var));
        RecyclerView recyclerView = getBinding().d;
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.setAdapter(cvw0Var);
        recyclerView.setItemAnimator(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$closeClick(wuw0 wuw0Var) {
        yuw0 yuw0Var = (yuw0) wuw0Var.z.a;
        ((xcv0) yuw0Var.L).l("back_button");
        yuw0Var.r(new qu(9));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public apw0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(yrh0.surge_complain_feedback_view, parent, false);
        int i = zfh0.buttons_view;
        ButtonsView buttonsView = (ButtonsView) cma1.O(i, inflate);
        if (buttonsView != null) {
            i = zfh0.comment_input;
            KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = (KeyboardAwareRobotoEditText) cma1.O(i, inflate);
            if (keyboardAwareRobotoEditText != null) {
                i = zfh0.feedback_options_recycler;
                RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                if (recyclerView != null) {
                    i = zfh0.title;
                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView != null) {
                        return new apw0((ScrollView) inflate, buttonsView, keyboardAwareRobotoEditText, recyclerView, robotoTextView);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public c230 insetsType() {
        return new c230(true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getRouteSummaryIsVisible() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        wuw0 wuw0Var = this.presenter;
        tuw0 tuw0Var = this.mvp;
        wuw0Var.Bg(tuw0Var);
        tje.N(wuw0Var.Jg(), null, null, new SurgePriceComplainPresenter$attachView$1(wuw0Var, tuw0Var, null), 3);
        xcv0 xcv0Var = wuw0Var.F;
        ArrayList arrayList = wuw0Var.y.c.b;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            low0 low0Var = ((pye0) it.next()).a;
            arrayList2.add(low0Var != null ? low0Var.a : "");
        }
        xcv0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("button_list", arrayList2);
        xcv0Var.a.a("Summary.SurgeComplaintModalCard.Shown", hashMap, 1, new HashMap());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewDisappear() {
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = getBinding().c;
        keyboardAwareRobotoEditText.post(new ce0(keyboardAwareRobotoEditText, 15));
        super.onModalViewDisappear();
    }
}
