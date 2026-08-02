package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class fx {
    public static final fx a;
    public static final fx b;
    public static final /* synthetic */ fx[] c;

    static {
        fx fxVar = new fx("Like", 0);
        a = fxVar;
        fx fxVar2 = new fx("Dislike", 1);
        b = fxVar2;
        c = new fx[]{fxVar, fxVar2};
    }

    public static fx valueOf(String str) {
        return (fx) Enum.valueOf(fx.class, str);
    }

    public static fx[] values() {
        return (fx[]) c.clone();
    }
}
