package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class jeh {
    public static final jeh a;
    public static final jeh b;
    public static final /* synthetic */ jeh[] c;

    static {
        jeh jehVar = new jeh("DRAG", 0);
        a = jehVar;
        jeh jehVar2 = new jeh("SWIPE", 1);
        b = jehVar2;
        c = new jeh[]{jehVar, jehVar2};
    }

    public static jeh valueOf(String str) {
        return (jeh) Enum.valueOf(jeh.class, str);
    }

    public static jeh[] values() {
        return (jeh[]) c.clone();
    }
}
