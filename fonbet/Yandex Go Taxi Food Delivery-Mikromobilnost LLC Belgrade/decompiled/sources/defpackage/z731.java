package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes14.dex */
public final class z731 extends a831 {
    public static final z731 INSTANCE = new z731();
    public static final /* synthetic */ i3y b = a.b(LazyThreadSafetyMode.PUBLICATION, new gp21(28));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof z731);
    }

    public final int hashCode() {
        return -1403513169;
    }

    public final KSerializer serializer() {
        return (KSerializer) b.getValue();
    }

    public final String toString() {
        return "UserTooFar";
    }
}
