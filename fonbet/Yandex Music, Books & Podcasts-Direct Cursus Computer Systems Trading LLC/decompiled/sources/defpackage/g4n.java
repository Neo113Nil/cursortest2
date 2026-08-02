package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class g4n implements zyc {
    public final /* synthetic */ tyc a;

    public g4n(tyc tycVar) {
        tycVar.getClass();
        this.a = tycVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g4n) {
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
