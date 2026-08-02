package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes8.dex */
public final class sgc implements tgc {
    public static final sgc INSTANCE = new sgc();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new bgc(1));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof sgc);
    }

    public final int hashCode() {
        return 387550650;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "Transparent";
    }
}
