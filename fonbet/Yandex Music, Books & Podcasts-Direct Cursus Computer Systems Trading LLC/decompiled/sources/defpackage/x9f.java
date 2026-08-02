package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class x9f {
    public static final /* synthetic */ x9f[] a = {new x9f("PUBLIC", 0), new x9f("PROTECTED", 1), new x9f("INTERNAL", 2), new x9f("PRIVATE", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    x9f EF5;

    public static x9f valueOf(String str) {
        return (x9f) Enum.valueOf(x9f.class, str);
    }

    public static x9f[] values() {
        return (x9f[]) a.clone();
    }
}
