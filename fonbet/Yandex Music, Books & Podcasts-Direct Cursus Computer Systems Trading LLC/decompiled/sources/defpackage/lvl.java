package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class lvl {
    public static final lvl a;
    public static final lvl b;
    public static final lvl c;
    public static final lvl d;
    public static final lvl e;
    public static final /* synthetic */ lvl[] f;

    static {
        lvl lvlVar = new lvl("LIKED", 0);
        a = lvlVar;
        lvl lvlVar2 = new lvl("SMART", 1);
        b = lvlVar2;
        lvl lvlVar3 = new lvl("CHART", 2);
        c = lvlVar3;
        lvl lvlVar4 = new lvl("USER", 3);
        d = lvlVar4;
        lvl lvlVar5 = new lvl("EDITOR", 4);
        e = lvlVar5;
        f = new lvl[]{lvlVar, lvlVar2, lvlVar3, lvlVar4, lvlVar5};
    }

    public static lvl valueOf(String str) {
        return (lvl) Enum.valueOf(lvl.class, str);
    }

    public static lvl[] values() {
        return (lvl[]) f.clone();
    }
}
