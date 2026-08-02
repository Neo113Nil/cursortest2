package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class uot {
    public static final uot a;
    public static final uot b;
    public static final /* synthetic */ uot[] c;

    static {
        uot uotVar = new uot("RemoveAndContinue", 0);
        a = uotVar;
        uot uotVar2 = new uot("TryLater", 1);
        b = uotVar2;
        c = new uot[]{uotVar, uotVar2};
    }

    public static uot valueOf(String str) {
        return (uot) Enum.valueOf(uot.class, str);
    }

    public static uot[] values() {
        return (uot[]) c.clone();
    }
}
