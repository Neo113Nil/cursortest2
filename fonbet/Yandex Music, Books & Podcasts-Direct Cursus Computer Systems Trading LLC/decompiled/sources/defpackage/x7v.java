package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class x7v {
    public static final x7v a;
    public static final x7v b;
    public static final /* synthetic */ x7v[] c;

    static {
        x7v x7vVar = new x7v("Oknyx", 0);
        a = x7vVar;
        x7v x7vVar2 = new x7v("Sparkle", 1);
        b = x7vVar2;
        c = new x7v[]{x7vVar, x7vVar2};
    }

    public static x7v valueOf(String str) {
        return (x7v) Enum.valueOf(x7v.class, str);
    }

    public static x7v[] values() {
        return (x7v[]) c.clone();
    }
}
