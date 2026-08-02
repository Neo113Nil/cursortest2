package G3;

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
import i1.C4586c;
import java.util.BitSet;
import java.util.Objects;
import y3.AbstractC5207a;
import z3.C5232a;

/* loaded from: classes2.dex */
public class g extends Drawable implements v {

    /* renamed from: P, reason: collision with root package name */
    public static final Paint f1093P;

    /* renamed from: A, reason: collision with root package name */
    public final Path f1094A;

    /* renamed from: B, reason: collision with root package name */
    public final RectF f1095B;

    /* renamed from: C, reason: collision with root package name */
    public final RectF f1096C;

    /* renamed from: D, reason: collision with root package name */
    public final Region f1097D;

    /* renamed from: E, reason: collision with root package name */
    public final Region f1098E;

    /* renamed from: F, reason: collision with root package name */
    public k f1099F;

    /* renamed from: G, reason: collision with root package name */
    public final Paint f1100G;

    /* renamed from: H, reason: collision with root package name */
    public final Paint f1101H;

    /* renamed from: I, reason: collision with root package name */
    public final F3.a f1102I;
    public final C4586c J;

    /* renamed from: K, reason: collision with root package name */
    public final m f1103K;

    /* renamed from: L, reason: collision with root package name */
    public PorterDuffColorFilter f1104L;

    /* renamed from: M, reason: collision with root package name */
    public PorterDuffColorFilter f1105M;

    /* renamed from: N, reason: collision with root package name */
    public final RectF f1106N;

    /* renamed from: O, reason: collision with root package name */
    public final boolean f1107O;

    /* renamed from: n, reason: collision with root package name */
    public f f1108n;

    /* renamed from: u, reason: collision with root package name */
    public final t[] f1109u;

    /* renamed from: v, reason: collision with root package name */
    public final t[] f1110v;

    /* renamed from: w, reason: collision with root package name */
    public final BitSet f1111w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1112x;

    /* renamed from: y, reason: collision with root package name */
    public final Matrix f1113y;

    /* renamed from: z, reason: collision with root package name */
    public final Path f1114z;

    static {
        Paint paint = new Paint(1);
        f1093P = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public final void a(RectF rectF, Path path) {
        f fVar = this.f1108n;
        this.f1103K.a(fVar.f1078a, fVar.i, rectF, this.J, path);
        if (this.f1108n.f1085h != 1.0f) {
            Matrix matrix = this.f1113y;
            matrix.reset();
            float f2 = this.f1108n.f1085h;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f1106N, true);
    }

    public final int b(int i) {
        int i4;
        f fVar = this.f1108n;
        float f2 = fVar.f1089m + 0.0f + fVar.f1088l;
        C5232a c5232a = fVar.f1079b;
        if (c5232a == null || !c5232a.f42231a || G.c.d(i, com.anythink.basead.exoplayer.k.p.f9259b) != c5232a.f42234d) {
            return i;
        }
        float min = (c5232a.f42235e <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int l9 = Q3.b.l(G.c.d(i, com.anythink.basead.exoplayer.k.p.f9259b), c5232a.f42232b, min);
        if (min > 0.0f && (i4 = c5232a.f42233c) != 0) {
            l9 = G.c.b(G.c.d(i4, C5232a.f42230f), l9);
        }
        return G.c.d(l9, alpha);
    }

    public final void c(Canvas canvas) {
        if (this.f1111w.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f1108n.f1091o;
        Path path = this.f1114z;
        F3.a aVar = this.f1102I;
        if (i != 0) {
            canvas.drawPath(path, aVar.f982a);
        }
        for (int i4 = 0; i4 < 4; i4++) {
            t tVar = this.f1109u[i4];
            int i6 = this.f1108n.f1090n;
            Matrix matrix = t.f1167b;
            tVar.a(matrix, aVar, i6, canvas);
            this.f1110v[i4].a(matrix, aVar, this.f1108n.f1090n, canvas);
        }
        if (this.f1107O) {
            double d9 = 0;
            int sin = (int) (Math.sin(Math.toRadians(d9)) * this.f1108n.f1091o);
            int cos = (int) (Math.cos(Math.toRadians(d9)) * this.f1108n.f1091o);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f1093P);
            canvas.translate(sin, cos);
        }
    }

    public final void d(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a9 = kVar.f1132f.a(rectF) * this.f1108n.i;
            canvas.drawRoundRect(rectF, a9, a9, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f1100G;
        paint.setColorFilter(this.f1104L);
        int alpha = paint.getAlpha();
        int i = this.f1108n.f1087k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f1101H;
        paint2.setColorFilter(this.f1105M);
        paint2.setStrokeWidth(this.f1108n.f1086j);
        int alpha2 = paint2.getAlpha();
        int i4 = this.f1108n.f1087k;
        paint2.setAlpha(((i4 + (i4 >>> 7)) * alpha2) >>> 8);
        boolean z6 = this.f1112x;
        Path path = this.f1114z;
        if (z6) {
            float f2 = -(g() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            k kVar = this.f1108n.f1078a;
            j e9 = kVar.e();
            c cVar = kVar.f1131e;
            if (!(cVar instanceof h)) {
                cVar = new b(f2, cVar);
            }
            e9.f1120e = cVar;
            c cVar2 = kVar.f1132f;
            if (!(cVar2 instanceof h)) {
                cVar2 = new b(f2, cVar2);
            }
            e9.f1121f = cVar2;
            c cVar3 = kVar.f1134h;
            if (!(cVar3 instanceof h)) {
                cVar3 = new b(f2, cVar3);
            }
            e9.f1123h = cVar3;
            c cVar4 = kVar.f1133g;
            if (!(cVar4 instanceof h)) {
                cVar4 = new b(f2, cVar4);
            }
            e9.f1122g = cVar4;
            k a9 = e9.a();
            this.f1099F = a9;
            float f9 = this.f1108n.i;
            RectF rectF = this.f1096C;
            rectF.set(f());
            float strokeWidth = g() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f1103K.a(a9, f9, rectF, null, this.f1094A);
            a(f(), path);
            this.f1112x = false;
        }
        f fVar = this.f1108n;
        fVar.getClass();
        if (fVar.f1090n > 0) {
            int i6 = Build.VERSION.SDK_INT;
            if (!this.f1108n.f1078a.d(f()) && !path.isConvex() && i6 < 29) {
                canvas.save();
                double d9 = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d9)) * this.f1108n.f1091o), (int) (Math.cos(Math.toRadians(d9)) * this.f1108n.f1091o));
                if (this.f1107O) {
                    RectF rectF2 = this.f1106N;
                    int width = (int) (rectF2.width() - getBounds().width());
                    int height = (int) (rectF2.height() - getBounds().height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.f1108n.f1090n * 2) + ((int) rectF2.width()) + width, (this.f1108n.f1090n * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f10 = (getBounds().left - this.f1108n.f1090n) - width;
                    float f11 = (getBounds().top - this.f1108n.f1090n) - height;
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
        f fVar2 = this.f1108n;
        Paint.Style style = fVar2.f1092p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            d(canvas, paint, path, fVar2.f1078a, f());
        }
        if (g()) {
            e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public void e(Canvas canvas) {
        Paint paint = this.f1101H;
        Path path = this.f1094A;
        k kVar = this.f1099F;
        RectF rectF = this.f1096C;
        rectF.set(f());
        float strokeWidth = g() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        d(canvas, paint, path, kVar, rectF);
    }

    public final RectF f() {
        RectF rectF = this.f1095B;
        rectF.set(getBounds());
        return rectF;
    }

    public final boolean g() {
        Paint.Style style = this.f1108n.f1092p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f1101H.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f1108n.f1087k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f1108n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f1108n.getClass();
        if (this.f1108n.f1078a.d(f())) {
            outline.setRoundRect(getBounds(), this.f1108n.f1078a.f1131e.a(f()) * this.f1108n.i);
            return;
        }
        RectF f2 = f();
        Path path = this.f1114z;
        a(f2, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            y3.b.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                AbstractC5207a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            AbstractC5207a.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f1108n.f1084g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f1097D;
        region.set(bounds);
        RectF f2 = f();
        Path path = this.f1114z;
        a(f2, path);
        Region region2 = this.f1098E;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.f1108n.f1079b = new C5232a(context);
        m();
    }

    public final void i(float f2) {
        f fVar = this.f1108n;
        if (fVar.f1089m != f2) {
            fVar.f1089m = f2;
            m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f1112x = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f1108n.f1082e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f1108n.getClass();
        ColorStateList colorStateList2 = this.f1108n.f1081d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f1108n.f1080c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    public final void j(ColorStateList colorStateList) {
        f fVar = this.f1108n;
        if (fVar.f1080c != colorStateList) {
            fVar.f1080c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean k(int[] iArr) {
        boolean z6;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f1108n.f1080c == null || color2 == (colorForState2 = this.f1108n.f1080c.getColorForState(iArr, (color2 = (paint2 = this.f1100G).getColor())))) {
            z6 = false;
        } else {
            paint2.setColor(colorForState2);
            z6 = true;
        }
        if (this.f1108n.f1081d == null || color == (colorForState = this.f1108n.f1081d.getColorForState(iArr, (color = (paint = this.f1101H).getColor())))) {
            return z6;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f1104L;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f1105M;
        f fVar = this.f1108n;
        ColorStateList colorStateList = fVar.f1082e;
        PorterDuff.Mode mode = fVar.f1083f;
        Paint paint = this.f1100G;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int b9 = b(color);
            porterDuffColorFilter = b9 != color ? new PorterDuffColorFilter(b9, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f1104L = porterDuffColorFilter;
        this.f1108n.getClass();
        this.f1105M = null;
        this.f1108n.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f1104L) && Objects.equals(porterDuffColorFilter3, this.f1105M)) ? false : true;
    }

    public final void m() {
        f fVar = this.f1108n;
        float f2 = fVar.f1089m + 0.0f;
        fVar.f1090n = (int) Math.ceil(0.75f * f2);
        this.f1108n.f1091o = (int) Math.ceil(f2 * 0.25f);
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f1108n = new f(this.f1108n);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f1112x = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z6 = k(iArr) || l();
        if (z6) {
            invalidateSelf();
        }
        return z6;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        f fVar = this.f1108n;
        if (fVar.f1087k != i) {
            fVar.f1087k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1108n.getClass();
        super.invalidateSelf();
    }

    @Override // G3.v
    public final void setShapeAppearanceModel(k kVar) {
        this.f1108n.f1078a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1108n.f1082e = colorStateList;
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f1108n;
        if (fVar.f1083f != mode) {
            fVar.f1083f = mode;
            l();
            super.invalidateSelf();
        }
    }

    public g(Context context, AttributeSet attributeSet, int i, int i4) {
        this(k.b(context, attributeSet, i, i4).a());
    }

    public g(k kVar) {
        this(new f(kVar));
    }

    public g(f fVar) {
        m mVar;
        this.f1109u = new t[4];
        this.f1110v = new t[4];
        this.f1111w = new BitSet(8);
        this.f1113y = new Matrix();
        this.f1114z = new Path();
        this.f1094A = new Path();
        this.f1095B = new RectF();
        this.f1096C = new RectF();
        this.f1097D = new Region();
        this.f1098E = new Region();
        Paint paint = new Paint(1);
        this.f1100G = paint;
        Paint paint2 = new Paint(1);
        this.f1101H = paint2;
        this.f1102I = new F3.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.f1138a;
        } else {
            mVar = new m();
        }
        this.f1103K = mVar;
        this.f1106N = new RectF();
        this.f1107O = true;
        this.f1108n = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.J = new C4586c(3, this);
    }
}
