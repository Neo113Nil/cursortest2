package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ttd {
    public static final ttd a;
    public static final ttd b;
    public static final /* synthetic */ ttd[] c;

    static {
        ttd ttdVar = new ttd("Effect", 0);
        a = ttdVar;
        ttd ttdVar2 = new ttd("Source", 1);
        b = ttdVar2;
        c = new ttd[]{ttdVar, ttdVar2};
    }

    public static ttd valueOf(String str) {
        return (ttd) Enum.valueOf(ttd.class, str);
    }

    public static ttd[] values() {
        return (ttd[]) c.clone();
    }
}
