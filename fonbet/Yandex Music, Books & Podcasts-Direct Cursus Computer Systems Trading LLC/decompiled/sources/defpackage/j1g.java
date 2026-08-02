package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class j1g {
    public static final j1g a;
    public static final j1g b;
    public static final j1g c;
    public static final /* synthetic */ j1g[] d;

    static {
        j1g j1gVar = new j1g("LIKED", 0);
        a = j1gVar;
        j1g j1gVar2 = new j1g("NEUTRAL", 1);
        b = j1gVar2;
        j1g j1gVar3 = new j1g("DISLIKED", 2);
        c = j1gVar3;
        d = new j1g[]{j1gVar, j1gVar2, j1gVar3};
    }

    public static j1g valueOf(String str) {
        return (j1g) Enum.valueOf(j1g.class, str);
    }

    public static j1g[] values() {
        return (j1g[]) d.clone();
    }
}
