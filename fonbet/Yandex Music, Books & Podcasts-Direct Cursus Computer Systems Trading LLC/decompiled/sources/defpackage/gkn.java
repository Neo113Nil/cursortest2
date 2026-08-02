package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class gkn {
    public static final gkn a;
    public static final gkn b;
    public static final gkn c;
    public static final gkn d;
    public static final /* synthetic */ gkn[] e;

    static {
        gkn gknVar = new gkn("NOT_YET_CONNECTED", 0);
        a = gknVar;
        gkn gknVar2 = new gkn("OPEN", 1);
        b = gknVar2;
        gkn gknVar3 = new gkn("CLOSING", 2);
        c = gknVar3;
        gkn gknVar4 = new gkn("CLOSED", 3);
        d = gknVar4;
        e = new gkn[]{gknVar, gknVar2, gknVar3, gknVar4};
    }

    public static gkn valueOf(String str) {
        return (gkn) Enum.valueOf(gkn.class, str);
    }

    public static gkn[] values() {
        return (gkn[]) e.clone();
    }
}
