package defpackage;

import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zby {
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(String str) {
        ArrayList arrayList = tp11.c;
        ArrayList arrayList2 = tp11.b;
        if (str != null) {
            if (arrayList2.contains(str)) {
                return true;
            }
            if (!arrayList.contains(str)) {
                int[] iArr = up11.a;
                eja1.n();
                int e = up11.c.e();
                Typeface[] typefaceArr = new Typeface[e];
                for (int i = 0; i < e; i++) {
                    typefaceArr[i] = up11.c.f(i);
                }
                boolean d = tp11.d(str, (Typeface[]) Arrays.copyOf(typefaceArr, e));
                if (d) {
                    arrayList2.add(str);
                    xby.d.n("Char is supported in all internal typefaces: [" + str + "]");
                    return d;
                }
                arrayList.add(str);
                xby.d.n("Char is not supported in one of internal typefaces: [" + str + "]");
                return d;
            }
        }
        return false;
    }
}
