package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class e4c {
    public static final b2c b;
    public static final e4c c;
    public static final e4c d;
    public static final e4c e;
    public static final /* synthetic */ e4c[] f;
    public static final /* synthetic */ rdb g;
    public final String a;

    static {
        e4c e4cVar = new e4c("Mix", 0, "mix");
        c = e4cVar;
        e4c e4cVar2 = new e4c("Crossfade", 1, "crossfade");
        d = e4cVar2;
        e4c e4cVar3 = new e4c("Default", 2, "none");
        e = e4cVar3;
        e4c[] e4cVarArr = {e4cVar, e4cVar2, e4cVar3};
        f = e4cVarArr;
        g = new rdb(e4cVarArr);
        b = new b2c();
    }

    public e4c(String str, int i, String str2) {
        this.a = str2;
    }

    public static e4c valueOf(String str) {
        return (e4c) Enum.valueOf(e4c.class, str);
    }

    public static e4c[] values() {
        return (e4c[]) f.clone();
    }
}
