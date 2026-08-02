package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class vfa implements wfa {
    public static final vfa INSTANCE = new vfa();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new nba(18));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof vfa);
    }

    public final int hashCode() {
        return 1707764558;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "Unknown";
    }
}
