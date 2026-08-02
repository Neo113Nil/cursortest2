package defpackage;

import android.graphics.BlendMode;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes11.dex */
public abstract class sta1 {
    public static final String a(RoutePointType routePointType) {
        int i = i7l0.a[routePointType.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? routePointType.getType() : "favorite" : "destination" : "starting";
    }

    public static final BlendMode b(int i) {
        return i == 0 ? BlendMode.CLEAR : i == 1 ? BlendMode.SRC : i == 2 ? BlendMode.DST : i == 3 ? BlendMode.SRC_OVER : i == 4 ? BlendMode.DST_OVER : i == 5 ? BlendMode.SRC_IN : i == 6 ? BlendMode.DST_IN : i == 7 ? BlendMode.SRC_OUT : i == 8 ? BlendMode.DST_OUT : i == 9 ? BlendMode.SRC_ATOP : i == 10 ? BlendMode.DST_ATOP : i == 11 ? BlendMode.XOR : i == 12 ? BlendMode.PLUS : i == 13 ? BlendMode.MODULATE : i == 14 ? BlendMode.SCREEN : i == 15 ? BlendMode.OVERLAY : i == 16 ? BlendMode.DARKEN : i == 17 ? BlendMode.LIGHTEN : i == 18 ? BlendMode.COLOR_DODGE : i == 19 ? BlendMode.COLOR_BURN : i == 20 ? BlendMode.HARD_LIGHT : i == 21 ? BlendMode.SOFT_LIGHT : i == 22 ? BlendMode.DIFFERENCE : i == 23 ? BlendMode.EXCLUSION : i == 24 ? BlendMode.MULTIPLY : i == 25 ? BlendMode.HUE : i == 26 ? BlendMode.SATURATION : i == 27 ? BlendMode.COLOR : i == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static int c(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    public static boolean d(s4r0 s4r0Var, Collection collection) {
        collection.getClass();
        if (collection instanceof pi91) {
            collection = ((pi91) collection).zza();
        }
        boolean z = false;
        if (!(collection instanceof Set) || collection.size() <= s4r0Var.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z |= s4r0Var.remove(it.next());
            }
            return z;
        }
        Iterator<E> it2 = s4r0Var.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }
}
