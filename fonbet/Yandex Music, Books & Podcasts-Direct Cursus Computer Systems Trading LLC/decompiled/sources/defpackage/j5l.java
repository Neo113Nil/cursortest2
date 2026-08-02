package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class j5l {
    public static final i5l c;
    public static final j5l d;
    public static final /* synthetic */ j5l[] e;
    public static final /* synthetic */ rdb f;
    public final float a;
    public final int b;

    static {
        j5l j5lVar = new j5l("NORMAL", 0, 1.0f, 100);
        d = j5lVar;
        j5l[] j5lVarArr = {j5lVar, new j5l("SLIGHTLY_FAST", 1, 1.25f, 125), new j5l("FAST", 2, 1.5f, 150), new j5l("FASTEST", 3, 2.0f, 200)};
        e = j5lVarArr;
        f = new rdb(j5lVarArr);
        c = new i5l();
    }

    public j5l(String str, int i, float f2, int i2) {
        this.a = f2;
        this.b = i2;
    }

    public static j5l valueOf(String str) {
        return (j5l) Enum.valueOf(j5l.class, str);
    }

    public static j5l[] values() {
        return (j5l[]) e.clone();
    }
}
