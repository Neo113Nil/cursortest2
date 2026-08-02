package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class rdi {

    @NotNull
    public static final rdi a = new rdi();
    public static final long b = System.nanoTime();

    public static long a() {
        return System.nanoTime() - b;
    }

    public final String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
