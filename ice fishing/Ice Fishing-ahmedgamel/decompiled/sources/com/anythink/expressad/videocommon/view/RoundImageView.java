package com.anythink.expressad.videocommon.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.widget.ATImageView;

/* loaded from: classes.dex */
public class RoundImageView extends ATImageView {

    /* renamed from: a, reason: collision with root package name */
    private static final String f23256a = "RoundImageView";

    /* renamed from: c, reason: collision with root package name */
    private static final int f23257c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final int f23258d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f23259e = 5;

    /* renamed from: m, reason: collision with root package name */
    private static final String f23260m = "state_instance";

    /* renamed from: n, reason: collision with root package name */
    private static final String f23261n = "state_type";

    /* renamed from: o, reason: collision with root package name */
    private static final String f23262o = "state_border_radius";

    /* renamed from: b, reason: collision with root package name */
    private int f23263b;

    /* renamed from: f, reason: collision with root package name */
    private int f23264f;

    /* renamed from: g, reason: collision with root package name */
    private Paint f23265g;

    /* renamed from: h, reason: collision with root package name */
    private int f23266h;
    private Matrix i;

    /* renamed from: j, reason: collision with root package name */
    private BitmapShader f23267j;

    /* renamed from: k, reason: collision with root package name */
    private int f23268k;

    /* renamed from: l, reason: collision with root package name */
    private RectF f23269l;

    public RoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new Matrix();
        Paint paint = new Paint();
        this.f23265g = paint;
        paint.setAntiAlias(true);
        this.f23264f = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f23263b = 1;
    }

    private void a() {
        Bitmap a9;
        try {
            Drawable drawable = getDrawable();
            if (drawable == null || (a9 = a(drawable)) == null || a9.isRecycled()) {
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f23267j = new BitmapShader(a9, tileMode, tileMode);
            int i = this.f23263b;
            float f2 = 1.0f;
            if (i == 0) {
                f2 = (this.f23268k * 1.0f) / Math.min(a9.getWidth(), a9.getHeight());
            } else if (i == 1) {
                f2 = Math.max((getWidth() * 1.0f) / a9.getWidth(), (getHeight() * 1.0f) / a9.getHeight());
            }
            this.i.setScale(f2, f2);
            this.f23267j.setLocalMatrix(this.i);
            this.f23265g.setShader(this.f23267j);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.widget.ATImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap a9;
        try {
            if (getDrawable() == null) {
                return;
            }
            try {
                Drawable drawable = getDrawable();
                if (drawable != null && (a9 = a(drawable)) != null && !a9.isRecycled()) {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.f23267j = new BitmapShader(a9, tileMode, tileMode);
                    int i = this.f23263b;
                    float f2 = 1.0f;
                    if (i == 0) {
                        f2 = (this.f23268k * 1.0f) / Math.min(a9.getWidth(), a9.getHeight());
                    } else if (i == 1) {
                        f2 = Math.max((getWidth() * 1.0f) / a9.getWidth(), (getHeight() * 1.0f) / a9.getHeight());
                    }
                    this.i.setScale(f2, f2);
                    this.f23267j.setLocalMatrix(this.i);
                    this.f23265g.setShader(this.f23267j);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
            if (this.f23263b != 1) {
                int i4 = this.f23266h;
                canvas.drawCircle(i4, i4, i4, this.f23265g);
            } else {
                RectF rectF = this.f23269l;
                int i6 = this.f23264f;
                canvas.drawRoundRect(rectF, i6, i6, this.f23265g);
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        if (this.f23263b == 0) {
            int min = Math.min(getMeasuredWidth(), getMeasuredHeight());
            this.f23268k = min;
            this.f23266h = min / 2;
            setMeasuredDimension(min, min);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        Parcelable parcelable2 = bundle.getParcelable(f23260m);
        if (parcelable2 == null) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        super.onRestoreInstanceState(parcelable2);
        this.f23263b = bundle.getInt(f23261n);
        this.f23264f = bundle.getInt(f23262o);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(f23260m, super.onSaveInstanceState());
        bundle.putInt(f23261n, this.f23263b);
        bundle.putInt(f23262o, this.f23264f);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i4, int i6, int i9) {
        super.onSizeChanged(i, i4, i6, i9);
        if (this.f23263b == 1) {
            this.f23269l = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        }
    }

    public void setBorderRadius(int i) {
        int b9 = v.b(getContext(), i);
        if (this.f23264f != b9) {
            this.f23264f = b9;
            invalidate();
        }
    }

    public void setType(int i) {
        if (this.f23263b != i) {
            this.f23263b = i;
            if (i != 1 && i != 0) {
                this.f23263b = 0;
            }
            requestLayout();
        }
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new Matrix();
        Paint paint = new Paint();
        this.f23265g = paint;
        paint.setAntiAlias(true);
        this.f23264f = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f23263b = 1;
    }

    public RoundImageView(Context context) {
        super(context);
        this.i = new Matrix();
        Paint paint = new Paint();
        this.f23265g = paint;
        paint.setAntiAlias(true);
        this.f23264f = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f23263b = 1;
    }

    private static Bitmap a(Drawable drawable) {
        try {
            if (drawable instanceof BitmapDrawable) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return createBitmap;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }
}
