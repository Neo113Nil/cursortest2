package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class uet implements Comparable {

    @NotNull
    public static final tet b = new tet(null);
    public final short a;

    public /* synthetic */ uet(short s) {
        this.a = s;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.e(this.a & 65535, ((uet) obj).a & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uet) {
            return this.a == ((uet) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.a);
    }

    public final String toString() {
        return String.valueOf(this.a & 65535);
    }
}
