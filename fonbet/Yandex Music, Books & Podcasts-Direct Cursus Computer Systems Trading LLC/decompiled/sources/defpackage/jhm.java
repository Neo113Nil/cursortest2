package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class jhm extends z5 {
    public final int[] A;
    public Function0 i;
    public phm j;
    public String k;
    public final View l;
    public final khm m;
    public final WindowManager n;
    public final WindowManager.LayoutParams o;
    public ohm p;
    public xof q;
    public final x6k r;
    public final x6k s;
    public aqe t;
    public final zx7 u;
    public final Rect v;
    public final a42 w;
    public lo0 x;
    public final x6k y;
    public boolean z;

    public jhm(Function0<Unit> function0, @NotNull phm phmVar, @NotNull String str, @NotNull View view, @NotNull jx7 jx7Var, @NotNull ohm ohmVar, @NotNull UUID uuid, @NotNull khm khmVar) {
        super(view.getContext(), null, 0, 6, null);
        this.i = function0;
        this.j = phmVar;
        this.k = str;
        this.l = view;
        this.m = khmVar;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.n = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        phm phmVar2 = this.j;
        boolean b = bi0.b(view);
        boolean z = phmVar2.b;
        int i = phmVar2.a;
        if (z && b) {
            i |= RemoteCameraConfig.Notification.ID;
        } else if (z && !b) {
            i &= -8193;
        }
        layoutParams.flags = i;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.o = layoutParams;
        this.p = ohmVar;
        this.q = xof.a;
        this.r = szf.g0(null);
        this.s = szf.g0(null);
        this.u = szf.U(new kgk(4, this));
        this.v = new Rect();
        int i2 = 2;
        this.w = new a42(new xh0(this, i2));
        setId(android.R.id.content);
        setTag(R.id.view_tree_lifecycle_owner, swf.E(view));
        setTag(R.id.view_tree_view_model_store_owner, zwf.D(view));
        setTag(R.id.view_tree_saved_state_registry_owner, ywf.y(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(jx7Var.n0((float) 8));
        setOutlineProvider(new c28(i2));
        this.y = szf.g0(yn5.a);
        this.A = new int[2];
    }

    private final Function2<hq5, Integer, Unit> getContent() {
        return (Function2) this.y.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wof getParentLayoutCoordinates() {
        return (wof) this.s.getValue();
    }

    private final aqe getVisibleDisplayBounds() {
        ((mhm) this.m).getClass();
        View view = this.l;
        Rect rect = this.v;
        view.getWindowVisibleDisplayFrame(rect);
        qs5 qs5Var = bi0.a;
        return new aqe(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final void setContent(Function2<? super hq5, ? super Integer, Unit> function2) {
        this.y.setValue(function2);
    }

    private final void setParentLayoutCoordinates(wof wofVar) {
        this.s.setValue(wofVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.j.c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                Function0 function0 = this.i;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    @NotNull
    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.o;
    }

    @NotNull
    public final xof getParentLayoutDirection() {
        return this.q;
    }

    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final hqe m27getPopupContentSizebOM6tXw() {
        return (hqe) this.r.getValue();
    }

    @NotNull
    public final ohm getPositionProvider() {
        return this.p;
    }

    @Override // defpackage.z5
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.z;
    }

    @NotNull
    public final String getTestTag() {
        return this.k;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // defpackage.z5
    public final void j(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(-857613600);
        getContent().invoke(oq5Var, 0);
        oq5Var.p(false);
    }

    @Override // defpackage.z5
    public final void o(boolean z, int i, int i2, int i3, int i4) {
        super.o(z, i, i2, i3, i4);
        this.j.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.o;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        ((mhm) this.m).getClass();
        this.n.updateViewLayout(this, layoutParams);
    }

    @Override // defpackage.z5, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.w.g();
        if (!this.j.c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.x == null) {
            this.x = new lo0(0, this.i);
        }
        rb.G(this, this.x);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a42 a42Var = this.w;
        h5n h5nVar = (h5n) a42Var.i;
        if (h5nVar != null) {
            h5nVar.b();
        }
        a42Var.b();
        if (Build.VERSION.SDK_INT >= 33) {
            rb.H(this, this.x);
        }
        this.x = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.j.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            Function0 function0 = this.i;
            if (function0 != null) {
                function0.invoke();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        Function0 function02 = this.i;
        if (function02 != null) {
            function02.invoke();
        }
        return true;
    }

    @Override // defpackage.z5
    public final void p(int i, int i2) {
        this.j.getClass();
        aqe visibleDisplayBounds = getVisibleDisplayBounds();
        super.p(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.c - visibleDisplayBounds.a, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.d - visibleDisplayBounds.b, Integer.MIN_VALUE));
    }

    public final void s(tr5 tr5Var, Function2 function2) {
        setParentCompositionContext(tr5Var);
        setContent(function2);
        this.z = true;
    }

    public final void setParentLayoutDirection(@NotNull xof xofVar) {
        this.q = xofVar;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m28setPopupContentSizefhxjrPA(hqe hqeVar) {
        this.r.setValue(hqeVar);
    }

    public final void setPositionProvider(@NotNull ohm ohmVar) {
        this.p = ohmVar;
    }

    public final void setTestTag(@NotNull String str) {
        this.k = str;
    }

    public final void t(Function0 function0, phm phmVar, String str, xof xofVar) {
        int i;
        this.i = function0;
        this.k = str;
        if (!Intrinsics.d(this.j, phmVar)) {
            phmVar.getClass();
            this.j = phmVar;
            boolean b = bi0.b(this.l);
            boolean z = phmVar.b;
            int i2 = phmVar.a;
            if (z && b) {
                i2 |= RemoteCameraConfig.Notification.ID;
            } else if (z && !b) {
                i2 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.o;
            layoutParams.flags = i2;
            ((mhm) this.m).getClass();
            this.n.updateViewLayout(this, layoutParams);
        }
        int ordinal = xofVar.ordinal();
        if (ordinal != 0) {
            i = 1;
            if (ordinal != 1) {
                b6e.s();
                return;
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    public final void u() {
        wof parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.d()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long j = parentLayoutCoordinates.j();
            long A = parentLayoutCoordinates.A(0L);
            long round = (Math.round(Float.intBitsToFloat((int) (A >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (A & 4294967295L))) & 4294967295L);
            int i = (int) (round >> 32);
            int i2 = (int) (round & 4294967295L);
            aqe aqeVar = new aqe(i, i2, ((int) (j >> 32)) + i, ((int) (j & 4294967295L)) + i2);
            if (aqeVar.equals(this.t)) {
                return;
            }
            this.t = aqeVar;
            w();
        }
    }

    public final void v(wof wofVar) {
        setParentLayoutCoordinates(wofVar);
        u();
    }

    public final void w() {
        hqe m27getPopupContentSizebOM6tXw;
        aqe aqeVar = this.t;
        if (aqeVar == null || (m27getPopupContentSizebOM6tXw = m27getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j = m27getPopupContentSizebOM6tXw.a;
        aqe visibleDisplayBounds = getVisibleDisplayBounds();
        long j2 = ((visibleDisplayBounds.d - visibleDisplayBounds.b) & 4294967295L) | ((visibleDisplayBounds.c - visibleDisplayBounds.a) << 32);
        wqn wqnVar = new wqn();
        wqnVar.a = 0L;
        this.w.f(this, hhm.s, new ihm(wqnVar, this, aqeVar, j2, j));
        long j3 = wqnVar.a;
        WindowManager.LayoutParams layoutParams = this.o;
        layoutParams.x = (int) (j3 >> 32);
        layoutParams.y = (int) (j3 & 4294967295L);
        boolean z = this.j.e;
        khm khmVar = this.m;
        if (z) {
            khmVar.a(this, (int) (j2 >> 32), (int) (j2 & 4294967295L));
        }
        ((mhm) khmVar).getClass();
        this.n.updateViewLayout(this, layoutParams);
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    @NotNull
    public z5 getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jhm(Function0 function0, phm phmVar, String str, View view, jx7 jx7Var, ohm ohmVar, UUID uuid, khm khmVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, phmVar, str, view, jx7Var, ohmVar, uuid, r9);
        khm khmVar2;
        khm mhmVar;
        if ((i & 128) != 0) {
            if (Build.VERSION.SDK_INT >= 29) {
                mhmVar = new lhm();
            } else {
                mhmVar = new mhm();
            }
            khmVar2 = mhmVar;
        } else {
            khmVar2 = khmVar;
        }
    }
}
