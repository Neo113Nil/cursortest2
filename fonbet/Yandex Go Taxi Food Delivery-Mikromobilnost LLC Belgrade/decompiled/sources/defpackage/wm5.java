package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class wm5 implements xm5 {
    public static final wm5 INSTANCE = new wm5();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new tt4(26));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof wm5);
    }

    public final int hashCode() {
        return 1578234832;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "Unknown";
    }
}
