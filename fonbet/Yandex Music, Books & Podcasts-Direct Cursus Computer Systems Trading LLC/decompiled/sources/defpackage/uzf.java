package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class uzf {
    public static final uzf a;
    public static final uzf b;
    public static final uzf c;
    public static final /* synthetic */ uzf[] d;

    static {
        uzf uzfVar = new uzf("NEED_SHOW", 0);
        a = uzfVar;
        uzf uzfVar2 = new uzf("NOT_NEED_SHOW", 1);
        b = uzfVar2;
        uzf uzfVar3 = new uzf("ALREADY_SHOWN", 2);
        c = uzfVar3;
        d = new uzf[]{uzfVar, uzfVar2, uzfVar3};
    }

    public static uzf valueOf(String str) {
        return (uzf) Enum.valueOf(uzf.class, str);
    }

    public static uzf[] values() {
        return (uzf[]) d.clone();
    }
}
