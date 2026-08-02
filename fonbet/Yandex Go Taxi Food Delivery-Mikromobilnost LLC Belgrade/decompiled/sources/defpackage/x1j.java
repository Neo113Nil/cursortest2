package defpackage;

import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes5.dex */
public final /* synthetic */ class x1j implements jms {
    public final /* synthetic */ y1j a;

    public x1j(y1j y1jVar) {
        this.a = y1jVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x1j) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new AdaptedFunctionReference(0, this.a, y1j.class, "goBack", "goBack(Lkotlin/jvm/functions/Function1;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
