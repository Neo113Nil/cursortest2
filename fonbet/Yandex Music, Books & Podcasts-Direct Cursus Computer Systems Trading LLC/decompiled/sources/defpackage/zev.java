package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class zev implements zyc {
    public final /* synthetic */ mfv a;

    public zev(mfv mfvVar) {
        this.a = mfvVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zev) {
            return Intrinsics.d(getFunctionDelegate(), ((zyc) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.zyc
    public final syc getFunctionDelegate() {
        return new ezc(2, 0, mfv.class, this.a, "intercept", "intercept(Landroid/content/Context;Landroid/webkit/WebResourceRequest;)Z");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
