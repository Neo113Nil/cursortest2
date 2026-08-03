package hd;

import ac.o;
import android.content.Intent;
import com.onesignal.inAppMessages.internal.display.impl.a;
import f1.d0;
import f1.i0;
import f1.q;
import j0.p0;
import j0.r0;
import j0.t0;
import java.util.ArrayList;
import l1.h0;
import l1.u;
import l1.z;
import m0.r;
import org.fortheloss.st.MainActivity;
import rd.y;
import z.s0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2908g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2909h;

    public /* synthetic */ m(int i10, Object obj) {
        this.f2908g = i10;
        this.f2909h = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        Intent intent;
        String dataString;
        int i10 = this.f2908g;
        Object obj3 = this.f2909h;
        o oVar = o.f277a;
        int i11 = 3;
        Object[] objArr = 0;
        int i12 = 1;
        switch (i10) {
            case 0:
                r rVar = (r) obj;
                MainActivity mainActivity = (MainActivity) obj3;
                if ((((Number) obj2).intValue() & 3) == 2 && rVar.B()) {
                    rVar.S();
                } else {
                    Intent intent2 = mainActivity.getIntent();
                    p0.a(uc.e.k(uc.e.k(androidx.compose.foundation.a.a(y0.k.f8442a, q.f2277b, d0.f2219a).d(androidx.compose.foundation.layout.b.f542b), new s0(i11, objArr == true ? 1 : 0)), new s0(i11, i12)), null, 0L, 0L, 0.0f, u0.e.e(538644643, new l(((intent2 != null ? intent2.getDataString() : null) == null || (intent = mainActivity.getIntent()) == null || (dataString = intent.getDataString()) == null || !xc.h.x(dataString, x4.f.I(ce.a.f1400a, "MhwEA8Xu5PLw6bRl-LH2E_Wrkkfl0PGOK70kFK8WzdAes3F8bhfbH_rEKiUJ2go2"))) ? wd.c.f7738g : td.c.f6550g, i12), rVar), rVar, 12582912, 126);
                }
                return oVar;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                r rVar2 = (r) obj;
                int intValue = ((Number) obj2).intValue();
                if (rVar2.P(intValue & 1, (intValue & 3) != 2)) {
                    throw null;
                }
                rVar2.S();
                return oVar;
            default:
                r rVar3 = (r) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && rVar3.B()) {
                    rVar3.S();
                } else if (((y) obj3).f6210f) {
                    rVar3.X(1420557005);
                    l1.f fVar = x4.f.f8296a;
                    if (fVar == null) {
                        l1.e eVar = new l1.e("Filled.PlayArrow", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i13 = h0.f4034a;
                        i0 i0Var = new i0(q.f2277b);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new l1.n(8.0f, 5.0f));
                        arrayList.add(new z(14.0f));
                        arrayList.add(new u(11.0f, -7.0f));
                        arrayList.add(l1.j.f4042c);
                        l1.e.a(eVar, arrayList, i0Var);
                        fVar = eVar.b();
                        x4.f.f8296a = fVar;
                    }
                    j0.u.b(fVar, "Resume", null, q.f2279d, rVar3, 3120, 4);
                    rVar3.q(false);
                } else {
                    rVar3.X(1420787335);
                    r0.b("⏸", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h2.h0.a(((j0.s0) rVar3.j(t0.f3483a)).f3467e, q.f2279d, 0L, null, null, 0L, 0L, null, 16777214), rVar3, 6, 65534);
                    rVar3.q(false);
                }
                return oVar;
        }
    }
}
