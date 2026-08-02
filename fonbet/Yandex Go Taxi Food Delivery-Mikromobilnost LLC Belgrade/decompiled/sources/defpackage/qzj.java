package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes8.dex */
public final class qzj implements vzj {
    public static final qzj INSTANCE = new qzj();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new xyi(16));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qzj);
    }

    public final int hashCode() {
        return -1945186223;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "Fill";
    }
}
