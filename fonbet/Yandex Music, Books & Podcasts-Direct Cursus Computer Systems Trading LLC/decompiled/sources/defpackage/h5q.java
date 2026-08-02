package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class h5q {
    public static final h5q a;
    public static final h5q b;
    public static final h5q c;
    public static final h5q d;
    public static final h5q e;
    public static final /* synthetic */ h5q[] f;

    static {
        h5q h5qVar = new h5q("IDLE", 0);
        a = h5qVar;
        h5q h5qVar2 = new h5q("PREPARING", 1);
        b = h5qVar2;
        h5q h5qVar3 = new h5q("BUFFERING", 2);
        c = h5qVar3;
        h5q h5qVar4 = new h5q("READY", 3);
        d = h5qVar4;
        h5q h5qVar5 = new h5q("ENDED", 4);
        e = h5qVar5;
        f = new h5q[]{h5qVar, h5qVar2, h5qVar3, h5qVar4, h5qVar5};
    }

    public static h5q valueOf(String str) {
        return (h5q) Enum.valueOf(h5q.class, str);
    }

    public static h5q[] values() {
        return (h5q[]) f.clone();
    }
}
