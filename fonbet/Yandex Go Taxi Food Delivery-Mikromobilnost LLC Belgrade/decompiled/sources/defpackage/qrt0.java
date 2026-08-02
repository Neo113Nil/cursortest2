package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes8.dex */
public final /* synthetic */ class qrt0 implements jms {
    public static final qrt0 a = new qrt0();

    public final boolean equals(Object obj) {
        if ((obj instanceof qrt0) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(1, 0, xrt0.class, "remove", "remove()V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
