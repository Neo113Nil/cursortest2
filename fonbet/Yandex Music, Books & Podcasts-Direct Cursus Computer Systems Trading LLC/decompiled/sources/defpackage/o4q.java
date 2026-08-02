package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class o4q {
    public static final o4q a;
    public static final o4q b;
    public static final /* synthetic */ o4q[] c;

    static {
        o4q o4qVar = new o4q("WithFixedRecommendations", 0);
        a = o4qVar;
        o4q o4qVar2 = new o4q("WithoutFixedRecommendations", 1);
        b = o4qVar2;
        c = new o4q[]{o4qVar, o4qVar2};
    }

    public static o4q valueOf(String str) {
        return (o4q) Enum.valueOf(o4q.class, str);
    }

    public static o4q[] values() {
        return (o4q[]) c.clone();
    }
}
