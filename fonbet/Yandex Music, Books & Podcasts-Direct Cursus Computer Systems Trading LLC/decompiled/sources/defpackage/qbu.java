package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class qbu {
    public static final qbu a;
    public static final qbu b;
    public static final qbu c;
    public static final /* synthetic */ qbu[] d;

    static {
        qbu qbuVar = new qbu("VISIBLE", 0);
        a = qbuVar;
        qbu qbuVar2 = new qbu("HIDDEN", 1);
        b = qbuVar2;
        qbu qbuVar3 = new qbu("END_WITHOUT_REPEAT", 2);
        c = qbuVar3;
        d = new qbu[]{qbuVar, qbuVar2, qbuVar3};
    }

    public static qbu valueOf(String str) {
        return (qbu) Enum.valueOf(qbu.class, str);
    }

    public static qbu[] values() {
        return (qbu[]) d.clone();
    }
}
