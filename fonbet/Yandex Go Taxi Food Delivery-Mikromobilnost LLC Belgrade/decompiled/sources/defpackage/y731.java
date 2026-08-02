package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes14.dex */
public final class y731 extends a831 {
    public static final y731 INSTANCE = new y731();
    public static final /* synthetic */ i3y b = a.b(LazyThreadSafetyMode.PUBLICATION, new gp21(27));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof y731);
    }

    public final int hashCode() {
        return -1017037303;
    }

    public final KSerializer serializer() {
        return (KSerializer) b.getValue();
    }

    public final String toString() {
        return "Unknown";
    }
}
