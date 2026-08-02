package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;

/* loaded from: classes15.dex */
public final class r6e {
    public final SharedPreferences a;
    public final int b;
    public final int c;
    public int d;

    public r6e(Context context, SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
        this.b = context.getResources().getDimensionPixelSize(gvg0.timeline_image_min_size);
        this.c = context.getResources().getDimensionPixelSize(gvg0.timeline_message_max_width);
        this.d = sharedPreferences.getInt("APPROXIMATE_IMAGE_RESTRICTION_KEY", 0);
    }

    public final Point a(int i, Integer num, Integer num2) {
        int k;
        if (this.d != i) {
            this.a.edit().putInt("APPROXIMATE_IMAGE_RESTRICTION_KEY", i).apply();
        }
        this.d = i;
        Point point = new Point();
        int i2 = this.b;
        if (num == null || num2 == null || num.intValue() == 0 || num2.intValue() == 0) {
            point.set(i2, i2);
            return point;
        }
        int i3 = this.c;
        if (i3 > 0) {
            i = Math.min(i3, i);
        }
        float intValue = num.intValue() / num2.intValue();
        if (intValue > 1.0f) {
            if (num2.intValue() > i2) {
                int k2 = sb2.k(num.intValue(), i2, i);
                k = sb2.k(Math.round(k2 / intValue), i2, i);
                i2 = k2;
            } else {
                i2 = sb2.k(Math.round(i2 * intValue), i2, i);
                k = i2;
            }
        } else if (num.intValue() > i2) {
            int k3 = sb2.k(num2.intValue(), i2, i);
            i2 = sb2.k(Math.round(k3 * intValue), i2, i);
            k = k3;
        } else {
            k = sb2.k(Math.round(i2 / intValue), i2, i);
        }
        point.set(i2, k);
        return point;
    }
}
