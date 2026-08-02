package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class omj implements dmj, zyc {
    public final /* synthetic */ Function1 a;

    public omj(Function1 function1) {
        function1.getClass();
        this.a = function1;
    }

    @Override // defpackage.dmj
    public final /* synthetic */ void a(boolean z) {
        this.a.invoke(Boolean.valueOf(z));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof dmj) && (obj instanceof zyc)) {
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
