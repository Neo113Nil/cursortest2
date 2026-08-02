package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class fzg {
    public static final fzg a;
    public static final /* synthetic */ fzg[] b;

    static {
        fzg fzgVar = new fzg("MergePathsApi19", 0);
        a = fzgVar;
        b = new fzg[]{fzgVar};
    }

    public static fzg valueOf(String str) {
        return (fzg) Enum.valueOf(fzg.class, str);
    }

    public static fzg[] values() {
        return (fzg[]) b.clone();
    }
}
