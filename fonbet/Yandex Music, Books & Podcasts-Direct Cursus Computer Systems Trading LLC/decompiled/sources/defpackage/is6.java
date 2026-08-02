package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class is6 {
    public final LinkedHashMap a = new LinkedHashMap();

    public abstract Object a(hs6 hs6Var);

    public final boolean equals(Object obj) {
        if (obj instanceof is6) {
            return Intrinsics.d(this.a, ((is6) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.a + ')';
    }
}
