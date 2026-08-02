package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class gcr {
    public static final gcr a;
    public static final gcr b;
    public static final gcr c;
    public static final /* synthetic */ gcr[] d;

    static {
        gcr gcrVar = new gcr("RESTRICTED", 0);
        a = gcrVar;
        gcr gcrVar2 = new gcr("RELAXED", 1);
        b = gcrVar2;
        gcr gcrVar3 = new gcr("FREE", 2);
        c = gcrVar3;
        d = new gcr[]{gcrVar, gcrVar2, gcrVar3};
    }

    public static gcr valueOf(String str) {
        return (gcr) Enum.valueOf(gcr.class, str);
    }

    public static gcr[] values() {
        return (gcr[]) d.clone();
    }
}
