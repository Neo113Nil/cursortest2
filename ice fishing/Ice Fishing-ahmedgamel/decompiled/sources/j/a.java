package j;

import H.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import com.icefishinggame.icefishinggamemultigames.C5275R;
import g.AbstractC4518a;

/* loaded from: classes.dex */
public final class a extends Drawable {

    /* renamed from: m, reason: collision with root package name */
    public static final float f38273m = (float) Math.toRadians(45.0d);

    /* renamed from: a, reason: collision with root package name */
    public final Paint f38274a;

    /* renamed from: b, reason: collision with root package name */
    public final float f38275b;

    /* renamed from: c, reason: collision with root package name */
    public final float f38276c;

    /* renamed from: d, reason: collision with root package name */
    public final float f38277d;

    /* renamed from: e, reason: collision with root package name */
    public final float f38278e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f38279f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f38280g;

    /* renamed from: h, reason: collision with root package name */
    public final int f38281h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public float f38282j;

    /* renamed from: k, reason: collision with root package name */
    public final float f38283k;

    /* renamed from: l, reason: collision with root package name */
    public final int f38284l;

    public a(Context context) {
        Paint paint = new Paint();
        this.f38274a = paint;
        this.f38280g = new Path();
        this.i = false;
        this.f38284l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, AbstractC4518a.f37600n, C5275R.attr.drawerArrowStyle, C5275R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        int color = obtainStyledAttributes.getColor(3, 0);
        if (color != paint.getColor()) {
            paint.setColor(color);
            invalidateSelf();
        }
        float dimension = obtainStyledAttributes.getDimension(7, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.f38283k = (float) (Math.cos(f38273m) * (dimension / 2.0f));
            invalidateSelf();
        }
        boolean z3 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f38279f != z3) {
            this.f38279f = z3;
            invalidateSelf();
        }
        float round = Math.round(obtainStyledAttributes.getDimension(5, 0.0f));
        if (round != this.f38278e) {
            this.f38278e = round;
            invalidateSelf();
        }
        this.f38281h = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f38276c = Math.round(obtainStyledAttributes.getDimension(2, 0.0f));
        this.f38275b = Math.round(obtainStyledAttributes.getDimension(0, 0.0f));
        this.f38277d = obtainStyledAttributes.getDimension(1, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public static float a(float f3, float f9, float f10) {
        return AbstractC4404f.a(f9, f3, f10, f3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = this.f38284l;
        boolean z3 = false;
        if (i != 0 && (i == 1 || (i == 3 ? b.a(this) == 0 : b.a(this) == 1))) {
            z3 = true;
        }
        float f3 = this.f38275b;
        float sqrt = (float) Math.sqrt(f3 * f3 * 2.0f);
        float f9 = this.f38282j;
        float f10 = this.f38276c;
        float a9 = a(f10, sqrt, f9);
        float a10 = a(f10, this.f38277d, this.f38282j);
        float round = Math.round(a(0.0f, this.f38283k, this.f38282j));
        float a11 = a(0.0f, f38273m, this.f38282j);
        float a12 = a(z3 ? 0.0f : -180.0f, z3 ? 180.0f : 0.0f, this.f38282j);
        double d2 = a9;
        double d9 = a11;
        boolean z6 = z3;
        float round2 = Math.round(Math.cos(d9) * d2);
        float round3 = Math.round(Math.sin(d9) * d2);
        Path path = this.f38280g;
        path.rewind();
        float f11 = this.f38278e;
        Paint paint = this.f38274a;
        float a13 = a(paint.getStrokeWidth() + f11, -this.f38283k, this.f38282j);
        float f12 = (-a10) / 2.0f;
        path.moveTo(f12 + round, 0.0f);
        path.rLineTo(a10 - (round * 2.0f), 0.0f);
        path.moveTo(f12, a13);
        path.rLineTo(round2, round3);
        path.moveTo(f12, -a13);
        path.rLineTo(round2, -round3);
        path.close();
        canvas.save();
        float strokeWidth = paint.getStrokeWidth();
        float height = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), (strokeWidth * 1.5f) + this.f38278e + ((((int) (height - (r6 * 2.0f))) / 4) * 2));
        if (this.f38279f) {
            canvas.rotate(a12 * (this.i ^ z6 ? -1 : 1));
        } else if (z6) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f38281h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f38281h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.f38274a;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f38274a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(float f3) {
        if (this.f38282j != f3) {
            this.f38282j = f3;
            invalidateSelf();
        }
    }
}
