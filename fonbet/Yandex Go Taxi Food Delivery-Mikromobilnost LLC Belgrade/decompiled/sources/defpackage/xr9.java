package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class xr9 extends yr9 {
    public static final xr9 INSTANCE = new xr9();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new ak9(22));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xr9);
    }

    public final int hashCode() {
        return -667576830;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "Unknown";
    }
}
