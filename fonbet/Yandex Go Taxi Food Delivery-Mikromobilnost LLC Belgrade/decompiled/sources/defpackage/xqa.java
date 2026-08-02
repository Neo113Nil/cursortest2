package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class xqa extends uqa {
    public static final xqa INSTANCE = new xqa();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new fna(18));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xqa);
    }

    public final int hashCode() {
        return -1042880685;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "Unknown";
    }
}
