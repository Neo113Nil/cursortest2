package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class rqa extends uqa {
    public static final rqa INSTANCE = new rqa();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new fna(15));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof rqa);
    }

    public final int hashCode() {
        return -171258291;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "ReturnChargerAction";
    }
}
