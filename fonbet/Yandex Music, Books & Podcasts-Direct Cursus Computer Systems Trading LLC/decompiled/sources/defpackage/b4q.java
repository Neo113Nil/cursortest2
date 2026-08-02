package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b4q {
    public static final b4q a;
    public static final b4q b;
    public static final b4q c;
    public static final b4q d;
    public static final /* synthetic */ b4q[] e;

    static {
        b4q b4qVar = new b4q("Next", 0);
        a = b4qVar;
        b4q b4qVar2 = new b4q("FromQueue", 1);
        b = b4qVar2;
        b4q b4qVar3 = new b4q("Skipped", 2);
        c = b4qVar3;
        b4q b4qVar4 = new b4q("Other", 3);
        d = b4qVar4;
        e = new b4q[]{b4qVar, b4qVar2, b4qVar3, b4qVar4};
    }

    public static b4q valueOf(String str) {
        return (b4q) Enum.valueOf(b4q.class, str);
    }

    public static b4q[] values() {
        return (b4q[]) e.clone();
    }
}
