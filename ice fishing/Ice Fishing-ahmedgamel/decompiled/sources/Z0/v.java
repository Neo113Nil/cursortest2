package Z0;

import E2.M;
import a1.C0428a;
import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.LP;
import d1.C4458a;
import h1.C4564b;
import h1.C4566d;
import i1.C4585b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k1.C4639a;
import l1.AbstractC4668c;
import l1.AbstractC4672g;
import l1.ChoreographerFrameCallbackC4670e;
import l1.ThreadFactoryC4669d;

/* loaded from: classes.dex */
public final class v extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: t0, reason: collision with root package name */
    public static final boolean f4015t0;

    /* renamed from: u0, reason: collision with root package name */
    public static final List f4016u0;

    /* renamed from: v0, reason: collision with root package name */
    public static final ThreadPoolExecutor f4017v0;

    /* renamed from: A, reason: collision with root package name */
    public String f4018A;

    /* renamed from: B, reason: collision with root package name */
    public M f4019B;

    /* renamed from: C, reason: collision with root package name */
    public Map f4020C;

    /* renamed from: D, reason: collision with root package name */
    public String f4021D;

    /* renamed from: E, reason: collision with root package name */
    public final C4585b f4022E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f4023F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f4024G;

    /* renamed from: H, reason: collision with root package name */
    public C4564b f4025H;

    /* renamed from: I, reason: collision with root package name */
    public int f4026I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f4027K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f4028L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f4029M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f4030N;

    /* renamed from: O, reason: collision with root package name */
    public F f4031O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f4032P;

    /* renamed from: Q, reason: collision with root package name */
    public final Matrix f4033Q;

    /* renamed from: R, reason: collision with root package name */
    public Bitmap f4034R;

    /* renamed from: S, reason: collision with root package name */
    public Canvas f4035S;

    /* renamed from: T, reason: collision with root package name */
    public Rect f4036T;

    /* renamed from: U, reason: collision with root package name */
    public RectF f4037U;

    /* renamed from: V, reason: collision with root package name */
    public C0428a f4038V;

    /* renamed from: W, reason: collision with root package name */
    public Rect f4039W;

    /* renamed from: X, reason: collision with root package name */
    public Rect f4040X;
    public RectF Y;

    /* renamed from: Z, reason: collision with root package name */
    public RectF f4041Z;

    /* renamed from: i0, reason: collision with root package name */
    public Matrix f4042i0;

    /* renamed from: j0, reason: collision with root package name */
    public final float[] f4043j0;

    /* renamed from: k0, reason: collision with root package name */
    public Matrix f4044k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f4045l0;
    public EnumC0418a m0;

    /* renamed from: n, reason: collision with root package name */
    public i f4046n;

    /* renamed from: n0, reason: collision with root package name */
    public final Semaphore f4047n0;

    /* renamed from: o0, reason: collision with root package name */
    public Handler f4048o0;

    /* renamed from: p0, reason: collision with root package name */
    public s f4049p0;

    /* renamed from: q0, reason: collision with root package name */
    public final s f4050q0;

    /* renamed from: r0, reason: collision with root package name */
    public float f4051r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f4052s0;

    /* renamed from: u, reason: collision with root package name */
    public final ChoreographerFrameCallbackC4670e f4053u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f4054v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4055w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f4056x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f4057y;

    /* renamed from: z, reason: collision with root package name */
    public C4458a f4058z;

    static {
        f4015t0 = Build.VERSION.SDK_INT <= 25;
        f4016u0 = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        f4017v0 = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryC4669d());
    }

    public v() {
        ChoreographerFrameCallbackC4670e choreographerFrameCallbackC4670e = new ChoreographerFrameCallbackC4670e();
        this.f4053u = choreographerFrameCallbackC4670e;
        this.f4054v = true;
        this.f4055w = false;
        this.f4056x = false;
        this.f4052s0 = 1;
        this.f4057y = new ArrayList();
        this.f4022E = new C4585b(15);
        this.f4023F = false;
        this.f4024G = true;
        this.f4026I = com.anythink.basead.exoplayer.k.p.f9259b;
        this.f4030N = false;
        this.f4031O = F.f3939n;
        this.f4032P = false;
        this.f4033Q = new Matrix();
        this.f4043j0 = new float[9];
        this.f4045l0 = false;
        J3.i iVar = new J3.i(1, this);
        this.f4047n0 = new Semaphore(1);
        this.f4050q0 = new s(this, 1);
        this.f4051r0 = -3.4028235E38f;
        choreographerFrameCallbackC4670e.addUpdateListener(iVar);
    }

    public static void f(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public static boolean j(float f2) {
        return (Float.isNaN(f2) || Float.isInfinite(f2)) ? false : true;
    }

    public final void a(final e1.e eVar, final ColorFilter colorFilter, final LP lp) {
        C4564b c4564b = this.f4025H;
        if (c4564b == null) {
            this.f4057y.add(new u() { // from class: Z0.p
                @Override // Z0.u
                public final void run() {
                    v.this.a(eVar, colorFilter, lp);
                }
            });
            return;
        }
        boolean z6 = true;
        if (eVar == e1.e.f37236c) {
            c4564b.d(colorFilter, lp);
        } else {
            e1.f fVar = eVar.f37238b;
            if (fVar != null) {
                fVar.d(colorFilter, lp);
            } else {
                ArrayList arrayList = new ArrayList();
                this.f4025H.c(eVar, 0, arrayList, new e1.e(new String[0]));
                for (int i = 0; i < arrayList.size(); i++) {
                    ((e1.e) arrayList.get(i)).f37238b.d(colorFilter, lp);
                }
                z6 = true ^ arrayList.isEmpty();
            }
        }
        if (z6) {
            invalidateSelf();
            if (colorFilter == z.f4069C) {
                u(this.f4053u.h());
            }
        }
    }

    public final boolean b(Context context) {
        if (this.f4055w) {
            return true;
        }
        if (!this.f4054v) {
            return false;
        }
        if (context == null) {
            return true;
        }
        Matrix matrix = l1.i.f38862a;
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
    }

    public final void c() {
        i iVar = this.f4046n;
        if (iVar == null) {
            return;
        }
        C4639a c4639a = j1.q.f38459a;
        Rect rect = iVar.f3974k;
        List list = Collections.EMPTY_LIST;
        C4564b c4564b = new C4564b(this, new C4566d(list, iVar, "__container", -1L, 1, -1L, null, list, new f1.d(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, 1, null, false, null, null, 1), iVar.f3973j, iVar);
        this.f4025H = c4564b;
        if (this.f4027K) {
            c4564b.q(true);
        }
        this.f4025H.f38007L = this.f4024G;
    }

    public final void d() {
        ChoreographerFrameCallbackC4670e choreographerFrameCallbackC4670e = this.f4053u;
        if (choreographerFrameCallbackC4670e.f38824F) {
            choreographerFrameCallbackC4670e.cancel();
            if (!isVisible()) {
                this.f4052s0 = 1;
            }
        }
        this.f4046n = null;
        this.f4025H = null;
        this.f4058z = null;
        this.f4051r0 = -3.4028235E38f;
        choreographerFrameCallbackC4670e.f38823E = null;
        choreographerFrameCallbackC4670e.f38821C = -2.1474836E9f;
        choreographerFrameCallbackC4670e.f38822D = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        i iVar;
        C4564b c4564b = this.f4025H;
        if (c4564b == null) {
            return;
        }
        EnumC0418a enumC0418a = this.m0;
        if (enumC0418a == null) {
            enumC0418a = EnumC0418a.f3943n;
        }
        boolean z6 = enumC0418a == EnumC0418a.f3944u;
        ThreadPoolExecutor threadPoolExecutor = f4017v0;
        Semaphore semaphore = this.f4047n0;
        s sVar = this.f4050q0;
        ChoreographerFrameCallbackC4670e choreographerFrameCallbackC4670e = this.f4053u;
        if (z6) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                if (!z6) {
                    return;
                }
                semaphore.release();
                if (c4564b.f38006K == choreographerFrameCallbackC4670e.h()) {
                    return;
                }
            } catch (Throwable th) {
                if (z6) {
                    semaphore.release();
                    if (c4564b.f38006K != choreographerFrameCallbackC4670e.h()) {
                        threadPoolExecutor.execute(sVar);
                    }
                }
                throw th;
            }
        }
        if (z6 && (iVar = this.f4046n) != null) {
            float f2 = this.f4051r0;
            float h3 = choreographerFrameCallbackC4670e.h();
            this.f4051r0 = h3;
            if (Math.abs(h3 - f2) * iVar.b() >= 50.0f) {
                u(choreographerFrameCallbackC4670e.h());
            }
        }
        if (this.f4056x) {
            try {
                if (this.f4032P) {
                    m(canvas, c4564b);
                } else {
                    g(canvas);
                }
            } catch (Throwable unused2) {
                AbstractC4668c.f38814a.getClass();
            }
        } else if (this.f4032P) {
            m(canvas, c4564b);
        } else {
            g(canvas);
        }
        this.f4045l0 = false;
        if (z6) {
            semaphore.release();
            if (c4564b.f38006K == choreographerFrameCallbackC4670e.h()) {
                return;
            }
            threadPoolExecutor.execute(sVar);
        }
    }

    public final void e() {
        i iVar = this.f4046n;
        if (iVar == null) {
            return;
        }
        F f2 = this.f4031O;
        int i = Build.VERSION.SDK_INT;
        boolean z6 = iVar.f3978o;
        int i4 = iVar.f3979p;
        int ordinal = f2.ordinal();
        boolean z9 = false;
        if (ordinal != 1 && (ordinal == 2 || ((z6 && i < 28) || i4 > 4 || i <= 25))) {
            z9 = true;
        }
        this.f4032P = z9;
    }

    public final void g(Canvas canvas) {
        C4564b c4564b = this.f4025H;
        i iVar = this.f4046n;
        if (c4564b == null || iVar == null) {
            return;
        }
        Matrix matrix = this.f4033Q;
        matrix.reset();
        if (!getBounds().isEmpty()) {
            matrix.preTranslate(r3.left, r3.top);
            matrix.preScale(r3.width() / iVar.f3974k.width(), r3.height() / iVar.f3974k.height());
        }
        c4564b.h(canvas, matrix, this.f4026I, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f4026I;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        i iVar = this.f4046n;
        if (iVar == null) {
            return -1;
        }
        return iVar.f3974k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        i iVar = this.f4046n;
        if (iVar == null) {
            return -1;
        }
        return iVar.f3974k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final Context h() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public final M i() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f4019B == null) {
            M m9 = new M(getCallback());
            this.f4019B = m9;
            String str = this.f4021D;
            if (str != null) {
                m9.f765y = str;
            }
        }
        return this.f4019B;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable.Callback callback;
        if (this.f4045l0) {
            return;
        }
        this.f4045l0 = true;
        if ((!f4015t0 || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ChoreographerFrameCallbackC4670e choreographerFrameCallbackC4670e = this.f4053u;
        if (choreographerFrameCallbackC4670e == null) {
            return false;
        }
        return choreographerFrameCallbackC4670e.f38824F;
    }

    public final void k() {
        this.f4057y.clear();
        ChoreographerFrameCallbackC4670e choreographerFrameCallbackC4670e = this.f4053u;
        choreographerFrameCallbackC4670e.n(true);
        Iterator it = choreographerFrameCallbackC4670e.f38828v.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(choreographerFrameCallbackC4670e);
        }
        if (isVisible()) {
            return;
        }
        this.f4052s0 = 1;
    }

    public final void l() {
        if (this.f4025H == null) {
            this.f4057y.add(new t(this, 1));
            return;
        }
        e();
        boolean b9 = b(h());
        ChoreographerFrameCallbackC4670e choreographerFrameCallbackC4670e = this.f4053u;
        if (b9 || choreographerFrameCallbackC4670e.getRepeatCount() == 0) {
            if (isVisible()) {
                choreographerFrameCallbackC4670e.f38824F = true;
                boolean k9 = choreographerFrameCallbackC4670e.k();
                Iterator it = choreographerFrameCallbackC4670e.f38827u.iterator();
                while (it.hasNext()) {
                    Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
                    if (Build.VERSION.SDK_INT >= 26) {
                        animatorListener.onAnimationStart(choreographerFrameCallbackC4670e, k9);
                    } else {
                        animatorListener.onAnimationStart(choreographerFrameCallbackC4670e);
                    }
                }
                choreographerFrameCallbackC4670e.o((int) (choreographerFrameCallbackC4670e.k() ? choreographerFrameCallbackC4670e.i() : choreographerFrameCallbackC4670e.j()));
                choreographerFrameCallbackC4670e.f38831y = 0L;
                choreographerFrameCallbackC4670e.f38820B = 0;
                if (choreographerFrameCallbackC4670e.f38824F) {
                    choreographerFrameCallbackC4670e.n(false);
                    Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC4670e);
                }
                this.f4052s0 = 1;
            } else {
                this.f4052s0 = 2;
            }
        }
        if (b(h())) {
            return;
        }
        Iterator it2 = f4016u0.iterator();
        e1.h hVar = null;
        while (it2.hasNext()) {
            hVar = this.f4046n.d((String) it2.next());
            if (hVar != null) {
                break;
            }
        }
        if (hVar != null) {
            o((int) hVar.f37242b);
        } else {
            o((int) (choreographerFrameCallbackC4670e.f38829w < 0.0f ? choreographerFrameCallbackC4670e.j() : choreographerFrameCallbackC4670e.i()));
        }
        choreographerFrameCallbackC4670e.n(true);
        choreographerFrameCallbackC4670e.l(choreographerFrameCallbackC4670e.k());
        if (isVisible()) {
            return;
        }
        this.f4052s0 = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(Canvas canvas, C4564b c4564b) {
        boolean z6;
        RectF rectF;
        if (this.f4046n == null || c4564b == null) {
            return;
        }
        if (this.f4035S == null) {
            this.f4035S = new Canvas();
            this.f4041Z = new RectF();
            this.f4042i0 = new Matrix();
            this.f4044k0 = new Matrix();
            this.f4036T = new Rect();
            this.f4037U = new RectF();
            this.f4038V = new C0428a();
            this.f4039W = new Rect();
            this.f4040X = new Rect();
            this.Y = new RectF();
        }
        canvas.getMatrix(this.f4042i0);
        canvas.getClipBounds(this.f4036T);
        Rect rect = this.f4036T;
        this.f4037U.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f4042i0.mapRect(this.f4037U);
        f(this.f4036T, this.f4037U);
        if (this.f4024G) {
            this.f4041Z.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            c4564b.e(this.f4041Z, null, false);
        }
        this.f4042i0.mapRect(this.f4041Z);
        Rect bounds = getBounds();
        float width = bounds.width() / getIntrinsicWidth();
        float height = bounds.height() / getIntrinsicHeight();
        RectF rectF2 = this.f4041Z;
        rectF2.set(rectF2.left * width, rectF2.top * height, rectF2.right * width, rectF2.bottom * height);
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ViewParent parent = ((View) callback).getParent();
            if (parent instanceof ViewGroup) {
                z6 = !((ViewGroup) parent).getClipChildren();
                if (!z6) {
                    RectF rectF3 = this.f4041Z;
                    Rect rect2 = this.f4036T;
                    rectF3.intersect(rect2.left, rect2.top, rect2.right, rect2.bottom);
                }
                rectF = this.f4041Z;
                if (!j(rectF.left) && j(rectF.top) && j(rectF.right) && j(rectF.bottom)) {
                    AbstractC4668c.b("Skipping software rendering: transformed bounds contain non-finite values.");
                    return;
                }
                int ceil = (int) Math.ceil(this.f4041Z.width());
                int ceil2 = (int) Math.ceil(this.f4041Z.height());
                if (ceil <= 0 || ceil2 <= 0) {
                    AbstractC4668c.b("Skipping software rendering: transformed bounds have negative values.");
                    return;
                }
                long j6 = ceil * ceil2;
                if (j6 > 50000000) {
                    AbstractC4668c.b("Skipping software rendering: bitmap request exceeds safe pixel count (" + j6 + ")");
                    return;
                }
                Bitmap bitmap = this.f4034R;
                if (bitmap == null || bitmap.getWidth() < ceil || this.f4034R.getHeight() < ceil2) {
                    Bitmap createBitmap = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                    this.f4034R = createBitmap;
                    this.f4035S.setBitmap(createBitmap);
                    this.f4045l0 = true;
                } else if (this.f4034R.getWidth() > ceil || this.f4034R.getHeight() > ceil2) {
                    Bitmap createBitmap2 = Bitmap.createBitmap(this.f4034R, 0, 0, ceil, ceil2);
                    this.f4034R = createBitmap2;
                    this.f4035S.setBitmap(createBitmap2);
                    this.f4045l0 = true;
                }
                if (this.f4045l0) {
                    Matrix matrix = this.f4042i0;
                    float[] fArr = this.f4043j0;
                    matrix.getValues(fArr);
                    float f2 = fArr[0];
                    float f9 = fArr[4];
                    Matrix matrix2 = this.f4033Q;
                    matrix2.set(this.f4042i0);
                    matrix2.preScale(width, height);
                    RectF rectF4 = this.f4041Z;
                    matrix2.postTranslate(-rectF4.left, -rectF4.top);
                    matrix2.postScale(1.0f / f2, 1.0f / f9);
                    this.f4034R.eraseColor(0);
                    this.f4035S.setMatrix(l1.i.f38862a);
                    this.f4035S.scale(f2, f9);
                    c4564b.h(this.f4035S, matrix2, this.f4026I, null);
                    this.f4042i0.invert(this.f4044k0);
                    this.f4044k0.mapRect(this.Y, this.f4041Z);
                    f(this.f4040X, this.Y);
                }
                this.f4039W.set(0, 0, ceil, ceil2);
                canvas.drawBitmap(this.f4034R, this.f4039W, this.f4040X, this.f4038V);
                return;
            }
        }
        z6 = false;
        if (!z6) {
        }
        rectF = this.f4041Z;
        if (!j(rectF.left) && j(rectF.top) && j(rectF.right) && j(rectF.bottom)) {
        }
    }

    public final void n() {
        if (this.f4025H == null) {
            this.f4057y.add(new t(this, 0));
            return;
        }
        e();
        boolean b9 = b(h());
        ChoreographerFrameCallbackC4670e choreographerFrameCallbackC4670e = this.f4053u;
        if (b9 || choreographerFrameCallbackC4670e.getRepeatCount() == 0) {
            if (isVisible()) {
                choreographerFrameCallbackC4670e.f38824F = true;
                choreographerFrameCallbackC4670e.n(false);
                Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC4670e);
                choreographerFrameCallbackC4670e.f38831y = 0L;
                if (choreographerFrameCallbackC4670e.k() && choreographerFrameCallbackC4670e.f38819A == choreographerFrameCallbackC4670e.j()) {
                    choreographerFrameCallbackC4670e.o(choreographerFrameCallbackC4670e.i());
                } else if (!choreographerFrameCallbackC4670e.k() && choreographerFrameCallbackC4670e.f38819A == choreographerFrameCallbackC4670e.i()) {
                    choreographerFrameCallbackC4670e.o(choreographerFrameCallbackC4670e.j());
                }
                Iterator it = choreographerFrameCallbackC4670e.f38828v.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(choreographerFrameCallbackC4670e);
                }
                this.f4052s0 = 1;
            } else {
                this.f4052s0 = 3;
            }
        }
        if (b(h())) {
            return;
        }
        o((int) (choreographerFrameCallbackC4670e.f38829w < 0.0f ? choreographerFrameCallbackC4670e.j() : choreographerFrameCallbackC4670e.i()));
        choreographerFrameCallbackC4670e.n(true);
        choreographerFrameCallbackC4670e.l(choreographerFrameCallbackC4670e.k());
        if (isVisible()) {
            return;
        }
        this.f4052s0 = 1;
    }

    public final void o(int i) {
        if (this.f4046n == null) {
            this.f4057y.add(new o(this, i, 2));
        } else {
            this.f4053u.o(i);
        }
    }

    public final void p(int i) {
        if (this.f4046n == null) {
            this.f4057y.add(new o(this, i, 0));
            return;
        }
        ChoreographerFrameCallbackC4670e choreographerFrameCallbackC4670e = this.f4053u;
        choreographerFrameCallbackC4670e.p(choreographerFrameCallbackC4670e.f38821C, i + 0.99f);
    }

    public final void q(String str) {
        i iVar = this.f4046n;
        if (iVar == null) {
            this.f4057y.add(new n(this, str, 1));
            return;
        }
        e1.h d9 = iVar.d(str);
        if (d9 == null) {
            throw new IllegalArgumentException(D.x.l("Cannot find marker with name ", str, com.anythink.core.common.d.j.f13164z));
        }
        p((int) (d9.f37242b + d9.f37243c));
    }

    public final void r(String str) {
        i iVar = this.f4046n;
        ArrayList arrayList = this.f4057y;
        if (iVar == null) {
            arrayList.add(new n(this, str, 0));
            return;
        }
        e1.h d9 = iVar.d(str);
        if (d9 == null) {
            throw new IllegalArgumentException(D.x.l("Cannot find marker with name ", str, com.anythink.core.common.d.j.f13164z));
        }
        int i = (int) d9.f37242b;
        int i4 = ((int) d9.f37243c) + i;
        if (this.f4046n == null) {
            arrayList.add(new r(this, i, i4));
        } else {
            this.f4053u.p(i, i4 + 0.99f);
        }
    }

    public final void s(int i) {
        if (this.f4046n == null) {
            this.f4057y.add(new o(this, i, 1));
        } else {
            this.f4053u.p(i, (int) r0.f38822D);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j6) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f4026I = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        AbstractC4668c.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z9) {
        boolean isVisible = isVisible();
        boolean visible = super.setVisible(z6, z9);
        if (z6) {
            int i = this.f4052s0;
            if (i == 2) {
                l();
                return visible;
            }
            if (i == 3) {
                n();
                return visible;
            }
        } else {
            if (this.f4053u.f38824F) {
                k();
                this.f4052s0 = 3;
                return visible;
            }
            if (isVisible) {
                this.f4052s0 = 1;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        l();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f4057y.clear();
        ChoreographerFrameCallbackC4670e choreographerFrameCallbackC4670e = this.f4053u;
        choreographerFrameCallbackC4670e.n(true);
        choreographerFrameCallbackC4670e.l(choreographerFrameCallbackC4670e.k());
        if (isVisible()) {
            return;
        }
        this.f4052s0 = 1;
    }

    public final void t(String str) {
        i iVar = this.f4046n;
        if (iVar == null) {
            this.f4057y.add(new n(this, str, 2));
            return;
        }
        e1.h d9 = iVar.d(str);
        if (d9 == null) {
            throw new IllegalArgumentException(D.x.l("Cannot find marker with name ", str, com.anythink.core.common.d.j.f13164z));
        }
        s((int) d9.f37242b);
    }

    public final void u(float f2) {
        i iVar = this.f4046n;
        if (iVar == null) {
            this.f4057y.add(new q(this, f2, 2));
        } else {
            this.f4053u.o(AbstractC4672g.f(iVar.f3975l, iVar.f3976m, f2));
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
