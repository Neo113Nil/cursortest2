package ru.yandex.taxi.design.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.renderscript.ScriptIntrinsicResize;
import android.renderscript.Type;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import defpackage.gtq0;
import defpackage.h3y;
import defpackage.i321;
import defpackage.sls;
import defpackage.tje;
import defpackage.weu;
import ru.yandex.taxi.design.utils.a;

/* loaded from: classes9.dex */
public final class a {
    public final Context a;
    public final h3y b;
    public final Canvas c = new Canvas();
    public final i321 d;
    public final i321 e;

    public a(Context context, Lifecycle lifecycle, h3y h3yVar) {
        this.a = context;
        this.b = h3yVar;
        final int i = 0;
        this.d = new i321(new sls(this) { // from class: q190
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                a aVar = this.b;
                switch (i2) {
                    case 0:
                        h3y h3yVar2 = aVar.b;
                        return ScriptIntrinsicBlur.create((RenderScript) h3yVar2.get(), Element.U8_4((RenderScript) h3yVar2.get()));
                    default:
                        return ScriptIntrinsicResize.create((RenderScript) aVar.b.get());
                }
            }
        }, OverlayShadowUtil$blurProvider$2.b);
        final int i2 = 1;
        this.e = new i321(new sls(this) { // from class: q190
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                a aVar = this.b;
                switch (i22) {
                    case 0:
                        h3y h3yVar2 = aVar.b;
                        return ScriptIntrinsicBlur.create((RenderScript) h3yVar2.get(), Element.U8_4((RenderScript) h3yVar2.get()));
                    default:
                        return ScriptIntrinsicResize.create((RenderScript) aVar.b.get());
                }
            }
        }, OverlayShadowUtil$resizeProvider$2.b);
        gtq0.t(r.a(lifecycle), new weu(19, this));
    }

    public static float c(float f, float f2) {
        return f2 > 0.0f ? Math.max(f - f2, 0.0f) : Math.abs(f2) + f;
    }

    public static float f(float f, float f2) {
        return Math.max(Math.abs(f2) - f, 0.0f);
    }

    public static int g(float f, float f2, float f3) {
        return (int) ((2.0f * f) + f2 + f3);
    }

    public final void a(float f, Bitmap bitmap) {
        float f2 = 24.0f / f;
        Allocation createFromBitmap = Allocation.createFromBitmap((RenderScript) this.b.get(), bitmap);
        Allocation createTyped = Allocation.createTyped((RenderScript) this.b.get(), createFromBitmap.getType());
        Type createXY = Type.createXY((RenderScript) this.b.get(), createFromBitmap.getElement(), (int) (bitmap.getWidth() * f2), (int) (bitmap.getHeight() * f2));
        Allocation createTyped2 = Allocation.createTyped((RenderScript) this.b.get(), createXY);
        Allocation createTyped3 = Allocation.createTyped((RenderScript) this.b.get(), createXY);
        synchronized (this.e) {
            i321 i321Var = this.e;
            Object obj = i321Var.c;
            if (obj == null) {
                obj = i321Var.a.invoke();
                i321Var.c = obj;
            }
            ScriptIntrinsicResize scriptIntrinsicResize = (ScriptIntrinsicResize) obj;
            scriptIntrinsicResize.setInput(createFromBitmap);
            scriptIntrinsicResize.forEach_bicubic(createTyped2);
        }
        synchronized (this.d) {
            i321 i321Var2 = this.d;
            Object obj2 = i321Var2.c;
            if (obj2 == null) {
                obj2 = i321Var2.a.invoke();
                i321Var2.c = obj2;
            }
            ScriptIntrinsicBlur scriptIntrinsicBlur = (ScriptIntrinsicBlur) obj2;
            scriptIntrinsicBlur.setRadius(24.0f);
            scriptIntrinsicBlur.setInput(createTyped2);
            scriptIntrinsicBlur.forEach(createTyped3);
        }
        synchronized (this.e) {
            i321 i321Var3 = this.e;
            Object obj3 = i321Var3.c;
            if (obj3 == null) {
                obj3 = i321Var3.a.invoke();
                i321Var3.c = obj3;
            }
            ScriptIntrinsicResize scriptIntrinsicResize2 = (ScriptIntrinsicResize) obj3;
            scriptIntrinsicResize2.setInput(createTyped3);
            scriptIntrinsicResize2.forEach_bicubic(createTyped);
        }
        createTyped.copyTo(bitmap);
        createFromBitmap.destroy();
        createTyped.destroy();
        createTyped2.destroy();
        createTyped3.destroy();
    }

    public final int b(Drawable drawable) {
        return drawable.getIntrinsicHeight() <= 0 ? d(drawable) : drawable.getIntrinsicHeight();
    }

    public final int d(Drawable drawable) {
        return drawable.getIntrinsicWidth() <= 0 ? tje.u(24, this.a) : drawable.getIntrinsicWidth();
    }

    public final BitmapDrawable e(Drawable drawable, float f, float f2, float f3, int i, boolean z) {
        int d = d(drawable);
        int b = b(drawable);
        drawable.setBounds(0, 0, d, b);
        float f4 = f(f3, f);
        float f5 = f(f3, f2);
        int g = g(f3, d, f4);
        int g2 = g(f3, b, f5);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(g, g2, config);
        Bitmap createBitmap2 = Bitmap.createBitmap(g, g2, config);
        synchronized (this.c) {
            this.c.setBitmap(createBitmap);
            this.c.save();
            this.c.translate(f4 + f3, f5 + f3);
            drawable.draw(this.c);
            this.c.restore();
            this.c.setBitmap(createBitmap2);
            Paint paint = new Paint();
            paint.setColorFilter(new ColorMatrixColorFilter(new float[]{Color.red(i) / 255.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, Color.green(i) / 255.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, Color.blue(i) / 255.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, Color.alpha(i) / 255.0f, 0.0f}));
            this.c.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
        }
        if (f3 > 25.0f) {
            a(f3, createBitmap2);
        } else {
            Allocation createFromBitmap = Allocation.createFromBitmap((RenderScript) this.b.get(), createBitmap2);
            Allocation createTyped = Allocation.createTyped((RenderScript) this.b.get(), createFromBitmap.getType());
            synchronized (this.d) {
                i321 i321Var = this.d;
                Object obj = i321Var.c;
                if (obj == null) {
                    obj = i321Var.a.invoke();
                    i321Var.c = obj;
                }
                ScriptIntrinsicBlur scriptIntrinsicBlur = (ScriptIntrinsicBlur) obj;
                scriptIntrinsicBlur.setRadius(f3);
                scriptIntrinsicBlur.setInput(createFromBitmap);
                scriptIntrinsicBlur.forEach(createTyped);
            }
            createTyped.copyTo(createBitmap2);
            createFromBitmap.destroy();
            createTyped.destroy();
        }
        if (z) {
            synchronized (this.c) {
                this.c.setBitmap(createBitmap2);
                this.c.save();
                this.c.translate(c(f3, f), c(f3, f2));
                drawable.draw(this.c);
                this.c.restore();
            }
        }
        return new BitmapDrawable(this.a.getResources(), createBitmap2);
    }
}
