package yads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import defpackage.bd81;
import defpackage.cu81;
import defpackage.dm81;
import defpackage.k081;
import defpackage.s881;
import defpackage.uga1;
import defpackage.us81;
import defpackage.vh71;
import defpackage.y681;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class nz2 implements View.OnLayoutChangeListener {
    public final dm81 a;
    public final bd81 b;
    public final k081 c;
    public final cu81 d;
    public final Drawable e;

    public nz2(dm81 dm81Var, bd81 bd81Var, k081 k081Var, cu81 cu81Var, Drawable drawable) {
        this.a = dm81Var;
        this.b = bd81Var;
        this.c = k081Var;
        this.d = cu81Var;
        this.e = drawable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x012a, code lost:
    
        if (defpackage.jl40.l(r14, r12) != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x012c, code lost:
    
        r7 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0139, code lost:
    
        if (defpackage.jl40.l(r9, r13) != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0140, code lost:
    
        if (defpackage.jl40.l(r14, r12) != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0122, code lost:
    
        if (defpackage.jl40.l(r9, r13) != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0124, code lost:
    
        r7 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014a  */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v9, types: [vh71] */
    @Override // android.view.View.OnLayoutChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Bitmap bitmap;
        vh71 vh71Var;
        ArrayList arrayList;
        vh71 vh71Var2;
        us81 us81Var;
        float f;
        float f2;
        String str;
        y681 y681Var;
        vh71 vh71Var3;
        us81 us81Var2;
        float width;
        String str2;
        String str3;
        ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
        if (imageView == null) {
            return;
        }
        Drawable drawable = this.e;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
            return;
        }
        boolean z = (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) ? false : true;
        boolean z2 = (i4 == i2 || i == i3) ? false : true;
        if (z && z2) {
            RectF rectF = new RectF(0.0f, 0.0f, imageView.getWidth(), imageView.getHeight());
            if (rectF.height() == 0.0f) {
                return;
            }
            dm81 dm81Var = this.a;
            cu81 cu81Var = this.d;
            dm81Var.getClass();
            y681 y681Var2 = cu81Var.e;
            if (y681Var2 != null && (us81Var = y681Var2.e) != null) {
                String str4 = us81Var.d;
                boolean z3 = (str4 == null || (str3 = us81Var.a) == null || !str4.equals(str3)) ? false : true;
                String str5 = us81Var.c;
                boolean z4 = (str5 == null || (str2 = us81Var.b) == null || !str5.equals(str2)) ? false : true;
                if (z3 || z4) {
                    dm81 dm81Var2 = this.a;
                    cu81 cu81Var2 = this.d;
                    dm81Var2.getClass();
                    y681 y681Var3 = cu81Var2.e;
                    if (y681Var3 != null && (us81Var2 = y681Var3.e) != null) {
                        String str6 = us81Var2.d;
                        String str7 = us81Var2.c;
                        String str8 = us81Var2.a;
                        String str9 = us81Var2.b;
                        vh71 vh71Var4 = y681Var3.f;
                        if (vh71Var4 != null) {
                            int i9 = vh71Var4.d;
                            int i10 = vh71Var4.c;
                            float width2 = rectF.width();
                            float height = rectF.height();
                            float f3 = cu81Var2.a;
                            float f4 = cu81Var2.b;
                            f2 = 1.0f;
                            float f5 = i10;
                            f = 0.0f;
                            float f6 = i9;
                            if (width2 != 0.0f && height != 0.0f && f3 != 0.0f && f4 != 0.0f && f5 != 0.0f && f6 != 0.0f) {
                                if (rectF.width() / rectF.height() > i10 / i9) {
                                    width = rectF.height();
                                } else {
                                    width = rectF.width();
                                    i9 = i10;
                                }
                                if (width / i9 <= 1.0f) {
                                    if (width2 / height > f5 / f6) {
                                    }
                                } else if (width2 / height > f3 / f4) {
                                }
                                y681Var = this.d.e;
                                if (y681Var == null || (vh71Var3 = y681Var.f) == null) {
                                    return;
                                }
                                int i11 = vh71Var3.b;
                                int i12 = vh71Var3.a;
                                int i13 = vh71Var3.d;
                                int i14 = vh71Var3.c;
                                k081 k081Var = this.c;
                                if (str == null) {
                                    k081Var.a(imageView, bitmap, vh71Var3);
                                    return;
                                }
                                k081Var.getClass();
                                Matrix matrix = k081Var.a;
                                float width3 = imageView.getWidth();
                                float height2 = imageView.getHeight();
                                float width4 = bitmap.getWidth();
                                float height3 = bitmap.getHeight();
                                float f7 = i14;
                                float f8 = i13;
                                if (height2 == f || f8 == f || height3 == f) {
                                    return;
                                }
                                float f9 = width3 / height2;
                                float f10 = f9 < f7 / f8 ? width3 / f7 : height2 / f8;
                                if (f10 > f2) {
                                    f10 = f9 < width4 / height3 ? width3 / width4 : height2 / height3;
                                }
                                matrix.setScale(f10, f10);
                                matrix.postTranslate((width3 / 2.0f) - (((i14 / 2) + i12) * f10), (height2 / 2.0f) - (((i13 / 2) + i11) * f10));
                                imageView.setScaleType(ImageView.ScaleType.MATRIX);
                                imageView.setImageMatrix(matrix);
                                imageView.setBackgroundColor(Color.parseColor(str));
                                if (s881.a(imageView.getContext(), "YadPreferenceFile").a("preference_smart_centers_debug_enabled", false)) {
                                    Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                                    Canvas canvas = new Canvas(copy);
                                    Rect rect = k081Var.c;
                                    rect.set(i12, i11, i14 + i12, i13 + i11);
                                    canvas.drawRect(rect, k081Var.b);
                                    imageView.setImageBitmap(copy);
                                    return;
                                }
                                return;
                            }
                            str = null;
                            y681Var = this.d.e;
                            if (y681Var == null) {
                                return;
                            } else {
                                return;
                            }
                        }
                    }
                    f = 0.0f;
                    f2 = 1.0f;
                    str = null;
                    y681Var = this.d.e;
                    if (y681Var == null) {
                    }
                }
            }
            bd81 bd81Var = this.b;
            cu81 cu81Var3 = this.d;
            bd81Var.getClass();
            RectF rectF2 = new RectF(0.0f, 0.0f, cu81Var3.a, cu81Var3.b);
            y681 y681Var4 = cu81Var3.e;
            if (y681Var4 == null || (arrayList = y681Var4.g) == null) {
                vh71Var = null;
            } else {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    ?? next = it.next();
                    loop0: while (true) {
                        vh71Var2 = next;
                        while (it.hasNext()) {
                            next = (vh71) it.next();
                            vh71Var2 = vh71Var2;
                            float a = uga1.a(vh71Var2, rectF, rectF2);
                            float a2 = uga1.a(next, rectF, rectF2);
                            if (a != Float.MAX_VALUE) {
                                if (a == a2) {
                                    if (vh71Var2.e > next.e) {
                                    }
                                } else if (a > a2) {
                                    break;
                                }
                            }
                        }
                        break loop0;
                    }
                } else {
                    vh71Var2 = null;
                }
                vh71Var = vh71Var2;
            }
            if (vh71Var != null) {
                this.c.a(imageView, bitmap, vh71Var);
            }
        }
    }
}
