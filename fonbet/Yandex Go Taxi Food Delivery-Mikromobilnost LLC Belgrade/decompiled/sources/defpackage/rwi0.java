package defpackage;

import com.yandex.messaging.internal.storage.folders.d;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes15.dex */
public final class rwi0 extends wx4 {
    public final long b;
    public final String c;
    public final String d;
    public final d e;
    public final k020 f;

    public rwi0(long j, String str, String str2, d dVar, k020 k020Var, el21 el21Var) {
        super(el21Var);
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = dVar;
        this.f = k020Var;
    }

    @Override // defpackage.gr
    public final boolean a(gr grVar) {
        if (!(grVar instanceof rwi0)) {
            return false;
        }
        rwi0 rwi0Var = (rwi0) grVar;
        return rwi0Var.b == this.b && jl40.l(rwi0Var.c, this.c) && jl40.l(rwi0Var.d, this.d);
    }

    @Override // defpackage.wx4
    public final Object b(cl21 cl21Var, Continuation continuation) {
        String str = this.c;
        ywr t = this.f.t(this.b, str);
        if (t == null) {
            return new iyj0(kwr.a);
        }
        hwr hwrVar = t.a;
        int i = hwrVar.d;
        String str2 = hwrVar.b;
        LinkedHashSet f = v4r0.f(hwrVar.f, this.d);
        Set set = hwrVar.g;
        Set b = t.b();
        Set a = t.a();
        String str3 = this.c;
        long j = this.b;
        jjf jjfVar = new jjf(str3, j, str2, i, f, set, b, a);
        d dVar = this.e;
        dVar.getClass();
        return dVar.e(j, new fxr(jjfVar, 0), continuation);
    }
}
