package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes.dex */
public final class r6s0 extends kr {
    public static final r6s0 INSTANCE = new r6s0();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new dwq0(28));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof r6s0);
    }

    public final int hashCode() {
        return 575046429;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "ShowErrorDocument";
    }
}
