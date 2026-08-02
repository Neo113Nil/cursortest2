package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class tga {
    public static final tga a;
    public static final tga b;
    public static final tga c;
    public static final tga d;
    public static final /* synthetic */ tga[] e;

    static {
        tga tgaVar = new tga("UPDATE_DATE", 0);
        a = tgaVar;
        tga tgaVar2 = new tga("CREATE_DATE", 1);
        b = tgaVar2;
        tga tgaVar3 = new tga("ALPHABET", 2);
        c = tgaVar3;
        tga tgaVar4 = new tga("DOWNLOADED_DATE", 3);
        d = tgaVar4;
        e = new tga[]{tgaVar, tgaVar2, tgaVar3, tgaVar4};
    }

    public static tga valueOf(String str) {
        return (tga) Enum.valueOf(tga.class, str);
    }

    public static tga[] values() {
        return (tga[]) e.clone();
    }
}
