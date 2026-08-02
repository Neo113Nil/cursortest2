package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class wwn {
    public static final wwn a;
    public static final wwn b;
    public static final wwn c;
    public static final /* synthetic */ wwn[] d;

    static {
        wwn wwnVar = new wwn("AUTOMATIC", 0);
        a = wwnVar;
        wwn wwnVar2 = new wwn("HARDWARE", 1);
        b = wwnVar2;
        wwn wwnVar3 = new wwn("SOFTWARE", 2);
        c = wwnVar3;
        d = new wwn[]{wwnVar, wwnVar2, wwnVar3};
    }

    public static wwn valueOf(String str) {
        return (wwn) Enum.valueOf(wwn.class, str);
    }

    public static wwn[] values() {
        return (wwn[]) d.clone();
    }
}
