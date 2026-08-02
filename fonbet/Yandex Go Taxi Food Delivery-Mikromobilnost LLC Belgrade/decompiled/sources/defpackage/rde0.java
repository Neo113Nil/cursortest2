package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes5.dex */
public final class rde0 extends sde0 {
    public static final rde0 INSTANCE = new rde0();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new yud0(27));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof rde0);
    }

    public final int hashCode() {
        return 1856426333;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "Unknown";
    }
}
