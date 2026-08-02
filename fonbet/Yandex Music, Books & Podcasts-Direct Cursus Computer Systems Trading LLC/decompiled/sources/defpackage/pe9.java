package defpackage;

import android.database.SQLException;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class pe9 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public pe9(dfb dfbVar, Function1 function1, qe9 qe9Var, int i, Function1 function12) {
        super(1);
        this.r = 0;
        this.t = dfbVar;
        this.u = (uif) function1;
        this.w = qe9Var;
        this.s = i;
        this.v = (uif) function12;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r5v6, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                oce oceVar = (oce) obj;
                if (oceVar instanceof mce) {
                    ((dfb) this.t).e(new Throwable("Preview doesn't contain base64 image", ((mce) oceVar).a));
                    ((uif) this.u).invoke(((qe9) this.w).a.a(this.s));
                } else {
                    ((uif) this.v).invoke(oceVar);
                }
                return Unit.a;
            case 1:
                dz2 dz2Var = (dz2) obj;
                dpc dpcVar = (dpc) this.u;
                if (((dpc) this.t) != ((uoc) bcx.G(dpcVar).getFocusOwner()).l) {
                    return Boolean.TRUE;
                }
                boolean O = u1g.O(dpcVar, (dpc) this.v, this.s, (lma) this.w);
                Boolean valueOf = Boolean.valueOf(O);
                if (O || !dz2Var.a()) {
                    return valueOf;
                }
                return null;
            case 2:
                Exception exc = (Exception) obj;
                StringBuilder sb = new StringBuilder("Exception at statement '");
                sb.append(((xqn) this.t).a);
                sb.append("' (");
                sb.append(((vqn) this.u).a);
                sb.append(" out ");
                String r = vz1.r(sb, ((yhr[]) this.v).length, ')');
                int D = ouj.D(this.s);
                if (D == 0) {
                    throw new SQLException(r, exc);
                }
                if (D == 1) {
                    ((ArrayList) this.w).add(new wm9(r, exc));
                }
                return Unit.a;
            default:
                dz2 dz2Var2 = (dz2) obj;
                dpc dpcVar2 = (dpc) this.u;
                if (((dpc) this.t) != ((uoc) bcx.G(dpcVar2).getFocusOwner()).l) {
                    return Boolean.TRUE;
                }
                ynn ynnVar = (ynn) this.v;
                boolean M = c9g.M(this.s, (lma) this.w, dpcVar2, ynnVar);
                Boolean valueOf2 = Boolean.valueOf(M);
                if (M || !dz2Var2.a()) {
                    return valueOf2;
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pe9(d51 d51Var, dpc dpcVar, dpc dpcVar2, Object obj, int i, lma lmaVar, int i2) {
        super(1);
        this.r = i2;
        this.t = dpcVar;
        this.u = dpcVar2;
        this.v = obj;
        this.s = i;
        this.w = lmaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe9(xqn xqnVar, vqn vqnVar, yhr[] yhrVarArr, int i, uiq uiqVar, ArrayList arrayList) {
        super(1);
        this.r = 2;
        this.t = xqnVar;
        this.u = vqnVar;
        this.v = yhrVarArr;
        this.s = i;
        this.w = arrayList;
    }
}
