package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class yt3 {
    public final TextView a;
    public final float b;
    public final RectF c = new RectF();
    public final HashMap d = new HashMap();
    public final TextPaint e = new TextPaint();
    public final int[] f;
    public int g;

    public yt3(float f, float f2, int i, TextView textView) {
        this.a = textView;
        this.b = f2;
        this.f = new int[0];
        this.g = i;
        if (f > f2) {
            ny61.g("min text size > max text size");
            throw null;
        }
        float b = m810.b(f);
        int i2 = 1;
        while (true) {
            b += 1.0f;
            if (b > m810.b(this.b)) {
                break;
            } else {
                i2++;
            }
        }
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = m810.b(f);
            f += 1.0f;
        }
        if (i2 != 0) {
            if (i2 > 1) {
                Arrays.sort(iArr);
            }
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = iArr[i4];
                if (i5 > 0 && scc.d(arrayList, Integer.valueOf(i5)) < 0) {
                    arrayList.add(Integer.valueOf(i5));
                }
            }
            if (i2 != arrayList.size()) {
                iArr = new int[arrayList.size()];
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    iArr[i6] = ((Number) arrayList.get(i6)).intValue();
                }
            }
        }
        this.f = iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0153, code lost:
    
        if (r4.getLineEnd(r4.getLineCount() - 1) != r12.length()) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a() {
        Method method;
        Object obj;
        int[] iArr;
        Method method2;
        Object obj2;
        boolean z;
        CharSequence transformation;
        Class<TextView> cls = TextView.class;
        HashMap hashMap = this.d;
        TextView textView = this.a;
        if (textView.getMeasuredHeight() > 0 && textView.getMeasuredWidth() > 0) {
            int measuredWidth = (textView.getMeasuredWidth() - textView.getTotalPaddingLeft()) - textView.getTotalPaddingRight();
            int height = (textView.getHeight() - textView.getCompoundPaddingBottom()) - textView.getCompoundPaddingTop();
            if (measuredWidth > 0 && height > 0) {
                RectF rectF = this.c;
                rectF.setEmpty();
                rectF.right = measuredWidth;
                rectF.bottom = height;
                int[] iArr2 = this.f;
                int length = iArr2.length;
                if (length != 0) {
                    boolean z2 = true;
                    int i = length - 1;
                    int i2 = 1;
                    int i3 = 0;
                    while (i2 <= i) {
                        int i4 = (i2 + i) / 2;
                        int i5 = iArr2[i4];
                        CharSequence text = textView.getText();
                        TransformationMethod transformationMethod = textView.getTransformationMethod();
                        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                            text = transformation;
                        }
                        TextPaint paint = textView.getPaint();
                        TextPaint textPaint = this.e;
                        textPaint.set(paint);
                        textPaint.setTextSize(i5);
                        Object obj3 = Layout.Alignment.ALIGN_NORMAL;
                        try {
                            Method method3 = (Method) hashMap.get("getLayoutAlignment");
                            if (method3 == null) {
                                method = cls.getDeclaredMethod("getLayoutAlignment", null);
                                method.setAccessible(z2);
                                hashMap.put("getLayoutAlignment", method);
                            } else {
                                method = method3;
                            }
                        } catch (Exception unused) {
                            method = null;
                        }
                        if (method != null) {
                            try {
                                obj = method.invoke(textView, null);
                            } catch (Exception unused2) {
                                obj = obj3;
                            }
                        } else {
                            obj = null;
                        }
                        if (obj != null) {
                            obj3 = obj;
                        }
                        Layout.Alignment alignment = (Layout.Alignment) obj3;
                        int i6 = (int) rectF.right;
                        int maxLines = textView.getMaxLines();
                        Object obj4 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        try {
                            Method method4 = (Method) hashMap.get("getTextDirectionHeuristic");
                            if (method4 == null) {
                                iArr = iArr2;
                                try {
                                    method2 = cls.getDeclaredMethod("getTextDirectionHeuristic", null);
                                    method2.setAccessible(true);
                                    hashMap.put("getTextDirectionHeuristic", method2);
                                } catch (Exception unused3) {
                                    method2 = null;
                                    if (method2 == null) {
                                    }
                                    if (obj2 != null) {
                                    }
                                    TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) obj4;
                                    Class<TextView> cls2 = cls;
                                    StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(text != null ? "" : text, 0, text == null ? text.length() : 0, textPaint, i6).setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
                                    if (maxLines == -1) {
                                    }
                                    StaticLayout build = hyphenationFrequency.setMaxLines(maxLines).setTextDirection(textDirectionHeuristic).build();
                                    if (text != null) {
                                    }
                                    z = true;
                                    i3 = i4 - 1;
                                    i = i3;
                                    z2 = z;
                                    cls = cls2;
                                    iArr2 = iArr;
                                }
                            } else {
                                iArr = iArr2;
                                method2 = method4;
                            }
                        } catch (Exception unused4) {
                            iArr = iArr2;
                        }
                        if (method2 == null) {
                            try {
                                obj2 = method2.invoke(textView, null);
                            } catch (Exception unused5) {
                                obj2 = obj4;
                            }
                        } else {
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            obj4 = obj2;
                        }
                        TextDirectionHeuristic textDirectionHeuristic2 = (TextDirectionHeuristic) obj4;
                        Class<TextView> cls22 = cls;
                        StaticLayout.Builder hyphenationFrequency2 = StaticLayout.Builder.obtain(text != null ? "" : text, 0, text == null ? text.length() : 0, textPaint, i6).setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
                        if (maxLines == -1) {
                            maxLines = Integer.MAX_VALUE;
                        }
                        StaticLayout build2 = hyphenationFrequency2.setMaxLines(maxLines).setTextDirection(textDirectionHeuristic2).build();
                        if (text != null) {
                            if (this.g == -1) {
                                z = true;
                            } else if (build2.getLineCount() <= this.g) {
                                z = true;
                            }
                            if (build2.getHeight() <= rectF.bottom) {
                                int i7 = i4 + 1;
                                i3 = i2;
                                i2 = i7;
                                z2 = z;
                                cls = cls22;
                                iArr2 = iArr;
                            }
                            i3 = i4 - 1;
                            i = i3;
                            z2 = z;
                            cls = cls22;
                            iArr2 = iArr;
                        }
                        z = true;
                        i3 = i4 - 1;
                        i = i3;
                        z2 = z;
                        cls = cls22;
                        iArr2 = iArr;
                    }
                    return iArr2[i3];
                }
                ny61.r("No available text sizes to choose from.");
            }
        }
        return 0.0f;
    }
}
