package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class h3s implements zyc {
    public static final h3s a = new h3s();

    public final boolean equals(Object obj) {
        if (obj instanceof h3s) {
            return Intrinsics.d(getFunctionDelegate(), ((zyc) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.zyc
    public final syc getFunctionDelegate() {
        return new ezc(1, s3s.class, "<init>", "<init>(Landroidx/fragment/app/FragmentActivity;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
