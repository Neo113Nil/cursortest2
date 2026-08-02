package defpackage;

import com.ybsdk.common.InternalSdkState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class yui0 {
    public final InternalSdkState a;
    public final noh b;

    public yui0(InternalSdkState internalSdkState, noh nohVar) {
        this.a = internalSdkState;
        this.b = nohVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yui0)) {
            return false;
        }
        yui0 yui0Var = (yui0) obj;
        return jl40.l(this.a, yui0Var.a) && this.b.equals(yui0Var.b);
    }

    public final int hashCode() {
        InternalSdkState internalSdkState = this.a;
        return this.b.hashCode() + ((internalSdkState == null ? 0 : internalSdkState.hashCode()) * 31);
    }

    public final String toString() {
        return "UpdateTask(state=" + this.a + ", deferred=" + this.b + Extension.C_BRAKE;
    }
}
