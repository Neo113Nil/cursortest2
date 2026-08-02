package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class x4i implements zyc {
    public final /* synthetic */ ezc a;

    /* JADX WARN: Multi-variable type inference failed */
    public x4i(Function2 function2) {
        this.a = (ezc) function2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x4i)) {
            return false;
        }
        return this.a.equals(((zyc) obj).getFunctionDelegate());
    }

    @Override // defpackage.zyc
    public final syc getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
