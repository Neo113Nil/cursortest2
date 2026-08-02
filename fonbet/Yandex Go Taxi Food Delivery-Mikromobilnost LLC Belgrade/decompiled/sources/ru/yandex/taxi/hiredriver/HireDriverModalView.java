package ru.yandex.taxi.hiredriver;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.hiredriver.api.HireDriverOpenReason;
import defpackage.b1;
import defpackage.cma1;
import defpackage.cvu0;
import defpackage.e230;
import defpackage.gau;
import defpackage.j4a;
import defpackage.lh2;
import defpackage.mg21;
import defpackage.mku;
import defpackage.mth0;
import defpackage.nku;
import defpackage.ny61;
import defpackage.oih0;
import defpackage.oku;
import defpackage.pku;
import defpackage.qeb1;
import defpackage.qje;
import defpackage.qu;
import defpackage.rku;
import defpackage.t1w;
import defpackage.w130;
import defpackage.xng0;
import defpackage.zy11;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.hiredriver.HireDriverModalView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB#\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/hiredriver/HireDriverModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lnku;", "Landroid/content/Context;", "context", "Loku;", "payload", "Lrku;", "hireDriverPresenter", "<init>", "(Landroid/content/Context;Loku;Lrku;)V", "Le230;", "insetsType", "()Le230;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lnku;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Loku;", "Lrku;", "mku", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HireDriverModalView extends SlideableBindingModalView<nku> {
    private final rku hireDriverPresenter;
    private final oku payload;

    public HireDriverModalView(Context context, oku okuVar, rku rkuVar) {
        super(context);
        this.payload = okuVar;
        this.hireDriverPresenter = rkuVar;
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        lh2 lh2Var = lh2.c;
        setAnimationDelegate(lh2.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(HireDriverModalView hireDriverModalView, t1w t1wVar) {
        ConstraintLayout constraintLayout = hireDriverModalView.getBinding().a;
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), t1wVar.b, constraintLayout.getPaddingRight(), t1wVar.g);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(HireDriverModalView hireDriverModalView, View view) {
        rku rkuVar = hireDriverModalView.hireDriverPresenter;
        ((mg21) rkuVar.A).c(hireDriverModalView.payload.a.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$1(HireDriverModalView hireDriverModalView, View view) {
        rku rkuVar = hireDriverModalView.hireDriverPresenter;
        Map map = hireDriverModalView.payload.c;
        b1 b1Var = rkuVar.x;
        HireDriverOpenReason hireDriverOpenReason = rkuVar.D;
        b1Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("open_reason", hireDriverOpenReason.getAnalyticsName());
        b1Var.a.a("HireDriver.SendButtonTapped", hashMap, 1, new HashMap());
        ((pku) rkuVar.Dg()).C3(true);
        com.yandex.go.coroutines.b.g(rkuVar.Jg(), null, null, new HireDriverPresenter$sendClicked$1(rkuVar, map, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$2(HireDriverModalView hireDriverModalView) {
        ((j4a) hireDriverModalView.hireDriverPresenter.C.a).r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$3(HireDriverModalView hireDriverModalView) {
        ((j4a) hireDriverModalView.hireDriverPresenter.C.a).r(new qu(9));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public nku bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(mth0.hire_driver_modal_view, parent, false);
        int i = oih0.hire_driver_agreement;
        ListTextComponent listTextComponent = (ListTextComponent) cma1.O(i, inflate);
        if (listTextComponent != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
            i = oih0.hire_driver_info;
            ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
            if (listItemComponent != null) {
                i = oih0.hire_driver_send_button;
                ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i, inflate);
                if (listItemComponent2 != null) {
                    i = oih0.hire_driver_subtitle;
                    ListTextComponent listTextComponent2 = (ListTextComponent) cma1.O(i, inflate);
                    if (listTextComponent2 != null) {
                        i = oih0.hire_driver_title;
                        ListTextComponent listTextComponent3 = (ListTextComponent) cma1.O(i, inflate);
                        if (listTextComponent3 != null) {
                            i = oih0.hire_driver_toolbar;
                            ToolbarComponent toolbarComponent = (ToolbarComponent) cma1.O(i, inflate);
                            if (toolbarComponent != null) {
                                return new nku(constraintLayout, listTextComponent, listItemComponent, listItemComponent2, listTextComponent2, listTextComponent3, toolbarComponent);
                            }
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
        return new w130(1, new gau(6, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getBinding().f.setText(this.payload.a.d);
        getBinding().e.setText(this.payload.a.e);
        getBinding().c.setTitle(this.payload.a.f);
        getBinding().c.setSubtitle(this.payload.a.g);
        final int i = 0;
        getBinding().c.setOnClickListener(new View.OnClickListener(this) { // from class: kku
            public final /* synthetic */ HireDriverModalView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                HireDriverModalView hireDriverModalView = this.b;
                switch (i2) {
                    case 0:
                        HireDriverModalView.onAttachedToWindow$lambda$0(hireDriverModalView, view);
                        break;
                    default:
                        HireDriverModalView.onAttachedToWindow$lambda$1(hireDriverModalView, view);
                        break;
                }
            }
        });
        getBinding().d.setTitle(this.payload.a.h);
        getBinding().d.setSubtitle(this.payload.a.i);
        getBinding().d.setRoundedBackground(qje.t(xng0.controlMain, getContext()));
        final int i2 = 1;
        getBinding().d.setOnClickListener(new View.OnClickListener(this) { // from class: kku
            public final /* synthetic */ HireDriverModalView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                HireDriverModalView hireDriverModalView = this.b;
                switch (i22) {
                    case 0:
                        HireDriverModalView.onAttachedToWindow$lambda$0(hireDriverModalView, view);
                        break;
                    default:
                        HireDriverModalView.onAttachedToWindow$lambda$1(hireDriverModalView, view);
                        break;
                }
            }
        });
        getBinding().b.setLinkTextColor(qje.t(xng0.textMinor, getContext()));
        getBinding().b.setHtmlText(qeb1.c(cvu0.v(this.payload.a.l, "\\", "", false)));
        getBinding().g.enableNavigationButton();
        getBinding().g.disableCloseButton();
        getBinding().g.setOnCloseClickListener(new Runnable(this) { // from class: lku
            public final /* synthetic */ HireDriverModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                HireDriverModalView hireDriverModalView = this.b;
                switch (i3) {
                    case 0:
                        HireDriverModalView.onAttachedToWindow$lambda$2(hireDriverModalView);
                        break;
                    default:
                        HireDriverModalView.onAttachedToWindow$lambda$3(hireDriverModalView);
                        break;
                }
            }
        });
        getBinding().g.setOnNavigationClickListener(new Runnable(this) { // from class: lku
            public final /* synthetic */ HireDriverModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                HireDriverModalView hireDriverModalView = this.b;
                switch (i3) {
                    case 0:
                        HireDriverModalView.onAttachedToWindow$lambda$2(hireDriverModalView);
                        break;
                    default:
                        HireDriverModalView.onAttachedToWindow$lambda$3(hireDriverModalView);
                        break;
                }
            }
        });
        rku rkuVar = this.hireDriverPresenter;
        rkuVar.Bg(new mku(this));
        b1 b1Var = rkuVar.x;
        HireDriverOpenReason hireDriverOpenReason = rkuVar.D;
        b1Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("open_reason", hireDriverOpenReason.getAnalyticsName());
        b1Var.a.a("HireDriver.FullScreenShown", hashMap, 1, new HashMap());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.hireDriverPresenter.Cg();
    }
}
