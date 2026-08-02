package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class j0s {
    public static final j0s a;
    public static final j0s b;
    public static final /* synthetic */ j0s[] c;

    static {
        j0s j0sVar = new j0s("Left", 0);
        a = j0sVar;
        j0s j0sVar2 = new j0s("Right", 1);
        b = j0sVar2;
        c = new j0s[]{j0sVar, j0sVar2};
    }

    public static j0s valueOf(String str) {
        return (j0s) Enum.valueOf(j0s.class, str);
    }

    public static j0s[] values() {
        return (j0s[]) c.clone();
    }
}
