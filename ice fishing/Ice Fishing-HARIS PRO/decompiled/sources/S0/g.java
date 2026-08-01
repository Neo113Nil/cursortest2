package S0;

import a.AbstractC0078a;
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
import androidx.recyclerview.widget.RecyclerView;
import java.util.BitSet;
import java.util.Objects;

/* loaded from: classes.dex */
public class g extends Drawable implements v {

    /* renamed from: w, reason: collision with root package name */
    public static final Paint f1075w;

    /* renamed from: a, reason: collision with root package name */
    public f f1076a;

    /* renamed from: b, reason: collision with root package name */
    public final t[] f1077b;

    /* renamed from: c, reason: collision with root package name */
    public final t[] f1078c;

    /* renamed from: d, reason: collision with root package name */
    public final BitSet f1079d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f1080f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f1081g;

    /* renamed from: h, reason: collision with root package name */
    public final Path f1082h;
    public final RectF i;
    public final RectF j;

    /* renamed from: k, reason: collision with root package name */
    public final Region f1083k;

    /* renamed from: l, reason: collision with root package name */
    public final Region f1084l;

    /* renamed from: m, reason: collision with root package name */
    public k f1085m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f1086n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f1087o;

    /* renamed from: p, reason: collision with root package name */
    public final R0.a f1088p;

    /* renamed from: q, reason: collision with root package name */
    public final B.b f1089q;

    /* renamed from: r, reason: collision with root package name */
    public final m f1090r;

    /* renamed from: s, reason: collision with root package name */
    public PorterDuffColorFilter f1091s;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f1092t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f1093u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1094v;

    static {
        Paint paint = new Paint(1);
        f1075w = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public final void b(RectF rectF, Path path) {
        f fVar = this.f1076a;
        this.f1090r.a(fVar.f1062a, fVar.i, rectF, this.f1089q, path);
        if (this.f1076a.f1068h != 1.0f) {
            Matrix matrix = this.f1080f;
            matrix.reset();
            float f2 = this.f1076a.f1068h;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f1093u, true);
    }

    public final int c(int i) {
        int i2;
        f fVar = this.f1076a;
        float f2 = fVar.f1071m + RecyclerView.f2111C0 + fVar.f1070l;
        K0.a aVar = fVar.f1063b;
        if (aVar == null || !aVar.f389a || G.a.d(i, 255) != aVar.f392d) {
            return i;
        }
        float min = (aVar.e <= RecyclerView.f2111C0 || f2 <= RecyclerView.f2111C0) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int O2 = AbstractC0078a.O(G.a.d(i, 255), aVar.f390b, min);
        if (min > RecyclerView.f2111C0 && (i2 = aVar.f391c) != 0) {
            O2 = G.a.b(G.a.d(i2, K0.a.f388f), O2);
        }
        return G.a.d(O2, alpha);
    }

    public final void d(Canvas canvas) {
        if (this.f1079d.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f1076a.f1073o;
        Path path = this.f1081g;
        R0.a aVar = this.f1088p;
        if (i != 0) {
            canvas.drawPath(path, aVar.f1012a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            t tVar = this.f1077b[i2];
            int i3 = this.f1076a.f1072n;
            Matrix matrix = t.f1138b;
            tVar.a(matrix, aVar, i3, canvas);
            this.f1078c[i2].a(matrix, aVar, this.f1076a.f1072n, canvas);
        }
        if (this.f1094v) {
            double d2 = 0;
            int sin = (int) (Math.sin(Math.toRadians(d2)) * this.f1076a.f1073o);
            int cos = (int) (Math.cos(Math.toRadians(d2)) * this.f1076a.f1073o);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f1075w);
            canvas.translate(sin, cos);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f1086n;
        paint.setColorFilter(this.f1091s);
        int alpha = paint.getAlpha();
        int i = this.f1076a.f1069k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f1087o;
        paint2.setColorFilter(this.f1092t);
        paint2.setStrokeWidth(this.f1076a.j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.f1076a.f1069k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z2 = this.e;
        Path path = this.f1081g;
        if (z2) {
            boolean i3 = i();
            float f2 = RecyclerView.f2111C0;
            float f3 = -(i3 ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            k kVar = this.f1076a.f1062a;
            j e = kVar.e();
            c cVar = kVar.e;
            if (!(cVar instanceof h)) {
                cVar = new b(f3, cVar);
            }
            e.e = cVar;
            c cVar2 = kVar.f1109f;
            if (!(cVar2 instanceof h)) {
                cVar2 = new b(f3, cVar2);
            }
            e.f1100f = cVar2;
            c cVar3 = kVar.f1111h;
            if (!(cVar3 instanceof h)) {
                cVar3 = new b(f3, cVar3);
            }
            e.f1102h = cVar3;
            c cVar4 = kVar.f1110g;
            if (!(cVar4 instanceof h)) {
                cVar4 = new b(f3, cVar4);
            }
            e.f1101g = cVar4;
            k a2 = e.a();
            this.f1085m = a2;
            float f4 = this.f1076a.i;
            RectF rectF = this.j;
            rectF.set(g());
            if (i()) {
                f2 = paint2.getStrokeWidth() / 2.0f;
            }
            rectF.inset(f2, f2);
            this.f1090r.a(a2, f4, rectF, null, this.f1082h);
            b(g(), path);
            this.e = false;
        }
        f fVar = this.f1076a;
        fVar.getClass();
        if (fVar.f1072n > 0) {
            int i4 = Build.VERSION.SDK_INT;
            if (!k() && !path.isConvex() && i4 < 29) {
                canvas.save();
                double d2 = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d2)) * this.f1076a.f1073o), (int) (Math.cos(Math.toRadians(d2)) * this.f1076a.f1073o));
                if (this.f1094v) {
                    RectF rectF2 = this.f1093u;
                    int width = (int) (rectF2.width() - getBounds().width());
                    int height = (int) (rectF2.height() - getBounds().height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.f1076a.f1072n * 2) + ((int) rectF2.width()) + width, (this.f1076a.f1072n * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f5 = (getBounds().left - this.f1076a.f1072n) - width;
                    float f6 = (getBounds().top - this.f1076a.f1072n) - height;
                    canvas2.translate(-f5, -f6);
                    d(canvas2);
                    canvas.drawBitmap(createBitmap, f5, f6, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                } else {
                    d(canvas);
                    canvas.restore();
                }
            }
        }
        f fVar2 = this.f1076a;
        Paint.Style style = fVar2.f1074p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            e(canvas, paint, path, fVar2.f1062a, g());
        }
        if (i()) {
            f(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final void e(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a2 = kVar.f1109f.a(rectF) * this.f1076a.i;
            canvas.drawRoundRect(rectF, a2, a2, paint);
        }
    }

    public void f(Canvas canvas) {
        Paint paint = this.f1087o;
        Path path = this.f1082h;
        k kVar = this.f1085m;
        RectF rectF = this.j;
        rectF.set(g());
        float strokeWidth = i() ? paint.getStrokeWidth() / 2.0f : RecyclerView.f2111C0;
        rectF.inset(strokeWidth, strokeWidth);
        e(canvas, paint, path, kVar, rectF);
    }

    public final RectF g() {
        RectF rectF = this.i;
        rectF.set(getBounds());
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f1076a.f1069k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f1076a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f1076a.getClass();
        if (k()) {
            outline.setRoundRect(getBounds(), h() * this.f1076a.i);
            return;
        }
        RectF g2 = g();
        Path path = this.f1081g;
        b(g2, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            J0.c.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                J0.a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            J0.a.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f1076a.f1067g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f1083k;
        region.set(bounds);
        RectF g2 = g();
        Path path = this.f1081g;
        b(g2, path);
        Region region2 = this.f1084l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final float h() {
        return this.f1076a.f1062a.e.a(g());
    }

    public final boolean i() {
        Paint.Style style = this.f1076a.f1074p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f1087o.getStrokeWidth() > RecyclerView.f2111C0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.f1076a.e) == null || !colorStateList.isStateful())) {
            this.f1076a.getClass();
            ColorStateList colorStateList3 = this.f1076a.f1065d;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && ((colorStateList2 = this.f1076a.f1064c) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    public final void j(Context context) {
        this.f1076a.f1063b = new K0.a(context);
        r();
    }

    public final boolean k() {
        return this.f1076a.f1062a.d(g());
    }

    public final void l(float f2) {
        f fVar = this.f1076a;
        if (fVar.f1071m != f2) {
            fVar.f1071m = f2;
            r();
        }
    }

    public final void m(ColorStateList colorStateList) {
        f fVar = this.f1076a;
        if (fVar.f1064c != colorStateList) {
            fVar.f1064c = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f1076a = new f(this.f1076a);
        return this;
    }

    public final void n(float f2) {
        f fVar = this.f1076a;
        if (fVar.i != f2) {
            fVar.i = f2;
            this.e = true;
            invalidateSelf();
        }
    }

    public final void o() {
        this.f1088p.a(-12303292);
        this.f1076a.getClass();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, L0.i
    public boolean onStateChange(int[] iArr) {
        boolean z2 = p(iArr) || q();
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    public final boolean p(int[] iArr) {
        boolean z2;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f1076a.f1064c == null || color2 == (colorForState2 = this.f1076a.f1064c.getColorForState(iArr, (color2 = (paint2 = this.f1086n).getColor())))) {
            z2 = false;
        } else {
            paint2.setColor(colorForState2);
            z2 = true;
        }
        if (this.f1076a.f1065d == null || color == (colorForState = this.f1076a.f1065d.getColorForState(iArr, (color = (paint = this.f1087o).getColor())))) {
            return z2;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean q() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f1091s;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f1092t;
        f fVar = this.f1076a;
        ColorStateList colorStateList = fVar.e;
        PorterDuff.Mode mode = fVar.f1066f;
        Paint paint = this.f1086n;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int c2 = c(color);
            porterDuffColorFilter = c2 != color ? new PorterDuffColorFilter(c2, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(c(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f1091s = porterDuffColorFilter;
        this.f1076a.getClass();
        this.f1092t = null;
        this.f1076a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f1091s) && Objects.equals(porterDuffColorFilter3, this.f1092t)) ? false : true;
    }

    public final void r() {
        f fVar = this.f1076a;
        float f2 = fVar.f1071m + RecyclerView.f2111C0;
        fVar.f1072n = (int) Math.ceil(0.75f * f2);
        this.f1076a.f1073o = (int) Math.ceil(f2 * 0.25f);
        q();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        f fVar = this.f1076a;
        if (fVar.f1069k != i) {
            fVar.f1069k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1076a.getClass();
        super.invalidateSelf();
    }

    @Override // S0.v
    public final void setShapeAppearanceModel(k kVar) {
        this.f1076a.f1062a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1076a.e = colorStateList;
        q();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f1076a;
        if (fVar.f1066f != mode) {
            fVar.f1066f = mode;
            q();
            super.invalidateSelf();
        }
    }

    public g(Context context, AttributeSet attributeSet, int i, int i2) {
        this(k.b(context, attributeSet, i, i2).a());
    }

    public g(k kVar) {
        this(new f(kVar));
    }

    public g(f fVar) {
        m mVar;
        this.f1077b = new t[4];
        this.f1078c = new t[4];
        this.f1079d = new BitSet(8);
        this.f1080f = new Matrix();
        this.f1081g = new Path();
        this.f1082h = new Path();
        this.i = new RectF();
        this.j = new RectF();
        this.f1083k = new Region();
        this.f1084l = new Region();
        Paint paint = new Paint(1);
        this.f1086n = paint;
        Paint paint2 = new Paint(1);
        this.f1087o = paint2;
        this.f1088p = new R0.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.f1114a;
        } else {
            mVar = new m();
        }
        this.f1090r = mVar;
        this.f1093u = new RectF();
        this.f1094v = true;
        this.f1076a = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        q();
        p(getState());
        this.f1089q = new B.b(13, this);
    }
}
