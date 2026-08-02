package ru.yandex.taxi.due_selector.impl.presentation.ui.picker;

import android.animation.LayoutTransition;
import android.content.Context;
import android.util.ArrayMap;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.b;
import com.yandex.go.due.api.analytics.model.DueAnalyticOrigin;
import com.yandex.go.due.api.analytics.model.DueAnalyticViewType;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.a4w;
import defpackage.az91;
import defpackage.cvm;
import defpackage.dvm;
import defpackage.ey91;
import defpackage.fym;
import defpackage.hdu;
import defpackage.i7o;
import defpackage.ivm;
import defpackage.j73;
import defpackage.jdj;
import defpackage.jst;
import defpackage.kk5;
import defpackage.kvm;
import defpackage.kyh0;
import defpackage.lvm;
import defpackage.msb1;
import defpackage.nwy0;
import defpackage.owm;
import defpackage.pav;
import defpackage.pex0;
import defpackage.pxm;
import defpackage.qdh0;
import defpackage.qtb1;
import defpackage.qu;
import defpackage.qxm;
import defpackage.rp31;
import defpackage.rxm;
import defpackage.scc;
import defpackage.swm;
import defpackage.tse0;
import defpackage.twm;
import defpackage.uph0;
import defpackage.uxk0;
import defpackage.v8e;
import defpackage.vxk0;
import defpackage.w3w;
import defpackage.w511;
import defpackage.x770;
import defpackage.xvm;
import defpackage.xwm;
import defpackage.ywm;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.due_selector.impl.domain.entity.ControlButtonState;
import ru.yandex.taxi.due_selector.impl.domain.entity.DuePickerButtonType;
import ru.yandex.taxi.due_selector.impl.domain.interactor.d;
import ru.yandex.taxi.due_selector.impl.presentation.ui.DueSelectorView;
import ru.yandex.taxi.due_selector.impl.presentation.ui.picker.dayspicker.DaysTimePicker;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.InstructionsView;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 E2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001FB-\b\u0001\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\"\u0010\u001cJ\u000f\u0010#\u001a\u00020\u0011H\u0014¢\u0006\u0004\b#\u0010\u001cJ\u000f\u0010$\u001a\u00020\u0011H\u0016¢\u0006\u0004\b$\u0010\u001cJ\u000f\u0010%\u001a\u00020\u0011H\u0016¢\u0006\u0004\b%\u0010\u001cJ\u001f\u0010)\u001a\u00020\u00112\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u00112\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00102R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R \u0010=\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lru/yandex/taxi/due_selector/impl/presentation/ui/picker/DuePickerState;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/yandex/taxi/due_selector/impl/presentation/ui/a;", "Ltwm;", "Lnwy0;", "Landroid/content/Context;", "context", "Lru/yandex/taxi/due_selector/impl/presentation/ui/picker/a;", "presenter", "Livm;", "dueButtonsController", "Lpav;", "imageLoader", "<init>", "(Landroid/content/Context;Lru/yandex/taxi/due_selector/impl/presentation/ui/picker/a;Livm;Lpav;)V", "La4w;", "action", "Lzy11;", "instructionActionClicked", "(La4w;)V", "Lw3w;", "instructionButtonClicked", "(Lw3w;)V", "Ljava/util/Calendar;", "calendar", "setTransitionListener", "(Ljava/util/Calendar;)V", "removeTransitionListener", "()V", "initStateRendererMap", "(Livm;)V", "Lru/yandex/taxi/due_selector/impl/presentation/ui/DueSelectorView$ViewState;", "getViewState", "()Lru/yandex/taxi/due_selector/impl/presentation/ui/DueSelectorView$ViewState;", "onAttachedToWindow", "onDetachedFromWindow", "doneButtonClicked", "retryButtonClicked", "Lswm;", "currentStateInfo", "stateInfo", "render", "(Lswm;Lswm;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Landroid/view/View;", "asView", "()Landroid/view/View;", "Lru/yandex/taxi/due_selector/impl/presentation/ui/picker/a;", "Lpav;", "Lru/yandex/taxi/due_selector/impl/presentation/ui/picker/dayspicker/DaysTimePicker;", "picker", "Lru/yandex/taxi/due_selector/impl/presentation/ui/picker/dayspicker/DaysTimePicker;", "Lru/yandex/taxi/widget/InstructionsView;", "instructionsView", "Lru/yandex/taxi/widget/InstructionsView;", "", "Lru/yandex/taxi/due_selector/impl/presentation/ui/picker/DuePickerStateInfo$PickerState;", "Li7o;", "stateToRenderer", "Ljava/util/Map;", "Lvxk0;", "roundSectionsHandler", "Lvxk0;", "Lru/yandex/taxi/due_selector/impl/presentation/ui/picker/EndTransitionListener;", "transitionListener", "Lru/yandex/taxi/due_selector/impl/presentation/ui/picker/EndTransitionListener;", "Companion", "owm", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DuePickerState extends ConstraintLayout implements ru.yandex.taxi.due_selector.impl.presentation.ui.a, twm, nwy0 {
    public static final owm Companion = new owm();
    private static final int SCREEN_STATES_COUNT = 4;
    private final pav imageLoader;
    private final InstructionsView instructionsView;
    private final DaysTimePicker picker;
    private final a presenter;
    private final vxk0 roundSectionsHandler;
    private final Map<DuePickerStateInfo$PickerState, i7o> stateToRenderer;
    private EndTransitionListener transitionListener;

    public DuePickerState(Context context, a aVar, ivm ivmVar, pav pavVar) {
        super(context);
        this.presenter = aVar;
        this.imageLoader = pavVar;
        c.q(this, uph0.date_time_picker, true);
        int i = qdh0.due_time_picker;
        WeakHashMap weakHashMap = b.a;
        DaysTimePicker daysTimePicker = (DaysTimePicker) ((View) rp31.d(this, i));
        this.picker = daysTimePicker;
        InstructionsView instructionsView = (InstructionsView) ((View) rp31.d(this, qdh0.instructions_view));
        this.instructionsView = instructionsView;
        this.stateToRenderer = new ArrayMap(4);
        initStateRendererMap(ivmVar);
        vxk0 vxk0Var = new vxk0(context, scc.g(new uxk0(56, true, j73.d0(new View[]{daysTimePicker})), new uxk0(56, false, j73.d0(new View[]{instructionsView}))), true);
        this.roundSectionsHandler = vxk0Var;
        vxk0Var.b();
    }

    private final void initStateRendererMap(ivm dueButtonsController) {
        int i = qdh0.due_picker_progress;
        WeakHashMap weakHashMap = b.a;
        jdj jdjVar = new jdj(10, (View) rp31.d(this, i), (ListItemComponent) ((View) rp31.d(this, qdh0.due_picker_error_message)), this.picker);
        this.instructionsView.setOnButtonClickListener(new DuePickerState$initStateRendererMap$1(1, this, DuePickerState.class, "instructionButtonClicked", "instructionButtonClicked(Lru/yandex/taxi/widget/InstructionButtonAction;)V", 0));
        this.instructionsView.setOnItemClickListener(new DuePickerState$initStateRendererMap$2(1, this, DuePickerState.class, "instructionActionClicked", "instructionActionClicked(Lru/yandex/taxi/widget/InstructionItemAction;)V", 0));
        this.instructionsView.init(this.imageLoader);
        hdu hduVar = new hdu(this.instructionsView, (Group) ((View) rp31.d(this, qdh0.instructions_view_group)));
        this.stateToRenderer.put(DuePickerStateInfo$PickerState.LOADING, new i7o(jdjVar, hduVar, dueButtonsController, 2));
        this.stateToRenderer.put(DuePickerStateInfo$PickerState.ERROR, new i7o(jdjVar, hduVar, dueButtonsController, 0));
        this.stateToRenderer.put(DuePickerStateInfo$PickerState.VALID_DATE, new i7o(jdjVar, hduVar, dueButtonsController, 4));
        this.stateToRenderer.put(DuePickerStateInfo$PickerState.INVALID_DATE, new i7o(jdjVar, hduVar, dueButtonsController, 1));
        this.stateToRenderer.put(DuePickerStateInfo$PickerState.UNAVAILABLE, new i7o(jdjVar, hduVar, dueButtonsController, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void instructionActionClicked(a4w action) {
        Calendar calendar;
        if (!(action instanceof lvm) || (calendar = ((lvm) action).a) == null) {
            return;
        }
        a aVar = this.presenter;
        dvm dvmVar = aVar.C;
        DueAnalyticViewType dueAnalyticViewType = DueAnalyticViewType.DEFAULT;
        x770 x770Var = dvmVar.b;
        String value = dueAnalyticViewType.getValue();
        pex0 m = ((k) dvmVar.a).m();
        String str = m != null ? m.b : null;
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str);
        }
        x770Var.a.a("Preorder.DiscountDateTapped", hashMap, 1, tse0.r("view_type", hashMap, value));
        r0 r0Var = aVar.A.h.a;
        Boolean bool = Boolean.TRUE;
        r0Var.getClass();
        r0Var.m(null, bool);
        setTransitionListener(calendar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void instructionButtonClicked(w3w action) {
        rxm rxmVar;
        if (action instanceof kvm) {
            a aVar = this.presenter;
            dvm dvmVar = aVar.C;
            DueAnalyticViewType dueAnalyticViewType = DueAnalyticViewType.DEFAULT;
            x770 x770Var = dvmVar.b;
            String value = dueAnalyticViewType.getValue();
            pex0 m = ((k) dvmVar.a).m();
            String str = m != null ? m.b : null;
            HashMap hashMap = new HashMap();
            if (str != null) {
                hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str);
            }
            x770Var.a.a("Preorder.RemovePreorderButtonTapped", hashMap, 1, tse0.r("view_type", hashMap, value));
            aVar.A.e.a(qtb1.D);
            rxmVar = ((DueSelectorView) aVar.z.a).presenter;
            ((kk5) rxmVar.x.a).r(new qu(9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(DuePickerState duePickerState, Calendar calendar) {
        duePickerState.presenter.K.l(calendar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeTransitionListener() {
        LayoutTransition layoutTransition;
        if (this.transitionListener == null || (layoutTransition = this.instructionsView.getLayoutTransition()) == null) {
            return;
        }
        layoutTransition.removeTransitionListener(this.transitionListener);
        this.transitionListener = null;
    }

    private final void setTransitionListener(final Calendar calendar) {
        this.transitionListener = new EndTransitionListener() { // from class: ru.yandex.taxi.due_selector.impl.presentation.ui.picker.DuePickerState$setTransitionListener$1
            @Override // android.animation.LayoutTransition.TransitionListener
            public void endTransition(LayoutTransition transition, ViewGroup container, View view, int transitionType) {
                DaysTimePicker daysTimePicker;
                if (transitionType == 3) {
                    daysTimePicker = DuePickerState.this.picker;
                    daysTimePicker.scrollToDate(calendar);
                    DuePickerState.this.removeTransitionListener();
                }
            }

            @Override // ru.yandex.taxi.due_selector.impl.presentation.ui.picker.EndTransitionListener, android.animation.LayoutTransition.TransitionListener
            public /* bridge */ void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
                super.startTransition(layoutTransition, viewGroup, view, i);
            }
        };
        LayoutTransition layoutTransition = this.instructionsView.getLayoutTransition();
        if (layoutTransition != null) {
            layoutTransition.addTransitionListener(this.transitionListener);
        }
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        this.roundSectionsHandler.b();
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // ru.yandex.taxi.due_selector.impl.presentation.ui.a
    public View asView() {
        return this;
    }

    @Override // ru.yandex.taxi.due_selector.impl.presentation.ui.a
    public void doneButtonClicked() {
        DueAnalyticOrigin dueAnalyticOrigin;
        a aVar = this.presenter;
        d dVar = aVar.A;
        swm swmVar = aVar.I;
        dVar.getClass();
        Calendar calendar = swmVar.d;
        ywm xwmVar = calendar != null ? new xwm(calendar, swmVar.b, swmVar.m) : msb1.F;
        dVar.f.b(false);
        dVar.e.a(xwmVar);
        if (calendar != null) {
            dvm dvmVar = aVar.C;
            String str = aVar.x;
            DueAnalyticViewType dueAnalyticViewType = DueAnalyticViewType.DEFAULT;
            cvm cvmVar = cvm.w;
            az91 az91Var = aVar.E;
            if (az91Var instanceof qxm) {
                dueAnalyticOrigin = DueAnalyticOrigin.SUMMARY;
            } else {
                if (!(az91Var instanceof pxm)) {
                    w511.b();
                    return;
                }
                dueAnalyticOrigin = DueAnalyticOrigin.INTERCITY_DASHBOARD;
            }
            dvmVar.a(str, dueAnalyticViewType, calendar, cvmVar, dueAnalyticOrigin);
        }
    }

    @Override // ru.yandex.taxi.due_selector.impl.presentation.ui.a
    public DueSelectorView.ViewState getViewState() {
        return DueSelectorView.ViewState.PICKER;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        DueAnalyticOrigin dueAnalyticOrigin;
        super.onAttachedToWindow();
        a aVar = this.presenter;
        aVar.Bg(this);
        aVar.Kg();
        dvm dvmVar = aVar.C;
        String str = aVar.x;
        DueAnalyticViewType dueAnalyticViewType = DueAnalyticViewType.DEFAULT;
        az91 az91Var = aVar.E;
        if (az91Var instanceof qxm) {
            dueAnalyticOrigin = DueAnalyticOrigin.SUMMARY;
        } else {
            if (!(az91Var instanceof pxm)) {
                w511.b();
                return;
            }
            dueAnalyticOrigin = DueAnalyticOrigin.INTERCITY_DASHBOARD;
        }
        dvmVar.c(str, dueAnalyticViewType, dueAnalyticOrigin);
        this.picker.setListener(new v8e(26, this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        removeTransitionListener();
    }

    @Override // defpackage.twm
    public void render(swm currentStateInfo, swm stateInfo) {
        ButtonComponent buttonComponent;
        ButtonComponent buttonComponent2;
        DuePickerStateInfo$PickerState duePickerStateInfo$PickerState = stateInfo.a;
        i7o i7oVar = this.stateToRenderer.get(duePickerStateInfo$PickerState);
        if (i7oVar != null) {
            switch (i7oVar.a) {
                case 0:
                    jdj jdjVar = i7oVar.b;
                    int i = kyh0.due_select_no_connection_error;
                    ((View) jdjVar.c).setVisibility(8);
                    ListItemComponent listItemComponent = (ListItemComponent) jdjVar.b;
                    listItemComponent.setTitle(i);
                    listItemComponent.setVisibility(0);
                    ((DaysTimePicker) jdjVar.w).setVisibility(4);
                    ((Group) i7oVar.c.b).setVisibility(8);
                    ivm ivmVar = i7oVar.d;
                    fym fymVar = (fym) ivmVar;
                    fymVar.b(new xvm(DuePickerButtonType.RETRY_BUTTON, null, kyh0.no_connection_try_again, null, ControlButtonState.ERROR, false, 42), xvm.g);
                    break;
                case 1:
                    i7oVar.c.s(stateInfo, false);
                    ivm ivmVar2 = i7oVar.d;
                    xvm xvmVar = xvm.g;
                    ((fym) ivmVar2).b(ey91.f(stateInfo.i), ey91.f(stateInfo.j));
                    i7oVar.b.l(currentStateInfo, stateInfo);
                    break;
                case 2:
                    jdj jdjVar2 = i7oVar.b;
                    ((View) jdjVar2.c).setVisibility(0);
                    ((ListItemComponent) jdjVar2.b).setVisibility(8);
                    ((DaysTimePicker) jdjVar2.w).setVisibility(4);
                    ((Group) i7oVar.c.b).setVisibility(8);
                    ivm ivmVar3 = i7oVar.d;
                    fym fymVar2 = (fym) ivmVar3;
                    fymVar2.b(new xvm(DuePickerButtonType.LOADING_BUTTON, null, kyh0.common_done, null, ControlButtonState.LOADING, false, 42), xvm.g);
                    break;
                case 3:
                    jdj jdjVar3 = i7oVar.b;
                    int i2 = kyh0.due_select_not_available;
                    ((View) jdjVar3.c).setVisibility(8);
                    ListItemComponent listItemComponent2 = (ListItemComponent) jdjVar3.b;
                    listItemComponent2.setTitle(i2);
                    listItemComponent2.setVisibility(0);
                    ((DaysTimePicker) jdjVar3.w).setVisibility(4);
                    ((Group) i7oVar.c.b).setVisibility(8);
                    DueSelectorView dueSelectorView = ((fym) i7oVar.d).a;
                    buttonComponent = dueSelectorView.leadingButton;
                    buttonComponent.setVisibility(8);
                    buttonComponent2 = dueSelectorView.trailingButton;
                    buttonComponent2.setVisibility(8);
                    break;
                default:
                    i7oVar.c.s(stateInfo, true);
                    ivm ivmVar4 = i7oVar.d;
                    xvm xvmVar2 = xvm.g;
                    ((fym) ivmVar4).b(ey91.f(stateInfo.i), ey91.f(stateInfo.j));
                    i7oVar.b.l(currentStateInfo, stateInfo);
                    break;
            }
        } else {
            jst.e.x(new IllegalStateException(), String.format("Not found rendered for %s state", Arrays.copyOf(new Object[]{duePickerStateInfo$PickerState}, 1)));
        }
        this.roundSectionsHandler.b();
    }

    @Override // ru.yandex.taxi.due_selector.impl.presentation.ui.a
    public void retryButtonClicked() {
        this.presenter.Kg();
    }
}
