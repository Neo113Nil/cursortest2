package com.anythink.core.common.v;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.anythink.core.common.v.a.f;

/* loaded from: classes.dex */
public final class am {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f16669a = false;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f16670b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static TypedValue f16671c;

    private static void a(final View view, final int i) {
        final View view2 = (View) view.getParent();
        if (view2 != null) {
            view2.post(new Runnable() { // from class: com.anythink.core.common.v.am.1
                @Override // java.lang.Runnable
                public final void run() {
                    Rect rect = new Rect();
                    view.getHitRect(rect);
                    int i6 = rect.top;
                    int i9 = i;
                    rect.top = i6 - i9;
                    rect.bottom += i9;
                    rect.left -= i9;
                    rect.right += i9;
                    view2.setTouchDelegate(new TouchDelegate(rect, view));
                }
            });
        }
    }

    private static boolean b(View view, float f3) {
        if (view != null) {
            Rect rect = new Rect();
            if (view.getLocalVisibleRect(rect) && rect.top >= 0 && rect.bottom <= view.getHeight() && rect.height() > view.getHeight() * f3) {
                return true;
            }
        }
        return false;
    }

    public static void a(final View view, final float f3) {
        final View view2 = (View) view.getParent();
        if (view2 != null) {
            view2.post(new Runnable() { // from class: com.anythink.core.common.v.am.2
                @Override // java.lang.Runnable
                public final void run() {
                    Rect rect = new Rect();
                    view.getHitRect(rect);
                    int width = ((int) ((f3 - 1.0f) * rect.width())) / 2;
                    int height = ((int) ((f3 - 1.0f) * rect.height())) / 2;
                    int i = rect.top;
                    if (i - height < 0) {
                        rect.top = 0;
                    } else {
                        rect.top = i - height;
                    }
                    if (rect.bottom + height > view2.getHeight()) {
                        rect.bottom = view2.getHeight();
                    } else {
                        rect.bottom += height;
                    }
                    int i6 = rect.left;
                    if (i6 - width < 0) {
                        rect.left = 0;
                    } else {
                        rect.left = i6 - width;
                    }
                    if (rect.right + width > view2.getWidth()) {
                        rect.right = view2.getWidth();
                    } else {
                        rect.right += width;
                    }
                    view2.setTouchDelegate(new TouchDelegate(rect, view));
                }
            });
        }
    }

    private static Path a(int i, int i6, int i9) {
        Path path = new Path();
        float f3 = i;
        path.moveTo(f3, 0.0f);
        float f9 = i6 - i;
        path.lineTo(f9, 0.0f);
        float f10 = i6;
        path.quadTo(f10, 0.0f, f10, f3);
        float f11 = i9 - i;
        path.lineTo(f10, f11);
        float f12 = i9;
        path.quadTo(f10, f12, f9, f12);
        path.lineTo(f3, f12);
        path.quadTo(0.0f, f12, 0.0f, f11);
        path.lineTo(0.0f, f3);
        path.quadTo(0.0f, 0.0f, f3, 0.0f);
        path.close();
        return path;
    }

    public static void a(Canvas canvas, int i, int i6, int i9) {
        try {
            Paint paint = new Paint(1);
            paint.setColor(-1);
            Bitmap createBitmap = Bitmap.createBitmap(i, i6, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            Path path = new Path();
            float f3 = i9;
            path.moveTo(f3, 0.0f);
            float f9 = i - i9;
            path.lineTo(f9, 0.0f);
            float f10 = i;
            path.quadTo(f10, 0.0f, f10, f3);
            float f11 = i6 - i9;
            path.lineTo(f10, f11);
            float f12 = i6;
            path.quadTo(f10, f12, f9, f12);
            path.lineTo(f3, f12);
            path.quadTo(0.0f, f12, 0.0f, f11);
            path.lineTo(0.0f, f3);
            path.quadTo(0.0f, 0.0f, f3, 0.0f);
            path.close();
            canvas2.drawPath(path, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(Canvas canvas, int i, int i6, RectF rectF) {
        try {
            Paint paint = new Paint(1);
            paint.setColor(-1);
            paint.setStyle(Paint.Style.FILL);
            Bitmap createBitmap = Bitmap.createBitmap(i, i6, Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawArc(rectF, 0.0f, 180.0f, true, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static int[] a(int i, int i6, float f3) {
        if (f3 > i / i6) {
            i6 = (int) Math.ceil(r0 / f3);
        } else {
            i = (int) Math.ceil(r1 * f3);
        }
        return new int[]{i, i6};
    }

    public static void a(View view) {
        if (view != null) {
            try {
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(boolean z3) {
        f16669a = z3;
    }

    public static boolean a(View view, f.b bVar) {
        return a(view, bVar, 80);
    }

    public static boolean a(View view, f.b bVar, int i) {
        if (view != null && view.getParent() != null && bVar != null) {
            Object parent = view.getParent();
            if ((parent instanceof View) && bVar.a((View) parent, view, i, 0) && !f16669a) {
                return true;
            }
        }
        return false;
    }

    public static Drawable a(Context context, int i) {
        if (context == null) {
            return null;
        }
        return context.getDrawable(i);
    }

    public static void a(View view, int i, int i6) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i6;
            view.setLayoutParams(layoutParams);
        }
    }
}
