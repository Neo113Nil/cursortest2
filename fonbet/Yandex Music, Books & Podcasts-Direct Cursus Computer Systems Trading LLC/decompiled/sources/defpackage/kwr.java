package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class kwr {
    public static final /* synthetic */ kwr[] c;
    public static final /* synthetic */ rdb d;
    public final int a;
    public final String b;

    static {
        kwr[] kwrVarArr = {new kwr("PLEASE_REPEAT", 0, 1, "please_repeat"), new kwr("UNKNOWN", 1, 2, "unknown"), new kwr("TIMEOUT", 2, 3, "timeout"), new kwr("NOT_FOUND", 3, 4, "not_found")};
        c = kwrVarArr;
        d = new rdb(kwrVarArr);
    }

    public kwr(String str, int i, int i2, String str2) {
        this.a = i2;
        this.b = str2;
    }

    public static kwr valueOf(String str) {
        return (kwr) Enum.valueOf(kwr.class, str);
    }

    public static kwr[] values() {
        return (kwr[]) c.clone();
    }
}
