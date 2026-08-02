package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class gqm {
    public static final gqm a;
    public static final gqm b;
    public static final /* synthetic */ gqm[] c;

    static {
        gqm gqmVar = new gqm("SQUARE", 0);
        a = gqmVar;
        gqm gqmVar2 = new gqm("ROUND", 1);
        b = gqmVar2;
        c = new gqm[]{gqmVar, gqmVar2};
    }

    public static gqm valueOf(String str) {
        return (gqm) Enum.valueOf(gqm.class, str);
    }

    public static gqm[] values() {
        return (gqm[]) c.clone();
    }
}
