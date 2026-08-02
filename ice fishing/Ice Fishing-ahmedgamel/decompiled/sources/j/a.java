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
import com.IceFishing.LiveIceFishing.C5248R;
import com.google.android.gms.internal.ads.Wv;
import g.AbstractC4528a;

/* loaded from: classes.dex */
public final class a extends Drawable {

    /* renamed from: m, reason: collision with root package name */
    public static final float f38392m = (float) Math.toRadians(45.0d);

    /* renamed from: a, reason: collision with root package name */
    public final Paint f38393a;

    /* renamed from: b, reason: collision with root package name */
    public final float f38394b;

    /* renamed from: c, reason: collision with root package name */
    public final float f38395c;

    /* renamed from: d, reason: collision with root package name */
    public final float f38396d;

    /* renamed from: e, reason: collision with root package name */
    public final float f38397e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f38398f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f38399g;

    /* renamed from: h, reason: collision with root package name */
    public final int f38400h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public float f38401j;

    /* renamed from: k, reason: collision with root package name */
    public final float f38402k;

    /* renamed from: l, reason: collision with root package name */
    public final int f38403l;

    public a(Context context) {
        Paint paint = new Paint();
        this.f38393a = paint;
        this.f38399g = new Path();
        this.i = false;
        this.f38403l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, AbstractC4528a.f37562n, C5248R.attr.drawerArrowStyle, C5248R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        int color = obtainStyledAttributes.getColor(3, 0);
        if (color != paint.getColor()) {
            paint.setColor(color);
            invalidateSelf();
        }
        float dimension = obtainStyledAttributes.getDimension(7, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.f38402k = (float) (Math.cos(f38392m) * (dimension / 2.0f));
            invalidateSelf();
        }
        boolean z6 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f38398f != z6) {
            this.f38398f = z6;
            invalidateSelf();
        }
        float round = Math.round(obtainStyledAttributes.getDimension(5, 0.0f));
        if (round != this.f38397e) {
            this.f38397e = round;
            invalidateSelf();
        }
        this.f38400h = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f38395c = Math.round(obtainStyledAttributes.getDimension(2, 0.0f));
        this.f38394b = Math.round(obtainStyledAttributes.getDimension(0, 0.0f));
        this.f38396d = obtainStyledAttributes.getDimension(1, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public static float a(float f2, float f9, float f10) {
        return Wv.a(f9, f2, f10, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = this.f38403l;
        boolean z6 = false;
        if (i != 0 && (i == 1 || (i == 3 ? b.a(this) == 0 : b.a(this) == 1))) {
            z6 = true;
        }
        float f2 = this.f38394b;
        float sqrt = (float) Math.sqrt(f2 * f2 * 2.0f);
        float f9 = this.f38401j;
        float f10 = this.f38395c;
        float a9 = a(f10, sqrt, f9);
        float a10 = a(f10, this.f38396d, this.f38401j);
        float round = Math.round(a(0.0f, this.f38402k, this.f38401j));
        float a11 = a(0.0f, f38392m, this.f38401j);
        float a12 = a(z6 ? 0.0f : -180.0f, z6 ? 180.0f : 0.0f, this.f38401j);
        double d9 = a9;
        double d10 = a11;
        boolean z9 = z6;
        float round2 = Math.round(Math.cos(d10) * d9);
        float round3 = Math.round(Math.sin(d10) * d9);
        Path path = this.f38399g;
        path.rewind();
        float f11 = this.f38397e;
        Paint paint = this.f38393a;
        float a13 = a(paint.getStrokeWidth() + f11, -this.f38402k, this.f38401j);
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
        canvas.translate(bounds.centerX(), (strokeWidth * 1.5f) + this.f38397e + ((((int) (height - (r6 * 2.0f))) / 4) * 2));
        if (this.f38398f) {
            canvas.rotate(a12 * (this.i ^ z9 ? -1 : 1));
        } else if (z9) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f38400h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f38400h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.f38393a;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f38393a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(float f2) {
        if (this.f38401j != f2) {
            this.f38401j = f2;
            invalidateSelf();
        }
    }
}
