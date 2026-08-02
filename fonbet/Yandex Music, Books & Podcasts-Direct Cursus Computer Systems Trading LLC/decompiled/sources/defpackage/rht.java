package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class rht {
    public static final rht a;
    public static final rht b;
    public static final /* synthetic */ rht[] c;

    static {
        rht rhtVar = new rht("LIST", 0);
        a = rhtVar;
        rht rhtVar2 = new rht("GRID", 1);
        b = rhtVar2;
        c = new rht[]{rhtVar, rhtVar2};
    }

    public static rht valueOf(String str) {
        return (rht) Enum.valueOf(rht.class, str);
    }

    public static rht[] values() {
        return (rht[]) c.clone();
    }
}
