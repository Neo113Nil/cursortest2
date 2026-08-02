package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class rwv {
    public static final rwv a;
    public static final rwv b;
    public static final /* synthetic */ rwv[] c;

    static {
        rwv rwvVar = new rwv("Default", 0);
        a = rwvVar;
        rwv rwvVar2 = new rwv("OneToOne", 1);
        b = rwvVar2;
        c = new rwv[]{rwvVar, rwvVar2};
    }

    public static rwv valueOf(String str) {
        return (rwv) Enum.valueOf(rwv.class, str);
    }

    public static rwv[] values() {
        return (rwv[]) c.clone();
    }
}
