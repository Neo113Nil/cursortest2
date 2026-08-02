package defpackage;

import com.yandex.quark.yango.ActiveMode;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class wmt {
    public final t6z a;
    public final ActiveMode b;

    public wmt(t6z t6zVar, ActiveMode activeMode) {
        this.a = t6zVar;
        this.b = activeMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmt)) {
            return false;
        }
        wmt wmtVar = (wmt) obj;
        return jl40.l(this.a, wmtVar.a) && this.b == wmtVar.b;
    }

    public final int hashCode() {
        t6z t6zVar = this.a;
        int hashCode = (t6zVar == null ? 0 : t6zVar.hashCode()) * 31;
        ActiveMode activeMode = this.b;
        return hashCode + (activeMode != null ? activeMode.hashCode() : 0);
    }

    public final String toString() {
        return "State(observedLocation=" + this.a + ", activeMode=" + this.b + Extension.C_BRAKE;
    }

    public wmt() {
        this(null, null);
    }
}
