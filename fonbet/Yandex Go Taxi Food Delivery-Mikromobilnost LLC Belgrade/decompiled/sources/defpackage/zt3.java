package defpackage;

import android.graphics.RectF;
import android.text.TextPaint;
import android.widget.TextView;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.plaquesdk.widget.RobotoTextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class zt3 {
    public final RobotoTextView c;
    public final int[] e;
    public final float f;
    public int g;
    public final RectF a = new RectF();
    public final HashMap b = new HashMap();
    public final TextPaint d = new TextPaint();

    public zt3(RobotoTextView robotoTextView, float f, float f2, int i) {
        this.e = new int[0];
        this.c = robotoTextView;
        this.f = f2;
        this.g = i;
        if (f > f2) {
            ny61.g("min text size > max text size");
            throw null;
        }
        float round = Math.round(f);
        int i2 = 1;
        while (true) {
            round += 1.0f;
            if (Math.round(round) > Math.round(this.f)) {
                break;
            } else {
                i2++;
            }
        }
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = Math.round(f);
            f += 1.0f;
        }
        if (i2 != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = iArr[i4];
                if (i5 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i5)) < 0) {
                    arrayList.add(Integer.valueOf(i5));
                }
            }
            if (i2 != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i6 = 0; i6 < size; i6++) {
                    iArr2[i6] = ((Integer) arrayList.get(i6)).intValue();
                }
                iArr = iArr2;
            }
        }
        this.e = iArr;
    }

    public final Method a(String str) {
        HashMap hashMap = this.b;
        try {
            Method method = (Method) hashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, null)) != null) {
                method.setAccessible(true);
                hashMap.put(str, method);
            }
            return method;
        } catch (Exception unused) {
            skd0.h(PlusLogTag.SDK, "Failed to retrieve TextView#" + str + "() method", null);
            return null;
        }
    }

    public final Object b(RobotoTextView robotoTextView, String str, Object obj) {
        try {
            return a(str).invoke(robotoTextView, null);
        } catch (Exception unused) {
            skd0.h(PlusLogTag.SDK, "Failed to invoke TextView#" + str + "() method", null);
            return obj;
        }
    }
}
