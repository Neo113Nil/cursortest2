package X0;

import C2.N;
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
import b1.C0513a;
import com.google.android.gms.internal.ads.C2991bm;
import f1.C4499b;
import f1.C4501d;
import j1.AbstractC4599c;
import j1.AbstractC4603g;
import j1.ChoreographerFrameCallbackC4601e;
import j1.ThreadFactoryC4600d;
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

/* loaded from: classes.dex */
public final class v extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: A0, reason: collision with root package name */
    public static final ThreadPoolExecutor f3663A0;

    /* renamed from: y0, reason: collision with root package name */
    public static final boolean f3664y0;

    /* renamed from: z0, reason: collision with root package name */
    public static final List f3665z0;

    /* renamed from: A, reason: collision with root package name */
    public String f3666A;

    /* renamed from: B, reason: collision with root package name */
    public N f3667B;

    /* renamed from: C, reason: collision with root package name */
    public Map f3668C;

    /* renamed from: D, reason: collision with root package name */
    public String f3669D;

    /* renamed from: E, reason: collision with root package name */
    public final l4.c f3670E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f3671F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f3672G;

    /* renamed from: H, reason: collision with root package name */
    public C4499b f3673H;

    /* renamed from: I, reason: collision with root package name */
    public int f3674I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f3675K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f3676L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f3677M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f3678N;

    /* renamed from: O, reason: collision with root package name */
    public F f3679O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f3680P;

    /* renamed from: Q, reason: collision with root package name */
    public final Matrix f3681Q;

    /* renamed from: R, reason: collision with root package name */
    public Bitmap f3682R;

    /* renamed from: S, reason: collision with root package name */
    public Canvas f3683S;

    /* renamed from: T, reason: collision with root package name */
    public Rect f3684T;

    /* renamed from: U, reason: collision with root package name */
    public RectF f3685U;

    /* renamed from: V, reason: collision with root package name */
    public Y0.a f3686V;

    /* renamed from: W, reason: collision with root package name */
    public Rect f3687W;

    /* renamed from: X, reason: collision with root package name */
    public Rect f3688X;
    public RectF Y;

    /* renamed from: Z, reason: collision with root package name */
    public RectF f3689Z;

    /* renamed from: n, reason: collision with root package name */
    public i f3690n;

    /* renamed from: n0, reason: collision with root package name */
    public Matrix f3691n0;

    /* renamed from: o0, reason: collision with root package name */
    public final float[] f3692o0;

    /* renamed from: p0, reason: collision with root package name */
    public Matrix f3693p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f3694q0;

    /* renamed from: r0, reason: collision with root package name */
    public EnumC0414a f3695r0;

    /* renamed from: s0, reason: collision with root package name */
    public final Semaphore f3696s0;

    /* renamed from: t0, reason: collision with root package name */
    public Handler f3697t0;

    /* renamed from: u, reason: collision with root package name */
    public final ChoreographerFrameCallbackC4601e f3698u;

    /* renamed from: u0, reason: collision with root package name */
    public s f3699u0;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f3700v;

    /* renamed from: v0, reason: collision with root package name */
    public final s f3701v0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3702w;

    /* renamed from: w0, reason: collision with root package name */
    public float f3703w0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3704x;

    /* renamed from: x0, reason: collision with root package name */
    public int f3705x0;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f3706y;

    /* renamed from: z, reason: collision with root package name */
    public C0513a f3707z;

    static {
        f3664y0 = Build.VERSION.SDK_INT <= 25;
        f3665z0 = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        f3663A0 = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryC4600d());
    }

    public v() {
        ChoreographerFrameCallbackC4601e choreographerFrameCallbackC4601e = new ChoreographerFrameCallbackC4601e();
        this.f3698u = choreographerFrameCallbackC4601e;
        this.f3700v = true;
        this.f3702w = false;
        this.f3704x = false;
        this.f3705x0 = 1;
        this.f3706y = new ArrayList();
        this.f3670E = new l4.c(1);
        this.f3671F = false;
        this.f3672G = true;
        this.f3674I = com.anythink.basead.exoplayer.k.p.f8473b;
        this.f3678N = false;
        this.f3679O = F.f3587n;
        this.f3680P = false;
        this.f3681Q = new Matrix();
        this.f3692o0 = new float[9];
        this.f3694q0 = false;
        H3.i iVar = new H3.i(1, this);
        this.f3696s0 = new Semaphore(1);
        this.f3701v0 = new s(this, 1);
        this.f3703w0 = -3.4028235E38f;
        choreographerFrameCallbackC4601e.addUpdateListener(iVar);
    }

    public static void f(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public static boolean j(float f3) {
        return (Float.isNaN(f3) || Float.isInfinite(f3)) ? false : true;
    }

    public final void a(final c1.e eVar, final ColorFilter colorFilter, final C2991bm c2991bm) {
        C4499b c4499b = this.f3673H;
        if (c4499b == null) {
            this.f3706y.add(new u() { // from class: X0.p
                @Override // X0.u
                public final void run() {
                    v.this.a(eVar, colorFilter, c2991bm);
                }
            });
            return;
        }
        boolean z3 = true;
        if (eVar == c1.e.f5518c) {
            c4499b.h(colorFilter, c2991bm);
        } else {
            c1.f fVar = eVar.f5520b;
            if (fVar != null) {
                fVar.h(colorFilter, c2991bm);
            } else {
                ArrayList arrayList = new ArrayList();
                this.f3673H.e(eVar, 0, arrayList, new c1.e(new String[0]));
                for (int i = 0; i < arrayList.size(); i++) {
                    ((c1.e) arrayList.get(i)).f5520b.h(colorFilter, c2991bm);
                }
                z3 = true ^ arrayList.isEmpty();
            }
        }
        if (z3) {
            invalidateSelf();
            if (colorFilter == z.f3718C) {
                u(this.f3698u.h());
            }
        }
    }

    public final boolean b(Context context) {
        if (this.f3702w) {
            return true;
        }
        if (!this.f3700v) {
            return false;
        }
        if (context == null) {
            return true;
        }
        Matrix matrix = j1.j.f38350a;
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
    }

    public final void c() {
        i iVar = this.f3690n;
        if (iVar == null) {
            return;
        }
        S0.l lVar = h1.q.f37990a;
        Rect rect = iVar.f3622k;
        List list = Collections.EMPTY_LIST;
        C4499b c4499b = new C4499b(this, new C4501d(list, iVar, "__container", -1L, 1, -1L, null, list, new d1.e(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, 1, null, false, null, null, 1), iVar.f3621j, iVar);
        this.f3673H = c4499b;
        if (this.f3675K) {
            c4499b.q(true);
        }
        this.f3673H.f37383L = this.f3672G;
    }

    public final void d() {
        ChoreographerFrameCallbackC4601e choreographerFrameCallbackC4601e = this.f3698u;
        if (choreographerFrameCallbackC4601e.f38312F) {
            choreographerFrameCallbackC4601e.cancel();
            if (!isVisible()) {
                this.f3705x0 = 1;
            }
        }
        this.f3690n = null;
        this.f3673H = null;
        this.f3707z = null;
        this.f3703w0 = -3.4028235E38f;
        choreographerFrameCallbackC4601e.f38311E = null;
        choreographerFrameCallbackC4601e.f38309C = -2.1474836E9f;
        choreographerFrameCallbackC4601e.f38310D = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        i iVar;
        C4499b c4499b = this.f3673H;
        if (c4499b == null) {
            return;
        }
        EnumC0414a enumC0414a = this.f3695r0;
        if (enumC0414a == null) {
            enumC0414a = EnumC0414a.f3591n;
        }
        boolean z3 = enumC0414a == EnumC0414a.f3592u;
        ThreadPoolExecutor threadPoolExecutor = f3663A0;
        Semaphore semaphore = this.f3696s0;
        s sVar = this.f3701v0;
        ChoreographerFrameCallbackC4601e choreographerFrameCallbackC4601e = this.f3698u;
        if (z3) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                if (!z3) {
                    return;
                }
                semaphore.release();
                if (c4499b.f37382K == choreographerFrameCallbackC4601e.h()) {
                    return;
                }
            } catch (Throwable th) {
                if (z3) {
                    semaphore.release();
                    if (c4499b.f37382K != choreographerFrameCallbackC4601e.h()) {
                        threadPoolExecutor.execute(sVar);
                    }
                }
                throw th;
            }
        }
        if (z3 && (iVar = this.f3690n) != null) {
            float f3 = this.f3703w0;
            float h9 = choreographerFrameCallbackC4601e.h();
            this.f3703w0 = h9;
            if (Math.abs(h9 - f3) * iVar.b() >= 50.0f) {
                u(choreographerFrameCallbackC4601e.h());
            }
        }
        if (this.f3704x) {
            try {
                if (this.f3680P) {
                    m(canvas, c4499b);
                } else {
                    g(canvas);
                }
            } catch (Throwable unused2) {
                AbstractC4599c.f38302a.getClass();
            }
        } else if (this.f3680P) {
            m(canvas, c4499b);
        } else {
            g(canvas);
        }
        this.f3694q0 = false;
        if (z3) {
            semaphore.release();
            if (c4499b.f37382K == choreographerFrameCallbackC4601e.h()) {
                return;
            }
            threadPoolExecutor.execute(sVar);
        }
    }

    public final void e() {
        i iVar = this.f3690n;
        if (iVar == null) {
            return;
        }
        F f3 = this.f3679O;
        int i = Build.VERSION.SDK_INT;
        boolean z3 = iVar.f3626o;
        int i6 = iVar.f3627p;
        int ordinal = f3.ordinal();
        boolean z6 = false;
        if (ordinal != 1 && (ordinal == 2 || ((z3 && i < 28) || i6 > 4 || i <= 25))) {
            z6 = true;
        }
        this.f3680P = z6;
    }

    public final void g(Canvas canvas) {
        C4499b c4499b = this.f3673H;
        i iVar = this.f3690n;
        if (c4499b == null || iVar == null) {
            return;
        }
        Matrix matrix = this.f3681Q;
        matrix.reset();
        if (!getBounds().isEmpty()) {
            matrix.preTranslate(r3.left, r3.top);
            matrix.preScale(r3.width() / iVar.f3622k.width(), r3.height() / iVar.f3622k.height());
        }
        c4499b.g(canvas, matrix, this.f3674I, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f3674I;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        i iVar = this.f3690n;
        if (iVar == null) {
            return -1;
        }
        return iVar.f3622k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        i iVar = this.f3690n;
        if (iVar == null) {
            return -1;
        }
        return iVar.f3622k.width();
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

    public final N i() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f3667B == null) {
            N n9 = new N(getCallback());
            this.f3667B = n9;
            String str = this.f3669D;
            if (str != null) {
                n9.f305y = str;
            }
        }
        return this.f3667B;
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
        if (this.f3694q0) {
            return;
        }
        this.f3694q0 = true;
        if ((!f3664y0 || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ChoreographerFrameCallbackC4601e choreographerFrameCallbackC4601e = this.f3698u;
        if (choreographerFrameCallbackC4601e == null) {
            return false;
        }
        return choreographerFrameCallbackC4601e.f38312F;
    }

    public final void k() {
        this.f3706y.clear();
        ChoreographerFrameCallbackC4601e choreographerFrameCallbackC4601e = this.f3698u;
        choreographerFrameCallbackC4601e.n(true);
        Iterator it = choreographerFrameCallbackC4601e.f38316v.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(choreographerFrameCallbackC4601e);
        }
        if (isVisible()) {
            return;
        }
        this.f3705x0 = 1;
    }

    public final void l() {
        if (this.f3673H == null) {
            this.f3706y.add(new t(this, 1));
            return;
        }
        e();
        boolean b9 = b(h());
        ChoreographerFrameCallbackC4601e choreographerFrameCallbackC4601e = this.f3698u;
        if (b9 || choreographerFrameCallbackC4601e.getRepeatCount() == 0) {
            if (isVisible()) {
                choreographerFrameCallbackC4601e.f38312F = true;
                boolean k9 = choreographerFrameCallbackC4601e.k();
                Iterator it = choreographerFrameCallbackC4601e.f38315u.iterator();
                while (it.hasNext()) {
                    Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
                    if (Build.VERSION.SDK_INT >= 26) {
                        animatorListener.onAnimationStart(choreographerFrameCallbackC4601e, k9);
                    } else {
                        animatorListener.onAnimationStart(choreographerFrameCallbackC4601e);
                    }
                }
                choreographerFrameCallbackC4601e.o((int) (choreographerFrameCallbackC4601e.k() ? choreographerFrameCallbackC4601e.i() : choreographerFrameCallbackC4601e.j()));
                choreographerFrameCallbackC4601e.f38319y = 0L;
                choreographerFrameCallbackC4601e.f38308B = 0;
                if (choreographerFrameCallbackC4601e.f38312F) {
                    choreographerFrameCallbackC4601e.n(false);
                    Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC4601e);
                }
                this.f3705x0 = 1;
            } else {
                this.f3705x0 = 2;
            }
        }
        if (b(h())) {
            return;
        }
        Iterator it2 = f3665z0.iterator();
        c1.h hVar = null;
        while (it2.hasNext()) {
            hVar = this.f3690n.d((String) it2.next());
            if (hVar != null) {
                break;
            }
        }
        if (hVar != null) {
            o((int) hVar.f5524b);
        } else {
            o((int) (choreographerFrameCallbackC4601e.f38317w < 0.0f ? choreographerFrameCallbackC4601e.j() : choreographerFrameCallbackC4601e.i()));
        }
        choreographerFrameCallbackC4601e.n(true);
        choreographerFrameCallbackC4601e.l(choreographerFrameCallbackC4601e.k());
        if (isVisible()) {
            return;
        }
        this.f3705x0 = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(Canvas canvas, C4499b c4499b) {
        boolean z3;
        RectF rectF;
        if (this.f3690n == null || c4499b == null) {
            return;
        }
        if (this.f3683S == null) {
            this.f3683S = new Canvas();
            this.f3689Z = new RectF();
            this.f3691n0 = new Matrix();
            this.f3693p0 = new Matrix();
            this.f3684T = new Rect();
            this.f3685U = new RectF();
            this.f3686V = new Y0.a();
            this.f3687W = new Rect();
            this.f3688X = new Rect();
            this.Y = new RectF();
        }
        canvas.getMatrix(this.f3691n0);
        canvas.getClipBounds(this.f3684T);
        Rect rect = this.f3684T;
        this.f3685U.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f3691n0.mapRect(this.f3685U);
        f(this.f3684T, this.f3685U);
        if (this.f3672G) {
            this.f3689Z.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            c4499b.c(this.f3689Z, null, false);
        }
        this.f3691n0.mapRect(this.f3689Z);
        Rect bounds = getBounds();
        float width = bounds.width() / getIntrinsicWidth();
        float height = bounds.height() / getIntrinsicHeight();
        RectF rectF2 = this.f3689Z;
        rectF2.set(rectF2.left * width, rectF2.top * height, rectF2.right * width, rectF2.bottom * height);
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ViewParent parent = ((View) callback).getParent();
            if (parent instanceof ViewGroup) {
                z3 = !((ViewGroup) parent).getClipChildren();
                if (!z3) {
                    RectF rectF3 = this.f3689Z;
                    Rect rect2 = this.f3684T;
                    rectF3.intersect(rect2.left, rect2.top, rect2.right, rect2.bottom);
                }
                rectF = this.f3689Z;
                if (!j(rectF.left) && j(rectF.top) && j(rectF.right) && j(rectF.bottom)) {
                    AbstractC4599c.b("Skipping software rendering: transformed bounds contain non-finite values.");
                    return;
                }
                int ceil = (int) Math.ceil(this.f3689Z.width());
                int ceil2 = (int) Math.ceil(this.f3689Z.height());
                if (ceil <= 0 || ceil2 <= 0) {
                    AbstractC4599c.b("Skipping software rendering: transformed bounds have negative values.");
                    return;
                }
                long j6 = ceil * ceil2;
                if (j6 > 50000000) {
                    AbstractC4599c.b("Skipping software rendering: bitmap request exceeds safe pixel count (" + j6 + ")");
                    return;
                }
                Bitmap bitmap = this.f3682R;
                if (bitmap == null || bitmap.getWidth() < ceil || this.f3682R.getHeight() < ceil2) {
                    Bitmap createBitmap = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                    this.f3682R = createBitmap;
                    this.f3683S.setBitmap(createBitmap);
                    this.f3694q0 = true;
                } else if (this.f3682R.getWidth() > ceil || this.f3682R.getHeight() > ceil2) {
                    Bitmap createBitmap2 = Bitmap.createBitmap(this.f3682R, 0, 0, ceil, ceil2);
                    this.f3682R = createBitmap2;
                    this.f3683S.setBitmap(createBitmap2);
                    this.f3694q0 = true;
                }
                if (this.f3694q0) {
                    Matrix matrix = this.f3691n0;
                    float[] fArr = this.f3692o0;
                    matrix.getValues(fArr);
                    float f3 = fArr[0];
                    float f9 = fArr[4];
                    Matrix matrix2 = this.f3681Q;
                    matrix2.set(this.f3691n0);
                    matrix2.preScale(width, height);
                    RectF rectF4 = this.f3689Z;
                    matrix2.postTranslate(-rectF4.left, -rectF4.top);
                    matrix2.postScale(1.0f / f3, 1.0f / f9);
                    this.f3682R.eraseColor(0);
                    this.f3683S.setMatrix(j1.j.f38350a);
                    this.f3683S.scale(f3, f9);
                    c4499b.g(this.f3683S, matrix2, this.f3674I, null);
                    this.f3691n0.invert(this.f3693p0);
                    this.f3693p0.mapRect(this.Y, this.f3689Z);
                    f(this.f3688X, this.Y);
                }
                this.f3687W.set(0, 0, ceil, ceil2);
                canvas.drawBitmap(this.f3682R, this.f3687W, this.f3688X, this.f3686V);
                return;
            }
        }
        z3 = false;
        if (!z3) {
        }
        rectF = this.f3689Z;
        if (!j(rectF.left) && j(rectF.top) && j(rectF.right) && j(rectF.bottom)) {
        }
    }

    public final void n() {
        if (this.f3673H == null) {
            this.f3706y.add(new t(this, 0));
            return;
        }
        e();
        boolean b9 = b(h());
        ChoreographerFrameCallbackC4601e choreographerFrameCallbackC4601e = this.f3698u;
        if (b9 || choreographerFrameCallbackC4601e.getRepeatCount() == 0) {
            if (isVisible()) {
                choreographerFrameCallbackC4601e.f38312F = true;
                choreographerFrameCallbackC4601e.n(false);
                Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC4601e);
                choreographerFrameCallbackC4601e.f38319y = 0L;
                if (choreographerFrameCallbackC4601e.k() && choreographerFrameCallbackC4601e.f38307A == choreographerFrameCallbackC4601e.j()) {
                    choreographerFrameCallbackC4601e.o(choreographerFrameCallbackC4601e.i());
                } else if (!choreographerFrameCallbackC4601e.k() && choreographerFrameCallbackC4601e.f38307A == choreographerFrameCallbackC4601e.i()) {
                    choreographerFrameCallbackC4601e.o(choreographerFrameCallbackC4601e.j());
                }
                Iterator it = choreographerFrameCallbackC4601e.f38316v.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(choreographerFrameCallbackC4601e);
                }
                this.f3705x0 = 1;
            } else {
                this.f3705x0 = 3;
            }
        }
        if (b(h())) {
            return;
        }
        o((int) (choreographerFrameCallbackC4601e.f38317w < 0.0f ? choreographerFrameCallbackC4601e.j() : choreographerFrameCallbackC4601e.i()));
        choreographerFrameCallbackC4601e.n(true);
        choreographerFrameCallbackC4601e.l(choreographerFrameCallbackC4601e.k());
        if (isVisible()) {
            return;
        }
        this.f3705x0 = 1;
    }

    public final void o(int i) {
        if (this.f3690n == null) {
            this.f3706y.add(new o(this, i, 2));
        } else {
            this.f3698u.o(i);
        }
    }

    public final void p(int i) {
        if (this.f3690n == null) {
            this.f3706y.add(new o(this, i, 0));
            return;
        }
        ChoreographerFrameCallbackC4601e choreographerFrameCallbackC4601e = this.f3698u;
        choreographerFrameCallbackC4601e.p(choreographerFrameCallbackC4601e.f38309C, i + 0.99f);
    }

    public final void q(String str) {
        i iVar = this.f3690n;
        if (iVar == null) {
            this.f3706y.add(new n(this, str, 1));
            return;
        }
        c1.h d2 = iVar.d(str);
        if (d2 == null) {
            throw new IllegalArgumentException(D.y.o("Cannot find marker with name ", str, com.anythink.core.common.d.j.f12378z));
        }
        p((int) (d2.f5524b + d2.f5525c));
    }

    public final void r(String str) {
        i iVar = this.f3690n;
        ArrayList arrayList = this.f3706y;
        if (iVar == null) {
            arrayList.add(new n(this, str, 0));
            return;
        }
        c1.h d2 = iVar.d(str);
        if (d2 == null) {
            throw new IllegalArgumentException(D.y.o("Cannot find marker with name ", str, com.anythink.core.common.d.j.f12378z));
        }
        int i = (int) d2.f5524b;
        int i6 = ((int) d2.f5525c) + i;
        if (this.f3690n == null) {
            arrayList.add(new r(this, i, i6));
        } else {
            this.f3698u.p(i, i6 + 0.99f);
        }
    }

    public final void s(int i) {
        if (this.f3690n == null) {
            this.f3706y.add(new o(this, i, 1));
        } else {
            this.f3698u.p(i, (int) r0.f38310D);
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
        this.f3674I = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        AbstractC4599c.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z6) {
        boolean isVisible = isVisible();
        boolean visible = super.setVisible(z3, z6);
        if (z3) {
            int i = this.f3705x0;
            if (i == 2) {
                l();
                return visible;
            }
            if (i == 3) {
                n();
                return visible;
            }
        } else {
            if (this.f3698u.f38312F) {
                k();
                this.f3705x0 = 3;
                return visible;
            }
            if (isVisible) {
                this.f3705x0 = 1;
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
        this.f3706y.clear();
        ChoreographerFrameCallbackC4601e choreographerFrameCallbackC4601e = this.f3698u;
        choreographerFrameCallbackC4601e.n(true);
        choreographerFrameCallbackC4601e.l(choreographerFrameCallbackC4601e.k());
        if (isVisible()) {
            return;
        }
        this.f3705x0 = 1;
    }

    public final void t(String str) {
        i iVar = this.f3690n;
        if (iVar == null) {
            this.f3706y.add(new n(this, str, 2));
            return;
        }
        c1.h d2 = iVar.d(str);
        if (d2 == null) {
            throw new IllegalArgumentException(D.y.o("Cannot find marker with name ", str, com.anythink.core.common.d.j.f12378z));
        }
        s((int) d2.f5524b);
    }

    public final void u(float f3) {
        i iVar = this.f3690n;
        if (iVar == null) {
            this.f3706y.add(new q(this, f3, 2));
        } else {
            this.f3698u.o(AbstractC4603g.f(iVar.f3623l, iVar.f3624m, f3));
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
