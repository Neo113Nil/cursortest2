package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class q5m {
    public static final q5m a;
    public static final q5m b;
    public static final q5m c;
    public static final /* synthetic */ q5m[] d;

    static {
        q5m q5mVar = new q5m("INITIAL", 0);
        a = q5mVar;
        q5m q5mVar2 = new q5m("LOADING", 1);
        b = q5mVar2;
        q5m q5mVar3 = new q5m("DATA", 2);
        c = q5mVar3;
        d = new q5m[]{q5mVar, q5mVar2, q5mVar3};
    }

    public static q5m valueOf(String str) {
        return (q5m) Enum.valueOf(q5m.class, str);
    }

    public static q5m[] values() {
        return (q5m[]) d.clone();
    }
}
