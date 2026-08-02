package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class t6o {
    public static final t6o a;
    public static final t6o b;
    public static final t6o c;
    public static final /* synthetic */ t6o[] d;

    static {
        t6o t6oVar = new t6o("NONE", 0);
        a = t6oVar;
        t6o t6oVar2 = new t6o("NOTHING_TO_RESTORE", 1);
        t6o t6oVar3 = new t6o("RESTORE_SUCCESS", 2);
        b = t6oVar3;
        t6o t6oVar4 = new t6o("FALLBACK_WAVE", 3);
        c = t6oVar4;
        d = new t6o[]{t6oVar, t6oVar2, t6oVar3, t6oVar4};
    }

    public static t6o valueOf(String str) {
        return (t6o) Enum.valueOf(t6o.class, str);
    }

    public static t6o[] values() {
        return (t6o[]) d.clone();
    }
}
