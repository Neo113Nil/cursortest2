package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class uur {
    public static final uur a;
    public static final uur b;
    public static final /* synthetic */ uur[] c;

    static {
        uur uurVar = new uur("Up", 0);
        a = uurVar;
        uur uurVar2 = new uur("Down", 1);
        b = uurVar2;
        c = new uur[]{uurVar, uurVar2};
    }

    public static uur valueOf(String str) {
        return (uur) Enum.valueOf(uur.class, str);
    }

    public static uur[] values() {
        return (uur[]) c.clone();
    }
}
