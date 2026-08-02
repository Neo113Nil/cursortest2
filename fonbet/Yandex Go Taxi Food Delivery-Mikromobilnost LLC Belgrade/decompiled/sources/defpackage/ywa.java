package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class ywa extends cxa {
    public static final ywa INSTANCE = new ywa();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new eua(9));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ywa);
    }

    public final int hashCode() {
        return 2099281827;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "OpenSurgeModalAction";
    }
}
