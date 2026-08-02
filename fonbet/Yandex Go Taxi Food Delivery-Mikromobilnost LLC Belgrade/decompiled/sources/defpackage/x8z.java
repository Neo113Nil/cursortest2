package defpackage;

import java.util.EnumSet;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.statebar.data.LocationErrorReason;

/* loaded from: classes10.dex */
public final class x8z {
    public final r0 a = bvf0.c(new q8z(LocationErrorReason.NONE));

    public final void a(LocationErrorReason locationErrorReason) {
        r0 r0Var = this.a;
        r8z r8zVar = (r8z) r0Var.getValue();
        if ((r8zVar instanceof p8z) && r8zVar.a == locationErrorReason) {
            q8z q8zVar = new q8z(LocationErrorReason.NONE);
            r0Var.getClass();
            r0Var.m(null, q8zVar);
        }
    }

    public final void b(EnumSet enumSet) {
        r0 r0Var = this.a;
        r8z r8zVar = (r8z) r0Var.getValue();
        if ((r8zVar instanceof p8z) && enumSet.contains(r8zVar.a)) {
            q8z q8zVar = new q8z(LocationErrorReason.NONE);
            r0Var.getClass();
            r0Var.m(null, q8zVar);
        }
    }

    public final void c(String str, String str2, LocationErrorReason locationErrorReason, Runnable runnable) {
        p8z p8zVar = new p8z(str, str2, locationErrorReason, runnable);
        r0 r0Var = this.a;
        r0Var.getClass();
        r0Var.m(null, p8zVar);
    }
}
