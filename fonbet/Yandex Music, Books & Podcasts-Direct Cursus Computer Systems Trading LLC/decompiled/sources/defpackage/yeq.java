package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class yeq extends afq {
    public Function1 o;

    @Override // defpackage.a7k
    public final Object n(jx7 jx7Var, Object obj) {
        jho jhoVar = obj instanceof jho ? (jho) obj : null;
        if (jhoVar == null) {
            jhoVar = new jho();
        }
        jhoVar.c = new cu6(new k40(this.o));
        return jhoVar;
    }
}
