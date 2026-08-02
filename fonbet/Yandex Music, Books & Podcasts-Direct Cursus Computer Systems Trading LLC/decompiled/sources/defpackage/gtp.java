package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class gtp {
    public static final tjl a;
    public static final /* synthetic */ gtp[] b;
    public static final /* synthetic */ rdb c;

    static {
        gtp[] gtpVarArr = {new gtp("AutoDownload", 0)};
        b = gtpVarArr;
        c = new rdb(gtpVarArr);
        a = new tjl();
    }

    public static gtp valueOf(String str) {
        return (gtp) Enum.valueOf(gtp.class, str);
    }

    public static gtp[] values() {
        return (gtp[]) b.clone();
    }
}
