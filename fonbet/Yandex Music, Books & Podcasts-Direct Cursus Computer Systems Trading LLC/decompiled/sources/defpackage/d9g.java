package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d9g {
    public static final d9g a;
    public static final d9g b;
    public static final /* synthetic */ d9g[] c;

    static {
        d9g d9gVar = new d9g("CombinedEntity", 0);
        a = d9gVar;
        d9g d9gVar2 = new d9g("LikedEntity", 1);
        d9g d9gVar3 = new d9g("ArtistEntity", 2);
        b = d9gVar3;
        c = new d9g[]{d9gVar, d9gVar2, d9gVar3, new d9g("MixEntity", 3)};
    }

    public static d9g valueOf(String str) {
        return (d9g) Enum.valueOf(d9g.class, str);
    }

    public static d9g[] values() {
        return (d9g[]) c.clone();
    }
}
