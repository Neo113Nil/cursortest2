package defpackage;

import kotlinx.serialization.SerializationException;

/* loaded from: classes4.dex */
public final class uez extends yez {
    public final SerializationException a;

    public uez(SerializationException serializationException) {
        this.a = serializationException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uez) && jl40.l(this.a, ((uez) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "log-list.json badly formatted with ".concat(kca1.g(this.a));
    }
}
