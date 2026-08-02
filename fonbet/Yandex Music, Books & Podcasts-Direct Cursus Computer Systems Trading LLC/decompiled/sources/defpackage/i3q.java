package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class i3q implements q3q {
    public static final i3q a;
    public static final i3q b;
    public static final /* synthetic */ i3q[] c;

    static {
        i3q i3qVar = new i3q("Default", 0);
        a = i3qVar;
        i3q i3qVar2 = new i3q("MusicHistory", 1);
        b = i3qVar2;
        c = new i3q[]{i3qVar, i3qVar2};
    }

    public static i3q valueOf(String str) {
        return (i3q) Enum.valueOf(i3q.class, str);
    }

    public static i3q[] values() {
        return (i3q[]) c.clone();
    }
}
