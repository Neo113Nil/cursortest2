package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class xpc0 implements b70 {
    public static final List a = Collections.singletonList("__typename");

    public static tpc0 c(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(a) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new tpc0(str, ync0.c(xdxVar, cVar));
    }
}
