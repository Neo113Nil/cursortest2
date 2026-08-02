package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class xbk {
    public static final /* synthetic */ xbk[] a = {new xbk("Billing", 0), new xbk("PaySdk", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    xbk EF5;

    public static xbk valueOf(String str) {
        return (xbk) Enum.valueOf(xbk.class, str);
    }

    public static xbk[] values() {
        return (xbk[]) a.clone();
    }
}
