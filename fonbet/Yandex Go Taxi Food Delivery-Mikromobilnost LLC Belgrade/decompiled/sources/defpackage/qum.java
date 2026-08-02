package defpackage;

import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class qum extends sum {
    public final MapBuilder a;

    public qum(MapBuilder mapBuilder) {
        this.a = mapBuilder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qum) && this.a.equals(((qum) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Map(value=" + this.a + Extension.C_BRAKE;
    }
}
