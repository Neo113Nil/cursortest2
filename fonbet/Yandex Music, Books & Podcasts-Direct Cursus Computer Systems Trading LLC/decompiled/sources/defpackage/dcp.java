package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class dcp {
    public static final /* synthetic */ dcp[] a = {new dcp("BankAndPs", 0), new dcp("PsOnly", 1), new dcp("None", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    dcp EF5;

    public static dcp valueOf(String str) {
        return (dcp) Enum.valueOf(dcp.class, str);
    }

    public static dcp[] values() {
        return (dcp[]) a.clone();
    }
}
