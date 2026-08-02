package bo.app;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f {
    public final Class a;

    public f(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.areEqual(this.a, ((f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m(this.a, "ActivitySessionWrapper(javaClass=", ")");
    }
}
