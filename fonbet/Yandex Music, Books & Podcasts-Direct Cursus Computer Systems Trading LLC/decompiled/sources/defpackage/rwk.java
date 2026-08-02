package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class rwk {
    public static final AtomicInteger b = new AtomicInteger();
    public final String a;

    public /* synthetic */ rwk(String str) {
        this.a = str;
    }

    public static String a() {
        String valueOf = String.valueOf(b.incrementAndGet());
        valueOf.getClass();
        return valueOf;
    }

    public static String b(String str) {
        return hrg.q("PlayableId(", str, ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rwk) {
            return Intrinsics.d(this.a, ((rwk) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b(this.a);
    }
}
