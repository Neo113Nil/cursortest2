package ru.yandex.taxi.order.overlay;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.widget.FrameLayout;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import com.yandex.go.taxi.order.bubble.a;
import com.yandex.go.taxi.order.bubble.e;
import com.yandex.go.taxi.order.bubble.f;
import com.yandex.go.taxi.order.bubble.g;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.ScreenRect;
import defpackage.ah00;
import defpackage.bvf0;
import defpackage.cds0;
import defpackage.f4c0;
import defpackage.fi70;
import defpackage.g18;
import defpackage.gh00;
import defpackage.gr7;
import defpackage.h3y;
import defpackage.if2;
import defpackage.ii70;
import defpackage.jf2;
import defpackage.ji70;
import defpackage.jx0;
import defpackage.kf2;
import defpackage.l390;
import defpackage.lf2;
import defpackage.li70;
import defpackage.lp00;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.p080;
import defpackage.pav;
import defpackage.re2;
import defpackage.sf30;
import defpackage.te2;
import defpackage.tl6;
import defpackage.tzy0;
import defpackage.ub60;
import defpackage.uh60;
import defpackage.vx0;
import defpackage.vxu0;
import defpackage.w511;
import defpackage.xm00;
import defpackage.xxu0;
import defpackage.yxu0;
import defpackage.zxu0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.map_common.map.intersection.Participant;
import ru.yandex.taxi.map_common.map.process.MapComputationsProcessor$ExecuteOn;
import ru.yandex.taxi.map_common.map.process.b;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\\B]\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010\"\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u001c¢\u0006\u0004\b$\u0010\u001eJ\u001d\u0010$\u001a\u00020\u001c2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0016¢\u0006\u0004\b$\u0010(J\u001d\u0010)\u001a\u00020\u001c2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002¢\u0006\u0004\b)\u0010(J\u001d\u0010*\u001a\u00020\u001c2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002¢\u0006\u0004\b*\u0010(J\u001e\u0010+\u001a\u00020\u001c2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0082@¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u0018\u00102\u001a\u00020\u001c2\u0006\u0010.\u001a\u000201H\u0082@¢\u0006\u0004\b2\u00103J\u0018\u00105\u001a\u00020\u001c2\u0006\u0010.\u001a\u000204H\u0082@¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u0002072\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u001cH\u0002¢\u0006\u0004\b:\u0010\u001eJ\u000f\u0010;\u001a\u00020\u001cH\u0002¢\u0006\u0004\b;\u0010\u001eJ\u000f\u0010<\u001a\u00020\u001cH\u0002¢\u0006\u0004\b<\u0010\u001eJ\u000f\u0010=\u001a\u00020\u001cH\u0002¢\u0006\u0004\b=\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010>R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010?R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010@R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010AR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010BR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010CR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010DR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010ER\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010FR\u0016\u0010H\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020K0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR \u0010S\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020R0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR \u0010V\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020U0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010TR \u0010X\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020W0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010TR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020W0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[¨\u0006]"}, d2 = {"Lru/yandex/taxi/order/overlay/OrderBubblesOverlay;", "Landroid/widget/FrameLayout;", "Lii70;", "Ll390;", "Lnwy0;", "Landroid/content/Context;", "context", "Lah00;", "mapController", "Lxm00;", "objectCollection", "Lh3y;", "Lcom/yandex/go/taxi/order/overlay/g;", "presenter", "Lp080;", "mapOverlayHolder", "Lyxu0;", "styledBubbleFactory", "Ljf2;", "animatedBubbleFactory", "Lcom/yandex/go/taxi/order/bubble/interactor/b;", "orderBubblePinIntersectionInteractor", "Lcom/yandex/go/taxi/order/bubble/interactor/a;", "orderAnimatedBubbleIntersectionInteractor", "Lru/yandex/taxi/map_common/map/process/b;", "mapComputationsProcessor", "<init>", "(Landroid/content/Context;Lah00;Lxm00;Lh3y;Lp080;Lyxu0;Ljf2;Lcom/yandex/go/taxi/order/bubble/interactor/b;Lcom/yandex/go/taxi/order/bubble/interactor/a;Lru/yandex/taxi/map_common/map/process/b;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "updateBubbles", "", "Ltl6;", "bubbles", "(Ljava/util/List;)V", "removeOutdatedPlacemarks", "removeOutdatedAnimationPlacemarks", "appendFreshPlacemarks", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcds0;", "bubble", "attachSimpleBubble", "(Lcds0;)V", "Lvxu0;", "attachStyledBubble", "(Lvxu0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lre2;", "attachAnimatedBubble", "(Lre2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isExpandedByDefault", "(Lcds0;)Z", "ensureBubblesPosition", "checkStyledBubblesIntersections", "checkAnimatedBubblesIntersections", "removeAnimatedBubbles", "Lah00;", "Lxm00;", "Lh3y;", "Lp080;", "Lyxu0;", "Ljf2;", "Lcom/yandex/go/taxi/order/bubble/interactor/b;", "Lcom/yandex/go/taxi/order/bubble/interactor/a;", "Lru/yandex/taxi/map_common/map/process/b;", "Lg18;", "mapFocusChangedCancellable", "Lg18;", "Ltzy0;", "", "throttle", "Ltzy0;", "Lgr7;", "cameraListener", "Lgr7;", "", "Lcom/yandex/go/taxi/order/bubble/f;", "simpleBubbleViewHolders", "Ljava/util/Map;", "Lcom/yandex/go/taxi/order/bubble/g;", "styledBubbleViewHolders", "Lcom/yandex/go/taxi/order/bubble/a;", "animatedBubbleViewHolders", "", "oldAnimatedBubbles", "Ljava/util/List;", "ki70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderBubblesOverlay extends FrameLayout implements ii70, l390, nwy0 {
    public static final int $stable = 8;
    private final jf2 animatedBubbleFactory;
    private final Map<re2, a> animatedBubbleViewHolders;
    private final gr7 cameraListener;
    private final b mapComputationsProcessor;
    private final ah00 mapController;
    private g18 mapFocusChangedCancellable;
    private final p080 mapOverlayHolder;
    private final xm00 objectCollection;
    private final List<a> oldAnimatedBubbles;
    private final com.yandex.go.taxi.order.bubble.interactor.a orderAnimatedBubbleIntersectionInteractor;
    private final com.yandex.go.taxi.order.bubble.interactor.b orderBubblePinIntersectionInteractor;
    private final h3y presenter;
    private final Map<cds0, f> simpleBubbleViewHolders;
    private final yxu0 styledBubbleFactory;
    private final Map<vxu0, g> styledBubbleViewHolders;
    private final tzy0 throttle;

    public OrderBubblesOverlay(Context context, ah00 ah00Var, xm00 xm00Var, h3y h3yVar, p080 p080Var, yxu0 yxu0Var, jf2 jf2Var, com.yandex.go.taxi.order.bubble.interactor.b bVar, com.yandex.go.taxi.order.bubble.interactor.a aVar, b bVar2) {
        super(context);
        this.mapController = ah00Var;
        this.objectCollection = xm00Var;
        this.presenter = h3yVar;
        this.mapOverlayHolder = p080Var;
        this.styledBubbleFactory = yxu0Var;
        this.animatedBubbleFactory = jf2Var;
        this.orderBubblePinIntersectionInteractor = bVar;
        this.orderAnimatedBubbleIntersectionInteractor = aVar;
        this.mapComputationsProcessor = bVar2;
        this.mapFocusChangedCancellable = g18.u1;
        this.throttle = new tzy0(300, new ub60(7, this));
        this.cameraListener = new ji70(0, this);
        this.simpleBubbleViewHolders = new LinkedHashMap();
        this.styledBubbleViewHolders = new LinkedHashMap();
        this.animatedBubbleViewHolders = new LinkedHashMap();
        this.oldAnimatedBubbles = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object appendFreshPlacemarks(List<? extends tl6> list, Continuation<? super zy11> continuation) {
        OrderBubblesOverlay$appendFreshPlacemarks$1 orderBubblesOverlay$appendFreshPlacemarks$1;
        int i;
        if (continuation instanceof OrderBubblesOverlay$appendFreshPlacemarks$1) {
            orderBubblesOverlay$appendFreshPlacemarks$1 = (OrderBubblesOverlay$appendFreshPlacemarks$1) continuation;
            int i2 = orderBubblesOverlay$appendFreshPlacemarks$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderBubblesOverlay$appendFreshPlacemarks$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderBubblesOverlay$appendFreshPlacemarks$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderBubblesOverlay$appendFreshPlacemarks$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.taxi.order.bubble.interactor.a aVar = this.orderAnimatedBubbleIntersectionInteractor;
                    lp00 lp00Var = aVar.a;
                    Participant participant = Participant.COMPANIONS_IN_SEARCH_COLLECTION;
                    ru.yandex.taxi.map_common.map.intersection.a aVar2 = (ru.yandex.taxi.map_common.map.intersection.a) lp00Var;
                    aVar2.l(participant, participant);
                    aVar2.j(participant);
                    aVar.d = false;
                    OrderBubblesOverlay$appendFreshPlacemarks$2 orderBubblesOverlay$appendFreshPlacemarks$2 = new OrderBubblesOverlay$appendFreshPlacemarks$2(this, list, null);
                    orderBubblesOverlay$appendFreshPlacemarks$1.L$0 = null;
                    orderBubblesOverlay$appendFreshPlacemarks$1.label = 1;
                    if (bvf0.n(orderBubblesOverlay$appendFreshPlacemarks$2, orderBubblesOverlay$appendFreshPlacemarks$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                checkAnimatedBubblesIntersections();
                return zy11.a;
            }
        }
        orderBubblesOverlay$appendFreshPlacemarks$1 = new OrderBubblesOverlay$appendFreshPlacemarks$1(this, continuation);
        Object obj2 = orderBubblesOverlay$appendFreshPlacemarks$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderBubblesOverlay$appendFreshPlacemarks$1.label;
        if (i != 0) {
        }
        checkAnimatedBubblesIntersections();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object attachAnimatedBubble(re2 re2Var, Continuation<? super zy11> continuation) {
        jf2 jf2Var = this.animatedBubbleFactory;
        Context context = getContext();
        float zIndex = this.mapOverlayHolder.b.Lg().getZIndex() + 1.0f + 2.0f;
        lf2 lf2Var = ((kf2) jf2Var).a;
        a aVar = new a(context, re2Var, zIndex, (pav) lf2Var.b.get(), (ru.yandex.taxi.map_common.map.utils.a) lf2Var.c.get(), (te2) lf2Var.a.a);
        this.animatedBubbleViewHolders.put(re2Var, aVar);
        return aVar.c(this.objectCollection, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attachSimpleBubble(cds0 bubble) {
        f fVar = new f(getContext(), bubble, this.mapOverlayHolder.b.Lg().getZIndex() + 1.0f + 2.0f);
        this.simpleBubbleViewHolders.put(bubble, fVar);
        fVar.b(this.objectCollection, isExpandedByDefault(bubble));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object attachStyledBubble(vxu0 vxu0Var, Continuation<? super zy11> continuation) {
        yxu0 yxu0Var = this.styledBubbleFactory;
        float zIndex = this.mapOverlayHolder.b.Lg().getZIndex() + 1.0f + 2.0f;
        uh60 uh60Var = new uh60(16, this);
        vx0 vx0Var = ((zxu0) yxu0Var).a;
        g gVar = new g(vxu0Var, zIndex, uh60Var, (pav) vx0Var.a.get(), (com.yandex.go.pin.api.widget.b) vx0Var.b.get(), (ru.yandex.taxi.map_common.map.utils.a) vx0Var.c.get());
        this.styledBubbleViewHolders.put(vxu0Var, gVar);
        return gVar.d(this.objectCollection, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 attachStyledBubble$lambda$0(OrderBubblesOverlay orderBubblesOverlay) {
        Collection<g> values = orderBubblesOverlay.styledBubbleViewHolders.values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                if (!((g) it.next()).F) {
                    break;
                }
            }
        }
        orderBubblesOverlay.checkStyledBubblesIntersections();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cameraListener$lambda$0(OrderBubblesOverlay orderBubblesOverlay) {
        orderBubblesOverlay.throttle.a(Void.TYPE);
    }

    private final void checkAnimatedBubblesIntersections() {
        this.orderAnimatedBubbleIntersectionInteractor.a(this.animatedBubbleViewHolders, new sf30(23, this));
    }

    private final void checkStyledBubblesIntersections() {
        this.orderBubblePinIntersectionInteractor.a(this.styledBubbleViewHolders);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureBubblesPosition() {
        Rect a;
        Rect a2;
        ArrayList arrayList = new ArrayList();
        for (f fVar : this.simpleBubbleViewHolders.values()) {
            ah00 ah00Var = this.mapController;
            int i = e.a[fVar.y.ordinal()];
            if (i == 1) {
                a2 = fi70.a(ah00Var, (f4c0) fVar.w.getValue());
            } else {
                if (i != 2) {
                    w511.b();
                    return;
                }
                a2 = fi70.a(ah00Var, (f4c0) fVar.x.getValue());
            }
            arrayList.add(a2);
        }
        for (g gVar : this.styledBubbleViewHolders.values()) {
            ah00 ah00Var2 = this.mapController;
            int i2 = xxu0.a[gVar.E.ordinal()];
            if (i2 == 1) {
                a = fi70.a(ah00Var2, gVar.f());
            } else {
                if (i2 != 2) {
                    w511.b();
                    return;
                }
                a = fi70.a(ah00Var2, (f4c0) gVar.A.getValue());
            }
            arrayList.add(a);
        }
        Rect b = ((gh00) this.mapController).a.b();
        float f = b.left;
        float f2 = b.top;
        float f3 = b.right;
        float f4 = b.bottom;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Rect rect = (Rect) it.next();
            f = Math.min(f, rect.left);
            f2 = Math.min(f2, rect.top);
            f3 = Math.max(f3, rect.right);
            f4 = Math.max(f4, rect.bottom);
        }
        ((gh00) this.mapController).y(this, new ScreenRect(new ScreenPoint(f, f2), new ScreenPoint(f3, f4)));
    }

    private final boolean isExpandedByDefault(cds0 bubble) {
        return li70.a[bubble.b.ordinal()] == 1 || this.simpleBubbleViewHolders.size() < 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeAnimatedBubbles() {
        for (a aVar : this.oldAnimatedBubbles) {
            if (aVar.y.j == 0.0f) {
                aVar.d();
            } else {
                ValueAnimator valueAnimator = aVar.I;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat(CaretView.ALPHA_PROPERTY, 1.0f, 0.0f)).setDuration(500L);
                aVar.I = duration;
                if (duration != null) {
                    duration.setInterpolator(aVar.B);
                }
                ValueAnimator valueAnimator2 = aVar.I;
                if (valueAnimator2 != null) {
                    valueAnimator2.addUpdateListener(new if2(aVar, 0));
                }
                ValueAnimator valueAnimator3 = aVar.I;
                if (valueAnimator3 != null) {
                    valueAnimator3.start();
                }
            }
        }
    }

    private final void removeOutdatedAnimationPlacemarks(List<? extends tl6> bubbles) {
        this.oldAnimatedBubbles.clear();
        Iterator<Map.Entry<re2, a>> it = this.animatedBubbleViewHolders.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<re2, a> next = it.next();
            if (!bubbles.contains(next.getKey())) {
                this.oldAnimatedBubbles.add(next.getValue());
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeOutdatedPlacemarks(List<? extends tl6> bubbles) {
        Iterator<Map.Entry<cds0, f>> it = this.simpleBubbleViewHolders.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<cds0, f> next = it.next();
            if (!bubbles.contains(next.getKey())) {
                f value = next.getValue();
                ((f4c0) value.w.getValue()).d();
                ((f4c0) value.x.getValue()).d();
                it.remove();
            }
        }
        Iterator<Map.Entry<vxu0, g>> it2 = this.styledBubbleViewHolders.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<vxu0, g> next2 = it2.next();
            if (!bubbles.contains(next2.getKey())) {
                g value2 = next2.getValue();
                value2.C.b();
                value2.f().d();
                ((f4c0) value2.A.getValue()).d();
                it2.remove();
            }
        }
        if (this.animatedBubbleViewHolders.isEmpty()) {
            return;
        }
        removeOutdatedAnimationPlacemarks(bubbles);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 throttle$lambda$0(OrderBubblesOverlay orderBubblesOverlay, Object obj) {
        orderBubblesOverlay.checkStyledBubblesIntersections();
        return zy11.a;
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        Iterator<Map.Entry<cds0, f>> it = this.simpleBubbleViewHolders.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().applyTheme(themeType);
        }
        Iterator<Map.Entry<vxu0, g>> it2 = this.styledBubbleViewHolders.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().h();
        }
        Iterator<Map.Entry<re2, a>> it3 = this.animatedBubbleViewHolders.entrySet().iterator();
        while (it3.hasNext()) {
            it3.next().getValue().applyTheme(themeType);
        }
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((com.yandex.go.taxi.order.overlay.g) this.presenter.get()).Bg(this);
        ah00 ah00Var = this.mapController;
        this.mapFocusChangedCancellable = ((gh00) ah00Var).a.d.h(new jx0(1, this));
        ((gh00) this.mapController).e(this.cameraListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((com.yandex.go.taxi.order.overlay.g) this.presenter.get()).Cg();
        this.mapFocusChangedCancellable.cancel();
        ((gh00) this.mapController).u(this.cameraListener);
        lp00 lp00Var = this.orderBubblePinIntersectionInteractor.a;
        Participant participant = Participant.ORDER_STYLED_BUBBLES_COLLECTION;
        ru.yandex.taxi.map_common.map.intersection.a aVar = (ru.yandex.taxi.map_common.map.intersection.a) lp00Var;
        aVar.l(participant, Participant.SOURCE_POINT_PIN);
        aVar.l(participant, Participant.DESTINATION_POINT_PIN);
        aVar.l(participant, Participant.CHECK_IN_POINT_PIN);
        aVar.l(participant, Participant.CAR_ICON);
        aVar.j(participant);
    }

    @Override // defpackage.ii70
    public void updateBubbles(List<? extends tl6> bubbles) {
        b bVar = this.mapComputationsProcessor;
        ru.yandex.taxi.map_common.map.process.a.a(MapComputationsProcessor$ExecuteOn.MAIN, bVar.b, bVar.a, bVar.c, new OrderBubblesOverlay$updateBubbles$1(this, bubbles, null));
    }

    public final void updateBubbles() {
        ((com.yandex.go.taxi.order.overlay.g) this.presenter.get()).Ng();
    }
}
