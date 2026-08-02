package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class jdf {
    public static final jdf a;
    public static final jdf b;
    public static final /* synthetic */ jdf[] c;

    static {
        jdf jdfVar = new jdf("DATE", 0);
        a = jdfVar;
        jdf jdfVar2 = new jdf("ALPHABET", 1);
        b = jdfVar2;
        c = new jdf[]{jdfVar, jdfVar2, new jdf("FIRST_NEW", 2)};
    }

    public static jdf valueOf(String str) {
        return (jdf) Enum.valueOf(jdf.class, str);
    }

    public static jdf[] values() {
        return (jdf[]) c.clone();
    }
}
