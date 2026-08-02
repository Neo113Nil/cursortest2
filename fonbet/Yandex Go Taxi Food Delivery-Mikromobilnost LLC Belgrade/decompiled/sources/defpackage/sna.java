package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class sna extends xna {
    public static final sna INSTANCE = new sna();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new fna(7));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof sna);
    }

    public final int hashCode() {
        return 737923741;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "DvizhSubscription";
    }
}
