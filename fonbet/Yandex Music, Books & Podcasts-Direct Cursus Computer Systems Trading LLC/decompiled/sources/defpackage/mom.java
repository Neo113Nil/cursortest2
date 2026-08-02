package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class mom {
    public static final /* synthetic */ mom[] a = {new mom("PRESELECT", 0), new mom("WAITING_FOR_TOKEN", 1), new mom("PAY", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    mom EF5;

    public static mom valueOf(String str) {
        return (mom) Enum.valueOf(mom.class, str);
    }

    public static mom[] values() {
        return (mom[]) a.clone();
    }
}
