package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class f6v {
    public static final f6v a;
    public static final f6v b;
    public static final f6v c;
    public static final f6v d;
    public static final /* synthetic */ f6v[] e;

    static {
        f6v f6vVar = new f6v("SLOW_NETWORK", 0);
        a = f6vVar;
        f6v f6vVar2 = new f6v("NO_NETWORK", 1);
        b = f6vVar2;
        f6v f6vVar3 = new f6v("NOT_IN_BATCH", 2);
        c = f6vVar3;
        f6v f6vVar4 = new f6v("NO_WORDS", 3);
        d = f6vVar4;
        e = new f6v[]{f6vVar, f6vVar2, f6vVar3, f6vVar4};
    }

    public static f6v valueOf(String str) {
        return (f6v) Enum.valueOf(f6v.class, str);
    }

    public static f6v[] values() {
        return (f6v[]) e.clone();
    }
}
