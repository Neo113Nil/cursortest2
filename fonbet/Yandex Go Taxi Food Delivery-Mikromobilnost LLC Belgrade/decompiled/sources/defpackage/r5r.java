package defpackage;

import com.yandex.go.analytics.realtime.event.CreativeType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class r5r {
    public final String a;
    public final CreativeType b;

    public r5r(String str, CreativeType creativeType) {
        this.a = str;
        this.b = creativeType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5r)) {
            return false;
        }
        r5r r5rVar = (r5r) obj;
        return jl40.l(this.a, r5rVar.a) && this.b == r5rVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FilteringContext(alternativeCreativeId=" + this.a + ", alternativeCreativeType=" + this.b + Extension.C_BRAKE;
    }
}
