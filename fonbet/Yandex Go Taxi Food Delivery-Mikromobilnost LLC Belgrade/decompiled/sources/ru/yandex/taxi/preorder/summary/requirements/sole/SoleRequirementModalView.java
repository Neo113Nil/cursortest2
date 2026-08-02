package ru.yandex.taxi.preorder.summary.requirements.sole;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.b;
import defpackage.abx0;
import defpackage.axy;
import defpackage.dqe0;
import defpackage.e7h0;
import defpackage.fjj0;
import defpackage.g580;
import defpackage.hjj0;
import defpackage.jmw0;
import defpackage.jpf0;
import defpackage.lx4;
import defpackage.mg11;
import defpackage.mmp0;
import defpackage.n3w;
import defpackage.n7i0;
import defpackage.npe0;
import defpackage.o6g;
import defpackage.p370;
import defpackage.phj0;
import defpackage.pho;
import defpackage.px4;
import defpackage.q5z;
import defpackage.q720;
import defpackage.qjh0;
import defpackage.qsn;
import defpackage.rp31;
import defpackage.sk91;
import defpackage.tgb0;
import defpackage.tje;
import defpackage.uw11;
import defpackage.vrt0;
import defpackage.x5t0;
import defpackage.xcv0;
import defpackage.xea;
import defpackage.xvf0;
import defpackage.y5t0;
import defpackage.ys10;
import defpackage.z5t0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.requirements.interactor.w;
import ru.yandex.taxi.requirements.interactor.x;
import ru.yandex.taxi.requirements.ui.RequirementOptionDetailsView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/yandex/taxi/preorder/summary/requirements/sole/SoleRequirementModalView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Ly5t0;", "Landroid/content/Context;", "context", "Lx5t0;", "soleComponentDependencies", "Ljmw0;", "requirement", "Lg580;", "orderRequirementsRepository", "<init>", "(Landroid/content/Context;Lx5t0;Ljmw0;Lg580;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "hasOptions", "refreshDoneButtonState", "(Z)V", "onBackPressed", "Lru/yandex/taxi/design/ToolbarComponent;", "toolbar", "Lru/yandex/taxi/design/ToolbarComponent;", "Lru/yandex/taxi/design/ButtonComponent;", "doneButton", "Lru/yandex/taxi/design/ButtonComponent;", "Lz5t0;", "presenter", "Lz5t0;", "", "getCardContentViewLayoutRes", "()I", "cardContentViewLayoutRes", "sole"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SoleRequirementModalView extends SlideableModalView implements y5t0 {
    private final ButtonComponent doneButton;
    private final z5t0 presenter;
    private final ToolbarComponent toolbar;

    public SoleRequirementModalView(Context context, x5t0 x5t0Var, jmw0 jmw0Var, g580 g580Var) {
        super(context);
        int i = e7h0.requirement_header_toolbar;
        WeakHashMap weakHashMap = b.a;
        ToolbarComponent toolbarComponent = (ToolbarComponent) ((View) rp31.d(this, i));
        this.toolbar = toolbarComponent;
        ButtonComponent buttonComponent = (ButtonComponent) ((View) rp31.d(this, e7h0.requirement_done_button));
        this.doneButton = buttonComponent;
        x5t0Var.getClass();
        jmw0Var.getClass();
        x xVar = x5t0Var.b;
        q5z.h(xVar);
        z5t0 z5t0Var = new z5t0(xVar, jmw0Var);
        this.presenter = z5t0Var;
        fjj0 fjj0Var = x5t0Var.a;
        fjj0Var.getClass();
        g580Var.getClass();
        int i2 = 3;
        o6g o6gVar = new o6g(fjj0Var, i2);
        o6g o6gVar2 = new o6g(fjj0Var, 0);
        int i3 = 15;
        npe0 npe0Var = new npe0(new o6g(fjj0Var, 11), new o6g(fjj0Var, 7), new qsn(new abx0(new o6g(fjj0Var, i3), i2), 25), 13);
        int i4 = 16;
        jpf0 jpf0Var = new jpf0((xvf0) n3w.a(g580Var), (xvf0) npe0Var, i4);
        o6g o6gVar3 = new o6g(fjj0Var, i4);
        o6g o6gVar4 = new o6g(fjj0Var, 5);
        o6g o6gVar5 = new o6g(fjj0Var, 12);
        mg11 mg11Var = new mg11(o6gVar, new uw11(o6gVar2, npe0Var, jpf0Var, o6gVar3, o6gVar4, o6gVar5), i3);
        o6g o6gVar6 = new o6g(fjj0Var, 6);
        o6g o6gVar7 = new o6g(fjj0Var, 1);
        o6g o6gVar8 = new o6g(fjj0Var, 8);
        o6g o6gVar9 = new o6g(fjj0Var, 10);
        o6g o6gVar10 = new o6g(fjj0Var, 2);
        o6g o6gVar11 = new o6g(fjj0Var, 9);
        o6g o6gVar12 = new o6g(fjj0Var, 14);
        o6g o6gVar13 = new o6g(fjj0Var, 4);
        tgb0 tgb0Var = new tgb0((xvf0) o6gVar, (xvf0) new ys10((xvf0) mg11Var, (xvf0) new xea((xvf0) o6gVar, (xvf0) o6gVar6, (xvf0) o6gVar7, (xvf0) new px4(o6gVar2, o6gVar8, o6gVar9, jpf0Var, o6gVar10, o6gVar3, new axy((xvf0) o6gVar11, (xvf0) o6gVar12, (xvf0) new vrt0(o6gVar13, 23), (xvf0) new q720(o6gVar13, 27), (xvf0) new q720(o6gVar13, 26), 23), new o6g(fjj0Var, 13), o6gVar5, o6gVar4, 1), 21, false), 22), (xvf0) new n7i0(o6gVar2, o6gVar3, 5), 29, (byte) 0);
        toolbarComponent.setTitle(z5t0Var.y.getLabel());
        buttonComponent.setDebounceClickListener(new mmp0(27, this));
        FrameLayout frameLayout = (FrameLayout) ((View) rp31.d(this, e7h0.current_frame));
        Context context2 = fjj0Var.g;
        q5z.h(context2);
        dqe0 dqe0Var = fjj0Var.d;
        q5z.h(dqe0Var);
        lx4 lx4Var = fjj0Var.a;
        q5z.h(lx4Var);
        pho phoVar = fjj0Var.b;
        q5z.h(phoVar);
        p370 p370Var = new p370(2, lx4Var, new xcv0(phoVar), dqe0Var);
        phj0 phj0Var = fjj0Var.e;
        q5z.h(phj0Var);
        RequirementOptionDetailsView requirementOptionDetailsView = new RequirementOptionDetailsView(context2, tgb0Var, new hjj0(dqe0Var, p370Var, phj0Var));
        requirementOptionDetailsView.updateRequirement(jmw0Var);
        frameLayout.addView(requirementOptionDetailsView);
        setDismissOnBackPressed(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(SoleRequirementModalView soleRequirementModalView) {
        ((y5t0) soleRequirementModalView.presenter.Dg()).dismiss();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return qjh0.sole_requirement_selector;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        z5t0 z5t0Var = this.presenter;
        z5t0Var.Bg(this);
        x xVar = z5t0Var.x;
        tje.N(z5t0Var.Jg(), null, null, new SoleRequirementPresenter$attachView$$inlined$safeCollectIn$1(e.t(new w(xVar.b(), xVar, z5t0Var.y)), null, this), 3);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        ((y5t0) this.presenter.Dg()).dismiss();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // defpackage.y5t0
    public void refreshDoneButtonState(boolean hasOptions) {
        sk91.b(this.doneButton, hasOptions);
    }
}
