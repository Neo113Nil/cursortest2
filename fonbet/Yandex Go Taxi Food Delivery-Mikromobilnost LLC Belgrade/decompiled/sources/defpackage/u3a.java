package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class u3a extends w3a {
    public static final u3a INSTANCE = new u3a();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new z1a(11));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof u3a);
    }

    public final int hashCode() {
        return 304284240;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "TakeCharger";
    }
}
