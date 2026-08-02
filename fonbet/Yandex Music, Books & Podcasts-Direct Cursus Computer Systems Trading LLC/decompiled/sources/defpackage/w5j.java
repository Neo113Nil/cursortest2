package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class w5j {
    public static final w5j a;
    public static final w5j b;
    public static final w5j c;
    public static final /* synthetic */ w5j[] d;

    static {
        w5j w5jVar = new w5j("NATURAL", 0);
        a = w5jVar;
        w5j w5jVar2 = new w5j("ERROR", 1);
        b = w5jVar2;
        w5j w5jVar3 = new w5j("DISLIKE", 2);
        w5j w5jVar4 = new w5j("SKIP", 3);
        c = w5jVar4;
        d = new w5j[]{w5jVar, w5jVar2, w5jVar3, w5jVar4};
    }

    public static w5j valueOf(String str) {
        return (w5j) Enum.valueOf(w5j.class, str);
    }

    public static w5j[] values() {
        return (w5j[]) d.clone();
    }
}
