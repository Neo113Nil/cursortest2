package defpackage;

import java.util.Collections;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes5.dex */
public class tah extends sah {
    public static int a(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map b(Pair pair) {
        pair.getClass();
        Map singletonMap = Collections.singletonMap(pair.a, pair.b);
        singletonMap.getClass();
        return singletonMap;
    }
}
