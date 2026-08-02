package defpackage;

import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes12.dex */
public final /* synthetic */ class zf50 implements jms {
    public final /* synthetic */ ag50 a;

    public zf50(ag50 ag50Var) {
        this.a = ag50Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zf50) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new AdaptedFunctionReference(0, this.a, ag50.class, "goBack", "goBack(Lkotlin/jvm/functions/Function1;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
