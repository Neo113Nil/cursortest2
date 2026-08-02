package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class tna extends xna {
    public static final tna INSTANCE = new tna();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new fna(8));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof tna);
    }

    public final int hashCode() {
        return 1071291217;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "PaymentMethods";
    }
}
