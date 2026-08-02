package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class cn9 implements zyc {
    public final /* synthetic */ dn9 a;

    public cn9(dn9 dn9Var) {
        this.a = dn9Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cn9) {
            return Intrinsics.d(getFunctionDelegate(), ((zyc) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.zyc
    public final syc getFunctionDelegate() {
        return new ezc(3, 0, dn9.class, this.a, "onUpgrade", "onUpgrade(Lcom/yandex/div/storage/database/DatabaseOpenHelper$Database;II)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
