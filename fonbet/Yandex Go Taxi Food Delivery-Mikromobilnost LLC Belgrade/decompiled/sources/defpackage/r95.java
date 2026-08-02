package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public abstract class r95 {
    public r95 a;

    public Object a(ContinuationImpl continuationImpl) {
        r95 r95Var = this.a;
        return r95Var != null ? r95Var.a(continuationImpl) : zy11.a;
    }

    public final void b(r95 r95Var) {
        r95 r95Var2 = this.a;
        if (r95Var2 != null) {
            r95Var2.b(r95Var);
        } else {
            this.a = r95Var;
        }
    }
}
