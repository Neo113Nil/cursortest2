package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class wna extends xna {
    public static final wna INSTANCE = new wna();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new fna(10));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof wna);
    }

    public final int hashCode() {
        return 228682597;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "Unknown";
    }
}
