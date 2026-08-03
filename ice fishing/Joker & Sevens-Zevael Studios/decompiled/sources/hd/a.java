package hd;

import ac.o;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import m0.i0;
import m0.r;
import m0.z;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements oc.f {

    /* renamed from: g, reason: collision with root package name */
    public static final a f2878g = new a();

    @Override // oc.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        m5.c cVar = (m5.c) obj;
        r rVar = (r) obj2;
        int intValue = ((Number) obj3).intValue();
        pc.j.e(cVar, "navigator");
        if ((intValue & 6) == 0) {
            intValue |= (intValue & 8) == 0 ? rVar.f(cVar) : rVar.h(cVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && rVar.B()) {
            rVar.S();
        } else {
            Context context = (Context) rVar.j(AndroidCompositionLocals_androidKt.f603b);
            k5.a aVar = (k5.a) ((i0) cVar.f4881d.f1819d).getValue();
            rVar.X(765882275);
            int i10 = intValue & 14;
            boolean h10 = (i10 == 4 || ((intValue & 8) != 0 && rVar.h(cVar))) | rVar.h(context);
            Object M = rVar.M();
            if (h10 || M == m0.l.f4646a) {
                M = new ae.c(context, cVar, null, 1);
                rVar.i0(M);
            }
            rVar.q(false);
            z.f(aVar, rVar, (oc.e) M);
            i7.b.d(cVar, null, null, null, rVar, 8 | i10);
        }
        return o.f277a;
    }
}
