package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class uog implements uh21, jms {
    public final /* synthetic */ vpu a;

    public uog(vpu vpuVar) {
        this.a = vpuVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof uh21) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(0, this.a, vpu.class, "getHomeAvatarsGatewayWeblink", "getHomeAvatarsGatewayWeblink()Landroid/net/Uri;", 0);
    }

    @Override // defpackage.uh21
    public final Uri getUrl() {
        return this.a.d();
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
