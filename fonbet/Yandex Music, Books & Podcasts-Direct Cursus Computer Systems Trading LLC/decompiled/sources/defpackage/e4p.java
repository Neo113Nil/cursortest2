package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class e4p {
    public static final e4p a;
    public static final e4p b;
    public static final e4p c;
    public static final e4p d;
    public static final e4p e;
    public static final /* synthetic */ e4p[] f;

    static {
        e4p e4pVar = new e4p("Online", 0);
        a = e4pVar;
        e4p e4pVar2 = new e4p("OnlineArtist", 1);
        b = e4pVar2;
        e4p e4pVar3 = new e4p("UserLibrary", 2);
        c = e4pVar3;
        e4p e4pVar4 = new e4p("Local", 3);
        d = e4pVar4;
        e4p e4pVar5 = new e4p("Other", 4);
        e = e4pVar5;
        f = new e4p[]{e4pVar, e4pVar2, e4pVar3, e4pVar4, e4pVar5};
    }

    public static e4p valueOf(String str) {
        return (e4p) Enum.valueOf(e4p.class, str);
    }

    public static e4p[] values() {
        return (e4p[]) f.clone();
    }
}
