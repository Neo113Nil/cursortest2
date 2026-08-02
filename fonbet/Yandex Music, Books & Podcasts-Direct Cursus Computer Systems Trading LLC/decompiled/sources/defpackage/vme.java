package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class vme {
    public static final void a(@NotNull String str) {
        throw new IllegalArgumentException(str);
    }

    @NotNull
    public static final Void b(@NotNull String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void c(@NotNull String str) {
        throw new IllegalStateException(str);
    }

    @NotNull
    public static final Void d(@NotNull String str) {
        throw new IllegalStateException(str);
    }

    public static final void e(@NotNull String str) {
        throw new IndexOutOfBoundsException(str);
    }
}
