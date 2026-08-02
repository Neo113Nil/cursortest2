package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes13.dex */
public final /* synthetic */ class zbd0 implements bed0, jms {
    public final /* synthetic */ gld0 a;

    public zbd0(gld0 gld0Var) {
        this.a = gld0Var;
    }

    @Override // defpackage.bed0
    public final boolean d() {
        return ((Boolean) ((n4u0) this.a.b.getValue()).getValue()).booleanValue();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof bed0) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(0, this.a, gld0.class, "isOfflineModeEnabled", "isOfflineModeEnabled()Z", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
