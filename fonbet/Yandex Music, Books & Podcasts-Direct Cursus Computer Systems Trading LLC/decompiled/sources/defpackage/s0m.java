package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class s0m {
    public static final s0m a;
    public static final s0m b;
    public static final s0m c;
    public static final s0m d;
    public static final s0m e;
    public static final /* synthetic */ s0m[] f;

    static {
        s0m s0mVar = new s0m("DEFAULT", 0);
        a = s0mVar;
        s0m s0mVar2 = new s0m("UPDATE_DATE", 1);
        b = s0mVar2;
        s0m s0mVar3 = new s0m("CREATE_DATE", 2);
        c = s0mVar3;
        s0m s0mVar4 = new s0m("ALPHABET", 3);
        d = s0mVar4;
        s0m s0mVar5 = new s0m("ADDED_DATE", 4);
        e = s0mVar5;
        f = new s0m[]{s0mVar, s0mVar2, s0mVar3, s0mVar4, s0mVar5};
    }

    public static s0m valueOf(String str) {
        return (s0m) Enum.valueOf(s0m.class, str);
    }

    public static s0m[] values() {
        return (s0m[]) f.clone();
    }
}
