package ru.yandex.taxi.due_selector.impl.presentation.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.b;
import defpackage.axm;
import defpackage.aym;
import defpackage.az91;
import defpackage.bpf;
import defpackage.bym;
import defpackage.c0g;
import defpackage.cym;
import defpackage.d6i;
import defpackage.dqe0;
import defpackage.dvm;
import defpackage.dwm;
import defpackage.dym;
import defpackage.fym;
import defpackage.gc;
import defpackage.gmh;
import defpackage.gpx0;
import defpackage.gwm;
import defpackage.gym;
import defpackage.hzf;
import defpackage.i6r;
import defpackage.ivm;
import defpackage.izf;
import defpackage.j4n;
import defpackage.jdj;
import defpackage.k4o;
import defpackage.kxm;
import defpackage.mvm;
import defpackage.mwm;
import defpackage.n3w;
import defpackage.ncb;
import defpackage.oti;
import defpackage.oxm;
import defpackage.pav;
import defpackage.pgi;
import defpackage.py91;
import defpackage.q5z;
import defpackage.qdh0;
import defpackage.qwm;
import defpackage.r2n;
import defpackage.rp31;
import defpackage.rqo;
import defpackage.rxm;
import defpackage.tt2;
import defpackage.uph0;
import defpackage.uwm;
import defpackage.v920;
import defpackage.vvm;
import defpackage.w511;
import defpackage.wiq0;
import defpackage.xvf0;
import defpackage.xxm;
import defpackage.y1s;
import defpackage.y2s0;
import defpackage.ynm0;
import defpackage.yxm;
import defpackage.yzh;
import defpackage.zuj0;
import defpackage.zxm;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.due_selector.impl.domain.interactor.d;
import ru.yandex.taxi.due_selector.impl.presentation.ui.picker.DuePickerState;
import ru.yandex.taxi.due_selector.impl.presentation.ui.variants.DueVariantsState;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0005./012B/\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u00063"}, d2 = {"Lru/yandex/taxi/due_selector/impl/presentation/ui/DueSelectorView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Loxm;", "Landroid/content/Context;", "context", "Lrxm;", "presenter", "Lbym;", "dueSelectorStateDependencies", "Lkxm;", "backPressedDelegate", "<init>", "(Landroid/content/Context;Lrxm;Lbym;Lkxm;)V", "Lru/yandex/taxi/due_selector/impl/presentation/ui/a;", "newState", "Lzy11;", "changeState", "(Lru/yandex/taxi/due_selector/impl/presentation/ui/a;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Laym;", "render", "(Laym;)V", "Lrxm;", "Lbym;", "Lkxm;", "Landroid/view/ViewGroup;", "stateContainer", "Landroid/view/ViewGroup;", "Lru/yandex/taxi/design/ButtonComponent;", "leadingButton", "Lru/yandex/taxi/design/ButtonComponent;", "trailingButton", "Lru/yandex/taxi/design/ToolbarComponent;", "toolbar", "Lru/yandex/taxi/design/ToolbarComponent;", "Lcym;", "stateRouter", "Lcym;", "Livm;", "dueButtonsController", "Livm;", "currentState", "Lru/yandex/taxi/due_selector/impl/presentation/ui/a;", "Companion", "gym", "fym", "ViewState", "yzh", "dym", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DueSelectorView extends ConstraintLayout implements oxm {
    private static final int ANIMATION_DELAY_MILLIS = 0;
    public static final dym Companion = new dym();
    private static final float SUBTITLE_SIZE_SPAN = 0.8125f;
    private final kxm backPressedDelegate;
    private a currentState;
    private final ivm dueButtonsController;
    private final bym dueSelectorStateDependencies;
    private final ButtonComponent leadingButton;
    private final rxm presenter;
    private final ViewGroup stateContainer;
    private final cym stateRouter;
    private final ToolbarComponent toolbar;
    private final ButtonComponent trailingButton;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/due_selector/impl/presentation/ui/DueSelectorView$ViewState;", "", "VARIANTS", "PICKER", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ViewState {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ViewState[] $VALUES;
        public static final ViewState PICKER;
        public static final ViewState VARIANTS;

        static {
            ViewState viewState = new ViewState("VARIANTS", 0);
            VARIANTS = viewState;
            ViewState viewState2 = new ViewState("PICKER", 1);
            PICKER = viewState2;
            ViewState[] viewStateArr = {viewState, viewState2};
            $VALUES = viewStateArr;
            $ENTRIES = kotlin.enums.a.a(viewStateArr);
        }

        public static ViewState valueOf(String str) {
            return (ViewState) Enum.valueOf(ViewState.class, str);
        }

        public static ViewState[] values() {
            return (ViewState[]) $VALUES.clone();
        }
    }

    public DueSelectorView(Context context, rxm rxmVar, bym bymVar, kxm kxmVar) {
        super(context);
        this.presenter = rxmVar;
        this.dueSelectorStateDependencies = bymVar;
        this.backPressedDelegate = kxmVar;
        c.q(this, uph0.due_selector_view, true);
        int i = qdh0.due_select_state_container;
        WeakHashMap weakHashMap = b.a;
        this.stateContainer = (ViewGroup) ((View) rp31.d(this, i));
        this.leadingButton = (ButtonComponent) ((View) rp31.d(this, qdh0.leading_button));
        this.trailingButton = (ButtonComponent) ((View) rp31.d(this, qdh0.trailing_button));
        this.toolbar = (ToolbarComponent) ((View) rp31.d(this, qdh0.due_select_toolbar));
        this.stateRouter = new gym(this);
        this.dueButtonsController = new fym(this);
    }

    private final void changeState(a newState) {
        a aVar = this.currentState;
        if (aVar != null) {
            this.stateContainer.removeView(aVar.asView());
        }
        this.currentState = newState;
        this.stateContainer.addView(newState.asView(), -1, -2);
        this.backPressedDelegate.c = newState.getViewState() == ViewState.PICKER;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        rxm rxmVar = this.presenter;
        rxmVar.Bg(this);
        ((oxm) rxmVar.Dg()).render(rxmVar.y.d());
        this.toolbar.requestAccessibilityFocus();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // defpackage.oxm
    public void render(aym newState) {
        this.toolbar.setTitle(newState.getTitle());
        int i = 9;
        int i2 = 12;
        int i3 = 16;
        int i4 = 14;
        int i5 = 6;
        int i6 = 3;
        int i7 = 11;
        int i8 = 2;
        int i9 = 26;
        int i10 = 8;
        int i11 = 13;
        int i12 = 0;
        if (newState instanceof zxm) {
            bym bymVar = this.dueSelectorStateDependencies;
            cym cymVar = this.stateRouter;
            ivm ivmVar = this.dueButtonsController;
            bymVar.getClass();
            cymVar.getClass();
            ivmVar.getClass();
            n3w a = n3w.a(new qwm(new jdj(new izf(bymVar, i12), n3w.a(ivmVar), new izf(bymVar, i7))));
            izf izfVar = new izf(bymVar, i6);
            izf izfVar2 = new izf(bymVar, i5);
            izf izfVar3 = new izf(bymVar, i4);
            izf izfVar4 = new izf(bymVar, i3);
            izf izfVar5 = new izf(bymVar, i11);
            gpx0 gpx0Var = new gpx0(izfVar4, izfVar5, new izf(bymVar, i2), i10);
            oti otiVar = new oti(izfVar5, new y2s0(izfVar4, new gmh(new izf(bymVar, i), i9), izfVar5, i9), i11);
            gc gcVar = new gc((Object) izfVar3, (xvf0) gpx0Var, (xvf0) otiVar, (xvf0) new izf(bymVar, i8), (xvf0) new izf(bymVar, 5), (xvf0) new izf(bymVar, 10), (xvf0) new gwm(izfVar4, 0), (xvf0) new izf(bymVar, 15), (xvf0) izfVar4, 14);
            int i13 = 1;
            izf izfVar6 = new izf(bymVar, i13);
            izf izfVar7 = new izf(bymVar, 4);
            izf izfVar8 = new izf(bymVar, i10);
            gwm gwmVar = new gwm(izfVar4, i13);
            n3w a2 = n3w.a(new uwm(new j4n(izfVar, izfVar2, gcVar, izfVar6, izfVar7, new ncb((xvf0) vvm.a, (xvf0) izfVar6, (xvf0) otiVar, (xvf0) new bpf((xvf0) izfVar8, (xvf0) gwmVar, (xvf0) dwm.a, (xvf0) izfVar6, 28, (char) 0), (xvf0) new pgi((xvf0) izfVar8, (xvf0) mwm.a, (xvf0) gwmVar, 19, (byte) 0), (xvf0) new gmh(otiVar, 25), 24), new izf(bymVar, 7))));
            qwm qwmVar = (qwm) a.a;
            uwm uwmVar = (uwm) a2.a;
            yzh yzhVar = new yzh(this);
            j4n j4nVar = uwmVar.a;
            ru.yandex.taxi.due_selector.impl.presentation.ui.picker.a aVar = new ru.yandex.taxi.due_selector.impl.presentation.ui.picker.a((String) ((izf) j4nVar.a).get(), (py91) ((izf) j4nVar.b).get(), yzhVar, (d) ((gc) j4nVar.c).get(), (tt2) ((izf) j4nVar.x).get(), (dvm) ((izf) j4nVar.y).get(), (ru.yandex.taxi.due_selector.impl.domain.interactor.a) ((ncb) j4nVar.z).get(), (az91) ((izf) j4nVar.w).get());
            jdj jdjVar = qwmVar.a;
            changeState(new DuePickerState((Context) ((izf) jdjVar.c).get(), aVar, (ivm) ((n3w) jdjVar.w).a, (pav) ((izf) jdjVar.b).get()));
            return;
        }
        if (!(newState instanceof xxm) && !(newState instanceof yxm)) {
            w511.b();
            return;
        }
        bym bymVar2 = this.dueSelectorStateDependencies;
        cym cymVar2 = this.stateRouter;
        ivm ivmVar2 = this.dueButtonsController;
        bymVar2.getClass();
        cymVar2.getClass();
        ivmVar2.getClass();
        n3w.a(new qwm(new jdj(new izf(bymVar2, 0), n3w.a(ivmVar2), new izf(bymVar2, i7))));
        izf izfVar9 = new izf(bymVar2, i6);
        izf izfVar10 = new izf(bymVar2, i5);
        izf izfVar11 = new izf(bymVar2, i4);
        izf izfVar12 = new izf(bymVar2, i3);
        izf izfVar13 = new izf(bymVar2, i11);
        gpx0 gpx0Var2 = new gpx0(izfVar12, izfVar13, new izf(bymVar2, i2), i10);
        int i14 = 26;
        oti otiVar2 = new oti(izfVar13, new y2s0(izfVar12, new gmh(new izf(bymVar2, i), i14), izfVar13, i14), i11);
        gc gcVar2 = new gc((Object) izfVar11, (xvf0) gpx0Var2, (xvf0) otiVar2, (xvf0) new izf(bymVar2, 2), (xvf0) new izf(bymVar2, 5), (xvf0) new izf(bymVar2, 10), (xvf0) new gwm(izfVar12, 0), (xvf0) new izf(bymVar2, 15), (xvf0) izfVar12, 14);
        int i15 = 1;
        izf izfVar14 = new izf(bymVar2, i15);
        izf izfVar15 = new izf(bymVar2, 4);
        izf izfVar16 = new izf(bymVar2, 8);
        gwm gwmVar2 = new gwm(izfVar12, i15);
        n3w.a(new uwm(new j4n(izfVar9, izfVar10, gcVar2, izfVar14, izfVar15, new ncb((xvf0) vvm.a, (xvf0) izfVar14, (xvf0) otiVar2, (xvf0) new bpf((xvf0) izfVar16, (xvf0) gwmVar2, (xvf0) dwm.a, (xvf0) izfVar14, 28, (char) 0), (xvf0) new pgi((xvf0) izfVar16, (xvf0) mwm.a, (xvf0) gwmVar2, 19, (byte) 0), (xvf0) new gmh(otiVar2, 25), 24), new izf(bymVar2, 7))));
        i6r i6rVar = ((hzf) bymVar2).a;
        Context W1 = ((c0g) i6rVar).W1();
        q5z.h(W1);
        dqe0 I2 = ((c0g) i6rVar).I2();
        q5z.h(I2);
        wiq0 S2 = ((c0g) i6rVar).S2();
        q5z.h(S2);
        c0g c0gVar = (c0g) i6rVar;
        ynm0 ynm0Var = (ynm0) c0gVar.A.a.u2.get();
        q5z.h(ynm0Var);
        y1s y1sVar = (y1s) ((c0g) i6rVar).z.Zm.get();
        q5z.h(y1sVar);
        axm axmVar = (axm) ((c0g) i6rVar).z.Vj.get();
        q5z.h(axmVar);
        rqo l2 = ((c0g) i6rVar).l2();
        q5z.h(l2);
        d6i d6iVar = new d6i(l2, 2);
        zuj0 N2 = ((c0g) i6rVar).N2();
        q5z.h(N2);
        v920 v920Var = new v920(S2, ynm0Var, y1sVar, axmVar, d6iVar, N2);
        axm axmVar2 = (axm) ((c0g) i6rVar).z.Vj.get();
        q5z.h(axmVar2);
        changeState(new DueVariantsState(W1, new r2n(cymVar2, I2, v920Var, axmVar2, new mvm((dqe0) c0gVar.A.a.a.s2.get())), ivmVar2));
    }
}
