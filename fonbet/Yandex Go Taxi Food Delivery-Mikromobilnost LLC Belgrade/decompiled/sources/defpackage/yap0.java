package defpackage;

import java.util.List;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class yap0 implements zap0 {
    public final List a;

    public yap0(ListBuilder listBuilder) {
        this.a = listBuilder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yap0) && jl40.l(this.a, ((yap0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("Success(contentItems=", Extension.C_BRAKE, this.a);
    }
}
