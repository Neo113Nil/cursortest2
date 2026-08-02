package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class c4g {
    public static final c4g a;
    public static final c4g b;
    public static final c4g c;
    public static final /* synthetic */ c4g[] d;

    static {
        c4g c4gVar = new c4g("NEED_SHOW", 0);
        a = c4gVar;
        c4g c4gVar2 = new c4g("NOT_NEED_SHOW", 1);
        b = c4gVar2;
        c4g c4gVar3 = new c4g("ALREADY_SHOWN", 2);
        c = c4gVar3;
        d = new c4g[]{c4gVar, c4gVar2, c4gVar3};
    }

    public static c4g valueOf(String str) {
        return (c4g) Enum.valueOf(c4g.class, str);
    }

    public static c4g[] values() {
        return (c4g[]) d.clone();
    }
}
