package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class oma {
    public static final oma a;
    public static final oma b;
    public static final oma c;
    public static final /* synthetic */ oma[] d;

    static {
        oma omaVar = new oma("Yes", 0);
        a = omaVar;
        oma omaVar2 = new oma("No", 1);
        b = omaVar2;
        oma omaVar3 = new oma("NotInitialized", 2);
        c = omaVar3;
        d = new oma[]{omaVar, omaVar2, omaVar3};
    }

    public static oma valueOf(String str) {
        return (oma) Enum.valueOf(oma.class, str);
    }

    public static oma[] values() {
        return (oma[]) d.clone();
    }
}
