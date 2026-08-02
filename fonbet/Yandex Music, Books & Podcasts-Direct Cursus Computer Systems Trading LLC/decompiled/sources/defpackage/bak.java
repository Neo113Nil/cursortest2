package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class bak {
    public static final bak a;
    public static final /* synthetic */ bak[] b;

    static {
        bak bakVar = new bak("CounterClockwise", 0);
        a = bakVar;
        b = new bak[]{bakVar, new bak("Clockwise", 1)};
    }

    public static bak valueOf(String str) {
        return (bak) Enum.valueOf(bak.class, str);
    }

    public static bak[] values() {
        return (bak[]) b.clone();
    }
}
