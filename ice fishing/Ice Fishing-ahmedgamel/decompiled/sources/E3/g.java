package E3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import g1.C4523c;
import java.util.BitSet;
import java.util.Objects;
import w3.AbstractC5150a;
import x3.C5196a;

/* loaded from: classes2.dex */
public class g extends Drawable implements v {

    /* renamed from: P, reason: collision with root package name */
    public static final Paint f751P;

    /* renamed from: A, reason: collision with root package name */
    public final Path f752A;

    /* renamed from: B, reason: collision with root package name */
    public final RectF f753B;

    /* renamed from: C, reason: collision with root package name */
    public final RectF f754C;

    /* renamed from: D, reason: collision with root package name */
    public final Region f755D;

    /* renamed from: E, reason: collision with root package name */
    public final Region f756E;

    /* renamed from: F, reason: collision with root package name */
    public k f757F;

    /* renamed from: G, reason: collision with root package name */
    public final Paint f758G;

    /* renamed from: H, reason: collision with root package name */
    public final Paint f759H;

    /* renamed from: I, reason: collision with root package name */
    public final D3.a f760I;
    public final C4523c J;

    /* renamed from: K, reason: collision with root package name */
    public final m f761K;

    /* renamed from: L, reason: collision with root package name */
    public PorterDuffColorFilter f762L;

    /* renamed from: M, reason: collision with root package name */
    public PorterDuffColorFilter f763M;

    /* renamed from: N, reason: collision with root package name */
    public final RectF f764N;

    /* renamed from: O, reason: collision with root package name */
    public final boolean f765O;

    /* renamed from: n, reason: collision with root package name */
    public f f766n;

    /* renamed from: u, reason: collision with root package name */
    public final t[] f767u;

    /* renamed from: v, reason: collision with root package name */
    public final t[] f768v;

    /* renamed from: w, reason: collision with root package name */
    public final BitSet f769w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f770x;

    /* renamed from: y, reason: collision with root package name */
    public final Matrix f771y;

    /* renamed from: z, reason: collision with root package name */
    public final Path f772z;

    static {
        Paint paint = new Paint(1);
        f751P = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public final void a(RectF rectF, Path path) {
        f fVar = this.f766n;
        this.f761K.a(fVar.f736a, fVar.i, rectF, this.J, path);
        if (this.f766n.f743h != 1.0f) {
            Matrix matrix = this.f771y;
            matrix.reset();
            float f3 = this.f766n.f743h;
            matrix.setScale(f3, f3, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f764N, true);
    }

    public final int b(int i) {
        int i6;
        f fVar = this.f766n;
        float f3 = fVar.f747m + 0.0f + fVar.f746l;
        C5196a c5196a = fVar.f737b;
        if (c5196a == null || !c5196a.f41769a || G.c.d(i, com.anythink.basead.exoplayer.k.p.f8473b) != c5196a.f41772d) {
            return i;
        }
        float min = (c5196a.f41773e <= 0.0f || f3 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f3 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int r9 = V2.a.r(G.c.d(i, com.anythink.basead.exoplayer.k.p.f8473b), c5196a.f41770b, min);
        if (min > 0.0f && (i6 = c5196a.f41771c) != 0) {
            r9 = G.c.b(G.c.d(i6, C5196a.f41768f), r9);
        }
        return G.c.d(r9, alpha);
    }

    public final void c(Canvas canvas) {
        if (this.f769w.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f766n.f749o;
        Path path = this.f772z;
        D3.a aVar = this.f760I;
        if (i != 0) {
            canvas.drawPath(path, aVar.f638a);
        }
        for (int i6 = 0; i6 < 4; i6++) {
            t tVar = this.f767u[i6];
            int i9 = this.f766n.f748n;
            Matrix matrix = t.f825b;
            tVar.a(matrix, aVar, i9, canvas);
            this.f768v[i6].a(matrix, aVar, this.f766n.f748n, canvas);
        }
        if (this.f765O) {
            double d2 = 0;
            int sin = (int) (Math.sin(Math.toRadians(d2)) * this.f766n.f749o);
            int cos = (int) (Math.cos(Math.toRadians(d2)) * this.f766n.f749o);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f751P);
            canvas.translate(sin, cos);
        }
    }

    public final void d(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a9 = kVar.f790f.a(rectF) * this.f766n.i;
            canvas.drawRoundRect(rectF, a9, a9, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f758G;
        paint.setColorFilter(this.f762L);
        int alpha = paint.getAlpha();
        int i = this.f766n.f745k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f759H;
        paint2.setColorFilter(this.f763M);
        paint2.setStrokeWidth(this.f766n.f744j);
        int alpha2 = paint2.getAlpha();
        int i6 = this.f766n.f745k;
        paint2.setAlpha(((i6 + (i6 >>> 7)) * alpha2) >>> 8);
        boolean z3 = this.f770x;
        Path path = this.f772z;
        if (z3) {
            float f3 = -(g() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            k kVar = this.f766n.f736a;
            j e9 = kVar.e();
            c cVar = kVar.f789e;
            if (!(cVar instanceof h)) {
                cVar = new b(f3, cVar);
            }
            e9.f778e = cVar;
            c cVar2 = kVar.f790f;
            if (!(cVar2 instanceof h)) {
                cVar2 = new b(f3, cVar2);
            }
            e9.f779f = cVar2;
            c cVar3 = kVar.f792h;
            if (!(cVar3 instanceof h)) {
                cVar3 = new b(f3, cVar3);
            }
            e9.f781h = cVar3;
            c cVar4 = kVar.f791g;
            if (!(cVar4 instanceof h)) {
                cVar4 = new b(f3, cVar4);
            }
            e9.f780g = cVar4;
            k a9 = e9.a();
            this.f757F = a9;
            float f9 = this.f766n.i;
            RectF rectF = this.f754C;
            rectF.set(f());
            float strokeWidth = g() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f761K.a(a9, f9, rectF, null, this.f752A);
            a(f(), path);
            this.f770x = false;
        }
        f fVar = this.f766n;
        fVar.getClass();
        if (fVar.f748n > 0) {
            int i9 = Build.VERSION.SDK_INT;
            if (!this.f766n.f736a.d(f()) && !path.isConvex() && i9 < 29) {
                canvas.save();
                double d2 = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d2)) * this.f766n.f749o), (int) (Math.cos(Math.toRadians(d2)) * this.f766n.f749o));
                if (this.f765O) {
                    RectF rectF2 = this.f764N;
                    int width = (int) (rectF2.width() - getBounds().width());
                    int height = (int) (rectF2.height() - getBounds().height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.f766n.f748n * 2) + ((int) rectF2.width()) + width, (this.f766n.f748n * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f10 = (getBounds().left - this.f766n.f748n) - width;
                    float f11 = (getBounds().top - this.f766n.f748n) - height;
                    canvas2.translate(-f10, -f11);
                    c(canvas2);
                    canvas.drawBitmap(createBitmap, f10, f11, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                } else {
                    c(canvas);
                    canvas.restore();
                }
            }
        }
        f fVar2 = this.f766n;
        Paint.Style style = fVar2.f750p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            d(canvas, paint, path, fVar2.f736a, f());
        }
        if (g()) {
            e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public void e(Canvas canvas) {
        Paint paint = this.f759H;
        Path path = this.f752A;
        k kVar = this.f757F;
        RectF rectF = this.f754C;
        rectF.set(f());
        float strokeWidth = g() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        d(canvas, paint, path, kVar, rectF);
    }

    public final RectF f() {
        RectF rectF = this.f753B;
        rectF.set(getBounds());
        return rectF;
    }

    public final boolean g() {
        Paint.Style style = this.f766n.f750p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f759H.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f766n.f745k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f766n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f766n.getClass();
        if (this.f766n.f736a.d(f())) {
            outline.setRoundRect(getBounds(), this.f766n.f736a.f789e.a(f()) * this.f766n.i);
            return;
        }
        RectF f3 = f();
        Path path = this.f772z;
        a(f3, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            w3.b.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                AbstractC5150a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            AbstractC5150a.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f766n.f742g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f755D;
        region.set(bounds);
        RectF f3 = f();
        Path path = this.f772z;
        a(f3, path);
        Region region2 = this.f756E;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.f766n.f737b = new C5196a(context);
        m();
    }

    public final void i(float f3) {
        f fVar = this.f766n;
        if (fVar.f747m != f3) {
            fVar.f747m = f3;
            m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f770x = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f766n.f740e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f766n.getClass();
        ColorStateList colorStateList2 = this.f766n.f739d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f766n.f738c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    public final void j(ColorStateList colorStateList) {
        f fVar = this.f766n;
        if (fVar.f738c != colorStateList) {
            fVar.f738c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean k(int[] iArr) {
        boolean z3;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f766n.f738c == null || color2 == (colorForState2 = this.f766n.f738c.getColorForState(iArr, (color2 = (paint2 = this.f758G).getColor())))) {
            z3 = false;
        } else {
            paint2.setColor(colorForState2);
            z3 = true;
        }
        if (this.f766n.f739d == null || color == (colorForState = this.f766n.f739d.getColorForState(iArr, (color = (paint = this.f759H).getColor())))) {
            return z3;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f762L;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f763M;
        f fVar = this.f766n;
        ColorStateList colorStateList = fVar.f740e;
        PorterDuff.Mode mode = fVar.f741f;
        Paint paint = this.f758G;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int b9 = b(color);
            porterDuffColorFilter = b9 != color ? new PorterDuffColorFilter(b9, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f762L = porterDuffColorFilter;
        this.f766n.getClass();
        this.f763M = null;
        this.f766n.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f762L) && Objects.equals(porterDuffColorFilter3, this.f763M)) ? false : true;
    }

    public final void m() {
        f fVar = this.f766n;
        float f3 = fVar.f747m + 0.0f;
        fVar.f748n = (int) Math.ceil(0.75f * f3);
        this.f766n.f749o = (int) Math.ceil(f3 * 0.25f);
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f766n = new f(this.f766n);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f770x = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z3 = k(iArr) || l();
        if (z3) {
            invalidateSelf();
        }
        return z3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        f fVar = this.f766n;
        if (fVar.f745k != i) {
            fVar.f745k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f766n.getClass();
        super.invalidateSelf();
    }

    @Override // E3.v
    public final void setShapeAppearanceModel(k kVar) {
        this.f766n.f736a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f766n.f740e = colorStateList;
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f766n;
        if (fVar.f741f != mode) {
            fVar.f741f = mode;
            l();
            super.invalidateSelf();
        }
    }

    public g(Context context, AttributeSet attributeSet, int i, int i6) {
        this(k.b(context, attributeSet, i, i6).a());
    }

    public g(k kVar) {
        this(new f(kVar));
    }

    public g(f fVar) {
        m mVar;
        this.f767u = new t[4];
        this.f768v = new t[4];
        this.f769w = new BitSet(8);
        this.f771y = new Matrix();
        this.f772z = new Path();
        this.f752A = new Path();
        this.f753B = new RectF();
        this.f754C = new RectF();
        this.f755D = new Region();
        this.f756E = new Region();
        Paint paint = new Paint(1);
        this.f758G = paint;
        Paint paint2 = new Paint(1);
        this.f759H = paint2;
        this.f760I = new D3.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.f796a;
        } else {
            mVar = new m();
        }
        this.f761K = mVar;
        this.f764N = new RectF();
        this.f765O = true;
        this.f766n = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.J = new C4523c(4, this);
    }
}
