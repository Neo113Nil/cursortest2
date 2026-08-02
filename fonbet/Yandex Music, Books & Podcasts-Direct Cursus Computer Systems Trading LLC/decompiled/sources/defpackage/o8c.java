package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o8c {
    public static final o8c a;
    public static final o8c b;
    public static final o8c c;
    public static final o8c d;
    public static final /* synthetic */ o8c[] e;

    static {
        o8c o8cVar = new o8c("NOT_LOADED", 0);
        a = o8cVar;
        o8c o8cVar2 = new o8c("LOADING", 1);
        b = o8cVar2;
        o8c o8cVar3 = new o8c("SUCCESS", 2);
        c = o8cVar3;
        o8c o8cVar4 = new o8c("ERROR", 3);
        d = o8cVar4;
        e = new o8c[]{o8cVar, o8cVar2, o8cVar3, o8cVar4};
    }

    public static o8c valueOf(String str) {
        return (o8c) Enum.valueOf(o8c.class, str);
    }

    public static o8c[] values() {
        return (o8c[]) e.clone();
    }
}
