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
    private static boolean f17456a = false;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f17457b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static TypedValue f17458c;

    private static void a(final View view, final int i) {
        final View view2 = (View) view.getParent();
        if (view2 != null) {
            view2.post(new Runnable() { // from class: com.anythink.core.common.v.am.1
                @Override // java.lang.Runnable
                public final void run() {
                    Rect rect = new Rect();
                    view.getHitRect(rect);
                    int i4 = rect.top;
                    int i6 = i;
                    rect.top = i4 - i6;
                    rect.bottom += i6;
                    rect.left -= i6;
                    rect.right += i6;
                    view2.setTouchDelegate(new TouchDelegate(rect, view));
                }
            });
        }
    }

    private static boolean b(View view, float f2) {
        if (view != null) {
            Rect rect = new Rect();
            if (view.getLocalVisibleRect(rect) && rect.top >= 0 && rect.bottom <= view.getHeight() && rect.height() > view.getHeight() * f2) {
                return true;
            }
        }
        return false;
    }

    public static void a(final View view, final float f2) {
        final View view2 = (View) view.getParent();
        if (view2 != null) {
            view2.post(new Runnable() { // from class: com.anythink.core.common.v.am.2
                @Override // java.lang.Runnable
                public final void run() {
                    Rect rect = new Rect();
                    view.getHitRect(rect);
                    int width = ((int) ((f2 - 1.0f) * rect.width())) / 2;
                    int height = ((int) ((f2 - 1.0f) * rect.height())) / 2;
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
                    int i4 = rect.left;
                    if (i4 - width < 0) {
                        rect.left = 0;
                    } else {
                        rect.left = i4 - width;
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

    private static Path a(int i, int i4, int i6) {
        Path path = new Path();
        float f2 = i;
        path.moveTo(f2, 0.0f);
        float f9 = i4 - i;
        path.lineTo(f9, 0.0f);
        float f10 = i4;
        path.quadTo(f10, 0.0f, f10, f2);
        float f11 = i6 - i;
        path.lineTo(f10, f11);
        float f12 = i6;
        path.quadTo(f10, f12, f9, f12);
        path.lineTo(f2, f12);
        path.quadTo(0.0f, f12, 0.0f, f11);
        path.lineTo(0.0f, f2);
        path.quadTo(0.0f, 0.0f, f2, 0.0f);
        path.close();
        return path;
    }

    public static void a(Canvas canvas, int i, int i4, int i6) {
        try {
            Paint paint = new Paint(1);
            paint.setColor(-1);
            Bitmap createBitmap = Bitmap.createBitmap(i, i4, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            Path path = new Path();
            float f2 = i6;
            path.moveTo(f2, 0.0f);
            float f9 = i - i6;
            path.lineTo(f9, 0.0f);
            float f10 = i;
            path.quadTo(f10, 0.0f, f10, f2);
            float f11 = i4 - i6;
            path.lineTo(f10, f11);
            float f12 = i4;
            path.quadTo(f10, f12, f9, f12);
            path.lineTo(f2, f12);
            path.quadTo(0.0f, f12, 0.0f, f11);
            path.lineTo(0.0f, f2);
            path.quadTo(0.0f, 0.0f, f2, 0.0f);
            path.close();
            canvas2.drawPath(path, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(Canvas canvas, int i, int i4, RectF rectF) {
        try {
            Paint paint = new Paint(1);
            paint.setColor(-1);
            paint.setStyle(Paint.Style.FILL);
            Bitmap createBitmap = Bitmap.createBitmap(i, i4, Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawArc(rectF, 0.0f, 180.0f, true, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static int[] a(int i, int i4, float f2) {
        if (f2 > i / i4) {
            i4 = (int) Math.ceil(r0 / f2);
        } else {
            i = (int) Math.ceil(r1 * f2);
        }
        return new int[]{i, i4};
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

    public static void a(boolean z6) {
        f17456a = z6;
    }

    public static boolean a(View view, f.b bVar) {
        return a(view, bVar, 80);
    }

    public static boolean a(View view, f.b bVar, int i) {
        if (view != null && view.getParent() != null && bVar != null) {
            Object parent = view.getParent();
            if ((parent instanceof View) && bVar.a((View) parent, view, i, 0) && !f17456a) {
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

    public static void a(View view, int i, int i4) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i4;
            view.setLayoutParams(layoutParams);
        }
    }
}
