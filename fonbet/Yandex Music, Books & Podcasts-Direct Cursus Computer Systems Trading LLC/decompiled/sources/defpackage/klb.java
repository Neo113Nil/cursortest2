package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class klb {
    public static final /* synthetic */ klb[] a = {new klb("Widget", 0), new klb("PaymentSdk", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    klb EF5;

    public static klb valueOf(String str) {
        return (klb) Enum.valueOf(klb.class, str);
    }

    public static klb[] values() {
        return (klb[]) a.clone();
    }
}
