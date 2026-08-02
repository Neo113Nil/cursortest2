package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class xeu extends View implements tzj {
    public static final c28 p = new c28(4);
    public static Method q;
    public static Field r;
    public static boolean s;
    public static boolean t;
    public final AndroidComposeView a;
    public final gpa b;
    public Function2 c;
    public Function0 d;
    public final eyj e;
    public boolean f;
    public Rect g;
    public boolean h;
    public boolean i;
    public final pu3 j;
    public final dzd k;
    public long l;
    public boolean m;
    public final long n;
    public int o;

    public xeu(@NotNull AndroidComposeView androidComposeView, @NotNull gpa gpaVar, @NotNull Function2<? super mu3, ? super xod, Unit> function2, @NotNull Function0<Unit> function0) {
        super(androidComposeView.getContext());
        this.a = androidComposeView;
        this.b = gpaVar;
        this.c = function2;
        this.d = function0;
        this.e = new eyj();
        this.j = new pu3();
        this.k = new dzd(ucs.u);
        int i = a7t.c;
        this.l = a7t.b;
        this.m = true;
        setWillNotDraw(false);
        gpaVar.addView(this);
        this.n = View.generateViewId();
    }

    private final eak getManualClipPath() {
        if (!getClipToOutline()) {
            return null;
        }
        eyj eyjVar = this.e;
        if (!eyjVar.g) {
            return null;
        }
        eyjVar.e();
        return eyjVar.e;
    }

    private final void setInvalidated(boolean z) {
        if (z != this.h) {
            this.h = z;
            this.a.w(this, z);
        }
    }

    @Override // defpackage.tzj
    public final void a(float[] fArr) {
        feh.e(fArr, this.k.c(this));
    }

    @Override // defpackage.tzj
    public final void b(spi spiVar, boolean z) {
        dzd dzdVar = this.k;
        if (!z) {
            float[] c = dzdVar.c(this);
            if (dzdVar.d) {
                return;
            }
            feh.c(c, spiVar);
            return;
        }
        float[] b = dzdVar.b(this);
        if (b != null) {
            if (dzdVar.d) {
                return;
            }
            feh.c(b, spiVar);
        } else {
            spiVar.b = 0.0f;
            spiVar.c = 0.0f;
            spiVar.d = 0.0f;
            spiVar.e = 0.0f;
        }
    }

    @Override // defpackage.tzj
    public final void c(zco zcoVar) {
        Function0 function0;
        jzk jzkVar = vnj.i;
        int i = zcoVar.a | this.o;
        if ((i & 4096) != 0) {
            long j = zcoVar.l;
            this.l = j;
            setPivotX(a7t.b(j) * getWidth());
            setPivotY(a7t.c(this.l) * getHeight());
        }
        if ((i & 1) != 0) {
            setScaleX(zcoVar.b);
        }
        if ((i & 2) != 0) {
            setScaleY(zcoVar.c);
        }
        if ((i & 4) != 0) {
            setAlpha(zcoVar.d);
        }
        if ((i & 8) != 0) {
            setTranslationX(zcoVar.e);
        }
        if ((i & 16) != 0) {
            setTranslationY(zcoVar.f);
        }
        if ((i & 32) != 0) {
            setElevation(zcoVar.g);
        }
        if ((i & 1024) != 0) {
            setRotation(zcoVar.j);
        }
        if ((i & 256) != 0) {
            setRotationX(0.0f);
        }
        if ((i & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0) {
            setRotationY(0.0f);
        }
        if ((i & 2048) != 0) {
            setCameraDistancePx(zcoVar.k);
        }
        boolean z = false;
        boolean z2 = getManualClipPath() != null;
        boolean z3 = zcoVar.n;
        boolean z4 = z3 && zcoVar.m != jzkVar;
        if ((i & 24576) != 0) {
            this.f = z3 && zcoVar.m == jzkVar;
            l();
            setClipToOutline(z4);
        }
        boolean d = this.e.d(zcoVar.t, zcoVar.d, z4, zcoVar.g, zcoVar.p);
        eyj eyjVar = this.e;
        if (eyjVar.f) {
            setOutlineProvider(eyjVar.b() != null ? p : null);
        }
        boolean z5 = getManualClipPath() != null;
        if (z2 != z5 || (z5 && d)) {
            invalidate();
        }
        if (!this.i && getElevation() > 0.0f && (function0 = this.d) != null) {
            function0.invoke();
        }
        if ((i & 7963) != 0) {
            this.k.e();
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            if ((i & 64) != 0) {
                jo0.K(this, c3x.U(zcoVar.h));
            }
            if ((i & 128) != 0) {
                jo0.M(this, c3x.U(zcoVar.i));
            }
        }
        if (i2 >= 31 && (131072 & i) != 0) {
            rf0.C(this, zcoVar.s);
        }
        if ((32768 & i) != 0) {
            int i3 = zcoVar.o;
            if (i3 == 1) {
                setLayerType(2, null);
            } else if (i3 == 2) {
                setLayerType(0, null);
                this.m = z;
            } else {
                setLayerType(0, null);
            }
            z = true;
            this.m = z;
        }
        this.o = zcoVar.a;
    }

    @Override // defpackage.tzj
    public final long d(long j, boolean z) {
        dzd dzdVar = this.k;
        if (!z) {
            return !dzdVar.d ? feh.b(j, dzdVar.c(this)) : j;
        }
        float[] b = dzdVar.b(this);
        if (b == null) {
            return 9187343241974906880L;
        }
        return !dzdVar.d ? feh.b(j, b) : j;
    }

    @Override // defpackage.tzj
    public final void destroy() {
        setInvalidated(false);
        AndroidComposeView androidComposeView = this.a;
        androidComposeView.D = true;
        this.c = null;
        this.d = null;
        androidComposeView.F(this);
        this.b.removeViewInLayout(this);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        pu3 pu3Var = this.j;
        ud0 ud0Var = pu3Var.a;
        Canvas canvas2 = ud0Var.a;
        ud0Var.a = canvas;
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z = false;
        } else {
            ud0Var.r();
            this.e.a(ud0Var);
            z = true;
        }
        Function2 function2 = this.c;
        if (function2 != null) {
            function2.invoke(ud0Var, null);
        }
        if (z) {
            ud0Var.k();
        }
        pu3Var.a.a = canvas2;
        setInvalidated(false);
    }

    @Override // defpackage.tzj
    public final void e(Function2 function2, Function0 function0) {
        this.b.addView(this);
        dzd dzdVar = this.k;
        dzdVar.a = false;
        dzdVar.b = false;
        dzdVar.d = true;
        dzdVar.c = true;
        feh.d((float[]) dzdVar.g);
        feh.d((float[]) dzdVar.h);
        this.f = false;
        this.i = false;
        this.l = a7t.b;
        this.c = function2;
        this.d = function0;
        setInvalidated(false);
    }

    @Override // defpackage.tzj
    public final void f(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (i == getWidth() && i2 == getHeight()) {
            return;
        }
        setPivotX(a7t.b(this.l) * i);
        setPivotY(a7t.c(this.l) * i2);
        setOutlineProvider(this.e.b() != null ? p : null);
        layout(getLeft(), getTop(), getLeft() + i, getTop() + i2);
        l();
        this.k.e();
    }

    @Override // defpackage.tzj
    public final void g(mu3 mu3Var, xod xodVar) {
        boolean z = getElevation() > 0.0f;
        this.i = z;
        if (z) {
            mu3Var.n();
        }
        this.b.a(mu3Var, this, getDrawingTime());
        if (this.i) {
            mu3Var.s();
        }
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    @NotNull
    public final gpa getContainer() {
        return this.b;
    }

    public long getLayerId() {
        return this.n;
    }

    @NotNull
    public final AndroidComposeView getOwnerView() {
        return this.a;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return mi.v(this.a);
        }
        return -1L;
    }

    @Override // defpackage.tzj
    @NotNull
    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo2getUnderlyingMatrixsQKQjiQ() {
        return this.k.c(this);
    }

    @Override // defpackage.tzj
    public final boolean h(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j));
        if (this.f) {
            return 0.0f <= intBitsToFloat && intBitsToFloat < ((float) getWidth()) && 0.0f <= intBitsToFloat2 && intBitsToFloat2 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.e.c(j);
        }
        return true;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.m;
    }

    @Override // defpackage.tzj
    public final void i(float[] fArr) {
        float[] b = this.k.b(this);
        if (b != null) {
            feh.e(fArr, b);
        }
    }

    @Override // android.view.View, defpackage.tzj
    public final void invalidate() {
        if (this.h) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.a.invalidate();
    }

    @Override // defpackage.tzj
    public final void j(long j) {
        int i = (int) (j >> 32);
        int left = getLeft();
        dzd dzdVar = this.k;
        if (i != left) {
            offsetLeftAndRight(i - getLeft());
            dzdVar.e();
        }
        int i2 = (int) (j & 4294967295L);
        if (i2 != getTop()) {
            offsetTopAndBottom(i2 - getTop());
            dzdVar.e();
        }
    }

    @Override // defpackage.tzj
    public final void k() {
        if (!this.h || t) {
            return;
        }
        neg.K(this);
        setInvalidated(false);
    }

    public final void l() {
        Rect rect;
        if (this.f) {
            Rect rect2 = this.g;
            if (rect2 == null) {
                this.g = new Rect(0, 0, getWidth(), getHeight());
            } else {
                rect2.getClass();
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.g;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
