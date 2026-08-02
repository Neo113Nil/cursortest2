package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class kuv implements zyc {
    public static final kuv a = new kuv();

    public final boolean equals(Object obj) {
        if (obj instanceof kuv) {
            return Intrinsics.d(getFunctionDelegate(), ((zyc) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.zyc
    public final syc getFunctionDelegate() {
        return new ezc(2, muv.class, "<init>", "<init>(Landroid/app/Activity;Landroidx/activity/result/ActivityResultLauncher;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
