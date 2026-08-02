package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class wz9 extends zz9 {
    public static final wz9 INSTANCE = new wz9();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new wu9(20));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof wz9);
    }

    public final int hashCode() {
        return -1484963461;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "OpenSurgeModal";
    }
}
