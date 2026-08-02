package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j8j {
    public static final j8j a;
    public static final j8j b;
    public static final /* synthetic */ j8j[] c;

    static {
        j8j j8jVar = new j8j("Width", 0);
        a = j8jVar;
        j8j j8jVar2 = new j8j("Height", 1);
        b = j8jVar2;
        c = new j8j[]{j8jVar, j8jVar2};
    }

    public static j8j valueOf(String str) {
        return (j8j) Enum.valueOf(j8j.class, str);
    }

    public static j8j[] values() {
        return (j8j[]) c.clone();
    }
}
