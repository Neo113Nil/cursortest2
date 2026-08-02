package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class x4r {
    public static final x4r a;
    public static final x4r b;
    public static final /* synthetic */ x4r[] c;

    static {
        x4r x4rVar = new x4r("Left", 0);
        a = x4rVar;
        x4r x4rVar2 = new x4r("Right", 1);
        b = x4rVar2;
        c = new x4r[]{x4rVar, x4rVar2};
    }

    public static x4r valueOf(String str) {
        return (x4r) Enum.valueOf(x4r.class, str);
    }

    public static x4r[] values() {
        return (x4r[]) c.clone();
    }
}
