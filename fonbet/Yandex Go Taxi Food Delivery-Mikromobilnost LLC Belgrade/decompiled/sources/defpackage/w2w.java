package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes2.dex */
public final class w2w extends RecyclerView.d {
    public static final int F = Color.rgb(255, 90, 90);
    public static final int G = Color.rgb(64, HProv.PP_VERSION_TIMESTAMP, 255);
    public static final int H = Color.rgb(PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC, PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC, PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC);
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public final Path a = new Path();
    public final Path b = new Path();
    public final Rect c = new Rect();
    public boolean w;
    public Paint x;
    public Paint y;
    public TextPaint z;

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        List list;
        int i;
        int i2;
        x0 childViewHolder;
        Object obj;
        String d;
        RecyclerView recyclerView2 = recyclerView;
        Context context = recyclerView2.getContext();
        if (!this.w) {
            this.w = true;
            float f = context.getResources().getDisplayMetrics().density;
            this.A = 0.75f * f;
            this.B = 1.5f * f;
            this.C = 10.0f * f;
            float f2 = 6.0f * f;
            this.D = f2;
            this.E = f2;
            Paint paint = new Paint(1);
            paint.setColor(F);
            this.x = paint;
            Paint paint2 = new Paint(1);
            paint2.setColor(G);
            this.y = paint2;
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(H);
            textPaint.setTextSize(f * 13.0f);
            textPaint.setTypeface(Typeface.MONOSPACE);
            this.z = textPaint;
        }
        List f3 = ((cfx) recyclerView2.getAdapter()).f();
        int childCount = recyclerView2.getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = recyclerView2.getChildAt(i4);
            if (childAt == null || (childViewHolder = recyclerView2.getChildViewHolder(childAt)) == null || (obj = (u0x) a.S(childViewHolder.F(), f3)) == null) {
                list = f3;
                i = childCount;
                i2 = i4;
            } else {
                int width = childAt.getWidth();
                int height = childAt.getHeight();
                float translationX = childAt.getTranslationX() + childAt.getX();
                float translationY = childAt.getTranslationY() + childAt.getY();
                float f4 = translationX + width;
                float f5 = translationY + height;
                int alpha = (int) (childAt.getAlpha() * 255.0f);
                float f6 = this.A;
                float f7 = translationX + f6;
                float f8 = translationY + f6;
                float f9 = f4 - f6;
                float f10 = f5 - f6;
                if (obj instanceof s7u) {
                    d = String.valueOf(((s7u) obj).getItemId());
                } else {
                    d = qoi0.a(obj.getClass()).d();
                    if (d == null) {
                        d = "anonymous";
                    }
                }
                TextPaint textPaint2 = this.z;
                if (textPaint2 == null) {
                    textPaint2 = null;
                }
                textPaint2.getTextBounds(d, i3, d.length(), this.c);
                float width2 = (this.D * 2.0f) + r12.width();
                TextPaint textPaint3 = this.z;
                if (textPaint3 == null) {
                    textPaint3 = null;
                }
                float f11 = textPaint3.getFontMetrics().descent;
                TextPaint textPaint4 = this.z;
                if (textPaint4 == null) {
                    textPaint4 = null;
                }
                float f12 = (f11 - textPaint4.getFontMetrics().ascent) + this.D;
                Paint paint3 = this.x;
                if (paint3 == null) {
                    paint3 = null;
                }
                paint3.setAlpha(alpha);
                Path path = this.a;
                path.rewind();
                path.addRect(translationX, translationY, f4, f5, Path.Direction.CW);
                path.addRect(f7, f8, f9, f10, Path.Direction.CCW);
                if (width2 > f4 - translationX || f12 > f5 - translationY) {
                    Paint paint4 = this.x;
                    if (paint4 == null) {
                        paint4 = null;
                    }
                    canvas.drawPath(path, paint4);
                } else {
                    float f13 = f9 - width2;
                    float f14 = f12 + f8;
                    path.moveTo(f9, f14);
                    path.lineTo(f13 + this.E, f14);
                    float f15 = this.E * 2.0f;
                    path.addArc(f13, f14 - f15, f15 + f13, f14, 90.0f, 90.0f);
                    path.lineTo(f13, f8);
                    path.lineTo(f9, f8);
                    path.lineTo(f9, f14);
                    Paint paint5 = this.x;
                    if (paint5 == null) {
                        paint5 = null;
                    }
                    canvas.drawPath(path, paint5);
                    TextPaint textPaint5 = this.z;
                    if (textPaint5 == null) {
                        textPaint5 = null;
                    }
                    textPaint5.setAlpha(alpha);
                    float f16 = this.D;
                    float f17 = f13 + f16;
                    float f18 = f14 - f16;
                    TextPaint textPaint6 = this.z;
                    if (textPaint6 == null) {
                        textPaint6 = null;
                    }
                    canvas.drawText(d, f17, f18, textPaint6);
                }
                Paint paint6 = this.y;
                if (paint6 == null) {
                    paint6 = null;
                }
                paint6.setAlpha(alpha);
                float f19 = this.B;
                float f20 = translationX + f19;
                float f21 = translationY + f19;
                float f22 = f4 - f19;
                float f23 = f5 - f19;
                float f24 = this.C;
                float f25 = translationX + f24;
                float f26 = f4 - f24;
                list = f3;
                float f27 = translationY + f24;
                float f28 = f5 - f24;
                i = childCount;
                Path path2 = this.b;
                path2.rewind();
                path2.moveTo(translationX, translationY);
                path2.lineTo(f25, translationY);
                path2.lineTo(f25, f21);
                path2.lineTo(f20, f21);
                path2.lineTo(f20, f27);
                path2.lineTo(translationX, f27);
                path2.close();
                i2 = i4;
                Paint paint7 = this.y;
                if (paint7 == null) {
                    paint7 = null;
                }
                canvas.drawPath(path2, paint7);
                path2.rewind();
                path2.moveTo(f4, translationY);
                path2.lineTo(f4, f27);
                path2.lineTo(f22, f27);
                path2.lineTo(f22, f21);
                path2.lineTo(f26, f21);
                path2.lineTo(f26, translationY);
                path2.close();
                Paint paint8 = this.y;
                if (paint8 == null) {
                    paint8 = null;
                }
                canvas.drawPath(path2, paint8);
                path2.rewind();
                path2.moveTo(f4, f5);
                path2.lineTo(f26, f5);
                path2.lineTo(f26, f23);
                path2.lineTo(f22, f23);
                path2.lineTo(f22, f28);
                path2.lineTo(f4, f28);
                path2.close();
                Paint paint9 = this.y;
                if (paint9 == null) {
                    paint9 = null;
                }
                canvas.drawPath(path2, paint9);
                path2.rewind();
                path2.moveTo(translationX, f5);
                path2.lineTo(translationX, f28);
                path2.lineTo(f20, f28);
                path2.lineTo(f20, f23);
                path2.lineTo(f25, f23);
                path2.lineTo(f25, f5);
                path2.close();
                Paint paint10 = this.y;
                canvas.drawPath(path2, paint10 == null ? null : paint10);
            }
            i4 = i2 + 1;
            recyclerView2 = recyclerView;
            f3 = list;
            childCount = i;
            i3 = 0;
        }
    }
}
