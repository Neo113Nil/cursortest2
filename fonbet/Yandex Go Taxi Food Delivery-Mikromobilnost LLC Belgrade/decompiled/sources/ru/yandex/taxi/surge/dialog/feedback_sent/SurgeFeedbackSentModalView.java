package ru.yandex.taxi.surge.dialog.feedback_sent;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoImageView;
import defpackage.c230;
import defpackage.c57;
import defpackage.cma1;
import defpackage.fpw0;
import defpackage.hk1;
import defpackage.ipw0;
import defpackage.kpw0;
import defpackage.lnv0;
import defpackage.low0;
import defpackage.ny61;
import defpackage.ouq;
import defpackage.pm5;
import defpackage.pye0;
import defpackage.qdb1;
import defpackage.qu;
import defpackage.tcc;
import defpackage.tje;
import defpackage.xcv0;
import defpackage.yrh0;
import defpackage.zfh0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.widget.ButtonsView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0018\u0010\u0018\u001a\u00060\u0017R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/yandex/taxi/surge/dialog/feedback_sent/SurgeFeedbackSentModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Louq;", "Landroid/content/Context;", "context", "Lipw0;", "presenter", "<init>", "(Landroid/content/Context;Lipw0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Louq;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lc230;", "insetsType", "()Lc230;", "Lipw0;", "Lfpw0;", "mvp", "Lfpw0;", "Lc57;", "Llow0;", "actionButtons", "Lc57;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SurgeFeedbackSentModalView extends SlideableBindingModalView<ouq> {
    private final c57 actionButtons;
    private final fpw0 mvp;
    private final ipw0 presenter;

    public SurgeFeedbackSentModalView(Context context, ipw0 ipw0Var) {
        super(context);
        this.presenter = ipw0Var;
        this.mvp = new fpw0(this);
        c57 buttonsContract = getBinding().b.buttonsContract();
        this.actionButtons = buttonsContract;
        qdb1.c(this, new lnv0(17, ipw0Var));
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        ((pm5) buttonsContract).f(new hk1(ipw0Var, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$closeClick(ipw0 ipw0Var) {
        ((kpw0) ipw0Var.y.a).r(new qu(9));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public ouq bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(yrh0.feedback_sent_modal, parent, false);
        int i = zfh0.buttons_view;
        ButtonsView buttonsView = (ButtonsView) cma1.O(i, inflate);
        if (buttonsView != null) {
            i = zfh0.icon;
            GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
            if (goImageView != null) {
                i = zfh0.subtitle;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                if (robotoTextView != null) {
                    i = zfh0.title;
                    ListTitleComponent listTitleComponent = (ListTitleComponent) cma1.O(i, inflate);
                    if (listTitleComponent != null) {
                        return new ouq((LinearLayout) inflate, buttonsView, goImageView, robotoTextView, listTitleComponent);
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

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ipw0 ipw0Var = this.presenter;
        fpw0 fpw0Var = this.mvp;
        ipw0Var.Bg(fpw0Var);
        tje.N(ipw0Var.Jg(), null, null, new SurgeFeedbackSentPresenter$attachView$1(ipw0Var, fpw0Var, null), 3);
        xcv0 xcv0Var = ipw0Var.A;
        ArrayList arrayList = ipw0Var.x.d.b;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            low0 low0Var = ((pye0) it.next()).a;
            arrayList2.add(low0Var != null ? low0Var.a : "");
        }
        xcv0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("button_list", arrayList2);
        xcv0Var.a.a("Summary.SurgeComplaint.FeedbackModalCard.Shown", hashMap, 1, new HashMap());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}
