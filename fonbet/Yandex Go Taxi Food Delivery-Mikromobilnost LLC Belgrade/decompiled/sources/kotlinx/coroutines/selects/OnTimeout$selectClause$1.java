package kotlinx.coroutines.selects;

import defpackage.fcq0;
import defpackage.fse;
import defpackage.iy2;
import defpackage.y070;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class OnTimeout$selectClause$1 extends FunctionReferenceImpl implements zls {
    public static final OnTimeout$selectClause$1 b = new OnTimeout$selectClause$1(3, 0, y070.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V");

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        y070 y070Var = (y070) obj;
        fcq0 fcq0Var = (fcq0) obj2;
        long j = y070Var.a;
        zy11 zy11Var = zy11.a;
        if (j <= 0) {
            ((b) fcq0Var).x = zy11Var;
            return zy11Var;
        }
        iy2 iy2Var = new iy2(26, fcq0Var, y070Var);
        b bVar = (b) fcq0Var;
        fse fseVar = bVar.a;
        bVar.c = kotlinx.coroutines.a.m(fseVar).e(j, iy2Var, fseVar);
        return zy11Var;
    }
}
