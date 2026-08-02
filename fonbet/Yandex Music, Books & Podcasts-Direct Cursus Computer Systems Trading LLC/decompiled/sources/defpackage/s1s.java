package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class s1s {
    public static final s1s a;
    public static final s1s b;
    public static final s1s c;
    public static final /* synthetic */ s1s[] d;

    static {
        s1s s1sVar = new s1s("Tabs", 0);
        a = s1sVar;
        s1s s1sVar2 = new s1s("Divider", 1);
        b = s1sVar2;
        s1s s1sVar3 = new s1s("Indicator", 2);
        c = s1sVar3;
        d = new s1s[]{s1sVar, s1sVar2, s1sVar3};
    }

    public static s1s valueOf(String str) {
        return (s1s) Enum.valueOf(s1s.class, str);
    }

    public static s1s[] values() {
        return (s1s[]) d.clone();
    }
}
