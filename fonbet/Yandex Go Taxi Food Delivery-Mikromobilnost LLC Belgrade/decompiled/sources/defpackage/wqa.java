package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class wqa extends uqa {
    public static final wqa INSTANCE = new wqa();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new fna(17));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof wqa);
    }

    public final int hashCode() {
        return 1234012822;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "TakeChargerAction";
    }
}
