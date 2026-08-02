package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class rga implements sga {
    public static final rga INSTANCE = new rga();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new nba(21));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof rga);
    }

    public final int hashCode() {
        return 1520612158;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "Unknown";
    }
}
