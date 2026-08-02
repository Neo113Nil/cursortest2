package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class swt {
    public static final swt a;
    public static final swt b;
    public static final /* synthetic */ swt[] c;

    static {
        swt swtVar = new swt("Tap", 0);
        a = swtVar;
        swt swtVar2 = new swt("Drag", 1);
        b = swtVar2;
        c = new swt[]{swtVar, swtVar2};
    }

    public static swt valueOf(String str) {
        return (swt) Enum.valueOf(swt.class, str);
    }

    public static swt[] values() {
        return (swt[]) c.clone();
    }
}
