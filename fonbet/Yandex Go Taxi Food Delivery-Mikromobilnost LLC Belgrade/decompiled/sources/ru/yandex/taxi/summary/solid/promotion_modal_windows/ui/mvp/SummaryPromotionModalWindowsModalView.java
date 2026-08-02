package ru.yandex.taxi.summary.solid.promotion_modal_windows.ui.mvp;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.slot.ui.view.SlotItemViewComponent;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.amv0;
import defpackage.b1h0;
import defpackage.bdc;
import defpackage.blv0;
import defpackage.bmv0;
import defpackage.bts0;
import defpackage.cma1;
import defpackage.cmv0;
import defpackage.dlv0;
import defpackage.ejr;
import defpackage.flv0;
import defpackage.fnx0;
import defpackage.gnx0;
import defpackage.grs0;
import defpackage.hhs0;
import defpackage.is60;
import defpackage.jl40;
import defpackage.kr;
import defpackage.lt6;
import defpackage.m8t0;
import defpackage.mi31;
import defpackage.mlv0;
import defpackage.mrg0;
import defpackage.mx70;
import defpackage.n2v0;
import defpackage.nlv0;
import defpackage.nqs0;
import defpackage.ny61;
import defpackage.olv0;
import defpackage.pdc;
import defpackage.pex0;
import defpackage.plv0;
import defpackage.qdb1;
import defpackage.qos0;
import defpackage.rkr;
import defpackage.rlv0;
import defpackage.s8o;
import defpackage.scc;
import defpackage.slv0;
import defpackage.sp31;
import defpackage.tje;
import defpackage.tpt0;
import defpackage.ufu;
import defpackage.uyj;
import defpackage.vng;
import defpackage.w511;
import defpackage.wfh0;
import defpackage.wiq0;
import defpackage.wrh0;
import defpackage.x4e;
import defpackage.xng0;
import defpackage.xss0;
import defpackage.xw31;
import defpackage.ylv0;
import defpackage.yss0;
import defpackage.zlv0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.communications.model.widgets.ActionButton;
import ru.yandex.taxi.communications.model.widgets.b;
import ru.yandex.taxi.communications.model.widgets.d;
import ru.yandex.taxi.communications.model.widgets.e0;
import ru.yandex.taxi.communications.model.widgets.l0;
import ru.yandex.taxi.communications.model.widgets.m0;
import ru.yandex.taxi.communications.model.widgets.n0;
import ru.yandex.taxi.communications.model.widgets.q;
import ru.yandex.taxi.communications.model.widgets.x;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.SliderButtonView;
import ru.yandex.taxi.summary.promotions.models.TextAlign;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;
import ru.yandex.taxi.widget.BottomEdgeButtonLayout;
import ru.yandex.taxi.widget.RoundedCornersImageView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 [2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\\]B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u001f\u0010\u0012J\u000f\u0010 \u001a\u00020\u0010H\u0014¢\u0006\u0004\b \u0010\u0012J\u0017\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00162\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010+\u001a\u00020\u00102\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00102\u0006\u0010%\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u00102\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u0002052\u0006\u00104\u001a\u000200H\u0002¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\u00102\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b:\u0010;J\u001d\u0010>\u001a\u00020\u00102\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0(H\u0002¢\u0006\u0004\b>\u0010,J\u001f\u0010A\u001a\u00020\u00102\u0006\u0010?\u001a\u00020<2\u0006\u0010@\u001a\u00020\u0016H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010E\u001a\u00020D2\u0006\u0010C\u001a\u00020<H\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010I\u001a\u00020\u00102\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020K2\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bL\u0010MJ\u0013\u0010O\u001a\u000200*\u00020NH\u0002¢\u0006\u0004\bO\u0010PR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010QR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010RR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010SR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010TR\u0018\u0010U\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR$\u0010Y\u001a\u0012\u0012\u0004\u0012\u0002050Wj\b\u0012\u0004\u0012\u000205`X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010Z¨\u0006^"}, d2 = {"Lru/yandex/taxi/summary/solid/promotion_modal_windows/ui/mvp/SummaryPromotionModalWindowsModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lylv0;", "Lrkr;", "Landroid/content/Context;", "context", "Lpdc;", "colorConverter", "Lslv0;", "presenter", "Lbts0;", "slotItemViewFactory", "Lejr;", "flexHeaderDelegate", "<init>", "(Landroid/content/Context;Lpdc;Lslv0;Lbts0;Lejr;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lylv0;", "onAppearAnimationComplete", "onBackPressed", "isBackPressedEnabled", "changeBackPressedState", "(Z)V", "Lkr;", "action", "handleAction", "(Lkr;)Z", "", "Lxss0;", "bullets", "renderBullets", "(Ljava/util/List;)V", "Lnqs0;", "handleBulletAction", "(Lnqs0;)V", "", "size", "applyBulletViewsCacheSize", "(I)V", "position", "Lyss0;", "getBulletView", "(I)Lyss0;", "Lcmv0;", "widget", "renderWidget", "(Lcmv0;)V", "Lru/yandex/taxi/communications/model/widgets/ActionButton;", "buttons", "renderButtons", "actionButton", "isLast", "setupButton", "(Lru/yandex/taxi/communications/model/widgets/ActionButton;Z)V", "button", "Lru/yandex/taxi/design/ButtonComponent;", "createButton", "(Lru/yandex/taxi/communications/model/widgets/ActionButton;)Lru/yandex/taxi/design/ButtonComponent;", "Lbmv0;", "sliderButton", "setupSlider", "(Lbmv0;)V", "Lru/yandex/taxi/design/SliderButtonView;", "createSlider", "(Lbmv0;)Lru/yandex/taxi/design/SliderButtonView;", "Lru/yandex/taxi/summary/promotions/models/TextAlign;", "toComponentAlignment", "(Lru/yandex/taxi/summary/promotions/models/TextAlign;)I", "Lpdc;", "Lslv0;", "Lbts0;", "Lejr;", "sliderView", "Lru/yandex/taxi/design/SliderButtonView;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "bulletViewsCache", "Ljava/util/ArrayList;", "Companion", "olv0", "nlv0", "solid"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SummaryPromotionModalWindowsModalView extends SlideableBindingModalView<ylv0> implements rkr {
    public static final nlv0 Companion = new nlv0();
    private static final float LAST_BUTTON_LETTER_SPACING = -0.005f;
    private final ArrayList<yss0> bulletViewsCache;
    private final pdc colorConverter;
    private final ejr flexHeaderDelegate;
    private final slv0 presenter;
    private SliderButtonView sliderView;
    private final bts0 slotItemViewFactory;

    public SummaryPromotionModalWindowsModalView(Context context, pdc pdcVar, slv0 slv0Var, bts0 bts0Var, ejr ejrVar) {
        super(context);
        this.colorConverter = pdcVar;
        this.presenter = slv0Var;
        this.slotItemViewFactory = bts0Var;
        this.flexHeaderDelegate = ejrVar;
        this.bulletViewsCache = new ArrayList<>();
        qdb1.b(this, new mlv0(slv0Var, 0));
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        setDismissOnTouchOutside(true);
    }

    private final void applyBulletViewsCacheSize(int size) {
        if (this.bulletViewsCache.size() > size) {
            getBinding().b.removeViews(size, this.bulletViewsCache.size() - size);
            ArrayList<yss0> arrayList = this.bulletViewsCache;
            arrayList.subList(size, arrayList.size()).clear();
        } else if (this.bulletViewsCache.size() < size) {
            int size2 = size - this.bulletViewsCache.size();
            for (int i = 0; i < size2; i++) {
                AttributeSet attributeSet = null;
                int i2 = 0;
                SlotItemViewComponent slotItemViewComponent = new SlotItemViewComponent(getContext(), attributeSet, i2, ((grs0) this.slotItemViewFactory).a, 6, null);
                applyBulletViewsCacheSize$lambda$0$0(slotItemViewComponent);
                this.bulletViewsCache.add(slotItemViewComponent);
                getBinding().b.addView(slotItemViewComponent.asView());
            }
        }
    }

    private static final zy11 applyBulletViewsCacheSize$lambda$0$0(View view) {
        x4e.y(-1, -2, view);
        return zy11.a;
    }

    private final ButtonComponent createButton(ActionButton button) {
        ButtonComponent buttonComponent = new ButtonComponent(getContext(), null, 0, 6, null);
        buttonComponent.setText(button.b);
        buttonComponent.setTextSize(0, tje.r(mrg0.component_text_size_body, getContext()));
        buttonComponent.setButtonSize(3);
        buttonComponent.setRoundedCornersRadius(tje.r(mrg0.go_design_m_space, getContext()));
        return buttonComponent;
    }

    private final SliderButtonView createSlider(bmv0 sliderButton) {
        SliderButtonView sliderButtonView = new SliderButtonView(getContext(), null, 0, 6, null);
        sliderButtonView.setTrackBackgroundColor(s8o.m(sliderButton.b.a, sliderButtonView.getContext()));
        sliderButtonView.setTextColor(sliderButton.b.b);
        qos0 qos0Var = sliderButton.a;
        sliderButtonView.setTitleIdle(qos0Var.b);
        String str = qos0Var.c;
        if (str != null) {
            sliderButtonView.setSubtitleIdle(str);
        }
        return sliderButtonView;
    }

    private final yss0 getBulletView(int position) {
        return this.bulletViewsCache.get(position);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleBulletAction(nqs0 action) {
        if (action instanceof dlv0) {
            slv0 slv0Var = this.presenter;
            slv0Var.z.invoke(((dlv0) action).b);
        } else if (action instanceof blv0) {
            slv0 slv0Var2 = this.presenter;
            slv0Var2.z.invoke(((blv0) action).b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(SummaryPromotionModalWindowsModalView summaryPromotionModalWindowsModalView) {
        xw31.w(summaryPromotionModalWindowsModalView.getBinding().e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderBullets(List<xss0> bullets) {
        getBinding().b.setDividerDrawable(vng.t(b1h0.bullets_divider, getContext()));
        applyBulletViewsCacheSize(bullets.size());
        int i = 0;
        for (Object obj : bullets) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            getBulletView(i).render((xss0) obj, false, new lt6(this, 2));
            i = i2;
        }
    }

    private final void renderButtons(List<ActionButton> buttons) {
        int i = 0;
        for (Object obj : buttons) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            setupButton((ActionButton) obj, i == scc.f(buttons));
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderWidget(cmv0 widget) {
        getBinding().i.removeAllViews();
        if (widget instanceof bmv0) {
            setupSlider((bmv0) widget);
        } else if (widget instanceof zlv0) {
            renderButtons(((zlv0) widget).a);
        } else {
            if (jl40.l(widget, amv0.a)) {
                return;
            }
            w511.b();
        }
    }

    private final void setupButton(ActionButton actionButton, boolean isLast) {
        ButtonComponent createButton = createButton(actionButton);
        if (isLast) {
            createButton.setTextTypeface(3);
            createButton.setLetterSpacing(-0.005f);
        }
        createButton.setButtonTitleColor(isLast ? new bdc(xng0.textOnControl) : new bdc(xng0.textOnControlMinor));
        createButton.setButtonBackground(((ufu) this.colorConverter).d(isLast ? new bdc(xng0.controlMain) : new bdc(xng0.controlMinor), actionButton.c));
        b bVar = actionButton.e;
        if (bVar instanceof e0) {
            createButton.setDebounceClickListener(new mlv0(this.presenter, 1));
        } else if (bVar instanceof x) {
            createButton.setDebounceClickListener(new mlv0(this.presenter, 2));
        } else if (bVar instanceof ActionButton.i) {
            createButton.setDebounceClickListener(new tpt0(17, this, bVar));
        } else if (!jl40.l(bVar, d.INSTANCE) && !(bVar instanceof ActionButton.a) && !(bVar instanceof ActionButton.f) && !(bVar instanceof ActionButton.g) && !(bVar instanceof ActionButton.d) && !(bVar instanceof ActionButton.h) && !(bVar instanceof ActionButton.j) && !(bVar instanceof ActionButton.k) && !(bVar instanceof ActionButton.l) && !(bVar instanceof ActionButton.c) && !jl40.l(bVar, q.INSTANCE) && !(bVar instanceof ActionButton.b) && !jl40.l(bVar, l0.INSTANCE) && !jl40.l(bVar, n0.INSTANCE) && !jl40.l(bVar, m0.INSTANCE) && bVar != null) {
            w511.b();
            return;
        }
        getBinding().i.addView(createButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupButton$lambda$1(SummaryPromotionModalWindowsModalView summaryPromotionModalWindowsModalView, b bVar) {
        mi31 mi31Var;
        slv0 slv0Var = summaryPromotionModalWindowsModalView.presenter;
        String str = ((ActionButton.i) bVar).a;
        slv0Var.H.a(str);
        fnx0 n = ((k) slv0Var.F).n();
        if (n == null || (mi31Var = n.a) == null) {
            return;
        }
        pex0 e = ru.yandex.taxi.tariffs.model.b.e(mi31Var.a, str);
        mi31 a = e != null ? mi31.a(mi31Var, e, null, 30) : null;
        if (a != null && !a.equals(mi31Var)) {
            slv0Var.G.a(new gnx0(new fnx0(a, SelectionOrigin.REDIRECT), true));
        }
        ((rlv0) slv0Var.Dg()).dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupButton$onAcceptActionSelected(slv0 slv0Var) {
        hhs0 hhs0Var = slv0Var.B;
        ((mx70) hhs0Var.b).a("order", slv0Var.A.a);
        slv0Var.x.invoke();
        ((rlv0) slv0Var.Dg()).dismiss();
    }

    private final void setupSlider(bmv0 sliderButton) {
        final SliderButtonView createSlider = createSlider(sliderButton);
        this.sliderView = createSlider;
        createSlider.setSlideFinishedListener(new n2v0(1, this));
        getBinding().i.addView(createSlider);
        BottomEdgeButtonLayout bottomEdgeButtonLayout = getBinding().i;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        if (!bottomEdgeButtonLayout.isLaidOut() || bottomEdgeButtonLayout.isLayoutRequested()) {
            bottomEdgeButtonLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.yandex.taxi.summary.solid.promotion_modal_windows.ui.mvp.SummaryPromotionModalWindowsModalView$setupSlider$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    int paddingTop = view.getPaddingTop();
                    ViewGroup.LayoutParams layoutParams = SliderButtonView.this.getLayoutParams();
                    if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    int i = paddingTop + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
                    int width = view.getWidth();
                    int height = view.getHeight() - view.getPaddingBottom();
                    ViewGroup.LayoutParams layoutParams2 = SliderButtonView.this.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? layoutParams2 : null);
                    List singletonList = Collections.singletonList(new Rect(0, i, width, height - (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0)));
                    WeakHashMap weakHashMap2 = androidx.core.view.b.a;
                    sp31.c(view, singletonList);
                }
            });
            return;
        }
        int paddingTop = bottomEdgeButtonLayout.getPaddingTop();
        ViewGroup.LayoutParams layoutParams = createSlider.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i = paddingTop + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        int width = bottomEdgeButtonLayout.getWidth();
        int height = bottomEdgeButtonLayout.getHeight() - bottomEdgeButtonLayout.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams2 = createSlider.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? layoutParams2 : null);
        sp31.c(bottomEdgeButtonLayout, Collections.singletonList(new Rect(0, i, width, height - (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupSlider$lambda$0(SummaryPromotionModalWindowsModalView summaryPromotionModalWindowsModalView, int i, long j) {
        slv0 slv0Var = summaryPromotionModalWindowsModalView.presenter;
        hhs0 hhs0Var = slv0Var.B;
        String str = slv0Var.A.a;
        mx70 mx70Var = (mx70) hhs0Var.b;
        mx70Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("type", "REORDER");
        hashMap.put("slider", "order");
        if (str != null) {
            hashMap.put("modal_id", str);
        }
        mx70Var.a.a("OrderInfoCard.Slided", hashMap, 1, new HashMap());
        slv0Var.x.invoke();
        ((rlv0) slv0Var.Dg()).dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int toComponentAlignment(TextAlign textAlign) {
        int i = plv0.a[textAlign.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        w511.b();
        return 0;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public ylv0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(wrh0.summary_promotion_modal_windows_view, parent, false);
        int i = wfh0.bullets_container;
        GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, inflate);
        if (goLinearLayout != null) {
            i = wfh0.flex_container;
            GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, inflate);
            if (goFrameLayout != null) {
                i = wfh0.footer;
                ListTextComponent listTextComponent = (ListTextComponent) cma1.O(i, inflate);
                if (listTextComponent != null) {
                    i = wfh0.header;
                    ListHeaderComponent listHeaderComponent = (ListHeaderComponent) cma1.O(i, inflate);
                    if (listHeaderComponent != null) {
                        i = wfh0.icon;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
                        if (appCompatImageView != null) {
                            i = wfh0.image;
                            RoundedCornersImageView roundedCornersImageView = (RoundedCornersImageView) cma1.O(i, inflate);
                            if (roundedCornersImageView != null) {
                                i = wfh0.message;
                                ListTextComponent listTextComponent2 = (ListTextComponent) cma1.O(i, inflate);
                                if (listTextComponent2 != null) {
                                    i = wfh0.widgets_container;
                                    BottomEdgeButtonLayout bottomEdgeButtonLayout = (BottomEdgeButtonLayout) cma1.O(i, inflate);
                                    if (bottomEdgeButtonLayout != null) {
                                        return new ylv0((LinearLayout) inflate, goLinearLayout, goFrameLayout, listTextComponent, listHeaderComponent, appCompatImageView, roundedCornersImageView, listTextComponent2, bottomEdgeButtonLayout);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    public void changeBackPressedState(boolean isBackPressedEnabled) {
    }

    @Override // defpackage.rkr
    public boolean handleAction(kr action) {
        return false;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onAppearAnimationComplete() {
        super.onAppearAnimationComplete();
        slv0 slv0Var = this.presenter;
        if (slv0Var.E.a(((k) slv0Var.F).m())) {
            ((rlv0) slv0Var.Dg()).Fc();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        if (r4 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0064, code lost:
    
        if (r4 == null) goto L15;
     */
    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttachedToWindow() {
        String lowerCase;
        ActionButton.ButtonActionType b;
        String name;
        is60 is60Var;
        b bVar;
        ActionButton.ButtonActionType b2;
        String name2;
        super.onAttachedToWindow();
        slv0 slv0Var = this.presenter;
        slv0Var.Bg(new olv0(this));
        hhs0 hhs0Var = slv0Var.B;
        flv0 flv0Var = slv0Var.A;
        String str = flv0Var.a;
        cmv0 cmv0Var = flv0Var.g;
        if (!(cmv0Var instanceof zlv0)) {
            if (cmv0Var instanceof bmv0) {
                b bVar2 = ((bmv0) cmv0Var).a.a;
                lowerCase = (bVar2 == null || (b = bVar2.b()) == null || (name = b.name()) == null) ? null : name.toLowerCase(Locale.ROOT);
            } else if (!cmv0Var.equals(amv0.a)) {
                w511.b();
                return;
            }
            lowerCase = "";
            pex0 m = ((k) ((wiq0) hhs0Var.c)).m();
            String a = (m == null || (is60Var = m.J0.b) == null) ? null : is60Var.a();
            String str2 = a != null ? a : "";
            mx70 mx70Var = (mx70) hhs0Var.b;
            mx70Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("type", "REORDER");
            hashMap.put("offer_id", str2);
            hashMap.put("widget", lowerCase);
            if (str != null) {
                hashMap.put("modal_id", str);
            }
            mx70Var.a.a("OrderInfoCard.Shown", hashMap, 1, new HashMap());
            kotlinx.coroutines.flow.m0 c = slv0Var.D.c(flv0Var);
            slv0Var.C.getClass();
            tje.N(slv0Var.Jg(), null, null, new SummaryPromotionModalWindowsPresenter$attachView$$inlined$collectIn$1(e.F(c, uyj.a), null, slv0Var), 3);
            this.flexHeaderDelegate.f(getBinding().c, this);
            post(new m8t0(29, this));
            return;
        }
        ActionButton actionButton = (ActionButton) a.b0(((zlv0) cmv0Var).a);
        lowerCase = (actionButton == null || (bVar = actionButton.e) == null || (b2 = bVar.b()) == null || (name2 = b2.name()) == null) ? null : name2.toLowerCase(Locale.ROOT);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        this.presenter.Kg();
        super.onBackPressed();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.presenter.Cg();
        this.flexHeaderDelegate.onDetach();
        super.onDetachedFromWindow();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        int i;
        LinearLayout linearLayout = getBinding().a;
        Rect rect = xw31.a;
        int[] iArr = new int[2];
        linearLayout.getLocationInWindow(iArr);
        Rect rect2 = new Rect();
        Context context = linearLayout.getContext();
        if (context instanceof Activity) {
            ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
            i = rect2.top;
        } else {
            i = 0;
        }
        int i2 = iArr[0];
        if (new Rect(i2, iArr[1] - i, linearLayout.getMeasuredWidth() + i2, (linearLayout.getMeasuredHeight() + iArr[1]) - i).contains((int) event.getX(), (int) event.getY())) {
            return true;
        }
        return super.onTouchEvent(event);
    }
}
