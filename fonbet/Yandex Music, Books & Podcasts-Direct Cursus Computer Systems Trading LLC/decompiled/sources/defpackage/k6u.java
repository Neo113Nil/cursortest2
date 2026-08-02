package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class k6u {
    public static final k6u a;
    public static final k6u b;
    public static final /* synthetic */ k6u[] c;

    static {
        k6u k6uVar = new k6u("PREPARING", 0);
        a = k6uVar;
        k6u k6uVar2 = new k6u("READY", 1);
        b = k6uVar2;
        c = new k6u[]{k6uVar, k6uVar2};
    }

    public static k6u valueOf(String str) {
        return (k6u) Enum.valueOf(k6u.class, str);
    }

    public static k6u[] values() {
        return (k6u[]) c.clone();
    }
}
