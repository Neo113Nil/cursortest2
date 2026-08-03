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

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f4495l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f4496m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f4497a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4498b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f4499c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f4500d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f4501e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f4502f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f4503g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f4504h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f4505i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f4506j;

    /* renamed from: k, reason: collision with root package name */
    public final w f4507k;

    static {
        new ConcurrentHashMap();
    }

    public z(TextView textView) {
        this.f4505i = textView;
        this.f4506j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f4507k = new x();
        } else {
            this.f4507k = new w();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i10 : iArr) {
                if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i11 = 0; i11 < size; i11++) {
                    iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f4496m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method != null || (method = TextView.class.getDeclaredMethod(str, null)) == null) {
                return method;
            }
            method.setAccessible(true);
            concurrentHashMap.put(str, method);
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    public static Object e(TextView textView, String str, Object obj) {
        try {
            return d(str).invoke(textView, null);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return obj;
        }
    }

    public final void a() {
        if (this.f4497a != 0) {
            if (this.f4498b) {
                if (this.f4505i.getMeasuredHeight() <= 0 || this.f4505i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f4507k.a(this.f4505i) ? 1048576 : (this.f4505i.getMeasuredWidth() - this.f4505i.getTotalPaddingLeft()) - this.f4505i.getTotalPaddingRight();
                int height = (this.f4505i.getHeight() - this.f4505i.getCompoundPaddingBottom()) - this.f4505i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f4495l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c3 = c(rectF);
                        if (c3 != this.f4505i.getTextSize()) {
                            f(0, c3);
                        }
                    } finally {
                    }
                }
            }
            this.f4498b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f4502f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = length - 1;
        int i11 = 1;
        int i12 = 0;
        while (i11 <= i10) {
            int i13 = (i11 + i10) / 2;
            int i14 = this.f4502f[i13];
            TextView textView = this.f4505i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f4504h;
            if (textPaint == null) {
                this.f4504h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f4504h.set(textView.getPaint());
            this.f4504h.setTextSize(i14);
            Layout.Alignment alignment = (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f4504h, Math.round(rectF.right));
            obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
            try {
                this.f4507k.b(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            StaticLayout build = obtain.build();
            if ((maxLines == -1 || (build.getLineCount() <= maxLines && build.getLineEnd(build.getLineCount() - 1) == text.length())) && build.getHeight() <= rectF.bottom) {
                int i15 = i13 + 1;
                i12 = i11;
                i11 = i15;
            } else {
                i12 = i13 - 1;
                i10 = i12;
            }
        }
        return this.f4502f[i12];
    }

    public final void f(int i10, float f10) {
        Context context = this.f4506j;
        float applyDimension = TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f4505i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f4498b = false;
                try {
                    Method d10 = d("nullLayouts");
                    if (d10 != null) {
                        d10.invoke(textView, null);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
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
        if (this.f4497a == 1) {
            if (!this.f4503g || this.f4502f.length == 0) {
                int floor = ((int) Math.floor((this.f4501e - this.f4500d) / this.f4499c)) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round((i10 * this.f4499c) + this.f4500d);
                }
                this.f4502f = b(iArr);
            }
            this.f4498b = true;
        } else {
            this.f4498b = false;
        }
        return this.f4498b;
    }

    public final boolean h() {
        boolean z10 = this.f4502f.length > 0;
        this.f4503g = z10;
        if (z10) {
            this.f4497a = 1;
            this.f4500d = r0[0];
            this.f4501e = r0[r1 - 1];
            this.f4499c = -1.0f;
        }
        return z10;
    }

    public final void i(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f4497a = 1;
        this.f4500d = f10;
        this.f4501e = f11;
        this.f4499c = f12;
        this.f4503g = false;
    }
}
