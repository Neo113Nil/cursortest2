package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes14.dex */
public final class x731 extends a831 {
    public static final x731 INSTANCE = new x731();
    public static final /* synthetic */ i3y b = a.b(LazyThreadSafetyMode.PUBLICATION, new gp21(26));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof x731);
    }

    public final int hashCode() {
        return -2046107872;
    }

    public final KSerializer serializer() {
        return (KSerializer) b.getValue();
    }

    public final String toString() {
        return "Timeout";
    }
}
