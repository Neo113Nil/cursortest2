package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class avg {
    public static final avg a;
    public static final avg b;
    public static final avg c;
    public static final /* synthetic */ avg[] d;

    static {
        avg avgVar = new avg("Tap", 0);
        a = avgVar;
        avg avgVar2 = new avg("Cancelled", 1);
        b = avgVar2;
        avg avgVar3 = new avg("Fired", 2);
        c = avgVar3;
        d = new avg[]{avgVar, avgVar2, avgVar3};
    }

    public static avg valueOf(String str) {
        return (avg) Enum.valueOf(avg.class, str);
    }

    public static avg[] values() {
        return (avg[]) d.clone();
    }
}
