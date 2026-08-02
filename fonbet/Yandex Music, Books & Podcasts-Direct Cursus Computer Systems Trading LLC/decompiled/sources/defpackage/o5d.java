package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class o5d {
    public static final o5d a;
    public static final o5d b;
    public static final o5d c;
    public static final /* synthetic */ o5d[] d;

    static {
        o5d o5dVar = new o5d("CROSSFADED", 0);
        a = o5dVar;
        o5d o5dVar2 = new o5d("NORMALIZED", 1);
        b = o5dVar2;
        o5d o5dVar3 = new o5d("MIX", 2);
        c = o5dVar3;
        d = new o5d[]{o5dVar, o5dVar2, o5dVar3};
    }

    public static o5d valueOf(String str) {
        return (o5d) Enum.valueOf(o5d.class, str);
    }

    public static o5d[] values() {
        return (o5d[]) d.clone();
    }
}
