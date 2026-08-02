package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.statebar.controller.NotificatorReporter$MessageType;

/* loaded from: classes6.dex */
public final class v060 extends bb1 {
    public final String f;
    public final NotificatorReporter$MessageType g;

    public v060(String str, NotificatorReporter$MessageType notificatorReporter$MessageType) {
        this.f = str;
        this.g = notificatorReporter$MessageType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v060)) {
            return false;
        }
        v060 v060Var = (v060) obj;
        return jl40.l(this.f, v060Var.f) && this.g == v060Var.g;
    }

    public final int hashCode() {
        return this.g.hashCode() + (this.f.hashCode() * 31);
    }

    public final String p0() {
        return this.f;
    }

    @Override // defpackage.bb1
    public final NotificatorReporter$MessageType r() {
        return this.g;
    }

    public final String toString() {
        return "CallFailed(path=" + this.f + ", errorType=" + this.g + Extension.C_BRAKE;
    }
}
