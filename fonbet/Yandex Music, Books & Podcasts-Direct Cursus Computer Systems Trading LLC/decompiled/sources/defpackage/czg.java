package defpackage;

import android.animation.Animator;
import android.app.Application;
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
import android.text.TextUtils;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
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
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class czg extends Drawable implements Drawable.Callback, Animatable {
    public static final List A0;
    public static final ThreadPoolExecutor B0;
    public static final boolean z0;
    public Rect A;
    public RectF B;
    public pif C;
    public Rect D;
    public Rect E;
    public RectF F;
    public RectF G;
    public Matrix H;
    public final float[] I;
    public Matrix J;
    public boolean K;
    public pt1 L;
    public final hr2 X;
    public final Semaphore Y;
    public Handler Z;
    public ayg a;
    public final rzg b;
    public final boolean c;
    public boolean d;
    public boolean e;
    public final ArrayList f;
    public osh g;
    public String h;
    public dn9 i;
    public Map j;
    public String k;
    public final n7b l;
    public boolean m;
    public boolean n;
    public xr5 o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public wwn v;
    public yyg v0;
    public boolean w;
    public final yyg w0;
    public final Matrix x;
    public float x0;
    public Bitmap y;
    public int y0;
    public Canvas z;

    static {
        z0 = Build.VERSION.SDK_INT <= 25;
        A0 = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        B0 = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new qzg());
    }

    public czg() {
        rzg rzgVar = new rzg();
        rzgVar.d = 1.0f;
        rzgVar.e = false;
        rzgVar.f = 0L;
        rzgVar.g = 0.0f;
        rzgVar.h = 0.0f;
        rzgVar.i = 0;
        rzgVar.j = -2.1474836E9f;
        rzgVar.k = 2.1474836E9f;
        rzgVar.m = false;
        rzgVar.n = false;
        this.b = rzgVar;
        this.c = true;
        this.d = false;
        this.e = false;
        this.y0 = 1;
        this.f = new ArrayList();
        this.l = new n7b(12);
        this.m = false;
        this.n = true;
        this.p = KotlinVersion.MAX_COMPONENT_VALUE;
        this.u = false;
        this.v = wwn.a;
        this.w = false;
        this.x = new Matrix();
        this.I = new float[9];
        this.K = false;
        hr2 hr2Var = new hr2(9, this);
        this.X = hr2Var;
        this.Y = new Semaphore(1);
        this.w0 = new yyg(this, 1);
        this.x0 = -3.4028235E38f;
        rzgVar.addUpdateListener(hr2Var);
    }

    public static void f(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public static boolean l(float f) {
        return (Float.isNaN(f) || Float.isInfinite(f)) ? false : true;
    }

    public final void A(String str) {
        ayg aygVar = this.a;
        if (aygVar == null) {
            this.f.add(new syg(this, str, 2));
            return;
        }
        dbh d = aygVar.d(str);
        if (d != null) {
            z((int) d.b);
        } else {
            xq0.x(hrg.q("Cannot find marker with name ", str, "."));
        }
    }

    public final void B(float f) {
        ayg aygVar = this.a;
        if (aygVar == null) {
            this.f.add(new xyg(this, f, 2));
        } else {
            this.b.j(y5i.f(aygVar.l, aygVar.m, f));
        }
    }

    public final boolean C() {
        ayg aygVar = this.a;
        if (aygVar == null) {
            return false;
        }
        float f = this.x0;
        float e = this.b.e();
        this.x0 = e;
        return Math.abs(e - f) * aygVar.b() >= 50.0f;
    }

    public final void a(final abf abfVar, final Object obj, final szg szgVar) {
        xr5 xr5Var = this.o;
        if (xr5Var == null) {
            this.f.add(new bzg() { // from class: wyg
                @Override // defpackage.bzg
                public final void run() {
                    czg.this.a(abfVar, obj, szgVar);
                }
            });
            return;
        }
        boolean z = true;
        if (abfVar == abf.c) {
            xr5Var.f(szgVar, obj);
        } else {
            bbf bbfVar = abfVar.b;
            if (bbfVar != null) {
                bbfVar.f(szgVar, obj);
            } else {
                List p = p(abfVar);
                for (int i = 0; i < p.size(); i++) {
                    ((abf) p.get(i)).b.f(szgVar, obj);
                }
                z = true ^ p.isEmpty();
            }
        }
        if (z) {
            invalidateSelf();
            if (obj == lzg.C) {
                B(this.b.e());
            }
        }
    }

    public final boolean b(Context context) {
        if (this.d) {
            return true;
        }
        if (!this.c) {
            return false;
        }
        if (context == null) {
            return true;
        }
        Matrix matrix = rvt.a;
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
    }

    public final void c() {
        ayg aygVar = this.a;
        if (aygVar == null) {
            return;
        }
        j6e j6eVar = kof.a;
        Rect rect = aygVar.k;
        List list = Collections.EMPTY_LIST;
        xr5 xr5Var = new xr5(this, new iof(list, aygVar, "__container", -1L, 1, -1L, null, list, new mk0(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, 1, null, false, null, null, 1), aygVar.j, aygVar);
        this.o = xr5Var;
        if (this.r) {
            xr5Var.p(true);
        }
        this.o.N = this.n;
    }

    public final void d() {
        rzg rzgVar = this.b;
        if (rzgVar.m) {
            rzgVar.cancel();
            if (!isVisible()) {
                this.y0 = 1;
            }
        }
        this.a = null;
        this.o = null;
        this.g = null;
        this.x0 = -3.4028235E38f;
        rzgVar.l = null;
        rzgVar.j = -2.1474836E9f;
        rzgVar.k = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        xr5 xr5Var = this.o;
        if (xr5Var == null) {
            return;
        }
        pt1 pt1Var = this.L;
        if (pt1Var == null) {
            pt1Var = pt1.a;
        }
        boolean z = pt1Var == pt1.b;
        yyg yygVar = this.w0;
        ThreadPoolExecutor threadPoolExecutor = B0;
        rzg rzgVar = this.b;
        Semaphore semaphore = this.Y;
        if (z) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                if (!z) {
                    return;
                }
                semaphore.release();
                if (xr5Var.M == rzgVar.e()) {
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    semaphore.release();
                    if (xr5Var.M != rzgVar.e()) {
                        threadPoolExecutor.execute(yygVar);
                    }
                }
                throw th;
            }
        }
        if (z && C()) {
            B(rzgVar.e());
        }
        boolean z2 = this.e;
        boolean z3 = this.w;
        if (z2) {
            try {
                if (z3) {
                    o(canvas, xr5Var);
                } else {
                    g(canvas);
                }
            } catch (Throwable unused2) {
                psg.a.getClass();
            }
        } else if (z3) {
            o(canvas, xr5Var);
        } else {
            g(canvas);
        }
        this.K = false;
        if (z) {
            semaphore.release();
            if (xr5Var.M == rzgVar.e()) {
                return;
            }
            threadPoolExecutor.execute(yygVar);
        }
    }

    public final void e() {
        ayg aygVar = this.a;
        if (aygVar == null) {
            return;
        }
        wwn wwnVar = this.v;
        int i = Build.VERSION.SDK_INT;
        boolean z = aygVar.o;
        int i2 = aygVar.p;
        int ordinal = wwnVar.ordinal();
        boolean z2 = false;
        if (ordinal != 1 && (ordinal == 2 || ((z && i < 28) || i2 > 4 || i <= 25))) {
            z2 = true;
        }
        this.w = z2;
    }

    public final void g(Canvas canvas) {
        xr5 xr5Var = this.o;
        ayg aygVar = this.a;
        if (xr5Var == null || aygVar == null) {
            return;
        }
        Matrix matrix = this.x;
        matrix.reset();
        if (!getBounds().isEmpty()) {
            matrix.preTranslate(r3.left, r3.top);
            matrix.preScale(r3.width() / aygVar.k.width(), r3.height() / aygVar.k.height());
        }
        xr5Var.g(canvas, matrix, this.p, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        ayg aygVar = this.a;
        if (aygVar == null) {
            return -1;
        }
        return aygVar.k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        ayg aygVar = this.a;
        if (aygVar == null) {
            return -1;
        }
        return aygVar.k.width();
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

    public final dn9 i() {
        if (getCallback() == null) {
            return null;
        }
        if (this.i == null) {
            dn9 dn9Var = new dn9(getCallback());
            this.i = dn9Var;
            String str = this.k;
            if (str != null) {
                dn9Var.f = str;
            }
        }
        return this.i;
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
        if (this.K) {
            return;
        }
        this.K = true;
        if ((!z0 || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r1 == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        r6.g = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final osh j() {
        osh oshVar = this.g;
        if (oshVar != null) {
            Context h = h();
            Context context = (Context) oshVar.a;
            if (h != null) {
                if (context instanceof Application) {
                    h = h.getApplicationContext();
                }
            }
        }
        if (this.g == null) {
            Drawable.Callback callback = getCallback();
            String str = this.h;
            Map c = this.a.c();
            osh oshVar2 = new osh();
            if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
                oshVar2.b = str;
            } else {
                oshVar2.b = str.concat("/");
            }
            oshVar2.c = c;
            if (callback instanceof View) {
                oshVar2.a = ((View) callback).getContext().getApplicationContext();
            } else {
                oshVar2.a = null;
            }
            this.g = oshVar2;
        }
        return this.g;
    }

    public final boolean k() {
        rzg rzgVar = this.b;
        if (rzgVar == null) {
            return false;
        }
        return rzgVar.m;
    }

    public final void m() {
        this.f.clear();
        rzg rzgVar = this.b;
        rzgVar.i(true);
        Iterator it = rzgVar.c.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(rzgVar);
        }
        if (isVisible()) {
            return;
        }
        this.y0 = 1;
    }

    public final void n() {
        if (this.o == null) {
            this.f.add(new zyg(this, 1));
            return;
        }
        e();
        boolean b = b(h());
        rzg rzgVar = this.b;
        if (b || rzgVar.getRepeatCount() == 0) {
            if (isVisible()) {
                rzgVar.m = true;
                rzgVar.c(rzgVar.h());
                rzgVar.j((int) (rzgVar.h() ? rzgVar.f() : rzgVar.g()));
                rzgVar.f = 0L;
                rzgVar.i = 0;
                if (rzgVar.m) {
                    rzgVar.i(false);
                    Choreographer.getInstance().postFrameCallback(rzgVar);
                }
                this.y0 = 1;
            } else {
                this.y0 = 2;
            }
        }
        if (b(h())) {
            return;
        }
        Iterator it = A0.iterator();
        dbh dbhVar = null;
        while (it.hasNext()) {
            dbhVar = this.a.d((String) it.next());
            if (dbhVar != null) {
                break;
            }
        }
        if (dbhVar != null) {
            s((int) dbhVar.b);
        } else {
            s((int) (rzgVar.d < 0.0f ? rzgVar.g() : rzgVar.f()));
        }
        rzgVar.i(true);
        rzgVar.b(rzgVar.h());
        if (isVisible()) {
            return;
        }
        this.y0 = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(Canvas canvas, xr5 xr5Var) {
        boolean z;
        RectF rectF;
        if (this.a == null || xr5Var == null) {
            return;
        }
        if (this.z == null) {
            this.z = new Canvas();
            this.G = new RectF();
            this.H = new Matrix();
            this.J = new Matrix();
            this.A = new Rect();
            this.B = new RectF();
            this.C = new pif();
            this.D = new Rect();
            this.E = new Rect();
            this.F = new RectF();
        }
        canvas.getMatrix(this.H);
        canvas.getClipBounds(this.A);
        Rect rect = this.A;
        this.B.set(rect.left, rect.top, rect.right, rect.bottom);
        this.H.mapRect(this.B);
        f(this.A, this.B);
        boolean z2 = this.n;
        RectF rectF2 = this.G;
        if (z2) {
            rectF2.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            xr5Var.d(rectF2, null, false);
        }
        this.H.mapRect(this.G);
        Rect bounds = getBounds();
        float width = bounds.width() / getIntrinsicWidth();
        float height = bounds.height() / getIntrinsicHeight();
        RectF rectF3 = this.G;
        rectF3.set(rectF3.left * width, rectF3.top * height, rectF3.right * width, rectF3.bottom * height);
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ViewParent parent = ((View) callback).getParent();
            if (parent instanceof ViewGroup) {
                z = !((ViewGroup) parent).getClipChildren();
                if (!z) {
                    RectF rectF4 = this.G;
                    Rect rect2 = this.A;
                    rectF4.intersect(rect2.left, rect2.top, rect2.right, rect2.bottom);
                }
                rectF = this.G;
                if (!l(rectF.left) && l(rectF.top) && l(rectF.right) && l(rectF.bottom)) {
                    psg.b("Skipping software rendering: transformed bounds contain non-finite values.");
                    return;
                }
                int ceil = (int) Math.ceil(this.G.width());
                int ceil2 = (int) Math.ceil(this.G.height());
                if (ceil <= 0 || ceil2 <= 0) {
                    psg.b("Skipping software rendering: transformed bounds have negative values.");
                    return;
                }
                long j = ceil * ceil2;
                if (j > 50000000) {
                    psg.b("Skipping software rendering: bitmap request exceeds safe pixel count (" + j + ")");
                    return;
                }
                Bitmap bitmap = this.y;
                if (bitmap == null || bitmap.getWidth() < ceil || this.y.getHeight() < ceil2) {
                    Bitmap createBitmap = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                    this.y = createBitmap;
                    this.z.setBitmap(createBitmap);
                    this.K = true;
                } else if (this.y.getWidth() > ceil || this.y.getHeight() > ceil2) {
                    Bitmap createBitmap2 = Bitmap.createBitmap(this.y, 0, 0, ceil, ceil2);
                    this.y = createBitmap2;
                    this.z.setBitmap(createBitmap2);
                    this.K = true;
                }
                if (this.K) {
                    Matrix matrix = this.H;
                    float[] fArr = this.I;
                    matrix.getValues(fArr);
                    float f = fArr[0];
                    float f2 = fArr[4];
                    Matrix matrix2 = this.H;
                    Matrix matrix3 = this.x;
                    matrix3.set(matrix2);
                    matrix3.preScale(width, height);
                    RectF rectF5 = this.G;
                    matrix3.postTranslate(-rectF5.left, -rectF5.top);
                    matrix3.postScale(1.0f / f, 1.0f / f2);
                    this.y.eraseColor(0);
                    this.z.setMatrix(rvt.a);
                    this.z.scale(f, f2);
                    xr5Var.g(this.z, matrix3, this.p, null);
                    this.H.invert(this.J);
                    this.J.mapRect(this.F, this.G);
                    f(this.E, this.F);
                }
                this.D.set(0, 0, ceil, ceil2);
                canvas.drawBitmap(this.y, this.D, this.E, this.C);
                return;
            }
        }
        z = false;
        if (!z) {
        }
        rectF = this.G;
        if (!l(rectF.left) && l(rectF.top) && l(rectF.right) && l(rectF.bottom)) {
        }
    }

    public final List p(abf abfVar) {
        if (this.o == null) {
            psg.b("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        this.o.c(abfVar, 0, arrayList, new abf(new String[0]));
        return arrayList;
    }

    public final void q() {
        if (this.o == null) {
            this.f.add(new zyg(this, 0));
            return;
        }
        e();
        boolean b = b(h());
        rzg rzgVar = this.b;
        if (b || rzgVar.getRepeatCount() == 0) {
            if (isVisible()) {
                rzgVar.m = true;
                rzgVar.i(false);
                Choreographer.getInstance().postFrameCallback(rzgVar);
                rzgVar.f = 0L;
                if (rzgVar.h() && rzgVar.h == rzgVar.g()) {
                    rzgVar.j(rzgVar.f());
                } else if (!rzgVar.h() && rzgVar.h == rzgVar.f()) {
                    rzgVar.j(rzgVar.g());
                }
                Iterator it = rzgVar.c.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(rzgVar);
                }
                this.y0 = 1;
            } else {
                this.y0 = 3;
            }
        }
        if (b(h())) {
            return;
        }
        s((int) (rzgVar.d < 0.0f ? rzgVar.g() : rzgVar.f()));
        rzgVar.i(true);
        rzgVar.b(rzgVar.h());
        if (isVisible()) {
            return;
        }
        this.y0 = 1;
    }

    public final boolean r(ayg aygVar) {
        if (this.a == aygVar) {
            return false;
        }
        this.K = true;
        d();
        this.a = aygVar;
        c();
        rzg rzgVar = this.b;
        boolean z = rzgVar.l == null;
        rzgVar.l = aygVar;
        if (z) {
            rzgVar.k(Math.max(rzgVar.j, aygVar.l), Math.min(rzgVar.k, aygVar.m));
        } else {
            rzgVar.k((int) aygVar.l, (int) aygVar.m);
        }
        float f = rzgVar.h;
        rzgVar.h = 0.0f;
        rzgVar.g = 0.0f;
        rzgVar.j((int) f);
        rzgVar.d();
        B(rzgVar.getAnimatedFraction());
        ArrayList arrayList = this.f;
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            bzg bzgVar = (bzg) it.next();
            if (bzgVar != null) {
                bzgVar.run();
            }
            it.remove();
        }
        arrayList.clear();
        aygVar.a.a = this.q;
        e();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public final void s(int i) {
        if (this.a != null) {
            this.b.j(i);
        } else {
            this.f.add(new tyg(this, i, 0));
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.p = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        psg.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean isVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            int i = this.y0;
            if (i == 2) {
                n();
                return visible;
            }
            if (i == 3) {
                q();
                return visible;
            }
        } else {
            if (this.b.m) {
                m();
                this.y0 = 3;
                return visible;
            }
            if (isVisible) {
                this.y0 = 1;
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
        n();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f.clear();
        rzg rzgVar = this.b;
        rzgVar.i(true);
        rzgVar.b(rzgVar.h());
        if (isVisible()) {
            return;
        }
        this.y0 = 1;
    }

    public final void t(int i) {
        if (this.a == null) {
            this.f.add(new tyg(this, i, 1));
        } else {
            rzg rzgVar = this.b;
            rzgVar.k(rzgVar.j, i + 0.99f);
        }
    }

    public final void u(String str) {
        ayg aygVar = this.a;
        if (aygVar == null) {
            this.f.add(new syg(this, str, 1));
            return;
        }
        dbh d = aygVar.d(str);
        if (d != null) {
            t((int) (d.b + d.c));
        } else {
            xq0.x(hrg.q("Cannot find marker with name ", str, "."));
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

    public final void v(final int i, final int i2) {
        if (this.a == null) {
            this.f.add(new bzg() { // from class: vyg
                @Override // defpackage.bzg
                public final void run() {
                    czg.this.v(i, i2);
                }
            });
        } else {
            this.b.k(i, i2 + 0.99f);
        }
    }

    public final void w(String str) {
        ayg aygVar = this.a;
        if (aygVar == null) {
            this.f.add(new syg(this, str, 0));
            return;
        }
        dbh d = aygVar.d(str);
        if (d == null) {
            xq0.x(hrg.q("Cannot find marker with name ", str, "."));
        } else {
            int i = (int) d.b;
            v(i, ((int) d.c) + i);
        }
    }

    public final void x(final String str, final String str2, final boolean z) {
        ayg aygVar = this.a;
        if (aygVar == null) {
            this.f.add(new bzg() { // from class: azg
                @Override // defpackage.bzg
                public final void run() {
                    czg.this.x(str, str2, z);
                }
            });
            return;
        }
        dbh d = aygVar.d(str);
        if (d == null) {
            xq0.x(hrg.q("Cannot find marker with name ", str, "."));
            return;
        }
        int i = (int) d.b;
        dbh d2 = this.a.d(str2);
        if (d2 != null) {
            v(i, (int) (d2.b + (z ? 1.0f : 0.0f)));
        } else {
            xq0.x(hrg.q("Cannot find marker with name ", str2, "."));
        }
    }

    public final void y(final float f, final float f2) {
        ayg aygVar = this.a;
        if (aygVar == null) {
            this.f.add(new bzg() { // from class: uyg
                @Override // defpackage.bzg
                public final void run() {
                    czg.this.y(f, f2);
                }
            });
        } else {
            int f3 = (int) y5i.f(aygVar.l, aygVar.m, f);
            ayg aygVar2 = this.a;
            v(f3, (int) y5i.f(aygVar2.l, aygVar2.m, f2));
        }
    }

    public final void z(int i) {
        if (this.a == null) {
            this.f.add(new tyg(this, i, 2));
        } else {
            this.b.k(i, (int) r0.k);
        }
    }
}
