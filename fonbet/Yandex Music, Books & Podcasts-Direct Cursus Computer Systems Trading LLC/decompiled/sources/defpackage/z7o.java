package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class z7o implements Serializable {

    @NotNull
    public static final r7o b = new r7o(null);
    public final Object a;

    public /* synthetic */ z7o(Object obj) {
        this.a = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof t7o) {
            return ((t7o) obj).a;
        }
        return null;
    }

    public static String b(Object obj) {
        if (obj instanceof t7o) {
            return ((t7o) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z7o) {
            return Intrinsics.d(this.a, ((z7o) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return b(this.a);
    }
}
