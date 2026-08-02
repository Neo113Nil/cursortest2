package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.yandex.plus.core.data.common.PlusColor;
import com.yandex.plus.core.data.common.PlusGradient;
import com.yandex.plus.core.gradient.api.LinearGradientDrawable;
import com.yandex.plus.core.gradient.api.PlusDrawable;
import com.yandex.plus.core.gradient.api.RadialGradientDrawable;
import com.yandex.plus.core.gradient.api.a;
import com.yandex.plus.home.common.utils.RoundedDrawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes2.dex */
public abstract class s2d0 {
    public static final Drawable a(PlusColor plusColor, float f, float f2, float f3, float f4) {
        Drawable c;
        if (plusColor instanceof PlusColor.Color) {
            c = new ColorDrawable(((PlusColor.Color) plusColor).getColor());
        } else {
            if (!(plusColor instanceof PlusColor.Gradient)) {
                w511.b();
                return null;
            }
            c = c(((PlusColor.Gradient) plusColor).getGradients());
        }
        Drawable drawable = c;
        return msa1.n(f, f2, f3, f4) ? new RoundedDrawable(drawable, f, f2, f3, f4) : drawable;
    }

    public static final Drawable b(PlusColor plusColor, int i, float f, float f2, float f3, float f4) {
        if (plusColor != null) {
            return a(plusColor, f, f2, f3, f4);
        }
        ColorDrawable colorDrawable = new ColorDrawable(i);
        return msa1.n(f, f2, f3, f4) ? new RoundedDrawable(colorDrawable, f, f2, f3, f4) : colorDrawable;
    }

    public static final PlusDrawable c(List list) {
        PlusDrawable radialGradientDrawable;
        List<PlusGradient> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (PlusGradient plusGradient : list2) {
            if (plusGradient instanceof PlusGradient.Linear) {
                PlusGradient.Linear linear = (PlusGradient.Linear) plusGradient;
                radialGradientDrawable = new LinearGradientDrawable((float) linear.getAngle(), linear.getColors(), f(linear.getPositions()));
            } else {
                if (!(plusGradient instanceof PlusGradient.Radial)) {
                    w511.b();
                    return null;
                }
                PlusGradient.Radial radial = (PlusGradient.Radial) plusGradient;
                Pair<Double, Double> center = radial.getCenter();
                PointF pointF = new PointF((float) ((Number) center.c()).doubleValue(), (float) ((Number) center.f()).doubleValue());
                Pair<Double, Double> radius = radial.getRadius();
                radialGradientDrawable = new RadialGradientDrawable(pointF, new PointF((float) ((Number) radius.c()).doubleValue(), (float) ((Number) radius.f()).doubleValue()), radial.getColors(), f(radial.getPositions()));
            }
            arrayList.add(radialGradientDrawable);
        }
        return a.a(arrayList);
    }

    public static /* synthetic */ Drawable d(PlusColor plusColor, int i, float f, float f2, float f3, float f4, int i2) {
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 16) != 0) {
            f4 = 0.0f;
        }
        return b(plusColor, i, f, f2, f3, f4);
    }

    public static final Drawable e(PlusColor plusColor, Context context, int i) {
        if (plusColor instanceof PlusColor.Color) {
            Drawable drawable = context.getDrawable(i);
            if (drawable == null) {
                return null;
            }
            drawable.setTint(((PlusColor.Color) plusColor).getColor());
            return drawable;
        }
        if (!(plusColor instanceof PlusColor.Gradient)) {
            w511.b();
            return null;
        }
        Drawable drawable2 = context.getDrawable(i);
        if (drawable2 == null) {
            return null;
        }
        drawable2.setTint(((Number) kotlin.collections.a.P(((PlusGradient) kotlin.collections.a.P(((PlusColor.Gradient) plusColor).getGradients())).getColors())).intValue());
        return drawable2;
    }

    public static final ArrayList f(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf((float) ((Number) it.next()).doubleValue()));
        }
        return arrayList;
    }

    public static final int g(PlusColor plusColor) {
        if (plusColor instanceof PlusColor.Color) {
            return ((PlusColor.Color) plusColor).getColor();
        }
        if (plusColor instanceof PlusColor.Gradient) {
            return ((Number) kotlin.collections.a.P(((PlusGradient) kotlin.collections.a.P(((PlusColor.Gradient) plusColor).getGradients())).getColors())).intValue();
        }
        return 0;
    }
}
