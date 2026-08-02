package defpackage;

import com.yandex.go.yb.api.domain.model.YbScreenSource;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class yv51 extends ew51 {
    public final YbScreenSource a;

    public yv51(YbScreenSource ybScreenSource) {
        this.a = ybScreenSource;
    }

    @Override // defpackage.ew51
    public final YbScreenSource a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yv51) && this.a == ((yv51) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Dashboard(source=" + this.a + Extension.C_BRAKE;
    }
}
