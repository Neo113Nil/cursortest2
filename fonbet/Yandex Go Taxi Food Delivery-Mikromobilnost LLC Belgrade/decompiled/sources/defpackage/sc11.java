package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes14.dex */
public final class sc11 implements tc11 {
    public static final sc11 INSTANCE = new sc11();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new z411(21));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof sc11);
    }

    public final int hashCode() {
        return 1256552134;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "Unknown";
    }
}
