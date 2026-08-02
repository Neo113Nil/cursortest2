package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class svk {
    public static final svk a;
    public static final svk b;
    public static final svk c;
    public static final /* synthetic */ svk[] d;

    static {
        svk svkVar = new svk("Idle", 0);
        a = svkVar;
        svk svkVar2 = new svk("Prepared", 1);
        b = svkVar2;
        svk svkVar3 = new svk("Started", 2);
        c = svkVar3;
        d = new svk[]{svkVar, svkVar2, svkVar3};
    }

    public static svk valueOf(String str) {
        return (svk) Enum.valueOf(svk.class, str);
    }

    public static svk[] values() {
        return (svk[]) d.clone();
    }
}
