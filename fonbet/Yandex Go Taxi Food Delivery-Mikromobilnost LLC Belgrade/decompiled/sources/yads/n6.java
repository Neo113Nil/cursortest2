package yads;

import defpackage.jl61;
import defpackage.qcx;
import defpackage.tls;
import defpackage.xbx;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class n6 extends Lambda implements tls {
    public final /* synthetic */ jl61 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(jl61 jl61Var) {
        super(1);
        this.b = jl61Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        xbx xbxVar = (xbx) obj;
        Iterator it = this.b.g.iterator();
        while (it.hasNext()) {
            xbxVar.a(qcx.c((String) it.next()));
        }
        return zy11.a;
    }
}
