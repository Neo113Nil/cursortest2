package ru.yandex.taxi.plaque;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.transition.Transition;
import defpackage.arc0;
import defpackage.b700;
import defpackage.brc0;
import defpackage.bvf0;
import defpackage.drc0;
import defpackage.ey31;
import defpackage.fsc0;
import defpackage.gic0;
import defpackage.hic0;
import defpackage.hjc0;
import defpackage.i3y;
import defpackage.ijc0;
import defpackage.ioc0;
import defpackage.jl40;
import defpackage.kp50;
import defpackage.l8x;
import defpackage.lb7;
import defpackage.lic0;
import defpackage.ml0;
import defpackage.nn4;
import defpackage.nwy0;
import defpackage.p22;
import defpackage.poc0;
import defpackage.pse;
import defpackage.pzt0;
import defpackage.q0d0;
import defpackage.qoc0;
import defpackage.rhh;
import defpackage.s49;
import defpackage.sdc;
import defpackage.t9b0;
import defpackage.tje;
import defpackage.tse;
import defpackage.w511;
import defpackage.wfz;
import defpackage.wwx0;
import defpackage.xw31;
import defpackage.zqc0;
import defpackage.zy11;
import defpackage.zzh0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u001f\u0010\u001eJ/\u0010%\u001a\u00020\u00152\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020 H\u0014¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020'2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J)\u00102\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u00112\u0006\u00100\u001a\u00020/2\b\u00101\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b2\u00103J)\u00105\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u00112\u0006\u00100\u001a\u0002042\b\u00101\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b5\u00106J)\u0010:\u001a\u00020\u00152\b\u00108\u001a\u0004\u0018\u0001072\u0006\u00109\u001a\u0002072\u0006\u0010.\u001a\u00020\u0011H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020'2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b<\u0010-J\u0017\u0010=\u001a\u00020'2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b?\u0010@J!\u0010B\u001a\u00020A2\b\u00108\u001a\u0004\u0018\u0001072\u0006\u00109\u001a\u000207H\u0002¢\u0006\u0004\bB\u0010CJ\u0011\u0010D\u001a\u0004\u0018\u000107H\u0002¢\u0006\u0004\bD\u0010EJ!\u0010F\u001a\u00020\u00152\b\u00108\u001a\u0004\u0018\u0001072\u0006\u00109\u001a\u000207H\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010I\u001a\u00020HH\u0002¢\u0006\u0004\bI\u0010JR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010KR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010LR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010MR\u0014\u0010N\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010W\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Z\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010\\\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010^R\u0014\u0010_\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010b\u001a\u00020a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010d\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010`R\u0016\u0010e\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010g\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010fR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00180h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u001b\u0010p\u001a\u00020k8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o¨\u0006q"}, d2 = {"Lru/yandex/taxi/plaque/PlaqueView;", "Landroid/widget/FrameLayout;", "Lnwy0;", "Landroid/content/Context;", "uiContext", "Lhic0;", "adapterFactory", "Ley31;", "visualSizeListener", "Lhjc0;", "plaqueCallback", "Llic0;", "animator", "<init>", "(Landroid/content/Context;Lhic0;Ley31;Lhjc0;Llic0;)V", "Lqoc0;", "model", "", "animDuration", "", "payload", "Lzy11;", "show", "(Lqoc0;JLjava/lang/Object;)V", "Ldrc0;", "listener", "addPlaqueStateListener", "(Ldrc0;)V", "removePlaqueStateListener", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "", "allowTraverse", "()Z", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "duration", "Lpoc0;", "newModel", "newPayload", "startToTabletAnimation", "(JLpoc0;Ljava/lang/Object;)V", "Lioc0;", "startToMicroWidgetsAnimation", "(JLioc0;Ljava/lang/Object;)V", "Lbrc0;", "oldState", "newState", "beginAnimation", "(Lbrc0;Lbrc0;J)V", "handleTouch", "canBeSwiped", "(Lqoc0;)Z", "startAutoCloseJobIfNeeded", "(Lqoc0;)V", "Landroidx/transition/Transition$TransitionListener;", "createTransitionListener", "(Lbrc0;Lbrc0;)Landroidx/transition/Transition$TransitionListener;", "getCurrentState", "()Lbrc0;", "changeState", "(Lbrc0;Lbrc0;)V", "Landroid/widget/LinearLayout;", "createWidgetsContainer", "()Landroid/widget/LinearLayout;", "Ley31;", "Lhjc0;", "Llic0;", "widgetsContainer", "Landroid/widget/LinearLayout;", "Lru/yandex/taxi/plaque/NotificationView;", "notificationView", "Lru/yandex/taxi/plaque/NotificationView;", "Lgic0;", "adapter", "Lgic0;", "Ltse;", "mainScope", "Ltse;", "Ll8x;", "autoCloseJob", "Ll8x;", "plaqueModel", "Lqoc0;", "Ljava/lang/Object;", "touchSlop", CA20Status.STATUS_USER_I, "", "initialTouchY", "F", "minimumSwipeHeight", "swipeActionInProgress", "Z", "actionCanBeHandled", "", "plaqueStateChangeListeners", "Ljava/util/List;", "Landroid/view/ViewGroup;", "sceneRoot$delegate", "Li3y;", "getSceneRoot", "()Landroid/view/ViewGroup;", "sceneRoot", "plaque_sdk"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlaqueView extends FrameLayout implements nwy0 {
    private boolean actionCanBeHandled;
    private final gic0 adapter;
    private final lic0 animator;
    private l8x autoCloseJob;
    private float initialTouchY;
    private tse mainScope;
    private final int minimumSwipeHeight;
    private final NotificationView notificationView;
    private Object payload;
    private final hjc0 plaqueCallback;
    private qoc0 plaqueModel;
    private final List<drc0> plaqueStateChangeListeners;

    /* renamed from: sceneRoot$delegate, reason: from kotlin metadata */
    private final i3y sceneRoot;
    private boolean swipeActionInProgress;
    private final int touchSlop;
    private final ey31 visualSizeListener;
    private final LinearLayout widgetsContainer;

    public PlaqueView(Context context, hic0 hic0Var, ey31 ey31Var, hjc0 hjc0Var, lic0 lic0Var) {
        super(context);
        this.visualSizeListener = ey31Var;
        this.plaqueCallback = hjc0Var;
        this.animator = lic0Var;
        LinearLayout createWidgetsContainer = createWidgetsContainer();
        this.widgetsContainer = createWidgetsContainer;
        NotificationView notificationView = new NotificationView(getContext());
        this.notificationView = notificationView;
        this.adapter = new gic0(createWidgetsContainer, hic0Var.a, hic0Var.b, hic0Var.c);
        int scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.touchSlop = scaledTouchSlop;
        this.minimumSwipeHeight = scaledTouchSlop * 3;
        this.actionCanBeHandled = true;
        this.plaqueStateChangeListeners = new ArrayList();
        this.sceneRoot = a.a(new t9b0(28, this));
        addView(createWidgetsContainer);
        addView(notificationView);
        setImportantForAccessibility(2);
        setClipChildren(false);
        setClipToPadding(false);
    }

    private final void beginAnimation(brc0 oldState, brc0 newState, long duration) {
        ((rhh) this.animator).a(getSceneRoot(), duration, createTransitionListener(oldState, newState));
    }

    private final boolean canBeSwiped(qoc0 model) {
        if (model instanceof poc0) {
            return false;
        }
        return !(model instanceof ioc0) || ((ioc0) model).f.b;
    }

    private final void changeState(final brc0 oldState, final brc0 newState) {
        Iterator<T> it = this.plaqueStateChangeListeners.iterator();
        while (it.hasNext()) {
            ((drc0) it.next()).getClass();
        }
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.yandex.taxi.plaque.PlaqueView$changeState$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                List list;
                view.removeOnLayoutChangeListener(this);
                list = PlaqueView.this.plaqueStateChangeListeners;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((drc0) it2.next()).a(oldState, newState);
                }
            }
        });
    }

    private final Transition.TransitionListener createTransitionListener(brc0 oldState, brc0 newState) {
        return new fsc0(this, oldState, newState);
    }

    private final LinearLayout createWidgetsContainer() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setTransitionName("plaque_container_transition_name");
        linearLayout.setImportantForAccessibility(2);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        return linearLayout;
    }

    private final brc0 getCurrentState() {
        Object obj = this.payload;
        qoc0 qoc0Var = this.plaqueModel;
        if (qoc0Var instanceof ioc0) {
            return new arc0(((ioc0) qoc0Var).b, obj);
        }
        if (qoc0Var instanceof poc0) {
            return new zqc0(((poc0) qoc0Var).b, obj);
        }
        if (qoc0Var == null) {
            return null;
        }
        w511.b();
        return null;
    }

    private final ViewGroup getSceneRoot() {
        return (ViewGroup) this.sceneRoot.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
    
        if (r2 != 3) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean handleTouch(MotionEvent event) {
        qoc0 qoc0Var = this.plaqueModel;
        if (qoc0Var == null || !canBeSwiped(qoc0Var)) {
            this.swipeActionInProgress = false;
            return false;
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    float y = this.initialTouchY - event.getY();
                    if (y > this.touchSlop) {
                        this.swipeActionInProgress = true;
                    }
                    if (y > this.minimumSwipeHeight) {
                        ((ijc0) this.plaqueCallback).a(qoc0Var, true, this.payload);
                        return true;
                    }
                }
            }
            this.swipeActionInProgress = false;
        } else {
            this.initialTouchY = event.getY();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewGroup sceneRoot_delegate$lambda$0(PlaqueView plaqueView) {
        ViewGroup d = xw31.d(plaqueView, new sdc(23, plaqueView));
        return d == null ? plaqueView : d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean sceneRoot_delegate$lambda$0$0(PlaqueView plaqueView, ViewGroup viewGroup) {
        return jl40.l(viewGroup.getTransitionName(), c.G(zzh0.plaque_scene_root_transition_name, plaqueView));
    }

    public static /* synthetic */ void show$default(PlaqueView plaqueView, qoc0 qoc0Var, long j, Object obj, int i, Object obj2) {
        if ((i & 2) != 0) {
            j = 300;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        plaqueView.show(qoc0Var, j, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 show$lambda$0(PlaqueView plaqueView, qoc0 qoc0Var, Object obj) {
        ijc0 ijc0Var = (ijc0) plaqueView.plaqueCallback;
        wwx0 wwx0Var = ijc0Var.b;
        String d = qoc0Var.d();
        q0d0 a = qoc0Var.a();
        if (a == null) {
            a = null;
        }
        wwx0Var.b(new p22(d, a));
        ru.yandex.taxi.plus.sdk.badge.widget.a aVar = ijc0Var.a;
        q0d0 a2 = qoc0Var.a();
        ru.yandex.taxi.plus.sdk.badge.widget.a.d(aVar, a2 != null ? a2 : null);
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void startAutoCloseJobIfNeeded(qoc0 model) {
        long j;
        PlaqueView plaqueView;
        if (model instanceof ioc0) {
            Long l = ((ioc0) model).f.a;
            if (l != null) {
                j = l.longValue();
                if (j > 0) {
                    return;
                }
                tse tseVar = this.mainScope;
                pzt0 pzt0Var = null;
                if (tseVar != null) {
                    plaqueView = this;
                    pzt0Var = tje.N(tseVar, null, null, new PlaqueView$startAutoCloseJobIfNeeded$1(j, plaqueView, model, null), 3);
                } else {
                    plaqueView = this;
                }
                plaqueView.autoCloseJob = pzt0Var;
                return;
            }
        } else if (!(model instanceof poc0)) {
            w511.b();
            return;
        }
        j = 0;
        if (j > 0) {
        }
    }

    private final void startToMicroWidgetsAnimation(long duration, ioc0 newModel, Object newPayload) {
        brc0 currentState = getCurrentState();
        arc0 arc0Var = new arc0(newModel.b, newPayload);
        if (currentState instanceof zqc0) {
            beginAnimation(currentState, arc0Var, duration);
            return;
        }
        if (currentState instanceof arc0) {
            beginAnimation(currentState, arc0Var, duration);
        } else if (currentState == null) {
            changeState(currentState, arc0Var);
        } else {
            w511.b();
        }
    }

    private final void startToTabletAnimation(long duration, poc0 newModel, Object newPayload) {
        brc0 currentState = getCurrentState();
        zqc0 zqc0Var = new zqc0(newModel.b, newPayload);
        if (currentState instanceof zqc0) {
            changeState(currentState, zqc0Var);
            return;
        }
        if (currentState instanceof arc0) {
            beginAnimation(currentState, zqc0Var, duration);
        } else if (currentState == null) {
            changeState(currentState, zqc0Var);
        } else {
            w511.b();
        }
    }

    public final void addPlaqueStateListener(drc0 listener) {
        this.plaqueStateChangeListeners.add(listener);
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public boolean getIsTrackingsRedesignEnabled() {
        return false;
    }

    @Override // defpackage.nwy0
    public /* bridge */ void applyTheme(ThemeType themeType) {
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        if (event.getActionMasked() == 0) {
            this.actionCanBeHandled = true;
        }
        if (this.actionCanBeHandled && !handleTouch(event)) {
            super.dispatchTouchEvent(event);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mainScope = bvf0.M(bvf0.b(), new pse("PlaqueView"));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        tse tseVar = this.mainScope;
        if (tseVar != null) {
            bvf0.j(tseVar, null);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        lb7 lb7Var = (lb7) this.visualSizeListener;
        ((nn4) lb7Var.b).a(h - ((s49) lb7Var.c).e);
    }

    public final void removePlaqueStateListener(drc0 listener) {
        this.plaqueStateChangeListeners.remove(listener);
    }

    public final void show(qoc0 model, long animDuration, Object payload) {
        if (animDuration != 0) {
            if (model instanceof poc0) {
                startToTabletAnimation(animDuration, (poc0) model, payload);
            } else {
                if (!(model instanceof ioc0)) {
                    w511.b();
                    return;
                }
                startToMicroWidgetsAnimation(animDuration, (ioc0) model, payload);
            }
        }
        gic0 gic0Var = this.adapter;
        List e = model.e();
        List list = gic0Var.B;
        gic0Var.B = e;
        gic0Var.f(kp50.f(new ml0(list, e, 2), true));
        this.notificationView.update(model);
        wfz.b(this.widgetsContainer, model.c());
        wfz.a(this.widgetsContainer, model.b(), null);
        c.z(new b700(26, this, model, payload), this.widgetsContainer);
        qoc0 qoc0Var = this.plaqueModel;
        if (!jl40.l(qoc0Var != null ? qoc0Var.d() : null, model.d())) {
            l8x l8xVar = this.autoCloseJob;
            if (l8xVar != null) {
                l8xVar.a(null);
            }
            startAutoCloseJobIfNeeded(model);
        }
        this.plaqueModel = model;
        this.payload = payload;
    }

    public final void show(qoc0 qoc0Var, long j) {
        show$default(this, qoc0Var, j, null, 4, null);
    }

    public final void show(qoc0 qoc0Var) {
        show$default(this, qoc0Var, 0L, null, 6, null);
    }
}
