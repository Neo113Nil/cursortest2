package h;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
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

/* renamed from: h.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0224u {

    /* renamed from: k, reason: collision with root package name */
    public static final RectF f3356k = new RectF();

    /* renamed from: l, reason: collision with root package name */
    public static final ConcurrentHashMap f3357l = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f3358a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3359b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f3360c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f3361d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f3362e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f3363f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f3364g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f3365h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f3366i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f3367j;

    static {
        new ConcurrentHashMap();
    }

    public C0224u(TextView textView) {
        this.f3366i = textView;
        this.f3367j = textView.getContext();
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f3357l;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, null)) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    public static Object e(Object obj, String str, Object obj2) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return obj2;
        }
    }

    public final void a() {
        if (this.f3358a != 0) {
            if (this.f3359b) {
                if (this.f3366i.getMeasuredHeight() <= 0 || this.f3366i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = Build.VERSION.SDK_INT >= 29 ? this.f3366i.isHorizontallyScrollable() : ((Boolean) e(this.f3366i, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue() ? 1048576 : (this.f3366i.getMeasuredWidth() - this.f3366i.getTotalPaddingLeft()) - this.f3366i.getTotalPaddingRight();
                int height = (this.f3366i.getHeight() - this.f3366i.getCompoundPaddingBottom()) - this.f3366i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f3356k;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c2 = c(rectF);
                        if (c2 != this.f3366i.getTextSize()) {
                            f(0, c2);
                        }
                    } finally {
                    }
                }
            }
            this.f3359b = true;
        }
    }

    public final int c(RectF rectF) {
        TextDirectionHeuristic textDirectionHeuristic;
        CharSequence transformation;
        int length = this.f3363f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i2 = length - 1;
        int i3 = 1;
        int i4 = 0;
        while (i3 <= i2) {
            int i5 = (i3 + i2) / 2;
            int i6 = this.f3363f[i5];
            TextView textView = this.f3366i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int i7 = Build.VERSION.SDK_INT;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f3365h;
            if (textPaint == null) {
                this.f3365h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f3365h.set(textView.getPaint());
            this.f3365h.setTextSize(i6);
            Layout.Alignment alignment = (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f3365h, Math.round(rectF.right));
            obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
            if (i7 >= 29) {
                try {
                    textDirectionHeuristic = textView.getTextDirectionHeuristic();
                } catch (ClassCastException unused) {
                    Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                }
            } else {
                textDirectionHeuristic = (TextDirectionHeuristic) e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
            }
            obtain.setTextDirection(textDirectionHeuristic);
            StaticLayout build = obtain.build();
            if ((maxLines == -1 || (build.getLineCount() <= maxLines && build.getLineEnd(build.getLineCount() - 1) == text.length())) && build.getHeight() <= rectF.bottom) {
                int i8 = i5 + 1;
                i4 = i3;
                i3 = i8;
            } else {
                i4 = i5 - 1;
                i2 = i4;
            }
        }
        return this.f3363f[i4];
    }

    public final void f(int i2, float f2) {
        Context context = this.f3367j;
        float applyDimension = TypedValue.applyDimension(i2, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f3366i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f3359b = false;
                try {
                    Method d2 = d("nullLayouts");
                    if (d2 != null) {
                        d2.invoke(textView, null);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
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

    public final boolean g() {
        if (this.f3358a == 1) {
            if (!this.f3364g || this.f3363f.length == 0) {
                int floor = ((int) Math.floor((this.f3362e - this.f3361d) / this.f3360c)) + 1;
                int[] iArr = new int[floor];
                for (int i2 = 0; i2 < floor; i2++) {
                    iArr[i2] = Math.round((i2 * this.f3360c) + this.f3361d);
                }
                this.f3363f = b(iArr);
            }
            this.f3359b = true;
        } else {
            this.f3359b = false;
        }
        return this.f3359b;
    }

    public final boolean h() {
        boolean z2 = this.f3363f.length > 0;
        this.f3364g = z2;
        if (z2) {
            this.f3358a = 1;
            this.f3361d = r0[0];
            this.f3362e = r0[r1 - 1];
            this.f3360c = -1.0f;
        }
        return z2;
    }

    public final void i(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        }
        if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        }
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
        this.f3358a = 1;
        this.f3361d = f2;
        this.f3362e = f3;
        this.f3360c = f4;
        this.f3364g = false;
    }
}
