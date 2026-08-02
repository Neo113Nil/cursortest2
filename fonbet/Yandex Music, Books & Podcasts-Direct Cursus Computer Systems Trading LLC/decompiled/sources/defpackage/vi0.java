package defpackage;

import androidx.compose.ui.draw.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class vi0 extends uif implements pyc {
    public final /* synthetic */ Function0 r;
    public final /* synthetic */ boolean s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi0(Function0 function0, boolean z) {
        super(3);
        this.r = function0;
        this.s = z;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        yci yciVar = (yci) obj;
        ((Number) obj3).intValue();
        oq5 oq5Var = (oq5) ((hq5) obj2);
        oq5Var.Z(-196777734);
        long j = ((xds) oq5Var.j(yds.a)).a;
        boolean e = oq5Var.e(j);
        Function0 function0 = this.r;
        boolean f = e | oq5Var.f(function0);
        boolean z = this.s;
        boolean g = f | oq5Var.g(z);
        Object K = oq5Var.K();
        if (g || K == gq5.a) {
            K = new ui0(j, function0, z);
            oq5Var.k0(K);
        }
        yci b = a.b(yciVar, (Function1) K);
        oq5Var.p(false);
        return b;
    }
}
