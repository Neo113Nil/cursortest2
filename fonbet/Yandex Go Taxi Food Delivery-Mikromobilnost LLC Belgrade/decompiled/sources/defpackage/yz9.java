package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class yz9 extends zz9 {
    public static final yz9 INSTANCE = new yz9();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new wu9(21));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof yz9);
    }

    public final int hashCode() {
        return -1912171240;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "Unknown";
    }
}
