package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class d4s {
    public static final d4s a;
    public static final d4s b;
    public static final d4s c;
    public static final d4s d;
    public static final d4s e;
    public static final /* synthetic */ d4s[] f;

    static {
        d4s d4sVar = new d4s("BINARY", 0);
        a = d4sVar;
        d4s d4sVar2 = new d4s("NUMERIC", 1);
        b = d4sVar2;
        d4s d4sVar3 = new d4s("TEXT", 2);
        c = d4sVar3;
        d4s d4sVar4 = new d4s("MIXED", 3);
        d = d4sVar4;
        d4s d4sVar5 = new d4s("DOL", 4);
        e = d4sVar5;
        f = new d4s[]{d4sVar, d4sVar2, d4sVar3, d4sVar4, d4sVar5, new d4s("TEMPLATE", 5)};
    }

    public static d4s valueOf(String str) {
        return (d4s) Enum.valueOf(d4s.class, str);
    }

    public static d4s[] values() {
        return (d4s[]) f.clone();
    }
}
