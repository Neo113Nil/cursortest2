package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class p1o {
    public static final p1o a;
    public static final p1o b;
    public static final p1o c;
    public static final p1o d;
    public static final p1o e;
    public static final /* synthetic */ p1o[] f;

    static {
        p1o p1oVar = new p1o("Album", 0);
        a = p1oVar;
        p1o p1oVar2 = new p1o("Artist", 1);
        b = p1oVar2;
        p1o p1oVar3 = new p1o("Playlist", 2);
        c = p1oVar3;
        p1o p1oVar4 = new p1o("NonMusic", 3);
        d = p1oVar4;
        p1o p1oVar5 = new p1o("Various", 4);
        e = p1oVar5;
        f = new p1o[]{p1oVar, p1oVar2, p1oVar3, p1oVar4, p1oVar5};
    }

    public static p1o valueOf(String str) {
        return (p1o) Enum.valueOf(p1o.class, str);
    }

    public static p1o[] values() {
        return (p1o[]) f.clone();
    }
}
