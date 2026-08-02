package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class o6v {
    public static final o6v a;
    public static final o6v b;
    public static final o6v c;
    public static final /* synthetic */ o6v[] d;

    static {
        o6v o6vVar = new o6v("LIKED", 0);
        a = o6vVar;
        o6v o6vVar2 = new o6v("NEUTRAL", 1);
        b = o6vVar2;
        o6v o6vVar3 = new o6v("DISLIKED", 2);
        c = o6vVar3;
        d = new o6v[]{o6vVar, o6vVar2, o6vVar3};
    }

    public static o6v valueOf(String str) {
        return (o6v) Enum.valueOf(o6v.class, str);
    }

    public static o6v[] values() {
        return (o6v[]) d.clone();
    }
}
