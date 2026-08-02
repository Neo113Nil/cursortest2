package de.hdodenhof.circleimageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import defpackage.oj4;
import defpackage.wvs;
import defpackage.xq0;
import defpackage.ydn;

/* loaded from: classes5.dex */
public class CircleImageView extends ImageView {
    public static final ImageView.ScaleType u = ImageView.ScaleType.CENTER_CROP;
    public static final Bitmap.Config v = Bitmap.Config.ARGB_8888;
    public final RectF a;
    public final RectF b;
    public final Matrix c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public int g;
    public int h;
    public int i;
    public Bitmap j;
    public BitmapShader k;
    public int l;
    public int m;
    public float n;
    public float o;
    public ColorFilter p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;

    public CircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new RectF();
        this.b = new RectF();
        this.c = new Matrix();
        this.d = new Paint();
        this.e = new Paint();
        this.f = new Paint();
        this.g = -16777216;
        this.h = 0;
        this.i = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ydn.a, i, 0);
        this.h = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.g = obtainStyledAttributes.getColor(0, -16777216);
        this.s = obtainStyledAttributes.getBoolean(1, false);
        this.i = obtainStyledAttributes.getColor(3, 0);
        obtainStyledAttributes.recycle();
        a();
    }

    public final void a() {
        super.setScaleType(u);
        this.q = true;
        setOutlineProvider(new oj4(1, this));
        if (this.r) {
            c();
            this.r = false;
        }
    }

    public final void b() {
        Bitmap bitmap = null;
        if (this.t) {
            this.j = null;
        } else {
            Drawable drawable = getDrawable();
            if (drawable != null) {
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                } else {
                    try {
                        boolean z = drawable instanceof ColorDrawable;
                        Bitmap.Config config = v;
                        Bitmap createBitmap = z ? Bitmap.createBitmap(2, 2, config) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), config);
                        Canvas canvas = new Canvas(createBitmap);
                        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                        drawable.draw(canvas);
                        bitmap = createBitmap;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            this.j = bitmap;
        }
        c();
    }

    public final void c() {
        float width;
        float height;
        int i;
        if (!this.q) {
            this.r = true;
            return;
        }
        if (getWidth() == 0 && getHeight() == 0) {
            return;
        }
        if (this.j == null) {
            invalidate();
            return;
        }
        Bitmap bitmap = this.j;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.k = new BitmapShader(bitmap, tileMode, tileMode);
        Paint paint = this.d;
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        paint.setShader(this.k);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint2 = this.e;
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setColor(this.g);
        paint2.setStrokeWidth(this.h);
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint3 = this.f;
        paint3.setStyle(style2);
        paint3.setAntiAlias(true);
        paint3.setColor(this.i);
        this.m = this.j.getHeight();
        this.l = this.j.getWidth();
        int min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        float paddingLeft = ((r1 - min) / 2.0f) + getPaddingLeft();
        float paddingTop = ((r2 - min) / 2.0f) + getPaddingTop();
        float f = min;
        RectF rectF = new RectF(paddingLeft, paddingTop, paddingLeft + f, f + paddingTop);
        RectF rectF2 = this.b;
        rectF2.set(rectF);
        this.o = Math.min((rectF2.height() - this.h) / 2.0f, (rectF2.width() - this.h) / 2.0f);
        RectF rectF3 = this.a;
        rectF3.set(rectF2);
        if (!this.s && (i = this.h) > 0) {
            float f2 = i - 1.0f;
            rectF3.inset(f2, f2);
        }
        this.n = Math.min(rectF3.height() / 2.0f, rectF3.width() / 2.0f);
        if (paint != null) {
            paint.setColorFilter(this.p);
        }
        Matrix matrix = this.c;
        matrix.set(null);
        float f3 = 0.0f;
        if (rectF3.height() * this.l > rectF3.width() * this.m) {
            width = rectF3.height() / this.m;
            height = 0.0f;
            f3 = (rectF3.width() - (this.l * width)) * 0.5f;
        } else {
            width = rectF3.width() / this.l;
            height = (rectF3.height() - (this.m * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate(((int) (f3 + 0.5f)) + rectF3.left, ((int) (height + 0.5f)) + rectF3.top);
        this.k.setLocalMatrix(matrix);
        invalidate();
    }

    public int getBorderColor() {
        return this.g;
    }

    public int getBorderWidth() {
        return this.h;
    }

    public int getCircleBackgroundColor() {
        return this.i;
    }

    @Override // android.widget.ImageView
    public ColorFilter getColorFilter() {
        return this.p;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return u;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.t) {
            super.onDraw(canvas);
            return;
        }
        if (this.j == null) {
            return;
        }
        int i = this.i;
        RectF rectF = this.a;
        if (i != 0) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), this.n, this.f);
        }
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), this.n, this.d);
        if (this.h > 0) {
            RectF rectF2 = this.b;
            canvas.drawCircle(rectF2.centerX(), rectF2.centerY(), this.o, this.e);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        c();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.t) {
            return super.onTouchEvent(motionEvent);
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (!this.b.isEmpty()) {
            if (Math.pow(y - r2.centerY(), 2.0d) + Math.pow(x - r2.centerX(), 2.0d) > Math.pow(this.o, 2.0d)) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z) {
        if (z) {
            xq0.x("adjustViewBounds not supported.");
        }
    }

    public void setBorderColor(int i) {
        if (i == this.g) {
            return;
        }
        this.g = i;
        this.e.setColor(i);
        invalidate();
    }

    public void setBorderOverlay(boolean z) {
        if (z == this.s) {
            return;
        }
        this.s = z;
        c();
    }

    public void setBorderWidth(int i) {
        if (i == this.h) {
            return;
        }
        this.h = i;
        c();
    }

    public void setCircleBackgroundColor(int i) {
        if (i == this.i) {
            return;
        }
        this.i = i;
        this.f.setColor(i);
        invalidate();
    }

    public void setCircleBackgroundColorResource(int i) {
        setCircleBackgroundColor(getContext().getResources().getColor(i));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter == this.p) {
            return;
        }
        this.p = colorFilter;
        Paint paint = this.d;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
        invalidate();
    }

    public void setDisableCircularTransformation(boolean z) {
        if (this.t == z) {
            return;
        }
        this.t = z;
        b();
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        b();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        b();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        b();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        b();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        c();
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        c();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == u) {
            return;
        }
        wvs.g(scaleType, " not supported.", "ScaleType ");
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleImageView(Context context) {
        super(context);
        this.a = new RectF();
        this.b = new RectF();
        this.c = new Matrix();
        this.d = new Paint();
        this.e = new Paint();
        this.f = new Paint();
        this.g = -16777216;
        this.h = 0;
        this.i = 0;
        a();
    }
}
