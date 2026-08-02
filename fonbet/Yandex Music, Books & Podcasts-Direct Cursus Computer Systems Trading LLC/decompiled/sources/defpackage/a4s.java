package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a4s {
    public static final a4s a;
    public static final a4s b;
    public static final /* synthetic */ a4s[] c;

    static {
        a4s a4sVar = new a4s("PRIMITIVE", 0);
        a = a4sVar;
        a4s a4sVar2 = new a4s("CONSTRUCTED", 1);
        b = a4sVar2;
        c = new a4s[]{a4sVar, a4sVar2};
    }

    public static a4s valueOf(String str) {
        return (a4s) Enum.valueOf(a4s.class, str);
    }

    public static a4s[] values() {
        return (a4s[]) c.clone();
    }
}
