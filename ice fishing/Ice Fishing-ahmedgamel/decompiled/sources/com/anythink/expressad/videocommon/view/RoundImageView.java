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
    private static final String f22469a = "RoundImageView";

    /* renamed from: c, reason: collision with root package name */
    private static final int f22470c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final int f22471d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f22472e = 5;

    /* renamed from: m, reason: collision with root package name */
    private static final String f22473m = "state_instance";

    /* renamed from: n, reason: collision with root package name */
    private static final String f22474n = "state_type";

    /* renamed from: o, reason: collision with root package name */
    private static final String f22475o = "state_border_radius";

    /* renamed from: b, reason: collision with root package name */
    private int f22476b;

    /* renamed from: f, reason: collision with root package name */
    private int f22477f;

    /* renamed from: g, reason: collision with root package name */
    private Paint f22478g;

    /* renamed from: h, reason: collision with root package name */
    private int f22479h;
    private Matrix i;

    /* renamed from: j, reason: collision with root package name */
    private BitmapShader f22480j;

    /* renamed from: k, reason: collision with root package name */
    private int f22481k;

    /* renamed from: l, reason: collision with root package name */
    private RectF f22482l;

    public RoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new Matrix();
        Paint paint = new Paint();
        this.f22478g = paint;
        paint.setAntiAlias(true);
        this.f22477f = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f22476b = 1;
    }

    private void a() {
        Bitmap a9;
        try {
            Drawable drawable = getDrawable();
            if (drawable == null || (a9 = a(drawable)) == null || a9.isRecycled()) {
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f22480j = new BitmapShader(a9, tileMode, tileMode);
            int i = this.f22476b;
            float f3 = 1.0f;
            if (i == 0) {
                f3 = (this.f22481k * 1.0f) / Math.min(a9.getWidth(), a9.getHeight());
            } else if (i == 1) {
                f3 = Math.max((getWidth() * 1.0f) / a9.getWidth(), (getHeight() * 1.0f) / a9.getHeight());
            }
            this.i.setScale(f3, f3);
            this.f22480j.setLocalMatrix(this.i);
            this.f22478g.setShader(this.f22480j);
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
                    this.f22480j = new BitmapShader(a9, tileMode, tileMode);
                    int i = this.f22476b;
                    float f3 = 1.0f;
                    if (i == 0) {
                        f3 = (this.f22481k * 1.0f) / Math.min(a9.getWidth(), a9.getHeight());
                    } else if (i == 1) {
                        f3 = Math.max((getWidth() * 1.0f) / a9.getWidth(), (getHeight() * 1.0f) / a9.getHeight());
                    }
                    this.i.setScale(f3, f3);
                    this.f22480j.setLocalMatrix(this.i);
                    this.f22478g.setShader(this.f22480j);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
            if (this.f22476b != 1) {
                int i6 = this.f22479h;
                canvas.drawCircle(i6, i6, i6, this.f22478g);
            } else {
                RectF rectF = this.f22482l;
                int i9 = this.f22477f;
                canvas.drawRoundRect(rectF, i9, i9, this.f22478g);
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i6) {
        super.onMeasure(i, i6);
        if (this.f22476b == 0) {
            int min = Math.min(getMeasuredWidth(), getMeasuredHeight());
            this.f22481k = min;
            this.f22479h = min / 2;
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
        Parcelable parcelable2 = bundle.getParcelable(f22473m);
        if (parcelable2 == null) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        super.onRestoreInstanceState(parcelable2);
        this.f22476b = bundle.getInt(f22474n);
        this.f22477f = bundle.getInt(f22475o);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(f22473m, super.onSaveInstanceState());
        bundle.putInt(f22474n, this.f22476b);
        bundle.putInt(f22475o, this.f22477f);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i6, int i9, int i10) {
        super.onSizeChanged(i, i6, i9, i10);
        if (this.f22476b == 1) {
            this.f22482l = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        }
    }

    public void setBorderRadius(int i) {
        int b9 = v.b(getContext(), i);
        if (this.f22477f != b9) {
            this.f22477f = b9;
            invalidate();
        }
    }

    public void setType(int i) {
        if (this.f22476b != i) {
            this.f22476b = i;
            if (i != 1 && i != 0) {
                this.f22476b = 0;
            }
            requestLayout();
        }
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new Matrix();
        Paint paint = new Paint();
        this.f22478g = paint;
        paint.setAntiAlias(true);
        this.f22477f = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f22476b = 1;
    }

    public RoundImageView(Context context) {
        super(context);
        this.i = new Matrix();
        Paint paint = new Paint();
        this.f22478g = paint;
        paint.setAntiAlias(true);
        this.f22477f = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f22476b = 1;
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
