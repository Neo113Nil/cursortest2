package defpackage;

import java.util.Arrays;
import kotlin.collections.b;
import kotlin.collections.builders.ListBuilder;
import ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.a;
import ru.yandex.logistics.sdk.cargo_form.impl.model.address.PointType;

/* loaded from: classes5.dex */
public final class r61 {
    public final dv8 a;
    public final f4l0 b;
    public final is0 c;
    public final p6s d;
    public final bt0 e;
    public final z5s f;
    public final boj0 g;
    public final a h;
    public final m2v i;

    public r61(dv8 dv8Var, f4l0 f4l0Var, is0 is0Var, p6s p6sVar, bt0 bt0Var, z5s z5sVar, boj0 boj0Var, a aVar, m2v m2vVar) {
        this.a = dv8Var;
        this.b = f4l0Var;
        this.c = is0Var;
        this.d = p6sVar;
        this.e = bt0Var;
        this.f = z5sVar;
        this.g = boj0Var;
        this.h = aVar;
        this.i = m2vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c A[LOOP:0: B:23:0x008a->B:24:0x008c, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ju0 ju0Var, vu0 vu0Var, boolean z) {
        boolean z2;
        int length;
        boolean z3 = kotlin.collections.a.S(ju0Var.getIndex(), this.b.getRoute().a) == null || (ju0Var instanceof iu0);
        q qVar = new q(5, this, ju0Var, vu0Var);
        q61 q61Var = new q61(this, z3, ju0Var);
        q61 q61Var2 = new q61(z, this, ju0Var);
        if (z3) {
            int index = ju0Var.getIndex();
            gs0 a = this.c.a();
            Boolean bool = null;
            if (index == 0) {
                if (a != null) {
                    bool = Boolean.valueOf(a.a.h);
                }
            } else if (a != null) {
                bool = Boolean.valueOf(a.b.h);
            }
            if (bool != null ? bool.booleanValue() : false) {
                z2 = true;
                ListBuilder a2 = rcc.a();
                if (z3) {
                    a2.add(qVar);
                }
                a2.add(q61Var);
                if (!z2) {
                    a2.add(q61Var2);
                }
                tls[] tlsVarArr = (tls[]) a2.j().toArray(new tls[0]);
                tls[] tlsVarArr2 = (tls[]) Arrays.copyOf(tlsVarArr, tlsVarArr.length);
                sls bgcVar = new bgc(12);
                length = tlsVarArr2.length - 1;
                while (length >= 0) {
                    sls ssmVar = new ssm(tlsVarArr2[length], bgcVar, 4);
                    length--;
                    bgcVar = ssmVar;
                }
                bgcVar.invoke();
            }
        }
        z2 = false;
        ListBuilder a22 = rcc.a();
        if (z3) {
        }
        a22.add(q61Var);
        if (!z2) {
        }
        tls[] tlsVarArr3 = (tls[]) a22.j().toArray(new tls[0]);
        tls[] tlsVarArr22 = (tls[]) Arrays.copyOf(tlsVarArr3, tlsVarArr3.length);
        sls bgcVar2 = new bgc(12);
        length = tlsVarArr22.length - 1;
        while (length >= 0) {
        }
        bgcVar2.invoke();
    }

    public final void b(b0k0 b0k0Var, vu0 vu0Var, sls slsVar) {
        a0k0 a0k0Var = b0k0Var instanceof a0k0 ? (a0k0) b0k0Var : null;
        PointType pointType = a0k0Var != null ? a0k0Var.b : null;
        q qVar = new q(4, this, b0k0Var, slsVar);
        j0g j0gVar = this.a.b;
        ryh ryhVar = (ryh) j0gVar.a;
        dke dkeVar = new dke(20, qVar, j0gVar);
        if (!(vu0Var instanceof su0)) {
            com.yandex.go.logistics.cargo_flow.a.S((com.yandex.go.logistics.cargo_flow.a) ryhVar.b, new iu0(1), new bhh(8, dkeVar), vu0Var, null, 24);
        } else {
            su0 su0Var = (su0) vu0Var;
            ryhVar.B(null, pointType, su0Var.a, su0Var.b, dkeVar, new bgc(12), b.f(), null, b51.a, false, su0Var.c);
        }
    }
}
