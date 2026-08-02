package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class gep implements onj, zyc {
    public final /* synthetic */ Function0 a;

    public gep(Function0 function0) {
        this.a = function0;
    }

    @Override // defpackage.onj
    public final /* synthetic */ long a() {
        return ((enj) this.a.invoke()).a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof onj) && (obj instanceof zyc)) {
            return Intrinsics.d(getFunctionDelegate(), ((zyc) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.zyc
    public final syc getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
