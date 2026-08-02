package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class vna extends xna {
    public static final vna INSTANCE = new vna();
    public static final /* synthetic */ i3y a = a.b(LazyThreadSafetyMode.PUBLICATION, new fna(9));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof vna);
    }

    public final int hashCode() {
        return 1556872565;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "SuperPasses";
    }
}
