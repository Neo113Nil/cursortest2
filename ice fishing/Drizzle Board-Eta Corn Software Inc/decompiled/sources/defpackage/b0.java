package defpackage;

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

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class b0 {
    public TextPaint Qr9iLBAD;
    public final Context eVhOlqcC;
    public final TextView jb9XjC4I;
    public final y k3x7lurq;
    public static final RectF ow5vqvCr = new RectF();
    public static final ConcurrentHashMap OnDfzHZD = new ConcurrentHashMap();
    public int qoPGr6Ce = 0;
    public boolean NCTxEWno = false;
    public float MdtA4re8 = -1.0f;
    public float wxUZMvaN = -1.0f;
    public float VgvYg0wo = -1.0f;
    public int[] P7K7Inc8 = new int[0];
    public boolean b2ZJblxo = false;

    public b0(TextView textView) {
        this.jb9XjC4I = textView;
        this.eVhOlqcC = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.k3x7lurq = new z();
        } else {
            this.k3x7lurq = new y();
        }
    }

    public static int[] NCTxEWno(int[] iArr) {
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
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Object VgvYg0wo(Object obj, Object obj2, String str) {
        try {
            return wxUZMvaN(str).invoke(obj, null);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return obj2;
        }
    }

    public static Method wxUZMvaN(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = OnDfzHZD;
            Method method = (Method) concurrentHashMap.get(str);
            if (method != null || (method = TextView.class.getDeclaredMethod(str, null)) == null) {
                return method;
            }
            method.setAccessible(true);
            concurrentHashMap.put(str, method);
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    public final int MdtA4re8(RectF rectF) {
        CharSequence transformation;
        int length = this.P7K7Inc8.length;
        if (length == 0) {
            m1.Ey6iv0m0("No available text sizes to choose from.");
            return 0;
        }
        int i = length - 1;
        int i2 = 0;
        int i3 = 1;
        while (true) {
            int[] iArr = this.P7K7Inc8;
            if (i3 > i) {
                return iArr[i2];
            }
            int i4 = (i3 + i) / 2;
            int i5 = iArr[i4];
            TextView textView = this.jb9XjC4I;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.Qr9iLBAD;
            if (textPaint == null) {
                this.Qr9iLBAD = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.Qr9iLBAD.set(textView.getPaint());
            this.Qr9iLBAD.setTextSize(i5);
            StaticLayout qoPGr6Ce = x.qoPGr6Ce(charSequence, (Layout.Alignment) VgvYg0wo(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment"), Math.round(rectF.right), maxLines, this.jb9XjC4I, this.Qr9iLBAD, this.k3x7lurq);
            if ((maxLines == -1 || (qoPGr6Ce.getLineCount() <= maxLines && qoPGr6Ce.getLineEnd(qoPGr6Ce.getLineCount() - 1) == charSequence.length())) && qoPGr6Ce.getHeight() <= rectF.bottom) {
                int i6 = i4 + 1;
                i2 = i3;
                i3 = i6;
            } else {
                i2 = i4 - 1;
                i = i2;
            }
        }
    }

    public final boolean P7K7Inc8() {
        return eVhOlqcC() && this.qoPGr6Ce != 0;
    }

    public final boolean Qr9iLBAD() {
        if (!eVhOlqcC() || this.qoPGr6Ce != 1) {
            this.NCTxEWno = false;
            return false;
        }
        if (!this.b2ZJblxo || this.P7K7Inc8.length == 0) {
            int floor = ((int) Math.floor((this.VgvYg0wo - this.wxUZMvaN) / this.MdtA4re8)) + 1;
            int[] iArr = new int[floor];
            for (int i = 0; i < floor; i++) {
                iArr[i] = Math.round((i * this.MdtA4re8) + this.wxUZMvaN);
            }
            this.P7K7Inc8 = NCTxEWno(iArr);
        }
        this.NCTxEWno = true;
        return true;
    }

    public final void b2ZJblxo(int i, float f) {
        Context context = this.eVhOlqcC;
        float applyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.jb9XjC4I;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.NCTxEWno = false;
                try {
                    Method wxUZMvaN = wxUZMvaN("nullLayouts");
                    if (wxUZMvaN != null) {
                        wxUZMvaN.invoke(textView, null);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
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

    public final boolean eVhOlqcC() {
        return !(this.jb9XjC4I instanceof qIGtQL9b);
    }

    public final boolean jb9XjC4I() {
        boolean z = this.P7K7Inc8.length > 0;
        this.b2ZJblxo = z;
        if (z) {
            this.qoPGr6Ce = 1;
            this.wxUZMvaN = r0[0];
            this.VgvYg0wo = r0[r1 - 1];
            this.MdtA4re8 = -1.0f;
        }
        return z;
    }

    public final void k3x7lurq(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.qoPGr6Ce = 1;
        this.wxUZMvaN = f;
        this.VgvYg0wo = f2;
        this.MdtA4re8 = f3;
        this.b2ZJblxo = false;
    }

    public final void qoPGr6Ce() {
        if (P7K7Inc8()) {
            if (this.NCTxEWno) {
                if (this.jb9XjC4I.getMeasuredHeight() <= 0 || this.jb9XjC4I.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.k3x7lurq.NCTxEWno(this.jb9XjC4I) ? 1048576 : (this.jb9XjC4I.getMeasuredWidth() - this.jb9XjC4I.getTotalPaddingLeft()) - this.jb9XjC4I.getTotalPaddingRight();
                int height = (this.jb9XjC4I.getHeight() - this.jb9XjC4I.getCompoundPaddingBottom()) - this.jb9XjC4I.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = ow5vqvCr;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float MdtA4re8 = MdtA4re8(rectF);
                        if (MdtA4re8 != this.jb9XjC4I.getTextSize()) {
                            b2ZJblxo(0, MdtA4re8);
                        }
                    } finally {
                    }
                }
            }
            this.NCTxEWno = true;
        }
    }
}
