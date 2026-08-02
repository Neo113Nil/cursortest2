package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class sqa extends uqa {
    public static final sqa INSTANCE = new sqa();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new fna(16));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof sqa);
    }

    public final int hashCode() {
        return 1587707702;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "SelectToReturnChargerAction";
    }
}
