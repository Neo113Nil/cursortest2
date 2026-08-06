package i1;

import h1.C0234d;
import java.util.Collections;
import java.util.Map;
import u0.AbstractC1050a;

/* loaded from: classes.dex */
public abstract class v extends AbstractC1050a {
    public static int G(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map H(C0234d pair) {
        kotlin.jvm.internal.i.e(pair, "pair");
        Map singletonMap = Collections.singletonMap(pair.f3386a, pair.f3387b);
        kotlin.jvm.internal.i.d(singletonMap, "singletonMap(...)");
        return singletonMap;
    }
}
