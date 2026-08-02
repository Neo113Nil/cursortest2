package defpackage;

import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class v0h implements y0h {
    public final List a;
    public final Long b;
    public final DeeplinkHandleResult$DeeplinkType c;

    public v0h(List list, DeeplinkHandleResult$DeeplinkType deeplinkHandleResult$DeeplinkType, int i) {
        Long l = (i & 2) != 0 ? null : 1000L;
        deeplinkHandleResult$DeeplinkType = (i & 4) != 0 ? DeeplinkHandleResult$DeeplinkType.SCREEN_OPEN : deeplinkHandleResult$DeeplinkType;
        this.a = list;
        this.b = l;
        this.c = deeplinkHandleResult$DeeplinkType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0h)) {
            return false;
        }
        v0h v0hVar = (v0h) obj;
        return jl40.l(this.a, v0hVar.a) && jl40.l(this.b, v0hVar.b) && this.c == v0hVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return this.c.hashCode() + ((hashCode + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        return "Handled(screens=" + this.a + ", reloadWithDelayMs=" + this.b + ", type=" + this.c + Extension.C_BRAKE;
    }
}
