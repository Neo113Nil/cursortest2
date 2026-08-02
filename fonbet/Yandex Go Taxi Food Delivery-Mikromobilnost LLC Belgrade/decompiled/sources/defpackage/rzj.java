package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes8.dex */
public final class rzj implements vzj {
    public static final rzj INSTANCE = new rzj();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new xyi(17));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof rzj);
    }

    public final int hashCode() {
        return 1184178051;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "Fit";
    }
}
