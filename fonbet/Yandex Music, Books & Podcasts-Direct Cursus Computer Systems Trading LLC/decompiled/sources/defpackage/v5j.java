package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class v5j {
    public static final v5j a;
    public static final v5j b;
    public static final v5j c;
    public static final v5j d;
    public static final v5j e;
    public static final v5j f;
    public static final /* synthetic */ v5j[] g;

    static {
        v5j v5jVar = new v5j("NATURAL_COMPLETED", 0);
        a = v5jVar;
        v5j v5jVar2 = new v5j("NATURAL_ERROR", 1);
        b = v5jVar2;
        v5j v5jVar3 = new v5j("NATURAL_OFFLINE", 2);
        c = v5jVar3;
        v5j v5jVar4 = new v5j("NATURAL_OTHER", 3);
        d = v5jVar4;
        v5j v5jVar5 = new v5j("SKIP", 4);
        e = v5jVar5;
        v5j v5jVar6 = new v5j("DISLIKE", 5);
        f = v5jVar6;
        g = new v5j[]{v5jVar, v5jVar2, v5jVar3, v5jVar4, v5jVar5, v5jVar6};
    }

    public static v5j valueOf(String str) {
        return (v5j) Enum.valueOf(v5j.class, str);
    }

    public static v5j[] values() {
        return (v5j[]) g.clone();
    }
}
