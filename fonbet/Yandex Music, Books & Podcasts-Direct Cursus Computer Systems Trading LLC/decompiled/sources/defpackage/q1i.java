package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class q1i implements zyc {
    public static final q1i a = new q1i();

    public final boolean equals(Object obj) {
        if (obj instanceof q1i) {
            return Intrinsics.d(getFunctionDelegate(), ((zyc) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.zyc
    public final syc getFunctionDelegate() {
        return new ezc(1, j1i.class, "<init>", "<init>(Landroidx/fragment/app/FragmentActivity;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
