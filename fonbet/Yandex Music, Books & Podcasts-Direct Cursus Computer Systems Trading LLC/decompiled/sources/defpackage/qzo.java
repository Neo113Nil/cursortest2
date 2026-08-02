package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class qzo {
    public static final qzo a;
    public static final qzo b;
    public static final /* synthetic */ qzo[] c;

    static {
        qzo qzoVar = new qzo("All", 0);
        a = qzoVar;
        qzo qzoVar2 = new qzo("Music", 1);
        qzo qzoVar3 = new qzo("AllWithoutClips", 2);
        b = qzoVar3;
        c = new qzo[]{qzoVar, qzoVar2, qzoVar3, new qzo("OnlyTracks", 3)};
    }

    public static qzo valueOf(String str) {
        return (qzo) Enum.valueOf(qzo.class, str);
    }

    public static qzo[] values() {
        return (qzo[]) c.clone();
    }
}
