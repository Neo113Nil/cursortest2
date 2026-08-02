package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class p1j {
    public static final p1j a;
    public static final p1j b;
    public static final /* synthetic */ p1j[] c;

    static {
        p1j p1jVar = new p1j("retryOnce", 0);
        a = p1jVar;
        p1j p1jVar2 = new p1j("retry", 1);
        p1j p1jVar3 = new p1j("noRetry", 2);
        b = p1jVar3;
        c = new p1j[]{p1jVar, p1jVar2, p1jVar3};
    }

    public static p1j valueOf(String str) {
        return (p1j) Enum.valueOf(p1j.class, str);
    }

    public static p1j[] values() {
        return (p1j[]) c.clone();
    }
}
