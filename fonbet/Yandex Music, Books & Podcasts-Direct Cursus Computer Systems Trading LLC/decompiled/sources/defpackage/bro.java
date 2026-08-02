package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class bro {
    public static final /* synthetic */ bro[] a = {new bro("resolveOnSbpUrl", 0), new bro("resolveOnSuccess", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    bro EF5;

    public static bro valueOf(String str) {
        return (bro) Enum.valueOf(bro.class, str);
    }

    public static bro[] values() {
        return (bro[]) a.clone();
    }
}
