package zd;

import ac.o;
import m0.r;
import org.fortheloss.st.R;
import pc.j;
import u.l0;
import y0.k;
import z.j0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements oc.f {

    /* renamed from: g, reason: collision with root package name */
    public static final a f9184g = new a();

    @Override // oc.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        r rVar = (r) obj2;
        int intValue = ((Number) obj3).intValue();
        j.e((j0) obj, "$this$Button");
        if ((intValue & 17) == 16 && rVar.B()) {
            rVar.S();
        } else {
            l0.a(i7.b.B(R.drawable.btn_back, rVar), "Back", androidx.compose.foundation.layout.b.h(k.f8442a, 48), null, null, 0.0f, rVar, 432, 120);
        }
        return o.f277a;
    }
}
