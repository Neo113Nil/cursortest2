package defpackage;

import android.view.View;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes11.dex */
public abstract class wya1 {
    public static final pa90 a(int i, int i2, fid fidVar) {
        return mt71.m(i, i2 & 14, fidVar);
    }

    public static boolean b(View view) {
        return view.isAccessibilityFocused();
    }

    public static final lum c(lbb0 lbb0Var) {
        return new lum(new t1m0((byte) 0, 26), xhm0.a, new g8m0(15, lbb0Var), yhm0.a);
    }

    public static String d(AbstractList abstractList) {
        Iterator it = abstractList.iterator();
        StringBuilder sb = new StringBuilder();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) "\n");
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
            return sb.toString();
        } catch (IOException e) {
            ny61.f(e);
            return null;
        }
    }
}
