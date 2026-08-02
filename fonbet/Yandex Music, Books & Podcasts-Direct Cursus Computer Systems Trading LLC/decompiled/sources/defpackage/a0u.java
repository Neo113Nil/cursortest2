package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a0u {
    public static final a0u a;
    public static final a0u b;
    public static final /* synthetic */ a0u[] c;

    static {
        a0u a0uVar = new a0u("Lsq2", 0);
        a = a0uVar;
        a0u a0uVar2 = new a0u("Impulse", 1);
        b = a0uVar2;
        c = new a0u[]{a0uVar, a0uVar2};
    }

    public static a0u valueOf(String str) {
        return (a0u) Enum.valueOf(a0u.class, str);
    }

    public static a0u[] values() {
        return (a0u[]) c.clone();
    }
}
