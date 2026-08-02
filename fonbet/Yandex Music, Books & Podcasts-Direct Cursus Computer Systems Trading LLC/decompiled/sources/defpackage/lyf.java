package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class lyf {
    public static final lyf a;
    public static final lyf b;
    public static final lyf c;
    public static final lyf d;
    public static final lyf e;
    public static final /* synthetic */ lyf[] f;

    static {
        lyf lyfVar = new lyf("DESTROYED", 0);
        a = lyfVar;
        lyf lyfVar2 = new lyf("INITIALIZED", 1);
        b = lyfVar2;
        lyf lyfVar3 = new lyf("CREATED", 2);
        c = lyfVar3;
        lyf lyfVar4 = new lyf("STARTED", 3);
        d = lyfVar4;
        lyf lyfVar5 = new lyf("RESUMED", 4);
        e = lyfVar5;
        f = new lyf[]{lyfVar, lyfVar2, lyfVar3, lyfVar4, lyfVar5};
    }

    public static lyf valueOf(String str) {
        return (lyf) Enum.valueOf(lyf.class, str);
    }

    public static lyf[] values() {
        return (lyf[]) f.clone();
    }
}
