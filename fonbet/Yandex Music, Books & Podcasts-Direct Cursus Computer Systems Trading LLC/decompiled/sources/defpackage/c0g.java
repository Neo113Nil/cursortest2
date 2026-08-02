package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class c0g {
    public static final c0g a;
    public static final c0g b;
    public static final c0g c;
    public static final /* synthetic */ c0g[] d;

    static {
        c0g c0gVar = new c0g("None", 0);
        a = c0gVar;
        c0g c0gVar2 = new c0g("Unactivated", 1);
        b = c0gVar2;
        c0g c0gVar3 = new c0g("Activated", 2);
        c = c0gVar3;
        d = new c0g[]{c0gVar, c0gVar2, c0gVar3};
    }

    public static c0g valueOf(String str) {
        return (c0g) Enum.valueOf(c0g.class, str);
    }

    public static c0g[] values() {
        return (c0g[]) d.clone();
    }
}
