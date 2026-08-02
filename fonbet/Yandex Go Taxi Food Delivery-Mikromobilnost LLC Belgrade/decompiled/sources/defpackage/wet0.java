package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class wet0 implements nn4, jms {
    public final /* synthetic */ mkv0 a;

    public wet0(mkv0 mkv0Var) {
        this.a = mkv0Var;
    }

    @Override // defpackage.nn4
    public final void a(int i) {
        mkv0 mkv0Var = this.a;
        if (i != mkv0Var.a) {
            mkv0Var.a = i;
            x4e.z(i, mkv0Var.b, null);
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof nn4) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.a, mkv0.class, "updateVerticalOffset", "updateVerticalOffset(I)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
