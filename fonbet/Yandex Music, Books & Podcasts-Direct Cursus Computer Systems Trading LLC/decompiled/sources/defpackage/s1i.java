package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class s1i implements zyc {
    public static final s1i a = new s1i();

    public final boolean equals(Object obj) {
        if (obj instanceof s1i) {
            return Intrinsics.d(getFunctionDelegate(), ((zyc) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.zyc
    public final syc getFunctionDelegate() {
        return new ezc(2, w0i.class, "<init>", "<init>(Landroidx/fragment/app/FragmentActivity;Landroidx/fragment/app/FragmentManager;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
