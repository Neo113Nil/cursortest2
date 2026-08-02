package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class fea {
    public static final fea a;
    public static final fea b;
    public static final /* synthetic */ fea[] c;

    static {
        fea feaVar = new fea("DOWNLOADED_DATE", 0);
        a = feaVar;
        fea feaVar2 = new fea("ALPHABET", 1);
        b = feaVar2;
        c = new fea[]{feaVar, feaVar2};
    }

    public static fea valueOf(String str) {
        return (fea) Enum.valueOf(fea.class, str);
    }

    public static fea[] values() {
        return (fea[]) c.clone();
    }
}
