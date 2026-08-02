package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class vld implements b70 {
    public static final vld a = new vld();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        ald aldVar = (ald) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(aldVar.a);
        List list = dt60.a;
        dt60.d(bfxVar, aldVar.b);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new ald(str, dt60.c(xdxVar));
    }
}
