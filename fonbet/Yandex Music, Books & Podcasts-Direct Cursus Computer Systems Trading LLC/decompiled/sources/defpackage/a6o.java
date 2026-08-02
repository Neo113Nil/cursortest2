package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a6o {
    public static final /* synthetic */ a6o[] a = {new a6o("PLUS", 0), new a6o("NO_PLUS", 1), new a6o("FROZEN", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    a6o EF5;

    public static a6o valueOf(String str) {
        return (a6o) Enum.valueOf(a6o.class, str);
    }

    public static a6o[] values() {
        return (a6o[]) a.clone();
    }
}
