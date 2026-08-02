package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class xv6 {
    public static final /* synthetic */ xv6[] a = {new xv6("DIGITS_0", 0), new xv6("DIGITS_2", 1), new xv6("DIGITS_3", 2), new xv6("DIGITS_07", 3), new xv6("DIGITS_NO", 4)};

    /* JADX INFO: Fake field, exist only in values array */
    xv6 EF5;

    public static xv6 valueOf(String str) {
        return (xv6) Enum.valueOf(xv6.class, str);
    }

    public static xv6[] values() {
        return (xv6[]) a.clone();
    }
}
