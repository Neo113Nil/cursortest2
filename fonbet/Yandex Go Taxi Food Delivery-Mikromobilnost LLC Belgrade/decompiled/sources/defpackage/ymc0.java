package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ymc0 implements b70 {
    public static final List a = Collections.singletonList("image");

    public static xmc0 c(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(a) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        return new xmc0(str);
    }

    public static void d(bfx bfxVar, c cVar, xmc0 xmc0Var) {
        bfxVar.A1("image");
        foe foeVar = l80.a;
        bfxVar.r0(xmc0Var.a);
    }
}
