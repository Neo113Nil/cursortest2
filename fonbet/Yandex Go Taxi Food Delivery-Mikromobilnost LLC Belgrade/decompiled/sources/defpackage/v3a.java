package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class v3a extends w3a {
    public static final v3a INSTANCE = new v3a();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new z1a(12));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof v3a);
    }

    public final int hashCode() {
        return 1482629475;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "Unknown";
    }
}
