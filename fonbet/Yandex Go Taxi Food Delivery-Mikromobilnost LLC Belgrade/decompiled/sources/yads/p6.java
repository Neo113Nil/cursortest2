package yads;

import defpackage.jl61;
import defpackage.kdx;
import defpackage.tls;
import defpackage.zy11;
import java.util.Map;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class p6 extends Lambda implements tls {
    public final /* synthetic */ jl61 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(jl61 jl61Var) {
        super(1);
        this.b = jl61Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        kdx kdxVar = (kdx) obj;
        for (Map.Entry entry : this.b.h.entrySet()) {
            String str = (String) entry.getKey();
            o6 o6Var = new o6(entry);
            kdx kdxVar2 = new kdx();
            o6Var.invoke(kdxVar2);
            kdxVar.b(str, kdxVar2.a());
        }
        return zy11.a;
    }
}
