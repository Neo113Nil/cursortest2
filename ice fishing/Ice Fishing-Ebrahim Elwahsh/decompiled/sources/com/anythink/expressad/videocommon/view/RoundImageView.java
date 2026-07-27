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
    private static final String f22627a = "RoundImageView";

    /* renamed from: c, reason: collision with root package name */
    private static final int f22628c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final int f22629d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f22630e = 5;

    /* renamed from: m, reason: collision with root package name */
    private static final String f22631m = "state_instance";

    /* renamed from: n, reason: collision with root package name */
    private static final String f22632n = "state_type";

    /* renamed from: o, reason: collision with root package name */
    private static final String f22633o = "state_border_radius";

    /* renamed from: b, reason: collision with root package name */
    private int f22634b;

    /* renamed from: f, reason: collision with root package name */
    private int f22635f;

    /* renamed from: g, reason: collision with root package name */
    private Paint f22636g;

    /* renamed from: h, reason: collision with root package name */
    private int f22637h;
    private Matrix i;

    /* renamed from: j, reason: collision with root package name */
    private BitmapShader f22638j;

    /* renamed from: k, reason: collision with root package name */
    private int f22639k;

    /* renamed from: l, reason: collision with root package name */
    private RectF f22640l;

    public RoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new Matrix();
        Paint paint = new Paint();
        this.f22636g = paint;
        paint.setAntiAlias(true);
        this.f22635f = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f22634b = 1;
    }

    private void a() {
        Bitmap a9;
        try {
            Drawable drawable = getDrawable();
            if (drawable == null || (a9 = a(drawable)) == null || a9.isRecycled()) {
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f22638j = new BitmapShader(a9, tileMode, tileMode);
            int i = this.f22634b;
            float f6 = 1.0f;
            if (i == 0) {
                f6 = (this.f22639k * 1.0f) / Math.min(a9.getWidth(), a9.getHeight());
            } else if (i == 1) {
                f6 = Math.max((getWidth() * 1.0f) / a9.getWidth(), (getHeight() * 1.0f) / a9.getHeight());
            }
            this.i.setScale(f6, f6);
            this.f22638j.setLocalMatrix(this.i);
            this.f22636g.setShader(this.f22638j);
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
                    this.f22638j = new BitmapShader(a9, tileMode, tileMode);
                    int i = this.f22634b;
                    float f6 = 1.0f;
                    if (i == 0) {
                        f6 = (this.f22639k * 1.0f) / Math.min(a9.getWidth(), a9.getHeight());
                    } else if (i == 1) {
                        f6 = Math.max((getWidth() * 1.0f) / a9.getWidth(), (getHeight() * 1.0f) / a9.getHeight());
                    }
                    this.i.setScale(f6, f6);
                    this.f22638j.setLocalMatrix(this.i);
                    this.f22636g.setShader(this.f22638j);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
            if (this.f22634b != 1) {
                int i4 = this.f22637h;
                canvas.drawCircle(i4, i4, i4, this.f22636g);
            } else {
                RectF rectF = this.f22640l;
                int i9 = this.f22635f;
                canvas.drawRoundRect(rectF, i9, i9, this.f22636g);
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        if (this.f22634b == 0) {
            int min = Math.min(getMeasuredWidth(), getMeasuredHeight());
            this.f22639k = min;
            this.f22637h = min / 2;
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
        Parcelable parcelable2 = bundle.getParcelable(f22631m);
        if (parcelable2 == null) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        super.onRestoreInstanceState(parcelable2);
        this.f22634b = bundle.getInt(f22632n);
        this.f22635f = bundle.getInt(f22633o);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(f22631m, super.onSaveInstanceState());
        bundle.putInt(f22632n, this.f22634b);
        bundle.putInt(f22633o, this.f22635f);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i4, int i9, int i10) {
        super.onSizeChanged(i, i4, i9, i10);
        if (this.f22634b == 1) {
            this.f22640l = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        }
    }

    public void setBorderRadius(int i) {
        int b9 = v.b(getContext(), i);
        if (this.f22635f != b9) {
            this.f22635f = b9;
            invalidate();
        }
    }

    public void setType(int i) {
        if (this.f22634b != i) {
            this.f22634b = i;
            if (i != 1 && i != 0) {
                this.f22634b = 0;
            }
            requestLayout();
        }
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new Matrix();
        Paint paint = new Paint();
        this.f22636g = paint;
        paint.setAntiAlias(true);
        this.f22635f = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f22634b = 1;
    }

    public RoundImageView(Context context) {
        super(context);
        this.i = new Matrix();
        Paint paint = new Paint();
        this.f22636g = paint;
        paint.setAntiAlias(true);
        this.f22635f = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f22634b = 1;
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
