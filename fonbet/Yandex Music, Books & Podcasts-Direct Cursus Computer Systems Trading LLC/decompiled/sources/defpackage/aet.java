package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class aet implements Comparable {

    @NotNull
    public static final zdt b = new zdt(null);
    public final byte a;

    public /* synthetic */ aet(byte b2) {
        this.a = b2;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.e(this.a & 255, ((aet) obj).a & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aet) {
            return this.a == ((aet) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.a);
    }

    public final String toString() {
        return String.valueOf(this.a & 255);
    }
}
