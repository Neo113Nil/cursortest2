package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class umc0 implements b70 {
    public static final umc0 a = new umc0();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        rmc0 rmc0Var = (rmc0) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(rmc0Var.a);
        List list = vmc0.a;
        smc0 smc0Var = rmc0Var.b;
        bfxVar.A1("position");
        bfxVar.r0(smc0Var.a.getRawValue());
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new rmc0(str, vmc0.c(xdxVar));
    }
}
