package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class jrc {
    public static final jrc a;
    public static final jrc b;
    public static final /* synthetic */ jrc[] c;

    static {
        jrc jrcVar = new jrc("FOREGROUND", 0);
        a = jrcVar;
        jrc jrcVar2 = new jrc("BACKGROUND", 1);
        b = jrcVar2;
        c = new jrc[]{jrcVar, jrcVar2};
    }

    public static jrc valueOf(String str) {
        return (jrc) Enum.valueOf(jrc.class, str);
    }

    public static jrc[] values() {
        return (jrc[]) c.clone();
    }
}
