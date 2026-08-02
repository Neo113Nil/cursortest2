package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class gi1 implements zyc {
    public static final gi1 a = new gi1();

    public final boolean equals(Object obj) {
        if (obj instanceof gi1) {
            return Intrinsics.d(getFunctionDelegate(), ((zyc) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.zyc
    public final syc getFunctionDelegate() {
        return new ezc(1, hgq.class, "<init>", "<init>(Landroid/app/Activity;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
