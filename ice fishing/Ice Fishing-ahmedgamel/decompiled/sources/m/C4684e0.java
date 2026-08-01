package m;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: m.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4684e0 {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f39131l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f39132m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f39133a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f39134b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f39135c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f39136d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f39137e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f39138f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f39139g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f39140h;
    public final TextView i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f39141j;

    /* renamed from: k, reason: collision with root package name */
    public final C4678b0 f39142k;

    public C4684e0(TextView textView) {
        this.i = textView;
        this.f39141j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f39142k = new C4680c0();
        } else {
            this.f39142k = new C4678b0();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i6 = 0; i6 < size; i6++) {
                    iArr2[i6] = ((Integer) arrayList.get(i6)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f39132m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method != null || (method = TextView.class.getDeclaredMethod(str, new Class[0])) == null) {
                return method;
            }
            method.setAccessible(true);
            concurrentHashMap.put(str, method);
            return method;
        } catch (Exception e9) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e9);
            return null;
        }
    }

    public static Object e(Object obj, String str, Object obj2) {
        try {
            return d(str).invoke(obj, new Object[0]);
        } catch (Exception e9) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e9);
            return obj2;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f39134b) {
                if (this.i.getMeasuredHeight() <= 0 || this.i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f39142k.b(this.i) ? com.anythink.basead.exoplayer.h.o.f7742d : (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                int height = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f39131l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c9 = c(rectF);
                        if (c9 != this.i.getTextSize()) {
                            g(c9, 0);
                        }
                    } finally {
                    }
                }
            }
            this.f39134b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f39138f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i6 = 0;
        int i9 = 1;
        while (i9 <= i) {
            int i10 = (i9 + i) / 2;
            int i11 = this.f39138f[i10];
            TextView textView = this.i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f39140h;
            if (textPaint == null) {
                this.f39140h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f39140h.set(textView.getPaint());
            this.f39140h.setTextSize(i11);
            StaticLayout a9 = AbstractC4676a0.a(charSequence, (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines, this.i, this.f39140h, this.f39142k);
            if ((maxLines == -1 || (a9.getLineCount() <= maxLines && a9.getLineEnd(a9.getLineCount() - 1) == charSequence.length())) && a9.getHeight() <= rectF.bottom) {
                int i12 = i10 + 1;
                i6 = i9;
                i9 = i12;
            } else {
                i6 = i10 - 1;
                i = i6;
            }
        }
        return this.f39138f[i6];
    }

    public final boolean f() {
        return j() && this.f39133a != 0;
    }

    public final void g(float f3, int i) {
        Context context = this.f39141j;
        float applyDimension = TypedValue.applyDimension(i, f3, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f39134b = false;
                try {
                    Method d2 = d("nullLayouts");
                    if (d2 != null) {
                        d2.invoke(textView, new Object[0]);
                    }
                } catch (Exception e9) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e9);
                }
                if (isInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f39133a == 1) {
            if (!this.f39139g || this.f39138f.length == 0) {
                int floor = ((int) Math.floor((this.f39137e - this.f39136d) / this.f39135c)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round((i * this.f39135c) + this.f39136d);
                }
                this.f39138f = b(iArr);
            }
            this.f39134b = true;
        } else {
            this.f39134b = false;
        }
        return this.f39134b;
    }

    public final boolean i() {
        boolean z3 = this.f39138f.length > 0;
        this.f39139g = z3;
        if (z3) {
            this.f39133a = 1;
            this.f39136d = r0[0];
            this.f39137e = r0[r1 - 1];
            this.f39135c = -1.0f;
        }
        return z3;
    }

    public final boolean j() {
        return !(this.i instanceof C4714u);
    }

    public final void k(float f3, float f9, float f10) {
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f3 + "px) is less or equal to (0px)");
        }
        if (f9 <= f3) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f9 + "px) is less or equal to minimum auto-size text size (" + f3 + "px)");
        }
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f10 + "px) is less or equal to (0px)");
        }
        this.f39133a = 1;
        this.f39136d = f3;
        this.f39137e = f9;
        this.f39135c = f10;
        this.f39139g = false;
    }
}
