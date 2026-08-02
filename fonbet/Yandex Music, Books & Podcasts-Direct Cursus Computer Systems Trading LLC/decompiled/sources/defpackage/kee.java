package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class kee {
    public static final ogp b;
    public static final kee c;
    public static final /* synthetic */ kee[] d;
    public static final /* synthetic */ rdb e;
    public final String a;

    static {
        kee keeVar = new kee("DEFAULT", 0, "default");
        c = keeVar;
        kee[] keeVarArr = {keeVar, new kee("ON", 1, "on"), new kee("ON1", 2, "on1")};
        d = keeVarArr;
        e = new rdb(keeVarArr);
        b = new ogp();
    }

    public kee(String str, int i, String str2) {
        this.a = str2;
    }

    public static kee valueOf(String str) {
        return (kee) Enum.valueOf(kee.class, str);
    }

    public static kee[] values() {
        return (kee[]) d.clone();
    }
}
