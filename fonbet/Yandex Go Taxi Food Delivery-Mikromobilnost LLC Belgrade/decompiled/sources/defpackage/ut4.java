package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes6.dex */
public final class ut4 implements vt4 {
    public static final ut4 INSTANCE = new ut4();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new tt4(0));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ut4);
    }

    public final int hashCode() {
        return -1358965055;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "Unknown";
    }
}
