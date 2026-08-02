package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class gz {
    public static final gz b;
    public static final /* synthetic */ gz[] c;

    static {
        gz gzVar = new gz();
        b = gzVar;
        c = new gz[]{gzVar};
    }

    public static gz valueOf(String str) {
        return (gz) Enum.valueOf(gz.class, str);
    }

    public static gz[] values() {
        return (gz[]) c.clone();
    }
}
