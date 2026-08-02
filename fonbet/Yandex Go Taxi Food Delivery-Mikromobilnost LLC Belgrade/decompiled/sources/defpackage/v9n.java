package defpackage;

import java.util.List;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class v9n extends w9n {
    public final List c;

    public v9n(ListBuilder listBuilder) {
        super(listBuilder);
        this.c = listBuilder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v9n) && jl40.l(this.c, ((v9n) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return tse0.k("IdleTimelineModel(stages=", Extension.C_BRAKE, this.c);
    }
}
