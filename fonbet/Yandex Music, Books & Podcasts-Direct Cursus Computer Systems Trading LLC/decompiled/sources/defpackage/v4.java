package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class v4 implements zyc {
    public static final v4 a = new v4();

    public final boolean equals(Object obj) {
        if (obj instanceof v4) {
            return Intrinsics.d(getFunctionDelegate(), ((zyc) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.zyc
    public final syc getFunctionDelegate() {
        return new ezc(2, s4.class, "<init>", "<init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
