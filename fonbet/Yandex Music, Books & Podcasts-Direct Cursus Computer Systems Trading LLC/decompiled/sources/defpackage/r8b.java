package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class r8b {
    public static final r8b a;
    public static final r8b b;
    public static final r8b c;
    public static final /* synthetic */ r8b[] d;

    static {
        r8b r8bVar = new r8b("PreEnter", 0);
        a = r8bVar;
        r8b r8bVar2 = new r8b("Visible", 1);
        b = r8bVar2;
        r8b r8bVar3 = new r8b("PostExit", 2);
        c = r8bVar3;
        d = new r8b[]{r8bVar, r8bVar2, r8bVar3};
    }

    public static r8b valueOf(String str) {
        return (r8b) Enum.valueOf(r8b.class, str);
    }

    public static r8b[] values() {
        return (r8b[]) d.clone();
    }
}
