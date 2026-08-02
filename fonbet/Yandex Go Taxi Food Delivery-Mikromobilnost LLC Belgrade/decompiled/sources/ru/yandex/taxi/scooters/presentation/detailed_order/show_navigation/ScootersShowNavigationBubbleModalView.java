package ru.yandex.taxi.scooters.presentation.detailed_order.show_navigation;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.ah00;
import defpackage.awo0;
import defpackage.e230;
import defpackage.es00;
import defpackage.fwo0;
import defpackage.g7h;
import defpackage.gh00;
import defpackage.mqg0;
import defpackage.sls;
import defpackage.tje;
import defpackage.v130;
import defpackage.x770;
import defpackage.xw31;
import defpackage.zzs;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.map_object.ShowNavigationButton;
import ru.yandex.taxi.common_models.net.map_object.k0;
import ru.yandex.taxi.scooters.presentation.detailed_order.show_navigation.ScootersShowNavigationBubbleModalView;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u00013B7\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u001a\u0010\u0017J\u000f\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$H\u0017¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010*R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010!\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/yandex/taxi/scooters/presentation/detailed_order/show_navigation/ScootersShowNavigationBubbleModalView;", "Lru/yandex/taxi/widget/ModalView;", "Landroid/content/Context;", "context", "Lawo0;", "scootersShowNavigationBubbleAnalytics", "Lkotlin/Function0;", "Lzy11;", "onNavigateRoute", "Lfwo0;", "scootersShowNavigationBubblePresenter", "<init>", "(Landroid/content/Context;Lawo0;Lsls;Lfwo0;)V", "Le230;", "insetsType", "()Le230;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Ljava/lang/Runnable;", "onAnimateShowStartAction", "onAnimateShowEndAction", "animateShow", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "startAction", "endAction", "animateDismiss", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "onBackPressedListener", "setOnBackPressedListener", "(Ljava/lang/Runnable;)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lawo0;", "Lsls;", "Lfwo0;", "Lru/yandex/taxi/scooters/presentation/detailed_order/show_navigation/ScootersShowNavigationBubbleView;", "bubble", "Lru/yandex/taxi/scooters/presentation/detailed_order/show_navigation/ScootersShowNavigationBubbleView;", "Ljava/lang/Runnable;", "Lg7h;", "defaultBubbleDecorator", "Lg7h;", "ru/yandex/taxi/scooters/presentation/detailed_order/show_navigation/a", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersShowNavigationBubbleModalView extends ModalView {
    public static final int $stable = 8;
    private final ScootersShowNavigationBubbleView bubble;
    private final g7h defaultBubbleDecorator;
    private Runnable onBackPressedListener;
    private final sls onNavigateRoute;
    private final awo0 scootersShowNavigationBubbleAnalytics;
    private final fwo0 scootersShowNavigationBubblePresenter;

    public ScootersShowNavigationBubbleModalView(Context context, awo0 awo0Var, sls slsVar, fwo0 fwo0Var) {
        super(context);
        this.scootersShowNavigationBubbleAnalytics = awo0Var;
        this.onNavigateRoute = slsVar;
        this.scootersShowNavigationBubblePresenter = fwo0Var;
        this.bubble = new ScootersShowNavigationBubbleView(context);
        g7h g7hVar = new g7h(context);
        g7hVar.F = new ColorDrawable(getContext().getColor(mqg0.transparent)).mutate();
        g7hVar.m();
        this.defaultBubbleDecorator = g7hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(ScootersShowNavigationBubbleModalView scootersShowNavigationBubbleModalView) {
        scootersShowNavigationBubbleModalView.scootersShowNavigationBubbleAnalytics.b(ScootersShowNavigationBubbleAnalytics$BubbleButton.YES);
        scootersShowNavigationBubbleModalView.scootersShowNavigationBubbleAnalytics.a(ScootersShowNavigationBubbleAnalytics$CloseReason.BUTTON);
        fwo0 fwo0Var = scootersShowNavigationBubbleModalView.scootersShowNavigationBubblePresenter;
        tje.N(fwo0Var.Jg(), null, null, new ScootersShowNavigationBubblePresenter$onNavigateClicked$1(fwo0Var, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$1(ScootersShowNavigationBubbleModalView scootersShowNavigationBubbleModalView) {
        scootersShowNavigationBubbleModalView.scootersShowNavigationBubbleAnalytics.b(ScootersShowNavigationBubbleAnalytics$BubbleButton.NO);
        scootersShowNavigationBubbleModalView.scootersShowNavigationBubbleAnalytics.a(ScootersShowNavigationBubbleAnalytics$CloseReason.BUTTON);
        Runnable runnable = scootersShowNavigationBubbleModalView.onBackPressedListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        startAction.run();
        endAction.run();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable onAnimateShowStartAction, Runnable onAnimateShowEndAction) {
        onAnimateShowStartAction.run();
        onAnimateShowEndAction.run();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContent() {
        return this.bubble;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new v130(3);
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object obj;
        Object obj2;
        super.onAttachedToWindow();
        awo0 awo0Var = this.scootersShowNavigationBubbleAnalytics;
        x770 x770Var = awo0Var.a;
        String str = awo0Var.b;
        String str2 = awo0Var.c;
        x770Var.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("scooter_parking", str);
        }
        if (str2 != null) {
            hashMap.put("order_id", str2);
        }
        final int i = 1;
        x770Var.a.a("ScootersBuildRouteBubble.Shown", hashMap, 1, new HashMap());
        this.bubble.setVisibility(4);
        addView(this.bubble, new FrameLayout.LayoutParams(-2, -2));
        fwo0 fwo0Var = this.scootersShowNavigationBubblePresenter;
        a aVar = new a(this);
        fwo0Var.Bg(aVar);
        k0 k0Var = fwo0Var.E;
        Iterator it = k0Var.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((ShowNavigationButton) obj).a == ShowNavigationButton.Type.CONFIRM) {
                    break;
                }
            }
        }
        ShowNavigationButton showNavigationButton = (ShowNavigationButton) obj;
        Iterator it2 = k0Var.b.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it2.next();
                if (((ShowNavigationButton) obj2).a == ShowNavigationButton.Type.REJECT) {
                    break;
                }
            }
        }
        ShowNavigationButton showNavigationButton2 = (ShowNavigationButton) obj2;
        if (showNavigationButton != null && showNavigationButton2 != null) {
            ah00 ah00Var = fwo0Var.y;
            zzs zzsVar = fwo0Var.D;
            es00 es00Var = ((gh00) ah00Var).e;
            es00Var.getClass();
            tje.N(fwo0Var.Jg(), null, null, new ScootersShowNavigationBubblePresenter$attachView$1(aVar, fwo0Var, es00Var.e(ru.yandex.taxi.map.utils.a.F(zzsVar)), showNavigationButton, showNavigationButton2, null), 3);
        }
        final int i2 = 0;
        this.bubble.getYes().setDebounceClickListener(new Runnable(this) { // from class: cwo0
            public final /* synthetic */ ScootersShowNavigationBubbleModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                ScootersShowNavigationBubbleModalView scootersShowNavigationBubbleModalView = this.b;
                switch (i3) {
                    case 0:
                        ScootersShowNavigationBubbleModalView.onAttachedToWindow$lambda$0(scootersShowNavigationBubbleModalView);
                        break;
                    default:
                        ScootersShowNavigationBubbleModalView.onAttachedToWindow$lambda$1(scootersShowNavigationBubbleModalView);
                        break;
                }
            }
        });
        this.bubble.getNo().setDebounceClickListener(new Runnable(this) { // from class: cwo0
            public final /* synthetic */ ScootersShowNavigationBubbleModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                ScootersShowNavigationBubbleModalView scootersShowNavigationBubbleModalView = this.b;
                switch (i3) {
                    case 0:
                        ScootersShowNavigationBubbleModalView.onAttachedToWindow$lambda$0(scootersShowNavigationBubbleModalView);
                        break;
                    default:
                        ScootersShowNavigationBubbleModalView.onAttachedToWindow$lambda$1(scootersShowNavigationBubbleModalView);
                        break;
                }
            }
        });
        this.bubble.getBubbleComponent().setDecorator(this.defaultBubbleDecorator);
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.scootersShowNavigationBubblePresenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.o(this, this.bubble, event)) {
            return true;
        }
        this.scootersShowNavigationBubbleAnalytics.a(ScootersShowNavigationBubbleAnalytics$CloseReason.MAP_MOVE);
        Runnable runnable = this.onBackPressedListener;
        if (runnable == null) {
            return false;
        }
        runnable.run();
        return false;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void setOnBackPressedListener(Runnable onBackPressedListener) {
        super.setOnBackPressedListener(onBackPressedListener);
        this.onBackPressedListener = onBackPressedListener;
    }
}
